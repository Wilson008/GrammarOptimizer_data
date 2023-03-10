/**
 */
package ATLnoOCL.impl;

import ATLnoOCL.ATLnoOCLPackage;
import ATLnoOCL.InPattern;
import ATLnoOCL.InPatternElement;
import ATLnoOCL.MatchedRule;
import ATLnoOCL.OCLDummy;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.impl.InPatternImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link ATLnoOCL.impl.InPatternImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link ATLnoOCL.impl.InPatternImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InPatternImpl extends LocatedElementImpl implements InPattern {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<InPatternElement> elements;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected OCLDummy filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATLnoOCLPackage.Literals.IN_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InPatternElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<InPatternElement>(InPatternElement.class, this, ATLnoOCLPackage.IN_PATTERN__ELEMENTS, ATLnoOCLPackage.IN_PATTERN_ELEMENT__IN_PATTERN);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchedRule getRule() {
		if (eContainerFeatureID() != ATLnoOCLPackage.IN_PATTERN__RULE) return null;
		return (MatchedRule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(MatchedRule newRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRule, ATLnoOCLPackage.IN_PATTERN__RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(MatchedRule newRule) {
		if (newRule != eInternalContainer() || (eContainerFeatureID() != ATLnoOCLPackage.IN_PATTERN__RULE && newRule != null)) {
			if (EcoreUtil.isAncestor(this, newRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, ATLnoOCLPackage.MATCHED_RULE__IN_PATTERN, MatchedRule.class, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.IN_PATTERN__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(OCLDummy newFilter, NotificationChain msgs) {
		OCLDummy oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.IN_PATTERN__FILTER, oldFilter, newFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(OCLDummy newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATLnoOCLPackage.IN_PATTERN__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATLnoOCLPackage.IN_PATTERN__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.IN_PATTERN__FILTER, newFilter, newFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATLnoOCLPackage.IN_PATTERN__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
			case ATLnoOCLPackage.IN_PATTERN__RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRule((MatchedRule)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATLnoOCLPackage.IN_PATTERN__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case ATLnoOCLPackage.IN_PATTERN__RULE:
				return basicSetRule(null, msgs);
			case ATLnoOCLPackage.IN_PATTERN__FILTER:
				return basicSetFilter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ATLnoOCLPackage.IN_PATTERN__RULE:
				return eInternalContainer().eInverseRemove(this, ATLnoOCLPackage.MATCHED_RULE__IN_PATTERN, MatchedRule.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ATLnoOCLPackage.IN_PATTERN__ELEMENTS:
				return getElements();
			case ATLnoOCLPackage.IN_PATTERN__RULE:
				return getRule();
			case ATLnoOCLPackage.IN_PATTERN__FILTER:
				return getFilter();
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
			case ATLnoOCLPackage.IN_PATTERN__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends InPatternElement>)newValue);
				return;
			case ATLnoOCLPackage.IN_PATTERN__RULE:
				setRule((MatchedRule)newValue);
				return;
			case ATLnoOCLPackage.IN_PATTERN__FILTER:
				setFilter((OCLDummy)newValue);
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
			case ATLnoOCLPackage.IN_PATTERN__ELEMENTS:
				getElements().clear();
				return;
			case ATLnoOCLPackage.IN_PATTERN__RULE:
				setRule((MatchedRule)null);
				return;
			case ATLnoOCLPackage.IN_PATTERN__FILTER:
				setFilter((OCLDummy)null);
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
			case ATLnoOCLPackage.IN_PATTERN__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ATLnoOCLPackage.IN_PATTERN__RULE:
				return getRule() != null;
			case ATLnoOCLPackage.IN_PATTERN__FILTER:
				return filter != null;
		}
		return super.eIsSet(featureID);
	}

} //InPatternImpl
