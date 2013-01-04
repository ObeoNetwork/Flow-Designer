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
import fr.obeo.dsl.designer.sample.flow.FlowElement;
import fr.obeo.dsl.designer.sample.flow.FlowElementStatus;
import fr.obeo.dsl.designer.sample.flow.FlowElementUsage;
import fr.obeo.dsl.designer.sample.flow.FlowFactory;
import fr.obeo.dsl.designer.sample.flow.FlowPackage;
import fr.obeo.dsl.designer.sample.flow.FlowSource;
import fr.obeo.dsl.designer.sample.flow.FlowTarget;
import fr.obeo.dsl.designer.sample.flow.Operation;
import fr.obeo.dsl.designer.sample.flow.Physical;
import fr.obeo.dsl.designer.sample.flow.PowerInput;
import fr.obeo.dsl.designer.sample.flow.PowerLink;
import fr.obeo.dsl.designer.sample.flow.PowerOutput;
import fr.obeo.dsl.designer.sample.flow.PowerPlug;
import fr.obeo.dsl.designer.sample.flow.PowerPlugKind;
import fr.obeo.dsl.designer.sample.flow.PowerSource;
import fr.obeo.dsl.designer.sample.flow.Powered;
import fr.obeo.dsl.designer.sample.flow.PoweredStatus;
import fr.obeo.dsl.designer.sample.flow.Processor;
import fr.obeo.dsl.designer.sample.flow.State;

