/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.MedicationPrescribedResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Prescribed Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getIdMedication <em>Id Medication</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#isOutpatient <em>Outpatient</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getStandard <em>Standard</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getCode <em>Code</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getCycles <em>Cycles</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getDailyDosage <em>Daily Dosage</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getTimeTreatement <em>Time Treatement</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationPrescribedResourceImpl extends MinimalEObjectImpl.Container
		implements MedicationPrescribedResource {
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
	 * The default value of the '{@link #getStandard() <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandard() <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected String standard = STANDARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrand() <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected static final String BRAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrand() <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected String brand = BRAND_EDEFAULT;

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
	 * The default value of the '{@link #getCycles() <em>Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycles()
	 * @generated
	 * @ordered
	 */
	protected static final int CYCLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCycles() <em>Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycles()
	 * @generated
	 * @ordered
	 */
	protected int cycles = CYCLES_EDEFAULT;

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
	 * The default value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected int timeInterval = TIME_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDailyDosage() <em>Daily Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyDosage()
	 * @generated
	 * @ordered
	 */
	protected static final int DAILY_DOSAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDailyDosage() <em>Daily Dosage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyDosage()
	 * @generated
	 * @ordered
	 */
	protected int dailyDosage = DAILY_DOSAGE_EDEFAULT;

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
	 * The default value of the '{@link #getTimeTreatement() <em>Time Treatement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTreatement()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_TREATEMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeTreatement() <em>Time Treatement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTreatement()
	 * @generated
	 * @ordered
	 */
	protected int timeTreatement = TIME_TREATEMENT_EDEFAULT;

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
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationPrescribedResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.MEDICATION_PRESCRIBED_RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ID, oldId, id));
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
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ID_MEDICATION, oldIdMedication,
					idMedication));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__OUTPATIENT, oldOutpatient, outpatient));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStandard() {
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandard(String newStandard) {
		String oldStandard = standard;
		standard = newStandard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__STANDARD, oldStandard, standard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrand(String newBrand) {
		String oldBrand = brand;
		brand = newBrand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__BRAND, oldBrand, brand));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCycles() {
		return cycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycles(int newCycles) {
		int oldCycles = cycles;
		cycles = newCycles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CYCLES, oldCycles, cycles));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeInterval() {
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeInterval(int newTimeInterval) {
		int oldTimeInterval = timeInterval;
		timeInterval = newTimeInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__TIME_INTERVAL, oldTimeInterval,
					timeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDailyDosage() {
		return dailyDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDailyDosage(int newDailyDosage) {
		int oldDailyDosage = dailyDosage;
		dailyDosage = newDailyDosage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__DAILY_DOSAGE, oldDailyDosage,
					dailyDosage));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeTreatement() {
		return timeTreatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeTreatement(int newTimeTreatement) {
		int oldTimeTreatement = timeTreatement;
		timeTreatement = newTimeTreatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__TIME_TREATEMENT, oldTimeTreatement,
					timeTreatement));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__MEDICATION, oldMedication, medication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__UNIT, oldUnit, unit));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ID:
			return getId();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ID_MEDICATION:
			return getIdMedication();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__OUTPATIENT:
			return isOutpatient();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__NAME:
			return getName();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__STANDARD:
			return getStandard();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__BRAND:
			return getBrand();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CODE:
			return getCode();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CYCLES:
			return getCycles();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CATEGORY:
			return getCategory();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__DESCRIPTION:
			return getDescription();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__TIME_INTERVAL:
			return getTimeInterval();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__DAILY_DOSAGE:
			return getDailyDosage();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__FREQUENCY:
			return getFrequency();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__TIME_TREATEMENT:
			return getTimeTreatement();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__MEDICATION:
			return getMedication();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__UNIT:
			return getUnit();
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ACCESS:
			return getAccess();
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
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ID_MEDICATION:
			setIdMedication((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__OUTPATIENT:
			setOutpatient((Boolean) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__NAME:
			setName((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__STANDARD:
			setStandard((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__BRAND:
			setBrand((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CODE:
			setCode((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CYCLES:
			setCycles((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CATEGORY:
			setCategory((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__TIME_INTERVAL:
			setTimeInterval((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__DAILY_DOSAGE:
			setDailyDosage((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__FREQUENCY:
			setFrequency((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__TIME_TREATEMENT:
			setTimeTreatement((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__MEDICATION:
			setMedication((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__UNIT:
			setUnit((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ACCESS:
			setAccess((String) newValue);
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
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ID_MEDICATION:
			setIdMedication(ID_MEDICATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__OUTPATIENT:
			setOutpatient(OUTPATIENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__STANDARD:
			setStandard(STANDARD_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__BRAND:
			setBrand(BRAND_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CYCLES:
			setCycles(CYCLES_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__TIME_INTERVAL:
			setTimeInterval(TIME_INTERVAL_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__DAILY_DOSAGE:
			setDailyDosage(DAILY_DOSAGE_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__FREQUENCY:
			setFrequency(FREQUENCY_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__TIME_TREATEMENT:
			setTimeTreatement(TIME_TREATEMENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__MEDICATION:
			setMedication(MEDICATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ACCESS:
			setAccess(ACCESS_EDEFAULT);
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
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ID_MEDICATION:
			return idMedication != ID_MEDICATION_EDEFAULT;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__OUTPATIENT:
			return outpatient != OUTPATIENT_EDEFAULT;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__STANDARD:
			return STANDARD_EDEFAULT == null ? standard != null : !STANDARD_EDEFAULT.equals(standard);
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__BRAND:
			return BRAND_EDEFAULT == null ? brand != null : !BRAND_EDEFAULT.equals(brand);
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CODE:
			return code != CODE_EDEFAULT;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CYCLES:
			return cycles != CYCLES_EDEFAULT;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__CATEGORY:
			return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__TIME_INTERVAL:
			return timeInterval != TIME_INTERVAL_EDEFAULT;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__DAILY_DOSAGE:
			return dailyDosage != DAILY_DOSAGE_EDEFAULT;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__FREQUENCY:
			return frequency != FREQUENCY_EDEFAULT;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__TIME_TREATEMENT:
			return timeTreatement != TIME_TREATEMENT_EDEFAULT;
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__MEDICATION:
			return MEDICATION_EDEFAULT == null ? medication != null : !MEDICATION_EDEFAULT.equals(medication);
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case Execution_metamodelPackage.MEDICATION_PRESCRIBED_RESOURCE__ACCESS:
			return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
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
		result.append(", idMedication: ");
		result.append(idMedication);
		result.append(", outpatient: ");
		result.append(outpatient);
		result.append(", name: ");
		result.append(name);
		result.append(", standard: ");
		result.append(standard);
		result.append(", brand: ");
		result.append(brand);
		result.append(", code: ");
		result.append(code);
		result.append(", cycles: ");
		result.append(cycles);
		result.append(", category: ");
		result.append(category);
		result.append(", description: ");
		result.append(description);
		result.append(", timeInterval: ");
		result.append(timeInterval);
		result.append(", dailyDosage: ");
		result.append(dailyDosage);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", timeTreatement: ");
		result.append(timeTreatement);
		result.append(", medication: ");
		result.append(medication);
		result.append(", unit: ");
		result.append(unit);
		result.append(", access: ");
		result.append(access);
		result.append(')');
		return result.toString();
	}

} //MedicationPrescribedResourceImpl
