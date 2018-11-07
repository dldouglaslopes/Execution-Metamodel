/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.ComplementaryExamination;
import MetamodelExecution.ExaminationPrescribedResource;
import MetamodelExecution.Execution_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complementary Examination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ComplementaryExaminationImpl#getExaminationprescribedresource <em>Examinationprescribedresource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplementaryExaminationImpl extends ComplementaryConductsImpl implements ComplementaryExamination {
	/**
	 * The cached value of the '{@link #getExaminationprescribedresource() <em>Examinationprescribedresource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExaminationprescribedresource()
	 * @generated
	 * @ordered
	 */
	protected ExaminationPrescribedResource examinationprescribedresource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplementaryExaminationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.COMPLEMENTARY_EXAMINATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExaminationPrescribedResource getExaminationprescribedresource() {
		return examinationprescribedresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExaminationprescribedresource(
			ExaminationPrescribedResource newExaminationprescribedresource, NotificationChain msgs) {
		ExaminationPrescribedResource oldExaminationprescribedresource = examinationprescribedresource;
		examinationprescribedresource = newExaminationprescribedresource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENTARY_EXAMINATION__EXAMINATIONPRESCRIBEDRESOURCE,
					oldExaminationprescribedresource, newExaminationprescribedresource);
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
	public void setExaminationprescribedresource(ExaminationPrescribedResource newExaminationprescribedresource) {
		if (newExaminationprescribedresource != examinationprescribedresource) {
			NotificationChain msgs = null;
			if (examinationprescribedresource != null)
				msgs = ((InternalEObject) examinationprescribedresource).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Execution_metamodelPackage.COMPLEMENTARY_EXAMINATION__EXAMINATIONPRESCRIBEDRESOURCE,
						null, msgs);
			if (newExaminationprescribedresource != null)
				msgs = ((InternalEObject) newExaminationprescribedresource).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Execution_metamodelPackage.COMPLEMENTARY_EXAMINATION__EXAMINATIONPRESCRIBEDRESOURCE,
						null, msgs);
			msgs = basicSetExaminationprescribedresource(newExaminationprescribedresource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENTARY_EXAMINATION__EXAMINATIONPRESCRIBEDRESOURCE,
					newExaminationprescribedresource, newExaminationprescribedresource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.COMPLEMENTARY_EXAMINATION__EXAMINATIONPRESCRIBEDRESOURCE:
			return basicSetExaminationprescribedresource(null, msgs);
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
		case Execution_metamodelPackage.COMPLEMENTARY_EXAMINATION__EXAMINATIONPRESCRIBEDRESOURCE:
			return getExaminationprescribedresource();
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
		case Execution_metamodelPackage.COMPLEMENTARY_EXAMINATION__EXAMINATIONPRESCRIBEDRESOURCE:
			setExaminationprescribedresource((ExaminationPrescribedResource) newValue);
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
		case Execution_metamodelPackage.COMPLEMENTARY_EXAMINATION__EXAMINATIONPRESCRIBEDRESOURCE:
			setExaminationprescribedresource((ExaminationPrescribedResource) null);
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
		case Execution_metamodelPackage.COMPLEMENTARY_EXAMINATION__EXAMINATIONPRESCRIBEDRESOURCE:
			return examinationprescribedresource != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplementaryExaminationImpl
