/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Justify;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Justify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.JustifyImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.JustifyImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link MetamodelExecution.impl.JustifyImpl#getReasonDisplay <em>Reason Display</em>}</li>
 *   <li>{@link MetamodelExecution.impl.JustifyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link MetamodelExecution.impl.JustifyImpl#getJustifyById <em>Justify By Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.JustifyImpl#getJustifyBy <em>Justify By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JustifyImpl extends MinimalEObjectImpl.Container implements Justify {
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
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getReasonDisplay() <em>Reason Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReasonDisplay() <em>Reason Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonDisplay()
	 * @generated
	 * @ordered
	 */
	protected String reasonDisplay = REASON_DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustifyById() <em>Justify By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifyById()
	 * @generated
	 * @ordered
	 */
	protected static final int JUSTIFY_BY_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJustifyById() <em>Justify By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifyById()
	 * @generated
	 * @ordered
	 */
	protected int justifyById = JUSTIFY_BY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustifyBy() <em>Justify By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifyBy()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFY_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustifyBy() <em>Justify By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifyBy()
	 * @generated
	 * @ordered
	 */
	protected String justifyBy = JUSTIFY_BY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JustifyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.JUSTIFY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.JUSTIFY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.JUSTIFY__REASON, oldReason,
					reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReasonDisplay() {
		return reasonDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonDisplay(String newReasonDisplay) {
		String oldReasonDisplay = reasonDisplay;
		reasonDisplay = newReasonDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.JUSTIFY__REASON_DISPLAY,
					oldReasonDisplay, reasonDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.JUSTIFY__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJustifyById() {
		return justifyById;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustifyById(int newJustifyById) {
		int oldJustifyById = justifyById;
		justifyById = newJustifyById;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.JUSTIFY__JUSTIFY_BY_ID,
					oldJustifyById, justifyById));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJustifyBy() {
		return justifyBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustifyBy(String newJustifyBy) {
		String oldJustifyBy = justifyBy;
		justifyBy = newJustifyBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.JUSTIFY__JUSTIFY_BY,
					oldJustifyBy, justifyBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.JUSTIFY__ID:
			return getId();
		case Execution_metamodelPackage.JUSTIFY__REASON:
			return getReason();
		case Execution_metamodelPackage.JUSTIFY__REASON_DISPLAY:
			return getReasonDisplay();
		case Execution_metamodelPackage.JUSTIFY__DESCRIPTION:
			return getDescription();
		case Execution_metamodelPackage.JUSTIFY__JUSTIFY_BY_ID:
			return getJustifyById();
		case Execution_metamodelPackage.JUSTIFY__JUSTIFY_BY:
			return getJustifyBy();
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
		case Execution_metamodelPackage.JUSTIFY__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.JUSTIFY__REASON:
			setReason((String) newValue);
			return;
		case Execution_metamodelPackage.JUSTIFY__REASON_DISPLAY:
			setReasonDisplay((String) newValue);
			return;
		case Execution_metamodelPackage.JUSTIFY__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Execution_metamodelPackage.JUSTIFY__JUSTIFY_BY_ID:
			setJustifyById((Integer) newValue);
			return;
		case Execution_metamodelPackage.JUSTIFY__JUSTIFY_BY:
			setJustifyBy((String) newValue);
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
		case Execution_metamodelPackage.JUSTIFY__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.JUSTIFY__REASON:
			setReason(REASON_EDEFAULT);
			return;
		case Execution_metamodelPackage.JUSTIFY__REASON_DISPLAY:
			setReasonDisplay(REASON_DISPLAY_EDEFAULT);
			return;
		case Execution_metamodelPackage.JUSTIFY__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Execution_metamodelPackage.JUSTIFY__JUSTIFY_BY_ID:
			setJustifyById(JUSTIFY_BY_ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.JUSTIFY__JUSTIFY_BY:
			setJustifyBy(JUSTIFY_BY_EDEFAULT);
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
		case Execution_metamodelPackage.JUSTIFY__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.JUSTIFY__REASON:
			return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
		case Execution_metamodelPackage.JUSTIFY__REASON_DISPLAY:
			return REASON_DISPLAY_EDEFAULT == null ? reasonDisplay != null
					: !REASON_DISPLAY_EDEFAULT.equals(reasonDisplay);
		case Execution_metamodelPackage.JUSTIFY__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Execution_metamodelPackage.JUSTIFY__JUSTIFY_BY_ID:
			return justifyById != JUSTIFY_BY_ID_EDEFAULT;
		case Execution_metamodelPackage.JUSTIFY__JUSTIFY_BY:
			return JUSTIFY_BY_EDEFAULT == null ? justifyBy != null : !JUSTIFY_BY_EDEFAULT.equals(justifyBy);
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
		result.append(", reason: ");
		result.append(reason);
		result.append(", reasonDisplay: ");
		result.append(reasonDisplay);
		result.append(", description: ");
		result.append(description);
		result.append(", justifyById: ");
		result.append(justifyById);
		result.append(", justifyBy: ");
		result.append(justifyBy);
		result.append(')');
		return result.toString();
	}

} //JustifyImpl
