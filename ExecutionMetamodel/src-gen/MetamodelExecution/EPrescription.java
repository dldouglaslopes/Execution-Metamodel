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
 *   <li>{@link MetamodelExecution.EPrescription#getPrescribedmedicament <em>Prescribedmedicament</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getPrescribedprescriptionitem <em>Prescribedprescriptionitem</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getIdsPrescribedMedication <em>Ids Prescribed Medication</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getIdsPrescribedPrescriptionItem <em>Ids Prescribed Prescription Item</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getPrescriptioninfo <em>Prescriptioninfo</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription()
 * @model
 * @generated
 */
public interface EPrescription extends EElement {
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
	 * Returns the value of the '<em><b>Prescribedmedicament</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PrescribedMedicament}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescribedmedicament</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescribedmedicament</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription_Prescribedmedicament()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrescribedMedicament> getPrescribedmedicament();

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
	 * Returns the value of the '<em><b>Prescriptioninfo</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PrescriptionInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptioninfo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptioninfo</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription_Prescriptioninfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrescriptionInfo> getPrescriptioninfo();

} // EPrescription
