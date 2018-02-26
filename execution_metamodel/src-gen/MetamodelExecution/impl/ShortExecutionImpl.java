/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.ExecutedStep;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.LastProfessional;
import MetamodelExecution.Pathway;
import MetamodelExecution.Responsible;
import MetamodelExecution.ShortExecution;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Short Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ShortExecutionImpl#getConclusionDate <em>Conclusion Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ShortExecutionImpl#isCompletedDate <em>Completed Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ShortExecutionImpl#isAborted <em>Aborted</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ShortExecutionImpl#getLastExecutedStepDate <em>Last Executed Step Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ShortExecutionImpl#getPathway <em>Pathway</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ShortExecutionImpl#getIdResponsible <em>Id Responsible</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ShortExecutionImpl#getIdLastProfessional <em>Id Last Professional</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ShortExecutionImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ShortExecutionImpl#getExecutedstep <em>Executedstep</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ShortExecutionImpl#getLastprofessional <em>Lastprofessional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShortExecutionImpl extends ExecutionImpl implements ShortExecution {
	/**
	 * The default value of the '{@link #getConclusionDate() <em>Conclusion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CONCLUSION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConclusionDate() <em>Conclusion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusionDate()
	 * @generated
	 * @ordered
	 */
	protected Date conclusionDate = CONCLUSION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCompletedDate() <em>Completed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompletedDate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPLETED_DATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCompletedDate() <em>Completed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompletedDate()
	 * @generated
	 * @ordered
	 */
	protected boolean completedDate = COMPLETED_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getPathway() <em>Pathway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathway()
	 * @generated
	 * @ordered
	 */
	protected Pathway pathway;

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
	 * The cached value of the '{@link #getExecutedstep() <em>Executedstep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedstep()
	 * @generated
	 * @ordered
	 */
	protected ExecutedStep executedstep;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.SHORT_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getConclusionDate() {
		return conclusionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConclusionDate(Date newConclusionDate) {
		Date oldConclusionDate = conclusionDate;
		conclusionDate = newConclusionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.SHORT_EXECUTION__CONCLUSION_DATE, oldConclusionDate, conclusionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompletedDate() {
		return completedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletedDate(boolean newCompletedDate) {
		boolean oldCompletedDate = completedDate;
		completedDate = newCompletedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.SHORT_EXECUTION__COMPLETED_DATE, oldCompletedDate, completedDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.SHORT_EXECUTION__ABORTED,
					oldAborted, aborted));
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
					Execution_metamodelPackage.SHORT_EXECUTION__LAST_EXECUTED_STEP_DATE, oldLastExecutedStepDate,
					lastExecutedStepDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pathway getPathway() {
		return pathway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathway(Pathway newPathway, NotificationChain msgs) {
		Pathway oldPathway = pathway;
		pathway = newPathway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.SHORT_EXECUTION__PATHWAY, oldPathway, newPathway);
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
	public void setPathway(Pathway newPathway) {
		if (newPathway != pathway) {
			NotificationChain msgs = null;
			if (pathway != null)
				msgs = ((InternalEObject) pathway).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.SHORT_EXECUTION__PATHWAY, null, msgs);
			if (newPathway != null)
				msgs = ((InternalEObject) newPathway).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.SHORT_EXECUTION__PATHWAY, null, msgs);
			msgs = basicSetPathway(newPathway, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.SHORT_EXECUTION__PATHWAY,
					newPathway, newPathway));
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
					Execution_metamodelPackage.SHORT_EXECUTION__ID_RESPONSIBLE, oldIdResponsible, idResponsible));
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
					Execution_metamodelPackage.SHORT_EXECUTION__ID_LAST_PROFESSIONAL, oldIdLastProfessional,
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
					Execution_metamodelPackage.SHORT_EXECUTION__RESPONSIBLE, oldResponsible, newResponsible);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.SHORT_EXECUTION__RESPONSIBLE, null, msgs);
			if (newResponsible != null)
				msgs = ((InternalEObject) newResponsible).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.SHORT_EXECUTION__RESPONSIBLE, null, msgs);
			msgs = basicSetResponsible(newResponsible, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.SHORT_EXECUTION__RESPONSIBLE, newResponsible, newResponsible));
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
					Execution_metamodelPackage.SHORT_EXECUTION__EXECUTEDSTEP, oldExecutedstep, newExecutedstep);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.SHORT_EXECUTION__EXECUTEDSTEP, null, msgs);
			if (newExecutedstep != null)
				msgs = ((InternalEObject) newExecutedstep).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.SHORT_EXECUTION__EXECUTEDSTEP, null, msgs);
			msgs = basicSetExecutedstep(newExecutedstep, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.SHORT_EXECUTION__EXECUTEDSTEP, newExecutedstep, newExecutedstep));
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
					Execution_metamodelPackage.SHORT_EXECUTION__LASTPROFESSIONAL, oldLastprofessional,
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.SHORT_EXECUTION__LASTPROFESSIONAL, null,
						msgs);
			if (newLastprofessional != null)
				msgs = ((InternalEObject) newLastprofessional).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.SHORT_EXECUTION__LASTPROFESSIONAL, null,
						msgs);
			msgs = basicSetLastprofessional(newLastprofessional, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.SHORT_EXECUTION__LASTPROFESSIONAL, newLastprofessional,
					newLastprofessional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.SHORT_EXECUTION__PATHWAY:
			return basicSetPathway(null, msgs);
		case Execution_metamodelPackage.SHORT_EXECUTION__RESPONSIBLE:
			return basicSetResponsible(null, msgs);
		case Execution_metamodelPackage.SHORT_EXECUTION__EXECUTEDSTEP:
			return basicSetExecutedstep(null, msgs);
		case Execution_metamodelPackage.SHORT_EXECUTION__LASTPROFESSIONAL:
			return basicSetLastprofessional(null, msgs);
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
		case Execution_metamodelPackage.SHORT_EXECUTION__CONCLUSION_DATE:
			return getConclusionDate();
		case Execution_metamodelPackage.SHORT_EXECUTION__COMPLETED_DATE:
			return isCompletedDate();
		case Execution_metamodelPackage.SHORT_EXECUTION__ABORTED:
			return isAborted();
		case Execution_metamodelPackage.SHORT_EXECUTION__LAST_EXECUTED_STEP_DATE:
			return getLastExecutedStepDate();
		case Execution_metamodelPackage.SHORT_EXECUTION__PATHWAY:
			return getPathway();
		case Execution_metamodelPackage.SHORT_EXECUTION__ID_RESPONSIBLE:
			return getIdResponsible();
		case Execution_metamodelPackage.SHORT_EXECUTION__ID_LAST_PROFESSIONAL:
			return getIdLastProfessional();
		case Execution_metamodelPackage.SHORT_EXECUTION__RESPONSIBLE:
			return getResponsible();
		case Execution_metamodelPackage.SHORT_EXECUTION__EXECUTEDSTEP:
			return getExecutedstep();
		case Execution_metamodelPackage.SHORT_EXECUTION__LASTPROFESSIONAL:
			return getLastprofessional();
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
		case Execution_metamodelPackage.SHORT_EXECUTION__CONCLUSION_DATE:
			setConclusionDate((Date) newValue);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__COMPLETED_DATE:
			setCompletedDate((Boolean) newValue);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__ABORTED:
			setAborted((Boolean) newValue);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__LAST_EXECUTED_STEP_DATE:
			setLastExecutedStepDate((Date) newValue);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__PATHWAY:
			setPathway((Pathway) newValue);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__ID_RESPONSIBLE:
			setIdResponsible((Integer) newValue);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__ID_LAST_PROFESSIONAL:
			setIdLastProfessional((Integer) newValue);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__RESPONSIBLE:
			setResponsible((Responsible) newValue);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__EXECUTEDSTEP:
			setExecutedstep((ExecutedStep) newValue);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__LASTPROFESSIONAL:
			setLastprofessional((LastProfessional) newValue);
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
		case Execution_metamodelPackage.SHORT_EXECUTION__CONCLUSION_DATE:
			setConclusionDate(CONCLUSION_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__COMPLETED_DATE:
			setCompletedDate(COMPLETED_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__ABORTED:
			setAborted(ABORTED_EDEFAULT);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__LAST_EXECUTED_STEP_DATE:
			setLastExecutedStepDate(LAST_EXECUTED_STEP_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__PATHWAY:
			setPathway((Pathway) null);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__ID_RESPONSIBLE:
			setIdResponsible(ID_RESPONSIBLE_EDEFAULT);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__ID_LAST_PROFESSIONAL:
			setIdLastProfessional(ID_LAST_PROFESSIONAL_EDEFAULT);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__RESPONSIBLE:
			setResponsible((Responsible) null);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__EXECUTEDSTEP:
			setExecutedstep((ExecutedStep) null);
			return;
		case Execution_metamodelPackage.SHORT_EXECUTION__LASTPROFESSIONAL:
			setLastprofessional((LastProfessional) null);
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
		case Execution_metamodelPackage.SHORT_EXECUTION__CONCLUSION_DATE:
			return CONCLUSION_DATE_EDEFAULT == null ? conclusionDate != null
					: !CONCLUSION_DATE_EDEFAULT.equals(conclusionDate);
		case Execution_metamodelPackage.SHORT_EXECUTION__COMPLETED_DATE:
			return completedDate != COMPLETED_DATE_EDEFAULT;
		case Execution_metamodelPackage.SHORT_EXECUTION__ABORTED:
			return aborted != ABORTED_EDEFAULT;
		case Execution_metamodelPackage.SHORT_EXECUTION__LAST_EXECUTED_STEP_DATE:
			return LAST_EXECUTED_STEP_DATE_EDEFAULT == null ? lastExecutedStepDate != null
					: !LAST_EXECUTED_STEP_DATE_EDEFAULT.equals(lastExecutedStepDate);
		case Execution_metamodelPackage.SHORT_EXECUTION__PATHWAY:
			return pathway != null;
		case Execution_metamodelPackage.SHORT_EXECUTION__ID_RESPONSIBLE:
			return idResponsible != ID_RESPONSIBLE_EDEFAULT;
		case Execution_metamodelPackage.SHORT_EXECUTION__ID_LAST_PROFESSIONAL:
			return idLastProfessional != ID_LAST_PROFESSIONAL_EDEFAULT;
		case Execution_metamodelPackage.SHORT_EXECUTION__RESPONSIBLE:
			return responsible != null;
		case Execution_metamodelPackage.SHORT_EXECUTION__EXECUTEDSTEP:
			return executedstep != null;
		case Execution_metamodelPackage.SHORT_EXECUTION__LASTPROFESSIONAL:
			return lastprofessional != null;
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
		result.append(" (conclusionDate: ");
		result.append(conclusionDate);
		result.append(", completedDate: ");
		result.append(completedDate);
		result.append(", aborted: ");
		result.append(aborted);
		result.append(", lastExecutedStepDate: ");
		result.append(lastExecutedStepDate);
		result.append(", idResponsible: ");
		result.append(idResponsible);
		result.append(", idLastProfessional: ");
		result.append(idLastProfessional);
		result.append(')');
		return result.toString();
	}

} //ShortExecutionImpl
