/**
 */
package spectra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spectra.DefineRegExpDecl;
import spectra.EXGar;
import spectra.RegExp;
import spectra.SpectraPackage;
import spectra.TemporalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EX Gar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.EXGarImpl#getName <em>Name</em>}</li>
 *   <li>{@link spectra.impl.EXGarImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link spectra.impl.EXGarImpl#getRegExpPointer <em>Reg Exp Pointer</em>}</li>
 *   <li>{@link spectra.impl.EXGarImpl#getRegExp <em>Reg Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXGarImpl extends DeclImpl implements EXGar {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalExpression> elements;

	/**
	 * The cached value of the '{@link #getRegExpPointer() <em>Reg Exp Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegExpPointer()
	 * @generated
	 * @ordered
	 */
	protected DefineRegExpDecl regExpPointer;

	/**
	 * The cached value of the '{@link #getRegExp() <em>Reg Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegExp()
	 * @generated
	 * @ordered
	 */
	protected RegExp regExp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EXGarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.EX_GAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.EX_GAR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalExpression> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<TemporalExpression>(TemporalExpression.class, this, SpectraPackage.EX_GAR__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineRegExpDecl getRegExpPointer() {
		if (regExpPointer != null && regExpPointer.eIsProxy()) {
			InternalEObject oldRegExpPointer = (InternalEObject)regExpPointer;
			regExpPointer = (DefineRegExpDecl)eResolveProxy(oldRegExpPointer);
			if (regExpPointer != oldRegExpPointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpectraPackage.EX_GAR__REG_EXP_POINTER, oldRegExpPointer, regExpPointer));
			}
		}
		return regExpPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineRegExpDecl basicGetRegExpPointer() {
		return regExpPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegExpPointer(DefineRegExpDecl newRegExpPointer) {
		DefineRegExpDecl oldRegExpPointer = regExpPointer;
		regExpPointer = newRegExpPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.EX_GAR__REG_EXP_POINTER, oldRegExpPointer, regExpPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegExp getRegExp() {
		return regExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegExp(RegExp newRegExp, NotificationChain msgs) {
		RegExp oldRegExp = regExp;
		regExp = newRegExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.EX_GAR__REG_EXP, oldRegExp, newRegExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegExp(RegExp newRegExp) {
		if (newRegExp != regExp) {
			NotificationChain msgs = null;
			if (regExp != null)
				msgs = ((InternalEObject)regExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.EX_GAR__REG_EXP, null, msgs);
			if (newRegExp != null)
				msgs = ((InternalEObject)newRegExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.EX_GAR__REG_EXP, null, msgs);
			msgs = basicSetRegExp(newRegExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.EX_GAR__REG_EXP, newRegExp, newRegExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.EX_GAR__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case SpectraPackage.EX_GAR__REG_EXP:
				return basicSetRegExp(null, msgs);
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
			case SpectraPackage.EX_GAR__NAME:
				return getName();
			case SpectraPackage.EX_GAR__ELEMENTS:
				return getElements();
			case SpectraPackage.EX_GAR__REG_EXP_POINTER:
				if (resolve) return getRegExpPointer();
				return basicGetRegExpPointer();
			case SpectraPackage.EX_GAR__REG_EXP:
				return getRegExp();
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
			case SpectraPackage.EX_GAR__NAME:
				setName((String)newValue);
				return;
			case SpectraPackage.EX_GAR__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends TemporalExpression>)newValue);
				return;
			case SpectraPackage.EX_GAR__REG_EXP_POINTER:
				setRegExpPointer((DefineRegExpDecl)newValue);
				return;
			case SpectraPackage.EX_GAR__REG_EXP:
				setRegExp((RegExp)newValue);
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
			case SpectraPackage.EX_GAR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpectraPackage.EX_GAR__ELEMENTS:
				getElements().clear();
				return;
			case SpectraPackage.EX_GAR__REG_EXP_POINTER:
				setRegExpPointer((DefineRegExpDecl)null);
				return;
			case SpectraPackage.EX_GAR__REG_EXP:
				setRegExp((RegExp)null);
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
			case SpectraPackage.EX_GAR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpectraPackage.EX_GAR__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case SpectraPackage.EX_GAR__REG_EXP_POINTER:
				return regExpPointer != null;
			case SpectraPackage.EX_GAR__REG_EXP:
				return regExp != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EXGarImpl
