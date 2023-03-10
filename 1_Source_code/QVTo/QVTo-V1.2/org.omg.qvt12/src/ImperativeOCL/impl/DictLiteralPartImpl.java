/**
 */
package ImperativeOCL.impl;

import EMOF.impl.ElementImpl;

import EssentialOCL.OclExpression;

import ImperativeOCL.DictLiteralExp;
import ImperativeOCL.DictLiteralPart;
import ImperativeOCL.ImperativeOCLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dict Literal Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ImperativeOCL.impl.DictLiteralPartImpl#getKey <em>Key</em>}</li>
 *   <li>{@link ImperativeOCL.impl.DictLiteralPartImpl#getValue <em>Value</em>}</li>
 *   <li>{@link ImperativeOCL.impl.DictLiteralPartImpl#getPartOwner <em>Part Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DictLiteralPartImpl extends ElementImpl implements DictLiteralPart {
	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected OclExpression key;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected OclExpression value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictLiteralPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLPackage.Literals.DICT_LITERAL_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(OclExpression newKey, NotificationChain msgs) {
		OclExpression oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLPackage.DICT_LITERAL_PART__KEY, oldKey, newKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(OclExpression newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLPackage.DICT_LITERAL_PART__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLPackage.DICT_LITERAL_PART__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLPackage.DICT_LITERAL_PART__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(OclExpression newValue, NotificationChain msgs) {
		OclExpression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLPackage.DICT_LITERAL_PART__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(OclExpression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLPackage.DICT_LITERAL_PART__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLPackage.DICT_LITERAL_PART__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLPackage.DICT_LITERAL_PART__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictLiteralExp getPartOwner() {
		if (eContainerFeatureID() != ImperativeOCLPackage.DICT_LITERAL_PART__PART_OWNER) return null;
		return (DictLiteralExp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOwner(DictLiteralExp newPartOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOwner, ImperativeOCLPackage.DICT_LITERAL_PART__PART_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOwner(DictLiteralExp newPartOwner) {
		if (newPartOwner != eInternalContainer() || (eContainerFeatureID() != ImperativeOCLPackage.DICT_LITERAL_PART__PART_OWNER && newPartOwner != null)) {
			if (EcoreUtil.isAncestor(this, newPartOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOwner != null)
				msgs = ((InternalEObject)newPartOwner).eInverseAdd(this, ImperativeOCLPackage.DICT_LITERAL_EXP__PART, DictLiteralExp.class, msgs);
			msgs = basicSetPartOwner(newPartOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLPackage.DICT_LITERAL_PART__PART_OWNER, newPartOwner, newPartOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeOCLPackage.DICT_LITERAL_PART__PART_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOwner((DictLiteralExp)otherEnd, msgs);
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
			case ImperativeOCLPackage.DICT_LITERAL_PART__KEY:
				return basicSetKey(null, msgs);
			case ImperativeOCLPackage.DICT_LITERAL_PART__VALUE:
				return basicSetValue(null, msgs);
			case ImperativeOCLPackage.DICT_LITERAL_PART__PART_OWNER:
				return basicSetPartOwner(null, msgs);
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
			case ImperativeOCLPackage.DICT_LITERAL_PART__PART_OWNER:
				return eInternalContainer().eInverseRemove(this, ImperativeOCLPackage.DICT_LITERAL_EXP__PART, DictLiteralExp.class, msgs);
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
			case ImperativeOCLPackage.DICT_LITERAL_PART__KEY:
				return getKey();
			case ImperativeOCLPackage.DICT_LITERAL_PART__VALUE:
				return getValue();
			case ImperativeOCLPackage.DICT_LITERAL_PART__PART_OWNER:
				return getPartOwner();
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
			case ImperativeOCLPackage.DICT_LITERAL_PART__KEY:
				setKey((OclExpression)newValue);
				return;
			case ImperativeOCLPackage.DICT_LITERAL_PART__VALUE:
				setValue((OclExpression)newValue);
				return;
			case ImperativeOCLPackage.DICT_LITERAL_PART__PART_OWNER:
				setPartOwner((DictLiteralExp)newValue);
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
			case ImperativeOCLPackage.DICT_LITERAL_PART__KEY:
				setKey((OclExpression)null);
				return;
			case ImperativeOCLPackage.DICT_LITERAL_PART__VALUE:
				setValue((OclExpression)null);
				return;
			case ImperativeOCLPackage.DICT_LITERAL_PART__PART_OWNER:
				setPartOwner((DictLiteralExp)null);
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
			case ImperativeOCLPackage.DICT_LITERAL_PART__KEY:
				return key != null;
			case ImperativeOCLPackage.DICT_LITERAL_PART__VALUE:
				return value != null;
			case ImperativeOCLPackage.DICT_LITERAL_PART__PART_OWNER:
				return getPartOwner() != null;
		}
		return super.eIsSet(featureID);
	}

} //DictLiteralPartImpl
