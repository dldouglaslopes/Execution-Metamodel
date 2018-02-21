/**
 */
package MetamodelExecution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prescription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Prescription#getText <em>Text</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getIdPrescribedMedicament <em>Id Prescribed Medicament</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getIdPrescribedItens <em>Id Prescribed Itens</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getPrescribedmedicament <em>Prescribedmedicament</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getPrescribedprescriptionitem <em>Prescribedprescriptionitem</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription()
 * @model
 * @generated
 */
public interface Prescription extends ExecutionStep {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Id Prescribed Medicament</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Prescribed Medicament</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Prescribed Medicament</em>' attribute.
	 * @see #setIdPrescribedMedicament(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_IdPrescribedMedicament()
	 * @model
	 * @generated
	 */
	int getIdPrescribedMedicament();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getIdPrescribedMedicament <em>Id Prescribed Medicament</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Prescribed Medicament</em>' attribute.
	 * @see #getIdPrescribedMedicament()
	 * @generated
	 */
	void setIdPrescribedMedicament(int value);

	/**
	 * Returns the value of the '<em><b>Id Prescribed Itens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Prescribed Itens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Prescribed Itens</em>' attribute.
	 * @see #setIdPrescribedItens(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_IdPrescribedItens()
	 * @model
	 * @generated
	 */
	int getIdPrescribedItens();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getIdPrescribedItens <em>Id Prescribed Itens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Prescribed Itens</em>' attribute.
	 * @see #getIdPrescribedItens()
	 * @generated
	 */
	void setIdPrescribedItens(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_Prescribedmedicament()
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_Prescribedprescriptionitem()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrescribedPrescriptionItem> getPrescribedprescriptionitem();

} // Prescription
