/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Complement;
import MetamodelExecution.Execution_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ComplementImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComplementImpl#getSideLimb <em>Side Limb</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComplementImpl#getSideLimbDisplay <em>Side Limb Display</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComplementImpl#getClinicalIndication <em>Clinical Indication</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComplementImpl#getJustification <em>Justification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplementImpl extends MinimalEObjectImpl.Container implements Complement {
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
	 * The default value of the '{@link #getSideLimb() <em>Side Limb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideLimb()
	 * @generated
	 * @ordered
	 */
	protected static final String SIDE_LIMB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSideLimb() <em>Side Limb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideLimb()
	 * @generated
	 * @ordered
	 */
	protected String sideLimb = SIDE_LIMB_EDEFAULT;

	/**
	 * The default value of the '{@link #getSideLimbDisplay() <em>Side Limb Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideLimbDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String SIDE_LIMB_DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSideLimbDisplay() <em>Side Limb Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideLimbDisplay()
	 * @generated
	 * @ordered
	 */
	protected String sideLimbDisplay = SIDE_LIMB_DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getClinicalIndication() <em>Clinical Indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalIndication()
	 * @generated
	 * @ordered
	 */
	protected static final int CLINICAL_INDICATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClinicalIndication() <em>Clinical Indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalIndication()
	 * @generated
	 * @ordered
	 */
	protected int clinicalIndication = CLINICAL_INDICATION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.COMPLEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.COMPLEMENT__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSideLimb() {
		return sideLimb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideLimb(String newSideLimb) {
		String oldSideLimb = sideLimb;
		sideLimb = newSideLimb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.COMPLEMENT__SIDE_LIMB,
					oldSideLimb, sideLimb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSideLimbDisplay() {
		return sideLimbDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideLimbDisplay(String newSideLimbDisplay) {
		String oldSideLimbDisplay = sideLimbDisplay;
		sideLimbDisplay = newSideLimbDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENT__SIDE_LIMB_DISPLAY, oldSideLimbDisplay, sideLimbDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClinicalIndication() {
		return clinicalIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinicalIndication(int newClinicalIndication) {
		int oldClinicalIndication = clinicalIndication;
		clinicalIndication = newClinicalIndication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENT__CLINICAL_INDICATION, oldClinicalIndication,
					clinicalIndication));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.COMPLEMENT__JUSTIFICATION,
					oldJustification, justification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.COMPLEMENT__ID:
			return getId();
		case Execution_metamodelPackage.COMPLEMENT__SIDE_LIMB:
			return getSideLimb();
		case Execution_metamodelPackage.COMPLEMENT__SIDE_LIMB_DISPLAY:
			return getSideLimbDisplay();
		case Execution_metamodelPackage.COMPLEMENT__CLINICAL_INDICATION:
			return getClinicalIndication();
		case Execution_metamodelPackage.COMPLEMENT__JUSTIFICATION:
			return getJustification();
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
		case Execution_metamodelPackage.COMPLEMENT__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.COMPLEMENT__SIDE_LIMB:
			setSideLimb((String) newValue);
			return;
		case Execution_metamodelPackage.COMPLEMENT__SIDE_LIMB_DISPLAY:
			setSideLimbDisplay((String) newValue);
			return;
		case Execution_metamodelPackage.COMPLEMENT__CLINICAL_INDICATION:
			setClinicalIndication((Integer) newValue);
			return;
		case Execution_metamodelPackage.COMPLEMENT__JUSTIFICATION:
			setJustification((String) newValue);
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
		case Execution_metamodelPackage.COMPLEMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMPLEMENT__SIDE_LIMB:
			setSideLimb(SIDE_LIMB_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMPLEMENT__SIDE_LIMB_DISPLAY:
			setSideLimbDisplay(SIDE_LIMB_DISPLAY_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMPLEMENT__CLINICAL_INDICATION:
			setClinicalIndication(CLINICAL_INDICATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMPLEMENT__JUSTIFICATION:
			setJustification(JUSTIFICATION_EDEFAULT);
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
		case Execution_metamodelPackage.COMPLEMENT__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.COMPLEMENT__SIDE_LIMB:
			return SIDE_LIMB_EDEFAULT == null ? sideLimb != null : !SIDE_LIMB_EDEFAULT.equals(sideLimb);
		case Execution_metamodelPackage.COMPLEMENT__SIDE_LIMB_DISPLAY:
			return SIDE_LIMB_DISPLAY_EDEFAULT == null ? sideLimbDisplay != null
					: !SIDE_LIMB_DISPLAY_EDEFAULT.equals(sideLimbDisplay);
		case Execution_metamodelPackage.COMPLEMENT__CLINICAL_INDICATION:
			return clinicalIndication != CLINICAL_INDICATION_EDEFAULT;
		case Execution_metamodelPackage.COMPLEMENT__JUSTIFICATION:
			return JUSTIFICATION_EDEFAULT == null ? justification != null
					: !JUSTIFICATION_EDEFAULT.equals(justification);
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
		result.append(", sideLimb: ");
		result.append(sideLimb);
		result.append(", sideLimbDisplay: ");
		result.append(sideLimbDisplay);
		result.append(", clinicalIndication: ");
		result.append(clinicalIndication);
		result.append(", justification: ");
		result.append(justification);
		result.append(')');
		return result.toString();
	}

} //ComplementImpl
