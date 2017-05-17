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
 * A representation of the model object '<em><b>Fan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.Fan#getSpeed <em>Speed</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.Fan#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getFan()
 * @model
 * @generated
 */
public interface Fan extends FlowElement, Powered {

    /**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Speed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(int)
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getFan_Speed()
	 * @model default="1000" required="true"
	 * @generated
	 */
    int getSpeed();

    /**
	 * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.Fan#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
    void setSpeed(int value);

    /**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weight</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getFan_Weight()
	 * @model default="3" required="true"
	 * @generated
	 */
    int getWeight();

    /**
	 * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.Fan#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
    void setWeight(int value);
} // Fan
