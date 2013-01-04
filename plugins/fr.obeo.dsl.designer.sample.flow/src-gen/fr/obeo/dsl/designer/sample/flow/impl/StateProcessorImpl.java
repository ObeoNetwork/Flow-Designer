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
import fr.obeo.dsl.designer.sample.flow.ComputationResult;
import fr.obeo.dsl.designer.sample.flow.Event;
import fr.obeo.dsl.designer.sample.flow.FlowPackage;
import fr.obeo.dsl.designer.sample.flow.Operation;
import fr.obeo.dsl.designer.sample.flow.State;
import fr.obeo.dsl.designer.sample.flow.StateProcessor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.StateProcessorImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.StateProcessorImpl#getStates <em>States</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.StateProcessorImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.StateProcessorImpl#getFirst <em>First</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.StateProcessorImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.impl.StateProcessorImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateProcessorImpl extends ProcessorImpl implements StateProcessor {
	/**
     * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOutputs()
     * @generated
     * @ordered
     */
	protected EList<ComputationResult> outputs;

	/**
     * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStates()
     * @generated
     * @ordered
     */
	protected EList<State> states;

	/**
     * The cached value of the '{@link #getCurrent() <em>Current</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCurrent()
     * @generated
     * @ordered
     */
	protected State current;

	/**
     * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFirst()
     * @generated
     * @ordered
     */
	protected State first;

	/**
     * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEvents()
     * @generated
     * @ordered
     */
	protected EList<Event> events;

	/**
     * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOperations()
     * @generated
     * @ordered
     */
	protected EList<Operation> operations;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected StateProcessorImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return FlowPackage.Literals.STATE_PROCESSOR;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ComputationResult> getOutputs() {
        if (outputs == null) {
            outputs = new EObjectContainmentEList<ComputationResult>(ComputationResult.class, this, FlowPackage.STATE_PROCESSOR__OUTPUTS);
        }
        return outputs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<State> getStates() {
        if (states == null) {
            states = new EObjectContainmentEList<State>(State.class, this, FlowPackage.STATE_PROCESSOR__STATES);
        }
        return states;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public State getCurrent() {
        if (current != null && current.eIsProxy()) {
            InternalEObject oldCurrent = (InternalEObject)current;
            current = (State)eResolveProxy(oldCurrent);
            if (current != oldCurrent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.STATE_PROCESSOR__CURRENT, oldCurrent, current));
            }
        }
        return current;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public State basicGetCurrent() {
        return current;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCurrent(State newCurrent) {
        State oldCurrent = current;
        current = newCurrent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.STATE_PROCESSOR__CURRENT, oldCurrent, current));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public State getFirst() {
        if (first != null && first.eIsProxy()) {
            InternalEObject oldFirst = (InternalEObject)first;
            first = (State)eResolveProxy(oldFirst);
            if (first != oldFirst) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.STATE_PROCESSOR__FIRST, oldFirst, first));
            }
        }
        return first;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public State basicGetFirst() {
        return first;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFirst(State newFirst) {
        State oldFirst = first;
        first = newFirst;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.STATE_PROCESSOR__FIRST, oldFirst, first));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Event> getEvents() {
        if (events == null) {
            events = new EObjectContainmentEList<Event>(Event.class, this, FlowPackage.STATE_PROCESSOR__EVENTS);
        }
        return events;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Operation> getOperations() {
        if (operations == null) {
            operations = new EObjectContainmentEList<Operation>(Operation.class, this, FlowPackage.STATE_PROCESSOR__OPERATIONS);
        }
        return operations;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FlowPackage.STATE_PROCESSOR__OUTPUTS:
                return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
            case FlowPackage.STATE_PROCESSOR__STATES:
                return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
            case FlowPackage.STATE_PROCESSOR__EVENTS:
                return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
            case FlowPackage.STATE_PROCESSOR__OPERATIONS:
                return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
            case FlowPackage.STATE_PROCESSOR__OUTPUTS:
                return getOutputs();
            case FlowPackage.STATE_PROCESSOR__STATES:
                return getStates();
            case FlowPackage.STATE_PROCESSOR__CURRENT:
                if (resolve) return getCurrent();
                return basicGetCurrent();
            case FlowPackage.STATE_PROCESSOR__FIRST:
                if (resolve) return getFirst();
                return basicGetFirst();
            case FlowPackage.STATE_PROCESSOR__EVENTS:
                return getEvents();
            case FlowPackage.STATE_PROCESSOR__OPERATIONS:
                return getOperations();
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
            case FlowPackage.STATE_PROCESSOR__OUTPUTS:
                getOutputs().clear();
                getOutputs().addAll((Collection<? extends ComputationResult>)newValue);
                return;
            case FlowPackage.STATE_PROCESSOR__STATES:
                getStates().clear();
                getStates().addAll((Collection<? extends State>)newValue);
                return;
            case FlowPackage.STATE_PROCESSOR__CURRENT:
                setCurrent((State)newValue);
                return;
            case FlowPackage.STATE_PROCESSOR__FIRST:
                setFirst((State)newValue);
                return;
            case FlowPackage.STATE_PROCESSOR__EVENTS:
                getEvents().clear();
                getEvents().addAll((Collection<? extends Event>)newValue);
                return;
            case FlowPackage.STATE_PROCESSOR__OPERATIONS:
                getOperations().clear();
                getOperations().addAll((Collection<? extends Operation>)newValue);
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
            case FlowPackage.STATE_PROCESSOR__OUTPUTS:
                getOutputs().clear();
                return;
            case FlowPackage.STATE_PROCESSOR__STATES:
                getStates().clear();
                return;
            case FlowPackage.STATE_PROCESSOR__CURRENT:
                setCurrent((State)null);
                return;
            case FlowPackage.STATE_PROCESSOR__FIRST:
                setFirst((State)null);
                return;
            case FlowPackage.STATE_PROCESSOR__EVENTS:
                getEvents().clear();
                return;
            case FlowPackage.STATE_PROCESSOR__OPERATIONS:
                getOperations().clear();
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
            case FlowPackage.STATE_PROCESSOR__OUTPUTS:
                return outputs != null && !outputs.isEmpty();
            case FlowPackage.STATE_PROCESSOR__STATES:
                return states != null && !states.isEmpty();
            case FlowPackage.STATE_PROCESSOR__CURRENT:
                return current != null;
            case FlowPackage.STATE_PROCESSOR__FIRST:
                return first != null;
            case FlowPackage.STATE_PROCESSOR__EVENTS:
                return events != null && !events.isEmpty();
            case FlowPackage.STATE_PROCESSOR__OPERATIONS:
                return operations != null && !operations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //StateProcessorImpl
