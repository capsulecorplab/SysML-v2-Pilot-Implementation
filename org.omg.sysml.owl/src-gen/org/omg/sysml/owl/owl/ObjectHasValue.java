/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.owl.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Has Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.ObjectHasValue#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 *   <li>{@link org.omg.sysml.owl.owl.ObjectHasValue#getIndividual <em>Individual</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.owl.owl.OwlPackage#getObjectHasValue()
 * @model
 * @generated
 */
public interface ObjectHasValue extends ClassExpression
{
  /**
   * Returns the value of the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Property Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Expression</em>' containment reference.
   * @see #setObjectPropertyExpression(ObjectPropertyExpression)
   * @see org.omg.sysml.owl.owl.OwlPackage#getObjectHasValue_ObjectPropertyExpression()
   * @model containment="true"
   * @generated
   */
  ObjectPropertyExpression getObjectPropertyExpression();

  /**
   * Sets the value of the '{@link org.omg.sysml.owl.owl.ObjectHasValue#getObjectPropertyExpression <em>Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property Expression</em>' containment reference.
   * @see #getObjectPropertyExpression()
   * @generated
   */
  void setObjectPropertyExpression(ObjectPropertyExpression value);

  /**
   * Returns the value of the '<em><b>Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Individual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Individual</em>' containment reference.
   * @see #setIndividual(IndividualReference)
   * @see org.omg.sysml.owl.owl.OwlPackage#getObjectHasValue_Individual()
   * @model containment="true"
   * @generated
   */
  IndividualReference getIndividual();

  /**
   * Sets the value of the '{@link org.omg.sysml.owl.owl.ObjectHasValue#getIndividual <em>Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Individual</em>' containment reference.
   * @see #getIndividual()
   * @generated
   */
  void setIndividual(IndividualReference value);

} // ObjectHasValue
