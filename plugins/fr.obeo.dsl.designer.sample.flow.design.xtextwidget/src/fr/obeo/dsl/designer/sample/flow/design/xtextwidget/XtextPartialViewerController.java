/*******************************************************************************
 * Copyright (c) 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package fr.obeo.dsl.designer.sample.flow.design.xtextwidget;

import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFCustomWidgetController;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import fr.obeo.dsl.designer.sample.flow.System;

public class XtextPartialViewerController extends AbstractEEFCustomWidgetController {

	private Consumer<Object> newValueConsumer;
	private EmbeddedEditorModelAccess access;

	public XtextPartialViewerController(EEFCustomWidgetDescription description, IVariableManager variableManager,
			IInterpreter interpreter, EditingContextAdapter contextAdapter, EmbeddedEditorModelAccess access) {
		super(description, variableManager, interpreter, contextAdapter);
		this.access = access;
	}

	@Override
	protected EEFCustomWidgetDescription getDescription() {
		return this.description;
	}

	@Override
	public void refresh() {
		super.refresh();
		this.newEval().call("var:self", new Consumer<Object>() {

			@Override
			public void accept(Object newValue) {
				if (newValue instanceof System) {
					String routingRules = ((System) newValue).getRoutingRules();
					if (routingRules == null) {
						routingRules = "";
					}
					access.updateModel("# \n", routingRules, "");
				}

			}
		});
	}

	public IStatus updateValue(final String text) {
		return this.editingContextAdapter.performModelChange(() -> {
			Object self = this.variableManager.getVariables().get("self");
			if (self instanceof fr.obeo.dsl.designer.sample.flow.System) {
				((fr.obeo.dsl.designer.sample.flow.System) self).setRoutingRules(text);
			}
		});
	}
}
