/**
 */
package spectra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spectra.SpectraPackage;
import spectra.TemporalExpression;
import spectra.TemporalUnaryExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.TemporalUnaryExprImpl#getKinds <em>Kinds</em>}</li>
 *   <li>{@link spectra.impl.TemporalUnaryExprImpl#getTue <em>Tue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalUnaryExprImpl extends TemporalExpressionImpl implements TemporalUnaryExpr {
	/**
	 * The default value of the '{@link #getKinds() <em>Kinds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinds()
	 * @generated
	 * @ordered
	 */
	protected static final String KINDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKinds() <em>Kinds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinds()
	 * @generated
	 * @ordered
	 */
	protected String kinds = KINDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTue() <em>Tue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTue()
	 * @generated
	 * @ordered
	 */
	protected TemporalExpression tue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalUnaryExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.TEMPORAL_UNARY_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKinds() {
		return kinds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKinds(String newKinds) {
		String oldKinds = kinds;
		kinds = newKinds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_UNARY_EXPR__KINDS, oldKinds, kinds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExpression getTue() {
		return tue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTue(TemporalExpression newTue, NotificationChain msgs) {
		TemporalExpression oldTue = tue;
		tue = newTue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_UNARY_EXPR__TUE, oldTue, newTue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTue(TemporalExpression newTue) {
		if (newTue != tue) {
			NotificationChain msgs = null;
			if (tue != null)
				msgs = ((InternalEObject)tue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TEMPORAL_UNARY_EXPR__TUE, null, msgs);
			if (newTue != null)
				msgs = ((InternalEObject)newTue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TEMPORAL_UNARY_EXPR__TUE, null, msgs);
			msgs = basicSetTue(newTue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_UNARY_EXPR__TUE, newTue, newTue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.TEMPORAL_UNARY_EXPR__TUE:
				return basicSetTue(null, msgs);
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
			case SpectraPackage.TEMPORAL_UNARY_EXPR__KINDS:
				return getKinds();
			case SpectraPackage.TEMPORAL_UNARY_EXPR__TUE:
				return getTue();
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
			case SpectraPackage.TEMPORAL_UNARY_EXPR__KINDS:
				setKinds((String)newValue);
				return;
			case SpectraPackage.TEMPORAL_UNARY_EXPR__TUE:
				setTue((TemporalExpression)newValue);
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
			case SpectraPackage.TEMPORAL_UNARY_EXPR__KINDS:
				setKinds(KINDS_EDEFAULT);
				return;
			case SpectraPackage.TEMPORAL_UNARY_EXPR__TUE:
				setTue((TemporalExpression)null);
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
			case SpectraPackage.TEMPORAL_UNARY_EXPR__KINDS:
				return KINDS_EDEFAULT == null ? kinds != null : !KINDS_EDEFAULT.equals(kinds);
			case SpectraPackage.TEMPORAL_UNARY_EXPR__TUE:
				return tue != null;
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
		result.append(" (kinds: ");
		result.append(kinds);
		result.append(')');
		return result.toString();
	}

} //TemporalUnaryExprImpl
