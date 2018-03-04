/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Complement;
import MetamodelExecution.Examination;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.PrescribedExamination;
import MetamodelExecution.PrescriptionExam;
import MetamodelExecution.Result;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prescribed Examination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.PrescribedExaminationImpl#getExamination <em>Examination</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescribedExaminationImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescribedExaminationImpl#getReport <em>Report</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescribedExaminationImpl#getNumberGuide <em>Number Guide</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescribedExaminationImpl#getComplement <em>Complement</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescribedExaminationImpl#getResult <em>Result</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescribedExaminationImpl#getPrescriptionexam <em>Prescriptionexam</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrescribedExaminationImpl extends MinimalEObjectImpl.Container implements PrescribedExamination {
	/**
	 * The cached value of the '{@link #getExamination() <em>Examination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamination()
	 * @generated
	 * @ordered
	 */
	protected Examination examination;

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
	 * The default value of the '{@link #getReport() <em>Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReport()
	 * @generated
	 * @ordered
	 */
	protected static final String REPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReport() <em>Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReport()
	 * @generated
	 * @ordered
	 */
	protected String report = REPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberGuide() <em>Number Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberGuide()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_GUIDE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberGuide() <em>Number Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberGuide()
	 * @generated
	 * @ordered
	 */
	protected int numberGuide = NUMBER_GUIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComplement() <em>Complement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected Complement complement;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected Result result;

	/**
	 * The cached value of the '{@link #getPrescriptionexam() <em>Prescriptionexam</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionexam()
	 * @generated
	 * @ordered
	 */
	protected EList<PrescriptionExam> prescriptionexam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrescribedExaminationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.PRESCRIBED_EXAMINATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Examination getExamination() {
		return examination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExamination(Examination newExamination, NotificationChain msgs) {
		Examination oldExamination = examination;
		examination = newExamination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIBED_EXAMINATION__EXAMINATION, oldExamination, newExamination);
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
	public void setExamination(Examination newExamination) {
		if (newExamination != examination) {
			NotificationChain msgs = null;
			if (examination != null)
				msgs = ((InternalEObject) examination).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PRESCRIBED_EXAMINATION__EXAMINATION, null,
						msgs);
			if (newExamination != null)
				msgs = ((InternalEObject) newExamination).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PRESCRIBED_EXAMINATION__EXAMINATION, null,
						msgs);
			msgs = basicSetExamination(newExamination, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIBED_EXAMINATION__EXAMINATION, newExamination, newExamination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PRESCRIBED_EXAMINATION__ID,
					oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReport() {
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReport(String newReport) {
		String oldReport = report;
		report = newReport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIBED_EXAMINATION__REPORT, oldReport, report));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberGuide() {
		return numberGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberGuide(int newNumberGuide) {
		int oldNumberGuide = numberGuide;
		numberGuide = newNumberGuide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIBED_EXAMINATION__NUMBER_GUIDE, oldNumberGuide, numberGuide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complement getComplement() {
		return complement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplement(Complement newComplement, NotificationChain msgs) {
		Complement oldComplement = complement;
		complement = newComplement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT, oldComplement, newComplement);
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
	public void setComplement(Complement newComplement) {
		if (newComplement != complement) {
			NotificationChain msgs = null;
			if (complement != null)
				msgs = ((InternalEObject) complement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT, null,
						msgs);
			if (newComplement != null)
				msgs = ((InternalEObject) newComplement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT, null,
						msgs);
			msgs = basicSetComplement(newComplement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT, newComplement, newComplement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(Result newResult, NotificationChain msgs) {
		Result oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIBED_EXAMINATION__RESULT, oldResult, newResult);
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
	public void setResult(Result newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject) result).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PRESCRIBED_EXAMINATION__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject) newResult).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PRESCRIBED_EXAMINATION__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIBED_EXAMINATION__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrescriptionExam> getPrescriptionexam() {
		if (prescriptionexam == null) {
			prescriptionexam = new EObjectContainmentEList<PrescriptionExam>(PrescriptionExam.class, this,
					Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTIONEXAM);
		}
		return prescriptionexam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__EXAMINATION:
			return basicSetExamination(null, msgs);
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT:
			return basicSetComplement(null, msgs);
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__RESULT:
			return basicSetResult(null, msgs);
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTIONEXAM:
			return ((InternalEList<?>) getPrescriptionexam()).basicRemove(otherEnd, msgs);
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
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__EXAMINATION:
			return getExamination();
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__ID:
			return getId();
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__REPORT:
			return getReport();
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__NUMBER_GUIDE:
			return getNumberGuide();
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT:
			return getComplement();
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__RESULT:
			return getResult();
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTIONEXAM:
			return getPrescriptionexam();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__EXAMINATION:
			setExamination((Examination) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__REPORT:
			setReport((String) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__NUMBER_GUIDE:
			setNumberGuide((Integer) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT:
			setComplement((Complement) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__RESULT:
			setResult((Result) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTIONEXAM:
			getPrescriptionexam().clear();
			getPrescriptionexam().addAll((Collection<? extends PrescriptionExam>) newValue);
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
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__EXAMINATION:
			setExamination((Examination) null);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__REPORT:
			setReport(REPORT_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__NUMBER_GUIDE:
			setNumberGuide(NUMBER_GUIDE_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT:
			setComplement((Complement) null);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__RESULT:
			setResult((Result) null);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTIONEXAM:
			getPrescriptionexam().clear();
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
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__EXAMINATION:
			return examination != null;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__REPORT:
			return REPORT_EDEFAULT == null ? report != null : !REPORT_EDEFAULT.equals(report);
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__NUMBER_GUIDE:
			return numberGuide != NUMBER_GUIDE_EDEFAULT;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT:
			return complement != null;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__RESULT:
			return result != null;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTIONEXAM:
			return prescriptionexam != null && !prescriptionexam.isEmpty();
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
		result.append(", report: ");
		result.append(report);
		result.append(", numberGuide: ");
		result.append(numberGuide);
		result.append(')');
		return result.toString();
	}

} //PrescribedExaminationImpl
