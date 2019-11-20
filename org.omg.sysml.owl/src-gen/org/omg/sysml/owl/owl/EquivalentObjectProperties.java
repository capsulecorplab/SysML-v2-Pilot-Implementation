/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.sysml.owl.owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Object Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.EquivalentObjectProperties#getObjectPropertyExpressions <em>Object Property Expressions</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.owl.owl.OwlPackage#getEquivalentObjectProperties()
 * @model
 * @generated
 */
public interface EquivalentObjectProperties extends ObjectPropertyAxiom
{
  /**
   * Returns the value of the '<em><b>Object Property Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.sysml.owl.owl.ObjectPropertyExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Expressions</em>' containment reference list.
   * @see org.omg.sysml.owl.owl.OwlPackage#getEquivalentObjectProperties_ObjectPropertyExpressions()
   * @model containment="true"
   * @generated
   */
  EList<ObjectPropertyExpression> getObjectPropertyExpressions();

} // EquivalentObjectProperties
