/**
 */
package xcore.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.xtext.xbase.XbaseFactory;

import xcore.XStructuralFeature;
import xcore.XcorePackage;

/**
 * This is the item provider adapter for a {@link xcore.XStructuralFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XStructuralFeatureItemProvider extends XMemberItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XStructuralFeatureItemProvider(AdapterFactory adapterFactory) {
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

			addReadonlyPropertyDescriptor(object);
			addVolatilePropertyDescriptor(object);
			addTransientPropertyDescriptor(object);
			addUnsettablePropertyDescriptor(object);
			addDerivedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Readonly feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadonlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XStructuralFeature_readonly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XStructuralFeature_readonly_feature", "_UI_XStructuralFeature_type"),
				 XcorePackage.Literals.XSTRUCTURAL_FEATURE__READONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Volatile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolatilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XStructuralFeature_volatile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XStructuralFeature_volatile_feature", "_UI_XStructuralFeature_type"),
				 XcorePackage.Literals.XSTRUCTURAL_FEATURE__VOLATILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XStructuralFeature_transient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XStructuralFeature_transient_feature", "_UI_XStructuralFeature_type"),
				 XcorePackage.Literals.XSTRUCTURAL_FEATURE__TRANSIENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unsettable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnsettablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XStructuralFeature_unsettable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XStructuralFeature_unsettable_feature", "_UI_XStructuralFeature_type"),
				 XcorePackage.Literals.XSTRUCTURAL_FEATURE__UNSETTABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Derived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XStructuralFeature_derived_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XStructuralFeature_derived_feature", "_UI_XStructuralFeature_type"),
				 XcorePackage.Literals.XSTRUCTURAL_FEATURE__DERIVED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(XcorePackage.Literals.XSTRUCTURAL_FEATURE__GET_BODY);
			childrenFeatures.add(XcorePackage.Literals.XSTRUCTURAL_FEATURE__SET_BODY);
			childrenFeatures.add(XcorePackage.Literals.XSTRUCTURAL_FEATURE__IS_SET_BODY);
			childrenFeatures.add(XcorePackage.Literals.XSTRUCTURAL_FEATURE__UNSET_BODY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XStructuralFeature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_XStructuralFeature_type") :
			getString("_UI_XStructuralFeature_type") + " " + label;
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

		switch (notification.getFeatureID(XStructuralFeature.class)) {
			case XcorePackage.XSTRUCTURAL_FEATURE__READONLY:
			case XcorePackage.XSTRUCTURAL_FEATURE__VOLATILE:
			case XcorePackage.XSTRUCTURAL_FEATURE__TRANSIENT:
			case XcorePackage.XSTRUCTURAL_FEATURE__UNSETTABLE:
			case XcorePackage.XSTRUCTURAL_FEATURE__DERIVED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XcorePackage.XSTRUCTURAL_FEATURE__GET_BODY:
			case XcorePackage.XSTRUCTURAL_FEATURE__SET_BODY:
			case XcorePackage.XSTRUCTURAL_FEATURE__IS_SET_BODY:
			case XcorePackage.XSTRUCTURAL_FEATURE__UNSET_BODY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(XcorePackage.Literals.XSTRUCTURAL_FEATURE__GET_BODY,
				 XbaseFactory.eINSTANCE.createXBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(XcorePackage.Literals.XSTRUCTURAL_FEATURE__SET_BODY,
				 XbaseFactory.eINSTANCE.createXBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(XcorePackage.Literals.XSTRUCTURAL_FEATURE__IS_SET_BODY,
				 XbaseFactory.eINSTANCE.createXBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(XcorePackage.Literals.XSTRUCTURAL_FEATURE__UNSET_BODY,
				 XbaseFactory.eINSTANCE.createXBlockExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == XcorePackage.Literals.XSTRUCTURAL_FEATURE__GET_BODY ||
			childFeature == XcorePackage.Literals.XSTRUCTURAL_FEATURE__SET_BODY ||
			childFeature == XcorePackage.Literals.XSTRUCTURAL_FEATURE__IS_SET_BODY ||
			childFeature == XcorePackage.Literals.XSTRUCTURAL_FEATURE__UNSET_BODY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
