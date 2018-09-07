/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Prescribed Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.ProcedurePrescribedResource#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.ProcedurePrescribedResource#getIdProcedure <em>Id Procedure</em>}</li>
 *   <li>{@link MetamodelExecution.ProcedurePrescribedResource#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link MetamodelExecution.ProcedurePrescribedResource#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link MetamodelExecution.ProcedurePrescribedResource#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link MetamodelExecution.ProcedurePrescribedResource#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getProcedurePrescribedResource()
 * @model
 * @generated
 */
public interface ProcedurePrescribedResource extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getProcedurePrescribedResource_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ProcedurePrescribedResource#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Id Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Procedure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Procedure</em>' attribute.
	 * @see #setIdProcedure(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getProcedurePrescribedResource_IdProcedure()
	 * @model
	 * @generated
	 */
	int getIdProcedure();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ProcedurePrescribedResource#getIdProcedure <em>Id Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Procedure</em>' attribute.
	 * @see #getIdProcedure()
	 * @generated
	 */
	void setIdProcedure(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getProcedurePrescribedResource_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ProcedurePrescribedResource#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getProcedurePrescribedResource_Frequency()
	 * @model
	 * @generated
	 */
	int getFrequency();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ProcedurePrescribedResource#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' attribute.
	 * @see #setProcedure(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getProcedurePrescribedResource_Procedure()
	 * @model
	 * @generated
	 */
	String getProcedure();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ProcedurePrescribedResource#getProcedure <em>Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' attribute.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getProcedurePrescribedResource_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ProcedurePrescribedResource#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

} // ProcedurePrescribedResource
