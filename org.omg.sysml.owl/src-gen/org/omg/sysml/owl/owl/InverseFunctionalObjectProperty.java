/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.sysml.owl.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inverse Functional Object Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.InverseFunctionalObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.owl.owl.OwlPackage#getInverseFunctionalObjectProperty()
 * @model
 * @generated
 */
public interface InverseFunctionalObjectProperty extends ObjectPropertyAxiom
{
  /**
   * Returns the value of the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Expression</em>' containment reference.
   * @see #setObjectPropertyExpression(ObjectPropertyExpression)
   * @see org.omg.sysml.owl.owl.OwlPackage#getInverseFunctionalObjectProperty_ObjectPropertyExpression()
   * @model containment="true"
   * @generated
   */
  ObjectPropertyExpression getObjectPropertyExpression();

  /**
   * Sets the value of the '{@link org.omg.sysml.owl.owl.InverseFunctionalObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property Expression</em>' containment reference.
   * @see #getObjectPropertyExpression()
   * @generated
   */
  void setObjectPropertyExpression(ObjectPropertyExpression value);

} // InverseFunctionalObjectProperty
