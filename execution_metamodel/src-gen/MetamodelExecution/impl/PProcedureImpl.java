/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.PProcedure;
import MetamodelExecution.PrescriptionResult;
import MetamodelExecution.Procedure;

import MetamodelExecution.Result;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PProcedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.PProcedureImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PProcedureImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PProcedureImpl#getResult <em>Result</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PProcedureImpl#getPrescriptionResult <em>Prescription Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PProcedureImpl extends MinimalEObjectImpl.Container implements PProcedure {
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
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected Procedure procedure;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.PPROCEDURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PPROCEDURE__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure getProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedure(Procedure newProcedure, NotificationChain msgs) {
		Procedure oldProcedure = procedure;
		procedure = newProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PPROCEDURE__PROCEDURE, oldProcedure, newProcedure);
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
	public void setProcedure(Procedure newProcedure) {
		if (newProcedure != procedure) {
			NotificationChain msgs = null;
			if (procedure != null)
				msgs = ((InternalEObject) procedure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PPROCEDURE__PROCEDURE, null, msgs);
			if (newProcedure != null)
				msgs = ((InternalEObject) newProcedure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PPROCEDURE__PROCEDURE, null, msgs);
			msgs = basicSetProcedure(newProcedure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PPROCEDURE__PROCEDURE,
					newProcedure, newProcedure));
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
					Execution_metamodelPackage.PPROCEDURE__RESULT, oldResult, newResult);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PPROCEDURE__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject) newResult).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PPROCEDURE__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PPROCEDURE__RESULT,
					newResult, newResult));
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
					Execution_metamodelPackage.PPROCEDURE__PRESCRIPTION_RESULT, oldPrescriptionResult,
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PPROCEDURE__PRESCRIPTION_RESULT, null,
						msgs);
			if (newPrescriptionResult != null)
				msgs = ((InternalEObject) newPrescriptionResult).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PPROCEDURE__PRESCRIPTION_RESULT, null,
						msgs);
			msgs = basicSetPrescriptionResult(newPrescriptionResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PPROCEDURE__PRESCRIPTION_RESULT, newPrescriptionResult,
					newPrescriptionResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.PPROCEDURE__PROCEDURE:
			return basicSetProcedure(null, msgs);
		case Execution_metamodelPackage.PPROCEDURE__RESULT:
			return basicSetResult(null, msgs);
		case Execution_metamodelPackage.PPROCEDURE__PRESCRIPTION_RESULT:
			return basicSetPrescriptionResult(null, msgs);
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
		case Execution_metamodelPackage.PPROCEDURE__ID:
			return getId();
		case Execution_metamodelPackage.PPROCEDURE__PROCEDURE:
			return getProcedure();
		case Execution_metamodelPackage.PPROCEDURE__RESULT:
			return getResult();
		case Execution_metamodelPackage.PPROCEDURE__PRESCRIPTION_RESULT:
			return getPrescriptionResult();
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
		case Execution_metamodelPackage.PPROCEDURE__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.PPROCEDURE__PROCEDURE:
			setProcedure((Procedure) newValue);
			return;
		case Execution_metamodelPackage.PPROCEDURE__RESULT:
			setResult((Result) newValue);
			return;
		case Execution_metamodelPackage.PPROCEDURE__PRESCRIPTION_RESULT:
			setPrescriptionResult((PrescriptionResult) newValue);
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
		case Execution_metamodelPackage.PPROCEDURE__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.PPROCEDURE__PROCEDURE:
			setProcedure((Procedure) null);
			return;
		case Execution_metamodelPackage.PPROCEDURE__RESULT:
			setResult((Result) null);
			return;
		case Execution_metamodelPackage.PPROCEDURE__PRESCRIPTION_RESULT:
			setPrescriptionResult((PrescriptionResult) null);
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
		case Execution_metamodelPackage.PPROCEDURE__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.PPROCEDURE__PROCEDURE:
			return procedure != null;
		case Execution_metamodelPackage.PPROCEDURE__RESULT:
			return result != null;
		case Execution_metamodelPackage.PPROCEDURE__PRESCRIPTION_RESULT:
			return prescriptionResult != null;
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

} //PProcedureImpl
