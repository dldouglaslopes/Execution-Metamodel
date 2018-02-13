/**
 */
package MetamodelExecution;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Element#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getTypeVerbose <em>Type Verbose</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getUrl <em>Url</em>}</li>
 *   <li>{@link MetamodelExecution.Element#isIsCurrent <em>Is Current</em>}</li>
 *   <li>{@link MetamodelExecution.Element#isReworked <em>Reworked</em>}</li>
 *   <li>{@link MetamodelExecution.Element#isExecuted <em>Executed</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getPrevious <em>Previous</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getNext <em>Next</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getExecutionDate <em>Execution Date</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getJustify <em>Justify</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getCreatedById <em>Created By Id</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getExecutedById <em>Executed By Id</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getCreatedby <em>Createdby</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getExecutedby <em>Executedby</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getStep <em>Step</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getIdStep <em>Id Step</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getIdProtocol <em>Id Protocol</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getIdExecutedProtocol <em>Id Executed Protocol</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getId <em>Id</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getType <em>Type</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_TypeVerbose()
	 * @model
	 * @generated
	 */
	String getTypeVerbose();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getTypeVerbose <em>Type Verbose</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getUrl <em>Url</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_IsCurrent()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsCurrent();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#isIsCurrent <em>Is Current</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_Reworked()
	 * @model default="false"
	 * @generated
	 */
	boolean isReworked();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#isReworked <em>Reworked</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_Executed()
	 * @model default="false"
	 * @generated
	 */
	boolean isExecuted();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#isExecuted <em>Executed</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_Previous()
	 * @model containment="true"
	 * @generated
	 */
	Previous getPrevious();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getPrevious <em>Previous</em>}' containment reference.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_Next()
	 * @model containment="true"
	 * @generated
	 */
	Next getNext();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getNext <em>Next</em>}' containment reference.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getCreationDate <em>Creation Date</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_ChangeDate()
	 * @model
	 * @generated
	 */
	Date getChangeDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getChangeDate <em>Change Date</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_ExecutionDate()
	 * @model
	 * @generated
	 */
	Date getExecutionDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getExecutionDate <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Date</em>' attribute.
	 * @see #getExecutionDate()
	 * @generated
	 */
	void setExecutionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Justify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justify</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justify</em>' attribute.
	 * @see #setJustify(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_Justify()
	 * @model
	 * @generated
	 */
	String getJustify();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getJustify <em>Justify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justify</em>' attribute.
	 * @see #getJustify()
	 * @generated
	 */
	void setJustify(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_CreatedById()
	 * @model
	 * @generated
	 */
	int getCreatedById();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getCreatedById <em>Created By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By Id</em>' attribute.
	 * @see #getCreatedById()
	 * @generated
	 */
	void setCreatedById(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_ExecutedById()
	 * @model
	 * @generated
	 */
	int getExecutedById();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getExecutedById <em>Executed By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed By Id</em>' attribute.
	 * @see #getExecutedById()
	 * @generated
	 */
	void setExecutedById(int value);

	/**
	 * Returns the value of the '<em><b>Createdby</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Createdby</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Createdby</em>' containment reference.
	 * @see #setCreatedby(CreatedBy)
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_Createdby()
	 * @model containment="true"
	 * @generated
	 */
	CreatedBy getCreatedby();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getCreatedby <em>Createdby</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Createdby</em>' containment reference.
	 * @see #getCreatedby()
	 * @generated
	 */
	void setCreatedby(CreatedBy value);

	/**
	 * Returns the value of the '<em><b>Executedby</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executedby</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executedby</em>' containment reference.
	 * @see #setExecutedby(ExecutedBy)
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_Executedby()
	 * @model containment="true"
	 * @generated
	 */
	ExecutedBy getExecutedby();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getExecutedby <em>Executedby</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executedby</em>' containment reference.
	 * @see #getExecutedby()
	 * @generated
	 */
	void setExecutedby(ExecutedBy value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference.
	 * @see #setStep(Step)
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_Step()
	 * @model containment="true"
	 * @generated
	 */
	Step getStep();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getStep <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' containment reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Step value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_IdStep()
	 * @model
	 * @generated
	 */
	int getIdStep();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getIdStep <em>Id Step</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_IdProtocol()
	 * @model
	 * @generated
	 */
	int getIdProtocol();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getIdProtocol <em>Id Protocol</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_IdExecutedProtocol()
	 * @model
	 * @generated
	 */
	int getIdExecutedProtocol();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getIdExecutedProtocol <em>Id Executed Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Executed Protocol</em>' attribute.
	 * @see #getIdExecutedProtocol()
	 * @generated
	 */
	void setIdExecutedProtocol(int value);

} // Element
