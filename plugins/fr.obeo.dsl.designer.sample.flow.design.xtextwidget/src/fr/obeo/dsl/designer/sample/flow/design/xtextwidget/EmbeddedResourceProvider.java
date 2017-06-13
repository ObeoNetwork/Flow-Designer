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

import javax.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

public class EmbeddedResourceProvider implements IEditedResourceProvider {

	@Inject
	private FileExtensionProvider fileExtensionProvider;

	private ResourceSet siriusResourceSet;
	
	public ResourceSet getSiriusResourceSet() {
		return siriusResourceSet;
	}

	public void setSiriusResourceSet(ResourceSet resourceSet) {
		this.siriusResourceSet = resourceSet;
	}

	@Override
	public XtextResource createResource() {
		URI uri = URI.createURI("_synthetic." + fileExtensionProvider.getPrimaryFileExtension());
		XtextResource xtextVirtualResource = (XtextResource) siriusResourceSet.createResource(uri);
		siriusResourceSet.getResources().add(xtextVirtualResource);
		return xtextVirtualResource;
	}
}
