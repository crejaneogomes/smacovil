/**
 */
package smaCoViLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smaCoViLanguage.Term#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link smaCoViLanguage.Term#getDeotonics <em>Deotonics</em>}</li>
 *   <li>{@link smaCoViLanguage.Term#getAims <em>Aims</em>}</li>
 *   <li>{@link smaCoViLanguage.Term#getConditions <em>Conditions</em>}</li>
 *   <li>{@link smaCoViLanguage.Term#getOrelse <em>Orelse</em>}</li>
 * </ul>
 *
 * @see smaCoViLanguage.SmaCoViLanguagePackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link smaCoViLanguage.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getTerm_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Deotonics</b></em>' containment reference list.
	 * The list contents are of type {@link smaCoViLanguage.Deotonic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deotonics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deotonics</em>' containment reference list.
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getTerm_Deotonics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deotonic> getDeotonics();

	/**
	 * Returns the value of the '<em><b>Aims</b></em>' containment reference list.
	 * The list contents are of type {@link smaCoViLanguage.Aim}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aims</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aims</em>' containment reference list.
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getTerm_Aims()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aim> getAims();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link smaCoViLanguage.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getTerm_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Orelse</b></em>' containment reference list.
	 * The list contents are of type {@link smaCoViLanguage.OrElse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orelse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orelse</em>' containment reference list.
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getTerm_Orelse()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrElse> getOrelse();

} // Term
