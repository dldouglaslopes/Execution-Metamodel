/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Internment#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#getCategory <em>Category</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#getClinicalIndication <em>Clinical Indication</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getInternment()
 * @model
 * @generated
 */
public interface Internment extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_Justification()
	 * @model
	 * @generated
	 */
	String getJustification();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(String value);

	/**
	 * Returns the value of the '<em><b>Clinical Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clinical Indication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical Indication</em>' attribute.
	 * @see #setClinicalIndication(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_ClinicalIndication()
	 * @model
	 * @generated
	 */
	String getClinicalIndication();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getClinicalIndication <em>Clinical Indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Indication</em>' attribute.
	 * @see #getClinicalIndication()
	 * @generated
	 */
	void setClinicalIndication(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

} // Internment
