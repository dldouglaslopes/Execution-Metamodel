/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.ETreatment;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.PExamination;
import MetamodelExecution.PInternment;
import MetamodelExecution.PMedication;
import MetamodelExecution.PProcedure;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETreatment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ETreatmentImpl#getPexamination <em>Pexamination</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ETreatmentImpl#getPprocedure <em>Pprocedure</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ETreatmentImpl#getPinternment <em>Pinternment</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ETreatmentImpl#getPmedication <em>Pmedication</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ETreatmentImpl#getIdsPExamination <em>Ids PExamination</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ETreatmentImpl#getIdsPProcedure <em>Ids PProcedure</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ETreatmentImpl#getIdsPInternment <em>Ids PInternment</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ETreatmentImpl#getIdsPMedication <em>Ids PMedication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETreatmentImpl extends EStepImpl implements ETreatment {
	/**
	 * The cached value of the '{@link #getPexamination() <em>Pexamination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPexamination()
	 * @generated
	 * @ordered
	 */
	protected EList<PExamination> pexamination;

	/**
	 * The cached value of the '{@link #getPprocedure() <em>Pprocedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPprocedure()
	 * @generated
	 * @ordered
	 */
	protected EList<PProcedure> pprocedure;

	/**
	 * The cached value of the '{@link #getPinternment() <em>Pinternment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinternment()
	 * @generated
	 * @ordered
	 */
	protected EList<PInternment> pinternment;

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
	 * The cached value of the '{@link #getIdsPExamination() <em>Ids PExamination</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdsPExamination()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> idsPExamination;

	/**
	 * The cached value of the '{@link #getIdsPProcedure() <em>Ids PProcedure</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdsPProcedure()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> idsPProcedure;

	/**
	 * The cached value of the '{@link #getIdsPInternment() <em>Ids PInternment</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdsPInternment()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> idsPInternment;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETreatmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.ETREATMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PExamination> getPexamination() {
		if (pexamination == null) {
			pexamination = new EObjectContainmentEList<PExamination>(PExamination.class, this,
					Execution_metamodelPackage.ETREATMENT__PEXAMINATION);
		}
		return pexamination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PProcedure> getPprocedure() {
		if (pprocedure == null) {
			pprocedure = new EObjectContainmentEList<PProcedure>(PProcedure.class, this,
					Execution_metamodelPackage.ETREATMENT__PPROCEDURE);
		}
		return pprocedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PInternment> getPinternment() {
		if (pinternment == null) {
			pinternment = new EObjectContainmentEList<PInternment>(PInternment.class, this,
					Execution_metamodelPackage.ETREATMENT__PINTERNMENT);
		}
		return pinternment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PMedication> getPmedication() {
		if (pmedication == null) {
			pmedication = new EObjectContainmentEList<PMedication>(PMedication.class, this,
					Execution_metamodelPackage.ETREATMENT__PMEDICATION);
		}
		return pmedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIdsPExamination() {
		if (idsPExamination == null) {
			idsPExamination = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					Execution_metamodelPackage.ETREATMENT__IDS_PEXAMINATION);
		}
		return idsPExamination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIdsPProcedure() {
		if (idsPProcedure == null) {
			idsPProcedure = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					Execution_metamodelPackage.ETREATMENT__IDS_PPROCEDURE);
		}
		return idsPProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIdsPInternment() {
		if (idsPInternment == null) {
			idsPInternment = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					Execution_metamodelPackage.ETREATMENT__IDS_PINTERNMENT);
		}
		return idsPInternment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIdsPMedication() {
		if (idsPMedication == null) {
			idsPMedication = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					Execution_metamodelPackage.ETREATMENT__IDS_PMEDICATION);
		}
		return idsPMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.ETREATMENT__PEXAMINATION:
			return ((InternalEList<?>) getPexamination()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.ETREATMENT__PPROCEDURE:
			return ((InternalEList<?>) getPprocedure()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.ETREATMENT__PINTERNMENT:
			return ((InternalEList<?>) getPinternment()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.ETREATMENT__PMEDICATION:
			return ((InternalEList<?>) getPmedication()).basicRemove(otherEnd, msgs);
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
		case Execution_metamodelPackage.ETREATMENT__PEXAMINATION:
			return getPexamination();
		case Execution_metamodelPackage.ETREATMENT__PPROCEDURE:
			return getPprocedure();
		case Execution_metamodelPackage.ETREATMENT__PINTERNMENT:
			return getPinternment();
		case Execution_metamodelPackage.ETREATMENT__PMEDICATION:
			return getPmedication();
		case Execution_metamodelPackage.ETREATMENT__IDS_PEXAMINATION:
			return getIdsPExamination();
		case Execution_metamodelPackage.ETREATMENT__IDS_PPROCEDURE:
			return getIdsPProcedure();
		case Execution_metamodelPackage.ETREATMENT__IDS_PINTERNMENT:
			return getIdsPInternment();
		case Execution_metamodelPackage.ETREATMENT__IDS_PMEDICATION:
			return getIdsPMedication();
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
		case Execution_metamodelPackage.ETREATMENT__PEXAMINATION:
			getPexamination().clear();
			getPexamination().addAll((Collection<? extends PExamination>) newValue);
			return;
		case Execution_metamodelPackage.ETREATMENT__PPROCEDURE:
			getPprocedure().clear();
			getPprocedure().addAll((Collection<? extends PProcedure>) newValue);
			return;
		case Execution_metamodelPackage.ETREATMENT__PINTERNMENT:
			getPinternment().clear();
			getPinternment().addAll((Collection<? extends PInternment>) newValue);
			return;
		case Execution_metamodelPackage.ETREATMENT__PMEDICATION:
			getPmedication().clear();
			getPmedication().addAll((Collection<? extends PMedication>) newValue);
			return;
		case Execution_metamodelPackage.ETREATMENT__IDS_PEXAMINATION:
			getIdsPExamination().clear();
			getIdsPExamination().addAll((Collection<? extends Integer>) newValue);
			return;
		case Execution_metamodelPackage.ETREATMENT__IDS_PPROCEDURE:
			getIdsPProcedure().clear();
			getIdsPProcedure().addAll((Collection<? extends Integer>) newValue);
			return;
		case Execution_metamodelPackage.ETREATMENT__IDS_PINTERNMENT:
			getIdsPInternment().clear();
			getIdsPInternment().addAll((Collection<? extends Integer>) newValue);
			return;
		case Execution_metamodelPackage.ETREATMENT__IDS_PMEDICATION:
			getIdsPMedication().clear();
			getIdsPMedication().addAll((Collection<? extends Integer>) newValue);
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
		case Execution_metamodelPackage.ETREATMENT__PEXAMINATION:
			getPexamination().clear();
			return;
		case Execution_metamodelPackage.ETREATMENT__PPROCEDURE:
			getPprocedure().clear();
			return;
		case Execution_metamodelPackage.ETREATMENT__PINTERNMENT:
			getPinternment().clear();
			return;
		case Execution_metamodelPackage.ETREATMENT__PMEDICATION:
			getPmedication().clear();
			return;
		case Execution_metamodelPackage.ETREATMENT__IDS_PEXAMINATION:
			getIdsPExamination().clear();
			return;
		case Execution_metamodelPackage.ETREATMENT__IDS_PPROCEDURE:
			getIdsPProcedure().clear();
			return;
		case Execution_metamodelPackage.ETREATMENT__IDS_PINTERNMENT:
			getIdsPInternment().clear();
			return;
		case Execution_metamodelPackage.ETREATMENT__IDS_PMEDICATION:
			getIdsPMedication().clear();
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
		case Execution_metamodelPackage.ETREATMENT__PEXAMINATION:
			return pexamination != null && !pexamination.isEmpty();
		case Execution_metamodelPackage.ETREATMENT__PPROCEDURE:
			return pprocedure != null && !pprocedure.isEmpty();
		case Execution_metamodelPackage.ETREATMENT__PINTERNMENT:
			return pinternment != null && !pinternment.isEmpty();
		case Execution_metamodelPackage.ETREATMENT__PMEDICATION:
			return pmedication != null && !pmedication.isEmpty();
		case Execution_metamodelPackage.ETREATMENT__IDS_PEXAMINATION:
			return idsPExamination != null && !idsPExamination.isEmpty();
		case Execution_metamodelPackage.ETREATMENT__IDS_PPROCEDURE:
			return idsPProcedure != null && !idsPProcedure.isEmpty();
		case Execution_metamodelPackage.ETREATMENT__IDS_PINTERNMENT:
			return idsPInternment != null && !idsPInternment.isEmpty();
		case Execution_metamodelPackage.ETREATMENT__IDS_PMEDICATION:
			return idsPMedication != null && !idsPMedication.isEmpty();
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
		result.append(" (idsPExamination: ");
		result.append(idsPExamination);
		result.append(", idsPProcedure: ");
		result.append(idsPProcedure);
		result.append(", idsPInternment: ");
		result.append(idsPInternment);
		result.append(", idsPMedication: ");
		result.append(idsPMedication);
		result.append(')');
		return result.toString();
	}

} //ETreatmentImpl
