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
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getLicense <em>License</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getCopyRightAuthorName <em>Copy Right Author Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getCopyRightUrl <em>Copy Right Url</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getCopyRightYear <em>Copy Right Year</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getTychoVersion <em>Tycho Version</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getJavaVersion <em>Java Version</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getUiSuffix <em>Ui Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getTestsSuffix <em>Tests Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getFeatureSuffix <em>Feature Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getUpdateSiteSuffix <em>Update Site Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getTargetSuffix <em>Target Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getMavenVersionSuffix <em>Maven Version Suffix</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getOsgiVersionQualifier <em>Osgi Version Qualifier</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getCoreName <em>Core Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getUiName <em>Ui Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getTestsName <em>Tests Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getUpdateSiteName <em>Update Site Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getTargetName <em>Target Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getMavenVersion <em>Maven Version</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getOsgiVersion <em>Osgi Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdatesiteImpl extends MinimalEObjectImpl.Container implements Updatesite {
	/**
	 * The default value of the '{@link #getBaseName() <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getBaseName() <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseName()
	 * @generated
	 * @ordered
	 */
	protected String baseName = BASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentName() <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_NAME_EDEFAULT = "parent";

	/**
	 * The cached value of the '{@link #getParentName() <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentName()
	 * @generated
	 * @ordered
	 */
	protected String parentName = PARENT_NAME_EDEFAULT;

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
	protected static final String COPY_RIGHT_URL_EDEFAULT = "";

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
	 * The default value of the '{@link #getCoreName() <em>Core Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreName()
	 * @generated
	 * @ordered
	 */
	protected static final String CORE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUiName() <em>Ui Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiName()
	 * @generated
	 * @ordered
	 */
	protected static final String UI_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTestsName() <em>Tests Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestsName()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTS_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUpdateSiteName() <em>Update Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateSiteName()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_SITE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetName() <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAME_EDEFAULT = null;

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
	public String getBaseName() {
		return baseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseName(String newBaseName) {
		String oldBaseName = baseName;
		baseName = newBaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__BASE_NAME, oldBaseName, baseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentName() {
		return parentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentName(String newParentName) {
		String oldParentName = parentName;
		parentName = newParentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulespecificationPackage.UPDATESITE__PARENT_NAME, oldParentName, parentName));
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
	public String getCoreName() {
		return this.getBaseName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUiName() {
		String _baseName = this.getBaseName();
		String _uiSuffix = this.getUiSuffix();
		return (_baseName + _uiSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestsName() {
		String _baseName = this.getBaseName();
		String _testsSuffix = this.getTestsSuffix();
		return (_baseName + _testsSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdateSiteName() {
		String _baseName = this.getBaseName();
		String _updateSiteSuffix = this.getUpdateSiteSuffix();
		return (_baseName + _updateSiteSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		String _baseName = this.getBaseName();
		String _featureSuffix = this.getFeatureSuffix();
		return (_baseName + _featureSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetName() {
		String _baseName = this.getBaseName();
		String _targetSuffix = this.getTargetSuffix();
		return (_baseName + _targetSuffix);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulespecificationPackage.UPDATESITE__BASE_NAME:
				return getBaseName();
			case ModulespecificationPackage.UPDATESITE__PARENT_NAME:
				return getParentName();
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
			case ModulespecificationPackage.UPDATESITE__TYCHO_VERSION:
				return getTychoVersion();
			case ModulespecificationPackage.UPDATESITE__JAVA_VERSION:
				return getJavaVersion();
			case ModulespecificationPackage.UPDATESITE__UI_SUFFIX:
				return getUiSuffix();
			case ModulespecificationPackage.UPDATESITE__TESTS_SUFFIX:
				return getTestsSuffix();
			case ModulespecificationPackage.UPDATESITE__FEATURE_SUFFIX:
				return getFeatureSuffix();
			case ModulespecificationPackage.UPDATESITE__UPDATE_SITE_SUFFIX:
				return getUpdateSiteSuffix();
			case ModulespecificationPackage.UPDATESITE__TARGET_SUFFIX:
				return getTargetSuffix();
			case ModulespecificationPackage.UPDATESITE__MAVEN_VERSION_SUFFIX:
				return getMavenVersionSuffix();
			case ModulespecificationPackage.UPDATESITE__OSGI_VERSION_QUALIFIER:
				return getOsgiVersionQualifier();
			case ModulespecificationPackage.UPDATESITE__CORE_NAME:
				return getCoreName();
			case ModulespecificationPackage.UPDATESITE__UI_NAME:
				return getUiName();
			case ModulespecificationPackage.UPDATESITE__TESTS_NAME:
				return getTestsName();
			case ModulespecificationPackage.UPDATESITE__UPDATE_SITE_NAME:
				return getUpdateSiteName();
			case ModulespecificationPackage.UPDATESITE__FEATURE_NAME:
				return getFeatureName();
			case ModulespecificationPackage.UPDATESITE__TARGET_NAME:
				return getTargetName();
			case ModulespecificationPackage.UPDATESITE__MAVEN_VERSION:
				return getMavenVersion();
			case ModulespecificationPackage.UPDATESITE__OSGI_VERSION:
				return getOsgiVersion();
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
			case ModulespecificationPackage.UPDATESITE__BASE_NAME:
				setBaseName((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__PARENT_NAME:
				setParentName((String)newValue);
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
			case ModulespecificationPackage.UPDATESITE__TYCHO_VERSION:
				setTychoVersion((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__JAVA_VERSION:
				setJavaVersion((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__UI_SUFFIX:
				setUiSuffix((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__TESTS_SUFFIX:
				setTestsSuffix((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__FEATURE_SUFFIX:
				setFeatureSuffix((String)newValue);
				return;
			case ModulespecificationPackage.UPDATESITE__UPDATE_SITE_SUFFIX:
				setUpdateSiteSuffix((String)newValue);
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
			case ModulespecificationPackage.UPDATESITE__BASE_NAME:
				setBaseName(BASE_NAME_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
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
			case ModulespecificationPackage.UPDATESITE__TYCHO_VERSION:
				setTychoVersion(TYCHO_VERSION_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__JAVA_VERSION:
				setJavaVersion(JAVA_VERSION_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__UI_SUFFIX:
				setUiSuffix(UI_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__TESTS_SUFFIX:
				setTestsSuffix(TESTS_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__FEATURE_SUFFIX:
				setFeatureSuffix(FEATURE_SUFFIX_EDEFAULT);
				return;
			case ModulespecificationPackage.UPDATESITE__UPDATE_SITE_SUFFIX:
				setUpdateSiteSuffix(UPDATE_SITE_SUFFIX_EDEFAULT);
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
			case ModulespecificationPackage.UPDATESITE__BASE_NAME:
				return BASE_NAME_EDEFAULT == null ? baseName != null : !BASE_NAME_EDEFAULT.equals(baseName);
			case ModulespecificationPackage.UPDATESITE__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
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
			case ModulespecificationPackage.UPDATESITE__TYCHO_VERSION:
				return TYCHO_VERSION_EDEFAULT == null ? tychoVersion != null : !TYCHO_VERSION_EDEFAULT.equals(tychoVersion);
			case ModulespecificationPackage.UPDATESITE__JAVA_VERSION:
				return JAVA_VERSION_EDEFAULT == null ? javaVersion != null : !JAVA_VERSION_EDEFAULT.equals(javaVersion);
			case ModulespecificationPackage.UPDATESITE__UI_SUFFIX:
				return UI_SUFFIX_EDEFAULT == null ? uiSuffix != null : !UI_SUFFIX_EDEFAULT.equals(uiSuffix);
			case ModulespecificationPackage.UPDATESITE__TESTS_SUFFIX:
				return TESTS_SUFFIX_EDEFAULT == null ? testsSuffix != null : !TESTS_SUFFIX_EDEFAULT.equals(testsSuffix);
			case ModulespecificationPackage.UPDATESITE__FEATURE_SUFFIX:
				return FEATURE_SUFFIX_EDEFAULT == null ? featureSuffix != null : !FEATURE_SUFFIX_EDEFAULT.equals(featureSuffix);
			case ModulespecificationPackage.UPDATESITE__UPDATE_SITE_SUFFIX:
				return UPDATE_SITE_SUFFIX_EDEFAULT == null ? updateSiteSuffix != null : !UPDATE_SITE_SUFFIX_EDEFAULT.equals(updateSiteSuffix);
			case ModulespecificationPackage.UPDATESITE__TARGET_SUFFIX:
				return TARGET_SUFFIX_EDEFAULT == null ? targetSuffix != null : !TARGET_SUFFIX_EDEFAULT.equals(targetSuffix);
			case ModulespecificationPackage.UPDATESITE__MAVEN_VERSION_SUFFIX:
				return MAVEN_VERSION_SUFFIX_EDEFAULT == null ? mavenVersionSuffix != null : !MAVEN_VERSION_SUFFIX_EDEFAULT.equals(mavenVersionSuffix);
			case ModulespecificationPackage.UPDATESITE__OSGI_VERSION_QUALIFIER:
				return OSGI_VERSION_QUALIFIER_EDEFAULT == null ? osgiVersionQualifier != null : !OSGI_VERSION_QUALIFIER_EDEFAULT.equals(osgiVersionQualifier);
			case ModulespecificationPackage.UPDATESITE__CORE_NAME:
				return CORE_NAME_EDEFAULT == null ? getCoreName() != null : !CORE_NAME_EDEFAULT.equals(getCoreName());
			case ModulespecificationPackage.UPDATESITE__UI_NAME:
				return UI_NAME_EDEFAULT == null ? getUiName() != null : !UI_NAME_EDEFAULT.equals(getUiName());
			case ModulespecificationPackage.UPDATESITE__TESTS_NAME:
				return TESTS_NAME_EDEFAULT == null ? getTestsName() != null : !TESTS_NAME_EDEFAULT.equals(getTestsName());
			case ModulespecificationPackage.UPDATESITE__UPDATE_SITE_NAME:
				return UPDATE_SITE_NAME_EDEFAULT == null ? getUpdateSiteName() != null : !UPDATE_SITE_NAME_EDEFAULT.equals(getUpdateSiteName());
			case ModulespecificationPackage.UPDATESITE__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? getFeatureName() != null : !FEATURE_NAME_EDEFAULT.equals(getFeatureName());
			case ModulespecificationPackage.UPDATESITE__TARGET_NAME:
				return TARGET_NAME_EDEFAULT == null ? getTargetName() != null : !TARGET_NAME_EDEFAULT.equals(getTargetName());
			case ModulespecificationPackage.UPDATESITE__MAVEN_VERSION:
				return MAVEN_VERSION_EDEFAULT == null ? getMavenVersion() != null : !MAVEN_VERSION_EDEFAULT.equals(getMavenVersion());
			case ModulespecificationPackage.UPDATESITE__OSGI_VERSION:
				return OSGI_VERSION_EDEFAULT == null ? getOsgiVersion() != null : !OSGI_VERSION_EDEFAULT.equals(getOsgiVersion());
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
		result.append(" (baseName: ");
		result.append(baseName);
		result.append(", parentName: ");
		result.append(parentName);
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
		result.append(", tychoVersion: ");
		result.append(tychoVersion);
		result.append(", javaVersion: ");
		result.append(javaVersion);
		result.append(", uiSuffix: ");
		result.append(uiSuffix);
		result.append(", testsSuffix: ");
		result.append(testsSuffix);
		result.append(", featureSuffix: ");
		result.append(featureSuffix);
		result.append(", updateSiteSuffix: ");
		result.append(updateSiteSuffix);
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
