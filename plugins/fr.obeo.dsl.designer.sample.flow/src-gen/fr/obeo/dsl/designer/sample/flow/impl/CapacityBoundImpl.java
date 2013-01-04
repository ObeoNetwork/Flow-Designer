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
package fr.obeo.dsl.designer.sample.flow.impl;

import fr.obeo.dsl.designer.sample.flow.CapacityBound;
import fr.obeo.dsl.designer.sample.flow.FlowPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capacity Bound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.CapacityBoundImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.CapacityBoundImpl#getLoad <em>Load</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapacityBoundImpl extends FlowElementImpl implements CapacityBound {
	/**
     * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCapacity()
     * @generated
     * @ordered
     */
	protected static final int CAPACITY_EDEFAULT = 10;

	/**
     * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCapacity()
     * @generated
     * @ordered
     */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
     * The default value of the '{@link #getLoad() <em>Load</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLoad()
     * @generated
     * @ordered
     */
	protected static final int LOAD_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getLoad() <em>Load</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLoad()
     * @generated
     * @ordered
     */
	protected int load = LOAD_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CapacityBoundImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return FlowPackage.Literals.CAPACITY_BOUND;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getCapacity() {
        return capacity;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCapacity(int newCapacity) {
        int oldCapacity = capacity;
        capacity = newCapacity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.CAPACITY_BOUND__CAPACITY, oldCapacity, capacity));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getLoad() {
        return load;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLoad(int newLoad) {
        int oldLoad = load;
        load = newLoad;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.CAPACITY_BOUND__LOAD, oldLoad, load));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FlowPackage.CAPACITY_BOUND__CAPACITY:
                return new Integer(getCapacity());
            case FlowPackage.CAPACITY_BOUND__LOAD:
                return new Integer(getLoad());
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case FlowPackage.CAPACITY_BOUND__CAPACITY:
                setCapacity(((Integer)newValue).intValue());
                return;
            case FlowPackage.CAPACITY_BOUND__LOAD:
                setLoad(((Integer)newValue).intValue());
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case FlowPackage.CAPACITY_BOUND__CAPACITY:
                setCapacity(CAPACITY_EDEFAULT);
                return;
            case FlowPackage.CAPACITY_BOUND__LOAD:
                setLoad(LOAD_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case FlowPackage.CAPACITY_BOUND__CAPACITY:
                return capacity != CAPACITY_EDEFAULT;
            case FlowPackage.CAPACITY_BOUND__LOAD:
                return load != LOAD_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (capacity: ");
        result.append(capacity);
        result.append(", load: ");
        result.append(load);
        result.append(')');
        return result.toString();
    }

} //CapacityBoundImpl
