/**
 */
package smaCoViLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import smaCoViLanguage.Adico;
import smaCoViLanguage.Aim;
import smaCoViLanguage.And;
import smaCoViLanguage.Attribute;
import smaCoViLanguage.Condition;
import smaCoViLanguage.Deotonic;
import smaCoViLanguage.Main;
import smaCoViLanguage.OrElse;
import smaCoViLanguage.SimpleCondition;
import smaCoViLanguage.SmaCoViLanguageFactory;
import smaCoViLanguage.SmaCoViLanguagePackage;
import smaCoViLanguage.SmartContract;
import smaCoViLanguage.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmaCoViLanguagePackageImpl extends EPackageImpl implements SmaCoViLanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deotonicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orElseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adicoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleConditionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmaCoViLanguagePackageImpl() {
		super(eNS_URI, SmaCoViLanguageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SmaCoViLanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmaCoViLanguagePackage init() {
		if (isInited)
			return (SmaCoViLanguagePackage) EPackage.Registry.INSTANCE.getEPackage(SmaCoViLanguagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSmaCoViLanguagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SmaCoViLanguagePackageImpl theSmaCoViLanguagePackage = registeredSmaCoViLanguagePackage instanceof SmaCoViLanguagePackageImpl
				? (SmaCoViLanguagePackageImpl) registeredSmaCoViLanguagePackage
				: new SmaCoViLanguagePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSmaCoViLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theSmaCoViLanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmaCoViLanguagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmaCoViLanguagePackage.eNS_URI, theSmaCoViLanguagePackage);
		return theSmaCoViLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartContract() {
		return smartContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartContract_Name() {
		return (EAttribute) smartContractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartContract_Owner() {
		return (EAttribute) smartContractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Smartcontract() {
		return (EReference) termEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Orelse() {
		return (EReference) termEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_AttributeName() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeotonic() {
		return deotonicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeotonic_Deotonic() {
		return (EAttribute) deotonicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Operator() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_FirstPartCondition() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_LastConditionPart() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAim() {
		return aimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAim_Aim() {
		return (EAttribute) aimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAim_AimObject() {
		return (EAttribute) aimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAim_Targets() {
		return (EAttribute) aimEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrElse() {
		return orElseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrElse_Consequence() {
		return (EAttribute) orElseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdico() {
		return adicoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMain() {
		return mainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Smartcontract() {
		return (EReference) mainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleCondition() {
		return simpleConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleCondition_Operator() {
		return (EAttribute) simpleConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleCondition_FirstPartCondition() {
		return (EAttribute) simpleConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmaCoViLanguageFactory getSmaCoViLanguageFactory() {
		return (SmaCoViLanguageFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		smartContractEClass = createEClass(SMART_CONTRACT);
		createEAttribute(smartContractEClass, SMART_CONTRACT__NAME);
		createEAttribute(smartContractEClass, SMART_CONTRACT__OWNER);

		termEClass = createEClass(TERM);
		createEReference(termEClass, TERM__SMARTCONTRACT);
		createEReference(termEClass, TERM__ORELSE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_NAME);

		deotonicEClass = createEClass(DEOTONIC);
		createEAttribute(deotonicEClass, DEOTONIC__DEOTONIC);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__OPERATOR);
		createEAttribute(conditionEClass, CONDITION__FIRST_PART_CONDITION);
		createEAttribute(conditionEClass, CONDITION__LAST_CONDITION_PART);

		aimEClass = createEClass(AIM);
		createEAttribute(aimEClass, AIM__AIM);
		createEAttribute(aimEClass, AIM__AIM_OBJECT);
		createEAttribute(aimEClass, AIM__TARGETS);

		orElseEClass = createEClass(OR_ELSE);
		createEAttribute(orElseEClass, OR_ELSE__CONSEQUENCE);

		adicoEClass = createEClass(ADICO);

		mainEClass = createEClass(MAIN);
		createEReference(mainEClass, MAIN__SMARTCONTRACT);

		andEClass = createEClass(AND);

		simpleConditionEClass = createEClass(SIMPLE_CONDITION);
		createEAttribute(simpleConditionEClass, SIMPLE_CONDITION__OPERATOR);
		createEAttribute(simpleConditionEClass, SIMPLE_CONDITION__FIRST_PART_CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		termEClass.getESuperTypes().add(this.getSmartContract());
		attributeEClass.getESuperTypes().add(this.getAdico());
		deotonicEClass.getESuperTypes().add(this.getAdico());
		conditionEClass.getESuperTypes().add(this.getAdico());
		aimEClass.getESuperTypes().add(this.getAdico());
		orElseEClass.getESuperTypes().add(this.getTerm());
		adicoEClass.getESuperTypes().add(this.getSmartContract());
		mainEClass.getESuperTypes().add(this.getSmartContract());
		andEClass.getESuperTypes().add(this.getAdico());
		simpleConditionEClass.getESuperTypes().add(this.getAdico());

		// Initialize classes, features, and operations; add parameters
		initEClass(smartContractEClass, SmartContract.class, "SmartContract", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSmartContract_Name(), theXMLTypePackage.getString(), "Name", null, 0, 1, SmartContract.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmartContract_Owner(), theXMLTypePackage.getString(), "Owner", null, 0, 1,
				SmartContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerm_Smartcontract(), this.getSmartContract(), null, "smartcontract", null, 0, -1, Term.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_Orelse(), this.getOrElse(), null, "orelse", null, 0, -1, Term.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_AttributeName(), theXMLTypePackage.getString(), "AttributeName", null, 0, 1,
				Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(deotonicEClass, Deotonic.class, "Deotonic", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeotonic_Deotonic(), theXMLTypePackage.getString(), "Deotonic", null, 0, 1, Deotonic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Operator(), theXMLTypePackage.getString(), "Operator", null, 0, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_FirstPartCondition(), theXMLTypePackage.getString(), "FirstPartCondition", null, 0,
				1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_LastConditionPart(), theXMLTypePackage.getString(), "LastConditionPart", null, 0, 1,
				Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(aimEClass, Aim.class, "Aim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAim_Aim(), theXMLTypePackage.getString(), "Aim", null, 0, 1, Aim.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAim_AimObject(), theXMLTypePackage.getString(), "AimObject", null, 0, 1, Aim.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAim_Targets(), theXMLTypePackage.getString(), "Targets", null, 0, 1, Aim.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orElseEClass, OrElse.class, "OrElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrElse_Consequence(), theXMLTypePackage.getString(), "Consequence", null, 0, 1, OrElse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adicoEClass, Adico.class, "Adico", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMain_Smartcontract(), this.getSmartContract(), null, "smartcontract", null, 0, 1, Main.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleConditionEClass, SimpleCondition.class, "SimpleCondition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleCondition_Operator(), theXMLTypePackage.getString(), "Operator", null, 0, 1,
				SimpleCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleCondition_FirstPartCondition(), theXMLTypePackage.getString(), "FirstPartCondition",
				null, 0, 1, SimpleCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SmaCoViLanguagePackageImpl
