/**
 */
package xcore.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xcore.XGenericType;
import xcore.XTypeParameter;
import xcore.XcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XType Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xcore.impl.XTypeParameterImpl#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XTypeParameterImpl extends XNamedElementImpl implements XTypeParameter {
	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected EList<XGenericType> bounds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XTypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.XTYPE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XGenericType> getBounds() {
		if (bounds == null) {
			bounds = new EObjectContainmentEList<XGenericType>(XGenericType.class, this, XcorePackage.XTYPE_PARAMETER__BOUNDS);
		}
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.XTYPE_PARAMETER__BOUNDS:
				return ((InternalEList<?>)getBounds()).basicRemove(otherEnd, msgs);
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
			case XcorePackage.XTYPE_PARAMETER__BOUNDS:
				return getBounds();
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
			case XcorePackage.XTYPE_PARAMETER__BOUNDS:
				getBounds().clear();
				getBounds().addAll((Collection<? extends XGenericType>)newValue);
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
			case XcorePackage.XTYPE_PARAMETER__BOUNDS:
				getBounds().clear();
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
			case XcorePackage.XTYPE_PARAMETER__BOUNDS:
				return bounds != null && !bounds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //XTypeParameterImpl
