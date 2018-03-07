/**
 */
package MetamodelExecution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executed Treatment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.ExecutedTreatment#getPrescribedexam <em>Prescribedexam</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedTreatment#getPrescribedprocedure <em>Prescribedprocedure</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedTreatment#getPrescribedinternment <em>Prescribedinternment</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedTreatment#getPrescribedmedication <em>Prescribedmedication</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedTreatment#getIdsPrescribedExamination <em>Ids Prescribed Examination</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedTreatment#getIdsPrescribedProcedure <em>Ids Prescribed Procedure</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedTreatment#getIdsPrescribedInternment <em>Ids Prescribed Internment</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedTreatment#getIdsPrecribedMedication <em>Ids Precribed Medication</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedTreatment()
 * @model
 * @generated
 */
public interface ExecutedTreatment extends ExecutedElement {
	/**
	 * Returns the value of the '<em><b>Prescribedexam</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PrescribedExamination}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescribedexam</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescribedexam</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedTreatment_Prescribedexam()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrescribedExamination> getPrescribedexam();

	/**
	 * Returns the value of the '<em><b>Prescribedprocedure</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PrescribedProcedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescribedprocedure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescribedprocedure</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedTreatment_Prescribedprocedure()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrescribedProcedure> getPrescribedprocedure();

	/**
	 * Returns the value of the '<em><b>Prescribedinternment</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PrescribedInternment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescribedinternment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescribedinternment</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedTreatment_Prescribedinternment()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrescribedInternment> getPrescribedinternment();

	/**
	 * Returns the value of the '<em><b>Prescribedmedication</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PrescribedMedication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescribedmedication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescribedmedication</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedTreatment_Prescribedmedication()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrescribedMedication> getPrescribedmedication();

	/**
	 * Returns the value of the '<em><b>Ids Prescribed Examination</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids Prescribed Examination</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids Prescribed Examination</em>' attribute list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedTreatment_IdsPrescribedExamination()
	 * @model
	 * @generated
	 */
	EList<Integer> getIdsPrescribedExamination();

	/**
	 * Returns the value of the '<em><b>Ids Prescribed Procedure</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids Prescribed Procedure</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids Prescribed Procedure</em>' attribute list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedTreatment_IdsPrescribedProcedure()
	 * @model
	 * @generated
	 */
	EList<Integer> getIdsPrescribedProcedure();

	/**
	 * Returns the value of the '<em><b>Ids Prescribed Internment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids Prescribed Internment</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids Prescribed Internment</em>' attribute list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedTreatment_IdsPrescribedInternment()
	 * @model
	 * @generated
	 */
	EList<Integer> getIdsPrescribedInternment();

	/**
	 * Returns the value of the '<em><b>Ids Precribed Medication</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids Precribed Medication</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids Precribed Medication</em>' attribute list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedTreatment_IdsPrecribedMedication()
	 * @model
	 * @generated
	 */
	EList<Integer> getIdsPrecribedMedication();

} // ExecutedTreatment