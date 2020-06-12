/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.omg.sysml.lang.sysml.InterfaceDefinition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.InterfaceDefinitionImpl#getInterfaceEnd <em>Interface End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceDefinitionImpl extends ConnectionDefinitionImpl implements InterfaceDefinition {

	public static final String INTERFACE_DEFINITION_SUPERCLASS_DEFAULT = "Blocks::Interface";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.INTERFACE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<PortUsage> getInterfaceEnd() {
		EList<PortUsage> ends = new EObjectEList<PortUsage>(PortUsage.class, this, SysMLPackage.INTERFACE_DEFINITION__INTERFACE_END);
		super.getAssociationEnd().stream().
			filter(end->end instanceof PortUsage).
			forEachOrdered(end->ends.add((PortUsage)end));
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInterfaceEnd() {
		return !getInterfaceEnd().isEmpty();
	}

	@Override
	protected String getDefaultSupertype() {
		return getOwnedEndFeature().size() > 2? 
					AssociationImpl.ASSOCIATION_SUPERCLASS_DEFAULT: 
					INTERFACE_DEFINITION_SUPERCLASS_DEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.INTERFACE_DEFINITION__INTERFACE_END:
				return getInterfaceEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.INTERFACE_DEFINITION__INTERFACE_END:
				getInterfaceEnd().clear();
				getInterfaceEnd().addAll((Collection<? extends PortUsage>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.INTERFACE_DEFINITION__INTERFACE_END:
				getInterfaceEnd().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.INTERFACE_DEFINITION__CONNECTION_END:
				return isSetConnectionEnd();
			case SysMLPackage.INTERFACE_DEFINITION__INTERFACE_END:
				return isSetInterfaceEnd();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Usage> getConnectionEnd() {
		@SuppressWarnings("unchecked")
		EList<Usage> interfaceEnd = (EList<Usage>)((EList<?>)getInterfaceEnd());
		return interfaceEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectionEnd() {
  		return false;
	}

} //InterfaceDefinitionImpl
