/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Justify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Justify#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Justify#getReason <em>Reason</em>}</li>
 *   <li>{@link MetamodelExecution.Justify#getReasonDisplay <em>Reason Display</em>}</li>
 *   <li>{@link MetamodelExecution.Justify#getDescription <em>Description</em>}</li>
 *   <li>{@link MetamodelExecution.Justify#getJustifyById <em>Justify By Id</em>}</li>
 *   <li>{@link MetamodelExecution.Justify#getJustifyBy <em>Justify By</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getJustify()
 * @model
 * @generated
 */
public interface Justify extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getJustify_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Justify#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getJustify_Reason()
	 * @model
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Justify#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Reason Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Display</em>' attribute.
	 * @see #setReasonDisplay(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getJustify_ReasonDisplay()
	 * @model
	 * @generated
	 */
	String getReasonDisplay();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Justify#getReasonDisplay <em>Reason Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Display</em>' attribute.
	 * @see #getReasonDisplay()
	 * @generated
	 */
	void setReasonDisplay(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getJustify_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Justify#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Justify By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justify By Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justify By Id</em>' attribute.
	 * @see #setJustifyById(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getJustify_JustifyById()
	 * @model
	 * @generated
	 */
	int getJustifyById();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Justify#getJustifyById <em>Justify By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justify By Id</em>' attribute.
	 * @see #getJustifyById()
	 * @generated
	 */
	void setJustifyById(int value);

	/**
	 * Returns the value of the '<em><b>Justify By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justify By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justify By</em>' attribute.
	 * @see #setJustifyBy(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getJustify_JustifyBy()
	 * @model
	 * @generated
	 */
	String getJustifyBy();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Justify#getJustifyBy <em>Justify By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justify By</em>' attribute.
	 * @see #getJustifyBy()
	 * @generated
	 */
	void setJustifyBy(String value);

} // Justify