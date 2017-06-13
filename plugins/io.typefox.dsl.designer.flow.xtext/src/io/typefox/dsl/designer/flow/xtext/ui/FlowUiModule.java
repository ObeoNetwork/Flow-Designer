package io.typefox.dsl.designer.flow.xtext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.LanguageSpecific;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.resource.generic.EmfUiModule;

/**
 * The DI module to configure the Xtext UI language services for the flow model.
 *  
 * @author koehnlein
 */
public class FlowUiModule extends EmfUiModule {

	public FlowUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public void configureLanguageSpecificURIEditorOpener(com.google.inject.Binder binder) {
		binder.bind(IURIEditorOpener.class).annotatedWith(LanguageSpecific.class).to(EcoreEditorOpener.class);
	}
}
