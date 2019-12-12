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

import fr.obeo.dsl.designer.sample.flow.DataFlow;
import fr.obeo.dsl.designer.sample.flow.FlowElement;
import fr.obeo.dsl.designer.sample.flow.FlowElementStatus;
import fr.obeo.dsl.designer.sample.flow.FlowElementUsage;
import fr.obeo.dsl.designer.sample.flow.FlowPackage;

import fr.obeo.dsl.designer.sample.flow.FlowSource;
import fr.obeo.dsl.designer.sample.flow.Named;
import fr.obeo.dsl.designer.sample.flow.PowerInput;
import fr.obeo.dsl.designer.sample.flow.PowerOutput;
import fr.obeo.dsl.designer.sample.flow.PowerPlug;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.SystemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.SystemImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.SystemImpl#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.SystemImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.SystemImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.SystemImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.SystemImpl#getPowerOutputs <em>Power Outputs</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.SystemImpl#getPowerInputs <em>Power Inputs</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.SystemImpl#getRoutingRules <em>Routing Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends PoweredImpl implements fr.obeo.dsl.designer.sample.flow.System {
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
	 * The cached value of the '{@link #getOutgoingFlows() <em>Outgoing Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> outgoingFlows;

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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
				 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
				protected EList<FlowElement> elements;

    /**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
    protected static final int TEMPERATURE_EDEFAULT = 0;

    /**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
    protected int temperature = TEMPERATURE_EDEFAULT;

    /**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
    protected static final int WEIGHT_EDEFAULT = 0;

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
	 * The cached value of the '{@link #getPowerOutputs() <em>Power Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPowerOutputs()
	 * @generated
	 * @ordered
	 */
    protected EList<PowerOutput> powerOutputs;

    /**
	 * The cached value of the '{@link #getPowerInputs() <em>Power Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPowerInputs()
	 * @generated
	 * @ordered
	 */
    protected EList<PowerInput> powerInputs;

    /**
	 * The default value of the '{@link #getRoutingRules() <em>Routing Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingRules()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTING_RULES_EDEFAULT = null;

				/**
	 * The cached value of the '{@link #getRoutingRules() <em>Routing Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingRules()
	 * @generated
	 * @ordered
	 */
	protected String routingRules = ROUTING_RULES_EDEFAULT;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SYSTEM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SYSTEM__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getOutgoingFlows() {
		if (outgoingFlows == null) {
			outgoingFlows = new EObjectContainmentWithInverseEList<DataFlow>(DataFlow.class, this, FlowPackage.SYSTEM__OUTGOING_FLOWS, FlowPackage.DATA_FLOW__SOURCE);
		}
		return outgoingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<FlowElement>(FlowElement.class, this, FlowPackage.SYSTEM__ELEMENTS);
		}
		return elements;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SYSTEM__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getTemperature() {
		return temperature;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTemperature(int newTemperature) {
		int oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SYSTEM__TEMPERATURE, oldTemperature, temperature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SYSTEM__WEIGHT, oldWeight, weight));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<PowerOutput> getPowerOutputs() {
		if (powerOutputs == null) {
			powerOutputs = new EObjectContainmentEList<PowerOutput>(PowerOutput.class, this, FlowPackage.SYSTEM__POWER_OUTPUTS);
		}
		return powerOutputs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<PowerInput> getPowerInputs() {
		if (powerInputs == null) {
			powerInputs = new EObjectContainmentEList<PowerInput>(PowerInput.class, this, FlowPackage.SYSTEM__POWER_INPUTS);
		}
		return powerInputs;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoutingRules() {
		return routingRules;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutingRules(String newRoutingRules) {
		String oldRoutingRules = routingRules;
		routingRules = newRoutingRules;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SYSTEM__ROUTING_RULES, oldRoutingRules, routingRules));
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
			case FlowPackage.SYSTEM__OUTGOING_FLOWS:
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
			case FlowPackage.SYSTEM__OUTGOING_FLOWS:
				return ((InternalEList<?>)getOutgoingFlows()).basicRemove(otherEnd, msgs);
			case FlowPackage.SYSTEM__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case FlowPackage.SYSTEM__POWER_OUTPUTS:
				return ((InternalEList<?>)getPowerOutputs()).basicRemove(otherEnd, msgs);
			case FlowPackage.SYSTEM__POWER_INPUTS:
				return ((InternalEList<?>)getPowerInputs()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.SYSTEM__STATUS:
				return getStatus();
			case FlowPackage.SYSTEM__USAGE:
				return getUsage();
			case FlowPackage.SYSTEM__OUTGOING_FLOWS:
				return getOutgoingFlows();
			case FlowPackage.SYSTEM__NAME:
				return getName();
			case FlowPackage.SYSTEM__ELEMENTS:
				return getElements();
			case FlowPackage.SYSTEM__TEMPERATURE:
				return getTemperature();
			case FlowPackage.SYSTEM__WEIGHT:
				return getWeight();
			case FlowPackage.SYSTEM__POWER_OUTPUTS:
				return getPowerOutputs();
			case FlowPackage.SYSTEM__POWER_INPUTS:
				return getPowerInputs();
			case FlowPackage.SYSTEM__ROUTING_RULES:
				return getRoutingRules();
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
			case FlowPackage.SYSTEM__STATUS:
				setStatus((FlowElementStatus)newValue);
				return;
			case FlowPackage.SYSTEM__USAGE:
				setUsage((FlowElementUsage)newValue);
				return;
			case FlowPackage.SYSTEM__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				getOutgoingFlows().addAll((Collection<? extends DataFlow>)newValue);
				return;
			case FlowPackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case FlowPackage.SYSTEM__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends FlowElement>)newValue);
				return;
			case FlowPackage.SYSTEM__TEMPERATURE:
				setTemperature((Integer)newValue);
				return;
			case FlowPackage.SYSTEM__WEIGHT:
				setWeight((Integer)newValue);
				return;
			case FlowPackage.SYSTEM__POWER_OUTPUTS:
				getPowerOutputs().clear();
				getPowerOutputs().addAll((Collection<? extends PowerOutput>)newValue);
				return;
			case FlowPackage.SYSTEM__POWER_INPUTS:
				getPowerInputs().clear();
				getPowerInputs().addAll((Collection<? extends PowerInput>)newValue);
				return;
			case FlowPackage.SYSTEM__ROUTING_RULES:
				setRoutingRules((String)newValue);
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
			case FlowPackage.SYSTEM__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case FlowPackage.SYSTEM__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case FlowPackage.SYSTEM__OUTGOING_FLOWS:
				getOutgoingFlows().clear();
				return;
			case FlowPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FlowPackage.SYSTEM__ELEMENTS:
				getElements().clear();
				return;
			case FlowPackage.SYSTEM__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case FlowPackage.SYSTEM__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case FlowPackage.SYSTEM__POWER_OUTPUTS:
				getPowerOutputs().clear();
				return;
			case FlowPackage.SYSTEM__POWER_INPUTS:
				getPowerInputs().clear();
				return;
			case FlowPackage.SYSTEM__ROUTING_RULES:
				setRoutingRules(ROUTING_RULES_EDEFAULT);
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
			case FlowPackage.SYSTEM__STATUS:
				return status != STATUS_EDEFAULT;
			case FlowPackage.SYSTEM__USAGE:
				return usage != USAGE_EDEFAULT;
			case FlowPackage.SYSTEM__OUTGOING_FLOWS:
				return outgoingFlows != null && !outgoingFlows.isEmpty();
			case FlowPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FlowPackage.SYSTEM__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case FlowPackage.SYSTEM__TEMPERATURE:
				return temperature != TEMPERATURE_EDEFAULT;
			case FlowPackage.SYSTEM__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case FlowPackage.SYSTEM__POWER_OUTPUTS:
				return powerOutputs != null && !powerOutputs.isEmpty();
			case FlowPackage.SYSTEM__POWER_INPUTS:
				return powerInputs != null && !powerInputs.isEmpty();
			case FlowPackage.SYSTEM__ROUTING_RULES:
				return ROUTING_RULES_EDEFAULT == null ? routingRules != null : !ROUTING_RULES_EDEFAULT.equals(routingRules);
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
				case FlowPackage.SYSTEM__STATUS: return FlowPackage.FLOW_ELEMENT__STATUS;
				case FlowPackage.SYSTEM__USAGE: return FlowPackage.FLOW_ELEMENT__USAGE;
				default: return -1;
			}
		}
		if (baseClass == FlowSource.class) {
			switch (derivedFeatureID) {
				case FlowPackage.SYSTEM__OUTGOING_FLOWS: return FlowPackage.FLOW_SOURCE__OUTGOING_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == Named.class) {
			switch (derivedFeatureID) {
				case FlowPackage.SYSTEM__NAME: return FlowPackage.NAMED__NAME;
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
				case FlowPackage.FLOW_ELEMENT__STATUS: return FlowPackage.SYSTEM__STATUS;
				case FlowPackage.FLOW_ELEMENT__USAGE: return FlowPackage.SYSTEM__USAGE;
				default: return -1;
			}
		}
		if (baseClass == FlowSource.class) {
			switch (baseFeatureID) {
				case FlowPackage.FLOW_SOURCE__OUTGOING_FLOWS: return FlowPackage.SYSTEM__OUTGOING_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == Named.class) {
			switch (baseFeatureID) {
				case FlowPackage.NAMED__NAME: return FlowPackage.SYSTEM__NAME;
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
		result.append(" (status: ");
		result.append(status);
		result.append(", usage: ");
		result.append(usage);
		result.append(", name: ");
		result.append(name);
		result.append(", temperature: ");
		result.append(temperature);
		result.append(", weight: ");
		result.append(weight);
		result.append(", routingRules: ");
		result.append(routingRules);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
