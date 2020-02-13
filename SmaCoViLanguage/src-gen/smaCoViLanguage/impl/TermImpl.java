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
import smaCoViLanguage.OrElse;
import smaCoViLanguage.SmaCoViLanguagePackage;
import smaCoViLanguage.SmartContract;
import smaCoViLanguage.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smaCoViLanguage.impl.TermImpl#getSmartcontract <em>Smartcontract</em>}</li>
 *   <li>{@link smaCoViLanguage.impl.TermImpl#getOrelse <em>Orelse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermImpl extends SmartContractImpl implements Term {
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
	 * The cached value of the '{@link #getOrelse() <em>Orelse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrelse()
	 * @generated
	 * @ordered
	 */
	protected EList<OrElse> orelse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmaCoViLanguagePackage.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmartContract> getSmartcontract() {
		if (smartcontract == null) {
			smartcontract = new EObjectContainmentEList<SmartContract>(SmartContract.class, this,
					SmaCoViLanguagePackage.TERM__SMARTCONTRACT);
		}
		return smartcontract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrElse> getOrelse() {
		if (orelse == null) {
			orelse = new EObjectContainmentEList<OrElse>(OrElse.class, this, SmaCoViLanguagePackage.TERM__ORELSE);
		}
		return orelse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmaCoViLanguagePackage.TERM__SMARTCONTRACT:
			return ((InternalEList<?>) getSmartcontract()).basicRemove(otherEnd, msgs);
		case SmaCoViLanguagePackage.TERM__ORELSE:
			return ((InternalEList<?>) getOrelse()).basicRemove(otherEnd, msgs);
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
		case SmaCoViLanguagePackage.TERM__SMARTCONTRACT:
			return getSmartcontract();
		case SmaCoViLanguagePackage.TERM__ORELSE:
			return getOrelse();
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
		case SmaCoViLanguagePackage.TERM__SMARTCONTRACT:
			getSmartcontract().clear();
			getSmartcontract().addAll((Collection<? extends SmartContract>) newValue);
			return;
		case SmaCoViLanguagePackage.TERM__ORELSE:
			getOrelse().clear();
			getOrelse().addAll((Collection<? extends OrElse>) newValue);
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
		case SmaCoViLanguagePackage.TERM__SMARTCONTRACT:
			getSmartcontract().clear();
			return;
		case SmaCoViLanguagePackage.TERM__ORELSE:
			getOrelse().clear();
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
		case SmaCoViLanguagePackage.TERM__SMARTCONTRACT:
			return smartcontract != null && !smartcontract.isEmpty();
		case SmaCoViLanguagePackage.TERM__ORELSE:
			return orelse != null && !orelse.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TermImpl
