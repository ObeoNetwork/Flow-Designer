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
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.System#getElements <em>Elements</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.System#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.System#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.System#getWeight <em>Weight</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.System#getPowerOutputs <em>Power Outputs</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.System#getPowerInputs <em>Power Inputs</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Powered, FlowSource {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.designer.sample.flow.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getSystem_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowElement> getElements();

    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getSystem_Name()
	 * @model default="" required="true"
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

    /**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(int)
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getSystem_Temperature()
	 * @model default="0"
	 * @generated
	 */
    int getTemperature();

    /**
	 * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.System#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
    void setTemperature(int value);

    /**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weight</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getSystem_Weight()
	 * @model default="0"
	 * @generated
	 */
    int getWeight();

    /**
	 * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.System#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
    void setWeight(int value);

    /**
	 * Returns the value of the '<em><b>Power Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.designer.sample.flow.PowerOutput}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Outputs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Outputs</em>' containment reference list.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getSystem_PowerOutputs()
	 * @model containment="true"
	 * @generated
	 */
    EList<PowerOutput> getPowerOutputs();

    /**
	 * Returns the value of the '<em><b>Power Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.designer.sample.flow.PowerInput}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Inputs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Inputs</em>' containment reference list.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getSystem_PowerInputs()
	 * @model containment="true"
	 * @generated
	 */
    EList<PowerInput> getPowerInputs();

} // System
