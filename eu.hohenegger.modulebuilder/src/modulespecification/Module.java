/**
 */
package modulespecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modulespecification.Module#getUpdatesites <em>Updatesites</em>}</li>
 * </ul>
 *
 * @see modulespecification.ModulespecificationPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Updatesites</b></em>' containment reference list.
	 * The list contents are of type {@link modulespecification.Updatesite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updatesites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updatesites</em>' containment reference list.
	 * @see modulespecification.ModulespecificationPackage#getModule_Updatesites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Updatesite> getUpdatesites();

} // Module
