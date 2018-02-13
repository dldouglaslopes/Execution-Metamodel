/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Step;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.StepImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StepImpl#getTypeVerbose <em>Type Verbose</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StepImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StepImpl#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StepImpl#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StepImpl#isIsTerminal <em>Is Terminal</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StepImpl#isObligatory <em>Obligatory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step {
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
	 * The default value of the '{@link #getTypeVerbose() <em>Type Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVerbose()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_VERBOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeVerbose() <em>Type Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVerbose()
	 * @generated
	 * @ordered
	 */
	protected String typeVerbose = TYPE_VERBOSE_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean isInitial = IS_INITIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTerminal() <em>Is Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTerminal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TERMINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTerminal() <em>Is Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTerminal()
	 * @generated
	 * @ordered
	 */
	protected boolean isTerminal = IS_TERMINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isObligatory() <em>Obligatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObligatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBLIGATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObligatory() <em>Obligatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObligatory()
	 * @generated
	 * @ordered
	 */
	protected boolean obligatory = OBLIGATORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STEP__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeVerbose() {
		return typeVerbose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeVerbose(String newTypeVerbose) {
		String oldTypeVerbose = typeVerbose;
		typeVerbose = newTypeVerbose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STEP__TYPE_VERBOSE,
					oldTypeVerbose, typeVerbose));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STEP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STEP__TYPE, oldType,
					type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STEP__NAME, oldName,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STEP__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInitial() {
		return isInitial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInitial(boolean newIsInitial) {
		boolean oldIsInitial = isInitial;
		isInitial = newIsInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STEP__IS_INITIAL,
					oldIsInitial, isInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTerminal() {
		return isTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTerminal(boolean newIsTerminal) {
		boolean oldIsTerminal = isTerminal;
		isTerminal = newIsTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STEP__IS_TERMINAL,
					oldIsTerminal, isTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObligatory() {
		return obligatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObligatory(boolean newObligatory) {
		boolean oldObligatory = obligatory;
		obligatory = newObligatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STEP__OBLIGATORY,
					oldObligatory, obligatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.STEP__URL:
			return getUrl();
		case Execution_metamodelPackage.STEP__TYPE_VERBOSE:
			return getTypeVerbose();
		case Execution_metamodelPackage.STEP__ID:
			return getId();
		case Execution_metamodelPackage.STEP__TYPE:
			return getType();
		case Execution_metamodelPackage.STEP__NAME:
			return getName();
		case Execution_metamodelPackage.STEP__DESCRIPTION:
			return getDescription();
		case Execution_metamodelPackage.STEP__IS_INITIAL:
			return isIsInitial();
		case Execution_metamodelPackage.STEP__IS_TERMINAL:
			return isIsTerminal();
		case Execution_metamodelPackage.STEP__OBLIGATORY:
			return isObligatory();
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
		case Execution_metamodelPackage.STEP__URL:
			setUrl((String) newValue);
			return;
		case Execution_metamodelPackage.STEP__TYPE_VERBOSE:
			setTypeVerbose((String) newValue);
			return;
		case Execution_metamodelPackage.STEP__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.STEP__TYPE:
			setType((String) newValue);
			return;
		case Execution_metamodelPackage.STEP__NAME:
			setName((String) newValue);
			return;
		case Execution_metamodelPackage.STEP__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Execution_metamodelPackage.STEP__IS_INITIAL:
			setIsInitial((Boolean) newValue);
			return;
		case Execution_metamodelPackage.STEP__IS_TERMINAL:
			setIsTerminal((Boolean) newValue);
			return;
		case Execution_metamodelPackage.STEP__OBLIGATORY:
			setObligatory((Boolean) newValue);
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
		case Execution_metamodelPackage.STEP__URL:
			setUrl(URL_EDEFAULT);
			return;
		case Execution_metamodelPackage.STEP__TYPE_VERBOSE:
			setTypeVerbose(TYPE_VERBOSE_EDEFAULT);
			return;
		case Execution_metamodelPackage.STEP__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.STEP__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Execution_metamodelPackage.STEP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Execution_metamodelPackage.STEP__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Execution_metamodelPackage.STEP__IS_INITIAL:
			setIsInitial(IS_INITIAL_EDEFAULT);
			return;
		case Execution_metamodelPackage.STEP__IS_TERMINAL:
			setIsTerminal(IS_TERMINAL_EDEFAULT);
			return;
		case Execution_metamodelPackage.STEP__OBLIGATORY:
			setObligatory(OBLIGATORY_EDEFAULT);
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
		case Execution_metamodelPackage.STEP__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case Execution_metamodelPackage.STEP__TYPE_VERBOSE:
			return TYPE_VERBOSE_EDEFAULT == null ? typeVerbose != null : !TYPE_VERBOSE_EDEFAULT.equals(typeVerbose);
		case Execution_metamodelPackage.STEP__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.STEP__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case Execution_metamodelPackage.STEP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Execution_metamodelPackage.STEP__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Execution_metamodelPackage.STEP__IS_INITIAL:
			return isInitial != IS_INITIAL_EDEFAULT;
		case Execution_metamodelPackage.STEP__IS_TERMINAL:
			return isTerminal != IS_TERMINAL_EDEFAULT;
		case Execution_metamodelPackage.STEP__OBLIGATORY:
			return obligatory != OBLIGATORY_EDEFAULT;
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
		result.append(" (url: ");
		result.append(url);
		result.append(", typeVerbose: ");
		result.append(typeVerbose);
		result.append(", id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", isInitial: ");
		result.append(isInitial);
		result.append(", isTerminal: ");
		result.append(isTerminal);
		result.append(", obligatory: ");
		result.append(obligatory);
		result.append(')');
		return result.toString();
	}

} //StepImpl
