package io.typefox.dsl.designer.flow.xtext;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

/**
 * The DI module to configure the Xtext language services for the flow model.
 *  
 * @author koehnlein
 */
public class FlowRuntimeModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "io.typefox.dsl.designer.flow.xtext";
	}

	@Override
	protected String getFileExtensions() {
		return "flow";
	}
	
	// bind additional services here
}