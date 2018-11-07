/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.ExaminationPrescribedResource;
import MetamodelExecution.Execution_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Examination Prescribed Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ExaminationPrescribedResourceImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationPrescribedResourceImpl#getExam <em>Exam</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationPrescribedResourceImpl#getIdExam <em>Id Exam</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationPrescribedResourceImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationPrescribedResourceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationPrescribedResourceImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationPrescribedResourceImpl#getSideLimb <em>Side Limb</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationPrescribedResourceImpl#getClinicalIndication <em>Clinical Indication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExaminationPrescribedResourceImpl extends MinimalEObjectImpl.Container
		implements ExaminationPrescribedResource {
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
	 * The default value of the '{@link #getExam() <em>Exam</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExam() <em>Exam</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam()
	 * @generated
	 * @ordered
	 */
	protected String exam = EXAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdExam() <em>Id Exam</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdExam()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EXAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdExam() <em>Id Exam</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdExam()
	 * @generated
	 * @ordered
	 */
	protected int idExam = ID_EXAM_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExaminationPrescribedResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.EXAMINATION_PRESCRIBED_RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExam() {
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExam(String newExam) {
		String oldExam = exam;
		exam = newExam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__EXAM, oldExam, exam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdExam() {
		return idExam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdExam(int newIdExam) {
		int oldIdExam = idExam;
		idExam = newIdExam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__ID_EXAM, oldIdExam, idExam));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__JUSTIFICATION, oldJustification,
					justification));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__QUANTITY, oldQuantity, quantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__SIDE_LIMB, oldSideLimb, sideLimb));
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
					Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__CLINICAL_INDICATION,
					oldClinicalIndication, clinicalIndication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__ID:
			return getId();
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__EXAM:
			return getExam();
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__ID_EXAM:
			return getIdExam();
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__JUSTIFICATION:
			return getJustification();
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__CATEGORY:
			return getCategory();
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__QUANTITY:
			return getQuantity();
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__SIDE_LIMB:
			return getSideLimb();
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__CLINICAL_INDICATION:
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
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__EXAM:
			setExam((String) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__ID_EXAM:
			setIdExam((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__JUSTIFICATION:
			setJustification((String) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__CATEGORY:
			setCategory((String) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__SIDE_LIMB:
			setSideLimb((String) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__CLINICAL_INDICATION:
			setClinicalIndication((String) newValue);
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
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__EXAM:
			setExam(EXAM_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__ID_EXAM:
			setIdExam(ID_EXAM_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__JUSTIFICATION:
			setJustification(JUSTIFICATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__SIDE_LIMB:
			setSideLimb(SIDE_LIMB_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__CLINICAL_INDICATION:
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
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__EXAM:
			return EXAM_EDEFAULT == null ? exam != null : !EXAM_EDEFAULT.equals(exam);
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__ID_EXAM:
			return idExam != ID_EXAM_EDEFAULT;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__JUSTIFICATION:
			return JUSTIFICATION_EDEFAULT == null ? justification != null
					: !JUSTIFICATION_EDEFAULT.equals(justification);
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__CATEGORY:
			return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__SIDE_LIMB:
			return SIDE_LIMB_EDEFAULT == null ? sideLimb != null : !SIDE_LIMB_EDEFAULT.equals(sideLimb);
		case Execution_metamodelPackage.EXAMINATION_PRESCRIBED_RESOURCE__CLINICAL_INDICATION:
			return CLINICAL_INDICATION_EDEFAULT == null ? clinicalIndication != null
					: !CLINICAL_INDICATION_EDEFAULT.equals(clinicalIndication);
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
		result.append(", exam: ");
		result.append(exam);
		result.append(", idExam: ");
		result.append(idExam);
		result.append(", justification: ");
		result.append(justification);
		result.append(", category: ");
		result.append(category);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", sideLimb: ");
		result.append(sideLimb);
		result.append(", clinicalIndication: ");
		result.append(clinicalIndication);
		result.append(')');
		return result.toString();
	}

} //ExaminationPrescribedResourceImpl
