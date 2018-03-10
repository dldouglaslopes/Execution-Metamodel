/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prescribed Examination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.PrescribedExamination#getExamination <em>Examination</em>}</li>
 *   <li>{@link MetamodelExecution.PrescribedExamination#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.PrescribedExamination#getReport <em>Report</em>}</li>
 *   <li>{@link MetamodelExecution.PrescribedExamination#getNumberGuide <em>Number Guide</em>}</li>
 *   <li>{@link MetamodelExecution.PrescribedExamination#getComplement <em>Complement</em>}</li>
 *   <li>{@link MetamodelExecution.PrescribedExamination#getResult <em>Result</em>}</li>
 *   <li>{@link MetamodelExecution.PrescribedExamination#getPrescriptionexam <em>Prescriptionexam</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedExamination()
 * @model
 * @generated
 */
public interface PrescribedExamination extends EObject {
	/**
	 * Returns the value of the '<em><b>Examination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examination</em>' containment reference.
	 * @see #setExamination(Examination)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedExamination_Examination()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Examination getExamination();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PrescribedExamination#getExamination <em>Examination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Examination</em>' containment reference.
	 * @see #getExamination()
	 * @generated
	 */
	void setExamination(Examination value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedExamination_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PrescribedExamination#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report</em>' attribute.
	 * @see #setReport(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedExamination_Report()
	 * @model
	 * @generated
	 */
	String getReport();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PrescribedExamination#getReport <em>Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report</em>' attribute.
	 * @see #getReport()
	 * @generated
	 */
	void setReport(String value);

	/**
	 * Returns the value of the '<em><b>Number Guide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Guide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Guide</em>' attribute.
	 * @see #setNumberGuide(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedExamination_NumberGuide()
	 * @model
	 * @generated
	 */
	int getNumberGuide();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PrescribedExamination#getNumberGuide <em>Number Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Guide</em>' attribute.
	 * @see #getNumberGuide()
	 * @generated
	 */
	void setNumberGuide(int value);

	/**
	 * Returns the value of the '<em><b>Complement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement</em>' containment reference.
	 * @see #setComplement(Complement)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedExamination_Complement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Complement getComplement();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PrescribedExamination#getComplement <em>Complement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement</em>' containment reference.
	 * @see #getComplement()
	 * @generated
	 */
	void setComplement(Complement value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedExamination_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Result getResult();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PrescribedExamination#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Result value);

	/**
	 * Returns the value of the '<em><b>Prescriptionexam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptionexam</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptionexam</em>' containment reference.
	 * @see #setPrescriptionexam(PrescriptionExam)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedExamination_Prescriptionexam()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrescriptionExam getPrescriptionexam();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PrescribedExamination#getPrescriptionexam <em>Prescriptionexam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriptionexam</em>' containment reference.
	 * @see #getPrescriptionexam()
	 * @generated
	 */
	void setPrescriptionexam(PrescriptionExam value);

} // PrescribedExamination
