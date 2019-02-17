/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Procedure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ProcedureImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedureImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedureImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedureImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedureImpl#getIdProcedure <em>Id Procedure</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedureImpl#getCode <em>Code</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedureImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedureImpl#getTypeCode <em>Type Code</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedureImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedureImpl#isOutpatient <em>Outpatient</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedureImpl#isMemberPeers <em>Member Peers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureImpl extends MinimalEObjectImpl.Container implements Procedure {
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
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected String frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdProcedure() <em>Id Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProcedure()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PROCEDURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdProcedure() <em>Id Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProcedure()
	 * @generated
	 * @ordered
	 */
	protected int idProcedure = ID_PROCEDURE_EDEFAULT;

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
	 * The default value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final int TYPE_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected int typeCode = TYPE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isOutpatient() <em>Outpatient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutpatient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTPATIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutpatient() <em>Outpatient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutpatient()
	 * @generated
	 * @ordered
	 */
	protected boolean outpatient = OUTPATIENT_EDEFAULT;

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
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.PROCEDURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PROCEDURE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PROCEDURE__CATEGORY,
					oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(String newFrequency) {
		String oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PROCEDURE__FREQUENCY,
					oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PROCEDURE__QUANTITY,
					oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdProcedure() {
		return idProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdProcedure(int newIdProcedure) {
		int oldIdProcedure = idProcedure;
		idProcedure = newIdProcedure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PROCEDURE__ID_PROCEDURE,
					oldIdProcedure, idProcedure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PROCEDURE__CODE, oldCode,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PROCEDURE__NAME, oldName,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PROCEDURE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTypeCode() {
		return typeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCode(int newTypeCode) {
		int oldTypeCode = typeCode;
		typeCode = newTypeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PROCEDURE__TYPE_CODE,
					oldTypeCode, typeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PROCEDURE__TYPE_NAME,
					oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutpatient() {
		return outpatient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutpatient(boolean newOutpatient) {
		boolean oldOutpatient = outpatient;
		outpatient = newOutpatient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PROCEDURE__OUTPATIENT,
					oldOutpatient, outpatient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PROCEDURE__MEMBER_PEERS,
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
		case Execution_metamodelPackage.PROCEDURE__ID:
			return getId();
		case Execution_metamodelPackage.PROCEDURE__CATEGORY:
			return getCategory();
		case Execution_metamodelPackage.PROCEDURE__FREQUENCY:
			return getFrequency();
		case Execution_metamodelPackage.PROCEDURE__QUANTITY:
			return getQuantity();
		case Execution_metamodelPackage.PROCEDURE__ID_PROCEDURE:
			return getIdProcedure();
		case Execution_metamodelPackage.PROCEDURE__CODE:
			return getCode();
		case Execution_metamodelPackage.PROCEDURE__NAME:
			return getName();
		case Execution_metamodelPackage.PROCEDURE__DESCRIPTION:
			return getDescription();
		case Execution_metamodelPackage.PROCEDURE__TYPE_CODE:
			return getTypeCode();
		case Execution_metamodelPackage.PROCEDURE__TYPE_NAME:
			return getTypeName();
		case Execution_metamodelPackage.PROCEDURE__OUTPATIENT:
			return isOutpatient();
		case Execution_metamodelPackage.PROCEDURE__MEMBER_PEERS:
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
		case Execution_metamodelPackage.PROCEDURE__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE__CATEGORY:
			setCategory((String) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE__FREQUENCY:
			setFrequency((String) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE__ID_PROCEDURE:
			setIdProcedure((Integer) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE__CODE:
			setCode((String) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE__NAME:
			setName((String) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE__TYPE_CODE:
			setTypeCode((Integer) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE__TYPE_NAME:
			setTypeName((String) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE__OUTPATIENT:
			setOutpatient((Boolean) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE__MEMBER_PEERS:
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
		case Execution_metamodelPackage.PROCEDURE__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE__FREQUENCY:
			setFrequency(FREQUENCY_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE__ID_PROCEDURE:
			setIdProcedure(ID_PROCEDURE_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE__TYPE_CODE:
			setTypeCode(TYPE_CODE_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE__TYPE_NAME:
			setTypeName(TYPE_NAME_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE__OUTPATIENT:
			setOutpatient(OUTPATIENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE__MEMBER_PEERS:
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
		case Execution_metamodelPackage.PROCEDURE__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.PROCEDURE__CATEGORY:
			return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
		case Execution_metamodelPackage.PROCEDURE__FREQUENCY:
			return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
		case Execution_metamodelPackage.PROCEDURE__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case Execution_metamodelPackage.PROCEDURE__ID_PROCEDURE:
			return idProcedure != ID_PROCEDURE_EDEFAULT;
		case Execution_metamodelPackage.PROCEDURE__CODE:
			return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
		case Execution_metamodelPackage.PROCEDURE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Execution_metamodelPackage.PROCEDURE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Execution_metamodelPackage.PROCEDURE__TYPE_CODE:
			return typeCode != TYPE_CODE_EDEFAULT;
		case Execution_metamodelPackage.PROCEDURE__TYPE_NAME:
			return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
		case Execution_metamodelPackage.PROCEDURE__OUTPATIENT:
			return outpatient != OUTPATIENT_EDEFAULT;
		case Execution_metamodelPackage.PROCEDURE__MEMBER_PEERS:
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
		result.append(", category: ");
		result.append(category);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", idProcedure: ");
		result.append(idProcedure);
		result.append(", code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", typeCode: ");
		result.append(typeCode);
		result.append(", typeName: ");
		result.append(typeName);
		result.append(", outpatient: ");
		result.append(outpatient);
		result.append(", memberPeers: ");
		result.append(memberPeers);
		result.append(')');
		return result.toString();
	}

} //ProcedureImpl
