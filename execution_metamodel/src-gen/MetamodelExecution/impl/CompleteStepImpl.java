/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.CompleteStep;
import MetamodelExecution.Creator;
import MetamodelExecution.Element;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Executor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.CompleteStepImpl#getStep <em>Step</em>}</li>
 *   <li>{@link MetamodelExecution.impl.CompleteStepImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link MetamodelExecution.impl.CompleteStepImpl#getExecutor <em>Executor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompleteStepImpl extends StepImpl implements CompleteStep {
	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected Element step;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected Creator creator;

	/**
	 * The cached value of the '{@link #getExecutor() <em>Executor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected Executor executor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompleteStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.COMPLETE_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(Element newStep, NotificationChain msgs) {
		Element oldStep = step;
		step = newStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLETE_STEP__STEP, oldStep, newStep);
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
	public void setStep(Element newStep) {
		if (newStep != step) {
			NotificationChain msgs = null;
			if (step != null)
				msgs = ((InternalEObject) step).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.COMPLETE_STEP__STEP, null, msgs);
			if (newStep != null)
				msgs = ((InternalEObject) newStep).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.COMPLETE_STEP__STEP, null, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.COMPLETE_STEP__STEP,
					newStep, newStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creator getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreator(Creator newCreator, NotificationChain msgs) {
		Creator oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLETE_STEP__CREATOR, oldCreator, newCreator);
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
	public void setCreator(Creator newCreator) {
		if (newCreator != creator) {
			NotificationChain msgs = null;
			if (creator != null)
				msgs = ((InternalEObject) creator).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.COMPLETE_STEP__CREATOR, null, msgs);
			if (newCreator != null)
				msgs = ((InternalEObject) newCreator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.COMPLETE_STEP__CREATOR, null, msgs);
			msgs = basicSetCreator(newCreator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.COMPLETE_STEP__CREATOR,
					newCreator, newCreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor getExecutor() {
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutor(Executor newExecutor, NotificationChain msgs) {
		Executor oldExecutor = executor;
		executor = newExecutor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.COMPLETE_STEP__EXECUTOR, oldExecutor, newExecutor);
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
	public void setExecutor(Executor newExecutor) {
		if (newExecutor != executor) {
			NotificationChain msgs = null;
			if (executor != null)
				msgs = ((InternalEObject) executor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.COMPLETE_STEP__EXECUTOR, null, msgs);
			if (newExecutor != null)
				msgs = ((InternalEObject) newExecutor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.COMPLETE_STEP__EXECUTOR, null, msgs);
			msgs = basicSetExecutor(newExecutor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.COMPLETE_STEP__EXECUTOR,
					newExecutor, newExecutor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.COMPLETE_STEP__STEP:
			return basicSetStep(null, msgs);
		case Execution_metamodelPackage.COMPLETE_STEP__CREATOR:
			return basicSetCreator(null, msgs);
		case Execution_metamodelPackage.COMPLETE_STEP__EXECUTOR:
			return basicSetExecutor(null, msgs);
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
		case Execution_metamodelPackage.COMPLETE_STEP__STEP:
			return getStep();
		case Execution_metamodelPackage.COMPLETE_STEP__CREATOR:
			return getCreator();
		case Execution_metamodelPackage.COMPLETE_STEP__EXECUTOR:
			return getExecutor();
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
		case Execution_metamodelPackage.COMPLETE_STEP__STEP:
			setStep((Element) newValue);
			return;
		case Execution_metamodelPackage.COMPLETE_STEP__CREATOR:
			setCreator((Creator) newValue);
			return;
		case Execution_metamodelPackage.COMPLETE_STEP__EXECUTOR:
			setExecutor((Executor) newValue);
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
		case Execution_metamodelPackage.COMPLETE_STEP__STEP:
			setStep((Element) null);
			return;
		case Execution_metamodelPackage.COMPLETE_STEP__CREATOR:
			setCreator((Creator) null);
			return;
		case Execution_metamodelPackage.COMPLETE_STEP__EXECUTOR:
			setExecutor((Executor) null);
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
		case Execution_metamodelPackage.COMPLETE_STEP__STEP:
			return step != null;
		case Execution_metamodelPackage.COMPLETE_STEP__CREATOR:
			return creator != null;
		case Execution_metamodelPackage.COMPLETE_STEP__EXECUTOR:
			return executor != null;
		}
		return super.eIsSet(featureID);
	}

} //CompleteStepImpl
