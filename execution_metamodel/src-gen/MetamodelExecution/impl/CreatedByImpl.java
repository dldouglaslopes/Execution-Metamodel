/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.CreatedBy;
import MetamodelExecution.Execution_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Created By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.CreatedByImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.CreatedByImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link MetamodelExecution.impl.CreatedByImpl#getCode <em>Code</em>}</li>
 *   <li>{@link MetamodelExecution.impl.CreatedByImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link MetamodelExecution.impl.CreatedByImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link MetamodelExecution.impl.CreatedByImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.impl.CreatedByImpl#getCouncil <em>Council</em>}</li>
 *   <li>{@link MetamodelExecution.impl.CreatedByImpl#getTypeCouncil <em>Type Council</em>}</li>
 *   <li>{@link MetamodelExecution.impl.CreatedByImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreatedByImpl extends MinimalEObjectImpl.Container implements CreatedBy {
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
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected String login = LOGIN_EDEFAULT;

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
	 * The default value of the '{@link #getCouncil() <em>Council</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouncil()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNCIL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCouncil() <em>Council</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouncil()
	 * @generated
	 * @ordered
	 */
	protected int council = COUNCIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeCouncil() <em>Type Council</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCouncil()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_COUNCIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeCouncil() <em>Type Council</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCouncil()
	 * @generated
	 * @ordered
	 */
	protected String typeCouncil = TYPE_COUNCIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreatedByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.CREATED_BY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.CREATED_BY__ID, oldId,
					id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.CREATED_BY__URL, oldUrl,
					url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.CREATED_BY__CODE, oldCode,
					code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.CREATED_BY__EMAIL,
					oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(String newLogin) {
		String oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.CREATED_BY__LOGIN,
					oldLogin, login));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.CREATED_BY__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCouncil() {
		return council;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouncil(int newCouncil) {
		int oldCouncil = council;
		council = newCouncil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.CREATED_BY__COUNCIL,
					oldCouncil, council));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeCouncil() {
		return typeCouncil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCouncil(String newTypeCouncil) {
		String oldTypeCouncil = typeCouncil;
		typeCouncil = newTypeCouncil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.CREATED_BY__TYPE_COUNCIL,
					oldTypeCouncil, typeCouncil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.CREATED_BY__STATE,
					oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.CREATED_BY__ID:
			return getId();
		case Execution_metamodelPackage.CREATED_BY__URL:
			return getUrl();
		case Execution_metamodelPackage.CREATED_BY__CODE:
			return getCode();
		case Execution_metamodelPackage.CREATED_BY__EMAIL:
			return getEmail();
		case Execution_metamodelPackage.CREATED_BY__LOGIN:
			return getLogin();
		case Execution_metamodelPackage.CREATED_BY__NAME:
			return getName();
		case Execution_metamodelPackage.CREATED_BY__COUNCIL:
			return getCouncil();
		case Execution_metamodelPackage.CREATED_BY__TYPE_COUNCIL:
			return getTypeCouncil();
		case Execution_metamodelPackage.CREATED_BY__STATE:
			return getState();
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
		case Execution_metamodelPackage.CREATED_BY__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.CREATED_BY__URL:
			setUrl((String) newValue);
			return;
		case Execution_metamodelPackage.CREATED_BY__CODE:
			setCode((Integer) newValue);
			return;
		case Execution_metamodelPackage.CREATED_BY__EMAIL:
			setEmail((String) newValue);
			return;
		case Execution_metamodelPackage.CREATED_BY__LOGIN:
			setLogin((String) newValue);
			return;
		case Execution_metamodelPackage.CREATED_BY__NAME:
			setName((String) newValue);
			return;
		case Execution_metamodelPackage.CREATED_BY__COUNCIL:
			setCouncil((Integer) newValue);
			return;
		case Execution_metamodelPackage.CREATED_BY__TYPE_COUNCIL:
			setTypeCouncil((String) newValue);
			return;
		case Execution_metamodelPackage.CREATED_BY__STATE:
			setState((String) newValue);
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
		case Execution_metamodelPackage.CREATED_BY__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.CREATED_BY__URL:
			setUrl(URL_EDEFAULT);
			return;
		case Execution_metamodelPackage.CREATED_BY__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case Execution_metamodelPackage.CREATED_BY__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case Execution_metamodelPackage.CREATED_BY__LOGIN:
			setLogin(LOGIN_EDEFAULT);
			return;
		case Execution_metamodelPackage.CREATED_BY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Execution_metamodelPackage.CREATED_BY__COUNCIL:
			setCouncil(COUNCIL_EDEFAULT);
			return;
		case Execution_metamodelPackage.CREATED_BY__TYPE_COUNCIL:
			setTypeCouncil(TYPE_COUNCIL_EDEFAULT);
			return;
		case Execution_metamodelPackage.CREATED_BY__STATE:
			setState(STATE_EDEFAULT);
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
		case Execution_metamodelPackage.CREATED_BY__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.CREATED_BY__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case Execution_metamodelPackage.CREATED_BY__CODE:
			return code != CODE_EDEFAULT;
		case Execution_metamodelPackage.CREATED_BY__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case Execution_metamodelPackage.CREATED_BY__LOGIN:
			return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
		case Execution_metamodelPackage.CREATED_BY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Execution_metamodelPackage.CREATED_BY__COUNCIL:
			return council != COUNCIL_EDEFAULT;
		case Execution_metamodelPackage.CREATED_BY__TYPE_COUNCIL:
			return TYPE_COUNCIL_EDEFAULT == null ? typeCouncil != null : !TYPE_COUNCIL_EDEFAULT.equals(typeCouncil);
		case Execution_metamodelPackage.CREATED_BY__STATE:
			return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
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
		result.append(", email: ");
		result.append(email);
		result.append(", login: ");
		result.append(login);
		result.append(", name: ");
		result.append(name);
		result.append(", council: ");
		result.append(council);
		result.append(", typeCouncil: ");
		result.append(typeCouncil);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //CreatedByImpl
