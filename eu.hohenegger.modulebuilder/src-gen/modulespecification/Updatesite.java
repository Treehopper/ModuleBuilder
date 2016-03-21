/**
 */
package modulespecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Updatesite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modulespecification.Updatesite#getBaseId <em>Base Id</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getLicense <em>License</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getVersion <em>Version</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getCopyRightAuthorName <em>Copy Right Author Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getCopyRightUrl <em>Copy Right Url</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getCopyRightYear <em>Copy Right Year</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getTychoParentName <em>Tycho Parent Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getTychoVersion <em>Tycho Version</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getJavaVersion <em>Java Version</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getCoreSuffix <em>Core Suffix</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getUiSuffix <em>Ui Suffix</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getTestsSuffix <em>Tests Suffix</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getFeatureSuffix <em>Feature Suffix</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getUpdateSiteSuffix <em>Update Site Suffix</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getTargetSuffix <em>Target Suffix</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getMavenVersionSuffix <em>Maven Version Suffix</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getOsgiVersionQualifier <em>Osgi Version Qualifier</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getCoreId <em>Core Id</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getUiId <em>Ui Id</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getTestsId <em>Tests Id</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getUpdateSiteId <em>Update Site Id</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getFeatureId <em>Feature Id</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getMavenVersion <em>Maven Version</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getOsgiVersion <em>Osgi Version</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getCoreModuleName <em>Core Module Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getUiModuleName <em>Ui Module Name</em>}</li>
 * </ul>
 *
 * @see modulespecification.ModulespecificationPackage#getUpdatesite()
 * @model
 * @generated
 */
