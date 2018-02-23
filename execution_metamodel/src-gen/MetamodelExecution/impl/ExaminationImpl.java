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
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getIdExam <em>Id Exam</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getSideMember <em>Side Member</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getJustify <em>Justify</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getClinicalIndication <em>Clinical Indication</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getSideMemberDisplay <em>Side Member Display</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExaminationImpl#getExam <em>Exam</em>}</li>
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
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

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
	 * The default value of the '{@link #getJustify() <em>Justify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustify()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustify() <em>Justify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustify()
	 * @generated
	 * @ordered
	 */
	protected String justify = JUSTIFY_EDEFAULT;

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
	 * The cached value of the '{@link #getExam() <em>Exam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam()
	 * @generated
	 * @ordered
	 */
	protected Exam exam;

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
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAMINATION__URL, oldUrl,
					url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAMINATION__ID_EXAM,
					oldIdExam, idExam));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAMINATION__SIDE_MEMBER,
					oldSideMember, sideMember));
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
	public String getJustify() {
		return justify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustify(String newJustify) {
		String oldJustify = justify;
		justify = newJustify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EXAMINATION__JUSTIFY,
					oldJustify, justify));
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
					Execution_metamodelPackage.EXAMINATION__SIDE_MEMBER_DISPLAY, oldSideMemberDisplay,
					sideMemberDisplay));
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
		case Execution_metamodelPackage.EXAMINATION__URL:
			return getUrl();
		case Execution_metamodelPackage.EXAMINATION__ID_EXAM:
			return getIdExam();
		case Execution_metamodelPackage.EXAMINATION__SIDE_MEMBER:
			return getSideMember();
		case Execution_metamodelPackage.EXAMINATION__QUANTITY:
			return getQuantity();
		case Execution_metamodelPackage.EXAMINATION__JUSTIFY:
			return getJustify();
		case Execution_metamodelPackage.EXAMINATION__CLINICAL_INDICATION:
			return getClinicalIndication();
		case Execution_metamodelPackage.EXAMINATION__SIDE_MEMBER_DISPLAY:
			return getSideMemberDisplay();
		case Execution_metamodelPackage.EXAMINATION__EXAM:
			return getExam();
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
		case Execution_metamodelPackage.EXAMINATION__URL:
			setUrl((String) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION__ID_EXAM:
			setIdExam((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION__SIDE_MEMBER:
			setSideMember((String) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION__JUSTIFY:
			setJustify((String) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION__CLINICAL_INDICATION:
			setClinicalIndication((String) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION__SIDE_MEMBER_DISPLAY:
			setSideMemberDisplay((String) newValue);
			return;
		case Execution_metamodelPackage.EXAMINATION__EXAM:
			setExam((Exam) newValue);
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
		case Execution_metamodelPackage.EXAMINATION__URL:
			setUrl(URL_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION__ID_EXAM:
			setIdExam(ID_EXAM_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION__SIDE_MEMBER:
			setSideMember(SIDE_MEMBER_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION__JUSTIFY:
			setJustify(JUSTIFY_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION__CLINICAL_INDICATION:
			setClinicalIndication(CLINICAL_INDICATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION__SIDE_MEMBER_DISPLAY:
			setSideMemberDisplay(SIDE_MEMBER_DISPLAY_EDEFAULT);
			return;
		case Execution_metamodelPackage.EXAMINATION__EXAM:
			setExam((Exam) null);
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
		case Execution_metamodelPackage.EXAMINATION__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case Execution_metamodelPackage.EXAMINATION__ID_EXAM:
			return idExam != ID_EXAM_EDEFAULT;
		case Execution_metamodelPackage.EXAMINATION__SIDE_MEMBER:
			return SIDE_MEMBER_EDEFAULT == null ? sideMember != null : !SIDE_MEMBER_EDEFAULT.equals(sideMember);
		case Execution_metamodelPackage.EXAMINATION__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case Execution_metamodelPackage.EXAMINATION__JUSTIFY:
			return JUSTIFY_EDEFAULT == null ? justify != null : !JUSTIFY_EDEFAULT.equals(justify);
		case Execution_metamodelPackage.EXAMINATION__CLINICAL_INDICATION:
			return CLINICAL_INDICATION_EDEFAULT == null ? clinicalIndication != null
					: !CLINICAL_INDICATION_EDEFAULT.equals(clinicalIndication);
		case Execution_metamodelPackage.EXAMINATION__SIDE_MEMBER_DISPLAY:
			return SIDE_MEMBER_DISPLAY_EDEFAULT == null ? sideMemberDisplay != null
					: !SIDE_MEMBER_DISPLAY_EDEFAULT.equals(sideMemberDisplay);
		case Execution_metamodelPackage.EXAMINATION__EXAM:
			return exam != null;
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
		result.append(", url: ");
		result.append(url);
		result.append(", idExam: ");
		result.append(idExam);
		result.append(", sideMember: ");
		result.append(sideMember);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", justify: ");
		result.append(justify);
		result.append(", clinicalIndication: ");
		result.append(clinicalIndication);
		result.append(", sideMemberDisplay: ");
		result.append(sideMemberDisplay);
		result.append(')');
		return result.toString();
	}

} //ExaminationImpl
