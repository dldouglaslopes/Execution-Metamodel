/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Element;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Modeling;

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
 * An implementation of the model object '<em><b>Modeling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ModelingImpl#getElement <em>Element</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ModelingImpl#isCompleted <em>Completed</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ModelingImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ModelingImpl#getIdRepository <em>Id Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelingImpl extends ExecutionImpl implements Modeling {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> element;

	/**
	 * The default value of the '{@link #isCompleted() <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPLETED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCompleted() <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompleted()
	 * @generated
	 * @ordered
	 */
	protected boolean completed = COMPLETED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdRepository() <em>Id Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRepository()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_REPOSITORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdRepository() <em>Id Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRepository()
	 * @generated
	 * @ordered
	 */
	protected int idRepository = ID_REPOSITORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.MODELING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<Element>(Element.class, this,
					Execution_metamodelPackage.MODELING__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompleted() {
		return completed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleted(boolean newCompleted) {
		boolean oldCompleted = completed;
		completed = newCompleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MODELING__COMPLETED,
					oldCompleted, completed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MODELING__VERSION,
					oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdRepository() {
		return idRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdRepository(int newIdRepository) {
		int oldIdRepository = idRepository;
		idRepository = newIdRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.MODELING__ID_REPOSITORY,
					oldIdRepository, idRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.MODELING__ELEMENT:
			return ((InternalEList<?>) getElement()).basicRemove(otherEnd, msgs);
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
		case Execution_metamodelPackage.MODELING__ELEMENT:
			return getElement();
		case Execution_metamodelPackage.MODELING__COMPLETED:
			return isCompleted();
		case Execution_metamodelPackage.MODELING__VERSION:
			return getVersion();
		case Execution_metamodelPackage.MODELING__ID_REPOSITORY:
			return getIdRepository();
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
		case Execution_metamodelPackage.MODELING__ELEMENT:
			getElement().clear();
			getElement().addAll((Collection<? extends Element>) newValue);
			return;
		case Execution_metamodelPackage.MODELING__COMPLETED:
			setCompleted((Boolean) newValue);
			return;
		case Execution_metamodelPackage.MODELING__VERSION:
			setVersion((Integer) newValue);
			return;
		case Execution_metamodelPackage.MODELING__ID_REPOSITORY:
			setIdRepository((Integer) newValue);
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
		case Execution_metamodelPackage.MODELING__ELEMENT:
			getElement().clear();
			return;
		case Execution_metamodelPackage.MODELING__COMPLETED:
			setCompleted(COMPLETED_EDEFAULT);
			return;
		case Execution_metamodelPackage.MODELING__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case Execution_metamodelPackage.MODELING__ID_REPOSITORY:
			setIdRepository(ID_REPOSITORY_EDEFAULT);
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
		case Execution_metamodelPackage.MODELING__ELEMENT:
			return element != null && !element.isEmpty();
		case Execution_metamodelPackage.MODELING__COMPLETED:
			return completed != COMPLETED_EDEFAULT;
		case Execution_metamodelPackage.MODELING__VERSION:
			return version != VERSION_EDEFAULT;
		case Execution_metamodelPackage.MODELING__ID_REPOSITORY:
			return idRepository != ID_REPOSITORY_EDEFAULT;
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
		result.append(" (completed: ");
		result.append(completed);
		result.append(", version: ");
		result.append(version);
		result.append(", idRepository: ");
		result.append(idRepository);
		result.append(')');
		return result.toString();
	}

} //ModelingImpl
