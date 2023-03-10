/**
 */
package spectra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spectra.DefineRegExp;
import spectra.DefineRegExpDecl;
import spectra.SpectraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Define Reg Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.DefineRegExpImpl#getDefineRegsList <em>Define Regs List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefineRegExpImpl extends DeclImpl implements DefineRegExp {
	/**
	 * The cached value of the '{@link #getDefineRegsList() <em>Define Regs List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefineRegsList()
	 * @generated
	 * @ordered
	 */
	protected EList<DefineRegExpDecl> defineRegsList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefineRegExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.DEFINE_REG_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefineRegExpDecl> getDefineRegsList() {
		if (defineRegsList == null) {
			defineRegsList = new EObjectContainmentEList<DefineRegExpDecl>(DefineRegExpDecl.class, this, SpectraPackage.DEFINE_REG_EXP__DEFINE_REGS_LIST);
		}
		return defineRegsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.DEFINE_REG_EXP__DEFINE_REGS_LIST:
				return ((InternalEList<?>)getDefineRegsList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpectraPackage.DEFINE_REG_EXP__DEFINE_REGS_LIST:
				return getDefineRegsList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpectraPackage.DEFINE_REG_EXP__DEFINE_REGS_LIST:
				getDefineRegsList().clear();
				getDefineRegsList().addAll((Collection<? extends DefineRegExpDecl>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpectraPackage.DEFINE_REG_EXP__DEFINE_REGS_LIST:
				getDefineRegsList().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpectraPackage.DEFINE_REG_EXP__DEFINE_REGS_LIST:
				return defineRegsList != null && !defineRegsList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DefineRegExpImpl
