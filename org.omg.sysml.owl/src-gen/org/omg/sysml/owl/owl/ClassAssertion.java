/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.owl.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.ClassAssertion#getClassExpression <em>Class Expression</em>}</li>
 *   <li>{@link org.omg.sysml.owl.owl.ClassAssertion#getIndividual <em>Individual</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.owl.owl.OwlPackage#getClassAssertion()
 * @model
 * @generated
 */
public interface ClassAssertion extends Assertion
{
  /**
   * Returns the value of the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Expression</em>' containment reference.
   * @see #setClassExpression(ClassExpression)
   * @see org.omg.sysml.owl.owl.OwlPackage#getClassAssertion_ClassExpression()
   * @model containment="true"
   * @generated
   */
  ClassExpression getClassExpression();

  /**
   * Sets the value of the '{@link org.omg.sysml.owl.owl.ClassAssertion#getClassExpression <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Expression</em>' containment reference.
   * @see #getClassExpression()
   * @generated
   */
  void setClassExpression(ClassExpression value);

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
   * @see org.omg.sysml.owl.owl.OwlPackage#getClassAssertion_Individual()
   * @model containment="true"
   * @generated
   */
  IndividualReference getIndividual();

  /**
   * Sets the value of the '{@link org.omg.sysml.owl.owl.ClassAssertion#getIndividual <em>Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Individual</em>' containment reference.
   * @see #getIndividual()
   * @generated
   */
  void setIndividual(IndividualReference value);

} // ClassAssertion
