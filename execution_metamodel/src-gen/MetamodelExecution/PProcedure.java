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
 *   <li>{@link MetamodelExecution.PProcedure#getCodeOrderPrescription <em>Code Order Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.PProcedure#getCodeOrderPrescriptionPlan <em>Code Order Prescription Plan</em>}</li>
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
	 * Returns the value of the '<em><b>Code Order Prescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Order Prescription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Order Prescription</em>' attribute.
	 * @see #setCodeOrderPrescription(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPProcedure_CodeOrderPrescription()
	 * @model
	 * @generated
	 */
	int getCodeOrderPrescription();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PProcedure#getCodeOrderPrescription <em>Code Order Prescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Order Prescription</em>' attribute.
	 * @see #getCodeOrderPrescription()
	 * @generated
	 */
	void setCodeOrderPrescription(int value);

	/**
	 * Returns the value of the '<em><b>Code Order Prescription Plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Order Prescription Plan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Order Prescription Plan</em>' attribute.
	 * @see #setCodeOrderPrescriptionPlan(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPProcedure_CodeOrderPrescriptionPlan()
	 * @model
	 * @generated
	 */
	int getCodeOrderPrescriptionPlan();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PProcedure#getCodeOrderPrescriptionPlan <em>Code Order Prescription Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Order Prescription Plan</em>' attribute.
	 * @see #getCodeOrderPrescriptionPlan()
	 * @generated
	 */
	void setCodeOrderPrescriptionPlan(int value);

} // PProcedure
