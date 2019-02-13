/**
 */
package MetamodelExecution;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPathway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.EPathway#getEStep <em>EStep</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#getConclusionDate <em>Conclusion Date</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#isCompleted <em>Completed</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#isAborted <em>Aborted</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#getIdsExecutedStep <em>Ids Executed Step</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#getLastprofessional <em>Lastprofessional</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#getPathway <em>Pathway</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#getComplementaryconducts <em>Complementaryconducts</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#getMedicalcare <em>Medicalcare</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#getCid <em>Cid</em>}</li>
 *   <li>{@link MetamodelExecution.EPathway#getTimeExecution <em>Time Execution</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway()
 * @model
 * @generated
 */
public interface EPathway extends EObject {
	/**
	 * Returns the value of the '<em><b>EStep</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.EStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EStep</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EStep</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_EStep()
	 * @model containment="true"
	 * @generated
	 */
	EList<EStep> getEStep();

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPathway#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPathway#getCreationDate <em>Creation Date</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_ConclusionDate()
	 * @model
	 * @generated
	 */
	Date getConclusionDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPathway#getConclusionDate <em>Conclusion Date</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_Completed()
	 * @model default="false"
	 * @generated
	 */
	boolean isCompleted();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPathway#isCompleted <em>Completed</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_Aborted()
	 * @model
	 * @generated
	 */
	boolean isAborted();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPathway#isAborted <em>Aborted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aborted</em>' attribute.
	 * @see #isAborted()
	 * @generated
	 */
	void setAborted(boolean value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_IdsExecutedStep()
	 * @model
	 * @generated
	 */
	EList<Integer> getIdsExecutedStep();

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_Responsible()
	 * @model containment="true"
	 * @generated
	 */
	Responsible getResponsible();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPathway#getResponsible <em>Responsible</em>}' containment reference.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_Lastprofessional()
	 * @model containment="true"
	 * @generated
	 */
	LastProfessional getLastprofessional();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPathway#getLastprofessional <em>Lastprofessional</em>}' containment reference.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPathway#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_Justification()
	 * @model containment="true"
	 * @generated
	 */
	Justification getJustification();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPathway#getJustification <em>Justification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' containment reference.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(Justification value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_Pathway()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pathway getPathway();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPathway#getPathway <em>Pathway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pathway</em>' containment reference.
	 * @see #getPathway()
	 * @generated
	 */
	void setPathway(Pathway value);

	/**
	 * Returns the value of the '<em><b>Complementaryconducts</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.ComplementaryConducts}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complementaryconducts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complementaryconducts</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_Complementaryconducts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplementaryConducts> getComplementaryconducts();

	/**
	 * Returns the value of the '<em><b>Medicalcare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicalcare</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicalcare</em>' containment reference.
	 * @see #setMedicalcare(MedicalCare)
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_Medicalcare()
	 * @model containment="true"
	 * @generated
	 */
	MedicalCare getMedicalcare();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPathway#getMedicalcare <em>Medicalcare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicalcare</em>' containment reference.
	 * @see #getMedicalcare()
	 * @generated
	 */
	void setMedicalcare(MedicalCare value);

	/**
	 * Returns the value of the '<em><b>Cid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cid</em>' attribute.
	 * @see #setCid(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_Cid()
	 * @model
	 * @generated
	 */
	String getCid();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPathway#getCid <em>Cid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cid</em>' attribute.
	 * @see #getCid()
	 * @generated
	 */
	void setCid(String value);

	/**
	 * Returns the value of the '<em><b>Time Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Execution</em>' attribute.
	 * @see #setTimeExecution(double)
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPathway_TimeExecution()
	 * @model
	 * @generated
	 */
	double getTimeExecution();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPathway#getTimeExecution <em>Time Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Execution</em>' attribute.
	 * @see #getTimeExecution()
	 * @generated
	 */
	void setTimeExecution(double value);

} // EPathway
