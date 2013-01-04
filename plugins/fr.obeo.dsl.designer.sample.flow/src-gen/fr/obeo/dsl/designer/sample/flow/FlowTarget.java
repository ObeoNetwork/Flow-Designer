/**
 * Copyright  2010 Obeo. All Rights Reserved.
 *
 * This file is part of Obeo Designer.
 *
 * This software and the attached documentation are the exclusive ownership
 * of its authors and was conceded to the profit of Obeo SARL.
 * This software and the attached documentation are protected under the rights
 * of intellectual ownership, including the section "Titre II  Droits des auteurs (Articles L121-1, L123-12)"
 * By installing this software, you acknowledge being aware of this rights and
 * accept them, and as a consequence you must:
 * - be in possession of a valid license of use conceded by Obeo only.
 * - agree that you have read, understood, and will comply with the license terms and conditions.
 * - agree not to do anything that could conflict with intellectual ownership owned by Obeo or its beneficiaries
 * or the authors of this software
 *
 * Should you not agree with these terms, you must stop to use this software and give it back to its legitimate owner.
 *
 * Acceleo and Obeo are trademarks owned by Obeo.
 */
package fr.obeo.dsl.designer.sample.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.FlowTarget#getIncomingFlows <em>Incoming Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getFlowTarget()
 * @model abstract="true"
 * @generated
 */
public interface FlowTarget extends FlowElement {
	/**
     * Returns the value of the '<em><b>Incoming Flows</b></em>' reference list.
     * The list contents are of type {@link fr.obeo.dsl.designer.sample.flow.DataFlow}.
     * It is bidirectional and its opposite is '{@link fr.obeo.dsl.designer.sample.flow.DataFlow#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Incoming Flows</em>' reference list.
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getFlowTarget_IncomingFlows()
     * @see fr.obeo.dsl.designer.sample.flow.DataFlow#getTarget
     * @model opposite="target"
     * @generated
     */
	EList<DataFlow> getIncomingFlows();

} // FlowTarget
