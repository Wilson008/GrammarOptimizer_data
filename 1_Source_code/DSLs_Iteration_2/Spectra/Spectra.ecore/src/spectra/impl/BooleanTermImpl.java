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
import spectra.SpectraPackage;
import spectra.TemporalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.BooleanTermImpl#getRelExpr <em>Rel Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanTermImpl extends MinimalEObjectImpl.Container implements BooleanTerm {
	/**
	 * The cached value of the '{@link #getRelExpr() <em>Rel Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelExpr()
	 * @generated
	 * @ordered
	 */
	protected TemporalExpression relExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.BOOLEAN_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExpression getRelExpr() {
		return relExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelExpr(TemporalExpression newRelExpr, NotificationChain msgs) {
		TemporalExpression oldRelExpr = relExpr;
		relExpr = newRelExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.BOOLEAN_TERM__REL_EXPR, oldRelExpr, newRelExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelExpr(TemporalExpression newRelExpr) {
		if (newRelExpr != relExpr) {
			NotificationChain msgs = null;
			if (relExpr != null)
				msgs = ((InternalEObject)relExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.BOOLEAN_TERM__REL_EXPR, null, msgs);
			if (newRelExpr != null)
				msgs = ((InternalEObject)newRelExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.BOOLEAN_TERM__REL_EXPR, null, msgs);
			msgs = basicSetRelExpr(newRelExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.BOOLEAN_TERM__REL_EXPR, newRelExpr, newRelExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.BOOLEAN_TERM__REL_EXPR:
				return basicSetRelExpr(null, msgs);
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
			case SpectraPackage.BOOLEAN_TERM__REL_EXPR:
				return getRelExpr();
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
			case SpectraPackage.BOOLEAN_TERM__REL_EXPR:
				setRelExpr((TemporalExpression)newValue);
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
			case SpectraPackage.BOOLEAN_TERM__REL_EXPR:
				setRelExpr((TemporalExpression)null);
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
			case SpectraPackage.BOOLEAN_TERM__REL_EXPR:
				return relExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //BooleanTermImpl
