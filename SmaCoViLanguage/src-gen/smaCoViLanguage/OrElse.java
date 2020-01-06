/**
 */
package smaCoViLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smaCoViLanguage.OrElse#getConsequence <em>Consequence</em>}</li>
 * </ul>
 *
 * @see smaCoViLanguage.SmaCoViLanguagePackage#getOrElse()
 * @model
 * @generated
 */
public interface OrElse extends EObject {
	/**
	 * Returns the value of the '<em><b>Consequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequence</em>' attribute.
	 * @see #setConsequence(String)
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getOrElse_Consequence()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getConsequence();

	/**
	 * Sets the value of the '{@link smaCoViLanguage.OrElse#getConsequence <em>Consequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequence</em>' attribute.
	 * @see #getConsequence()
	 * @generated
	 */
	void setConsequence(String value);

} // OrElse
