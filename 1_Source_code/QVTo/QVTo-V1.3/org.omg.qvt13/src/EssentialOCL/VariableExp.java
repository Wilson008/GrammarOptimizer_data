/**
 */
package EssentialOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EssentialOCL.VariableExp#getReferredVariable <em>Referred Variable</em>}</li>
 * </ul>
 *
 * @see EssentialOCL.EssentialOCLPackage#getVariableExp()
 * @model
 * @generated
 */
public interface VariableExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Referred Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Variable</em>' reference.
	 * @see #setReferredVariable(Variable)
	 * @see EssentialOCL.EssentialOCLPackage#getVariableExp_ReferredVariable()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referringExp'"
	 * @generated
	 */
	Variable getReferredVariable();

	/**
	 * Sets the value of the '{@link EssentialOCL.VariableExp#getReferredVariable <em>Referred Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Variable</em>' reference.
	 * @see #getReferredVariable()
	 * @generated
	 */
	void setReferredVariable(Variable value);

} // VariableExp
