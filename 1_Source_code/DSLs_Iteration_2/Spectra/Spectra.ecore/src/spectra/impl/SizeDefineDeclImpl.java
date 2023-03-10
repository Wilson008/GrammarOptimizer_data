/**
 */
package spectra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import spectra.DefineDecl;
import spectra.SizeDefineDecl;
import spectra.SpectraPackage;
import spectra.TemporalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size Define Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.SizeDefineDeclImpl#getValue <em>Value</em>}</li>
 *   <li>{@link spectra.impl.SizeDefineDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link spectra.impl.SizeDefineDeclImpl#getArithExp <em>Arith Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SizeDefineDeclImpl extends MinimalEObjectImpl.Container implements SizeDefineDecl {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected DefineDecl name;

	/**
	 * The cached value of the '{@link #getArithExp() <em>Arith Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithExp()
	 * @generated
	 * @ordered
	 */
	protected TemporalExpression arithExp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SizeDefineDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.SIZE_DEFINE_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.SIZE_DEFINE_DECL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineDecl getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (DefineDecl)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpectraPackage.SIZE_DEFINE_DECL__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineDecl basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(DefineDecl newName) {
		DefineDecl oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.SIZE_DEFINE_DECL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExpression getArithExp() {
		return arithExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArithExp(TemporalExpression newArithExp, NotificationChain msgs) {
		TemporalExpression oldArithExp = arithExp;
		arithExp = newArithExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.SIZE_DEFINE_DECL__ARITH_EXP, oldArithExp, newArithExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArithExp(TemporalExpression newArithExp) {
		if (newArithExp != arithExp) {
			NotificationChain msgs = null;
			if (arithExp != null)
				msgs = ((InternalEObject)arithExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.SIZE_DEFINE_DECL__ARITH_EXP, null, msgs);
			if (newArithExp != null)
				msgs = ((InternalEObject)newArithExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.SIZE_DEFINE_DECL__ARITH_EXP, null, msgs);
			msgs = basicSetArithExp(newArithExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.SIZE_DEFINE_DECL__ARITH_EXP, newArithExp, newArithExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.SIZE_DEFINE_DECL__ARITH_EXP:
				return basicSetArithExp(null, msgs);
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
			case SpectraPackage.SIZE_DEFINE_DECL__VALUE:
				return getValue();
			case SpectraPackage.SIZE_DEFINE_DECL__NAME:
				if (resolve) return getName();
				return basicGetName();
			case SpectraPackage.SIZE_DEFINE_DECL__ARITH_EXP:
				return getArithExp();
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
			case SpectraPackage.SIZE_DEFINE_DECL__VALUE:
				setValue((Integer)newValue);
				return;
			case SpectraPackage.SIZE_DEFINE_DECL__NAME:
				setName((DefineDecl)newValue);
				return;
			case SpectraPackage.SIZE_DEFINE_DECL__ARITH_EXP:
				setArithExp((TemporalExpression)newValue);
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
			case SpectraPackage.SIZE_DEFINE_DECL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SpectraPackage.SIZE_DEFINE_DECL__NAME:
				setName((DefineDecl)null);
				return;
			case SpectraPackage.SIZE_DEFINE_DECL__ARITH_EXP:
				setArithExp((TemporalExpression)null);
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
			case SpectraPackage.SIZE_DEFINE_DECL__VALUE:
				return value != VALUE_EDEFAULT;
			case SpectraPackage.SIZE_DEFINE_DECL__NAME:
				return name != null;
			case SpectraPackage.SIZE_DEFINE_DECL__ARITH_EXP:
				return arithExp != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SizeDefineDeclImpl
