/**
 */
package MetamodelExecution.util;

import MetamodelExecution.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MetamodelExecution.Execution_metamodelPackage
 * @generated
 */
public class Execution_metamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Execution_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution_metamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Execution_metamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Execution_metamodelSwitch<Adapter> modelSwitch = new Execution_metamodelSwitch<Adapter>() {
		@Override
		public Adapter caseEAuxiliaryConduct(EAuxiliaryConduct object) {
			return createEAuxiliaryConductAdapter();
		}

		@Override
		public Adapter caseEInformation(EInformation object) {
			return createEInformationAdapter();
		}

		@Override
		public Adapter caseEDischarge(EDischarge object) {
			return createEDischargeAdapter();
		}

		@Override
		public Adapter caseEReferral(EReferral object) {
			return createEReferralAdapter();
		}

		@Override
		public Adapter caseEPrescription(EPrescription object) {
			return createEPrescriptionAdapter();
		}

		@Override
		public Adapter caseETreatment(ETreatment object) {
			return createETreatmentAdapter();
		}

		@Override
		public Adapter caseExamination(Examination object) {
			return createExaminationAdapter();
		}

		@Override
		public Adapter casePrescribedExamination(PrescribedExamination object) {
			return createPrescribedExaminationAdapter();
		}

		@Override
		public Adapter caseExam(Exam object) {
			return createExamAdapter();
		}

		@Override
		public Adapter casePrescribedProcedure(PrescribedProcedure object) {
			return createPrescribedProcedureAdapter();
		}

		@Override
		public Adapter casePrescribedInternment(PrescribedInternment object) {
			return createPrescribedInternmentAdapter();
		}

		@Override
		public Adapter casePrescribedMedication(PrescribedMedication object) {
			return createPrescribedMedicationAdapter();
		}

		@Override
		public Adapter caseComplement(Complement object) {
			return createComplementAdapter();
		}

		@Override
		public Adapter casePrescribedPrescriptionItem(PrescribedPrescriptionItem object) {
			return createPrescribedPrescriptionItemAdapter();
		}

		@Override
		public Adapter caseJustification(Justification object) {
			return createJustificationAdapter();
		}

		@Override
		public Adapter caseResponsible(Responsible object) {
			return createResponsibleAdapter();
		}

		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter caseUnitValue(UnitValue object) {
			return createUnitValueAdapter();
		}

		@Override
		public Adapter caseAnswer(Answer object) {
			return createAnswerAdapter();
		}

		@Override
		public Adapter caseNumeric(Numeric object) {
			return createNumericAdapter();
		}

		@Override
		public Adapter caseYesOrNo(YesOrNo object) {
			return createYesOrNoAdapter();
		}

		@Override
		public Adapter caseStep(Step object) {
			return createStepAdapter();
		}

		@Override
		public Adapter caseCreator(Creator object) {
			return createCreatorAdapter();
		}

		@Override
		public Adapter caseExecutor(Executor object) {
			return createExecutorAdapter();
		}

		@Override
		public Adapter caseLastProfessional(LastProfessional object) {
			return createLastProfessionalAdapter();
		}

		@Override
		public Adapter caseEStep(EStep object) {
			return createEStepAdapter();
		}

		@Override
		public Adapter casePrescription(Prescription object) {
			return createPrescriptionAdapter();
		}

		@Override
		public Adapter caseEPathway(EPathway object) {
			return createEPathwayAdapter();
		}

