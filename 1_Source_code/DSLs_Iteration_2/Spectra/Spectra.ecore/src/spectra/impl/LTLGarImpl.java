/**
 */
package spectra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spectra.LTLGar;
import spectra.SpectraPackage;
import spectra.TemporalExpression;
import spectra.Trigger;
import spectra.TypedParamList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LTL Gar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.LTLGarImpl#getName <em>Name</em>}</li>
 *   <li>{@link spectra.impl.LTLGarImpl#getParams <em>Params</em>}</li>
 *   <li>{@link spectra.impl.LTLGarImpl#getSafety <em>Safety</em>}</li>
 *   <li>{@link spectra.impl.LTLGarImpl#getStateInv <em>State Inv</em>}</li>
 *   <li>{@link spectra.impl.LTLGarImpl#getJustice <em>Justice</em>}</li>
 *   <li>{@link spectra.impl.LTLGarImpl#getTemporalExpr <em>Temporal Expr</em>}</li>
 *   <li>{@link spectra.impl.LTLGarImpl#getTrig <em>Trig</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LTLGarImpl extends DeclImpl implements LTLGar {
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
	protected TypedParamList params;

	/**
	 * The default value of the '{@link #getSafety() <em>Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafety()
	 * @generated
	 * @ordered
	 */
	protected static final String SAFETY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSafety() <em>Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafety()
	 * @generated
	 * @ordered
	 */
	protected String safety = SAFETY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateInv() <em>State Inv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateInv()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_INV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateInv() <em>State Inv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateInv()
	 * @generated
	 * @ordered
	 */
	protected String stateInv = STATE_INV_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustice() <em>Justice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustice()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustice() <em>Justice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustice()
	 * @generated
	 * @ordered
	 */
	protected String justice = JUSTICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemporalExpr() <em>Temporal Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalExpr()
	 * @generated
	 * @ordered
	 */
	protected TemporalExpression temporalExpr;

	/**
	 * The cached value of the '{@link #getTrig() <em>Trig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrig()
	 * @generated
	 * @ordered
	 */
	protected Trigger trig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LTLGarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.LTL_GAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.LTL_GAR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedParamList getParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParams(TypedParamList newParams, NotificationChain msgs) {
		TypedParamList oldParams = params;
		params = newParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.LTL_GAR__PARAMS, oldParams, newParams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(TypedParamList newParams) {
		if (newParams != params) {
			NotificationChain msgs = null;
			if (params != null)
				msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.LTL_GAR__PARAMS, null, msgs);
			if (newParams != null)
				msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.LTL_GAR__PARAMS, null, msgs);
			msgs = basicSetParams(newParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.LTL_GAR__PARAMS, newParams, newParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSafety() {
		return safety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafety(String newSafety) {
		String oldSafety = safety;
		safety = newSafety;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.LTL_GAR__SAFETY, oldSafety, safety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateInv() {
		return stateInv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateInv(String newStateInv) {
		String oldStateInv = stateInv;
		stateInv = newStateInv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.LTL_GAR__STATE_INV, oldStateInv, stateInv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJustice() {
		return justice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustice(String newJustice) {
		String oldJustice = justice;
		justice = newJustice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.LTL_GAR__JUSTICE, oldJustice, justice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExpression getTemporalExpr() {
		return temporalExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalExpr(TemporalExpression newTemporalExpr, NotificationChain msgs) {
		TemporalExpression oldTemporalExpr = temporalExpr;
		temporalExpr = newTemporalExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.LTL_GAR__TEMPORAL_EXPR, oldTemporalExpr, newTemporalExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalExpr(TemporalExpression newTemporalExpr) {
		if (newTemporalExpr != temporalExpr) {
			NotificationChain msgs = null;
			if (temporalExpr != null)
				msgs = ((InternalEObject)temporalExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.LTL_GAR__TEMPORAL_EXPR, null, msgs);
			if (newTemporalExpr != null)
				msgs = ((InternalEObject)newTemporalExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.LTL_GAR__TEMPORAL_EXPR, null, msgs);
			msgs = basicSetTemporalExpr(newTemporalExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.LTL_GAR__TEMPORAL_EXPR, newTemporalExpr, newTemporalExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTrig() {
		return trig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrig(Trigger newTrig, NotificationChain msgs) {
		Trigger oldTrig = trig;
		trig = newTrig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.LTL_GAR__TRIG, oldTrig, newTrig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrig(Trigger newTrig) {
		if (newTrig != trig) {
			NotificationChain msgs = null;
			if (trig != null)
				msgs = ((InternalEObject)trig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.LTL_GAR__TRIG, null, msgs);
			if (newTrig != null)
				msgs = ((InternalEObject)newTrig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.LTL_GAR__TRIG, null, msgs);
			msgs = basicSetTrig(newTrig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.LTL_GAR__TRIG, newTrig, newTrig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.LTL_GAR__PARAMS:
				return basicSetParams(null, msgs);
			case SpectraPackage.LTL_GAR__TEMPORAL_EXPR:
				return basicSetTemporalExpr(null, msgs);
			case SpectraPackage.LTL_GAR__TRIG:
				return basicSetTrig(null, msgs);
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
			case SpectraPackage.LTL_GAR__NAME:
				return getName();
			case SpectraPackage.LTL_GAR__PARAMS:
				return getParams();
			case SpectraPackage.LTL_GAR__SAFETY:
				return getSafety();
			case SpectraPackage.LTL_GAR__STATE_INV:
				return getStateInv();
			case SpectraPackage.LTL_GAR__JUSTICE:
				return getJustice();
			case SpectraPackage.LTL_GAR__TEMPORAL_EXPR:
				return getTemporalExpr();
			case SpectraPackage.LTL_GAR__TRIG:
				return getTrig();
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
			case SpectraPackage.LTL_GAR__NAME:
				setName((String)newValue);
				return;
			case SpectraPackage.LTL_GAR__PARAMS:
				setParams((TypedParamList)newValue);
				return;
			case SpectraPackage.LTL_GAR__SAFETY:
				setSafety((String)newValue);
				return;
			case SpectraPackage.LTL_GAR__STATE_INV:
				setStateInv((String)newValue);
				return;
			case SpectraPackage.LTL_GAR__JUSTICE:
				setJustice((String)newValue);
				return;
			case SpectraPackage.LTL_GAR__TEMPORAL_EXPR:
				setTemporalExpr((TemporalExpression)newValue);
				return;
			case SpectraPackage.LTL_GAR__TRIG:
				setTrig((Trigger)newValue);
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
			case SpectraPackage.LTL_GAR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpectraPackage.LTL_GAR__PARAMS:
				setParams((TypedParamList)null);
				return;
			case SpectraPackage.LTL_GAR__SAFETY:
				setSafety(SAFETY_EDEFAULT);
				return;
			case SpectraPackage.LTL_GAR__STATE_INV:
				setStateInv(STATE_INV_EDEFAULT);
				return;
			case SpectraPackage.LTL_GAR__JUSTICE:
				setJustice(JUSTICE_EDEFAULT);
				return;
			case SpectraPackage.LTL_GAR__TEMPORAL_EXPR:
				setTemporalExpr((TemporalExpression)null);
				return;
			case SpectraPackage.LTL_GAR__TRIG:
				setTrig((Trigger)null);
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
			case SpectraPackage.LTL_GAR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpectraPackage.LTL_GAR__PARAMS:
				return params != null;
			case SpectraPackage.LTL_GAR__SAFETY:
				return SAFETY_EDEFAULT == null ? safety != null : !SAFETY_EDEFAULT.equals(safety);
			case SpectraPackage.LTL_GAR__STATE_INV:
				return STATE_INV_EDEFAULT == null ? stateInv != null : !STATE_INV_EDEFAULT.equals(stateInv);
			case SpectraPackage.LTL_GAR__JUSTICE:
				return JUSTICE_EDEFAULT == null ? justice != null : !JUSTICE_EDEFAULT.equals(justice);
			case SpectraPackage.LTL_GAR__TEMPORAL_EXPR:
				return temporalExpr != null;
			case SpectraPackage.LTL_GAR__TRIG:
				return trig != null;
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
		result.append(", safety: ");
		result.append(safety);
		result.append(", stateInv: ");
		result.append(stateInv);
		result.append(", justice: ");
		result.append(justice);
		result.append(')');
		return result.toString();
	}

} //LTLGarImpl
