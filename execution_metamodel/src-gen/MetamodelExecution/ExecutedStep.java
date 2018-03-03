/**
 */
package MetamodelExecution;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executed Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.ExecutedStep#getCreatedById <em>Created By Id</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#getExecutedById <em>Executed By Id</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#getExecutedBy <em>Executed By</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#getStep <em>Step</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#isExecuted <em>Executed</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#getIdStep <em>Id Step</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#isReworked <em>Reworked</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#getTypeVerbose <em>Type Verbose</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#isIsCurrent <em>Is Current</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#getIdPathway <em>Id Pathway</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#getExecutionDate <em>Execution Date</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#getIdExecutedProtocol <em>Id Executed Protocol</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutedStep#getChangeDate <em>Change Date</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep()
 * @model
 * @generated
 */
public interface ExecutedStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By Id</em>' attribute.
	 * @see #setCreatedById(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_CreatedById()
	 * @model
	 * @generated
	 */
	int getCreatedById();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#getCreatedById <em>Created By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By Id</em>' attribute.
	 * @see #getCreatedById()
	 * @generated
	 */
	void setCreatedById(int value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' attribute.
	 * @see #setCreatedBy(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_CreatedBy()
	 * @model
	 * @generated
	 */
	String getCreatedBy();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#getCreatedBy <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' attribute.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(String value);

	/**
	 * Returns the value of the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed By Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed By Id</em>' attribute.
	 * @see #setExecutedById(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_ExecutedById()
	 * @model
	 * @generated
	 */
	int getExecutedById();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#getExecutedById <em>Executed By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed By Id</em>' attribute.
	 * @see #getExecutedById()
	 * @generated
	 */
	void setExecutedById(int value);

	/**
	 * Returns the value of the '<em><b>Executed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed By</em>' attribute.
	 * @see #setExecutedBy(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_ExecutedBy()
	 * @model
	 * @generated
	 */
	String getExecutedBy();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#getExecutedBy <em>Executed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed By</em>' attribute.
	 * @see #getExecutedBy()
	 * @generated
	 */
	void setExecutedBy(String value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_Step()
	 * @model
	 * @generated
	 */
	String getStep();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(String value);

	/**
	 * Returns the value of the '<em><b>Executed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed</em>' attribute.
	 * @see #setExecuted(boolean)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_Executed()
	 * @model default="false"
	 * @generated
	 */
	boolean isExecuted();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#isExecuted <em>Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed</em>' attribute.
	 * @see #isExecuted()
	 * @generated
	 */
	void setExecuted(boolean value);

	/**
	 * Returns the value of the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Step</em>' attribute.
	 * @see #setIdStep(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_IdStep()
	 * @model
	 * @generated
	 */
	int getIdStep();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#getIdStep <em>Id Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Step</em>' attribute.
	 * @see #getIdStep()
	 * @generated
	 */
	void setIdStep(int value);

	/**
	 * Returns the value of the '<em><b>Reworked</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reworked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reworked</em>' attribute.
	 * @see #setReworked(boolean)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_Reworked()
	 * @model default="false"
	 * @generated
	 */
	boolean isReworked();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#isReworked <em>Reworked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reworked</em>' attribute.
	 * @see #isReworked()
	 * @generated
	 */
	void setReworked(boolean value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Verbose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Verbose</em>' attribute.
	 * @see #setTypeVerbose(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_TypeVerbose()
	 * @model
	 * @generated
	 */
	String getTypeVerbose();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#getTypeVerbose <em>Type Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Verbose</em>' attribute.
	 * @see #getTypeVerbose()
	 * @generated
	 */
	void setTypeVerbose(String value);

	/**
	 * Returns the value of the '<em><b>Is Current</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Current</em>' attribute.
	 * @see #setIsCurrent(boolean)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_IsCurrent()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsCurrent();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#isIsCurrent <em>Is Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Current</em>' attribute.
	 * @see #isIsCurrent()
	 * @generated
	 */
	void setIsCurrent(boolean value);

	/**
	 * Returns the value of the '<em><b>Id Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Pathway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Pathway</em>' attribute.
	 * @see #setIdPathway(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_IdPathway()
	 * @model
	 * @generated
	 */
	int getIdPathway();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#getIdPathway <em>Id Pathway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Pathway</em>' attribute.
	 * @see #getIdPathway()
	 * @generated
	 */
	void setIdPathway(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Date</em>' attribute.
	 * @see #setExecutionDate(Date)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_ExecutionDate()
	 * @model
	 * @generated
	 */
	Date getExecutionDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#getExecutionDate <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Date</em>' attribute.
	 * @see #getExecutionDate()
	 * @generated
	 */
	void setExecutionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Id Executed Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Executed Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Executed Protocol</em>' attribute.
	 * @see #setIdExecutedProtocol(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_IdExecutedProtocol()
	 * @model
	 * @generated
	 */
	int getIdExecutedProtocol();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#getIdExecutedProtocol <em>Id Executed Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Executed Protocol</em>' attribute.
	 * @see #getIdExecutedProtocol()
	 * @generated
	 */
	void setIdExecutedProtocol(int value);

	/**
	 * Returns the value of the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Date</em>' attribute.
	 * @see #setChangeDate(Date)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedStep_ChangeDate()
	 * @model
	 * @generated
	 */
	Date getChangeDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutedStep#getChangeDate <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Date</em>' attribute.
	 * @see #getChangeDate()
	 * @generated
	 */
	void setChangeDate(Date value);

} // ExecutedStep
