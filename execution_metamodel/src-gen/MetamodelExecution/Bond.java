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
 *   <li>{@link MetamodelExecution.Bond#getTypeVerbose <em>Type Verbose</em>}</li>
 *   <li>{@link MetamodelExecution.Bond#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.Bond#getTruePremise <em>True Premise</em>}</li>
 *   <li>{@link MetamodelExecution.Bond#getTruePremiseDisplay <em>True Premise Display</em>}</li>
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
	 * @model
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
	 * Returns the value of the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Verbose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Verbose</em>' attribute.
	 * @see #setTypeVerbose(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getBond_TypeVerbose()
	 * @model
	 * @generated
	 */
	String getTypeVerbose();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Bond#getTypeVerbose <em>Type Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Verbose</em>' attribute.
	 * @see #getTypeVerbose()
	 * @generated
	 */
	void setTypeVerbose(String value);

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
	 * Returns the value of the '<em><b>True Premise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Premise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Premise</em>' attribute.
	 * @see #setTruePremise(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getBond_TruePremise()
	 * @model
	 * @generated
	 */
	String getTruePremise();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Bond#getTruePremise <em>True Premise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Premise</em>' attribute.
	 * @see #getTruePremise()
	 * @generated
	 */
	void setTruePremise(String value);

	/**
	 * Returns the value of the '<em><b>True Premise Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Premise Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Premise Display</em>' attribute.
	 * @see #setTruePremiseDisplay(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getBond_TruePremiseDisplay()
	 * @model
	 * @generated
	 */
	String getTruePremiseDisplay();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Bond#getTruePremiseDisplay <em>True Premise Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Premise Display</em>' attribute.
	 * @see #getTruePremiseDisplay()
	 * @generated
	 */
	void setTruePremiseDisplay(String value);

} // Bond
