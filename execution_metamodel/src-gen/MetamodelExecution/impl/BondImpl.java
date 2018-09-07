/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Bond;
import MetamodelExecution.Comorbidity;
import MetamodelExecution.Execution_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.BondImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.BondImpl#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.impl.BondImpl#getComorbidity <em>Comorbidity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BondImpl extends MinimalEObjectImpl.Container implements Bond {
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
	 * The cached value of the '{@link #getComorbidity() <em>Comorbidity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComorbidity()
	 * @generated
	 * @ordered
	 */
	protected Comorbidity comorbidity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BondImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.BOND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.BOND__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.BOND__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comorbidity getComorbidity() {
		return comorbidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComorbidity(Comorbidity newComorbidity, NotificationChain msgs) {
		Comorbidity oldComorbidity = comorbidity;
		comorbidity = newComorbidity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.BOND__COMORBIDITY, oldComorbidity, newComorbidity);
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
	public void setComorbidity(Comorbidity newComorbidity) {
		if (newComorbidity != comorbidity) {
			NotificationChain msgs = null;
			if (comorbidity != null)
				msgs = ((InternalEObject) comorbidity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.BOND__COMORBIDITY, null, msgs);
			if (newComorbidity != null)
				msgs = ((InternalEObject) newComorbidity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.BOND__COMORBIDITY, null, msgs);
			msgs = basicSetComorbidity(newComorbidity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.BOND__COMORBIDITY,
					newComorbidity, newComorbidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.BOND__COMORBIDITY:
			return basicSetComorbidity(null, msgs);
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
		case Execution_metamodelPackage.BOND__ID:
			return getId();
		case Execution_metamodelPackage.BOND__TYPE:
			return getType();
		case Execution_metamodelPackage.BOND__COMORBIDITY:
			return getComorbidity();
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
		case Execution_metamodelPackage.BOND__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.BOND__TYPE:
			setType((String) newValue);
			return;
		case Execution_metamodelPackage.BOND__COMORBIDITY:
			setComorbidity((Comorbidity) newValue);
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
		case Execution_metamodelPackage.BOND__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.BOND__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Execution_metamodelPackage.BOND__COMORBIDITY:
			setComorbidity((Comorbidity) null);
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
		case Execution_metamodelPackage.BOND__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.BOND__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case Execution_metamodelPackage.BOND__COMORBIDITY:
			return comorbidity != null;
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
		result.append(')');
		return result.toString();
	}

} //BondImpl
