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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.obeo.dsl.designer.sample.flow.CapacityBound;
import fr.obeo.dsl.designer.sample.flow.CompositeProcessor;
import fr.obeo.dsl.designer.sample.flow.DataFlow;
import fr.obeo.dsl.designer.sample.flow.FlowPackage;
import fr.obeo.dsl.designer.sample.flow.FlowTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.CompositeProcessorImpl#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.CompositeProcessorImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.CompositeProcessorImpl#getLoad <em>Load</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeProcessorImpl extends SystemImpl implements CompositeProcessor {
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
    @Override
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
    @Override
				public int getCapacity() {
		return capacity;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
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
    @Override
				public int getLoad() {
		return load;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
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
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.COMPOSITE_PROCESSOR__INCOMING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingFlows()).basicAdd(otherEnd, msgs);
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
			case FlowPackage.COMPOSITE_PROCESSOR__INCOMING_FLOWS:
				return getIncomingFlows();
			case FlowPackage.COMPOSITE_PROCESSOR__CAPACITY:
				return getCapacity();
			case FlowPackage.COMPOSITE_PROCESSOR__LOAD:
				return getLoad();
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
			case FlowPackage.COMPOSITE_PROCESSOR__INCOMING_FLOWS:
				getIncomingFlows().clear();
				getIncomingFlows().addAll((Collection<? extends DataFlow>)newValue);
				return;
			case FlowPackage.COMPOSITE_PROCESSOR__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case FlowPackage.COMPOSITE_PROCESSOR__LOAD:
				setLoad((Integer)newValue);
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
			case FlowPackage.COMPOSITE_PROCESSOR__INCOMING_FLOWS:
				getIncomingFlows().clear();
				return;
			case FlowPackage.COMPOSITE_PROCESSOR__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case FlowPackage.COMPOSITE_PROCESSOR__LOAD:
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
			case FlowPackage.COMPOSITE_PROCESSOR__INCOMING_FLOWS:
				return incomingFlows != null && !incomingFlows.isEmpty();
			case FlowPackage.COMPOSITE_PROCESSOR__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case FlowPackage.COMPOSITE_PROCESSOR__LOAD:
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
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
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
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (capacity: ");
		result.append(capacity);
		result.append(", load: ");
		result.append(load);
		result.append(')');
		return result.toString();
	}

} //CompositeProcessorImpl
