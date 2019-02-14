/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prescription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Prescription#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getIdMedication <em>Id Medication</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getMedication <em>Medication</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getQtdPrescription <em>Qtd Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getAccess <em>Access</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getQtdDuration <em>Qtd Duration</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getUnitDuration <em>Unit Duration</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getUnitFrequency <em>Unit Frequency</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getComplement <em>Complement</em>}</li>
 *   <li>{@link MetamodelExecution.Prescription#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription()
 * @model
 * @generated
 */
public interface Prescription extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_Frequency()
	 * @model
	 * @generated
	 */
	int getFrequency();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Id Medication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Medication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Medication</em>' attribute.
	 * @see #setIdMedication(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_IdMedication()
	 * @model
	 * @generated
	 */
	int getIdMedication();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getIdMedication <em>Id Medication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Medication</em>' attribute.
	 * @see #getIdMedication()
	 * @generated
	 */
	void setIdMedication(int value);

	/**
	 * Returns the value of the '<em><b>Medication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication</em>' attribute.
	 * @see #setMedication(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_Medication()
	 * @model
	 * @generated
	 */
	String getMedication();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getMedication <em>Medication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication</em>' attribute.
	 * @see #getMedication()
	 * @generated
	 */
	void setMedication(String value);

	/**
	 * Returns the value of the '<em><b>Qtd Prescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qtd Prescription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qtd Prescription</em>' attribute.
	 * @see #setQtdPrescription(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_QtdPrescription()
	 * @model
	 * @generated
	 */
	int getQtdPrescription();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getQtdPrescription <em>Qtd Prescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qtd Prescription</em>' attribute.
	 * @see #getQtdPrescription()
	 * @generated
	 */
	void setQtdPrescription(int value);

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' attribute.
	 * @see #setPresentation(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_Presentation()
	 * @model
	 * @generated
	 */
	String getPresentation();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' attribute.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(String value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_Access()
	 * @model
	 * @generated
	 */
	String getAccess();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(String value);

	/**
	 * Returns the value of the '<em><b>Qtd Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qtd Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qtd Duration</em>' attribute.
	 * @see #setQtdDuration(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_QtdDuration()
	 * @model
	 * @generated
	 */
	int getQtdDuration();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getQtdDuration <em>Qtd Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qtd Duration</em>' attribute.
	 * @see #getQtdDuration()
	 * @generated
	 */
	void setQtdDuration(int value);

	/**
	 * Returns the value of the '<em><b>Unit Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Duration</em>' attribute.
	 * @see #setUnitDuration(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_UnitDuration()
	 * @model
	 * @generated
	 */
	String getUnitDuration();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getUnitDuration <em>Unit Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Duration</em>' attribute.
	 * @see #getUnitDuration()
	 * @generated
	 */
	void setUnitDuration(String value);

	/**
	 * Returns the value of the '<em><b>Unit Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Frequency</em>' attribute.
	 * @see #setUnitFrequency(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_UnitFrequency()
	 * @model
	 * @generated
	 */
	String getUnitFrequency();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getUnitFrequency <em>Unit Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Frequency</em>' attribute.
	 * @see #getUnitFrequency()
	 * @generated
	 */
	void setUnitFrequency(String value);

	/**
	 * Returns the value of the '<em><b>Complement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement</em>' attribute.
	 * @see #setComplement(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_Complement()
	 * @model
	 * @generated
	 */
	String getComplement();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getComplement <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement</em>' attribute.
	 * @see #getComplement()
	 * @generated
	 */
	void setComplement(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getPrescription_Order()
	 * @model
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Prescription#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

} // Prescription
