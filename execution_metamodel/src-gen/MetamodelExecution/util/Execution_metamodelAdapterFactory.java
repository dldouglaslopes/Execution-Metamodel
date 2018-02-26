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
		public Adapter caseStep(Step object) {
			return createStepAdapter();
		}

		@Override
		public Adapter caseAuxiliaryConduct(AuxiliaryConduct object) {
			return createAuxiliaryConductAdapter();
		}

		@Override
		public Adapter caseInformation(Information object) {
			return createInformationAdapter();
		}

		@Override
		public Adapter caseDischarge(Discharge object) {
			return createDischargeAdapter();
		}

		@Override
		public Adapter caseReferral(Referral object) {
			return createReferralAdapter();
		}

		@Override
		public Adapter casePrescription(Prescription object) {
			return createPrescriptionAdapter();
		}

		@Override
		public Adapter caseTreatment(Treatment object) {
			return createTreatmentAdapter();
		}

		@Override
		public Adapter caseExamination(Examination object) {
			return createExaminationAdapter();
		}

		@Override
		public Adapter casePrevious(Previous object) {
			return createPreviousAdapter();
		}

		@Override
		public Adapter caseNext(Next object) {
			return createNextAdapter();
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
		public Adapter caseExaminationPrescription(ExaminationPrescription object) {
			return createExaminationPrescriptionAdapter();
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
		public Adapter casePrescribedMedicament(PrescribedMedicament object) {
			return createPrescribedMedicamentAdapter();
		}

		@Override
		public Adapter caseShortExecution(ShortExecution object) {
			return createShortExecutionAdapter();
		}

		@Override
		public Adapter caseJustification(Justification object) {
			return createJustificationAdapter();
		}

		@Override
		public Adapter casePathway(Pathway object) {
			return createPathwayAdapter();
		}

		@Override
		public Adapter caseResponsible(Responsible object) {
			return createResponsibleAdapter();
		}

		@Override
		public Adapter caseExecutedStep(ExecutedStep object) {
			return createExecutedStepAdapter();
		}

		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter caseValue(Value object) {
			return createValueAdapter();
		}

		@Override
		public Adapter caseAnswer(Answer object) {
			return createAnswerAdapter();
		}

		@Override
		public Adapter caseExecution(Execution object) {
			return createExecutionAdapter();
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
		public Adapter caseCompleteStep(CompleteStep object) {
			return createCompleteStepAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseModeling(Modeling object) {
			return createModelingAdapter();
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
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.AuxiliaryConduct <em>Auxiliary Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.AuxiliaryConduct
	 * @generated
	 */
	public Adapter createAuxiliaryConductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Information
	 * @generated
	 */
	public Adapter createInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Discharge <em>Discharge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Discharge
	 * @generated
	 */
	public Adapter createDischargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Referral <em>Referral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Referral
	 * @generated
	 */
	public Adapter createReferralAdapter() {
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
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Treatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Treatment
	 * @generated
	 */
	public Adapter createTreatmentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Previous <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Previous
	 * @generated
	 */
	public Adapter createPreviousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Next <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Next
	 * @generated
	 */
	public Adapter createNextAdapter() {
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
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.ExaminationPrescription <em>Examination Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.ExaminationPrescription
	 * @generated
	 */
	public Adapter createExaminationPrescriptionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.PrescribedMedicament <em>Prescribed Medicament</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.PrescribedMedicament
	 * @generated
	 */
	public Adapter createPrescribedMedicamentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.ShortExecution <em>Short Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.ShortExecution
	 * @generated
	 */
	public Adapter createShortExecutionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.ExecutedStep <em>Executed Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.ExecutedStep
	 * @generated
	 */
	public Adapter createExecutedStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Execution
	 * @generated
	 */
	public Adapter createExecutionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.CompleteStep <em>Complete Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.CompleteStep
	 * @generated
	 */
	public Adapter createCompleteStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelExecution.Modeling <em>Modeling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelExecution.Modeling
	 * @generated
	 */
	public Adapter createModelingAdapter() {
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
