/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An ActionUsage is a Usage that is also a Step, and, so, is typed by a Behavior. Nominally, if the type is an ActionDefinition, an ActionUsage is a Usage of that ActionDefinition within a system. However, other kinds of kernel Behaviors are also allowed, to permit use of Behaviors from the Kernel Library.</p>
 * 
 * <p>An ActionUsage (other than a PerformActionUsage owned by a Part) must subset, directly or indirectly, either the base ActionUsage <code>actions</code> from the Systems model library, if it is not a composite feature, or the ActionUsage <code>subactions</code> inherited from its owner, if it is a composite feature.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ActionUsage#getActionDefinition <em>Action Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getActionUsage()
 * @model
 * @generated
 */
public interface ActionUsage extends Usage, Step {
	/**
	 * Returns the value of the '<em><b>Action Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Behavior}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Step#getBehavior() <em>Behavior</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Behaviors that are the types of this ActionUsage. Nominally, these would be ActionDefinitions, but other kings of Kernel Behaviors are also allowed, to permit use of Behaviors from the Kernel Library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getActionUsage_ActionDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedAction'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Behavior> getActionDefinition();

} // Action
