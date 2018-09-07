/**
 */
package MetamodelExecution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPrescription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.EPrescription#getText <em>Text</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getPrescribedprescriptionitem <em>Prescribedprescriptionitem</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getIdsPrescribedMedication <em>Ids Prescribed Medication</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getIdsPrescribedPrescriptionItem <em>Ids Prescribed Prescription Item</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getPrescribedmedication <em>Prescribedmedication</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getTypePrescription <em>Type Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getLastExecutedPrescription <em>Last Executed Prescription</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription()
 * @model
 * @generated
 */
public interface EPrescription extends EStep {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPrescription#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Prescribedprescriptionitem</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PrescribedPrescriptionItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescribedprescriptionitem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescribedprescriptionitem</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription_Prescribedprescriptionitem()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrescribedPrescriptionItem> getPrescribedprescriptionitem();

	/**
	 * Returns the value of the '<em><b>Ids Prescribed Medication</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids Prescribed Medication</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids Prescribed Medication</em>' attribute list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription_IdsPrescribedMedication()
	 * @model
	 * @generated
	 */
	EList<Integer> getIdsPrescribedMedication();

	/**
	 * Returns the value of the '<em><b>Ids Prescribed Prescription Item</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids Prescribed Prescription Item</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids Prescribed Prescription Item</em>' attribute list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription_IdsPrescribedPrescriptionItem()
	 * @model
	 * @generated
	 */
	EList<Integer> getIdsPrescribedPrescriptionItem();

	/**
	 * Returns the value of the '<em><b>Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescription</em>' containment reference.
	 * @see #setPrescription(Prescription)
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription_Prescription()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Prescription getPrescription();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPrescription#getPrescription <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription</em>' containment reference.
	 * @see #getPrescription()
	 * @generated
	 */
	void setPrescription(Prescription value);

	/**
	 * Returns the value of the '<em><b>Prescribedmedication</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PrescribedMedication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescribedmedication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescribedmedication</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription_Prescribedmedication()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrescribedMedication> getPrescribedmedication();

	/**
	 * Returns the value of the '<em><b>Type Prescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Prescription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Prescription</em>' attribute.
	 * @see #setTypePrescription(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription_TypePrescription()
	 * @model
	 * @generated
	 */
	String getTypePrescription();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPrescription#getTypePrescription <em>Type Prescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Prescription</em>' attribute.
	 * @see #getTypePrescription()
	 * @generated
	 */
	void setTypePrescription(String value);

	/**
	 * Returns the value of the '<em><b>Last Executed Prescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Executed Prescription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Executed Prescription</em>' attribute.
	 * @see #setLastExecutedPrescription(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription_LastExecutedPrescription()
	 * @model
	 * @generated
	 */
	String getLastExecutedPrescription();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EPrescription#getLastExecutedPrescription <em>Last Executed Prescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Executed Prescription</em>' attribute.
	 * @see #getLastExecutedPrescription()
	 * @generated
	 */
	void setLastExecutedPrescription(String value);

} // EPrescription
