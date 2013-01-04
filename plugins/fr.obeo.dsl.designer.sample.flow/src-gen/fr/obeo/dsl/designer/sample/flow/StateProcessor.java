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
 * A representation of the model object '<em><b>State Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.StateProcessor#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.StateProcessor#getStates <em>States</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.StateProcessor#getCurrent <em>Current</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.StateProcessor#getFirst <em>First</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.StateProcessor#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.StateProcessor#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getStateProcessor()
 * @model
 * @generated
 */
public interface StateProcessor extends Processor {
	/**
     * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
     * The list contents are of type {@link fr.obeo.dsl.designer.sample.flow.ComputationResult}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Outputs</em>' containment reference list.
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getStateProcessor_Outputs()
     * @model containment="true"
     * @generated
     */
	EList<ComputationResult> getOutputs();

	/**
     * Returns the value of the '<em><b>States</b></em>' containment reference list.
     * The list contents are of type {@link fr.obeo.dsl.designer.sample.flow.State}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>States</em>' containment reference list.
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getStateProcessor_States()
     * @model containment="true"
     * @generated
     */
	EList<State> getStates();

	/**
     * Returns the value of the '<em><b>Current</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Current</em>' reference.
     * @see #setCurrent(State)
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getStateProcessor_Current()
     * @model
     * @generated
     */
	State getCurrent();

	/**
     * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.StateProcessor#getCurrent <em>Current</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current</em>' reference.
     * @see #getCurrent()
     * @generated
     */
	void setCurrent(State value);

	/**
     * Returns the value of the '<em><b>First</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>First</em>' reference.
     * @see #setFirst(State)
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getStateProcessor_First()
     * @model
     * @generated
     */
	State getFirst();

	/**
     * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.StateProcessor#getFirst <em>First</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>First</em>' reference.
     * @see #getFirst()
     * @generated
     */
	void setFirst(State value);

	/**
     * Returns the value of the '<em><b>Events</b></em>' containment reference list.
     * The list contents are of type {@link fr.obeo.dsl.designer.sample.flow.Event}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Events</em>' containment reference list.
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getStateProcessor_Events()
     * @model containment="true"
     * @generated
     */
	EList<Event> getEvents();

	/**
     * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
     * The list contents are of type {@link fr.obeo.dsl.designer.sample.flow.Operation}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Operations</em>' containment reference list.
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getStateProcessor_Operations()
     * @model containment="true"
     * @generated
     */
	EList<Operation> getOperations();

} // StateProcessor
