/*
 * generated by Xtext 2.12.0
 */
package fr.obeo.dsl.designer.sample.flow.routerdsl.ui;

import com.google.inject.Injector;
import fr.obeo.dsl.designer.sample.flow.routerdsl.ui.internal.RouterdslActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RouterDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RouterdslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RouterdslActivator.getInstance().getInjector(RouterdslActivator.FR_OBEO_DSL_DESIGNER_SAMPLE_FLOW_ROUTERDSL_ROUTERDSL);
	}
	
}