/**
 */
package smaCoViLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smaCoViLanguage.Main#getSmartcontract <em>Smartcontract</em>}</li>
 * </ul>
 *
 * @see smaCoViLanguage.SmaCoViLanguagePackage#getMain()
 * @model
 * @generated
 */
public interface Main extends SmartContract {
	/**
	 * Returns the value of the '<em><b>Smartcontract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smartcontract</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smartcontract</em>' containment reference.
	 * @see #setSmartcontract(SmartContract)
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getMain_Smartcontract()
	 * @model containment="true"
	 * @generated
	 */
	SmartContract getSmartcontract();

	/**
	 * Sets the value of the '{@link smaCoViLanguage.Main#getSmartcontract <em>Smartcontract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smartcontract</em>' containment reference.
	 * @see #getSmartcontract()
	 * @generated
	 */
	void setSmartcontract(SmartContract value);

} // Main
