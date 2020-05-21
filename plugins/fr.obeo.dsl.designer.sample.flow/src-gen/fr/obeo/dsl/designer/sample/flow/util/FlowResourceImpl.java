/**
 */
package fr.obeo.dsl.designer.sample.flow.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.designer.sample.flow.util.FlowResourceFactoryImpl
 * @generated
 */
public class FlowResourceImpl extends XMIResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated NOT
	 */
	public FlowResourceImpl(URI uri) {
		super(uri);
		Map<Object, Object> xmiLoadOptions = this.getDefaultLoadOptions();
        xmiLoadOptions.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
        xmiLoadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        xmiLoadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
        xmiLoadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
        xmiLoadOptions.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap<>());
	}
	
	@Override
	protected boolean useUUIDs() {
		return true;
	}

} //FlowResourceImpl
