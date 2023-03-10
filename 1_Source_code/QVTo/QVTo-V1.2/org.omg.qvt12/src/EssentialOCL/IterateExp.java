/**
 */
package EssentialOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterate Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EssentialOCL.IterateExp#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see EssentialOCL.EssentialOCLPackage#getIterateExp()
 * @model
 * @generated
 */
public interface IterateExp extends LoopExp {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Variable)
	 * @see EssentialOCL.EssentialOCLPackage#getIterateExp_Result()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='baseExp'"
	 * @generated
	 */
	Variable getResult();

	/**
	 * Sets the value of the '{@link EssentialOCL.IterateExp#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Variable value);

} // IterateExp
