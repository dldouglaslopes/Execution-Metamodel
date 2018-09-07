/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Bond#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Bond#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.Bond#getComorbidity <em>Comorbidity</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getBond()
 * @model
 * @generated
 */
public interface Bond extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getBond_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Bond#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getBond_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Bond#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Comorbidity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comorbidity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comorbidity</em>' containment reference.
	 * @see #setComorbidity(Comorbidity)
	 * @see MetamodelExecution.Execution_metamodelPackage#getBond_Comorbidity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Comorbidity getComorbidity();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Bond#getComorbidity <em>Comorbidity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comorbidity</em>' containment reference.
	 * @see #getComorbidity()
	 * @generated
	 */
	void setComorbidity(Comorbidity value);

} // Bond
