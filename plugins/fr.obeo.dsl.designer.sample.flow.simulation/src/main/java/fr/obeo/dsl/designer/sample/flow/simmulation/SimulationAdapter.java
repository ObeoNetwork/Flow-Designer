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
package fr.obeo.dsl.designer.sample.flow.simmulation;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.Iterator;

import org.drools.FactHandle;
import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.StatefulSession;
import org.drools.compiler.PackageBuilder;
import org.drools.rule.Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

public class SimulationAdapter extends EContentAdapter {

	private boolean activated;
	private StatefulSession workingMemory;

	public SimulationAdapter() {
		RuleBase ruleBase;
		try {
			ruleBase = readRule();
			this.workingMemory = ruleBase.newStatefulSession();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void start() throws Exception {
		this.activated = true;
	}

	public void stop() {
		this.activated = false;
	}

	/**
	 * Please note that this is the "low level" rule assembly API.
	 */
	private static RuleBase readRule() throws Exception {

		// read in the source
		Reader source = new InputStreamReader(SimulationAdapter.class
				.getResourceAsStream("simulation.drl"));

		// optionally read in the DSL (if you are using it).
		// Reader dsl = new InputStreamReader(
		// DroolsTest.class.getResourceAsStream( "/mylang.dsl" ) );

		// Use package builder to build up a rule package.
		// An alternative lower level class called "DrlParser" can also be
		// used...

		PackageBuilder builder = new PackageBuilder();

		// this wil parse and compile in one step
		// NOTE: There are 2 methods here, the one argument one is for normal
		// DRL.
		builder.addPackageFromDrl(source);

		// Use the following instead of above if you are using a DSL:
		// builder.addPackageFromDrl( source, dsl );

		// get the compiled package (which is serializable)
		Package pkg = builder.getPackage();

		// add the package to a rulebase (deploy the rule package).
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(pkg);
		return ruleBase;
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if (activated) {
			if (notification.getEventType() == Notification.ADD) {
				Object added = notification.getNewValue();
				if (added instanceof EObject) {
					newOrChangedEObject((EObject) added);
				} else if (added instanceof Collection) {
					for (Object value : (Collection) added) {
						if (value instanceof EObject) {
							newOrChangedEObject((EObject) value);
						}

					}
				}
			} else if (notification.getEventType() == Notification.REMOVE && notification.getOldValue() instanceof EObject) {
				deletedEObject((EObject)notification.getOldValue());
			}

			if (notification.getNotifier() instanceof EObject) {
				if (!notification.isTouch()) {
					newOrChangedEObject((EObject) notification.getNotifier());
				}
			}
		}
	}

	private void deletedEObject(EObject oldValue) {
		if (isActive()) {
			FactHandle handle = workingMemory.getFactHandle(oldValue);
			if (handle !=null)
				workingMemory.retract(handle);
		}
	}

	private void newOrChangedEObject(EObject added) {
		if (isActive()) {
			FactHandle handle = workingMemory.getFactHandle(added);
			if (handle == null) {
				workingMemory.insert(added);
			} else {
				workingMemory.update(handle, added);
			}
			workingMemory.fireAllRules();
		}
	}

	public void update() {
	}

	private boolean isActive() {
		return activated;
	}

	public void init(EList<EObject> contents) {
		for (EObject object : contents) {
			assertFacts(object);
		}

	}

	private void assertFacts(EObject object) {
		Iterator<EObject> it = object.eAllContents();
		while (it.hasNext()) {
			workingMemory.insert(it.next());
		}

	}
}
