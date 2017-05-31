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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.designer.sample.flow.FlowFactory
 * @model kind="package"
 * @generated
 */
public interface FlowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeo.fr/dsl/designer/sample/flow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowPackage eINSTANCE = fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.FlowElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowElementImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getFlowElement()
	 * @generated
	 */
	int FLOW_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__USAGE = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.FlowTargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowTargetImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getFlowTarget()
	 * @generated
	 */
	int FLOW_TARGET = 12;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.ProcessorImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 11;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.FanImpl <em>Fan</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FanImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getFan()
	 * @generated
	 */
    int FAN = 0;

    /**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FAN__STATUS = FLOW_ELEMENT__STATUS;

    /**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FAN__USAGE = FLOW_ELEMENT__USAGE;

    /**
	 * The feature id for the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FAN__CONSUMPTION = FLOW_ELEMENT_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Power Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FAN__POWER_STATUS = FLOW_ELEMENT_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FAN__SPEED = FLOW_ELEMENT_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FAN__WEIGHT = FLOW_ELEMENT_FEATURE_COUNT + 3;

    /**
	 * The number of structural features of the '<em>Fan</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FAN_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 4;

    /**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.PhysicalImpl <em>Physical</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.PhysicalImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getPhysical()
	 * @generated
	 */
    int PHYSICAL = 1;

    /**
	 * The number of structural features of the '<em>Physical</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PHYSICAL_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.PoweredImpl <em>Powered</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.PoweredImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getPowered()
	 * @generated
	 */
    int POWERED = 7;

    /**
	 * The feature id for the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POWERED__CONSUMPTION = 0;

    /**
	 * The feature id for the '<em><b>Power Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POWERED__POWER_STATUS = 1;

    /**
	 * The number of structural features of the '<em>Powered</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POWERED_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.DataFlowImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 3;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.CapacityBoundImpl <em>Capacity Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.CapacityBoundImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getCapacityBound()
	 * @generated
	 */
	int CAPACITY_BOUND = 4;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.SystemImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SYSTEM__CONSUMPTION = POWERED__CONSUMPTION;

    /**
	 * The feature id for the '<em><b>Power Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SYSTEM__POWER_STATUS = POWERED__POWER_STATUS;

    /**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__STATUS = POWERED_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__USAGE = POWERED_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OUTGOING_FLOWS = POWERED_FEATURE_COUNT + 2;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SYSTEM__NAME = POWERED_FEATURE_COUNT + 3;

				/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ELEMENTS = POWERED_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SYSTEM__TEMPERATURE = POWERED_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SYSTEM__WEIGHT = POWERED_FEATURE_COUNT + 6;

    /**
	 * The feature id for the '<em><b>Power Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SYSTEM__POWER_OUTPUTS = POWERED_FEATURE_COUNT + 7;

    /**
	 * The feature id for the '<em><b>Power Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SYSTEM__POWER_INPUTS = POWERED_FEATURE_COUNT + 8;

    /**
	 * The feature id for the '<em><b>Routing Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ROUTING_RULES = POWERED_FEATURE_COUNT + 9;

				/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = POWERED_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.CompositeProcessorImpl <em>Composite Processor</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.CompositeProcessorImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getCompositeProcessor()
	 * @generated
	 */
    int COMPOSITE_PROCESSOR = 2;

    /**
	 * The feature id for the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR__CONSUMPTION = SYSTEM__CONSUMPTION;

    /**
	 * The feature id for the '<em><b>Power Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR__POWER_STATUS = SYSTEM__POWER_STATUS;

    /**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR__STATUS = SYSTEM__STATUS;

    /**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR__USAGE = SYSTEM__USAGE;

    /**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR__OUTGOING_FLOWS = SYSTEM__OUTGOING_FLOWS;

				/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR__NAME = SYSTEM__NAME;

				/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR__ELEMENTS = SYSTEM__ELEMENTS;

				/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR__TEMPERATURE = SYSTEM__TEMPERATURE;

				/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR__WEIGHT = SYSTEM__WEIGHT;

				/**
	 * The feature id for the '<em><b>Power Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR__POWER_OUTPUTS = SYSTEM__POWER_OUTPUTS;

				/**
	 * The feature id for the '<em><b>Power Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR__POWER_INPUTS = SYSTEM__POWER_INPUTS;

				/**
	 * The feature id for the '<em><b>Routing Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__ROUTING_RULES = SYSTEM__ROUTING_RULES;

				/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR__INCOMING_FLOWS = SYSTEM_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR__CAPACITY = SYSTEM_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR__LOAD = SYSTEM_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Composite Processor</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPOSITE_PROCESSOR_FEATURE_COUNT = SYSTEM_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BOUND__STATUS = FLOW_ELEMENT__STATUS;

    /**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BOUND__USAGE = FLOW_ELEMENT__USAGE;

    /**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BOUND__CAPACITY = FLOW_ELEMENT_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BOUND__LOAD = FLOW_ELEMENT_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Capacity Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BOUND_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__STATUS = CAPACITY_BOUND__STATUS;

    /**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__USAGE = CAPACITY_BOUND__USAGE;

    /**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__CAPACITY = CAPACITY_BOUND__CAPACITY;

    /**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__LOAD = CAPACITY_BOUND__LOAD;

    /**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TARGET = CAPACITY_BOUND_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SOURCE = CAPACITY_BOUND_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = CAPACITY_BOUND_FEATURE_COUNT + 2;

    /**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.PowerOutputImpl <em>Power Output</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.PowerOutputImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getPowerOutput()
	 * @generated
	 */
    int POWER_OUTPUT = 6;

    /**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POWER_OUTPUT__POWER = 0;

    /**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POWER_OUTPUT__LINKS = 1;

    /**
	 * The number of structural features of the '<em>Power Output</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POWER_OUTPUT_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.PowerInputImpl <em>Power Input</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.PowerInputImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getPowerInput()
	 * @generated
	 */
    int POWER_INPUT = 8;

    /**
	 * The number of structural features of the '<em>Power Input</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POWER_INPUT_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.PowerLinkImpl <em>Power Link</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.PowerLinkImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getPowerLink()
	 * @generated
	 */
    int POWER_LINK = 9;

    /**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POWER_LINK__TARGET = 0;

    /**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POWER_LINK__SOURCE = 1;

    /**
	 * The number of structural features of the '<em>Power Link</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POWER_LINK_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.FlowSourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowSourceImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getFlowSource()
	 * @generated
	 */
	int FLOW_SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__STATUS = FLOW_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__USAGE = FLOW_ELEMENT__USAGE;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__OUTGOING_FLOWS = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TARGET__STATUS = FLOW_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TARGET__USAGE = FLOW_ELEMENT__USAGE;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TARGET__INCOMING_FLOWS = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TARGET_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__STATUS = FLOW_TARGET__STATUS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__USAGE = FLOW_TARGET__USAGE;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__INCOMING_FLOWS = FLOW_TARGET__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__CAPACITY = FLOW_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__LOAD = FLOW_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__OUTGOING_FLOWS = FLOW_TARGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROCESSOR__CONSUMPTION = FLOW_TARGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Power Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__POWER_STATUS = FLOW_TARGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int PROCESSOR__NAME = FLOW_TARGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int PROCESSOR__VOLUME = FLOW_TARGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__WEIGHT = FLOW_TARGET_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
