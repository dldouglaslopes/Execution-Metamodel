/**
 */
package MetamodelExecution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executed Auxiliary Conduct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.ExecutedAuxiliaryConduct#getAnswer <em>Answer</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedAuxiliaryConduct()
 * @model
 * @generated
 */
public interface ExecutedAuxiliaryConduct extends ExecutedElement {
	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.Answer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getExecutedAuxiliaryConduct_Answer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Answer> getAnswer();

} // ExecutedAuxiliaryConduct
