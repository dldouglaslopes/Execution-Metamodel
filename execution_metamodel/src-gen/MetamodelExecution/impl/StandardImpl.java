/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Standard;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.StandardImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StandardImpl#getMnemonic <em>Mnemonic</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StandardImpl#getCodeActiveAgent <em>Code Active Agent</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StandardImpl#getCodeDiluent <em>Code Diluent</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StandardImpl#getNameDiluent <em>Name Diluent</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StandardImpl#getCodeEventsDiluent <em>Code Events Diluent</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StandardImpl#getCodeOrderAdmin <em>Code Order Admin</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StandardImpl#getCodeApresDiluent <em>Code Apres Diluent</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StandardImpl#getTypeAccess <em>Type Access</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StandardImpl#getTypeAdmin <em>Type Admin</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StandardImpl#getQtyDiluent <em>Qty Diluent</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StandardImpl#getQtyVolume <em>Qty Volume</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StandardImpl#getQtyDosage <em>Qty Dosage</em>}</li>
 *   <li>{@link MetamodelExecution.impl.StandardImpl#getCodeUnitDosage <em>Code Unit Dosage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardImpl extends MinimalEObjectImpl.Container implements Standard {
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
	 * The default value of the '{@link #getMnemonic() <em>Mnemonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMnemonic()
	 * @generated
	 * @ordered
	 */
	protected static final String MNEMONIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMnemonic() <em>Mnemonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMnemonic()
	 * @generated
	 * @ordered
	 */
	protected String mnemonic = MNEMONIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeActiveAgent() <em>Code Active Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeActiveAgent()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_ACTIVE_AGENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodeActiveAgent() <em>Code Active Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeActiveAgent()
	 * @generated
	 * @ordered
	 */
	protected int codeActiveAgent = CODE_ACTIVE_AGENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeDiluent() <em>Code Diluent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeDiluent()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_DILUENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodeDiluent() <em>Code Diluent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeDiluent()
	 * @generated
	 * @ordered
	 */
	protected int codeDiluent = CODE_DILUENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameDiluent() <em>Name Diluent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDiluent()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_DILUENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameDiluent() <em>Name Diluent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDiluent()
	 * @generated
	 * @ordered
	 */
	protected String nameDiluent = NAME_DILUENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeEventsDiluent() <em>Code Events Diluent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeEventsDiluent()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_EVENTS_DILUENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodeEventsDiluent() <em>Code Events Diluent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeEventsDiluent()
	 * @generated
	 * @ordered
	 */
	protected int codeEventsDiluent = CODE_EVENTS_DILUENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeOrderAdmin() <em>Code Order Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeOrderAdmin()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_ORDER_ADMIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodeOrderAdmin() <em>Code Order Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeOrderAdmin()
	 * @generated
	 * @ordered
	 */
	protected int codeOrderAdmin = CODE_ORDER_ADMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeApresDiluent() <em>Code Apres Diluent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeApresDiluent()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_APRES_DILUENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeApresDiluent() <em>Code Apres Diluent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeApresDiluent()
	 * @generated
	 * @ordered
	 */
	protected String codeApresDiluent = CODE_APRES_DILUENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeAccess() <em>Type Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeAccess() <em>Type Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAccess()
	 * @generated
	 * @ordered
	 */
	protected String typeAccess = TYPE_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeAdmin() <em>Type Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAdmin()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_ADMIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeAdmin() <em>Type Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAdmin()
	 * @generated
	 * @ordered
	 */
	protected String typeAdmin = TYPE_ADMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getQtyDiluent() <em>Qty Diluent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQtyDiluent()
	 * @generated
	 * @ordered
	 */
	protected static final int QTY_DILUENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQtyDiluent() <em>Qty Diluent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQtyDiluent()
	 * @generated
	 * @ordered
	 */
	protected int qtyDiluent = QTY_DILUENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQtyVolume() <em>Qty Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQtyVolume()
	 * @generated
	 * @ordered
	 */
	protected static final int QTY_VOLUME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQtyVolume() <em>Qty Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQtyVolume()
	 * @generated
	 * @ordered
	 */
	protected int qtyVolume = QTY_VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQtyDosage() <em>Qty Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQtyDosage()
	 * @generated
	 * @ordered
	 */
	protected static final int QTY_DOSAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQtyDosage() <em>Qty Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQtyDosage()
	 * @generated
	 * @ordered
	 */
	protected int qtyDosage = QTY_DOSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeUnitDosage() <em>Code Unit Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeUnitDosage()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_UNIT_DOSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeUnitDosage() <em>Code Unit Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeUnitDosage()
	 * @generated
	 * @ordered
	 */
	protected String codeUnitDosage = CODE_UNIT_DOSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.STANDARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STANDARD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMnemonic() {
		return mnemonic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMnemonic(String newMnemonic) {
		String oldMnemonic = mnemonic;
		mnemonic = newMnemonic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STANDARD__MNEMONIC,
					oldMnemonic, mnemonic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodeActiveAgent() {
		return codeActiveAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeActiveAgent(int newCodeActiveAgent) {
		int oldCodeActiveAgent = codeActiveAgent;
		codeActiveAgent = newCodeActiveAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.STANDARD__CODE_ACTIVE_AGENT, oldCodeActiveAgent, codeActiveAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodeDiluent() {
		return codeDiluent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeDiluent(int newCodeDiluent) {
		int oldCodeDiluent = codeDiluent;
		codeDiluent = newCodeDiluent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STANDARD__CODE_DILUENT,
					oldCodeDiluent, codeDiluent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameDiluent() {
		return nameDiluent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameDiluent(String newNameDiluent) {
		String oldNameDiluent = nameDiluent;
		nameDiluent = newNameDiluent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STANDARD__NAME_DILUENT,
					oldNameDiluent, nameDiluent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodeEventsDiluent() {
		return codeEventsDiluent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeEventsDiluent(int newCodeEventsDiluent) {
		int oldCodeEventsDiluent = codeEventsDiluent;
		codeEventsDiluent = newCodeEventsDiluent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.STANDARD__CODE_EVENTS_DILUENT, oldCodeEventsDiluent, codeEventsDiluent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodeOrderAdmin() {
		return codeOrderAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeOrderAdmin(int newCodeOrderAdmin) {
		int oldCodeOrderAdmin = codeOrderAdmin;
		codeOrderAdmin = newCodeOrderAdmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STANDARD__CODE_ORDER_ADMIN,
					oldCodeOrderAdmin, codeOrderAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeApresDiluent() {
		return codeApresDiluent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeApresDiluent(String newCodeApresDiluent) {
		String oldCodeApresDiluent = codeApresDiluent;
		codeApresDiluent = newCodeApresDiluent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.STANDARD__CODE_APRES_DILUENT, oldCodeApresDiluent, codeApresDiluent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeAccess() {
		return typeAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAccess(String newTypeAccess) {
		String oldTypeAccess = typeAccess;
		typeAccess = newTypeAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STANDARD__TYPE_ACCESS,
					oldTypeAccess, typeAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeAdmin() {
		return typeAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAdmin(String newTypeAdmin) {
		String oldTypeAdmin = typeAdmin;
		typeAdmin = newTypeAdmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STANDARD__TYPE_ADMIN,
					oldTypeAdmin, typeAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQtyDiluent() {
		return qtyDiluent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQtyDiluent(int newQtyDiluent) {
		int oldQtyDiluent = qtyDiluent;
		qtyDiluent = newQtyDiluent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STANDARD__QTY_DILUENT,
					oldQtyDiluent, qtyDiluent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQtyVolume() {
		return qtyVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQtyVolume(int newQtyVolume) {
		int oldQtyVolume = qtyVolume;
		qtyVolume = newQtyVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STANDARD__QTY_VOLUME,
					oldQtyVolume, qtyVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQtyDosage() {
		return qtyDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQtyDosage(int newQtyDosage) {
		int oldQtyDosage = qtyDosage;
		qtyDosage = newQtyDosage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STANDARD__QTY_DOSAGE,
					oldQtyDosage, qtyDosage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeUnitDosage() {
		return codeUnitDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeUnitDosage(String newCodeUnitDosage) {
		String oldCodeUnitDosage = codeUnitDosage;
		codeUnitDosage = newCodeUnitDosage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.STANDARD__CODE_UNIT_DOSAGE,
					oldCodeUnitDosage, codeUnitDosage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.STANDARD__ID:
			return getId();
		case Execution_metamodelPackage.STANDARD__MNEMONIC:
			return getMnemonic();
		case Execution_metamodelPackage.STANDARD__CODE_ACTIVE_AGENT:
			return getCodeActiveAgent();
		case Execution_metamodelPackage.STANDARD__CODE_DILUENT:
			return getCodeDiluent();
		case Execution_metamodelPackage.STANDARD__NAME_DILUENT:
			return getNameDiluent();
		case Execution_metamodelPackage.STANDARD__CODE_EVENTS_DILUENT:
			return getCodeEventsDiluent();
		case Execution_metamodelPackage.STANDARD__CODE_ORDER_ADMIN:
			return getCodeOrderAdmin();
		case Execution_metamodelPackage.STANDARD__CODE_APRES_DILUENT:
			return getCodeApresDiluent();
		case Execution_metamodelPackage.STANDARD__TYPE_ACCESS:
			return getTypeAccess();
		case Execution_metamodelPackage.STANDARD__TYPE_ADMIN:
			return getTypeAdmin();
		case Execution_metamodelPackage.STANDARD__QTY_DILUENT:
			return getQtyDiluent();
		case Execution_metamodelPackage.STANDARD__QTY_VOLUME:
			return getQtyVolume();
		case Execution_metamodelPackage.STANDARD__QTY_DOSAGE:
			return getQtyDosage();
		case Execution_metamodelPackage.STANDARD__CODE_UNIT_DOSAGE:
			return getCodeUnitDosage();
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
		case Execution_metamodelPackage.STANDARD__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.STANDARD__MNEMONIC:
			setMnemonic((String) newValue);
			return;
		case Execution_metamodelPackage.STANDARD__CODE_ACTIVE_AGENT:
			setCodeActiveAgent((Integer) newValue);
			return;
		case Execution_metamodelPackage.STANDARD__CODE_DILUENT:
			setCodeDiluent((Integer) newValue);
			return;
		case Execution_metamodelPackage.STANDARD__NAME_DILUENT:
			setNameDiluent((String) newValue);
			return;
		case Execution_metamodelPackage.STANDARD__CODE_EVENTS_DILUENT:
			setCodeEventsDiluent((Integer) newValue);
			return;
		case Execution_metamodelPackage.STANDARD__CODE_ORDER_ADMIN:
			setCodeOrderAdmin((Integer) newValue);
			return;
		case Execution_metamodelPackage.STANDARD__CODE_APRES_DILUENT:
			setCodeApresDiluent((String) newValue);
			return;
		case Execution_metamodelPackage.STANDARD__TYPE_ACCESS:
			setTypeAccess((String) newValue);
			return;
		case Execution_metamodelPackage.STANDARD__TYPE_ADMIN:
			setTypeAdmin((String) newValue);
			return;
		case Execution_metamodelPackage.STANDARD__QTY_DILUENT:
			setQtyDiluent((Integer) newValue);
			return;
		case Execution_metamodelPackage.STANDARD__QTY_VOLUME:
			setQtyVolume((Integer) newValue);
			return;
		case Execution_metamodelPackage.STANDARD__QTY_DOSAGE:
			setQtyDosage((Integer) newValue);
			return;
		case Execution_metamodelPackage.STANDARD__CODE_UNIT_DOSAGE:
			setCodeUnitDosage((String) newValue);
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
		case Execution_metamodelPackage.STANDARD__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.STANDARD__MNEMONIC:
			setMnemonic(MNEMONIC_EDEFAULT);
			return;
		case Execution_metamodelPackage.STANDARD__CODE_ACTIVE_AGENT:
			setCodeActiveAgent(CODE_ACTIVE_AGENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.STANDARD__CODE_DILUENT:
			setCodeDiluent(CODE_DILUENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.STANDARD__NAME_DILUENT:
			setNameDiluent(NAME_DILUENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.STANDARD__CODE_EVENTS_DILUENT:
			setCodeEventsDiluent(CODE_EVENTS_DILUENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.STANDARD__CODE_ORDER_ADMIN:
			setCodeOrderAdmin(CODE_ORDER_ADMIN_EDEFAULT);
			return;
		case Execution_metamodelPackage.STANDARD__CODE_APRES_DILUENT:
			setCodeApresDiluent(CODE_APRES_DILUENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.STANDARD__TYPE_ACCESS:
			setTypeAccess(TYPE_ACCESS_EDEFAULT);
			return;
		case Execution_metamodelPackage.STANDARD__TYPE_ADMIN:
			setTypeAdmin(TYPE_ADMIN_EDEFAULT);
			return;
		case Execution_metamodelPackage.STANDARD__QTY_DILUENT:
			setQtyDiluent(QTY_DILUENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.STANDARD__QTY_VOLUME:
			setQtyVolume(QTY_VOLUME_EDEFAULT);
			return;
		case Execution_metamodelPackage.STANDARD__QTY_DOSAGE:
			setQtyDosage(QTY_DOSAGE_EDEFAULT);
			return;
		case Execution_metamodelPackage.STANDARD__CODE_UNIT_DOSAGE:
			setCodeUnitDosage(CODE_UNIT_DOSAGE_EDEFAULT);
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
		case Execution_metamodelPackage.STANDARD__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.STANDARD__MNEMONIC:
			return MNEMONIC_EDEFAULT == null ? mnemonic != null : !MNEMONIC_EDEFAULT.equals(mnemonic);
		case Execution_metamodelPackage.STANDARD__CODE_ACTIVE_AGENT:
			return codeActiveAgent != CODE_ACTIVE_AGENT_EDEFAULT;
		case Execution_metamodelPackage.STANDARD__CODE_DILUENT:
			return codeDiluent != CODE_DILUENT_EDEFAULT;
		case Execution_metamodelPackage.STANDARD__NAME_DILUENT:
			return NAME_DILUENT_EDEFAULT == null ? nameDiluent != null : !NAME_DILUENT_EDEFAULT.equals(nameDiluent);
		case Execution_metamodelPackage.STANDARD__CODE_EVENTS_DILUENT:
			return codeEventsDiluent != CODE_EVENTS_DILUENT_EDEFAULT;
		case Execution_metamodelPackage.STANDARD__CODE_ORDER_ADMIN:
			return codeOrderAdmin != CODE_ORDER_ADMIN_EDEFAULT;
		case Execution_metamodelPackage.STANDARD__CODE_APRES_DILUENT:
			return CODE_APRES_DILUENT_EDEFAULT == null ? codeApresDiluent != null
					: !CODE_APRES_DILUENT_EDEFAULT.equals(codeApresDiluent);
		case Execution_metamodelPackage.STANDARD__TYPE_ACCESS:
			return TYPE_ACCESS_EDEFAULT == null ? typeAccess != null : !TYPE_ACCESS_EDEFAULT.equals(typeAccess);
		case Execution_metamodelPackage.STANDARD__TYPE_ADMIN:
			return TYPE_ADMIN_EDEFAULT == null ? typeAdmin != null : !TYPE_ADMIN_EDEFAULT.equals(typeAdmin);
		case Execution_metamodelPackage.STANDARD__QTY_DILUENT:
			return qtyDiluent != QTY_DILUENT_EDEFAULT;
		case Execution_metamodelPackage.STANDARD__QTY_VOLUME:
			return qtyVolume != QTY_VOLUME_EDEFAULT;
		case Execution_metamodelPackage.STANDARD__QTY_DOSAGE:
			return qtyDosage != QTY_DOSAGE_EDEFAULT;
		case Execution_metamodelPackage.STANDARD__CODE_UNIT_DOSAGE:
			return CODE_UNIT_DOSAGE_EDEFAULT == null ? codeUnitDosage != null
					: !CODE_UNIT_DOSAGE_EDEFAULT.equals(codeUnitDosage);
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
		result.append(", mnemonic: ");
		result.append(mnemonic);
		result.append(", codeActiveAgent: ");
		result.append(codeActiveAgent);
		result.append(", codeDiluent: ");
		result.append(codeDiluent);
		result.append(", nameDiluent: ");
		result.append(nameDiluent);
		result.append(", codeEventsDiluent: ");
		result.append(codeEventsDiluent);
		result.append(", codeOrderAdmin: ");
		result.append(codeOrderAdmin);
		result.append(", codeApresDiluent: ");
		result.append(codeApresDiluent);
		result.append(", typeAccess: ");
		result.append(typeAccess);
		result.append(", typeAdmin: ");
		result.append(typeAdmin);
		result.append(", qtyDiluent: ");
		result.append(qtyDiluent);
		result.append(", qtyVolume: ");
		result.append(qtyVolume);
		result.append(", qtyDosage: ");
		result.append(qtyDosage);
		result.append(", codeUnitDosage: ");
		result.append(codeUnitDosage);
		result.append(')');
		return result.toString();
	}

} //StandardImpl
