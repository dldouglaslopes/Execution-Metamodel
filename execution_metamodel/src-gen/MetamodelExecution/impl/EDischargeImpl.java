/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.EDischarge;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.PrescriptionResult;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDischarge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.EDischargeImpl#getPrescriptionResult <em>Prescription Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDischargeImpl extends EStepImpl implements EDischarge {
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
	protected EDischargeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.EDISCHARGE;
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
					Execution_metamodelPackage.EDISCHARGE__PRESCRIPTION_RESULT, oldPrescriptionResult,
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EDISCHARGE__PRESCRIPTION_RESULT, null,
						msgs);
			if (newPrescriptionResult != null)
				msgs = ((InternalEObject) newPrescriptionResult).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EDISCHARGE__PRESCRIPTION_RESULT, null,
						msgs);
			msgs = basicSetPrescriptionResult(newPrescriptionResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EDISCHARGE__PRESCRIPTION_RESULT, newPrescriptionResult,
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
		case Execution_metamodelPackage.EDISCHARGE__PRESCRIPTION_RESULT:
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
		case Execution_metamodelPackage.EDISCHARGE__PRESCRIPTION_RESULT:
			return getPrescriptionResult();
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
		case Execution_metamodelPackage.EDISCHARGE__PRESCRIPTION_RESULT:
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
		case Execution_metamodelPackage.EDISCHARGE__PRESCRIPTION_RESULT:
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
		case Execution_metamodelPackage.EDISCHARGE__PRESCRIPTION_RESULT:
			return prescriptionResult != null;
		}
		return super.eIsSet(featureID);
	}

} //EDischargeImpl
