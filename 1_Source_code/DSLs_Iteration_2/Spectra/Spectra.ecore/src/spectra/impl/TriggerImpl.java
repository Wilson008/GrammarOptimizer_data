/**
 */
package spectra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import spectra.DefineRegExpDecl;
import spectra.RegExp;
import spectra.SpectraPackage;
import spectra.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.TriggerImpl#getInitPointer <em>Init Pointer</em>}</li>
 *   <li>{@link spectra.impl.TriggerImpl#getInitRegExp <em>Init Reg Exp</em>}</li>
 *   <li>{@link spectra.impl.TriggerImpl#getEffectPointer <em>Effect Pointer</em>}</li>
 *   <li>{@link spectra.impl.TriggerImpl#getEffectRegExp <em>Effect Reg Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger {
	/**
	 * The cached value of the '{@link #getInitPointer() <em>Init Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitPointer()
	 * @generated
	 * @ordered
	 */
	protected DefineRegExpDecl initPointer;

	/**
	 * The cached value of the '{@link #getInitRegExp() <em>Init Reg Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitRegExp()
	 * @generated
	 * @ordered
	 */
	protected RegExp initRegExp;

	/**
	 * The cached value of the '{@link #getEffectPointer() <em>Effect Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectPointer()
	 * @generated
	 * @ordered
	 */
	protected DefineRegExpDecl effectPointer;

	/**
	 * The cached value of the '{@link #getEffectRegExp() <em>Effect Reg Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectRegExp()
	 * @generated
	 * @ordered
	 */
	protected RegExp effectRegExp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineRegExpDecl getInitPointer() {
		if (initPointer != null && initPointer.eIsProxy()) {
			InternalEObject oldInitPointer = (InternalEObject)initPointer;
			initPointer = (DefineRegExpDecl)eResolveProxy(oldInitPointer);
			if (initPointer != oldInitPointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpectraPackage.TRIGGER__INIT_POINTER, oldInitPointer, initPointer));
			}
		}
		return initPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineRegExpDecl basicGetInitPointer() {
		return initPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitPointer(DefineRegExpDecl newInitPointer) {
		DefineRegExpDecl oldInitPointer = initPointer;
		initPointer = newInitPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TRIGGER__INIT_POINTER, oldInitPointer, initPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegExp getInitRegExp() {
		return initRegExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitRegExp(RegExp newInitRegExp, NotificationChain msgs) {
		RegExp oldInitRegExp = initRegExp;
		initRegExp = newInitRegExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.TRIGGER__INIT_REG_EXP, oldInitRegExp, newInitRegExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitRegExp(RegExp newInitRegExp) {
		if (newInitRegExp != initRegExp) {
			NotificationChain msgs = null;
			if (initRegExp != null)
				msgs = ((InternalEObject)initRegExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TRIGGER__INIT_REG_EXP, null, msgs);
			if (newInitRegExp != null)
				msgs = ((InternalEObject)newInitRegExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TRIGGER__INIT_REG_EXP, null, msgs);
			msgs = basicSetInitRegExp(newInitRegExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TRIGGER__INIT_REG_EXP, newInitRegExp, newInitRegExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineRegExpDecl getEffectPointer() {
		if (effectPointer != null && effectPointer.eIsProxy()) {
			InternalEObject oldEffectPointer = (InternalEObject)effectPointer;
			effectPointer = (DefineRegExpDecl)eResolveProxy(oldEffectPointer);
			if (effectPointer != oldEffectPointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpectraPackage.TRIGGER__EFFECT_POINTER, oldEffectPointer, effectPointer));
			}
		}
		return effectPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineRegExpDecl basicGetEffectPointer() {
		return effectPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectPointer(DefineRegExpDecl newEffectPointer) {
		DefineRegExpDecl oldEffectPointer = effectPointer;
		effectPointer = newEffectPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TRIGGER__EFFECT_POINTER, oldEffectPointer, effectPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegExp getEffectRegExp() {
		return effectRegExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectRegExp(RegExp newEffectRegExp, NotificationChain msgs) {
		RegExp oldEffectRegExp = effectRegExp;
		effectRegExp = newEffectRegExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.TRIGGER__EFFECT_REG_EXP, oldEffectRegExp, newEffectRegExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectRegExp(RegExp newEffectRegExp) {
		if (newEffectRegExp != effectRegExp) {
			NotificationChain msgs = null;
			if (effectRegExp != null)
				msgs = ((InternalEObject)effectRegExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TRIGGER__EFFECT_REG_EXP, null, msgs);
			if (newEffectRegExp != null)
				msgs = ((InternalEObject)newEffectRegExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TRIGGER__EFFECT_REG_EXP, null, msgs);
			msgs = basicSetEffectRegExp(newEffectRegExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TRIGGER__EFFECT_REG_EXP, newEffectRegExp, newEffectRegExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.TRIGGER__INIT_REG_EXP:
				return basicSetInitRegExp(null, msgs);
			case SpectraPackage.TRIGGER__EFFECT_REG_EXP:
				return basicSetEffectRegExp(null, msgs);
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
			case SpectraPackage.TRIGGER__INIT_POINTER:
				if (resolve) return getInitPointer();
				return basicGetInitPointer();
			case SpectraPackage.TRIGGER__INIT_REG_EXP:
				return getInitRegExp();
			case SpectraPackage.TRIGGER__EFFECT_POINTER:
				if (resolve) return getEffectPointer();
				return basicGetEffectPointer();
			case SpectraPackage.TRIGGER__EFFECT_REG_EXP:
				return getEffectRegExp();
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
			case SpectraPackage.TRIGGER__INIT_POINTER:
				setInitPointer((DefineRegExpDecl)newValue);
				return;
			case SpectraPackage.TRIGGER__INIT_REG_EXP:
				setInitRegExp((RegExp)newValue);
				return;
			case SpectraPackage.TRIGGER__EFFECT_POINTER:
				setEffectPointer((DefineRegExpDecl)newValue);
				return;
			case SpectraPackage.TRIGGER__EFFECT_REG_EXP:
				setEffectRegExp((RegExp)newValue);
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
			case SpectraPackage.TRIGGER__INIT_POINTER:
				setInitPointer((DefineRegExpDecl)null);
				return;
			case SpectraPackage.TRIGGER__INIT_REG_EXP:
				setInitRegExp((RegExp)null);
				return;
			case SpectraPackage.TRIGGER__EFFECT_POINTER:
				setEffectPointer((DefineRegExpDecl)null);
				return;
			case SpectraPackage.TRIGGER__EFFECT_REG_EXP:
				setEffectRegExp((RegExp)null);
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
			case SpectraPackage.TRIGGER__INIT_POINTER:
				return initPointer != null;
			case SpectraPackage.TRIGGER__INIT_REG_EXP:
				return initRegExp != null;
			case SpectraPackage.TRIGGER__EFFECT_POINTER:
				return effectPointer != null;
			case SpectraPackage.TRIGGER__EFFECT_REG_EXP:
				return effectRegExp != null;
		}
		return super.eIsSet(featureID);
	}

} //TriggerImpl
