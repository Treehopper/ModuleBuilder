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
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getCoreName <em>Core Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getUiName <em>Ui Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getTestsName <em>Tests Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getUpdateSiteName <em>Update Site Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link modulespecification.impl.UpdatesiteImpl#getTargetName <em>Target Name</em>}</li>
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
	protected static final String BASE_NAME_EDEFAULT = null;

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
		return (_baseName + ".ui");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestsName() {
		String _baseName = this.getBaseName();
		return (_baseName + ".tests");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdateSiteName() {
		String _baseName = this.getBaseName();
		return (_baseName + ".p2updateSite");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		String _baseName = this.getBaseName();
		return (_baseName + ".feature");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetName() {
		String _baseName = this.getBaseName();
		return (_baseName + ".releng.targetplatform");
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
		result.append(')');
		return result.toString();
	}

} //UpdatesiteImpl
