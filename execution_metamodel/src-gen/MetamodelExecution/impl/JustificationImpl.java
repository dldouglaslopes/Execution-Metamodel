/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Justification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Justification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.JustificationImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.JustificationImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link MetamodelExecution.impl.JustificationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link MetamodelExecution.impl.JustificationImpl#getJustifiedById <em>Justified By Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.JustificationImpl#getJustifiedBy <em>Justified By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JustificationImpl extends MinimalEObjectImpl.Container implements Justification {
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
	 * The default value of the '{@link #getJustifiedById() <em>Justified By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifiedById()
	 * @generated
	 * @ordered
	 */
	protected static final int JUSTIFIED_BY_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJustifiedById() <em>Justified By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifiedById()
	 * @generated
	 * @ordered
	 */
	protected int justifiedById = JUSTIFIED_BY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustifiedBy() <em>Justified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifiedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFIED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustifiedBy() <em>Justified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifiedBy()
	 * @generated
	 * @ordered
	 */
	protected String justifiedBy = JUSTIFIED_BY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JustificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.JUSTIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.JUSTIFICATION__ID, oldId,
					id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.JUSTIFICATION__REASON,
					oldReason, reason));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.JUSTIFICATION__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJustifiedById() {
		return justifiedById;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustifiedById(int newJustifiedById) {
		int oldJustifiedById = justifiedById;
		justifiedById = newJustifiedById;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.JUSTIFICATION__JUSTIFIED_BY_ID, oldJustifiedById, justifiedById));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJustifiedBy() {
		return justifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustifiedBy(String newJustifiedBy) {
		String oldJustifiedBy = justifiedBy;
		justifiedBy = newJustifiedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.JUSTIFICATION__JUSTIFIED_BY, oldJustifiedBy, justifiedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.JUSTIFICATION__ID:
			return getId();
		case Execution_metamodelPackage.JUSTIFICATION__REASON:
			return getReason();
		case Execution_metamodelPackage.JUSTIFICATION__DESCRIPTION:
			return getDescription();
		case Execution_metamodelPackage.JUSTIFICATION__JUSTIFIED_BY_ID:
			return getJustifiedById();
		case Execution_metamodelPackage.JUSTIFICATION__JUSTIFIED_BY:
			return getJustifiedBy();
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
		case Execution_metamodelPackage.JUSTIFICATION__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.JUSTIFICATION__REASON:
			setReason((String) newValue);
			return;
		case Execution_metamodelPackage.JUSTIFICATION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Execution_metamodelPackage.JUSTIFICATION__JUSTIFIED_BY_ID:
			setJustifiedById((Integer) newValue);
			return;
		case Execution_metamodelPackage.JUSTIFICATION__JUSTIFIED_BY:
			setJustifiedBy((String) newValue);
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
		case Execution_metamodelPackage.JUSTIFICATION__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.JUSTIFICATION__REASON:
			setReason(REASON_EDEFAULT);
			return;
		case Execution_metamodelPackage.JUSTIFICATION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Execution_metamodelPackage.JUSTIFICATION__JUSTIFIED_BY_ID:
			setJustifiedById(JUSTIFIED_BY_ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.JUSTIFICATION__JUSTIFIED_BY:
			setJustifiedBy(JUSTIFIED_BY_EDEFAULT);
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
		case Execution_metamodelPackage.JUSTIFICATION__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.JUSTIFICATION__REASON:
			return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
		case Execution_metamodelPackage.JUSTIFICATION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Execution_metamodelPackage.JUSTIFICATION__JUSTIFIED_BY_ID:
			return justifiedById != JUSTIFIED_BY_ID_EDEFAULT;
		case Execution_metamodelPackage.JUSTIFICATION__JUSTIFIED_BY:
			return JUSTIFIED_BY_EDEFAULT == null ? justifiedBy != null : !JUSTIFIED_BY_EDEFAULT.equals(justifiedBy);
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
		result.append(", description: ");
		result.append(description);
		result.append(", justifiedById: ");
		result.append(justifiedById);
		result.append(", justifiedBy: ");
		result.append(justifiedBy);
		result.append(')');
		return result.toString();
	}

} //JustificationImpl
