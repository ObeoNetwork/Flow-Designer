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

import fr.obeo.dsl.designer.sample.flow.CapacityBound;
import fr.obeo.dsl.designer.sample.flow.CompositeProcessor;
import fr.obeo.dsl.designer.sample.flow.ComputationResult;
import fr.obeo.dsl.designer.sample.flow.DataFlow;
import fr.obeo.dsl.designer.sample.flow.DataSource;
import fr.obeo.dsl.designer.sample.flow.Event;
import fr.obeo.dsl.designer.sample.flow.Fan;
import fr.obeo.dsl.designer.sample.flow.FlowElement;
import fr.obeo.dsl.designer.sample.flow.FlowPackage;
import fr.obeo.dsl.designer.sample.flow.FlowSource;
import fr.obeo.dsl.designer.sample.flow.FlowTarget;
import fr.obeo.dsl.designer.sample.flow.Operation;
import fr.obeo.dsl.designer.sample.flow.Physical;
import fr.obeo.dsl.designer.sample.flow.PowerInput;
import fr.obeo.dsl.designer.sample.flow.PowerLink;
import fr.obeo.dsl.designer.sample.flow.PowerOutput;
import fr.obeo.dsl.designer.sample.flow.PowerPlug;
import fr.obeo.dsl.designer.sample.flow.PowerSource;
import fr.obeo.dsl.designer.sample.flow.Powered;
import fr.obeo.dsl.designer.sample.flow.Processor;
import fr.obeo.dsl.designer.sample.flow.State;

import fr.obeo.dsl.designer.sample.flow.StateProcessor;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage
 * @generated
 */
public class FlowSwitch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static FlowPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FlowSwitch() {
        if (modelPackage == null) {
            modelPackage = FlowPackage.eINSTANCE;
        }
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case FlowPackage.STATE_PROCESSOR: {
                StateProcessor stateProcessor = (StateProcessor)theEObject;
                T result = caseStateProcessor(stateProcessor);
                if (result == null) result = caseProcessor(stateProcessor);
                if (result == null) result = caseFlowTarget(stateProcessor);
                if (result == null) result = caseCapacityBound(stateProcessor);
                if (result == null) result = caseFlowSource(stateProcessor);
                if (result == null) result = casePowered(stateProcessor);
                if (result == null) result = caseFlowElement(stateProcessor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.PROCESSOR: {
                Processor processor = (Processor)theEObject;
                T result = caseProcessor(processor);
                if (result == null) result = caseFlowTarget(processor);
                if (result == null) result = caseCapacityBound(processor);
                if (result == null) result = caseFlowSource(processor);
                if (result == null) result = casePowered(processor);
                if (result == null) result = caseFlowElement(processor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.FAN: {
                Fan fan = (Fan)theEObject;
                T result = caseFan(fan);
                if (result == null) result = caseFlowElement(fan);
                if (result == null) result = casePowered(fan);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.PHYSICAL: {
                Physical physical = (Physical)theEObject;
                T result = casePhysical(physical);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.COMPOSITE_PROCESSOR: {
                CompositeProcessor compositeProcessor = (CompositeProcessor)theEObject;
                T result = caseCompositeProcessor(compositeProcessor);
                if (result == null) result = caseSystem(compositeProcessor);
                if (result == null) result = caseFlowTarget(compositeProcessor);
                if (result == null) result = caseCapacityBound(compositeProcessor);
                if (result == null) result = caseFlowSource(compositeProcessor);
                if (result == null) result = casePowered(compositeProcessor);
                if (result == null) result = caseFlowElement(compositeProcessor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.DATA_FLOW: {
                DataFlow dataFlow = (DataFlow)theEObject;
                T result = caseDataFlow(dataFlow);
                if (result == null) result = caseCapacityBound(dataFlow);
                if (result == null) result = caseFlowElement(dataFlow);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.CAPACITY_BOUND: {
                CapacityBound capacityBound = (CapacityBound)theEObject;
                T result = caseCapacityBound(capacityBound);
                if (result == null) result = caseFlowElement(capacityBound);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.SYSTEM: {
                fr.obeo.dsl.designer.sample.flow.System system = (fr.obeo.dsl.designer.sample.flow.System)theEObject;
                T result = caseSystem(system);
                if (result == null) result = casePowered(system);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.POWER_OUTPUT: {
                PowerOutput powerOutput = (PowerOutput)theEObject;
                T result = casePowerOutput(powerOutput);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.POWERED: {
                Powered powered = (Powered)theEObject;
                T result = casePowered(powered);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.POWER_INPUT: {
                PowerInput powerInput = (PowerInput)theEObject;
                T result = casePowerInput(powerInput);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.POWER_LINK: {
                PowerLink powerLink = (PowerLink)theEObject;
                T result = casePowerLink(powerLink);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.FLOW_SOURCE: {
                FlowSource flowSource = (FlowSource)theEObject;
                T result = caseFlowSource(flowSource);
                if (result == null) result = caseFlowElement(flowSource);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.FLOW_TARGET: {
                FlowTarget flowTarget = (FlowTarget)theEObject;
                T result = caseFlowTarget(flowTarget);
                if (result == null) result = caseFlowElement(flowTarget);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.DATA_SOURCE: {
                DataSource dataSource = (DataSource)theEObject;
                T result = caseDataSource(dataSource);
                if (result == null) result = caseFlowSource(dataSource);
                if (result == null) result = caseFlowElement(dataSource);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.STATE: {
                State state = (State)theEObject;
                T result = caseState(state);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.COMPUTATION_RESULT: {
                ComputationResult computationResult = (ComputationResult)theEObject;
                T result = caseComputationResult(computationResult);
                if (result == null) result = caseFlowSource(computationResult);
                if (result == null) result = caseFlowElement(computationResult);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.EVENT: {
                Event event = (Event)theEObject;
                T result = caseEvent(event);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.OPERATION: {
                Operation operation = (Operation)theEObject;
                T result = caseOperation(operation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FlowPackage.FLOW_ELEMENT: {
                FlowElement flowElement = (FlowElement)theEObject;
                T result = caseFlowElement(flowElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>State Processor</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>State Processor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseStateProcessor(StateProcessor object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseProcessor(Processor object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Fan</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fan</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFan(Fan object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Physical</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Physical</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhysical(Physical object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Composite Processor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Composite Processor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompositeProcessor(CompositeProcessor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDataFlow(DataFlow object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Capacity Bound</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Capacity Bound</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCapacityBound(CapacityBound object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>System</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSystem(fr.obeo.dsl.designer.sample.flow.System object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Power Output</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Output</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerOutput(PowerOutput object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Powered</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Powered</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowered(Powered object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Input</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Input</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerInput(PowerInput object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Link</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Link</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerLink(PowerLink object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Source</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFlowSource(FlowSource object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Target</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFlowTarget(FlowTarget object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseDataSource(DataSource object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>State</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseState(State object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Computation Result</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Computation Result</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseComputationResult(ComputationResult object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseEvent(Event object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOperation(Operation object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFlowElement(FlowElement object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
	public T defaultCase(EObject object) {
        return null;
    }

} //FlowSwitch
