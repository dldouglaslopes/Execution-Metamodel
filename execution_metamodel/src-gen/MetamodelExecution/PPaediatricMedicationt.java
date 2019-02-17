/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PPaediatric Medicationt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.PPaediatricMedicationt#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.PPaediatricMedicationt#getResult <em>Result</em>}</li>
 *   <li>{@link MetamodelExecution.PPaediatricMedicationt#getPrescriptionResult <em>Prescription Result</em>}</li>
 *   <li>{@link MetamodelExecution.PPaediatricMedicationt#getPaediatricMedication <em>Paediatric Medication</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getPPaediatricMedicationt()
 * @model
 * @generated
 */
public interface PPaediatricMedicationt extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPPaediatricMedicationt_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PPaediatricMedicationt#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPPaediatricMedicationt_Result()
	 * @model containment="true"
	 * @generated
	 */
	Result getResult();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PPaediatricMedicationt#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Result value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPPaediatricMedicationt_PrescriptionResult()
	 * @model containment="true"
	 * @generated
	 */
	PrescriptionResult getPrescriptionResult();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PPaediatricMedicationt#getPrescriptionResult <em>Prescription Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription Result</em>' containment reference.
	 * @see #getPrescriptionResult()
	 * @generated
	 */
	void setPrescriptionResult(PrescriptionResult value);

	/**
	 * Returns the value of the '<em><b>Paediatric Medication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paediatric Medication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paediatric Medication</em>' containment reference.
	 * @see #setPaediatricMedication(PaediatricMedication)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPPaediatricMedicationt_PaediatricMedication()
	 * @model containment="true"
	 * @generated
	 */
	PaediatricMedication getPaediatricMedication();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PPaediatricMedicationt#getPaediatricMedication <em>Paediatric Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paediatric Medication</em>' containment reference.
	 * @see #getPaediatricMedication()
	 * @generated
	 */
	void setPaediatricMedication(PaediatricMedication value);

} // PPaediatricMedicationt
