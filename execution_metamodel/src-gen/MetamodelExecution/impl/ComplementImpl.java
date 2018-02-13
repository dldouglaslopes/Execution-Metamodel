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
 *   <li>{@link MetamodelExecution.impl.ComplementImpl#getSideMember <em>Side Member</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComplementImpl#getSideMemberDisplay <em>Side Member Display</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComplementImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ComplementImpl#getClinicalIndication <em>Clinical Indication</em>}</li>
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
	 * The default value of the '{@link #getSideMember() <em>Side Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideMember()
	 * @generated
	 * @ordered
	 */
	protected static final String SIDE_MEMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSideMember() <em>Side Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideMember()
	 * @generated
	 * @ordered
	 */
	protected String sideMember = SIDE_MEMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSideMemberDisplay() <em>Side Member Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideMemberDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String SIDE_MEMBER_DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSideMemberDisplay() <em>Side Member Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideMemberDisplay()
	 * @generated
	 * @ordered
	 */
	protected String sideMemberDisplay = SIDE_MEMBER_DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

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
	public String getSideMember() {
		return sideMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideMember(String newSideMember) {
		String oldSideMember = sideMember;
		sideMember = newSideMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.COMPLEMENT__SIDE_MEMBER,
					oldSideMember, sideMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSideMemberDisplay() {
		return sideMemberDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideMemberDisplay(String newSideMemberDisplay) {
		String oldSideMemberDisplay = sideMemberDisplay;
		sideMemberDisplay = newSideMemberDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENT__SIDE_MEMBER_DISPLAY, oldSideMemberDisplay,
					sideMemberDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.COMPLEMENT__QUANTITY,
					oldQuantity, quantity));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.COMPLEMENT__ID:
			return getId();
		case Execution_metamodelPackage.COMPLEMENT__SIDE_MEMBER:
			return getSideMember();
		case Execution_metamodelPackage.COMPLEMENT__SIDE_MEMBER_DISPLAY:
			return getSideMemberDisplay();
		case Execution_metamodelPackage.COMPLEMENT__QUANTITY:
			return getQuantity();
		case Execution_metamodelPackage.COMPLEMENT__CLINICAL_INDICATION:
			return getClinicalIndication();
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
		case Execution_metamodelPackage.COMPLEMENT__SIDE_MEMBER:
			setSideMember((String) newValue);
			return;
		case Execution_metamodelPackage.COMPLEMENT__SIDE_MEMBER_DISPLAY:
			setSideMemberDisplay((String) newValue);
			return;
		case Execution_metamodelPackage.COMPLEMENT__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case Execution_metamodelPackage.COMPLEMENT__CLINICAL_INDICATION:
			setClinicalIndication((Integer) newValue);
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
		case Execution_metamodelPackage.COMPLEMENT__SIDE_MEMBER:
			setSideMember(SIDE_MEMBER_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMPLEMENT__SIDE_MEMBER_DISPLAY:
			setSideMemberDisplay(SIDE_MEMBER_DISPLAY_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMPLEMENT__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case Execution_metamodelPackage.COMPLEMENT__CLINICAL_INDICATION:
			setClinicalIndication(CLINICAL_INDICATION_EDEFAULT);
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
		case Execution_metamodelPackage.COMPLEMENT__SIDE_MEMBER:
			return SIDE_MEMBER_EDEFAULT == null ? sideMember != null : !SIDE_MEMBER_EDEFAULT.equals(sideMember);
		case Execution_metamodelPackage.COMPLEMENT__SIDE_MEMBER_DISPLAY:
			return SIDE_MEMBER_DISPLAY_EDEFAULT == null ? sideMemberDisplay != null
					: !SIDE_MEMBER_DISPLAY_EDEFAULT.equals(sideMemberDisplay);
		case Execution_metamodelPackage.COMPLEMENT__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case Execution_metamodelPackage.COMPLEMENT__CLINICAL_INDICATION:
			return clinicalIndication != CLINICAL_INDICATION_EDEFAULT;
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
		result.append(", sideMember: ");
		result.append(sideMember);
		result.append(", sideMemberDisplay: ");
		result.append(sideMemberDisplay);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", clinicalIndication: ");
		result.append(clinicalIndication);
		result.append(')');
		return result.toString();
	}

} //ComplementImpl
