/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Comorbidity;
import MetamodelExecution.ComorbidityRegistry;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Patient;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comorbidity Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ComorbidityRegistryImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComorbidityRegistryImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComorbidityRegistryImpl#getComorbidity <em>Comorbidity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComorbidityRegistryImpl extends MinimalEObjectImpl.Container implements ComorbidityRegistry {
	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

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
	 * The cached value of the '{@link #getComorbidity() <em>Comorbidity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComorbidity()
	 * @generated
	 * @ordered
	 */
	protected Comorbidity comorbidity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComorbidityRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.COMORBIDITY_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Patient newPatient, NotificationChain msgs) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMORBIDITY_REGISTRY__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Patient newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject) patient).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.COMORBIDITY_REGISTRY__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject) newPatient).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.COMORBIDITY_REGISTRY__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMORBIDITY_REGISTRY__PATIENT, newPatient, newPatient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.COMORBIDITY_REGISTRY__ID,
					oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comorbidity getComorbidity() {
		return comorbidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComorbidity(Comorbidity newComorbidity, NotificationChain msgs) {
		Comorbidity oldComorbidity = comorbidity;
		comorbidity = newComorbidity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMORBIDITY_REGISTRY__COMORBIDITY, oldComorbidity, newComorbidity);
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
	public void setComorbidity(Comorbidity newComorbidity) {
		if (newComorbidity != comorbidity) {
			NotificationChain msgs = null;
			if (comorbidity != null)
				msgs = ((InternalEObject) comorbidity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.COMORBIDITY_REGISTRY__COMORBIDITY, null,
						msgs);
			if (newComorbidity != null)
				msgs = ((InternalEObject) newComorbidity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.COMORBIDITY_REGISTRY__COMORBIDITY, null,
						msgs);
			msgs = basicSetComorbidity(newComorbidity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMORBIDITY_REGISTRY__COMORBIDITY, newComorbidity, newComorbidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY__PATIENT:
			return basicSetPatient(null, msgs);
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY__COMORBIDITY:
			return basicSetComorbidity(null, msgs);
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
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY__PATIENT:
			return getPatient();
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY__ID:
			return getId();
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY__COMORBIDITY:
			return getComorbidity();
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
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY__PATIENT:
			setPatient((Patient) newValue);
			return;
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY__COMORBIDITY:
			setComorbidity((Comorbidity) newValue);
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
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY__PATIENT:
			setPatient((Patient) null);
			return;
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY__COMORBIDITY:
			setComorbidity((Comorbidity) null);
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
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY__PATIENT:
			return patient != null;
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.COMORBIDITY_REGISTRY__COMORBIDITY:
			return comorbidity != null;
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
		result.append(')');
		return result.toString();
	}

} //ComorbidityRegistryImpl
