/**
 */
package smaCoViLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
	 * The cached value of the '{@link #getSmartcontract() <em>Smartcontract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmartcontract()
	 * @generated
	 * @ordered
	 */
	protected SmartContract smartcontract;

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
	public SmartContract getSmartcontract() {
		return smartcontract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmartcontract(SmartContract newSmartcontract, NotificationChain msgs) {
		SmartContract oldSmartcontract = smartcontract;
		smartcontract = newSmartcontract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SmaCoViLanguagePackage.MAIN__SMARTCONTRACT, oldSmartcontract, newSmartcontract);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmartcontract(SmartContract newSmartcontract) {
		if (newSmartcontract != smartcontract) {
			NotificationChain msgs = null;
			if (smartcontract != null)
				msgs = ((InternalEObject) smartcontract).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SmaCoViLanguagePackage.MAIN__SMARTCONTRACT, null, msgs);
			if (newSmartcontract != null)
				msgs = ((InternalEObject) newSmartcontract).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SmaCoViLanguagePackage.MAIN__SMARTCONTRACT, null, msgs);
			msgs = basicSetSmartcontract(newSmartcontract, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCoViLanguagePackage.MAIN__SMARTCONTRACT,
					newSmartcontract, newSmartcontract));
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
			return basicSetSmartcontract(null, msgs);
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
			setSmartcontract((SmartContract) newValue);
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
			setSmartcontract((SmartContract) null);
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
			return smartcontract != null;
		}
		return super.eIsSet(featureID);
	}

} //MainImpl
