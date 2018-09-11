/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Execution_metamodelFactoryImpl extends EFactoryImpl implements Execution_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Execution_metamodelFactory init() {
		try {
			Execution_metamodelFactory theExecution_metamodelFactory = (Execution_metamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(Execution_metamodelPackage.eNS_URI);
			if (theExecution_metamodelFactory != null) {
				return theExecution_metamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Execution_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution_metamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Execution_metamodelPackage.EAUXILIARY_CONDUCT:
			return createEAuxiliaryConduct();
		case Execution_metamodelPackage.EINFORMATION:
			return createEInformation();
		case Execution_metamodelPackage.EDISCHARGE:
			return createEDischarge();
		case Execution_metamodelPackage.EREFERRAL:
			return createEReferral();
		case Execution_metamodelPackage.EPRESCRIPTION:
			return createEPrescription();
		case Execution_metamodelPackage.ETREATMENT:
			return createETreatment();
		case Execution_metamodelPackage.EXAMINATION:
			return createExamination();
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION:
			return createPrescribedExamination();
		case Execution_metamodelPackage.EXAM:
			return createExam();
		case Execution_metamodelPackage.PRESCRIBED_PROCEDURE:
			return createPrescribedProcedure();
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT:
			return createPrescribedInternment();
		case Execution_metamodelPackage.PRESCRIBED_MEDICATION:
			return createPrescribedMedication();
		case Execution_metamodelPackage.COMPLEMENT:
			return createComplement();
		case Execution_metamodelPackage.PRESCRIBED_PRESCRIPTION_ITEM:
			return createPrescribedPrescriptionItem();
		case Execution_metamodelPackage.JUSTIFICATION:
			return createJustification();
		case Execution_metamodelPackage.RESPONSIBLE:
			return createResponsible();
		case Execution_metamodelPackage.ANSWER:
			return createAnswer();
		case Execution_metamodelPackage.NUMERIC:
			return createNumeric();
		case Execution_metamodelPackage.YES_OR_NO:
			return createYesOrNo();
		case Execution_metamodelPackage.STEP:
			return createStep();
		case Execution_metamodelPackage.CREATOR:
			return createCreator();
		case Execution_metamodelPackage.EXECUTOR:
			return createExecutor();
		case Execution_metamodelPackage.LAST_PROFESSIONAL:
			return createLastProfessional();
		case Execution_metamodelPackage.PRESCRIPTION:
			return createPrescription();
		case Execution_metamodelPackage.EPATHWAY:
			return createEPathway();
		case Execution_metamodelPackage.QUESTION:
			return createQuestion();
		case Execution_metamodelPackage.VARIABLE:
			return createVariable();
		case Execution_metamodelPackage.MEDICATION:
			return createMedication();
		case Execution_metamodelPackage.UNIT:
			return createUnit();
		case Execution_metamodelPackage.ACCESS:
			return createAccess();
		case Execution_metamodelPackage.BOND:
			return createBond();
		case Execution_metamodelPackage.EACTION:
			return createEAction();
		case Execution_metamodelPackage.REQUEST:
			return createRequest();
		case Execution_metamodelPackage.PATHWAY:
			return createPathway();
		case Execution_metamodelPackage.EPROCEDURE:
			return createEProcedure();
		case Execution_metamodelPackage.EPAUSE:
			return createEPause();
		case Execution_metamodelPackage.MEDICAL_CARE:
			return createMedicalCare();
		case Execution_metamodelPackage.UNIT_CARE:
			return createUnitCare();
		case Execution_metamodelPackage.PROFESSIONAL:
			return createProfessional();
		case Execution_metamodelPackage.PATIENT:
			return createPatient();
		case Execution_metamodelPackage.ALLERGY_REGISTRY:
			return createAllergyRegistry();
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY:
			return createComorbidityRegistry();
		case Execution_metamodelPackage.ALLERGY:
			return createAllergy();
		case Execution_metamodelPackage.PROCEDURE:
			return createProcedure();
		case Execution_metamodelPackage.INTERNMENT:
			return createInternment();
		case Execution_metamodelPackage.ATTENDANCE:
			return createAttendance();
		case Execution_metamodelPackage.COMORBIDITY:
			return createComorbidity();
		case Execution_metamodelPackage.COMPLEMENTARY_MEDICATION:
			return createComplementaryMedication();
		case Execution_metamodelPackage.COMPLEMENTARY_PROCEDURE:
			return createComplementaryProcedure();
		case Execution_metamodelPackage.SUSPENSION:
			return createSuspension();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE:
			return createMedicationPrescribedResource();
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE:
			return createProcedurePrescribedResource();
		case Execution_metamodelPackage.COMPLEMENTARY_EXAMINATION:
			return createComplementaryExamination();
		case Execution_metamodelPackage.COMPLEMENTARY_ITEM_PRESCRIPTION:
			return createComplementaryItemPrescription();
		case Execution_metamodelPackage.AUDIT:
			return createAudit();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAuxiliaryConduct createEAuxiliaryConduct() {
		EAuxiliaryConductImpl eAuxiliaryConduct = new EAuxiliaryConductImpl();
		return eAuxiliaryConduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EInformation createEInformation() {
		EInformationImpl eInformation = new EInformationImpl();
		return eInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDischarge createEDischarge() {
		EDischargeImpl eDischarge = new EDischargeImpl();
		return eDischarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReferral createEReferral() {
		EReferralImpl eReferral = new EReferralImpl();
		return eReferral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPrescription createEPrescription() {
		EPrescriptionImpl ePrescription = new EPrescriptionImpl();
		return ePrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETreatment createETreatment() {
		ETreatmentImpl eTreatment = new ETreatmentImpl();
		return eTreatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Examination createExamination() {
		ExaminationImpl examination = new ExaminationImpl();
		return examination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescribedExamination createPrescribedExamination() {
		PrescribedExaminationImpl prescribedExamination = new PrescribedExaminationImpl();
		return prescribedExamination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam createExam() {
		ExamImpl exam = new ExamImpl();
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescribedProcedure createPrescribedProcedure() {
		PrescribedProcedureImpl prescribedProcedure = new PrescribedProcedureImpl();
		return prescribedProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescribedInternment createPrescribedInternment() {
		PrescribedInternmentImpl prescribedInternment = new PrescribedInternmentImpl();
		return prescribedInternment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescribedMedication createPrescribedMedication() {
		PrescribedMedicationImpl prescribedMedication = new PrescribedMedicationImpl();
		return prescribedMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complement createComplement() {
		ComplementImpl complement = new ComplementImpl();
		return complement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescribedPrescriptionItem createPrescribedPrescriptionItem() {
		PrescribedPrescriptionItemImpl prescribedPrescriptionItem = new PrescribedPrescriptionItemImpl();
		return prescribedPrescriptionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Justification createJustification() {
		JustificationImpl justification = new JustificationImpl();
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsible createResponsible() {
		ResponsibleImpl responsible = new ResponsibleImpl();
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer createAnswer() {
		AnswerImpl answer = new AnswerImpl();
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Numeric createNumeric() {
		NumericImpl numeric = new NumericImpl();
		return numeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNo createYesOrNo() {
		YesOrNoImpl yesOrNo = new YesOrNoImpl();
		return yesOrNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creator createCreator() {
		CreatorImpl creator = new CreatorImpl();
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor createExecutor() {
		ExecutorImpl executor = new ExecutorImpl();
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastProfessional createLastProfessional() {
		LastProfessionalImpl lastProfessional = new LastProfessionalImpl();
		return lastProfessional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prescription createPrescription() {
		PrescriptionImpl prescription = new PrescriptionImpl();
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPathway createEPathway() {
		EPathwayImpl ePathway = new EPathwayImpl();
		return ePathway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Access createAccess() {
		AccessImpl access = new AccessImpl();
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bond createBond() {
		BondImpl bond = new BondImpl();
		return bond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAction createEAction() {
		EActionImpl eAction = new EActionImpl();
		return eAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pathway createPathway() {
		PathwayImpl pathway = new PathwayImpl();
		return pathway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EProcedure createEProcedure() {
		EProcedureImpl eProcedure = new EProcedureImpl();
		return eProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPause createEPause() {
		EPauseImpl ePause = new EPauseImpl();
		return ePause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalCare createMedicalCare() {
		MedicalCareImpl medicalCare = new MedicalCareImpl();
		return medicalCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitCare createUnitCare() {
		UnitCareImpl unitCare = new UnitCareImpl();
		return unitCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professional createProfessional() {
		ProfessionalImpl professional = new ProfessionalImpl();
		return professional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyRegistry createAllergyRegistry() {
		AllergyRegistryImpl allergyRegistry = new AllergyRegistryImpl();
		return allergyRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComorbidityRegistry createComorbidityRegistry() {
		ComorbidityRegistryImpl comorbidityRegistry = new ComorbidityRegistryImpl();
		return comorbidityRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allergy createAllergy() {
		AllergyImpl allergy = new AllergyImpl();
		return allergy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Internment createInternment() {
		InternmentImpl internment = new InternmentImpl();
		return internment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attendance createAttendance() {
		AttendanceImpl attendance = new AttendanceImpl();
		return attendance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comorbidity createComorbidity() {
		ComorbidityImpl comorbidity = new ComorbidityImpl();
		return comorbidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplementaryMedication createComplementaryMedication() {
		ComplementaryMedicationImpl complementaryMedication = new ComplementaryMedicationImpl();
		return complementaryMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplementaryProcedure createComplementaryProcedure() {
		ComplementaryProcedureImpl complementaryProcedure = new ComplementaryProcedureImpl();
		return complementaryProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suspension createSuspension() {
		SuspensionImpl suspension = new SuspensionImpl();
		return suspension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPrescribedResource createMedicationPrescribedResource() {
		MedicationPrescribedResourceImpl medicationPrescribedResource = new MedicationPrescribedResourceImpl();
		return medicationPrescribedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePrescribedResource createProcedurePrescribedResource() {
		ProcedurePrescribedResourceImpl procedurePrescribedResource = new ProcedurePrescribedResourceImpl();
		return procedurePrescribedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplementaryExamination createComplementaryExamination() {
		ComplementaryExaminationImpl complementaryExamination = new ComplementaryExaminationImpl();
		return complementaryExamination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplementaryItemPrescription createComplementaryItemPrescription() {
		ComplementaryItemPrescriptionImpl complementaryItemPrescription = new ComplementaryItemPrescriptionImpl();
		return complementaryItemPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Audit createAudit() {
		AuditImpl audit = new AuditImpl();
		return audit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution_metamodelPackage getExecution_metamodelPackage() {
		return (Execution_metamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Execution_metamodelPackage getPackage() {
		return Execution_metamodelPackage.eINSTANCE;
	}

} //Execution_metamodelFactoryImpl
