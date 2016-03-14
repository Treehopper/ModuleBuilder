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
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/eu.hohenegger.p2updatesite-wizard/src'"
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
	 * The feature id for the '<em><b>Core Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__CORE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Ui Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__UI_NAME = 2;

	/**
	 * The feature id for the '<em><b>Tests Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__TESTS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Update Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__UPDATE_SITE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__FEATURE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE__TARGET_NAME = 6;

	/**
	 * The number of structural features of the '<em>Updatesite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATESITE_FEATURE_COUNT = 7;

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

	}

} //ModulespecificationPackage
