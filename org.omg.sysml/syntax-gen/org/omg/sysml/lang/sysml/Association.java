/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getOwnedEndFeatureMembership <em>Owned End Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getOwningConnector <em>Owning Connector</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Relationship, org.omg.sysml.lang.sysml.Class {
	/**
	 * Returns the value of the '<em><b>Related Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_RelatedType()
	 * @model lower="2" derived="true" ordered="false"
	 * @generated
	 */
	EList<org.omg.sysml.lang.sysml.Class> getRelatedType();

	/**
	 * Returns the value of the '<em><b>Owned End Feature Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.EndFeatureMembership}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.EndFeatureMembership#getOwningAssociation <em>Owning Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned End Feature Membership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned End Feature Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_OwnedEndFeatureMembership()
	 * @see org.omg.sysml.lang.sysml.EndFeatureMembership#getOwningAssociation
	 * @model opposite="owningAssociation" lower="2"
	 * @generated
	 */
	EList<EndFeatureMembership> getOwnedEndFeatureMembership();

	/**
	 * Returns the value of the '<em><b>Owning Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Connector#getOwnedAssociationType <em>Owned Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Connector</em>' reference.
	 * @see #setOwningConnector(Connector)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_OwningConnector()
	 * @see org.omg.sysml.lang.sysml.Connector#getOwnedAssociationType
	 * @model opposite="ownedAssociationType" ordered="false"
	 * @generated
	 */
	Connector getOwningConnector();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getOwningConnector <em>Owning Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Connector</em>' reference.
	 * @see #getOwningConnector()
	 * @generated
	 */
	void setOwningConnector(Connector value);

} // Association
