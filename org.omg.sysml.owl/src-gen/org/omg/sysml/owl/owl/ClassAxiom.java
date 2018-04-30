/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.owl.owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.ClassAxiom#getAxiomAnnotations <em>Axiom Annotations</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.owl.owl.OwlPackage#getClassAxiom()
 * @model
 * @generated
 */
public interface ClassAxiom extends Axiom
{
  /**
   * Returns the value of the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.sysml.owl.owl.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axiom Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axiom Annotations</em>' containment reference list.
   * @see org.omg.sysml.owl.owl.OwlPackage#getClassAxiom_AxiomAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAxiomAnnotations();

} // ClassAxiom
