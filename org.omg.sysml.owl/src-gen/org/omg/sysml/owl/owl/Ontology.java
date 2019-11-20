/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.sysml.owl.owl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.Ontology#getOntologyIRI <em>Ontology IRI</em>}</li>
 *   <li>{@link org.omg.sysml.owl.owl.Ontology#getVersionIRI <em>Version IRI</em>}</li>
 *   <li>{@link org.omg.sysml.owl.owl.Ontology#getDirectlyImportsDocuments <em>Directly Imports Documents</em>}</li>
 *   <li>{@link org.omg.sysml.owl.owl.Ontology#getOntologyAnnotations <em>Ontology Annotations</em>}</li>
 *   <li>{@link org.omg.sysml.owl.owl.Ontology#getAxioms <em>Axioms</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.owl.owl.OwlPackage#getOntology()
 * @model
 * @generated
 */
public interface Ontology extends EObject
{
  /**
   * Returns the value of the '<em><b>Ontology IRI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ontology IRI</em>' attribute.
   * @see #setOntologyIRI(String)
   * @see org.omg.sysml.owl.owl.OwlPackage#getOntology_OntologyIRI()
   * @model
   * @generated
   */
  String getOntologyIRI();

  /**
   * Sets the value of the '{@link org.omg.sysml.owl.owl.Ontology#getOntologyIRI <em>Ontology IRI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ontology IRI</em>' attribute.
   * @see #getOntologyIRI()
   * @generated
   */
  void setOntologyIRI(String value);

  /**
   * Returns the value of the '<em><b>Version IRI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version IRI</em>' attribute.
   * @see #setVersionIRI(String)
   * @see org.omg.sysml.owl.owl.OwlPackage#getOntology_VersionIRI()
   * @model
   * @generated
   */
  String getVersionIRI();

  /**
   * Sets the value of the '{@link org.omg.sysml.owl.owl.Ontology#getVersionIRI <em>Version IRI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version IRI</em>' attribute.
   * @see #getVersionIRI()
   * @generated
   */
  void setVersionIRI(String value);

  /**
   * Returns the value of the '<em><b>Directly Imports Documents</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directly Imports Documents</em>' attribute list.
   * @see org.omg.sysml.owl.owl.OwlPackage#getOntology_DirectlyImportsDocuments()
   * @model unique="false"
   * @generated
   */
  EList<String> getDirectlyImportsDocuments();

  /**
   * Returns the value of the '<em><b>Ontology Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.sysml.owl.owl.Annotation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ontology Annotations</em>' containment reference list.
   * @see org.omg.sysml.owl.owl.OwlPackage#getOntology_OntologyAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getOntologyAnnotations();

  /**
   * Returns the value of the '<em><b>Axioms</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.sysml.owl.owl.Axiom}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axioms</em>' containment reference list.
   * @see org.omg.sysml.owl.owl.OwlPackage#getOntology_Axioms()
   * @model containment="true"
   * @generated
   */
  EList<Axiom> getAxioms();

} // Ontology
