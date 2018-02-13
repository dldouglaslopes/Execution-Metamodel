/**
 */
package MetamodelExecution;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link MetamodelExecution.PrescribedExamination#getResult <em>Result</em>}</li>
 *   <li>{@link MetamodelExecution.PrescribedExamination#getReport <em>Report</em>}</li>
 *   <li>{@link MetamodelExecution.PrescribedExamination#getNumberGuide <em>Number Guide</em>}</li>
 *   <li>{@link MetamodelExecution.PrescribedExamination#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.PrescribedExamination#getComplement <em>Complement</em>}</li>
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
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedExamination_Result()
	 * @model
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PrescribedExamination#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

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
	 * Returns the value of the '<em><b>Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescription</em>' containment reference.
	 * @see #setPrescription(ExaminationPrescription)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedExamination_Prescription()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExaminationPrescription getPrescription();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PrescribedExamination#getPrescription <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription</em>' containment reference.
	 * @see #getPrescription()
	 * @generated
	 */
	void setPrescription(ExaminationPrescription value);

	/**
	 * Returns the value of the '<em><b>Complement</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.Complement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedExamination_Complement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Complement> getComplement();

} // PrescribedExamination
