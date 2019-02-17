/**
 */
package MetamodelExecution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDischarge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.EDischarge#getPrescriptionResult <em>Prescription Result</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getEDischarge()
 * @model
 * @generated
 */
public interface EDischarge extends EStep {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getEDischarge_PrescriptionResult()
	 * @model containment="true"
	 * @generated
	 */
	PrescriptionResult getPrescriptionResult();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EDischarge#getPrescriptionResult <em>Prescription Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription Result</em>' containment reference.
	 * @see #getPrescriptionResult()
	 * @generated
	 */
	void setPrescriptionResult(PrescriptionResult value);

} // EDischarge
