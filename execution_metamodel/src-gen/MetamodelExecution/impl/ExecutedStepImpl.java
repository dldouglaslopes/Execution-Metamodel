/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.ExecutedStep;
import MetamodelExecution.Execution_metamodelPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executed Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#getCreatedById <em>Created By Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#getExecutedById <em>Executed By Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#getExecutedBy <em>Executed By</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#getStep <em>Step</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#isExecuted <em>Executed</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#getIdStep <em>Id Step</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#isReworked <em>Reworked</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#getTypeVerbose <em>Type Verbose</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#isIsCurrent <em>Is Current</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#getIdPathway <em>Id Pathway</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#getExecutionDate <em>Execution Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#getIdExecutedProtocol <em>Id Executed Protocol</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutedStepImpl#getChangeDate <em>Change Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutedStepImpl extends MinimalEObjectImpl.Container implements ExecutedStep {
	/**
	 * The default value of the '{@link #getCreatedById() <em>Created By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedById()
	 * @generated
	 * @ordered
	 */
	protected static final int CREATED_BY_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCreatedById() <em>Created By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedById()
	 * @generated
	 * @ordered
	 */
	protected int createdById = CREATED_BY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected String createdBy = CREATED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutedById() <em>Executed By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedById()
	 * @generated
	 * @ordered
	 */
	protected static final int EXECUTED_BY_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExecutedById() <em>Executed By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedById()
	 * @generated
	 * @ordered
	 */
	protected int executedById = EXECUTED_BY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutedBy() <em>Executed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutedBy() <em>Executed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedBy()
	 * @generated
	 * @ordered
	 */
	protected String executedBy = EXECUTED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final String STEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected String step = STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #isExecuted() <em>Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecuted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXECUTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExecuted() <em>Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecuted()
	 * @generated
	 * @ordered
	 */
	protected boolean executed = EXECUTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdStep() <em>Id Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdStep()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdStep() <em>Id Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdStep()
	 * @generated
	 * @ordered
	 */
	protected int idStep = ID_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #isReworked() <em>Reworked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReworked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REWORKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReworked() <em>Reworked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReworked()
	 * @generated
	 * @ordered
	 */
	protected boolean reworked = REWORKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

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
	 * The default value of the '{@link #isIsCurrent() <em>Is Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CURRENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCurrent() <em>Is Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCurrent()
	 * @generated
	 * @ordered
	 */
	protected boolean isCurrent = IS_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdPathway() <em>Id Pathway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPathway()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PATHWAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdPathway() <em>Id Pathway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPathway()
	 * @generated
	 * @ordered
	 */
	protected int idPathway = ID_PATHWAY_EDEFAULT;

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
	 * The default value of the '{@link #getExecutionDate() <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXECUTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionDate() <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionDate()
	 * @generated
	 * @ordered
	 */
	protected Date executionDate = EXECUTION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdExecutedProtocol() <em>Id Executed Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdExecutedProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EXECUTED_PROTOCOL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdExecutedProtocol() <em>Id Executed Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdExecutedProtocol()
	 * @generated
	 * @ordered
	 */
	protected int idExecutedProtocol = ID_EXECUTED_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHANGE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected Date changeDate = CHANGE_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutedStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.EXECUTED_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCreatedById() {
		return createdById;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedById(int newCreatedById) {
		int oldCreatedById = createdById;
		createdById = newCreatedById;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTED_STEP__CREATED_BY_ID, oldCreatedById, createdById));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedBy(String newCreatedBy) {
		String oldCreatedBy = createdBy;
		createdBy = newCreatedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTED_STEP__CREATED_BY,
					oldCreatedBy, createdBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExecutedById() {
		return executedById;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutedById(int newExecutedById) {
		int oldExecutedById = executedById;
		executedById = newExecutedById;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTED_STEP__EXECUTED_BY_ID, oldExecutedById, executedById));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutedBy() {
		return executedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutedBy(String newExecutedBy) {
		String oldExecutedBy = executedBy;
		executedBy = newExecutedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTED_STEP__EXECUTED_BY,
					oldExecutedBy, executedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(String newStep) {
		String oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTED_STEP__STEP,
					oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExecuted() {
		return executed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecuted(boolean newExecuted) {
		boolean oldExecuted = executed;
		executed = newExecuted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTED_STEP__EXECUTED,
					oldExecuted, executed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdStep() {
		return idStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdStep(int newIdStep) {
		int oldIdStep = idStep;
		idStep = newIdStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTED_STEP__ID_STEP,
					oldIdStep, idStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReworked() {
		return reworked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReworked(boolean newReworked) {
		boolean oldReworked = reworked;
		reworked = newReworked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTED_STEP__REWORKED,
					oldReworked, reworked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTED_STEP__CREATION_DATE, oldCreationDate, creationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTED_STEP__TYPE_VERBOSE, oldTypeVerbose, typeVerbose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCurrent() {
		return isCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCurrent(boolean newIsCurrent) {
		boolean oldIsCurrent = isCurrent;
		isCurrent = newIsCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTED_STEP__IS_CURRENT,
					oldIsCurrent, isCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdPathway() {
		return idPathway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPathway(int newIdPathway) {
		int oldIdPathway = idPathway;
		idPathway = newIdPathway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTED_STEP__ID_PATHWAY,
					oldIdPathway, idPathway));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTED_STEP__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExecutionDate() {
		return executionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionDate(Date newExecutionDate) {
		Date oldExecutionDate = executionDate;
		executionDate = newExecutionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTED_STEP__EXECUTION_DATE, oldExecutionDate, executionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdExecutedProtocol() {
		return idExecutedProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdExecutedProtocol(int newIdExecutedProtocol) {
		int oldIdExecutedProtocol = idExecutedProtocol;
		idExecutedProtocol = newIdExecutedProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTED_STEP__ID_EXECUTED_PROTOCOL, oldIdExecutedProtocol,
					idExecutedProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getChangeDate() {
		return changeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeDate(Date newChangeDate) {
		Date oldChangeDate = changeDate;
		changeDate = newChangeDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTED_STEP__CHANGE_DATE,
					oldChangeDate, changeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.EXECUTED_STEP__CREATED_BY_ID:
			return getCreatedById();
		case Execution_metamodelPackage.EXECUTED_STEP__CREATED_BY:
			return getCreatedBy();
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTED_BY_ID:
			return getExecutedById();
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTED_BY:
			return getExecutedBy();
		case Execution_metamodelPackage.EXECUTED_STEP__STEP:
			return getStep();
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTED:
			return isExecuted();
		case Execution_metamodelPackage.EXECUTED_STEP__ID_STEP:
			return getIdStep();
		case Execution_metamodelPackage.EXECUTED_STEP__REWORKED:
			return isReworked();
		case Execution_metamodelPackage.EXECUTED_STEP__CREATION_DATE:
			return getCreationDate();
		case Execution_metamodelPackage.EXECUTED_STEP__TYPE_VERBOSE:
			return getTypeVerbose();
		case Execution_metamodelPackage.EXECUTED_STEP__IS_CURRENT:
			return isIsCurrent();
		case Execution_metamodelPackage.EXECUTED_STEP__ID_PATHWAY:
			return getIdPathway();
		case Execution_metamodelPackage.EXECUTED_STEP__TYPE:
			return getType();
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTION_DATE:
			return getExecutionDate();
		case Execution_metamodelPackage.EXECUTED_STEP__ID_EXECUTED_PROTOCOL:
			return getIdExecutedProtocol();
		case Execution_metamodelPackage.EXECUTED_STEP__CHANGE_DATE:
			return getChangeDate();
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
		case Execution_metamodelPackage.EXECUTED_STEP__CREATED_BY_ID:
			setCreatedById((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__CREATED_BY:
			setCreatedBy((String) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTED_BY_ID:
			setExecutedById((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTED_BY:
			setExecutedBy((String) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__STEP:
			setStep((String) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTED:
			setExecuted((Boolean) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__ID_STEP:
			setIdStep((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__REWORKED:
			setReworked((Boolean) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__CREATION_DATE:
			setCreationDate((Date) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__TYPE_VERBOSE:
			setTypeVerbose((String) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__IS_CURRENT:
			setIsCurrent((Boolean) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__ID_PATHWAY:
			setIdPathway((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__TYPE:
			setType((String) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTION_DATE:
			setExecutionDate((Date) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__ID_EXECUTED_PROTOCOL:
			setIdExecutedProtocol((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__CHANGE_DATE:
			setChangeDate((Date) newValue);
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
		case Execution_metamodelPackage.EXECUTED_STEP__CREATED_BY_ID:
			setCreatedById(CREATED_BY_ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__CREATED_BY:
			setCreatedBy(CREATED_BY_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTED_BY_ID:
			setExecutedById(EXECUTED_BY_ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTED_BY:
			setExecutedBy(EXECUTED_BY_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__STEP:
			setStep(STEP_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTED:
			setExecuted(EXECUTED_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__ID_STEP:
			setIdStep(ID_STEP_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__REWORKED:
			setReworked(REWORKED_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__CREATION_DATE:
			setCreationDate(CREATION_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__TYPE_VERBOSE:
			setTypeVerbose(TYPE_VERBOSE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__IS_CURRENT:
			setIsCurrent(IS_CURRENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__ID_PATHWAY:
			setIdPathway(ID_PATHWAY_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTION_DATE:
			setExecutionDate(EXECUTION_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__ID_EXECUTED_PROTOCOL:
			setIdExecutedProtocol(ID_EXECUTED_PROTOCOL_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTED_STEP__CHANGE_DATE:
			setChangeDate(CHANGE_DATE_EDEFAULT);
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
		case Execution_metamodelPackage.EXECUTED_STEP__CREATED_BY_ID:
			return createdById != CREATED_BY_ID_EDEFAULT;
		case Execution_metamodelPackage.EXECUTED_STEP__CREATED_BY:
			return CREATED_BY_EDEFAULT == null ? createdBy != null : !CREATED_BY_EDEFAULT.equals(createdBy);
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTED_BY_ID:
			return executedById != EXECUTED_BY_ID_EDEFAULT;
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTED_BY:
			return EXECUTED_BY_EDEFAULT == null ? executedBy != null : !EXECUTED_BY_EDEFAULT.equals(executedBy);
		case Execution_metamodelPackage.EXECUTED_STEP__STEP:
			return STEP_EDEFAULT == null ? step != null : !STEP_EDEFAULT.equals(step);
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTED:
			return executed != EXECUTED_EDEFAULT;
		case Execution_metamodelPackage.EXECUTED_STEP__ID_STEP:
			return idStep != ID_STEP_EDEFAULT;
		case Execution_metamodelPackage.EXECUTED_STEP__REWORKED:
			return reworked != REWORKED_EDEFAULT;
		case Execution_metamodelPackage.EXECUTED_STEP__CREATION_DATE:
			return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
		case Execution_metamodelPackage.EXECUTED_STEP__TYPE_VERBOSE:
			return TYPE_VERBOSE_EDEFAULT == null ? typeVerbose != null : !TYPE_VERBOSE_EDEFAULT.equals(typeVerbose);
		case Execution_metamodelPackage.EXECUTED_STEP__IS_CURRENT:
			return isCurrent != IS_CURRENT_EDEFAULT;
		case Execution_metamodelPackage.EXECUTED_STEP__ID_PATHWAY:
			return idPathway != ID_PATHWAY_EDEFAULT;
		case Execution_metamodelPackage.EXECUTED_STEP__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case Execution_metamodelPackage.EXECUTED_STEP__EXECUTION_DATE:
			return EXECUTION_DATE_EDEFAULT == null ? executionDate != null
					: !EXECUTION_DATE_EDEFAULT.equals(executionDate);
		case Execution_metamodelPackage.EXECUTED_STEP__ID_EXECUTED_PROTOCOL:
			return idExecutedProtocol != ID_EXECUTED_PROTOCOL_EDEFAULT;
		case Execution_metamodelPackage.EXECUTED_STEP__CHANGE_DATE:
			return CHANGE_DATE_EDEFAULT == null ? changeDate != null : !CHANGE_DATE_EDEFAULT.equals(changeDate);
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
		result.append(" (createdById: ");
		result.append(createdById);
		result.append(", createdBy: ");
		result.append(createdBy);
		result.append(", executedById: ");
		result.append(executedById);
		result.append(", executedBy: ");
		result.append(executedBy);
		result.append(", step: ");
		result.append(step);
		result.append(", executed: ");
		result.append(executed);
		result.append(", idStep: ");
		result.append(idStep);
		result.append(", reworked: ");
		result.append(reworked);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", typeVerbose: ");
		result.append(typeVerbose);
		result.append(", isCurrent: ");
		result.append(isCurrent);
		result.append(", idPathway: ");
		result.append(idPathway);
		result.append(", type: ");
		result.append(type);
		result.append(", executionDate: ");
		result.append(executionDate);
		result.append(", idExecutedProtocol: ");
		result.append(idExecutedProtocol);
		result.append(", changeDate: ");
		result.append(changeDate);
		result.append(')');
		return result.toString();
	}

} //ExecutedStepImpl
