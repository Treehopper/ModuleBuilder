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
 *   <li>{@link modulespecification.Updatesite#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getLicense <em>License</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getVersion <em>Version</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getCopyRightAuthorName <em>Copy Right Author Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getCopyRightUrl <em>Copy Right Url</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getCopyRightYear <em>Copy Right Year</em>}</li>
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
 *   <li>{@link modulespecification.Updatesite#getCoreName <em>Core Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getUiName <em>Ui Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getTestsName <em>Tests Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getUpdateSiteName <em>Update Site Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getTargetName <em>Target Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getMavenVersion <em>Maven Version</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getOsgiVersion <em>Osgi Version</em>}</li>
 * </ul>
 *
 * @see modulespecification.ModulespecificationPackage#getUpdatesite()
 * @model
 * @generated
 */
public interface Updatesite extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Name</em>' attribute.
	 * @see #setBaseName(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_BaseName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getBaseName();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getBaseName <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Name</em>' attribute.
	 * @see #getBaseName()
	 * @generated
	 */
	void setBaseName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Name</b></em>' attribute.
	 * The default value is <code>"parent"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Name</em>' attribute.
	 * @see #setParentName(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_ParentName()
	 * @model default="parent" unique="false"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link modulespecification.Updatesite#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

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
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Right Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Right Url</em>' attribute.
	 * @see #setCopyRightUrl(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_CopyRightUrl()
	 * @model default="" unique="false"
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
	 * Returns the value of the '<em><b>Core Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Name</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_CoreName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseName = this.getBaseName();\n<%java.lang.String%> _coreSuffix = this.getCoreSuffix();\nreturn (_baseName + _coreSuffix);'"
	 * @generated
	 */
	String getCoreName();

	/**
	 * Returns the value of the '<em><b>Ui Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Name</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_UiName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseName = this.getBaseName();\n<%java.lang.String%> _uiSuffix = this.getUiSuffix();\nreturn (_baseName + _uiSuffix);'"
	 * @generated
	 */
	String getUiName();

	/**
	 * Returns the value of the '<em><b>Tests Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests Name</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_TestsName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseName = this.getBaseName();\n<%java.lang.String%> _testsSuffix = this.getTestsSuffix();\nreturn (_baseName + _testsSuffix);'"
	 * @generated
	 */
	String getTestsName();

	/**
	 * Returns the value of the '<em><b>Update Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Site Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Site Name</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_UpdateSiteName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseName = this.getBaseName();\n<%java.lang.String%> _updateSiteSuffix = this.getUpdateSiteSuffix();\nreturn (_baseName + _updateSiteSuffix);'"
	 * @generated
	 */
	String getUpdateSiteName();

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_FeatureName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseName = this.getBaseName();\n<%java.lang.String%> _featureSuffix = this.getFeatureSuffix();\nreturn (_baseName + _featureSuffix);'"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Returns the value of the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Name</em>' attribute.
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_TargetName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseName = this.getBaseName();\n<%java.lang.String%> _targetSuffix = this.getTargetSuffix();\nreturn (_baseName + _targetSuffix);'"
	 * @generated
	 */
	String getTargetName();

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

} // Updatesite
