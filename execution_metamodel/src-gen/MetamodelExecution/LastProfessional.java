/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Last Professional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.LastProfessional#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getLastProfessional()
 * @model
 * @generated
 */
public interface LastProfessional extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(User)
	 * @see MetamodelExecution.Execution_metamodelPackage#getLastProfessional_Data()
	 * @model required="true"
	 * @generated
	 */
	User getData();

	/**
	 * Sets the value of the '{@link MetamodelExecution.LastProfessional#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(User value);

} // LastProfessional
