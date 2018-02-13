/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Complement#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Complement#getSideMember <em>Side Member</em>}</li>
 *   <li>{@link MetamodelExecution.Complement#getSideMemberDisplay <em>Side Member Display</em>}</li>
 *   <li>{@link MetamodelExecution.Complement#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link MetamodelExecution.Complement#getClinicalIndication <em>Clinical Indication</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getComplement()
 * @model
 * @generated
 */
public interface Complement extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplement_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Complement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Side Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Member</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Member</em>' attribute.
	 * @see #setSideMember(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplement_SideMember()
	 * @model
	 * @generated
	 */
	String getSideMember();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Complement#getSideMember <em>Side Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Member</em>' attribute.
	 * @see #getSideMember()
	 * @generated
	 */
	void setSideMember(String value);

	/**
	 * Returns the value of the '<em><b>Side Member Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Member Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Member Display</em>' attribute.
	 * @see #setSideMemberDisplay(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplement_SideMemberDisplay()
	 * @model
	 * @generated
	 */
	String getSideMemberDisplay();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Complement#getSideMemberDisplay <em>Side Member Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Member Display</em>' attribute.
	 * @see #getSideMemberDisplay()
	 * @generated
	 */
	void setSideMemberDisplay(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplement_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Complement#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Clinical Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clinical Indication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical Indication</em>' attribute.
	 * @see #setClinicalIndication(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplement_ClinicalIndication()
	 * @model
	 * @generated
	 */
	int getClinicalIndication();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Complement#getClinicalIndication <em>Clinical Indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Indication</em>' attribute.
	 * @see #getClinicalIndication()
	 * @generated
	 */
	void setClinicalIndication(int value);

} // Complement
