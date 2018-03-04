/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.PrescribedExamination;
import MetamodelExecution.PrescribedInternment;
import MetamodelExecution.PrescribedMedication;
import MetamodelExecution.PrescribedProcedure;
import MetamodelExecution.Treatment;

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
 * An implementation of the model object '<em><b>Treatment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.TreatmentImpl#getPrescribedexam <em>Prescribedexam</em>}</li>
 *   <li>{@link MetamodelExecution.impl.TreatmentImpl#getPrescribedprocedure <em>Prescribedprocedure</em>}</li>
 *   <li>{@link MetamodelExecution.impl.TreatmentImpl#getPrescribedinternment <em>Prescribedinternment</em>}</li>
 *   <li>{@link MetamodelExecution.impl.TreatmentImpl#getPrescribedmedication <em>Prescribedmedication</em>}</li>
 *   <li>{@link MetamodelExecution.impl.TreatmentImpl#getIdsPrescribedExamination <em>Ids Prescribed Examination</em>}</li>
 *   <li>{@link MetamodelExecution.impl.TreatmentImpl#getIdsPrescribedProcedure <em>Ids Prescribed Procedure</em>}</li>
 *   <li>{@link MetamodelExecution.impl.TreatmentImpl#getIdsPrescribedInternment <em>Ids Prescribed Internment</em>}</li>
 *   <li>{@link MetamodelExecution.impl.TreatmentImpl#getIdsPrecribedMedication <em>Ids Precribed Medication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreatmentImpl extends ExecutionImpl implements Treatment {
	/**
	 * The cached value of the '{@link #getPrescribedexam() <em>Prescribedexam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescribedexam()
	 * @generated
	 * @ordered
	 */
	protected PrescribedExamination prescribedexam;

	/**
	 * The cached value of the '{@link #getPrescribedprocedure() <em>Prescribedprocedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescribedprocedure()
	 * @generated
	 * @ordered
	 */
	protected EList<PrescribedProcedure> prescribedprocedure;

	/**
	 * The cached value of the '{@link #getPrescribedinternment() <em>Prescribedinternment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescribedinternment()
	 * @generated
	 * @ordered
	 */
	protected EList<PrescribedInternment> prescribedinternment;

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
	 * The cached value of the '{@link #getIdsPrescribedExamination() <em>Ids Prescribed Examination</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdsPrescribedExamination()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> idsPrescribedExamination;

	/**
	 * The cached value of the '{@link #getIdsPrescribedProcedure() <em>Ids Prescribed Procedure</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdsPrescribedProcedure()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> idsPrescribedProcedure;

	/**
	 * The cached value of the '{@link #getIdsPrescribedInternment() <em>Ids Prescribed Internment</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdsPrescribedInternment()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> idsPrescribedInternment;

	/**
	 * The cached value of the '{@link #getIdsPrecribedMedication() <em>Ids Precribed Medication</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdsPrecribedMedication()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> idsPrecribedMedication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreatmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.TREATMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescribedExamination getPrescribedexam() {
		return prescribedexam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescribedexam(PrescribedExamination newPrescribedexam, NotificationChain msgs) {
		PrescribedExamination oldPrescribedexam = prescribedexam;
		prescribedexam = newPrescribedexam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.TREATMENT__PRESCRIBEDEXAM, oldPrescribedexam, newPrescribedexam);
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
	public void setPrescribedexam(PrescribedExamination newPrescribedexam) {
		if (newPrescribedexam != prescribedexam) {
			NotificationChain msgs = null;
			if (prescribedexam != null)
				msgs = ((InternalEObject) prescribedexam).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.TREATMENT__PRESCRIBEDEXAM, null, msgs);
			if (newPrescribedexam != null)
				msgs = ((InternalEObject) newPrescribedexam).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.TREATMENT__PRESCRIBEDEXAM, null, msgs);
			msgs = basicSetPrescribedexam(newPrescribedexam, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.TREATMENT__PRESCRIBEDEXAM,
					newPrescribedexam, newPrescribedexam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrescribedProcedure> getPrescribedprocedure() {
		if (prescribedprocedure == null) {
			prescribedprocedure = new EObjectContainmentEList<PrescribedProcedure>(PrescribedProcedure.class, this,
					Execution_metamodelPackage.TREATMENT__PRESCRIBEDPROCEDURE);
		}
		return prescribedprocedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrescribedInternment> getPrescribedinternment() {
		if (prescribedinternment == null) {
			prescribedinternment = new EObjectContainmentEList<PrescribedInternment>(PrescribedInternment.class, this,
					Execution_metamodelPackage.TREATMENT__PRESCRIBEDINTERNMENT);
		}
		return prescribedinternment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrescribedMedication> getPrescribedmedication() {
		if (prescribedmedication == null) {
			prescribedmedication = new EObjectContainmentEList<PrescribedMedication>(PrescribedMedication.class, this,
					Execution_metamodelPackage.TREATMENT__PRESCRIBEDMEDICATION);
		}
		return prescribedmedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIdsPrescribedExamination() {
		if (idsPrescribedExamination == null) {
			idsPrescribedExamination = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_EXAMINATION);
		}
		return idsPrescribedExamination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIdsPrescribedProcedure() {
		if (idsPrescribedProcedure == null) {
			idsPrescribedProcedure = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_PROCEDURE);
		}
		return idsPrescribedProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIdsPrescribedInternment() {
		if (idsPrescribedInternment == null) {
			idsPrescribedInternment = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_INTERNMENT);
		}
		return idsPrescribedInternment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIdsPrecribedMedication() {
		if (idsPrecribedMedication == null) {
			idsPrecribedMedication = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					Execution_metamodelPackage.TREATMENT__IDS_PRECRIBED_MEDICATION);
		}
		return idsPrecribedMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDEXAM:
			return basicSetPrescribedexam(null, msgs);
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDPROCEDURE:
			return ((InternalEList<?>) getPrescribedprocedure()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDINTERNMENT:
			return ((InternalEList<?>) getPrescribedinternment()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDMEDICATION:
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
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDEXAM:
			return getPrescribedexam();
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDPROCEDURE:
			return getPrescribedprocedure();
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDINTERNMENT:
			return getPrescribedinternment();
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDMEDICATION:
			return getPrescribedmedication();
		case Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_EXAMINATION:
			return getIdsPrescribedExamination();
		case Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_PROCEDURE:
			return getIdsPrescribedProcedure();
		case Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_INTERNMENT:
			return getIdsPrescribedInternment();
		case Execution_metamodelPackage.TREATMENT__IDS_PRECRIBED_MEDICATION:
			return getIdsPrecribedMedication();
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
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDEXAM:
			setPrescribedexam((PrescribedExamination) newValue);
			return;
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDPROCEDURE:
			getPrescribedprocedure().clear();
			getPrescribedprocedure().addAll((Collection<? extends PrescribedProcedure>) newValue);
			return;
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDINTERNMENT:
			getPrescribedinternment().clear();
			getPrescribedinternment().addAll((Collection<? extends PrescribedInternment>) newValue);
			return;
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDMEDICATION:
			getPrescribedmedication().clear();
			getPrescribedmedication().addAll((Collection<? extends PrescribedMedication>) newValue);
			return;
		case Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_EXAMINATION:
			getIdsPrescribedExamination().clear();
			getIdsPrescribedExamination().addAll((Collection<? extends Integer>) newValue);
			return;
		case Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_PROCEDURE:
			getIdsPrescribedProcedure().clear();
			getIdsPrescribedProcedure().addAll((Collection<? extends Integer>) newValue);
			return;
		case Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_INTERNMENT:
			getIdsPrescribedInternment().clear();
			getIdsPrescribedInternment().addAll((Collection<? extends Integer>) newValue);
			return;
		case Execution_metamodelPackage.TREATMENT__IDS_PRECRIBED_MEDICATION:
			getIdsPrecribedMedication().clear();
			getIdsPrecribedMedication().addAll((Collection<? extends Integer>) newValue);
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
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDEXAM:
			setPrescribedexam((PrescribedExamination) null);
			return;
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDPROCEDURE:
			getPrescribedprocedure().clear();
			return;
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDINTERNMENT:
			getPrescribedinternment().clear();
			return;
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDMEDICATION:
			getPrescribedmedication().clear();
			return;
		case Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_EXAMINATION:
			getIdsPrescribedExamination().clear();
			return;
		case Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_PROCEDURE:
			getIdsPrescribedProcedure().clear();
			return;
		case Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_INTERNMENT:
			getIdsPrescribedInternment().clear();
			return;
		case Execution_metamodelPackage.TREATMENT__IDS_PRECRIBED_MEDICATION:
			getIdsPrecribedMedication().clear();
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
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDEXAM:
			return prescribedexam != null;
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDPROCEDURE:
			return prescribedprocedure != null && !prescribedprocedure.isEmpty();
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDINTERNMENT:
			return prescribedinternment != null && !prescribedinternment.isEmpty();
		case Execution_metamodelPackage.TREATMENT__PRESCRIBEDMEDICATION:
			return prescribedmedication != null && !prescribedmedication.isEmpty();
		case Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_EXAMINATION:
			return idsPrescribedExamination != null && !idsPrescribedExamination.isEmpty();
		case Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_PROCEDURE:
			return idsPrescribedProcedure != null && !idsPrescribedProcedure.isEmpty();
		case Execution_metamodelPackage.TREATMENT__IDS_PRESCRIBED_INTERNMENT:
			return idsPrescribedInternment != null && !idsPrescribedInternment.isEmpty();
		case Execution_metamodelPackage.TREATMENT__IDS_PRECRIBED_MEDICATION:
			return idsPrecribedMedication != null && !idsPrecribedMedication.isEmpty();
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
		result.append(" (idsPrescribedExamination: ");
		result.append(idsPrescribedExamination);
		result.append(", idsPrescribedProcedure: ");
		result.append(idsPrescribedProcedure);
		result.append(", idsPrescribedInternment: ");
		result.append(idsPrescribedInternment);
		result.append(", idsPrecribedMedication: ");
		result.append(idsPrecribedMedication);
		result.append(')');
		return result.toString();
	}

} //TreatmentImpl
