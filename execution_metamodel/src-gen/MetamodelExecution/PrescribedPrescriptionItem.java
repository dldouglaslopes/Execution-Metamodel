/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prescribed Prescription Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.PrescribedPrescriptionItem#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.PrescribedPrescriptionItem#getItemPrescription <em>Item Prescription</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedPrescriptionItem()
 * @model
 * @generated
 */
public interface PrescribedPrescriptionItem extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedPrescriptionItem_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PrescribedPrescriptionItem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Item Prescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Prescription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Prescription</em>' attribute.
	 * @see #setItemPrescription(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedPrescriptionItem_ItemPrescription()
	 * @model
	 * @generated
	 */
	int getItemPrescription();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PrescribedPrescriptionItem#getItemPrescription <em>Item Prescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Prescription</em>' attribute.
	 * @see #getItemPrescription()
	 * @generated
	 */
	void setItemPrescription(int value);

} // PrescribedPrescriptionItem
