/**
 */
package MetamodelExecution;

import org.eclipse.emf.common.util.EList;

import protocolosv2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complete Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.CompleteStep#getStep <em>Step</em>}</li>
 *   <li>{@link MetamodelExecution.CompleteStep#getExecutor <em>Executor</em>}</li>
 *   <li>{@link MetamodelExecution.CompleteStep#getCreator <em>Creator</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getCompleteStep()
 * @model abstract="true"
 * @generated
 */
public interface CompleteStep extends Step {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getCompleteStep_Step()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getStep();

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getCompleteStep_Executor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Executor getExecutor();

	/**
	 * Sets the value of the '{@link MetamodelExecution.CompleteStep#getExecutor <em>Executor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' containment reference.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(Executor value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getCompleteStep_Creator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Creator getCreator();

	/**
	 * Sets the value of the '{@link MetamodelExecution.CompleteStep#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(Creator value);

} // CompleteStep
