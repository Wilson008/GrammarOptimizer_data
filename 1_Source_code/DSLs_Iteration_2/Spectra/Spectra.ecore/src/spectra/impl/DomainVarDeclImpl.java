/**
 */
package spectra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spectra.DomainVarDecl;
import spectra.SpectraPackage;
import spectra.VarType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Var Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.DomainVarDeclImpl#getDomainType <em>Domain Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainVarDeclImpl extends ReferrableImpl implements DomainVarDecl {
	/**
	 * The cached value of the '{@link #getDomainType() <em>Domain Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainType()
	 * @generated
	 * @ordered
	 */
	protected VarType domainType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainVarDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.DOMAIN_VAR_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarType getDomainType() {
		return domainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainType(VarType newDomainType, NotificationChain msgs) {
		VarType oldDomainType = domainType;
		domainType = newDomainType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.DOMAIN_VAR_DECL__DOMAIN_TYPE, oldDomainType, newDomainType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainType(VarType newDomainType) {
		if (newDomainType != domainType) {
			NotificationChain msgs = null;
			if (domainType != null)
				msgs = ((InternalEObject)domainType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.DOMAIN_VAR_DECL__DOMAIN_TYPE, null, msgs);
			if (newDomainType != null)
				msgs = ((InternalEObject)newDomainType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.DOMAIN_VAR_DECL__DOMAIN_TYPE, null, msgs);
			msgs = basicSetDomainType(newDomainType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.DOMAIN_VAR_DECL__DOMAIN_TYPE, newDomainType, newDomainType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.DOMAIN_VAR_DECL__DOMAIN_TYPE:
				return basicSetDomainType(null, msgs);
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
			case SpectraPackage.DOMAIN_VAR_DECL__DOMAIN_TYPE:
				return getDomainType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpectraPackage.DOMAIN_VAR_DECL__DOMAIN_TYPE:
				setDomainType((VarType)newValue);
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
			case SpectraPackage.DOMAIN_VAR_DECL__DOMAIN_TYPE:
				setDomainType((VarType)null);
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
			case SpectraPackage.DOMAIN_VAR_DECL__DOMAIN_TYPE:
				return domainType != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainVarDeclImpl
