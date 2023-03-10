/**
 */
package xcore;

import org.eclipse.xtext.xbase.XBlockExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XData Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XDataType#isSerializable <em>Serializable</em>}</li>
 *   <li>{@link xcore.XDataType#getCreateBody <em>Create Body</em>}</li>
 *   <li>{@link xcore.XDataType#getConvertBody <em>Convert Body</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXDataType()
 * @model
 * @generated
 */
public interface XDataType extends XClassifier {
	/**
	 * Returns the value of the '<em><b>Serializable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serializable</em>' attribute.
	 * @see #setSerializable(boolean)
	 * @see xcore.XcorePackage#getXDataType_Serializable()
	 * @model default="true"
	 * @generated
	 */
	boolean isSerializable();

	/**
	 * Sets the value of the '{@link xcore.XDataType#isSerializable <em>Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serializable</em>' attribute.
	 * @see #isSerializable()
	 * @generated
	 */
	void setSerializable(boolean value);

	/**
	 * Returns the value of the '<em><b>Create Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Body</em>' containment reference.
	 * @see #setCreateBody(XBlockExpression)
	 * @see xcore.XcorePackage#getXDataType_CreateBody()
	 * @model containment="true"
	 * @generated
	 */
	XBlockExpression getCreateBody();

	/**
	 * Sets the value of the '{@link xcore.XDataType#getCreateBody <em>Create Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Body</em>' containment reference.
	 * @see #getCreateBody()
	 * @generated
	 */
	void setCreateBody(XBlockExpression value);

	/**
	 * Returns the value of the '<em><b>Convert Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convert Body</em>' containment reference.
	 * @see #setConvertBody(XBlockExpression)
	 * @see xcore.XcorePackage#getXDataType_ConvertBody()
	 * @model containment="true"
	 * @generated
	 */
	XBlockExpression getConvertBody();

	/**
	 * Sets the value of the '{@link xcore.XDataType#getConvertBody <em>Convert Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Convert Body</em>' containment reference.
	 * @see #getConvertBody()
	 * @generated
	 */
	void setConvertBody(XBlockExpression value);

} // XDataType
