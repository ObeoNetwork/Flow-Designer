package fr.obeo.dsl.designer.sample.flow.routerdsl.scoping

import com.google.common.base.Predicate
import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.ResourceSetReferencingResourceSet
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider
import org.eclipse.xtext.scoping.impl.SelectableBasedScope

class RouterGlobalScopeProvider extends DefaultGlobalScopeProvider {
	
	@Inject 
	Provider<ResourceSetBasedResourceDescriptions> resourceDescriptionsProvider 

	override getScope(Resource resource, EReference reference, Predicate<IEObjectDescription> filter) {
		val resourceSet = resource.resourceSet 
		if(resourceSet instanceof ResourceSetReferencingResourceSet) {
			val referenced = resourceSet.referencedResourceSets.head()
			if(referenced !== null) {
				val resourceDescriptions = resourceDescriptionsProvider.get()
				resourceDescriptions.setContext(referenced)
				return SelectableBasedScope.createScope(IScope.NULLSCOPE, resourceDescriptions, filter, reference.EReferenceType, false)				
			}
		}
		super.getScope(resource, reference, filter)
	}
}