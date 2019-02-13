/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.PProcedure;
import MetamodelExecution.Procedure;

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
 *   <li>{@link MetamodelExecution.impl.PProcedureImpl#getCodeOrderPrescription <em>Code Order Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PProcedureImpl#getCodeOrderPrescriptionPlan <em>Code Order Prescription Plan</em>}</li>
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
	 * The default value of the '{@link #getCodeOrderPrescription() <em>Code Order Prescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeOrderPrescription()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_ORDER_PRESCRIPTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodeOrderPrescription() <em>Code Order Prescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeOrderPrescription()
	 * @generated
	 * @ordered
	 */
	protected int codeOrderPrescription = CODE_ORDER_PRESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeOrderPrescriptionPlan() <em>Code Order Prescription Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeOrderPrescriptionPlan()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_ORDER_PRESCRIPTION_PLAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodeOrderPrescriptionPlan() <em>Code Order Prescription Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeOrderPrescriptionPlan()
	 * @generated
	 * @ordered
	 */
	protected int codeOrderPrescriptionPlan = CODE_ORDER_PRESCRIPTION_PLAN_EDEFAULT;

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
	public int getCodeOrderPrescription() {
		return codeOrderPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeOrderPrescription(int newCodeOrderPrescription) {
		int oldCodeOrderPrescription = codeOrderPrescription;
		codeOrderPrescription = newCodeOrderPrescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PPROCEDURE__CODE_ORDER_PRESCRIPTION, oldCodeOrderPrescription,
					codeOrderPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodeOrderPrescriptionPlan() {
		return codeOrderPrescriptionPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeOrderPrescriptionPlan(int newCodeOrderPrescriptionPlan) {
		int oldCodeOrderPrescriptionPlan = codeOrderPrescriptionPlan;
		codeOrderPrescriptionPlan = newCodeOrderPrescriptionPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PPROCEDURE__CODE_ORDER_PRESCRIPTION_PLAN, oldCodeOrderPrescriptionPlan,
					codeOrderPrescriptionPlan));
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
		case Execution_metamodelPackage.PPROCEDURE__CODE_ORDER_PRESCRIPTION:
			return getCodeOrderPrescription();
		case Execution_metamodelPackage.PPROCEDURE__CODE_ORDER_PRESCRIPTION_PLAN:
			return getCodeOrderPrescriptionPlan();
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
		case Execution_metamodelPackage.PPROCEDURE__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.PPROCEDURE__PROCEDURE:
			setProcedure((Procedure) newValue);
			return;
		case Execution_metamodelPackage.PPROCEDURE__CODE_ORDER_PRESCRIPTION:
			setCodeOrderPrescription((Integer) newValue);
			return;
		case Execution_metamodelPackage.PPROCEDURE__CODE_ORDER_PRESCRIPTION_PLAN:
			setCodeOrderPrescriptionPlan((Integer) newValue);
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
		case Execution_metamodelPackage.PPROCEDURE__CODE_ORDER_PRESCRIPTION:
			setCodeOrderPrescription(CODE_ORDER_PRESCRIPTION_EDEFAULT);
			return;
		case Execution_metamodelPackage.PPROCEDURE__CODE_ORDER_PRESCRIPTION_PLAN:
			setCodeOrderPrescriptionPlan(CODE_ORDER_PRESCRIPTION_PLAN_EDEFAULT);
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
		case Execution_metamodelPackage.PPROCEDURE__CODE_ORDER_PRESCRIPTION:
			return codeOrderPrescription != CODE_ORDER_PRESCRIPTION_EDEFAULT;
		case Execution_metamodelPackage.PPROCEDURE__CODE_ORDER_PRESCRIPTION_PLAN:
			return codeOrderPrescriptionPlan != CODE_ORDER_PRESCRIPTION_PLAN_EDEFAULT;
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
		result.append(", codeOrderPrescription: ");
		result.append(codeOrderPrescription);
		result.append(", codeOrderPrescriptionPlan: ");
		result.append(codeOrderPrescriptionPlan);
		result.append(')');
		return result.toString();
	}

} //PProcedureImpl
