/**
 */
package spectra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.VarType#getName <em>Name</em>}</li>
 *   <li>{@link spectra.VarType#getSubr <em>Subr</em>}</li>
 *   <li>{@link spectra.VarType#getConst <em>Const</em>}</li>
 *   <li>{@link spectra.VarType#getType <em>Type</em>}</li>
 *   <li>{@link spectra.VarType#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getVarType()
 * @model
 * @generated
 */
public interface VarType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see spectra.SpectraPackage#getVarType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link spectra.VarType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subr</em>' containment reference.
	 * @see #setSubr(Subrange)
	 * @see spectra.SpectraPackage#getVarType_Subr()
	 * @model containment="true"
	 * @generated
	 */
	Subrange getSubr();

	/**
	 * Sets the value of the '{@link spectra.VarType#getSubr <em>Subr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subr</em>' containment reference.
	 * @see #getSubr()
	 * @generated
	 */
	void setSubr(Subrange value);

	/**
	 * Returns the value of the '<em><b>Const</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.TypeConstant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' containment reference list.
	 * @see spectra.SpectraPackage#getVarType_Const()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeConstant> getConst();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeDef)
	 * @see spectra.SpectraPackage#getVarType_Type()
	 * @model
	 * @generated
	 */
	TypeDef getType();

	/**
	 * Sets the value of the '{@link spectra.VarType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDef value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.SizeDefineDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see spectra.SpectraPackage#getVarType_Dimensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SizeDefineDecl> getDimensions();

} // VarType
