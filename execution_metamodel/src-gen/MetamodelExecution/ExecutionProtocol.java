/**
 */
package MetamodelExecution;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#getUrl <em>Url</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#getCreation <em>Creation</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#isCompleted <em>Completed</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#isAborted <em>Aborted</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#getJustify <em>Justify</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#getLastExecutedStepDate <em>Last Executed Step Date</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#getIdProtocol <em>Id Protocol</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#getIdResponsible <em>Id Responsible</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#getIdLastProfessional <em>Id Last Professional</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#getLastprofessional <em>Lastprofessional</em>}</li>
 *   <li>{@link MetamodelExecution.ExecutionProtocol#getExecutedstep <em>Executedstep</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol()
 * @model abstract="true"
 * @generated
 */
public interface ExecutionProtocol extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation</em>' attribute.
	 * @see #setCreation(Date)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_Creation()
	 * @model
	 * @generated
	 */
	Date getCreation();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#getCreation <em>Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation</em>' attribute.
	 * @see #getCreation()
	 * @generated
	 */
	void setCreation(Date value);

	/**
	 * Returns the value of the '<em><b>Conclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conclusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conclusion</em>' attribute.
	 * @see #setConclusion(Date)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_Conclusion()
	 * @model
	 * @generated
	 */
	Date getConclusion();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#getConclusion <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conclusion</em>' attribute.
	 * @see #getConclusion()
	 * @generated
	 */
	void setConclusion(Date value);

	/**
	 * Returns the value of the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed</em>' attribute.
	 * @see #setCompleted(boolean)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_Completed()
	 * @model
	 * @generated
	 */
	boolean isCompleted();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#isCompleted <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed</em>' attribute.
	 * @see #isCompleted()
	 * @generated
	 */
	void setCompleted(boolean value);

	/**
	 * Returns the value of the '<em><b>Aborted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aborted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aborted</em>' attribute.
	 * @see #setAborted(boolean)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_Aborted()
	 * @model
	 * @generated
	 */
	boolean isAborted();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#isAborted <em>Aborted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aborted</em>' attribute.
	 * @see #isAborted()
	 * @generated
	 */
	void setAborted(boolean value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_Justify()
	 * @model containment="true"
	 * @generated
	 */
	Justify getJustify();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#getJustify <em>Justify</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justify</em>' containment reference.
	 * @see #getJustify()
	 * @generated
	 */
	void setJustify(Justify value);

	/**
	 * Returns the value of the '<em><b>Last Executed Step Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Executed Step Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Executed Step Date</em>' attribute.
	 * @see #setLastExecutedStepDate(Date)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_LastExecutedStepDate()
	 * @model
	 * @generated
	 */
	Date getLastExecutedStepDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#getLastExecutedStepDate <em>Last Executed Step Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Executed Step Date</em>' attribute.
	 * @see #getLastExecutedStepDate()
	 * @generated
	 */
	void setLastExecutedStepDate(Date value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_IdProtocol()
	 * @model
	 * @generated
	 */
	int getIdProtocol();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#getIdProtocol <em>Id Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Protocol</em>' attribute.
	 * @see #getIdProtocol()
	 * @generated
	 */
	void setIdProtocol(int value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(Protocol)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_Protocol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

	/**
	 * Returns the value of the '<em><b>Id Responsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Responsible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Responsible</em>' attribute.
	 * @see #setIdResponsible(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_IdResponsible()
	 * @model
	 * @generated
	 */
	int getIdResponsible();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#getIdResponsible <em>Id Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Responsible</em>' attribute.
	 * @see #getIdResponsible()
	 * @generated
	 */
	void setIdResponsible(int value);

	/**
	 * Returns the value of the '<em><b>Id Last Professional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Last Professional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Last Professional</em>' attribute.
	 * @see #setIdLastProfessional(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_IdLastProfessional()
	 * @model
	 * @generated
	 */
	int getIdLastProfessional();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#getIdLastProfessional <em>Id Last Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Last Professional</em>' attribute.
	 * @see #getIdLastProfessional()
	 * @generated
	 */
	void setIdLastProfessional(int value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' containment reference.
	 * @see #setResponsible(Responsible)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_Responsible()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Responsible getResponsible();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#getResponsible <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' containment reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Responsible value);

	/**
	 * Returns the value of the '<em><b>Lastprofessional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastprofessional</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastprofessional</em>' containment reference.
	 * @see #setLastprofessional(LastProfessional)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_Lastprofessional()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LastProfessional getLastprofessional();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#getLastprofessional <em>Lastprofessional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastprofessional</em>' containment reference.
	 * @see #getLastprofessional()
	 * @generated
	 */
	void setLastprofessional(LastProfessional value);

	/**
	 * Returns the value of the '<em><b>Executedstep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executedstep</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executedstep</em>' containment reference.
	 * @see #setExecutedstep(ExecutedStep)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutionProtocol_Executedstep()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExecutedStep getExecutedstep();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ExecutionProtocol#getExecutedstep <em>Executedstep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executedstep</em>' containment reference.
	 * @see #getExecutedstep()
	 * @generated
	 */
	void setExecutedstep(ExecutedStep value);

} // ExecutionProtocol
