/**
 * generated by Xtext 2.12.0
 */
package fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage#getTimeUnit()
 * @model
 * @generated
 */
public enum TimeUnit implements Enumerator
{
  /**
   * The '<em><b>Seconds</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SECONDS_VALUE
   * @generated
   * @ordered
   */
  SECONDS(0, "seconds", "sec"),

  /**
   * The '<em><b>Milliseconds</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MILLISECONDS_VALUE
   * @generated
   * @ordered
   */
  MILLISECONDS(1, "milliseconds", "msec"),

  /**
   * The '<em><b>Microseconds</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MICROSECONDS_VALUE
   * @generated
   * @ordered
   */
  MICROSECONDS(2, "microseconds", "usec");

  /**
   * The '<em><b>Seconds</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Seconds</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SECONDS
   * @model name="seconds" literal="sec"
   * @generated
   * @ordered
   */
  public static final int SECONDS_VALUE = 0;

  /**
   * The '<em><b>Milliseconds</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Milliseconds</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MILLISECONDS
   * @model name="milliseconds" literal="msec"
   * @generated
   * @ordered
   */
  public static final int MILLISECONDS_VALUE = 1;

  /**
   * The '<em><b>Microseconds</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Microseconds</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MICROSECONDS
   * @model name="microseconds" literal="usec"
   * @generated
   * @ordered
   */
  public static final int MICROSECONDS_VALUE = 2;

  /**
   * An array of all the '<em><b>Time Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TimeUnit[] VALUES_ARRAY =
    new TimeUnit[]
    {
      SECONDS,
      MILLISECONDS,
      MICROSECONDS,
    };

  /**
   * A public read-only list of all the '<em><b>Time Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TimeUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Time Unit</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TimeUnit get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TimeUnit result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Time Unit</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TimeUnit getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TimeUnit result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Time Unit</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TimeUnit get(int value)
  {
    switch (value)
    {
      case SECONDS_VALUE: return SECONDS;
      case MILLISECONDS_VALUE: return MILLISECONDS;
      case MICROSECONDS_VALUE: return MICROSECONDS;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private TimeUnit(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //TimeUnit
