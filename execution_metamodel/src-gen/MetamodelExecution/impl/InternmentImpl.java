/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Internment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.InternmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.InternmentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link MetamodelExecution.impl.InternmentImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.impl.InternmentImpl#getClinicalIndication <em>Clinical Indication</em>}</li>
 *   <li>{@link MetamodelExecution.impl.InternmentImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternmentImpl extends MinimalEObjectImpl.Container implements Internment {
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
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

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
	 * The default value of the '{@link #getClinicalIndication() <em>Clinical Indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalIndication()
	 * @generated
	 * @ordered
	 */
	protected static final String CLINICAL_INDICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClinicalIndication() <em>Clinical Indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalIndication()
	 * @generated
	 * @ordered
	 */
	protected String clinicalIndication = CLINICAL_INDICATION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.INTERNMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.INTERNMENT__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.INTERNMENT__CATEGORY,
					oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.INTERNMENT__JUSTIFICATION,
					oldJustification, justification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClinicalIndication() {
		return clinicalIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinicalIndication(String newClinicalIndication) {
		String oldClinicalIndication = clinicalIndication;
		clinicalIndication = newClinicalIndication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.INTERNMENT__CLINICAL_INDICATION, oldClinicalIndication,
					clinicalIndication));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.INTERNMENT__QUANTITY,
					oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.INTERNMENT__ID:
			return getId();
		case Execution_metamodelPackage.INTERNMENT__CATEGORY:
			return getCategory();
		case Execution_metamodelPackage.INTERNMENT__JUSTIFICATION:
			return getJustification();
		case Execution_metamodelPackage.INTERNMENT__CLINICAL_INDICATION:
			return getClinicalIndication();
		case Execution_metamodelPackage.INTERNMENT__QUANTITY:
			return getQuantity();
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
		case Execution_metamodelPackage.INTERNMENT__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.INTERNMENT__CATEGORY:
			setCategory((String) newValue);
			return;
		case Execution_metamodelPackage.INTERNMENT__JUSTIFICATION:
			setJustification((String) newValue);
			return;
		case Execution_metamodelPackage.INTERNMENT__CLINICAL_INDICATION:
			setClinicalIndication((String) newValue);
			return;
		case Execution_metamodelPackage.INTERNMENT__QUANTITY:
			setQuantity((Integer) newValue);
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
		case Execution_metamodelPackage.INTERNMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.INTERNMENT__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case Execution_metamodelPackage.INTERNMENT__JUSTIFICATION:
			setJustification(JUSTIFICATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.INTERNMENT__CLINICAL_INDICATION:
			setClinicalIndication(CLINICAL_INDICATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.INTERNMENT__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
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
		case Execution_metamodelPackage.INTERNMENT__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.INTERNMENT__CATEGORY:
			return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
		case Execution_metamodelPackage.INTERNMENT__JUSTIFICATION:
			return JUSTIFICATION_EDEFAULT == null ? justification != null
					: !JUSTIFICATION_EDEFAULT.equals(justification);
		case Execution_metamodelPackage.INTERNMENT__CLINICAL_INDICATION:
			return CLINICAL_INDICATION_EDEFAULT == null ? clinicalIndication != null
					: !CLINICAL_INDICATION_EDEFAULT.equals(clinicalIndication);
		case Execution_metamodelPackage.INTERNMENT__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
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
		result.append(", category: ");
		result.append(category);
		result.append(", justification: ");
		result.append(justification);
		result.append(", clinicalIndication: ");
		result.append(clinicalIndication);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //InternmentImpl
