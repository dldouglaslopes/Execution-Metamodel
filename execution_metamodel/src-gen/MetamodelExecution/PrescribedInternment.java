/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prescribed Internment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.PrescribedInternment#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.PrescribedInternment#getInternment <em>Internment</em>}</li>
 *   <li>{@link MetamodelExecution.PrescribedInternment#getNumberGuide <em>Number Guide</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedInternment()
 * @model
 * @generated
 */
public interface PrescribedInternment extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedInternment_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PrescribedInternment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Internment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internment</em>' containment reference.
	 * @see #setInternment(Internment)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedInternment_Internment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Internment getInternment();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PrescribedInternment#getInternment <em>Internment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internment</em>' containment reference.
	 * @see #getInternment()
	 * @generated
	 */
	void setInternment(Internment value);

	/**
	 * Returns the value of the '<em><b>Number Guide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Guide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Guide</em>' attribute.
	 * @see #setNumberGuide(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescribedInternment_NumberGuide()
	 * @model
	 * @generated
	 */
	int getNumberGuide();

	/**
	 * Sets the value of the '{@link MetamodelExecution.PrescribedInternment#getNumberGuide <em>Number Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Guide</em>' attribute.
	 * @see #getNumberGuide()
	 * @generated
	 */
	void setNumberGuide(int value);

} // PrescribedInternment
