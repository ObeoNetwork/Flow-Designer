/**
 * Copyright  2010 Obeo. All Rights Reserved.
 *
 * This file is part of Obeo Designer.
 *
 * This software and the attached documentation are the exclusive ownership
 * of its authors and was conceded to the profit of Obeo SARL.
 * This software and the attached documentation are protected under the rights
 * of intellectual ownership, including the section "Titre II  Droits des auteurs (Articles L121-1, L123-12)"
 * By installing this software, you acknowledge being aware of this rights and
 * accept them, and as a consequence you must:
 * - be in possession of a valid license of use conceded by Obeo only.
 * - agree that you have read, understood, and will comply with the license terms and conditions.
 * - agree not to do anything that could conflict with intellectual ownership owned by Obeo or its beneficiaries
 * or the authors of this software
 *
 * Should you not agree with these terms, you must stop to use this software and give it back to its legitimate owner.
 *
 * Acceleo and Obeo are trademarks owned by Obeo.
 */
package fr.obeo.dsl.designer.sample.flow.simulation;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.ModelChangeTrigger;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;

import com.google.common.collect.Lists;

import fr.obeo.dsl.designer.sample.flow.FlowPackage;
import fr.obeo.dsl.designer.sample.flow.System;
import fr.obeo.dsl.designer.sample.flow.util.FlowmodelUpdates;

public class FlowSimulationTrigger implements ModelChangeTrigger {

	private Session session;

	public FlowSimulationTrigger(Session session) {
		this.session = session;
	}

	public static final NotificationFilter IS_FLOW_CHANGE = new NotificationFilter.Custom() {

		public boolean matches(Notification notification) {
			return (!notification.isTouch() && notification.getFeature() instanceof EStructuralFeature
					&& ((EStructuralFeature) notification.getFeature()).getEContainingClass()
							.getEPackage() == FlowPackage.eINSTANCE);
		}
	};

	public Option<Command> localChangesAboutToCommit(Collection<Notification> notifications) {
		final Collection<System> systems = Lists.newArrayList();
		for (Resource res : session.getTransactionalEditingDomain().getResourceSet().getResources()) {
			for (EObject root : res.getContents()) {
				if (root instanceof System) {
					systems.add((System) root);
				}
			}
		}
		if (systems.size() > 0) {
			Command result = new RecordingCommand(session.getTransactionalEditingDomain()) {

				@Override
				protected void doExecute() {
					for (System system : systems) {
						new FlowmodelUpdates().updateModelState(system);
					}

				}
			};
			return Options.newSome(result);
		}
		return Options.newNone();
	}

	@Override
	public int priority() {
		return 0;
	}

}
