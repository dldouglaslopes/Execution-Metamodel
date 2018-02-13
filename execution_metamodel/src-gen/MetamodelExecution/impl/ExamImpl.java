/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Exam;
import MetamodelExecution.Execution_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ExamImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExamImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExamImpl#getCode <em>Code</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExamImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExamImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExamImpl#isOnlyEmergency <em>Only Emergency</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExamImpl#isMemberPeers <em>Member Peers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExamImpl extends MinimalEObjectImpl.Container implements Exam {
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
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected int code = CODE_EDEFAULT;

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
	 * The default value of the '{@link #isOnlyEmergency() <em>Only Emergency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyEmergency()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONLY_EMERGENCY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnlyEmergency() <em>Only Emergency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyEmergency()
	 * @generated
	 * @ordered
	 */
	protected boolean onlyEmergency = ONLY_EMERGENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #isMemberPeers() <em>Member Peers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemberPeers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEMBER_PEERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMemberPeers() <em>Member Peers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemberPeers()
	 * @generated
	 * @ordered
	 */
	protected boolean memberPeers = MEMBER_PEERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.EXAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAM__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(int newCode) {
		int oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAM__CODE, oldCode,
					code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAM__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAM__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnlyEmergency() {
		return onlyEmergency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlyEmergency(boolean newOnlyEmergency) {
		boolean oldOnlyEmergency = onlyEmergency;
		onlyEmergency = newOnlyEmergency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAM__ONLY_EMERGENCY,
					oldOnlyEmergency, onlyEmergency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMemberPeers() {
		return memberPeers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberPeers(boolean newMemberPeers) {
		boolean oldMemberPeers = memberPeers;
		memberPeers = newMemberPeers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAM__MEMBER_PEERS,
					oldMemberPeers, memberPeers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.EXAM__ID:
			return getId();
		case Execution_metamodelPackage.EXAM__URL:
			return getUrl();
		case Execution_metamodelPackage.EXAM__CODE:
			return getCode();
		case Execution_metamodelPackage.EXAM__NAME:
			return getName();
		case Execution_metamodelPackage.EXAM__DESCRIPTION:
			return getDescription();
		case Execution_metamodelPackage.EXAM__ONLY_EMERGENCY:
			return isOnlyEmergency();
		case Execution_metamodelPackage.EXAM__MEMBER_PEERS:
			return isMemberPeers();
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
		case Execution_metamodelPackage.EXAM__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXAM__URL:
			setUrl((String) newValue);
			return;
		case Execution_metamodelPackage.EXAM__CODE:
			setCode((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXAM__NAME:
			setName((String) newValue);
			return;
		case Execution_metamodelPackage.EXAM__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Execution_metamodelPackage.EXAM__ONLY_EMERGENCY:
			setOnlyEmergency((Boolean) newValue);
			return;
		case Execution_metamodelPackage.EXAM__MEMBER_PEERS:
			setMemberPeers((Boolean) newValue);
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
		case Execution_metamodelPackage.EXAM__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAM__URL:
			setUrl(URL_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAM__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAM__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAM__ONLY_EMERGENCY:
			setOnlyEmergency(ONLY_EMERGENCY_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAM__MEMBER_PEERS:
			setMemberPeers(MEMBER_PEERS_EDEFAULT);
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
		case Execution_metamodelPackage.EXAM__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.EXAM__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case Execution_metamodelPackage.EXAM__CODE:
			return code != CODE_EDEFAULT;
		case Execution_metamodelPackage.EXAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Execution_metamodelPackage.EXAM__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Execution_metamodelPackage.EXAM__ONLY_EMERGENCY:
			return onlyEmergency != ONLY_EMERGENCY_EDEFAULT;
		case Execution_metamodelPackage.EXAM__MEMBER_PEERS:
			return memberPeers != MEMBER_PEERS_EDEFAULT;
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
		result.append(", url: ");
		result.append(url);
		result.append(", code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", onlyEmergency: ");
		result.append(onlyEmergency);
		result.append(", memberPeers: ");
		result.append(memberPeers);
		result.append(')');
		return result.toString();
	}

} //ExamImpl
