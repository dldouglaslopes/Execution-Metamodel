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
		case Execution_metamodelPackage.AUXILIARY_CONDUCT:
			return createAuxiliaryConduct();
		case Execution_metamodelPackage.INFORMATION:
			return createInformation();
		case Execution_metamodelPackage.DISCHARGE:
			return createDischarge();
		case Execution_metamodelPackage.REFERRAL:
			return createReferral();
		case Execution_metamodelPackage.PRESCRIPTION:
			return createPrescription();
		case Execution_metamodelPackage.TREATMENT:
			return createTreatment();
		case Execution_metamodelPackage.EXAMINATION:
			return createExamination();
		case Execution_metamodelPackage.PREVIOUS:
			return createPrevious();
		case Execution_metamodelPackage.NEXT:
			return createNext();
		case Execution_metamodelPackage.QUESTION:
			return createQuestion();
		case Execution_metamodelPackage.VARIABLE:
			return createVariable();
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
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION:
			return createExaminationPrescription();
		case Execution_metamodelPackage.COMPLEMENT:
			return createComplement();
		case Execution_metamodelPackage.PRESCRIBED_PRESCRIPTION_ITEM:
			return createPrescribedPrescriptionItem();
		case Execution_metamodelPackage.PRESCRIBED_MEDICAMENT:
			return createPrescribedMedicament();
		case Execution_metamodelPackage.SHORT_EXECUTION:
			return createShortExecution();
		case Execution_metamodelPackage.JUSTIFICATION:
			return createJustification();
		case Execution_metamodelPackage.PATHWAY:
			return createPathway();
		case Execution_metamodelPackage.RESPONSIBLE:
			return createResponsible();
		case Execution_metamodelPackage.EXECUTED_STEP:
			return createExecutedStep();
		case Execution_metamodelPackage.ANSWER:
			return createAnswer();
		case Execution_metamodelPackage.EXECUTION:
			return createExecution();
		case Execution_metamodelPackage.NUMERIC:
			return createNumeric();
		case Execution_metamodelPackage.YES_OR_NO:
			return createYesOrNo();
		case Execution_metamodelPackage.ELEMENT:
			return createElement();
		case Execution_metamodelPackage.MODELING:
			return createModeling();
		case Execution_metamodelPackage.CREATOR:
			return createCreator();
		case Execution_metamodelPackage.EXECUTOR:
			return createExecutor();
		case Execution_metamodelPackage.LAST_PROFESSIONAL:
			return createLastProfessional();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryConduct createAuxiliaryConduct() {
		AuxiliaryConductImpl auxiliaryConduct = new AuxiliaryConductImpl();
		return auxiliaryConduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information createInformation() {
		InformationImpl information = new InformationImpl();
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discharge createDischarge() {
		DischargeImpl discharge = new DischargeImpl();
		return discharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referral createReferral() {
		ReferralImpl referral = new ReferralImpl();
		return referral;
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
	public Treatment createTreatment() {
		TreatmentImpl treatment = new TreatmentImpl();
		return treatment;
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
	public Previous createPrevious() {
		PreviousImpl previous = new PreviousImpl();
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Next createNext() {
		NextImpl next = new NextImpl();
		return next;
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
	public ExaminationPrescription createExaminationPrescription() {
		ExaminationPrescriptionImpl examinationPrescription = new ExaminationPrescriptionImpl();
		return examinationPrescription;
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
	public PrescribedMedicament createPrescribedMedicament() {
		PrescribedMedicamentImpl prescribedMedicament = new PrescribedMedicamentImpl();
		return prescribedMedicament;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortExecution createShortExecution() {
		ShortExecutionImpl shortExecution = new ShortExecutionImpl();
		return shortExecution;
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
	public Pathway createPathway() {
		PathwayImpl pathway = new PathwayImpl();
		return pathway;
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
	public ExecutedStep createExecutedStep() {
		ExecutedStepImpl executedStep = new ExecutedStepImpl();
		return executedStep;
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
	public Execution createExecution() {
		ExecutionImpl execution = new ExecutionImpl();
		return execution;
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
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modeling createModeling() {
		ModelingImpl modeling = new ModelingImpl();
		return modeling;
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
