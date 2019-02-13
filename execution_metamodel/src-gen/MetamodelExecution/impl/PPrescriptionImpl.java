/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.PPrescription;
import MetamodelExecution.Prescription;
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
 * An implementation of the model object '<em><b>PPrescription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.PPrescriptionImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PPrescriptionImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PPrescriptionImpl#getPrescriptionResult <em>Prescription Result</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PPrescriptionImpl#isLastPrescriptionExecuted <em>Last Prescription Executed</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PPrescriptionImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PPrescriptionImpl extends MinimalEObjectImpl.Container implements PPrescription {
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
	 * The cached value of the '{@link #getPrescription() <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescription()
	 * @generated
	 * @ordered
	 */
	protected Prescription prescription;

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
	 * The default value of the '{@link #isLastPrescriptionExecuted() <em>Last Prescription Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLastPrescriptionExecuted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAST_PRESCRIPTION_EXECUTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLastPrescriptionExecuted() <em>Last Prescription Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLastPrescriptionExecuted()
	 * @generated
	 * @ordered
	 */
	protected boolean lastPrescriptionExecuted = LAST_PRESCRIPTION_EXECUTED_EDEFAULT;

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
	protected PPrescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.PPRESCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PPRESCRIPTION__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prescription getPrescription() {
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescription(Prescription newPrescription, NotificationChain msgs) {
		Prescription oldPrescription = prescription;
		prescription = newPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION, oldPrescription, newPrescription);
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
	public void setPrescription(Prescription newPrescription) {
		if (newPrescription != prescription) {
			NotificationChain msgs = null;
			if (prescription != null)
				msgs = ((InternalEObject) prescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION, null, msgs);
			if (newPrescription != null)
				msgs = ((InternalEObject) newPrescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION, null, msgs);
			msgs = basicSetPrescription(newPrescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION, newPrescription, newPrescription));
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
					Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION_RESULT, oldPrescriptionResult,
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION_RESULT, null,
						msgs);
			if (newPrescriptionResult != null)
				msgs = ((InternalEObject) newPrescriptionResult).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION_RESULT, null,
						msgs);
			msgs = basicSetPrescriptionResult(newPrescriptionResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION_RESULT, newPrescriptionResult,
					newPrescriptionResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLastPrescriptionExecuted() {
		return lastPrescriptionExecuted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastPrescriptionExecuted(boolean newLastPrescriptionExecuted) {
		boolean oldLastPrescriptionExecuted = lastPrescriptionExecuted;
		lastPrescriptionExecuted = newLastPrescriptionExecuted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PPRESCRIPTION__LAST_PRESCRIPTION_EXECUTED, oldLastPrescriptionExecuted,
					lastPrescriptionExecuted));
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
					Execution_metamodelPackage.PPRESCRIPTION__RESULT, oldResult, newResult);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PPRESCRIPTION__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject) newResult).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PPRESCRIPTION__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PPRESCRIPTION__RESULT,
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
		case Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION:
			return basicSetPrescription(null, msgs);
		case Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION_RESULT:
			return basicSetPrescriptionResult(null, msgs);
		case Execution_metamodelPackage.PPRESCRIPTION__RESULT:
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
		case Execution_metamodelPackage.PPRESCRIPTION__ID:
			return getId();
		case Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION:
			return getPrescription();
		case Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION_RESULT:
			return getPrescriptionResult();
		case Execution_metamodelPackage.PPRESCRIPTION__LAST_PRESCRIPTION_EXECUTED:
			return isLastPrescriptionExecuted();
		case Execution_metamodelPackage.PPRESCRIPTION__RESULT:
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
		case Execution_metamodelPackage.PPRESCRIPTION__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION:
			setPrescription((Prescription) newValue);
			return;
		case Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION_RESULT:
			setPrescriptionResult((PrescriptionResult) newValue);
			return;
		case Execution_metamodelPackage.PPRESCRIPTION__LAST_PRESCRIPTION_EXECUTED:
			setLastPrescriptionExecuted((Boolean) newValue);
			return;
		case Execution_metamodelPackage.PPRESCRIPTION__RESULT:
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
		case Execution_metamodelPackage.PPRESCRIPTION__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION:
			setPrescription((Prescription) null);
			return;
		case Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION_RESULT:
			setPrescriptionResult((PrescriptionResult) null);
			return;
		case Execution_metamodelPackage.PPRESCRIPTION__LAST_PRESCRIPTION_EXECUTED:
			setLastPrescriptionExecuted(LAST_PRESCRIPTION_EXECUTED_EDEFAULT);
			return;
		case Execution_metamodelPackage.PPRESCRIPTION__RESULT:
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
		case Execution_metamodelPackage.PPRESCRIPTION__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION:
			return prescription != null;
		case Execution_metamodelPackage.PPRESCRIPTION__PRESCRIPTION_RESULT:
			return prescriptionResult != null;
		case Execution_metamodelPackage.PPRESCRIPTION__LAST_PRESCRIPTION_EXECUTED:
			return lastPrescriptionExecuted != LAST_PRESCRIPTION_EXECUTED_EDEFAULT;
		case Execution_metamodelPackage.PPRESCRIPTION__RESULT:
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
		result.append(", lastPrescriptionExecuted: ");
		result.append(lastPrescriptionExecuted);
		result.append(')');
		return result.toString();
	}

} //PPrescriptionImpl
