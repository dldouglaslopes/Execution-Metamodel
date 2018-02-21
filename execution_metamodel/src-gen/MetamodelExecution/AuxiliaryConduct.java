/**
 */
package MetamodelExecution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auxiliary Conduct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.AuxiliaryConduct#getAnswers <em>Answers</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getAuxiliaryConduct()
 * @model
 * @generated
 */
public interface AuxiliaryConduct extends ExecutionStep {
	/**
	 * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.Answer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getAuxiliaryConduct_Answers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Answer> getAnswers();

} // AuxiliaryConduct
