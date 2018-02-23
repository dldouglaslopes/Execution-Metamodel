/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Creator;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Executor;
import MetamodelExecution.User;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.UserImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.UserImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link MetamodelExecution.impl.UserImpl#getCode <em>Code</em>}</li>
 *   <li>{@link MetamodelExecution.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link MetamodelExecution.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.impl.UserImpl#getTypeCouncil <em>Type Council</em>}</li>
 *   <li>{@link MetamodelExecution.impl.UserImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link MetamodelExecution.impl.UserImpl#getNumberCouncil <em>Number Council</em>}</li>
 *   <li>{@link MetamodelExecution.impl.UserImpl#getState <em>State</em>}</li>
 *   <li>{@link MetamodelExecution.impl.UserImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link MetamodelExecution.impl.UserImpl#getCreator <em>Creator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UserImpl extends MinimalEObjectImpl.Container implements User {
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
	 * The default value of the '{@link #getNumberCouncil() <em>Number Council</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberCouncil()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_COUNCIL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberCouncil() <em>Number Council</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberCouncil()
	 * @generated
	 * @ordered
	 */
	protected int numberCouncil = NUMBER_COUNCIL_EDEFAULT;

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
	 * The cached value of the '{@link #getExecutor() <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected Executor executor;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected Creator creator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.USER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.USER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.USER__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.USER__CODE, oldCode,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.USER__EMAIL, oldEmail,
					email));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.USER__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.USER__TYPE_COUNCIL,
					oldTypeCouncil, typeCouncil));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.USER__LOGIN, oldLogin,
					login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberCouncil() {
		return numberCouncil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberCouncil(int newNumberCouncil) {
		int oldNumberCouncil = numberCouncil;
		numberCouncil = newNumberCouncil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.USER__NUMBER_COUNCIL,
					oldNumberCouncil, numberCouncil));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.USER__STATE, oldState,
					state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor getExecutor() {
		if (executor != null && executor.eIsProxy()) {
			InternalEObject oldExecutor = (InternalEObject) executor;
			executor = (Executor) eResolveProxy(oldExecutor);
			if (executor != oldExecutor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Execution_metamodelPackage.USER__EXECUTOR,
							oldExecutor, executor));
			}
		}
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor basicGetExecutor() {
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutor(Executor newExecutor) {
		Executor oldExecutor = executor;
		executor = newExecutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.USER__EXECUTOR,
					oldExecutor, executor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creator getCreator() {
		if (creator != null && creator.eIsProxy()) {
			InternalEObject oldCreator = (InternalEObject) creator;
			creator = (Creator) eResolveProxy(oldCreator);
			if (creator != oldCreator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Execution_metamodelPackage.USER__CREATOR,
							oldCreator, creator));
			}
		}
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creator basicGetCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(Creator newCreator) {
		Creator oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.USER__CREATOR, oldCreator,
					creator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.USER__ID:
			return getId();
		case Execution_metamodelPackage.USER__URL:
			return getUrl();
		case Execution_metamodelPackage.USER__CODE:
			return getCode();
		case Execution_metamodelPackage.USER__EMAIL:
			return getEmail();
		case Execution_metamodelPackage.USER__NAME:
			return getName();
		case Execution_metamodelPackage.USER__TYPE_COUNCIL:
			return getTypeCouncil();
		case Execution_metamodelPackage.USER__LOGIN:
			return getLogin();
		case Execution_metamodelPackage.USER__NUMBER_COUNCIL:
			return getNumberCouncil();
		case Execution_metamodelPackage.USER__STATE:
			return getState();
		case Execution_metamodelPackage.USER__EXECUTOR:
			if (resolve)
				return getExecutor();
			return basicGetExecutor();
		case Execution_metamodelPackage.USER__CREATOR:
			if (resolve)
				return getCreator();
			return basicGetCreator();
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
		case Execution_metamodelPackage.USER__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.USER__URL:
			setUrl((String) newValue);
			return;
		case Execution_metamodelPackage.USER__CODE:
			setCode((Integer) newValue);
			return;
		case Execution_metamodelPackage.USER__EMAIL:
			setEmail((String) newValue);
			return;
		case Execution_metamodelPackage.USER__NAME:
			setName((String) newValue);
			return;
		case Execution_metamodelPackage.USER__TYPE_COUNCIL:
			setTypeCouncil((String) newValue);
			return;
		case Execution_metamodelPackage.USER__LOGIN:
			setLogin((String) newValue);
			return;
		case Execution_metamodelPackage.USER__NUMBER_COUNCIL:
			setNumberCouncil((Integer) newValue);
			return;
		case Execution_metamodelPackage.USER__STATE:
			setState((String) newValue);
			return;
		case Execution_metamodelPackage.USER__EXECUTOR:
			setExecutor((Executor) newValue);
			return;
		case Execution_metamodelPackage.USER__CREATOR:
			setCreator((Creator) newValue);
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
		case Execution_metamodelPackage.USER__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.USER__URL:
			setUrl(URL_EDEFAULT);
			return;
		case Execution_metamodelPackage.USER__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case Execution_metamodelPackage.USER__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case Execution_metamodelPackage.USER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Execution_metamodelPackage.USER__TYPE_COUNCIL:
			setTypeCouncil(TYPE_COUNCIL_EDEFAULT);
			return;
		case Execution_metamodelPackage.USER__LOGIN:
			setLogin(LOGIN_EDEFAULT);
			return;
		case Execution_metamodelPackage.USER__NUMBER_COUNCIL:
			setNumberCouncil(NUMBER_COUNCIL_EDEFAULT);
			return;
		case Execution_metamodelPackage.USER__STATE:
			setState(STATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.USER__EXECUTOR:
			setExecutor((Executor) null);
			return;
		case Execution_metamodelPackage.USER__CREATOR:
			setCreator((Creator) null);
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
		case Execution_metamodelPackage.USER__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.USER__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case Execution_metamodelPackage.USER__CODE:
			return code != CODE_EDEFAULT;
		case Execution_metamodelPackage.USER__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case Execution_metamodelPackage.USER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Execution_metamodelPackage.USER__TYPE_COUNCIL:
			return TYPE_COUNCIL_EDEFAULT == null ? typeCouncil != null : !TYPE_COUNCIL_EDEFAULT.equals(typeCouncil);
		case Execution_metamodelPackage.USER__LOGIN:
			return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
		case Execution_metamodelPackage.USER__NUMBER_COUNCIL:
			return numberCouncil != NUMBER_COUNCIL_EDEFAULT;
		case Execution_metamodelPackage.USER__STATE:
			return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
		case Execution_metamodelPackage.USER__EXECUTOR:
			return executor != null;
		case Execution_metamodelPackage.USER__CREATOR:
			return creator != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(", typeCouncil: ");
		result.append(typeCouncil);
		result.append(", login: ");
		result.append(login);
		result.append(", numberCouncil: ");
		result.append(numberCouncil);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //UserImpl
