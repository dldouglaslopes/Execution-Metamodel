/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PProcedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.PProcedure#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.PProcedure#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link MetamodelExecution.PProcedure#getResult <em>Result</em>}</li>
 *   <li>{@link MetamodelExecution.PProcedure#getPrescriptionResult <em>Prescription Result</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getPProcedure()
 * @model
 * @generated
 */
public interface PProcedure extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPProcedure_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PProcedure#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(Procedure)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPProcedure_Procedure()
	 * @model containment="true"
	 * @generated
	 */
	Procedure getProcedure();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PProcedure#getProcedure <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' containment reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(Procedure value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Result)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPProcedure_Result()
	 * @model containment="true"
	 * @generated
	 */
	Result getResult();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PProcedure#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Result value);

	/**
	 * Returns the value of the '<em><b>Prescription Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescription Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescription Result</em>' containment reference.
	 * @see #setPrescriptionResult(PrescriptionResult)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPProcedure_PrescriptionResult()
	 * @model containment="true"
	 * @generated
	 */
	PrescriptionResult getPrescriptionResult();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PProcedure#getPrescriptionResult <em>Prescription Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription Result</em>' containment reference.
	 * @see #getPrescriptionResult()
	 * @generated
	 */
	void setPrescriptionResult(PrescriptionResult value);

} // PProcedure
