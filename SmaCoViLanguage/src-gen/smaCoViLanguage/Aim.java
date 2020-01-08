/**
 */
package smaCoViLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smaCoViLanguage.Aim#getType <em>Type</em>}</li>
 *   <li>{@link smaCoViLanguage.Aim#getAim <em>Aim</em>}</li>
 * </ul>
 *
 * @see smaCoViLanguage.SmaCoViLanguagePackage#getAim()
 * @model
 * @generated
 */
public interface Aim extends Adico {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getAim_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link smaCoViLanguage.Aim#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Aim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aim</em>' attribute.
	 * @see #setAim(String)
	 * @see smaCoViLanguage.SmaCoViLanguagePackage#getAim_Aim()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getAim();

	/**
	 * Sets the value of the '{@link smaCoViLanguage.Aim#getAim <em>Aim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aim</em>' attribute.
	 * @see #getAim()
	 * @generated
	 */
	void setAim(String value);

} // Aim
