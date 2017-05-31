/**
 * generated by Xtext 2.12.0
 */
package fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouteTo#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage#getRouteTo()
 * @model
 * @generated
 */
public interface RouteTo extends Decision
{
  /**
   * Returns the value of the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' reference.
   * @see #setDestination(ProcessorDeclaration)
   * @see fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage#getRouteTo_Destination()
   * @model
   * @generated
   */
  ProcessorDeclaration getDestination();

  /**
   * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouteTo#getDestination <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(ProcessorDeclaration value);

} // RouteTo
