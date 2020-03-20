/**
 */
package org.omg.sysml.lang.sysml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.omg.sysml.lang.sysml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.omg.sysml.lang.sysml.SysMLPackage
 * @generated
 */
public class SysMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SysMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysMLSwitch() {
		if (modelPackage == null) {
			modelPackage = SysMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SysMLPackage.PART_PROPERTY: {
				PartProperty partProperty = (PartProperty)theEObject;
				T result = casePartProperty(partProperty);
				if (result == null) result = caseBlockProperty(partProperty);
				if (result == null) result = caseProperty(partProperty);
				if (result == null) result = caseUsage(partProperty);
				if (result == null) result = caseFeature(partProperty);
				if (result == null) result = caseType(partProperty);
				if (result == null) result = casePackage(partProperty);
				if (result == null) result = caseElement(partProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.BLOCK_PROPERTY: {
				BlockProperty blockProperty = (BlockProperty)theEObject;
				T result = caseBlockProperty(blockProperty);
				if (result == null) result = caseProperty(blockProperty);
				if (result == null) result = caseUsage(blockProperty);
				if (result == null) result = caseFeature(blockProperty);
				if (result == null) result = caseType(blockProperty);
				if (result == null) result = casePackage(blockProperty);
				if (result == null) result = caseElement(blockProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseUsage(property);
				if (result == null) result = caseFeature(property);
				if (result == null) result = caseType(property);
				if (result == null) result = casePackage(property);
				if (result == null) result = caseElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.USAGE: {
				Usage usage = (Usage)theEObject;
				T result = caseUsage(usage);
				if (result == null) result = caseFeature(usage);
				if (result == null) result = caseType(usage);
				if (result == null) result = casePackage(usage);
				if (result == null) result = caseElement(usage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseType(feature);
				if (result == null) result = casePackage(feature);
				if (result == null) result = caseElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = casePackage(type);
				if (result == null) result = caseElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PACKAGE: {
				org.omg.sysml.lang.sysml.Package package_ = (org.omg.sysml.lang.sysml.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.MEMBERSHIP: {
				Membership membership = (Membership)theEObject;
				T result = caseMembership(membership);
				if (result == null) result = caseRelationship(membership);
				if (result == null) result = caseElement(membership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseElement(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseRelationship(import_);
				if (result == null) result = caseElement(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = caseRelationship(generalization);
				if (result == null) result = caseElement(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FEATURE_MEMBERSHIP: {
				FeatureMembership featureMembership = (FeatureMembership)theEObject;
				T result = caseFeatureMembership(featureMembership);
				if (result == null) result = caseMembership(featureMembership);
				if (result == null) result = caseRelationship(featureMembership);
				if (result == null) result = caseElement(featureMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CONJUGATION: {
				Conjugation conjugation = (Conjugation)theEObject;
				T result = caseConjugation(conjugation);
				if (result == null) result = caseRelationship(conjugation);
				if (result == null) result = caseElement(conjugation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.MULTIPLICITY: {
				Multiplicity multiplicity = (Multiplicity)theEObject;
				T result = caseMultiplicity(multiplicity);
				if (result == null) result = caseFeature(multiplicity);
				if (result == null) result = caseType(multiplicity);
				if (result == null) result = casePackage(multiplicity);
				if (result == null) result = caseElement(multiplicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.REDEFINITION: {
				Redefinition redefinition = (Redefinition)theEObject;
				T result = caseRedefinition(redefinition);
				if (result == null) result = caseSubsetting(redefinition);
				if (result == null) result = caseGeneralization(redefinition);
				if (result == null) result = caseRelationship(redefinition);
				if (result == null) result = caseElement(redefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SUBSETTING: {
				Subsetting subsetting = (Subsetting)theEObject;
				T result = caseSubsetting(subsetting);
				if (result == null) result = caseGeneralization(subsetting);
				if (result == null) result = caseRelationship(subsetting);
				if (result == null) result = caseElement(subsetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FEATURE_TYPING: {
				FeatureTyping featureTyping = (FeatureTyping)theEObject;
				T result = caseFeatureTyping(featureTyping);
				if (result == null) result = caseGeneralization(featureTyping);
				if (result == null) result = caseRelationship(featureTyping);
				if (result == null) result = caseElement(featureTyping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.DEFINITION: {
				Definition definition = (Definition)theEObject;
				T result = caseDefinition(definition);
				if (result == null) result = caseClassifier(definition);
				if (result == null) result = caseType(definition);
				if (result == null) result = casePackage(definition);
				if (result == null) result = caseElement(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseType(classifier);
				if (result == null) result = casePackage(classifier);
				if (result == null) result = caseElement(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SUPERCLASSING: {
				Superclassing superclassing = (Superclassing)theEObject;
				T result = caseSuperclassing(superclassing);
				if (result == null) result = caseGeneralization(superclassing);
				if (result == null) result = caseRelationship(superclassing);
				if (result == null) result = caseElement(superclassing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PORT_USAGE: {
				PortUsage portUsage = (PortUsage)theEObject;
				T result = casePortUsage(portUsage);
				if (result == null) result = caseUsage(portUsage);
				if (result == null) result = caseFeature(portUsage);
				if (result == null) result = caseType(portUsage);
				if (result == null) result = casePackage(portUsage);
				if (result == null) result = caseElement(portUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PORT_DEFINITION: {
				PortDefinition portDefinition = (PortDefinition)theEObject;
				T result = casePortDefinition(portDefinition);
				if (result == null) result = caseDefinition(portDefinition);
				if (result == null) result = caseClassifier(portDefinition);
				if (result == null) result = caseType(portDefinition);
				if (result == null) result = casePackage(portDefinition);
				if (result == null) result = caseElement(portDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CONJUGATED_PORT_DEFINITION: {
				ConjugatedPortDefinition conjugatedPortDefinition = (ConjugatedPortDefinition)theEObject;
				T result = caseConjugatedPortDefinition(conjugatedPortDefinition);
				if (result == null) result = casePortDefinition(conjugatedPortDefinition);
				if (result == null) result = caseDefinition(conjugatedPortDefinition);
				if (result == null) result = caseClassifier(conjugatedPortDefinition);
				if (result == null) result = caseType(conjugatedPortDefinition);
				if (result == null) result = casePackage(conjugatedPortDefinition);
				if (result == null) result = caseElement(conjugatedPortDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PORT_CONJUGATION: {
				PortConjugation portConjugation = (PortConjugation)theEObject;
				T result = casePortConjugation(portConjugation);
				if (result == null) result = caseConjugation(portConjugation);
				if (result == null) result = caseRelationship(portConjugation);
				if (result == null) result = caseElement(portConjugation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ACTION_USAGE: {
				ActionUsage actionUsage = (ActionUsage)theEObject;
				T result = caseActionUsage(actionUsage);
				if (result == null) result = caseUsage(actionUsage);
				if (result == null) result = caseStep(actionUsage);
				if (result == null) result = caseFeature(actionUsage);
				if (result == null) result = caseType(actionUsage);
				if (result == null) result = casePackage(actionUsage);
				if (result == null) result = caseElement(actionUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseFeature(step);
				if (result == null) result = caseType(step);
				if (result == null) result = casePackage(step);
				if (result == null) result = caseElement(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = caseClassifier(behavior);
				if (result == null) result = caseType(behavior);
				if (result == null) result = casePackage(behavior);
				if (result == null) result = caseElement(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseFeature(parameter);
				if (result == null) result = caseType(parameter);
				if (result == null) result = casePackage(parameter);
				if (result == null) result = caseElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.STATE_USAGE: {
				StateUsage stateUsage = (StateUsage)theEObject;
				T result = caseStateUsage(stateUsage);
				if (result == null) result = caseActionUsage(stateUsage);
				if (result == null) result = caseUsage(stateUsage);
				if (result == null) result = caseStep(stateUsage);
				if (result == null) result = caseFeature(stateUsage);
				if (result == null) result = caseType(stateUsage);
				if (result == null) result = casePackage(stateUsage);
				if (result == null) result = caseElement(stateUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CONSTRAINT_USAGE: {
				ConstraintUsage constraintUsage = (ConstraintUsage)theEObject;
				T result = caseConstraintUsage(constraintUsage);
				if (result == null) result = caseUsage(constraintUsage);
				if (result == null) result = caseBooleanExpression(constraintUsage);
				if (result == null) result = caseExpression(constraintUsage);
				if (result == null) result = caseType(constraintUsage);
				if (result == null) result = caseStep(constraintUsage);
				if (result == null) result = caseFeature(constraintUsage);
				if (result == null) result = casePackage(constraintUsage);
				if (result == null) result = caseElement(constraintUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = caseExpression(booleanExpression);
				if (result == null) result = caseStep(booleanExpression);
				if (result == null) result = caseFeature(booleanExpression);
				if (result == null) result = caseType(booleanExpression);
				if (result == null) result = casePackage(booleanExpression);
				if (result == null) result = caseElement(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseStep(expression);
				if (result == null) result = caseFeature(expression);
				if (result == null) result = caseType(expression);
				if (result == null) result = casePackage(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseBehavior(function);
				if (result == null) result = caseClassifier(function);
				if (result == null) result = caseType(function);
				if (result == null) result = casePackage(function);
				if (result == null) result = caseElement(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PREDICATE: {
				Predicate predicate = (Predicate)theEObject;
				T result = casePredicate(predicate);
				if (result == null) result = caseFunction(predicate);
				if (result == null) result = caseBehavior(predicate);
				if (result == null) result = caseClassifier(predicate);
				if (result == null) result = caseType(predicate);
				if (result == null) result = casePackage(predicate);
				if (result == null) result = caseElement(predicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.TRANSITION_USAGE: {
				TransitionUsage transitionUsage = (TransitionUsage)theEObject;
				T result = caseTransitionUsage(transitionUsage);
				if (result == null) result = caseActionUsage(transitionUsage);
				if (result == null) result = caseUsage(transitionUsage);
				if (result == null) result = caseStep(transitionUsage);
				if (result == null) result = caseFeature(transitionUsage);
				if (result == null) result = caseType(transitionUsage);
				if (result == null) result = casePackage(transitionUsage);
				if (result == null) result = caseElement(transitionUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ACCEPT_ACTION_USAGE: {
				AcceptActionUsage acceptActionUsage = (AcceptActionUsage)theEObject;
				T result = caseAcceptActionUsage(acceptActionUsage);
				if (result == null) result = caseTransferActionUsage(acceptActionUsage);
				if (result == null) result = caseActionUsage(acceptActionUsage);
				if (result == null) result = caseUsage(acceptActionUsage);
				if (result == null) result = caseStep(acceptActionUsage);
				if (result == null) result = caseFeature(acceptActionUsage);
				if (result == null) result = caseType(acceptActionUsage);
				if (result == null) result = casePackage(acceptActionUsage);
				if (result == null) result = caseElement(acceptActionUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.TRANSFER_ACTION_USAGE: {
				TransferActionUsage transferActionUsage = (TransferActionUsage)theEObject;
				T result = caseTransferActionUsage(transferActionUsage);
				if (result == null) result = caseActionUsage(transferActionUsage);
				if (result == null) result = caseUsage(transferActionUsage);
				if (result == null) result = caseStep(transferActionUsage);
				if (result == null) result = caseFeature(transferActionUsage);
				if (result == null) result = caseType(transferActionUsage);
				if (result == null) result = casePackage(transferActionUsage);
				if (result == null) result = caseElement(transferActionUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SUCCESSION: {
				Succession succession = (Succession)theEObject;
				T result = caseSuccession(succession);
				if (result == null) result = caseConnector(succession);
				if (result == null) result = caseFeature(succession);
				if (result == null) result = caseRelationship(succession);
				if (result == null) result = caseType(succession);
				if (result == null) result = casePackage(succession);
				if (result == null) result = caseElement(succession);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseFeature(connector);
				if (result == null) result = caseRelationship(connector);
				if (result == null) result = caseType(connector);
				if (result == null) result = casePackage(connector);
				if (result == null) result = caseElement(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseClass(association);
				if (result == null) result = caseRelationship(association);
				if (result == null) result = caseClassifier(association);
				if (result == null) result = caseType(association);
				if (result == null) result = casePackage(association);
				if (result == null) result = caseElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CLASS: {
				org.omg.sysml.lang.sysml.Class class_ = (org.omg.sysml.lang.sysml.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = casePackage(class_);
				if (result == null) result = caseElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.REQUIREMENT_USAGE: {
				RequirementUsage requirementUsage = (RequirementUsage)theEObject;
				T result = caseRequirementUsage(requirementUsage);
				if (result == null) result = caseConstraintUsage(requirementUsage);
				if (result == null) result = caseUsage(requirementUsage);
				if (result == null) result = caseBooleanExpression(requirementUsage);
				if (result == null) result = caseExpression(requirementUsage);
				if (result == null) result = caseType(requirementUsage);
				if (result == null) result = caseStep(requirementUsage);
				if (result == null) result = caseFeature(requirementUsage);
				if (result == null) result = casePackage(requirementUsage);
				if (result == null) result = caseElement(requirementUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.REQUIREMENT_DEFINITION: {
				RequirementDefinition requirementDefinition = (RequirementDefinition)theEObject;
				T result = caseRequirementDefinition(requirementDefinition);
				if (result == null) result = caseConstraintDefinition(requirementDefinition);
				if (result == null) result = caseDefinition(requirementDefinition);
				if (result == null) result = casePredicate(requirementDefinition);
				if (result == null) result = caseFunction(requirementDefinition);
				if (result == null) result = caseType(requirementDefinition);
				if (result == null) result = caseBehavior(requirementDefinition);
				if (result == null) result = caseClassifier(requirementDefinition);
				if (result == null) result = casePackage(requirementDefinition);
				if (result == null) result = caseElement(requirementDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CONSTRAINT_DEFINITION: {
				ConstraintDefinition constraintDefinition = (ConstraintDefinition)theEObject;
				T result = caseConstraintDefinition(constraintDefinition);
				if (result == null) result = caseDefinition(constraintDefinition);
				if (result == null) result = casePredicate(constraintDefinition);
				if (result == null) result = caseFunction(constraintDefinition);
				if (result == null) result = caseType(constraintDefinition);
				if (result == null) result = caseBehavior(constraintDefinition);
				if (result == null) result = caseClassifier(constraintDefinition);
				if (result == null) result = casePackage(constraintDefinition);
				if (result == null) result = caseElement(constraintDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ASSOCIATION_BLOCK: {
				AssociationBlock associationBlock = (AssociationBlock)theEObject;
				T result = caseAssociationBlock(associationBlock);
				if (result == null) result = caseBlock(associationBlock);
				if (result == null) result = caseAssociation(associationBlock);
				if (result == null) result = caseDefinition(associationBlock);
				if (result == null) result = caseClass(associationBlock);
				if (result == null) result = caseRelationship(associationBlock);
				if (result == null) result = caseClassifier(associationBlock);
				if (result == null) result = caseType(associationBlock);
				if (result == null) result = casePackage(associationBlock);
				if (result == null) result = caseElement(associationBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseDefinition(block);
				if (result == null) result = caseClass(block);
				if (result == null) result = caseClassifier(block);
				if (result == null) result = caseType(block);
				if (result == null) result = casePackage(block);
				if (result == null) result = caseElement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.REFERENCE_PROPERTY: {
				ReferenceProperty referenceProperty = (ReferenceProperty)theEObject;
				T result = caseReferenceProperty(referenceProperty);
				if (result == null) result = caseBlockProperty(referenceProperty);
				if (result == null) result = caseProperty(referenceProperty);
				if (result == null) result = caseUsage(referenceProperty);
				if (result == null) result = caseFeature(referenceProperty);
				if (result == null) result = caseType(referenceProperty);
				if (result == null) result = casePackage(referenceProperty);
				if (result == null) result = caseElement(referenceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE: {
				SatisfyRequirementUsage satisfyRequirementUsage = (SatisfyRequirementUsage)theEObject;
				T result = caseSatisfyRequirementUsage(satisfyRequirementUsage);
				if (result == null) result = caseRequirementUsage(satisfyRequirementUsage);
				if (result == null) result = caseAssertConstraintUsage(satisfyRequirementUsage);
				if (result == null) result = caseConstraintUsage(satisfyRequirementUsage);
				if (result == null) result = caseInvariant(satisfyRequirementUsage);
				if (result == null) result = caseUsage(satisfyRequirementUsage);
				if (result == null) result = caseBooleanExpression(satisfyRequirementUsage);
				if (result == null) result = caseExpression(satisfyRequirementUsage);
				if (result == null) result = caseType(satisfyRequirementUsage);
				if (result == null) result = caseStep(satisfyRequirementUsage);
				if (result == null) result = caseFeature(satisfyRequirementUsage);
				if (result == null) result = casePackage(satisfyRequirementUsage);
				if (result == null) result = caseElement(satisfyRequirementUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE: {
				AssertConstraintUsage assertConstraintUsage = (AssertConstraintUsage)theEObject;
				T result = caseAssertConstraintUsage(assertConstraintUsage);
				if (result == null) result = caseConstraintUsage(assertConstraintUsage);
				if (result == null) result = caseInvariant(assertConstraintUsage);
				if (result == null) result = caseUsage(assertConstraintUsage);
				if (result == null) result = caseBooleanExpression(assertConstraintUsage);
				if (result == null) result = caseExpression(assertConstraintUsage);
				if (result == null) result = caseType(assertConstraintUsage);
				if (result == null) result = caseStep(assertConstraintUsage);
				if (result == null) result = caseFeature(assertConstraintUsage);
				if (result == null) result = casePackage(assertConstraintUsage);
				if (result == null) result = caseElement(assertConstraintUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.INVARIANT: {
				Invariant invariant = (Invariant)theEObject;
				T result = caseInvariant(invariant);
				if (result == null) result = caseBooleanExpression(invariant);
				if (result == null) result = caseExpression(invariant);
				if (result == null) result = caseStep(invariant);
				if (result == null) result = caseFeature(invariant);
				if (result == null) result = caseType(invariant);
				if (result == null) result = casePackage(invariant);
				if (result == null) result = caseElement(invariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.BINDING_CONNECTOR: {
				BindingConnector bindingConnector = (BindingConnector)theEObject;
				T result = caseBindingConnector(bindingConnector);
				if (result == null) result = caseConnector(bindingConnector);
				if (result == null) result = caseFeature(bindingConnector);
				if (result == null) result = caseRelationship(bindingConnector);
				if (result == null) result = caseType(bindingConnector);
				if (result == null) result = casePackage(bindingConnector);
				if (result == null) result = caseElement(bindingConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CONJUGATED_PORT_TYPING: {
				ConjugatedPortTyping conjugatedPortTyping = (ConjugatedPortTyping)theEObject;
				T result = caseConjugatedPortTyping(conjugatedPortTyping);
				if (result == null) result = caseFeatureTyping(conjugatedPortTyping);
				if (result == null) result = caseGeneralization(conjugatedPortTyping);
				if (result == null) result = caseRelationship(conjugatedPortTyping);
				if (result == null) result = caseElement(conjugatedPortTyping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.JOIN_NODE: {
				JoinNode joinNode = (JoinNode)theEObject;
				T result = caseJoinNode(joinNode);
				if (result == null) result = caseControlNode(joinNode);
				if (result == null) result = caseActionUsage(joinNode);
				if (result == null) result = caseUsage(joinNode);
				if (result == null) result = caseStep(joinNode);
				if (result == null) result = caseFeature(joinNode);
				if (result == null) result = caseType(joinNode);
				if (result == null) result = casePackage(joinNode);
				if (result == null) result = caseElement(joinNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CONTROL_NODE: {
				ControlNode controlNode = (ControlNode)theEObject;
				T result = caseControlNode(controlNode);
				if (result == null) result = caseActionUsage(controlNode);
				if (result == null) result = caseUsage(controlNode);
				if (result == null) result = caseStep(controlNode);
				if (result == null) result = caseFeature(controlNode);
				if (result == null) result = caseType(controlNode);
				if (result == null) result = casePackage(controlNode);
				if (result == null) result = caseElement(controlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.DECISION_NODE: {
				DecisionNode decisionNode = (DecisionNode)theEObject;
				T result = caseDecisionNode(decisionNode);
				if (result == null) result = caseControlNode(decisionNode);
				if (result == null) result = caseActionUsage(decisionNode);
				if (result == null) result = caseUsage(decisionNode);
				if (result == null) result = caseStep(decisionNode);
				if (result == null) result = caseFeature(decisionNode);
				if (result == null) result = caseType(decisionNode);
				if (result == null) result = casePackage(decisionNode);
				if (result == null) result = caseElement(decisionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.MERGE_NODE: {
				MergeNode mergeNode = (MergeNode)theEObject;
				T result = caseMergeNode(mergeNode);
				if (result == null) result = caseControlNode(mergeNode);
				if (result == null) result = caseActionUsage(mergeNode);
				if (result == null) result = caseUsage(mergeNode);
				if (result == null) result = caseStep(mergeNode);
				if (result == null) result = caseFeature(mergeNode);
				if (result == null) result = caseType(mergeNode);
				if (result == null) result = casePackage(mergeNode);
				if (result == null) result = caseElement(mergeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FORK_NODE: {
				ForkNode forkNode = (ForkNode)theEObject;
				T result = caseForkNode(forkNode);
				if (result == null) result = caseControlNode(forkNode);
				if (result == null) result = caseActionUsage(forkNode);
				if (result == null) result = caseUsage(forkNode);
				if (result == null) result = caseStep(forkNode);
				if (result == null) result = caseFeature(forkNode);
				if (result == null) result = caseType(forkNode);
				if (result == null) result = casePackage(forkNode);
				if (result == null) result = caseElement(forkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PERFORM_ACTION_USAGE: {
				PerformActionUsage performActionUsage = (PerformActionUsage)theEObject;
				T result = casePerformActionUsage(performActionUsage);
				if (result == null) result = caseActionUsage(performActionUsage);
				if (result == null) result = caseUsage(performActionUsage);
				if (result == null) result = caseStep(performActionUsage);
				if (result == null) result = caseFeature(performActionUsage);
				if (result == null) result = caseType(performActionUsage);
				if (result == null) result = casePackage(performActionUsage);
				if (result == null) result = caseElement(performActionUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SEND_ACTION_USAGE: {
				SendActionUsage sendActionUsage = (SendActionUsage)theEObject;
				T result = caseSendActionUsage(sendActionUsage);
				if (result == null) result = caseTransferActionUsage(sendActionUsage);
				if (result == null) result = caseActionUsage(sendActionUsage);
				if (result == null) result = caseUsage(sendActionUsage);
				if (result == null) result = caseStep(sendActionUsage);
				if (result == null) result = caseFeature(sendActionUsage);
				if (result == null) result = caseType(sendActionUsage);
				if (result == null) result = casePackage(sendActionUsage);
				if (result == null) result = caseElement(sendActionUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseDefinition(activity);
				if (result == null) result = caseBehavior(activity);
				if (result == null) result = caseClassifier(activity);
				if (result == null) result = caseType(activity);
				if (result == null) result = casePackage(activity);
				if (result == null) result = caseElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CONNECTION_USAGE: {
				ConnectionUsage connectionUsage = (ConnectionUsage)theEObject;
				T result = caseConnectionUsage(connectionUsage);
				if (result == null) result = caseUsage(connectionUsage);
				if (result == null) result = caseConnector(connectionUsage);
				if (result == null) result = caseFeature(connectionUsage);
				if (result == null) result = caseRelationship(connectionUsage);
				if (result == null) result = caseType(connectionUsage);
				if (result == null) result = casePackage(connectionUsage);
				if (result == null) result = caseElement(connectionUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.INTERFACE_DEFINITION: {
				InterfaceDefinition interfaceDefinition = (InterfaceDefinition)theEObject;
				T result = caseInterfaceDefinition(interfaceDefinition);
				if (result == null) result = caseAssociationBlock(interfaceDefinition);
				if (result == null) result = caseBlock(interfaceDefinition);
				if (result == null) result = caseAssociation(interfaceDefinition);
				if (result == null) result = caseDefinition(interfaceDefinition);
				if (result == null) result = caseClass(interfaceDefinition);
				if (result == null) result = caseRelationship(interfaceDefinition);
				if (result == null) result = caseClassifier(interfaceDefinition);
				if (result == null) result = caseType(interfaceDefinition);
				if (result == null) result = casePackage(interfaceDefinition);
				if (result == null) result = caseElement(interfaceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.INTERFACE_USAGE: {
				InterfaceUsage interfaceUsage = (InterfaceUsage)theEObject;
				T result = caseInterfaceUsage(interfaceUsage);
				if (result == null) result = caseConnectionUsage(interfaceUsage);
				if (result == null) result = caseUsage(interfaceUsage);
				if (result == null) result = caseConnector(interfaceUsage);
				if (result == null) result = caseFeature(interfaceUsage);
				if (result == null) result = caseRelationship(interfaceUsage);
				if (result == null) result = caseType(interfaceUsage);
				if (result == null) result = casePackage(interfaceUsage);
				if (result == null) result = caseElement(interfaceUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.VALUE_PROPERTY: {
				ValueProperty valueProperty = (ValueProperty)theEObject;
				T result = caseValueProperty(valueProperty);
				if (result == null) result = caseProperty(valueProperty);
				if (result == null) result = caseUsage(valueProperty);
				if (result == null) result = caseFeature(valueProperty);
				if (result == null) result = caseType(valueProperty);
				if (result == null) result = casePackage(valueProperty);
				if (result == null) result = caseElement(valueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseClassifier(dataType);
				if (result == null) result = caseType(dataType);
				if (result == null) result = casePackage(dataType);
				if (result == null) result = caseElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = caseDefinition(valueType);
				if (result == null) result = caseDataType(valueType);
				if (result == null) result = caseClassifier(valueType);
				if (result == null) result = caseType(valueType);
				if (result == null) result = casePackage(valueType);
				if (result == null) result = caseElement(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.INDIVIDUAL_USAGE: {
				IndividualUsage individualUsage = (IndividualUsage)theEObject;
				T result = caseIndividualUsage(individualUsage);
				if (result == null) result = caseBlockProperty(individualUsage);
				if (result == null) result = caseProperty(individualUsage);
				if (result == null) result = caseUsage(individualUsage);
				if (result == null) result = caseFeature(individualUsage);
				if (result == null) result = caseType(individualUsage);
				if (result == null) result = casePackage(individualUsage);
				if (result == null) result = caseElement(individualUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.INDIVIDUAL_DEFINITION: {
				IndividualDefinition individualDefinition = (IndividualDefinition)theEObject;
				T result = caseIndividualDefinition(individualDefinition);
				if (result == null) result = caseBlock(individualDefinition);
				if (result == null) result = caseDefinition(individualDefinition);
				if (result == null) result = caseClass(individualDefinition);
				if (result == null) result = caseClassifier(individualDefinition);
				if (result == null) result = caseType(individualDefinition);
				if (result == null) result = casePackage(individualDefinition);
				if (result == null) result = caseElement(individualDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP: {
				TransitionFeatureMembership transitionFeatureMembership = (TransitionFeatureMembership)theEObject;
				T result = caseTransitionFeatureMembership(transitionFeatureMembership);
				if (result == null) result = caseFeatureMembership(transitionFeatureMembership);
				if (result == null) result = caseMembership(transitionFeatureMembership);
				if (result == null) result = caseRelationship(transitionFeatureMembership);
				if (result == null) result = caseElement(transitionFeatureMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.STATE_DEFINITION: {
				StateDefinition stateDefinition = (StateDefinition)theEObject;
				T result = caseStateDefinition(stateDefinition);
				if (result == null) result = caseActivity(stateDefinition);
				if (result == null) result = caseDefinition(stateDefinition);
				if (result == null) result = caseBehavior(stateDefinition);
				if (result == null) result = caseClassifier(stateDefinition);
				if (result == null) result = caseType(stateDefinition);
				if (result == null) result = casePackage(stateDefinition);
				if (result == null) result = caseElement(stateDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.EXHIBIT_STATE_USAGE: {
				ExhibitStateUsage exhibitStateUsage = (ExhibitStateUsage)theEObject;
				T result = caseExhibitStateUsage(exhibitStateUsage);
				if (result == null) result = caseStateUsage(exhibitStateUsage);
				if (result == null) result = caseActionUsage(exhibitStateUsage);
				if (result == null) result = caseUsage(exhibitStateUsage);
				if (result == null) result = caseStep(exhibitStateUsage);
				if (result == null) result = caseFeature(exhibitStateUsage);
				if (result == null) result = caseType(exhibitStateUsage);
				if (result == null) result = casePackage(exhibitStateUsage);
				if (result == null) result = caseElement(exhibitStateUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP: {
				StateSubactionMembership stateSubactionMembership = (StateSubactionMembership)theEObject;
				T result = caseStateSubactionMembership(stateSubactionMembership);
				if (result == null) result = caseFeatureMembership(stateSubactionMembership);
				if (result == null) result = caseMembership(stateSubactionMembership);
				if (result == null) result = caseRelationship(stateSubactionMembership);
				if (result == null) result = caseElement(stateSubactionMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.END_FEATURE_MEMBERSHIP: {
				EndFeatureMembership endFeatureMembership = (EndFeatureMembership)theEObject;
				T result = caseEndFeatureMembership(endFeatureMembership);
				if (result == null) result = caseFeatureMembership(endFeatureMembership);
				if (result == null) result = caseMembership(endFeatureMembership);
				if (result == null) result = caseRelationship(endFeatureMembership);
				if (result == null) result = caseElement(endFeatureMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION: {
				InstanceCreationExpression instanceCreationExpression = (InstanceCreationExpression)theEObject;
				T result = caseInstanceCreationExpression(instanceCreationExpression);
				if (result == null) result = caseInvocationExpression(instanceCreationExpression);
				if (result == null) result = caseExpression(instanceCreationExpression);
				if (result == null) result = caseStep(instanceCreationExpression);
				if (result == null) result = caseFeature(instanceCreationExpression);
				if (result == null) result = caseType(instanceCreationExpression);
				if (result == null) result = casePackage(instanceCreationExpression);
				if (result == null) result = caseElement(instanceCreationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.INVOCATION_EXPRESSION: {
				InvocationExpression invocationExpression = (InvocationExpression)theEObject;
				T result = caseInvocationExpression(invocationExpression);
				if (result == null) result = caseExpression(invocationExpression);
				if (result == null) result = caseStep(invocationExpression);
				if (result == null) result = caseFeature(invocationExpression);
				if (result == null) result = caseType(invocationExpression);
				if (result == null) result = casePackage(invocationExpression);
				if (result == null) result = caseElement(invocationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION: {
				SequenceConstructionExpression sequenceConstructionExpression = (SequenceConstructionExpression)theEObject;
				T result = caseSequenceConstructionExpression(sequenceConstructionExpression);
				if (result == null) result = caseExpression(sequenceConstructionExpression);
				if (result == null) result = caseStep(sequenceConstructionExpression);
				if (result == null) result = caseFeature(sequenceConstructionExpression);
				if (result == null) result = caseType(sequenceConstructionExpression);
				if (result == null) result = casePackage(sequenceConstructionExpression);
				if (result == null) result = caseElement(sequenceConstructionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.BLOCK_EXPRESSION: {
				BlockExpression blockExpression = (BlockExpression)theEObject;
				T result = caseBlockExpression(blockExpression);
				if (result == null) result = caseExpression(blockExpression);
				if (result == null) result = caseStep(blockExpression);
				if (result == null) result = caseFeature(blockExpression);
				if (result == null) result = caseType(blockExpression);
				if (result == null) result = casePackage(blockExpression);
				if (result == null) result = caseElement(blockExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION: {
				FeatureReferenceExpression featureReferenceExpression = (FeatureReferenceExpression)theEObject;
				T result = caseFeatureReferenceExpression(featureReferenceExpression);
				if (result == null) result = caseExpression(featureReferenceExpression);
				if (result == null) result = caseStep(featureReferenceExpression);
				if (result == null) result = caseFeature(featureReferenceExpression);
				if (result == null) result = caseType(featureReferenceExpression);
				if (result == null) result = casePackage(featureReferenceExpression);
				if (result == null) result = caseElement(featureReferenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.QUERY_PATH_STEP_EXPRESSION: {
				QueryPathStepExpression queryPathStepExpression = (QueryPathStepExpression)theEObject;
				T result = caseQueryPathStepExpression(queryPathStepExpression);
				if (result == null) result = caseOperatorExpression(queryPathStepExpression);
				if (result == null) result = caseInvocationExpression(queryPathStepExpression);
				if (result == null) result = caseExpression(queryPathStepExpression);
				if (result == null) result = caseStep(queryPathStepExpression);
				if (result == null) result = caseFeature(queryPathStepExpression);
				if (result == null) result = caseType(queryPathStepExpression);
				if (result == null) result = casePackage(queryPathStepExpression);
				if (result == null) result = caseElement(queryPathStepExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.OPERATOR_EXPRESSION: {
				OperatorExpression operatorExpression = (OperatorExpression)theEObject;
				T result = caseOperatorExpression(operatorExpression);
				if (result == null) result = caseInvocationExpression(operatorExpression);
				if (result == null) result = caseExpression(operatorExpression);
				if (result == null) result = caseStep(operatorExpression);
				if (result == null) result = caseFeature(operatorExpression);
				if (result == null) result = caseType(operatorExpression);
				if (result == null) result = casePackage(operatorExpression);
				if (result == null) result = caseElement(operatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.QUERY_QUALIFIER_EXPRESSION: {
				QueryQualifierExpression queryQualifierExpression = (QueryQualifierExpression)theEObject;
				T result = caseQueryQualifierExpression(queryQualifierExpression);
				if (result == null) result = caseOperatorExpression(queryQualifierExpression);
				if (result == null) result = caseInvocationExpression(queryQualifierExpression);
				if (result == null) result = caseExpression(queryQualifierExpression);
				if (result == null) result = caseStep(queryQualifierExpression);
				if (result == null) result = caseFeature(queryQualifierExpression);
				if (result == null) result = caseType(queryQualifierExpression);
				if (result == null) result = casePackage(queryQualifierExpression);
				if (result == null) result = caseElement(queryQualifierExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.QUERY_PATH_EXPRESSION: {
				QueryPathExpression queryPathExpression = (QueryPathExpression)theEObject;
				T result = caseQueryPathExpression(queryPathExpression);
				if (result == null) result = caseFeatureReferenceExpression(queryPathExpression);
				if (result == null) result = caseExpression(queryPathExpression);
				if (result == null) result = caseStep(queryPathExpression);
				if (result == null) result = caseFeature(queryPathExpression);
				if (result == null) result = caseType(queryPathExpression);
				if (result == null) result = casePackage(queryPathExpression);
				if (result == null) result = caseElement(queryPathExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_EXPRESSION: {
				LiteralExpression literalExpression = (LiteralExpression)theEObject;
				T result = caseLiteralExpression(literalExpression);
				if (result == null) result = caseExpression(literalExpression);
				if (result == null) result = caseStep(literalExpression);
				if (result == null) result = caseFeature(literalExpression);
				if (result == null) result = caseType(literalExpression);
				if (result == null) result = casePackage(literalExpression);
				if (result == null) result = caseElement(literalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_UNBOUNDED: {
				LiteralUnbounded literalUnbounded = (LiteralUnbounded)theEObject;
				T result = caseLiteralUnbounded(literalUnbounded);
				if (result == null) result = caseLiteralExpression(literalUnbounded);
				if (result == null) result = caseExpression(literalUnbounded);
				if (result == null) result = caseStep(literalUnbounded);
				if (result == null) result = caseFeature(literalUnbounded);
				if (result == null) result = caseType(literalUnbounded);
				if (result == null) result = casePackage(literalUnbounded);
				if (result == null) result = caseElement(literalUnbounded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_BOOLEAN: {
				LiteralBoolean literalBoolean = (LiteralBoolean)theEObject;
				T result = caseLiteralBoolean(literalBoolean);
				if (result == null) result = caseLiteralExpression(literalBoolean);
				if (result == null) result = caseExpression(literalBoolean);
				if (result == null) result = caseStep(literalBoolean);
				if (result == null) result = caseFeature(literalBoolean);
				if (result == null) result = caseType(literalBoolean);
				if (result == null) result = casePackage(literalBoolean);
				if (result == null) result = caseElement(literalBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.NULL_EXPRESSION: {
				NullExpression nullExpression = (NullExpression)theEObject;
				T result = caseNullExpression(nullExpression);
				if (result == null) result = caseExpression(nullExpression);
				if (result == null) result = caseStep(nullExpression);
				if (result == null) result = caseFeature(nullExpression);
				if (result == null) result = caseType(nullExpression);
				if (result == null) result = casePackage(nullExpression);
				if (result == null) result = caseElement(nullExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_INTEGER: {
				LiteralInteger literalInteger = (LiteralInteger)theEObject;
				T result = caseLiteralInteger(literalInteger);
				if (result == null) result = caseLiteralExpression(literalInteger);
				if (result == null) result = caseExpression(literalInteger);
				if (result == null) result = caseStep(literalInteger);
				if (result == null) result = caseFeature(literalInteger);
				if (result == null) result = caseType(literalInteger);
				if (result == null) result = casePackage(literalInteger);
				if (result == null) result = caseElement(literalInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_STRING: {
				LiteralString literalString = (LiteralString)theEObject;
				T result = caseLiteralString(literalString);
				if (result == null) result = caseLiteralExpression(literalString);
				if (result == null) result = caseExpression(literalString);
				if (result == null) result = caseStep(literalString);
				if (result == null) result = caseFeature(literalString);
				if (result == null) result = caseType(literalString);
				if (result == null) result = casePackage(literalString);
				if (result == null) result = caseElement(literalString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_REAL: {
				LiteralReal literalReal = (LiteralReal)theEObject;
				T result = caseLiteralReal(literalReal);
				if (result == null) result = caseLiteralExpression(literalReal);
				if (result == null) result = caseExpression(literalReal);
				if (result == null) result = caseStep(literalReal);
				if (result == null) result = caseFeature(literalReal);
				if (result == null) result = caseType(literalReal);
				if (result == null) result = casePackage(literalReal);
				if (result == null) result = caseElement(literalReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.MULTIPLICITY_RANGE: {
				MultiplicityRange multiplicityRange = (MultiplicityRange)theEObject;
				T result = caseMultiplicityRange(multiplicityRange);
				if (result == null) result = caseMultiplicity(multiplicityRange);
				if (result == null) result = caseFeature(multiplicityRange);
				if (result == null) result = caseType(multiplicityRange);
				if (result == null) result = casePackage(multiplicityRange);
				if (result == null) result = caseElement(multiplicityRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CONDITIONAL_IMPORT: {
				ConditionalImport conditionalImport = (ConditionalImport)theEObject;
				T result = caseConditionalImport(conditionalImport);
				if (result == null) result = caseImport(conditionalImport);
				if (result == null) result = caseRelationship(conditionalImport);
				if (result == null) result = caseElement(conditionalImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.IMPORT_CONDITION: {
				ImportCondition importCondition = (ImportCondition)theEObject;
				T result = caseImportCondition(importCondition);
				if (result == null) result = caseRelationship(importCondition);
				if (result == null) result = caseElement(importCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SOURCE_END: {
				SourceEnd sourceEnd = (SourceEnd)theEObject;
				T result = caseSourceEnd(sourceEnd);
				if (result == null) result = caseFeature(sourceEnd);
				if (result == null) result = caseType(sourceEnd);
				if (result == null) result = casePackage(sourceEnd);
				if (result == null) result = caseElement(sourceEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.RETURN_PARAMETER_MEMBERSHIP: {
				ReturnParameterMembership returnParameterMembership = (ReturnParameterMembership)theEObject;
				T result = caseReturnParameterMembership(returnParameterMembership);
				if (result == null) result = caseParameterMembership(returnParameterMembership);
				if (result == null) result = caseFeatureMembership(returnParameterMembership);
				if (result == null) result = caseMembership(returnParameterMembership);
				if (result == null) result = caseRelationship(returnParameterMembership);
				if (result == null) result = caseElement(returnParameterMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PARAMETER_MEMBERSHIP: {
				ParameterMembership parameterMembership = (ParameterMembership)theEObject;
				T result = caseParameterMembership(parameterMembership);
				if (result == null) result = caseFeatureMembership(parameterMembership);
				if (result == null) result = caseMembership(parameterMembership);
				if (result == null) result = caseRelationship(parameterMembership);
				if (result == null) result = caseElement(parameterMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.TARGET_END: {
				TargetEnd targetEnd = (TargetEnd)theEObject;
				T result = caseTargetEnd(targetEnd);
				if (result == null) result = caseFeature(targetEnd);
				if (result == null) result = caseType(targetEnd);
				if (result == null) result = casePackage(targetEnd);
				if (result == null) result = caseElement(targetEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ITEM_FLOW_END: {
				ItemFlowEnd itemFlowEnd = (ItemFlowEnd)theEObject;
				T result = caseItemFlowEnd(itemFlowEnd);
				if (result == null) result = caseFeature(itemFlowEnd);
				if (result == null) result = caseType(itemFlowEnd);
				if (result == null) result = casePackage(itemFlowEnd);
				if (result == null) result = caseElement(itemFlowEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ITEM_FEATURE: {
				ItemFeature itemFeature = (ItemFeature)theEObject;
				T result = caseItemFeature(itemFeature);
				if (result == null) result = caseFeature(itemFeature);
				if (result == null) result = caseType(itemFeature);
				if (result == null) result = casePackage(itemFeature);
				if (result == null) result = caseElement(itemFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ITEM_FLOW_FEATURE: {
				ItemFlowFeature itemFlowFeature = (ItemFlowFeature)theEObject;
				T result = caseItemFlowFeature(itemFlowFeature);
				if (result == null) result = caseFeature(itemFlowFeature);
				if (result == null) result = caseType(itemFlowFeature);
				if (result == null) result = casePackage(itemFlowFeature);
				if (result == null) result = caseElement(itemFlowFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.INTERACTION: {
				Interaction interaction = (Interaction)theEObject;
				T result = caseInteraction(interaction);
				if (result == null) result = caseAssociation(interaction);
				if (result == null) result = caseBehavior(interaction);
				if (result == null) result = caseClass(interaction);
				if (result == null) result = caseRelationship(interaction);
				if (result == null) result = caseClassifier(interaction);
				if (result == null) result = caseType(interaction);
				if (result == null) result = casePackage(interaction);
				if (result == null) result = caseElement(interaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ITEM_FLOW: {
				ItemFlow itemFlow = (ItemFlow)theEObject;
				T result = caseItemFlow(itemFlow);
				if (result == null) result = caseConnector(itemFlow);
				if (result == null) result = caseStep(itemFlow);
				if (result == null) result = caseFeature(itemFlow);
				if (result == null) result = caseRelationship(itemFlow);
				if (result == null) result = caseType(itemFlow);
				if (result == null) result = casePackage(itemFlow);
				if (result == null) result = caseElement(itemFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SUCCESSION_ITEM_FLOW: {
				SuccessionItemFlow successionItemFlow = (SuccessionItemFlow)theEObject;
				T result = caseSuccessionItemFlow(successionItemFlow);
				if (result == null) result = caseItemFlow(successionItemFlow);
				if (result == null) result = caseSuccession(successionItemFlow);
				if (result == null) result = caseConnector(successionItemFlow);
				if (result == null) result = caseStep(successionItemFlow);
				if (result == null) result = caseFeature(successionItemFlow);
				if (result == null) result = caseRelationship(successionItemFlow);
				if (result == null) result = caseType(successionItemFlow);
				if (result == null) result = casePackage(successionItemFlow);
				if (result == null) result = caseElement(successionItemFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FEATURE_VALUE: {
				FeatureValue featureValue = (FeatureValue)theEObject;
				T result = caseFeatureValue(featureValue);
				if (result == null) result = caseFeatureMembership(featureValue);
				if (result == null) result = caseMembership(featureValue);
				if (result == null) result = caseRelationship(featureValue);
				if (result == null) result = caseElement(featureValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseRelationship(annotation);
				if (result == null) result = caseElement(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseElement(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.OWNERSHIP: {
				Ownership ownership = (Ownership)theEObject;
				T result = caseOwnership(ownership);
				if (result == null) result = caseRelationship(ownership);
				if (result == null) result = caseElement(ownership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LIFE_CLASS: {
				LifeClass lifeClass = (LifeClass)theEObject;
				T result = caseLifeClass(lifeClass);
				if (result == null) result = caseBlock(lifeClass);
				if (result == null) result = caseDefinition(lifeClass);
				if (result == null) result = caseClass(lifeClass);
				if (result == null) result = caseClassifier(lifeClass);
				if (result == null) result = caseType(lifeClass);
				if (result == null) result = casePackage(lifeClass);
				if (result == null) result = caseElement(lifeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.TIME_SLICE_FEATURE: {
				TimeSliceFeature timeSliceFeature = (TimeSliceFeature)theEObject;
				T result = caseTimeSliceFeature(timeSliceFeature);
				if (result == null) result = caseReferenceProperty(timeSliceFeature);
				if (result == null) result = caseBlockProperty(timeSliceFeature);
				if (result == null) result = caseProperty(timeSliceFeature);
				if (result == null) result = caseUsage(timeSliceFeature);
				if (result == null) result = caseFeature(timeSliceFeature);
				if (result == null) result = caseType(timeSliceFeature);
				if (result == null) result = casePackage(timeSliceFeature);
				if (result == null) result = caseElement(timeSliceFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SNAPSHOT_FEATURE: {
				SnapshotFeature snapshotFeature = (SnapshotFeature)theEObject;
				T result = caseSnapshotFeature(snapshotFeature);
				if (result == null) result = caseReferenceProperty(snapshotFeature);
				if (result == null) result = caseBlockProperty(snapshotFeature);
				if (result == null) result = caseProperty(snapshotFeature);
				if (result == null) result = caseUsage(snapshotFeature);
				if (result == null) result = caseFeature(snapshotFeature);
				if (result == null) result = caseType(snapshotFeature);
				if (result == null) result = casePackage(snapshotFeature);
				if (result == null) result = caseElement(snapshotFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP: {
				RequirementConstraintMembership requirementConstraintMembership = (RequirementConstraintMembership)theEObject;
				T result = caseRequirementConstraintMembership(requirementConstraintMembership);
				if (result == null) result = caseFeatureMembership(requirementConstraintMembership);
				if (result == null) result = caseMembership(requirementConstraintMembership);
				if (result == null) result = caseRelationship(requirementConstraintMembership);
				if (result == null) result = caseElement(requirementConstraintMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Feature Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Feature Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndFeatureMembership(EndFeatureMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Action Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Action Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferActionUsage(TransferActionUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Action Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Action Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendActionUsage(SendActionUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert Constraint Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert Constraint Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertConstraintUsage(AssertConstraintUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Action Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Action Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptActionUsage(AcceptActionUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform Action Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform Action Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformActionUsage(PerformActionUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNode(ForkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode(ControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionNode(DecisionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinNode(JoinNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeNode(MergeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateDefinition(StateDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureMembership(FeatureMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjugation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjugation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjugation(Conjugation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMembership(Membership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.omg.sysml.lang.sysml.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicate(Predicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionUsage(TransitionUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinition(Redefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsetting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsetting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsetting(Subsetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureValue(FeatureValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicity(Multiplicity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Typing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Typing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureTyping(FeatureTyping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Superclassing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Superclassing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperclassing(Superclassing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.omg.sysml.lang.sysml.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementUsage(RequirementUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementDefinition(RequirementDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsage(Usage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortUsage(PortUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortDefinition(PortDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjugated Port Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjugated Port Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjugatedPortDefinition(ConjugatedPortDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Conjugation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Conjugation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConjugation(PortConjugation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionUsage(ActionUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateUsage(StateUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintUsage(ConstraintUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvariant(Invariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exhibit State Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exhibit State Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExhibitStateUsage(ExhibitStateUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Subaction Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Subaction Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateSubactionMembership(StateSubactionMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjugated Port Typing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjugated Port Typing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjugatedPortTyping(ConjugatedPortTyping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualUsage(IndividualUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualDefinition(IndividualDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDefinition(InterfaceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceUsage(InterfaceUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintDefinition(ConstraintDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionUsage(ConnectionUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationBlock(AssociationBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockProperty(BlockProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceProperty(ReferenceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisfy Requirement Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisfy Requirement Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisfyRequirementUsage(SatisfyRequirementUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartProperty(PartProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueProperty(ValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingConnector(BindingConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityRange(MultiplicityRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Succession</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Succession</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccession(Succession object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportCondition(ImportCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalImport(ConditionalImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ownership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ownership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwnership(Ownership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Life Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Life Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeClass(LifeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Slice Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Slice Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSliceFeature(TimeSliceFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Snapshot Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Snapshot Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSnapshotFeature(SnapshotFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Constraint Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Constraint Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementConstraintMembership(RequirementConstraintMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralBoolean(LiteralBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationExpression(InvocationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockExpression(BlockExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterMembership(ParameterMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Parameter Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Parameter Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnParameterMembership(ReturnParameterMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Path Step Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Path Step Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryPathStepExpression(QueryPathStepExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Qualifier Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Qualifier Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryQualifierExpression(QueryQualifierExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Path Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Path Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryPathExpression(QueryPathExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralExpression(LiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralReal(LiteralReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Unbounded</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Unbounded</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralUnbounded(LiteralUnbounded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralInteger(LiteralInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Flow End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Flow End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemFlowEnd(ItemFlowEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Flow Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Flow Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemFlowFeature(ItemFlowFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemFeature(ItemFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceEnd(SourceEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetEnd(TargetEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Feature Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Feature Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionFeatureMembership(TransitionFeatureMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatorExpression(OperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralString(LiteralString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemFlow(ItemFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Succession Item Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Succession Item Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccessionItemFlow(SuccessionItemFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Creation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Creation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceCreationExpression(InstanceCreationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullExpression(NullExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Construction Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Construction Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceConstructionExpression(SequenceConstructionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Reference Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureReferenceExpression(FeatureReferenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SysMLSwitch
