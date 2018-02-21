/**
 */
package MetamodelExecution;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import protocolosv2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.ExecutionStep#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getTypeVerbose <em>Type Verbose</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getUrl <em>Url</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#isIsCurrent <em>Is Current</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#isReworked <em>Reworked</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#isExecuted <em>Executed</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getPrevious <em>Previous</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getNext <em>Next</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getExecutionDate <em>Execution Date</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getCreator <em>Creator</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getExecutor <em>Executor</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getIdStep <em>Id Step</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getIdProtocol <em>Id Protocol</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getIdExecutedProtocol <em>Id Executed Protocol</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getJustify <em>Justify</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionStep#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep()
 * @model abstract="true"
 * @generated
 */
public interface ExecutionStep extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_TypeVerbose()
	 * @model
	 * @generated
	 */
	String getTypeVerbose();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getTypeVerbose <em>Type Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Verbose</em>' attribute.
	 * @see #getTypeVerbose()
	 * @generated
	 */
	void setTypeVerbose(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_IsCurrent()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsCurrent();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#isIsCurrent <em>Is Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Current</em>' attribute.
	 * @see #isIsCurrent()
	 * @generated
	 */
	void setIsCurrent(boolean value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_Reworked()
	 * @model default="false"
	 * @generated
	 */
	boolean isReworked();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#isReworked <em>Reworked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reworked</em>' attribute.
	 * @see #isReworked()
	 * @generated
	 */
	void setReworked(boolean value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_Executed()
	 * @model default="false"
	 * @generated
	 */
	boolean isExecuted();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#isExecuted <em>Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed</em>' attribute.
	 * @see #isExecuted()
	 * @generated
	 */
	void setExecuted(boolean value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' containment reference.
	 * @see #setPrevious(Previous)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_Previous()
	 * @model containment="true"
	 * @generated
	 */
	Previous getPrevious();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getPrevious <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' containment reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Previous value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(Next)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_Next()
	 * @model containment="true"
	 * @generated
	 */
	Next getNext();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Next value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_ChangeDate()
	 * @model
	 * @generated
	 */
	Date getChangeDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getChangeDate <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Date</em>' attribute.
	 * @see #getChangeDate()
	 * @generated
	 */
	void setChangeDate(Date value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_ExecutionDate()
	 * @model
	 * @generated
	 */
	Date getExecutionDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getExecutionDate <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Date</em>' attribute.
	 * @see #getExecutionDate()
	 * @generated
	 */
	void setExecutionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(Creator)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_Creator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Creator getCreator();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(Creator value);

	/**
	 * Returns the value of the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor</em>' containment reference.
	 * @see #setExecutor(Executor)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_Executor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Executor getExecutor();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getExecutor <em>Executor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' containment reference.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(Executor value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_IdStep()
	 * @model
	 * @generated
	 */
	int getIdStep();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getIdStep <em>Id Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Step</em>' attribute.
	 * @see #getIdStep()
	 * @generated
	 */
	void setIdStep(int value);

	/**
	 * Returns the value of the '<em><b>Id Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Protocol</em>' attribute.
	 * @see #setIdProtocol(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_IdProtocol()
	 * @model
	 * @generated
	 */
	int getIdProtocol();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getIdProtocol <em>Id Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Protocol</em>' attribute.
	 * @see #getIdProtocol()
	 * @generated
	 */
	void setIdProtocol(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_IdExecutedProtocol()
	 * @model
	 * @generated
	 */
	int getIdExecutedProtocol();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getIdExecutedProtocol <em>Id Executed Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Executed Protocol</em>' attribute.
	 * @see #getIdExecutedProtocol()
	 * @generated
	 */
	void setIdExecutedProtocol(int value);

	/**
	 * Returns the value of the '<em><b>Justify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justify</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justify</em>' containment reference.
	 * @see #setJustify(Justify)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_Justify()
	 * @model containment="true"
	 * @generated
	 */
	Justify getJustify();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionStep#getJustify <em>Justify</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justify</em>' containment reference.
	 * @see #getJustify()
	 * @generated
	 */
	void setJustify(Justify value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link protocolosv2.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionStep_Step()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getStep();

} // ExecutionStep
