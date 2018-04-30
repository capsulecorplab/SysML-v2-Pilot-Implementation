/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.owl.owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disjoint Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.DisjointClasses#getClassExpression <em>Class Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.owl.owl.OwlPackage#getDisjointClasses()
 * @model
 * @generated
 */
public interface DisjointClasses extends ClassAxiom
{
  /**
   * Returns the value of the '<em><b>Class Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.sysml.owl.owl.ClassExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Expression</em>' containment reference list.
   * @see org.omg.sysml.owl.owl.OwlPackage#getDisjointClasses_ClassExpression()
   * @model containment="true"
   * @generated
   */
  EList<ClassExpression> getClassExpression();

} // DisjointClasses
