/**
 */
package MetamodelExecution;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link MetamodelExecution.Complement#getSideLimb <em>Side Limb</em>}</li>
 *   <li>{@link MetamodelExecution.Complement#getSideLimbDisplay <em>Side Limb Display</em>}</li>
 *   <li>{@link MetamodelExecution.Complement#getClinicalIndication <em>Clinical Indication</em>}</li>
 *   <li>{@link MetamodelExecution.Complement#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.Complement#getQuantity <em>Quantity</em>}</li>
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
	 * Returns the value of the '<em><b>Side Limb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Limb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Limb</em>' attribute.
	 * @see #setSideLimb(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplement_SideLimb()
	 * @model
	 * @generated
	 */
	String getSideLimb();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Complement#getSideLimb <em>Side Limb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Limb</em>' attribute.
	 * @see #getSideLimb()
	 * @generated
	 */
	void setSideLimb(String value);

	/**
	 * Returns the value of the '<em><b>Side Limb Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Limb Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Limb Display</em>' attribute.
	 * @see #setSideLimbDisplay(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplement_SideLimbDisplay()
	 * @model
	 * @generated
	 */
	String getSideLimbDisplay();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Complement#getSideLimbDisplay <em>Side Limb Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Limb Display</em>' attribute.
	 * @see #getSideLimbDisplay()
	 * @generated
	 */
	void setSideLimbDisplay(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplement_Justification()
	 * @model
	 * @generated
	 */
	String getJustification();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Complement#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.Quantity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplement_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Quantity> getQuantity();

} // Complement
