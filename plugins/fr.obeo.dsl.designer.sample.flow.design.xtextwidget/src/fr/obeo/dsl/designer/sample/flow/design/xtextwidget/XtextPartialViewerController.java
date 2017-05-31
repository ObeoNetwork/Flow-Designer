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

import java.util.Iterator;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFCustomWidgetController;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import com.google.common.collect.Iterators;

import fr.obeo.dsl.designer.sample.flow.DataSource;
import fr.obeo.dsl.designer.sample.flow.Named;
import fr.obeo.dsl.designer.sample.flow.Processor;
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
					StringBuffer imports = new StringBuffer();
					Iterator<Processor> it = Iterators.filter(((System) newValue).eAllContents(), Processor.class);
					while (it.hasNext()) {
						imports.append("processor(");
						appendName(imports, it.next());
						imports.append(")");
					}
					Iterator<DataSource> it2 = Iterators.filter(((System) newValue).eAllContents(), DataSource.class);
					while (it2.hasNext()) {
						imports.append("sensor(");
						appendName(imports, it2.next());
						imports.append(")");
					}
					if (((System) newValue).getName() != null) {
						imports.append("system(" + ((Named) newValue).getName() + ")\n");
					}
					Iterator<System> it3 = Iterators.filter(((System) newValue).eAllContents(), System.class);
					while (it3.hasNext()) {
						imports.append("system(");
						appendName(imports, it3.next());
						imports.append(")");
					}
					imports.append("\n # \n");
					String routingRules = ((System) newValue).getRoutingRules();
					if (routingRules == null) {
						routingRules = "";
					}
					access.updateModel(imports.toString(), routingRules, "");
				}

			}

			private void appendName(StringBuffer imports, Named named) {
				String elementName = named.getName();
				if (elementName != null) {
					elementName = elementName.replace(' ', '_');
					imports.append(elementName);
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
