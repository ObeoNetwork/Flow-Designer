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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.obeo.dsl.designer.sample.flow.CapacityBound;
import fr.obeo.dsl.designer.sample.flow.DataFlow;
import fr.obeo.dsl.designer.sample.flow.FlowPackage;
import fr.obeo.dsl.designer.sample.flow.FlowSource;
import fr.obeo.dsl.designer.sample.flow.Named;
import fr.obeo.dsl.designer.sample.flow.Powered;
import fr.obeo.dsl.designer.sample.flow.PoweredStatus;
import fr.obeo.dsl.designer.sample.flow.Processor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.ProcessorImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.ProcessorImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.ProcessorImpl#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.ProcessorImpl#getConsumption <em>Consumption</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.ProcessorImpl#getPowerStatus <em>Power Status</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.ProcessorImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.ProcessorImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.ProcessorImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessorImpl extends FlowTargetImpl implements Processor {
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
	 * The default value of the '{@link #getConsumption() <em>Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConsumption()
	 * @generated
	 * @ordered
	 */
    protected static final int CONSUMPTION_EDEFAULT = 0;

    /**
	 * The cached value of the '{@link #getConsumption() <em>Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConsumption()
	 * @generated
	 * @ordered
	 */
    protected int consumption = CONSUMPTION_EDEFAULT;

    /**
	 * The default value of the '{@link #getPowerStatus() <em>Power Status</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPowerStatus()
	 * @generated
	 * @ordered
	 */
    protected static final PoweredStatus POWER_STATUS_EDEFAULT = PoweredStatus.NONE;

    /**
	 * The cached value of the '{@link #getPowerStatus() <em>Power Status</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPowerStatus()
	 * @generated
	 * @ordered
	 */
    protected PoweredStatus powerStatus = POWER_STATUS_EDEFAULT;

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
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final int VOLUME_EDEFAULT = 2;

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
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
    protected static final int WEIGHT_EDEFAULT = 10;

    /**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
    protected int weight = WEIGHT_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.PROCESSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.PROCESSOR__CAPACITY, oldCapacity, capacity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.PROCESSOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.PROCESSOR__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getWeight() {
		return weight;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.PROCESSOR__WEIGHT, oldWeight, weight));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getConsumption() {
		return consumption;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConsumption(int newConsumption) {
		int oldConsumption = consumption;
		consumption = newConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.PROCESSOR__CONSUMPTION, oldConsumption, consumption));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PoweredStatus getPowerStatus() {
		return powerStatus;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPowerStatus(PoweredStatus newPowerStatus) {
		PoweredStatus oldPowerStatus = powerStatus;
		powerStatus = newPowerStatus == null ? POWER_STATUS_EDEFAULT : newPowerStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.PROCESSOR__POWER_STATUS, oldPowerStatus, powerStatus));
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
			case FlowPackage.PROCESSOR__OUTGOING_FLOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingFlows()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.PROCESSOR__LOAD, oldLoad, load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getOutgoingFlows() {
		if (outgoingFlows == null) {
			outgoingFlows = new EObjectContainmentWithInverseEList<DataFlow>(DataFlow.class, this, FlowPackage.PROCESSOR__OUTGOING_FLOWS, FlowPackage.DATA_FLOW__SOURCE);
		}
		return outgoingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.PROCESSOR__OUTGOING_FLOWS:
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
			case FlowPackage.PROCESSOR__CAPACITY:
				return getCapacity();
			case FlowPackage.PROCESSOR__LOAD:
				return getLoad();
			case FlowPackage.PROCESSOR__OUTGOING_FLOWS:
				return getOutgoingFlows();
			case FlowPackage.PROCESSOR__CONSUMPTION:
				return getConsumption();
			case FlowPackage.PROCESSOR__POWER_STATUS:
				return getPowerStatus();
			case FlowPackage.PROCESSOR__NAME:
				return getName();
			case FlowPackage.PROCESSOR__VOLUME:
				return getVolume();
			case FlowPackage.PROCESSOR__WEIGHT:
				return getWeight();
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
			case FlowPackage.PROCESSOR__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case FlowPackage.PROCESSOR__LOAD:
				setLoad((Integer)newValue);
				return;
			case FlowPackage.PROCESSOR__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				getOutgoingFlows().addAll((Collection<? extends DataFlow>)newValue);
				return;
			case FlowPackage.PROCESSOR__CONSUMPTION:
				setConsumption((Integer)newValue);
				return;
			case FlowPackage.PROCESSOR__POWER_STATUS:
				setPowerStatus((PoweredStatus)newValue);
				return;
			case FlowPackage.PROCESSOR__NAME:
				setName((String)newValue);
				return;
			case FlowPackage.PROCESSOR__VOLUME:
				setVolume((Integer)newValue);
				return;
			case FlowPackage.PROCESSOR__WEIGHT:
				setWeight((Integer)newValue);
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
			case FlowPackage.PROCESSOR__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case FlowPackage.PROCESSOR__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case FlowPackage.PROCESSOR__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				return;
			case FlowPackage.PROCESSOR__CONSUMPTION:
				setConsumption(CONSUMPTION_EDEFAULT);
				return;
			case FlowPackage.PROCESSOR__POWER_STATUS:
				setPowerStatus(POWER_STATUS_EDEFAULT);
				return;
			case FlowPackage.PROCESSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FlowPackage.PROCESSOR__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case FlowPackage.PROCESSOR__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
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
			case FlowPackage.PROCESSOR__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case FlowPackage.PROCESSOR__LOAD:
				return load != LOAD_EDEFAULT;
			case FlowPackage.PROCESSOR__OUTGOING_FLOWS:
				return outgoingFlows != null && !outgoingFlows.isEmpty();
			case FlowPackage.PROCESSOR__CONSUMPTION:
				return consumption != CONSUMPTION_EDEFAULT;
			case FlowPackage.PROCESSOR__POWER_STATUS:
				return powerStatus != POWER_STATUS_EDEFAULT;
			case FlowPackage.PROCESSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FlowPackage.PROCESSOR__VOLUME:
				return volume != VOLUME_EDEFAULT;
			case FlowPackage.PROCESSOR__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
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
		if (baseClass == CapacityBound.class) {
			switch (derivedFeatureID) {
				case FlowPackage.PROCESSOR__CAPACITY: return FlowPackage.CAPACITY_BOUND__CAPACITY;
				case FlowPackage.PROCESSOR__LOAD: return FlowPackage.CAPACITY_BOUND__LOAD;
				default: return -1;
			}
		}
		if (baseClass == FlowSource.class) {
			switch (derivedFeatureID) {
				case FlowPackage.PROCESSOR__OUTGOING_FLOWS: return FlowPackage.FLOW_SOURCE__OUTGOING_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == Powered.class) {
			switch (derivedFeatureID) {
				case FlowPackage.PROCESSOR__CONSUMPTION: return FlowPackage.POWERED__CONSUMPTION;
				case FlowPackage.PROCESSOR__POWER_STATUS: return FlowPackage.POWERED__POWER_STATUS;
				default: return -1;
			}
		}
		if (baseClass == Named.class) {
			switch (derivedFeatureID) {
				case FlowPackage.PROCESSOR__NAME: return FlowPackage.NAMED__NAME;
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
		if (baseClass == CapacityBound.class) {
			switch (baseFeatureID) {
				case FlowPackage.CAPACITY_BOUND__CAPACITY: return FlowPackage.PROCESSOR__CAPACITY;
				case FlowPackage.CAPACITY_BOUND__LOAD: return FlowPackage.PROCESSOR__LOAD;
				default: return -1;
			}
		}
		if (baseClass == FlowSource.class) {
			switch (baseFeatureID) {
				case FlowPackage.FLOW_SOURCE__OUTGOING_FLOWS: return FlowPackage.PROCESSOR__OUTGOING_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == Powered.class) {
			switch (baseFeatureID) {
				case FlowPackage.POWERED__CONSUMPTION: return FlowPackage.PROCESSOR__CONSUMPTION;
				case FlowPackage.POWERED__POWER_STATUS: return FlowPackage.PROCESSOR__POWER_STATUS;
				default: return -1;
			}
		}
		if (baseClass == Named.class) {
			switch (baseFeatureID) {
				case FlowPackage.NAMED__NAME: return FlowPackage.PROCESSOR__NAME;
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
		result.append(" (capacity: ");
		result.append(capacity);
		result.append(", load: ");
		result.append(load);
		result.append(", consumption: ");
		result.append(consumption);
		result.append(", powerStatus: ");
		result.append(powerStatus);
		result.append(", name: ");
		result.append(name);
		result.append(", volume: ");
		result.append(volume);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //ProcessorImpl
