/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pathway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Pathway#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Pathway#getCode <em>Code</em>}</li>
 *   <li>{@link MetamodelExecution.Pathway#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.Pathway#getVersion <em>Version</em>}</li>
 *   <li>{@link MetamodelExecution.Pathway#isCompleted <em>Completed</em>}</li>
 *   <li>{@link MetamodelExecution.Pathway#getAudit <em>Audit</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getPathway()
 * @model
 * @generated
 */
public interface Pathway extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPathway_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Pathway#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPathway_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Pathway#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPathway_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Pathway#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPathway_Version()
	 * @model
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Pathway#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPathway_Completed()
	 * @model
	 * @generated
	 */
	boolean isCompleted();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Pathway#isCompleted <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed</em>' attribute.
	 * @see #isCompleted()
	 * @generated
	 */
	void setCompleted(boolean value);

	/**
	 * Returns the value of the '<em><b>Audit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audit</em>' containment reference.
	 * @see #setAudit(Audit)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPathway_Audit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Audit getAudit();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Pathway#getAudit <em>Audit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit</em>' containment reference.
	 * @see #getAudit()
	 * @generated
	 */
	void setAudit(Audit value);

} // Pathway
