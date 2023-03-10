/**
 */
package xenia;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xenia.InfoProperty#getPage <em>Page</em>}</li>
 *   <li>{@link xenia.InfoProperty#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see xenia.XeniaPackage#getInfoProperty()
 * @model
 * @generated
 */
public interface InfoProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' reference.
	 * @see #setPage(Site)
	 * @see xenia.XeniaPackage#getInfoProperty_Page()
	 * @model
	 * @generated
	 */
	Site getPage();

	/**
	 * Sets the value of the '{@link xenia.InfoProperty#getPage <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Site value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link xenia.InfoEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see xenia.XeniaPackage#getInfoProperty_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<InfoEntity> getEntities();

} // InfoProperty
