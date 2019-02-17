/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.PPaediatricMedicationt;
import MetamodelExecution.PaediatricMedication;
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
 * An implementation of the model object '<em><b>PPaediatric Medicationt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.PPaediatricMedicationtImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PPaediatricMedicationtImpl#getResult <em>Result</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PPaediatricMedicationtImpl#getPrescriptionResult <em>Prescription Result</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PPaediatricMedicationtImpl#getPaediatricMedication <em>Paediatric Medication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PPaediatricMedicationtImpl extends MinimalEObjectImpl.Container implements PPaediatricMedicationt {
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
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected Result result;

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
	 * The cached value of the '{@link #getPaediatricMedication() <em>Paediatric Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaediatricMedication()
	 * @generated
	 * @ordered
	 */
	protected PaediatricMedication paediatricMedication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PPaediatricMedicationtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.PPAEDIATRIC_MEDICATIONT;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__ID, oldId, id));
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
					Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__RESULT, oldResult, newResult);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__RESULT, null,
						msgs);
			if (newResult != null)
				msgs = ((InternalEObject) newResult).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__RESULT, null,
						msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__RESULT, newResult, newResult));
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
					Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PRESCRIPTION_RESULT, oldPrescriptionResult,
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
				msgs = ((InternalEObject) prescriptionResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PRESCRIPTION_RESULT, null, msgs);
			if (newPrescriptionResult != null)
				msgs = ((InternalEObject) newPrescriptionResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PRESCRIPTION_RESULT, null, msgs);
			msgs = basicSetPrescriptionResult(newPrescriptionResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PRESCRIPTION_RESULT, newPrescriptionResult,
					newPrescriptionResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaediatricMedication getPaediatricMedication() {
		return paediatricMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaediatricMedication(PaediatricMedication newPaediatricMedication,
			NotificationChain msgs) {
		PaediatricMedication oldPaediatricMedication = paediatricMedication;
		paediatricMedication = newPaediatricMedication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PAEDIATRIC_MEDICATION, oldPaediatricMedication,
					newPaediatricMedication);
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
	public void setPaediatricMedication(PaediatricMedication newPaediatricMedication) {
		if (newPaediatricMedication != paediatricMedication) {
			NotificationChain msgs = null;
			if (paediatricMedication != null)
				msgs = ((InternalEObject) paediatricMedication).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PAEDIATRIC_MEDICATION,
						null, msgs);
			if (newPaediatricMedication != null)
				msgs = ((InternalEObject) newPaediatricMedication).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PAEDIATRIC_MEDICATION,
						null, msgs);
			msgs = basicSetPaediatricMedication(newPaediatricMedication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PAEDIATRIC_MEDICATION, newPaediatricMedication,
					newPaediatricMedication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__RESULT:
			return basicSetResult(null, msgs);
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PRESCRIPTION_RESULT:
			return basicSetPrescriptionResult(null, msgs);
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PAEDIATRIC_MEDICATION:
			return basicSetPaediatricMedication(null, msgs);
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
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__ID:
			return getId();
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__RESULT:
			return getResult();
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PRESCRIPTION_RESULT:
			return getPrescriptionResult();
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PAEDIATRIC_MEDICATION:
			return getPaediatricMedication();
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
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__RESULT:
			setResult((Result) newValue);
			return;
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PRESCRIPTION_RESULT:
			setPrescriptionResult((PrescriptionResult) newValue);
			return;
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PAEDIATRIC_MEDICATION:
			setPaediatricMedication((PaediatricMedication) newValue);
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
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__RESULT:
			setResult((Result) null);
			return;
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PRESCRIPTION_RESULT:
			setPrescriptionResult((PrescriptionResult) null);
			return;
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PAEDIATRIC_MEDICATION:
			setPaediatricMedication((PaediatricMedication) null);
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
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__RESULT:
			return result != null;
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PRESCRIPTION_RESULT:
			return prescriptionResult != null;
		case Execution_metamodelPackage.PPAEDIATRIC_MEDICATIONT__PAEDIATRIC_MEDICATION:
			return paediatricMedication != null;
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
		result.append(')');
		return result.toString();
	}

} //PPaediatricMedicationtImpl
