/**
 */
package smaCoViLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import smaCoViLanguage.Deotonic;
import smaCoViLanguage.SmaCoViLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deotonic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smaCoViLanguage.impl.DeotonicImpl#getType <em>Type</em>}</li>
 *   <li>{@link smaCoViLanguage.impl.DeotonicImpl#getDeotonic <em>Deotonic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeotonicImpl extends MinimalEObjectImpl.Container implements Deotonic {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeotonic() <em>Deotonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeotonic()
	 * @generated
	 * @ordered
	 */
	protected static final String DEOTONIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeotonic() <em>Deotonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeotonic()
	 * @generated
	 * @ordered
	 */
	protected String deotonic = DEOTONIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeotonicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmaCoViLanguagePackage.Literals.DEOTONIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCoViLanguagePackage.DEOTONIC__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeotonic() {
		return deotonic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeotonic(String newDeotonic) {
		String oldDeotonic = deotonic;
		deotonic = newDeotonic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCoViLanguagePackage.DEOTONIC__DEOTONIC,
					oldDeotonic, deotonic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmaCoViLanguagePackage.DEOTONIC__TYPE:
			return getType();
		case SmaCoViLanguagePackage.DEOTONIC__DEOTONIC:
			return getDeotonic();
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
		case SmaCoViLanguagePackage.DEOTONIC__TYPE:
			setType((String) newValue);
			return;
		case SmaCoViLanguagePackage.DEOTONIC__DEOTONIC:
			setDeotonic((String) newValue);
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
		case SmaCoViLanguagePackage.DEOTONIC__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case SmaCoViLanguagePackage.DEOTONIC__DEOTONIC:
			setDeotonic(DEOTONIC_EDEFAULT);
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
		case SmaCoViLanguagePackage.DEOTONIC__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case SmaCoViLanguagePackage.DEOTONIC__DEOTONIC:
			return DEOTONIC_EDEFAULT == null ? deotonic != null : !DEOTONIC_EDEFAULT.equals(deotonic);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Type: ");
		result.append(type);
		result.append(", Deotonic: ");
		result.append(deotonic);
		result.append(')');
		return result.toString();
	}

} //DeotonicImpl
