/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.owl.owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Some Values From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.DataSomeValuesFrom#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 *   <li>{@link org.omg.sysml.owl.owl.DataSomeValuesFrom#getDataRange <em>Data Range</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.owl.owl.OwlPackage#getDataSomeValuesFrom()
 * @model
 * @generated
 */
public interface DataSomeValuesFrom extends ClassExpression
{
  /**
   * Returns the value of the '<em><b>Data Property Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.sysml.owl.owl.DataPropertyExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Property Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Property Expressions</em>' containment reference list.
   * @see org.omg.sysml.owl.owl.OwlPackage#getDataSomeValuesFrom_DataPropertyExpressions()
   * @model containment="true"
   * @generated
   */
  EList<DataPropertyExpression> getDataPropertyExpressions();

  /**
   * Returns the value of the '<em><b>Data Range</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.sysml.owl.owl.DataRange}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Range</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Range</em>' containment reference list.
   * @see org.omg.sysml.owl.owl.OwlPackage#getDataSomeValuesFrom_DataRange()
   * @model containment="true"
   * @generated
   */
  EList<DataRange> getDataRange();

} // DataSomeValuesFrom
