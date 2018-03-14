/**
 */
package MetamodelExecution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicament</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Medicament#getMedicine <em>Medicine</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getUnit <em>Unit</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getAccess <em>Access</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getUrl <em>Url</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getCode <em>Code</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getIdMedicament <em>Id Medicament</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getDescription <em>Description</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getBrand <em>Brand</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#isOutpatient <em>Outpatient</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getIdUnit <em>Id Unit</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getIdAccess <em>Id Access</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getStandard <em>Standard</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getDailyDosage <em>Daily Dosage</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getCycles <em>Cycles</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getFrequencyDisplay <em>Frequency Display</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getTimeTreatement <em>Time Treatement</em>}</li>
 *   <li>{@link MetamodelExecution.Medicament#getTimeInterval <em>Time Interval</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament()
 * @model
 * @generated
 */
public interface Medicament extends EObject {
	/**
	 * Returns the value of the '<em><b>Medicine</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.Medicine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicine</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_Medicine()
	 * @model containment="true"
	 * @generated
	 */
	EList<Medicine> getMedicine();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_Unit()
	 * @model containment="true"
	 * @generated
	 */
	EList<Unit> getUnit();

	/**
	 * Returns the value of the '<em><b>Access</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelExecution.Access}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' containment reference list.
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_Access()
	 * @model containment="true"
	 * @generated
	 */
	EList<Access> getAccess();

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getId <em>Id</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_Code()
	 * @model
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>Id Medicament</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Medicament</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Medicament</em>' attribute.
	 * @see #setIdMedicament(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_IdMedicament()
	 * @model
	 * @generated
	 */
	int getIdMedicament();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getIdMedicament <em>Id Medicament</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Medicament</em>' attribute.
	 * @see #getIdMedicament()
	 * @generated
	 */
	void setIdMedicament(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' attribute.
	 * @see #setBrand(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_Brand()
	 * @model
	 * @generated
	 */
	String getBrand();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getBrand <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' attribute.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_Outpatient()
	 * @model
	 * @generated
	 */
	boolean isOutpatient();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#isOutpatient <em>Outpatient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outpatient</em>' attribute.
	 * @see #isOutpatient()
	 * @generated
	 */
	void setOutpatient(boolean value);

	/**
	 * Returns the value of the '<em><b>Id Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Unit</em>' attribute.
	 * @see #setIdUnit(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_IdUnit()
	 * @model
	 * @generated
	 */
	int getIdUnit();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getIdUnit <em>Id Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Unit</em>' attribute.
	 * @see #getIdUnit()
	 * @generated
	 */
	void setIdUnit(int value);

	/**
	 * Returns the value of the '<em><b>Id Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Access</em>' attribute.
	 * @see #setIdAccess(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_IdAccess()
	 * @model
	 * @generated
	 */
	int getIdAccess();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getIdAccess <em>Id Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Access</em>' attribute.
	 * @see #getIdAccess()
	 * @generated
	 */
	void setIdAccess(int value);

	/**
	 * Returns the value of the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard</em>' attribute.
	 * @see #setStandard(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_Standard()
	 * @model
	 * @generated
	 */
	String getStandard();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getStandard <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard</em>' attribute.
	 * @see #getStandard()
	 * @generated
	 */
	void setStandard(String value);

	/**
	 * Returns the value of the '<em><b>Daily Dosage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily Dosage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Dosage</em>' attribute.
	 * @see #setDailyDosage(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_DailyDosage()
	 * @model
	 * @generated
	 */
	int getDailyDosage();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getDailyDosage <em>Daily Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Dosage</em>' attribute.
	 * @see #getDailyDosage()
	 * @generated
	 */
	void setDailyDosage(int value);

	/**
	 * Returns the value of the '<em><b>Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycles</em>' attribute.
	 * @see #setCycles(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_Cycles()
	 * @model
	 * @generated
	 */
	int getCycles();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getCycles <em>Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycles</em>' attribute.
	 * @see #getCycles()
	 * @generated
	 */
	void setCycles(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_Frequency()
	 * @model
	 * @generated
	 */
	int getFrequency();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Frequency Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Display</em>' attribute.
	 * @see #setFrequencyDisplay(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_FrequencyDisplay()
	 * @model
	 * @generated
	 */
	String getFrequencyDisplay();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getFrequencyDisplay <em>Frequency Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Display</em>' attribute.
	 * @see #getFrequencyDisplay()
	 * @generated
	 */
	void setFrequencyDisplay(String value);

	/**
	 * Returns the value of the '<em><b>Time Treatement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Treatement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Treatement</em>' attribute.
	 * @see #setTimeTreatement(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_TimeTreatement()
	 * @model
	 * @generated
	 */
	int getTimeTreatement();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getTimeTreatement <em>Time Treatement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Treatement</em>' attribute.
	 * @see #getTimeTreatement()
	 * @generated
	 */
	void setTimeTreatement(int value);

	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Interval</em>' attribute.
	 * @see #setTimeInterval(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicament_TimeInterval()
	 * @model
	 * @generated
	 */
	int getTimeInterval();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medicament#getTimeInterval <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' attribute.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(int value);

} // Medicament
