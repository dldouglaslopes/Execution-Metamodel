/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Answer;
import MetamodelExecution.AuxiliaryConduct;
import MetamodelExecution.Complement;
import MetamodelExecution.Creator;
import MetamodelExecution.Discharge;
import MetamodelExecution.Exam;
import MetamodelExecution.Examination;
import MetamodelExecution.ExaminationPrescription;
import MetamodelExecution.ExecutedStep;
import MetamodelExecution.Execution;
import MetamodelExecution.Execution_metamodelFactory;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Executor;
import MetamodelExecution.Information;
import MetamodelExecution.Justification;
import MetamodelExecution.LastProfessional;
import MetamodelExecution.Next;
import MetamodelExecution.Numeric;
import MetamodelExecution.Pathway;
import MetamodelExecution.PrescribedExamination;
import MetamodelExecution.PrescribedInternment;
import MetamodelExecution.PrescribedMedicament;
import MetamodelExecution.PrescribedMedication;
import MetamodelExecution.PrescribedPrescriptionItem;
import MetamodelExecution.PrescribedProcedure;
import MetamodelExecution.Prescription;
import MetamodelExecution.Previous;
import MetamodelExecution.Question;
import MetamodelExecution.Referral;
import MetamodelExecution.Responsible;
import MetamodelExecution.ShortExecution;
import MetamodelExecution.Step;
import MetamodelExecution.Treatment;
import MetamodelExecution.User;
import MetamodelExecution.Value;
import MetamodelExecution.Variable;
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
	private EClass auxiliaryConductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referralEClass = null;

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
	private EClass treatmentEClass = null;

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
	private EClass previousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextEClass = null;

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
	private EClass examinationPrescriptionEClass = null;

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
	private EClass prescribedMedicamentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortExecutionEClass = null;

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
	private EClass pathwayEClass = null;

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
	private EClass executedStepEClass = null;

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
	private EClass valueEClass = null;

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
	private EClass executionEClass = null;

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
	public EClass getAuxiliaryConduct() {
		return auxiliaryConductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryConduct_Answer() {
		return (EReference) auxiliaryConductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformation() {
		return informationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischarge() {
		return dischargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferral() {
		return referralEClass;
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
	public EAttribute getPrescription_Text() {
		return (EAttribute) prescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescription_Prescribedmedicament() {
		return (EReference) prescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescription_Prescribedprescriptionitem() {
		return (EReference) prescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescription_Prescription() {
		return (EAttribute) prescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreatment() {
		return treatmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreatment_Prescribedexam() {
		return (EReference) treatmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreatment_Prescribedprocedure() {
		return (EReference) treatmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreatment_Prescribedinternment() {
		return (EReference) treatmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreatment_Prescribedmedication() {
		return (EReference) treatmentEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getExamination_Url() {
		return (EAttribute) examinationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamination_IdExam() {
		return (EAttribute) examinationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamination_SideMember() {
		return (EAttribute) examinationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamination_Quantity() {
		return (EAttribute) examinationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamination_Justify() {
		return (EAttribute) examinationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamination_ClinicalIndication() {
		return (EAttribute) examinationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamination_SideMemberDisplay() {
		return (EAttribute) examinationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExamination_Exam() {
		return (EReference) examinationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrevious() {
		return previousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrevious_Url() {
		return (EAttribute) previousEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrevious_UrlAbsolute() {
		return (EAttribute) previousEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNext() {
		return nextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNext_UrlAbsolute() {
		return (EAttribute) nextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNext_Url() {
		return (EAttribute) nextEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getQuestion_Url() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Text() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Variable() {
		return (EReference) questionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_IdCategory() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Category() {
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
	public EAttribute getVariable_TypeVerbose() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Url() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Weight() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Link() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Value() {
		return (EReference) variableEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getPrescribedExamination_Result() {
		return (EAttribute) prescribedExaminationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedExamination_Report() {
		return (EAttribute) prescribedExaminationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescribedExamination_NumberGuide() {
		return (EAttribute) prescribedExaminationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescribedExamination_Examinationprescription() {
		return (EReference) prescribedExaminationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescribedExamination_Complement() {
		return (EReference) prescribedExaminationEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getExam_Url() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Code() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Name() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Description() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_OnlyEmergency() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_MemberPeers() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(6);
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
	public EClass getPrescribedInternment() {
		return prescribedInternmentEClass;
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
	public EClass getExaminationPrescription() {
		return examinationPrescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPrescription_Id() {
		return (EAttribute) examinationPrescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPrescription_Success() {
		return (EAttribute) examinationPrescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPrescription_Message() {
		return (EAttribute) examinationPrescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPrescription_RequestDate() {
		return (EAttribute) examinationPrescriptionEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getComplement_SideMember() {
		return (EAttribute) complementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplement_SideMemberDisplay() {
		return (EAttribute) complementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplement_Quantity() {
		return (EAttribute) complementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplement_ClinicalIndication() {
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
	public EClass getPrescribedMedicament() {
		return prescribedMedicamentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortExecution() {
		return shortExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortExecution_ConclusionDate() {
		return (EAttribute) shortExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortExecution_Completed() {
		return (EAttribute) shortExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortExecution_Aborted() {
		return (EAttribute) shortExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortExecution_LastExecutedStepDate() {
		return (EAttribute) shortExecutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShortExecution_Pathway() {
		return (EReference) shortExecutionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortExecution_IdResponsible() {
		return (EAttribute) shortExecutionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortExecution_IdLastProfessional() {
		return (EAttribute) shortExecutionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShortExecution_Responsible() {
		return (EReference) shortExecutionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShortExecution_Executedstep() {
		return (EReference) shortExecutionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShortExecution_Lastprofessional() {
		return (EReference) shortExecutionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortExecution_CreationDate() {
		return (EAttribute) shortExecutionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortExecution_IdPathway() {
		return (EAttribute) shortExecutionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortExecution_Id() {
		return (EAttribute) shortExecutionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortExecution_Url() {
		return (EAttribute) shortExecutionEClass.getEStructuralFeatures().get(13);
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
	public EAttribute getJustification_ReasonDisplay() {
		return (EAttribute) justificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJustification_Description() {
		return (EAttribute) justificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJustification_JustifiedById() {
		return (EAttribute) justificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJustification_JustifiedBy() {
		return (EAttribute) justificationEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getPathway_Url() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_Code() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_Name() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_IdRepository() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_Version() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_Completed() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(6);
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
	public EClass getExecutedStep() {
		return executedStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_CreatedById() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_CreatedBy() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_ExecutedById() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_ExecutedBy() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_Step() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_Executed() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_IdStep() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_Reworked() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_CreationDate() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_TypeVerbose() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_IsCurrent() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_IdPathway() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_Type() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_ExecutionDate() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_IdExecutedProtocol() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedStep_ChangeDate() {
		return (EAttribute) executedStepEClass.getEStructuralFeatures().get(15);
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
	public EAttribute getUser_Url() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Code() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Email() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_TypeCouncil() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Login() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_NumberCouncil() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_State() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(8);
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
	public EClass getAnswer() {
		return answerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_TypeVerbose() {
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
	public EAttribute getAnswer_Id() {
		return (EAttribute) answerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnswer_Value() {
		return (EReference) answerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnswer_Question() {
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
	public EAttribute getStep_TypeVerbose() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Url() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Name() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Description() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_IsInitial() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_IsTerminal() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Mandatory() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(8);
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
	public EClass getExecution() {
		return executionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_Id() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_Type() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_TypeVerbose() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_Url() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_IsCurrent() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_Reworked() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_Executed() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_CreationDate() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_ChangeDate() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_ExecutionDate() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_CreatedById() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_ExecutedById() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_IdStep() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_IdPathway() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_IdExecutedPathway() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Justification() {
		return (EReference) executionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Step() {
		return (EReference) executionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Previous() {
		return (EReference) executionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Next() {
		return (EReference) executionEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Creator() {
		return (EReference) executionEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Executor() {
		return (EReference) executionEClass.getEStructuralFeatures().get(20);
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
		auxiliaryConductEClass = createEClass(AUXILIARY_CONDUCT);
		createEReference(auxiliaryConductEClass, AUXILIARY_CONDUCT__ANSWER);

		informationEClass = createEClass(INFORMATION);

		dischargeEClass = createEClass(DISCHARGE);

		referralEClass = createEClass(REFERRAL);

		prescriptionEClass = createEClass(PRESCRIPTION);
		createEAttribute(prescriptionEClass, PRESCRIPTION__TEXT);
		createEReference(prescriptionEClass, PRESCRIPTION__PRESCRIBEDMEDICAMENT);
		createEReference(prescriptionEClass, PRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM);
		createEAttribute(prescriptionEClass, PRESCRIPTION__PRESCRIPTION);

		treatmentEClass = createEClass(TREATMENT);
		createEReference(treatmentEClass, TREATMENT__PRESCRIBEDEXAM);
		createEReference(treatmentEClass, TREATMENT__PRESCRIBEDPROCEDURE);
		createEReference(treatmentEClass, TREATMENT__PRESCRIBEDINTERNMENT);
		createEReference(treatmentEClass, TREATMENT__PRESCRIBEDMEDICATION);

		examinationEClass = createEClass(EXAMINATION);
		createEAttribute(examinationEClass, EXAMINATION__ID);
		createEAttribute(examinationEClass, EXAMINATION__URL);
		createEAttribute(examinationEClass, EXAMINATION__ID_EXAM);
		createEAttribute(examinationEClass, EXAMINATION__SIDE_MEMBER);
		createEAttribute(examinationEClass, EXAMINATION__QUANTITY);
		createEAttribute(examinationEClass, EXAMINATION__JUSTIFY);
		createEAttribute(examinationEClass, EXAMINATION__CLINICAL_INDICATION);
		createEAttribute(examinationEClass, EXAMINATION__SIDE_MEMBER_DISPLAY);
		createEReference(examinationEClass, EXAMINATION__EXAM);

		previousEClass = createEClass(PREVIOUS);
		createEAttribute(previousEClass, PREVIOUS__URL);
		createEAttribute(previousEClass, PREVIOUS__URL_ABSOLUTE);

		nextEClass = createEClass(NEXT);
		createEAttribute(nextEClass, NEXT__URL_ABSOLUTE);
		createEAttribute(nextEClass, NEXT__URL);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__ID);
		createEAttribute(questionEClass, QUESTION__URL);
		createEAttribute(questionEClass, QUESTION__TEXT);
		createEReference(questionEClass, QUESTION__VARIABLE);
		createEAttribute(questionEClass, QUESTION__ID_CATEGORY);
		createEAttribute(questionEClass, QUESTION__CATEGORY);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__ID);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEAttribute(variableEClass, VARIABLE__TYPE_VERBOSE);
		createEAttribute(variableEClass, VARIABLE__URL);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__WEIGHT);
		createEAttribute(variableEClass, VARIABLE__LINK);
		createEReference(variableEClass, VARIABLE__VALUE);

		prescribedExaminationEClass = createEClass(PRESCRIBED_EXAMINATION);
		createEReference(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__EXAMINATION);
		createEAttribute(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__ID);
		createEAttribute(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__RESULT);
		createEAttribute(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__REPORT);
		createEAttribute(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__NUMBER_GUIDE);
		createEReference(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__EXAMINATIONPRESCRIPTION);
		createEReference(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__COMPLEMENT);

		examEClass = createEClass(EXAM);
		createEAttribute(examEClass, EXAM__ID);
		createEAttribute(examEClass, EXAM__URL);
		createEAttribute(examEClass, EXAM__CODE);
		createEAttribute(examEClass, EXAM__NAME);
		createEAttribute(examEClass, EXAM__DESCRIPTION);
		createEAttribute(examEClass, EXAM__ONLY_EMERGENCY);
		createEAttribute(examEClass, EXAM__MEMBER_PEERS);

		prescribedProcedureEClass = createEClass(PRESCRIBED_PROCEDURE);

		prescribedInternmentEClass = createEClass(PRESCRIBED_INTERNMENT);

		prescribedMedicationEClass = createEClass(PRESCRIBED_MEDICATION);

		examinationPrescriptionEClass = createEClass(EXAMINATION_PRESCRIPTION);
		createEAttribute(examinationPrescriptionEClass, EXAMINATION_PRESCRIPTION__ID);
		createEAttribute(examinationPrescriptionEClass, EXAMINATION_PRESCRIPTION__SUCCESS);
		createEAttribute(examinationPrescriptionEClass, EXAMINATION_PRESCRIPTION__MESSAGE);
		createEAttribute(examinationPrescriptionEClass, EXAMINATION_PRESCRIPTION__REQUEST_DATE);

		complementEClass = createEClass(COMPLEMENT);
		createEAttribute(complementEClass, COMPLEMENT__ID);
		createEAttribute(complementEClass, COMPLEMENT__SIDE_MEMBER);
		createEAttribute(complementEClass, COMPLEMENT__SIDE_MEMBER_DISPLAY);
		createEAttribute(complementEClass, COMPLEMENT__QUANTITY);
		createEAttribute(complementEClass, COMPLEMENT__CLINICAL_INDICATION);

		prescribedPrescriptionItemEClass = createEClass(PRESCRIBED_PRESCRIPTION_ITEM);

		prescribedMedicamentEClass = createEClass(PRESCRIBED_MEDICAMENT);

		shortExecutionEClass = createEClass(SHORT_EXECUTION);
		createEAttribute(shortExecutionEClass, SHORT_EXECUTION__CONCLUSION_DATE);
		createEAttribute(shortExecutionEClass, SHORT_EXECUTION__COMPLETED);
		createEAttribute(shortExecutionEClass, SHORT_EXECUTION__ABORTED);
		createEAttribute(shortExecutionEClass, SHORT_EXECUTION__LAST_EXECUTED_STEP_DATE);
		createEReference(shortExecutionEClass, SHORT_EXECUTION__PATHWAY);
		createEAttribute(shortExecutionEClass, SHORT_EXECUTION__ID_RESPONSIBLE);
		createEAttribute(shortExecutionEClass, SHORT_EXECUTION__ID_LAST_PROFESSIONAL);
		createEReference(shortExecutionEClass, SHORT_EXECUTION__RESPONSIBLE);
		createEReference(shortExecutionEClass, SHORT_EXECUTION__EXECUTEDSTEP);
		createEReference(shortExecutionEClass, SHORT_EXECUTION__LASTPROFESSIONAL);
		createEAttribute(shortExecutionEClass, SHORT_EXECUTION__CREATION_DATE);
		createEAttribute(shortExecutionEClass, SHORT_EXECUTION__ID_PATHWAY);
		createEAttribute(shortExecutionEClass, SHORT_EXECUTION__ID);
		createEAttribute(shortExecutionEClass, SHORT_EXECUTION__URL);

		justificationEClass = createEClass(JUSTIFICATION);
		createEAttribute(justificationEClass, JUSTIFICATION__ID);
		createEAttribute(justificationEClass, JUSTIFICATION__REASON);
		createEAttribute(justificationEClass, JUSTIFICATION__REASON_DISPLAY);
		createEAttribute(justificationEClass, JUSTIFICATION__DESCRIPTION);
		createEAttribute(justificationEClass, JUSTIFICATION__JUSTIFIED_BY_ID);
		createEAttribute(justificationEClass, JUSTIFICATION__JUSTIFIED_BY);

		pathwayEClass = createEClass(PATHWAY);
		createEAttribute(pathwayEClass, PATHWAY__ID);
		createEAttribute(pathwayEClass, PATHWAY__URL);
		createEAttribute(pathwayEClass, PATHWAY__CODE);
		createEAttribute(pathwayEClass, PATHWAY__NAME);
		createEAttribute(pathwayEClass, PATHWAY__ID_REPOSITORY);
		createEAttribute(pathwayEClass, PATHWAY__VERSION);
		createEAttribute(pathwayEClass, PATHWAY__COMPLETED);

		responsibleEClass = createEClass(RESPONSIBLE);

		executedStepEClass = createEClass(EXECUTED_STEP);
		createEAttribute(executedStepEClass, EXECUTED_STEP__CREATED_BY_ID);
		createEAttribute(executedStepEClass, EXECUTED_STEP__CREATED_BY);
		createEAttribute(executedStepEClass, EXECUTED_STEP__EXECUTED_BY_ID);
		createEAttribute(executedStepEClass, EXECUTED_STEP__EXECUTED_BY);
		createEAttribute(executedStepEClass, EXECUTED_STEP__STEP);
		createEAttribute(executedStepEClass, EXECUTED_STEP__EXECUTED);
		createEAttribute(executedStepEClass, EXECUTED_STEP__ID_STEP);
		createEAttribute(executedStepEClass, EXECUTED_STEP__REWORKED);
		createEAttribute(executedStepEClass, EXECUTED_STEP__CREATION_DATE);
		createEAttribute(executedStepEClass, EXECUTED_STEP__TYPE_VERBOSE);
		createEAttribute(executedStepEClass, EXECUTED_STEP__IS_CURRENT);
		createEAttribute(executedStepEClass, EXECUTED_STEP__ID_PATHWAY);
		createEAttribute(executedStepEClass, EXECUTED_STEP__TYPE);
		createEAttribute(executedStepEClass, EXECUTED_STEP__EXECUTION_DATE);
		createEAttribute(executedStepEClass, EXECUTED_STEP__ID_EXECUTED_PROTOCOL);
		createEAttribute(executedStepEClass, EXECUTED_STEP__CHANGE_DATE);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__ID);
		createEAttribute(userEClass, USER__URL);
		createEAttribute(userEClass, USER__CODE);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__NAME);
		createEAttribute(userEClass, USER__TYPE_COUNCIL);
		createEAttribute(userEClass, USER__LOGIN);
		createEAttribute(userEClass, USER__NUMBER_COUNCIL);
		createEAttribute(userEClass, USER__STATE);

		valueEClass = createEClass(VALUE);

		answerEClass = createEClass(ANSWER);
		createEAttribute(answerEClass, ANSWER__TYPE_VERBOSE);
		createEAttribute(answerEClass, ANSWER__TYPE);
		createEAttribute(answerEClass, ANSWER__ID);
		createEReference(answerEClass, ANSWER__VALUE);
		createEReference(answerEClass, ANSWER__QUESTION);

		numericEClass = createEClass(NUMERIC);
		createEAttribute(numericEClass, NUMERIC__VALUE);

		yesOrNoEClass = createEClass(YES_OR_NO);
		createEAttribute(yesOrNoEClass, YES_OR_NO__VALUE);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__ID);
		createEAttribute(stepEClass, STEP__TYPE);
		createEAttribute(stepEClass, STEP__TYPE_VERBOSE);
		createEAttribute(stepEClass, STEP__URL);
		createEAttribute(stepEClass, STEP__NAME);
		createEAttribute(stepEClass, STEP__DESCRIPTION);
		createEAttribute(stepEClass, STEP__IS_INITIAL);
		createEAttribute(stepEClass, STEP__IS_TERMINAL);
		createEAttribute(stepEClass, STEP__MANDATORY);

		creatorEClass = createEClass(CREATOR);

		executorEClass = createEClass(EXECUTOR);

		lastProfessionalEClass = createEClass(LAST_PROFESSIONAL);

		executionEClass = createEClass(EXECUTION);
		createEAttribute(executionEClass, EXECUTION__ID);
		createEAttribute(executionEClass, EXECUTION__TYPE);
		createEAttribute(executionEClass, EXECUTION__TYPE_VERBOSE);
		createEAttribute(executionEClass, EXECUTION__URL);
		createEAttribute(executionEClass, EXECUTION__IS_CURRENT);
		createEAttribute(executionEClass, EXECUTION__REWORKED);
		createEAttribute(executionEClass, EXECUTION__EXECUTED);
		createEAttribute(executionEClass, EXECUTION__CREATION_DATE);
		createEAttribute(executionEClass, EXECUTION__CHANGE_DATE);
		createEAttribute(executionEClass, EXECUTION__EXECUTION_DATE);
		createEAttribute(executionEClass, EXECUTION__CREATED_BY_ID);
		createEAttribute(executionEClass, EXECUTION__EXECUTED_BY_ID);
		createEAttribute(executionEClass, EXECUTION__ID_STEP);
		createEAttribute(executionEClass, EXECUTION__ID_PATHWAY);
		createEAttribute(executionEClass, EXECUTION__ID_EXECUTED_PATHWAY);
		createEReference(executionEClass, EXECUTION__JUSTIFICATION);
		createEReference(executionEClass, EXECUTION__STEP);
		createEReference(executionEClass, EXECUTION__PREVIOUS);
		createEReference(executionEClass, EXECUTION__NEXT);
		createEReference(executionEClass, EXECUTION__CREATOR);
		createEReference(executionEClass, EXECUTION__EXECUTOR);
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
		auxiliaryConductEClass.getESuperTypes().add(this.getExecution());
		informationEClass.getESuperTypes().add(this.getExecution());
		dischargeEClass.getESuperTypes().add(this.getExecution());
		referralEClass.getESuperTypes().add(this.getExecution());
		prescriptionEClass.getESuperTypes().add(this.getExecution());
		treatmentEClass.getESuperTypes().add(this.getExecution());
		numericEClass.getESuperTypes().add(this.getValue());
		yesOrNoEClass.getESuperTypes().add(this.getValue());
		creatorEClass.getESuperTypes().add(this.getUser());
		executorEClass.getESuperTypes().add(this.getUser());

		// Initialize classes, features, and operations; add parameters
		initEClass(auxiliaryConductEClass, AuxiliaryConduct.class, "AuxiliaryConduct", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuxiliaryConduct_Answer(), this.getAnswer(), null, "answer", null, 0, -1,
				AuxiliaryConduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationEClass, Information.class, "Information", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dischargeEClass, Discharge.class, "Discharge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(referralEClass, Referral.class, "Referral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(prescriptionEClass, Prescription.class, "Prescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrescription_Text(), ecorePackage.getEString(), "text", null, 0, 1, Prescription.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescription_Prescribedmedicament(), this.getPrescribedMedicament(), null,
				"prescribedmedicament", null, 0, -1, Prescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescription_Prescribedprescriptionitem(), this.getPrescribedPrescriptionItem(), null,
				"prescribedprescriptionitem", null, 0, -1, Prescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescription_Prescription(), ecorePackage.getEString(), "prescription", null, 0, 1,
				Prescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(treatmentEClass, Treatment.class, "Treatment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTreatment_Prescribedexam(), this.getPrescribedExamination(), null, "prescribedexam", null, 0,
				1, Treatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreatment_Prescribedprocedure(), this.getPrescribedProcedure(), null, "prescribedprocedure",
				null, 0, -1, Treatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreatment_Prescribedinternment(), this.getPrescribedInternment(), null,
				"prescribedinternment", null, 0, -1, Treatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreatment_Prescribedmedication(), this.getPrescribedMedication(), null,
				"prescribedmedication", null, 0, -1, Treatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examinationEClass, Examination.class, "Examination", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExamination_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Examination.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamination_Url(), ecorePackage.getEString(), "url", null, 0, 1, Examination.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamination_IdExam(), ecorePackage.getEInt(), "idExam", null, 0, 1, Examination.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamination_SideMember(), ecorePackage.getEString(), "sideMember", null, 0, 1,
				Examination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamination_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Examination.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamination_Justify(), ecorePackage.getEString(), "justify", null, 0, 1, Examination.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamination_ClinicalIndication(), ecorePackage.getEString(), "clinicalIndication", null, 0, 1,
				Examination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamination_SideMemberDisplay(), ecorePackage.getEString(), "sideMemberDisplay", null, 0, 1,
				Examination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getExamination_Exam(), this.getExam(), null, "exam", null, 1, 1, Examination.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(previousEClass, Previous.class, "Previous", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrevious_Url(), ecorePackage.getEString(), "url", null, 0, 1, Previous.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrevious_UrlAbsolute(), ecorePackage.getEString(), "urlAbsolute", null, 0, 1, Previous.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nextEClass, Next.class, "Next", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNext_UrlAbsolute(), ecorePackage.getEString(), "urlAbsolute", null, 0, 1, Next.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNext_Url(), ecorePackage.getEString(), "url", null, 0, 1, Next.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Question.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Url(), ecorePackage.getEString(), "url", null, 0, 1, Question.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Text(), ecorePackage.getEString(), "text", null, 0, 1, Question.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Variable(), this.getVariable(), null, "variable", null, 1, 1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_IdCategory(), ecorePackage.getEInt(), "idCategory", null, 0, 1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Category(), ecorePackage.getEString(), "category", null, 0, 1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), ecorePackage.getEString(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_TypeVerbose(), ecorePackage.getEString(), "typeVerbose", null, 0, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Url(), ecorePackage.getEString(), "url", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Weight(), ecorePackage.getEInt(), "weight", null, 0, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Link(), ecorePackage.getEString(), "link", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Value(), this.getValue(), null, "value", null, 1, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(prescribedExaminationEClass, PrescribedExamination.class, "PrescribedExamination", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrescribedExamination_Examination(), this.getExamination(), null, "examination", null, 1, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescribedExamination_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescribedExamination_Result(), ecorePackage.getEString(), "result", null, 0, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescribedExamination_Report(), ecorePackage.getEString(), "report", null, 0, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescribedExamination_NumberGuide(), ecorePackage.getEInt(), "numberGuide", null, 0, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescribedExamination_Examinationprescription(), this.getExaminationPrescription(), null,
				"examinationprescription", null, 1, 1, PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescribedExamination_Complement(), this.getComplement(), null, "complement", null, 0, -1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examEClass, Exam.class, "Exam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExam_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Url(), ecorePackage.getEString(), "url", null, 0, 1, Exam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(prescribedInternmentEClass, PrescribedInternment.class, "PrescribedInternment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prescribedMedicationEClass, PrescribedMedication.class, "PrescribedMedication", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(examinationPrescriptionEClass, ExaminationPrescription.class, "ExaminationPrescription",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExaminationPrescription_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				ExaminationPrescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPrescription_Success(), ecorePackage.getEBoolean(), "success", null, 0, 1,
				ExaminationPrescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPrescription_Message(), ecorePackage.getEString(), "message", null, 0, 1,
				ExaminationPrescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPrescription_RequestDate(), ecorePackage.getEString(), "requestDate", null, 0, 1,
				ExaminationPrescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complementEClass, Complement.class, "Complement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplement_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Complement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplement_SideMember(), ecorePackage.getEString(), "sideMember", null, 0, 1,
				Complement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplement_SideMemberDisplay(), ecorePackage.getEString(), "sideMemberDisplay", null, 0, 1,
				Complement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplement_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Complement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplement_ClinicalIndication(), ecorePackage.getEInt(), "clinicalIndication", null, 0, 1,
				Complement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(prescribedPrescriptionItemEClass, PrescribedPrescriptionItem.class, "PrescribedPrescriptionItem",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prescribedMedicamentEClass, PrescribedMedicament.class, "PrescribedMedicament", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shortExecutionEClass, ShortExecution.class, "ShortExecution", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShortExecution_ConclusionDate(), ecorePackage.getEDate(), "conclusionDate", null, 0, 1,
				ShortExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortExecution_Completed(), ecorePackage.getEBoolean(), "completed", "false", 0, 1,
				ShortExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortExecution_Aborted(), ecorePackage.getEBoolean(), "aborted", null, 0, 1,
				ShortExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortExecution_LastExecutedStepDate(), ecorePackage.getEString(), "lastExecutedStepDate",
				null, 0, 1, ShortExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShortExecution_Pathway(), this.getPathway(), null, "pathway", null, 1, 1,
				ShortExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortExecution_IdResponsible(), ecorePackage.getEInt(), "idResponsible", null, 0, 1,
				ShortExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortExecution_IdLastProfessional(), ecorePackage.getEInt(), "idLastProfessional", null, 0, 1,
				ShortExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getShortExecution_Responsible(), this.getResponsible(), null, "responsible", null, 1, 1,
				ShortExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShortExecution_Executedstep(), this.getExecutedStep(), null, "executedstep", null, 1, 1,
				ShortExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShortExecution_Lastprofessional(), this.getLastProfessional(), null, "lastprofessional", null,
				1, 1, ShortExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortExecution_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1,
				ShortExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortExecution_IdPathway(), ecorePackage.getEInt(), "idPathway", null, 0, 1,
				ShortExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortExecution_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ShortExecution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortExecution_Url(), ecorePackage.getEString(), "url", null, 0, 1, ShortExecution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(justificationEClass, Justification.class, "Justification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJustification_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Justification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJustification_Reason(), ecorePackage.getEString(), "reason", null, 0, 1, Justification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJustification_ReasonDisplay(), ecorePackage.getEString(), "reasonDisplay", null, 0, 1,
				Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJustification_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJustification_JustifiedById(), ecorePackage.getEInt(), "justifiedById", null, 0, 1,
				Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJustification_JustifiedBy(), ecorePackage.getEString(), "justifiedBy", null, 0, 1,
				Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(pathwayEClass, Pathway.class, "Pathway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPathway_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Pathway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_Url(), ecorePackage.getEString(), "url", null, 0, 1, Pathway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_Code(), ecorePackage.getEString(), "code", null, 0, 1, Pathway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pathway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_IdRepository(), ecorePackage.getEInt(), "idRepository", null, 0, 1, Pathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_Version(), ecorePackage.getEInt(), "version", null, 0, 1, Pathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_Completed(), ecorePackage.getEBoolean(), "completed", null, 0, 1, Pathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsibleEClass, Responsible.class, "Responsible", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(executedStepEClass, ExecutedStep.class, "ExecutedStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutedStep_CreatedById(), ecorePackage.getEInt(), "createdById", null, 0, 1,
				ExecutedStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_CreatedBy(), ecorePackage.getEString(), "createdBy", null, 0, 1,
				ExecutedStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_ExecutedById(), ecorePackage.getEInt(), "executedById", null, 0, 1,
				ExecutedStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_ExecutedBy(), ecorePackage.getEString(), "executedBy", null, 0, 1,
				ExecutedStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_Step(), ecorePackage.getEString(), "step", null, 0, 1, ExecutedStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_Executed(), ecorePackage.getEBoolean(), "executed", "false", 0, 1,
				ExecutedStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_IdStep(), ecorePackage.getEInt(), "idStep", null, 0, 1, ExecutedStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_Reworked(), ecorePackage.getEBoolean(), "reworked", "false", 0, 1,
				ExecutedStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1,
				ExecutedStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_TypeVerbose(), ecorePackage.getEString(), "typeVerbose", null, 0, 1,
				ExecutedStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_IsCurrent(), ecorePackage.getEBoolean(), "isCurrent", "false", 0, 1,
				ExecutedStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_IdPathway(), ecorePackage.getEInt(), "idPathway", null, 0, 1, ExecutedStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_Type(), ecorePackage.getEString(), "type", null, 0, 1, ExecutedStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_ExecutionDate(), ecorePackage.getEDate(), "executionDate", null, 0, 1,
				ExecutedStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_IdExecutedProtocol(), ecorePackage.getEInt(), "idExecutedProtocol", null, 0, 1,
				ExecutedStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedStep_ChangeDate(), ecorePackage.getEDate(), "changeDate", null, 0, 1,
				ExecutedStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Id(), ecorePackage.getEInt(), "id", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Url(), ecorePackage.getEString(), "url", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(answerEClass, Answer.class, "Answer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnswer_TypeVerbose(), ecorePackage.getEString(), "typeVerbose", null, 0, 1, Answer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_Type(), ecorePackage.getEString(), "type", null, 0, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnswer_Value(), this.getValue(), null, "value", null, 1, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAnswer_Question(), this.getQuestion(), null, "question", null, 1, 1, Answer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericEClass, Numeric.class, "Numeric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumeric_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1, Numeric.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yesOrNoEClass, YesOrNo.class, "YesOrNo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYesOrNo_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, YesOrNo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Type(), ecorePackage.getEString(), "type", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_TypeVerbose(), ecorePackage.getEString(), "typeVerbose", null, 0, 1, Step.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Url(), ecorePackage.getEString(), "url", null, 0, 1, Step.class, !IS_TRANSIENT,
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

		initEClass(creatorEClass, Creator.class, "Creator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executorEClass, Executor.class, "Executor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(lastProfessionalEClass, LastProfessional.class, "LastProfessional", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionEClass, Execution.class, "Execution", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecution_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Execution.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_Type(), ecorePackage.getEString(), "type", null, 0, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_TypeVerbose(), ecorePackage.getEString(), "typeVerbose", null, 0, 1,
				Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_Url(), ecorePackage.getEString(), "url", null, 0, 1, Execution.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_IsCurrent(), ecorePackage.getEBoolean(), "isCurrent", "false", 0, 1,
				Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_Reworked(), ecorePackage.getEBoolean(), "reworked", "false", 0, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_Executed(), ecorePackage.getEBoolean(), "executed", "false", 0, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1,
				Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_ChangeDate(), ecorePackage.getEDate(), "changeDate", null, 0, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_ExecutionDate(), ecorePackage.getEDate(), "executionDate", null, 0, 1,
				Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_CreatedById(), ecorePackage.getEInt(), "createdById", null, 0, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_ExecutedById(), ecorePackage.getEInt(), "executedById", null, 0, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_IdStep(), ecorePackage.getEInt(), "idStep", null, 0, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_IdPathway(), ecorePackage.getEInt(), "idPathway", null, 0, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_IdExecutedPathway(), ecorePackage.getEInt(), "idExecutedPathway", null, 0, 1,
				Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_Justification(), this.getJustification(), null, "justification", null, 0, 1,
				Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_Step(), this.getStep(), null, "step", null, 1, 1, Execution.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getExecution_Previous(), this.getPrevious(), null, "previous", null, 0, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_Next(), this.getNext(), null, "next", null, 0, 1, Execution.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getExecution_Creator(), this.getCreator(), null, "creator", null, 1, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_Executor(), this.getExecutor(), null, "executor", null, 1, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Execution_metamodelPackageImpl
