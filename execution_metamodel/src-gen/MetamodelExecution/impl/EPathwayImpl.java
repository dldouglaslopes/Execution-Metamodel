/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.ComplementaryConducts;
import MetamodelExecution.EPathway;
import MetamodelExecution.EStep;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Justification;
import MetamodelExecution.LastProfessional;
import MetamodelExecution.MedicalCare;
import MetamodelExecution.Pathway;
import MetamodelExecution.Responsible;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPathway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#getEStep <em>EStep</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#getConclusionDate <em>Conclusion Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#isCompleted <em>Completed</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#isAborted <em>Aborted</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#getIdsExecutedStep <em>Ids Executed Step</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#getLastprofessional <em>Lastprofessional</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#getPathway <em>Pathway</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#getComplementaryconducts <em>Complementaryconducts</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#getMedicalcare <em>Medicalcare</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#getCid <em>Cid</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPathwayImpl#getTimeExecution <em>Time Execution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPathwayImpl extends MinimalEObjectImpl.Container implements EPathway {
	/**
	 * The cached value of the '{@link #getEStep() <em>EStep</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEStep()
	 * @generated
	 * @ordered
	 */
	protected EList<EStep> eStep;

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
	 * The cached value of the '{@link #getIdsExecutedStep() <em>Ids Executed Step</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdsExecutedStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> idsExecutedStep;

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
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected Justification justification;

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
	 * The cached value of the '{@link #getComplementaryconducts() <em>Complementaryconducts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementaryconducts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplementaryConducts> complementaryconducts;

	/**
	 * The cached value of the '{@link #getMedicalcare() <em>Medicalcare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalcare()
	 * @generated
	 * @ordered
	 */
	protected MedicalCare medicalcare;

	/**
	 * The default value of the '{@link #getCid() <em>Cid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCid()
	 * @generated
	 * @ordered
	 */
	protected static final String CID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCid() <em>Cid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCid()
	 * @generated
	 * @ordered
	 */
	protected String cid = CID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeExecution() <em>Time Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeExecution()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_EXECUTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeExecution() <em>Time Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeExecution()
	 * @generated
	 * @ordered
	 */
	protected double timeExecution = TIME_EXECUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPathwayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.EPATHWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStep> getEStep() {
		if (eStep == null) {
			eStep = new EObjectContainmentEList<EStep>(EStep.class, this, Execution_metamodelPackage.EPATHWAY__ESTEP);
		}
		return eStep;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EPATHWAY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EPATHWAY__CREATION_DATE,
					oldCreationDate, creationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EPATHWAY__CONCLUSION_DATE,
					oldConclusionDate, conclusionDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EPATHWAY__COMPLETED,
					oldCompleted, completed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EPATHWAY__ABORTED,
					oldAborted, aborted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIdsExecutedStep() {
		if (idsExecutedStep == null) {
			idsExecutedStep = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					Execution_metamodelPackage.EPATHWAY__IDS_EXECUTED_STEP);
		}
		return idsExecutedStep;
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
					Execution_metamodelPackage.EPATHWAY__RESPONSIBLE, oldResponsible, newResponsible);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EPATHWAY__RESPONSIBLE, null, msgs);
			if (newResponsible != null)
				msgs = ((InternalEObject) newResponsible).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EPATHWAY__RESPONSIBLE, null, msgs);
			msgs = basicSetResponsible(newResponsible, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EPATHWAY__RESPONSIBLE,
					newResponsible, newResponsible));
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
					Execution_metamodelPackage.EPATHWAY__LASTPROFESSIONAL, oldLastprofessional, newLastprofessional);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EPATHWAY__LASTPROFESSIONAL, null, msgs);
			if (newLastprofessional != null)
				msgs = ((InternalEObject) newLastprofessional).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EPATHWAY__LASTPROFESSIONAL, null, msgs);
			msgs = basicSetLastprofessional(newLastprofessional, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EPATHWAY__LASTPROFESSIONAL,
					newLastprofessional, newLastprofessional));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EPATHWAY__NAME, oldName,
					name));
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
					Execution_metamodelPackage.EPATHWAY__JUSTIFICATION, oldJustification, newJustification);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EPATHWAY__JUSTIFICATION, null, msgs);
			if (newJustification != null)
				msgs = ((InternalEObject) newJustification).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EPATHWAY__JUSTIFICATION, null, msgs);
			msgs = basicSetJustification(newJustification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EPATHWAY__JUSTIFICATION,
					newJustification, newJustification));
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
					Execution_metamodelPackage.EPATHWAY__PATHWAY, oldPathway, newPathway);
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
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EPATHWAY__PATHWAY, null, msgs);
			if (newPathway != null)
				msgs = ((InternalEObject) newPathway).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EPATHWAY__PATHWAY, null, msgs);
			msgs = basicSetPathway(newPathway, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EPATHWAY__PATHWAY,
					newPathway, newPathway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplementaryConducts> getComplementaryconducts() {
		if (complementaryconducts == null) {
			complementaryconducts = new EObjectContainmentEList<ComplementaryConducts>(ComplementaryConducts.class,
					this, Execution_metamodelPackage.EPATHWAY__COMPLEMENTARYCONDUCTS);
		}
		return complementaryconducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalCare getMedicalcare() {
		return medicalcare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicalcare(MedicalCare newMedicalcare, NotificationChain msgs) {
		MedicalCare oldMedicalcare = medicalcare;
		medicalcare = newMedicalcare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EPATHWAY__MEDICALCARE, oldMedicalcare, newMedicalcare);
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
	public void setMedicalcare(MedicalCare newMedicalcare) {
		if (newMedicalcare != medicalcare) {
			NotificationChain msgs = null;
			if (medicalcare != null)
				msgs = ((InternalEObject) medicalcare).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EPATHWAY__MEDICALCARE, null, msgs);
			if (newMedicalcare != null)
				msgs = ((InternalEObject) newMedicalcare).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EPATHWAY__MEDICALCARE, null, msgs);
			msgs = basicSetMedicalcare(newMedicalcare, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EPATHWAY__MEDICALCARE,
					newMedicalcare, newMedicalcare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCid() {
		return cid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCid(String newCid) {
		String oldCid = cid;
		cid = newCid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EPATHWAY__CID, oldCid,
					cid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeExecution() {
		return timeExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeExecution(double newTimeExecution) {
		double oldTimeExecution = timeExecution;
		timeExecution = newTimeExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EPATHWAY__TIME_EXECUTION,
					oldTimeExecution, timeExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.EPATHWAY__ESTEP:
			return ((InternalEList<?>) getEStep()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.EPATHWAY__RESPONSIBLE:
			return basicSetResponsible(null, msgs);
		case Execution_metamodelPackage.EPATHWAY__LASTPROFESSIONAL:
			return basicSetLastprofessional(null, msgs);
		case Execution_metamodelPackage.EPATHWAY__JUSTIFICATION:
			return basicSetJustification(null, msgs);
		case Execution_metamodelPackage.EPATHWAY__PATHWAY:
			return basicSetPathway(null, msgs);
		case Execution_metamodelPackage.EPATHWAY__COMPLEMENTARYCONDUCTS:
			return ((InternalEList<?>) getComplementaryconducts()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.EPATHWAY__MEDICALCARE:
			return basicSetMedicalcare(null, msgs);
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
		case Execution_metamodelPackage.EPATHWAY__ESTEP:
			return getEStep();
		case Execution_metamodelPackage.EPATHWAY__ID:
			return getId();
		case Execution_metamodelPackage.EPATHWAY__CREATION_DATE:
			return getCreationDate();
		case Execution_metamodelPackage.EPATHWAY__CONCLUSION_DATE:
			return getConclusionDate();
		case Execution_metamodelPackage.EPATHWAY__COMPLETED:
			return isCompleted();
		case Execution_metamodelPackage.EPATHWAY__ABORTED:
			return isAborted();
		case Execution_metamodelPackage.EPATHWAY__IDS_EXECUTED_STEP:
			return getIdsExecutedStep();
		case Execution_metamodelPackage.EPATHWAY__RESPONSIBLE:
			return getResponsible();
		case Execution_metamodelPackage.EPATHWAY__LASTPROFESSIONAL:
			return getLastprofessional();
		case Execution_metamodelPackage.EPATHWAY__NAME:
			return getName();
		case Execution_metamodelPackage.EPATHWAY__JUSTIFICATION:
			return getJustification();
		case Execution_metamodelPackage.EPATHWAY__PATHWAY:
			return getPathway();
		case Execution_metamodelPackage.EPATHWAY__COMPLEMENTARYCONDUCTS:
			return getComplementaryconducts();
		case Execution_metamodelPackage.EPATHWAY__MEDICALCARE:
			return getMedicalcare();
		case Execution_metamodelPackage.EPATHWAY__CID:
			return getCid();
		case Execution_metamodelPackage.EPATHWAY__TIME_EXECUTION:
			return getTimeExecution();
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
		case Execution_metamodelPackage.EPATHWAY__ESTEP:
			getEStep().clear();
			getEStep().addAll((Collection<? extends EStep>) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__CREATION_DATE:
			setCreationDate((Date) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__CONCLUSION_DATE:
			setConclusionDate((Date) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__COMPLETED:
			setCompleted((Boolean) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__ABORTED:
			setAborted((Boolean) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__IDS_EXECUTED_STEP:
			getIdsExecutedStep().clear();
			getIdsExecutedStep().addAll((Collection<? extends Integer>) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__RESPONSIBLE:
			setResponsible((Responsible) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__LASTPROFESSIONAL:
			setLastprofessional((LastProfessional) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__NAME:
			setName((String) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__JUSTIFICATION:
			setJustification((Justification) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__PATHWAY:
			setPathway((Pathway) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__COMPLEMENTARYCONDUCTS:
			getComplementaryconducts().clear();
			getComplementaryconducts().addAll((Collection<? extends ComplementaryConducts>) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__MEDICALCARE:
			setMedicalcare((MedicalCare) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__CID:
			setCid((String) newValue);
			return;
		case Execution_metamodelPackage.EPATHWAY__TIME_EXECUTION:
			setTimeExecution((Double) newValue);
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
		case Execution_metamodelPackage.EPATHWAY__ESTEP:
			getEStep().clear();
			return;
		case Execution_metamodelPackage.EPATHWAY__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.EPATHWAY__CREATION_DATE:
			setCreationDate(CREATION_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EPATHWAY__CONCLUSION_DATE:
			setConclusionDate(CONCLUSION_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.EPATHWAY__COMPLETED:
			setCompleted(COMPLETED_EDEFAULT);
			return;
		case Execution_metamodelPackage.EPATHWAY__ABORTED:
			setAborted(ABORTED_EDEFAULT);
			return;
		case Execution_metamodelPackage.EPATHWAY__IDS_EXECUTED_STEP:
			getIdsExecutedStep().clear();
			return;
		case Execution_metamodelPackage.EPATHWAY__RESPONSIBLE:
			setResponsible((Responsible) null);
			return;
		case Execution_metamodelPackage.EPATHWAY__LASTPROFESSIONAL:
			setLastprofessional((LastProfessional) null);
			return;
		case Execution_metamodelPackage.EPATHWAY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Execution_metamodelPackage.EPATHWAY__JUSTIFICATION:
			setJustification((Justification) null);
			return;
		case Execution_metamodelPackage.EPATHWAY__PATHWAY:
			setPathway((Pathway) null);
			return;
		case Execution_metamodelPackage.EPATHWAY__COMPLEMENTARYCONDUCTS:
			getComplementaryconducts().clear();
			return;
		case Execution_metamodelPackage.EPATHWAY__MEDICALCARE:
			setMedicalcare((MedicalCare) null);
			return;
		case Execution_metamodelPackage.EPATHWAY__CID:
			setCid(CID_EDEFAULT);
			return;
		case Execution_metamodelPackage.EPATHWAY__TIME_EXECUTION:
			setTimeExecution(TIME_EXECUTION_EDEFAULT);
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
		case Execution_metamodelPackage.EPATHWAY__ESTEP:
			return eStep != null && !eStep.isEmpty();
		case Execution_metamodelPackage.EPATHWAY__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.EPATHWAY__CREATION_DATE:
			return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
		case Execution_metamodelPackage.EPATHWAY__CONCLUSION_DATE:
			return CONCLUSION_DATE_EDEFAULT == null ? conclusionDate != null
					: !CONCLUSION_DATE_EDEFAULT.equals(conclusionDate);
		case Execution_metamodelPackage.EPATHWAY__COMPLETED:
			return completed != COMPLETED_EDEFAULT;
		case Execution_metamodelPackage.EPATHWAY__ABORTED:
			return aborted != ABORTED_EDEFAULT;
		case Execution_metamodelPackage.EPATHWAY__IDS_EXECUTED_STEP:
			return idsExecutedStep != null && !idsExecutedStep.isEmpty();
		case Execution_metamodelPackage.EPATHWAY__RESPONSIBLE:
			return responsible != null;
		case Execution_metamodelPackage.EPATHWAY__LASTPROFESSIONAL:
			return lastprofessional != null;
		case Execution_metamodelPackage.EPATHWAY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Execution_metamodelPackage.EPATHWAY__JUSTIFICATION:
			return justification != null;
		case Execution_metamodelPackage.EPATHWAY__PATHWAY:
			return pathway != null;
		case Execution_metamodelPackage.EPATHWAY__COMPLEMENTARYCONDUCTS:
			return complementaryconducts != null && !complementaryconducts.isEmpty();
		case Execution_metamodelPackage.EPATHWAY__MEDICALCARE:
			return medicalcare != null;
		case Execution_metamodelPackage.EPATHWAY__CID:
			return CID_EDEFAULT == null ? cid != null : !CID_EDEFAULT.equals(cid);
		case Execution_metamodelPackage.EPATHWAY__TIME_EXECUTION:
			return timeExecution != TIME_EXECUTION_EDEFAULT;
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
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", conclusionDate: ");
		result.append(conclusionDate);
		result.append(", completed: ");
		result.append(completed);
		result.append(", aborted: ");
		result.append(aborted);
		result.append(", idsExecutedStep: ");
		result.append(idsExecutedStep);
		result.append(", name: ");
		result.append(name);
		result.append(", cid: ");
		result.append(cid);
		result.append(", timeExecution: ");
		result.append(timeExecution);
		result.append(')');
		return result.toString();
	}

} //EPathwayImpl
