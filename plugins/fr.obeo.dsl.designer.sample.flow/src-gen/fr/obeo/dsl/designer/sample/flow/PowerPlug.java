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
 * A representation of the model object '<em><b>Power Plug</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.PowerPlug#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getPowerPlug()
 * @model
 * @generated
 */
public interface PowerPlug extends EObject {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.obeo.dsl.designer.sample.flow.PowerPlugKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see fr.obeo.dsl.designer.sample.flow.PowerPlugKind
     * @see #setKind(PowerPlugKind)
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getPowerPlug_Kind()
     * @model required="true"
     * @generated
     */
    PowerPlugKind getKind();

    /**
     * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.PowerPlug#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see fr.obeo.dsl.designer.sample.flow.PowerPlugKind
     * @see #getKind()
     * @generated
     */
    void setKind(PowerPlugKind value);

} // PowerPlug
