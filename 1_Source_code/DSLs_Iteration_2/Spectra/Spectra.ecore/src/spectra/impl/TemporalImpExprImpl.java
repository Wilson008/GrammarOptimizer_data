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
import spectra.TemporalImpExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Imp Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.TemporalImpExprImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link spectra.impl.TemporalImpExprImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link spectra.impl.TemporalImpExprImpl#getImplication <em>Implication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalImpExprImpl extends TemporalExpressionImpl implements TemporalImpExpr {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected TemporalExpression left;

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
	 * The cached value of the '{@link #getImplication() <em>Implication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplication()
	 * @generated
	 * @ordered
	 */
	protected TemporalExpression implication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalImpExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.TEMPORAL_IMP_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExpression getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(TemporalExpression newLeft, NotificationChain msgs) {
		TemporalExpression oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_IMP_EXPR__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(TemporalExpression newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TEMPORAL_IMP_EXPR__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TEMPORAL_IMP_EXPR__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_IMP_EXPR__LEFT, newLeft, newLeft));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_IMP_EXPR__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExpression getImplication() {
		return implication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplication(TemporalExpression newImplication, NotificationChain msgs) {
		TemporalExpression oldImplication = implication;
		implication = newImplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_IMP_EXPR__IMPLICATION, oldImplication, newImplication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplication(TemporalExpression newImplication) {
		if (newImplication != implication) {
			NotificationChain msgs = null;
			if (implication != null)
				msgs = ((InternalEObject)implication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TEMPORAL_IMP_EXPR__IMPLICATION, null, msgs);
			if (newImplication != null)
				msgs = ((InternalEObject)newImplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.TEMPORAL_IMP_EXPR__IMPLICATION, null, msgs);
			msgs = basicSetImplication(newImplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.TEMPORAL_IMP_EXPR__IMPLICATION, newImplication, newImplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.TEMPORAL_IMP_EXPR__LEFT:
				return basicSetLeft(null, msgs);
			case SpectraPackage.TEMPORAL_IMP_EXPR__IMPLICATION:
				return basicSetImplication(null, msgs);
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
			case SpectraPackage.TEMPORAL_IMP_EXPR__LEFT:
				return getLeft();
			case SpectraPackage.TEMPORAL_IMP_EXPR__OPERATOR:
				return getOperator();
			case SpectraPackage.TEMPORAL_IMP_EXPR__IMPLICATION:
				return getImplication();
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
			case SpectraPackage.TEMPORAL_IMP_EXPR__LEFT:
				setLeft((TemporalExpression)newValue);
				return;
			case SpectraPackage.TEMPORAL_IMP_EXPR__OPERATOR:
				setOperator((String)newValue);
				return;
			case SpectraPackage.TEMPORAL_IMP_EXPR__IMPLICATION:
				setImplication((TemporalExpression)newValue);
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
			case SpectraPackage.TEMPORAL_IMP_EXPR__LEFT:
				setLeft((TemporalExpression)null);
				return;
			case SpectraPackage.TEMPORAL_IMP_EXPR__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case SpectraPackage.TEMPORAL_IMP_EXPR__IMPLICATION:
				setImplication((TemporalExpression)null);
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
			case SpectraPackage.TEMPORAL_IMP_EXPR__LEFT:
				return left != null;
			case SpectraPackage.TEMPORAL_IMP_EXPR__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case SpectraPackage.TEMPORAL_IMP_EXPR__IMPLICATION:
				return implication != null;
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

} //TemporalImpExprImpl
