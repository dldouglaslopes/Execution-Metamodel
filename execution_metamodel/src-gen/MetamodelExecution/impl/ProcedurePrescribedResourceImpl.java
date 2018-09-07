/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.ProcedurePrescribedResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Prescribed Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.ProcedurePrescribedResourceImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedurePrescribedResourceImpl#getIdProcedure <em>Id Procedure</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedurePrescribedResourceImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedurePrescribedResourceImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedurePrescribedResourceImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link MetamodelExecution.impl.ProcedurePrescribedResourceImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedurePrescribedResourceImpl extends MinimalEObjectImpl.Container
		implements ProcedurePrescribedResource {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdProcedure() <em>Id Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProcedure()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PROCEDURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdProcedure() <em>Id Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProcedure()
	 * @generated
	 * @ordered
	 */
	protected int idProcedure = ID_PROCEDURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected int frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcedure() <em>Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEDURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected String procedure = PROCEDURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedurePrescribedResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.PROCEDURE_PRESCRIBED_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdProcedure() {
		return idProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdProcedure(int newIdProcedure) {
		int oldIdProcedure = idProcedure;
		idProcedure = newIdProcedure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__ID_PROCEDURE, oldIdProcedure,
					idProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(int newFrequency) {
		int oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedure(String newProcedure) {
		String oldProcedure = procedure;
		procedure = newProcedure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__PROCEDURE, oldProcedure, procedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__ID:
			return getId();
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__ID_PROCEDURE:
			return getIdProcedure();
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__QUANTITY:
			return getQuantity();
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__FREQUENCY:
			return getFrequency();
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__PROCEDURE:
			return getProcedure();
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__CATEGORY:
			return getCategory();
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
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__ID_PROCEDURE:
			setIdProcedure((Integer) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__FREQUENCY:
			setFrequency((Integer) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__PROCEDURE:
			setProcedure((String) newValue);
			return;
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__CATEGORY:
			setCategory((String) newValue);
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
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__ID_PROCEDURE:
			setIdProcedure(ID_PROCEDURE_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__FREQUENCY:
			setFrequency(FREQUENCY_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__PROCEDURE:
			setProcedure(PROCEDURE_EDEFAULT);
			return;
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
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
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__ID_PROCEDURE:
			return idProcedure != ID_PROCEDURE_EDEFAULT;
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__FREQUENCY:
			return frequency != FREQUENCY_EDEFAULT;
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__PROCEDURE:
			return PROCEDURE_EDEFAULT == null ? procedure != null : !PROCEDURE_EDEFAULT.equals(procedure);
		case Execution_metamodelPackage.PROCEDURE_PRESCRIBED_RESOURCE__CATEGORY:
			return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", idProcedure: ");
		result.append(idProcedure);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", procedure: ");
		result.append(procedure);
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //ProcedurePrescribedResourceImpl
