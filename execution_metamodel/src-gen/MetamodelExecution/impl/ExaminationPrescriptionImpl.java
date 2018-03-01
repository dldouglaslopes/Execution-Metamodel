/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.ExaminationPrescription;
import MetamodelExecution.Execution_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Examination Prescription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ExaminationPrescriptionImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationPrescriptionImpl#isSuccess <em>Success</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationPrescriptionImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationPrescriptionImpl#getRequestDate <em>Request Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExaminationPrescriptionImpl extends MinimalEObjectImpl.Container implements ExaminationPrescription {
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
	 * The default value of the '{@link #isSuccess() <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUCCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSuccess() <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuccess()
	 * @generated
	 * @ordered
	 */
	protected boolean success = SUCCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestDate() <em>Request Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestDate()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestDate() <em>Request Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestDate()
	 * @generated
	 * @ordered
	 */
	protected String requestDate = REQUEST_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExaminationPrescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.EXAMINATION_PRESCRIPTION;
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
					Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccess(boolean newSuccess) {
		boolean oldSuccess = success;
		success = newSuccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__SUCCESS, oldSuccess, success));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestDate() {
		return requestDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestDate(String newRequestDate) {
		String oldRequestDate = requestDate;
		requestDate = newRequestDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__REQUEST_DATE, oldRequestDate, requestDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__ID:
			return getId();
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__SUCCESS:
			return isSuccess();
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__MESSAGE:
			return getMessage();
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__REQUEST_DATE:
			return getRequestDate();
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
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__SUCCESS:
			setSuccess((Boolean) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__MESSAGE:
			setMessage((String) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__REQUEST_DATE:
			setRequestDate((String) newValue);
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
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__SUCCESS:
			setSuccess(SUCCESS_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__MESSAGE:
			setMessage(MESSAGE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__REQUEST_DATE:
			setRequestDate(REQUEST_DATE_EDEFAULT);
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
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__SUCCESS:
			return success != SUCCESS_EDEFAULT;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__MESSAGE:
			return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
		case Execution_metamodelPackage.EXAMINATION_PRESCRIPTION__REQUEST_DATE:
			return REQUEST_DATE_EDEFAULT == null ? requestDate != null : !REQUEST_DATE_EDEFAULT.equals(requestDate);
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
		result.append(", success: ");
		result.append(success);
		result.append(", message: ");
		result.append(message);
		result.append(", requestDate: ");
		result.append(requestDate);
		result.append(')');
		return result.toString();
	}

} //ExaminationPrescriptionImpl
