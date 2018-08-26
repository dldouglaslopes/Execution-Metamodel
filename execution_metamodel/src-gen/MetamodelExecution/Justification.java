/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Justification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Justification#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Justification#getReason <em>Reason</em>}</li>
 *   <li>{@link MetamodelExecution.Justification#getDescription <em>Description</em>}</li>
 *   <li>{@link MetamodelExecution.Justification#getJustifiedById <em>Justified By Id</em>}</li>
 *   <li>{@link MetamodelExecution.Justification#getJustifiedBy <em>Justified By</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getJustification()
 * @model
 * @generated
 */
public interface Justification extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getJustification_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Justification#getId <em>Id</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getJustification_Reason()
	 * @model
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Justification#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getJustification_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Justification#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Justified By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justified By Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justified By Id</em>' attribute.
	 * @see #setJustifiedById(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getJustification_JustifiedById()
	 * @model
	 * @generated
	 */
	int getJustifiedById();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Justification#getJustifiedById <em>Justified By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justified By Id</em>' attribute.
	 * @see #getJustifiedById()
	 * @generated
	 */
	void setJustifiedById(int value);

	/**
	 * Returns the value of the '<em><b>Justified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justified By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justified By</em>' attribute.
	 * @see #setJustifiedBy(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getJustification_JustifiedBy()
	 * @model
	 * @generated
	 */
	String getJustifiedBy();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Justification#getJustifiedBy <em>Justified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justified By</em>' attribute.
	 * @see #getJustifiedBy()
	 * @generated
	 */
	void setJustifiedBy(String value);

} // Justification
