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
	public EAttribute getUpdatesite_BaseName() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_CoreName() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_UiName() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_TestsName() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_UpdateSiteName() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_FeatureName() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatesite_TargetName() {
		return (EAttribute)updatesiteEClass.getEStructuralFeatures().get(6);
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
		createEAttribute(updatesiteEClass, UPDATESITE__BASE_NAME);
		createEAttribute(updatesiteEClass, UPDATESITE__CORE_NAME);
		createEAttribute(updatesiteEClass, UPDATESITE__UI_NAME);
		createEAttribute(updatesiteEClass, UPDATESITE__TESTS_NAME);
		createEAttribute(updatesiteEClass, UPDATESITE__UPDATE_SITE_NAME);
		createEAttribute(updatesiteEClass, UPDATESITE__FEATURE_NAME);
		createEAttribute(updatesiteEClass, UPDATESITE__TARGET_NAME);
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
		initEAttribute(getUpdatesite_BaseName(), theEcorePackage.getEString(), "baseName", null, 0, 1, Updatesite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_CoreName(), theEcorePackage.getEString(), "coreName", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_UiName(), theEcorePackage.getEString(), "uiName", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_TestsName(), theEcorePackage.getEString(), "testsName", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_UpdateSiteName(), theEcorePackage.getEString(), "updateSiteName", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_FeatureName(), theEcorePackage.getEString(), "featureName", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatesite_TargetName(), theEcorePackage.getEString(), "targetName", null, 0, 1, Updatesite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModulespecificationPackageImpl
