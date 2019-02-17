/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Internment#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#getCategory <em>Category</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#getClinicalIndication <em>Clinical Indication</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#getCode <em>Code</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#getIdInternment <em>Id Internment</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#getTypeCode <em>Type Code</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#isMemberPeers <em>Member Peers</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#isOutpatient <em>Outpatient</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.Internment#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getInternment()
 * @model
 * @generated
 */
public interface Internment extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_Justification()
	 * @model
	 * @generated
	 */
	String getJustification();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(String value);

	/**
	 * Returns the value of the '<em><b>Clinical Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clinical Indication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical Indication</em>' attribute.
	 * @see #setClinicalIndication(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_ClinicalIndication()
	 * @model
	 * @generated
	 */
	String getClinicalIndication();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getClinicalIndication <em>Clinical Indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Indication</em>' attribute.
	 * @see #getClinicalIndication()
	 * @generated
	 */
	void setClinicalIndication(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Id Internment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Internment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Internment</em>' attribute.
	 * @see #setIdInternment(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_IdInternment()
	 * @model
	 * @generated
	 */
	int getIdInternment();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getIdInternment <em>Id Internment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Internment</em>' attribute.
	 * @see #getIdInternment()
	 * @generated
	 */
	void setIdInternment(int value);

	/**
	 * Returns the value of the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Code</em>' attribute.
	 * @see #setTypeCode(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_TypeCode()
	 * @model
	 * @generated
	 */
	String getTypeCode();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Code</em>' attribute.
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(String value);

	/**
	 * Returns the value of the '<em><b>Member Peers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Peers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Peers</em>' attribute.
	 * @see #setMemberPeers(boolean)
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_MemberPeers()
	 * @model
	 * @generated
	 */
	boolean isMemberPeers();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#isMemberPeers <em>Member Peers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Peers</em>' attribute.
	 * @see #isMemberPeers()
	 * @generated
	 */
	void setMemberPeers(boolean value);

	/**
	 * Returns the value of the '<em><b>Outpatient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outpatient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outpatient</em>' attribute.
	 * @see #setOutpatient(boolean)
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_Outpatient()
	 * @model
	 * @generated
	 */
	boolean isOutpatient();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#isOutpatient <em>Outpatient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outpatient</em>' attribute.
	 * @see #isOutpatient()
	 * @generated
	 */
	void setOutpatient(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getInternment_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Internment#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Internment
