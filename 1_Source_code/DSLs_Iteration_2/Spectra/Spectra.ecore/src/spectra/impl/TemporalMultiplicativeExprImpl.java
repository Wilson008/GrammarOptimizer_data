/**
 */
package spectra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spectra.SpectraPackage;
import spectra.TemporalExpression;
import spectra.TemporalMultiplicativeExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Multiplicative Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.TemporalMultiplicativeExprImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link spectra.impl.TemporalMultiplicativeExprImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalMultiplicativeExprImpl extends TemporalExpressionImpl implements TemporalMultiplicativeExpr {
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
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<String> operator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalMultiplicativeExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.TEMPORAL_MULTIPLICATIVE_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalExpression> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<TemporalExpression>(TemporalExpression.class, this, SpectraPackage.TEMPORAL_MULTIPLICATIVE_EXPR__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOperator() {
		if (operator == null) {
			operator = new EDataTypeEList<String>(String.class, this, SpectraPackage.TEMPORAL_MULTIPLICATIVE_EXPR__OPERATOR);
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.TEMPORAL_MULTIPLICATIVE_EXPR__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case SpectraPackage.TEMPORAL_MULTIPLICATIVE_EXPR__ELEMENTS:
				return getElements();
			case SpectraPackage.TEMPORAL_MULTIPLICATIVE_EXPR__OPERATOR:
				return getOperator();
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
			case SpectraPackage.TEMPORAL_MULTIPLICATIVE_EXPR__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends TemporalExpression>)newValue);
				return;
			case SpectraPackage.TEMPORAL_MULTIPLICATIVE_EXPR__OPERATOR:
				getOperator().clear();
				getOperator().addAll((Collection<? extends String>)newValue);
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
			case SpectraPackage.TEMPORAL_MULTIPLICATIVE_EXPR__ELEMENTS:
				getElements().clear();
				return;
			case SpectraPackage.TEMPORAL_MULTIPLICATIVE_EXPR__OPERATOR:
				getOperator().clear();
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
			case SpectraPackage.TEMPORAL_MULTIPLICATIVE_EXPR__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case SpectraPackage.TEMPORAL_MULTIPLICATIVE_EXPR__OPERATOR:
				return operator != null && !operator.isEmpty();
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

} //TemporalMultiplicativeExprImpl
