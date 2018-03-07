/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Answer;
import MetamodelExecution.Complement;
import MetamodelExecution.Creator;
import MetamodelExecution.Exam;
import MetamodelExecution.Examination;
import MetamodelExecution.ExecutedAuxiliaryConduct;
import MetamodelExecution.ExecutedDischarge;
import MetamodelExecution.ExecutedElement;
import MetamodelExecution.ExecutedInformation;
import MetamodelExecution.ExecutedPrescription;
import MetamodelExecution.ExecutedReferral;
import MetamodelExecution.ExecutedTreatment;
import MetamodelExecution.Execution;
import MetamodelExecution.Execution_metamodelFactory;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Executor;
import MetamodelExecution.Justification;
import MetamodelExecution.LastProfessional;
import MetamodelExecution.Numeric;
import MetamodelExecution.Pathway;
import MetamodelExecution.PrescribedExamination;
import MetamodelExecution.PrescribedInternment;
import MetamodelExecution.PrescribedMedicament;
import MetamodelExecution.PrescribedMedication;
import MetamodelExecution.PrescribedPrescriptionItem;
import MetamodelExecution.PrescribedProcedure;
import MetamodelExecution.PrescriptionExam;
import MetamodelExecution.PrescriptionInfo;
import MetamodelExecution.Quantity;
import MetamodelExecution.Question;
import MetamodelExecution.Responsible;
import MetamodelExecution.Result;
import MetamodelExecution.Step;
import MetamodelExecution.User;
import MetamodelExecution.Value;
import MetamodelExecution.YesOrNo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pathwayMetamodel.PathwayMetamodelPackage;

