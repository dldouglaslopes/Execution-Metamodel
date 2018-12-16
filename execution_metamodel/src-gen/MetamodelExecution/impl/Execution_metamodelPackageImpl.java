/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Access;
import MetamodelExecution.Allergy;
import MetamodelExecution.Answer;
import MetamodelExecution.Audit;
import MetamodelExecution.Bond;
import MetamodelExecution.Comorbidity;
import MetamodelExecution.Complement;
import MetamodelExecution.ComplementaryConducts;
import MetamodelExecution.ComplementaryExamination;
import MetamodelExecution.ComplementaryMedication;
import MetamodelExecution.ComplementaryProcedure;
import MetamodelExecution.Creator;
import MetamodelExecution.EAction;
import MetamodelExecution.EAuxiliaryConduct;
import MetamodelExecution.EDischarge;
import MetamodelExecution.EInformation;
import MetamodelExecution.EPathway;
import MetamodelExecution.EPause;
import MetamodelExecution.EPrescription;
import MetamodelExecution.EProcedure;
import MetamodelExecution.EReferral;
import MetamodelExecution.EStep;
import MetamodelExecution.ETreatment;
import MetamodelExecution.Exam;
import MetamodelExecution.Examination;
import MetamodelExecution.ExaminationPrescribedResource;
import MetamodelExecution.Execution_metamodelFactory;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Executor;
import MetamodelExecution.Internment;
import MetamodelExecution.Justification;
import MetamodelExecution.LastProfessional;
import MetamodelExecution.MedicalCare;
import MetamodelExecution.Medication;
import MetamodelExecution.MedicationPrescribedResource;
import MetamodelExecution.Notification;
import MetamodelExecution.Numeric;
import MetamodelExecution.Option;
import MetamodelExecution.Pathway;
import MetamodelExecution.PatientAge;
import MetamodelExecution.PatientSex;
import MetamodelExecution.PrescribedExamination;
import MetamodelExecution.PrescribedInternment;
import MetamodelExecution.PrescribedMedication;
import MetamodelExecution.PrescribedPrescriptionItem;
import MetamodelExecution.PrescribedProcedure;
import MetamodelExecution.Prescription;
import MetamodelExecution.Procedure;
import MetamodelExecution.ProcedurePrescribedResource;
import MetamodelExecution.Question;
import MetamodelExecution.Request;
import MetamodelExecution.Responsible;
import MetamodelExecution.Result;
import MetamodelExecution.Standard;
import MetamodelExecution.Step;
import MetamodelExecution.Suspension;
import MetamodelExecution.Unit;
import MetamodelExecution.UnitValue;
import MetamodelExecution.User;
import MetamodelExecution.Value;
import MetamodelExecution.Variable;
import MetamodelExecution.VitalSign;
import MetamodelExecution.YesOrNo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Execution_metamodelPackageImpl extends EPackageImpl implements Execution_metamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAuxiliaryConductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDischargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eReferralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePrescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTreatmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescribedExaminationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescribedProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescribedInternmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescribedMedicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescribedPrescriptionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass justificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsibleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yesOrNoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastProfessionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePathwayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathwayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complementaryConductsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalCareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comorbidityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complementaryMedicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complementaryProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationPrescribedResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedurePrescribedResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complementaryExaminationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examinationPrescribedResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientAgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientSexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MetamodelExecution.Execution_metamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Execution_metamodelPackageImpl() {
		super(eNS_URI, Execution_metamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Execution_metamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Execution_metamodelPackage init() {
		if (isInited)
			return (Execution_metamodelPackage) EPackage.Registry.INSTANCE
					.getEPackage(Execution_metamodelPackage.eNS_URI);

		// Obtain or create and register package
		Execution_metamodelPackageImpl theExecution_metamodelPackage = (Execution_metamodelPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Execution_metamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Execution_metamodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theExecution_metamodelPackage.createPackageContents();

		// Initialize created meta-data
		theExecution_metamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExecution_metamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Execution_metamodelPackage.eNS_URI, theExecution_metamodelPackage);
		return theExecution_metamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAuxiliaryConduct() {
		return eAuxiliaryConductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAuxiliaryConduct_Answer() {
		return (EReference) eAuxiliaryConductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEInformation() {
		return eInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDischarge() {
		return eDischargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDischarge_Request() {
		return (EReference) eDischargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEReferral() {
		return eReferralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReferral_Epathway() {
		return (EReference) eReferralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPrescription() {
		return ePrescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPrescription_Text() {
		return (EAttribute) ePrescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPrescription_Prescribedprescriptionitem() {
		return (EReference) ePrescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPrescription_IdsPrescribedMedication() {
		return (EAttribute) ePrescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPrescription_IdsPrescribedPrescriptionItem() {
		return (EAttribute) ePrescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPrescription_Prescription() {
		return (EReference) ePrescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPrescription_Prescribedmedication() {
		return (EReference) ePrescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPrescription_TypePrescription() {
		return (EAttribute) ePrescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPrescription_LastExecutedPrescription() {
		return (EAttribute) ePrescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETreatment() {
		return eTreatmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETreatment_Prescribedexam() {
		return (EReference) eTreatmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETreatment_Prescribedprocedure() {
		return (EReference) eTreatmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETreatment_Prescribedinternment() {
		return (EReference) eTreatmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETreatment_Prescribedmedication() {
		return (EReference) eTreatmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETreatment_IdsPrescribedExamination() {
		return (EAttribute) eTreatmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETreatment_IdsPrescribedProcedure() {
		return (EAttribute) eTreatmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETreatment_IdsPrescribedInternment() {
		return (EAttribute) eTreatmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETreatment_IdsPrescribedMedication() {
		return (EAttribute) eTreatmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExamination() {
		return examinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamination_Id() {
		return (EAttribute) examinationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamination_SideLimb() {
		return (EAttribute) examinationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamination_Quantity() {
		return (EAttribute) examinationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamination_Justification() {
		return (EAttribute) examinationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamination_ClinicalIndication() {
		return (EAttribute) examinationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExamination_Exam() {
		return (EReference) examinationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamination_Category() {
		return (EAttribute) examinationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrescribedExamination() {
		return prescribedExaminationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescribedExamination_Examination() {
		return (EReference) prescribedExaminationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedExamination_Id() {
		return (EAttribute) prescribedExaminationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedExamination_Report() {
		return (EAttribute) prescribedExaminationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedExamination_NumberGuide() {
		return (EAttribute) prescribedExaminationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescribedExamination_Complement() {
		return (EReference) prescribedExaminationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescribedExamination_Prescription() {
		return (EReference) prescribedExaminationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedExamination_Name() {
		return (EAttribute) prescribedExaminationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescribedExamination_Result() {
		return (EReference) prescribedExaminationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExam() {
		return examEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Id() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Code() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Name() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Description() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_OnlyEmergency() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_MemberPeers() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrescribedProcedure() {
		return prescribedProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedProcedure_Id() {
		return (EAttribute) prescribedProcedureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescribedProcedure_Procedure() {
		return (EReference) prescribedProcedureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedProcedure_CodeOrderPrescription() {
		return (EAttribute) prescribedProcedureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedProcedure_CodeOrderPrescriptionPlan() {
		return (EAttribute) prescribedProcedureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrescribedInternment() {
		return prescribedInternmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedInternment_Id() {
		return (EAttribute) prescribedInternmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescribedInternment_Internment() {
		return (EReference) prescribedInternmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedInternment_NumberGuide() {
		return (EAttribute) prescribedInternmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrescribedMedication() {
		return prescribedMedicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedMedication_Id() {
		return (EAttribute) prescribedMedicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedMedication_Result() {
		return (EAttribute) prescribedMedicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescribedMedication_Medication() {
		return (EReference) prescribedMedicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescribedMedication_Prescription() {
		return (EReference) prescribedMedicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplement() {
		return complementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplement_Id() {
		return (EAttribute) complementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplement_SideLimb() {
		return (EAttribute) complementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplement_ClinicalIndication() {
		return (EAttribute) complementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplement_Justification() {
		return (EAttribute) complementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplement_Quantity() {
		return (EAttribute) complementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrescribedPrescriptionItem() {
		return prescribedPrescriptionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedPrescriptionItem_Id() {
		return (EAttribute) prescribedPrescriptionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedPrescriptionItem_ItemPrescription() {
		return (EAttribute) prescribedPrescriptionItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJustification() {
		return justificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJustification_Id() {
		return (EAttribute) justificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJustification_Reason() {
		return (EAttribute) justificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJustification_Description() {
		return (EAttribute) justificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJustification_JustifiedById() {
		return (EAttribute) justificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJustification_JustifiedBy() {
		return (EAttribute) justificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsible() {
		return responsibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Id() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Code() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Email() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_TypeCouncil() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Login() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_NumberCouncil() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_State() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitValue() {
		return unitValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswer() {
		return answerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_Id() {
		return (EAttribute) answerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_Type() {
		return (EAttribute) answerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnswer_Question() {
		return (EReference) answerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_Justification() {
		return (EAttribute) answerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnswer_Unitvalue() {
		return (EReference) answerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumeric() {
		return numericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumeric_Value() {
		return (EAttribute) numericEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYesOrNo() {
		return yesOrNoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYesOrNo_Value() {
		return (EAttribute) yesOrNoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Id() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Type() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Name() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Description() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_IsInitial() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_IsTerminal() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Mandatory() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Audit() {
		return (EReference) stepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreator() {
		return creatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutor() {
		return executorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastProfessional() {
		return lastProfessionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStep() {
		return eStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStep_Id() {
		return (EAttribute) eStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStep_Type() {
		return (EAttribute) eStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStep_IsCurrent() {
		return (EAttribute) eStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStep_Reworked() {
		return (EAttribute) eStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStep_Executed() {
		return (EAttribute) eStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStep_CreationDate() {
		return (EAttribute) eStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStep_ModificationDate() {
		return (EAttribute) eStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStep_ExecutionDate() {
		return (EAttribute) eStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStep_CreatedById() {
		return (EAttribute) eStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStep_ExecutedById() {
		return (EAttribute) eStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStep_Justification() {
		return (EReference) eStepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStep_Step() {
		return (EReference) eStepEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStep_Creator() {
		return (EReference) eStepEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStep_Executor() {
		return (EReference) eStepEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStep_Name() {
		return (EAttribute) eStepEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStep_Previous() {
		return (EAttribute) eStepEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStep_Next() {
		return (EAttribute) eStepEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrescription() {
		return prescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPathway() {
		return ePathwayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPathway_Element() {
		return (EReference) ePathwayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPathway_Id() {
		return (EAttribute) ePathwayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPathway_CreationDate() {
		return (EAttribute) ePathwayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPathway_ConclusionDate() {
		return (EAttribute) ePathwayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPathway_Completed() {
		return (EAttribute) ePathwayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPathway_Aborted() {
		return (EAttribute) ePathwayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPathway_IdsExecutedStep() {
		return (EAttribute) ePathwayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPathway_Responsible() {
		return (EReference) ePathwayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPathway_Lastprofessional() {
		return (EReference) ePathwayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPathway_Name() {
		return (EAttribute) ePathwayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPathway_Justification() {
		return (EReference) ePathwayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPathway_Pathway() {
		return (EReference) ePathwayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPathway_Complementaryconducts() {
		return (EReference) ePathwayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPathway_Medicalcare() {
		return (EReference) ePathwayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPathway_Cid() {
		return (EAttribute) ePathwayEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPathway_TimeExecution() {
		return (EAttribute) ePathwayEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Id() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Text() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Variable() {
		return (EReference) questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Category() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Order() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_NotApplied() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Id() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Weight() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Unit() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Bond() {
		return (EReference) variableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Value() {
		return (EReference) variableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedication() {
		return medicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Unit() {
		return (EReference) medicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Access() {
		return (EReference) medicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Id() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Name() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Code() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Description() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Brand() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Outpatient() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Standard() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_DailyDosage() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Cycles() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Frequency() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_TimeTreatement() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_TimeInterval() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Category() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Id() {
		return (EAttribute) unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Name() {
		return (EAttribute) unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Code() {
		return (EAttribute) unitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Unit() {
		return (EAttribute) unitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccess() {
		return accessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Id() {
		return (EAttribute) accessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Name() {
		return (EAttribute) accessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Code() {
		return (EAttribute) accessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAction() {
		return eActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAction_Request() {
		return (EReference) eActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Id() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_RequestedBy() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Message() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Success() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_RequestDate() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathway() {
		return pathwayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_Id() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_Code() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_Name() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_Version() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_Completed() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathway_Audit() {
		return (EReference) pathwayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEProcedure() {
		return eProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPause() {
		return ePauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedure() {
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedure_Id() {
		return (EAttribute) procedureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedure_Category() {
		return (EAttribute) procedureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedure_Frequency() {
		return (EAttribute) procedureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedure_Quantity() {
		return (EAttribute) procedureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternment() {
		return internmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternment_Id() {
		return (EAttribute) internmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternment_Category() {
		return (EAttribute) internmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternment_Justification() {
		return (EAttribute) internmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternment_ClinicalIndication() {
		return (EAttribute) internmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternment_Quantity() {
		return (EAttribute) internmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplementaryConducts() {
		return complementaryConductsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplementaryConducts_Id() {
		return (EAttribute) complementaryConductsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplementaryConducts_Type() {
		return (EAttribute) complementaryConductsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplementaryConducts_Pathway() {
		return (EAttribute) complementaryConductsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplementaryConducts_CreationDate() {
		return (EAttribute) complementaryConductsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplementaryConducts_Justification() {
		return (EAttribute) complementaryConductsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplementaryConducts_CreatedBy() {
		return (EAttribute) complementaryConductsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplementaryConducts_Resource() {
		return (EAttribute) complementaryConductsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplementaryConducts_Suspension() {
		return (EReference) complementaryConductsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalCare() {
		return medicalCareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalCare_CodeMedicalCare() {
		return (EAttribute) medicalCareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalCare_Pacient() {
		return (EAttribute) medicalCareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalCare_Professional() {
		return (EAttribute) medicalCareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalCare_IdProfessional() {
		return (EAttribute) medicalCareEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalCare_HospitalUnit() {
		return (EAttribute) medicalCareEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalCare_PatientRecord() {
		return (EAttribute) medicalCareEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalCare_Age() {
		return (EAttribute) medicalCareEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalCare_Sex() {
		return (EAttribute) medicalCareEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComorbidity() {
		return comorbidityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComorbidity_Name() {
		return (EAttribute) comorbidityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComorbidity_Id() {
		return (EAttribute) comorbidityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplementaryMedication() {
		return complementaryMedicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplementaryMedication_Prescribedresource() {
		return (EReference) complementaryMedicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplementaryProcedure() {
		return complementaryProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplementaryProcedure_Procedureprescribedresource() {
		return (EReference) complementaryProcedureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuspension() {
		return suspensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationPrescribedResource() {
		return medicationPrescribedResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_Id() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_IdMedication() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_Outpatient() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_Name() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_Brand() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_Code() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_Cycles() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_Category() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_Description() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_TimeInterval() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_DailyDosage() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_Frequency() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_TimeTreatement() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_Medication() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_Unit() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescribedResource_Access() {
		return (EAttribute) medicationPrescribedResourceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescribedResource_Standard() {
		return (EReference) medicationPrescribedResourceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotification() {
		return notificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotification_Id() {
		return (EAttribute) notificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotification_Message() {
		return (EAttribute) notificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotification_RequestDate() {
		return (EAttribute) notificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotification_Success() {
		return (EAttribute) notificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedurePrescribedResource() {
		return procedurePrescribedResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePrescribedResource_Id() {
		return (EAttribute) procedurePrescribedResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePrescribedResource_IdProcedure() {
		return (EAttribute) procedurePrescribedResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePrescribedResource_Quantity() {
		return (EAttribute) procedurePrescribedResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePrescribedResource_Frequency() {
		return (EAttribute) procedurePrescribedResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePrescribedResource_Procedure() {
		return (EAttribute) procedurePrescribedResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePrescribedResource_Category() {
		return (EAttribute) procedurePrescribedResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplementaryExamination() {
		return complementaryExaminationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplementaryExamination_Examinationprescribedresource() {
		return (EReference) complementaryExaminationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudit() {
		return auditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudit_User() {
		return (EAttribute) auditEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudit_Date() {
		return (EAttribute) auditEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResult() {
		return resultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExaminationPrescribedResource() {
		return examinationPrescribedResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPrescribedResource_Id() {
		return (EAttribute) examinationPrescribedResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPrescribedResource_Exam() {
		return (EAttribute) examinationPrescribedResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPrescribedResource_IdExam() {
		return (EAttribute) examinationPrescribedResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPrescribedResource_Justification() {
		return (EAttribute) examinationPrescribedResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPrescribedResource_Category() {
		return (EAttribute) examinationPrescribedResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPrescribedResource_Quantity() {
		return (EAttribute) examinationPrescribedResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPrescribedResource_SideLimb() {
		return (EAttribute) examinationPrescribedResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPrescribedResource_ClinicalIndication() {
		return (EAttribute) examinationPrescribedResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandard() {
		return standardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_Id() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_Mnemonic() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_CodeActiveAgent() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_CodeDiluent() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_NameDiluent() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_CodeEventsDiluent() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_CodeOrderAdmin() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_CodeApresDiluent() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_TypeAccess() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_TypeAdmin() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_QtyDiluent() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_QtyVolume() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_QtyDosage() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_CodeUnitDosage() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_AdminDiluent() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergy() {
		return allergyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllergy_Name() {
		return (EAttribute) allergyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllergy_Id() {
		return (EAttribute) allergyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSign() {
		return vitalSignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVitalSign_Name() {
		return (EAttribute) vitalSignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVitalSign_Id() {
		return (EAttribute) vitalSignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientAge() {
		return patientAgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientSex() {
		return patientSexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatientSex_TruePremise() {
		return (EAttribute) patientSexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBond() {
		return bondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBond_Type() {
		return (EAttribute) bondEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBond_IdBond() {
		return (EAttribute) bondEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Id() {
		return (EAttribute) optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Text() {
		return (EAttribute) optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Weight() {
		return (EAttribute) optionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution_metamodelFactory getExecution_metamodelFactory() {
		return (Execution_metamodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		eAuxiliaryConductEClass = createEClass(EAUXILIARY_CONDUCT);
		createEReference(eAuxiliaryConductEClass, EAUXILIARY_CONDUCT__ANSWER);

		eInformationEClass = createEClass(EINFORMATION);

		eDischargeEClass = createEClass(EDISCHARGE);
		createEReference(eDischargeEClass, EDISCHARGE__REQUEST);

		eReferralEClass = createEClass(EREFERRAL);
		createEReference(eReferralEClass, EREFERRAL__EPATHWAY);

		ePrescriptionEClass = createEClass(EPRESCRIPTION);
		createEAttribute(ePrescriptionEClass, EPRESCRIPTION__TEXT);
		createEReference(ePrescriptionEClass, EPRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM);
		createEAttribute(ePrescriptionEClass, EPRESCRIPTION__IDS_PRESCRIBED_MEDICATION);
		createEAttribute(ePrescriptionEClass, EPRESCRIPTION__IDS_PRESCRIBED_PRESCRIPTION_ITEM);
		createEReference(ePrescriptionEClass, EPRESCRIPTION__PRESCRIPTION);
		createEReference(ePrescriptionEClass, EPRESCRIPTION__PRESCRIBEDMEDICATION);
		createEAttribute(ePrescriptionEClass, EPRESCRIPTION__TYPE_PRESCRIPTION);
		createEAttribute(ePrescriptionEClass, EPRESCRIPTION__LAST_EXECUTED_PRESCRIPTION);

		eTreatmentEClass = createEClass(ETREATMENT);
		createEReference(eTreatmentEClass, ETREATMENT__PRESCRIBEDEXAM);
		createEReference(eTreatmentEClass, ETREATMENT__PRESCRIBEDPROCEDURE);
		createEReference(eTreatmentEClass, ETREATMENT__PRESCRIBEDINTERNMENT);
		createEReference(eTreatmentEClass, ETREATMENT__PRESCRIBEDMEDICATION);
		createEAttribute(eTreatmentEClass, ETREATMENT__IDS_PRESCRIBED_EXAMINATION);
		createEAttribute(eTreatmentEClass, ETREATMENT__IDS_PRESCRIBED_PROCEDURE);
		createEAttribute(eTreatmentEClass, ETREATMENT__IDS_PRESCRIBED_INTERNMENT);
		createEAttribute(eTreatmentEClass, ETREATMENT__IDS_PRESCRIBED_MEDICATION);

		examinationEClass = createEClass(EXAMINATION);
		createEAttribute(examinationEClass, EXAMINATION__ID);
		createEAttribute(examinationEClass, EXAMINATION__SIDE_LIMB);
		createEAttribute(examinationEClass, EXAMINATION__QUANTITY);
		createEAttribute(examinationEClass, EXAMINATION__JUSTIFICATION);
		createEAttribute(examinationEClass, EXAMINATION__CLINICAL_INDICATION);
		createEReference(examinationEClass, EXAMINATION__EXAM);
		createEAttribute(examinationEClass, EXAMINATION__CATEGORY);

		prescribedExaminationEClass = createEClass(PRESCRIBED_EXAMINATION);
		createEReference(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__EXAMINATION);
		createEAttribute(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__ID);
		createEAttribute(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__REPORT);
		createEAttribute(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__NUMBER_GUIDE);
		createEReference(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__COMPLEMENT);
		createEReference(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__PRESCRIPTION);
		createEAttribute(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__NAME);
		createEReference(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__RESULT);

		examEClass = createEClass(EXAM);
		createEAttribute(examEClass, EXAM__ID);
		createEAttribute(examEClass, EXAM__CODE);
		createEAttribute(examEClass, EXAM__NAME);
		createEAttribute(examEClass, EXAM__DESCRIPTION);
		createEAttribute(examEClass, EXAM__ONLY_EMERGENCY);
		createEAttribute(examEClass, EXAM__MEMBER_PEERS);

		prescribedProcedureEClass = createEClass(PRESCRIBED_PROCEDURE);
		createEAttribute(prescribedProcedureEClass, PRESCRIBED_PROCEDURE__ID);
		createEReference(prescribedProcedureEClass, PRESCRIBED_PROCEDURE__PROCEDURE);
		createEAttribute(prescribedProcedureEClass, PRESCRIBED_PROCEDURE__CODE_ORDER_PRESCRIPTION);
		createEAttribute(prescribedProcedureEClass, PRESCRIBED_PROCEDURE__CODE_ORDER_PRESCRIPTION_PLAN);

		prescribedInternmentEClass = createEClass(PRESCRIBED_INTERNMENT);
		createEAttribute(prescribedInternmentEClass, PRESCRIBED_INTERNMENT__ID);
		createEReference(prescribedInternmentEClass, PRESCRIBED_INTERNMENT__INTERNMENT);
		createEAttribute(prescribedInternmentEClass, PRESCRIBED_INTERNMENT__NUMBER_GUIDE);

		prescribedMedicationEClass = createEClass(PRESCRIBED_MEDICATION);
		createEAttribute(prescribedMedicationEClass, PRESCRIBED_MEDICATION__ID);
		createEAttribute(prescribedMedicationEClass, PRESCRIBED_MEDICATION__RESULT);
		createEReference(prescribedMedicationEClass, PRESCRIBED_MEDICATION__MEDICATION);
		createEReference(prescribedMedicationEClass, PRESCRIBED_MEDICATION__PRESCRIPTION);

		complementEClass = createEClass(COMPLEMENT);
		createEAttribute(complementEClass, COMPLEMENT__ID);
		createEAttribute(complementEClass, COMPLEMENT__SIDE_LIMB);
		createEAttribute(complementEClass, COMPLEMENT__CLINICAL_INDICATION);
		createEAttribute(complementEClass, COMPLEMENT__JUSTIFICATION);
		createEAttribute(complementEClass, COMPLEMENT__QUANTITY);

		prescribedPrescriptionItemEClass = createEClass(PRESCRIBED_PRESCRIPTION_ITEM);
		createEAttribute(prescribedPrescriptionItemEClass, PRESCRIBED_PRESCRIPTION_ITEM__ID);
		createEAttribute(prescribedPrescriptionItemEClass, PRESCRIBED_PRESCRIPTION_ITEM__ITEM_PRESCRIPTION);

		justificationEClass = createEClass(JUSTIFICATION);
		createEAttribute(justificationEClass, JUSTIFICATION__ID);
		createEAttribute(justificationEClass, JUSTIFICATION__REASON);
		createEAttribute(justificationEClass, JUSTIFICATION__DESCRIPTION);
		createEAttribute(justificationEClass, JUSTIFICATION__JUSTIFIED_BY_ID);
		createEAttribute(justificationEClass, JUSTIFICATION__JUSTIFIED_BY);

		responsibleEClass = createEClass(RESPONSIBLE);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__ID);
		createEAttribute(userEClass, USER__CODE);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__NAME);
		createEAttribute(userEClass, USER__TYPE_COUNCIL);
		createEAttribute(userEClass, USER__LOGIN);
		createEAttribute(userEClass, USER__NUMBER_COUNCIL);
		createEAttribute(userEClass, USER__STATE);

		unitValueEClass = createEClass(UNIT_VALUE);

		answerEClass = createEClass(ANSWER);
		createEAttribute(answerEClass, ANSWER__ID);
		createEAttribute(answerEClass, ANSWER__TYPE);
		createEReference(answerEClass, ANSWER__QUESTION);
		createEAttribute(answerEClass, ANSWER__JUSTIFICATION);
		createEReference(answerEClass, ANSWER__UNITVALUE);

		numericEClass = createEClass(NUMERIC);
		createEAttribute(numericEClass, NUMERIC__VALUE);

		yesOrNoEClass = createEClass(YES_OR_NO);
		createEAttribute(yesOrNoEClass, YES_OR_NO__VALUE);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__ID);
		createEAttribute(stepEClass, STEP__TYPE);
		createEAttribute(stepEClass, STEP__NAME);
		createEAttribute(stepEClass, STEP__DESCRIPTION);
		createEAttribute(stepEClass, STEP__IS_INITIAL);
		createEAttribute(stepEClass, STEP__IS_TERMINAL);
		createEAttribute(stepEClass, STEP__MANDATORY);
		createEReference(stepEClass, STEP__AUDIT);

		creatorEClass = createEClass(CREATOR);

		executorEClass = createEClass(EXECUTOR);

		lastProfessionalEClass = createEClass(LAST_PROFESSIONAL);

		eStepEClass = createEClass(ESTEP);
		createEAttribute(eStepEClass, ESTEP__ID);
		createEAttribute(eStepEClass, ESTEP__TYPE);
		createEAttribute(eStepEClass, ESTEP__IS_CURRENT);
		createEAttribute(eStepEClass, ESTEP__REWORKED);
		createEAttribute(eStepEClass, ESTEP__EXECUTED);
		createEAttribute(eStepEClass, ESTEP__CREATION_DATE);
		createEAttribute(eStepEClass, ESTEP__MODIFICATION_DATE);
		createEAttribute(eStepEClass, ESTEP__EXECUTION_DATE);
		createEAttribute(eStepEClass, ESTEP__CREATED_BY_ID);
		createEAttribute(eStepEClass, ESTEP__EXECUTED_BY_ID);
		createEReference(eStepEClass, ESTEP__JUSTIFICATION);
		createEReference(eStepEClass, ESTEP__STEP);
		createEReference(eStepEClass, ESTEP__CREATOR);
		createEReference(eStepEClass, ESTEP__EXECUTOR);
		createEAttribute(eStepEClass, ESTEP__NAME);
		createEAttribute(eStepEClass, ESTEP__PREVIOUS);
		createEAttribute(eStepEClass, ESTEP__NEXT);

		prescriptionEClass = createEClass(PRESCRIPTION);

		ePathwayEClass = createEClass(EPATHWAY);
		createEReference(ePathwayEClass, EPATHWAY__ELEMENT);
		createEAttribute(ePathwayEClass, EPATHWAY__ID);
		createEAttribute(ePathwayEClass, EPATHWAY__CREATION_DATE);
		createEAttribute(ePathwayEClass, EPATHWAY__CONCLUSION_DATE);
		createEAttribute(ePathwayEClass, EPATHWAY__COMPLETED);
		createEAttribute(ePathwayEClass, EPATHWAY__ABORTED);
		createEAttribute(ePathwayEClass, EPATHWAY__IDS_EXECUTED_STEP);
		createEReference(ePathwayEClass, EPATHWAY__RESPONSIBLE);
		createEReference(ePathwayEClass, EPATHWAY__LASTPROFESSIONAL);
		createEAttribute(ePathwayEClass, EPATHWAY__NAME);
		createEReference(ePathwayEClass, EPATHWAY__JUSTIFICATION);
		createEReference(ePathwayEClass, EPATHWAY__PATHWAY);
		createEReference(ePathwayEClass, EPATHWAY__COMPLEMENTARYCONDUCTS);
		createEReference(ePathwayEClass, EPATHWAY__MEDICALCARE);
		createEAttribute(ePathwayEClass, EPATHWAY__CID);
		createEAttribute(ePathwayEClass, EPATHWAY__TIME_EXECUTION);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__ID);
		createEAttribute(questionEClass, QUESTION__TEXT);
		createEReference(questionEClass, QUESTION__VARIABLE);
		createEAttribute(questionEClass, QUESTION__CATEGORY);
		createEAttribute(questionEClass, QUESTION__ORDER);
		createEAttribute(questionEClass, QUESTION__NOT_APPLIED);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__ID);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__WEIGHT);
		createEAttribute(variableEClass, VARIABLE__UNIT);
		createEReference(variableEClass, VARIABLE__BOND);
		createEReference(variableEClass, VARIABLE__VALUE);

		medicationEClass = createEClass(MEDICATION);
		createEReference(medicationEClass, MEDICATION__UNIT);
		createEReference(medicationEClass, MEDICATION__ACCESS);
		createEAttribute(medicationEClass, MEDICATION__ID);
		createEAttribute(medicationEClass, MEDICATION__NAME);
		createEAttribute(medicationEClass, MEDICATION__CODE);
		createEAttribute(medicationEClass, MEDICATION__DESCRIPTION);
		createEAttribute(medicationEClass, MEDICATION__BRAND);
		createEAttribute(medicationEClass, MEDICATION__OUTPATIENT);
		createEAttribute(medicationEClass, MEDICATION__STANDARD);
		createEAttribute(medicationEClass, MEDICATION__DAILY_DOSAGE);
		createEAttribute(medicationEClass, MEDICATION__CYCLES);
		createEAttribute(medicationEClass, MEDICATION__FREQUENCY);
		createEAttribute(medicationEClass, MEDICATION__TIME_TREATEMENT);
		createEAttribute(medicationEClass, MEDICATION__TIME_INTERVAL);
		createEAttribute(medicationEClass, MEDICATION__CATEGORY);

		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__ID);
		createEAttribute(unitEClass, UNIT__NAME);
		createEAttribute(unitEClass, UNIT__CODE);
		createEAttribute(unitEClass, UNIT__UNIT);

		accessEClass = createEClass(ACCESS);
		createEAttribute(accessEClass, ACCESS__ID);
		createEAttribute(accessEClass, ACCESS__NAME);
		createEAttribute(accessEClass, ACCESS__CODE);

		eActionEClass = createEClass(EACTION);
		createEReference(eActionEClass, EACTION__REQUEST);

		requestEClass = createEClass(REQUEST);
		createEAttribute(requestEClass, REQUEST__ID);
		createEAttribute(requestEClass, REQUEST__REQUESTED_BY);
		createEAttribute(requestEClass, REQUEST__MESSAGE);
		createEAttribute(requestEClass, REQUEST__SUCCESS);
		createEAttribute(requestEClass, REQUEST__REQUEST_DATE);

		pathwayEClass = createEClass(PATHWAY);
		createEAttribute(pathwayEClass, PATHWAY__ID);
		createEAttribute(pathwayEClass, PATHWAY__CODE);
		createEAttribute(pathwayEClass, PATHWAY__NAME);
		createEAttribute(pathwayEClass, PATHWAY__VERSION);
		createEAttribute(pathwayEClass, PATHWAY__COMPLETED);
		createEReference(pathwayEClass, PATHWAY__AUDIT);

		eProcedureEClass = createEClass(EPROCEDURE);

		ePauseEClass = createEClass(EPAUSE);

		procedureEClass = createEClass(PROCEDURE);
		createEAttribute(procedureEClass, PROCEDURE__ID);
		createEAttribute(procedureEClass, PROCEDURE__CATEGORY);
		createEAttribute(procedureEClass, PROCEDURE__FREQUENCY);
		createEAttribute(procedureEClass, PROCEDURE__QUANTITY);

		internmentEClass = createEClass(INTERNMENT);
		createEAttribute(internmentEClass, INTERNMENT__ID);
		createEAttribute(internmentEClass, INTERNMENT__CATEGORY);
		createEAttribute(internmentEClass, INTERNMENT__JUSTIFICATION);
		createEAttribute(internmentEClass, INTERNMENT__CLINICAL_INDICATION);
		createEAttribute(internmentEClass, INTERNMENT__QUANTITY);

		complementaryConductsEClass = createEClass(COMPLEMENTARY_CONDUCTS);
		createEAttribute(complementaryConductsEClass, COMPLEMENTARY_CONDUCTS__ID);
		createEAttribute(complementaryConductsEClass, COMPLEMENTARY_CONDUCTS__TYPE);
		createEAttribute(complementaryConductsEClass, COMPLEMENTARY_CONDUCTS__PATHWAY);
		createEAttribute(complementaryConductsEClass, COMPLEMENTARY_CONDUCTS__CREATION_DATE);
		createEAttribute(complementaryConductsEClass, COMPLEMENTARY_CONDUCTS__JUSTIFICATION);
		createEAttribute(complementaryConductsEClass, COMPLEMENTARY_CONDUCTS__CREATED_BY);
		createEAttribute(complementaryConductsEClass, COMPLEMENTARY_CONDUCTS__RESOURCE);
		createEReference(complementaryConductsEClass, COMPLEMENTARY_CONDUCTS__SUSPENSION);

		medicalCareEClass = createEClass(MEDICAL_CARE);
		createEAttribute(medicalCareEClass, MEDICAL_CARE__CODE_MEDICAL_CARE);
		createEAttribute(medicalCareEClass, MEDICAL_CARE__PACIENT);
		createEAttribute(medicalCareEClass, MEDICAL_CARE__PROFESSIONAL);
		createEAttribute(medicalCareEClass, MEDICAL_CARE__ID_PROFESSIONAL);
		createEAttribute(medicalCareEClass, MEDICAL_CARE__HOSPITAL_UNIT);
		createEAttribute(medicalCareEClass, MEDICAL_CARE__PATIENT_RECORD);
		createEAttribute(medicalCareEClass, MEDICAL_CARE__AGE);
		createEAttribute(medicalCareEClass, MEDICAL_CARE__SEX);

		comorbidityEClass = createEClass(COMORBIDITY);
		createEAttribute(comorbidityEClass, COMORBIDITY__NAME);
		createEAttribute(comorbidityEClass, COMORBIDITY__ID);

		complementaryMedicationEClass = createEClass(COMPLEMENTARY_MEDICATION);
		createEReference(complementaryMedicationEClass, COMPLEMENTARY_MEDICATION__PRESCRIBEDRESOURCE);

		complementaryProcedureEClass = createEClass(COMPLEMENTARY_PROCEDURE);
		createEReference(complementaryProcedureEClass, COMPLEMENTARY_PROCEDURE__PROCEDUREPRESCRIBEDRESOURCE);

		suspensionEClass = createEClass(SUSPENSION);

		medicationPrescribedResourceEClass = createEClass(MEDICATION_PRESCRIBED_RESOURCE);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__ID);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__ID_MEDICATION);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__OUTPATIENT);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__NAME);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__BRAND);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__CODE);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__CYCLES);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__CATEGORY);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__DESCRIPTION);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__TIME_INTERVAL);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__DAILY_DOSAGE);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__FREQUENCY);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__TIME_TREATEMENT);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__MEDICATION);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__UNIT);
		createEAttribute(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__ACCESS);
		createEReference(medicationPrescribedResourceEClass, MEDICATION_PRESCRIBED_RESOURCE__STANDARD);

		notificationEClass = createEClass(NOTIFICATION);
		createEAttribute(notificationEClass, NOTIFICATION__ID);
		createEAttribute(notificationEClass, NOTIFICATION__MESSAGE);
		createEAttribute(notificationEClass, NOTIFICATION__REQUEST_DATE);
		createEAttribute(notificationEClass, NOTIFICATION__SUCCESS);

		procedurePrescribedResourceEClass = createEClass(PROCEDURE_PRESCRIBED_RESOURCE);
		createEAttribute(procedurePrescribedResourceEClass, PROCEDURE_PRESCRIBED_RESOURCE__ID);
		createEAttribute(procedurePrescribedResourceEClass, PROCEDURE_PRESCRIBED_RESOURCE__ID_PROCEDURE);
		createEAttribute(procedurePrescribedResourceEClass, PROCEDURE_PRESCRIBED_RESOURCE__QUANTITY);
		createEAttribute(procedurePrescribedResourceEClass, PROCEDURE_PRESCRIBED_RESOURCE__FREQUENCY);
		createEAttribute(procedurePrescribedResourceEClass, PROCEDURE_PRESCRIBED_RESOURCE__PROCEDURE);
		createEAttribute(procedurePrescribedResourceEClass, PROCEDURE_PRESCRIBED_RESOURCE__CATEGORY);

		complementaryExaminationEClass = createEClass(COMPLEMENTARY_EXAMINATION);
		createEReference(complementaryExaminationEClass, COMPLEMENTARY_EXAMINATION__EXAMINATIONPRESCRIBEDRESOURCE);

		auditEClass = createEClass(AUDIT);
		createEAttribute(auditEClass, AUDIT__USER);
		createEAttribute(auditEClass, AUDIT__DATE);

		resultEClass = createEClass(RESULT);

		examinationPrescribedResourceEClass = createEClass(EXAMINATION_PRESCRIBED_RESOURCE);
		createEAttribute(examinationPrescribedResourceEClass, EXAMINATION_PRESCRIBED_RESOURCE__ID);
		createEAttribute(examinationPrescribedResourceEClass, EXAMINATION_PRESCRIBED_RESOURCE__EXAM);
		createEAttribute(examinationPrescribedResourceEClass, EXAMINATION_PRESCRIBED_RESOURCE__ID_EXAM);
		createEAttribute(examinationPrescribedResourceEClass, EXAMINATION_PRESCRIBED_RESOURCE__JUSTIFICATION);
		createEAttribute(examinationPrescribedResourceEClass, EXAMINATION_PRESCRIBED_RESOURCE__CATEGORY);
		createEAttribute(examinationPrescribedResourceEClass, EXAMINATION_PRESCRIBED_RESOURCE__QUANTITY);
		createEAttribute(examinationPrescribedResourceEClass, EXAMINATION_PRESCRIBED_RESOURCE__SIDE_LIMB);
		createEAttribute(examinationPrescribedResourceEClass, EXAMINATION_PRESCRIBED_RESOURCE__CLINICAL_INDICATION);

		standardEClass = createEClass(STANDARD);
		createEAttribute(standardEClass, STANDARD__ID);
		createEAttribute(standardEClass, STANDARD__MNEMONIC);
		createEAttribute(standardEClass, STANDARD__CODE_ACTIVE_AGENT);
		createEAttribute(standardEClass, STANDARD__CODE_DILUENT);
		createEAttribute(standardEClass, STANDARD__NAME_DILUENT);
		createEAttribute(standardEClass, STANDARD__CODE_EVENTS_DILUENT);
		createEAttribute(standardEClass, STANDARD__CODE_ORDER_ADMIN);
		createEAttribute(standardEClass, STANDARD__CODE_APRES_DILUENT);
		createEAttribute(standardEClass, STANDARD__TYPE_ACCESS);
		createEAttribute(standardEClass, STANDARD__TYPE_ADMIN);
		createEAttribute(standardEClass, STANDARD__QTY_DILUENT);
		createEAttribute(standardEClass, STANDARD__QTY_VOLUME);
		createEAttribute(standardEClass, STANDARD__QTY_DOSAGE);
		createEAttribute(standardEClass, STANDARD__CODE_UNIT_DOSAGE);
		createEAttribute(standardEClass, STANDARD__ADMIN_DILUENT);

		allergyEClass = createEClass(ALLERGY);
		createEAttribute(allergyEClass, ALLERGY__NAME);
		createEAttribute(allergyEClass, ALLERGY__ID);

		vitalSignEClass = createEClass(VITAL_SIGN);
		createEAttribute(vitalSignEClass, VITAL_SIGN__NAME);
		createEAttribute(vitalSignEClass, VITAL_SIGN__ID);

		patientAgeEClass = createEClass(PATIENT_AGE);

		patientSexEClass = createEClass(PATIENT_SEX);
		createEAttribute(patientSexEClass, PATIENT_SEX__TRUE_PREMISE);

		bondEClass = createEClass(BOND);
		createEAttribute(bondEClass, BOND__TYPE);
		createEAttribute(bondEClass, BOND__ID_BOND);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__ID);
		createEAttribute(optionEClass, OPTION__TEXT);
		createEAttribute(optionEClass, OPTION__WEIGHT);

		valueEClass = createEClass(VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eAuxiliaryConductEClass.getESuperTypes().add(this.getEStep());
		eInformationEClass.getESuperTypes().add(this.getEStep());
		eDischargeEClass.getESuperTypes().add(this.getEStep());
		eReferralEClass.getESuperTypes().add(this.getEStep());
		ePrescriptionEClass.getESuperTypes().add(this.getEStep());
		eTreatmentEClass.getESuperTypes().add(this.getEStep());
		responsibleEClass.getESuperTypes().add(this.getUser());
		unitValueEClass.getESuperTypes().add(this.getValue());
		numericEClass.getESuperTypes().add(this.getUnitValue());
		yesOrNoEClass.getESuperTypes().add(this.getUnitValue());
		creatorEClass.getESuperTypes().add(this.getUser());
		executorEClass.getESuperTypes().add(this.getUser());
		lastProfessionalEClass.getESuperTypes().add(this.getUser());
		prescriptionEClass.getESuperTypes().add(this.getNotification());
		eActionEClass.getESuperTypes().add(this.getEStep());
		eProcedureEClass.getESuperTypes().add(this.getEStep());
		ePauseEClass.getESuperTypes().add(this.getEStep());
		comorbidityEClass.getESuperTypes().add(this.getBond());
		complementaryMedicationEClass.getESuperTypes().add(this.getComplementaryConducts());
		complementaryProcedureEClass.getESuperTypes().add(this.getComplementaryConducts());
		suspensionEClass.getESuperTypes().add(this.getNotification());
		complementaryExaminationEClass.getESuperTypes().add(this.getComplementaryConducts());
		resultEClass.getESuperTypes().add(this.getNotification());
		allergyEClass.getESuperTypes().add(this.getBond());
		vitalSignEClass.getESuperTypes().add(this.getBond());
		patientAgeEClass.getESuperTypes().add(this.getBond());
		patientSexEClass.getESuperTypes().add(this.getBond());
		optionEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(eAuxiliaryConductEClass, EAuxiliaryConduct.class, "EAuxiliaryConduct", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAuxiliaryConduct_Answer(), this.getAnswer(), null, "answer", null, 0, -1,
				EAuxiliaryConduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eInformationEClass, EInformation.class, "EInformation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eDischargeEClass, EDischarge.class, "EDischarge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDischarge_Request(), this.getRequest(), null, "request", null, 1, 1, EDischarge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eReferralEClass, EReferral.class, "EReferral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEReferral_Epathway(), this.getEPathway(), null, "epathway", null, 1, 1, EReferral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ePrescriptionEClass, EPrescription.class, "EPrescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPrescription_Text(), ecorePackage.getEString(), "text", null, 0, 1, EPrescription.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPrescription_Prescribedprescriptionitem(), this.getPrescribedPrescriptionItem(), null,
				"prescribedprescriptionitem", null, 0, -1, EPrescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPrescription_IdsPrescribedMedication(), ecorePackage.getEInt(), "idsPrescribedMedication",
				null, 0, -1, EPrescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPrescription_IdsPrescribedPrescriptionItem(), ecorePackage.getEInt(),
				"idsPrescribedPrescriptionItem", null, 0, -1, EPrescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPrescription_Prescription(), this.getPrescription(), null, "prescription", null, 1, 1,
				EPrescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPrescription_Prescribedmedication(), this.getPrescribedMedication(), null,
				"prescribedmedication", null, 0, -1, EPrescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPrescription_TypePrescription(), ecorePackage.getEString(), "typePrescription", null, 0, 1,
				EPrescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPrescription_LastExecutedPrescription(), ecorePackage.getEString(),
				"lastExecutedPrescription", null, 0, 1, EPrescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eTreatmentEClass, ETreatment.class, "ETreatment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getETreatment_Prescribedexam(), this.getPrescribedExamination(), null, "prescribedexam", null, 0,
				-1, ETreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getETreatment_Prescribedprocedure(), this.getPrescribedProcedure(), null, "prescribedprocedure",
				null, 0, -1, ETreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getETreatment_Prescribedinternment(), this.getPrescribedInternment(), null,
				"prescribedinternment", null, 0, -1, ETreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getETreatment_Prescribedmedication(), this.getPrescribedMedication(), null,
				"prescribedmedication", null, 0, -1, ETreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETreatment_IdsPrescribedExamination(), ecorePackage.getEInt(), "idsPrescribedExamination",
				null, 0, -1, ETreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETreatment_IdsPrescribedProcedure(), ecorePackage.getEInt(), "idsPrescribedProcedure", null,
				0, -1, ETreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getETreatment_IdsPrescribedInternment(), ecorePackage.getEInt(), "idsPrescribedInternment", null,
				0, -1, ETreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getETreatment_IdsPrescribedMedication(), ecorePackage.getEInt(), "idsPrescribedMedication", null,
				0, -1, ETreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(examinationEClass, Examination.class, "Examination", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExamination_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Examination.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamination_SideLimb(), ecorePackage.getEString(), "sideLimb", null, 0, 1, Examination.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamination_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Examination.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamination_Justification(), ecorePackage.getEString(), "justification", null, 0, 1,
				Examination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamination_ClinicalIndication(), ecorePackage.getEString(), "clinicalIndication", null, 0, 1,
				Examination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getExamination_Exam(), this.getExam(), null, "exam", null, 1, 1, Examination.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamination_Category(), ecorePackage.getEString(), "category", null, 0, 1, Examination.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prescribedExaminationEClass, PrescribedExamination.class, "PrescribedExamination", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrescribedExamination_Examination(), this.getExamination(), null, "examination", null, 1, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescribedExamination_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescribedExamination_Report(), ecorePackage.getEString(), "report", null, 0, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescribedExamination_NumberGuide(), ecorePackage.getEInt(), "numberGuide", null, 0, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescribedExamination_Complement(), this.getComplement(), null, "complement", null, 1, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescribedExamination_Prescription(), this.getPrescription(), null, "prescription", null, 1,
				1, PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescribedExamination_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescribedExamination_Result(), this.getResult(), null, "result", null, 1, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examEClass, Exam.class, "Exam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExam_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Code(), ecorePackage.getEInt(), "code", null, 0, 1, Exam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Name(), ecorePackage.getEString(), "name", null, 0, 1, Exam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Description(), ecorePackage.getEString(), "description", null, 0, 1, Exam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_OnlyEmergency(), ecorePackage.getEBoolean(), "onlyEmergency", null, 0, 1, Exam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_MemberPeers(), ecorePackage.getEBoolean(), "memberPeers", null, 0, 1, Exam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prescribedProcedureEClass, PrescribedProcedure.class, "PrescribedProcedure", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrescribedProcedure_Id(), ecorePackage.getEInt(), "id", null, 0, 1, PrescribedProcedure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescribedProcedure_Procedure(), this.getProcedure(), null, "procedure", null, 1, 1,
				PrescribedProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescribedProcedure_CodeOrderPrescription(), ecorePackage.getEInt(), "codeOrderPrescription",
				null, 0, 1, PrescribedProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescribedProcedure_CodeOrderPrescriptionPlan(), ecorePackage.getEInt(),
				"codeOrderPrescriptionPlan", null, 0, 1, PrescribedProcedure.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prescribedInternmentEClass, PrescribedInternment.class, "PrescribedInternment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrescribedInternment_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				PrescribedInternment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescribedInternment_Internment(), this.getInternment(), null, "internment", null, 1, 1,
				PrescribedInternment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescribedInternment_NumberGuide(), ecorePackage.getEInt(), "numberGuide", null, 0, 1,
				PrescribedInternment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prescribedMedicationEClass, PrescribedMedication.class, "PrescribedMedication", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrescribedMedication_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				PrescribedMedication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescribedMedication_Result(), ecorePackage.getEString(), "result", null, 0, 1,
				PrescribedMedication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescribedMedication_Medication(), this.getMedication(), null, "medication", null, 1, 1,
				PrescribedMedication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescribedMedication_Prescription(), this.getPrescription(), null, "prescription", null, 1, 1,
				PrescribedMedication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complementEClass, Complement.class, "Complement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplement_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Complement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplement_SideLimb(), ecorePackage.getEString(), "sideLimb", null, 0, 1, Complement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplement_ClinicalIndication(), ecorePackage.getEString(), "clinicalIndication", null, 0, 1,
				Complement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplement_Justification(), ecorePackage.getEString(), "justification", null, 0, 1,
				Complement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplement_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Complement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prescribedPrescriptionItemEClass, PrescribedPrescriptionItem.class, "PrescribedPrescriptionItem",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrescribedPrescriptionItem_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				PrescribedPrescriptionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescribedPrescriptionItem_ItemPrescription(), ecorePackage.getEInt(), "itemPrescription",
				null, 0, 1, PrescribedPrescriptionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(justificationEClass, Justification.class, "Justification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJustification_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Justification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJustification_Reason(), ecorePackage.getEString(), "reason", null, 0, 1, Justification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJustification_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJustification_JustifiedById(), ecorePackage.getEInt(), "justifiedById", null, 0, 1,
				Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJustification_JustifiedBy(), ecorePackage.getEString(), "justifiedBy", null, 0, 1,
				Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(responsibleEClass, Responsible.class, "Responsible", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Id(), ecorePackage.getEInt(), "id", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Code(), ecorePackage.getEInt(), "code", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Email(), ecorePackage.getEString(), "email", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_TypeCouncil(), ecorePackage.getEString(), "typeCouncil", null, 0, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Login(), ecorePackage.getEString(), "login", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_NumberCouncil(), ecorePackage.getEInt(), "numberCouncil", null, 0, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_State(), ecorePackage.getEString(), "state", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitValueEClass, UnitValue.class, "UnitValue", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(answerEClass, Answer.class, "Answer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnswer_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_Type(), ecorePackage.getEString(), "type", null, 0, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnswer_Question(), this.getQuestion(), null, "question", null, 1, 1, Answer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_Justification(), ecorePackage.getEString(), "justification", null, 0, 1, Answer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnswer_Unitvalue(), this.getUnitValue(), null, "unitvalue", null, 0, 1, Answer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericEClass, Numeric.class, "Numeric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumeric_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Numeric.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yesOrNoEClass, YesOrNo.class, "YesOrNo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYesOrNo_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, YesOrNo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Type(), ecorePackage.getEString(), "type", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Description(), ecorePackage.getEString(), "description", null, 0, 1, Step.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 0, 1, Step.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_IsTerminal(), ecorePackage.getEBoolean(), "isTerminal", null, 0, 1, Step.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 0, 1, Step.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Audit(), this.getAudit(), null, "audit", null, 1, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(creatorEClass, Creator.class, "Creator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executorEClass, Executor.class, "Executor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(lastProfessionalEClass, LastProfessional.class, "LastProfessional", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eStepEClass, EStep.class, "EStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStep_Id(), ecorePackage.getEInt(), "id", null, 0, 1, EStep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStep_Type(), ecorePackage.getEString(), "type", null, 0, 1, EStep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStep_IsCurrent(), ecorePackage.getEBoolean(), "isCurrent", "false", 0, 1, EStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStep_Reworked(), ecorePackage.getEBoolean(), "reworked", "false", 0, 1, EStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStep_Executed(), ecorePackage.getEBoolean(), "executed", "false", 0, 1, EStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStep_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, EStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStep_ModificationDate(), ecorePackage.getEDate(), "modificationDate", null, 0, 1,
				EStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEStep_ExecutionDate(), ecorePackage.getEDate(), "executionDate", null, 0, 1, EStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStep_CreatedById(), ecorePackage.getEInt(), "createdById", null, 0, 1, EStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStep_ExecutedById(), ecorePackage.getEInt(), "executedById", null, 0, 1, EStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStep_Justification(), this.getJustification(), null, "justification", null, 1, 1,
				EStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStep_Step(), this.getStep(), null, "step", null, 1, 1, EStep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEStep_Creator(), this.getCreator(), null, "creator", null, 1, 1, EStep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEStep_Executor(), this.getExecutor(), null, "executor", null, 1, 1, EStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, EStep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStep_Previous(), ecorePackage.getEString(), "previous", null, 0, 1, EStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStep_Next(), ecorePackage.getEString(), "next", null, 0, 1, EStep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prescriptionEClass, Prescription.class, "Prescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ePathwayEClass, EPathway.class, "EPathway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEPathway_Element(), this.getEStep(), null, "element", null, 0, -1, EPathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPathway_Id(), ecorePackage.getEInt(), "id", null, 0, 1, EPathway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPathway_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, EPathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPathway_ConclusionDate(), ecorePackage.getEDate(), "conclusionDate", null, 0, 1,
				EPathway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPathway_Completed(), ecorePackage.getEBoolean(), "completed", "false", 0, 1, EPathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPathway_Aborted(), ecorePackage.getEBoolean(), "aborted", null, 0, 1, EPathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPathway_IdsExecutedStep(), ecorePackage.getEInt(), "idsExecutedStep", null, 0, -1,
				EPathway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEPathway_Responsible(), this.getResponsible(), null, "responsible", null, 1, 1,
				EPathway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPathway_Lastprofessional(), this.getLastProfessional(), null, "lastprofessional", null, 1, 1,
				EPathway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPathway_Name(), ecorePackage.getEString(), "name", null, 0, 1, EPathway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPathway_Justification(), this.getJustification(), null, "justification", null, 1, 1,
				EPathway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPathway_Pathway(), this.getPathway(), null, "pathway", null, 1, 1, EPathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPathway_Complementaryconducts(), this.getComplementaryConducts(), null,
				"complementaryconducts", null, 0, -1, EPathway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPathway_Medicalcare(), this.getMedicalCare(), null, "medicalcare", null, 1, 1,
				EPathway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPathway_Cid(), ecorePackage.getEString(), "cid", null, 0, 1, EPathway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPathway_TimeExecution(), ecorePackage.getEDouble(), "timeExecution", null, 0, 1,
				EPathway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Question.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Text(), ecorePackage.getEString(), "text", null, 0, 1, Question.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Variable(), this.getVariable(), null, "variable", null, 1, 1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Category(), ecorePackage.getEString(), "category", null, 0, 1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Order(), ecorePackage.getEInt(), "order", null, 0, 1, Question.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_NotApplied(), ecorePackage.getEBoolean(), "notApplied", null, 0, 1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), ecorePackage.getEString(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Bond(), this.getBond(), null, "bond", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getVariable_Value(), this.getValue(), null, "value", null, 0, -1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(medicationEClass, Medication.class, "Medication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMedication_Unit(), this.getUnit(), null, "unit", null, 1, 1, Medication.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMedication_Access(), this.getAccess(), null, "access", null, 1, 1, Medication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Medication.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_Name(), ecorePackage.getEString(), "name", null, 0, 1, Medication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_Code(), ecorePackage.getEString(), "code", null, 0, 1, Medication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Medication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_Brand(), ecorePackage.getEString(), "brand", null, 0, 1, Medication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_Outpatient(), ecorePackage.getEBoolean(), "outpatient", null, 0, 1,
				Medication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_Standard(), ecorePackage.getEString(), "standard", null, 0, 1, Medication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_DailyDosage(), ecorePackage.getEInt(), "dailyDosage", null, 0, 1, Medication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_Cycles(), ecorePackage.getEInt(), "cycles", null, 0, 1, Medication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_Frequency(), ecorePackage.getEInt(), "frequency", null, 0, 1, Medication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_TimeTreatement(), ecorePackage.getEInt(), "timeTreatement", null, 0, 1,
				Medication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_TimeInterval(), ecorePackage.getEInt(), "timeInterval", null, 0, 1,
				Medication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_Category(), ecorePackage.getEString(), "category", null, 0, 1, Medication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, Unit.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Code(), ecorePackage.getEString(), "code", null, 0, 1, Unit.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Unit.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessEClass, Access.class, "Access", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccess_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Access.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccess_Name(), ecorePackage.getEString(), "name", null, 0, 1, Access.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccess_Code(), ecorePackage.getEInt(), "code", null, 0, 1, Access.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eActionEClass, EAction.class, "EAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAction_Request(), this.getRequest(), null, "request", null, 1, 1, EAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequest_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Request.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_RequestedBy(), ecorePackage.getEInt(), "requestedBy", null, 0, 1, Request.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Message(), ecorePackage.getEString(), "message", null, 0, 1, Request.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Success(), ecorePackage.getEBoolean(), "success", null, 0, 1, Request.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_RequestDate(), ecorePackage.getEDate(), "requestDate", null, 0, 1, Request.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathwayEClass, Pathway.class, "Pathway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPathway_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Pathway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_Code(), ecorePackage.getEString(), "code", null, 0, 1, Pathway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pathway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_Version(), ecorePackage.getEInt(), "version", null, 0, 1, Pathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_Completed(), ecorePackage.getEBoolean(), "completed", null, 0, 1, Pathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathway_Audit(), this.getAudit(), null, "audit", null, 1, 1, Pathway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eProcedureEClass, EProcedure.class, "EProcedure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ePauseEClass, EPause.class, "EPause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcedure_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Procedure.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedure_Category(), ecorePackage.getEString(), "category", null, 0, 1, Procedure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedure_Frequency(), ecorePackage.getEString(), "frequency", null, 0, 1, Procedure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedure_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Procedure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internmentEClass, Internment.class, "Internment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternment_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Internment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternment_Category(), ecorePackage.getEString(), "category", null, 0, 1, Internment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternment_Justification(), ecorePackage.getEString(), "justification", null, 0, 1,
				Internment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternment_ClinicalIndication(), ecorePackage.getEString(), "clinicalIndication", null, 0, 1,
				Internment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternment_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Internment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complementaryConductsEClass, ComplementaryConducts.class, "ComplementaryConducts", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplementaryConducts_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				ComplementaryConducts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplementaryConducts_Type(), ecorePackage.getEString(), "type", null, 0, 1,
				ComplementaryConducts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplementaryConducts_Pathway(), ecorePackage.getEString(), "pathway", null, 0, 1,
				ComplementaryConducts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplementaryConducts_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1,
				ComplementaryConducts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplementaryConducts_Justification(), ecorePackage.getEString(), "justification", null, 0, 1,
				ComplementaryConducts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplementaryConducts_CreatedBy(), ecorePackage.getEString(), "createdBy", null, 0, 1,
				ComplementaryConducts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplementaryConducts_Resource(), ecorePackage.getEString(), "resource", null, 0, 1,
				ComplementaryConducts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplementaryConducts_Suspension(), this.getSuspension(), null, "suspension", null, 0, 1,
				ComplementaryConducts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(medicalCareEClass, MedicalCare.class, "MedicalCare", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedicalCare_CodeMedicalCare(), ecorePackage.getEInt(), "codeMedicalCare", null, 0, 1,
				MedicalCare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicalCare_Pacient(), ecorePackage.getEString(), "pacient", null, 0, 1, MedicalCare.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicalCare_Professional(), ecorePackage.getEString(), "professional", null, 0, 1,
				MedicalCare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicalCare_IdProfessional(), ecorePackage.getEInt(), "idProfessional", null, 0, 1,
				MedicalCare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicalCare_HospitalUnit(), ecorePackage.getEString(), "hospitalUnit", null, 0, 1,
				MedicalCare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicalCare_PatientRecord(), ecorePackage.getEString(), "patientRecord", null, 0, 1,
				MedicalCare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicalCare_Age(), ecorePackage.getEInt(), "age", null, 0, 1, MedicalCare.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicalCare_Sex(), ecorePackage.getEString(), "sex", null, 0, 1, MedicalCare.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comorbidityEClass, Comorbidity.class, "Comorbidity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComorbidity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Comorbidity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComorbidity_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Comorbidity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complementaryMedicationEClass, ComplementaryMedication.class, "ComplementaryMedication",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplementaryMedication_Prescribedresource(), this.getMedicationPrescribedResource(), null,
				"prescribedresource", null, 0, 1, ComplementaryMedication.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complementaryProcedureEClass, ComplementaryProcedure.class, "ComplementaryProcedure", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplementaryProcedure_Procedureprescribedresource(), this.getProcedurePrescribedResource(),
				null, "procedureprescribedresource", null, 0, 1, ComplementaryProcedure.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(suspensionEClass, Suspension.class, "Suspension", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(medicationPrescribedResourceEClass, MedicationPrescribedResource.class,
				"MedicationPrescribedResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedicationPrescribedResource_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_IdMedication(), ecorePackage.getEInt(), "idMedication", null, 0,
				1, MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_Outpatient(), ecorePackage.getEBoolean(), "outpatient", null, 0,
				1, MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_Brand(), ecorePackage.getEString(), "brand", null, 0, 1,
				MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_Code(), ecorePackage.getEString(), "code", null, 0, 1,
				MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_Cycles(), ecorePackage.getEInt(), "cycles", null, 0, 1,
				MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_Category(), ecorePackage.getEString(), "category", null, 0, 1,
				MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_Description(), ecorePackage.getEString(), "description", null, 0,
				1, MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_TimeInterval(), ecorePackage.getEInt(), "timeInterval", null, 0,
				1, MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_DailyDosage(), ecorePackage.getEInt(), "dailyDosage", null, 0, 1,
				MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_Frequency(), ecorePackage.getEInt(), "frequency", null, 0, 1,
				MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_TimeTreatement(), ecorePackage.getEInt(), "timeTreatement", null,
				0, 1, MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_Medication(), ecorePackage.getEString(), "medication", null, 0,
				1, MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_Unit(), ecorePackage.getEString(), "unit", null, 0, 1,
				MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationPrescribedResource_Access(), ecorePackage.getEString(), "access", null, 0, 1,
				MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedicationPrescribedResource_Standard(), this.getStandard(), null, "standard", null, 0, 1,
				MedicationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationEClass, Notification.class, "Notification", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotification_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Notification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotification_Message(), ecorePackage.getEString(), "message", null, 0, 1, Notification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotification_RequestDate(), ecorePackage.getEDate(), "requestDate", null, 0, 1,
				Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotification_Success(), ecorePackage.getEBoolean(), "success", null, 0, 1, Notification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedurePrescribedResourceEClass, ProcedurePrescribedResource.class, "ProcedurePrescribedResource",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcedurePrescribedResource_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				ProcedurePrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedurePrescribedResource_IdProcedure(), ecorePackage.getEInt(), "idProcedure", null, 0, 1,
				ProcedurePrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedurePrescribedResource_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1,
				ProcedurePrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedurePrescribedResource_Frequency(), ecorePackage.getEInt(), "frequency", null, 0, 1,
				ProcedurePrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedurePrescribedResource_Procedure(), ecorePackage.getEString(), "procedure", null, 0, 1,
				ProcedurePrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcedurePrescribedResource_Category(), ecorePackage.getEString(), "category", null, 0, 1,
				ProcedurePrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complementaryExaminationEClass, ComplementaryExamination.class, "ComplementaryExamination",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplementaryExamination_Examinationprescribedresource(),
				this.getExaminationPrescribedResource(), null, "examinationprescribedresource", null, 0, 1,
				ComplementaryExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditEClass, Audit.class, "Audit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudit_User(), ecorePackage.getEString(), "user", null, 0, 1, Audit.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudit_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Audit.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultEClass, Result.class, "Result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(examinationPrescribedResourceEClass, ExaminationPrescribedResource.class,
				"ExaminationPrescribedResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExaminationPrescribedResource_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				ExaminationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPrescribedResource_Exam(), ecorePackage.getEString(), "exam", null, 0, 1,
				ExaminationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPrescribedResource_IdExam(), ecorePackage.getEInt(), "idExam", null, 0, 1,
				ExaminationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPrescribedResource_Justification(), ecorePackage.getEString(), "justification",
				null, 0, 1, ExaminationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPrescribedResource_Category(), ecorePackage.getEString(), "category", null, 0, 1,
				ExaminationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPrescribedResource_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1,
				ExaminationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPrescribedResource_SideLimb(), ecorePackage.getEString(), "sideLimb", null, 0, 1,
				ExaminationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPrescribedResource_ClinicalIndication(), ecorePackage.getEString(),
				"clinicalIndication", null, 0, 1, ExaminationPrescribedResource.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardEClass, Standard.class, "Standard", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandard_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Standard.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_Mnemonic(), ecorePackage.getEString(), "mnemonic", null, 0, 1, Standard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_CodeActiveAgent(), ecorePackage.getEInt(), "codeActiveAgent", null, 0, 1,
				Standard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_CodeDiluent(), ecorePackage.getEInt(), "codeDiluent", null, 0, 1, Standard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_NameDiluent(), ecorePackage.getEString(), "nameDiluent", null, 0, 1, Standard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_CodeEventsDiluent(), ecorePackage.getEInt(), "codeEventsDiluent", null, 0, 1,
				Standard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_CodeOrderAdmin(), ecorePackage.getEInt(), "codeOrderAdmin", null, 0, 1,
				Standard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_CodeApresDiluent(), ecorePackage.getEString(), "codeApresDiluent", null, 0, 1,
				Standard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_TypeAccess(), ecorePackage.getEString(), "typeAccess", null, 0, 1, Standard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_TypeAdmin(), ecorePackage.getEString(), "typeAdmin", null, 0, 1, Standard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_QtyDiluent(), ecorePackage.getEInt(), "qtyDiluent", null, 0, 1, Standard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_QtyVolume(), ecorePackage.getEInt(), "qtyVolume", null, 0, 1, Standard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_QtyDosage(), ecorePackage.getEInt(), "qtyDosage", null, 0, 1, Standard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_CodeUnitDosage(), ecorePackage.getEString(), "codeUnitDosage", null, 0, 1,
				Standard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_AdminDiluent(), ecorePackage.getEString(), "adminDiluent", null, 0, 1,
				Standard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(allergyEClass, Allergy.class, "Allergy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllergy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Allergy.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllergy_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Allergy.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vitalSignEClass, VitalSign.class, "VitalSign", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVitalSign_Name(), ecorePackage.getEString(), "name", null, 0, 1, VitalSign.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVitalSign_Id(), ecorePackage.getEInt(), "id", null, 0, 1, VitalSign.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientAgeEClass, PatientAge.class, "PatientAge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(patientSexEClass, PatientSex.class, "PatientSex", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatientSex_TruePremise(), ecorePackage.getEBoolean(), "truePremise", null, 0, 1,
				PatientSex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(bondEClass, Bond.class, "Bond", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBond_Type(), ecorePackage.getEString(), "type", null, 0, 1, Bond.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBond_IdBond(), ecorePackage.getEInt(), "idBond", null, 0, 1, Bond.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Option.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Text(), ecorePackage.getEString(), "text", null, 0, 1, Option.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, Option.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Execution_metamodelPackageImpl
