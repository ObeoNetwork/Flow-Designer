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
import fr.obeo.dsl.designer.sample.flow.ComputationResult;
import fr.obeo.dsl.designer.sample.flow.DataFlow;
import fr.obeo.dsl.designer.sample.flow.DataSource;
import fr.obeo.dsl.designer.sample.flow.Event;
import fr.obeo.dsl.designer.sample.flow.Fan;
import fr.obeo.dsl.designer.sample.flow.FlowElementStatus;
import fr.obeo.dsl.designer.sample.flow.FlowElementUsage;
import fr.obeo.dsl.designer.sample.flow.FlowFactory;
import fr.obeo.dsl.designer.sample.flow.FlowPackage;
import fr.obeo.dsl.designer.sample.flow.Operation;
import fr.obeo.dsl.designer.sample.flow.Physical;
import fr.obeo.dsl.designer.sample.flow.PowerInput;
import fr.obeo.dsl.designer.sample.flow.PowerLink;
import fr.obeo.dsl.designer.sample.flow.PowerOutput;
import fr.obeo.dsl.designer.sample.flow.PowerPlug;
import fr.obeo.dsl.designer.sample.flow.PowerPlugKind;
import fr.obeo.dsl.designer.sample.flow.PowerSource;
import fr.obeo.dsl.designer.sample.flow.PoweredStatus;
import fr.obeo.dsl.designer.sample.flow.Processor;
import fr.obeo.dsl.designer.sample.flow.State;

import fr.obeo.dsl.designer.sample.flow.StateProcessor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowFactoryImpl extends EFactoryImpl implements FlowFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static FlowFactory init() {
        try {
            FlowFactory theFlowFactory = (FlowFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.obeo.fr/dsl/designer/sample/flow"); 
            if (theFlowFactory != null) {
                return theFlowFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new FlowFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FlowFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case FlowPackage.STATE_PROCESSOR: return createStateProcessor();
            case FlowPackage.PROCESSOR: return createProcessor();
            case FlowPackage.FAN: return createFan();
            case FlowPackage.PHYSICAL: return createPhysical();
            case FlowPackage.COMPOSITE_PROCESSOR: return createCompositeProcessor();
            case FlowPackage.DATA_FLOW: return createDataFlow();
            case FlowPackage.CAPACITY_BOUND: return createCapacityBound();
            case FlowPackage.SYSTEM: return createSystem();
            case FlowPackage.POWER_OUTPUT: return createPowerOutput();
            case FlowPackage.POWER_INPUT: return createPowerInput();
            case FlowPackage.POWER_LINK: return createPowerLink();
            case FlowPackage.DATA_SOURCE: return createDataSource();
            case FlowPackage.STATE: return createState();
            case FlowPackage.COMPUTATION_RESULT: return createComputationResult();
            case FlowPackage.EVENT: return createEvent();
            case FlowPackage.OPERATION: return createOperation();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case FlowPackage.POWERED_STATUS:
                return createPoweredStatusFromString(eDataType, initialValue);
            case FlowPackage.FLOW_ELEMENT_STATUS:
                return createFlowElementStatusFromString(eDataType, initialValue);
            case FlowPackage.FLOW_ELEMENT_USAGE:
                return createFlowElementUsageFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case FlowPackage.POWERED_STATUS:
                return convertPoweredStatusToString(eDataType, instanceValue);
            case FlowPackage.FLOW_ELEMENT_STATUS:
                return convertFlowElementStatusToString(eDataType, instanceValue);
            case FlowPackage.FLOW_ELEMENT_USAGE:
                return convertFlowElementUsageToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StateProcessor createStateProcessor() {
        StateProcessorImpl stateProcessor = new StateProcessorImpl();
        return stateProcessor;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Processor createProcessor() {
        ProcessorImpl processor = new ProcessorImpl();
        return processor;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fan createFan() {
        FanImpl fan = new FanImpl();
        return fan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Physical createPhysical() {
        PhysicalImpl physical = new PhysicalImpl();
        return physical;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CompositeProcessor createCompositeProcessor() {
        CompositeProcessorImpl compositeProcessor = new CompositeProcessorImpl();
        return compositeProcessor;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataFlow createDataFlow() {
        DataFlowImpl dataFlow = new DataFlowImpl();
        return dataFlow;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CapacityBound createCapacityBound() {
        CapacityBoundImpl capacityBound = new CapacityBoundImpl();
        return capacityBound;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public fr.obeo.dsl.designer.sample.flow.System createSystem() {
        SystemImpl system = new SystemImpl();
        return system;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowerOutput createPowerOutput() {
        PowerOutputImpl powerOutput = new PowerOutputImpl();
        return powerOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowerInput createPowerInput() {
        PowerInputImpl powerInput = new PowerInputImpl();
        return powerInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowerLink createPowerLink() {
        PowerLinkImpl powerLink = new PowerLinkImpl();
        return powerLink;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DataSource createDataSource() {
        DataSourceImpl dataSource = new DataSourceImpl();
        return dataSource;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public State createState() {
        StateImpl state = new StateImpl();
        return state;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComputationResult createComputationResult() {
        ComputationResultImpl computationResult = new ComputationResultImpl();
        return computationResult;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Event createEvent() {
        EventImpl event = new EventImpl();
        return event;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Operation createOperation() {
        OperationImpl operation = new OperationImpl();
        return operation;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PoweredStatus createPoweredStatusFromString(EDataType eDataType, String initialValue) {
        PoweredStatus result = PoweredStatus.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPoweredStatusToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FlowElementStatus createFlowElementStatusFromString(EDataType eDataType, String initialValue) {
        FlowElementStatus result = FlowElementStatus.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertFlowElementStatusToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FlowElementUsage createFlowElementUsageFromString(EDataType eDataType, String initialValue) {
        FlowElementUsage result = FlowElementUsage.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertFlowElementUsageToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FlowPackage getFlowPackage() {
        return (FlowPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static FlowPackage getPackage() {
        return FlowPackage.eINSTANCE;
    }

} //FlowFactoryImpl
