/**
 */
package modulespecification.impl;

import modulespecification.ModulespecificationPackage;
import modulespecification.Updatesite;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Updatesite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getBaseId <em>Base Id</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getLicense <em>License</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getCopyRightAuthorName <em>Copy Right Author Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getCopyRightUrl <em>Copy Right Url</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getCopyRightYear <em>Copy Right Year</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getTychoVersion <em>Tycho Version</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getJavaVersion <em>Java Version</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getCoreSuffix <em>Core Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getUiSuffix <em>Ui Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#isGenerateParent <em>Generate Parent</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getTychoParentName <em>Tycho Parent Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#isGenerateTests <em>Generate Tests</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getTestsSuffix <em>Tests Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#isGenerateFeature <em>Generate Feature</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getFeatureSuffix <em>Feature Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#isGenerateUpdatesite <em>Generate Updatesite</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getUpdateSiteSuffix <em>Update Site Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#isGenerateTarget <em>Generate Target</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getTargetSuffix <em>Target Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getMavenVersionSuffix <em>Maven Version Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getOsgiVersionQualifier <em>Osgi Version Qualifier</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getCoreId <em>Core Id</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getUiId <em>Ui Id</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getTestsId <em>Tests Id</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getUpdateSiteId <em>Update Site Id</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getFeatureId <em>Feature Id</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getMavenVersion <em>Maven Version</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getOsgiVersion <em>Osgi Version</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getCoreModuleName <em>Core Module Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getUiModuleName <em>Ui Module Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#isIsLicenseEmpty <em>Is License Empty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdatesiteImpl extends MinimalEObjectImpl.Container implements Updatesite {
	/**
	 * The default value of the '{@link #getBaseId() <em>Base Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseId()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getBaseId() <em>Base Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseId()
	 * @generated
	 * @ordered
	 */
	protected String baseId = BASE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_NAME_EDEFAULT = "TODO";

	/**
	 * The cached value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected String moduleName = MODULE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_NAME_EDEFAULT = "TODO";

	/**
	 * The cached value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected String categoryName = CATEGORY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyRightAuthorName() <em>Copy Right Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightAuthorName()
	 * @generated
	 * @ordered
	 */
	protected static final String COPY_RIGHT_AUTHOR_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCopyRightAuthorName() <em>Copy Right Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightAuthorName()
	 * @generated
	 * @ordered
	 */
	protected String copyRightAuthorName = COPY_RIGHT_AUTHOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyRightUrl() <em>Copy Right Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String COPY_RIGHT_URL_EDEFAULT = "http://www.example.org";

	/**
	 * The cached value of the '{@link #getCopyRightUrl() <em>Copy Right Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightUrl()
	 * @generated
	 * @ordered
	 */
	protected String copyRightUrl = COPY_RIGHT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyRightYear() <em>Copy Right Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightYear()
	 * @generated
	 * @ordered
	 */
	protected static final String COPY_RIGHT_YEAR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCopyRightYear() <em>Copy Right Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightYear()
	 * @generated
	 * @ordered
	 */
	protected String copyRightYear = COPY_RIGHT_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_NAME_EDEFAULT = "http://www.example.org";

	/**
	 * The cached value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected String providerName = PROVIDER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTychoVersion() <em>Tycho Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTychoVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String TYCHO_VERSION_EDEFAULT = "0.24.0";

	/**
	 * The cached value of the '{@link #getTychoVersion() <em>Tycho Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTychoVersion()
	 * @generated
	 * @ordered
	 */
	protected String tychoVersion = TYCHO_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaVersion() <em>Java Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_VERSION_EDEFAULT = "JavaSE-1.8";

	/**
	 * The cached value of the '{@link #getJavaVersion() <em>Java Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaVersion()
	 * @generated
	 * @ordered
	 */
	protected String javaVersion = JAVA_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreSuffix() <em>Core Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String CORE_SUFFIX_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCoreSuffix() <em>Core Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreSuffix()
	 * @generated
	 * @ordered
	 */
	protected String coreSuffix = CORE_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getUiSuffix() <em>Ui Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String UI_SUFFIX_EDEFAULT = ".ui";

	/**
	 * The cached value of the '{@link #getUiSuffix() <em>Ui Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiSuffix()
	 * @generated
	 * @ordered
	 */
	protected String uiSuffix = UI_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateParent() <em>Generate Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateParent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_PARENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateParent() <em>Generate Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateParent()
	 * @generated
	 * @ordered
	 */
	protected boolean generateParent = GENERATE_PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTychoParentName() <em>Tycho Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTychoParentName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYCHO_PARENT_NAME_EDEFAULT = "parent";

	/**
	 * The cached value of the '{@link #getTychoParentName() <em>Tycho Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTychoParentName()
	 * @generated
	 * @ordered
	 */
	protected String tychoParentName = TYCHO_PARENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateTests() <em>Generate Tests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTests()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_TESTS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateTests() <em>Generate Tests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTests()
	 * @generated
	 * @ordered
	 */
	protected boolean generateTests = GENERATE_TESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestsSuffix() <em>Tests Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestsSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTS_SUFFIX_EDEFAULT = ".tests";

	/**
	 * The cached value of the '{@link #getTestsSuffix() <em>Tests Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestsSuffix()
	 * @generated
	 * @ordered
	 */
	protected String testsSuffix = TESTS_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateFeature() <em>Generate Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateFeature()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_FEATURE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateFeature() <em>Generate Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateFeature()
	 * @generated
	 * @ordered
	 */
	protected boolean generateFeature = GENERATE_FEATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureSuffix() <em>Feature Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_SUFFIX_EDEFAULT = ".feature";

	/**
	 * The cached value of the '{@link #getFeatureSuffix() <em>Feature Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureSuffix()
	 * @generated
	 * @ordered
	 */
	protected String featureSuffix = FEATURE_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateUpdatesite() <em>Generate Updatesite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateUpdatesite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_UPDATESITE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateUpdatesite() <em>Generate Updatesite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateUpdatesite()
	 * @generated
	 * @ordered
	 */
	protected boolean generateUpdatesite = GENERATE_UPDATESITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateSiteSuffix() <em>Update Site Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateSiteSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_SITE_SUFFIX_EDEFAULT = ".p2updateSite";

	/**
	 * The cached value of the '{@link #getUpdateSiteSuffix() <em>Update Site Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateSiteSuffix()
	 * @generated
	 * @ordered
	 */
	protected String updateSiteSuffix = UPDATE_SITE_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateTarget() <em>Generate Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTarget()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_TARGET_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateTarget() <em>Generate Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTarget()
	 * @generated
	 * @ordered
	 */
	protected boolean generateTarget = GENERATE_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetSuffix() <em>Target Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_SUFFIX_EDEFAULT = ".releng.targetplatform";

	/**
	 * The cached value of the '{@link #getTargetSuffix() <em>Target Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSuffix()
	 * @generated
	 * @ordered
	 */
	protected String targetSuffix = TARGET_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMavenVersionSuffix() <em>Maven Version Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMavenVersionSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String MAVEN_VERSION_SUFFIX_EDEFAULT = "-SNAPSHOT";

	/**
	 * The cached value of the '{@link #getMavenVersionSuffix() <em>Maven Version Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMavenVersionSuffix()
	 * @generated
	 * @ordered
	 */
	protected String mavenVersionSuffix = MAVEN_VERSION_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsgiVersionQualifier() <em>Osgi Version Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsgiVersionQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String OSGI_VERSION_QUALIFIER_EDEFAULT = ".qualifier";

	/**
	 * The cached value of the '{@link #getOsgiVersionQualifier() <em>Osgi Version Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsgiVersionQualifier()
	 * @generated
	 * @ordered
	 */
	protected String osgiVersionQualifier = OSGI_VERSION_QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreId() <em>Core Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreId()
	 * @generated
	 * @ordered
	 */
	protected static final String CORE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUiId() <em>Ui Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiId()
	 * @generated
	 * @ordered
	 */
	protected static final String UI_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTestsId() <em>Tests Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestsId()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTS_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUpdateSiteId() <em>Update Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateSiteId()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_SITE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFeatureId() <em>Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureId()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMavenVersion() <em>Maven Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMavenVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String MAVEN_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOsgiVersion() <em>Osgi Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsgiVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OSGI_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCoreModuleName() <em>Core Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreModuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String CORE_MODULE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUiModuleName() <em>Ui Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiModuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String UI_MODULE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isIsLicenseEmpty() <em>Is License Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLicenseEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LICENSE_EMPTY_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdatesiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulespecificationPackage.Literals.UPDATESITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseId() {
		return baseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseId(String newBaseId) {
		String oldBaseId = baseId;
		baseId = newBaseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__BASE_ID, oldBaseId, baseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleName() {
		return moduleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleName(String newModuleName) {
		String oldModuleName = moduleName;
		moduleName = newModuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__MODULE_NAME, oldModuleName, moduleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryName(String newCategoryName) {
		String oldCategoryName = categoryName;
		categoryName = newCategoryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__CATEGORY_NAME, oldCategoryName, categoryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyRightAuthorName() {
		return copyRightAuthorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyRightAuthorName(String newCopyRightAuthorName) {
		String oldCopyRightAuthorName = copyRightAuthorName;
		copyRightAuthorName = newCopyRightAuthorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__COPY_RIGHT_AUTHOR_NAME, oldCopyRightAuthorName, copyRightAuthorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyRightUrl() {
		return copyRightUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyRightUrl(String newCopyRightUrl) {
		String oldCopyRightUrl = copyRightUrl;
		copyRightUrl = newCopyRightUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__COPY_RIGHT_URL, oldCopyRightUrl, copyRightUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyRightYear() {
		return copyRightYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyRightYear(String newCopyRightYear) {
		String oldCopyRightYear = copyRightYear;
		copyRightYear = newCopyRightYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__COPY_RIGHT_YEAR, oldCopyRightYear, copyRightYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderName(String newProviderName) {
		String oldProviderName = providerName;
		providerName = newProviderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__PROVIDER_NAME, oldProviderName, providerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTychoVersion() {
		return tychoVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTychoVersion(String newTychoVersion) {
		String oldTychoVersion = tychoVersion;
		tychoVersion = newTychoVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__TYCHO_VERSION, oldTychoVersion, tychoVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaVersion() {
		return javaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaVersion(String newJavaVersion) {
		String oldJavaVersion = javaVersion;
		javaVersion = newJavaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__JAVA_VERSION, oldJavaVersion, javaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoreSuffix() {
		return coreSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreSuffix(String newCoreSuffix) {
		String oldCoreSuffix = coreSuffix;
		coreSuffix = newCoreSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__CORE_SUFFIX, oldCoreSuffix, coreSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUiSuffix() {
		return uiSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUiSuffix(String newUiSuffix) {
		String oldUiSuffix = uiSuffix;
		uiSuffix = newUiSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__UI_SUFFIX, oldUiSuffix, uiSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateParent() {
		return generateParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateParent(boolean newGenerateParent) {
		boolean oldGenerateParent = generateParent;
		generateParent = newGenerateParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__GENERATE_PARENT, oldGenerateParent, generateParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTychoParentName() {
		return tychoParentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTychoParentName(String newTychoParentName) {
		String oldTychoParentName = tychoParentName;
		tychoParentName = newTychoParentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__TYCHO_PARENT_NAME, oldTychoParentName, tychoParentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateTests() {
		return generateTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateTests(boolean newGenerateTests) {
		boolean oldGenerateTests = generateTests;
		generateTests = newGenerateTests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__GENERATE_TESTS, oldGenerateTests, generateTests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestsSuffix() {
		return testsSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestsSuffix(String newTestsSuffix) {
		String oldTestsSuffix = testsSuffix;
		testsSuffix = newTestsSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__TESTS_SUFFIX, oldTestsSuffix, testsSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateFeature() {
		return generateFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateFeature(boolean newGenerateFeature) {
		boolean oldGenerateFeature = generateFeature;
		generateFeature = newGenerateFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__GENERATE_FEATURE, oldGenerateFeature, generateFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureSuffix() {
		return featureSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureSuffix(String newFeatureSuffix) {
		String oldFeatureSuffix = featureSuffix;
		featureSuffix = newFeatureSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__FEATURE_SUFFIX, oldFeatureSuffix, featureSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateUpdatesite() {
		return generateUpdatesite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateUpdatesite(boolean newGenerateUpdatesite) {
		boolean oldGenerateUpdatesite = generateUpdatesite;
		generateUpdatesite = newGenerateUpdatesite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__GENERATE_UPDATESITE, oldGenerateUpdatesite, generateUpdatesite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdateSiteSuffix() {
		return updateSiteSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateSiteSuffix(String newUpdateSiteSuffix) {
		String oldUpdateSiteSuffix = updateSiteSuffix;
		updateSiteSuffix = newUpdateSiteSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__UPDATE_SITE_SUFFIX, oldUpdateSiteSuffix, updateSiteSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateTarget() {
		return generateTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateTarget(boolean newGenerateTarget) {
		boolean oldGenerateTarget = generateTarget;
		generateTarget = newGenerateTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__GENERATE_TARGET, oldGenerateTarget, generateTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetSuffix() {
		return targetSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSuffix(String newTargetSuffix) {
		String oldTargetSuffix = targetSuffix;
		targetSuffix = newTargetSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__TARGET_SUFFIX, oldTargetSuffix, targetSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMavenVersionSuffix() {
		return mavenVersionSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMavenVersionSuffix(String newMavenVersionSuffix) {
		String oldMavenVersionSuffix = mavenVersionSuffix;
		mavenVersionSuffix = newMavenVersionSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__MAVEN_VERSION_SUFFIX, oldMavenVersionSuffix, mavenVersionSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsgiVersionQualifier() {
		return osgiVersionQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsgiVersionQualifier(String newOsgiVersionQualifier) {
		String oldOsgiVersionQualifier = osgiVersionQualifier;
		osgiVersionQualifier = newOsgiVersionQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__OSGI_VERSION_QUALIFIER, oldOsgiVersionQualifier, osgiVersionQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoreId() {
		String _baseId = this.getBaseId();
		String _coreSuffix = this.getCoreSuffix();
		return (_baseId + _coreSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUiId() {
		String _baseId = this.getBaseId();
		String _uiSuffix = this.getUiSuffix();
		return (_baseId + _uiSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestsId() {
		String _baseId = this.getBaseId();
		String _testsSuffix = this.getTestsSuffix();
		return (_baseId + _testsSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdateSiteId() {
		String _baseId = this.getBaseId();
		String _updateSiteSuffix = this.getUpdateSiteSuffix();
		return (_baseId + _updateSiteSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureId() {
		String _baseId = this.getBaseId();
		String _featureSuffix = this.getFeatureSuffix();
		return (_baseId + _featureSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetId() {
		String _baseId = this.getBaseId();
		String _targetSuffix = this.getTargetSuffix();
		return (_baseId + _targetSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMavenVersion() {
		String _version = this.getVersion();
		String _mavenVersionSuffix = this.getMavenVersionSuffix();
		return (_version + _mavenVersionSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsgiVersion() {
		String _version = this.getVersion();
		String _osgiVersionQualifier = this.getOsgiVersionQualifier();
		return (_version + _osgiVersionQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoreModuleName() {
		String _moduleName = this.getModuleName();
		return (_moduleName + " Core");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUiModuleName() {
		String _moduleName = this.getModuleName();
		return (_moduleName + " UI");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLicenseEmpty() {
		String _license = this.getLicense();
		return _license.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulespecificationPackage.UPDATESITE__BASE_ID:
				return getBaseId();
			case ModulespecificationPackage.UPDATESITE__MODULE_NAME:
				return getModuleName();
			case ModulespecificationPackage.UPDATESITE__CATEGORY_NAME:
				return getCategoryName();
			case ModulespecificationPackage.UPDATESITE__LICENSE:
				return getLicense();
			case ModulespecificationPackage.UPDATESITE__VERSION:
				return getVersion();
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_AUTHOR_NAME:
				return getCopyRightAuthorName();
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_URL:
				return getCopyRightUrl();
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_YEAR:
				return getCopyRightYear();
			case ModulespecificationPackage.UPDATESITE__PROVIDER_NAME:
				return getProviderName();
			case ModulespecificationPackage.UPDATESITE__TYCHO_VERSION:
				return getTychoVersion();
			case ModulespecificationPackage.UPDATESITE__JAVA_VERSION:
				return getJavaVersion();
			case ModulespecificationPackage.UPDATESITE__CORE_SUFFIX:
				return getCoreSuffix();
			case ModulespecificationPackage.UPDATESITE__UI_SUFFIX:
				return getUiSuffix();
			case ModulespecificationPackage.UPDATESITE__GENERATE_PARENT:
				return isGenerateParent();
			case ModulespecificationPackage.UPDATESITE__TYCHO_PARENT_NAME:
				return getTychoParentName();
			case ModulespecificationPackage.UPDATESITE__GENERATE_TESTS:
				return isGenerateTests();
			case ModulespecificationPackage.UPDATESITE__TESTS_SUFFIX:
				return getTestsSuffix();
			case ModulespecificationPackage.UPDATESITE__GENERATE_FEATURE:
				return isGenerateFeature();
			case ModulespecificationPackage.UPDATESITE__FEATURE_SUFFIX:
				return getFeatureSuffix();
			case ModulespecificationPackage.UPDATESITE__GENERATE_UPDATESITE:
				return isGenerateUpdatesite();
			case ModulespecificationPackage.UPDATESITE__UPDATE_SITE_SUFFIX:
				return getUpdateSiteSuffix();
			case ModulespecificationPackage.UPDATESITE__GENERATE_TARGET:
				return isGenerateTarget();
			case ModulespecificationPackage.UPDATESITE__TARGET_SUFFIX:
				return getTargetSuffix();
			case ModulespecificationPackage.UPDATESITE__MAVEN_VERSION_SUFFIX:
				return getMavenVersionSuffix();
			case ModulespecificationPackage.UPDATESITE__OSGI_VERSION_QUALIFIER:
				return getOsgiVersionQualifier();
			case ModulespecificationPackage.UPDATESITE__CORE_ID:
				return getCoreId();
			case ModulespecificationPackage.UPDATESITE__UI_ID:
				return getUiId();
			case ModulespecificationPackage.UPDATESITE__TESTS_ID:
				return getTestsId();
			case ModulespecificationPackage.UPDATESITE__UPDATE_SITE_ID:
				return getUpdateSiteId();
			case ModulespecificationPackage.UPDATESITE__FEATURE_ID:
				return getFeatureId();
			case ModulespecificationPackage.UPDATESITE__TARGET_ID:
				return getTargetId();
			case ModulespecificationPackage.UPDATESITE__MAVEN_VERSION:
				return getMavenVersion();
			case ModulespecificationPackage.UPDATESITE__OSGI_VERSION:
				return getOsgiVersion();
			case ModulespecificationPackage.UPDATESITE__CORE_MODULE_NAME:
				return getCoreModuleName();
			case ModulespecificationPackage.UPDATESITE__UI_MODULE_NAME:
				return getUiModuleName();
			case ModulespecificationPackage.UPDATESITE__IS_LICENSE_EMPTY:
				return isIsLicenseEmpty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulespecificationPackage.UPDATESITE__BASE_ID:
				setBaseId((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__MODULE_NAME:
				setModuleName((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__CATEGORY_NAME:
				setCategoryName((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__LICENSE:
				setLicense((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__VERSION:
				setVersion((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_AUTHOR_NAME:
				setCopyRightAuthorName((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_URL:
				setCopyRightUrl((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_YEAR:
				setCopyRightYear((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__PROVIDER_NAME:
				setProviderName((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__TYCHO_VERSION:
				setTychoVersion((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__JAVA_VERSION:
				setJavaVersion((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__CORE_SUFFIX:
				setCoreSuffix((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__UI_SUFFIX:
				setUiSuffix((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__GENERATE_PARENT:
				setGenerateParent((Boolean)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__TYCHO_PARENT_NAME:
				setTychoParentName((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__GENERATE_TESTS:
				setGenerateTests((Boolean)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__TESTS_SUFFIX:
				setTestsSuffix((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__GENERATE_FEATURE:
				setGenerateFeature((Boolean)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__FEATURE_SUFFIX:
				setFeatureSuffix((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__GENERATE_UPDATESITE:
				setGenerateUpdatesite((Boolean)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__UPDATE_SITE_SUFFIX:
				setUpdateSiteSuffix((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__GENERATE_TARGET:
				setGenerateTarget((Boolean)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__TARGET_SUFFIX:
				setTargetSuffix((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__MAVEN_VERSION_SUFFIX:
				setMavenVersionSuffix((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__OSGI_VERSION_QUALIFIER:
				setOsgiVersionQualifier((String)newValue);
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
			case ModulespecificationPackage.UPDATESITE__BASE_ID:
				setBaseId(BASE_ID_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__MODULE_NAME:
				setModuleName(MODULE_NAME_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__CATEGORY_NAME:
				setCategoryName(CATEGORY_NAME_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_AUTHOR_NAME:
				setCopyRightAuthorName(COPY_RIGHT_AUTHOR_NAME_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_URL:
				setCopyRightUrl(COPY_RIGHT_URL_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_YEAR:
				setCopyRightYear(COPY_RIGHT_YEAR_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__PROVIDER_NAME:
				setProviderName(PROVIDER_NAME_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__TYCHO_VERSION:
				setTychoVersion(TYCHO_VERSION_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__JAVA_VERSION:
				setJavaVersion(JAVA_VERSION_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__CORE_SUFFIX:
				setCoreSuffix(CORE_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__UI_SUFFIX:
				setUiSuffix(UI_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__GENERATE_PARENT:
				setGenerateParent(GENERATE_PARENT_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__TYCHO_PARENT_NAME:
				setTychoParentName(TYCHO_PARENT_NAME_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__GENERATE_TESTS:
				setGenerateTests(GENERATE_TESTS_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__TESTS_SUFFIX:
				setTestsSuffix(TESTS_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__GENERATE_FEATURE:
				setGenerateFeature(GENERATE_FEATURE_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__FEATURE_SUFFIX:
				setFeatureSuffix(FEATURE_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__GENERATE_UPDATESITE:
				setGenerateUpdatesite(GENERATE_UPDATESITE_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__UPDATE_SITE_SUFFIX:
				setUpdateSiteSuffix(UPDATE_SITE_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__GENERATE_TARGET:
				setGenerateTarget(GENERATE_TARGET_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__TARGET_SUFFIX:
				setTargetSuffix(TARGET_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__MAVEN_VERSION_SUFFIX:
				setMavenVersionSuffix(MAVEN_VERSION_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__OSGI_VERSION_QUALIFIER:
				setOsgiVersionQualifier(OSGI_VERSION_QUALIFIER_EDEFAULT);
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
			case ModulespecificationPackage.UPDATESITE__BASE_ID:
				return BASE_ID_EDEFAULT == null ? baseId != null : !BASE_ID_EDEFAULT.equals(baseId);
			case ModulespecificationPackage.UPDATESITE__MODULE_NAME:
				return MODULE_NAME_EDEFAULT == null ? moduleName != null : !MODULE_NAME_EDEFAULT.equals(moduleName);
			case ModulespecificationPackage.UPDATESITE__CATEGORY_NAME:
				return CATEGORY_NAME_EDEFAULT == null ? categoryName != null : !CATEGORY_NAME_EDEFAULT.equals(categoryName);
			case ModulespecificationPackage.UPDATESITE__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case ModulespecificationPackage.UPDATESITE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_AUTHOR_NAME:
				return COPY_RIGHT_AUTHOR_NAME_EDEFAULT == null ? copyRightAuthorName != null : !COPY_RIGHT_AUTHOR_NAME_EDEFAULT.equals(copyRightAuthorName);
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_URL:
				return COPY_RIGHT_URL_EDEFAULT == null ? copyRightUrl != null : !COPY_RIGHT_URL_EDEFAULT.equals(copyRightUrl);
			case ModulespecificationPackage.UPDATESITE__COPY_RIGHT_YEAR:
				return COPY_RIGHT_YEAR_EDEFAULT == null ? copyRightYear != null : !COPY_RIGHT_YEAR_EDEFAULT.equals(copyRightYear);
			case ModulespecificationPackage.UPDATESITE__PROVIDER_NAME:
				return PROVIDER_NAME_EDEFAULT == null ? providerName != null : !PROVIDER_NAME_EDEFAULT.equals(providerName);
			case ModulespecificationPackage.UPDATESITE__TYCHO_VERSION:
				return TYCHO_VERSION_EDEFAULT == null ? tychoVersion != null : !TYCHO_VERSION_EDEFAULT.equals(tychoVersion);
			case ModulespecificationPackage.UPDATESITE__JAVA_VERSION:
				return JAVA_VERSION_EDEFAULT == null ? javaVersion != null : !JAVA_VERSION_EDEFAULT.equals(javaVersion);
			case ModulespecificationPackage.UPDATESITE__CORE_SUFFIX:
				return CORE_SUFFIX_EDEFAULT == null ? coreSuffix != null : !CORE_SUFFIX_EDEFAULT.equals(coreSuffix);
			case ModulespecificationPackage.UPDATESITE__UI_SUFFIX:
				return UI_SUFFIX_EDEFAULT == null ? uiSuffix != null : !UI_SUFFIX_EDEFAULT.equals(uiSuffix);
			case ModulespecificationPackage.UPDATESITE__GENERATE_PARENT:
				return generateParent != GENERATE_PARENT_EDEFAULT;
			case ModulespecificationPackage.UPDATESITE__TYCHO_PARENT_NAME:
				return TYCHO_PARENT_NAME_EDEFAULT == null ? tychoParentName != null : !TYCHO_PARENT_NAME_EDEFAULT.equals(tychoParentName);
			case ModulespecificationPackage.UPDATESITE__GENERATE_TESTS:
				return generateTests != GENERATE_TESTS_EDEFAULT;
			case ModulespecificationPackage.UPDATESITE__TESTS_SUFFIX:
				return TESTS_SUFFIX_EDEFAULT == null ? testsSuffix != null : !TESTS_SUFFIX_EDEFAULT.equals(testsSuffix);
			case ModulespecificationPackage.UPDATESITE__GENERATE_FEATURE:
				return generateFeature != GENERATE_FEATURE_EDEFAULT;
			case ModulespecificationPackage.UPDATESITE__FEATURE_SUFFIX:
				return FEATURE_SUFFIX_EDEFAULT == null ? featureSuffix != null : !FEATURE_SUFFIX_EDEFAULT.equals(featureSuffix);
			case ModulespecificationPackage.UPDATESITE__GENERATE_UPDATESITE:
				return generateUpdatesite != GENERATE_UPDATESITE_EDEFAULT;
			case ModulespecificationPackage.UPDATESITE__UPDATE_SITE_SUFFIX:
				return UPDATE_SITE_SUFFIX_EDEFAULT == null ? updateSiteSuffix != null : !UPDATE_SITE_SUFFIX_EDEFAULT.equals(updateSiteSuffix);
			case ModulespecificationPackage.UPDATESITE__GENERATE_TARGET:
				return generateTarget != GENERATE_TARGET_EDEFAULT;
			case ModulespecificationPackage.UPDATESITE__TARGET_SUFFIX:
				return TARGET_SUFFIX_EDEFAULT == null ? targetSuffix != null : !TARGET_SUFFIX_EDEFAULT.equals(targetSuffix);
			case ModulespecificationPackage.UPDATESITE__MAVEN_VERSION_SUFFIX:
				return MAVEN_VERSION_SUFFIX_EDEFAULT == null ? mavenVersionSuffix != null : !MAVEN_VERSION_SUFFIX_EDEFAULT.equals(mavenVersionSuffix);
			case ModulespecificationPackage.UPDATESITE__OSGI_VERSION_QUALIFIER:
				return OSGI_VERSION_QUALIFIER_EDEFAULT == null ? osgiVersionQualifier != null : !OSGI_VERSION_QUALIFIER_EDEFAULT.equals(osgiVersionQualifier);
			case ModulespecificationPackage.UPDATESITE__CORE_ID:
				return CORE_ID_EDEFAULT == null ? getCoreId() != null : !CORE_ID_EDEFAULT.equals(getCoreId());
			case ModulespecificationPackage.UPDATESITE__UI_ID:
				return UI_ID_EDEFAULT == null ? getUiId() != null : !UI_ID_EDEFAULT.equals(getUiId());
			case ModulespecificationPackage.UPDATESITE__TESTS_ID:
				return TESTS_ID_EDEFAULT == null ? getTestsId() != null : !TESTS_ID_EDEFAULT.equals(getTestsId());
			case ModulespecificationPackage.UPDATESITE__UPDATE_SITE_ID:
				return UPDATE_SITE_ID_EDEFAULT == null ? getUpdateSiteId() != null : !UPDATE_SITE_ID_EDEFAULT.equals(getUpdateSiteId());
			case ModulespecificationPackage.UPDATESITE__FEATURE_ID:
				return FEATURE_ID_EDEFAULT == null ? getFeatureId() != null : !FEATURE_ID_EDEFAULT.equals(getFeatureId());
			case ModulespecificationPackage.UPDATESITE__TARGET_ID:
				return TARGET_ID_EDEFAULT == null ? getTargetId() != null : !TARGET_ID_EDEFAULT.equals(getTargetId());
			case ModulespecificationPackage.UPDATESITE__MAVEN_VERSION:
				return MAVEN_VERSION_EDEFAULT == null ? getMavenVersion() != null : !MAVEN_VERSION_EDEFAULT.equals(getMavenVersion());
			case ModulespecificationPackage.UPDATESITE__OSGI_VERSION:
				return OSGI_VERSION_EDEFAULT == null ? getOsgiVersion() != null : !OSGI_VERSION_EDEFAULT.equals(getOsgiVersion());
			case ModulespecificationPackage.UPDATESITE__CORE_MODULE_NAME:
				return CORE_MODULE_NAME_EDEFAULT == null ? getCoreModuleName() != null : !CORE_MODULE_NAME_EDEFAULT.equals(getCoreModuleName());
			case ModulespecificationPackage.UPDATESITE__UI_MODULE_NAME:
				return UI_MODULE_NAME_EDEFAULT == null ? getUiModuleName() != null : !UI_MODULE_NAME_EDEFAULT.equals(getUiModuleName());
			case ModulespecificationPackage.UPDATESITE__IS_LICENSE_EMPTY:
				return isIsLicenseEmpty() != IS_LICENSE_EMPTY_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (baseId: ");
		result.append(baseId);
		result.append(", moduleName: ");
		result.append(moduleName);
		result.append(", categoryName: ");
		result.append(categoryName);
		result.append(", license: ");
		result.append(license);
		result.append(", version: ");
		result.append(version);
		result.append(", copyRightAuthorName: ");
		result.append(copyRightAuthorName);
		result.append(", copyRightUrl: ");
		result.append(copyRightUrl);
		result.append(", copyRightYear: ");
		result.append(copyRightYear);
		result.append(", providerName: ");
		result.append(providerName);
		result.append(", tychoVersion: ");
		result.append(tychoVersion);
		result.append(", javaVersion: ");
		result.append(javaVersion);
		result.append(", coreSuffix: ");
		result.append(coreSuffix);
		result.append(", uiSuffix: ");
		result.append(uiSuffix);
		result.append(", generateParent: ");
		result.append(generateParent);
		result.append(", tychoParentName: ");
		result.append(tychoParentName);
		result.append(", generateTests: ");
		result.append(generateTests);
		result.append(", testsSuffix: ");
		result.append(testsSuffix);
		result.append(", generateFeature: ");
		result.append(generateFeature);
		result.append(", featureSuffix: ");
		result.append(featureSuffix);
		result.append(", generateUpdatesite: ");
		result.append(generateUpdatesite);
		result.append(", updateSiteSuffix: ");
		result.append(updateSiteSuffix);
		result.append(", generateTarget: ");
		result.append(generateTarget);
		result.append(", targetSuffix: ");
		result.append(targetSuffix);
		result.append(", mavenVersionSuffix: ");
		result.append(mavenVersionSuffix);
		result.append(", osgiVersionQualifier: ");
		result.append(osgiVersionQualifier);
		result.append(')');
		return result.toString();
	}

} //UpdatesiteImpl
