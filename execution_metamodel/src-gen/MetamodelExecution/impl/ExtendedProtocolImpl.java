/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.ExecutionProtocol;
import MetamodelExecution.ExecutionStep;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.ExtendedProtocol;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import protocolosv2.impl.ProtocolImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ExtendedProtocolImpl#getExecutionprotocol <em>Executionprotocol</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ExtendedProtocolImpl#getExecutionstep <em>Executionstep</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedProtocolImpl extends ProtocolImpl implements ExtendedProtocol {
	/**
	 * The cached value of the '{@link #getExecutionprotocol() <em>Executionprotocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionprotocol()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionProtocol> executionprotocol;

	/**
	 * The cached value of the '{@link #getExecutionstep() <em>Executionstep</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionstep()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionStep> executionstep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.EXTENDED_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionProtocol> getExecutionprotocol() {
		if (executionprotocol == null) {
			executionprotocol = new EObjectContainmentEList<ExecutionProtocol>(ExecutionProtocol.class, this,
					Execution_metamodelPackage.EXTENDED_PROTOCOL__EXECUTIONPROTOCOL);
		}
		return executionprotocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionStep> getExecutionstep() {
		if (executionstep == null) {
			executionstep = new EObjectContainmentEList<ExecutionStep>(ExecutionStep.class, this,
					Execution_metamodelPackage.EXTENDED_PROTOCOL__EXECUTIONSTEP);
		}
		return executionstep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.EXTENDED_PROTOCOL__EXECUTIONPROTOCOL:
			return ((InternalEList<?>) getExecutionprotocol()).basicRemove(otherEnd, msgs);
		case Execution_metamodelPackage.EXTENDED_PROTOCOL__EXECUTIONSTEP:
			return ((InternalEList<?>) getExecutionstep()).basicRemove(otherEnd, msgs);
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
		case Execution_metamodelPackage.EXTENDED_PROTOCOL__EXECUTIONPROTOCOL:
			return getExecutionprotocol();
		case Execution_metamodelPackage.EXTENDED_PROTOCOL__EXECUTIONSTEP:
			return getExecutionstep();
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
		case Execution_metamodelPackage.EXTENDED_PROTOCOL__EXECUTIONPROTOCOL:
			getExecutionprotocol().clear();
			getExecutionprotocol().addAll((Collection<? extends ExecutionProtocol>) newValue);
			return;
		case Execution_metamodelPackage.EXTENDED_PROTOCOL__EXECUTIONSTEP:
			getExecutionstep().clear();
			getExecutionstep().addAll((Collection<? extends ExecutionStep>) newValue);
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
		case Execution_metamodelPackage.EXTENDED_PROTOCOL__EXECUTIONPROTOCOL:
			getExecutionprotocol().clear();
			return;
		case Execution_metamodelPackage.EXTENDED_PROTOCOL__EXECUTIONSTEP:
			getExecutionstep().clear();
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
		case Execution_metamodelPackage.EXTENDED_PROTOCOL__EXECUTIONPROTOCOL:
			return executionprotocol != null && !executionprotocol.isEmpty();
		case Execution_metamodelPackage.EXTENDED_PROTOCOL__EXECUTIONSTEP:
			return executionstep != null && !executionstep.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExtendedProtocolImpl
