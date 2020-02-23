/**
 */
package smaCoViLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smaCoViLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmaCoViLanguageFactoryImpl extends EFactoryImpl implements SmaCoViLanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmaCoViLanguageFactory init() {
		try {
			SmaCoViLanguageFactory theSmaCoViLanguageFactory = (SmaCoViLanguageFactory) EPackage.Registry.INSTANCE
					.getEFactory(SmaCoViLanguagePackage.eNS_URI);
			if (theSmaCoViLanguageFactory != null) {
				return theSmaCoViLanguageFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmaCoViLanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmaCoViLanguageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SmaCoViLanguagePackage.TERM:
			return createTerm();
		case SmaCoViLanguagePackage.ATTRIBUTE:
			return createAttribute();
		case SmaCoViLanguagePackage.DEONTIC:
			return createDeontic();
		case SmaCoViLanguagePackage.CONDITION:
			return createCondition();
		case SmaCoViLanguagePackage.AIM:
			return createAim();
		case SmaCoViLanguagePackage.OR_ELSE:
			return createOrElse();
		case SmaCoViLanguagePackage.MAIN:
			return createMain();
		case SmaCoViLanguagePackage.AND:
			return createAnd();
		case SmaCoViLanguagePackage.SIMPLE_CONDITION:
			return createSimpleCondition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deontic createDeontic() {
		DeonticImpl deontic = new DeonticImpl();
		return deontic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aim createAim() {
		AimImpl aim = new AimImpl();
		return aim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrElse createOrElse() {
		OrElseImpl orElse = new OrElseImpl();
		return orElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main createMain() {
		MainImpl main = new MainImpl();
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleCondition createSimpleCondition() {
		SimpleConditionImpl simpleCondition = new SimpleConditionImpl();
		return simpleCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmaCoViLanguagePackage getSmaCoViLanguagePackage() {
		return (SmaCoViLanguagePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmaCoViLanguagePackage getPackage() {
		return SmaCoViLanguagePackage.eINSTANCE;
	}

} //SmaCoViLanguageFactoryImpl
