/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Question#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Question#getText <em>Text</em>}</li>
 *   <li>{@link MetamodelExecution.Question#getVariable <em>Variable</em>}</li>
 *   <li>{@link MetamodelExecution.Question#getCategory <em>Category</em>}</li>
 *   <li>{@link MetamodelExecution.Question#getOrder <em>Order</em>}</li>
 *   <li>{@link MetamodelExecution.Question#isNotApplied <em>Not Applied</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getQuestion_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Question#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getQuestion_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Question#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see MetamodelExecution.Execution_metamodelPackage#getQuestion_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Question#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getQuestion_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Question#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getQuestion_Order()
	 * @model
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Question#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Not Applied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Applied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Applied</em>' attribute.
	 * @see #setNotApplied(boolean)
	 * @see MetamodelExecution.Execution_metamodelPackage#getQuestion_NotApplied()
	 * @model
	 * @generated
	 */
	boolean isNotApplied();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Question#isNotApplied <em>Not Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Applied</em>' attribute.
	 * @see #isNotApplied()
	 * @generated
	 */
	void setNotApplied(boolean value);

} // Question
