/**
 */
package spectra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.Trigger#getInitPointer <em>Init Pointer</em>}</li>
 *   <li>{@link spectra.Trigger#getInitRegExp <em>Init Reg Exp</em>}</li>
 *   <li>{@link spectra.Trigger#getEffectPointer <em>Effect Pointer</em>}</li>
 *   <li>{@link spectra.Trigger#getEffectRegExp <em>Effect Reg Exp</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Init Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Pointer</em>' reference.
	 * @see #setInitPointer(DefineRegExpDecl)
	 * @see spectra.SpectraPackage#getTrigger_InitPointer()
	 * @model
	 * @generated
	 */
	DefineRegExpDecl getInitPointer();

	/**
	 * Sets the value of the '{@link spectra.Trigger#getInitPointer <em>Init Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Pointer</em>' reference.
	 * @see #getInitPointer()
	 * @generated
	 */
	void setInitPointer(DefineRegExpDecl value);

	/**
	 * Returns the value of the '<em><b>Init Reg Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Reg Exp</em>' containment reference.
	 * @see #setInitRegExp(RegExp)
	 * @see spectra.SpectraPackage#getTrigger_InitRegExp()
	 * @model containment="true"
	 * @generated
	 */
	RegExp getInitRegExp();

	/**
	 * Sets the value of the '{@link spectra.Trigger#getInitRegExp <em>Init Reg Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Reg Exp</em>' containment reference.
	 * @see #getInitRegExp()
	 * @generated
	 */
	void setInitRegExp(RegExp value);

	/**
	 * Returns the value of the '<em><b>Effect Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect Pointer</em>' reference.
	 * @see #setEffectPointer(DefineRegExpDecl)
	 * @see spectra.SpectraPackage#getTrigger_EffectPointer()
	 * @model
	 * @generated
	 */
	DefineRegExpDecl getEffectPointer();

	/**
	 * Sets the value of the '{@link spectra.Trigger#getEffectPointer <em>Effect Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect Pointer</em>' reference.
	 * @see #getEffectPointer()
	 * @generated
	 */
	void setEffectPointer(DefineRegExpDecl value);

	/**
	 * Returns the value of the '<em><b>Effect Reg Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect Reg Exp</em>' containment reference.
	 * @see #setEffectRegExp(RegExp)
	 * @see spectra.SpectraPackage#getTrigger_EffectRegExp()
	 * @model containment="true"
	 * @generated
	 */
	RegExp getEffectRegExp();

	/**
	 * Sets the value of the '{@link spectra.Trigger#getEffectRegExp <em>Effect Reg Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect Reg Exp</em>' containment reference.
	 * @see #getEffectRegExp()
	 * @generated
	 */
	void setEffectRegExp(RegExp value);

} // Trigger
