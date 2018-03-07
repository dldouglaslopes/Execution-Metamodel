/**
 */
package MetamodelExecution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETreatment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.ETreatment#getPrescribedexam <em>Prescribedexam</em>}</li>
 *   <li>{@link MetamodelExecution.ETreatment#getPrescribedprocedure <em>Prescribedprocedure</em>}</li>
 *   <li>{@link MetamodelExecution.ETreatment#getPrescribedinternment <em>Prescribedinternment</em>}</li>
 *   <li>{@link MetamodelExecution.ETreatment#getPrescribedmedication <em>Prescribedmedication</em>}</li>
 *   <li>{@link MetamodelExecution.ETreatment#getIdsPrescribedExamination <em>Ids Prescribed Examination</em>}</li>
 *   <li>{@link MetamodelExecution.ETreatment#getIdsPrescribedProcedure <em>Ids Prescribed Procedure</em>}</li>
 *   <li>{@link MetamodelExecution.ETreatment#getIdsPrescribedInternment <em>Ids Prescribed Internment</em>}</li>
 *   <li>{@link MetamodelExecution.ETreatment#getIdsPrecribedMedication <em>Ids Precribed Medication</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment()
 * @model
 * @generated
 */
public interface ETreatment extends EElement {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment_Prescribedexam()
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment_Prescribedprocedure()
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment_Prescribedinternment()
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment_Prescribedmedication()
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment_IdsPrescribedExamination()
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment_IdsPrescribedProcedure()
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment_IdsPrescribedInternment()
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment_IdsPrecribedMedication()
	 * @model
	 * @generated
	 */
	EList<Integer> getIdsPrecribedMedication();

} // ETreatment
