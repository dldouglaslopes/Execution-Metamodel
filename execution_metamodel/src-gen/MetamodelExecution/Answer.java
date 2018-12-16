/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Answer#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Answer#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.Answer#getQuestion <em>Question</em>}</li>
 *   <li>{@link MetamodelExecution.Answer#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.Answer#getUnitvalue <em>Unitvalue</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getAnswer()
 * @model
 * @generated
 */
public interface Answer extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getAnswer_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Answer#getId <em>Id</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getAnswer_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Answer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference.
	 * @see #setQuestion(Question)
	 * @see MetamodelExecution.Execution_metamodelPackage#getAnswer_Question()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Question getQuestion();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Answer#getQuestion <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' containment reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(Question value);

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justification</em>' attribute.
	 * @see #setJustification(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getAnswer_Justification()
	 * @model
	 * @generated
	 */
	String getJustification();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Answer#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(String value);

	/**
	 * Returns the value of the '<em><b>Unitvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unitvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitvalue</em>' containment reference.
	 * @see #setUnitvalue(UnitValue)
	 * @see MetamodelExecution.Execution_metamodelPackage#getAnswer_Unitvalue()
	 * @model containment="true"
	 * @generated
	 */
	UnitValue getUnitvalue();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Answer#getUnitvalue <em>Unitvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unitvalue</em>' containment reference.
	 * @see #getUnitvalue()
	 * @generated
	 */
	void setUnitvalue(UnitValue value);

} // Answer
