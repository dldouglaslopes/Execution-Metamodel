/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attendance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.Attendance#getCodeAttendance <em>Code Attendance</em>}</li>
 *   <li>{@link MetamodelExecution.Attendance#getPacient <em>Pacient</em>}</li>
 *   <li>{@link MetamodelExecution.Attendance#getProfessional <em>Professional</em>}</li>
 *   <li>{@link MetamodelExecution.Attendance#getIdProfessional <em>Id Professional</em>}</li>
 *   <li>{@link MetamodelExecution.Attendance#getHospitalUnit <em>Hospital Unit</em>}</li>
 *   <li>{@link MetamodelExecution.Attendance#getPatientRecord <em>Patient Record</em>}</li>
 *   <li>{@link MetamodelExecution.Attendance#getCodeBd <em>Code Bd</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getAttendance()
 * @model
 * @generated
 */
public interface Attendance extends EObject {
	/**
	 * Returns the value of the '<em><b>Code Attendance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Attendance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Attendance</em>' attribute.
	 * @see #setCodeAttendance(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getAttendance_CodeAttendance()
	 * @model
	 * @generated
	 */
	int getCodeAttendance();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Attendance#getCodeAttendance <em>Code Attendance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Attendance</em>' attribute.
	 * @see #getCodeAttendance()
	 * @generated
	 */
	void setCodeAttendance(int value);

	/**
	 * Returns the value of the '<em><b>Pacient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pacient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pacient</em>' attribute.
	 * @see #setPacient(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getAttendance_Pacient()
	 * @model
	 * @generated
	 */
	String getPacient();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Attendance#getPacient <em>Pacient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pacient</em>' attribute.
	 * @see #getPacient()
	 * @generated
	 */
	void setPacient(String value);

	/**
	 * Returns the value of the '<em><b>Professional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Professional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professional</em>' attribute.
	 * @see #setProfessional(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getAttendance_Professional()
	 * @model
	 * @generated
	 */
	String getProfessional();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Attendance#getProfessional <em>Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Professional</em>' attribute.
	 * @see #getProfessional()
	 * @generated
	 */
	void setProfessional(String value);

	/**
	 * Returns the value of the '<em><b>Id Professional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Professional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Professional</em>' attribute.
	 * @see #setIdProfessional(int)
	 * @see MetamodelExecution.Execution_metamodelPackage#getAttendance_IdProfessional()
	 * @model
	 * @generated
	 */
	int getIdProfessional();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Attendance#getIdProfessional <em>Id Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Professional</em>' attribute.
	 * @see #getIdProfessional()
	 * @generated
	 */
	void setIdProfessional(int value);

	/**
	 * Returns the value of the '<em><b>Hospital Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hospital Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hospital Unit</em>' attribute.
	 * @see #setHospitalUnit(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getAttendance_HospitalUnit()
	 * @model
	 * @generated
	 */
	String getHospitalUnit();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Attendance#getHospitalUnit <em>Hospital Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hospital Unit</em>' attribute.
	 * @see #getHospitalUnit()
	 * @generated
	 */
	void setHospitalUnit(String value);

	/**
	 * Returns the value of the '<em><b>Patient Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Record</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Record</em>' attribute.
	 * @see #setPatientRecord(String)
	 * @see MetamodelExecution.Execution_metamodelPackage#getAttendance_PatientRecord()
	 * @model
	 * @generated
	 */
	String getPatientRecord();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Attendance#getPatientRecord <em>Patient Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Record</em>' attribute.
	 * @see #getPatientRecord()
	 * @generated
	 */
	void setPatientRecord(String value);

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
	 * @see MetamodelExecution.Execution_metamodelPackage#getAttendance_CodeBd()
	 * @model
	 * @generated
	 */
	String getCodeBd();

	/**
	 * Sets the value of the '{@link MetamodelExecution.Attendance#getCodeBd <em>Code Bd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Bd</em>' attribute.
	 * @see #getCodeBd()
	 * @generated
	 */
	void setCodeBd(String value);

} // Attendance
