/**
 */
package MetamodelExecution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Treatment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Treatment#getPrescribedexam <em>Prescribedexam</em>}</li>
 *   <li>{@link MetamodelExecution.Treatment#getPrescribedprocedure <em>Prescribedprocedure</em>}</li>
 *   <li>{@link MetamodelExecution.Treatment#getPrescribedinternment <em>Prescribedinternment</em>}</li>
 *   <li>{@link MetamodelExecution.Treatment#getPrescribedmedication <em>Prescribedmedication</em>}</li>
 *   <li>{@link MetamodelExecution.Treatment#getIdPrescribedExam <em>Id Prescribed Exam</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getTreatment()
 * @model
 * @generated
 */
public interface Treatment extends Element {
	/**
	 * Returns the value of the '<em><b>Prescribedexam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescribedexam</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescribedexam</em>' containment reference.
	 * @see #setPrescribedexam(PrescribedExamination)
	 * @see MetamodelExecution.Execution_metamodelPackage#getTreatment_Prescribedexam()
	 * @model containment="true"
	 * @generated
	 */
	PrescribedExamination getPrescribedexam();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Treatment#getPrescribedexam <em>Prescribedexam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescribedexam</em>' containment reference.
	 * @see #getPrescribedexam()
	 * @generated
	 */
	void setPrescribedexam(PrescribedExamination value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getTreatment_Prescribedprocedure()
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getTreatment_Prescribedinternment()
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getTreatment_Prescribedmedication()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrescribedMedication> getPrescribedmedication();

	/**
	 * Returns the value of the '<em><b>Id Prescribed Exam</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Prescribed Exam</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Prescribed Exam</em>' attribute.
	 * @see #setIdPrescribedExam(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getTreatment_IdPrescribedExam()
	 * @model
	 * @generated
	 */
	int getIdPrescribedExam();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Treatment#getIdPrescribedExam <em>Id Prescribed Exam</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Prescribed Exam</em>' attribute.
	 * @see #getIdPrescribedExam()
	 * @generated
	 */
	void setIdPrescribedExam(int value);

} // Treatment
