/**
 * generated by Xtext 2.30.0
 */
package org.xtext.coursework.storyLang.story;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nearby Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.coursework.storyLang.story.NearbyStatement#getList <em>List</em>}</li>
 * </ul>
 *
 * @see org.xtext.coursework.storyLang.story.StoryPackage#getNearbyStatement()
 * @model
 * @generated
 */
public interface NearbyStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>List</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' attribute list.
   * @see org.xtext.coursework.storyLang.story.StoryPackage#getNearbyStatement_List()
   * @model unique="false"
   * @generated
   */
  EList<String> getList();

} // NearbyStatement
