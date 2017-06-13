package fr.obeo.dsl.designer.sample.flow.routerdsl.scoping;

import com.google.common.base.Predicate;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ResourceSetReferencingResourceSet;
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class RouterGlobalScopeProvider extends DefaultGlobalScopeProvider {
  @Inject
  private Provider<ResourceSetBasedResourceDescriptions> resourceDescriptionsProvider;
  
  @Override
  public IScope getScope(final Resource resource, final EReference reference, final Predicate<IEObjectDescription> filter) {
    IScope _xblockexpression = null;
    {
      final ResourceSet resourceSet = resource.getResourceSet();
      if ((resourceSet instanceof ResourceSetReferencingResourceSet)) {
        final ResourceSet referenced = IterableExtensions.<ResourceSet>head(((ResourceSetReferencingResourceSet)resourceSet).getReferencedResourceSets());
        if ((referenced != null)) {
          final ResourceSetBasedResourceDescriptions resourceDescriptions = this.resourceDescriptionsProvider.get();
          resourceDescriptions.setContext(referenced);
          return SelectableBasedScope.createScope(IScope.NULLSCOPE, resourceDescriptions, filter, reference.getEReferenceType(), false);
        }
      }
      _xblockexpression = super.getScope(resource, reference, filter);
    }
    return _xblockexpression;
  }
}
