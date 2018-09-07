/**
 */
package MetamodelExecution;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complementary Conducts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.ComplementaryConducts#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.ComplementaryConducts#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.ComplementaryConducts#getPathway <em>Pathway</em>}</li>
 *   <li>{@link MetamodelExecution.ComplementaryConducts#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link MetamodelExecution.ComplementaryConducts#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.ComplementaryConducts#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link MetamodelExecution.ComplementaryConducts#getResource <em>Resource</em>}</li>
 *   <li>{@link MetamodelExecution.ComplementaryConducts#getSuspension <em>Suspension</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryConducts()
 * @model abstract="true"
 * @generated
 */
public interface ComplementaryConducts extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryConducts_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ComplementaryConducts#getId <em>Id</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryConducts_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ComplementaryConducts#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pathway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathway</em>' attribute.
	 * @see #setPathway(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryConducts_Pathway()
	 * @model
	 * @generated
	 */
	String getPathway();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ComplementaryConducts#getPathway <em>Pathway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pathway</em>' attribute.
	 * @see #getPathway()
	 * @generated
	 */
	void setPathway(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryConducts_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ComplementaryConducts#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justification</em>' attribute.
	 * @see #setJustification(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryConducts_Justification()
	 * @model
	 * @generated
	 */
	String getJustification();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ComplementaryConducts#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(String value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' attribute.
	 * @see #setCreatedBy(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryConducts_CreatedBy()
	 * @model
	 * @generated
	 */
	String getCreatedBy();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ComplementaryConducts#getCreatedBy <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' attribute.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryConducts_Resource()
	 * @model
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ComplementaryConducts#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(String value);

	/**
	 * Returns the value of the '<em><b>Suspension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspension</em>' containment reference.
	 * @see #setSuspension(Suspension)
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryConducts_Suspension()
	 * @model containment="true"
	 * @generated
	 */
	Suspension getSuspension();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ComplementaryConducts#getSuspension <em>Suspension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspension</em>' containment reference.
	 * @see #getSuspension()
	 * @generated
	 */
	void setSuspension(Suspension value);

} // ComplementaryConducts
