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

import fr.obeo.dsl.designer.sample.flow.Fan;
import fr.obeo.dsl.designer.sample.flow.FlowPackage;

import fr.obeo.dsl.designer.sample.flow.Powered;
import fr.obeo.dsl.designer.sample.flow.PoweredStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.FanImpl#getConsumption <em>Consumption</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.FanImpl#getPowerStatus <em>Power Status</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.FanImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.FanImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FanImpl extends FlowElementImpl implements Fan {
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
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
    protected static final int SPEED_EDEFAULT = 1000;
    /**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
    protected int speed = SPEED_EDEFAULT;

    /**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
    protected static final int WEIGHT_EDEFAULT = 3;
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
    protected FanImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return FlowPackage.Literals.FAN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.FAN__CONSUMPTION, oldConsumption, consumption));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.FAN__POWER_STATUS, oldPowerStatus, powerStatus));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getSpeed() {
		return speed;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSpeed(int newSpeed) {
		int oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.FAN__SPEED, oldSpeed, speed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.FAN__WEIGHT, oldWeight, weight));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.FAN__CONSUMPTION:
				return getConsumption();
			case FlowPackage.FAN__POWER_STATUS:
				return getPowerStatus();
			case FlowPackage.FAN__SPEED:
				return getSpeed();
			case FlowPackage.FAN__WEIGHT:
				return getWeight();
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
			case FlowPackage.FAN__CONSUMPTION:
				setConsumption((Integer)newValue);
				return;
			case FlowPackage.FAN__POWER_STATUS:
				setPowerStatus((PoweredStatus)newValue);
				return;
			case FlowPackage.FAN__SPEED:
				setSpeed((Integer)newValue);
				return;
			case FlowPackage.FAN__WEIGHT:
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
			case FlowPackage.FAN__CONSUMPTION:
				setConsumption(CONSUMPTION_EDEFAULT);
				return;
			case FlowPackage.FAN__POWER_STATUS:
				setPowerStatus(POWER_STATUS_EDEFAULT);
				return;
			case FlowPackage.FAN__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case FlowPackage.FAN__WEIGHT:
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
			case FlowPackage.FAN__CONSUMPTION:
				return consumption != CONSUMPTION_EDEFAULT;
			case FlowPackage.FAN__POWER_STATUS:
				return powerStatus != POWER_STATUS_EDEFAULT;
			case FlowPackage.FAN__SPEED:
				return speed != SPEED_EDEFAULT;
			case FlowPackage.FAN__WEIGHT:
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
		if (baseClass == Powered.class) {
			switch (derivedFeatureID) {
				case FlowPackage.FAN__CONSUMPTION: return FlowPackage.POWERED__CONSUMPTION;
				case FlowPackage.FAN__POWER_STATUS: return FlowPackage.POWERED__POWER_STATUS;
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
		if (baseClass == Powered.class) {
			switch (baseFeatureID) {
				case FlowPackage.POWERED__CONSUMPTION: return FlowPackage.FAN__CONSUMPTION;
				case FlowPackage.POWERED__POWER_STATUS: return FlowPackage.FAN__POWER_STATUS;
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
		result.append(" (consumption: ");
		result.append(consumption);
		result.append(", powerStatus: ");
		result.append(powerStatus);
		result.append(", speed: ");
		result.append(speed);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //FanImpl
