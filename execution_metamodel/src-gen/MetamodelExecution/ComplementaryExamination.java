/**
 */
package MetamodelExecution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complementary Examination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.ComplementaryExamination#getExaminationprescribedresource <em>Examinationprescribedresource</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryExamination()
 * @model
 * @generated
 */
public interface ComplementaryExamination extends ComplementaryConducts {
	/**
	 * Returns the value of the '<em><b>Examinationprescribedresource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examinationprescribedresource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examinationprescribedresource</em>' containment reference.
	 * @see #setExaminationprescribedresource(ExaminationPrescribedResource)
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryExamination_Examinationprescribedresource()
	 * @model containment="true"
	 * @generated
	 */
	ExaminationPrescribedResource getExaminationprescribedresource();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ComplementaryExamination#getExaminationprescribedresource <em>Examinationprescribedresource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Examinationprescribedresource</em>' containment reference.
	 * @see #getExaminationprescribedresource()
	 * @generated
	 */
	void setExaminationprescribedresource(ExaminationPrescribedResource value);

} // ComplementaryExamination
