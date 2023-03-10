/**
 */
package xenia.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import xenia.InfoEntity;
import xenia.InfoEntry;
import xenia.XeniaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xenia.impl.InfoEntityImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link xenia.impl.InfoEntityImpl#getInfoValue <em>Info Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfoEntityImpl extends MinimalEObjectImpl.Container implements InfoEntity {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<InfoEntry> entries;

	/**
	 * The default value of the '{@link #getInfoValue() <em>Info Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfoValue() <em>Info Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoValue()
	 * @generated
	 * @ordered
	 */
	protected String infoValue = INFO_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XeniaPackage.Literals.INFO_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfoEntry> getEntries() {
		if (entries == null) {
			entries = new EDataTypeEList<InfoEntry>(InfoEntry.class, this, XeniaPackage.INFO_ENTITY__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfoValue() {
		return infoValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoValue(String newInfoValue) {
		String oldInfoValue = infoValue;
		infoValue = newInfoValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XeniaPackage.INFO_ENTITY__INFO_VALUE, oldInfoValue, infoValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XeniaPackage.INFO_ENTITY__ENTRIES:
				return getEntries();
			case XeniaPackage.INFO_ENTITY__INFO_VALUE:
				return getInfoValue();
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
			case XeniaPackage.INFO_ENTITY__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends InfoEntry>)newValue);
				return;
			case XeniaPackage.INFO_ENTITY__INFO_VALUE:
				setInfoValue((String)newValue);
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
			case XeniaPackage.INFO_ENTITY__ENTRIES:
				getEntries().clear();
				return;
			case XeniaPackage.INFO_ENTITY__INFO_VALUE:
				setInfoValue(INFO_VALUE_EDEFAULT);
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
			case XeniaPackage.INFO_ENTITY__ENTRIES:
				return entries != null && !entries.isEmpty();
			case XeniaPackage.INFO_ENTITY__INFO_VALUE:
				return INFO_VALUE_EDEFAULT == null ? infoValue != null : !INFO_VALUE_EDEFAULT.equals(infoValue);
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
		result.append(" (entries: ");
		result.append(entries);
		result.append(", infoValue: ");
		result.append(infoValue);
		result.append(')');
		return result.toString();
	}

} //InfoEntityImpl
