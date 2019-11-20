/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.sysml.owl.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.owl.owl.ClassExpression;
import org.omg.sysml.owl.owl.EquivalentClasses;
import org.omg.sysml.owl.owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Classes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.impl.EquivalentClassesImpl#getClassExpressions <em>Class Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquivalentClassesImpl extends ClassAxiomImpl implements EquivalentClasses
{
  /**
   * The cached value of the '{@link #getClassExpressions() <em>Class Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassExpressions()
   * @generated
   * @ordered
   */
  protected EList<ClassExpression> classExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EquivalentClassesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OwlPackage.Literals.EQUIVALENT_CLASSES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ClassExpression> getClassExpressions()
  {
    if (classExpressions == null)
    {
      classExpressions = new EObjectContainmentEList<ClassExpression>(ClassExpression.class, this, OwlPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS);
    }
    return classExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OwlPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS:
        return ((InternalEList<?>)getClassExpressions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OwlPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS:
        return getClassExpressions();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OwlPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS:
        getClassExpressions().clear();
        getClassExpressions().addAll((Collection<? extends ClassExpression>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OwlPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS:
        getClassExpressions().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OwlPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS:
        return classExpressions != null && !classExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EquivalentClassesImpl
