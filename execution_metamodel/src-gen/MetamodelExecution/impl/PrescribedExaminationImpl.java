/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Complement;
import MetamodelExecution.Examination;
import MetamodelExecution.ExaminationPrescription;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.PrescribedExamination;

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
 *   <li>{@link MetamodelExecution.impl.PrescribedExaminationImpl#getResult <em>Result</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescribedExaminationImpl#getReport <em>Report</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescribedExaminationImpl#getNumberGuide <em>Number Guide</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescribedExaminationImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescribedExaminationImpl#getComplement <em>Complement</em>}</li>
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
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected String result = RESULT_EDEFAULT;

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
	 * The cached value of the '{@link #getPrescription() <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescription()
	 * @generated
	 * @ordered
	 */
	protected ExaminationPrescription prescription;

	/**
	 * The cached value of the '{@link #getComplement() <em>Complement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected EList<Complement> complement;

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
	public String getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(String newResult) {
		String oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIBED_EXAMINATION__RESULT, oldResult, result));
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
	public ExaminationPrescription getPrescription() {
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescription(ExaminationPrescription newPrescription, NotificationChain msgs) {
		ExaminationPrescription oldPrescription = prescription;
		prescription = newPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTION, oldPrescription, newPrescription);
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
	public void setPrescription(ExaminationPrescription newPrescription) {
		if (newPrescription != prescription) {
			NotificationChain msgs = null;
			if (prescription != null)
				msgs = ((InternalEObject) prescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTION, null,
						msgs);
			if (newPrescription != null)
				msgs = ((InternalEObject) newPrescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTION, null,
						msgs);
			msgs = basicSetPrescription(newPrescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTION, newPrescription, newPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Complement> getComplement() {
		if (complement == null) {
			complement = new EObjectContainmentEList<Complement>(Complement.class, this,
					Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT);
		}
		return complement;
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
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTION:
			return basicSetPrescription(null, msgs);
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT:
			return ((InternalEList<?>) getComplement()).basicRemove(otherEnd, msgs);
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
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__RESULT:
			return getResult();
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__REPORT:
			return getReport();
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__NUMBER_GUIDE:
			return getNumberGuide();
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTION:
			return getPrescription();
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT:
			return getComplement();
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
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__RESULT:
			setResult((String) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__REPORT:
			setReport((String) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__NUMBER_GUIDE:
			setNumberGuide((Integer) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTION:
			setPrescription((ExaminationPrescription) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT:
			getComplement().clear();
			getComplement().addAll((Collection<? extends Complement>) newValue);
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
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__RESULT:
			setResult(RESULT_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__REPORT:
			setReport(REPORT_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__NUMBER_GUIDE:
			setNumberGuide(NUMBER_GUIDE_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTION:
			setPrescription((ExaminationPrescription) null);
			return;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT:
			getComplement().clear();
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
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__RESULT:
			return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__REPORT:
			return REPORT_EDEFAULT == null ? report != null : !REPORT_EDEFAULT.equals(report);
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__NUMBER_GUIDE:
			return numberGuide != NUMBER_GUIDE_EDEFAULT;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__PRESCRIPTION:
			return prescription != null;
		case Execution_metamodelPackage.PRESCRIBED_EXAMINATION__COMPLEMENT:
			return complement != null && !complement.isEmpty();
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
		result.append(", result: ");
		result.append(result);
		result.append(", report: ");
		result.append(report);
		result.append(", numberGuide: ");
		result.append(numberGuide);
		result.append(')');
		return result.toString();
	}

} //PrescribedExaminationImpl
