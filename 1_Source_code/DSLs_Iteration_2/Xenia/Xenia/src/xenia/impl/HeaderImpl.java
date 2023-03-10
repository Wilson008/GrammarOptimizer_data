/**
 */
package xenia.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xenia.Header;
import xenia.SuperSite;
import xenia.XeniaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xenia.impl.HeaderImpl#getAppName <em>App Name</em>}</li>
 *   <li>{@link xenia.impl.HeaderImpl#getSites <em>Sites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeaderImpl extends MinimalEObjectImpl.Container implements Header {
	/**
	 * The default value of the '{@link #getAppName() <em>App Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppName()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppName() <em>App Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppName()
	 * @generated
	 * @ordered
	 */
	protected String appName = APP_NAME_EDEFAULT;

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
	protected HeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XeniaPackage.Literals.HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppName(String newAppName) {
		String oldAppName = appName;
		appName = newAppName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XeniaPackage.HEADER__APP_NAME, oldAppName, appName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuperSite> getSites() {
		if (sites == null) {
			sites = new EObjectContainmentEList<SuperSite>(SuperSite.class, this, XeniaPackage.HEADER__SITES);
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
			case XeniaPackage.HEADER__SITES:
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
			case XeniaPackage.HEADER__APP_NAME:
				return getAppName();
			case XeniaPackage.HEADER__SITES:
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
			case XeniaPackage.HEADER__APP_NAME:
				setAppName((String)newValue);
				return;
			case XeniaPackage.HEADER__SITES:
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
			case XeniaPackage.HEADER__APP_NAME:
				setAppName(APP_NAME_EDEFAULT);
				return;
			case XeniaPackage.HEADER__SITES:
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
			case XeniaPackage.HEADER__APP_NAME:
				return APP_NAME_EDEFAULT == null ? appName != null : !APP_NAME_EDEFAULT.equals(appName);
			case XeniaPackage.HEADER__SITES:
				return sites != null && !sites.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (appName: ");
		result.append(appName);
		result.append(')');
		return result.toString();
	}

} //HeaderImpl
