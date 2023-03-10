/**
 */
package QVTOperational.impl;

import EMOF.impl.ElementImpl;
import QVTOperational.ExpressionGO;
import QVTOperational.ImperativeOperation;
import QVTOperational.OperationBody;
import QVTOperational.QVTOperationalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.OperationBodyImpl#getContent <em>Content</em>}</li>
 *   <li>{@link QVTOperational.impl.OperationBodyImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link QVTOperational.impl.OperationBodyImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationBodyImpl extends ElementImpl implements OperationBody {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionGO> content;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionGO> variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.OPERATION_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionGO> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<ExpressionGO>(ExpressionGO.class, this, QVTOperationalPackage.OPERATION_BODY__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOperation getOperation() {
		if (eContainerFeatureID() != QVTOperationalPackage.OPERATION_BODY__OPERATION) return null;
		return (ImperativeOperation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(ImperativeOperation newOperation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOperation, QVTOperationalPackage.OPERATION_BODY__OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(ImperativeOperation newOperation) {
		if (newOperation != eInternalContainer() || (eContainerFeatureID() != QVTOperationalPackage.OPERATION_BODY__OPERATION && newOperation != null)) {
			if (EcoreUtil.isAncestor(this, newOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, QVTOperationalPackage.IMPERATIVE_OPERATION__BODY, ImperativeOperation.class, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.OPERATION_BODY__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionGO> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<ExpressionGO>(ExpressionGO.class, this, QVTOperationalPackage.OPERATION_BODY__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalPackage.OPERATION_BODY__OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOperation((ImperativeOperation)otherEnd, msgs);
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
			case QVTOperationalPackage.OPERATION_BODY__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case QVTOperationalPackage.OPERATION_BODY__OPERATION:
				return basicSetOperation(null, msgs);
			case QVTOperationalPackage.OPERATION_BODY__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
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
			case QVTOperationalPackage.OPERATION_BODY__OPERATION:
				return eInternalContainer().eInverseRemove(this, QVTOperationalPackage.IMPERATIVE_OPERATION__BODY, ImperativeOperation.class, msgs);
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
			case QVTOperationalPackage.OPERATION_BODY__CONTENT:
				return getContent();
			case QVTOperationalPackage.OPERATION_BODY__OPERATION:
				return getOperation();
			case QVTOperationalPackage.OPERATION_BODY__VARIABLE:
				return getVariable();
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
			case QVTOperationalPackage.OPERATION_BODY__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends ExpressionGO>)newValue);
				return;
			case QVTOperationalPackage.OPERATION_BODY__OPERATION:
				setOperation((ImperativeOperation)newValue);
				return;
			case QVTOperationalPackage.OPERATION_BODY__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends ExpressionGO>)newValue);
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
			case QVTOperationalPackage.OPERATION_BODY__CONTENT:
				getContent().clear();
				return;
			case QVTOperationalPackage.OPERATION_BODY__OPERATION:
				setOperation((ImperativeOperation)null);
				return;
			case QVTOperationalPackage.OPERATION_BODY__VARIABLE:
				getVariable().clear();
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
			case QVTOperationalPackage.OPERATION_BODY__CONTENT:
				return content != null && !content.isEmpty();
			case QVTOperationalPackage.OPERATION_BODY__OPERATION:
				return getOperation() != null;
			case QVTOperationalPackage.OPERATION_BODY__VARIABLE:
				return variable != null && !variable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationBodyImpl
