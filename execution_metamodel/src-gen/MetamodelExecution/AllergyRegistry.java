/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.AllergyRegistry#getPatient <em>Patient</em>}</li>
 *   <li>{@link MetamodelExecution.AllergyRegistry#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.AllergyRegistry#getAllergy <em>Allergy</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getAllergyRegistry()
 * @model
 * @generated
 */
public interface AllergyRegistry extends EObject {
	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Patient)
	 * @see MetamodelExecution.Execution_metamodelPackage#getAllergyRegistry_Patient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link MetamodelExecution.AllergyRegistry#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getAllergyRegistry_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.AllergyRegistry#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Allergy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allergy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allergy</em>' containment reference.
	 * @see #setAllergy(Allergy)
	 * @see MetamodelExecution.Execution_metamodelPackage#getAllergyRegistry_Allergy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Allergy getAllergy();

	/**
	 * Sets the value of the '{@link MetamodelExecution.AllergyRegistry#getAllergy <em>Allergy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allergy</em>' containment reference.
	 * @see #getAllergy()
	 * @generated
	 */
	void setAllergy(Allergy value);

} // AllergyRegistry
