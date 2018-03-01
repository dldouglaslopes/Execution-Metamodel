/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Examination Prescription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.ExaminationPrescription#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.ExaminationPrescription#isSuccess <em>Success</em>}</li>
 *   <li>{@link MetamodelExecution.ExaminationPrescription#getMessage <em>Message</em>}</li>
 *   <li>{@link MetamodelExecution.ExaminationPrescription#getRequestDate <em>Request Date</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getExaminationPrescription()
 * @model
 * @generated
 */
public interface ExaminationPrescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExaminationPrescription_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExaminationPrescription#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success</em>' attribute.
	 * @see #setSuccess(boolean)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExaminationPrescription_Success()
	 * @model
	 * @generated
	 */
	boolean isSuccess();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExaminationPrescription#isSuccess <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success</em>' attribute.
	 * @see #isSuccess()
	 * @generated
	 */
	void setSuccess(boolean value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExaminationPrescription_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExaminationPrescription#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Date</em>' attribute.
	 * @see #setRequestDate(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExaminationPrescription_RequestDate()
	 * @model
	 * @generated
	 */
	String getRequestDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExaminationPrescription#getRequestDate <em>Request Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Date</em>' attribute.
	 * @see #getRequestDate()
	 * @generated
	 */
	void setRequestDate(String value);

} // ExaminationPrescription
