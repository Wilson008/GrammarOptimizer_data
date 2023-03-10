/**
 */
package xenia.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xenia.SiteWithModal;
import xenia.SuperSite;
import xenia.XeniaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site With Modal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xenia.impl.SiteWithModalImpl#getSites <em>Sites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiteWithModalImpl extends SuperSiteImpl implements SiteWithModal {
	/**
	 * The cached value of the '{@link #getSites() <em>Sites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSites()
	 * @generated
	 * @ordered
	 */
	protected EList<SuperSite> sites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteWithModalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XeniaPackage.Literals.SITE_WITH_MODAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuperSite> getSites() {
		if (sites == null) {
			sites = new EObjectContainmentEList<SuperSite>(SuperSite.class, this, XeniaPackage.SITE_WITH_MODAL__SITES);
		}
		return sites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XeniaPackage.SITE_WITH_MODAL__SITES:
				return ((InternalEList<?>)getSites()).basicRemove(otherEnd, msgs);
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
			case XeniaPackage.SITE_WITH_MODAL__SITES:
				return getSites();
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
			case XeniaPackage.SITE_WITH_MODAL__SITES:
				getSites().clear();
				getSites().addAll((Collection<? extends SuperSite>)newValue);
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
			case XeniaPackage.SITE_WITH_MODAL__SITES:
				getSites().clear();
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
			case XeniaPackage.SITE_WITH_MODAL__SITES:
				return sites != null && !sites.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SiteWithModalImpl
