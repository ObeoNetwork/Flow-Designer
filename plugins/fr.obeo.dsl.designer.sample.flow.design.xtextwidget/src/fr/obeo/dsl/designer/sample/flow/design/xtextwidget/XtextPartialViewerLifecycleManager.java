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

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import com.google.inject.Injector;

import fr.obeo.dsl.designer.sample.flow.routerdsl.ui.internal.RouterdslActivator;

public class XtextPartialViewerLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	private EEFCustomWidgetDescription description;

	// private XtextPartialViewerWidget xtextPartialEditorWidget;

	private XtextPartialViewerController controller;

	private ModifyListener modifyListener;

	private EmbeddedEditorModelAccess access;

	private EmbeddedEditor editor;

	public XtextPartialViewerLifecycleManager(EEFCustomWidgetDescription controlDescription,
			IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.description = controlDescription;
	}

	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		Injector xtextInjector = RouterdslActivator.getInstance()
				.getInjector(RouterdslActivator.FR_OBEO_DSL_DESIGNER_SAMPLE_FLOW_ROUTERDSL_ROUTERDSL);

		xtextInjector.injectMembers(this);

		EmbeddedResourceProvider resProvider = xtextInjector.getInstance(EmbeddedResourceProvider.class);

		EmbeddedEditorFactory factory = xtextInjector.getInstance(EmbeddedEditorFactory.class);
		this.editor = factory.newEditor(resProvider).showErrorAndWarningAnnotations().withParent(parent);
		this.access = editor.createPartialEditor();

		Control control = editor.getViewer().getControl();
		GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		gridData.heightHint = 14 * 12;
		gridData.widthHint = 300;
		gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		control.setLayoutData(gridData);

		this.controller = new XtextPartialViewerController(description, variableManager, interpreter,
				editingContextAdapter, access);
	}

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
		this.modifyListener = new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent event) {
				controller.updateValue(access.getEditablePart());
			}
		};
		editor.getViewer().getTextWidget().addModifyListener(this.modifyListener);

	}

	@Override
	public void refresh() {
		super.refresh();
		this.controller.refresh();
	}

	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		if (this.modifyListener !=null && editor != null && editor.getViewer() != null && editor.getViewer().getTextWidget() != null) {
			editor.getViewer().getTextWidget().removeModifyListener(this.modifyListener);
		}
	}

	@Override
	protected IEEFWidgetController getController() {
		return this.controller;
	}

	@Override
	protected EEFWidgetDescription getWidgetDescription() {
		return this.description;
	}

	@Override
	protected Control getValidationControl() {
		return editor.getViewer().getControl();
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void setEnabled(boolean enabled) {
		this.editor.getViewer().setEditable(enabled);
	}

}
