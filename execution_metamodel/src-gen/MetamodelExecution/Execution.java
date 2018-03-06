/**
 */
package MetamodelExecution;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Execution#getElement <em>Element</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#getUrl <em>Url</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#getConclusionDate <em>Conclusion Date</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#isCompleted <em>Completed</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#isAborted <em>Aborted</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#getLastExecutedStepDate <em>Last Executed Step Date</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#getIdPathway <em>Id Pathway</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#getIdLastProfessional <em>Id Last Professional</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#getIdResponsible <em>Id Responsible</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#getIdsExecutedStep <em>Ids Executed Step</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#getPathway <em>Pathway</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#getLastprofessional <em>Lastprofessional</em>}</li>
 *   <li>{@link MetamodelExecution.Execution#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getExecution()
 * @model
 * @generated
 */
public interface Execution extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Execution#getId <em>Id</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Execution#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Execution#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Conclusion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conclusion Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conclusion Date</em>' attribute.
	 * @see #setConclusionDate(Date)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_ConclusionDate()
	 * @model
	 * @generated
	 */
	Date getConclusionDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Execution#getConclusionDate <em>Conclusion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conclusion Date</em>' attribute.
	 * @see #getConclusionDate()
	 * @generated
	 */
	void setConclusionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Completed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed</em>' attribute.
	 * @see #setCompleted(boolean)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_Completed()
	 * @model default="false"
	 * @generated
	 */
	boolean isCompleted();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Execution#isCompleted <em>Completed</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_Aborted()
	 * @model
	 * @generated
	 */
	boolean isAborted();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Execution#isAborted <em>Aborted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aborted</em>' attribute.
	 * @see #isAborted()
	 * @generated
	 */
	void setAborted(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Executed Step Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Executed Step Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Executed Step Date</em>' attribute.
	 * @see #setLastExecutedStepDate(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_LastExecutedStepDate()
	 * @model
	 * @generated
	 */
	String getLastExecutedStepDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Execution#getLastExecutedStepDate <em>Last Executed Step Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Executed Step Date</em>' attribute.
	 * @see #getLastExecutedStepDate()
	 * @generated
	 */
	void setLastExecutedStepDate(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_IdPathway()
	 * @model
	 * @generated
	 */
	int getIdPathway();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Execution#getIdPathway <em>Id Pathway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Pathway</em>' attribute.
	 * @see #getIdPathway()
	 * @generated
	 */
	void setIdPathway(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_IdLastProfessional()
	 * @model
	 * @generated
	 */
	int getIdLastProfessional();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Execution#getIdLastProfessional <em>Id Last Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Last Professional</em>' attribute.
	 * @see #getIdLastProfessional()
	 * @generated
	 */
	void setIdLastProfessional(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_IdResponsible()
	 * @model
	 * @generated
	 */
	int getIdResponsible();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Execution#getIdResponsible <em>Id Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Responsible</em>' attribute.
	 * @see #getIdResponsible()
	 * @generated
	 */
	void setIdResponsible(int value);

	/**
	 * Returns the value of the '<em><b>Ids Executed Step</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids Executed Step</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids Executed Step</em>' attribute list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_IdsExecutedStep()
	 * @model
	 * @generated
	 */
	EList<Integer> getIdsExecutedStep();

	/**
	 * Returns the value of the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pathway</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathway</em>' containment reference.
	 * @see #setPathway(Pathway)
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_Pathway()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pathway getPathway();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Execution#getPathway <em>Pathway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pathway</em>' containment reference.
	 * @see #getPathway()
	 * @generated
	 */
	void setPathway(Pathway value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_Responsible()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Responsible getResponsible();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Execution#getResponsible <em>Responsible</em>}' containment reference.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_Lastprofessional()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LastProfessional getLastprofessional();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Execution#getLastprofessional <em>Lastprofessional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastprofessional</em>' containment reference.
	 * @see #getLastprofessional()
	 * @generated
	 */
	void setLastprofessional(LastProfessional value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecution_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Execution#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Execution
