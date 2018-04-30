/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.owl.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negative Object Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.NegativeObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 *   <li>{@link org.omg.sysml.owl.owl.NegativeObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link org.omg.sysml.owl.owl.NegativeObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.owl.owl.OwlPackage#getNegativeObjectPropertyAssertion()
 * @model
 * @generated
 */
public interface NegativeObjectPropertyAssertion extends Assertion
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
   * @see org.omg.sysml.owl.owl.OwlPackage#getNegativeObjectPropertyAssertion_ObjectPropertyExpression()
   * @model containment="true"
   * @generated
   */
  ObjectPropertyExpression getObjectPropertyExpression();

  /**
   * Sets the value of the '{@link org.omg.sysml.owl.owl.NegativeObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property Expression</em>' containment reference.
   * @see #getObjectPropertyExpression()
   * @generated
   */
  void setObjectPropertyExpression(ObjectPropertyExpression value);

  /**
   * Returns the value of the '<em><b>Source Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Individual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Individual</em>' containment reference.
   * @see #setSourceIndividual(IndividualReference)
   * @see org.omg.sysml.owl.owl.OwlPackage#getNegativeObjectPropertyAssertion_SourceIndividual()
   * @model containment="true"
   * @generated
   */
  IndividualReference getSourceIndividual();

  /**
   * Sets the value of the '{@link org.omg.sysml.owl.owl.NegativeObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Individual</em>' containment reference.
   * @see #getSourceIndividual()
   * @generated
   */
  void setSourceIndividual(IndividualReference value);

  /**
   * Returns the value of the '<em><b>Target Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Individual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Individual</em>' containment reference.
   * @see #setTargetIndividual(IndividualReference)
   * @see org.omg.sysml.owl.owl.OwlPackage#getNegativeObjectPropertyAssertion_TargetIndividual()
   * @model containment="true"
   * @generated
   */
  IndividualReference getTargetIndividual();

  /**
   * Sets the value of the '{@link org.omg.sysml.owl.owl.NegativeObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Individual</em>' containment reference.
   * @see #getTargetIndividual()
   * @generated
   */
  void setTargetIndividual(IndividualReference value);

} // NegativeObjectPropertyAssertion
