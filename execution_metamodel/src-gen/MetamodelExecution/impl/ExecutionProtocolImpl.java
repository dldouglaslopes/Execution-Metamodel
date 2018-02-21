/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.ExecutedStep;
import MetamodelExecution.ExecutionProtocol;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Justify;
import MetamodelExecution.LastProfessional;
import MetamodelExecution.Protocol;
import MetamodelExecution.Responsible;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#getCreation <em>Creation</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#isCompleted <em>Completed</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#isAborted <em>Aborted</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#getJustify <em>Justify</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#getLastExecutedStepDate <em>Last Executed Step Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#getIdProtocol <em>Id Protocol</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#getIdResponsible <em>Id Responsible</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#getIdLastProfessional <em>Id Last Professional</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#getLastprofessional <em>Lastprofessional</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExecutionProtocolImpl#getExecutedstep <em>Executedstep</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionProtocolImpl extends MinimalEObjectImpl.Container implements ExecutionProtocol {
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
	 * The default value of the '{@link #getCreation() <em>Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreation()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreation() <em>Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreation()
	 * @generated
	 * @ordered
	 */
	protected Date creation = CREATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConclusion() <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected static final Date CONCLUSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected Date conclusion = CONCLUSION_EDEFAULT;

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
	 * The default value of the '{@link #isAborted() <em>Aborted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAborted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAborted() <em>Aborted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAborted()
	 * @generated
	 * @ordered
	 */
	protected boolean aborted = ABORTED_EDEFAULT;

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
	 * The default value of the '{@link #getLastExecutedStepDate() <em>Last Executed Step Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastExecutedStepDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_EXECUTED_STEP_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastExecutedStepDate() <em>Last Executed Step Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastExecutedStepDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastExecutedStepDate = LAST_EXECUTED_STEP_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected Protocol protocol;

	/**
	 * The default value of the '{@link #getIdResponsible() <em>Id Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdResponsible()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_RESPONSIBLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdResponsible() <em>Id Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdResponsible()
	 * @generated
	 * @ordered
	 */
	protected int idResponsible = ID_RESPONSIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdLastProfessional() <em>Id Last Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdLastProfessional()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_LAST_PROFESSIONAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdLastProfessional() <em>Id Last Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdLastProfessional()
	 * @generated
	 * @ordered
	 */
	protected int idLastProfessional = ID_LAST_PROFESSIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected Responsible responsible;

	/**
	 * The cached value of the '{@link #getLastprofessional() <em>Lastprofessional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastprofessional()
	 * @generated
	 * @ordered
	 */
	protected LastProfessional lastprofessional;

	/**
	 * The cached value of the '{@link #getExecutedstep() <em>Executedstep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedstep()
	 * @generated
	 * @ordered
	 */
	protected ExecutedStep executedstep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.EXECUTION_PROTOCOL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTION_PROTOCOL__ID,
					oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXECUTION_PROTOCOL__URL,
					oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreation() {
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreation(Date newCreation) {
		Date oldCreation = creation;
		creation = newCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__CREATION, oldCreation, creation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getConclusion() {
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConclusion(Date newConclusion) {
		Date oldConclusion = conclusion;
		conclusion = newConclusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__CONCLUSION, oldConclusion, conclusion));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__COMPLETED, oldCompleted, completed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAborted() {
		return aborted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAborted(boolean newAborted) {
		boolean oldAborted = aborted;
		aborted = newAborted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__ABORTED, oldAborted, aborted));
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
					Execution_metamodelPackage.EXECUTION_PROTOCOL__JUSTIFY, oldJustify, newJustify);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_PROTOCOL__JUSTIFY, null, msgs);
			if (newJustify != null)
				msgs = ((InternalEObject) newJustify).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_PROTOCOL__JUSTIFY, null, msgs);
			msgs = basicSetJustify(newJustify, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__JUSTIFY, newJustify, newJustify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastExecutedStepDate() {
		return lastExecutedStepDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastExecutedStepDate(Date newLastExecutedStepDate) {
		Date oldLastExecutedStepDate = lastExecutedStepDate;
		lastExecutedStepDate = newLastExecutedStepDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__LAST_EXECUTED_STEP_DATE, oldLastExecutedStepDate,
					lastExecutedStepDate));
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
					Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_PROTOCOL, oldIdProtocol, idProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(Protocol newProtocol, NotificationChain msgs) {
		Protocol oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__PROTOCOL, oldProtocol, newProtocol);
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
	public void setProtocol(Protocol newProtocol) {
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject) protocol).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_PROTOCOL__PROTOCOL, null, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject) newProtocol).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_PROTOCOL__PROTOCOL, null, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__PROTOCOL, newProtocol, newProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdResponsible() {
		return idResponsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdResponsible(int newIdResponsible) {
		int oldIdResponsible = idResponsible;
		idResponsible = newIdResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_RESPONSIBLE, oldIdResponsible, idResponsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdLastProfessional() {
		return idLastProfessional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdLastProfessional(int newIdLastProfessional) {
		int oldIdLastProfessional = idLastProfessional;
		idLastProfessional = newIdLastProfessional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_LAST_PROFESSIONAL, oldIdLastProfessional,
					idLastProfessional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsible getResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsible(Responsible newResponsible, NotificationChain msgs) {
		Responsible oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__RESPONSIBLE, oldResponsible, newResponsible);
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
	public void setResponsible(Responsible newResponsible) {
		if (newResponsible != responsible) {
			NotificationChain msgs = null;
			if (responsible != null)
				msgs = ((InternalEObject) responsible).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_PROTOCOL__RESPONSIBLE, null,
						msgs);
			if (newResponsible != null)
				msgs = ((InternalEObject) newResponsible).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_PROTOCOL__RESPONSIBLE, null,
						msgs);
			msgs = basicSetResponsible(newResponsible, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__RESPONSIBLE, newResponsible, newResponsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastProfessional getLastprofessional() {
		return lastprofessional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastprofessional(LastProfessional newLastprofessional, NotificationChain msgs) {
		LastProfessional oldLastprofessional = lastprofessional;
		lastprofessional = newLastprofessional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__LASTPROFESSIONAL, oldLastprofessional,
					newLastprofessional);
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
	public void setLastprofessional(LastProfessional newLastprofessional) {
		if (newLastprofessional != lastprofessional) {
			NotificationChain msgs = null;
			if (lastprofessional != null)
				msgs = ((InternalEObject) lastprofessional).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_PROTOCOL__LASTPROFESSIONAL, null,
						msgs);
			if (newLastprofessional != null)
				msgs = ((InternalEObject) newLastprofessional).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_PROTOCOL__LASTPROFESSIONAL, null,
						msgs);
			msgs = basicSetLastprofessional(newLastprofessional, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__LASTPROFESSIONAL, newLastprofessional,
					newLastprofessional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutedStep getExecutedstep() {
		return executedstep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutedstep(ExecutedStep newExecutedstep, NotificationChain msgs) {
		ExecutedStep oldExecutedstep = executedstep;
		executedstep = newExecutedstep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__EXECUTEDSTEP, oldExecutedstep, newExecutedstep);
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
	public void setExecutedstep(ExecutedStep newExecutedstep) {
		if (newExecutedstep != executedstep) {
			NotificationChain msgs = null;
			if (executedstep != null)
				msgs = ((InternalEObject) executedstep).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_PROTOCOL__EXECUTEDSTEP, null,
						msgs);
			if (newExecutedstep != null)
				msgs = ((InternalEObject) newExecutedstep).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXECUTION_PROTOCOL__EXECUTEDSTEP, null,
						msgs);
			msgs = basicSetExecutedstep(newExecutedstep, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXECUTION_PROTOCOL__EXECUTEDSTEP, newExecutedstep, newExecutedstep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__JUSTIFY:
			return basicSetJustify(null, msgs);
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__PROTOCOL:
			return basicSetProtocol(null, msgs);
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__RESPONSIBLE:
			return basicSetResponsible(null, msgs);
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__LASTPROFESSIONAL:
			return basicSetLastprofessional(null, msgs);
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__EXECUTEDSTEP:
			return basicSetExecutedstep(null, msgs);
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
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID:
			return getId();
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__URL:
			return getUrl();
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__CREATION:
			return getCreation();
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__CONCLUSION:
			return getConclusion();
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__COMPLETED:
			return isCompleted();
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ABORTED:
			return isAborted();
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__JUSTIFY:
			return getJustify();
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__LAST_EXECUTED_STEP_DATE:
			return getLastExecutedStepDate();
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_PROTOCOL:
			return getIdProtocol();
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__PROTOCOL:
			return getProtocol();
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_RESPONSIBLE:
			return getIdResponsible();
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_LAST_PROFESSIONAL:
			return getIdLastProfessional();
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__RESPONSIBLE:
			return getResponsible();
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__LASTPROFESSIONAL:
			return getLastprofessional();
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__EXECUTEDSTEP:
			return getExecutedstep();
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
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__URL:
			setUrl((String) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__CREATION:
			setCreation((Date) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__CONCLUSION:
			setConclusion((Date) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__COMPLETED:
			setCompleted((Boolean) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ABORTED:
			setAborted((Boolean) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__JUSTIFY:
			setJustify((Justify) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__LAST_EXECUTED_STEP_DATE:
			setLastExecutedStepDate((Date) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_PROTOCOL:
			setIdProtocol((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__PROTOCOL:
			setProtocol((Protocol) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_RESPONSIBLE:
			setIdResponsible((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_LAST_PROFESSIONAL:
			setIdLastProfessional((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__RESPONSIBLE:
			setResponsible((Responsible) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__LASTPROFESSIONAL:
			setLastprofessional((LastProfessional) newValue);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__EXECUTEDSTEP:
			setExecutedstep((ExecutedStep) newValue);
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
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__URL:
			setUrl(URL_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__CREATION:
			setCreation(CREATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__CONCLUSION:
			setConclusion(CONCLUSION_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__COMPLETED:
			setCompleted(COMPLETED_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ABORTED:
			setAborted(ABORTED_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__JUSTIFY:
			setJustify((Justify) null);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__LAST_EXECUTED_STEP_DATE:
			setLastExecutedStepDate(LAST_EXECUTED_STEP_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_PROTOCOL:
			setIdProtocol(ID_PROTOCOL_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__PROTOCOL:
			setProtocol((Protocol) null);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_RESPONSIBLE:
			setIdResponsible(ID_RESPONSIBLE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_LAST_PROFESSIONAL:
			setIdLastProfessional(ID_LAST_PROFESSIONAL_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__RESPONSIBLE:
			setResponsible((Responsible) null);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__LASTPROFESSIONAL:
			setLastprofessional((LastProfessional) null);
			return;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__EXECUTEDSTEP:
			setExecutedstep((ExecutedStep) null);
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
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__CREATION:
			return CREATION_EDEFAULT == null ? creation != null : !CREATION_EDEFAULT.equals(creation);
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__CONCLUSION:
			return CONCLUSION_EDEFAULT == null ? conclusion != null : !CONCLUSION_EDEFAULT.equals(conclusion);
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__COMPLETED:
			return completed != COMPLETED_EDEFAULT;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ABORTED:
			return aborted != ABORTED_EDEFAULT;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__JUSTIFY:
			return justify != null;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__LAST_EXECUTED_STEP_DATE:
			return LAST_EXECUTED_STEP_DATE_EDEFAULT == null ? lastExecutedStepDate != null
					: !LAST_EXECUTED_STEP_DATE_EDEFAULT.equals(lastExecutedStepDate);
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_PROTOCOL:
			return idProtocol != ID_PROTOCOL_EDEFAULT;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__PROTOCOL:
			return protocol != null;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_RESPONSIBLE:
			return idResponsible != ID_RESPONSIBLE_EDEFAULT;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__ID_LAST_PROFESSIONAL:
			return idLastProfessional != ID_LAST_PROFESSIONAL_EDEFAULT;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__RESPONSIBLE:
			return responsible != null;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__LASTPROFESSIONAL:
			return lastprofessional != null;
		case Execution_metamodelPackage.EXECUTION_PROTOCOL__EXECUTEDSTEP:
			return executedstep != null;
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
		result.append(", url: ");
		result.append(url);
		result.append(", creation: ");
		result.append(creation);
		result.append(", conclusion: ");
		result.append(conclusion);
		result.append(", completed: ");
		result.append(completed);
		result.append(", aborted: ");
		result.append(aborted);
		result.append(", lastExecutedStepDate: ");
		result.append(lastExecutedStepDate);
		result.append(", idProtocol: ");
		result.append(idProtocol);
		result.append(", idResponsible: ");
		result.append(idResponsible);
		result.append(", idLastProfessional: ");
		result.append(idLastProfessional);
		result.append(')');
		return result.toString();
	}

} //ExecutionProtocolImpl
