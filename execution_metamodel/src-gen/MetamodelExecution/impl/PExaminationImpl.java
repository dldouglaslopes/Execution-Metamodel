/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Complement;
import MetamodelExecution.Examination;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.PExamination;
import MetamodelExecution.PrescriptionResult;
import MetamodelExecution.Result;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PExamination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.PExaminationImpl#getExamination <em>Examination</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PExaminationImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PExaminationImpl#getReport <em>Report</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PExaminationImpl#getNumberGuide <em>Number Guide</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PExaminationImpl#getComplement <em>Complement</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PExaminationImpl#getPrescriptionResult <em>Prescription Result</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PExaminationImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PExaminationImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PExaminationImpl extends MinimalEObjectImpl.Container implements PExamination {
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
	 * The cached value of the '{@link #getPrescriptionResult() <em>Prescription Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionResult()
	 * @generated
	 * @ordered
	 */
	protected PrescriptionResult prescriptionResult;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PExaminationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.PEXAMINATION;
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
					Execution_metamodelPackage.PEXAMINATION__EXAMINATION, oldExamination, newExamination);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PEXAMINATION__EXAMINATION, null, msgs);
			if (newExamination != null)
				msgs = ((InternalEObject) newExamination).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PEXAMINATION__EXAMINATION, null, msgs);
			msgs = basicSetExamination(newExamination, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PEXAMINATION__EXAMINATION,
					newExamination, newExamination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PEXAMINATION__ID, oldId,
					id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PEXAMINATION__REPORT,
					oldReport, report));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PEXAMINATION__NUMBER_GUIDE,
					oldNumberGuide, numberGuide));
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
					Execution_metamodelPackage.PEXAMINATION__COMPLEMENT, oldComplement, newComplement);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PEXAMINATION__COMPLEMENT, null, msgs);
			if (newComplement != null)
				msgs = ((InternalEObject) newComplement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PEXAMINATION__COMPLEMENT, null, msgs);
			msgs = basicSetComplement(newComplement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PEXAMINATION__COMPLEMENT,
					newComplement, newComplement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriptionResult getPrescriptionResult() {
		return prescriptionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescriptionResult(PrescriptionResult newPrescriptionResult,
			NotificationChain msgs) {
		PrescriptionResult oldPrescriptionResult = prescriptionResult;
		prescriptionResult = newPrescriptionResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PEXAMINATION__PRESCRIPTION_RESULT, oldPrescriptionResult,
					newPrescriptionResult);
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
	public void setPrescriptionResult(PrescriptionResult newPrescriptionResult) {
		if (newPrescriptionResult != prescriptionResult) {
			NotificationChain msgs = null;
			if (prescriptionResult != null)
				msgs = ((InternalEObject) prescriptionResult).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PEXAMINATION__PRESCRIPTION_RESULT, null,
						msgs);
			if (newPrescriptionResult != null)
				msgs = ((InternalEObject) newPrescriptionResult).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PEXAMINATION__PRESCRIPTION_RESULT, null,
						msgs);
			msgs = basicSetPrescriptionResult(newPrescriptionResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PEXAMINATION__PRESCRIPTION_RESULT, newPrescriptionResult,
					newPrescriptionResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PEXAMINATION__NAME,
					oldName, name));
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
					Execution_metamodelPackage.PEXAMINATION__RESULT, oldResult, newResult);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PEXAMINATION__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject) newResult).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PEXAMINATION__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PEXAMINATION__RESULT,
					newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.PEXAMINATION__EXAMINATION:
			return basicSetExamination(null, msgs);
		case Execution_metamodelPackage.PEXAMINATION__COMPLEMENT:
			return basicSetComplement(null, msgs);
		case Execution_metamodelPackage.PEXAMINATION__PRESCRIPTION_RESULT:
			return basicSetPrescriptionResult(null, msgs);
		case Execution_metamodelPackage.PEXAMINATION__RESULT:
			return basicSetResult(null, msgs);
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
		case Execution_metamodelPackage.PEXAMINATION__EXAMINATION:
			return getExamination();
		case Execution_metamodelPackage.PEXAMINATION__ID:
			return getId();
		case Execution_metamodelPackage.PEXAMINATION__REPORT:
			return getReport();
		case Execution_metamodelPackage.PEXAMINATION__NUMBER_GUIDE:
			return getNumberGuide();
		case Execution_metamodelPackage.PEXAMINATION__COMPLEMENT:
			return getComplement();
		case Execution_metamodelPackage.PEXAMINATION__PRESCRIPTION_RESULT:
			return getPrescriptionResult();
		case Execution_metamodelPackage.PEXAMINATION__NAME:
			return getName();
		case Execution_metamodelPackage.PEXAMINATION__RESULT:
			return getResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Execution_metamodelPackage.PEXAMINATION__EXAMINATION:
			setExamination((Examination) newValue);
			return;
		case Execution_metamodelPackage.PEXAMINATION__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.PEXAMINATION__REPORT:
			setReport((String) newValue);
			return;
		case Execution_metamodelPackage.PEXAMINATION__NUMBER_GUIDE:
			setNumberGuide((Integer) newValue);
			return;
		case Execution_metamodelPackage.PEXAMINATION__COMPLEMENT:
			setComplement((Complement) newValue);
			return;
		case Execution_metamodelPackage.PEXAMINATION__PRESCRIPTION_RESULT:
			setPrescriptionResult((PrescriptionResult) newValue);
			return;
		case Execution_metamodelPackage.PEXAMINATION__NAME:
			setName((String) newValue);
			return;
		case Execution_metamodelPackage.PEXAMINATION__RESULT:
			setResult((Result) newValue);
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
		case Execution_metamodelPackage.PEXAMINATION__EXAMINATION:
			setExamination((Examination) null);
			return;
		case Execution_metamodelPackage.PEXAMINATION__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.PEXAMINATION__REPORT:
			setReport(REPORT_EDEFAULT);
			return;
		case Execution_metamodelPackage.PEXAMINATION__NUMBER_GUIDE:
			setNumberGuide(NUMBER_GUIDE_EDEFAULT);
			return;
		case Execution_metamodelPackage.PEXAMINATION__COMPLEMENT:
			setComplement((Complement) null);
			return;
		case Execution_metamodelPackage.PEXAMINATION__PRESCRIPTION_RESULT:
			setPrescriptionResult((PrescriptionResult) null);
			return;
		case Execution_metamodelPackage.PEXAMINATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Execution_metamodelPackage.PEXAMINATION__RESULT:
			setResult((Result) null);
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
		case Execution_metamodelPackage.PEXAMINATION__EXAMINATION:
			return examination != null;
		case Execution_metamodelPackage.PEXAMINATION__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.PEXAMINATION__REPORT:
			return REPORT_EDEFAULT == null ? report != null : !REPORT_EDEFAULT.equals(report);
		case Execution_metamodelPackage.PEXAMINATION__NUMBER_GUIDE:
			return numberGuide != NUMBER_GUIDE_EDEFAULT;
		case Execution_metamodelPackage.PEXAMINATION__COMPLEMENT:
			return complement != null;
		case Execution_metamodelPackage.PEXAMINATION__PRESCRIPTION_RESULT:
			return prescriptionResult != null;
		case Execution_metamodelPackage.PEXAMINATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Execution_metamodelPackage.PEXAMINATION__RESULT:
			return result != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PExaminationImpl
