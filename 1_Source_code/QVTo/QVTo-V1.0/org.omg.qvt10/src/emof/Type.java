/**
 */
package emof;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emof.Type#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see emof.EmofPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link emof.Package#getOwnedType <em>Owned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(emof.Package)
	 * @see emof.EmofPackage#getType_Package()
	 * @see emof.Package#getOwnedType
	 * @model opposite="ownedType"
	 * @generated
	 */
	emof.Package getPackage();

	/**
	 * Sets the value of the '{@link emof.Type#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(emof.Package value);

} // Type
