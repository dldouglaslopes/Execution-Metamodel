/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.EPathway;
import MetamodelExecution.EReferral;
import MetamodelExecution.Execution_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EReferral</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.EReferralImpl#getEpathway <em>Epathway</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EReferralImpl extends EStepImpl implements EReferral {
	/**
	 * The cached value of the '{@link #getEpathway() <em>Epathway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpathway()
	 * @generated
	 * @ordered
	 */
	protected EPathway epathway;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EReferralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.EREFERRAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPathway getEpathway() {
		return epathway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEpathway(EPathway newEpathway, NotificationChain msgs) {
		EPathway oldEpathway = epathway;
		epathway = newEpathway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EREFERRAL__EPATHWAY, oldEpathway, newEpathway);
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
	public void setEpathway(EPathway newEpathway) {
		if (newEpathway != epathway) {
			NotificationChain msgs = null;
			if (epathway != null)
				msgs = ((InternalEObject) epathway).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EREFERRAL__EPATHWAY, null, msgs);
			if (newEpathway != null)
				msgs = ((InternalEObject) newEpathway).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EREFERRAL__EPATHWAY, null, msgs);
			msgs = basicSetEpathway(newEpathway, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EREFERRAL__EPATHWAY,
					newEpathway, newEpathway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.EREFERRAL__EPATHWAY:
			return basicSetEpathway(null, msgs);
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
		case Execution_metamodelPackage.EREFERRAL__EPATHWAY:
			return getEpathway();
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
		case Execution_metamodelPackage.EREFERRAL__EPATHWAY:
			setEpathway((EPathway) newValue);
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
		case Execution_metamodelPackage.EREFERRAL__EPATHWAY:
			setEpathway((EPathway) null);
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
		case Execution_metamodelPackage.EREFERRAL__EPATHWAY:
			return epathway != null;
		}
		return super.eIsSet(featureID);
	}

} //EReferralImpl
