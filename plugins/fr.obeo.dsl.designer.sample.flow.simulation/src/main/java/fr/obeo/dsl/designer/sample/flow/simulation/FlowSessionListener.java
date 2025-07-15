/*******************************************************************************
 * Copyright (c) 2014, 2025 Obeo
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package fr.obeo.dsl.designer.sample.flow.simulation;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener;

public class FlowSessionListener extends SessionManagerListener.Stub {
	
	Map<Session, FlowSimulationTrigger> addedTriggers = new HashMap<Session, FlowSimulationTrigger>();

	@Override
	public void notifyAddSession(Session newSession) {
		FlowSimulationTrigger trigger = new FlowSimulationTrigger(newSession);
		addedTriggers.put(newSession, trigger);
		newSession.getEventBroker().addLocalTrigger(FlowSimulationTrigger.IS_FLOW_CHANGE, trigger);
	}

	@Override
	public void notifyRemoveSession(Session removedSession) {
		FlowSimulationTrigger triggerToRemove = addedTriggers.remove(removedSession);
		removedSession.getEventBroker().removeLocalTrigger(triggerToRemove);
	}
}
