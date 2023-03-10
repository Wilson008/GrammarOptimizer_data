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

import spectra.Pattern;
import spectra.PatternParamList;
import spectra.SpectraPackage;
import spectra.TemporalExpression;
import spectra.VarDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.PatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link spectra.impl.PatternImpl#getParams <em>Params</em>}</li>
 *   <li>{@link spectra.impl.PatternImpl#getVarDeclList <em>Var Decl List</em>}</li>
 *   <li>{@link spectra.impl.PatternImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link spectra.impl.PatternImpl#getSafety <em>Safety</em>}</li>
 *   <li>{@link spectra.impl.PatternImpl#getStateInv <em>State Inv</em>}</li>
 *   <li>{@link spectra.impl.PatternImpl#getJustice <em>Justice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternImpl extends DeclImpl implements Pattern {
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
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected PatternParamList params;

	/**
	 * The cached value of the '{@link #getVarDeclList() <em>Var Decl List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarDeclList()
	 * @generated
	 * @ordered
	 */
	protected EList<VarDecl> varDeclList;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalExpression> initial;

	/**
	 * The cached value of the '{@link #getSafety() <em>Safety</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafety()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalExpression> safety;

	/**
	 * The cached value of the '{@link #getStateInv() <em>State Inv</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateInv()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalExpression> stateInv;

	/**
	 * The cached value of the '{@link #getJustice() <em>Justice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustice()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalExpression> justice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.PATTERN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.PATTERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternParamList getParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParams(PatternParamList newParams, NotificationChain msgs) {
		PatternParamList oldParams = params;
		params = newParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.PATTERN__PARAMS, oldParams, newParams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(PatternParamList newParams) {
		if (newParams != params) {
			NotificationChain msgs = null;
			if (params != null)
				msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.PATTERN__PARAMS, null, msgs);
			if (newParams != null)
				msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.PATTERN__PARAMS, null, msgs);
			msgs = basicSetParams(newParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.PATTERN__PARAMS, newParams, newParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarDecl> getVarDeclList() {
		if (varDeclList == null) {
			varDeclList = new EObjectContainmentEList<VarDecl>(VarDecl.class, this, SpectraPackage.PATTERN__VAR_DECL_LIST);
		}
		return varDeclList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalExpression> getInitial() {
		if (initial == null) {
			initial = new EObjectContainmentEList<TemporalExpression>(TemporalExpression.class, this, SpectraPackage.PATTERN__INITIAL);
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalExpression> getSafety() {
		if (safety == null) {
			safety = new EObjectContainmentEList<TemporalExpression>(TemporalExpression.class, this, SpectraPackage.PATTERN__SAFETY);
		}
		return safety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalExpression> getStateInv() {
		if (stateInv == null) {
			stateInv = new EObjectContainmentEList<TemporalExpression>(TemporalExpression.class, this, SpectraPackage.PATTERN__STATE_INV);
		}
		return stateInv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalExpression> getJustice() {
		if (justice == null) {
			justice = new EObjectContainmentEList<TemporalExpression>(TemporalExpression.class, this, SpectraPackage.PATTERN__JUSTICE);
		}
		return justice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.PATTERN__PARAMS:
				return basicSetParams(null, msgs);
			case SpectraPackage.PATTERN__VAR_DECL_LIST:
				return ((InternalEList<?>)getVarDeclList()).basicRemove(otherEnd, msgs);
			case SpectraPackage.PATTERN__INITIAL:
				return ((InternalEList<?>)getInitial()).basicRemove(otherEnd, msgs);
			case SpectraPackage.PATTERN__SAFETY:
				return ((InternalEList<?>)getSafety()).basicRemove(otherEnd, msgs);
			case SpectraPackage.PATTERN__STATE_INV:
				return ((InternalEList<?>)getStateInv()).basicRemove(otherEnd, msgs);
			case SpectraPackage.PATTERN__JUSTICE:
				return ((InternalEList<?>)getJustice()).basicRemove(otherEnd, msgs);
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
			case SpectraPackage.PATTERN__NAME:
				return getName();
			case SpectraPackage.PATTERN__PARAMS:
				return getParams();
			case SpectraPackage.PATTERN__VAR_DECL_LIST:
				return getVarDeclList();
			case SpectraPackage.PATTERN__INITIAL:
				return getInitial();
			case SpectraPackage.PATTERN__SAFETY:
				return getSafety();
			case SpectraPackage.PATTERN__STATE_INV:
				return getStateInv();
			case SpectraPackage.PATTERN__JUSTICE:
				return getJustice();
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
			case SpectraPackage.PATTERN__NAME:
				setName((String)newValue);
				return;
			case SpectraPackage.PATTERN__PARAMS:
				setParams((PatternParamList)newValue);
				return;
			case SpectraPackage.PATTERN__VAR_DECL_LIST:
				getVarDeclList().clear();
				getVarDeclList().addAll((Collection<? extends VarDecl>)newValue);
				return;
			case SpectraPackage.PATTERN__INITIAL:
				getInitial().clear();
				getInitial().addAll((Collection<? extends TemporalExpression>)newValue);
				return;
			case SpectraPackage.PATTERN__SAFETY:
				getSafety().clear();
				getSafety().addAll((Collection<? extends TemporalExpression>)newValue);
				return;
			case SpectraPackage.PATTERN__STATE_INV:
				getStateInv().clear();
				getStateInv().addAll((Collection<? extends TemporalExpression>)newValue);
				return;
			case SpectraPackage.PATTERN__JUSTICE:
				getJustice().clear();
				getJustice().addAll((Collection<? extends TemporalExpression>)newValue);
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
			case SpectraPackage.PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpectraPackage.PATTERN__PARAMS:
				setParams((PatternParamList)null);
				return;
			case SpectraPackage.PATTERN__VAR_DECL_LIST:
				getVarDeclList().clear();
				return;
			case SpectraPackage.PATTERN__INITIAL:
				getInitial().clear();
				return;
			case SpectraPackage.PATTERN__SAFETY:
				getSafety().clear();
				return;
			case SpectraPackage.PATTERN__STATE_INV:
				getStateInv().clear();
				return;
			case SpectraPackage.PATTERN__JUSTICE:
				getJustice().clear();
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
			case SpectraPackage.PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpectraPackage.PATTERN__PARAMS:
				return params != null;
			case SpectraPackage.PATTERN__VAR_DECL_LIST:
				return varDeclList != null && !varDeclList.isEmpty();
			case SpectraPackage.PATTERN__INITIAL:
				return initial != null && !initial.isEmpty();
			case SpectraPackage.PATTERN__SAFETY:
				return safety != null && !safety.isEmpty();
			case SpectraPackage.PATTERN__STATE_INV:
				return stateInv != null && !stateInv.isEmpty();
			case SpectraPackage.PATTERN__JUSTICE:
				return justice != null && !justice.isEmpty();
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

} //PatternImpl
