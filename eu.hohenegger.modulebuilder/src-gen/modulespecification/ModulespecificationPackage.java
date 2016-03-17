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
	 * The feature id for the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__BASE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__PARENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__MODULE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__CATEGORY_NAME = 3;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__LICENSE = 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__VERSION = 5;

	/**
	 * The feature id for the '<em><b>Copy Right Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__COPY_RIGHT_AUTHOR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Copy Right Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__COPY_RIGHT_URL = 7;

	/**
	 * The feature id for the '<em><b>Copy Right Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__COPY_RIGHT_YEAR = 8;

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
	 * The feature id for the '<em><b>Ui Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__UI_SUFFIX = 11;

	/**
	 * The feature id for the '<em><b>Tests Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__TESTS_SUFFIX = 12;

	/**
	 * The feature id for the '<em><b>Feature Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__FEATURE_SUFFIX = 13;

	/**
	 * The feature id for the '<em><b>Update Site Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__UPDATE_SITE_SUFFIX = 14;

	/**
	 * The feature id for the '<em><b>Target Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__TARGET_SUFFIX = 15;

	/**
	 * The feature id for the '<em><b>Maven Version Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__MAVEN_VERSION_SUFFIX = 16;

	/**
	 * The feature id for the '<em><b>Osgi Version Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__OSGI_VERSION_QUALIFIER = 17;

	/**
	 * The feature id for the '<em><b>Core Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__CORE_NAME = 18;

	/**
	 * The feature id for the '<em><b>Ui Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__UI_NAME = 19;

	/**
	 * The feature id for the '<em><b>Tests Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__TESTS_NAME = 20;

	/**
	 * The feature id for the '<em><b>Update Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__UPDATE_SITE_NAME = 21;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__FEATURE_NAME = 22;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__TARGET_NAME = 23;

	/**
	 * The feature id for the '<em><b>Maven Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__MAVEN_VERSION = 24;

	/**
	 * The feature id for the '<em><b>Osgi Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__OSGI_VERSION = 25;

	/**
	 * The number of structural features of the '<em>Updatesite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE_FEATURE_COUNT = 26;

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
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getBaseName <em>Base Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Name</em>'.
	 * @see modulespecification.Updatesite#getBaseName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_BaseName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see modulespecification.Updatesite#getParentName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_ParentName();

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
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getCoreName <em>Core Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Name</em>'.
	 * @see modulespecification.Updatesite#getCoreName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_CoreName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getUiName <em>Ui Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Name</em>'.
	 * @see modulespecification.Updatesite#getUiName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_UiName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getTestsName <em>Tests Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tests Name</em>'.
	 * @see modulespecification.Updatesite#getTestsName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_TestsName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getUpdateSiteName <em>Update Site Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Site Name</em>'.
	 * @see modulespecification.Updatesite#getUpdateSiteName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_UpdateSiteName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see modulespecification.Updatesite#getFeatureName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link modulespecification.Updatesite#getTargetName <em>Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Name</em>'.
	 * @see modulespecification.Updatesite#getTargetName()
	 * @see #getUpdatesite()
	 * @generated
	 */
	EAttribute getUpdatesite_TargetName();

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
		 * The meta object literal for the '<em><b>Base Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__BASE_NAME = eINSTANCE.getUpdatesite_BaseName();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__PARENT_NAME = eINSTANCE.getUpdatesite_ParentName();

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
		 * The meta object literal for the '<em><b>Ui Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__UI_SUFFIX = eINSTANCE.getUpdatesite_UiSuffix();

		/**
		 * The meta object literal for the '<em><b>Tests Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__TESTS_SUFFIX = eINSTANCE.getUpdatesite_TestsSuffix();

		/**
		 * The meta object literal for the '<em><b>Feature Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__FEATURE_SUFFIX = eINSTANCE.getUpdatesite_FeatureSuffix();

		/**
		 * The meta object literal for the '<em><b>Update Site Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__UPDATE_SITE_SUFFIX = eINSTANCE.getUpdatesite_UpdateSiteSuffix();

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
		 * The meta object literal for the '<em><b>Core Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__CORE_NAME = eINSTANCE.getUpdatesite_CoreName();

		/**
		 * The meta object literal for the '<em><b>Ui Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__UI_NAME = eINSTANCE.getUpdatesite_UiName();

		/**
		 * The meta object literal for the '<em><b>Tests Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__TESTS_NAME = eINSTANCE.getUpdatesite_TestsName();

		/**
		 * The meta object literal for the '<em><b>Update Site Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__UPDATE_SITE_NAME = eINSTANCE.getUpdatesite_UpdateSiteName();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__FEATURE_NAME = eINSTANCE.getUpdatesite_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Target Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATESITE__TARGET_NAME = eINSTANCE.getUpdatesite_TargetName();

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

	}

} //ModulespecificationPackage
