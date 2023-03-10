/**
 */
package ImperativeOCL;

import EMOF.Type;

import EssentialOCL.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.RaiseExp#getArgument <em>Argument</em>}</li>
 *   <li>{@link ImperativeOCL.RaiseExp#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @see ImperativeOCL.ImperativeOCLPackage#getRaiseExp()
 * @model
 * @generated
 */
public interface RaiseExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(OclExpression)
	 * @see ImperativeOCL.ImperativeOCLPackage#getRaiseExp_Argument()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='raiseExp'"
	 * @generated
	 */
	OclExpression getArgument();

	/**
	 * Sets the value of the '{@link ImperativeOCL.RaiseExp#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' reference.
	 * @see #setException(Type)
	 * @see ImperativeOCL.ImperativeOCLPackage#getRaiseExp_Exception()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='raiseExpression'"
	 * @generated
	 */
	Type getException();

	/**
	 * Sets the value of the '{@link ImperativeOCL.RaiseExp#getException <em>Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(Type value);

} // RaiseExp
