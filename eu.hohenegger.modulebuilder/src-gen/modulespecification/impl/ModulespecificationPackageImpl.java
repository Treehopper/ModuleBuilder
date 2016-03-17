/**
 */
package modulespecification.impl;

import modulespecification.Module;
import modulespecification.ModulespecificationFactory;
import modulespecification.ModulespecificationPackage;
import modulespecification.Updatesite;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModulespecificationPackageImpl extends EPackageImpl implements ModulespecificationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updatesiteEClass = null;

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
	 * @see modulespecification.ModulespecificationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModulespecificationPackageImpl() {
		super(eNS_URI, ModulespecificationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModulespecificationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModulespecificationPackage init() {
		if (isInited) return (ModulespecificationPackage)EPackage.Registry.INSTANCE.getEPackage(ModulespecificationPackage.eNS_URI);

		// Obtain or create and register package
		ModulespecificationPackageImpl theModulespecificationPackage = (ModulespecificationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModulespecificationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModulespecificationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModulespecificationPackage.createPackageContents();

		// Initialize created meta-data
		theModulespecificationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModulespecificationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModulespecificationPackage.eNS_URI, theModulespecificationPackage);
		return theModulespecificationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Updatesites() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdatesite() {
		return updatesiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_BaseId() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_ModuleName() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_CategoryName() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_License() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_Version() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_CopyRightAuthorName() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_CopyRightUrl() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_CopyRightYear() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_ProviderName() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_TychoParentName() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_TychoVersion() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_JavaVersion() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_CoreSuffix() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_UiSuffix() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_TestsSuffix() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_FeatureSuffix() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_UpdateSiteSuffix() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_TargetSuffix() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_MavenVersionSuffix() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_OsgiVersionQualifier() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_CoreId() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_UiId() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_TestsId() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_UpdateSiteId() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_FeatureId() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_TargetId() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_MavenVersion() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_OsgiVersion() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_CoreModuleName() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_UiModuleName() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulespecificationFactory getModulespecificationFactory() {
		return (ModulespecificationFactory)getEFactoryInstance();
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
		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__UPDATESITES);

		updatesiteEClass = createEClass(UPDATESITE);
		createEAttribute(updatesiteEClass, UPDATESITE__BASE_ID);
		createEAttribute(updatesiteEClass, UPDATESITE__MODULE_NAME);
		createEAttribute(updatesiteEClass, UPDATESITE__CATEGORY_NAME);
		createEAttribute(updatesiteEClass, UPDATESITE__LICENSE);
		createEAttribute(updatesiteEClass, UPDATESITE__VERSION);
		createEAttribute(updatesiteEClass, UPDATESITE__COPY_RIGHT_AUTHOR_NAME);
		createEAttribute(updatesiteEClass, UPDATESITE__COPY_RIGHT_URL);
		createEAttribute(updatesiteEClass, UPDATESITE__COPY_RIGHT_YEAR);
		createEAttribute(updatesiteEClass, UPDATESITE__PROVIDER_NAME);
		createEAttribute(updatesiteEClass, UPDATESITE__TYCHO_PARENT_NAME);
		createEAttribute(updatesiteEClass, UPDATESITE__TYCHO_VERSION);
		createEAttribute(updatesiteEClass, UPDATESITE__JAVA_VERSION);
		createEAttribute(updatesiteEClass, UPDATESITE__CORE_SUFFIX);
		createEAttribute(updatesiteEClass, UPDATESITE__UI_SUFFIX);
		createEAttribute(updatesiteEClass, UPDATESITE__TESTS_SUFFIX);
		createEAttribute(updatesiteEClass, UPDATESITE__FEATURE_SUFFIX);
		createEAttribute(updatesiteEClass, UPDATESITE__UPDATE_SITE_SUFFIX);
		createEAttribute(updatesiteEClass, UPDATESITE__TARGET_SUFFIX);
		createEAttribute(updatesiteEClass, UPDATESITE__MAVEN_VERSION_SUFFIX);
		createEAttribute(updatesiteEClass, UPDATESITE__OSGI_VERSION_QUALIFIER);
		createEAttribute(updatesiteEClass, UPDATESITE__CORE_ID);
		createEAttribute(updatesiteEClass, UPDATESITE__UI_ID);
		createEAttribute(updatesiteEClass, UPDATESITE__TESTS_ID);
		createEAttribute(updatesiteEClass, UPDATESITE__UPDATE_SITE_ID);
		createEAttribute(updatesiteEClass, UPDATESITE__FEATURE_ID);
		createEAttribute(updatesiteEClass, UPDATESITE__TARGET_ID);
		createEAttribute(updatesiteEClass, UPDATESITE__MAVEN_VERSION);
		createEAttribute(updatesiteEClass, UPDATESITE__OSGI_VERSION);
		createEAttribute(updatesiteEClass, UPDATESITE__CORE_MODULE_NAME);
		createEAttribute(updatesiteEClass, UPDATESITE__UI_MODULE_NAME);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Updatesites(), this.getUpdatesite(), null, "updatesites", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updatesiteEClass, Updatesite.class, "Updatesite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdatesite_BaseId(), theEcorePackage.getEString(), "baseId", "", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_ModuleName(), theEcorePackage.getEString(), "moduleName", "TODO", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_CategoryName(), theEcorePackage.getEString(), "categoryName", "TODO", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_License(), theEcorePackage.getEString(), "license", "", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_Version(), theEcorePackage.getEString(), "version", "1.0.0", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_CopyRightAuthorName(), theEcorePackage.getEString(), "copyRightAuthorName", "", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_CopyRightUrl(), theEcorePackage.getEString(), "copyRightUrl", "http://www.example.org", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_CopyRightYear(), theEcorePackage.getEString(), "copyRightYear", "", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_ProviderName(), theEcorePackage.getEString(), "providerName", "http://www.example.org", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_TychoParentName(), theEcorePackage.getEString(), "tychoParentName", "parent", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_TychoVersion(), theEcorePackage.getEString(), "tychoVersion", "0.24.0", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_JavaVersion(), theEcorePackage.getEString(), "javaVersion", "JavaSE-1.8", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_CoreSuffix(), theEcorePackage.getEString(), "coreSuffix", "", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_UiSuffix(), theEcorePackage.getEString(), "uiSuffix", ".ui", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_TestsSuffix(), theEcorePackage.getEString(), "testsSuffix", ".tests", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_FeatureSuffix(), theEcorePackage.getEString(), "featureSuffix", ".feature", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_UpdateSiteSuffix(), theEcorePackage.getEString(), "updateSiteSuffix", ".p2updateSite", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_TargetSuffix(), theEcorePackage.getEString(), "targetSuffix", ".releng.targetplatform", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_MavenVersionSuffix(), theEcorePackage.getEString(), "mavenVersionSuffix", "-SNAPSHOT", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_OsgiVersionQualifier(), theEcorePackage.getEString(), "osgiVersionQualifier", ".qualifier", 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_CoreId(), theEcorePackage.getEString(), "coreId", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_UiId(), theEcorePackage.getEString(), "uiId", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_TestsId(), theEcorePackage.getEString(), "testsId", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_UpdateSiteId(), theEcorePackage.getEString(), "updateSiteId", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_FeatureId(), theEcorePackage.getEString(), "featureId", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_TargetId(), theEcorePackage.getEString(), "targetId", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_MavenVersion(), theEcorePackage.getEString(), "mavenVersion", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_OsgiVersion(), theEcorePackage.getEString(), "osgiVersion", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_CoreModuleName(), theEcorePackage.getEString(), "coreModuleName", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_UiModuleName(), theEcorePackage.getEString(), "uiModuleName", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModulespecificationPackageImpl
