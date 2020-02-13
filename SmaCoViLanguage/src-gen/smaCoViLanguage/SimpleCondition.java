/**
 */
package smaCoViLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smaCoViLanguage.SimpleCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link smaCoViLanguage.SimpleCondition#getFirstPartCondition <em>First Part Condition</em>}</li>
 * </ul>
 *
 * @see smaCoViLanguage.SmaCoViLanguagePackage#getSimpleCondition()
 * @model
 * @generated
 */
public interface SimpleCondition extends Adico {
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
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getSimpleCondition_Operator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link smaCoViLanguage.SimpleCondition#getOperator <em>Operator</em>}' attribute.
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
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getSimpleCondition_FirstPartCondition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getFirstPartCondition();

	/**
	 * Sets the value of the '{@link smaCoViLanguage.SimpleCondition#getFirstPartCondition <em>First Part Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Part Condition</em>' attribute.
	 * @see #getFirstPartCondition()
	 * @generated
	 */
	void setFirstPartCondition(String value);

} // SimpleCondition
