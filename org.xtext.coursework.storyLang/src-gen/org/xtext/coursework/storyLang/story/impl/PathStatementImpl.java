/**
 * generated by Xtext 2.30.0
 */
package org.xtext.coursework.storyLang.story.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.coursework.storyLang.story.PathStatement;
import org.xtext.coursework.storyLang.story.StoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.coursework.storyLang.story.impl.PathStatementImpl#getList <em>List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathStatementImpl extends StatementImpl implements PathStatement
{
  /**
   * The cached value of the '{@link #getList() <em>List</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected EList<String> list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathStatementImpl()
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
    return StoryPackage.Literals.PATH_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getList()
  {
    if (list == null)
    {
      list = new EDataTypeEList<String>(String.class, this, StoryPackage.PATH_STATEMENT__LIST);
    }
    return list;
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
      case StoryPackage.PATH_STATEMENT__LIST:
        return getList();
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
      case StoryPackage.PATH_STATEMENT__LIST:
        getList().clear();
        getList().addAll((Collection<? extends String>)newValue);
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
      case StoryPackage.PATH_STATEMENT__LIST:
        getList().clear();
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
      case StoryPackage.PATH_STATEMENT__LIST:
        return list != null && !list.isEmpty();
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
    result.append(" (list: ");
    result.append(list);
    result.append(')');
    return result.toString();
  }

} //PathStatementImpl
