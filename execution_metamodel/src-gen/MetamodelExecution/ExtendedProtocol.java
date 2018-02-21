/**
 */
package MetamodelExecution;

import org.eclipse.emf.common.util.EList;

import protocolosv2.Protocol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.ExtendedProtocol#getExecutionprotocol <em>Executionprotocol</em>}</li>
 *   <li>{@link MetamodelExecution.ExtendedProtocol#getExecutionstep <em>Executionstep</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getExtendedProtocol()
 * @model
 * @generated
 */
public interface ExtendedProtocol extends Protocol {
	/**
	 * Returns the value of the '<em><b>Executionprotocol</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.ExecutionProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executionprotocol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executionprotocol</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getExtendedProtocol_Executionprotocol()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionProtocol> getExecutionprotocol();

	/**
	 * Returns the value of the '<em><b>Executionstep</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.ExecutionStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executionstep</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executionstep</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getExtendedProtocol_Executionstep()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionStep> getExecutionstep();

} // ExtendedProtocol
