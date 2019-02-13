/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PPrescription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.PPrescription#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.PPrescription#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.PPrescription#getPrescriptionResult <em>Prescription Result</em>}</li>
 *   <li>{@link MetamodelExecution.PPrescription#isLastPrescriptionExecuted <em>Last Prescription Executed</em>}</li>
 *   <li>{@link MetamodelExecution.PPrescription#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getPPrescription()
 * @model
 * @generated
 */
public interface PPrescription extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPPrescription_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PPrescription#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescription</em>' containment reference.
	 * @see #setPrescription(Prescription)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPPrescription_Prescription()
	 * @model containment="true"
	 * @generated
	 */
	Prescription getPrescription();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PPrescription#getPrescription <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription</em>' containment reference.
	 * @see #getPrescription()
	 * @generated
	 */
	void setPrescription(Prescription value);

	/**
	 * Returns the value of the '<em><b>Prescription Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescription Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescription Result</em>' containment reference.
	 * @see #setPrescriptionResult(PrescriptionResult)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPPrescription_PrescriptionResult()
	 * @model containment="true"
	 * @generated
	 */
	PrescriptionResult getPrescriptionResult();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PPrescription#getPrescriptionResult <em>Prescription Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription Result</em>' containment reference.
	 * @see #getPrescriptionResult()
	 * @generated
	 */
	void setPrescriptionResult(PrescriptionResult value);

	/**
	 * Returns the value of the '<em><b>Last Prescription Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Prescription Executed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Prescription Executed</em>' attribute.
	 * @see #setLastPrescriptionExecuted(boolean)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPPrescription_LastPrescriptionExecuted()
	 * @model
	 * @generated
	 */
	boolean isLastPrescriptionExecuted();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PPrescription#isLastPrescriptionExecuted <em>Last Prescription Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Prescription Executed</em>' attribute.
	 * @see #isLastPrescriptionExecuted()
	 * @generated
	 */
	void setLastPrescriptionExecuted(boolean value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Result)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPPrescription_Result()
	 * @model containment="true"
	 * @generated
	 */
	Result getResult();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PPrescription#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Result value);

} // PPrescription
