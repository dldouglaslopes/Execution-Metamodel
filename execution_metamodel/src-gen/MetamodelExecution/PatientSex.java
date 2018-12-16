/**
 */
package MetamodelExecution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Sex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.PatientSex#isTruePremise <em>True Premise</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getPatientSex()
 * @model
 * @generated
 */
public interface PatientSex extends Bond {
	/**
	 * Returns the value of the '<em><b>True Premise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Premise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Premise</em>' attribute.
	 * @see #setTruePremise(boolean)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPatientSex_TruePremise()
	 * @model
	 * @generated
	 */
	boolean isTruePremise();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PatientSex#isTruePremise <em>True Premise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Premise</em>' attribute.
	 * @see #isTruePremise()
	 * @generated
	 */
	void setTruePremise(boolean value);

} // PatientSex
