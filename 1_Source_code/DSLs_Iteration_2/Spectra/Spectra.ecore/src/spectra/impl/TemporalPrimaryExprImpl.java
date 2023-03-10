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
import spectra.PredicateOrPatternReferrable;
import spectra.Referrable;
import spectra.RegExp;
import spectra.SpectraPackage;
import spectra.TemporalExpression;
import spectra.TemporalPrimaryExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Primary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.TemporalPrimaryExprImpl#getPredPatt <em>Pred Patt</em>}</li>
 *   <li>{@link spectra.impl.TemporalPrimaryExprImpl#getPredPattParams <em>Pred Patt Params</em>}</li>
 *   <li>{@link spectra.impl.TemporalPrimaryExprImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link spectra.impl.TemporalPrimaryExprImpl#getTpe <em>Tpe</em>}</li>
 *   <li>{@link spectra.impl.TemporalPrimaryExprImpl#getPointer <em>Pointer</em>}</li>
 *   <li>{@link spectra.impl.TemporalPrimaryExprImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link spectra.impl.TemporalPrimaryExprImpl#getTemporalExpression <em>Temporal Expression</em>}</li>
 *   <li>{@link spectra.impl.TemporalPrimaryExprImpl#getRegexp <em>Regexp</em>}</li>
 *   <li>{@link spectra.impl.TemporalPrimaryExprImpl#getRegexpPointer <em>Regexp Pointer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalPrimaryExprImpl extends TemporalExpressionImpl implements TemporalPrimaryExpr {
	/**
	 * The cached value of the '{@link #getPredPatt() <em>Pred Patt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredPatt()
	 * @generated
	 * @ordered
	 */
	protected PredicateOrPatternReferrable predPatt;

	/**
	 * The cached value of the '{@link #getPredPattParams() <em>Pred Patt Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredPattParams()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalExpression> predPattParams;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTpe() <em>Tpe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTpe()
	 * @generated
	 * @ordered
	 */
	protected TemporalExpression tpe;

	/**
	 * The cached value of the '{@link #getPointer() <em>Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointer()
	 * @generated
	 * @ordered
	 */
	protected Referrable pointer;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalExpression> index;

	/**
	 * The cached value of the '{@link #getTemporalExpression() <em>Temporal Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalExpression()
	 * @generated
	 * @ordered
	 */
	protected TemporalExpression temporalExpression;

	/**
	 * The cached value of the '{@link #getRegexp() <em>Regexp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexp()
	 * @generated
	 * @ordered
	 */
	protected RegExp regexp;

	/**
	 * The cached value of the '{@link #getRegexpPointer() <em>Regexp Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexpPointer()
	 * @generated
	 * @ordered
	 */
	protected DefineRegExpDecl regexpPointer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalPrimaryExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.TEMPORAL_PRIMARY_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateOrPatternReferrable getPredPatt() {
		if (predPatt != null && predPatt.eIsProxy()) {
			InternalEObject oldPredPatt = (InternalEObject)predPatt;
			predPatt = (PredicateOrPatternReferrable)eResolveProxy(oldPredPatt);
			if (predPatt != oldPredPatt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpectraPackage.TEMPORAL_PRIMARY_EXPR__PRED_PATT, oldPredPatt, predPatt));
			}
		}
		return predPatt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateOrPatternReferrable basicGetPredPatt() {
		return predPatt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredPatt(PredicateOrPatternReferrable newPredPatt) {
		PredicateOrPatternReferrable oldPredPatt = predPatt;
		predPatt = newPredPatt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_PRIMARY_EXPR__PRED_PATT, oldPredPatt, predPatt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalExpression> getPredPattParams() {
		if (predPattParams == null) {
			predPattParams = new EObjectContainmentEList<TemporalExpression>(TemporalExpression.class, this, SpectraPackage.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS);
		}
		return predPattParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_PRIMARY_EXPR__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExpression getTpe() {
		return tpe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTpe(TemporalExpression newTpe, NotificationChain msgs) {
		TemporalExpression oldTpe = tpe;
		tpe = newTpe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_PRIMARY_EXPR__TPE, oldTpe, newTpe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTpe(TemporalExpression newTpe) {
		if (newTpe != tpe) {
			NotificationChain msgs = null;
			if (tpe != null)
				msgs = ((InternalEObject)tpe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TEMPORAL_PRIMARY_EXPR__TPE, null, msgs);
			if (newTpe != null)
				msgs = ((InternalEObject)newTpe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TEMPORAL_PRIMARY_EXPR__TPE, null, msgs);
			msgs = basicSetTpe(newTpe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_PRIMARY_EXPR__TPE, newTpe, newTpe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referrable getPointer() {
		if (pointer != null && pointer.eIsProxy()) {
			InternalEObject oldPointer = (InternalEObject)pointer;
			pointer = (Referrable)eResolveProxy(oldPointer);
			if (pointer != oldPointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpectraPackage.TEMPORAL_PRIMARY_EXPR__POINTER, oldPointer, pointer));
			}
		}
		return pointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referrable basicGetPointer() {
		return pointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointer(Referrable newPointer) {
		Referrable oldPointer = pointer;
		pointer = newPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_PRIMARY_EXPR__POINTER, oldPointer, pointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalExpression> getIndex() {
		if (index == null) {
			index = new EObjectContainmentEList<TemporalExpression>(TemporalExpression.class, this, SpectraPackage.TEMPORAL_PRIMARY_EXPR__INDEX);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExpression getTemporalExpression() {
		return temporalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalExpression(TemporalExpression newTemporalExpression, NotificationChain msgs) {
		TemporalExpression oldTemporalExpression = temporalExpression;
		temporalExpression = newTemporalExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION, oldTemporalExpression, newTemporalExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalExpression(TemporalExpression newTemporalExpression) {
		if (newTemporalExpression != temporalExpression) {
			NotificationChain msgs = null;
			if (temporalExpression != null)
				msgs = ((InternalEObject)temporalExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION, null, msgs);
			if (newTemporalExpression != null)
				msgs = ((InternalEObject)newTemporalExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION, null, msgs);
			msgs = basicSetTemporalExpression(newTemporalExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION, newTemporalExpression, newTemporalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegExp getRegexp() {
		return regexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegexp(RegExp newRegexp, NotificationChain msgs) {
		RegExp oldRegexp = regexp;
		regexp = newRegexp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP, oldRegexp, newRegexp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegexp(RegExp newRegexp) {
		if (newRegexp != regexp) {
			NotificationChain msgs = null;
			if (regexp != null)
				msgs = ((InternalEObject)regexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP, null, msgs);
			if (newRegexp != null)
				msgs = ((InternalEObject)newRegexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP, null, msgs);
			msgs = basicSetRegexp(newRegexp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP, newRegexp, newRegexp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineRegExpDecl getRegexpPointer() {
		if (regexpPointer != null && regexpPointer.eIsProxy()) {
			InternalEObject oldRegexpPointer = (InternalEObject)regexpPointer;
			regexpPointer = (DefineRegExpDecl)eResolveProxy(oldRegexpPointer);
			if (regexpPointer != oldRegexpPointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP_POINTER, oldRegexpPointer, regexpPointer));
			}
		}
		return regexpPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineRegExpDecl basicGetRegexpPointer() {
		return regexpPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegexpPointer(DefineRegExpDecl newRegexpPointer) {
		DefineRegExpDecl oldRegexpPointer = regexpPointer;
		regexpPointer = newRegexpPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP_POINTER, oldRegexpPointer, regexpPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS:
				return ((InternalEList<?>)getPredPattParams()).basicRemove(otherEnd, msgs);
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__TPE:
				return basicSetTpe(null, msgs);
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__INDEX:
				return ((InternalEList<?>)getIndex()).basicRemove(otherEnd, msgs);
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION:
				return basicSetTemporalExpression(null, msgs);
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP:
				return basicSetRegexp(null, msgs);
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
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__PRED_PATT:
				if (resolve) return getPredPatt();
				return basicGetPredPatt();
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS:
				return getPredPattParams();
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__OPERATOR:
				return getOperator();
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__TPE:
				return getTpe();
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__POINTER:
				if (resolve) return getPointer();
				return basicGetPointer();
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__INDEX:
				return getIndex();
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION:
				return getTemporalExpression();
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP:
				return getRegexp();
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP_POINTER:
				if (resolve) return getRegexpPointer();
				return basicGetRegexpPointer();
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
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__PRED_PATT:
				setPredPatt((PredicateOrPatternReferrable)newValue);
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS:
				getPredPattParams().clear();
				getPredPattParams().addAll((Collection<? extends TemporalExpression>)newValue);
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__OPERATOR:
				setOperator((String)newValue);
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__TPE:
				setTpe((TemporalExpression)newValue);
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__POINTER:
				setPointer((Referrable)newValue);
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends TemporalExpression>)newValue);
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION:
				setTemporalExpression((TemporalExpression)newValue);
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP:
				setRegexp((RegExp)newValue);
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP_POINTER:
				setRegexpPointer((DefineRegExpDecl)newValue);
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
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__PRED_PATT:
				setPredPatt((PredicateOrPatternReferrable)null);
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS:
				getPredPattParams().clear();
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__TPE:
				setTpe((TemporalExpression)null);
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__POINTER:
				setPointer((Referrable)null);
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__INDEX:
				getIndex().clear();
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION:
				setTemporalExpression((TemporalExpression)null);
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP:
				setRegexp((RegExp)null);
				return;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP_POINTER:
				setRegexpPointer((DefineRegExpDecl)null);
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
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__PRED_PATT:
				return predPatt != null;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS:
				return predPattParams != null && !predPattParams.isEmpty();
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__TPE:
				return tpe != null;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__POINTER:
				return pointer != null;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__INDEX:
				return index != null && !index.isEmpty();
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION:
				return temporalExpression != null;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP:
				return regexp != null;
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR__REGEXP_POINTER:
				return regexpPointer != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //TemporalPrimaryExprImpl
