/**
 */
package spectra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import spectra.BooleanTerm;
import spectra.RegExp;
import spectra.SpectraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reg Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.RegExpImpl#getVal <em>Val</em>}</li>
 *   <li>{@link spectra.impl.RegExpImpl#getAssrt <em>Assrt</em>}</li>
 *   <li>{@link spectra.impl.RegExpImpl#isEmpty <em>Empty</em>}</li>
 *   <li>{@link spectra.impl.RegExpImpl#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegExpImpl extends MinimalEObjectImpl.Container implements RegExp {
	/**
	 * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected static final String VAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected String val = VAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssrt() <em>Assrt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssrt()
	 * @generated
	 * @ordered
	 */
	protected BooleanTerm assrt;

	/**
	 * The default value of the '{@link #isEmpty() <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMPTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmpty() <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmpty()
	 * @generated
	 * @ordered
	 */
	protected boolean empty = EMPTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected RegExp left;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.REG_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVal() {
		return val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVal(String newVal) {
		String oldVal = val;
		val = newVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.REG_EXP__VAL, oldVal, val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanTerm getAssrt() {
		return assrt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssrt(BooleanTerm newAssrt, NotificationChain msgs) {
		BooleanTerm oldAssrt = assrt;
		assrt = newAssrt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.REG_EXP__ASSRT, oldAssrt, newAssrt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssrt(BooleanTerm newAssrt) {
		if (newAssrt != assrt) {
			NotificationChain msgs = null;
			if (assrt != null)
				msgs = ((InternalEObject)assrt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.REG_EXP__ASSRT, null, msgs);
			if (newAssrt != null)
				msgs = ((InternalEObject)newAssrt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.REG_EXP__ASSRT, null, msgs);
			msgs = basicSetAssrt(newAssrt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.REG_EXP__ASSRT, newAssrt, newAssrt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmpty() {
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpty(boolean newEmpty) {
		boolean oldEmpty = empty;
		empty = newEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.REG_EXP__EMPTY, oldEmpty, empty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegExp getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(RegExp newLeft, NotificationChain msgs) {
		RegExp oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.REG_EXP__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(RegExp newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.REG_EXP__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.REG_EXP__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.REG_EXP__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.REG_EXP__ASSRT:
				return basicSetAssrt(null, msgs);
			case SpectraPackage.REG_EXP__LEFT:
				return basicSetLeft(null, msgs);
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
			case SpectraPackage.REG_EXP__VAL:
				return getVal();
			case SpectraPackage.REG_EXP__ASSRT:
				return getAssrt();
			case SpectraPackage.REG_EXP__EMPTY:
				return isEmpty();
			case SpectraPackage.REG_EXP__LEFT:
				return getLeft();
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
			case SpectraPackage.REG_EXP__VAL:
				setVal((String)newValue);
				return;
			case SpectraPackage.REG_EXP__ASSRT:
				setAssrt((BooleanTerm)newValue);
				return;
			case SpectraPackage.REG_EXP__EMPTY:
				setEmpty((Boolean)newValue);
				return;
			case SpectraPackage.REG_EXP__LEFT:
				setLeft((RegExp)newValue);
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
			case SpectraPackage.REG_EXP__VAL:
				setVal(VAL_EDEFAULT);
				return;
			case SpectraPackage.REG_EXP__ASSRT:
				setAssrt((BooleanTerm)null);
				return;
			case SpectraPackage.REG_EXP__EMPTY:
				setEmpty(EMPTY_EDEFAULT);
				return;
			case SpectraPackage.REG_EXP__LEFT:
				setLeft((RegExp)null);
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
			case SpectraPackage.REG_EXP__VAL:
				return VAL_EDEFAULT == null ? val != null : !VAL_EDEFAULT.equals(val);
			case SpectraPackage.REG_EXP__ASSRT:
				return assrt != null;
			case SpectraPackage.REG_EXP__EMPTY:
				return empty != EMPTY_EDEFAULT;
			case SpectraPackage.REG_EXP__LEFT:
				return left != null;
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
		result.append(" (val: ");
		result.append(val);
		result.append(", empty: ");
		result.append(empty);
		result.append(')');
		return result.toString();
	}

} //RegExpImpl
