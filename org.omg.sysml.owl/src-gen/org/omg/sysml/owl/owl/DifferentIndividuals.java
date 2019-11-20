/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.sysml.owl.owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Different Individuals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.DifferentIndividuals#getIndividuals <em>Individuals</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.owl.owl.OwlPackage#getDifferentIndividuals()
 * @model
 * @generated
 */
public interface DifferentIndividuals extends Assertion
{
  /**
   * Returns the value of the '<em><b>Individuals</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.sysml.owl.owl.IndividualReference}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Individuals</em>' containment reference list.
   * @see org.omg.sysml.owl.owl.OwlPackage#getDifferentIndividuals_Individuals()
   * @model containment="true"
   * @generated
   */
  EList<IndividualReference> getIndividuals();

} // DifferentIndividuals
