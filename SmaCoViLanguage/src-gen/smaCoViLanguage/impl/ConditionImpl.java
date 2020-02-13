/**
 */
package smaCoViLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import smaCoViLanguage.Condition;
import smaCoViLanguage.SmaCoViLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smaCoViLanguage.impl.ConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link smaCoViLanguage.impl.ConditionImpl#getFirstPartCondition <em>First Part Condition</em>}</li>
 *   <li>{@link smaCoViLanguage.impl.ConditionImpl#getLastConditionPart <em>Last Condition Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends AdicoImpl implements Condition {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstPartCondition() <em>First Part Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPartCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_PART_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstPartCondition() <em>First Part Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPartCondition()
	 * @generated
	 * @ordered
	 */
	protected String firstPartCondition = FIRST_PART_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastConditionPart() <em>Last Condition Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastConditionPart()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_CONDITION_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastConditionPart() <em>Last Condition Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastConditionPart()
	 * @generated
	 * @ordered
	 */
	protected String lastConditionPart = LAST_CONDITION_PART_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmaCoViLanguagePackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCoViLanguagePackage.CONDITION__OPERATOR,
					oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstPartCondition() {
		return firstPartCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstPartCondition(String newFirstPartCondition) {
		String oldFirstPartCondition = firstPartCondition;
		firstPartCondition = newFirstPartCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SmaCoViLanguagePackage.CONDITION__FIRST_PART_CONDITION, oldFirstPartCondition, firstPartCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastConditionPart() {
		return lastConditionPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastConditionPart(String newLastConditionPart) {
		String oldLastConditionPart = lastConditionPart;
		lastConditionPart = newLastConditionPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCoViLanguagePackage.CONDITION__LAST_CONDITION_PART,
					oldLastConditionPart, lastConditionPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmaCoViLanguagePackage.CONDITION__OPERATOR:
			return getOperator();
		case SmaCoViLanguagePackage.CONDITION__FIRST_PART_CONDITION:
			return getFirstPartCondition();
		case SmaCoViLanguagePackage.CONDITION__LAST_CONDITION_PART:
			return getLastConditionPart();
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
		case SmaCoViLanguagePackage.CONDITION__OPERATOR:
			setOperator((String) newValue);
			return;
		case SmaCoViLanguagePackage.CONDITION__FIRST_PART_CONDITION:
			setFirstPartCondition((String) newValue);
			return;
		case SmaCoViLanguagePackage.CONDITION__LAST_CONDITION_PART:
			setLastConditionPart((String) newValue);
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
		case SmaCoViLanguagePackage.CONDITION__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case SmaCoViLanguagePackage.CONDITION__FIRST_PART_CONDITION:
			setFirstPartCondition(FIRST_PART_CONDITION_EDEFAULT);
			return;
		case SmaCoViLanguagePackage.CONDITION__LAST_CONDITION_PART:
			setLastConditionPart(LAST_CONDITION_PART_EDEFAULT);
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
		case SmaCoViLanguagePackage.CONDITION__OPERATOR:
			return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
		case SmaCoViLanguagePackage.CONDITION__FIRST_PART_CONDITION:
			return FIRST_PART_CONDITION_EDEFAULT == null ? firstPartCondition != null
					: !FIRST_PART_CONDITION_EDEFAULT.equals(firstPartCondition);
		case SmaCoViLanguagePackage.CONDITION__LAST_CONDITION_PART:
			return LAST_CONDITION_PART_EDEFAULT == null ? lastConditionPart != null
					: !LAST_CONDITION_PART_EDEFAULT.equals(lastConditionPart);
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
		result.append(" (Operator: ");
		result.append(operator);
		result.append(", FirstPartCondition: ");
		result.append(firstPartCondition);
		result.append(", LastConditionPart: ");
		result.append(lastConditionPart);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
