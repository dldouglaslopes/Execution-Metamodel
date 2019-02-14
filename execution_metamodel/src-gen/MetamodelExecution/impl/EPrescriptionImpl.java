/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.EPrescription;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.PMedication;
import MetamodelExecution.PPrescription;
import MetamodelExecution.PrescriptionResult;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPrescription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.EPrescriptionImpl#getText <em>Text</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPrescriptionImpl#getPprescription <em>Pprescription</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPrescriptionImpl#getIdsPMedication <em>Ids PMedication</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPrescriptionImpl#getIdsPPrescription <em>Ids PPrescription</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPrescriptionImpl#getPmedication <em>Pmedication</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPrescriptionImpl#getTypePrescription <em>Type Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPrescriptionImpl#getLastExecutedPrescription <em>Last Executed Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPrescriptionImpl#getPrescriptionResult <em>Prescription Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPrescriptionImpl extends EStepImpl implements EPrescription {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPprescription() <em>Pprescription</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPprescription()
	 * @generated
	 * @ordered
	 */
	protected EList<PPrescription> pprescription;

	/**
	 * The cached value of the '{@link #getIdsPMedication() <em>Ids PMedication</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdsPMedication()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> idsPMedication;

	/**
	 * The cached value of the '{@link #getIdsPPrescription() <em>Ids PPrescription</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdsPPrescription()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> idsPPrescription;

	/**
	 * The cached value of the '{@link #getPmedication() <em>Pmedication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPmedication()
	 * @generated
	 * @ordered
	 */
	protected EList<PMedication> pmedication;

	/**
	 * The default value of the '{@link #getTypePrescription() <em>Type Prescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePrescription()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_PRESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypePrescription() <em>Type Prescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePrescription()
	 * @generated
	 * @ordered
	 */
	protected String typePrescription = TYPE_PRESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastExecutedPrescription() <em>Last Executed Prescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastExecutedPrescription()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_EXECUTED_PRESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastExecutedPrescription() <em>Last Executed Prescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastExecutedPrescription()
	 * @generated
	 * @ordered
	 */
	protected String lastExecutedPrescription = LAST_EXECUTED_PRESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrescriptionResult() <em>Prescription Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionResult()
	 * @generated
	 * @ordered
	 */
	protected EList<PrescriptionResult> prescriptionResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPrescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.EPRESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.EPRESCRIPTION__TEXT,
					oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PPrescription> getPprescription() {
		if (pprescription == null) {
			pprescription = new EObjectContainmentEList<PPrescription>(PPrescription.class, this,
					Execution_metamodelPackage.EPRESCRIPTION__PPRESCRIPTION);
		}
		return pprescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIdsPMedication() {
		if (idsPMedication == null) {
			idsPMedication = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					Execution_metamodelPackage.EPRESCRIPTION__IDS_PMEDICATION);
		}
		return idsPMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIdsPPrescription() {
		if (idsPPrescription == null) {
			idsPPrescription = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					Execution_metamodelPackage.EPRESCRIPTION__IDS_PPRESCRIPTION);
		}
		return idsPPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PMedication> getPmedication() {
		if (pmedication == null) {
			pmedication = new EObjectContainmentEList<PMedication>(PMedication.class, this,
					Execution_metamodelPackage.EPRESCRIPTION__PMEDICATION);
		}
		return pmedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypePrescription() {
		return typePrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePrescription(String newTypePrescription) {
		String oldTypePrescription = typePrescription;
		typePrescription = newTypePrescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EPRESCRIPTION__TYPE_PRESCRIPTION, oldTypePrescription,
					typePrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastExecutedPrescription() {
		return lastExecutedPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastExecutedPrescription(String newLastExecutedPrescription) {
		String oldLastExecutedPrescription = lastExecutedPrescription;
		lastExecutedPrescription = newLastExecutedPrescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.EPRESCRIPTION__LAST_EXECUTED_PRESCRIPTION, oldLastExecutedPrescription,
					lastExecutedPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrescriptionResult> getPrescriptionResult() {
		if (prescriptionResult == null) {
			prescriptionResult = new EObjectContainmentEList<PrescriptionResult>(PrescriptionResult.class, this,
					Execution_metamodelPackage.EPRESCRIPTION__PRESCRIPTION_RESULT);
		}
		return prescriptionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.EPRESCRIPTION__PPRESCRIPTION:
			return ((InternalEList<?>) getPprescription()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.EPRESCRIPTION__PMEDICATION:
			return ((InternalEList<?>) getPmedication()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIPTION_RESULT:
			return ((InternalEList<?>) getPrescriptionResult()).basicRemove(otherEnd, msgs);
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
		case Execution_metamodelPackage.EPRESCRIPTION__TEXT:
			return getText();
		case Execution_metamodelPackage.EPRESCRIPTION__PPRESCRIPTION:
			return getPprescription();
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PMEDICATION:
			return getIdsPMedication();
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PPRESCRIPTION:
			return getIdsPPrescription();
		case Execution_metamodelPackage.EPRESCRIPTION__PMEDICATION:
			return getPmedication();
		case Execution_metamodelPackage.EPRESCRIPTION__TYPE_PRESCRIPTION:
			return getTypePrescription();
		case Execution_metamodelPackage.EPRESCRIPTION__LAST_EXECUTED_PRESCRIPTION:
			return getLastExecutedPrescription();
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIPTION_RESULT:
			return getPrescriptionResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Execution_metamodelPackage.EPRESCRIPTION__TEXT:
			setText((String) newValue);
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__PPRESCRIPTION:
			getPprescription().clear();
			getPprescription().addAll((Collection<? extends PPrescription>) newValue);
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PMEDICATION:
			getIdsPMedication().clear();
			getIdsPMedication().addAll((Collection<? extends Integer>) newValue);
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PPRESCRIPTION:
			getIdsPPrescription().clear();
			getIdsPPrescription().addAll((Collection<? extends Integer>) newValue);
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__PMEDICATION:
			getPmedication().clear();
			getPmedication().addAll((Collection<? extends PMedication>) newValue);
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__TYPE_PRESCRIPTION:
			setTypePrescription((String) newValue);
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__LAST_EXECUTED_PRESCRIPTION:
			setLastExecutedPrescription((String) newValue);
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIPTION_RESULT:
			getPrescriptionResult().clear();
			getPrescriptionResult().addAll((Collection<? extends PrescriptionResult>) newValue);
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
		case Execution_metamodelPackage.EPRESCRIPTION__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__PPRESCRIPTION:
			getPprescription().clear();
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PMEDICATION:
			getIdsPMedication().clear();
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PPRESCRIPTION:
			getIdsPPrescription().clear();
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__PMEDICATION:
			getPmedication().clear();
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__TYPE_PRESCRIPTION:
			setTypePrescription(TYPE_PRESCRIPTION_EDEFAULT);
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__LAST_EXECUTED_PRESCRIPTION:
			setLastExecutedPrescription(LAST_EXECUTED_PRESCRIPTION_EDEFAULT);
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIPTION_RESULT:
			getPrescriptionResult().clear();
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
		case Execution_metamodelPackage.EPRESCRIPTION__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		case Execution_metamodelPackage.EPRESCRIPTION__PPRESCRIPTION:
			return pprescription != null && !pprescription.isEmpty();
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PMEDICATION:
			return idsPMedication != null && !idsPMedication.isEmpty();
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PPRESCRIPTION:
			return idsPPrescription != null && !idsPPrescription.isEmpty();
		case Execution_metamodelPackage.EPRESCRIPTION__PMEDICATION:
			return pmedication != null && !pmedication.isEmpty();
		case Execution_metamodelPackage.EPRESCRIPTION__TYPE_PRESCRIPTION:
			return TYPE_PRESCRIPTION_EDEFAULT == null ? typePrescription != null
					: !TYPE_PRESCRIPTION_EDEFAULT.equals(typePrescription);
		case Execution_metamodelPackage.EPRESCRIPTION__LAST_EXECUTED_PRESCRIPTION:
			return LAST_EXECUTED_PRESCRIPTION_EDEFAULT == null ? lastExecutedPrescription != null
					: !LAST_EXECUTED_PRESCRIPTION_EDEFAULT.equals(lastExecutedPrescription);
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIPTION_RESULT:
			return prescriptionResult != null && !prescriptionResult.isEmpty();
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
		result.append(" (text: ");
		result.append(text);
		result.append(", idsPMedication: ");
		result.append(idsPMedication);
		result.append(", idsPPrescription: ");
		result.append(idsPPrescription);
		result.append(", typePrescription: ");
		result.append(typePrescription);
		result.append(", lastExecutedPrescription: ");
		result.append(lastExecutedPrescription);
		result.append(')');
		return result.toString();
	}

} //EPrescriptionImpl
