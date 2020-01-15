/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.owl.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.kerml.owl.owl.DataPropertyReference#getDataProperty <em>Data Property</em>}</li>
 * </ul>
 *
 * @see org.omg.kerml.owl.owl.OwlPackage#getDataPropertyReference()
 * @model
 * @generated
 */
public interface DataPropertyReference extends DataPropertyExpression
{
  /**
   * Returns the value of the '<em><b>Data Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Property</em>' attribute.
   * @see #setDataProperty(String)
   * @see org.omg.kerml.owl.owl.OwlPackage#getDataPropertyReference_DataProperty()
   * @model
   * @generated
   */
  String getDataProperty();

  /**
   * Sets the value of the '{@link org.omg.kerml.owl.owl.DataPropertyReference#getDataProperty <em>Data Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Property</em>' attribute.
   * @see #getDataProperty()
   * @generated
   */
  void setDataProperty(String value);

} // DataPropertyReference