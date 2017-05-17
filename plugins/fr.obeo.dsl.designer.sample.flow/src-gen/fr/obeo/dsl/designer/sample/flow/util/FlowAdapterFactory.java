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
package fr.obeo.dsl.designer.sample.flow.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import fr.obeo.dsl.designer.sample.flow.CapacityBound;
import fr.obeo.dsl.designer.sample.flow.CompositeProcessor;
import fr.obeo.dsl.designer.sample.flow.DataFlow;
import fr.obeo.dsl.designer.sample.flow.DataSource;
import fr.obeo.dsl.designer.sample.flow.Fan;
import fr.obeo.dsl.designer.sample.flow.FlowElement;
import fr.obeo.dsl.designer.sample.flow.FlowPackage;
import fr.obeo.dsl.designer.sample.flow.FlowSource;
import fr.obeo.dsl.designer.sample.flow.FlowTarget;
import fr.obeo.dsl.designer.sample.flow.Physical;
import fr.obeo.dsl.designer.sample.flow.PowerInput;
import fr.obeo.dsl.designer.sample.flow.PowerLink;
import fr.obeo.dsl.designer.sample.flow.PowerOutput;
import fr.obeo.dsl.designer.sample.flow.Powered;
import fr.obeo.dsl.designer.sample.flow.Processor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage
 * @generated
 */
public class FlowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FlowPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowSwitch<Adapter> modelSwitch =
		new FlowSwitch<Adapter>() {
			@Override
			public Adapter caseProcessor(Processor object) {
				return createProcessorAdapter();
			}
			@Override
			public Adapter caseFan(Fan object) {
				return createFanAdapter();
			}
			@Override
			public Adapter casePhysical(Physical object) {
				return createPhysicalAdapter();
			}
			@Override
			public Adapter caseCompositeProcessor(CompositeProcessor object) {
				return createCompositeProcessorAdapter();
			}
			@Override
			public Adapter caseDataFlow(DataFlow object) {
				return createDataFlowAdapter();
			}
			@Override
			public Adapter caseCapacityBound(CapacityBound object) {
				return createCapacityBoundAdapter();
			}
			@Override
			public Adapter caseSystem(fr.obeo.dsl.designer.sample.flow.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter casePowerOutput(PowerOutput object) {
				return createPowerOutputAdapter();
			}
			@Override
			public Adapter casePowered(Powered object) {
				return createPoweredAdapter();
			}
			@Override
			public Adapter casePowerInput(PowerInput object) {
				return createPowerInputAdapter();
			}
			@Override
			public Adapter casePowerLink(PowerLink object) {
				return createPowerLinkAdapter();
			}
			@Override
			public Adapter caseFlowSource(FlowSource object) {
				return createFlowSourceAdapter();
			}
			@Override
			public Adapter caseFlowTarget(FlowTarget object) {
				return createFlowTargetAdapter();
			}
			@Override
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter caseFlowElement(FlowElement object) {
				return createFlowElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.Fan <em>Fan</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.Fan
	 * @generated
	 */
    public Adapter createFanAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.Physical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.Physical
	 * @generated
	 */
    public Adapter createPhysicalAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.CompositeProcessor <em>Composite Processor</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.CompositeProcessor
	 * @generated
	 */
    public Adapter createCompositeProcessorAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.CapacityBound <em>Capacity Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.CapacityBound
	 * @generated
	 */
	public Adapter createCapacityBoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.PowerOutput <em>Power Output</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.PowerOutput
	 * @generated
	 */
    public Adapter createPowerOutputAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.Powered <em>Powered</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.Powered
	 * @generated
	 */
    public Adapter createPoweredAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.PowerInput <em>Power Input</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.PowerInput
	 * @generated
	 */
    public Adapter createPowerInputAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.PowerLink <em>Power Link</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.PowerLink
	 * @generated
	 */
    public Adapter createPowerLinkAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.FlowSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowSource
	 * @generated
	 */
	public Adapter createFlowSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.FlowTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowTarget
	 * @generated
	 */
	public Adapter createFlowTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obeo.dsl.designer.sample.flow.FlowElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obeo.dsl.designer.sample.flow.FlowElement
	 * @generated
	 */
	public Adapter createFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FlowAdapterFactory
