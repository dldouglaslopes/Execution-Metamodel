/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Access;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Medicament;
import MetamodelExecution.Medicine;
import MetamodelExecution.Unit;

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
 * An implementation of the model object '<em><b>Medicament</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getMedicine <em>Medicine</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getIdMedicament <em>Id Medicament</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#isOutpatient <em>Outpatient</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getIdUnit <em>Id Unit</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getIdAccess <em>Id Access</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getStandard <em>Standard</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getDailyDosage <em>Daily Dosage</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getCycles <em>Cycles</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getFrequencyDisplay <em>Frequency Display</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getTimeTreatement <em>Time Treatement</em>}</li>
 *   <li>{@link MetamodelExecution.impl.MedicamentImpl#getTimeInterval <em>Time Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicamentImpl extends MinimalEObjectImpl.Container implements Medicament {
	/**
	 * The cached value of the '{@link #getMedicine() <em>Medicine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicine()
	 * @generated
	 * @ordered
	 */
	protected EList<Medicine> medicine;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> unit;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<Access> access;

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
	 * The default value of the '{@link #getIdMedicament() <em>Id Medicament</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdMedicament()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_MEDICAMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdMedicament() <em>Id Medicament</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdMedicament()
	 * @generated
	 * @ordered
	 */
	protected int idMedicament = ID_MEDICAMENT_EDEFAULT;

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
	 * The default value of the '{@link #getIdUnit() <em>Id Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdUnit()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_UNIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdUnit() <em>Id Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdUnit()
	 * @generated
	 * @ordered
	 */
	protected int idUnit = ID_UNIT_EDEFAULT;

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
	 * The default value of the '{@link #getFrequencyDisplay() <em>Frequency Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequencyDisplay() <em>Frequency Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyDisplay()
	 * @generated
	 * @ordered
	 */
	protected String frequencyDisplay = FREQUENCY_DISPLAY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicamentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.MEDICAMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Medicine> getMedicine() {
		if (medicine == null) {
			medicine = new EObjectContainmentEList<Medicine>(Medicine.class, this,
					Execution_metamodelPackage.MEDICAMENT__MEDICINE);
		}
		return medicine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getUnit() {
		if (unit == null) {
			unit = new EObjectContainmentEList<Unit>(Unit.class, this, Execution_metamodelPackage.MEDICAMENT__UNIT);
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Access> getAccess() {
		if (access == null) {
			access = new EObjectContainmentEList<Access>(Access.class, this,
					Execution_metamodelPackage.MEDICAMENT__ACCESS);
		}
		return access;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__ID, oldId,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__URL, oldUrl,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__CODE, oldCode,
					code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdMedicament() {
		return idMedicament;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdMedicament(int newIdMedicament) {
		int oldIdMedicament = idMedicament;
		idMedicament = newIdMedicament;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__ID_MEDICAMENT,
					oldIdMedicament, idMedicament));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__DESCRIPTION,
					oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__BRAND,
					oldBrand, brand));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__OUTPATIENT,
					oldOutpatient, outpatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdUnit() {
		return idUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdUnit(int newIdUnit) {
		int oldIdUnit = idUnit;
		idUnit = newIdUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__ID_UNIT,
					oldIdUnit, idUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__ID_ACCESS,
					oldIdAccess, idAccess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__STANDARD,
					oldStandard, standard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__DAILY_DOSAGE,
					oldDailyDosage, dailyDosage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__CYCLES,
					oldCycles, cycles));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__FREQUENCY,
					oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequencyDisplay() {
		return frequencyDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyDisplay(String newFrequencyDisplay) {
		String oldFrequencyDisplay = frequencyDisplay;
		frequencyDisplay = newFrequencyDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.MEDICAMENT__FREQUENCY_DISPLAY, oldFrequencyDisplay, frequencyDisplay));
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
					Execution_metamodelPackage.MEDICAMENT__TIME_TREATEMENT, oldTimeTreatement, timeTreatement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MEDICAMENT__TIME_INTERVAL,
					oldTimeInterval, timeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.MEDICAMENT__MEDICINE:
			return ((InternalEList<?>) getMedicine()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.MEDICAMENT__UNIT:
			return ((InternalEList<?>) getUnit()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.MEDICAMENT__ACCESS:
			return ((InternalEList<?>) getAccess()).basicRemove(otherEnd, msgs);
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
		case Execution_metamodelPackage.MEDICAMENT__MEDICINE:
			return getMedicine();
		case Execution_metamodelPackage.MEDICAMENT__UNIT:
			return getUnit();
		case Execution_metamodelPackage.MEDICAMENT__ACCESS:
			return getAccess();
		case Execution_metamodelPackage.MEDICAMENT__ID:
			return getId();
		case Execution_metamodelPackage.MEDICAMENT__NAME:
			return getName();
		case Execution_metamodelPackage.MEDICAMENT__URL:
			return getUrl();
		case Execution_metamodelPackage.MEDICAMENT__CODE:
			return getCode();
		case Execution_metamodelPackage.MEDICAMENT__ID_MEDICAMENT:
			return getIdMedicament();
		case Execution_metamodelPackage.MEDICAMENT__DESCRIPTION:
			return getDescription();
		case Execution_metamodelPackage.MEDICAMENT__BRAND:
			return getBrand();
		case Execution_metamodelPackage.MEDICAMENT__OUTPATIENT:
			return isOutpatient();
		case Execution_metamodelPackage.MEDICAMENT__ID_UNIT:
			return getIdUnit();
		case Execution_metamodelPackage.MEDICAMENT__ID_ACCESS:
			return getIdAccess();
		case Execution_metamodelPackage.MEDICAMENT__STANDARD:
			return getStandard();
		case Execution_metamodelPackage.MEDICAMENT__DAILY_DOSAGE:
			return getDailyDosage();
		case Execution_metamodelPackage.MEDICAMENT__CYCLES:
			return getCycles();
		case Execution_metamodelPackage.MEDICAMENT__FREQUENCY:
			return getFrequency();
		case Execution_metamodelPackage.MEDICAMENT__FREQUENCY_DISPLAY:
			return getFrequencyDisplay();
		case Execution_metamodelPackage.MEDICAMENT__TIME_TREATEMENT:
			return getTimeTreatement();
		case Execution_metamodelPackage.MEDICAMENT__TIME_INTERVAL:
			return getTimeInterval();
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
		case Execution_metamodelPackage.MEDICAMENT__MEDICINE:
			getMedicine().clear();
			getMedicine().addAll((Collection<? extends Medicine>) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__UNIT:
			getUnit().clear();
			getUnit().addAll((Collection<? extends Unit>) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__ACCESS:
			getAccess().clear();
			getAccess().addAll((Collection<? extends Access>) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__NAME:
			setName((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__URL:
			setUrl((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__CODE:
			setCode((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__ID_MEDICAMENT:
			setIdMedicament((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__BRAND:
			setBrand((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__OUTPATIENT:
			setOutpatient((Boolean) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__ID_UNIT:
			setIdUnit((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__ID_ACCESS:
			setIdAccess((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__STANDARD:
			setStandard((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__DAILY_DOSAGE:
			setDailyDosage((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__CYCLES:
			setCycles((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__FREQUENCY:
			setFrequency((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__FREQUENCY_DISPLAY:
			setFrequencyDisplay((String) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__TIME_TREATEMENT:
			setTimeTreatement((Integer) newValue);
			return;
		case Execution_metamodelPackage.MEDICAMENT__TIME_INTERVAL:
			setTimeInterval((Integer) newValue);
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
		case Execution_metamodelPackage.MEDICAMENT__MEDICINE:
			getMedicine().clear();
			return;
		case Execution_metamodelPackage.MEDICAMENT__UNIT:
			getUnit().clear();
			return;
		case Execution_metamodelPackage.MEDICAMENT__ACCESS:
			getAccess().clear();
			return;
		case Execution_metamodelPackage.MEDICAMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__URL:
			setUrl(URL_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__ID_MEDICAMENT:
			setIdMedicament(ID_MEDICAMENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__BRAND:
			setBrand(BRAND_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__OUTPATIENT:
			setOutpatient(OUTPATIENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__ID_UNIT:
			setIdUnit(ID_UNIT_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__ID_ACCESS:
			setIdAccess(ID_ACCESS_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__STANDARD:
			setStandard(STANDARD_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__DAILY_DOSAGE:
			setDailyDosage(DAILY_DOSAGE_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__CYCLES:
			setCycles(CYCLES_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__FREQUENCY:
			setFrequency(FREQUENCY_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__FREQUENCY_DISPLAY:
			setFrequencyDisplay(FREQUENCY_DISPLAY_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__TIME_TREATEMENT:
			setTimeTreatement(TIME_TREATEMENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.MEDICAMENT__TIME_INTERVAL:
			setTimeInterval(TIME_INTERVAL_EDEFAULT);
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
		case Execution_metamodelPackage.MEDICAMENT__MEDICINE:
			return medicine != null && !medicine.isEmpty();
		case Execution_metamodelPackage.MEDICAMENT__UNIT:
			return unit != null && !unit.isEmpty();
		case Execution_metamodelPackage.MEDICAMENT__ACCESS:
			return access != null && !access.isEmpty();
		case Execution_metamodelPackage.MEDICAMENT__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.MEDICAMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Execution_metamodelPackage.MEDICAMENT__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case Execution_metamodelPackage.MEDICAMENT__CODE:
			return code != CODE_EDEFAULT;
		case Execution_metamodelPackage.MEDICAMENT__ID_MEDICAMENT:
			return idMedicament != ID_MEDICAMENT_EDEFAULT;
		case Execution_metamodelPackage.MEDICAMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Execution_metamodelPackage.MEDICAMENT__BRAND:
			return BRAND_EDEFAULT == null ? brand != null : !BRAND_EDEFAULT.equals(brand);
		case Execution_metamodelPackage.MEDICAMENT__OUTPATIENT:
			return outpatient != OUTPATIENT_EDEFAULT;
		case Execution_metamodelPackage.MEDICAMENT__ID_UNIT:
			return idUnit != ID_UNIT_EDEFAULT;
		case Execution_metamodelPackage.MEDICAMENT__ID_ACCESS:
			return idAccess != ID_ACCESS_EDEFAULT;
		case Execution_metamodelPackage.MEDICAMENT__STANDARD:
			return STANDARD_EDEFAULT == null ? standard != null : !STANDARD_EDEFAULT.equals(standard);
		case Execution_metamodelPackage.MEDICAMENT__DAILY_DOSAGE:
			return dailyDosage != DAILY_DOSAGE_EDEFAULT;
		case Execution_metamodelPackage.MEDICAMENT__CYCLES:
			return cycles != CYCLES_EDEFAULT;
		case Execution_metamodelPackage.MEDICAMENT__FREQUENCY:
			return frequency != FREQUENCY_EDEFAULT;
		case Execution_metamodelPackage.MEDICAMENT__FREQUENCY_DISPLAY:
			return FREQUENCY_DISPLAY_EDEFAULT == null ? frequencyDisplay != null
					: !FREQUENCY_DISPLAY_EDEFAULT.equals(frequencyDisplay);
		case Execution_metamodelPackage.MEDICAMENT__TIME_TREATEMENT:
			return timeTreatement != TIME_TREATEMENT_EDEFAULT;
		case Execution_metamodelPackage.MEDICAMENT__TIME_INTERVAL:
			return timeInterval != TIME_INTERVAL_EDEFAULT;
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
		result.append(", url: ");
		result.append(url);
		result.append(", code: ");
		result.append(code);
		result.append(", idMedicament: ");
		result.append(idMedicament);
		result.append(", description: ");
		result.append(description);
		result.append(", brand: ");
		result.append(brand);
		result.append(", outpatient: ");
		result.append(outpatient);
		result.append(", idUnit: ");
		result.append(idUnit);
		result.append(", idAccess: ");
		result.append(idAccess);
		result.append(", standard: ");
		result.append(standard);
		result.append(", dailyDosage: ");
		result.append(dailyDosage);
		result.append(", cycles: ");
		result.append(cycles);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", frequencyDisplay: ");
		result.append(frequencyDisplay);
		result.append(", timeTreatement: ");
		result.append(timeTreatement);
		result.append(", timeInterval: ");
		result.append(timeInterval);
		result.append(')');
		return result.toString();
	}

} //MedicamentImpl
