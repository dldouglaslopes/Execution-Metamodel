/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.PrescribedMedicament;
import MetamodelExecution.PrescribedPrescriptionItem;
import MetamodelExecution.Prescription;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prescription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getText <em>Text</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getIdPrescribedMedicament <em>Id Prescribed Medicament</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getIdPrescribedItens <em>Id Prescribed Itens</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getPrescribedmedicament <em>Prescribedmedicament</em>}</li>
 *   <li>{@link MetamodelExecution.impl.PrescriptionImpl#getPrescribedprescriptionitem <em>Prescribedprescriptionitem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrescriptionImpl extends ElementImpl implements Prescription {
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
	 * The default value of the '{@link #getIdPrescribedMedicament() <em>Id Prescribed Medicament</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPrescribedMedicament()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PRESCRIBED_MEDICAMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdPrescribedMedicament() <em>Id Prescribed Medicament</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPrescribedMedicament()
	 * @generated
	 * @ordered
	 */
	protected int idPrescribedMedicament = ID_PRESCRIBED_MEDICAMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdPrescribedItens() <em>Id Prescribed Itens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPrescribedItens()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PRESCRIBED_ITENS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdPrescribedItens() <em>Id Prescribed Itens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPrescribedItens()
	 * @generated
	 * @ordered
	 */
	protected int idPrescribedItens = ID_PRESCRIBED_ITENS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrescribedmedicament() <em>Prescribedmedicament</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescribedmedicament()
	 * @generated
	 * @ordered
	 */
	protected EList<PrescribedMedicament> prescribedmedicament;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.PRESCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.PRESCRIPTION__TEXT,
					oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdPrescribedMedicament() {
		return idPrescribedMedicament;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPrescribedMedicament(int newIdPrescribedMedicament) {
		int oldIdPrescribedMedicament = idPrescribedMedicament;
		idPrescribedMedicament = newIdPrescribedMedicament;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIPTION__ID_PRESCRIBED_MEDICAMENT, oldIdPrescribedMedicament,
					idPrescribedMedicament));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdPrescribedItens() {
		return idPrescribedItens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPrescribedItens(int newIdPrescribedItens) {
		int oldIdPrescribedItens = idPrescribedItens;
		idPrescribedItens = newIdPrescribedItens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PRESCRIPTION__ID_PRESCRIBED_ITENS, oldIdPrescribedItens,
					idPrescribedItens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrescribedMedicament> getPrescribedmedicament() {
		if (prescribedmedicament == null) {
			prescribedmedicament = new EObjectContainmentEList<PrescribedMedicament>(PrescribedMedicament.class, this,
					Execution_metamodelPackage.PRESCRIPTION__PRESCRIBEDMEDICAMENT);
		}
		return prescribedmedicament;
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
					Execution_metamodelPackage.PRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM);
		}
		return prescribedprescriptionitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.PRESCRIPTION__PRESCRIBEDMEDICAMENT:
			return ((InternalEList<?>) getPrescribedmedicament()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.PRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM:
			return ((InternalEList<?>) getPrescribedprescriptionitem()).basicRemove(otherEnd, msgs);
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
		case Execution_metamodelPackage.PRESCRIPTION__TEXT:
			return getText();
		case Execution_metamodelPackage.PRESCRIPTION__ID_PRESCRIBED_MEDICAMENT:
			return getIdPrescribedMedicament();
		case Execution_metamodelPackage.PRESCRIPTION__ID_PRESCRIBED_ITENS:
			return getIdPrescribedItens();
		case Execution_metamodelPackage.PRESCRIPTION__PRESCRIBEDMEDICAMENT:
			return getPrescribedmedicament();
		case Execution_metamodelPackage.PRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM:
			return getPrescribedprescriptionitem();
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
		case Execution_metamodelPackage.PRESCRIPTION__TEXT:
			setText((String) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__ID_PRESCRIBED_MEDICAMENT:
			setIdPrescribedMedicament((Integer) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__ID_PRESCRIBED_ITENS:
			setIdPrescribedItens((Integer) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__PRESCRIBEDMEDICAMENT:
			getPrescribedmedicament().clear();
			getPrescribedmedicament().addAll((Collection<? extends PrescribedMedicament>) newValue);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM:
			getPrescribedprescriptionitem().clear();
			getPrescribedprescriptionitem().addAll((Collection<? extends PrescribedPrescriptionItem>) newValue);
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
		case Execution_metamodelPackage.PRESCRIPTION__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__ID_PRESCRIBED_MEDICAMENT:
			setIdPrescribedMedicament(ID_PRESCRIBED_MEDICAMENT_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__ID_PRESCRIBED_ITENS:
			setIdPrescribedItens(ID_PRESCRIBED_ITENS_EDEFAULT);
			return;
		case Execution_metamodelPackage.PRESCRIPTION__PRESCRIBEDMEDICAMENT:
			getPrescribedmedicament().clear();
			return;
		case Execution_metamodelPackage.PRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM:
			getPrescribedprescriptionitem().clear();
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
		case Execution_metamodelPackage.PRESCRIPTION__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		case Execution_metamodelPackage.PRESCRIPTION__ID_PRESCRIBED_MEDICAMENT:
			return idPrescribedMedicament != ID_PRESCRIBED_MEDICAMENT_EDEFAULT;
		case Execution_metamodelPackage.PRESCRIPTION__ID_PRESCRIBED_ITENS:
			return idPrescribedItens != ID_PRESCRIBED_ITENS_EDEFAULT;
		case Execution_metamodelPackage.PRESCRIPTION__PRESCRIBEDMEDICAMENT:
			return prescribedmedicament != null && !prescribedmedicament.isEmpty();
		case Execution_metamodelPackage.PRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM:
			return prescribedprescriptionitem != null && !prescribedprescriptionitem.isEmpty();
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
		result.append(", idPrescribedMedicament: ");
		result.append(idPrescribedMedicament);
		result.append(", idPrescribedItens: ");
		result.append(idPrescribedItens);
		result.append(')');
		return result.toString();
	}

} //PrescriptionImpl
