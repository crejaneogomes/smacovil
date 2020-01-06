/**
 */
package smaCoViLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smaCoViLanguage.Aim;
import smaCoViLanguage.Attribute;
import smaCoViLanguage.Condition;
import smaCoViLanguage.Deotonic;
import smaCoViLanguage.OrElse;
import smaCoViLanguage.SmaCoViLanguagePackage;
import smaCoViLanguage.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smaCoViLanguage.impl.TermImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link smaCoViLanguage.impl.TermImpl#getDeotonics <em>Deotonics</em>}</li>
 *   <li>{@link smaCoViLanguage.impl.TermImpl#getAims <em>Aims</em>}</li>
 *   <li>{@link smaCoViLanguage.impl.TermImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link smaCoViLanguage.impl.TermImpl#getOrelse <em>Orelse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermImpl extends MinimalEObjectImpl.Container implements Term {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getDeotonics() <em>Deotonics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeotonics()
	 * @generated
	 * @ordered
	 */
	protected EList<Deotonic> deotonics;

	/**
	 * The cached value of the '{@link #getAims() <em>Aims</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAims()
	 * @generated
	 * @ordered
	 */
	protected EList<Aim> aims;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

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
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					SmaCoViLanguagePackage.TERM__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deotonic> getDeotonics() {
		if (deotonics == null) {
			deotonics = new EObjectContainmentEList<Deotonic>(Deotonic.class, this,
					SmaCoViLanguagePackage.TERM__DEOTONICS);
		}
		return deotonics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aim> getAims() {
		if (aims == null) {
			aims = new EObjectContainmentEList<Aim>(Aim.class, this, SmaCoViLanguagePackage.TERM__AIMS);
		}
		return aims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this,
					SmaCoViLanguagePackage.TERM__CONDITIONS);
		}
		return conditions;
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
		case SmaCoViLanguagePackage.TERM__ATTRIBUTE:
			return ((InternalEList<?>) getAttribute()).basicRemove(otherEnd, msgs);
		case SmaCoViLanguagePackage.TERM__DEOTONICS:
			return ((InternalEList<?>) getDeotonics()).basicRemove(otherEnd, msgs);
		case SmaCoViLanguagePackage.TERM__AIMS:
			return ((InternalEList<?>) getAims()).basicRemove(otherEnd, msgs);
		case SmaCoViLanguagePackage.TERM__CONDITIONS:
			return ((InternalEList<?>) getConditions()).basicRemove(otherEnd, msgs);
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
		case SmaCoViLanguagePackage.TERM__ATTRIBUTE:
			return getAttribute();
		case SmaCoViLanguagePackage.TERM__DEOTONICS:
			return getDeotonics();
		case SmaCoViLanguagePackage.TERM__AIMS:
			return getAims();
		case SmaCoViLanguagePackage.TERM__CONDITIONS:
			return getConditions();
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
		case SmaCoViLanguagePackage.TERM__ATTRIBUTE:
			getAttribute().clear();
			getAttribute().addAll((Collection<? extends Attribute>) newValue);
			return;
		case SmaCoViLanguagePackage.TERM__DEOTONICS:
			getDeotonics().clear();
			getDeotonics().addAll((Collection<? extends Deotonic>) newValue);
			return;
		case SmaCoViLanguagePackage.TERM__AIMS:
			getAims().clear();
			getAims().addAll((Collection<? extends Aim>) newValue);
			return;
		case SmaCoViLanguagePackage.TERM__CONDITIONS:
			getConditions().clear();
			getConditions().addAll((Collection<? extends Condition>) newValue);
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
		case SmaCoViLanguagePackage.TERM__ATTRIBUTE:
			getAttribute().clear();
			return;
		case SmaCoViLanguagePackage.TERM__DEOTONICS:
			getDeotonics().clear();
			return;
		case SmaCoViLanguagePackage.TERM__AIMS:
			getAims().clear();
			return;
		case SmaCoViLanguagePackage.TERM__CONDITIONS:
			getConditions().clear();
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
		case SmaCoViLanguagePackage.TERM__ATTRIBUTE:
			return attribute != null && !attribute.isEmpty();
		case SmaCoViLanguagePackage.TERM__DEOTONICS:
			return deotonics != null && !deotonics.isEmpty();
		case SmaCoViLanguagePackage.TERM__AIMS:
			return aims != null && !aims.isEmpty();
		case SmaCoViLanguagePackage.TERM__CONDITIONS:
			return conditions != null && !conditions.isEmpty();
		case SmaCoViLanguagePackage.TERM__ORELSE:
			return orelse != null && !orelse.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TermImpl
