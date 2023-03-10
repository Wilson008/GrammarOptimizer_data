/**
 */
package ATLnoOCL.provider;


import ATLnoOCL.ATLnoOCLPackage;
import ATLnoOCL.RuleVariableDeclaration;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ATLnoOCL.RuleVariableDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleVariableDeclarationItemProvider 
	extends LocatedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleVariableDeclarationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addVarNamePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addInitExpressionPropertyDescriptor(object);
			addLetExpPropertyDescriptor(object);
			addBaseExpPropertyDescriptor(object);
			addVariableExpPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleVariableDeclaration_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleVariableDeclaration_id_feature", "_UI_RuleVariableDeclaration_type"),
				 ATLnoOCLPackage.Literals.RULE_VARIABLE_DECLARATION__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Var Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVarNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleVariableDeclaration_varName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleVariableDeclaration_varName_feature", "_UI_RuleVariableDeclaration_type"),
				 ATLnoOCLPackage.Literals.RULE_VARIABLE_DECLARATION__VAR_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleVariableDeclaration_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleVariableDeclaration_type_feature", "_UI_RuleVariableDeclaration_type"),
				 ATLnoOCLPackage.Literals.RULE_VARIABLE_DECLARATION__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleVariableDeclaration_initExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleVariableDeclaration_initExpression_feature", "_UI_RuleVariableDeclaration_type"),
				 ATLnoOCLPackage.Literals.RULE_VARIABLE_DECLARATION__INIT_EXPRESSION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Let Exp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLetExpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleVariableDeclaration_letExp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleVariableDeclaration_letExp_feature", "_UI_RuleVariableDeclaration_type"),
				 ATLnoOCLPackage.Literals.RULE_VARIABLE_DECLARATION__LET_EXP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Exp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseExpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleVariableDeclaration_baseExp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleVariableDeclaration_baseExp_feature", "_UI_RuleVariableDeclaration_type"),
				 ATLnoOCLPackage.Literals.RULE_VARIABLE_DECLARATION__BASE_EXP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variable Exp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariableExpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleVariableDeclaration_variableExp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleVariableDeclaration_variableExp_feature", "_UI_RuleVariableDeclaration_type"),
				 ATLnoOCLPackage.Literals.RULE_VARIABLE_DECLARATION__VARIABLE_EXP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns RuleVariableDeclaration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RuleVariableDeclaration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RuleVariableDeclaration)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_RuleVariableDeclaration_type") :
			getString("_UI_RuleVariableDeclaration_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RuleVariableDeclaration.class)) {
			case ATLnoOCLPackage.RULE_VARIABLE_DECLARATION__ID:
			case ATLnoOCLPackage.RULE_VARIABLE_DECLARATION__VAR_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
