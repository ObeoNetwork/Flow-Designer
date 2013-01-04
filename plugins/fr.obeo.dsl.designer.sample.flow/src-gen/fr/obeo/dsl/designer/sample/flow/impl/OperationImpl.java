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

import fr.obeo.dsl.designer.sample.flow.ComputationResult;
import fr.obeo.dsl.designer.sample.flow.FlowPackage;
import fr.obeo.dsl.designer.sample.flow.Operation;

import fr.obeo.dsl.designer.sample.flow.State;
import java.util.Collection;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.OperationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.OperationImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.OperationImpl#getCalledBy <em>Called By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends EObjectImpl implements Operation {
	/**
     * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOutput()
     * @generated
     * @ordered
     */
	protected ComputationResult output;

	/**
     * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVolume()
     * @generated
     * @ordered
     */
	protected static final int VOLUME_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVolume()
     * @generated
     * @ordered
     */
	protected int volume = VOLUME_EDEFAULT;

	/**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected static final String NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected String name = NAME_EDEFAULT;

	/**
     * The cached value of the '{@link #getCalledBy() <em>Called By</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCalledBy()
     * @generated
     * @ordered
     */
	protected EList<State> calledBy;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected OperationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return FlowPackage.Literals.OPERATION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComputationResult getOutput() {
        if (output != null && output.eIsProxy()) {
            InternalEObject oldOutput = (InternalEObject)output;
            output = (ComputationResult)eResolveProxy(oldOutput);
            if (output != oldOutput) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.OPERATION__OUTPUT, oldOutput, output));
            }
        }
        return output;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComputationResult basicGetOutput() {
        return output;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOutput(ComputationResult newOutput) {
        ComputationResult oldOutput = output;
        output = newOutput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.OPERATION__OUTPUT, oldOutput, output));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getVolume() {
        return volume;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVolume(int newVolume) {
        int oldVolume = volume;
        volume = newVolume;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.OPERATION__VOLUME, oldVolume, volume));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
        return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.OPERATION__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<State> getCalledBy() {
        if (calledBy == null) {
            calledBy = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, FlowPackage.OPERATION__CALLED_BY, FlowPackage.STATE__EXECUTE);
        }
        return calledBy;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FlowPackage.OPERATION__CALLED_BY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCalledBy()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FlowPackage.OPERATION__CALLED_BY:
                return ((InternalEList<?>)getCalledBy()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FlowPackage.OPERATION__OUTPUT:
                if (resolve) return getOutput();
                return basicGetOutput();
            case FlowPackage.OPERATION__VOLUME:
                return new Integer(getVolume());
            case FlowPackage.OPERATION__NAME:
                return getName();
            case FlowPackage.OPERATION__CALLED_BY:
                return getCalledBy();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case FlowPackage.OPERATION__OUTPUT:
                setOutput((ComputationResult)newValue);
                return;
            case FlowPackage.OPERATION__VOLUME:
                setVolume(((Integer)newValue).intValue());
                return;
            case FlowPackage.OPERATION__NAME:
                setName((String)newValue);
                return;
            case FlowPackage.OPERATION__CALLED_BY:
                getCalledBy().clear();
                getCalledBy().addAll((Collection<? extends State>)newValue);
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
            case FlowPackage.OPERATION__OUTPUT:
                setOutput((ComputationResult)null);
                return;
            case FlowPackage.OPERATION__VOLUME:
                setVolume(VOLUME_EDEFAULT);
                return;
            case FlowPackage.OPERATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case FlowPackage.OPERATION__CALLED_BY:
                getCalledBy().clear();
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
            case FlowPackage.OPERATION__OUTPUT:
                return output != null;
            case FlowPackage.OPERATION__VOLUME:
                return volume != VOLUME_EDEFAULT;
            case FlowPackage.OPERATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case FlowPackage.OPERATION__CALLED_BY:
                return calledBy != null && !calledBy.isEmpty();
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
        result.append(" (volume: ");
        result.append(volume);
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //OperationImpl