public interface Updatesite extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Id</em>' attribute.
	 * @see #setBaseId(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_BaseId()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getBaseId();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getBaseId <em>Base Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Id</em>' attribute.
	 * @see #getBaseId()
	 * @generated
	 */
	void setBaseId(String value);

	/**
	 * Returns the value of the '<em><b>Module Name</b></em>' attribute.
	 * The default value is <code>"TODO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Name</em>' attribute.
	 * @see #setModuleName(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_ModuleName()
	 * @model default="TODO" unique="false"
	 * @generated
	 */
	String getModuleName();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(String value);

	/**
	 * Returns the value of the '<em><b>Category Name</b></em>' attribute.
	 * The default value is <code>"TODO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Name</em>' attribute.
	 * @see #setCategoryName(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_CategoryName()
	 * @model default="TODO" unique="false"
	 * @generated
	 */
	String getCategoryName();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getCategoryName <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Name</em>' attribute.
	 * @see #getCategoryName()
	 * @generated
	 */
	void setCategoryName(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_License()
	 * @model default="" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyMultiLine='true'"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_Version()
	 * @model default="1.0.0" unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Copy Right Author Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Right Author Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Right Author Name</em>' attribute.
	 * @see #setCopyRightAuthorName(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_CopyRightAuthorName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getCopyRightAuthorName();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getCopyRightAuthorName <em>Copy Right Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Right Author Name</em>' attribute.
	 * @see #getCopyRightAuthorName()
	 * @generated
	 */
	void setCopyRightAuthorName(String value);

	/**
	 * Returns the value of the '<em><b>Copy Right Url</b></em>' attribute.
	 * The default value is <code>"http://www.example.org"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Right Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Right Url</em>' attribute.
	 * @see #setCopyRightUrl(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_CopyRightUrl()
	 * @model default="http://www.example.org" unique="false"
	 * @generated
	 */
	String getCopyRightUrl();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getCopyRightUrl <em>Copy Right Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Right Url</em>' attribute.
	 * @see #getCopyRightUrl()
	 * @generated
	 */
	void setCopyRightUrl(String value);

	/**
	 * Returns the value of the '<em><b>Copy Right Year</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Right Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Right Year</em>' attribute.
	 * @see #setCopyRightYear(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_CopyRightYear()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getCopyRightYear();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getCopyRightYear <em>Copy Right Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Right Year</em>' attribute.
	 * @see #getCopyRightYear()
	 * @generated
	 */
	void setCopyRightYear(String value);

	/**
	 * Returns the value of the '<em><b>Provider Name</b></em>' attribute.
	 * The default value is <code>"http://www.example.org"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Name</em>' attribute.
	 * @see #setProviderName(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_ProviderName()
	 * @model default="http://www.example.org" unique="false"
	 * @generated
	 */
	String getProviderName();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getProviderName <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Name</em>' attribute.
	 * @see #getProviderName()
	 * @generated
	 */
	void setProviderName(String value);

	/**
	 * Returns the value of the '<em><b>Tycho Parent Name</b></em>' attribute.
	 * The default value is <code>"parent"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tycho Parent Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tycho Parent Name</em>' attribute.
	 * @see #setTychoParentName(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_TychoParentName()
	 * @model default="parent" unique="false"
	 * @generated
	 */
	String getTychoParentName();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getTychoParentName <em>Tycho Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tycho Parent Name</em>' attribute.
	 * @see #getTychoParentName()
	 * @generated
	 */
	void setTychoParentName(String value);

	/**
	 * Returns the value of the '<em><b>Tycho Version</b></em>' attribute.
	 * The default value is <code>"0.24.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tycho Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tycho Version</em>' attribute.
	 * @see #setTychoVersion(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_TychoVersion()
	 * @model default="0.24.0" unique="false"
	 * @generated
	 */
	String getTychoVersion();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getTychoVersion <em>Tycho Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tycho Version</em>' attribute.
	 * @see #getTychoVersion()
	 * @generated
	 */
	void setTychoVersion(String value);

	/**
	 * Returns the value of the '<em><b>Java Version</b></em>' attribute.
	 * The default value is <code>"JavaSE-1.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Version</em>' attribute.
	 * @see #setJavaVersion(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_JavaVersion()
	 * @model default="JavaSE-1.8" unique="false"
	 * @generated
	 */
	String getJavaVersion();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getJavaVersion <em>Java Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Version</em>' attribute.
	 * @see #getJavaVersion()
	 * @generated
	 */
	void setJavaVersion(String value);

	/**
	 * Returns the value of the '<em><b>Core Suffix</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Suffix</em>' attribute.
	 * @see #setCoreSuffix(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_CoreSuffix()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getCoreSuffix();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getCoreSuffix <em>Core Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Suffix</em>' attribute.
	 * @see #getCoreSuffix()
	 * @generated
	 */
	void setCoreSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Ui Suffix</b></em>' attribute.
	 * The default value is <code>".ui"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Suffix</em>' attribute.
	 * @see #setUiSuffix(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_UiSuffix()
	 * @model default=".ui" unique="false"
	 * @generated
	 */
	String getUiSuffix();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getUiSuffix <em>Ui Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Suffix</em>' attribute.
	 * @see #getUiSuffix()
	 * @generated
	 */
	void setUiSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Tests Suffix</b></em>' attribute.
	 * The default value is <code>".tests"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests Suffix</em>' attribute.
	 * @see #setTestsSuffix(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_TestsSuffix()
	 * @model default=".tests" unique="false"
	 * @generated
	 */
	String getTestsSuffix();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getTestsSuffix <em>Tests Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tests Suffix</em>' attribute.
	 * @see #getTestsSuffix()
	 * @generated
	 */
	void setTestsSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Feature Suffix</b></em>' attribute.
	 * The default value is <code>".feature"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Suffix</em>' attribute.
	 * @see #setFeatureSuffix(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_FeatureSuffix()
	 * @model default=".feature" unique="false"
	 * @generated
	 */
	String getFeatureSuffix();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getFeatureSuffix <em>Feature Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Suffix</em>' attribute.
	 * @see #getFeatureSuffix()
	 * @generated
	 */
	void setFeatureSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Update Site Suffix</b></em>' attribute.
	 * The default value is <code>".p2updateSite"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Site Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Site Suffix</em>' attribute.
	 * @see #setUpdateSiteSuffix(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_UpdateSiteSuffix()
	 * @model default=".p2updateSite" unique="false"
	 * @generated
	 */
	String getUpdateSiteSuffix();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getUpdateSiteSuffix <em>Update Site Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Site Suffix</em>' attribute.
	 * @see #getUpdateSiteSuffix()
	 * @generated
	 */
	void setUpdateSiteSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Target Suffix</b></em>' attribute.
	 * The default value is <code>".releng.targetplatform"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Suffix</em>' attribute.
	 * @see #setTargetSuffix(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_TargetSuffix()
	 * @model default=".releng.targetplatform" unique="false"
	 * @generated
	 */
	String getTargetSuffix();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getTargetSuffix <em>Target Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Suffix</em>' attribute.
	 * @see #getTargetSuffix()
	 * @generated
	 */
	void setTargetSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Maven Version Suffix</b></em>' attribute.
	 * The default value is <code>"-SNAPSHOT"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maven Version Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maven Version Suffix</em>' attribute.
	 * @see #setMavenVersionSuffix(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_MavenVersionSuffix()
	 * @model default="-SNAPSHOT" unique="false"
	 * @generated
	 */
	String getMavenVersionSuffix();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getMavenVersionSuffix <em>Maven Version Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maven Version Suffix</em>' attribute.
	 * @see #getMavenVersionSuffix()
	 * @generated
	 */
	void setMavenVersionSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Osgi Version Qualifier</b></em>' attribute.
	 * The default value is <code>".qualifier"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osgi Version Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osgi Version Qualifier</em>' attribute.
	 * @see #setOsgiVersionQualifier(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_OsgiVersionQualifier()
	 * @model default=".qualifier" unique="false"
	 * @generated
	 */
	String getOsgiVersionQualifier();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getOsgiVersionQualifier <em>Osgi Version Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osgi Version Qualifier</em>' attribute.
	 * @see #getOsgiVersionQualifier()
	 * @generated
	 */
	void setOsgiVersionQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Core Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Id</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_CoreId()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseId = this.getBaseId();\n<%java.lang.String%> _coreSuffix = this.getCoreSuffix();\nreturn (_baseId + _coreSuffix);'"
	 * @generated
	 */
	String getCoreId();

	/**
	 * Returns the value of the '<em><b>Ui Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Id</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_UiId()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseId = this.getBaseId();\n<%java.lang.String%> _uiSuffix = this.getUiSuffix();\nreturn (_baseId + _uiSuffix);'"
	 * @generated
	 */
	String getUiId();

	/**
	 * Returns the value of the '<em><b>Tests Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests Id</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_TestsId()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseId = this.getBaseId();\n<%java.lang.String%> _testsSuffix = this.getTestsSuffix();\nreturn (_baseId + _testsSuffix);'"
	 * @generated
	 */
	String getTestsId();

	/**
	 * Returns the value of the '<em><b>Update Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Site Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Site Id</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_UpdateSiteId()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseId = this.getBaseId();\n<%java.lang.String%> _updateSiteSuffix = this.getUpdateSiteSuffix();\nreturn (_baseId + _updateSiteSuffix);'"
	 * @generated
	 */
	String getUpdateSiteId();

	/**
	 * Returns the value of the '<em><b>Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Id</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_FeatureId()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseId = this.getBaseId();\n<%java.lang.String%> _featureSuffix = this.getFeatureSuffix();\nreturn (_baseId + _featureSuffix);'"
	 * @generated
	 */
	String getFeatureId();

	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Id</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_TargetId()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseId = this.getBaseId();\n<%java.lang.String%> _targetSuffix = this.getTargetSuffix();\nreturn (_baseId + _targetSuffix);'"
	 * @generated
	 */
	String getTargetId();

	/**
	 * Returns the value of the '<em><b>Maven Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maven Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maven Version</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_MavenVersion()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _version = this.getVersion();\n<%java.lang.String%> _mavenVersionSuffix = this.getMavenVersionSuffix();\nreturn (_version + _mavenVersionSuffix);'"
	 * @generated
	 */
	String getMavenVersion();

	/**
	 * Returns the value of the '<em><b>Osgi Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osgi Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osgi Version</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_OsgiVersion()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _version = this.getVersion();\n<%java.lang.String%> _osgiVersionQualifier = this.getOsgiVersionQualifier();\nreturn (_version + _osgiVersionQualifier);'"
	 * @generated
	 */
	String getOsgiVersion();

	/**
	 * Returns the value of the '<em><b>Core Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Module Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Module Name</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_CoreModuleName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _moduleName = this.getModuleName();\nreturn (_moduleName + \" Core\");'"
	 * @generated
	 */
	String getCoreModuleName();

	/**
	 * Returns the value of the '<em><b>Ui Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Module Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Module Name</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_UiModuleName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _moduleName = this.getModuleName();\nreturn (_moduleName + \" UI\");'"
	 * @generated
	 */
	String getUiModuleName();

} // Updatesite
