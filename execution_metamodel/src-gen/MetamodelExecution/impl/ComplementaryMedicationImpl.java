/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.ComplementaryMedication;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.MedicationPrescribedResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complementary Medication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ComplementaryMedicationImpl#getPrescribedresource <em>Prescribedresource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplementaryMedicationImpl extends ComplementaryConductsImpl implements ComplementaryMedication {
	/**
	 * The cached value of the '{@link #getPrescribedresource() <em>Prescribedresource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescribedresource()
	 * @generated
	 * @ordered
	 */
	protected MedicationPrescribedResource prescribedresource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplementaryMedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.COMPLEMENTARY_MEDICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPrescribedResource getPrescribedresource() {
		return prescribedresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescribedresource(MedicationPrescribedResource newPrescribedresource,
			NotificationChain msgs) {
		MedicationPrescribedResource oldPrescribedresource = prescribedresource;
		prescribedresource = newPrescribedresource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENTARY_MEDICATION__PRESCRIBEDRESOURCE, oldPrescribedresource,
					newPrescribedresource);
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
	public void setPrescribedresource(MedicationPrescribedResource newPrescribedresource) {
		if (newPrescribedresource != prescribedresource) {
			NotificationChain msgs = null;
			if (prescribedresource != null)
				msgs = ((InternalEObject) prescribedresource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- Execution_metamodelPackage.COMPLEMENTARY_MEDICATION__PRESCRIBEDRESOURCE, null, msgs);
			if (newPrescribedresource != null)
				msgs = ((InternalEObject) newPrescribedresource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- Execution_metamodelPackage.COMPLEMENTARY_MEDICATION__PRESCRIBEDRESOURCE, null, msgs);
			msgs = basicSetPrescribedresource(newPrescribedresource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENTARY_MEDICATION__PRESCRIBEDRESOURCE, newPrescribedresource,
					newPrescribedresource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.COMPLEMENTARY_MEDICATION__PRESCRIBEDRESOURCE:
			return basicSetPrescribedresource(null, msgs);
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
		case Execution_metamodelPackage.COMPLEMENTARY_MEDICATION__PRESCRIBEDRESOURCE:
			return getPrescribedresource();
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
		case Execution_metamodelPackage.COMPLEMENTARY_MEDICATION__PRESCRIBEDRESOURCE:
			setPrescribedresource((MedicationPrescribedResource) newValue);
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
		case Execution_metamodelPackage.COMPLEMENTARY_MEDICATION__PRESCRIBEDRESOURCE:
			setPrescribedresource((MedicationPrescribedResource) null);
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
		case Execution_metamodelPackage.COMPLEMENTARY_MEDICATION__PRESCRIBEDRESOURCE:
			return prescribedresource != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplementaryMedicationImpl
