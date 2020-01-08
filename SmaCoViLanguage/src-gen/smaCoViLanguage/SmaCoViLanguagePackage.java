/**
 */
package smaCoViLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see smaCoViLanguage.SmaCoViLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface SmaCoViLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smaCoViLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/smaCoViLanguage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smaCoViLanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmaCoViLanguagePackage eINSTANCE = smaCoViLanguage.impl.SmaCoViLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link smaCoViLanguage.impl.SmartContractImpl <em>Smart Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smaCoViLanguage.impl.SmartContractImpl
	 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getSmartContract()
	 * @generated
	 */
	int SMART_CONTRACT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT__OWNER = 1;

	/**
	 * The number of structural features of the '<em>Smart Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Smart Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smaCoViLanguage.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smaCoViLanguage.impl.TermImpl
	 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NAME = SMART_CONTRACT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__OWNER = SMART_CONTRACT__OWNER;

	/**
	 * The feature id for the '<em><b>Smartcontract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__SMARTCONTRACT = SMART_CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = SMART_CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = SMART_CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smaCoViLanguage.impl.AdicoImpl <em>Adico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smaCoViLanguage.impl.AdicoImpl
	 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getAdico()
	 * @generated
	 */
	int ADICO = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADICO__NAME = SMART_CONTRACT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADICO__OWNER = SMART_CONTRACT__OWNER;

	/**
	 * The number of structural features of the '<em>Adico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADICO_FEATURE_COUNT = SMART_CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Adico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADICO_OPERATION_COUNT = SMART_CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smaCoViLanguage.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smaCoViLanguage.impl.AttributeImpl
	 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = ADICO__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNER = ADICO__OWNER;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_NAME = ADICO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ADICO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = ADICO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smaCoViLanguage.impl.DeotonicImpl <em>Deotonic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smaCoViLanguage.impl.DeotonicImpl
	 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getDeotonic()
	 * @generated
	 */
	int DEOTONIC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEOTONIC__NAME = ADICO__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEOTONIC__OWNER = ADICO__OWNER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEOTONIC__TYPE = ADICO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deotonic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEOTONIC__DEOTONIC = ADICO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deotonic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEOTONIC_FEATURE_COUNT = ADICO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Deotonic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEOTONIC_OPERATION_COUNT = ADICO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smaCoViLanguage.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smaCoViLanguage.impl.ConditionImpl
	 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = ADICO__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNER = ADICO__OWNER;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION = ADICO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = ADICO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = ADICO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smaCoViLanguage.impl.AimImpl <em>Aim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smaCoViLanguage.impl.AimImpl
	 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getAim()
	 * @generated
	 */
	int AIM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM__NAME = ADICO__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM__OWNER = ADICO__OWNER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM__TYPE = ADICO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM__AIM = ADICO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM_FEATURE_COUNT = ADICO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM_OPERATION_COUNT = ADICO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smaCoViLanguage.impl.OrElseImpl <em>Or Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smaCoViLanguage.impl.OrElseImpl
	 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getOrElse()
	 * @generated
	 */
	int OR_ELSE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_ELSE__NAME = ADICO__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_ELSE__OWNER = ADICO__OWNER;

	/**
	 * The feature id for the '<em><b>Consequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_ELSE__CONSEQUENCE = ADICO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_ELSE_FEATURE_COUNT = ADICO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Or Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_ELSE_OPERATION_COUNT = ADICO_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link smaCoViLanguage.SmartContract <em>Smart Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Contract</em>'.
	 * @see smaCoViLanguage.SmartContract
	 * @generated
	 */
	EClass getSmartContract();

	/**
	 * Returns the meta object for the attribute '{@link smaCoViLanguage.SmartContract#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smaCoViLanguage.SmartContract#getName()
	 * @see #getSmartContract()
	 * @generated
	 */
	EAttribute getSmartContract_Name();

	/**
	 * Returns the meta object for the attribute '{@link smaCoViLanguage.SmartContract#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see smaCoViLanguage.SmartContract#getOwner()
	 * @see #getSmartContract()
	 * @generated
	 */
	EAttribute getSmartContract_Owner();

	/**
	 * Returns the meta object for class '{@link smaCoViLanguage.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see smaCoViLanguage.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link smaCoViLanguage.Term#getSmartcontract <em>Smartcontract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Smartcontract</em>'.
	 * @see smaCoViLanguage.Term#getSmartcontract()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Smartcontract();

	/**
	 * Returns the meta object for class '{@link smaCoViLanguage.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see smaCoViLanguage.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link smaCoViLanguage.Attribute#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see smaCoViLanguage.Attribute#getAttributeName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeName();

	/**
	 * Returns the meta object for class '{@link smaCoViLanguage.Deotonic <em>Deotonic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deotonic</em>'.
	 * @see smaCoViLanguage.Deotonic
	 * @generated
	 */
	EClass getDeotonic();

	/**
	 * Returns the meta object for the attribute '{@link smaCoViLanguage.Deotonic#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see smaCoViLanguage.Deotonic#getType()
	 * @see #getDeotonic()
	 * @generated
	 */
	EAttribute getDeotonic_Type();

	/**
	 * Returns the meta object for the attribute '{@link smaCoViLanguage.Deotonic#getDeotonic <em>Deotonic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deotonic</em>'.
	 * @see smaCoViLanguage.Deotonic#getDeotonic()
	 * @see #getDeotonic()
	 * @generated
	 */
	EAttribute getDeotonic_Deotonic();

	/**
	 * Returns the meta object for class '{@link smaCoViLanguage.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see smaCoViLanguage.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link smaCoViLanguage.Condition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see smaCoViLanguage.Condition#getCondition()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Condition();

	/**
	 * Returns the meta object for class '{@link smaCoViLanguage.Aim <em>Aim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aim</em>'.
	 * @see smaCoViLanguage.Aim
	 * @generated
	 */
	EClass getAim();

	/**
	 * Returns the meta object for the attribute '{@link smaCoViLanguage.Aim#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see smaCoViLanguage.Aim#getType()
	 * @see #getAim()
	 * @generated
	 */
	EAttribute getAim_Type();

	/**
	 * Returns the meta object for the attribute '{@link smaCoViLanguage.Aim#getAim <em>Aim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aim</em>'.
	 * @see smaCoViLanguage.Aim#getAim()
	 * @see #getAim()
	 * @generated
	 */
	EAttribute getAim_Aim();

	/**
	 * Returns the meta object for class '{@link smaCoViLanguage.OrElse <em>Or Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Else</em>'.
	 * @see smaCoViLanguage.OrElse
	 * @generated
	 */
	EClass getOrElse();

	/**
	 * Returns the meta object for the attribute '{@link smaCoViLanguage.OrElse#getConsequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consequence</em>'.
	 * @see smaCoViLanguage.OrElse#getConsequence()
	 * @see #getOrElse()
	 * @generated
	 */
	EAttribute getOrElse_Consequence();

	/**
	 * Returns the meta object for class '{@link smaCoViLanguage.Adico <em>Adico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adico</em>'.
	 * @see smaCoViLanguage.Adico
	 * @generated
	 */
	EClass getAdico();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmaCoViLanguageFactory getSmaCoViLanguageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link smaCoViLanguage.impl.SmartContractImpl <em>Smart Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smaCoViLanguage.impl.SmartContractImpl
		 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getSmartContract()
		 * @generated
		 */
		EClass SMART_CONTRACT = eINSTANCE.getSmartContract();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_CONTRACT__NAME = eINSTANCE.getSmartContract_Name();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_CONTRACT__OWNER = eINSTANCE.getSmartContract_Owner();

		/**
		 * The meta object literal for the '{@link smaCoViLanguage.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smaCoViLanguage.impl.TermImpl
		 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Smartcontract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__SMARTCONTRACT = eINSTANCE.getTerm_Smartcontract();

		/**
		 * The meta object literal for the '{@link smaCoViLanguage.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smaCoViLanguage.impl.AttributeImpl
		 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_NAME = eINSTANCE.getAttribute_AttributeName();

		/**
		 * The meta object literal for the '{@link smaCoViLanguage.impl.DeotonicImpl <em>Deotonic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smaCoViLanguage.impl.DeotonicImpl
		 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getDeotonic()
		 * @generated
		 */
		EClass DEOTONIC = eINSTANCE.getDeotonic();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEOTONIC__TYPE = eINSTANCE.getDeotonic_Type();

		/**
		 * The meta object literal for the '<em><b>Deotonic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEOTONIC__DEOTONIC = eINSTANCE.getDeotonic_Deotonic();

		/**
		 * The meta object literal for the '{@link smaCoViLanguage.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smaCoViLanguage.impl.ConditionImpl
		 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__CONDITION = eINSTANCE.getCondition_Condition();

		/**
		 * The meta object literal for the '{@link smaCoViLanguage.impl.AimImpl <em>Aim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smaCoViLanguage.impl.AimImpl
		 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getAim()
		 * @generated
		 */
		EClass AIM = eINSTANCE.getAim();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIM__TYPE = eINSTANCE.getAim_Type();

		/**
		 * The meta object literal for the '<em><b>Aim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIM__AIM = eINSTANCE.getAim_Aim();

		/**
		 * The meta object literal for the '{@link smaCoViLanguage.impl.OrElseImpl <em>Or Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smaCoViLanguage.impl.OrElseImpl
		 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getOrElse()
		 * @generated
		 */
		EClass OR_ELSE = eINSTANCE.getOrElse();

		/**
		 * The meta object literal for the '<em><b>Consequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OR_ELSE__CONSEQUENCE = eINSTANCE.getOrElse_Consequence();

		/**
		 * The meta object literal for the '{@link smaCoViLanguage.impl.AdicoImpl <em>Adico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smaCoViLanguage.impl.AdicoImpl
		 * @see smaCoViLanguage.impl.SmaCoViLanguagePackageImpl#getAdico()
		 * @generated
		 */
		EClass ADICO = eINSTANCE.getAdico();

	}

} //SmaCoViLanguagePackage
