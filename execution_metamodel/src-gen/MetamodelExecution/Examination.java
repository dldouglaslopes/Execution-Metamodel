/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Examination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Examination#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Examination#getIdExamination <em>Id Examination</em>}</li>
 *   <li>{@link MetamodelExecution.Examination#getSideLimb <em>Side Limb</em>}</li>
 *   <li>{@link MetamodelExecution.Examination#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link MetamodelExecution.Examination#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.Examination#getClinicalIndication <em>Clinical Indication</em>}</li>
 *   <li>{@link MetamodelExecution.Examination#getSideLimbDisplay <em>Side Limb Display</em>}</li>
 *   <li>{@link MetamodelExecution.Examination#getExam <em>Exam</em>}</li>
 *   <li>{@link MetamodelExecution.Examination#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getExamination()
 * @model
 * @generated
 */
public interface Examination extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExamination_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Examination#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Id Examination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Examination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Examination</em>' attribute.
	 * @see #setIdExamination(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExamination_IdExamination()
	 * @model
	 * @generated
	 */
	int getIdExamination();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Examination#getIdExamination <em>Id Examination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Examination</em>' attribute.
	 * @see #getIdExamination()
	 * @generated
	 */
	void setIdExamination(int value);

	/**
	 * Returns the value of the '<em><b>Side Limb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Limb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Limb</em>' attribute.
	 * @see #setSideLimb(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExamination_SideLimb()
	 * @model
	 * @generated
	 */
	String getSideLimb();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Examination#getSideLimb <em>Side Limb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Limb</em>' attribute.
	 * @see #getSideLimb()
	 * @generated
	 */
	void setSideLimb(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExamination_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Examination#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justification</em>' attribute.
	 * @see #setJustification(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExamination_Justification()
	 * @model
	 * @generated
	 */
	String getJustification();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Examination#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(String value);

	/**
	 * Returns the value of the '<em><b>Clinical Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clinical Indication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical Indication</em>' attribute.
	 * @see #setClinicalIndication(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExamination_ClinicalIndication()
	 * @model
	 * @generated
	 */
	String getClinicalIndication();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Examination#getClinicalIndication <em>Clinical Indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Indication</em>' attribute.
	 * @see #getClinicalIndication()
	 * @generated
	 */
	void setClinicalIndication(String value);

	/**
	 * Returns the value of the '<em><b>Side Limb Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Limb Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Limb Display</em>' attribute.
	 * @see #setSideLimbDisplay(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExamination_SideLimbDisplay()
	 * @model
	 * @generated
	 */
	String getSideLimbDisplay();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Examination#getSideLimbDisplay <em>Side Limb Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Limb Display</em>' attribute.
	 * @see #getSideLimbDisplay()
	 * @generated
	 */
	void setSideLimbDisplay(String value);

	/**
	 * Returns the value of the '<em><b>Exam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exam</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam</em>' containment reference.
	 * @see #setExam(Exam)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExamination_Exam()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Exam getExam();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Examination#getExam <em>Exam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exam</em>' containment reference.
	 * @see #getExam()
	 * @generated
	 */
	void setExam(Exam value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExamination_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Examination#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Examination
