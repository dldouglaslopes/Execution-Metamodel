/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Element;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Modeling;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modeling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ModelingImpl#getElement <em>Element</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ModelingImpl#isCompleted <em>Completed</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ModelingImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ModelingImpl#getIdRepository <em>Id Repository</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ModelingImpl#getCode <em>Code</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ModelingImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ModelingImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ModelingImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelingImpl extends MinimalEObjectImpl.Container implements Modeling {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> element;

	/**
	 * The default value of the '{@link #isCompleted() <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPLETED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCompleted() <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompleted()
	 * @generated
	 * @ordered
	 */
	protected boolean completed = COMPLETED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdRepository() <em>Id Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRepository()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_REPOSITORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdRepository() <em>Id Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRepository()
	 * @generated
	 * @ordered
	 */
	protected int idRepository = ID_REPOSITORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.MODELING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<Element>(Element.class, this,
					Execution_metamodelPackage.MODELING__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompleted() {
		return completed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleted(boolean newCompleted) {
		boolean oldCompleted = completed;
		completed = newCompleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MODELING__COMPLETED,
					oldCompleted, completed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MODELING__VERSION,
					oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdRepository() {
		return idRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdRepository(int newIdRepository) {
		int oldIdRepository = idRepository;
		idRepository = newIdRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MODELING__ID_REPOSITORY,
					oldIdRepository, idRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MODELING__CODE, oldCode,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MODELING__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MODELING__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MODELING__URL, oldUrl,
					url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.MODELING__ELEMENT:
			return ((InternalEList<?>) getElement()).basicRemove(otherEnd, msgs);
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
		case Execution_metamodelPackage.MODELING__ELEMENT:
			return getElement();
		case Execution_metamodelPackage.MODELING__COMPLETED:
			return isCompleted();
		case Execution_metamodelPackage.MODELING__VERSION:
			return getVersion();
		case Execution_metamodelPackage.MODELING__ID_REPOSITORY:
			return getIdRepository();
		case Execution_metamodelPackage.MODELING__CODE:
			return getCode();
		case Execution_metamodelPackage.MODELING__NAME:
			return getName();
		case Execution_metamodelPackage.MODELING__ID:
			return getId();
		case Execution_metamodelPackage.MODELING__URL:
			return getUrl();
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
		case Execution_metamodelPackage.MODELING__ELEMENT:
			getElement().clear();
			getElement().addAll((Collection<? extends Element>) newValue);
			return;
		case Execution_metamodelPackage.MODELING__COMPLETED:
			setCompleted((Boolean) newValue);
			return;
		case Execution_metamodelPackage.MODELING__VERSION:
			setVersion((Integer) newValue);
			return;
		case Execution_metamodelPackage.MODELING__ID_REPOSITORY:
			setIdRepository((Integer) newValue);
			return;
		case Execution_metamodelPackage.MODELING__CODE:
			setCode((String) newValue);
			return;
		case Execution_metamodelPackage.MODELING__NAME:
			setName((String) newValue);
			return;
		case Execution_metamodelPackage.MODELING__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.MODELING__URL:
			setUrl((String) newValue);
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
		case Execution_metamodelPackage.MODELING__ELEMENT:
			getElement().clear();
			return;
		case Execution_metamodelPackage.MODELING__COMPLETED:
			setCompleted(COMPLETED_EDEFAULT);
			return;
		case Execution_metamodelPackage.MODELING__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case Execution_metamodelPackage.MODELING__ID_REPOSITORY:
			setIdRepository(ID_REPOSITORY_EDEFAULT);
			return;
		case Execution_metamodelPackage.MODELING__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case Execution_metamodelPackage.MODELING__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Execution_metamodelPackage.MODELING__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.MODELING__URL:
			setUrl(URL_EDEFAULT);
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
		case Execution_metamodelPackage.MODELING__ELEMENT:
			return element != null && !element.isEmpty();
		case Execution_metamodelPackage.MODELING__COMPLETED:
			return completed != COMPLETED_EDEFAULT;
		case Execution_metamodelPackage.MODELING__VERSION:
			return version != VERSION_EDEFAULT;
		case Execution_metamodelPackage.MODELING__ID_REPOSITORY:
			return idRepository != ID_REPOSITORY_EDEFAULT;
		case Execution_metamodelPackage.MODELING__CODE:
			return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
		case Execution_metamodelPackage.MODELING__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Execution_metamodelPackage.MODELING__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.MODELING__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
		result.append(" (completed: ");
		result.append(completed);
		result.append(", version: ");
		result.append(version);
		result.append(", idRepository: ");
		result.append(idRepository);
		result.append(", code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //ModelingImpl
