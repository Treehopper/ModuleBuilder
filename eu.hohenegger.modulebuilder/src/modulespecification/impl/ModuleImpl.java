/**
 */
package modulespecification.impl;

import java.util.Collection;

import modulespecification.Module;
import modulespecification.ModulespecificationPackage;
import modulespecification.Updatesite;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modulespecification.impl.ModuleImpl#getUpdatesites <em>Updatesites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module {
	/**
	 * The cached value of the '{@link #getUpdatesites() <em>Updatesites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatesites()
	 * @generated
	 * @ordered
	 */
	protected EList<Updatesite> updatesites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulespecificationPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Updatesite> getUpdatesites() {
		if (updatesites == null) {
			updatesites = new EObjectContainmentEList<Updatesite>(Updatesite.class, this, ModulespecificationPackage.MODULE__UPDATESITES);
		}
		return updatesites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulespecificationPackage.MODULE__UPDATESITES:
				return ((InternalEList<?>)getUpdatesites()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulespecificationPackage.MODULE__UPDATESITES:
				return getUpdatesites();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulespecificationPackage.MODULE__UPDATESITES:
				getUpdatesites().clear();
				getUpdatesites().addAll((Collection<? extends Updatesite>)newValue);
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
			case ModulespecificationPackage.MODULE__UPDATESITES:
				getUpdatesites().clear();
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
			case ModulespecificationPackage.MODULE__UPDATESITES:
				return updatesites != null && !updatesites.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl
