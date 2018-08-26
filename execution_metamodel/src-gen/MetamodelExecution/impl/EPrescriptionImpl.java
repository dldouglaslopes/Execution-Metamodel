/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.EPrescription;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.PrescribedMedication;
import MetamodelExecution.PrescribedPrescriptionItem;
import MetamodelExecution.Prescription;

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
 *   <li>{@link MetamodelExecution.impl.EPrescriptionImpl#getPrescribedprescriptionitem <em>Prescribedprescriptionitem</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPrescriptionImpl#getIdsPrescribedMedication <em>Ids Prescribed Medication</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPrescriptionImpl#getIdsPrescribedPrescriptionItem <em>Ids Prescribed Prescription Item</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPrescriptionImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link MetamodelExecution.impl.EPrescriptionImpl#getPrescribedmedication <em>Prescribedmedication</em>}</li>
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
	 * The cached value of the '{@link #getPrescribedprescriptionitem() <em>Prescribedprescriptionitem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescribedprescriptionitem()
	 * @generated
	 * @ordered
	 */
	protected EList<PrescribedPrescriptionItem> prescribedprescriptionitem;

	/**
	 * The cached value of the '{@link #getIdsPrescribedMedication() <em>Ids Prescribed Medication</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdsPrescribedMedication()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> idsPrescribedMedication;

	/**
	 * The cached value of the '{@link #getIdsPrescribedPrescriptionItem() <em>Ids Prescribed Prescription Item</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdsPrescribedPrescriptionItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> idsPrescribedPrescriptionItem;

	/**
	 * The cached value of the '{@link #getPrescription() <em>Prescription</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescription()
	 * @generated
	 * @ordered
	 */
	protected EList<Prescription> prescription;

	/**
	 * The cached value of the '{@link #getPrescribedmedication() <em>Prescribedmedication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescribedmedication()
	 * @generated
	 * @ordered
	 */
	protected EList<PrescribedMedication> prescribedmedication;

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
	public EList<PrescribedPrescriptionItem> getPrescribedprescriptionitem() {
		if (prescribedprescriptionitem == null) {
			prescribedprescriptionitem = new EObjectContainmentEList<PrescribedPrescriptionItem>(
					PrescribedPrescriptionItem.class, this,
					Execution_metamodelPackage.EPRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM);
		}
		return prescribedprescriptionitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIdsPrescribedMedication() {
		if (idsPrescribedMedication == null) {
			idsPrescribedMedication = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					Execution_metamodelPackage.EPRESCRIPTION__IDS_PRESCRIBED_MEDICATION);
		}
		return idsPrescribedMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIdsPrescribedPrescriptionItem() {
		if (idsPrescribedPrescriptionItem == null) {
			idsPrescribedPrescriptionItem = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					Execution_metamodelPackage.EPRESCRIPTION__IDS_PRESCRIBED_PRESCRIPTION_ITEM);
		}
		return idsPrescribedPrescriptionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prescription> getPrescription() {
		if (prescription == null) {
			prescription = new EObjectContainmentEList<Prescription>(Prescription.class, this,
					Execution_metamodelPackage.EPRESCRIPTION__PRESCRIPTION);
		}
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrescribedMedication> getPrescribedmedication() {
		if (prescribedmedication == null) {
			prescribedmedication = new EObjectContainmentEList<PrescribedMedication>(PrescribedMedication.class, this,
					Execution_metamodelPackage.EPRESCRIPTION__PRESCRIBEDMEDICATION);
		}
		return prescribedmedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM:
			return ((InternalEList<?>) getPrescribedprescriptionitem()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIPTION:
			return ((InternalEList<?>) getPrescription()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIBEDMEDICATION:
			return ((InternalEList<?>) getPrescribedmedication()).basicRemove(otherEnd, msgs);
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
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM:
			return getPrescribedprescriptionitem();
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PRESCRIBED_MEDICATION:
			return getIdsPrescribedMedication();
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PRESCRIBED_PRESCRIPTION_ITEM:
			return getIdsPrescribedPrescriptionItem();
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIPTION:
			return getPrescription();
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIBEDMEDICATION:
			return getPrescribedmedication();
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
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM:
			getPrescribedprescriptionitem().clear();
			getPrescribedprescriptionitem().addAll((Collection<? extends PrescribedPrescriptionItem>) newValue);
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PRESCRIBED_MEDICATION:
			getIdsPrescribedMedication().clear();
			getIdsPrescribedMedication().addAll((Collection<? extends Integer>) newValue);
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PRESCRIBED_PRESCRIPTION_ITEM:
			getIdsPrescribedPrescriptionItem().clear();
			getIdsPrescribedPrescriptionItem().addAll((Collection<? extends Integer>) newValue);
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIPTION:
			getPrescription().clear();
			getPrescription().addAll((Collection<? extends Prescription>) newValue);
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIBEDMEDICATION:
			getPrescribedmedication().clear();
			getPrescribedmedication().addAll((Collection<? extends PrescribedMedication>) newValue);
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
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM:
			getPrescribedprescriptionitem().clear();
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PRESCRIBED_MEDICATION:
			getIdsPrescribedMedication().clear();
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PRESCRIBED_PRESCRIPTION_ITEM:
			getIdsPrescribedPrescriptionItem().clear();
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIPTION:
			getPrescription().clear();
			return;
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIBEDMEDICATION:
			getPrescribedmedication().clear();
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
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM:
			return prescribedprescriptionitem != null && !prescribedprescriptionitem.isEmpty();
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PRESCRIBED_MEDICATION:
			return idsPrescribedMedication != null && !idsPrescribedMedication.isEmpty();
		case Execution_metamodelPackage.EPRESCRIPTION__IDS_PRESCRIBED_PRESCRIPTION_ITEM:
			return idsPrescribedPrescriptionItem != null && !idsPrescribedPrescriptionItem.isEmpty();
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIPTION:
			return prescription != null && !prescription.isEmpty();
		case Execution_metamodelPackage.EPRESCRIPTION__PRESCRIBEDMEDICATION:
			return prescribedmedication != null && !prescribedmedication.isEmpty();
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
		result.append(", idsPrescribedMedication: ");
		result.append(idsPrescribedMedication);
		result.append(", idsPrescribedPrescriptionItem: ");
		result.append(idsPrescribedPrescriptionItem);
		result.append(')');
		return result.toString();
	}

} //EPrescriptionImpl
