/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.xtext.sysML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upper Bound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.xtext.sysML.UpperBound#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.sysml.xtext.sysML.UpperBound#getVar <em>Var</em>}</li>
 *   <li>{@link org.omg.sysml.xtext.sysML.UpperBound#isUnbounded <em>Unbounded</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.xtext.sysML.SysMLPackage#getUpperBound()
 * @model
 * @generated
 */
public interface UpperBound extends EObject
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
   * @see org.omg.sysml.xtext.sysML.SysMLPackage#getUpperBound_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.omg.sysml.xtext.sysML.UpperBound#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(String)
   * @see org.omg.sysml.xtext.sysML.SysMLPackage#getUpperBound_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link org.omg.sysml.xtext.sysML.UpperBound#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

  /**
   * Returns the value of the '<em><b>Unbounded</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unbounded</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unbounded</em>' attribute.
   * @see #setUnbounded(boolean)
   * @see org.omg.sysml.xtext.sysML.SysMLPackage#getUpperBound_Unbounded()
   * @model
   * @generated
   */
  boolean isUnbounded();

  /**
   * Sets the value of the '{@link org.omg.sysml.xtext.sysML.UpperBound#isUnbounded <em>Unbounded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unbounded</em>' attribute.
   * @see #isUnbounded()
   * @generated
   */
  void setUnbounded(boolean value);

} // UpperBound
