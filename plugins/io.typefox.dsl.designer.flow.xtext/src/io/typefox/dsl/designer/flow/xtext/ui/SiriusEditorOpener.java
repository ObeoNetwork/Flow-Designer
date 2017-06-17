/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package io.typefox.dsl.designer.flow.xtext.ui;

import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.sirius.business.api.query.DRepresentationElementQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;

public class SiriusEditorOpener extends LanguageSpecificURIEditorOpener {
	
	@Override
	protected void selectAndReveal(IEditorPart openEditor, URI uri,
			EReference crossReference, int indexInList, boolean select) {
       for (Session s : SessionManager.INSTANCE.getSessions()) {
            if (s.isOpen()) {
                EObject found = s.getTransactionalEditingDomain().getResourceSet().getEObject(uri, false);
                if (found!=null) {
                    Set<DRepresentation> representationToOpen = new LinkedHashSet<>(); 
                    for (Setting setting : s.getSemanticCrossReferencer().getInverseReferences(found)) {
                        if (setting.getEObject() instanceof DRepresentationElement) {
                                representationToOpen.add(new DRepresentationElementQuery((DRepresentationElement) setting.getEObject()).getParentRepresentation());
                        }
                    }
                    for (DRepresentation dRepresentation : representationToOpen) {
                        DialectUIManager.INSTANCE.openEditor(s, dRepresentation, new NullProgressMonitor());
                    }
                }
            }
        }
	}
	
	@Override
	protected String getEditorId() {
		return "fr.obeo.dsl.designer.sample.flow.presentation.FlowEditorID";
	}
}
