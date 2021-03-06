/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.owl.owl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.kerml.owl.owl.OwlPackage
 * @generated
 */
public interface OwlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OwlFactory eINSTANCE = org.omg.kerml.owl.owl.impl.OwlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Ontology File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ontology File</em>'.
   * @generated
   */
  OntologyFile createOntologyFile();

  /**
   * Returns a new object of class '<em>Ontology Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ontology Document</em>'.
   * @generated
   */
  OntologyDocument createOntologyDocument();

  /**
   * Returns a new object of class '<em>Prefix Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix Declaration</em>'.
   * @generated
   */
  PrefixDeclaration createPrefixDeclaration();

  /**
   * Returns a new object of class '<em>Ontology</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ontology</em>'.
   * @generated
   */
  Ontology createOntology();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  Class createClass();

  /**
   * Returns a new object of class '<em>Datatype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datatype</em>'.
   * @generated
   */
  Datatype createDatatype();

  /**
   * Returns a new object of class '<em>Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property</em>'.
   * @generated
   */
  ObjectProperty createObjectProperty();

  /**
   * Returns a new object of class '<em>Data Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property</em>'.
   * @generated
   */
  DataProperty createDataProperty();

  /**
   * Returns a new object of class '<em>Annotation Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Property</em>'.
   * @generated
   */
  AnnotationProperty createAnnotationProperty();

  /**
   * Returns a new object of class '<em>Individual</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Individual</em>'.
   * @generated
   */
  Individual createIndividual();

  /**
   * Returns a new object of class '<em>Named Individual</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Individual</em>'.
   * @generated
   */
  NamedIndividual createNamedIndividual();

  /**
   * Returns a new object of class '<em>Anonymous Individual</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anonymous Individual</em>'.
   * @generated
   */
  AnonymousIndividual createAnonymousIndividual();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Typed Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typed Literal</em>'.
   * @generated
   */
  TypedLiteral createTypedLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>Object Property Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property Expression</em>'.
   * @generated
   */
  ObjectPropertyExpression createObjectPropertyExpression();

  /**
   * Returns a new object of class '<em>Object Property Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property Reference</em>'.
   * @generated
   */
  ObjectPropertyReference createObjectPropertyReference();

  /**
   * Returns a new object of class '<em>Inverse Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inverse Object Property</em>'.
   * @generated
   */
  InverseObjectProperty createInverseObjectProperty();

  /**
   * Returns a new object of class '<em>Data Property Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property Expression</em>'.
   * @generated
   */
  DataPropertyExpression createDataPropertyExpression();

  /**
   * Returns a new object of class '<em>Data Property Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property Reference</em>'.
   * @generated
   */
  DataPropertyReference createDataPropertyReference();

  /**
   * Returns a new object of class '<em>Data Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Range</em>'.
   * @generated
   */
  DataRange createDataRange();

  /**
   * Returns a new object of class '<em>Datatype Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datatype Reference</em>'.
   * @generated
   */
  DatatypeReference createDatatypeReference();

  /**
   * Returns a new object of class '<em>Data Intersection Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Intersection Of</em>'.
   * @generated
   */
  DataIntersectionOf createDataIntersectionOf();

  /**
   * Returns a new object of class '<em>Data Union Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Union Of</em>'.
   * @generated
   */
  DataUnionOf createDataUnionOf();

  /**
   * Returns a new object of class '<em>Data Complement Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Complement Of</em>'.
   * @generated
   */
  DataComplementOf createDataComplementOf();

  /**
   * Returns a new object of class '<em>Data One Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data One Of</em>'.
   * @generated
   */
  DataOneOf createDataOneOf();

  /**
   * Returns a new object of class '<em>Datatype Restriction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datatype Restriction</em>'.
   * @generated
   */
  DatatypeRestriction createDatatypeRestriction();

  /**
   * Returns a new object of class '<em>Facet Restriction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facet Restriction</em>'.
   * @generated
   */
  FacetRestriction createFacetRestriction();

  /**
   * Returns a new object of class '<em>Class Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Expression</em>'.
   * @generated
   */
  ClassExpression createClassExpression();

  /**
   * Returns a new object of class '<em>Class Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Reference</em>'.
   * @generated
   */
  ClassReference createClassReference();

  /**
   * Returns a new object of class '<em>Object Intersection Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Intersection Of</em>'.
   * @generated
   */
  ObjectIntersectionOf createObjectIntersectionOf();

  /**
   * Returns a new object of class '<em>Object Union Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Union Of</em>'.
   * @generated
   */
  ObjectUnionOf createObjectUnionOf();

  /**
   * Returns a new object of class '<em>Object Complement Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Complement Of</em>'.
   * @generated
   */
  ObjectComplementOf createObjectComplementOf();

  /**
   * Returns a new object of class '<em>Object One Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object One Of</em>'.
   * @generated
   */
  ObjectOneOf createObjectOneOf();

  /**
   * Returns a new object of class '<em>Individual Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Individual Reference</em>'.
   * @generated
   */
  IndividualReference createIndividualReference();

  /**
   * Returns a new object of class '<em>Named Individual Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Individual Reference</em>'.
   * @generated
   */
  NamedIndividualReference createNamedIndividualReference();

  /**
   * Returns a new object of class '<em>Anonymous Individual Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anonymous Individual Reference</em>'.
   * @generated
   */
  AnonymousIndividualReference createAnonymousIndividualReference();

  /**
   * Returns a new object of class '<em>Object Some Values From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Some Values From</em>'.
   * @generated
   */
  ObjectSomeValuesFrom createObjectSomeValuesFrom();

  /**
   * Returns a new object of class '<em>Object All Values From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object All Values From</em>'.
   * @generated
   */
  ObjectAllValuesFrom createObjectAllValuesFrom();

  /**
   * Returns a new object of class '<em>Object Has Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Has Value</em>'.
   * @generated
   */
  ObjectHasValue createObjectHasValue();

  /**
   * Returns a new object of class '<em>Object Has Self</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Has Self</em>'.
   * @generated
   */
  ObjectHasSelf createObjectHasSelf();

  /**
   * Returns a new object of class '<em>Object Min Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Min Cardinality</em>'.
   * @generated
   */
  ObjectMinCardinality createObjectMinCardinality();

  /**
   * Returns a new object of class '<em>Object Max Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Max Cardinality</em>'.
   * @generated
   */
  ObjectMaxCardinality createObjectMaxCardinality();

  /**
   * Returns a new object of class '<em>Object Exact Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Exact Cardinality</em>'.
   * @generated
   */
  ObjectExactCardinality createObjectExactCardinality();

  /**
   * Returns a new object of class '<em>Data Some Values From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Some Values From</em>'.
   * @generated
   */
  DataSomeValuesFrom createDataSomeValuesFrom();

  /**
   * Returns a new object of class '<em>Data All Values From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data All Values From</em>'.
   * @generated
   */
  DataAllValuesFrom createDataAllValuesFrom();

  /**
   * Returns a new object of class '<em>Data Has Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Has Value</em>'.
   * @generated
   */
  DataHasValue createDataHasValue();

  /**
   * Returns a new object of class '<em>Data Min Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Min Cardinality</em>'.
   * @generated
   */
  DataMinCardinality createDataMinCardinality();

  /**
   * Returns a new object of class '<em>Data Max Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Max Cardinality</em>'.
   * @generated
   */
  DataMaxCardinality createDataMaxCardinality();

  /**
   * Returns a new object of class '<em>Data Exact Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Exact Cardinality</em>'.
   * @generated
   */
  DataExactCardinality createDataExactCardinality();

  /**
   * Returns a new object of class '<em>Axiom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Axiom</em>'.
   * @generated
   */
  Axiom createAxiom();

  /**
   * Returns a new object of class '<em>Class Axiom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Axiom</em>'.
   * @generated
   */
  ClassAxiom createClassAxiom();

  /**
   * Returns a new object of class '<em>Sub Class Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Class Of</em>'.
   * @generated
   */
  SubClassOf createSubClassOf();

  /**
   * Returns a new object of class '<em>Equivalent Classes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equivalent Classes</em>'.
   * @generated
   */
  EquivalentClasses createEquivalentClasses();

  /**
   * Returns a new object of class '<em>Disjoint Classes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disjoint Classes</em>'.
   * @generated
   */
  DisjointClasses createDisjointClasses();

  /**
   * Returns a new object of class '<em>Disjoint Union</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disjoint Union</em>'.
   * @generated
   */
  DisjointUnion createDisjointUnion();

  /**
   * Returns a new object of class '<em>Object Property Axiom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property Axiom</em>'.
   * @generated
   */
  ObjectPropertyAxiom createObjectPropertyAxiom();

  /**
   * Returns a new object of class '<em>Sub Object Property Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Object Property Of</em>'.
   * @generated
   */
  SubObjectPropertyOf createSubObjectPropertyOf();

  /**
   * Returns a new object of class '<em>Equivalent Object Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equivalent Object Properties</em>'.
   * @generated
   */
  EquivalentObjectProperties createEquivalentObjectProperties();

  /**
   * Returns a new object of class '<em>Disjoint Object Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disjoint Object Properties</em>'.
   * @generated
   */
  DisjointObjectProperties createDisjointObjectProperties();

  /**
   * Returns a new object of class '<em>Inverse Object Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inverse Object Properties</em>'.
   * @generated
   */
  InverseObjectProperties createInverseObjectProperties();

  /**
   * Returns a new object of class '<em>Object Property Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property Domain</em>'.
   * @generated
   */
  ObjectPropertyDomain createObjectPropertyDomain();

  /**
   * Returns a new object of class '<em>Object Property Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property Range</em>'.
   * @generated
   */
  ObjectPropertyRange createObjectPropertyRange();

  /**
   * Returns a new object of class '<em>Functional Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Functional Object Property</em>'.
   * @generated
   */
  FunctionalObjectProperty createFunctionalObjectProperty();

  /**
   * Returns a new object of class '<em>Inverse Functional Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inverse Functional Object Property</em>'.
   * @generated
   */
  InverseFunctionalObjectProperty createInverseFunctionalObjectProperty();

  /**
   * Returns a new object of class '<em>Reflexive Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reflexive Object Property</em>'.
   * @generated
   */
  ReflexiveObjectProperty createReflexiveObjectProperty();

  /**
   * Returns a new object of class '<em>Irreflexive Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Irreflexive Object Property</em>'.
   * @generated
   */
  IrreflexiveObjectProperty createIrreflexiveObjectProperty();

  /**
   * Returns a new object of class '<em>Symmetric Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symmetric Object Property</em>'.
   * @generated
   */
  SymmetricObjectProperty createSymmetricObjectProperty();

  /**
   * Returns a new object of class '<em>Asymmetric Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Asymmetric Object Property</em>'.
   * @generated
   */
  AsymmetricObjectProperty createAsymmetricObjectProperty();

  /**
   * Returns a new object of class '<em>Transitive Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transitive Object Property</em>'.
   * @generated
   */
  TransitiveObjectProperty createTransitiveObjectProperty();

  /**
   * Returns a new object of class '<em>Data Property Axiom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property Axiom</em>'.
   * @generated
   */
  DataPropertyAxiom createDataPropertyAxiom();

  /**
   * Returns a new object of class '<em>Sub Data Property Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Data Property Of</em>'.
   * @generated
   */
  SubDataPropertyOf createSubDataPropertyOf();

  /**
   * Returns a new object of class '<em>Equivalent Data Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equivalent Data Properties</em>'.
   * @generated
   */
  EquivalentDataProperties createEquivalentDataProperties();

  /**
   * Returns a new object of class '<em>Disjoint Data Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disjoint Data Properties</em>'.
   * @generated
   */
  DisjointDataProperties createDisjointDataProperties();

  /**
   * Returns a new object of class '<em>Data Property Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property Domain</em>'.
   * @generated
   */
  DataPropertyDomain createDataPropertyDomain();

  /**
   * Returns a new object of class '<em>Data Property Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property Range</em>'.
   * @generated
   */
  DataPropertyRange createDataPropertyRange();

  /**
   * Returns a new object of class '<em>Functional Data Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Functional Data Property</em>'.
   * @generated
   */
  FunctionalDataProperty createFunctionalDataProperty();

  /**
   * Returns a new object of class '<em>Datatype Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datatype Definition</em>'.
   * @generated
   */
  DatatypeDefinition createDatatypeDefinition();

  /**
   * Returns a new object of class '<em>Has Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Key</em>'.
   * @generated
   */
  HasKey createHasKey();

  /**
   * Returns a new object of class '<em>Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assertion</em>'.
   * @generated
   */
  Assertion createAssertion();

  /**
   * Returns a new object of class '<em>Same Individual</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Same Individual</em>'.
   * @generated
   */
  SameIndividual createSameIndividual();

  /**
   * Returns a new object of class '<em>Different Individuals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Different Individuals</em>'.
   * @generated
   */
  DifferentIndividuals createDifferentIndividuals();

  /**
   * Returns a new object of class '<em>Class Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Assertion</em>'.
   * @generated
   */
  ClassAssertion createClassAssertion();

  /**
   * Returns a new object of class '<em>Object Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property Assertion</em>'.
   * @generated
   */
  ObjectPropertyAssertion createObjectPropertyAssertion();

  /**
   * Returns a new object of class '<em>Negative Object Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negative Object Property Assertion</em>'.
   * @generated
   */
  NegativeObjectPropertyAssertion createNegativeObjectPropertyAssertion();

  /**
   * Returns a new object of class '<em>Data Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property Assertion</em>'.
   * @generated
   */
  DataPropertyAssertion createDataPropertyAssertion();

  /**
   * Returns a new object of class '<em>Negative Data Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negative Data Property Assertion</em>'.
   * @generated
   */
  NegativeDataPropertyAssertion createNegativeDataPropertyAssertion();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

  /**
   * Returns a new object of class '<em>Annotation Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Value</em>'.
   * @generated
   */
  AnnotationValue createAnnotationValue();

  /**
   * Returns a new object of class '<em>Annotation Axiom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Axiom</em>'.
   * @generated
   */
  AnnotationAxiom createAnnotationAxiom();

  /**
   * Returns a new object of class '<em>Annotation Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Assertion</em>'.
   * @generated
   */
  AnnotationAssertion createAnnotationAssertion();

  /**
   * Returns a new object of class '<em>Annotation Subject</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Subject</em>'.
   * @generated
   */
  AnnotationSubject createAnnotationSubject();

  /**
   * Returns a new object of class '<em>Sub Annotation Property Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Annotation Property Of</em>'.
   * @generated
   */
  SubAnnotationPropertyOf createSubAnnotationPropertyOf();

  /**
   * Returns a new object of class '<em>Annotation Property Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Property Domain</em>'.
   * @generated
   */
  AnnotationPropertyDomain createAnnotationPropertyDomain();

  /**
   * Returns a new object of class '<em>Annotation Property Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Property Range</em>'.
   * @generated
   */
  AnnotationPropertyRange createAnnotationPropertyRange();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OwlPackage getOwlPackage();

} //OwlFactory
