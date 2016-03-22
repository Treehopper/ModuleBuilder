/**
 */
package modulespecification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see modulespecification.ModulespecificationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/eu.hohenegger.modulebuilder/src-gen'"
 * @generated
 */
public interface ModulespecificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modulespecification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "modulespecification";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modulespecification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModulespecificationPackage eINSTANCE = modulespecification.impl.ModulespecificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link modulespecification.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modulespecification.impl.ModuleImpl
	 * @see modulespecification.impl.ModulespecificationPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 0;

	/**
	 * The feature id for the '<em><b>Updatesites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__UPDATESITES = 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modulespecification.impl.UpdatesiteImpl <em>Updatesite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modulespecification.impl.UpdatesiteImpl
	 * @see modulespecification.impl.ModulespecificationPackageImpl#getUpdatesite()
	 * @generated
	 */
	int UPDATESITE = 1;

	/**
	 * The feature id for the '<em><b>Base Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__BASE_ID = 0;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__MODULE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__CATEGORY_NAME = 2;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__LICENSE = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Copy Right Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__COPY_RIGHT_AUTHOR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Copy Right Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__COPY_RIGHT_URL = 6;

	/**
	 * The feature id for the '<em><b>Copy Right Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__COPY_RIGHT_YEAR = 7;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__PROVIDER_NAME = 8;

	/**
	 * The feature id for the '<em><b>Tycho Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__TYCHO_VERSION = 9;

	/**
	 * The feature id for the '<em><b>Java Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__JAVA_VERSION = 10;

	/**
	 * The feature id for the '<em><b>Core Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__CORE_SUFFIX = 11;

	/**
	 * The feature id for the '<em><b>Ui Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__UI_SUFFIX = 12;

	/**
	 * The feature id for the '<em><b>Generate Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__GENERATE_PARENT = 13;

	/**
	 * The feature id for the '<em><b>Tycho Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__TYCHO_PARENT_NAME = 14;

	/**
	 * The feature id for the '<em><b>Generate Tests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__GENERATE_TESTS = 15;

	/**
	 * The feature id for the '<em><b>Tests Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__TESTS_SUFFIX = 16;

	/**
	 * The feature id for the '<em><b>Generate Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__GENERATE_FEATURE = 17;

	/**
	 * The feature id for the '<em><b>Feature Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__FEATURE_SUFFIX = 18;

	/**
	 * The feature id for the '<em><b>Generate Updatesite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__GENERATE_UPDATESITE = 19;

	/**
	 * The feature id for the '<em><b>Update Site Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__UPDATE_SITE_SUFFIX = 20;

	/**
	 * The feature id for the '<em><b>Generate Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__GENERATE_TARGET = 21;

	/**
	 * The feature id for the '<em><b>Target Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__TARGET_SUFFIX = 22;

	/**
	 * The feature id for the '<em><b>Maven Version Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__MAVEN_VERSION_SUFFIX = 23;

	/**
	 * The feature id for the '<em><b>Osgi Version Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__OSGI_VERSION_QUALIFIER = 24;

	/**
	 * The feature id for the '<em><b>Core Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__CORE_ID = 25;

	/**
	 * The feature id for the '<em><b>Ui Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__UI_ID = 26;

	/**
	 * The feature id for the '<em><b>Tests Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__TESTS_ID = 27;

	/**
	 * The feature id for the '<em><b>Update Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__UPDATE_SITE_ID = 28;

	/**
	 * The feature id for the '<em><b>Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__FEATURE_ID = 29;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__TARGET_ID = 30;

	/**
	 * The feature id for the '<em><b>Maven Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__MAVEN_VERSION = 31;

	/**
	 * The feature id for the '<em><b>Osgi Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__OSGI_VERSION = 32;

	/**
	 * The feature id for the '<em><b>Core Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__CORE_MODULE_NAME = 33;

	/**
	 * The feature id for the '<em><b>Ui Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__UI_MODULE_NAME = 34;

	/**
	 * The feature id for the '<em><b>Is License Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__IS_LICENSE_EMPTY = 35;

	/**
	 * The number of structural features of the '<em>Updatesite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE_FEATURE_COUNT = 36;

	/**
	 * The number of operations of the '<em>Updatesite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link modulespecification.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see modulespecification.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link modulespecification.Module#getUpdatesites <em>Updatesites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Updatesites</em>'.
	 * @see modulespecification.Module#getUpdatesites()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Updatesites();

	/**
	 * Returns the meta object for class '{@link modulespecification.Updatesite <em>Updatesite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Updatesite</em>'.
	 * @see modulespecification.Updatesite
	 * @generated
	 */
	EClass getUpdatesite();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getBaseId <em>Base Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Id</em>'.
	 * @see modulespecification.Updatesite#getBaseId()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_BaseId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see modulespecification.Updatesite#getModuleName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_ModuleName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getCategoryName <em>Category Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Name</em>'.
	 * @see modulespecification.Updatesite#getCategoryName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_CategoryName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see modulespecification.Updatesite#getLicense()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_License();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see modulespecification.Updatesite#getVersion()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_Version();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getCopyRightAuthorName <em>Copy Right Author Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Right Author Name</em>'.
	 * @see modulespecification.Updatesite#getCopyRightAuthorName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_CopyRightAuthorName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getCopyRightUrl <em>Copy Right Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Right Url</em>'.
	 * @see modulespecification.Updatesite#getCopyRightUrl()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_CopyRightUrl();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getCopyRightYear <em>Copy Right Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Right Year</em>'.
	 * @see modulespecification.Updatesite#getCopyRightYear()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_CopyRightYear();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getProviderName <em>Provider Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Name</em>'.
	 * @see modulespecification.Updatesite#getProviderName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_ProviderName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getTychoVersion <em>Tycho Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tycho Version</em>'.
	 * @see modulespecification.Updatesite#getTychoVersion()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_TychoVersion();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getJavaVersion <em>Java Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Version</em>'.
	 * @see modulespecification.Updatesite#getJavaVersion()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_JavaVersion();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getCoreSuffix <em>Core Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Suffix</em>'.
	 * @see modulespecification.Updatesite#getCoreSuffix()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_CoreSuffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getUiSuffix <em>Ui Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Suffix</em>'.
	 * @see modulespecification.Updatesite#getUiSuffix()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_UiSuffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#isGenerateParent <em>Generate Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Parent</em>'.
	 * @see modulespecification.Updatesite#isGenerateParent()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_GenerateParent();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getTychoParentName <em>Tycho Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tycho Parent Name</em>'.
	 * @see modulespecification.Updatesite#getTychoParentName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_TychoParentName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#isGenerateTests <em>Generate Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Tests</em>'.
	 * @see modulespecification.Updatesite#isGenerateTests()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_GenerateTests();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getTestsSuffix <em>Tests Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tests Suffix</em>'.
	 * @see modulespecification.Updatesite#getTestsSuffix()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_TestsSuffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#isGenerateFeature <em>Generate Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Feature</em>'.
	 * @see modulespecification.Updatesite#isGenerateFeature()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_GenerateFeature();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getFeatureSuffix <em>Feature Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Suffix</em>'.
	 * @see modulespecification.Updatesite#getFeatureSuffix()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_FeatureSuffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#isGenerateUpdatesite <em>Generate Updatesite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Updatesite</em>'.
	 * @see modulespecification.Updatesite#isGenerateUpdatesite()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_GenerateUpdatesite();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getUpdateSiteSuffix <em>Update Site Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Site Suffix</em>'.
	 * @see modulespecification.Updatesite#getUpdateSiteSuffix()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_UpdateSiteSuffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#isGenerateTarget <em>Generate Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Target</em>'.
	 * @see modulespecification.Updatesite#isGenerateTarget()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_GenerateTarget();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getTargetSuffix <em>Target Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Suffix</em>'.
	 * @see modulespecification.Updatesite#getTargetSuffix()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_TargetSuffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getMavenVersionSuffix <em>Maven Version Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maven Version Suffix</em>'.
	 * @see modulespecification.Updatesite#getMavenVersionSuffix()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_MavenVersionSuffix();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getOsgiVersionQualifier <em>Osgi Version Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osgi Version Qualifier</em>'.
	 * @see modulespecification.Updatesite#getOsgiVersionQualifier()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_OsgiVersionQualifier();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getCoreId <em>Core Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Id</em>'.
	 * @see modulespecification.Updatesite#getCoreId()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_CoreId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getUiId <em>Ui Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Id</em>'.
	 * @see modulespecification.Updatesite#getUiId()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_UiId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getTestsId <em>Tests Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tests Id</em>'.
	 * @see modulespecification.Updatesite#getTestsId()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_TestsId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getUpdateSiteId <em>Update Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Site Id</em>'.
	 * @see modulespecification.Updatesite#getUpdateSiteId()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_UpdateSiteId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getFeatureId <em>Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Id</em>'.
	 * @see modulespecification.Updatesite#getFeatureId()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_FeatureId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getTargetId <em>Target Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Id</em>'.
	 * @see modulespecification.Updatesite#getTargetId()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_TargetId();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getMavenVersion <em>Maven Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maven Version</em>'.
	 * @see modulespecification.Updatesite#getMavenVersion()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_MavenVersion();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getOsgiVersion <em>Osgi Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osgi Version</em>'.
	 * @see modulespecification.Updatesite#getOsgiVersion()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_OsgiVersion();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getCoreModuleName <em>Core Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Module Name</em>'.
	 * @see modulespecification.Updatesite#getCoreModuleName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_CoreModuleName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getUiModuleName <em>Ui Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Module Name</em>'.
	 * @see modulespecification.Updatesite#getUiModuleName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_UiModuleName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#isIsLicenseEmpty <em>Is License Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is License Empty</em>'.
	 * @see modulespecification.Updatesite#isIsLicenseEmpty()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_IsLicenseEmpty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModulespecificationFactory getModulespecificationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link modulespecification.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modulespecification.impl.ModuleImpl
		 * @see modulespecification.impl.ModulespecificationPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Updatesites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__UPDATESITES = eINSTANCE.getModule_Updatesites();

		/**
		 * The meta object literal for the '{@link modulespecification.impl.UpdatesiteImpl <em>Updatesite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modulespecification.impl.UpdatesiteImpl
		 * @see modulespecification.impl.ModulespecificationPackageImpl#getUpdatesite()
		 * @generated
		 */
		EClass UPDATESITE = eINSTANCE.getUpdatesite();

		/**
		 * The meta object literal for the '<em><b>Base Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__BASE_ID = eINSTANCE.getUpdatesite_BaseId();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__MODULE_NAME = eINSTANCE.getUpdatesite_ModuleName();

		/**
		 * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__CATEGORY_NAME = eINSTANCE.getUpdatesite_CategoryName();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__LICENSE = eINSTANCE.getUpdatesite_License();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__VERSION = eINSTANCE.getUpdatesite_Version();

		/**
		 * The meta object literal for the '<em><b>Copy Right Author Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__COPY_RIGHT_AUTHOR_NAME = eINSTANCE.getUpdatesite_CopyRightAuthorName();

		/**
		 * The meta object literal for the '<em><b>Copy Right Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__COPY_RIGHT_URL = eINSTANCE.getUpdatesite_CopyRightUrl();

		/**
		 * The meta object literal for the '<em><b>Copy Right Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__COPY_RIGHT_YEAR = eINSTANCE.getUpdatesite_CopyRightYear();

		/**
		 * The meta object literal for the '<em><b>Provider Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__PROVIDER_NAME = eINSTANCE.getUpdatesite_ProviderName();

		/**
		 * The meta object literal for the '<em><b>Tycho Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__TYCHO_VERSION = eINSTANCE.getUpdatesite_TychoVersion();

		/**
		 * The meta object literal for the '<em><b>Java Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__JAVA_VERSION = eINSTANCE.getUpdatesite_JavaVersion();

		/**
		 * The meta object literal for the '<em><b>Core Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__CORE_SUFFIX = eINSTANCE.getUpdatesite_CoreSuffix();

		/**
		 * The meta object literal for the '<em><b>Ui Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__UI_SUFFIX = eINSTANCE.getUpdatesite_UiSuffix();

		/**
		 * The meta object literal for the '<em><b>Generate Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__GENERATE_PARENT = eINSTANCE.getUpdatesite_GenerateParent();

		/**
		 * The meta object literal for the '<em><b>Tycho Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__TYCHO_PARENT_NAME = eINSTANCE.getUpdatesite_TychoParentName();

		/**
		 * The meta object literal for the '<em><b>Generate Tests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__GENERATE_TESTS = eINSTANCE.getUpdatesite_GenerateTests();

		/**
		 * The meta object literal for the '<em><b>Tests Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__TESTS_SUFFIX = eINSTANCE.getUpdatesite_TestsSuffix();

		/**
		 * The meta object literal for the '<em><b>Generate Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__GENERATE_FEATURE = eINSTANCE.getUpdatesite_GenerateFeature();

		/**
		 * The meta object literal for the '<em><b>Feature Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__FEATURE_SUFFIX = eINSTANCE.getUpdatesite_FeatureSuffix();

		/**
		 * The meta object literal for the '<em><b>Generate Updatesite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__GENERATE_UPDATESITE = eINSTANCE.getUpdatesite_GenerateUpdatesite();

		/**
		 * The meta object literal for the '<em><b>Update Site Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__UPDATE_SITE_SUFFIX = eINSTANCE.getUpdatesite_UpdateSiteSuffix();

		/**
		 * The meta object literal for the '<em><b>Generate Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__GENERATE_TARGET = eINSTANCE.getUpdatesite_GenerateTarget();

		/**
		 * The meta object literal for the '<em><b>Target Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__TARGET_SUFFIX = eINSTANCE.getUpdatesite_TargetSuffix();

		/**
		 * The meta object literal for the '<em><b>Maven Version Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__MAVEN_VERSION_SUFFIX = eINSTANCE.getUpdatesite_MavenVersionSuffix();

		/**
		 * The meta object literal for the '<em><b>Osgi Version Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__OSGI_VERSION_QUALIFIER = eINSTANCE.getUpdatesite_OsgiVersionQualifier();

		/**
		 * The meta object literal for the '<em><b>Core Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__CORE_ID = eINSTANCE.getUpdatesite_CoreId();

		/**
		 * The meta object literal for the '<em><b>Ui Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__UI_ID = eINSTANCE.getUpdatesite_UiId();

		/**
		 * The meta object literal for the '<em><b>Tests Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__TESTS_ID = eINSTANCE.getUpdatesite_TestsId();

		/**
		 * The meta object literal for the '<em><b>Update Site Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__UPDATE_SITE_ID = eINSTANCE.getUpdatesite_UpdateSiteId();

		/**
		 * The meta object literal for the '<em><b>Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__FEATURE_ID = eINSTANCE.getUpdatesite_FeatureId();

		/**
		 * The meta object literal for the '<em><b>Target Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__TARGET_ID = eINSTANCE.getUpdatesite_TargetId();

		/**
		 * The meta object literal for the '<em><b>Maven Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__MAVEN_VERSION = eINSTANCE.getUpdatesite_MavenVersion();

		/**
		 * The meta object literal for the '<em><b>Osgi Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__OSGI_VERSION = eINSTANCE.getUpdatesite_OsgiVersion();

		/**
		 * The meta object literal for the '<em><b>Core Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__CORE_MODULE_NAME = eINSTANCE.getUpdatesite_CoreModuleName();

		/**
		 * The meta object literal for the '<em><b>Ui Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__UI_MODULE_NAME = eINSTANCE.getUpdatesite_UiModuleName();

		/**
		 * The meta object literal for the '<em><b>Is License Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__IS_LICENSE_EMPTY = eINSTANCE.getUpdatesite_IsLicenseEmpty();

	}

} //ModulespecificationPackage
