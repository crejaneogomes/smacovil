/**
 */
package smaCoViLanguage.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import smaCoViLanguage.Main;
import smaCoViLanguage.SmaCoViLanguagePackage;
import smaCoViLanguage.SmartContract;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smaCoViLanguage.impl.MainImpl#getSmartcontract <em>Smartcontract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainImpl extends SmartContractImpl implements Main {
	/**
	 * The cached value of the '{@link #getSmartcontract() <em>Smartcontract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmartcontract()
	 * @generated
	 * @ordered
	 */
	protected EList<SmartContract> smartcontract;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmaCoViLanguagePackage.Literals.MAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmartContract> getSmartcontract() {
		if (smartcontract == null) {
			smartcontract = new EObjectContainmentEList<SmartContract>(SmartContract.class, this,
					SmaCoViLanguagePackage.MAIN__SMARTCONTRACT);
		}
		return smartcontract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmaCoViLanguagePackage.MAIN__SMARTCONTRACT:
			return ((InternalEList<?>) getSmartcontract()).basicRemove(otherEnd, msgs);
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
		case SmaCoViLanguagePackage.MAIN__SMARTCONTRACT:
			return getSmartcontract();
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
		case SmaCoViLanguagePackage.MAIN__SMARTCONTRACT:
			getSmartcontract().clear();
			getSmartcontract().addAll((Collection<? extends SmartContract>) newValue);
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
		case SmaCoViLanguagePackage.MAIN__SMARTCONTRACT:
			getSmartcontract().clear();
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
		case SmaCoViLanguagePackage.MAIN__SMARTCONTRACT:
			return smartcontract != null && !smartcontract.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MainImpl
