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
		case Execution_metamodelPackage.EAUXILIARY_CONDUCT: {
			EAuxiliaryConduct eAuxiliaryConduct = (EAuxiliaryConduct) theEObject;
			T result = caseEAuxiliaryConduct(eAuxiliaryConduct);
			if (result == null)
				result = caseEStep(eAuxiliaryConduct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EINFORMATION: {
			EInformation eInformation = (EInformation) theEObject;
			T result = caseEInformation(eInformation);
			if (result == null)
				result = caseEStep(eInformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EDISCHARGE: {
			EDischarge eDischarge = (EDischarge) theEObject;
			T result = caseEDischarge(eDischarge);
			if (result == null)
				result = caseEStep(eDischarge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EREFERRAL: {
			EReferral eReferral = (EReferral) theEObject;
			T result = caseEReferral(eReferral);
			if (result == null)
				result = caseEStep(eReferral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EPRESCRIPTION: {
			EPrescription ePrescription = (EPrescription) theEObject;
			T result = caseEPrescription(ePrescription);
			if (result == null)
				result = caseEStep(ePrescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.ETREATMENT: {
			ETreatment eTreatment = (ETreatment) theEObject;
			T result = caseETreatment(eTreatment);
			if (result == null)
				result = caseEStep(eTreatment);
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
		case Execution_metamodelPackage.JUSTIFICATION: {
			Justification justification = (Justification) theEObject;
			T result = caseJustification(justification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.RESPONSIBLE: {
			Responsible responsible = (Responsible) theEObject;
			T result = caseResponsible(responsible);
			if (result == null)
				result = caseUser(responsible);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.USER: {
			User user = (User) theEObject;
			T result = caseUser(user);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.VALUE: {
			Value value = (Value) theEObject;
			T result = caseValue(value);
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
		case Execution_metamodelPackage.NUMERIC: {
			Numeric numeric = (Numeric) theEObject;
			T result = caseNumeric(numeric);
			if (result == null)
				result = caseValue(numeric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.YES_OR_NO: {
			YesOrNo yesOrNo = (YesOrNo) theEObject;
			T result = caseYesOrNo(yesOrNo);
			if (result == null)
				result = caseValue(yesOrNo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.STEP: {
			Step step = (Step) theEObject;
			T result = caseStep(step);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.CREATOR: {
			Creator creator = (Creator) theEObject;
			T result = caseCreator(creator);
			if (result == null)
				result = caseUser(creator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EXECUTOR: {
			Executor executor = (Executor) theEObject;
			T result = caseExecutor(executor);
			if (result == null)
				result = caseUser(executor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.LAST_PROFESSIONAL: {
			LastProfessional lastProfessional = (LastProfessional) theEObject;
			T result = caseLastProfessional(lastProfessional);
			if (result == null)
				result = caseUser(lastProfessional);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.ESTEP: {
			EStep eStep = (EStep) theEObject;
			T result = caseEStep(eStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PRESCRIPTION: {
			Prescription prescription = (Prescription) theEObject;
			T result = casePrescription(prescription);
			if (result == null)
				result = caseNotification(prescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EPATHWAY: {
			EPathway ePathway = (EPathway) theEObject;
			T result = caseEPathway(ePathway);
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
		case Execution_metamodelPackage.MEDICATION: {
			Medication medication = (Medication) theEObject;
			T result = caseMedication(medication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.UNIT: {
			Unit unit = (Unit) theEObject;
			T result = caseUnit(unit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.ACCESS: {
			Access access = (Access) theEObject;
			T result = caseAccess(access);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.BOND: {
			Bond bond = (Bond) theEObject;
			T result = caseBond(bond);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EACTION: {
			EAction eAction = (EAction) theEObject;
			T result = caseEAction(eAction);
			if (result == null)
				result = caseEStep(eAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.REQUEST: {
			Request request = (Request) theEObject;
			T result = caseRequest(request);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PATHWAY: {
			Pathway pathway = (Pathway) theEObject;
			T result = casePathway(pathway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EPROCEDURE: {
			EProcedure eProcedure = (EProcedure) theEObject;
			T result = caseEProcedure(eProcedure);
			if (result == null)
				result = caseEStep(eProcedure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.EPAUSE: {
			EPause ePause = (EPause) theEObject;
			T result = caseEPause(ePause);
			if (result == null)
				result = caseEStep(ePause);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.MEDICAL_CARE: {
			MedicalCare medicalCare = (MedicalCare) theEObject;
			T result = caseMedicalCare(medicalCare);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.UNIT_CARE: {
			UnitCare unitCare = (UnitCare) theEObject;
			T result = caseUnitCare(unitCare);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PROFESSIONAL: {
			Professional professional = (Professional) theEObject;
			T result = caseProfessional(professional);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PATIENT: {
			Patient patient = (Patient) theEObject;
			T result = casePatient(patient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.ALLERGY_REGISTRY: {
			AllergyRegistry allergyRegistry = (AllergyRegistry) theEObject;
			T result = caseAllergyRegistry(allergyRegistry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY: {
			ComorbidityRegistry comorbidityRegistry = (ComorbidityRegistry) theEObject;
			T result = caseComorbidityRegistry(comorbidityRegistry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.ALLERGY: {
			Allergy allergy = (Allergy) theEObject;
			T result = caseAllergy(allergy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PROCEDURE: {
			Procedure procedure = (Procedure) theEObject;
			T result = caseProcedure(procedure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.INTERNMENT: {
			Internment internment = (Internment) theEObject;
			T result = caseInternment(internment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS: {
			ComplementaryConducts complementaryConducts = (ComplementaryConducts) theEObject;
			T result = caseComplementaryConducts(complementaryConducts);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.ATTENDANCE: {
			Attendance attendance = (Attendance) theEObject;
			T result = caseAttendance(attendance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.COMORBIDITY: {
			Comorbidity comorbidity = (Comorbidity) theEObject;
			T result = caseComorbidity(comorbidity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.COMPLEMENTARY_MEDICATION: {
			ComplementaryMedication complementaryMedication = (ComplementaryMedication) theEObject;
			T result = caseComplementaryMedication(complementaryMedication);
			if (result == null)
				result = caseComplementaryConducts(complementaryMedication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.COMPLEMENTARY_PROCEDURE: {
			ComplementaryProcedure complementaryProcedure = (ComplementaryProcedure) theEObject;
			T result = caseComplementaryProcedure(complementaryProcedure);
			if (result == null)
				result = caseComplementaryConducts(complementaryProcedure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.SUSPENSION: {
			Suspension suspension = (Suspension) theEObject;
			T result = caseSuspension(suspension);
			if (result == null)
				result = caseNotification(suspension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE: {
			MedicationPrescribedResource medicationPrescribedResource = (MedicationPrescribedResource) theEObject;
			T result = caseMedicationPrescribedResource(medicationPrescribedResource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.NOTIFICATION: {
			Notification notification = (Notification) theEObject;
			T result = caseNotification(notification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE: {
			ProcedurePrescribedResource procedurePrescribedResource = (ProcedurePrescribedResource) theEObject;
			T result = caseProcedurePrescribedResource(procedurePrescribedResource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.COMPLEMENTARY_EXAMINATION: {
			ComplementaryExamination complementaryExamination = (ComplementaryExamination) theEObject;
			T result = caseComplementaryExamination(complementaryExamination);
			if (result == null)
				result = caseComplementaryConducts(complementaryExamination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Execution_metamodelPackage.COMPLEMENTARY_ITEM_PRESCRIPTION: {
			ComplementaryItemPrescription complementaryItemPrescription = (ComplementaryItemPrescription) theEObject;
			T result = caseComplementaryItemPrescription(complementaryItemPrescription);
			if (result == null)
				result = caseComplementaryConducts(complementaryItemPrescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAuxiliary Conduct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAuxiliary Conduct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAuxiliaryConduct(EAuxiliaryConduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EInformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EInformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEInformation(EInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDischarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDischarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDischarge(EDischarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReferral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReferral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEReferral(EReferral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPrescription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPrescription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPrescription(EPrescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETreatment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETreatment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETreatment(ETreatment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Justification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJustification(Justification object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumeric(Numeric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Yes Or No</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Yes Or No</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYesOrNo(YesOrNo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EStep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStep(EStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EPathway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPathway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPathway(EPathway object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedication(Medication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccess(Access object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBond(Bond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAction(EAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequest(Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pathway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pathway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathway(Pathway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EProcedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EProcedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEProcedure(EProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPause(EPause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medical Care</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical Care</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalCare(MedicalCare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Care</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Care</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitCare(UnitCare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfessional(Professional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient(Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyRegistry(AllergyRegistry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comorbidity Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comorbidity Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComorbidityRegistry(ComorbidityRegistry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergy(Allergy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternment(Internment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complementary Conducts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complementary Conducts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplementaryConducts(ComplementaryConducts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attendance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attendance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttendance(Attendance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comorbidity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comorbidity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComorbidity(Comorbidity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complementary Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complementary Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplementaryMedication(ComplementaryMedication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complementary Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complementary Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplementaryProcedure(ComplementaryProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspension(Suspension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Prescribed Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Prescribed Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationPrescribedResource(MedicationPrescribedResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotification(Notification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Prescribed Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Prescribed Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedurePrescribedResource(ProcedurePrescribedResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complementary Examination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complementary Examination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplementaryExamination(ComplementaryExamination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complementary Item Prescription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complementary Item Prescription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplementaryItemPrescription(ComplementaryItemPrescription object) {
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
