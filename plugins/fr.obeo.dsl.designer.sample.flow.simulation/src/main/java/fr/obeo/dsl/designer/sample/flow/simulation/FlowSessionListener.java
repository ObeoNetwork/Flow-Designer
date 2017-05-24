/*******************************************************************************
 * Copyright (c) 2014 Obeo
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package fr.obeo.dsl.designer.sample.flow.simulation;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener;

public class FlowSessionListener extends SessionManagerListener.Stub {

	@SuppressWarnings("unchecked")
	@Override
	public void notifyAddSession(Session newSession) {
		final ResourceSet set = newSession.getTransactionalEditingDomain().getResourceSet();
		newSession.getEventBroker().addLocalTrigger(FlowSimulationTrigger.IS_FLOW_CHANGE,
				new FlowSimulationTrigger(newSession));
	}

}
