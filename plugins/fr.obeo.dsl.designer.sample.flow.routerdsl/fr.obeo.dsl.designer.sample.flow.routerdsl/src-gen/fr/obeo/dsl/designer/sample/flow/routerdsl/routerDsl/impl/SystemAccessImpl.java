/**
 * generated by Xtext 2.12.0
 */
package fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.impl;

import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage;
import fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.SystemAccess;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.impl.SystemAccessImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemAccessImpl extends ObjectAccessImpl implements SystemAccess
{
  /**
   * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystem()
   * @generated
   * @ordered
   */
  protected fr.obeo.dsl.designer.sample.flow.System system;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemAccessImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RouterDslPackage.Literals.SYSTEM_ACCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.obeo.dsl.designer.sample.flow.System getSystem()
  {
    if (system != null && system.eIsProxy())
    {
      InternalEObject oldSystem = (InternalEObject)system;
      system = (fr.obeo.dsl.designer.sample.flow.System)eResolveProxy(oldSystem);
      if (system != oldSystem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RouterDslPackage.SYSTEM_ACCESS__SYSTEM, oldSystem, system));
      }
    }
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.obeo.dsl.designer.sample.flow.System basicGetSystem()
  {
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystem(fr.obeo.dsl.designer.sample.flow.System newSystem)
  {
    fr.obeo.dsl.designer.sample.flow.System oldSystem = system;
    system = newSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RouterDslPackage.SYSTEM_ACCESS__SYSTEM, oldSystem, system));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RouterDslPackage.SYSTEM_ACCESS__SYSTEM:
        if (resolve) return getSystem();
        return basicGetSystem();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RouterDslPackage.SYSTEM_ACCESS__SYSTEM:
        setSystem((fr.obeo.dsl.designer.sample.flow.System)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RouterDslPackage.SYSTEM_ACCESS__SYSTEM:
        setSystem((fr.obeo.dsl.designer.sample.flow.System)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RouterDslPackage.SYSTEM_ACCESS__SYSTEM:
        return system != null;
    }
    return super.eIsSet(featureID);
  }

} //SystemAccessImpl
