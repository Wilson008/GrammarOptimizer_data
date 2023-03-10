/**
 */
package xenia.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xenia.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XeniaFactoryImpl extends EFactoryImpl implements XeniaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XeniaFactory init() {
		try {
			XeniaFactory theXeniaFactory = (XeniaFactory)EPackage.Registry.INSTANCE.getEFactory(XeniaPackage.eNS_URI);
			if (theXeniaFactory != null) {
				return theXeniaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XeniaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XeniaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XeniaPackage.MODEL: return createModel();
			case XeniaPackage.HEADER: return createHeader();
			case XeniaPackage.ENTITY: return createEntity();
			case XeniaPackage.SUPER_SITE: return createSuperSite();
			case XeniaPackage.SITE_WITH_MODAL: return createSiteWithModal();
			case XeniaPackage.MAPPED_ENTITY: return createMappedEntity();
			case XeniaPackage.INFO_PROPERTY: return createInfoProperty();
			case XeniaPackage.INFO_ENTITY: return createInfoEntity();
			case XeniaPackage.SITE: return createSite();
			case XeniaPackage.LINKED_PROPERTY: return createLinkedProperty();
			case XeniaPackage.REDIRECT_PAGE: return createRedirectPage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XeniaPackage.MODE:
				return createModeFromString(eDataType, initialValue);
			case XeniaPackage.INFO_ENTRY:
				return createInfoEntryFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XeniaPackage.MODE:
				return convertModeToString(eDataType, instanceValue);
			case XeniaPackage.INFO_ENTRY:
				return convertInfoEntryToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperSite createSuperSite() {
		SuperSiteImpl superSite = new SuperSiteImpl();
		return superSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteWithModal createSiteWithModal() {
		SiteWithModalImpl siteWithModal = new SiteWithModalImpl();
		return siteWithModal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedEntity createMappedEntity() {
		MappedEntityImpl mappedEntity = new MappedEntityImpl();
		return mappedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoProperty createInfoProperty() {
		InfoPropertyImpl infoProperty = new InfoPropertyImpl();
		return infoProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoEntity createInfoEntity() {
		InfoEntityImpl infoEntity = new InfoEntityImpl();
		return infoEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site createSite() {
		SiteImpl site = new SiteImpl();
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedProperty createLinkedProperty() {
		LinkedPropertyImpl linkedProperty = new LinkedPropertyImpl();
		return linkedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedirectPage createRedirectPage() {
		RedirectPageImpl redirectPage = new RedirectPageImpl();
		return redirectPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeFromString(EDataType eDataType, String initialValue) {
		Mode result = Mode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoEntry createInfoEntryFromString(EDataType eDataType, String initialValue) {
		InfoEntry result = InfoEntry.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInfoEntryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XeniaPackage getXeniaPackage() {
		return (XeniaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XeniaPackage getPackage() {
		return XeniaPackage.eINSTANCE;
	}

} //XeniaFactoryImpl
