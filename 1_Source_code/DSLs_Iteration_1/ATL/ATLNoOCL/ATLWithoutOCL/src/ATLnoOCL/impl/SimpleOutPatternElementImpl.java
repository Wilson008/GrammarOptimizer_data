/**
 */
package ATLnoOCL.impl;

import ATLnoOCL.ATLnoOCLPackage;
import ATLnoOCL.OCLDummy;
import ATLnoOCL.SimpleOutPatternElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Out Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.impl.SimpleOutPatternElementImpl#getReverseBindings <em>Reverse Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleOutPatternElementImpl extends OutPatternElementImpl implements SimpleOutPatternElement {
	/**
	 * The cached value of the '{@link #getReverseBindings() <em>Reverse Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLDummy> reverseBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleOutPatternElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATLnoOCLPackage.Literals.SIMPLE_OUT_PATTERN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLDummy> getReverseBindings() {
		if (reverseBindings == null) {
			reverseBindings = new EObjectContainmentEList<OCLDummy>(OCLDummy.class, this, ATLnoOCLPackage.SIMPLE_OUT_PATTERN_ELEMENT__REVERSE_BINDINGS);
		}
		return reverseBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATLnoOCLPackage.SIMPLE_OUT_PATTERN_ELEMENT__REVERSE_BINDINGS:
				return ((InternalEList<?>)getReverseBindings()).basicRemove(otherEnd, msgs);
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
			case ATLnoOCLPackage.SIMPLE_OUT_PATTERN_ELEMENT__REVERSE_BINDINGS:
				return getReverseBindings();
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
			case ATLnoOCLPackage.SIMPLE_OUT_PATTERN_ELEMENT__REVERSE_BINDINGS:
				getReverseBindings().clear();
				getReverseBindings().addAll((Collection<? extends OCLDummy>)newValue);
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
			case ATLnoOCLPackage.SIMPLE_OUT_PATTERN_ELEMENT__REVERSE_BINDINGS:
				getReverseBindings().clear();
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
			case ATLnoOCLPackage.SIMPLE_OUT_PATTERN_ELEMENT__REVERSE_BINDINGS:
				return reverseBindings != null && !reverseBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimpleOutPatternElementImpl
