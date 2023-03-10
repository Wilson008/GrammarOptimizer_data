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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spectra.SizeDefineDecl;
import spectra.SpectraPackage;
import spectra.Subrange;
import spectra.TypeConstant;
import spectra.TypeDef;
import spectra.VarType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.VarTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link spectra.impl.VarTypeImpl#getSubr <em>Subr</em>}</li>
 *   <li>{@link spectra.impl.VarTypeImpl#getConst <em>Const</em>}</li>
 *   <li>{@link spectra.impl.VarTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link spectra.impl.VarTypeImpl#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarTypeImpl extends MinimalEObjectImpl.Container implements VarType {
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
	 * The cached value of the '{@link #getSubr() <em>Subr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubr()
	 * @generated
	 * @ordered
	 */
	protected Subrange subr;

	/**
	 * The cached value of the '{@link #getConst() <em>Const</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConst()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeConstant> const_;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDef type;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<SizeDefineDecl> dimensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.VAR_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.VAR_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subrange getSubr() {
		return subr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubr(Subrange newSubr, NotificationChain msgs) {
		Subrange oldSubr = subr;
		subr = newSubr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.VAR_TYPE__SUBR, oldSubr, newSubr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubr(Subrange newSubr) {
		if (newSubr != subr) {
			NotificationChain msgs = null;
			if (subr != null)
				msgs = ((InternalEObject)subr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.VAR_TYPE__SUBR, null, msgs);
			if (newSubr != null)
				msgs = ((InternalEObject)newSubr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.VAR_TYPE__SUBR, null, msgs);
			msgs = basicSetSubr(newSubr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.VAR_TYPE__SUBR, newSubr, newSubr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConstant> getConst() {
		if (const_ == null) {
			const_ = new EObjectContainmentEList<TypeConstant>(TypeConstant.class, this, SpectraPackage.VAR_TYPE__CONST);
		}
		return const_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TypeDef)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpectraPackage.VAR_TYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDef newType) {
		TypeDef oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.VAR_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SizeDefineDecl> getDimensions() {
		if (dimensions == null) {
			dimensions = new EObjectContainmentEList<SizeDefineDecl>(SizeDefineDecl.class, this, SpectraPackage.VAR_TYPE__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.VAR_TYPE__SUBR:
				return basicSetSubr(null, msgs);
			case SpectraPackage.VAR_TYPE__CONST:
				return ((InternalEList<?>)getConst()).basicRemove(otherEnd, msgs);
			case SpectraPackage.VAR_TYPE__DIMENSIONS:
				return ((InternalEList<?>)getDimensions()).basicRemove(otherEnd, msgs);
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
			case SpectraPackage.VAR_TYPE__NAME:
				return getName();
			case SpectraPackage.VAR_TYPE__SUBR:
				return getSubr();
			case SpectraPackage.VAR_TYPE__CONST:
				return getConst();
			case SpectraPackage.VAR_TYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case SpectraPackage.VAR_TYPE__DIMENSIONS:
				return getDimensions();
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
			case SpectraPackage.VAR_TYPE__NAME:
				setName((String)newValue);
				return;
			case SpectraPackage.VAR_TYPE__SUBR:
				setSubr((Subrange)newValue);
				return;
			case SpectraPackage.VAR_TYPE__CONST:
				getConst().clear();
				getConst().addAll((Collection<? extends TypeConstant>)newValue);
				return;
			case SpectraPackage.VAR_TYPE__TYPE:
				setType((TypeDef)newValue);
				return;
			case SpectraPackage.VAR_TYPE__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection<? extends SizeDefineDecl>)newValue);
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
			case SpectraPackage.VAR_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpectraPackage.VAR_TYPE__SUBR:
				setSubr((Subrange)null);
				return;
			case SpectraPackage.VAR_TYPE__CONST:
				getConst().clear();
				return;
			case SpectraPackage.VAR_TYPE__TYPE:
				setType((TypeDef)null);
				return;
			case SpectraPackage.VAR_TYPE__DIMENSIONS:
				getDimensions().clear();
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
			case SpectraPackage.VAR_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpectraPackage.VAR_TYPE__SUBR:
				return subr != null;
			case SpectraPackage.VAR_TYPE__CONST:
				return const_ != null && !const_.isEmpty();
			case SpectraPackage.VAR_TYPE__TYPE:
				return type != null;
			case SpectraPackage.VAR_TYPE__DIMENSIONS:
				return dimensions != null && !dimensions.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //VarTypeImpl
