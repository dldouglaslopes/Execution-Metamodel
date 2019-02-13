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
 *   <li>{@link MetamodelExecution.EPrescription#getPprescription <em>Pprescription</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getIdsPrescribedMedication <em>Ids Prescribed Medication</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getIdsPrescribedPrescriptionItem <em>Ids Prescribed Prescription Item</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getPmedication <em>Pmedication</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getTypePrescription <em>Type Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getLastExecutedPrescription <em>Last Executed Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.EPrescription#getPrescriptionResult <em>Prescription Result</em>}</li>
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
	 * Returns the value of the '<em><b>Pprescription</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PPrescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pprescription</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pprescription</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription_Pprescription()
	 * @model containment="true"
	 * @generated
	 */
	EList<PPrescription> getPprescription();

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
	 * Returns the value of the '<em><b>Pmedication</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PMedication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pmedication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pmedication</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription_Pmedication()
	 * @model containment="true"
	 * @generated
	 */
	EList<PMedication> getPmedication();

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

	/**
	 * Returns the value of the '<em><b>Prescription Result</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.PrescriptionResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescription Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescription Result</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getEPrescription_PrescriptionResult()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrescriptionResult> getPrescriptionResult();

} // EPrescription
