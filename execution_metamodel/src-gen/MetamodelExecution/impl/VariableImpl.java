/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Bond;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Value;
import MetamodelExecution.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.VariableImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetamodelExecution.impl.VariableImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link MetamodelExecution.impl.VariableImpl#getValue <em>Value</em>}</li>
 *   <li>{@link MetamodelExecution.impl.VariableImpl#getBond <em>Bond</em>}</li>
 *   <li>{@link MetamodelExecution.impl.VariableImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

	/**
	 * The cached value of the '{@link #getBond() <em>Bond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBond()
	 * @generated
	 * @ordered
	 */
	protected Bond bond;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.VARIABLE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.VARIABLE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.VARIABLE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.VARIABLE__WEIGHT,
					oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Value newValue, NotificationChain msgs) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.VARIABLE__VALUE, oldValue, newValue);
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
	public void setValue(Value newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.VARIABLE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.VARIABLE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.VARIABLE__VALUE, newValue,
					newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bond getBond() {
		return bond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBond(Bond newBond, NotificationChain msgs) {
		Bond oldBond = bond;
		bond = newBond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.VARIABLE__BOND, oldBond, newBond);
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
	public void setBond(Bond newBond) {
		if (newBond != bond) {
			NotificationChain msgs = null;
			if (bond != null)
				msgs = ((InternalEObject) bond).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.VARIABLE__BOND, null, msgs);
			if (newBond != null)
				msgs = ((InternalEObject) newBond).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.VARIABLE__BOND, null, msgs);
			msgs = basicSetBond(newBond, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.VARIABLE__BOND, newBond,
					newBond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.VARIABLE__UNIT, oldUnit,
					unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.VARIABLE__VALUE:
			return basicSetValue(null, msgs);
		case Execution_metamodelPackage.VARIABLE__BOND:
			return basicSetBond(null, msgs);
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
		case Execution_metamodelPackage.VARIABLE__ID:
			return getId();
		case Execution_metamodelPackage.VARIABLE__TYPE:
			return getType();
		case Execution_metamodelPackage.VARIABLE__NAME:
			return getName();
		case Execution_metamodelPackage.VARIABLE__WEIGHT:
			return getWeight();
		case Execution_metamodelPackage.VARIABLE__VALUE:
			return getValue();
		case Execution_metamodelPackage.VARIABLE__BOND:
			return getBond();
		case Execution_metamodelPackage.VARIABLE__UNIT:
			return getUnit();
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
		case Execution_metamodelPackage.VARIABLE__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.VARIABLE__TYPE:
			setType((String) newValue);
			return;
		case Execution_metamodelPackage.VARIABLE__NAME:
			setName((String) newValue);
			return;
		case Execution_metamodelPackage.VARIABLE__WEIGHT:
			setWeight((Double) newValue);
			return;
		case Execution_metamodelPackage.VARIABLE__VALUE:
			setValue((Value) newValue);
			return;
		case Execution_metamodelPackage.VARIABLE__BOND:
			setBond((Bond) newValue);
			return;
		case Execution_metamodelPackage.VARIABLE__UNIT:
			setUnit((String) newValue);
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
		case Execution_metamodelPackage.VARIABLE__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.VARIABLE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Execution_metamodelPackage.VARIABLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Execution_metamodelPackage.VARIABLE__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case Execution_metamodelPackage.VARIABLE__VALUE:
			setValue((Value) null);
			return;
		case Execution_metamodelPackage.VARIABLE__BOND:
			setBond((Bond) null);
			return;
		case Execution_metamodelPackage.VARIABLE__UNIT:
			setUnit(UNIT_EDEFAULT);
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
		case Execution_metamodelPackage.VARIABLE__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.VARIABLE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case Execution_metamodelPackage.VARIABLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Execution_metamodelPackage.VARIABLE__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
		case Execution_metamodelPackage.VARIABLE__VALUE:
			return value != null;
		case Execution_metamodelPackage.VARIABLE__BOND:
			return bond != null;
		case Execution_metamodelPackage.VARIABLE__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
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
		result.append(", type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", weight: ");
		result.append(weight);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
