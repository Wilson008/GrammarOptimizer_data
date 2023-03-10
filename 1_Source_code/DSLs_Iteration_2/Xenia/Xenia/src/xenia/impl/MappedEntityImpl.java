/**
 */
package xenia.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xenia.InfoProperty;
import xenia.LinkedProperty;
import xenia.MappedEntity;
import xenia.XeniaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapped Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xenia.impl.MappedEntityImpl#getInfoProps <em>Info Props</em>}</li>
 *   <li>{@link xenia.impl.MappedEntityImpl#getLinkedProps <em>Linked Props</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappedEntityImpl extends MinimalEObjectImpl.Container implements MappedEntity {
	/**
	 * The cached value of the '{@link #getInfoProps() <em>Info Props</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoProps()
	 * @generated
	 * @ordered
	 */
	protected EList<InfoProperty> infoProps;

	/**
	 * The cached value of the '{@link #getLinkedProps() <em>Linked Props</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedProps()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkedProperty> linkedProps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XeniaPackage.Literals.MAPPED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfoProperty> getInfoProps() {
		if (infoProps == null) {
			infoProps = new EObjectContainmentEList<InfoProperty>(InfoProperty.class, this, XeniaPackage.MAPPED_ENTITY__INFO_PROPS);
		}
		return infoProps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkedProperty> getLinkedProps() {
		if (linkedProps == null) {
			linkedProps = new EObjectContainmentEList<LinkedProperty>(LinkedProperty.class, this, XeniaPackage.MAPPED_ENTITY__LINKED_PROPS);
		}
		return linkedProps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XeniaPackage.MAPPED_ENTITY__INFO_PROPS:
				return ((InternalEList<?>)getInfoProps()).basicRemove(otherEnd, msgs);
			case XeniaPackage.MAPPED_ENTITY__LINKED_PROPS:
				return ((InternalEList<?>)getLinkedProps()).basicRemove(otherEnd, msgs);
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
			case XeniaPackage.MAPPED_ENTITY__INFO_PROPS:
				return getInfoProps();
			case XeniaPackage.MAPPED_ENTITY__LINKED_PROPS:
				return getLinkedProps();
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
			case XeniaPackage.MAPPED_ENTITY__INFO_PROPS:
				getInfoProps().clear();
				getInfoProps().addAll((Collection<? extends InfoProperty>)newValue);
				return;
			case XeniaPackage.MAPPED_ENTITY__LINKED_PROPS:
				getLinkedProps().clear();
				getLinkedProps().addAll((Collection<? extends LinkedProperty>)newValue);
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
			case XeniaPackage.MAPPED_ENTITY__INFO_PROPS:
				getInfoProps().clear();
				return;
			case XeniaPackage.MAPPED_ENTITY__LINKED_PROPS:
				getLinkedProps().clear();
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
			case XeniaPackage.MAPPED_ENTITY__INFO_PROPS:
				return infoProps != null && !infoProps.isEmpty();
			case XeniaPackage.MAPPED_ENTITY__LINKED_PROPS:
				return linkedProps != null && !linkedProps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappedEntityImpl
