/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Feature
 * Typing</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>FeatureTyping is Generalization in which the specific Type is a Feature. This means the set of sequences of the (specific) typedFeature is a subset of the set of&nbsp;sequences of the (general) type.&nbsp; In the simplest case, the type&nbsp;is a Classifier, whereupon the typedFeature&nbsp;subset has sequences ending in things&nbsp;(in the universe, see <mms-view-link mms-doc-id="_18_5_3_59601fc_1554554231131_907648_19909" mms-element-id="_18_5_3_59601fc_1554554191042_80162_19781">[cf:Semantics.vlink]</mms-view-link>) in single-length sequences of the Classifier.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureTyping#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureTyping#getTypedFeature <em>Typed Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureTyping()
 * @model
 * @generated
 */
public interface FeatureTyping extends Generalization {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getGeneral() <em>General</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Type that is being applied by this FeatureTyping.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureTyping_Type()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typingByType'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureTyping#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Typed Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getTyping <em>Typing</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getSpecific() <em>Specific</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Feature</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature that has its Type determined by this FeatureTyping.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typed Feature</em>' reference.
	 * @see #setTypedFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureTyping_TypedFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getTyping
	 * @model opposite="typing" required="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getTypedFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureTyping#getTypedFeature <em>Typed Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Feature</em>' reference.
	 * @see #getTypedFeature()
	 * @generated
	 */
	void setTypedFeature(Feature value);

} // FeatureTyping