		@Override
		public Adapter caseQuestion(Question object) {
			return createQuestionAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseMedication(Medication object) {
			return createMedicationAdapter();
		}

		@Override
		public Adapter caseUnit(Unit object) {
			return createUnitAdapter();
		}

		@Override
		public Adapter caseAccess(Access object) {
			return createAccessAdapter();
		}

		@Override
		public Adapter caseEAction(EAction object) {
			return createEActionAdapter();
		}

		@Override
		public Adapter caseRequest(Request object) {
			return createRequestAdapter();
		}

		@Override
		public Adapter casePathway(Pathway object) {
			return createPathwayAdapter();
		}

		@Override
		public Adapter caseEProcedure(EProcedure object) {
			return createEProcedureAdapter();
		}

		@Override
		public Adapter caseEPause(EPause object) {
			return createEPauseAdapter();
		}

		@Override
		public Adapter caseProcedure(Procedure object) {
			return createProcedureAdapter();
		}

		@Override
		public Adapter caseInternment(Internment object) {
			return createInternmentAdapter();
		}

		@Override
		public Adapter caseComplementaryConducts(ComplementaryConducts object) {
			return createComplementaryConductsAdapter();
		}

		@Override
		public Adapter caseMedicalCare(MedicalCare object) {
			return createMedicalCareAdapter();
		}

		@Override
		public Adapter caseComorbidity(Comorbidity object) {
			return createComorbidityAdapter();
		}

		@Override
		public Adapter caseComplementaryMedication(ComplementaryMedication object) {
			return createComplementaryMedicationAdapter();
		}

		@Override
		public Adapter caseComplementaryProcedure(ComplementaryProcedure object) {
			return createComplementaryProcedureAdapter();
		}

		@Override
		public Adapter caseSuspension(Suspension object) {
			return createSuspensionAdapter();
		}

		@Override
		public Adapter caseMedicationPrescribedResource(MedicationPrescribedResource object) {
			return createMedicationPrescribedResourceAdapter();
		}

		@Override
		public Adapter caseNotification(Notification object) {
			return createNotificationAdapter();
		}

		@Override
		public Adapter caseProcedurePrescribedResource(ProcedurePrescribedResource object) {
			return createProcedurePrescribedResourceAdapter();
		}

		@Override
		public Adapter caseComplementaryExamination(ComplementaryExamination object) {
			return createComplementaryExaminationAdapter();
		}

		@Override
		public Adapter caseAudit(Audit object) {
			return createAuditAdapter();
		}

		@Override
		public Adapter caseResult(Result object) {
			return createResultAdapter();
		}

		@Override
		public Adapter caseExaminationPrescribedResource(ExaminationPrescribedResource object) {
			return createExaminationPrescribedResourceAdapter();
		}

		@Override
		public Adapter caseStandard(Standard object) {
			return createStandardAdapter();
		}

		@Override
		public Adapter caseAllergy(Allergy object) {
			return createAllergyAdapter();
		}

		@Override
		public Adapter caseVitalSign(VitalSign object) {
			return createVitalSignAdapter();
		}

		@Override
		public Adapter casePatientAge(PatientAge object) {
			return createPatientAgeAdapter();
		}

		@Override
		public Adapter casePatientSex(PatientSex object) {
			return createPatientSexAdapter();
		}

		@Override
		public Adapter caseBond(Bond object) {
			return createBondAdapter();
		}

		@Override
		public Adapter caseOption(Option object) {
			return createOptionAdapter();
		}

		@Override
		public Adapter caseValue(Value object) {
			return createValueAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.EAuxiliaryConduct <em>EAuxiliary Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.EAuxiliaryConduct
	 * @generated
	 */
	public Adapter createEAuxiliaryConductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.EInformation <em>EInformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.EInformation
	 * @generated
	 */
	public Adapter createEInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.EDischarge <em>EDischarge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.EDischarge
	 * @generated
	 */
	public Adapter createEDischargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.EReferral <em>EReferral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.EReferral
	 * @generated
	 */
	public Adapter createEReferralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.EPrescription <em>EPrescription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.EPrescription
	 * @generated
	 */
	public Adapter createEPrescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.ETreatment <em>ETreatment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.ETreatment
	 * @generated
	 */
	public Adapter createETreatmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Examination <em>Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Examination
	 * @generated
	 */
	public Adapter createExaminationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.PrescribedExamination <em>Prescribed Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.PrescribedExamination
	 * @generated
	 */
	public Adapter createPrescribedExaminationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Exam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Exam
	 * @generated
	 */
	public Adapter createExamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.PrescribedProcedure <em>Prescribed Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.PrescribedProcedure
	 * @generated
	 */
	public Adapter createPrescribedProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.PrescribedInternment <em>Prescribed Internment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.PrescribedInternment
	 * @generated
	 */
	public Adapter createPrescribedInternmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.PrescribedMedication <em>Prescribed Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.PrescribedMedication
	 * @generated
	 */
	public Adapter createPrescribedMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Complement <em>Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Complement
	 * @generated
	 */
	public Adapter createComplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.PrescribedPrescriptionItem <em>Prescribed Prescription Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.PrescribedPrescriptionItem
	 * @generated
	 */
	public Adapter createPrescribedPrescriptionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Justification
	 * @generated
	 */
	public Adapter createJustificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Responsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Responsible
	 * @generated
	 */
	public Adapter createResponsibleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.UnitValue <em>Unit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.UnitValue
	 * @generated
	 */
	public Adapter createUnitValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Answer
	 * @generated
	 */
	public Adapter createAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Numeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Numeric
	 * @generated
	 */
	public Adapter createNumericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.YesOrNo <em>Yes Or No</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.YesOrNo
	 * @generated
	 */
	public Adapter createYesOrNoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Creator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Creator
	 * @generated
	 */
	public Adapter createCreatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Executor
	 * @generated
	 */
	public Adapter createExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.LastProfessional <em>Last Professional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.LastProfessional
	 * @generated
	 */
	public Adapter createLastProfessionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.EStep <em>EStep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.EStep
	 * @generated
	 */
	public Adapter createEStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Prescription <em>Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Prescription
	 * @generated
	 */
	public Adapter createPrescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.EPathway <em>EPathway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.EPathway
	 * @generated
	 */
	public Adapter createEPathwayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Medication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Medication
	 * @generated
	 */
	public Adapter createMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Access
	 * @generated
	 */
	public Adapter createAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.EAction <em>EAction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.EAction
	 * @generated
	 */
	public Adapter createEActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Pathway <em>Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Pathway
	 * @generated
	 */
	public Adapter createPathwayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.EProcedure <em>EProcedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.EProcedure
	 * @generated
	 */
	public Adapter createEProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.EPause <em>EPause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.EPause
	 * @generated
	 */
	public Adapter createEPauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Internment <em>Internment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Internment
	 * @generated
	 */
	public Adapter createInternmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.ComplementaryConducts <em>Complementary Conducts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.ComplementaryConducts
	 * @generated
	 */
	public Adapter createComplementaryConductsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.MedicalCare <em>Medical Care</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.MedicalCare
	 * @generated
	 */
	public Adapter createMedicalCareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Comorbidity <em>Comorbidity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Comorbidity
	 * @generated
	 */
	public Adapter createComorbidityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.ComplementaryMedication <em>Complementary Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.ComplementaryMedication
	 * @generated
	 */
	public Adapter createComplementaryMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.ComplementaryProcedure <em>Complementary Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.ComplementaryProcedure
	 * @generated
	 */
	public Adapter createComplementaryProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Suspension <em>Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Suspension
	 * @generated
	 */
	public Adapter createSuspensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.MedicationPrescribedResource <em>Medication Prescribed Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.MedicationPrescribedResource
	 * @generated
	 */
	public Adapter createMedicationPrescribedResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Notification
	 * @generated
	 */
	public Adapter createNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.ProcedurePrescribedResource <em>Procedure Prescribed Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.ProcedurePrescribedResource
	 * @generated
	 */
	public Adapter createProcedurePrescribedResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.ComplementaryExamination <em>Complementary Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.ComplementaryExamination
	 * @generated
	 */
	public Adapter createComplementaryExaminationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Audit <em>Audit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Audit
	 * @generated
	 */
	public Adapter createAuditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Result
	 * @generated
	 */
	public Adapter createResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.ExaminationPrescribedResource <em>Examination Prescribed Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.ExaminationPrescribedResource
	 * @generated
	 */
	public Adapter createExaminationPrescribedResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Standard
	 * @generated
	 */
	public Adapter createStandardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Allergy <em>Allergy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Allergy
	 * @generated
	 */
	public Adapter createAllergyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.VitalSign <em>Vital Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.VitalSign
	 * @generated
	 */
	public Adapter createVitalSignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.PatientAge <em>Patient Age</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.PatientAge
	 * @generated
	 */
	public Adapter createPatientAgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.PatientSex <em>Patient Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.PatientSex
	 * @generated
	 */
	public Adapter createPatientSexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Bond <em>Bond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Bond
	 * @generated
	 */
	public Adapter createBondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Execution_metamodelAdapterFactory
