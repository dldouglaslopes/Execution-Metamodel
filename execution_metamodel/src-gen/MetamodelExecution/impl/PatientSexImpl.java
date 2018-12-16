/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.PatientSex;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Sex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.PatientSexImpl#isTruePremise <em>True Premise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientSexImpl extends BondImpl implements PatientSex {
	/**
	 * The default value of the '{@link #isTruePremise() <em>True Premise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTruePremise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRUE_PREMISE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTruePremise() <em>True Premise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTruePremise()
	 * @generated
	 * @ordered
	 */
	protected boolean truePremise = TRUE_PREMISE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientSexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.PATIENT_SEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTruePremise() {
		return truePremise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTruePremise(boolean newTruePremise) {
		boolean oldTruePremise = truePremise;
		truePremise = newTruePremise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PATIENT_SEX__TRUE_PREMISE,
					oldTruePremise, truePremise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.PATIENT_SEX__TRUE_PREMISE:
			return isTruePremise();
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
		case Execution_metamodelPackage.PATIENT_SEX__TRUE_PREMISE:
			setTruePremise((Boolean) newValue);
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
		case Execution_metamodelPackage.PATIENT_SEX__TRUE_PREMISE:
			setTruePremise(TRUE_PREMISE_EDEFAULT);
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
		case Execution_metamodelPackage.PATIENT_SEX__TRUE_PREMISE:
			return truePremise != TRUE_PREMISE_EDEFAULT;
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
		result.append(" (truePremise: ");
		result.append(truePremise);
		result.append(')');
		return result.toString();
	}

} //PatientSexImpl
