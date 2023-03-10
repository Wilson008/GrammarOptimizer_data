/**
 */
package spectra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.DefineArray#getSimpleExprs <em>Simple Exprs</em>}</li>
 *   <li>{@link spectra.DefineArray#getInnerArrays <em>Inner Arrays</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getDefineArray()
 * @model
 * @generated
 */
public interface DefineArray extends EObject {
	/**
	 * Returns the value of the '<em><b>Simple Exprs</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TemporalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Exprs</em>' containment reference list.
	 * @see spectra.SpectraPackage#getDefineArray_SimpleExprs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalExpression> getSimpleExprs();

	/**
	 * Returns the value of the '<em><b>Inner Arrays</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.DefineArray}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Arrays</em>' containment reference list.
	 * @see spectra.SpectraPackage#getDefineArray_InnerArrays()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefineArray> getInnerArrays();

} // DefineArray
