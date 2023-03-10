/**
 */
package xenia.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import xenia.RedirectPage;
import xenia.Site;
import xenia.XeniaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redirect Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xenia.impl.RedirectPageImpl#getSite <em>Site</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedirectPageImpl extends MinimalEObjectImpl.Container implements RedirectPage {
	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected EList<Site> site;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedirectPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XeniaPackage.Literals.REDIRECT_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Site> getSite() {
		if (site == null) {
			site = new EObjectResolvingEList<Site>(Site.class, this, XeniaPackage.REDIRECT_PAGE__SITE);
		}
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XeniaPackage.REDIRECT_PAGE__SITE:
				return getSite();
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
			case XeniaPackage.REDIRECT_PAGE__SITE:
				getSite().clear();
				getSite().addAll((Collection<? extends Site>)newValue);
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
			case XeniaPackage.REDIRECT_PAGE__SITE:
				getSite().clear();
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
			case XeniaPackage.REDIRECT_PAGE__SITE:
				return site != null && !site.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RedirectPageImpl
