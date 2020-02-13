/**
 */
package smaCoViLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smaCoViLanguage.Term#getSmartcontract <em>Smartcontract</em>}</li>
 *   <li>{@link smaCoViLanguage.Term#getOrelse <em>Orelse</em>}</li>
 * </ul>
 *
 * @see smaCoViLanguage.SmaCoViLanguagePackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends SmartContract {
	/**
	 * Returns the value of the '<em><b>Smartcontract</b></em>' containment reference list.
	 * The list contents are of type {@link smaCoViLanguage.SmartContract}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smartcontract</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smartcontract</em>' containment reference list.
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getTerm_Smartcontract()
	 * @model containment="true"
	 * @generated
	 */
	EList<SmartContract> getSmartcontract();

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
