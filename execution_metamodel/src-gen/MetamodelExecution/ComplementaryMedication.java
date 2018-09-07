/**
 */
package MetamodelExecution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complementary Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.ComplementaryMedication#getPrescribedresource <em>Prescribedresource</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryMedication()
 * @model
 * @generated
 */
public interface ComplementaryMedication extends ComplementaryConducts {
	/**
	 * Returns the value of the '<em><b>Prescribedresource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescribedresource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescribedresource</em>' containment reference.
	 * @see #setPrescribedresource(MedicationPrescribedResource)
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryMedication_Prescribedresource()
	 * @model containment="true"
	 * @generated
	 */
	MedicationPrescribedResource getPrescribedresource();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ComplementaryMedication#getPrescribedresource <em>Prescribedresource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescribedresource</em>' containment reference.
	 * @see #getPrescribedresource()
	 * @generated
	 */
	void setPrescribedresource(MedicationPrescribedResource value);

} // ComplementaryMedication
