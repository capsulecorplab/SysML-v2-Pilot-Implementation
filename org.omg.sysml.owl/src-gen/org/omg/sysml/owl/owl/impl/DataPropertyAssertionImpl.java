/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.owl.owl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.owl.owl.DataPropertyAssertion;
import org.omg.sysml.owl.owl.IndividualReference;
import org.omg.sysml.owl.owl.Literal;
import org.omg.sysml.owl.owl.ObjectPropertyExpression;
import org.omg.sysml.owl.owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.impl.DataPropertyAssertionImpl#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 *   <li>{@link org.omg.sysml.owl.owl.impl.DataPropertyAssertionImpl#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link org.omg.sysml.owl.owl.impl.DataPropertyAssertionImpl#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPropertyAssertionImpl extends AssertionImpl implements DataPropertyAssertion
{
  /**
   * The cached value of the '{@link #getObjectPropertyExpression() <em>Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectPropertyExpression()
   * @generated
   * @ordered
   */
  protected ObjectPropertyExpression objectPropertyExpression;

  /**
   * The cached value of the '{@link #getSourceIndividual() <em>Source Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceIndividual()
   * @generated
   * @ordered
   */
  protected IndividualReference sourceIndividual;

  /**
   * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetValue()
   * @generated
   * @ordered
   */
  protected Literal targetValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataPropertyAssertionImpl()
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
    return OwlPackage.Literals.DATA_PROPERTY_ASSERTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyExpression getObjectPropertyExpression()
  {
    return objectPropertyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectPropertyExpression(ObjectPropertyExpression newObjectPropertyExpression, NotificationChain msgs)
  {
    ObjectPropertyExpression oldObjectPropertyExpression = objectPropertyExpression;
    objectPropertyExpression = newObjectPropertyExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION, oldObjectPropertyExpression, newObjectPropertyExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectPropertyExpression(ObjectPropertyExpression newObjectPropertyExpression)
  {
    if (newObjectPropertyExpression != objectPropertyExpression)
    {
      NotificationChain msgs = null;
      if (objectPropertyExpression != null)
        msgs = ((InternalEObject)objectPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlPackage.DATA_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION, null, msgs);
      if (newObjectPropertyExpression != null)
        msgs = ((InternalEObject)newObjectPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OwlPackage.DATA_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetObjectPropertyExpression(newObjectPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION, newObjectPropertyExpression, newObjectPropertyExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndividualReference getSourceIndividual()
  {
    return sourceIndividual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSourceIndividual(IndividualReference newSourceIndividual, NotificationChain msgs)
  {
    IndividualReference oldSourceIndividual = sourceIndividual;
    sourceIndividual = newSourceIndividual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, oldSourceIndividual, newSourceIndividual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceIndividual(IndividualReference newSourceIndividual)
  {
    if (newSourceIndividual != sourceIndividual)
    {
      NotificationChain msgs = null;
      if (sourceIndividual != null)
        msgs = ((InternalEObject)sourceIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, null, msgs);
      if (newSourceIndividual != null)
        msgs = ((InternalEObject)newSourceIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OwlPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, null, msgs);
      msgs = basicSetSourceIndividual(newSourceIndividual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, newSourceIndividual, newSourceIndividual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getTargetValue()
  {
    return targetValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetValue(Literal newTargetValue, NotificationChain msgs)
  {
    Literal oldTargetValue = targetValue;
    targetValue = newTargetValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, oldTargetValue, newTargetValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetValue(Literal newTargetValue)
  {
    if (newTargetValue != targetValue)
    {
      NotificationChain msgs = null;
      if (targetValue != null)
        msgs = ((InternalEObject)targetValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, null, msgs);
      if (newTargetValue != null)
        msgs = ((InternalEObject)newTargetValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OwlPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, null, msgs);
      msgs = basicSetTargetValue(newTargetValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, newTargetValue, newTargetValue));
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
      case OwlPackage.DATA_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION:
        return basicSetObjectPropertyExpression(null, msgs);
      case OwlPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        return basicSetSourceIndividual(null, msgs);
      case OwlPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        return basicSetTargetValue(null, msgs);
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
      case OwlPackage.DATA_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION:
        return getObjectPropertyExpression();
      case OwlPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        return getSourceIndividual();
      case OwlPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        return getTargetValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OwlPackage.DATA_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION:
        setObjectPropertyExpression((ObjectPropertyExpression)newValue);
        return;
      case OwlPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        setSourceIndividual((IndividualReference)newValue);
        return;
      case OwlPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        setTargetValue((Literal)newValue);
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
      case OwlPackage.DATA_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION:
        setObjectPropertyExpression((ObjectPropertyExpression)null);
        return;
      case OwlPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        setSourceIndividual((IndividualReference)null);
        return;
      case OwlPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        setTargetValue((Literal)null);
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
      case OwlPackage.DATA_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION:
        return objectPropertyExpression != null;
      case OwlPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        return sourceIndividual != null;
      case OwlPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        return targetValue != null;
    }
    return super.eIsSet(featureID);
  }

} //DataPropertyAssertionImpl
