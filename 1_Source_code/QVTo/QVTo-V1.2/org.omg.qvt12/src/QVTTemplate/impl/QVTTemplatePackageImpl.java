/**
 */
package QVTTemplate.impl;

import EMOF.EMOFPackage;

import EMOF.impl.EMOFPackageImpl;

import EssentialOCL.EssentialOCLPackage;

import EssentialOCL.impl.EssentialOCLPackageImpl;

import ImperativeOCL.ImperativeOCLPackage;

import ImperativeOCL.impl.ImperativeOCLPackageImpl;

import PrimitiveTypes.PrimitiveTypesPackage;

import PrimitiveTypes.impl.PrimitiveTypesPackageImpl;

import QVTBase.QVTBasePackage;

import QVTBase.impl.QVTBasePackageImpl;

import QVTOperational.QVTOperationalPackage;

import QVTOperational.impl.QVTOperationalPackageImpl;

import QVTRelation.QVTRelationPackage;

import QVTRelation.impl.QVTRelationPackageImpl;

import QVTTemplate.CollectionTemplateExp;
import QVTTemplate.ObjectTemplateExp;
import QVTTemplate.PropertyTemplateItem;
import QVTTemplate.QVTTemplateFactory;
import QVTTemplate.QVTTemplatePackage;
import QVTTemplate.TemplateExp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QVTTemplatePackageImpl extends EPackageImpl implements QVTTemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTemplateExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTemplateExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTemplateItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateExpEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see QVTTemplate.QVTTemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QVTTemplatePackageImpl() {
		super(eNS_URI, QVTTemplateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link QVTTemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QVTTemplatePackage init() {
		if (isInited) return (QVTTemplatePackage)EPackage.Registry.INSTANCE.getEPackage(QVTTemplatePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQVTTemplatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QVTTemplatePackageImpl theQVTTemplatePackage = registeredQVTTemplatePackage instanceof QVTTemplatePackageImpl ? (QVTTemplatePackageImpl)registeredQVTTemplatePackage : new QVTTemplatePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QVTOperationalPackage.eNS_URI);
		QVTOperationalPackageImpl theQVTOperationalPackage = (QVTOperationalPackageImpl)(registeredPackage instanceof QVTOperationalPackageImpl ? registeredPackage : QVTOperationalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EMOFPackage.eNS_URI);
		EMOFPackageImpl theEMOFPackage = (EMOFPackageImpl)(registeredPackage instanceof EMOFPackageImpl ? registeredPackage : EMOFPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);
		PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(registeredPackage instanceof PrimitiveTypesPackageImpl ? registeredPackage : PrimitiveTypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EssentialOCLPackage.eNS_URI);
		EssentialOCLPackageImpl theEssentialOCLPackage = (EssentialOCLPackageImpl)(registeredPackage instanceof EssentialOCLPackageImpl ? registeredPackage : EssentialOCLPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ImperativeOCLPackage.eNS_URI);
		ImperativeOCLPackageImpl theImperativeOCLPackage = (ImperativeOCLPackageImpl)(registeredPackage instanceof ImperativeOCLPackageImpl ? registeredPackage : ImperativeOCLPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QVTRelationPackage.eNS_URI);
		QVTRelationPackageImpl theQVTRelationPackage = (QVTRelationPackageImpl)(registeredPackage instanceof QVTRelationPackageImpl ? registeredPackage : QVTRelationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QVTBasePackage.eNS_URI);
		QVTBasePackageImpl theQVTBasePackage = (QVTBasePackageImpl)(registeredPackage instanceof QVTBasePackageImpl ? registeredPackage : QVTBasePackage.eINSTANCE);

		// Create package meta-data objects
		theQVTTemplatePackage.createPackageContents();
		theQVTOperationalPackage.createPackageContents();
		theEMOFPackage.createPackageContents();
		thePrimitiveTypesPackage.createPackageContents();
		theEssentialOCLPackage.createPackageContents();
		theImperativeOCLPackage.createPackageContents();
		theQVTRelationPackage.createPackageContents();
		theQVTBasePackage.createPackageContents();

		// Initialize created meta-data
		theQVTTemplatePackage.initializePackageContents();
		theQVTOperationalPackage.initializePackageContents();
		theEMOFPackage.initializePackageContents();
		thePrimitiveTypesPackage.initializePackageContents();
		theEssentialOCLPackage.initializePackageContents();
		theImperativeOCLPackage.initializePackageContents();
		theQVTRelationPackage.initializePackageContents();
		theQVTBasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQVTTemplatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QVTTemplatePackage.eNS_URI, theQVTTemplatePackage);
		return theQVTTemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionTemplateExp() {
		return collectionTemplateExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionTemplateExp_Member() {
		return (EReference)collectionTemplateExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionTemplateExp_ReferredCollectionType() {
		return (EReference)collectionTemplateExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionTemplateExp_Rest() {
		return (EReference)collectionTemplateExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTemplateExp() {
		return objectTemplateExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTemplateExp_Part() {
		return (EReference)objectTemplateExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTemplateExp_ReferredClass() {
		return (EReference)objectTemplateExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyTemplateItem() {
		return propertyTemplateItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyTemplateItem_IsOpposite() {
		return (EAttribute)propertyTemplateItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyTemplateItem_ObjContainer() {
		return (EReference)propertyTemplateItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyTemplateItem_ReferredProperty() {
		return (EReference)propertyTemplateItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyTemplateItem_Value() {
		return (EReference)propertyTemplateItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateExp() {
		return templateExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExp_BindsTo() {
		return (EReference)templateExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateExp_Where() {
		return (EReference)templateExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTTemplateFactory getQVTTemplateFactory() {
		return (QVTTemplateFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		collectionTemplateExpEClass = createEClass(COLLECTION_TEMPLATE_EXP);
		createEReference(collectionTemplateExpEClass, COLLECTION_TEMPLATE_EXP__MEMBER);
		createEReference(collectionTemplateExpEClass, COLLECTION_TEMPLATE_EXP__REFERRED_COLLECTION_TYPE);
		createEReference(collectionTemplateExpEClass, COLLECTION_TEMPLATE_EXP__REST);

		objectTemplateExpEClass = createEClass(OBJECT_TEMPLATE_EXP);
		createEReference(objectTemplateExpEClass, OBJECT_TEMPLATE_EXP__PART);
		createEReference(objectTemplateExpEClass, OBJECT_TEMPLATE_EXP__REFERRED_CLASS);

		propertyTemplateItemEClass = createEClass(PROPERTY_TEMPLATE_ITEM);
		createEAttribute(propertyTemplateItemEClass, PROPERTY_TEMPLATE_ITEM__IS_OPPOSITE);
		createEReference(propertyTemplateItemEClass, PROPERTY_TEMPLATE_ITEM__OBJ_CONTAINER);
		createEReference(propertyTemplateItemEClass, PROPERTY_TEMPLATE_ITEM__REFERRED_PROPERTY);
		createEReference(propertyTemplateItemEClass, PROPERTY_TEMPLATE_ITEM__VALUE);

		templateExpEClass = createEClass(TEMPLATE_EXP);
		createEReference(templateExpEClass, TEMPLATE_EXP__BINDS_TO);
		createEReference(templateExpEClass, TEMPLATE_EXP__WHERE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EssentialOCLPackage theEssentialOCLPackage = (EssentialOCLPackage)EPackage.Registry.INSTANCE.getEPackage(EssentialOCLPackage.eNS_URI);
		EMOFPackage theEMOFPackage = (EMOFPackage)EPackage.Registry.INSTANCE.getEPackage(EMOFPackage.eNS_URI);
		PrimitiveTypesPackage thePrimitiveTypesPackage = (PrimitiveTypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		collectionTemplateExpEClass.getESuperTypes().add(this.getTemplateExp());
		objectTemplateExpEClass.getESuperTypes().add(this.getTemplateExp());
		propertyTemplateItemEClass.getESuperTypes().add(theEMOFPackage.getElement());
		templateExpEClass.getESuperTypes().add(theEssentialOCLPackage.getLiteralExp());

		// Initialize classes, features, and operations; add parameters
		initEClass(collectionTemplateExpEClass, CollectionTemplateExp.class, "CollectionTemplateExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionTemplateExp_Member(), theEssentialOCLPackage.getOclExpression(), null, "member", null, 0, -1, CollectionTemplateExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCollectionTemplateExp_ReferredCollectionType(), theEssentialOCLPackage.getCollectionType(), null, "referredCollectionType", null, 1, 1, CollectionTemplateExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionTemplateExp_Rest(), theEssentialOCLPackage.getVariable(), null, "rest", null, 0, 1, CollectionTemplateExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTemplateExpEClass, ObjectTemplateExp.class, "ObjectTemplateExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectTemplateExp_Part(), this.getPropertyTemplateItem(), this.getPropertyTemplateItem_ObjContainer(), "part", null, 0, -1, ObjectTemplateExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectTemplateExp_ReferredClass(), theEMOFPackage.getClass_(), null, "referredClass", null, 1, 1, ObjectTemplateExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyTemplateItemEClass, PropertyTemplateItem.class, "PropertyTemplateItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyTemplateItem_IsOpposite(), thePrimitiveTypesPackage.getBoolean(), "isOpposite", "false", 0, 1, PropertyTemplateItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyTemplateItem_ObjContainer(), this.getObjectTemplateExp(), this.getObjectTemplateExp_Part(), "objContainer", null, 1, 1, PropertyTemplateItem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyTemplateItem_ReferredProperty(), theEMOFPackage.getProperty(), null, "referredProperty", null, 1, 1, PropertyTemplateItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyTemplateItem_Value(), theEssentialOCLPackage.getOclExpression(), null, "value", null, 1, 1, PropertyTemplateItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateExpEClass, TemplateExp.class, "TemplateExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateExp_BindsTo(), theEssentialOCLPackage.getVariable(), null, "bindsTo", null, 0, 1, TemplateExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateExp_Where(), theEssentialOCLPackage.getOclExpression(), null, "where", null, 0, 1, TemplateExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";
		addAnnotation
		  (getCollectionTemplateExp_Member(),
		   source,
		   new String[] {
			   "body", "listContainer"
		   });
		addAnnotation
		  (getCollectionTemplateExp_ReferredCollectionType(),
		   source,
		   new String[] {
			   "body", "collectionTemplateExp"
		   });
		addAnnotation
		  (getCollectionTemplateExp_Rest(),
		   source,
		   new String[] {
			   "body", "matchingExp"
		   });
		addAnnotation
		  (getObjectTemplateExp_ReferredClass(),
		   source,
		   new String[] {
			   "body", "objectTemplateExp"
		   });
		addAnnotation
		  (getPropertyTemplateItem_ReferredProperty(),
		   source,
		   new String[] {
			   "body", "propertyItem"
		   });
		addAnnotation
		  (getPropertyTemplateItem_Value(),
		   source,
		   new String[] {
			   "body", "propertyItem"
		   });
		addAnnotation
		  (getTemplateExp_BindsTo(),
		   source,
		   new String[] {
			   "body", "templateExp"
		   });
		addAnnotation
		  (getTemplateExp_Where(),
		   source,
		   new String[] {
			   "body", "owner"
		   });
	}

} //QVTTemplatePackageImpl
