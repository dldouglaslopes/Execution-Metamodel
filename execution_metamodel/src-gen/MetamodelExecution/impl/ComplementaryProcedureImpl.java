/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.ComplementaryProcedure;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.ProcedurePrescribedResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complementary Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ComplementaryProcedureImpl#getProcedureprescribedresource <em>Procedureprescribedresource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplementaryProcedureImpl extends ComplementaryConductsImpl implements ComplementaryProcedure {
	/**
	 * The cached value of the '{@link #getProcedureprescribedresource() <em>Procedureprescribedresource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureprescribedresource()
	 * @generated
	 * @ordered
	 */
	protected ProcedurePrescribedResource procedureprescribedresource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplementaryProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.COMPLEMENTARY_PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePrescribedResource getProcedureprescribedresource() {
		return procedureprescribedresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedureprescribedresource(
			ProcedurePrescribedResource newProcedureprescribedresource, NotificationChain msgs) {
		ProcedurePrescribedResource oldProcedureprescribedresource = procedureprescribedresource;
		procedureprescribedresource = newProcedureprescribedresource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENTARY_PROCEDURE__PROCEDUREPRESCRIBEDRESOURCE,
					oldProcedureprescribedresource, newProcedureprescribedresource);
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
	public void setProcedureprescribedresource(ProcedurePrescribedResource newProcedureprescribedresource) {
		if (newProcedureprescribedresource != procedureprescribedresource) {
			NotificationChain msgs = null;
			if (procedureprescribedresource != null)
				msgs = ((InternalEObject) procedureprescribedresource).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Execution_metamodelPackage.COMPLEMENTARY_PROCEDURE__PROCEDUREPRESCRIBEDRESOURCE,
						null, msgs);
			if (newProcedureprescribedresource != null)
				msgs = ((InternalEObject) newProcedureprescribedresource).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Execution_metamodelPackage.COMPLEMENTARY_PROCEDURE__PROCEDUREPRESCRIBEDRESOURCE,
						null, msgs);
			msgs = basicSetProcedureprescribedresource(newProcedureprescribedresource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLEMENTARY_PROCEDURE__PROCEDUREPRESCRIBEDRESOURCE,
					newProcedureprescribedresource, newProcedureprescribedresource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.COMPLEMENTARY_PROCEDURE__PROCEDUREPRESCRIBEDRESOURCE:
			return basicSetProcedureprescribedresource(null, msgs);
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
		case Execution_metamodelPackage.COMPLEMENTARY_PROCEDURE__PROCEDUREPRESCRIBEDRESOURCE:
			return getProcedureprescribedresource();
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
		case Execution_metamodelPackage.COMPLEMENTARY_PROCEDURE__PROCEDUREPRESCRIBEDRESOURCE:
			setProcedureprescribedresource((ProcedurePrescribedResource) newValue);
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
		case Execution_metamodelPackage.COMPLEMENTARY_PROCEDURE__PROCEDUREPRESCRIBEDRESOURCE:
			setProcedureprescribedresource((ProcedurePrescribedResource) null);
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
		case Execution_metamodelPackage.COMPLEMENTARY_PROCEDURE__PROCEDUREPRESCRIBEDRESOURCE:
			return procedureprescribedresource != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplementaryProcedureImpl
