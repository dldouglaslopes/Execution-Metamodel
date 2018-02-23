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
 * </ul>
 *
 * @generated
 */
public class TreatmentImpl extends CompleteStepImpl implements Treatment {
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
		}
		return super.eIsSet(featureID);
	}

} //TreatmentImpl
