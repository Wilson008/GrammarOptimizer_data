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

import xenia.Entity;
import xenia.Header;
import xenia.MappedEntity;
import xenia.Model;
import xenia.XeniaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xenia.impl.ModelImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link xenia.impl.ModelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link xenia.impl.ModelImpl#getMapped_entities <em>Mapped entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<Header> headers;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getMapped_entities() <em>Mapped entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapped_entities()
	 * @generated
	 * @ordered
	 */
	protected EList<MappedEntity> mapped_entities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XeniaPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Header> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentEList<Header>(Header.class, this, XeniaPackage.MODEL__HEADERS);
		}
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, XeniaPackage.MODEL__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappedEntity> getMapped_entities() {
		if (mapped_entities == null) {
			mapped_entities = new EObjectContainmentEList<MappedEntity>(MappedEntity.class, this, XeniaPackage.MODEL__MAPPED_ENTITIES);
		}
		return mapped_entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XeniaPackage.MODEL__HEADERS:
				return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
			case XeniaPackage.MODEL__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case XeniaPackage.MODEL__MAPPED_ENTITIES:
				return ((InternalEList<?>)getMapped_entities()).basicRemove(otherEnd, msgs);
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
			case XeniaPackage.MODEL__HEADERS:
				return getHeaders();
			case XeniaPackage.MODEL__ENTITIES:
				return getEntities();
			case XeniaPackage.MODEL__MAPPED_ENTITIES:
				return getMapped_entities();
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
			case XeniaPackage.MODEL__HEADERS:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends Header>)newValue);
				return;
			case XeniaPackage.MODEL__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case XeniaPackage.MODEL__MAPPED_ENTITIES:
				getMapped_entities().clear();
				getMapped_entities().addAll((Collection<? extends MappedEntity>)newValue);
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
			case XeniaPackage.MODEL__HEADERS:
				getHeaders().clear();
				return;
			case XeniaPackage.MODEL__ENTITIES:
				getEntities().clear();
				return;
			case XeniaPackage.MODEL__MAPPED_ENTITIES:
				getMapped_entities().clear();
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
			case XeniaPackage.MODEL__HEADERS:
				return headers != null && !headers.isEmpty();
			case XeniaPackage.MODEL__ENTITIES:
				return entities != null && !entities.isEmpty();
			case XeniaPackage.MODEL__MAPPED_ENTITIES:
				return mapped_entities != null && !mapped_entities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
