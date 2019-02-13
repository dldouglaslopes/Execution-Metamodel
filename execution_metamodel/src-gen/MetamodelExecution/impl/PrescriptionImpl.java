/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Prescription;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prescription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getIdMedication <em>Id Medication</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getQtdPrescription <em>Qtd Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getIdPresentation <em>Id Presentation</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getIdAccess <em>Id Access</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getQtdDuration <em>Qtd Duration</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getUnitDuration <em>Unit Duration</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getUnitFrequency <em>Unit Frequency</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getComplement <em>Complement</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrescriptionImpl extends MinimalEObjectImpl.Container implements Prescription {
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
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected int frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdMedication() <em>Id Medication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdMedication()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_MEDICATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdMedication() <em>Id Medication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdMedication()
	 * @generated
	 * @ordered
	 */
	protected int idMedication = ID_MEDICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMedication() <em>Medication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedication() <em>Medication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected String medication = MEDICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQtdPrescription() <em>Qtd Prescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQtdPrescription()
	 * @generated
	 * @ordered
	 */
	protected static final int QTD_PRESCRIPTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQtdPrescription() <em>Qtd Prescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQtdPrescription()
	 * @generated
	 * @ordered
	 */
	protected int qtdPrescription = QTD_PRESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected String presentation = PRESENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdPresentation() <em>Id Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPresentation()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PRESENTATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdPresentation() <em>Id Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPresentation()
	 * @generated
	 * @ordered
	 */
	protected int idPresentation = ID_PRESENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected String access = ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdAccess() <em>Id Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAccess()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_ACCESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdAccess() <em>Id Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAccess()
	 * @generated
	 * @ordered
	 */
	protected int idAccess = ID_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getQtdDuration() <em>Qtd Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQtdDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int QTD_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQtdDuration() <em>Qtd Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQtdDuration()
	 * @generated
	 * @ordered
	 */
	protected int qtdDuration = QTD_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitDuration() <em>Unit Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitDuration() <em>Unit Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitDuration()
	 * @generated
	 * @ordered
	 */
	protected String unitDuration = UNIT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitFrequency() <em>Unit Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitFrequency() <em>Unit Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitFrequency()
	 * @generated
	 * @ordered
	 */
	protected String unitFrequency = UNIT_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected String complement = COMPLEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.PRESCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PRESCRIPTION__ID, oldId,
					id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PRESCRIPTION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(int newFrequency) {
		int oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PRESCRIPTION__FREQUENCY,
					oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdMedication() {
		return idMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdMedication(int newIdMedication) {
		int oldIdMedication = idMedication;
		idMedication = newIdMedication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIPTION__ID_MEDICATION, oldIdMedication, idMedication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMedication() {
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedication(String newMedication) {
		String oldMedication = medication;
		medication = newMedication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PRESCRIPTION__MEDICATION,
					oldMedication, medication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQtdPrescription() {
		return qtdPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQtdPrescription(int newQtdPrescription) {
		int oldQtdPrescription = qtdPrescription;
		qtdPrescription = newQtdPrescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIPTION__QTD_PRESCRIPTION, oldQtdPrescription, qtdPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresentation() {
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentation(String newPresentation) {
		String oldPresentation = presentation;
		presentation = newPresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PRESCRIPTION__PRESENTATION,
					oldPresentation, presentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdPresentation() {
		return idPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPresentation(int newIdPresentation) {
		int oldIdPresentation = idPresentation;
		idPresentation = newIdPresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIPTION__ID_PRESENTATION, oldIdPresentation, idPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(String newAccess) {
		String oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PRESCRIPTION__ACCESS,
					oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdAccess() {
		return idAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdAccess(int newIdAccess) {
		int oldIdAccess = idAccess;
		idAccess = newIdAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PRESCRIPTION__ID_ACCESS,
					oldIdAccess, idAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQtdDuration() {
		return qtdDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQtdDuration(int newQtdDuration) {
		int oldQtdDuration = qtdDuration;
		qtdDuration = newQtdDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PRESCRIPTION__QTD_DURATION,
					oldQtdDuration, qtdDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitDuration() {
		return unitDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitDuration(String newUnitDuration) {
		String oldUnitDuration = unitDuration;
		unitDuration = newUnitDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIPTION__UNIT_DURATION, oldUnitDuration, unitDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitFrequency() {
		return unitFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitFrequency(String newUnitFrequency) {
		String oldUnitFrequency = unitFrequency;
		unitFrequency = newUnitFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIPTION__UNIT_FREQUENCY, oldUnitFrequency, unitFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplement() {
		return complement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplement(String newComplement) {
		String oldComplement = complement;
		complement = newComplement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PRESCRIPTION__COMPLEMENT,
					oldComplement, complement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PRESCRIPTION__ORDER,
					oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.PRESCRIPTION__ID:
			return getId();
		case Execution_metamodelPackage.PRESCRIPTION__NAME:
			return getName();
		case Execution_metamodelPackage.PRESCRIPTION__FREQUENCY:
			return getFrequency();
		case Execution_metamodelPackage.PRESCRIPTION__ID_MEDICATION:
			return getIdMedication();
		case Execution_metamodelPackage.PRESCRIPTION__MEDICATION:
			return getMedication();
		case Execution_metamodelPackage.PRESCRIPTION__QTD_PRESCRIPTION:
			return getQtdPrescription();
		case Execution_metamodelPackage.PRESCRIPTION__PRESENTATION:
			return getPresentation();
		case Execution_metamodelPackage.PRESCRIPTION__ID_PRESENTATION:
			return getIdPresentation();
		case Execution_metamodelPackage.PRESCRIPTION__ACCESS:
			return getAccess();
		case Execution_metamodelPackage.PRESCRIPTION__ID_ACCESS:
			return getIdAccess();
		case Execution_metamodelPackage.PRESCRIPTION__QTD_DURATION:
			return getQtdDuration();
		case Execution_metamodelPackage.PRESCRIPTION__UNIT_DURATION:
			return getUnitDuration();
		case Execution_metamodelPackage.PRESCRIPTION__UNIT_FREQUENCY:
			return getUnitFrequency();
		case Execution_metamodelPackage.PRESCRIPTION__COMPLEMENT:
			return getComplement();
		case Execution_metamodelPackage.PRESCRIPTION__ORDER:
			return getOrder();
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
		case Execution_metamodelPackage.PRESCRIPTION__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__NAME:
			setName((String) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__FREQUENCY:
			setFrequency((Integer) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__ID_MEDICATION:
			setIdMedication((Integer) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__MEDICATION:
			setMedication((String) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__QTD_PRESCRIPTION:
			setQtdPrescription((Integer) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__PRESENTATION:
			setPresentation((String) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__ID_PRESENTATION:
			setIdPresentation((Integer) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__ACCESS:
			setAccess((String) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__ID_ACCESS:
			setIdAccess((Integer) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__QTD_DURATION:
			setQtdDuration((Integer) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__UNIT_DURATION:
			setUnitDuration((String) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__UNIT_FREQUENCY:
			setUnitFrequency((String) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__COMPLEMENT:
			setComplement((String) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__ORDER:
			setOrder((Integer) newValue);
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
		case Execution_metamodelPackage.PRESCRIPTION__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__FREQUENCY:
			setFrequency(FREQUENCY_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__ID_MEDICATION:
			setIdMedication(ID_MEDICATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__MEDICATION:
			setMedication(MEDICATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__QTD_PRESCRIPTION:
			setQtdPrescription(QTD_PRESCRIPTION_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__PRESENTATION:
			setPresentation(PRESENTATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__ID_PRESENTATION:
			setIdPresentation(ID_PRESENTATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__ACCESS:
			setAccess(ACCESS_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__ID_ACCESS:
			setIdAccess(ID_ACCESS_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__QTD_DURATION:
			setQtdDuration(QTD_DURATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__UNIT_DURATION:
			setUnitDuration(UNIT_DURATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__UNIT_FREQUENCY:
			setUnitFrequency(UNIT_FREQUENCY_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__COMPLEMENT:
			setComplement(COMPLEMENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__ORDER:
			setOrder(ORDER_EDEFAULT);
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
		case Execution_metamodelPackage.PRESCRIPTION__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.PRESCRIPTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Execution_metamodelPackage.PRESCRIPTION__FREQUENCY:
			return frequency != FREQUENCY_EDEFAULT;
		case Execution_metamodelPackage.PRESCRIPTION__ID_MEDICATION:
			return idMedication != ID_MEDICATION_EDEFAULT;
		case Execution_metamodelPackage.PRESCRIPTION__MEDICATION:
			return MEDICATION_EDEFAULT == null ? medication != null : !MEDICATION_EDEFAULT.equals(medication);
		case Execution_metamodelPackage.PRESCRIPTION__QTD_PRESCRIPTION:
			return qtdPrescription != QTD_PRESCRIPTION_EDEFAULT;
		case Execution_metamodelPackage.PRESCRIPTION__PRESENTATION:
			return PRESENTATION_EDEFAULT == null ? presentation != null : !PRESENTATION_EDEFAULT.equals(presentation);
		case Execution_metamodelPackage.PRESCRIPTION__ID_PRESENTATION:
			return idPresentation != ID_PRESENTATION_EDEFAULT;
		case Execution_metamodelPackage.PRESCRIPTION__ACCESS:
			return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
		case Execution_metamodelPackage.PRESCRIPTION__ID_ACCESS:
			return idAccess != ID_ACCESS_EDEFAULT;
		case Execution_metamodelPackage.PRESCRIPTION__QTD_DURATION:
			return qtdDuration != QTD_DURATION_EDEFAULT;
		case Execution_metamodelPackage.PRESCRIPTION__UNIT_DURATION:
			return UNIT_DURATION_EDEFAULT == null ? unitDuration != null : !UNIT_DURATION_EDEFAULT.equals(unitDuration);
		case Execution_metamodelPackage.PRESCRIPTION__UNIT_FREQUENCY:
			return UNIT_FREQUENCY_EDEFAULT == null ? unitFrequency != null
					: !UNIT_FREQUENCY_EDEFAULT.equals(unitFrequency);
		case Execution_metamodelPackage.PRESCRIPTION__COMPLEMENT:
			return COMPLEMENT_EDEFAULT == null ? complement != null : !COMPLEMENT_EDEFAULT.equals(complement);
		case Execution_metamodelPackage.PRESCRIPTION__ORDER:
			return order != ORDER_EDEFAULT;
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
		result.append(", name: ");
		result.append(name);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", idMedication: ");
		result.append(idMedication);
		result.append(", medication: ");
		result.append(medication);
		result.append(", qtdPrescription: ");
		result.append(qtdPrescription);
		result.append(", presentation: ");
		result.append(presentation);
		result.append(", idPresentation: ");
		result.append(idPresentation);
		result.append(", access: ");
		result.append(access);
		result.append(", idAccess: ");
		result.append(idAccess);
		result.append(", qtdDuration: ");
		result.append(qtdDuration);
		result.append(", unitDuration: ");
		result.append(unitDuration);
		result.append(", unitFrequency: ");
		result.append(unitFrequency);
		result.append(", complement: ");
		result.append(complement);
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //PrescriptionImpl
