/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsible</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Responsible#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getResponsible()
 * @model
 * @generated
 */
public interface Responsible extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getResponsible_Data()
	 * @model required="true"
	 * @generated
	 */
	User getData();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Responsible#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(User value);

} // Responsible
