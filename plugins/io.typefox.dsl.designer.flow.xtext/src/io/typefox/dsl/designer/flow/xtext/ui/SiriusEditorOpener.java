/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package io.typefox.dsl.designer.flow.xtext.ui;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.sirius.business.api.query.DRepresentationElementQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class SiriusEditorOpener extends LanguageSpecificURIEditorOpener {

	@Override
	public IEditorPart open(final URI uri, final EReference crossReference, final int indexInList,
			final boolean select) {
		return selectAndReveal(uri, crossReference, indexInList, select);
	}

	protected IEditorPart selectAndReveal(URI uri, EReference crossReference, int indexInList, boolean select) {
		for (Session s : SessionManager.INSTANCE.getSessions()) {
			if (s.isOpen()) {
				EObject found = s.getTransactionalEditingDomain().getResourceSet().getEObject(uri, false);
				if (found != null) {
					Set<DRepresentationElement> elementsRepresentingTarget = Sets.newLinkedHashSet();
					for (Setting setting : s.getSemanticCrossReferencer().getInverseReferences(found)) {
						if (setting.getEObject() instanceof DRepresentationElement) {
							elementsRepresentingTarget.add((DRepresentationElement) setting.getEObject());
						}
					}

					IWorkbenchPage page = EclipseUIUtil.getActivePage();
					for (DRepresentationElement rep : elementsRepresentingTarget) {

						DRepresentation parentRepresentation = new DRepresentationElementQuery(
								(DRepresentationElement) rep).getParentRepresentation();
						List<DRepresentationElement> toReveal = Lists.newArrayList(rep);
						if (page != null && select) {
							IEditorPart activeEditor = page.getActiveEditor();

							if (activeEditor instanceof DialectEditor
									&& ((DialectEditor) activeEditor).getRepresentation() == parentRepresentation) {
								DialectUIManager.INSTANCE.selectAndReveal((DialectEditor) activeEditor, toReveal);
								return activeEditor;

							}
						}
					}
					/*
					 * the active editor could not reveal the element, let's check the other opened
					 * editors.
					 */

					for (IEditorReference eRef : page.getEditorReferences()) {
						IEditorPart editor = eRef.getEditor(true);
						if (editor instanceof DialectEditor) {
							for (DRepresentationElement rep : elementsRepresentingTarget) {

								DRepresentation parentRepresentation = new DRepresentationElementQuery(
										(DRepresentationElement) rep).getParentRepresentation();
								if (((DialectEditor) editor).getRepresentation() == parentRepresentation) {
									DialectUIManager.INSTANCE.selectAndReveal((DialectEditor) editor,
											Lists.newArrayList(rep));
									return editor;
								}
							}
						}
					}

					/*
					 * no opened editor could reveal the element, let's open the first one we find.
					 */
					for (DRepresentationElement rep : elementsRepresentingTarget) {

						DRepresentation parentRepresentation = new DRepresentationElementQuery(
								(DRepresentationElement) rep).getParentRepresentation();
						IEditorPart opened = DialectUIManager.INSTANCE.openEditor(s, parentRepresentation,
								new org.eclipse.core.runtime.NullProgressMonitor());
						if (opened instanceof DialectEditor) {
							DialectUIManager.INSTANCE.selectAndReveal((DialectEditor) opened, Lists.newArrayList(rep));
							return opened;
						}
					}

				}

			}
		}
		return null;

	}

	@Override
	protected String getEditorId() {
		return "fr.obeo.dsl.designer.sample.flow.presentation.FlowEditorID";
	}
}
