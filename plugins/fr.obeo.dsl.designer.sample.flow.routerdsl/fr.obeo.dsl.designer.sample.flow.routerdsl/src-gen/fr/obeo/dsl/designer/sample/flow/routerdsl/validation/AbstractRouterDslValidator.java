/*
 * generated by Xtext 2.12.0
 */
package fr.obeo.dsl.designer.sample.flow.routerdsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractRouterDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage.eINSTANCE);
		return result;
	}
	
}
