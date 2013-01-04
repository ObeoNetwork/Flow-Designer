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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.PowerSource#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getPowerSource()
 * @model
 * @generated
 */
public interface PowerSource extends EObject {
    /**
     * Returns the value of the '<em><b>Power</b></em>' attribute.
     * The default value is <code>"1000"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power</em>' attribute.
     * @see #setPower(int)
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getPowerSource_Power()
     * @model default="1000" required="true"
     * @generated
     */
    int getPower();

    /**
     * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.PowerSource#getPower <em>Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power</em>' attribute.
     * @see #getPower()
     * @generated
     */
    void setPower(int value);

} // PowerSource