* <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
int PROCESSOR_FEATURE_COUNT = FLOW_TARGET_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.DataSourceImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 13;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__STATUS = FLOW_SOURCE__STATUS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__USAGE = FLOW_SOURCE__USAGE;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__OUTGOING_FLOWS = FLOW_SOURCE__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = FLOW_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__VOLUME = FLOW_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = FLOW_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.impl.NamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.impl.NamedImpl
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.PoweredStatus <em>Powered Status</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.PoweredStatus
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getPoweredStatus()
	 * @generated
	 */
    int POWERED_STATUS = 16;

    /**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.FlowElementStatus <em>Element Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.FlowElementStatus
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getFlowElementStatus()
	 * @generated
	 */
	int FLOW_ELEMENT_STATUS = 17;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.designer.sample.flow.FlowElementUsage <em>Element Usage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.designer.sample.flow.FlowElementUsage
	 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getFlowElementUsage()
	 * @generated
	 */
	int FLOW_ELEMENT_USAGE = 18;


	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.Processor#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.Processor#getVolume()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Volume();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.Processor#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.Processor#getWeight()
	 * @see #getProcessor()
	 * @generated
	 */
    EAttribute getProcessor_Weight();

    /**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.Fan <em>Fan</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fan</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.Fan
	 * @generated
	 */
    EClass getFan();

    /**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.Fan#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.Fan#getSpeed()
	 * @see #getFan()
	 * @generated
	 */
    EAttribute getFan_Speed();

    /**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.Fan#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.Fan#getWeight()
	 * @see #getFan()
	 * @generated
	 */
    EAttribute getFan_Weight();

    /**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.Physical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.Physical
	 * @generated
	 */
    EClass getPhysical();

    /**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.CompositeProcessor <em>Composite Processor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Processor</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.CompositeProcessor
	 * @generated
	 */
    EClass getCompositeProcessor();

    /**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.designer.sample.flow.DataFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.DataFlow#getTarget()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Target();

	/**
	 * Returns the meta object for the container reference '{@link fr.obeo.dsl.designer.sample.flow.DataFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.DataFlow#getSource()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Source();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.CapacityBound <em>Capacity Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capacity Bound</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.CapacityBound
	 * @generated
	 */
	EClass getCapacityBound();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.CapacityBound#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.CapacityBound#getCapacity()
	 * @see #getCapacityBound()
	 * @generated
	 */
	EAttribute getCapacityBound_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.CapacityBound#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.CapacityBound#getLoad()
	 * @see #getCapacityBound()
	 * @generated
	 */
	EAttribute getCapacityBound_Load();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.designer.sample.flow.System#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.System#getElements()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Elements();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.System#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.System#getTemperature()
	 * @see #getSystem()
	 * @generated
	 */
    EAttribute getSystem_Temperature();

    /**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.System#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.System#getWeight()
	 * @see #getSystem()
	 * @generated
	 */
    EAttribute getSystem_Weight();

    /**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.designer.sample.flow.System#getPowerOutputs <em>Power Outputs</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Outputs</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.System#getPowerOutputs()
	 * @see #getSystem()
	 * @generated
	 */
    EReference getSystem_PowerOutputs();

    /**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.designer.sample.flow.System#getPowerInputs <em>Power Inputs</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Inputs</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.System#getPowerInputs()
	 * @see #getSystem()
	 * @generated
	 */
    EReference getSystem_PowerInputs();

    /**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.System#getRoutingRules <em>Routing Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Rules</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.System#getRoutingRules()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_RoutingRules();

				/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.PowerOutput <em>Power Output</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Output</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.PowerOutput
	 * @generated
	 */
    EClass getPowerOutput();

    /**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.PowerOutput#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.PowerOutput#getPower()
	 * @see #getPowerOutput()
	 * @generated
	 */
    EAttribute getPowerOutput_Power();

    /**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.designer.sample.flow.PowerOutput#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.PowerOutput#getLinks()
	 * @see #getPowerOutput()
	 * @generated
	 */
    EReference getPowerOutput_Links();

    /**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.Powered <em>Powered</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Powered</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.Powered
	 * @generated
	 */
    EClass getPowered();

    /**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.Powered#getConsumption <em>Consumption</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumption</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.Powered#getConsumption()
	 * @see #getPowered()
	 * @generated
	 */
    EAttribute getPowered_Consumption();

    /**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.Powered#getPowerStatus <em>Power Status</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Status</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.Powered#getPowerStatus()
	 * @see #getPowered()
	 * @generated
	 */
    EAttribute getPowered_PowerStatus();

    /**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.PowerInput <em>Power Input</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Input</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.PowerInput
	 * @generated
	 */
    EClass getPowerInput();

    /**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.PowerLink <em>Power Link</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Link</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.PowerLink
	 * @generated
	 */
    EClass getPowerLink();

    /**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.designer.sample.flow.PowerLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.PowerLink#getTarget()
	 * @see #getPowerLink()
	 * @generated
	 */
    EReference getPowerLink_Target();

    /**
	 * Returns the meta object for the container reference '{@link fr.obeo.dsl.designer.sample.flow.PowerLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.PowerLink#getSource()
	 * @see #getPowerLink()
	 * @generated
	 */
    EReference getPowerLink_Source();

    /**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.FlowSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowSource
	 * @generated
	 */
	EClass getFlowSource();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.designer.sample.flow.FlowSource#getOutgoingFlows <em>Outgoing Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Flows</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowSource#getOutgoingFlows()
	 * @see #getFlowSource()
	 * @generated
	 */
	EReference getFlowSource_OutgoingFlows();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.FlowTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowTarget
	 * @generated
	 */
	EClass getFlowTarget();

	/**
	 * Returns the meta object for the reference list '{@link fr.obeo.dsl.designer.sample.flow.FlowTarget#getIncomingFlows <em>Incoming Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Flows</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowTarget#getIncomingFlows()
	 * @see #getFlowTarget()
	 * @generated
	 */
	EReference getFlowTarget_IncomingFlows();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.DataSource#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.DataSource#getVolume()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Volume();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.FlowElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowElement
	 * @generated
	 */
	EClass getFlowElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.FlowElement#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowElement#getStatus()
	 * @see #getFlowElement()
	 * @generated
	 */
	EAttribute getFlowElement_Status();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.FlowElement#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowElement#getUsage()
	 * @see #getFlowElement()
	 * @generated
	 */
	EAttribute getFlowElement_Usage();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.designer.sample.flow.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.designer.sample.flow.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.dsl.designer.sample.flow.PoweredStatus <em>Powered Status</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Powered Status</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.PoweredStatus
	 * @generated
	 */
    EEnum getPoweredStatus();

    /**
	 * Returns the meta object for enum '{@link fr.obeo.dsl.designer.sample.flow.FlowElementStatus <em>Element Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Status</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowElementStatus
	 * @generated
	 */
	EEnum getFlowElementStatus();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.dsl.designer.sample.flow.FlowElementUsage <em>Element Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Usage</em>'.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowElementUsage
	 * @generated
	 */
	EEnum getFlowElementUsage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowFactory getFlowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.ProcessorImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__VOLUME = eINSTANCE.getProcessor_Volume();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PROCESSOR__WEIGHT = eINSTANCE.getProcessor_Weight();

        /**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.FanImpl <em>Fan</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FanImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getFan()
		 * @generated
		 */
        EClass FAN = eINSTANCE.getFan();

        /**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute FAN__SPEED = eINSTANCE.getFan_Speed();

        /**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute FAN__WEIGHT = eINSTANCE.getFan_Weight();

        /**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.PhysicalImpl <em>Physical</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.PhysicalImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getPhysical()
		 * @generated
		 */
        EClass PHYSICAL = eINSTANCE.getPhysical();

        /**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.CompositeProcessorImpl <em>Composite Processor</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.CompositeProcessorImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getCompositeProcessor()
		 * @generated
		 */
        EClass COMPOSITE_PROCESSOR = eINSTANCE.getCompositeProcessor();

        /**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.DataFlowImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__TARGET = eINSTANCE.getDataFlow_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__SOURCE = eINSTANCE.getDataFlow_Source();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.CapacityBoundImpl <em>Capacity Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.CapacityBoundImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getCapacityBound()
		 * @generated
		 */
		EClass CAPACITY_BOUND = eINSTANCE.getCapacityBound();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY_BOUND__CAPACITY = eINSTANCE.getCapacityBound_Capacity();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY_BOUND__LOAD = eINSTANCE.getCapacityBound_Load();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.SystemImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ELEMENTS = eINSTANCE.getSystem_Elements();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SYSTEM__TEMPERATURE = eINSTANCE.getSystem_Temperature();

        /**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SYSTEM__WEIGHT = eINSTANCE.getSystem_Weight();

        /**
		 * The meta object literal for the '<em><b>Power Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SYSTEM__POWER_OUTPUTS = eINSTANCE.getSystem_PowerOutputs();

        /**
		 * The meta object literal for the '<em><b>Power Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SYSTEM__POWER_INPUTS = eINSTANCE.getSystem_PowerInputs();

        /**
		 * The meta object literal for the '<em><b>Routing Rules</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__ROUTING_RULES = eINSTANCE.getSystem_RoutingRules();

								/**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.PowerOutputImpl <em>Power Output</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.PowerOutputImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getPowerOutput()
		 * @generated
		 */
        EClass POWER_OUTPUT = eINSTANCE.getPowerOutput();

        /**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute POWER_OUTPUT__POWER = eINSTANCE.getPowerOutput_Power();

        /**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference POWER_OUTPUT__LINKS = eINSTANCE.getPowerOutput_Links();

        /**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.PoweredImpl <em>Powered</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.PoweredImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getPowered()
		 * @generated
		 */
        EClass POWERED = eINSTANCE.getPowered();

        /**
		 * The meta object literal for the '<em><b>Consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute POWERED__CONSUMPTION = eINSTANCE.getPowered_Consumption();

        /**
		 * The meta object literal for the '<em><b>Power Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute POWERED__POWER_STATUS = eINSTANCE.getPowered_PowerStatus();

        /**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.PowerInputImpl <em>Power Input</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.PowerInputImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getPowerInput()
		 * @generated
		 */
        EClass POWER_INPUT = eINSTANCE.getPowerInput();

        /**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.PowerLinkImpl <em>Power Link</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.PowerLinkImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getPowerLink()
		 * @generated
		 */
        EClass POWER_LINK = eINSTANCE.getPowerLink();

        /**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference POWER_LINK__TARGET = eINSTANCE.getPowerLink_Target();

        /**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference POWER_LINK__SOURCE = eINSTANCE.getPowerLink_Source();

        /**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.FlowSourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowSourceImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getFlowSource()
		 * @generated
		 */
		EClass FLOW_SOURCE = eINSTANCE.getFlowSource();

		/**
		 * The meta object literal for the '<em><b>Outgoing Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SOURCE__OUTGOING_FLOWS = eINSTANCE.getFlowSource_OutgoingFlows();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.FlowTargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowTargetImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getFlowTarget()
		 * @generated
		 */
		EClass FLOW_TARGET = eINSTANCE.getFlowTarget();

		/**
		 * The meta object literal for the '<em><b>Incoming Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_TARGET__INCOMING_FLOWS = eINSTANCE.getFlowTarget_IncomingFlows();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.DataSourceImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__VOLUME = eINSTANCE.getDataSource_Volume();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.FlowElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowElementImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getFlowElement()
		 * @generated
		 */
		EClass FLOW_ELEMENT = eINSTANCE.getFlowElement();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ELEMENT__STATUS = eINSTANCE.getFlowElement_Status();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ELEMENT__USAGE = eINSTANCE.getFlowElement_Usage();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.impl.NamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.impl.NamedImpl
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.PoweredStatus <em>Powered Status</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.PoweredStatus
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getPoweredStatus()
		 * @generated
		 */
        EEnum POWERED_STATUS = eINSTANCE.getPoweredStatus();

        /**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.FlowElementStatus <em>Element Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.FlowElementStatus
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getFlowElementStatus()
		 * @generated
		 */
		EEnum FLOW_ELEMENT_STATUS = eINSTANCE.getFlowElementStatus();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.designer.sample.flow.FlowElementUsage <em>Element Usage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.designer.sample.flow.FlowElementUsage
		 * @see fr.obeo.dsl.designer.sample.flow.impl.FlowPackageImpl#getFlowElementUsage()
		 * @generated
		 */
		EEnum FLOW_ELEMENT_USAGE = eINSTANCE.getFlowElementUsage();

	}

} //FlowPackage
