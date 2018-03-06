/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.xtext.sysML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.xtext.sysML.ConnectableFeature;
import org.omg.sysml.xtext.sysML.ConnectionDirection;
import org.omg.sysml.xtext.sysML.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectable Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.xtext.sysML.impl.ConnectableFeatureImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectableFeatureImpl extends FeatureImpl implements ConnectableFeature
{
  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected ConnectionDirection direction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectableFeatureImpl()
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
    return SysMLPackage.Literals.CONNECTABLE_FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionDirection getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirection(ConnectionDirection newDirection, NotificationChain msgs)
  {
    ConnectionDirection oldDirection = direction;
    direction = newDirection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTABLE_FEATURE__DIRECTION, oldDirection, newDirection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(ConnectionDirection newDirection)
  {
    if (newDirection != direction)
    {
      NotificationChain msgs = null;
      if (direction != null)
        msgs = ((InternalEObject)direction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTABLE_FEATURE__DIRECTION, null, msgs);
      if (newDirection != null)
        msgs = ((InternalEObject)newDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTABLE_FEATURE__DIRECTION, null, msgs);
      msgs = basicSetDirection(newDirection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTABLE_FEATURE__DIRECTION, newDirection, newDirection));
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
      case SysMLPackage.CONNECTABLE_FEATURE__DIRECTION:
        return basicSetDirection(null, msgs);
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
      case SysMLPackage.CONNECTABLE_FEATURE__DIRECTION:
        return getDirection();
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
      case SysMLPackage.CONNECTABLE_FEATURE__DIRECTION:
        setDirection((ConnectionDirection)newValue);
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
      case SysMLPackage.CONNECTABLE_FEATURE__DIRECTION:
        setDirection((ConnectionDirection)null);
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
      case SysMLPackage.CONNECTABLE_FEATURE__DIRECTION:
        return direction != null;
    }
    return super.eIsSet(featureID);
  }

} //ConnectableFeatureImpl
