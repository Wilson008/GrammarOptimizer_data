/**
 */
package spectra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.Define#getDefineList <em>Define List</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getDefine()
 * @model
 * @generated
 */
public interface Define extends Decl {
	/**
	 * Returns the value of the '<em><b>Define List</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.DefineDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Define List</em>' containment reference list.
	 * @see spectra.SpectraPackage#getDefine_DefineList()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefineDecl> getDefineList();

} // Define