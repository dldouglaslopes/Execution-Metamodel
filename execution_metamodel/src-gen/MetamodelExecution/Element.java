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
 *   <li>{@link MetamodelExecution.Element#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getExecutionDate <em>Execution Date</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getCreatedById <em>Created By Id</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getExecutedById <em>Executed By Id</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getIdStep <em>Id Step</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getIdPathway <em>Id Pathway</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getIdExecutedPathway <em>Id Executed Pathway</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getStep <em>Step</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getCreator <em>Creator</em>}</li>
 *   <li>{@link MetamodelExecution.Element#getExecutor <em>Executor</em>}</li>
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
	 * Returns the value of the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Date</em>' attribute.
	 * @see #setModificationDate(Date)
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_ModificationDate()
	 * @model
	 * @generated
	 */
	Date getModificationDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getModificationDate <em>Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Date</em>' attribute.
	 * @see #getModificationDate()
	 * @generated
	 */
	void setModificationDate(Date value);

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
	 * Returns the value of the '<em><b>Id Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Pathway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Pathway</em>' attribute.
	 * @see #setIdPathway(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_IdPathway()
	 * @model
	 * @generated
	 */
	int getIdPathway();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getIdPathway <em>Id Pathway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Pathway</em>' attribute.
	 * @see #getIdPathway()
	 * @generated
	 */
	void setIdPathway(int value);

	/**
	 * Returns the value of the '<em><b>Id Executed Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Executed Pathway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Executed Pathway</em>' attribute.
	 * @see #setIdExecutedPathway(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_IdExecutedPathway()
	 * @model
	 * @generated
	 */
	int getIdExecutedPathway();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getIdExecutedPathway <em>Id Executed Pathway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Executed Pathway</em>' attribute.
	 * @see #getIdExecutedPathway()
	 * @generated
	 */
	void setIdExecutedPathway(int value);

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justification</em>' containment reference.
	 * @see #setJustification(Justification)
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_Justification()
	 * @model containment="true"
	 * @generated
	 */
	Justification getJustification();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getJustification <em>Justification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' containment reference.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(Justification value);

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
	 * @model containment="true" required="true"
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
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(Creator)
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_Creator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Creator getCreator();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getCreator <em>Creator</em>}' containment reference.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getElement_Executor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Executor getExecutor();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Element#getExecutor <em>Executor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' containment reference.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(Executor value);

} // Element
