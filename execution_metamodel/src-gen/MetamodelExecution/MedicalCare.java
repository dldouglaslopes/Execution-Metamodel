/**
 */
package MetamodelExecution;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medical Care</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.MedicalCare#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.MedicalCare#getProfessional <em>Professional</em>}</li>
 *   <li>{@link MetamodelExecution.MedicalCare#getUnitcare <em>Unitcare</em>}</li>
 *   <li>{@link MetamodelExecution.MedicalCare#getPatient <em>Patient</em>}</li>
 *   <li>{@link MetamodelExecution.MedicalCare#getCid10 <em>Cid10</em>}</li>
 *   <li>{@link MetamodelExecution.MedicalCare#getCodeMedicalCare <em>Code Medical Care</em>}</li>
 *   <li>{@link MetamodelExecution.MedicalCare#getCodeMedicalCareContiguous <em>Code Medical Care Contiguous</em>}</li>
 *   <li>{@link MetamodelExecution.MedicalCare#getCodeBd <em>Code Bd</em>}</li>
 *   <li>{@link MetamodelExecution.MedicalCare#getCodeBeneficiary <em>Code Beneficiary</em>}</li>
 *   <li>{@link MetamodelExecution.MedicalCare#getCodeAccommodation <em>Code Accommodation</em>}</li>
 *   <li>{@link MetamodelExecution.MedicalCare#getCodePatient <em>Code Patient</em>}</li>
 *   <li>{@link MetamodelExecution.MedicalCare#getCodeRisk <em>Code Risk</em>}</li>
 *   <li>{@link MetamodelExecution.MedicalCare#getCodeProfessional <em>Code Professional</em>}</li>
 *   <li>{@link MetamodelExecution.MedicalCare#getLogin <em>Login</em>}</li>
 *   <li>{@link MetamodelExecution.MedicalCare#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare()
 * @model
 * @generated
 */
public interface MedicalCare extends EObject {
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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Professional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Professional</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professional</em>' containment reference.
	 * @see #setProfessional(Professional)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_Professional()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Professional getProfessional();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getProfessional <em>Professional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Professional</em>' containment reference.
	 * @see #getProfessional()
	 * @generated
	 */
	void setProfessional(Professional value);

	/**
	 * Returns the value of the '<em><b>Unitcare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unitcare</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitcare</em>' containment reference.
	 * @see #setUnitcare(UnitCare)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_Unitcare()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnitCare getUnitcare();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getUnitcare <em>Unitcare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unitcare</em>' containment reference.
	 * @see #getUnitcare()
	 * @generated
	 */
	void setUnitcare(UnitCare value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_Patient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Cid10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cid10</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cid10</em>' attribute.
	 * @see #setCid10(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_Cid10()
	 * @model
	 * @generated
	 */
	String getCid10();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getCid10 <em>Cid10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cid10</em>' attribute.
	 * @see #getCid10()
	 * @generated
	 */
	void setCid10(String value);

	/**
	 * Returns the value of the '<em><b>Code Medical Care</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Medical Care</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Medical Care</em>' attribute.
	 * @see #setCodeMedicalCare(BigInteger)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_CodeMedicalCare()
	 * @model
	 * @generated
	 */
	BigInteger getCodeMedicalCare();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getCodeMedicalCare <em>Code Medical Care</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Medical Care</em>' attribute.
	 * @see #getCodeMedicalCare()
	 * @generated
	 */
	void setCodeMedicalCare(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Code Medical Care Contiguous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Medical Care Contiguous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Medical Care Contiguous</em>' attribute.
	 * @see #setCodeMedicalCareContiguous(BigInteger)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_CodeMedicalCareContiguous()
	 * @model
	 * @generated
	 */
	BigInteger getCodeMedicalCareContiguous();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getCodeMedicalCareContiguous <em>Code Medical Care Contiguous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Medical Care Contiguous</em>' attribute.
	 * @see #getCodeMedicalCareContiguous()
	 * @generated
	 */
	void setCodeMedicalCareContiguous(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Code Bd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Bd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Bd</em>' attribute.
	 * @see #setCodeBd(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_CodeBd()
	 * @model
	 * @generated
	 */
	String getCodeBd();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getCodeBd <em>Code Bd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Bd</em>' attribute.
	 * @see #getCodeBd()
	 * @generated
	 */
	void setCodeBd(String value);

	/**
	 * Returns the value of the '<em><b>Code Beneficiary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Beneficiary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Beneficiary</em>' attribute.
	 * @see #setCodeBeneficiary(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_CodeBeneficiary()
	 * @model
	 * @generated
	 */
	String getCodeBeneficiary();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getCodeBeneficiary <em>Code Beneficiary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Beneficiary</em>' attribute.
	 * @see #getCodeBeneficiary()
	 * @generated
	 */
	void setCodeBeneficiary(String value);

	/**
	 * Returns the value of the '<em><b>Code Accommodation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Accommodation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Accommodation</em>' attribute.
	 * @see #setCodeAccommodation(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_CodeAccommodation()
	 * @model
	 * @generated
	 */
	String getCodeAccommodation();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getCodeAccommodation <em>Code Accommodation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Accommodation</em>' attribute.
	 * @see #getCodeAccommodation()
	 * @generated
	 */
	void setCodeAccommodation(String value);

	/**
	 * Returns the value of the '<em><b>Code Patient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Patient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Patient</em>' attribute.
	 * @see #setCodePatient(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_CodePatient()
	 * @model
	 * @generated
	 */
	String getCodePatient();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getCodePatient <em>Code Patient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Patient</em>' attribute.
	 * @see #getCodePatient()
	 * @generated
	 */
	void setCodePatient(String value);

	/**
	 * Returns the value of the '<em><b>Code Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Risk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Risk</em>' attribute.
	 * @see #setCodeRisk(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_CodeRisk()
	 * @model
	 * @generated
	 */
	String getCodeRisk();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getCodeRisk <em>Code Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Risk</em>' attribute.
	 * @see #getCodeRisk()
	 * @generated
	 */
	void setCodeRisk(String value);

	/**
	 * Returns the value of the '<em><b>Code Professional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Professional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Professional</em>' attribute.
	 * @see #setCodeProfessional(BigInteger)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_CodeProfessional()
	 * @model
	 * @generated
	 */
	BigInteger getCodeProfessional();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getCodeProfessional <em>Code Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Professional</em>' attribute.
	 * @see #getCodeProfessional()
	 * @generated
	 */
	void setCodeProfessional(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_Login()
	 * @model
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getMedicalCare_Priority()
	 * @model
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link MetamodelExecution.MedicalCare#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

} // MedicalCare
