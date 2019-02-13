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
 *   <li>{@link MetamodelExecution.ETreatment#getPexamination <em>Pexamination</em>}</li>
 *   <li>{@link MetamodelExecution.ETreatment#getPprocedure <em>Pprocedure</em>}</li>
 *   <li>{@link MetamodelExecution.ETreatment#getPinternment <em>Pinternment</em>}</li>
 *   <li>{@link MetamodelExecution.ETreatment#getPmedication <em>Pmedication</em>}</li>
 *   <li>{@link MetamodelExecution.ETreatment#getIdsPrescribedExamination <em>Ids Prescribed Examination</em>}</li>
 *   <li>{@link MetamodelExecution.ETreatment#getIdsPrescribedProcedure <em>Ids Prescribed Procedure</em>}</li>
 *   <li>{@link MetamodelExecution.ETreatment#getIdsPrescribedInternment <em>Ids Prescribed Internment</em>}</li>
 *   <li>{@link MetamodelExecution.ETreatment#getIdsPrescribedMedication <em>Ids Prescribed Medication</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment()
 * @model
 * @generated
 */
public interface ETreatment extends EStep {
	/**
	 * Returns the value of the '<em><b>Pexamination</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PExamination}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pexamination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pexamination</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment_Pexamination()
	 * @model containment="true"
	 * @generated
	 */
	EList<PExamination> getPexamination();

	/**
	 * Returns the value of the '<em><b>Pprocedure</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PProcedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pprocedure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pprocedure</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment_Pprocedure()
	 * @model containment="true"
	 * @generated
	 */
	EList<PProcedure> getPprocedure();

	/**
	 * Returns the value of the '<em><b>Pinternment</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PInternment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pinternment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pinternment</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment_Pinternment()
	 * @model containment="true"
	 * @generated
	 */
	EList<PInternment> getPinternment();

	/**
	 * Returns the value of the '<em><b>Pmedication</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PMedication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pmedication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pmedication</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment_Pmedication()
	 * @model containment="true"
	 * @generated
	 */
	EList<PMedication> getPmedication();

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
	 * Returns the value of the '<em><b>Ids Prescribed Medication</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids Prescribed Medication</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids Prescribed Medication</em>' attribute list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getETreatment_IdsPrescribedMedication()
	 * @model
	 * @generated
	 */
	EList<Integer> getIdsPrescribedMedication();

} // ETreatment
