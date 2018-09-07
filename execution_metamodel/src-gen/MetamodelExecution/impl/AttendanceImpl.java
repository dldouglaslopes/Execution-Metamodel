/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Attendance;
import MetamodelExecution.Execution_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attendance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.AttendanceImpl#getCodeAttendance <em>Code Attendance</em>}</li>
 *   <li>{@link MetamodelExecution.impl.AttendanceImpl#getPacient <em>Pacient</em>}</li>
 *   <li>{@link MetamodelExecution.impl.AttendanceImpl#getProfessional <em>Professional</em>}</li>
 *   <li>{@link MetamodelExecution.impl.AttendanceImpl#getIdProfessional <em>Id Professional</em>}</li>
 *   <li>{@link MetamodelExecution.impl.AttendanceImpl#getHospitalUnit <em>Hospital Unit</em>}</li>
 *   <li>{@link MetamodelExecution.impl.AttendanceImpl#getPatientRecord <em>Patient Record</em>}</li>
 *   <li>{@link MetamodelExecution.impl.AttendanceImpl#getCodeBd <em>Code Bd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttendanceImpl extends MinimalEObjectImpl.Container implements Attendance {
	/**
	 * The default value of the '{@link #getCodeAttendance() <em>Code Attendance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeAttendance()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_ATTENDANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodeAttendance() <em>Code Attendance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeAttendance()
	 * @generated
	 * @ordered
	 */
	protected int codeAttendance = CODE_ATTENDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacient() <em>Pacient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacient()
	 * @generated
	 * @ordered
	 */
	protected static final String PACIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacient() <em>Pacient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacient()
	 * @generated
	 * @ordered
	 */
	protected String pacient = PACIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfessional() <em>Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessional()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFESSIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfessional() <em>Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessional()
	 * @generated
	 * @ordered
	 */
	protected String professional = PROFESSIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdProfessional() <em>Id Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProfessional()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PROFESSIONAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdProfessional() <em>Id Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProfessional()
	 * @generated
	 * @ordered
	 */
	protected int idProfessional = ID_PROFESSIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHospitalUnit() <em>Hospital Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSPITAL_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHospitalUnit() <em>Hospital Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalUnit()
	 * @generated
	 * @ordered
	 */
	protected String hospitalUnit = HOSPITAL_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatientRecord() <em>Patient Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientRecord()
	 * @generated
	 * @ordered
	 */
	protected static final String PATIENT_RECORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatientRecord() <em>Patient Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientRecord()
	 * @generated
	 * @ordered
	 */
	protected String patientRecord = PATIENT_RECORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeBd() <em>Code Bd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeBd()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_BD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeBd() <em>Code Bd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeBd()
	 * @generated
	 * @ordered
	 */
	protected String codeBd = CODE_BD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttendanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.ATTENDANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodeAttendance() {
		return codeAttendance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeAttendance(int newCodeAttendance) {
		int oldCodeAttendance = codeAttendance;
		codeAttendance = newCodeAttendance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.ATTENDANCE__CODE_ATTENDANCE, oldCodeAttendance, codeAttendance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPacient() {
		return pacient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacient(String newPacient) {
		String oldPacient = pacient;
		pacient = newPacient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ATTENDANCE__PACIENT,
					oldPacient, pacient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfessional() {
		return professional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfessional(String newProfessional) {
		String oldProfessional = professional;
		professional = newProfessional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ATTENDANCE__PROFESSIONAL,
					oldProfessional, professional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdProfessional() {
		return idProfessional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdProfessional(int newIdProfessional) {
		int oldIdProfessional = idProfessional;
		idProfessional = newIdProfessional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.ATTENDANCE__ID_PROFESSIONAL, oldIdProfessional, idProfessional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHospitalUnit() {
		return hospitalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHospitalUnit(String newHospitalUnit) {
		String oldHospitalUnit = hospitalUnit;
		hospitalUnit = newHospitalUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ATTENDANCE__HOSPITAL_UNIT,
					oldHospitalUnit, hospitalUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPatientRecord() {
		return patientRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatientRecord(String newPatientRecord) {
		String oldPatientRecord = patientRecord;
		patientRecord = newPatientRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ATTENDANCE__PATIENT_RECORD,
					oldPatientRecord, patientRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeBd() {
		return codeBd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeBd(String newCodeBd) {
		String oldCodeBd = codeBd;
		codeBd = newCodeBd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ATTENDANCE__CODE_BD,
					oldCodeBd, codeBd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.ATTENDANCE__CODE_ATTENDANCE:
			return getCodeAttendance();
		case Execution_metamodelPackage.ATTENDANCE__PACIENT:
			return getPacient();
		case Execution_metamodelPackage.ATTENDANCE__PROFESSIONAL:
			return getProfessional();
		case Execution_metamodelPackage.ATTENDANCE__ID_PROFESSIONAL:
			return getIdProfessional();
		case Execution_metamodelPackage.ATTENDANCE__HOSPITAL_UNIT:
			return getHospitalUnit();
		case Execution_metamodelPackage.ATTENDANCE__PATIENT_RECORD:
			return getPatientRecord();
		case Execution_metamodelPackage.ATTENDANCE__CODE_BD:
			return getCodeBd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Execution_metamodelPackage.ATTENDANCE__CODE_ATTENDANCE:
			setCodeAttendance((Integer) newValue);
			return;
		case Execution_metamodelPackage.ATTENDANCE__PACIENT:
			setPacient((String) newValue);
			return;
		case Execution_metamodelPackage.ATTENDANCE__PROFESSIONAL:
			setProfessional((String) newValue);
			return;
		case Execution_metamodelPackage.ATTENDANCE__ID_PROFESSIONAL:
			setIdProfessional((Integer) newValue);
			return;
		case Execution_metamodelPackage.ATTENDANCE__HOSPITAL_UNIT:
			setHospitalUnit((String) newValue);
			return;
		case Execution_metamodelPackage.ATTENDANCE__PATIENT_RECORD:
			setPatientRecord((String) newValue);
			return;
		case Execution_metamodelPackage.ATTENDANCE__CODE_BD:
			setCodeBd((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Execution_metamodelPackage.ATTENDANCE__CODE_ATTENDANCE:
			setCodeAttendance(CODE_ATTENDANCE_EDEFAULT);
			return;
		case Execution_metamodelPackage.ATTENDANCE__PACIENT:
			setPacient(PACIENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.ATTENDANCE__PROFESSIONAL:
			setProfessional(PROFESSIONAL_EDEFAULT);
			return;
		case Execution_metamodelPackage.ATTENDANCE__ID_PROFESSIONAL:
			setIdProfessional(ID_PROFESSIONAL_EDEFAULT);
			return;
		case Execution_metamodelPackage.ATTENDANCE__HOSPITAL_UNIT:
			setHospitalUnit(HOSPITAL_UNIT_EDEFAULT);
			return;
		case Execution_metamodelPackage.ATTENDANCE__PATIENT_RECORD:
			setPatientRecord(PATIENT_RECORD_EDEFAULT);
			return;
		case Execution_metamodelPackage.ATTENDANCE__CODE_BD:
			setCodeBd(CODE_BD_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Execution_metamodelPackage.ATTENDANCE__CODE_ATTENDANCE:
			return codeAttendance != CODE_ATTENDANCE_EDEFAULT;
		case Execution_metamodelPackage.ATTENDANCE__PACIENT:
			return PACIENT_EDEFAULT == null ? pacient != null : !PACIENT_EDEFAULT.equals(pacient);
		case Execution_metamodelPackage.ATTENDANCE__PROFESSIONAL:
			return PROFESSIONAL_EDEFAULT == null ? professional != null : !PROFESSIONAL_EDEFAULT.equals(professional);
		case Execution_metamodelPackage.ATTENDANCE__ID_PROFESSIONAL:
			return idProfessional != ID_PROFESSIONAL_EDEFAULT;
		case Execution_metamodelPackage.ATTENDANCE__HOSPITAL_UNIT:
			return HOSPITAL_UNIT_EDEFAULT == null ? hospitalUnit != null : !HOSPITAL_UNIT_EDEFAULT.equals(hospitalUnit);
		case Execution_metamodelPackage.ATTENDANCE__PATIENT_RECORD:
			return PATIENT_RECORD_EDEFAULT == null ? patientRecord != null
					: !PATIENT_RECORD_EDEFAULT.equals(patientRecord);
		case Execution_metamodelPackage.ATTENDANCE__CODE_BD:
			return CODE_BD_EDEFAULT == null ? codeBd != null : !CODE_BD_EDEFAULT.equals(codeBd);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (codeAttendance: ");
		result.append(codeAttendance);
		result.append(", pacient: ");
		result.append(pacient);
		result.append(", professional: ");
		result.append(professional);
		result.append(", idProfessional: ");
		result.append(idProfessional);
		result.append(", hospitalUnit: ");
		result.append(hospitalUnit);
		result.append(", patientRecord: ");
		result.append(patientRecord);
		result.append(", codeBd: ");
		result.append(codeBd);
		result.append(')');
		return result.toString();
	}

} //AttendanceImpl
