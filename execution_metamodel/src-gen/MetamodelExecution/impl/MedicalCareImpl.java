/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.MedicalCare;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medical Care</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getCodeMedicalCare <em>Code Medical Care</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getProfessional <em>Professional</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getIdProfessional <em>Id Professional</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getHospitalUnit <em>Hospital Unit</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getPatientRecord <em>Patient Record</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getAge <em>Age</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getSex <em>Sex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicalCareImpl extends MinimalEObjectImpl.Container implements MedicalCare {
	/**
	 * The default value of the '{@link #getCodeMedicalCare() <em>Code Medical Care</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeMedicalCare()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_MEDICAL_CARE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodeMedicalCare() <em>Code Medical Care</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeMedicalCare()
	 * @generated
	 * @ordered
	 */
	protected int codeMedicalCare = CODE_MEDICAL_CARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatient() <em>Patient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected static final String PATIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected String patient = PATIENT_EDEFAULT;

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
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected static final String SEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected String sex = SEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicalCareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.MEDICAL_CARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodeMedicalCare() {
		return codeMedicalCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeMedicalCare(int newCodeMedicalCare) {
		int oldCodeMedicalCare = codeMedicalCare;
		codeMedicalCare = newCodeMedicalCare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICAL_CARE__CODE_MEDICAL_CARE, oldCodeMedicalCare, codeMedicalCare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(String newPatient) {
		String oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAL_CARE__PATIENT,
					oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAL_CARE__PROFESSIONAL,
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
					Execution_metamodelPackage.MEDICAL_CARE__ID_PROFESSIONAL, oldIdProfessional, idProfessional));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICAL_CARE__HOSPITAL_UNIT, oldHospitalUnit, hospitalUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICAL_CARE__PATIENT_RECORD, oldPatientRecord, patientRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAL_CARE__AGE, oldAge,
					age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSex(String newSex) {
		String oldSex = sex;
		sex = newSex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAL_CARE__SEX, oldSex,
					sex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_MEDICAL_CARE:
			return getCodeMedicalCare();
		case Execution_metamodelPackage.MEDICAL_CARE__PATIENT:
			return getPatient();
		case Execution_metamodelPackage.MEDICAL_CARE__PROFESSIONAL:
			return getProfessional();
		case Execution_metamodelPackage.MEDICAL_CARE__ID_PROFESSIONAL:
			return getIdProfessional();
		case Execution_metamodelPackage.MEDICAL_CARE__HOSPITAL_UNIT:
			return getHospitalUnit();
		case Execution_metamodelPackage.MEDICAL_CARE__PATIENT_RECORD:
			return getPatientRecord();
		case Execution_metamodelPackage.MEDICAL_CARE__AGE:
			return getAge();
		case Execution_metamodelPackage.MEDICAL_CARE__SEX:
			return getSex();
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
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_MEDICAL_CARE:
			setCodeMedicalCare((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__PATIENT:
			setPatient((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__PROFESSIONAL:
			setProfessional((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__ID_PROFESSIONAL:
			setIdProfessional((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__HOSPITAL_UNIT:
			setHospitalUnit((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__PATIENT_RECORD:
			setPatientRecord((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__AGE:
			setAge((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__SEX:
			setSex((String) newValue);
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
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_MEDICAL_CARE:
			setCodeMedicalCare(CODE_MEDICAL_CARE_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__PATIENT:
			setPatient(PATIENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__PROFESSIONAL:
			setProfessional(PROFESSIONAL_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__ID_PROFESSIONAL:
			setIdProfessional(ID_PROFESSIONAL_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__HOSPITAL_UNIT:
			setHospitalUnit(HOSPITAL_UNIT_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__PATIENT_RECORD:
			setPatientRecord(PATIENT_RECORD_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__AGE:
			setAge(AGE_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__SEX:
			setSex(SEX_EDEFAULT);
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
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_MEDICAL_CARE:
			return codeMedicalCare != CODE_MEDICAL_CARE_EDEFAULT;
		case Execution_metamodelPackage.MEDICAL_CARE__PATIENT:
			return PATIENT_EDEFAULT == null ? patient != null : !PATIENT_EDEFAULT.equals(patient);
		case Execution_metamodelPackage.MEDICAL_CARE__PROFESSIONAL:
			return PROFESSIONAL_EDEFAULT == null ? professional != null : !PROFESSIONAL_EDEFAULT.equals(professional);
		case Execution_metamodelPackage.MEDICAL_CARE__ID_PROFESSIONAL:
			return idProfessional != ID_PROFESSIONAL_EDEFAULT;
		case Execution_metamodelPackage.MEDICAL_CARE__HOSPITAL_UNIT:
			return HOSPITAL_UNIT_EDEFAULT == null ? hospitalUnit != null : !HOSPITAL_UNIT_EDEFAULT.equals(hospitalUnit);
		case Execution_metamodelPackage.MEDICAL_CARE__PATIENT_RECORD:
			return PATIENT_RECORD_EDEFAULT == null ? patientRecord != null
					: !PATIENT_RECORD_EDEFAULT.equals(patientRecord);
		case Execution_metamodelPackage.MEDICAL_CARE__AGE:
			return age != AGE_EDEFAULT;
		case Execution_metamodelPackage.MEDICAL_CARE__SEX:
			return SEX_EDEFAULT == null ? sex != null : !SEX_EDEFAULT.equals(sex);
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
		result.append(" (codeMedicalCare: ");
		result.append(codeMedicalCare);
		result.append(", patient: ");
		result.append(patient);
		result.append(", professional: ");
		result.append(professional);
		result.append(", idProfessional: ");
		result.append(idProfessional);
		result.append(", hospitalUnit: ");
		result.append(hospitalUnit);
		result.append(", patientRecord: ");
		result.append(patientRecord);
		result.append(", age: ");
		result.append(age);
		result.append(", sex: ");
		result.append(sex);
		result.append(')');
		return result.toString();
	}

} //MedicalCareImpl
