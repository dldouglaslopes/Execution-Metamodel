/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Next</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Next#getUrlAbsolute <em>Url Absolute</em>}</li>
 *   <li>{@link MetamodelExecution.Next#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getNext()
 * @model
 * @generated
 */
public interface Next extends EObject {
	/**
	 * Returns the value of the '<em><b>Url Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Absolute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Absolute</em>' attribute.
	 * @see #setUrlAbsolute(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getNext_UrlAbsolute()
	 * @model
	 * @generated
	 */
	String getUrlAbsolute();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Next#getUrlAbsolute <em>Url Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Absolute</em>' attribute.
	 * @see #getUrlAbsolute()
	 * @generated
	 */
	void setUrlAbsolute(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getNext_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Next#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // Next
