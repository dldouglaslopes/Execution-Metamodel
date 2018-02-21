/**
 */
package MetamodelExecution.util;

import MetamodelExecution.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see MetamodelExecution.Execution_metamodelPackage
 * @generated
 */
public class Execution_metamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Execution_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution_metamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = Execution_metamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Execution_metamodelPackage.EXECUTION_STEP: {
			ExecutionStep executionStep = (ExecutionStep) theEObject;
			T result = caseExecutionStep(executionStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.AUXILIARY_CONDUCT: {
			AuxiliaryConduct auxiliaryConduct = (AuxiliaryConduct) theEObject;
			T result = caseAuxiliaryConduct(auxiliaryConduct);
			if (result == null)
				result = caseExecutionStep(auxiliaryConduct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.INFORMATION: {
			Information information = (Information) theEObject;
			T result = caseInformation(information);
			if (result == null)
				result = caseExecutionStep(information);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.DISCHARGE: {
			Discharge discharge = (Discharge) theEObject;
			T result = caseDischarge(discharge);
			if (result == null)
				result = caseExecutionStep(discharge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.REFERRAL: {
			Referral referral = (Referral) theEObject;
			T result = caseReferral(referral);
			if (result == null)
				result = caseExecutionStep(referral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PRESCRIPTION: {
			Prescription prescription = (Prescription) theEObject;
			T result = casePrescription(prescription);
			if (result == null)
				result = caseExecutionStep(prescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.TREATMENT: {
			Treatment treatment = (Treatment) theEObject;
			T result = caseTreatment(treatment);
			if (result == null)
				result = caseExecutionStep(treatment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EXAMINATION: {
			Examination examination = (Examination) theEObject;
			T result = caseExamination(examination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PREVIOUS: {
			Previous previous = (Previous) theEObject;
			T result = casePrevious(previous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.NEXT: {
			Next next = (Next) theEObject;
			T result = caseNext(next);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.CREATOR: {
			Creator creator = (Creator) theEObject;
			T result = caseCreator(creator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EXECUTOR: {
			Executor executor = (Executor) theEObject;
			T result = caseExecutor(executor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.ANSWER: {
			Answer answer = (Answer) theEObject;
			T result = caseAnswer(answer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.QUESTION: {
			Question question = (Question) theEObject;
			T result = caseQuestion(question);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION: {
			PrescribedExamination prescribedExamination = (PrescribedExamination) theEObject;
			T result = casePrescribedExamination(prescribedExamination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EXAM: {
			Exam exam = (Exam) theEObject;
			T result = caseExam(exam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PRESCRIBED_PROCEDURE: {
			PrescribedProcedure prescribedProcedure = (PrescribedProcedure) theEObject;
			T result = casePrescribedProcedure(prescribedProcedure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT: {
			PrescribedInternment prescribedInternment = (PrescribedInternment) theEObject;
			T result = casePrescribedInternment(prescribedInternment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PRESCRIBED_MEDICATION: {
			PrescribedMedication prescribedMedication = (PrescribedMedication) theEObject;
			T result = casePrescribedMedication(prescribedMedication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION: {
			ExaminationPrescription examinationPrescription = (ExaminationPrescription) theEObject;
			T result = caseExaminationPrescription(examinationPrescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.COMPLEMENT: {
			Complement complement = (Complement) theEObject;
			T result = caseComplement(complement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PRESCRIBED_PRESCRIPTION_ITEM: {
			PrescribedPrescriptionItem prescribedPrescriptionItem = (PrescribedPrescriptionItem) theEObject;
			T result = casePrescribedPrescriptionItem(prescribedPrescriptionItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PRESCRIBED_MEDICAMENT: {
			PrescribedMedicament prescribedMedicament = (PrescribedMedicament) theEObject;
			T result = casePrescribedMedicament(prescribedMedicament);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EXTENDED_PROTOCOL: {
			ExtendedProtocol extendedProtocol = (ExtendedProtocol) theEObject;
			T result = caseExtendedProtocol(extendedProtocol);
			if (result == null)
				result = caseProtocolosv2_Protocol(extendedProtocol);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EXECUTION_PROTOCOL: {
			ExecutionProtocol executionProtocol = (ExecutionProtocol) theEObject;
			T result = caseExecutionProtocol(executionProtocol);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.JUSTIFY: {
			Justify justify = (Justify) theEObject;
			T result = caseJustify(justify);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PROTOCOL: {
			Protocol protocol = (Protocol) theEObject;
			T result = caseProtocol(protocol);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.RESPONSIBLE: {
			Responsible responsible = (Responsible) theEObject;
			T result = caseResponsible(responsible);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EXECUTED_STEP: {
			ExecutedStep executedStep = (ExecutedStep) theEObject;
			T result = caseExecutedStep(executedStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.LAST_PROFESSIONAL: {
			LastProfessional lastProfessional = (LastProfessional) theEObject;
			T result = caseLastProfessional(lastProfessional);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.DATA: {
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionStep(ExecutionStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auxiliary Conduct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auxiliary Conduct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxiliaryConduct(AuxiliaryConduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformation(Information object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischarge(Discharge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferral(Referral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prescription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prescription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrescription(Prescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Treatment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Treatment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreatment(Treatment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Examination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Examination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExamination(Examination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Previous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Previous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrevious(Previous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNext(Next object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreator(Creator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutor(Executor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswer(Answer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prescribed Examination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prescribed Examination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrescribedExamination(PrescribedExamination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExam(Exam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prescribed Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prescribed Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrescribedProcedure(PrescribedProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prescribed Internment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prescribed Internment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrescribedInternment(PrescribedInternment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prescribed Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prescribed Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrescribedMedication(PrescribedMedication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Examination Prescription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Examination Prescription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExaminationPrescription(ExaminationPrescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplement(Complement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prescribed Prescription Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prescribed Prescription Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrescribedPrescriptionItem(PrescribedPrescriptionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prescribed Medicament</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prescribed Medicament</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrescribedMedicament(PrescribedMedicament object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedProtocol(ExtendedProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionProtocol(ExecutionProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Justify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Justify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJustify(Justify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocol(Protocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsible(Responsible object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executed Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executed Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutedStep(ExecutedStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last Professional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Professional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastProfessional(LastProfessional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolosv2_Protocol(protocolosv2.Protocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Execution_metamodelSwitch
