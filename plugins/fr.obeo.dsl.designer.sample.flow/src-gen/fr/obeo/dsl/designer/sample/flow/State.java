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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.State#getCatches <em>Catches</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.State#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.State#getExecute <em>Execute</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.State#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
     * Returns the value of the '<em><b>Catches</b></em>' reference list.
     * The list contents are of type {@link fr.obeo.dsl.designer.sample.flow.Event}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Catches</em>' reference list.
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getState_Catches()
     * @model
     * @generated
     */
	EList<Event> getCatches();

	/**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getState_Name()
     * @model required="true"
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.State#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>Execute</b></em>' reference list.
     * The list contents are of type {@link fr.obeo.dsl.designer.sample.flow.Operation}.
     * It is bidirectional and its opposite is '{@link fr.obeo.dsl.designer.sample.flow.Operation#getCalledBy <em>Called By</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Execute</em>' reference list.
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getState_Execute()
     * @see fr.obeo.dsl.designer.sample.flow.Operation#getCalledBy
     * @model opposite="calledBy"
     * @generated
     */
	EList<Operation> getExecute();

    /**
     * Returns the value of the '<em><b>Next</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Next</em>' reference.
     * @see #setNext(State)
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getState_Next()
     * @model required="true"
     * @generated
     */
    State getNext();

    /**
     * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.State#getNext <em>Next</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' reference.
     * @see #getNext()
     * @generated
     */
    void setNext(State value);

} // State
