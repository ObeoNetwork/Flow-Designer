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
import fr.obeo.dsl.designer.sample.flow.CompositeProcessor;
import fr.obeo.dsl.designer.sample.flow.DataFlow;
import fr.obeo.dsl.designer.sample.flow.FlowElement;
import fr.obeo.dsl.designer.sample.flow.FlowElementStatus;
import fr.obeo.dsl.designer.sample.flow.FlowElementUsage;
import fr.obeo.dsl.designer.sample.flow.FlowPackage;
import fr.obeo.dsl.designer.sample.flow.FlowSource;
import fr.obeo.dsl.designer.sample.flow.FlowTarget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.CompositeProcessorImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.CompositeProcessorImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.CompositeProcessorImpl#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.CompositeProcessorImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.CompositeProcessorImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.CompositeProcessorImpl#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeProcessorImpl extends SystemImpl implements CompositeProcessor {
    /**
     * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected static final FlowElementStatus STATUS_EDEFAULT = FlowElementStatus.ACTIVE;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected FlowElementStatus status = STATUS_EDEFAULT;

    /**
     * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsage()
     * @generated
     * @ordered
     */
    protected static final FlowElementUsage USAGE_EDEFAULT = FlowElementUsage.UNUSED;

    /**
     * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsage()
     * @generated
     * @ordered
     */
    protected FlowElementUsage usage = USAGE_EDEFAULT;

    /**
     * The cached value of the '{@link #getIncomingFlows() <em>Incoming Flows</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncomingFlows()
     * @generated
     * @ordered
     */
    protected EList<DataFlow> incomingFlows;

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
     * The cached value of the '{@link #getOutgoingFlows() <em>Outgoing Flows</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutgoingFlows()
     * @generated
     * @ordered
     */
    protected EList<DataFlow> outgoingFlows;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CompositeProcessorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FlowPackage.Literals.COMPOSITE_PROCESSOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowElementStatus getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatus(FlowElementStatus newStatus) {
        FlowElementStatus oldStatus = status;
        status = newStatus == null ? STATUS_EDEFAULT : newStatus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.COMPOSITE_PROCESSOR__STATUS, oldStatus, status));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowElementUsage getUsage() {
        return usage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUsage(FlowElementUsage newUsage) {
        FlowElementUsage oldUsage = usage;
        usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.COMPOSITE_PROCESSOR__USAGE, oldUsage, usage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataFlow> getIncomingFlows() {
        if (incomingFlows == null) {
            incomingFlows = new EObjectWithInverseResolvingEList<DataFlow>(DataFlow.class, this, FlowPackage.COMPOSITE_PROCESSOR__INCOMING_FLOWS, FlowPackage.DATA_FLOW__TARGET);
        }
        return incomingFlows;
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
            eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.COMPOSITE_PROCESSOR__CAPACITY, oldCapacity, capacity));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.COMPOSITE_PROCESSOR__LOAD, oldLoad, load));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataFlow> getOutgoingFlows() {
        if (outgoingFlows == null) {
            outgoingFlows = new EObjectContainmentWithInverseEList<DataFlow>(DataFlow.class, this, FlowPackage.COMPOSITE_PROCESSOR__OUTGOING_FLOWS, FlowPackage.DATA_FLOW__SOURCE);
        }
        return outgoingFlows;
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
            case FlowPackage.COMPOSITE_PROCESSOR__INCOMING_FLOWS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingFlows()).basicAdd(otherEnd, msgs);
            case FlowPackage.COMPOSITE_PROCESSOR__OUTGOING_FLOWS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingFlows()).basicAdd(otherEnd, msgs);
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
            case FlowPackage.COMPOSITE_PROCESSOR__INCOMING_FLOWS:
                return ((InternalEList<?>)getIncomingFlows()).basicRemove(otherEnd, msgs);
            case FlowPackage.COMPOSITE_PROCESSOR__OUTGOING_FLOWS:
                return ((InternalEList<?>)getOutgoingFlows()).basicRemove(otherEnd, msgs);
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
            case FlowPackage.COMPOSITE_PROCESSOR__STATUS:
                return getStatus();
            case FlowPackage.COMPOSITE_PROCESSOR__USAGE:
                return getUsage();
            case FlowPackage.COMPOSITE_PROCESSOR__INCOMING_FLOWS:
                return getIncomingFlows();
            case FlowPackage.COMPOSITE_PROCESSOR__CAPACITY:
                return new Integer(getCapacity());
            case FlowPackage.COMPOSITE_PROCESSOR__LOAD:
                return new Integer(getLoad());
            case FlowPackage.COMPOSITE_PROCESSOR__OUTGOING_FLOWS:
                return getOutgoingFlows();
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
            case FlowPackage.COMPOSITE_PROCESSOR__STATUS:
                setStatus((FlowElementStatus)newValue);
                return;
            case FlowPackage.COMPOSITE_PROCESSOR__USAGE:
                setUsage((FlowElementUsage)newValue);
                return;
            case FlowPackage.COMPOSITE_PROCESSOR__INCOMING_FLOWS:
                getIncomingFlows().clear();
                getIncomingFlows().addAll((Collection<? extends DataFlow>)newValue);
                return;
            case FlowPackage.COMPOSITE_PROCESSOR__CAPACITY:
                setCapacity(((Integer)newValue).intValue());
                return;
            case FlowPackage.COMPOSITE_PROCESSOR__LOAD:
                setLoad(((Integer)newValue).intValue());
                return;
            case FlowPackage.COMPOSITE_PROCESSOR__OUTGOING_FLOWS:
                getOutgoingFlows().clear();
                getOutgoingFlows().addAll((Collection<? extends DataFlow>)newValue);
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
            case FlowPackage.COMPOSITE_PROCESSOR__STATUS:
                setStatus(STATUS_EDEFAULT);
                return;
            case FlowPackage.COMPOSITE_PROCESSOR__USAGE:
                setUsage(USAGE_EDEFAULT);
                return;
            case FlowPackage.COMPOSITE_PROCESSOR__INCOMING_FLOWS:
                getIncomingFlows().clear();
                return;
            case FlowPackage.COMPOSITE_PROCESSOR__CAPACITY:
                setCapacity(CAPACITY_EDEFAULT);
                return;
            case FlowPackage.COMPOSITE_PROCESSOR__LOAD:
                setLoad(LOAD_EDEFAULT);
                return;
            case FlowPackage.COMPOSITE_PROCESSOR__OUTGOING_FLOWS:
                getOutgoingFlows().clear();
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
            case FlowPackage.COMPOSITE_PROCESSOR__STATUS:
                return status != STATUS_EDEFAULT;
            case FlowPackage.COMPOSITE_PROCESSOR__USAGE:
                return usage != USAGE_EDEFAULT;
            case FlowPackage.COMPOSITE_PROCESSOR__INCOMING_FLOWS:
                return incomingFlows != null && !incomingFlows.isEmpty();
            case FlowPackage.COMPOSITE_PROCESSOR__CAPACITY:
                return capacity != CAPACITY_EDEFAULT;
            case FlowPackage.COMPOSITE_PROCESSOR__LOAD:
                return load != LOAD_EDEFAULT;
            case FlowPackage.COMPOSITE_PROCESSOR__OUTGOING_FLOWS:
                return outgoingFlows != null && !outgoingFlows.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == FlowElement.class) {
            switch (derivedFeatureID) {
                case FlowPackage.COMPOSITE_PROCESSOR__STATUS: return FlowPackage.FLOW_ELEMENT__STATUS;
                case FlowPackage.COMPOSITE_PROCESSOR__USAGE: return FlowPackage.FLOW_ELEMENT__USAGE;
                default: return -1;
            }
        }
        if (baseClass == FlowTarget.class) {
            switch (derivedFeatureID) {
                case FlowPackage.COMPOSITE_PROCESSOR__INCOMING_FLOWS: return FlowPackage.FLOW_TARGET__INCOMING_FLOWS;
                default: return -1;
            }
        }
        if (baseClass == CapacityBound.class) {
            switch (derivedFeatureID) {
                case FlowPackage.COMPOSITE_PROCESSOR__CAPACITY: return FlowPackage.CAPACITY_BOUND__CAPACITY;
                case FlowPackage.COMPOSITE_PROCESSOR__LOAD: return FlowPackage.CAPACITY_BOUND__LOAD;
                default: return -1;
            }
        }
        if (baseClass == FlowSource.class) {
            switch (derivedFeatureID) {
                case FlowPackage.COMPOSITE_PROCESSOR__OUTGOING_FLOWS: return FlowPackage.FLOW_SOURCE__OUTGOING_FLOWS;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == FlowElement.class) {
            switch (baseFeatureID) {
                case FlowPackage.FLOW_ELEMENT__STATUS: return FlowPackage.COMPOSITE_PROCESSOR__STATUS;
                case FlowPackage.FLOW_ELEMENT__USAGE: return FlowPackage.COMPOSITE_PROCESSOR__USAGE;
                default: return -1;
            }
        }
        if (baseClass == FlowTarget.class) {
            switch (baseFeatureID) {
                case FlowPackage.FLOW_TARGET__INCOMING_FLOWS: return FlowPackage.COMPOSITE_PROCESSOR__INCOMING_FLOWS;
                default: return -1;
            }
        }
        if (baseClass == CapacityBound.class) {
            switch (baseFeatureID) {
                case FlowPackage.CAPACITY_BOUND__CAPACITY: return FlowPackage.COMPOSITE_PROCESSOR__CAPACITY;
                case FlowPackage.CAPACITY_BOUND__LOAD: return FlowPackage.COMPOSITE_PROCESSOR__LOAD;
                default: return -1;
            }
        }
        if (baseClass == FlowSource.class) {
            switch (baseFeatureID) {
                case FlowPackage.FLOW_SOURCE__OUTGOING_FLOWS: return FlowPackage.COMPOSITE_PROCESSOR__OUTGOING_FLOWS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (status: ");
        result.append(status);
        result.append(", usage: ");
        result.append(usage);
        result.append(", capacity: ");
        result.append(capacity);
        result.append(", load: ");
        result.append(load);
        result.append(')');
        return result.toString();
    }

} //CompositeProcessorImpl
