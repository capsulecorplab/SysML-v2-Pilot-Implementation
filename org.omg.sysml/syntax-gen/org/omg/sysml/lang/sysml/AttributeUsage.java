/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An AttributeUsage is a Usage whose type is a DataType. Nominally, if the type is an AttributeDefinition, an AttributeUsage is a usage of a AttributeDefinition to represent the value of some system quality or characteristic. However, other kinds of kernel DataTypes are also allowed, to permit use of DataTypes from the Kernel Library. An AttributeUsage itself as well as all its nested <code>features</code> must have <code>isComposite</code> = <code>false</code>.</p>
 * 
 * <p>A AttributeUsage must subset, directly or indirectly, the base AttributeUsage <code>attributeValues</code> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AttributeUsage#getAttributeDefinition <em>Attribute Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAttributeUsage()
 * @model
 * @generated
 */
public interface AttributeUsage extends Usage {
	/**
	 * Returns the value of the '<em><b>Attribute Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.DataType}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The DataTypes that are the types of this AttributeUsage. Nominally, these are AttributeDefinitions, but other kinds of kernel DataTypes are also allowed, to permit use of DataTypes from the Kernel Library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAttributeUsage_AttributeDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedAttribute'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<DataType> getAttributeDefinition();

} // ValueProperty
