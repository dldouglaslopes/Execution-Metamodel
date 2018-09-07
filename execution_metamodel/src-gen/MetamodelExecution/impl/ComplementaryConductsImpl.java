/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.ComplementaryConducts;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Suspension;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complementary Conducts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ComplementaryConductsImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComplementaryConductsImpl#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComplementaryConductsImpl#getPathway <em>Pathway</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComplementaryConductsImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComplementaryConductsImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComplementaryConductsImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComplementaryConductsImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComplementaryConductsImpl#getSuspension <em>Suspension</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComplementaryConductsImpl extends MinimalEObjectImpl.Container implements ComplementaryConducts {
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
	 * The default value of the '{@link #getPathway() <em>Pathway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathway()
	 * @generated
	 * @ordered
	 */
	protected static final String PATHWAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathway() <em>Pathway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathway()
	 * @generated
	 * @ordered
	 */
	protected String pathway = PATHWAY_EDEFAULT;

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
	 * The default value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected String justification = JUSTIFICATION_EDEFAULT;

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
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected String resource = RESOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuspension() <em>Suspension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspension()
	 * @generated
	 * @ordered
	 */
	protected Suspension suspension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplementaryConductsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.COMPLEMENTARY_CONDUCTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__ID,
					oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathway() {
		return pathway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathway(String newPathway) {
		String oldPathway = pathway;
		pathway = newPathway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__PATHWAY, oldPathway, pathway));
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
					Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJustification() {
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustification(String newJustification) {
		String oldJustification = justification;
		justification = newJustification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__JUSTIFICATION, oldJustification, justification));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__CREATED_BY, oldCreatedBy, createdBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(String newResource) {
		String oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suspension getSuspension() {
		return suspension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuspension(Suspension newSuspension, NotificationChain msgs) {
		Suspension oldSuspension = suspension;
		suspension = newSuspension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__SUSPENSION, oldSuspension, newSuspension);
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
	public void setSuspension(Suspension newSuspension) {
		if (newSuspension != suspension) {
			NotificationChain msgs = null;
			if (suspension != null)
				msgs = ((InternalEObject) suspension).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__SUSPENSION, null,
						msgs);
			if (newSuspension != null)
				msgs = ((InternalEObject) newSuspension).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__SUSPENSION, null,
						msgs);
			msgs = basicSetSuspension(newSuspension, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__SUSPENSION, newSuspension, newSuspension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__SUSPENSION:
			return basicSetSuspension(null, msgs);
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
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__ID:
			return getId();
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__TYPE:
			return getType();
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__PATHWAY:
			return getPathway();
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__CREATION_DATE:
			return getCreationDate();
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__JUSTIFICATION:
			return getJustification();
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__CREATED_BY:
			return getCreatedBy();
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__RESOURCE:
			return getResource();
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__SUSPENSION:
			return getSuspension();
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
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__TYPE:
			setType((String) newValue);
			return;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__PATHWAY:
			setPathway((String) newValue);
			return;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__CREATION_DATE:
			setCreationDate((Date) newValue);
			return;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__JUSTIFICATION:
			setJustification((String) newValue);
			return;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__CREATED_BY:
			setCreatedBy((String) newValue);
			return;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__RESOURCE:
			setResource((String) newValue);
			return;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__SUSPENSION:
			setSuspension((Suspension) newValue);
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
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__PATHWAY:
			setPathway(PATHWAY_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__CREATION_DATE:
			setCreationDate(CREATION_DATE_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__JUSTIFICATION:
			setJustification(JUSTIFICATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__CREATED_BY:
			setCreatedBy(CREATED_BY_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__RESOURCE:
			setResource(RESOURCE_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__SUSPENSION:
			setSuspension((Suspension) null);
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
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__PATHWAY:
			return PATHWAY_EDEFAULT == null ? pathway != null : !PATHWAY_EDEFAULT.equals(pathway);
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__CREATION_DATE:
			return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__JUSTIFICATION:
			return JUSTIFICATION_EDEFAULT == null ? justification != null
					: !JUSTIFICATION_EDEFAULT.equals(justification);
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__CREATED_BY:
			return CREATED_BY_EDEFAULT == null ? createdBy != null : !CREATED_BY_EDEFAULT.equals(createdBy);
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__RESOURCE:
			return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
		case Execution_metamodelPackage.COMPLEMENTARY_CONDUCTS__SUSPENSION:
			return suspension != null;
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
		result.append(", pathway: ");
		result.append(pathway);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", justification: ");
		result.append(justification);
		result.append(", createdBy: ");
		result.append(createdBy);
		result.append(", resource: ");
		result.append(resource);
		result.append(')');
		return result.toString();
	}

} //ComplementaryConductsImpl
