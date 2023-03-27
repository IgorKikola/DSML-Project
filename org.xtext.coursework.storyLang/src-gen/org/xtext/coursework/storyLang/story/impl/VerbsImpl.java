/**
 * generated by Xtext 2.25.0
 */
package org.xtext.coursework.storyLang.story.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.coursework.storyLang.story.StoryPackage;
import org.xtext.coursework.storyLang.story.Verbs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verbs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.coursework.storyLang.story.impl.VerbsImpl#getVerbs <em>Verbs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerbsImpl extends MinimalEObjectImpl.Container implements Verbs
{
  /**
   * The default value of the '{@link #getVerbs() <em>Verbs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerbs()
   * @generated
   * @ordered
   */
  protected static final String VERBS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVerbs() <em>Verbs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerbs()
   * @generated
   * @ordered
   */
  protected String verbs = VERBS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerbsImpl()
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
    return StoryPackage.Literals.VERBS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVerbs()
  {
    return verbs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVerbs(String newVerbs)
  {
    String oldVerbs = verbs;
    verbs = newVerbs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StoryPackage.VERBS__VERBS, oldVerbs, verbs));
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
      case StoryPackage.VERBS__VERBS:
        return getVerbs();
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
      case StoryPackage.VERBS__VERBS:
        setVerbs((String)newValue);
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
      case StoryPackage.VERBS__VERBS:
        setVerbs(VERBS_EDEFAULT);
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
      case StoryPackage.VERBS__VERBS:
        return VERBS_EDEFAULT == null ? verbs != null : !VERBS_EDEFAULT.equals(verbs);
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
    result.append(" (verbs: ");
    result.append(verbs);
    result.append(')');
    return result.toString();
  }

} //VerbsImpl
