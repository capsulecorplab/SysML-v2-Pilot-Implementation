/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.sysml.owl.owl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.owl.owl.DataExactCardinality;
import org.omg.sysml.owl.owl.DataPropertyExpression;
import org.omg.sysml.owl.owl.DataRange;
import org.omg.sysml.owl.owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Exact Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.impl.DataExactCardinalityImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.omg.sysml.owl.owl.impl.DataExactCardinalityImpl#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 *   <li>{@link org.omg.sysml.owl.owl.impl.DataExactCardinalityImpl#getDataRange <em>Data Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataExactCardinalityImpl extends ClassExpressionImpl implements DataExactCardinality
{
  /**
   * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
  protected static final int CARDINALITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
  protected int cardinality = CARDINALITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getDataPropertyExpression() <em>Data Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataPropertyExpression()
   * @generated
   * @ordered
   */
  protected DataPropertyExpression dataPropertyExpression;

  /**
   * The cached value of the '{@link #getDataRange() <em>Data Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataRange()
   * @generated
   * @ordered
   */
  protected DataRange dataRange;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataExactCardinalityImpl()
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
    return OwlPackage.Literals.DATA_EXACT_CARDINALITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getCardinality()
  {
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCardinality(int newCardinality)
  {
    int oldCardinality = cardinality;
    cardinality = newCardinality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_EXACT_CARDINALITY__CARDINALITY, oldCardinality, cardinality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataPropertyExpression getDataPropertyExpression()
  {
    return dataPropertyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataPropertyExpression(DataPropertyExpression newDataPropertyExpression, NotificationChain msgs)
  {
    DataPropertyExpression oldDataPropertyExpression = dataPropertyExpression;
    dataPropertyExpression = newDataPropertyExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION, oldDataPropertyExpression, newDataPropertyExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDataPropertyExpression(DataPropertyExpression newDataPropertyExpression)
  {
    if (newDataPropertyExpression != dataPropertyExpression)
    {
      NotificationChain msgs = null;
      if (dataPropertyExpression != null)
        msgs = ((InternalEObject)dataPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION, null, msgs);
      if (newDataPropertyExpression != null)
        msgs = ((InternalEObject)newDataPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OwlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetDataPropertyExpression(newDataPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION, newDataPropertyExpression, newDataPropertyExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataRange getDataRange()
  {
    return dataRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataRange(DataRange newDataRange, NotificationChain msgs)
  {
    DataRange oldDataRange = dataRange;
    dataRange = newDataRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_EXACT_CARDINALITY__DATA_RANGE, oldDataRange, newDataRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDataRange(DataRange newDataRange)
  {
    if (newDataRange != dataRange)
    {
      NotificationChain msgs = null;
      if (dataRange != null)
        msgs = ((InternalEObject)dataRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlPackage.DATA_EXACT_CARDINALITY__DATA_RANGE, null, msgs);
      if (newDataRange != null)
        msgs = ((InternalEObject)newDataRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OwlPackage.DATA_EXACT_CARDINALITY__DATA_RANGE, null, msgs);
      msgs = basicSetDataRange(newDataRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_EXACT_CARDINALITY__DATA_RANGE, newDataRange, newDataRange));
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
      case OwlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION:
        return basicSetDataPropertyExpression(null, msgs);
      case OwlPackage.DATA_EXACT_CARDINALITY__DATA_RANGE:
        return basicSetDataRange(null, msgs);
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
      case OwlPackage.DATA_EXACT_CARDINALITY__CARDINALITY:
        return getCardinality();
      case OwlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION:
        return getDataPropertyExpression();
      case OwlPackage.DATA_EXACT_CARDINALITY__DATA_RANGE:
        return getDataRange();
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
      case OwlPackage.DATA_EXACT_CARDINALITY__CARDINALITY:
        setCardinality((Integer)newValue);
        return;
      case OwlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION:
        setDataPropertyExpression((DataPropertyExpression)newValue);
        return;
      case OwlPackage.DATA_EXACT_CARDINALITY__DATA_RANGE:
        setDataRange((DataRange)newValue);
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
      case OwlPackage.DATA_EXACT_CARDINALITY__CARDINALITY:
        setCardinality(CARDINALITY_EDEFAULT);
        return;
      case OwlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION:
        setDataPropertyExpression((DataPropertyExpression)null);
        return;
      case OwlPackage.DATA_EXACT_CARDINALITY__DATA_RANGE:
        setDataRange((DataRange)null);
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
      case OwlPackage.DATA_EXACT_CARDINALITY__CARDINALITY:
        return cardinality != CARDINALITY_EDEFAULT;
      case OwlPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION:
        return dataPropertyExpression != null;
      case OwlPackage.DATA_EXACT_CARDINALITY__DATA_RANGE:
        return dataRange != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (cardinality: ");
    result.append(cardinality);
    result.append(')');
    return result.toString();
  }

} //DataExactCardinalityImpl
