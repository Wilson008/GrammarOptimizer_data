/**
 */
package qvtoperational.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qvtoperational.ExpressionGO;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.ResolveExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolve Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.ResolveExpImpl#getOne <em>One</em>}</li>
 *   <li>{@link qvtoperational.impl.ResolveExpImpl#getIsInverse <em>Is Inverse</em>}</li>
 *   <li>{@link qvtoperational.impl.ResolveExpImpl#getIsDeferred <em>Is Deferred</em>}</li>
 *   <li>{@link qvtoperational.impl.ResolveExpImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link qvtoperational.impl.ResolveExpImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResolveExpImpl extends ExpressionGOImpl implements ResolveExp {
	/**
	 * The default value of the '{@link #getOne() <em>One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOne()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOne() <em>One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOne()
	 * @generated
	 * @ordered
	 */
	protected Boolean one = ONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsInverse() <em>Is Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInverse()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_INVERSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsInverse() <em>Is Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInverse()
	 * @generated
	 * @ordered
	 */
	protected Boolean isInverse = IS_INVERSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDeferred() <em>Is Deferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeferred()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEFERRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDeferred() <em>Is Deferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeferred()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDeferred = IS_DEFERRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ExpressionGO target;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ExpressionGO condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolveExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.RESOLVE_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOne() {
		return one;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOne(Boolean newOne) {
		Boolean oldOne = one;
		one = newOne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.RESOLVE_EXP__ONE, oldOne, one));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsInverse() {
		return isInverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInverse(Boolean newIsInverse) {
		Boolean oldIsInverse = isInverse;
		isInverse = newIsInverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.RESOLVE_EXP__IS_INVERSE, oldIsInverse, isInverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDeferred() {
		return isDeferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeferred(Boolean newIsDeferred) {
		Boolean oldIsDeferred = isDeferred;
		isDeferred = newIsDeferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.RESOLVE_EXP__IS_DEFERRED, oldIsDeferred, isDeferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ExpressionGO newTarget, NotificationChain msgs) {
		ExpressionGO oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.RESOLVE_EXP__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ExpressionGO newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.RESOLVE_EXP__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.RESOLVE_EXP__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.RESOLVE_EXP__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(ExpressionGO newCondition, NotificationChain msgs) {
		ExpressionGO oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.RESOLVE_EXP__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(ExpressionGO newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.RESOLVE_EXP__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.RESOLVE_EXP__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.RESOLVE_EXP__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.RESOLVE_EXP__TARGET:
				return basicSetTarget(null, msgs);
			case QvtoperationalPackage.RESOLVE_EXP__CONDITION:
				return basicSetCondition(null, msgs);
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
			case QvtoperationalPackage.RESOLVE_EXP__ONE:
				return getOne();
			case QvtoperationalPackage.RESOLVE_EXP__IS_INVERSE:
				return getIsInverse();
			case QvtoperationalPackage.RESOLVE_EXP__IS_DEFERRED:
				return getIsDeferred();
			case QvtoperationalPackage.RESOLVE_EXP__TARGET:
				return getTarget();
			case QvtoperationalPackage.RESOLVE_EXP__CONDITION:
				return getCondition();
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
			case QvtoperationalPackage.RESOLVE_EXP__ONE:
				setOne((Boolean)newValue);
				return;
			case QvtoperationalPackage.RESOLVE_EXP__IS_INVERSE:
				setIsInverse((Boolean)newValue);
				return;
			case QvtoperationalPackage.RESOLVE_EXP__IS_DEFERRED:
				setIsDeferred((Boolean)newValue);
				return;
			case QvtoperationalPackage.RESOLVE_EXP__TARGET:
				setTarget((ExpressionGO)newValue);
				return;
			case QvtoperationalPackage.RESOLVE_EXP__CONDITION:
				setCondition((ExpressionGO)newValue);
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
			case QvtoperationalPackage.RESOLVE_EXP__ONE:
				setOne(ONE_EDEFAULT);
				return;
			case QvtoperationalPackage.RESOLVE_EXP__IS_INVERSE:
				setIsInverse(IS_INVERSE_EDEFAULT);
				return;
			case QvtoperationalPackage.RESOLVE_EXP__IS_DEFERRED:
				setIsDeferred(IS_DEFERRED_EDEFAULT);
				return;
			case QvtoperationalPackage.RESOLVE_EXP__TARGET:
				setTarget((ExpressionGO)null);
				return;
			case QvtoperationalPackage.RESOLVE_EXP__CONDITION:
				setCondition((ExpressionGO)null);
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
			case QvtoperationalPackage.RESOLVE_EXP__ONE:
				return ONE_EDEFAULT == null ? one != null : !ONE_EDEFAULT.equals(one);
			case QvtoperationalPackage.RESOLVE_EXP__IS_INVERSE:
				return IS_INVERSE_EDEFAULT == null ? isInverse != null : !IS_INVERSE_EDEFAULT.equals(isInverse);
			case QvtoperationalPackage.RESOLVE_EXP__IS_DEFERRED:
				return IS_DEFERRED_EDEFAULT == null ? isDeferred != null : !IS_DEFERRED_EDEFAULT.equals(isDeferred);
			case QvtoperationalPackage.RESOLVE_EXP__TARGET:
				return target != null;
			case QvtoperationalPackage.RESOLVE_EXP__CONDITION:
				return condition != null;
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
		result.append(" (one: ");
		result.append(one);
		result.append(", isInverse: ");
		result.append(isInverse);
		result.append(", isDeferred: ");
		result.append(isDeferred);
		result.append(')');
		return result.toString();
	}

} //ResolveExpImpl