import fr.obeo.dsl.designer.sample.flow.StateProcessor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowPackageImpl extends EPackageImpl implements FlowPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass stateProcessorEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass processorEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fanEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass physicalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass compositeProcessorEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dataFlowEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass capacityBoundEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass systemEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass powerOutputEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass poweredEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass powerInputEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass powerLinkEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass flowSourceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass flowTargetEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dataSourceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass stateEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass computationResultEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass eventEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass operationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass flowElementEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum poweredStatusEEnum = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum flowElementStatusEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum flowElementUsageEEnum = null;

	/**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private FlowPackageImpl() {
        super(eNS_URI, FlowFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this
     * model, and for any others upon which it depends.  Simple
     * dependencies are satisfied by calling this method on all
     * dependent packages before doing anything else.  This method drives
     * initialization for interdependent packages directly, in parallel
     * with this package, itself.
     * <p>Of this package and its interdependencies, all packages which
     * have not yet been registered by their URI values are first created
     * and registered.  The packages are then initialized in two steps:
     * meta-model objects for all of the packages are created before any
     * are initialized, since one package's meta-model objects may refer to
     * those of another.
     * <p>Invocation of this method will not affect any packages that have
     * already been initialized.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static FlowPackage init() {
        if (isInited) return (FlowPackage)EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);

        // Obtain or create and register package
        FlowPackageImpl theFlowPackage = (FlowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof FlowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new FlowPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theFlowPackage.createPackageContents();

        // Initialize created meta-data
        theFlowPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theFlowPackage.freeze();

        return theFlowPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getStateProcessor() {
        return stateProcessorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getStateProcessor_Outputs() {
        return (EReference)stateProcessorEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getStateProcessor_States() {
        return (EReference)stateProcessorEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getStateProcessor_Current() {
        return (EReference)stateProcessorEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getStateProcessor_First() {
        return (EReference)stateProcessorEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getStateProcessor_Events() {
        return (EReference)stateProcessorEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getStateProcessor_Operations() {
        return (EReference)stateProcessorEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getProcessor() {
        return processorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProcessor_Name() {
        return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProcessor_Volume() {
        return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcessor_Weight() {
        return (EAttribute)processorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFan() {
        return fanEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFan_Speed() {
        return (EAttribute)fanEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFan_Weight() {
        return (EAttribute)fanEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPhysical() {
        return physicalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCompositeProcessor() {
        return compositeProcessorEClass;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDataFlow() {
        return dataFlowEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFlow_Target() {
        return (EReference)dataFlowEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataFlow_Source() {
        return (EReference)dataFlowEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCapacityBound() {
        return capacityBoundEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCapacityBound_Capacity() {
        return (EAttribute)capacityBoundEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCapacityBound_Load() {
        return (EAttribute)capacityBoundEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSystem() {
        return systemEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSystem_Flows() {
        return (EReference)systemEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSystem_Elements() {
        return (EReference)systemEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSystem_Name() {
        return (EAttribute)systemEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSystem_Temperature() {
        return (EAttribute)systemEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSystem_Weight() {
        return (EAttribute)systemEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystem_PowerOutputs() {
        return (EReference)systemEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSystem_PowerInputs() {
        return (EReference)systemEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPowerOutput() {
        return powerOutputEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPowerOutput_Power() {
        return (EAttribute)powerOutputEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPowerOutput_Links() {
        return (EReference)powerOutputEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPowered() {
        return poweredEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPowered_Consumption() {
        return (EAttribute)poweredEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPowered_PowerStatus() {
        return (EAttribute)poweredEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPowerInput() {
        return powerInputEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPowerLink() {
        return powerLinkEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPowerLink_Target() {
        return (EReference)powerLinkEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPowerLink_Source() {
        return (EReference)powerLinkEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFlowSource() {
        return flowSourceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFlowSource_OutgoingFlows() {
        return (EReference)flowSourceEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFlowTarget() {
        return flowTargetEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFlowTarget_IncomingFlows() {
        return (EReference)flowTargetEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDataSource() {
        return dataSourceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDataSource_Volume() {
        return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDataSource_Name() {
        return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getState() {
        return stateEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getState_Catches() {
        return (EReference)stateEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getState_Name() {
        return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getState_Execute() {
        return (EReference)stateEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getState_Next() {
        return (EReference)stateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getComputationResult() {
        return computationResultEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEvent() {
        return eventEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEvent_Next() {
        return (EReference)eventEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEvent_Name() {
        return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getOperation() {
        return operationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOperation_Output() {
        return (EReference)operationEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOperation_Volume() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getOperation_Name() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getOperation_CalledBy() {
        return (EReference)operationEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFlowElement() {
        return flowElementEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFlowElement_Status() {
        return (EAttribute)flowElementEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getFlowElement_Usage() {
        return (EAttribute)flowElementEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getPoweredStatus() {
        return poweredStatusEEnum;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFlowElementStatus() {
        return flowElementStatusEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getFlowElementUsage() {
        return flowElementUsageEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FlowFactory getFlowFactory() {
        return (FlowFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isCreated = false;

	/**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        stateProcessorEClass = createEClass(STATE_PROCESSOR);
        createEReference(stateProcessorEClass, STATE_PROCESSOR__OUTPUTS);
        createEReference(stateProcessorEClass, STATE_PROCESSOR__STATES);
        createEReference(stateProcessorEClass, STATE_PROCESSOR__CURRENT);
        createEReference(stateProcessorEClass, STATE_PROCESSOR__FIRST);
        createEReference(stateProcessorEClass, STATE_PROCESSOR__EVENTS);
        createEReference(stateProcessorEClass, STATE_PROCESSOR__OPERATIONS);

        processorEClass = createEClass(PROCESSOR);
        createEAttribute(processorEClass, PROCESSOR__NAME);
        createEAttribute(processorEClass, PROCESSOR__VOLUME);
        createEAttribute(processorEClass, PROCESSOR__WEIGHT);

        fanEClass = createEClass(FAN);
        createEAttribute(fanEClass, FAN__SPEED);
        createEAttribute(fanEClass, FAN__WEIGHT);

        physicalEClass = createEClass(PHYSICAL);

        compositeProcessorEClass = createEClass(COMPOSITE_PROCESSOR);

        dataFlowEClass = createEClass(DATA_FLOW);
        createEReference(dataFlowEClass, DATA_FLOW__TARGET);
        createEReference(dataFlowEClass, DATA_FLOW__SOURCE);

        capacityBoundEClass = createEClass(CAPACITY_BOUND);
        createEAttribute(capacityBoundEClass, CAPACITY_BOUND__CAPACITY);
        createEAttribute(capacityBoundEClass, CAPACITY_BOUND__LOAD);

        systemEClass = createEClass(SYSTEM);
        createEReference(systemEClass, SYSTEM__FLOWS);
        createEReference(systemEClass, SYSTEM__ELEMENTS);
        createEAttribute(systemEClass, SYSTEM__NAME);
        createEAttribute(systemEClass, SYSTEM__TEMPERATURE);
        createEAttribute(systemEClass, SYSTEM__WEIGHT);
        createEReference(systemEClass, SYSTEM__POWER_OUTPUTS);
        createEReference(systemEClass, SYSTEM__POWER_INPUTS);

        powerOutputEClass = createEClass(POWER_OUTPUT);
        createEAttribute(powerOutputEClass, POWER_OUTPUT__POWER);
        createEReference(powerOutputEClass, POWER_OUTPUT__LINKS);

        poweredEClass = createEClass(POWERED);
        createEAttribute(poweredEClass, POWERED__CONSUMPTION);
        createEAttribute(poweredEClass, POWERED__POWER_STATUS);

        powerInputEClass = createEClass(POWER_INPUT);

        powerLinkEClass = createEClass(POWER_LINK);
        createEReference(powerLinkEClass, POWER_LINK__TARGET);
        createEReference(powerLinkEClass, POWER_LINK__SOURCE);

        flowSourceEClass = createEClass(FLOW_SOURCE);
        createEReference(flowSourceEClass, FLOW_SOURCE__OUTGOING_FLOWS);

        flowTargetEClass = createEClass(FLOW_TARGET);
        createEReference(flowTargetEClass, FLOW_TARGET__INCOMING_FLOWS);

        dataSourceEClass = createEClass(DATA_SOURCE);
        createEAttribute(dataSourceEClass, DATA_SOURCE__VOLUME);
        createEAttribute(dataSourceEClass, DATA_SOURCE__NAME);

        stateEClass = createEClass(STATE);
        createEReference(stateEClass, STATE__CATCHES);
        createEAttribute(stateEClass, STATE__NAME);
        createEReference(stateEClass, STATE__EXECUTE);
        createEReference(stateEClass, STATE__NEXT);

        computationResultEClass = createEClass(COMPUTATION_RESULT);

        eventEClass = createEClass(EVENT);
        createEReference(eventEClass, EVENT__NEXT);
        createEAttribute(eventEClass, EVENT__NAME);

        operationEClass = createEClass(OPERATION);
        createEReference(operationEClass, OPERATION__OUTPUT);
        createEAttribute(operationEClass, OPERATION__VOLUME);
        createEAttribute(operationEClass, OPERATION__NAME);
        createEReference(operationEClass, OPERATION__CALLED_BY);

        flowElementEClass = createEClass(FLOW_ELEMENT);
        createEAttribute(flowElementEClass, FLOW_ELEMENT__STATUS);
        createEAttribute(flowElementEClass, FLOW_ELEMENT__USAGE);

        // Create enums
        poweredStatusEEnum = createEEnum(POWERED_STATUS);
        flowElementStatusEEnum = createEEnum(FLOW_ELEMENT_STATUS);
        flowElementUsageEEnum = createEEnum(FLOW_ELEMENT_USAGE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        stateProcessorEClass.getESuperTypes().add(this.getProcessor());
        processorEClass.getESuperTypes().add(this.getFlowTarget());
        processorEClass.getESuperTypes().add(this.getCapacityBound());
        processorEClass.getESuperTypes().add(this.getFlowSource());
        processorEClass.getESuperTypes().add(this.getPowered());
        fanEClass.getESuperTypes().add(this.getFlowElement());
        fanEClass.getESuperTypes().add(this.getPowered());
        compositeProcessorEClass.getESuperTypes().add(this.getSystem());
        compositeProcessorEClass.getESuperTypes().add(this.getFlowTarget());
        compositeProcessorEClass.getESuperTypes().add(this.getCapacityBound());
        compositeProcessorEClass.getESuperTypes().add(this.getFlowSource());
        dataFlowEClass.getESuperTypes().add(this.getCapacityBound());
        capacityBoundEClass.getESuperTypes().add(this.getFlowElement());
        systemEClass.getESuperTypes().add(this.getPowered());
        flowSourceEClass.getESuperTypes().add(this.getFlowElement());
        flowTargetEClass.getESuperTypes().add(this.getFlowElement());
        dataSourceEClass.getESuperTypes().add(this.getFlowSource());
        computationResultEClass.getESuperTypes().add(this.getFlowSource());

        // Initialize classes and features; add operations and parameters
        initEClass(stateProcessorEClass, StateProcessor.class, "StateProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStateProcessor_Outputs(), this.getComputationResult(), null, "outputs", null, 0, -1, StateProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStateProcessor_States(), this.getState(), null, "states", null, 0, -1, StateProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStateProcessor_Current(), this.getState(), null, "current", null, 0, 1, StateProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStateProcessor_First(), this.getState(), null, "first", null, 0, 1, StateProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStateProcessor_Events(), this.getEvent(), null, "events", null, 0, -1, StateProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStateProcessor_Operations(), this.getOperation(), null, "operations", null, 0, -1, StateProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProcessor_Name(), ecorePackage.getEString(), "name", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessor_Volume(), ecorePackage.getEInt(), "volume", "2", 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcessor_Weight(), ecorePackage.getEInt(), "weight", "10", 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fanEClass, Fan.class, "Fan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFan_Speed(), ecorePackage.getEInt(), "speed", "1000", 1, 1, Fan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFan_Weight(), ecorePackage.getEInt(), "weight", "3", 1, 1, Fan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(physicalEClass, Physical.class, "Physical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(compositeProcessorEClass, CompositeProcessor.class, "CompositeProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dataFlowEClass, DataFlow.class, "DataFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataFlow_Target(), this.getFlowTarget(), this.getFlowTarget_IncomingFlows(), "target", null, 1, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataFlow_Source(), this.getFlowSource(), this.getFlowSource_OutgoingFlows(), "source", null, 1, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(capacityBoundEClass, CapacityBound.class, "CapacityBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCapacityBound_Capacity(), ecorePackage.getEInt(), "capacity", "10", 1, 1, CapacityBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCapacityBound_Load(), ecorePackage.getEInt(), "load", "0", 1, 1, CapacityBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(systemEClass, fr.obeo.dsl.designer.sample.flow.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSystem_Flows(), this.getDataFlow(), null, "flows", null, 0, -1, fr.obeo.dsl.designer.sample.flow.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystem_Elements(), this.getFlowElement(), null, "elements", null, 0, -1, fr.obeo.dsl.designer.sample.flow.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", "", 1, 1, fr.obeo.dsl.designer.sample.flow.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSystem_Temperature(), ecorePackage.getEInt(), "temperature", "0", 0, 1, fr.obeo.dsl.designer.sample.flow.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSystem_Weight(), ecorePackage.getEInt(), "weight", "0", 0, 1, fr.obeo.dsl.designer.sample.flow.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystem_PowerOutputs(), this.getPowerOutput(), null, "powerOutputs", null, 0, -1, fr.obeo.dsl.designer.sample.flow.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystem_PowerInputs(), this.getPowerInput(), null, "powerInputs", null, 0, -1, fr.obeo.dsl.designer.sample.flow.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(powerOutputEClass, PowerOutput.class, "PowerOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPowerOutput_Power(), ecorePackage.getEInt(), "power", "1000", 1, 1, PowerOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPowerOutput_Links(), this.getPowerLink(), this.getPowerLink_Source(), "links", null, 0, -1, PowerOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(poweredEClass, Powered.class, "Powered", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPowered_Consumption(), ecorePackage.getEInt(), "consumption", "0", 0, 1, Powered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPowered_PowerStatus(), this.getPoweredStatus(), "powerStatus", null, 1, 1, Powered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(powerInputEClass, PowerInput.class, "PowerInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(powerLinkEClass, PowerLink.class, "PowerLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPowerLink_Target(), this.getPowerInput(), null, "target", null, 0, 1, PowerLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPowerLink_Source(), this.getPowerOutput(), this.getPowerOutput_Links(), "source", null, 0, 1, PowerLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(flowSourceEClass, FlowSource.class, "FlowSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFlowSource_OutgoingFlows(), this.getDataFlow(), this.getDataFlow_Source(), "outgoingFlows", null, 0, -1, FlowSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(flowTargetEClass, FlowTarget.class, "FlowTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFlowTarget_IncomingFlows(), this.getDataFlow(), this.getDataFlow_Target(), "incomingFlows", null, 0, -1, FlowTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataSourceEClass, DataSource.class, "DataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDataSource_Volume(), ecorePackage.getEInt(), "volume", "2", 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataSource_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getState_Catches(), this.getEvent(), null, "catches", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_Execute(), this.getOperation(), this.getOperation_CalledBy(), "execute", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getState_Next(), this.getState(), null, "next", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(computationResultEClass, ComputationResult.class, "ComputationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEvent_Next(), this.getState(), null, "next", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOperation_Output(), this.getComputationResult(), null, "output", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperation_Volume(), ecorePackage.getEInt(), "volume", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperation_CalledBy(), this.getState(), this.getState_Execute(), "calledBy", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(flowElementEClass, FlowElement.class, "FlowElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFlowElement_Status(), this.getFlowElementStatus(), "status", "active", 1, 1, FlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFlowElement_Usage(), this.getFlowElementUsage(), "usage", null, 1, 1, FlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(poweredStatusEEnum, PoweredStatus.class, "PoweredStatus");
        addEEnumLiteral(poweredStatusEEnum, PoweredStatus.NONE);
        addEEnumLiteral(poweredStatusEEnum, PoweredStatus.LOW);
        addEEnumLiteral(poweredStatusEEnum, PoweredStatus.OK);

        initEEnum(flowElementStatusEEnum, FlowElementStatus.class, "FlowElementStatus");
        addEEnumLiteral(flowElementStatusEEnum, FlowElementStatus.INACTIVE);
        addEEnumLiteral(flowElementStatusEEnum, FlowElementStatus.ACTIVE);

        initEEnum(flowElementUsageEEnum, FlowElementUsage.class, "FlowElementUsage");
        addEEnumLiteral(flowElementUsageEEnum, FlowElementUsage.UNUSED);
        addEEnumLiteral(flowElementUsageEEnum, FlowElementUsage.LOW);
        addEEnumLiteral(flowElementUsageEEnum, FlowElementUsage.STANDARD);
        addEEnumLiteral(flowElementUsageEEnum, FlowElementUsage.HIGH);
        addEEnumLiteral(flowElementUsageEEnum, FlowElementUsage.OVER);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // Tags
        createTagsAnnotations();
    }

    /**
     * Initializes the annotations for <b>Tags</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createTagsAnnotations() {
        String source = "Tags";		
        addAnnotation
          (this, 
           source, 
           new String[] {
             "test", null
           });
    }

} //FlowPackageImpl
