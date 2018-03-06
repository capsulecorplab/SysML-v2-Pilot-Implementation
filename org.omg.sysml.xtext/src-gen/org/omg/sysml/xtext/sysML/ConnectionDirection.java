/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.xtext.sysML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.xtext.sysML.ConnectionDirection#getIN <em>IN</em>}</li>
 *   <li>{@link org.omg.sysml.xtext.sysML.ConnectionDirection#getOUT <em>OUT</em>}</li>
 *   <li>{@link org.omg.sysml.xtext.sysML.ConnectionDirection#getINOUT <em>INOUT</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.xtext.sysML.SysMLPackage#getConnectionDirection()
 * @model
 * @generated
 */
public interface ConnectionDirection extends EObject
{
  /**
   * Returns the value of the '<em><b>IN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IN</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IN</em>' attribute.
   * @see #setIN(String)
   * @see org.omg.sysml.xtext.sysML.SysMLPackage#getConnectionDirection_IN()
   * @model
   * @generated
   */
  String getIN();

  /**
   * Sets the value of the '{@link org.omg.sysml.xtext.sysML.ConnectionDirection#getIN <em>IN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IN</em>' attribute.
   * @see #getIN()
   * @generated
   */
  void setIN(String value);

  /**
   * Returns the value of the '<em><b>OUT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>OUT</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>OUT</em>' attribute.
   * @see #setOUT(String)
   * @see org.omg.sysml.xtext.sysML.SysMLPackage#getConnectionDirection_OUT()
   * @model
   * @generated
   */
  String getOUT();

  /**
   * Sets the value of the '{@link org.omg.sysml.xtext.sysML.ConnectionDirection#getOUT <em>OUT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>OUT</em>' attribute.
   * @see #getOUT()
   * @generated
   */
  void setOUT(String value);

  /**
   * Returns the value of the '<em><b>INOUT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>INOUT</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>INOUT</em>' attribute.
   * @see #setINOUT(String)
   * @see org.omg.sysml.xtext.sysML.SysMLPackage#getConnectionDirection_INOUT()
   * @model
   * @generated
   */
  String getINOUT();

  /**
   * Sets the value of the '{@link org.omg.sysml.xtext.sysML.ConnectionDirection#getINOUT <em>INOUT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>INOUT</em>' attribute.
   * @see #getINOUT()
   * @generated
   */
  void setINOUT(String value);

} // ConnectionDirection
