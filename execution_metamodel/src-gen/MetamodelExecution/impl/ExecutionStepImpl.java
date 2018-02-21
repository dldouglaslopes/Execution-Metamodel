/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Creator;
import MetamodelExecution.ExecutionStep;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Executor;
import MetamodelExecution.Justify;
import MetamodelExecution.Next;
import MetamodelExecution.Previous;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import protocolosv2.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getTypeVerbose <em>Type Verbose</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#isIsCurrent <em>Is Current</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#isReworked <em>Reworked</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#isExecuted <em>Executed</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getNext <em>Next</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getExecutionDate <em>Execution Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getIdStep <em>Id Step</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getIdProtocol <em>Id Protocol</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getIdExecutedProtocol <em>Id Executed Protocol</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getJustify <em>Justify</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionStepImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExecutionStepImpl extends MinimalEObjectImpl.Container implements ExecutionStep {
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
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Previous previous;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Next next;

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
	 * The default value of the '{@link #getIdProtocol() <em>Id Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PROTOCOL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdProtocol() <em>Id Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProtocol()
	 * @generated
	 * @ordered
	 */
	protected int idProtocol = ID_PROTOCOL_EDEFAULT;

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
	 * The cached value of the '{@link #getJustify() <em>Justify</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustify()
	 * @generated
	 * @ordered
	 */
	protected Justify justify;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> step;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.EXECUTION_STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTION_STEP__ID, oldId,
					id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTION_STEP__TYPE,
					oldType, type));
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
					Execution_metamodelPackage.EXECUTION_STEP__TYPE_VERBOSE, oldTypeVerbose, typeVerbose));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTION_STEP__URL,
					oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTION_STEP__IS_CURRENT,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTION_STEP__REWORKED,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTION_STEP__EXECUTED,
					oldExecuted, executed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Previous getPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(Previous newPrevious, NotificationChain msgs) {
		Previous oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_STEP__PREVIOUS, oldPrevious, newPrevious);
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
	public void setPrevious(Previous newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject) previous).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_STEP__PREVIOUS, null, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject) newPrevious).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_STEP__PREVIOUS, null, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTION_STEP__PREVIOUS,
					newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Next getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(Next newNext, NotificationChain msgs) {
		Next oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_STEP__NEXT, oldNext, newNext);
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
	public void setNext(Next newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_STEP__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject) newNext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_STEP__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTION_STEP__NEXT,
					newNext, newNext));
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
					Execution_metamodelPackage.EXECUTION_STEP__CREATION_DATE, oldCreationDate, creationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_STEP__CHANGE_DATE, oldChangeDate, changeDate));
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
					Execution_metamodelPackage.EXECUTION_STEP__EXECUTION_DATE, oldExecutionDate, executionDate));
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
					Execution_metamodelPackage.EXECUTION_STEP__CREATOR, oldCreator, newCreator);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_STEP__CREATOR, null, msgs);
			if (newCreator != null)
				msgs = ((InternalEObject) newCreator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_STEP__CREATOR, null, msgs);
			msgs = basicSetCreator(newCreator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTION_STEP__CREATOR,
					newCreator, newCreator));
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
					Execution_metamodelPackage.EXECUTION_STEP__EXECUTOR, oldExecutor, newExecutor);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_STEP__EXECUTOR, null, msgs);
			if (newExecutor != null)
				msgs = ((InternalEObject) newExecutor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_STEP__EXECUTOR, null, msgs);
			msgs = basicSetExecutor(newExecutor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTION_STEP__EXECUTOR,
					newExecutor, newExecutor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTION_STEP__ID_STEP,
					oldIdStep, idStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdProtocol() {
		return idProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdProtocol(int newIdProtocol) {
		int oldIdProtocol = idProtocol;
		idProtocol = newIdProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_STEP__ID_PROTOCOL, oldIdProtocol, idProtocol));
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
					Execution_metamodelPackage.EXECUTION_STEP__ID_EXECUTED_PROTOCOL, oldIdExecutedProtocol,
					idExecutedProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Justify getJustify() {
		return justify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJustify(Justify newJustify, NotificationChain msgs) {
		Justify oldJustify = justify;
		justify = newJustify;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_STEP__JUSTIFY, oldJustify, newJustify);
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
	public void setJustify(Justify newJustify) {
		if (newJustify != justify) {
			NotificationChain msgs = null;
			if (justify != null)
				msgs = ((InternalEObject) justify).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_STEP__JUSTIFY, null, msgs);
			if (newJustify != null)
				msgs = ((InternalEObject) newJustify).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_STEP__JUSTIFY, null, msgs);
			msgs = basicSetJustify(newJustify, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTION_STEP__JUSTIFY,
					newJustify, newJustify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<Element>(Element.class, this,
					Execution_metamodelPackage.EXECUTION_STEP__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.EXECUTION_STEP__PREVIOUS:
			return basicSetPrevious(null, msgs);
		case Execution_metamodelPackage.EXECUTION_STEP__NEXT:
			return basicSetNext(null, msgs);
		case Execution_metamodelPackage.EXECUTION_STEP__CREATOR:
			return basicSetCreator(null, msgs);
		case Execution_metamodelPackage.EXECUTION_STEP__EXECUTOR:
			return basicSetExecutor(null, msgs);
		case Execution_metamodelPackage.EXECUTION_STEP__JUSTIFY:
			return basicSetJustify(null, msgs);
		case Execution_metamodelPackage.EXECUTION_STEP__STEP:
			return ((InternalEList<?>) getStep()).basicRemove(otherEnd, msgs);
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
		case Execution_metamodelPackage.EXECUTION_STEP__ID:
			return getId();
		case Execution_metamodelPackage.EXECUTION_STEP__TYPE:
			return getType();
		case Execution_metamodelPackage.EXECUTION_STEP__TYPE_VERBOSE:
			return getTypeVerbose();
		case Execution_metamodelPackage.EXECUTION_STEP__URL:
			return getUrl();
		case Execution_metamodelPackage.EXECUTION_STEP__IS_CURRENT:
			return isIsCurrent();
		case Execution_metamodelPackage.EXECUTION_STEP__REWORKED:
			return isReworked();
		case Execution_metamodelPackage.EXECUTION_STEP__EXECUTED:
			return isExecuted();
		case Execution_metamodelPackage.EXECUTION_STEP__PREVIOUS:
			return getPrevious();
		case Execution_metamodelPackage.EXECUTION_STEP__NEXT:
			return getNext();
		case Execution_metamodelPackage.EXECUTION_STEP__CREATION_DATE:
			return getCreationDate();
		case Execution_metamodelPackage.EXECUTION_STEP__CHANGE_DATE:
			return getChangeDate();
		case Execution_metamodelPackage.EXECUTION_STEP__EXECUTION_DATE:
			return getExecutionDate();
		case Execution_metamodelPackage.EXECUTION_STEP__CREATOR:
			return getCreator();
		case Execution_metamodelPackage.EXECUTION_STEP__EXECUTOR:
			return getExecutor();
		case Execution_metamodelPackage.EXECUTION_STEP__ID_STEP:
			return getIdStep();
		case Execution_metamodelPackage.EXECUTION_STEP__ID_PROTOCOL:
			return getIdProtocol();
		case Execution_metamodelPackage.EXECUTION_STEP__ID_EXECUTED_PROTOCOL:
			return getIdExecutedProtocol();
		case Execution_metamodelPackage.EXECUTION_STEP__JUSTIFY:
			return getJustify();
		case Execution_metamodelPackage.EXECUTION_STEP__STEP:
			return getStep();
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
		case Execution_metamodelPackage.EXECUTION_STEP__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__TYPE:
			setType((String) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__TYPE_VERBOSE:
			setTypeVerbose((String) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__URL:
			setUrl((String) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__IS_CURRENT:
			setIsCurrent((Boolean) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__REWORKED:
			setReworked((Boolean) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__EXECUTED:
			setExecuted((Boolean) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__PREVIOUS:
			setPrevious((Previous) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__NEXT:
			setNext((Next) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__CREATION_DATE:
			setCreationDate((Date) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__CHANGE_DATE:
			setChangeDate((Date) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__EXECUTION_DATE:
			setExecutionDate((Date) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__CREATOR:
			setCreator((Creator) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__EXECUTOR:
			setExecutor((Executor) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__ID_STEP:
			setIdStep((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__ID_PROTOCOL:
			setIdProtocol((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__ID_EXECUTED_PROTOCOL:
			setIdExecutedProtocol((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__JUSTIFY:
			setJustify((Justify) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__STEP:
			getStep().clear();
			getStep().addAll((Collection<? extends Element>) newValue);
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
		case Execution_metamodelPackage.EXECUTION_STEP__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__TYPE_VERBOSE:
			setTypeVerbose(TYPE_VERBOSE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__URL:
			setUrl(URL_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__IS_CURRENT:
			setIsCurrent(IS_CURRENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__REWORKED:
			setReworked(REWORKED_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__EXECUTED:
			setExecuted(EXECUTED_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__PREVIOUS:
			setPrevious((Previous) null);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__NEXT:
			setNext((Next) null);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__CREATION_DATE:
			setCreationDate(CREATION_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__CHANGE_DATE:
			setChangeDate(CHANGE_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__EXECUTION_DATE:
			setExecutionDate(EXECUTION_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__CREATOR:
			setCreator((Creator) null);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__EXECUTOR:
			setExecutor((Executor) null);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__ID_STEP:
			setIdStep(ID_STEP_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__ID_PROTOCOL:
			setIdProtocol(ID_PROTOCOL_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__ID_EXECUTED_PROTOCOL:
			setIdExecutedProtocol(ID_EXECUTED_PROTOCOL_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__JUSTIFY:
			setJustify((Justify) null);
			return;
		case Execution_metamodelPackage.EXECUTION_STEP__STEP:
			getStep().clear();
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
		case Execution_metamodelPackage.EXECUTION_STEP__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.EXECUTION_STEP__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case Execution_metamodelPackage.EXECUTION_STEP__TYPE_VERBOSE:
			return TYPE_VERBOSE_EDEFAULT == null ? typeVerbose != null : !TYPE_VERBOSE_EDEFAULT.equals(typeVerbose);
		case Execution_metamodelPackage.EXECUTION_STEP__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case Execution_metamodelPackage.EXECUTION_STEP__IS_CURRENT:
			return isCurrent != IS_CURRENT_EDEFAULT;
		case Execution_metamodelPackage.EXECUTION_STEP__REWORKED:
			return reworked != REWORKED_EDEFAULT;
		case Execution_metamodelPackage.EXECUTION_STEP__EXECUTED:
			return executed != EXECUTED_EDEFAULT;
		case Execution_metamodelPackage.EXECUTION_STEP__PREVIOUS:
			return previous != null;
		case Execution_metamodelPackage.EXECUTION_STEP__NEXT:
			return next != null;
		case Execution_metamodelPackage.EXECUTION_STEP__CREATION_DATE:
			return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
		case Execution_metamodelPackage.EXECUTION_STEP__CHANGE_DATE:
			return CHANGE_DATE_EDEFAULT == null ? changeDate != null : !CHANGE_DATE_EDEFAULT.equals(changeDate);
		case Execution_metamodelPackage.EXECUTION_STEP__EXECUTION_DATE:
			return EXECUTION_DATE_EDEFAULT == null ? executionDate != null
					: !EXECUTION_DATE_EDEFAULT.equals(executionDate);
		case Execution_metamodelPackage.EXECUTION_STEP__CREATOR:
			return creator != null;
		case Execution_metamodelPackage.EXECUTION_STEP__EXECUTOR:
			return executor != null;
		case Execution_metamodelPackage.EXECUTION_STEP__ID_STEP:
			return idStep != ID_STEP_EDEFAULT;
		case Execution_metamodelPackage.EXECUTION_STEP__ID_PROTOCOL:
			return idProtocol != ID_PROTOCOL_EDEFAULT;
		case Execution_metamodelPackage.EXECUTION_STEP__ID_EXECUTED_PROTOCOL:
			return idExecutedProtocol != ID_EXECUTED_PROTOCOL_EDEFAULT;
		case Execution_metamodelPackage.EXECUTION_STEP__JUSTIFY:
			return justify != null;
		case Execution_metamodelPackage.EXECUTION_STEP__STEP:
			return step != null && !step.isEmpty();
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
		result.append(", typeVerbose: ");
		result.append(typeVerbose);
		result.append(", url: ");
		result.append(url);
		result.append(", isCurrent: ");
		result.append(isCurrent);
		result.append(", reworked: ");
		result.append(reworked);
		result.append(", executed: ");
		result.append(executed);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", changeDate: ");
		result.append(changeDate);
		result.append(", executionDate: ");
		result.append(executionDate);
		result.append(", idStep: ");
		result.append(idStep);
		result.append(", idProtocol: ");
		result.append(idProtocol);
		result.append(", idExecutedProtocol: ");
		result.append(idExecutedProtocol);
		result.append(')');
		return result.toString();
	}

} //ExecutionStepImpl
