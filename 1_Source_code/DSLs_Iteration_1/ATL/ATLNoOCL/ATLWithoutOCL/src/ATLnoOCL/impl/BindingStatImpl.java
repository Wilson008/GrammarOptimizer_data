/**
 */
package ATLnoOCL.impl;

import ATLnoOCL.ATLnoOCLPackage;
import ATLnoOCL.BindingStat;
import ATLnoOCL.OCLDummy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.impl.BindingStatImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ATLnoOCL.impl.BindingStatImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link ATLnoOCL.impl.BindingStatImpl#isIsAssignment <em>Is Assignment</em>}</li>
 *   <li>{@link ATLnoOCL.impl.BindingStatImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingStatImpl extends StatementImpl implements BindingStat {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OCLDummy source;

	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAssignment() <em>Is Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssignment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASSIGNMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAssignment() <em>Is Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssignment()
	 * @generated
	 * @ordered
	 */
	protected boolean isAssignment = IS_ASSIGNMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected OCLDummy value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingStatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATLnoOCLPackage.Literals.BINDING_STAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(OCLDummy newSource, NotificationChain msgs) {
		OCLDummy oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.BINDING_STAT__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OCLDummy newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATLnoOCLPackage.BINDING_STAT__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATLnoOCLPackage.BINDING_STAT__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.BINDING_STAT__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.BINDING_STAT__PROPERTY_NAME, oldPropertyName, propertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAssignment() {
		return isAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAssignment(boolean newIsAssignment) {
		boolean oldIsAssignment = isAssignment;
		isAssignment = newIsAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.BINDING_STAT__IS_ASSIGNMENT, oldIsAssignment, isAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDummy getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(OCLDummy newValue, NotificationChain msgs) {
		OCLDummy oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.BINDING_STAT__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(OCLDummy newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATLnoOCLPackage.BINDING_STAT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATLnoOCLPackage.BINDING_STAT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATLnoOCLPackage.BINDING_STAT__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATLnoOCLPackage.BINDING_STAT__SOURCE:
				return basicSetSource(null, msgs);
			case ATLnoOCLPackage.BINDING_STAT__VALUE:
				return basicSetValue(null, msgs);
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
			case ATLnoOCLPackage.BINDING_STAT__SOURCE:
				return getSource();
			case ATLnoOCLPackage.BINDING_STAT__PROPERTY_NAME:
				return getPropertyName();
			case ATLnoOCLPackage.BINDING_STAT__IS_ASSIGNMENT:
				return isIsAssignment();
			case ATLnoOCLPackage.BINDING_STAT__VALUE:
				return getValue();
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
			case ATLnoOCLPackage.BINDING_STAT__SOURCE:
				setSource((OCLDummy)newValue);
				return;
			case ATLnoOCLPackage.BINDING_STAT__PROPERTY_NAME:
				setPropertyName((String)newValue);
				return;
			case ATLnoOCLPackage.BINDING_STAT__IS_ASSIGNMENT:
				setIsAssignment((Boolean)newValue);
				return;
			case ATLnoOCLPackage.BINDING_STAT__VALUE:
				setValue((OCLDummy)newValue);
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
			case ATLnoOCLPackage.BINDING_STAT__SOURCE:
				setSource((OCLDummy)null);
				return;
			case ATLnoOCLPackage.BINDING_STAT__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case ATLnoOCLPackage.BINDING_STAT__IS_ASSIGNMENT:
				setIsAssignment(IS_ASSIGNMENT_EDEFAULT);
				return;
			case ATLnoOCLPackage.BINDING_STAT__VALUE:
				setValue((OCLDummy)null);
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
			case ATLnoOCLPackage.BINDING_STAT__SOURCE:
				return source != null;
			case ATLnoOCLPackage.BINDING_STAT__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
			case ATLnoOCLPackage.BINDING_STAT__IS_ASSIGNMENT:
				return isAssignment != IS_ASSIGNMENT_EDEFAULT;
			case ATLnoOCLPackage.BINDING_STAT__VALUE:
				return value != null;
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
		result.append(" (propertyName: ");
		result.append(propertyName);
		result.append(", isAssignment: ");
		result.append(isAssignment);
		result.append(')');
		return result.toString();
	}

} //BindingStatImpl
