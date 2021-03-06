/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Creator;
import MetamodelExecution.EStep;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Executor;
import MetamodelExecution.Justification;
import MetamodelExecution.Step;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EStep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#isIsCurrent <em>Is Current</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#isReworked <em>Reworked</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#isExecuted <em>Executed</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#getExecutionDate <em>Execution Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#getCreatedById <em>Created By Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#getExecutedById <em>Executed By Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#getStep <em>Step</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EStepImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EStepImpl extends MinimalEObjectImpl.Container implements EStep {
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
	 * The default value of the '{@link #getModificationDate() <em>Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFICATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModificationDate() <em>Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationDate()
	 * @generated
	 * @ordered
	 */
	protected Date modificationDate = MODIFICATION_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected Justification justification;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected Step step;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected Creator creator;

	/**
	 * The cached value of the '{@link #getExecutor() <em>Executor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected Executor executor;

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
	 * The default value of the '{@link #getPrevious() <em>Previous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected String previous = PREVIOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNext() <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected String next = NEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.ESTEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__TYPE, oldType,
					type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__IS_CURRENT,
					oldIsCurrent, isCurrent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__REWORKED,
					oldReworked, reworked));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__EXECUTED,
					oldExecuted, executed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__CREATION_DATE,
					oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModificationDate() {
		return modificationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationDate(Date newModificationDate) {
		Date oldModificationDate = modificationDate;
		modificationDate = newModificationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__MODIFICATION_DATE,
					oldModificationDate, modificationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__EXECUTION_DATE,
					oldExecutionDate, executionDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__CREATED_BY_ID,
					oldCreatedById, createdById));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__EXECUTED_BY_ID,
					oldExecutedById, executedById));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Justification getJustification() {
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJustification(Justification newJustification, NotificationChain msgs) {
		Justification oldJustification = justification;
		justification = newJustification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.ESTEP__JUSTIFICATION, oldJustification, newJustification);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustification(Justification newJustification) {
		if (newJustification != justification) {
			NotificationChain msgs = null;
			if (justification != null)
				msgs = ((InternalEObject) justification).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.ESTEP__JUSTIFICATION, null, msgs);
			if (newJustification != null)
				msgs = ((InternalEObject) newJustification).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.ESTEP__JUSTIFICATION, null, msgs);
			msgs = basicSetJustification(newJustification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__JUSTIFICATION,
					newJustification, newJustification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(Step newStep, NotificationChain msgs) {
		Step oldStep = step;
		step = newStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.ESTEP__STEP, oldStep, newStep);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(Step newStep) {
		if (newStep != step) {
			NotificationChain msgs = null;
			if (step != null)
				msgs = ((InternalEObject) step).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.ESTEP__STEP, null, msgs);
			if (newStep != null)
				msgs = ((InternalEObject) newStep).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.ESTEP__STEP, null, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__STEP, newStep,
					newStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creator getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreator(Creator newCreator, NotificationChain msgs) {
		Creator oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.ESTEP__CREATOR, oldCreator, newCreator);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(Creator newCreator) {
		if (newCreator != creator) {
			NotificationChain msgs = null;
			if (creator != null)
				msgs = ((InternalEObject) creator).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.ESTEP__CREATOR, null, msgs);
			if (newCreator != null)
				msgs = ((InternalEObject) newCreator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.ESTEP__CREATOR, null, msgs);
			msgs = basicSetCreator(newCreator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__CREATOR, newCreator,
					newCreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor getExecutor() {
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutor(Executor newExecutor, NotificationChain msgs) {
		Executor oldExecutor = executor;
		executor = newExecutor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.ESTEP__EXECUTOR, oldExecutor, newExecutor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutor(Executor newExecutor) {
		if (newExecutor != executor) {
			NotificationChain msgs = null;
			if (executor != null)
				msgs = ((InternalEObject) executor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.ESTEP__EXECUTOR, null, msgs);
			if (newExecutor != null)
				msgs = ((InternalEObject) newExecutor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.ESTEP__EXECUTOR, null, msgs);
			msgs = basicSetExecutor(newExecutor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__EXECUTOR,
					newExecutor, newExecutor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(String newPrevious) {
		String oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__PREVIOUS,
					oldPrevious, previous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(String newNext) {
		String oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ESTEP__NEXT, oldNext,
					next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.ESTEP__JUSTIFICATION:
			return basicSetJustification(null, msgs);
		case Execution_metamodelPackage.ESTEP__STEP:
			return basicSetStep(null, msgs);
		case Execution_metamodelPackage.ESTEP__CREATOR:
			return basicSetCreator(null, msgs);
		case Execution_metamodelPackage.ESTEP__EXECUTOR:
			return basicSetExecutor(null, msgs);
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
		case Execution_metamodelPackage.ESTEP__ID:
			return getId();
		case Execution_metamodelPackage.ESTEP__TYPE:
			return getType();
		case Execution_metamodelPackage.ESTEP__IS_CURRENT:
			return isIsCurrent();
		case Execution_metamodelPackage.ESTEP__REWORKED:
			return isReworked();
		case Execution_metamodelPackage.ESTEP__EXECUTED:
			return isExecuted();
		case Execution_metamodelPackage.ESTEP__CREATION_DATE:
			return getCreationDate();
		case Execution_metamodelPackage.ESTEP__MODIFICATION_DATE:
			return getModificationDate();
		case Execution_metamodelPackage.ESTEP__EXECUTION_DATE:
			return getExecutionDate();
		case Execution_metamodelPackage.ESTEP__CREATED_BY_ID:
			return getCreatedById();
		case Execution_metamodelPackage.ESTEP__EXECUTED_BY_ID:
			return getExecutedById();
		case Execution_metamodelPackage.ESTEP__JUSTIFICATION:
			return getJustification();
		case Execution_metamodelPackage.ESTEP__STEP:
			return getStep();
		case Execution_metamodelPackage.ESTEP__CREATOR:
			return getCreator();
		case Execution_metamodelPackage.ESTEP__EXECUTOR:
			return getExecutor();
		case Execution_metamodelPackage.ESTEP__NAME:
			return getName();
		case Execution_metamodelPackage.ESTEP__PREVIOUS:
			return getPrevious();
		case Execution_metamodelPackage.ESTEP__NEXT:
			return getNext();
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
		case Execution_metamodelPackage.ESTEP__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__TYPE:
			setType((String) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__IS_CURRENT:
			setIsCurrent((Boolean) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__REWORKED:
			setReworked((Boolean) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__EXECUTED:
			setExecuted((Boolean) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__CREATION_DATE:
			setCreationDate((Date) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__MODIFICATION_DATE:
			setModificationDate((Date) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__EXECUTION_DATE:
			setExecutionDate((Date) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__CREATED_BY_ID:
			setCreatedById((Integer) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__EXECUTED_BY_ID:
			setExecutedById((Integer) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__JUSTIFICATION:
			setJustification((Justification) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__STEP:
			setStep((Step) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__CREATOR:
			setCreator((Creator) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__EXECUTOR:
			setExecutor((Executor) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__NAME:
			setName((String) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__PREVIOUS:
			setPrevious((String) newValue);
			return;
		case Execution_metamodelPackage.ESTEP__NEXT:
			setNext((String) newValue);
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
		case Execution_metamodelPackage.ESTEP__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.ESTEP__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Execution_metamodelPackage.ESTEP__IS_CURRENT:
			setIsCurrent(IS_CURRENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.ESTEP__REWORKED:
			setReworked(REWORKED_EDEFAULT);
			return;
		case Execution_metamodelPackage.ESTEP__EXECUTED:
			setExecuted(EXECUTED_EDEFAULT);
			return;
		case Execution_metamodelPackage.ESTEP__CREATION_DATE:
			setCreationDate(CREATION_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.ESTEP__MODIFICATION_DATE:
			setModificationDate(MODIFICATION_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.ESTEP__EXECUTION_DATE:
			setExecutionDate(EXECUTION_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.ESTEP__CREATED_BY_ID:
			setCreatedById(CREATED_BY_ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.ESTEP__EXECUTED_BY_ID:
			setExecutedById(EXECUTED_BY_ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.ESTEP__JUSTIFICATION:
			setJustification((Justification) null);
			return;
		case Execution_metamodelPackage.ESTEP__STEP:
			setStep((Step) null);
			return;
		case Execution_metamodelPackage.ESTEP__CREATOR:
			setCreator((Creator) null);
			return;
		case Execution_metamodelPackage.ESTEP__EXECUTOR:
			setExecutor((Executor) null);
			return;
		case Execution_metamodelPackage.ESTEP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Execution_metamodelPackage.ESTEP__PREVIOUS:
			setPrevious(PREVIOUS_EDEFAULT);
			return;
		case Execution_metamodelPackage.ESTEP__NEXT:
			setNext(NEXT_EDEFAULT);
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
		case Execution_metamodelPackage.ESTEP__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.ESTEP__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case Execution_metamodelPackage.ESTEP__IS_CURRENT:
			return isCurrent != IS_CURRENT_EDEFAULT;
		case Execution_metamodelPackage.ESTEP__REWORKED:
			return reworked != REWORKED_EDEFAULT;
		case Execution_metamodelPackage.ESTEP__EXECUTED:
			return executed != EXECUTED_EDEFAULT;
		case Execution_metamodelPackage.ESTEP__CREATION_DATE:
			return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
		case Execution_metamodelPackage.ESTEP__MODIFICATION_DATE:
			return MODIFICATION_DATE_EDEFAULT == null ? modificationDate != null
					: !MODIFICATION_DATE_EDEFAULT.equals(modificationDate);
		case Execution_metamodelPackage.ESTEP__EXECUTION_DATE:
			return EXECUTION_DATE_EDEFAULT == null ? executionDate != null
					: !EXECUTION_DATE_EDEFAULT.equals(executionDate);
		case Execution_metamodelPackage.ESTEP__CREATED_BY_ID:
			return createdById != CREATED_BY_ID_EDEFAULT;
		case Execution_metamodelPackage.ESTEP__EXECUTED_BY_ID:
			return executedById != EXECUTED_BY_ID_EDEFAULT;
		case Execution_metamodelPackage.ESTEP__JUSTIFICATION:
			return justification != null;
		case Execution_metamodelPackage.ESTEP__STEP:
			return step != null;
		case Execution_metamodelPackage.ESTEP__CREATOR:
			return creator != null;
		case Execution_metamodelPackage.ESTEP__EXECUTOR:
			return executor != null;
		case Execution_metamodelPackage.ESTEP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Execution_metamodelPackage.ESTEP__PREVIOUS:
			return PREVIOUS_EDEFAULT == null ? previous != null : !PREVIOUS_EDEFAULT.equals(previous);
		case Execution_metamodelPackage.ESTEP__NEXT:
			return NEXT_EDEFAULT == null ? next != null : !NEXT_EDEFAULT.equals(next);
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
		result.append(", type: ");
		result.append(type);
		result.append(", isCurrent: ");
		result.append(isCurrent);
		result.append(", reworked: ");
		result.append(reworked);
		result.append(", executed: ");
		result.append(executed);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", modificationDate: ");
		result.append(modificationDate);
		result.append(", executionDate: ");
		result.append(executionDate);
		result.append(", createdById: ");
		result.append(createdById);
		result.append(", executedById: ");
		result.append(executedById);
		result.append(", name: ");
		result.append(name);
		result.append(", previous: ");
		result.append(previous);
		result.append(", next: ");
		result.append(next);
		result.append(')');
		return result.toString();
	}

} //EStepImpl
