/**
 */
package modulespecification.provider;


import java.util.Collection;
import java.util.List;

import modulespecification.ModulespecificationPackage;
import modulespecification.Updatesite;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link modulespecification.Updatesite} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UpdatesiteItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdatesiteItemProvider(AdapterFactory adapterFactory) {
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

			addBaseIdPropertyDescriptor(object);
			addModuleNamePropertyDescriptor(object);
			addCategoryNamePropertyDescriptor(object);
			addLicensePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addCopyRightAuthorNamePropertyDescriptor(object);
			addCopyRightUrlPropertyDescriptor(object);
			addCopyRightYearPropertyDescriptor(object);
			addProviderNamePropertyDescriptor(object);
			addTychoVersionPropertyDescriptor(object);
			addJavaVersionPropertyDescriptor(object);
			addCoreSuffixPropertyDescriptor(object);
			addUiSuffixPropertyDescriptor(object);
			addGenerateParentPropertyDescriptor(object);
			addTychoParentNamePropertyDescriptor(object);
			addGenerateTestsPropertyDescriptor(object);
			addTestsSuffixPropertyDescriptor(object);
			addGenerateFeaturePropertyDescriptor(object);
			addFeatureSuffixPropertyDescriptor(object);
			addGenerateUpdatesitePropertyDescriptor(object);
			addUpdateSiteSuffixPropertyDescriptor(object);
			addGenerateTargetPropertyDescriptor(object);
			addTargetSuffixPropertyDescriptor(object);
			addMavenVersionSuffixPropertyDescriptor(object);
			addOsgiVersionQualifierPropertyDescriptor(object);
			addCoreIdPropertyDescriptor(object);
			addUiIdPropertyDescriptor(object);
			addTestsIdPropertyDescriptor(object);
			addUpdateSiteIdPropertyDescriptor(object);
			addFeatureIdPropertyDescriptor(object);
			addTargetIdPropertyDescriptor(object);
			addMavenVersionPropertyDescriptor(object);
			addOsgiVersionPropertyDescriptor(object);
			addCoreModuleNamePropertyDescriptor(object);
			addUiModuleNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_baseId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_baseId_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__BASE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Module Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModuleNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_moduleName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_moduleName_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__MODULE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_categoryName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_categoryName_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__CATEGORY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the License feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLicensePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_license_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_license_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__LICENSE,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_version_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Copy Right Author Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyRightAuthorNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_copyRightAuthorName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_copyRightAuthorName_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__COPY_RIGHT_AUTHOR_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Copy Right Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyRightUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_copyRightUrl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_copyRightUrl_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__COPY_RIGHT_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Copy Right Year feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyRightYearPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_copyRightYear_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_copyRightYear_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__COPY_RIGHT_YEAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provider Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProviderNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_providerName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_providerName_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__PROVIDER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tycho Parent Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTychoParentNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_tychoParentName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_tychoParentName_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__TYCHO_PARENT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate Tests feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateTestsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_generateTests_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_generateTests_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__GENERATE_TESTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tycho Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTychoVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_tychoVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_tychoVersion_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__TYCHO_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Java Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJavaVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_javaVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_javaVersion_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__JAVA_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Core Suffix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoreSuffixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_coreSuffix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_coreSuffix_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__CORE_SUFFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ui Suffix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUiSuffixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_uiSuffix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_uiSuffix_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__UI_SUFFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_generateParent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_generateParent_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__GENERATE_PARENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tests Suffix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTestsSuffixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_testsSuffix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_testsSuffix_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__TESTS_SUFFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_generateFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_generateFeature_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__GENERATE_FEATURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Feature Suffix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeatureSuffixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_featureSuffix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_featureSuffix_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__FEATURE_SUFFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate Updatesite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateUpdatesitePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_generateUpdatesite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_generateUpdatesite_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__GENERATE_UPDATESITE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Update Site Suffix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdateSiteSuffixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_updateSiteSuffix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_updateSiteSuffix_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__UPDATE_SITE_SUFFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_generateTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_generateTarget_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__GENERATE_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Suffix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetSuffixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_targetSuffix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_targetSuffix_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__TARGET_SUFFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maven Version Suffix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMavenVersionSuffixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_mavenVersionSuffix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_mavenVersionSuffix_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__MAVEN_VERSION_SUFFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Osgi Version Qualifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOsgiVersionQualifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_osgiVersionQualifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_osgiVersionQualifier_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__OSGI_VERSION_QUALIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Core Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoreIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_coreId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_coreId_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__CORE_ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ui Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUiIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_uiId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_uiId_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__UI_ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tests Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTestsIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_testsId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_testsId_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__TESTS_ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Update Site Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdateSiteIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_updateSiteId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_updateSiteId_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__UPDATE_SITE_ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Feature Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeatureIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_featureId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_featureId_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__FEATURE_ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_targetId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_targetId_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__TARGET_ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maven Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMavenVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_mavenVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_mavenVersion_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__MAVEN_VERSION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Osgi Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOsgiVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_osgiVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_osgiVersion_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__OSGI_VERSION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Core Module Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoreModuleNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_coreModuleName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_coreModuleName_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__CORE_MODULE_NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ui Module Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUiModuleNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatesite_uiModuleName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatesite_uiModuleName_feature", "_UI_Updatesite_type"),
				 ModulespecificationPackage.Literals.UPDATESITE__UI_MODULE_NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Updatesite.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Updatesite"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Updatesite)object).getModuleName();
		return label == null || label.length() == 0 ?
			getString("_UI_Updatesite_type") :
			getString("_UI_Updatesite_type") + " " + label;
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

		switch (notification.getFeatureID(Updatesite.class)) {
			case ModulespecificationPackage.UPDATESITE__BASE_ID:
			case ModulespecificationPackage.UPDATESITE__MODULE_NAME:
			case ModulespecificationPackage.UPDATESITE__CATEGORY_NAME:
			case ModulespecificationPackage.UPDATESITE__LICENSE:
			case ModulespecificationPackage.UPDATESITE__VERSION:
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_AUTHOR_NAME:
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_URL:
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_YEAR:
			case ModulespecificationPackage.UPDATESITE__PROVIDER_NAME:
			case ModulespecificationPackage.UPDATESITE__TYCHO_VERSION:
			case ModulespecificationPackage.UPDATESITE__JAVA_VERSION:
			case ModulespecificationPackage.UPDATESITE__CORE_SUFFIX:
			case ModulespecificationPackage.UPDATESITE__UI_SUFFIX:
			case ModulespecificationPackage.UPDATESITE__GENERATE_PARENT:
			case ModulespecificationPackage.UPDATESITE__TYCHO_PARENT_NAME:
			case ModulespecificationPackage.UPDATESITE__GENERATE_TESTS:
			case ModulespecificationPackage.UPDATESITE__TESTS_SUFFIX:
			case ModulespecificationPackage.UPDATESITE__GENERATE_FEATURE:
			case ModulespecificationPackage.UPDATESITE__FEATURE_SUFFIX:
			case ModulespecificationPackage.UPDATESITE__GENERATE_UPDATESITE:
			case ModulespecificationPackage.UPDATESITE__UPDATE_SITE_SUFFIX:
			case ModulespecificationPackage.UPDATESITE__GENERATE_TARGET:
			case ModulespecificationPackage.UPDATESITE__TARGET_SUFFIX:
			case ModulespecificationPackage.UPDATESITE__MAVEN_VERSION_SUFFIX:
			case ModulespecificationPackage.UPDATESITE__OSGI_VERSION_QUALIFIER:
			case ModulespecificationPackage.UPDATESITE__CORE_ID:
			case ModulespecificationPackage.UPDATESITE__UI_ID:
			case ModulespecificationPackage.UPDATESITE__TESTS_ID:
			case ModulespecificationPackage.UPDATESITE__UPDATE_SITE_ID:
			case ModulespecificationPackage.UPDATESITE__FEATURE_ID:
			case ModulespecificationPackage.UPDATESITE__TARGET_ID:
			case ModulespecificationPackage.UPDATESITE__MAVEN_VERSION:
			case ModulespecificationPackage.UPDATESITE__OSGI_VERSION:
			case ModulespecificationPackage.UPDATESITE__CORE_MODULE_NAME:
			case ModulespecificationPackage.UPDATESITE__UI_MODULE_NAME:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UpdatesiteEditPlugin.INSTANCE;
	}

}