import pathwayMetamodel.impl.PathwayMetamodelPackageImpl;

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
	private EClass executedAuxiliaryConductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executedInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executedDischargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executedReferralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executedPrescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executedTreatmentEClass = null;

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
	private EClass prescribedMedicamentEClass = null;

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
	private EClass executedElementEClass = null;

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
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescriptionExamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescriptionInfoEClass = null;

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

		// Obtain or create and register interdependencies
		PathwayMetamodelPackageImpl thePathwayMetamodelPackage = (PathwayMetamodelPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PathwayMetamodelPackage.eNS_URI) instanceof PathwayMetamodelPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(PathwayMetamodelPackage.eNS_URI)
						: PathwayMetamodelPackage.eINSTANCE);

		// Create package meta-data objects
		theExecution_metamodelPackage.createPackageContents();
		thePathwayMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theExecution_metamodelPackage.initializePackageContents();
		thePathwayMetamodelPackage.initializePackageContents();

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
	public EClass getExecutedAuxiliaryConduct() {
		return executedAuxiliaryConductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutedAuxiliaryConduct_Answer() {
		return (EReference) executedAuxiliaryConductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutedInformation() {
		return executedInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutedDischarge() {
		return executedDischargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutedReferral() {
		return executedReferralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutedPrescription() {
		return executedPrescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedPrescription_Text() {
		return (EAttribute) executedPrescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutedPrescription_Prescribedmedicament() {
		return (EReference) executedPrescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutedPrescription_Prescribedprescriptionitem() {
		return (EReference) executedPrescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedPrescription_IdsPrescribedMedication() {
		return (EAttribute) executedPrescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedPrescription_IdsPrescribedPrescriptionItem() {
		return (EAttribute) executedPrescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutedPrescription_Prescriptioninfo() {
		return (EReference) executedPrescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutedTreatment() {
		return executedTreatmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutedTreatment_Prescribedexam() {
		return (EReference) executedTreatmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutedTreatment_Prescribedprocedure() {
		return (EReference) executedTreatmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutedTreatment_Prescribedinternment() {
		return (EReference) executedTreatmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutedTreatment_Prescribedmedication() {
		return (EReference) executedTreatmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedTreatment_IdsPrescribedExamination() {
		return (EAttribute) executedTreatmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedTreatment_IdsPrescribedProcedure() {
		return (EAttribute) executedTreatmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedTreatment_IdsPrescribedInternment() {
		return (EAttribute) executedTreatmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedTreatment_IdsPrecribedMedication() {
		return (EAttribute) executedTreatmentEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getExamination_IdExamination() {
		return (EAttribute) examinationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExamination_SideLimb() {
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
	public EAttribute getExamination_Justification() {
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
	public EAttribute getExamination_SideLimbDisplay() {
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
	public EReference getPrescribedExamination_Result() {
		return (EReference) prescribedExaminationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescribedExamination_Prescriptionexam() {
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
	public EAttribute getComplement_SideLimbDisplay() {
		return (EAttribute) complementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplement_ClinicalIndication() {
		return (EAttribute) complementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplement_Justification() {
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
	public EAttribute getPathway_Version() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_Completed() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_IdRepository() {
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
	public EAttribute getAnswer_TypeVerbose() {
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
	public EClass getExecutedElement() {
		return executedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedElement_Id() {
		return (EAttribute) executedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedElement_Type() {
		return (EAttribute) executedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedElement_TypeVerbose() {
		return (EAttribute) executedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedElement_Url() {
		return (EAttribute) executedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedElement_IsCurrent() {
		return (EAttribute) executedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedElement_Reworked() {
		return (EAttribute) executedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedElement_Executed() {
		return (EAttribute) executedElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedElement_CreationDate() {
		return (EAttribute) executedElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedElement_ModificationDate() {
		return (EAttribute) executedElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedElement_ExecutionDate() {
		return (EAttribute) executedElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedElement_CreatedById() {
		return (EAttribute) executedElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedElement_ExecutedById() {
		return (EAttribute) executedElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedElement_IdStep() {
		return (EAttribute) executedElementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutedElement_Justification() {
		return (EReference) executedElementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutedElement_Step() {
		return (EReference) executedElementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutedElement_Creator() {
		return (EReference) executedElementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutedElement_Executor() {
		return (EReference) executedElementEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedElement_Name() {
		return (EAttribute) executedElementEClass.getEStructuralFeatures().get(17);
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
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrescriptionExam() {
		return prescriptionExamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescriptionExam_Id() {
		return (EAttribute) prescriptionExamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescriptionExam_Success() {
		return (EAttribute) prescriptionExamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescriptionExam_Message() {
		return (EAttribute) prescriptionExamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescriptionExam_RequestDate() {
		return (EAttribute) prescriptionExamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrescriptionInfo() {
		return prescriptionInfoEClass;
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
	public EClass getExecution() {
		return executionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Element() {
		return (EReference) executionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_Id() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_Url() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_CreationDate() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_ConclusionDate() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_Completed() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_Aborted() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_LastExecutedStepDate() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_IdPathway() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_IdLastProfessional() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_IdResponsible() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_IdsExecutedStep() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Pathway() {
		return (EReference) executionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Responsible() {
		return (EReference) executionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Lastprofessional() {
		return (EReference) executionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_Name() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(15);
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
		executedAuxiliaryConductEClass = createEClass(EXECUTED_AUXILIARY_CONDUCT);
		createEReference(executedAuxiliaryConductEClass, EXECUTED_AUXILIARY_CONDUCT__ANSWER);

		executedInformationEClass = createEClass(EXECUTED_INFORMATION);

		executedDischargeEClass = createEClass(EXECUTED_DISCHARGE);

		executedReferralEClass = createEClass(EXECUTED_REFERRAL);

		executedPrescriptionEClass = createEClass(EXECUTED_PRESCRIPTION);
		createEAttribute(executedPrescriptionEClass, EXECUTED_PRESCRIPTION__TEXT);
		createEReference(executedPrescriptionEClass, EXECUTED_PRESCRIPTION__PRESCRIBEDMEDICAMENT);
		createEReference(executedPrescriptionEClass, EXECUTED_PRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM);
		createEAttribute(executedPrescriptionEClass, EXECUTED_PRESCRIPTION__IDS_PRESCRIBED_MEDICATION);
		createEAttribute(executedPrescriptionEClass, EXECUTED_PRESCRIPTION__IDS_PRESCRIBED_PRESCRIPTION_ITEM);
		createEReference(executedPrescriptionEClass, EXECUTED_PRESCRIPTION__PRESCRIPTIONINFO);

		executedTreatmentEClass = createEClass(EXECUTED_TREATMENT);
		createEReference(executedTreatmentEClass, EXECUTED_TREATMENT__PRESCRIBEDEXAM);
		createEReference(executedTreatmentEClass, EXECUTED_TREATMENT__PRESCRIBEDPROCEDURE);
		createEReference(executedTreatmentEClass, EXECUTED_TREATMENT__PRESCRIBEDINTERNMENT);
		createEReference(executedTreatmentEClass, EXECUTED_TREATMENT__PRESCRIBEDMEDICATION);
		createEAttribute(executedTreatmentEClass, EXECUTED_TREATMENT__IDS_PRESCRIBED_EXAMINATION);
		createEAttribute(executedTreatmentEClass, EXECUTED_TREATMENT__IDS_PRESCRIBED_PROCEDURE);
		createEAttribute(executedTreatmentEClass, EXECUTED_TREATMENT__IDS_PRESCRIBED_INTERNMENT);
		createEAttribute(executedTreatmentEClass, EXECUTED_TREATMENT__IDS_PRECRIBED_MEDICATION);

		examinationEClass = createEClass(EXAMINATION);
		createEAttribute(examinationEClass, EXAMINATION__ID);
		createEAttribute(examinationEClass, EXAMINATION__URL);
		createEAttribute(examinationEClass, EXAMINATION__ID_EXAMINATION);
		createEAttribute(examinationEClass, EXAMINATION__SIDE_LIMB);
		createEAttribute(examinationEClass, EXAMINATION__QUANTITY);
		createEAttribute(examinationEClass, EXAMINATION__JUSTIFICATION);
		createEAttribute(examinationEClass, EXAMINATION__CLINICAL_INDICATION);
		createEAttribute(examinationEClass, EXAMINATION__SIDE_LIMB_DISPLAY);
		createEReference(examinationEClass, EXAMINATION__EXAM);

		prescribedExaminationEClass = createEClass(PRESCRIBED_EXAMINATION);
		createEReference(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__EXAMINATION);
		createEAttribute(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__ID);
		createEAttribute(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__REPORT);
		createEAttribute(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__NUMBER_GUIDE);
		createEReference(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__COMPLEMENT);
		createEReference(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__RESULT);
		createEReference(prescribedExaminationEClass, PRESCRIBED_EXAMINATION__PRESCRIPTIONEXAM);

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

		complementEClass = createEClass(COMPLEMENT);
		createEAttribute(complementEClass, COMPLEMENT__ID);
		createEAttribute(complementEClass, COMPLEMENT__SIDE_LIMB);
		createEAttribute(complementEClass, COMPLEMENT__SIDE_LIMB_DISPLAY);
		createEAttribute(complementEClass, COMPLEMENT__CLINICAL_INDICATION);
		createEAttribute(complementEClass, COMPLEMENT__JUSTIFICATION);

		prescribedPrescriptionItemEClass = createEClass(PRESCRIBED_PRESCRIPTION_ITEM);

		prescribedMedicamentEClass = createEClass(PRESCRIBED_MEDICAMENT);

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
		createEAttribute(pathwayEClass, PATHWAY__VERSION);
		createEAttribute(pathwayEClass, PATHWAY__COMPLETED);
		createEAttribute(pathwayEClass, PATHWAY__ID_REPOSITORY);

		responsibleEClass = createEClass(RESPONSIBLE);

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
		createEAttribute(answerEClass, ANSWER__ID);
		createEAttribute(answerEClass, ANSWER__TYPE);
		createEAttribute(answerEClass, ANSWER__TYPE_VERBOSE);
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

		executedElementEClass = createEClass(EXECUTED_ELEMENT);
		createEAttribute(executedElementEClass, EXECUTED_ELEMENT__ID);
		createEAttribute(executedElementEClass, EXECUTED_ELEMENT__TYPE);
		createEAttribute(executedElementEClass, EXECUTED_ELEMENT__TYPE_VERBOSE);
		createEAttribute(executedElementEClass, EXECUTED_ELEMENT__URL);
		createEAttribute(executedElementEClass, EXECUTED_ELEMENT__IS_CURRENT);
		createEAttribute(executedElementEClass, EXECUTED_ELEMENT__REWORKED);
		createEAttribute(executedElementEClass, EXECUTED_ELEMENT__EXECUTED);
		createEAttribute(executedElementEClass, EXECUTED_ELEMENT__CREATION_DATE);
		createEAttribute(executedElementEClass, EXECUTED_ELEMENT__MODIFICATION_DATE);
		createEAttribute(executedElementEClass, EXECUTED_ELEMENT__EXECUTION_DATE);
		createEAttribute(executedElementEClass, EXECUTED_ELEMENT__CREATED_BY_ID);
		createEAttribute(executedElementEClass, EXECUTED_ELEMENT__EXECUTED_BY_ID);
		createEAttribute(executedElementEClass, EXECUTED_ELEMENT__ID_STEP);
		createEReference(executedElementEClass, EXECUTED_ELEMENT__JUSTIFICATION);
		createEReference(executedElementEClass, EXECUTED_ELEMENT__STEP);
		createEReference(executedElementEClass, EXECUTED_ELEMENT__CREATOR);
		createEReference(executedElementEClass, EXECUTED_ELEMENT__EXECUTOR);
		createEAttribute(executedElementEClass, EXECUTED_ELEMENT__NAME);

		resultEClass = createEClass(RESULT);

		quantityEClass = createEClass(QUANTITY);

		prescriptionExamEClass = createEClass(PRESCRIPTION_EXAM);
		createEAttribute(prescriptionExamEClass, PRESCRIPTION_EXAM__ID);
		createEAttribute(prescriptionExamEClass, PRESCRIPTION_EXAM__SUCCESS);
		createEAttribute(prescriptionExamEClass, PRESCRIPTION_EXAM__MESSAGE);
		createEAttribute(prescriptionExamEClass, PRESCRIPTION_EXAM__REQUEST_DATE);

		prescriptionInfoEClass = createEClass(PRESCRIPTION_INFO);

		questionEClass = createEClass(QUESTION);

		executionEClass = createEClass(EXECUTION);
		createEReference(executionEClass, EXECUTION__ELEMENT);
		createEAttribute(executionEClass, EXECUTION__ID);
		createEAttribute(executionEClass, EXECUTION__URL);
		createEAttribute(executionEClass, EXECUTION__CREATION_DATE);
		createEAttribute(executionEClass, EXECUTION__CONCLUSION_DATE);
		createEAttribute(executionEClass, EXECUTION__COMPLETED);
		createEAttribute(executionEClass, EXECUTION__ABORTED);
		createEAttribute(executionEClass, EXECUTION__LAST_EXECUTED_STEP_DATE);
		createEAttribute(executionEClass, EXECUTION__ID_PATHWAY);
		createEAttribute(executionEClass, EXECUTION__ID_LAST_PROFESSIONAL);
		createEAttribute(executionEClass, EXECUTION__ID_RESPONSIBLE);
		createEAttribute(executionEClass, EXECUTION__IDS_EXECUTED_STEP);
		createEReference(executionEClass, EXECUTION__PATHWAY);
		createEReference(executionEClass, EXECUTION__RESPONSIBLE);
		createEReference(executionEClass, EXECUTION__LASTPROFESSIONAL);
		createEAttribute(executionEClass, EXECUTION__NAME);
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

		// Obtain other dependent packages
		PathwayMetamodelPackage thePathwayMetamodelPackage = (PathwayMetamodelPackage) EPackage.Registry.INSTANCE
				.getEPackage(PathwayMetamodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		executedAuxiliaryConductEClass.getESuperTypes().add(this.getExecutedElement());
		executedInformationEClass.getESuperTypes().add(this.getExecutedElement());
		executedDischargeEClass.getESuperTypes().add(this.getExecutedElement());
		executedReferralEClass.getESuperTypes().add(this.getExecutedElement());
		executedPrescriptionEClass.getESuperTypes().add(this.getExecutedElement());
		executedTreatmentEClass.getESuperTypes().add(this.getExecutedElement());
		responsibleEClass.getESuperTypes().add(this.getUser());
		numericEClass.getESuperTypes().add(this.getValue());
		yesOrNoEClass.getESuperTypes().add(this.getValue());
		creatorEClass.getESuperTypes().add(this.getUser());
		executorEClass.getESuperTypes().add(this.getUser());
		lastProfessionalEClass.getESuperTypes().add(this.getUser());
		questionEClass.getESuperTypes().add(thePathwayMetamodelPackage.getQuestion());

		// Initialize classes, features, and operations; add parameters
		initEClass(executedAuxiliaryConductEClass, ExecutedAuxiliaryConduct.class, "ExecutedAuxiliaryConduct",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutedAuxiliaryConduct_Answer(), this.getAnswer(), null, "answer", null, 0, -1,
				ExecutedAuxiliaryConduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executedInformationEClass, ExecutedInformation.class, "ExecutedInformation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executedDischargeEClass, ExecutedDischarge.class, "ExecutedDischarge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(executedReferralEClass, ExecutedReferral.class, "ExecutedReferral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(executedPrescriptionEClass, ExecutedPrescription.class, "ExecutedPrescription", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutedPrescription_Text(), ecorePackage.getEString(), "text", null, 0, 1,
				ExecutedPrescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutedPrescription_Prescribedmedicament(), this.getPrescribedMedicament(), null,
				"prescribedmedicament", null, 0, -1, ExecutedPrescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutedPrescription_Prescribedprescriptionitem(), this.getPrescribedPrescriptionItem(), null,
				"prescribedprescriptionitem", null, 0, -1, ExecutedPrescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedPrescription_IdsPrescribedMedication(), ecorePackage.getEInt(),
				"idsPrescribedMedication", null, 0, -1, ExecutedPrescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedPrescription_IdsPrescribedPrescriptionItem(), ecorePackage.getEInt(),
				"idsPrescribedPrescriptionItem", null, 0, -1, ExecutedPrescription.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutedPrescription_Prescriptioninfo(), this.getPrescriptionInfo(), null, "prescriptioninfo",
				null, 0, -1, ExecutedPrescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executedTreatmentEClass, ExecutedTreatment.class, "ExecutedTreatment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutedTreatment_Prescribedexam(), this.getPrescribedExamination(), null, "prescribedexam",
				null, 0, -1, ExecutedTreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutedTreatment_Prescribedprocedure(), this.getPrescribedProcedure(), null,
				"prescribedprocedure", null, 0, -1, ExecutedTreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutedTreatment_Prescribedinternment(), this.getPrescribedInternment(), null,
				"prescribedinternment", null, 0, -1, ExecutedTreatment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutedTreatment_Prescribedmedication(), this.getPrescribedMedication(), null,
				"prescribedmedication", null, 0, -1, ExecutedTreatment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedTreatment_IdsPrescribedExamination(), ecorePackage.getEInt(),
				"idsPrescribedExamination", null, 0, -1, ExecutedTreatment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedTreatment_IdsPrescribedProcedure(), ecorePackage.getEInt(), "idsPrescribedProcedure",
				null, 0, -1, ExecutedTreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedTreatment_IdsPrescribedInternment(), ecorePackage.getEInt(),
				"idsPrescribedInternment", null, 0, -1, ExecutedTreatment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedTreatment_IdsPrecribedMedication(), ecorePackage.getEInt(), "idsPrecribedMedication",
				null, 0, -1, ExecutedTreatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examinationEClass, Examination.class, "Examination", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExamination_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Examination.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamination_Url(), ecorePackage.getEString(), "url", null, 0, 1, Examination.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExamination_IdExamination(), ecorePackage.getEInt(), "idExamination", null, 0, 1,
				Examination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getExamination_SideLimbDisplay(), ecorePackage.getEString(), "sideLimbDisplay", null, 0, 1,
				Examination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getExamination_Exam(), this.getExam(), null, "exam", null, 1, 1, Examination.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prescribedExaminationEClass, PrescribedExamination.class, "PrescribedExamination", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrescribedExamination_Examination(), this.getExamination(), null, "examination", null, 1, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescribedExamination_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
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
		initEReference(getPrescribedExamination_Result(), this.getResult(), null, "result", null, 0, 1,
				PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescribedExamination_Prescriptionexam(), this.getPrescriptionExam(), null,
				"prescriptionexam", null, 0, -1, PrescribedExamination.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(complementEClass, Complement.class, "Complement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplement_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Complement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplement_SideLimb(), ecorePackage.getEString(), "sideLimb", null, 0, 1, Complement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplement_SideLimbDisplay(), ecorePackage.getEString(), "sideLimbDisplay", null, 0, 1,
				Complement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplement_ClinicalIndication(), ecorePackage.getEInt(), "clinicalIndication", null, 0, 1,
				Complement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplement_Justification(), ecorePackage.getEString(), "justification", null, 0, 1,
				Complement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(prescribedPrescriptionItemEClass, PrescribedPrescriptionItem.class, "PrescribedPrescriptionItem",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prescribedMedicamentEClass, PrescribedMedicament.class, "PrescribedMedicament", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		initEAttribute(getPathway_Version(), ecorePackage.getEInt(), "version", null, 0, 1, Pathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_Completed(), ecorePackage.getEBoolean(), "completed", null, 0, 1, Pathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_IdRepository(), ecorePackage.getEInt(), "idRepository", null, 0, 1, Pathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsibleEClass, Responsible.class, "Responsible", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

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
		initEAttribute(getAnswer_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_Type(), ecorePackage.getEString(), "type", null, 0, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_TypeVerbose(), ecorePackage.getEString(), "typeVerbose", null, 0, 1, Answer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnswer_Value(), this.getValue(), null, "value", null, 1, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAnswer_Question(), this.getQuestion(), null, "question", null, 0, -1, Answer.class,
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

		initEClass(executedElementEClass, ExecutedElement.class, "ExecutedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutedElement_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ExecutedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedElement_Type(), ecorePackage.getEString(), "type", null, 0, 1, ExecutedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedElement_TypeVerbose(), ecorePackage.getEString(), "typeVerbose", null, 0, 1,
				ExecutedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedElement_Url(), ecorePackage.getEString(), "url", null, 0, 1, ExecutedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedElement_IsCurrent(), ecorePackage.getEBoolean(), "isCurrent", "false", 0, 1,
				ExecutedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedElement_Reworked(), ecorePackage.getEBoolean(), "reworked", "false", 0, 1,
				ExecutedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedElement_Executed(), ecorePackage.getEBoolean(), "executed", "false", 0, 1,
				ExecutedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedElement_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1,
				ExecutedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedElement_ModificationDate(), ecorePackage.getEDate(), "modificationDate", null, 0, 1,
				ExecutedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedElement_ExecutionDate(), ecorePackage.getEDate(), "executionDate", null, 0, 1,
				ExecutedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedElement_CreatedById(), ecorePackage.getEInt(), "createdById", null, 0, 1,
				ExecutedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedElement_ExecutedById(), ecorePackage.getEInt(), "executedById", null, 0, 1,
				ExecutedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedElement_IdStep(), ecorePackage.getEInt(), "idStep", null, 0, 1, ExecutedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutedElement_Justification(), this.getJustification(), null, "justification", null, 0, 1,
				ExecutedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutedElement_Step(), this.getStep(), null, "step", null, 1, 1, ExecutedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutedElement_Creator(), this.getCreator(), null, "creator", null, 1, 1,
				ExecutedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutedElement_Executor(), this.getExecutor(), null, "executor", null, 1, 1,
				ExecutedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExecutedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultEClass, Result.class, "Result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(prescriptionExamEClass, PrescriptionExam.class, "PrescriptionExam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrescriptionExam_Id(), ecorePackage.getEInt(), "id", null, 0, 1, PrescriptionExam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescriptionExam_Success(), ecorePackage.getEBoolean(), "success", null, 0, 1,
				PrescriptionExam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescriptionExam_Message(), ecorePackage.getEString(), "message", null, 0, 1,
				PrescriptionExam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescriptionExam_RequestDate(), ecorePackage.getEDate(), "requestDate", null, 0, 1,
				PrescriptionExam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(prescriptionInfoEClass, PrescriptionInfo.class, "PrescriptionInfo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionEClass, Execution.class, "Execution", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecution_Element(), this.getExecutedElement(), null, "element", null, 0, -1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Execution.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_Url(), ecorePackage.getEString(), "url", null, 0, 1, Execution.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1,
				Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_ConclusionDate(), ecorePackage.getEDate(), "conclusionDate", null, 0, 1,
				Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_Completed(), ecorePackage.getEBoolean(), "completed", "false", 0, 1,
				Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_Aborted(), ecorePackage.getEBoolean(), "aborted", null, 0, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_LastExecutedStepDate(), ecorePackage.getEString(), "lastExecutedStepDate", null, 0,
				1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_IdPathway(), ecorePackage.getEInt(), "idPathway", null, 0, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_IdLastProfessional(), ecorePackage.getEInt(), "idLastProfessional", null, 0, 1,
				Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_IdResponsible(), ecorePackage.getEInt(), "idResponsible", null, 0, 1,
				Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_IdsExecutedStep(), ecorePackage.getEInt(), "idsExecutedStep", null, 0, -1,
				Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_Pathway(), this.getPathway(), null, "pathway", null, 1, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_Responsible(), this.getResponsible(), null, "responsible", null, 1, 1,
				Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_Lastprofessional(), this.getLastProfessional(), null, "lastprofessional", null, 1,
				1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_Name(), ecorePackage.getEString(), "name", null, 0, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Execution_metamodelPackageImpl
