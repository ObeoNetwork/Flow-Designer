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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.DataFlow#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.DataFlow#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getDataFlow()
 * @model
 * @generated
 */
public interface DataFlow extends CapacityBound {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.designer.sample.flow.FlowTarget#getIncomingFlows <em>Incoming Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(FlowTarget)
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getDataFlow_Target()
	 * @see fr.obeo.dsl.designer.sample.flow.FlowTarget#getIncomingFlows
	 * @model opposite="incomingFlows" required="true"
	 * @generated
	 */
	FlowTarget getTarget();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.DataFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(FlowTarget value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.designer.sample.flow.FlowSource#getOutgoingFlows <em>Outgoing Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(FlowSource)
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getDataFlow_Source()
	 * @see fr.obeo.dsl.designer.sample.flow.FlowSource#getOutgoingFlows
	 * @model opposite="outgoingFlows" required="true" transient="false"
	 * @generated
	 */
	FlowSource getSource();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.DataFlow#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(FlowSource value);

} // DataFlow
