/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.MedicalCare;
import MetamodelExecution.Patient;
import MetamodelExecution.Professional;
import MetamodelExecution.UnitCare;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getProfessional <em>Professional</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getUnitcare <em>Unitcare</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getCid10 <em>Cid10</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getCodeMedicalCare <em>Code Medical Care</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getCodeMedicalCareContiguous <em>Code Medical Care Contiguous</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getCodeBd <em>Code Bd</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getCodeBeneficiary <em>Code Beneficiary</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getCodeAccommodation <em>Code Accommodation</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getCodePatient <em>Code Patient</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getCodeRisk <em>Code Risk</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getCodeProfessional <em>Code Professional</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicalCareImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicalCareImpl extends MinimalEObjectImpl.Container implements MedicalCare {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProfessional() <em>Professional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessional()
	 * @generated
	 * @ordered
	 */
	protected Professional professional;

	/**
	 * The cached value of the '{@link #getUnitcare() <em>Unitcare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitcare()
	 * @generated
	 * @ordered
	 */
	protected UnitCare unitcare;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The default value of the '{@link #getCid10() <em>Cid10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCid10()
	 * @generated
	 * @ordered
	 */
	protected static final String CID10_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCid10() <em>Cid10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCid10()
	 * @generated
	 * @ordered
	 */
	protected String cid10 = CID10_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeMedicalCare() <em>Code Medical Care</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeMedicalCare()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CODE_MEDICAL_CARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeMedicalCare() <em>Code Medical Care</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeMedicalCare()
	 * @generated
	 * @ordered
	 */
	protected BigInteger codeMedicalCare = CODE_MEDICAL_CARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeMedicalCareContiguous() <em>Code Medical Care Contiguous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeMedicalCareContiguous()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CODE_MEDICAL_CARE_CONTIGUOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeMedicalCareContiguous() <em>Code Medical Care Contiguous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeMedicalCareContiguous()
	 * @generated
	 * @ordered
	 */
	protected BigInteger codeMedicalCareContiguous = CODE_MEDICAL_CARE_CONTIGUOUS_EDEFAULT;

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
	 * The default value of the '{@link #getCodeBeneficiary() <em>Code Beneficiary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeBeneficiary()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_BENEFICIARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeBeneficiary() <em>Code Beneficiary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeBeneficiary()
	 * @generated
	 * @ordered
	 */
	protected String codeBeneficiary = CODE_BENEFICIARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeAccommodation() <em>Code Accommodation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeAccommodation()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_ACCOMMODATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeAccommodation() <em>Code Accommodation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeAccommodation()
	 * @generated
	 * @ordered
	 */
	protected String codeAccommodation = CODE_ACCOMMODATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodePatient() <em>Code Patient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePatient()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_PATIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodePatient() <em>Code Patient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePatient()
	 * @generated
	 * @ordered
	 */
	protected String codePatient = CODE_PATIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeRisk() <em>Code Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeRisk()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_RISK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeRisk() <em>Code Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeRisk()
	 * @generated
	 * @ordered
	 */
	protected String codeRisk = CODE_RISK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeProfessional() <em>Code Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeProfessional()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CODE_PROFESSIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeProfessional() <em>Code Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeProfessional()
	 * @generated
	 * @ordered
	 */
	protected BigInteger codeProfessional = CODE_PROFESSIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected String login = LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

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
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAL_CARE__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professional getProfessional() {
		return professional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfessional(Professional newProfessional, NotificationChain msgs) {
		Professional oldProfessional = professional;
		professional = newProfessional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICAL_CARE__PROFESSIONAL, oldProfessional, newProfessional);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfessional(Professional newProfessional) {
		if (newProfessional != professional) {
			NotificationChain msgs = null;
			if (professional != null)
				msgs = ((InternalEObject) professional).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.MEDICAL_CARE__PROFESSIONAL, null, msgs);
			if (newProfessional != null)
				msgs = ((InternalEObject) newProfessional).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.MEDICAL_CARE__PROFESSIONAL, null, msgs);
			msgs = basicSetProfessional(newProfessional, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAL_CARE__PROFESSIONAL,
					newProfessional, newProfessional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitCare getUnitcare() {
		return unitcare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitcare(UnitCare newUnitcare, NotificationChain msgs) {
		UnitCare oldUnitcare = unitcare;
		unitcare = newUnitcare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICAL_CARE__UNITCARE, oldUnitcare, newUnitcare);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitcare(UnitCare newUnitcare) {
		if (newUnitcare != unitcare) {
			NotificationChain msgs = null;
			if (unitcare != null)
				msgs = ((InternalEObject) unitcare).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.MEDICAL_CARE__UNITCARE, null, msgs);
			if (newUnitcare != null)
				msgs = ((InternalEObject) newUnitcare).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.MEDICAL_CARE__UNITCARE, null, msgs);
			msgs = basicSetUnitcare(newUnitcare, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAL_CARE__UNITCARE,
					newUnitcare, newUnitcare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Patient newPatient, NotificationChain msgs) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICAL_CARE__PATIENT, oldPatient, newPatient);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Patient newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject) patient).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.MEDICAL_CARE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject) newPatient).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.MEDICAL_CARE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAL_CARE__PATIENT,
					newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCid10() {
		return cid10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCid10(String newCid10) {
		String oldCid10 = cid10;
		cid10 = newCid10;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAL_CARE__CID10,
					oldCid10, cid10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCodeMedicalCare() {
		return codeMedicalCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeMedicalCare(BigInteger newCodeMedicalCare) {
		BigInteger oldCodeMedicalCare = codeMedicalCare;
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
	public BigInteger getCodeMedicalCareContiguous() {
		return codeMedicalCareContiguous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeMedicalCareContiguous(BigInteger newCodeMedicalCareContiguous) {
		BigInteger oldCodeMedicalCareContiguous = codeMedicalCareContiguous;
		codeMedicalCareContiguous = newCodeMedicalCareContiguous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICAL_CARE__CODE_MEDICAL_CARE_CONTIGUOUS, oldCodeMedicalCareContiguous,
					codeMedicalCareContiguous));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAL_CARE__CODE_BD,
					oldCodeBd, codeBd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeBeneficiary() {
		return codeBeneficiary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeBeneficiary(String newCodeBeneficiary) {
		String oldCodeBeneficiary = codeBeneficiary;
		codeBeneficiary = newCodeBeneficiary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICAL_CARE__CODE_BENEFICIARY, oldCodeBeneficiary, codeBeneficiary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeAccommodation() {
		return codeAccommodation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeAccommodation(String newCodeAccommodation) {
		String oldCodeAccommodation = codeAccommodation;
		codeAccommodation = newCodeAccommodation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICAL_CARE__CODE_ACCOMMODATION, oldCodeAccommodation,
					codeAccommodation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodePatient() {
		return codePatient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodePatient(String newCodePatient) {
		String oldCodePatient = codePatient;
		codePatient = newCodePatient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAL_CARE__CODE_PATIENT,
					oldCodePatient, codePatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeRisk() {
		return codeRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeRisk(String newCodeRisk) {
		String oldCodeRisk = codeRisk;
		codeRisk = newCodeRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAL_CARE__CODE_RISK,
					oldCodeRisk, codeRisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCodeProfessional() {
		return codeProfessional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeProfessional(BigInteger newCodeProfessional) {
		BigInteger oldCodeProfessional = codeProfessional;
		codeProfessional = newCodeProfessional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICAL_CARE__CODE_PROFESSIONAL, oldCodeProfessional, codeProfessional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(String newLogin) {
		String oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAL_CARE__LOGIN,
					oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAL_CARE__PRIORITY,
					oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.MEDICAL_CARE__PROFESSIONAL:
			return basicSetProfessional(null, msgs);
		case Execution_metamodelPackage.MEDICAL_CARE__UNITCARE:
			return basicSetUnitcare(null, msgs);
		case Execution_metamodelPackage.MEDICAL_CARE__PATIENT:
			return basicSetPatient(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.MEDICAL_CARE__ID:
			return getId();
		case Execution_metamodelPackage.MEDICAL_CARE__PROFESSIONAL:
			return getProfessional();
		case Execution_metamodelPackage.MEDICAL_CARE__UNITCARE:
			return getUnitcare();
		case Execution_metamodelPackage.MEDICAL_CARE__PATIENT:
			return getPatient();
		case Execution_metamodelPackage.MEDICAL_CARE__CID10:
			return getCid10();
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_MEDICAL_CARE:
			return getCodeMedicalCare();
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_MEDICAL_CARE_CONTIGUOUS:
			return getCodeMedicalCareContiguous();
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_BD:
			return getCodeBd();
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_BENEFICIARY:
			return getCodeBeneficiary();
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_ACCOMMODATION:
			return getCodeAccommodation();
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_PATIENT:
			return getCodePatient();
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_RISK:
			return getCodeRisk();
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_PROFESSIONAL:
			return getCodeProfessional();
		case Execution_metamodelPackage.MEDICAL_CARE__LOGIN:
			return getLogin();
		case Execution_metamodelPackage.MEDICAL_CARE__PRIORITY:
			return getPriority();
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
		case Execution_metamodelPackage.MEDICAL_CARE__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__PROFESSIONAL:
			setProfessional((Professional) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__UNITCARE:
			setUnitcare((UnitCare) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__PATIENT:
			setPatient((Patient) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CID10:
			setCid10((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_MEDICAL_CARE:
			setCodeMedicalCare((BigInteger) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_MEDICAL_CARE_CONTIGUOUS:
			setCodeMedicalCareContiguous((BigInteger) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_BD:
			setCodeBd((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_BENEFICIARY:
			setCodeBeneficiary((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_ACCOMMODATION:
			setCodeAccommodation((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_PATIENT:
			setCodePatient((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_RISK:
			setCodeRisk((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_PROFESSIONAL:
			setCodeProfessional((BigInteger) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__LOGIN:
			setLogin((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__PRIORITY:
			setPriority((String) newValue);
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
		case Execution_metamodelPackage.MEDICAL_CARE__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__PROFESSIONAL:
			setProfessional((Professional) null);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__UNITCARE:
			setUnitcare((UnitCare) null);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__PATIENT:
			setPatient((Patient) null);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CID10:
			setCid10(CID10_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_MEDICAL_CARE:
			setCodeMedicalCare(CODE_MEDICAL_CARE_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_MEDICAL_CARE_CONTIGUOUS:
			setCodeMedicalCareContiguous(CODE_MEDICAL_CARE_CONTIGUOUS_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_BD:
			setCodeBd(CODE_BD_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_BENEFICIARY:
			setCodeBeneficiary(CODE_BENEFICIARY_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_ACCOMMODATION:
			setCodeAccommodation(CODE_ACCOMMODATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_PATIENT:
			setCodePatient(CODE_PATIENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_RISK:
			setCodeRisk(CODE_RISK_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_PROFESSIONAL:
			setCodeProfessional(CODE_PROFESSIONAL_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__LOGIN:
			setLogin(LOGIN_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAL_CARE__PRIORITY:
			setPriority(PRIORITY_EDEFAULT);
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
		case Execution_metamodelPackage.MEDICAL_CARE__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.MEDICAL_CARE__PROFESSIONAL:
			return professional != null;
		case Execution_metamodelPackage.MEDICAL_CARE__UNITCARE:
			return unitcare != null;
		case Execution_metamodelPackage.MEDICAL_CARE__PATIENT:
			return patient != null;
		case Execution_metamodelPackage.MEDICAL_CARE__CID10:
			return CID10_EDEFAULT == null ? cid10 != null : !CID10_EDEFAULT.equals(cid10);
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_MEDICAL_CARE:
			return CODE_MEDICAL_CARE_EDEFAULT == null ? codeMedicalCare != null
					: !CODE_MEDICAL_CARE_EDEFAULT.equals(codeMedicalCare);
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_MEDICAL_CARE_CONTIGUOUS:
			return CODE_MEDICAL_CARE_CONTIGUOUS_EDEFAULT == null ? codeMedicalCareContiguous != null
					: !CODE_MEDICAL_CARE_CONTIGUOUS_EDEFAULT.equals(codeMedicalCareContiguous);
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_BD:
			return CODE_BD_EDEFAULT == null ? codeBd != null : !CODE_BD_EDEFAULT.equals(codeBd);
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_BENEFICIARY:
			return CODE_BENEFICIARY_EDEFAULT == null ? codeBeneficiary != null
					: !CODE_BENEFICIARY_EDEFAULT.equals(codeBeneficiary);
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_ACCOMMODATION:
			return CODE_ACCOMMODATION_EDEFAULT == null ? codeAccommodation != null
					: !CODE_ACCOMMODATION_EDEFAULT.equals(codeAccommodation);
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_PATIENT:
			return CODE_PATIENT_EDEFAULT == null ? codePatient != null : !CODE_PATIENT_EDEFAULT.equals(codePatient);
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_RISK:
			return CODE_RISK_EDEFAULT == null ? codeRisk != null : !CODE_RISK_EDEFAULT.equals(codeRisk);
		case Execution_metamodelPackage.MEDICAL_CARE__CODE_PROFESSIONAL:
			return CODE_PROFESSIONAL_EDEFAULT == null ? codeProfessional != null
					: !CODE_PROFESSIONAL_EDEFAULT.equals(codeProfessional);
		case Execution_metamodelPackage.MEDICAL_CARE__LOGIN:
			return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
		case Execution_metamodelPackage.MEDICAL_CARE__PRIORITY:
			return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", cid10: ");
		result.append(cid10);
		result.append(", codeMedicalCare: ");
		result.append(codeMedicalCare);
		result.append(", codeMedicalCareContiguous: ");
		result.append(codeMedicalCareContiguous);
		result.append(", codeBd: ");
		result.append(codeBd);
		result.append(", codeBeneficiary: ");
		result.append(codeBeneficiary);
		result.append(", codeAccommodation: ");
		result.append(codeAccommodation);
		result.append(", codePatient: ");
		result.append(codePatient);
		result.append(", codeRisk: ");
		result.append(codeRisk);
		result.append(", codeProfessional: ");
		result.append(codeProfessional);
		result.append(", login: ");
		result.append(login);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //MedicalCareImpl
