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
 *   <li>{@link MetamodelExecution.Bond#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.Bond#getIdBond <em>Id Bond</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getBond()
 * @model abstract="true"
 * @generated
 */
public interface Bond extends EObject {
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
	 * Returns the value of the '<em><b>Id Bond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Bond</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Bond</em>' attribute.
	 * @see #setIdBond(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getBond_IdBond()
	 * @model
	 * @generated
	 */
	int getIdBond();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Bond#getIdBond <em>Id Bond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Bond</em>' attribute.
	 * @see #getIdBond()
	 * @generated
	 */
	void setIdBond(int value);

} // Bond
