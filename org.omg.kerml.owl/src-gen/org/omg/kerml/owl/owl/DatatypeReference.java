/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.owl.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.kerml.owl.owl.DatatypeReference#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see org.omg.kerml.owl.owl.OwlPackage#getDatatypeReference()
 * @model
 * @generated
 */
public interface DatatypeReference extends DataRange
{
  /**
   * Returns the value of the '<em><b>Datatype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype</em>' attribute.
   * @see #setDatatype(String)
   * @see org.omg.kerml.owl.owl.OwlPackage#getDatatypeReference_Datatype()
   * @model
   * @generated
   */
  String getDatatype();

  /**
   * Sets the value of the '{@link org.omg.kerml.owl.owl.DatatypeReference#getDatatype <em>Datatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' attribute.
   * @see #getDatatype()
   * @generated
   */
  void setDatatype(String value);

} // DatatypeReference
