/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Exam;
import MetamodelExecution.Examination;
import MetamodelExecution.Execution_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Examination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getSideLimb <em>Side Limb</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getClinicalIndication <em>Clinical Indication</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getExam <em>Exam</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExaminationImpl extends MinimalEObjectImpl.Container implements Examination {
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
	 * The cached value of the '{@link #getExam() <em>Exam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam()
	 * @generated
	 * @ordered
	 */
	protected Exam exam;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExaminationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.EXAMINATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAMINATION__ID, oldId,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAMINATION__SIDE_LIMB,
					oldSideLimb, sideLimb));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAMINATION__QUANTITY,
					oldQuantity, quantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAMINATION__JUSTIFICATION,
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
					Execution_metamodelPackage.EXAMINATION__CLINICAL_INDICATION, oldClinicalIndication,
					clinicalIndication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam getExam() {
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExam(Exam newExam, NotificationChain msgs) {
		Exam oldExam = exam;
		exam = newExam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXAMINATION__EXAM, oldExam, newExam);
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
	public void setExam(Exam newExam) {
		if (newExam != exam) {
			NotificationChain msgs = null;
			if (exam != null)
				msgs = ((InternalEObject) exam).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXAMINATION__EXAM, null, msgs);
			if (newExam != null)
				msgs = ((InternalEObject) newExam).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.EXAMINATION__EXAM, null, msgs);
			msgs = basicSetExam(newExam, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAMINATION__EXAM, newExam,
					newExam));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAMINATION__CATEGORY,
					oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.EXAMINATION__EXAM:
			return basicSetExam(null, msgs);
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
		case Execution_metamodelPackage.EXAMINATION__ID:
			return getId();
		case Execution_metamodelPackage.EXAMINATION__SIDE_LIMB:
			return getSideLimb();
		case Execution_metamodelPackage.EXAMINATION__QUANTITY:
			return getQuantity();
		case Execution_metamodelPackage.EXAMINATION__JUSTIFICATION:
			return getJustification();
		case Execution_metamodelPackage.EXAMINATION__CLINICAL_INDICATION:
			return getClinicalIndication();
		case Execution_metamodelPackage.EXAMINATION__EXAM:
			return getExam();
		case Execution_metamodelPackage.EXAMINATION__CATEGORY:
			return getCategory();
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
		case Execution_metamodelPackage.EXAMINATION__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION__SIDE_LIMB:
			setSideLimb((String) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION__JUSTIFICATION:
			setJustification((String) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION__CLINICAL_INDICATION:
			setClinicalIndication((String) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION__EXAM:
			setExam((Exam) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION__CATEGORY:
			setCategory((String) newValue);
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
		case Execution_metamodelPackage.EXAMINATION__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION__SIDE_LIMB:
			setSideLimb(SIDE_LIMB_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION__JUSTIFICATION:
			setJustification(JUSTIFICATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION__CLINICAL_INDICATION:
			setClinicalIndication(CLINICAL_INDICATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION__EXAM:
			setExam((Exam) null);
			return;
		case Execution_metamodelPackage.EXAMINATION__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
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
		case Execution_metamodelPackage.EXAMINATION__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.EXAMINATION__SIDE_LIMB:
			return SIDE_LIMB_EDEFAULT == null ? sideLimb != null : !SIDE_LIMB_EDEFAULT.equals(sideLimb);
		case Execution_metamodelPackage.EXAMINATION__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case Execution_metamodelPackage.EXAMINATION__JUSTIFICATION:
			return JUSTIFICATION_EDEFAULT == null ? justification != null
					: !JUSTIFICATION_EDEFAULT.equals(justification);
		case Execution_metamodelPackage.EXAMINATION__CLINICAL_INDICATION:
			return CLINICAL_INDICATION_EDEFAULT == null ? clinicalIndication != null
					: !CLINICAL_INDICATION_EDEFAULT.equals(clinicalIndication);
		case Execution_metamodelPackage.EXAMINATION__EXAM:
			return exam != null;
		case Execution_metamodelPackage.EXAMINATION__CATEGORY:
			return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
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
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", justification: ");
		result.append(justification);
		result.append(", clinicalIndication: ");
		result.append(clinicalIndication);
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //ExaminationImpl
