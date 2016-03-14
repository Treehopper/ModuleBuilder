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
 *   <li>{@link modulespecification.Updatesite#getCoreName <em>Core Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getUiName <em>Ui Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getTestsName <em>Tests Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getUpdateSiteName <em>Update Site Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link modulespecification.Updatesite#getTargetName <em>Target Name</em>}</li>
 * </ul>
 *
 * @see modulespecification.ModulespecificationPackage#getUpdatesite()
 * @model
 * @generated
 */
public interface Updatesite extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Name</em>' attribute.
	 * @see #setBaseName(String)
	 * @see modulespecification.ModulespecificationPackage#getUpdatesite_BaseName()
	 * @model unique="false"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return this.getBaseName();'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseName = this.getBaseName();\nreturn (_baseName + \".ui\");'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseName = this.getBaseName();\nreturn (_baseName + \".tests\");'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseName = this.getBaseName();\nreturn (_baseName + \".p2updateSite\");'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseName = this.getBaseName();\nreturn (_baseName + \".feature\");'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _baseName = this.getBaseName();\nreturn (_baseName + \".releng.targetplatform\");'"
	 * @generated
	 */
	String getTargetName();

} // Updatesite
