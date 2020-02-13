/**
 */
package smaCoViLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smaCoViLanguage.Condition#getOperator <em>Operator</em>}</li>
 *   <li>{@link smaCoViLanguage.Condition#getFirstPartCondition <em>First Part Condition</em>}</li>
 *   <li>{@link smaCoViLanguage.Condition#getLastConditionPart <em>Last Condition Part</em>}</li>
 * </ul>
 *
 * @see smaCoViLanguage.SmaCoViLanguagePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends Adico {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getCondition_Operator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link smaCoViLanguage.Condition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>First Part Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Part Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Part Condition</em>' attribute.
	 * @see #setFirstPartCondition(String)
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getCondition_FirstPartCondition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getFirstPartCondition();

	/**
	 * Sets the value of the '{@link smaCoViLanguage.Condition#getFirstPartCondition <em>First Part Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Part Condition</em>' attribute.
	 * @see #getFirstPartCondition()
	 * @generated
	 */
	void setFirstPartCondition(String value);

	/**
	 * Returns the value of the '<em><b>Last Condition Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Condition Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Condition Part</em>' attribute.
	 * @see #setLastConditionPart(String)
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getCondition_LastConditionPart()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLastConditionPart();

	/**
	 * Sets the value of the '{@link smaCoViLanguage.Condition#getLastConditionPart <em>Last Condition Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Condition Part</em>' attribute.
	 * @see #getLastConditionPart()
	 * @generated
	 */
	void setLastConditionPart(String value);

} // Condition
