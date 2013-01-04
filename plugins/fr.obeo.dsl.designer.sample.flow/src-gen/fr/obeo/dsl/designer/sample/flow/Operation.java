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
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.Operation#getOutput <em>Output</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.Operation#getVolume <em>Volume</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.Operation#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.Operation#getCalledBy <em>Called By</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
     * Returns the value of the '<em><b>Output</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Output</em>' reference.
     * @see #setOutput(ComputationResult)
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getOperation_Output()
     * @model required="true"
     * @generated
     */
	ComputationResult getOutput();

	/**
     * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.Operation#getOutput <em>Output</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output</em>' reference.
     * @see #getOutput()
     * @generated
     */
	void setOutput(ComputationResult value);

	/**
     * Returns the value of the '<em><b>Volume</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Volume</em>' attribute.
     * @see #setVolume(int)
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getOperation_Volume()
     * @model required="true"
     * @generated
     */
	int getVolume();

	/**
     * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.Operation#getVolume <em>Volume</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Volume</em>' attribute.
     * @see #getVolume()
     * @generated
     */
	void setVolume(int value);

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
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getOperation_Name()
     * @model required="true"
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.Operation#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>Called By</b></em>' reference list.
     * The list contents are of type {@link fr.obeo.dsl.designer.sample.flow.State}.
     * It is bidirectional and its opposite is '{@link fr.obeo.dsl.designer.sample.flow.State#getExecute <em>Execute</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Called By</em>' reference list.
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getOperation_CalledBy()
     * @see fr.obeo.dsl.designer.sample.flow.State#getExecute
     * @model opposite="execute"
     * @generated
     */
	EList<State> getCalledBy();

} // Operation
