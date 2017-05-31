/**
 * generated by Xtext 2.12.0
 */
package fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temperature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.Temperature#getValue <em>Value</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.Temperature#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage#getTemperature()
 * @model
 * @generated
 */
public interface Temperature extends ObjectAccessOrValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage#getTemperature_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.Temperature#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * The literals are from the enumeration {@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.TemperatureUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.TemperatureUnit
   * @see #setUnit(TemperatureUnit)
   * @see fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage#getTemperature_Unit()
   * @model
   * @generated
   */
  TemperatureUnit getUnit();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.Temperature#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.TemperatureUnit
   * @see #getUnit()
   * @generated
   */
  void setUnit(TemperatureUnit value);

} // Temperature
