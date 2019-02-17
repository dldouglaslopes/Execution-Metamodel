/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Medication#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getCode <em>Code</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getDescription <em>Description</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getBrand <em>Brand</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#isOutpatient <em>Outpatient</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getStandard <em>Standard</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getDailyDosage <em>Daily Dosage</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getCycles <em>Cycles</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getTimeTreatement <em>Time Treatement</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getCategory <em>Category</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getCodeAccess <em>Code Access</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getNameAcess <em>Name Acess</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getCodeUnit <em>Code Unit</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getNameUnit <em>Name Unit</em>}</li>
 *   <li>{@link MetamodelExecution.Medication#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getMedication()
 * @model
 * @generated
 */
public interface Medication extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getId <em>Id</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getDescription <em>Description</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_Brand()
	 * @model
	 * @generated
	 */
	String getBrand();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getBrand <em>Brand</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_Outpatient()
	 * @model
	 * @generated
	 */
	boolean isOutpatient();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#isOutpatient <em>Outpatient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outpatient</em>' attribute.
	 * @see #isOutpatient()
	 * @generated
	 */
	void setOutpatient(boolean value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_Standard()
	 * @model
	 * @generated
	 */
	String getStandard();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getStandard <em>Standard</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_DailyDosage()
	 * @model
	 * @generated
	 */
	int getDailyDosage();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getDailyDosage <em>Daily Dosage</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_Cycles()
	 * @model
	 * @generated
	 */
	int getCycles();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getCycles <em>Cycles</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_Frequency()
	 * @model
	 * @generated
	 */
	int getFrequency();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_TimeTreatement()
	 * @model
	 * @generated
	 */
	int getTimeTreatement();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getTimeTreatement <em>Time Treatement</em>}' attribute.
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_TimeInterval()
	 * @model
	 * @generated
	 */
	int getTimeInterval();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getTimeInterval <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' attribute.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(int value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Code Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Access</em>' attribute.
	 * @see #setCodeAccess(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_CodeAccess()
	 * @model
	 * @generated
	 */
	int getCodeAccess();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getCodeAccess <em>Code Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Access</em>' attribute.
	 * @see #getCodeAccess()
	 * @generated
	 */
	void setCodeAccess(int value);

	/**
	 * Returns the value of the '<em><b>Name Acess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Acess</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Acess</em>' attribute.
	 * @see #setNameAcess(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_NameAcess()
	 * @model
	 * @generated
	 */
	String getNameAcess();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getNameAcess <em>Name Acess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Acess</em>' attribute.
	 * @see #getNameAcess()
	 * @generated
	 */
	void setNameAcess(String value);

	/**
	 * Returns the value of the '<em><b>Code Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Unit</em>' attribute.
	 * @see #setCodeUnit(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_CodeUnit()
	 * @model
	 * @generated
	 */
	String getCodeUnit();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getCodeUnit <em>Code Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Unit</em>' attribute.
	 * @see #getCodeUnit()
	 * @generated
	 */
	void setCodeUnit(String value);

	/**
	 * Returns the value of the '<em><b>Name Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Unit</em>' attribute.
	 * @see #setNameUnit(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_NameUnit()
	 * @model
	 * @generated
	 */
	String getNameUnit();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getNameUnit <em>Name Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Unit</em>' attribute.
	 * @see #getNameUnit()
	 * @generated
	 */
	void setNameUnit(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedication_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Medication#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // Medication
