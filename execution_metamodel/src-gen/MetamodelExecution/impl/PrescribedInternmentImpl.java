/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Internment;
import MetamodelExecution.PrescribedInternment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prescribed Internment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.PrescribedInternmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescribedInternmentImpl#getInternment <em>Internment</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescribedInternmentImpl#getNumberGuide <em>Number Guide</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrescribedInternmentImpl extends MinimalEObjectImpl.Container implements PrescribedInternment {
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
	 * The cached value of the '{@link #getInternment() <em>Internment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternment()
	 * @generated
	 * @ordered
	 */
	protected Internment internment;

	/**
	 * The default value of the '{@link #getNumberGuide() <em>Number Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberGuide()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_GUIDE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberGuide() <em>Number Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberGuide()
	 * @generated
	 * @ordered
	 */
	protected int numberGuide = NUMBER_GUIDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrescribedInternmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.PRESCRIBED_INTERNMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PRESCRIBED_INTERNMENT__ID,
					oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Internment getInternment() {
		return internment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternment(Internment newInternment, NotificationChain msgs) {
		Internment oldInternment = internment;
		internment = newInternment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIBED_INTERNMENT__INTERNMENT, oldInternment, newInternment);
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
	public void setInternment(Internment newInternment) {
		if (newInternment != internment) {
			NotificationChain msgs = null;
			if (internment != null)
				msgs = ((InternalEObject) internment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PRESCRIBED_INTERNMENT__INTERNMENT, null,
						msgs);
			if (newInternment != null)
				msgs = ((InternalEObject) newInternment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.PRESCRIBED_INTERNMENT__INTERNMENT, null,
						msgs);
			msgs = basicSetInternment(newInternment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIBED_INTERNMENT__INTERNMENT, newInternment, newInternment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberGuide() {
		return numberGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberGuide(int newNumberGuide) {
		int oldNumberGuide = numberGuide;
		numberGuide = newNumberGuide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIBED_INTERNMENT__NUMBER_GUIDE, oldNumberGuide, numberGuide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT__INTERNMENT:
			return basicSetInternment(null, msgs);
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
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT__ID:
			return getId();
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT__INTERNMENT:
			return getInternment();
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT__NUMBER_GUIDE:
			return getNumberGuide();
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
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT__INTERNMENT:
			setInternment((Internment) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT__NUMBER_GUIDE:
			setNumberGuide((Integer) newValue);
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
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT__INTERNMENT:
			setInternment((Internment) null);
			return;
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT__NUMBER_GUIDE:
			setNumberGuide(NUMBER_GUIDE_EDEFAULT);
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
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT__INTERNMENT:
			return internment != null;
		case Execution_metamodelPackage.PRESCRIBED_INTERNMENT__NUMBER_GUIDE:
			return numberGuide != NUMBER_GUIDE_EDEFAULT;
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
		result.append(", numberGuide: ");
		result.append(numberGuide);
		result.append(')');
		return result.toString();
	}

} //PrescribedInternmentImpl
