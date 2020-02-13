/**
 */
package smaCoViLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import smaCoViLanguage.Aim;
import smaCoViLanguage.SmaCoViLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smaCoViLanguage.impl.AimImpl#getAim <em>Aim</em>}</li>
 *   <li>{@link smaCoViLanguage.impl.AimImpl#getAimObject <em>Aim Object</em>}</li>
 *   <li>{@link smaCoViLanguage.impl.AimImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AimImpl extends AdicoImpl implements Aim {
	/**
	 * The default value of the '{@link #getAim() <em>Aim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAim()
	 * @generated
	 * @ordered
	 */
	protected static final String AIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAim() <em>Aim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAim()
	 * @generated
	 * @ordered
	 */
	protected String aim = AIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAimObject() <em>Aim Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAimObject()
	 * @generated
	 * @ordered
	 */
	protected static final String AIM_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAimObject() <em>Aim Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAimObject()
	 * @generated
	 * @ordered
	 */
	protected String aimObject = AIM_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargets() <em>Targets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGETS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected String targets = TARGETS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmaCoViLanguagePackage.Literals.AIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAim() {
		return aim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAim(String newAim) {
		String oldAim = aim;
		aim = newAim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCoViLanguagePackage.AIM__AIM, oldAim, aim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAimObject() {
		return aimObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAimObject(String newAimObject) {
		String oldAimObject = aimObject;
		aimObject = newAimObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCoViLanguagePackage.AIM__AIM_OBJECT, oldAimObject,
					aimObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargets() {
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargets(String newTargets) {
		String oldTargets = targets;
		targets = newTargets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCoViLanguagePackage.AIM__TARGETS, oldTargets,
					targets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmaCoViLanguagePackage.AIM__AIM:
			return getAim();
		case SmaCoViLanguagePackage.AIM__AIM_OBJECT:
			return getAimObject();
		case SmaCoViLanguagePackage.AIM__TARGETS:
			return getTargets();
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
		case SmaCoViLanguagePackage.AIM__AIM:
			setAim((String) newValue);
			return;
		case SmaCoViLanguagePackage.AIM__AIM_OBJECT:
			setAimObject((String) newValue);
			return;
		case SmaCoViLanguagePackage.AIM__TARGETS:
			setTargets((String) newValue);
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
		case SmaCoViLanguagePackage.AIM__AIM:
			setAim(AIM_EDEFAULT);
			return;
		case SmaCoViLanguagePackage.AIM__AIM_OBJECT:
			setAimObject(AIM_OBJECT_EDEFAULT);
			return;
		case SmaCoViLanguagePackage.AIM__TARGETS:
			setTargets(TARGETS_EDEFAULT);
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
		case SmaCoViLanguagePackage.AIM__AIM:
			return AIM_EDEFAULT == null ? aim != null : !AIM_EDEFAULT.equals(aim);
		case SmaCoViLanguagePackage.AIM__AIM_OBJECT:
			return AIM_OBJECT_EDEFAULT == null ? aimObject != null : !AIM_OBJECT_EDEFAULT.equals(aimObject);
		case SmaCoViLanguagePackage.AIM__TARGETS:
			return TARGETS_EDEFAULT == null ? targets != null : !TARGETS_EDEFAULT.equals(targets);
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
		result.append(" (Aim: ");
		result.append(aim);
		result.append(", AimObject: ");
		result.append(aimObject);
		result.append(", Targets: ");
		result.append(targets);
		result.append(')');
		return result.toString();
	}

} //AimImpl
