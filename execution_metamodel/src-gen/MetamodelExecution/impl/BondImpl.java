/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Bond;
import MetamodelExecution.Execution_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link MetamodelExecution.impl.BondImpl#getTruePremise <em>True Premise</em>}</li>
 *   <li>{@link MetamodelExecution.impl.BondImpl#getTruePremiseDisplay <em>True Premise Display</em>}</li>
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
	 * The default value of the '{@link #getTruePremise() <em>True Premise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruePremise()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUE_PREMISE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTruePremise() <em>True Premise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruePremise()
	 * @generated
	 * @ordered
	 */
	protected String truePremise = TRUE_PREMISE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTruePremiseDisplay() <em>True Premise Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruePremiseDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUE_PREMISE_DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTruePremiseDisplay() <em>True Premise Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTruePremiseDisplay()
	 * @generated
	 * @ordered
	 */
	protected String truePremiseDisplay = TRUE_PREMISE_DISPLAY_EDEFAULT;

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
	public String getTruePremise() {
		return truePremise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTruePremise(String newTruePremise) {
		String oldTruePremise = truePremise;
		truePremise = newTruePremise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.BOND__TRUE_PREMISE,
					oldTruePremise, truePremise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTruePremiseDisplay() {
		return truePremiseDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTruePremiseDisplay(String newTruePremiseDisplay) {
		String oldTruePremiseDisplay = truePremiseDisplay;
		truePremiseDisplay = newTruePremiseDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.BOND__TRUE_PREMISE_DISPLAY,
					oldTruePremiseDisplay, truePremiseDisplay));
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
		case Execution_metamodelPackage.BOND__TRUE_PREMISE:
			return getTruePremise();
		case Execution_metamodelPackage.BOND__TRUE_PREMISE_DISPLAY:
			return getTruePremiseDisplay();
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
		case Execution_metamodelPackage.BOND__TRUE_PREMISE:
			setTruePremise((String) newValue);
			return;
		case Execution_metamodelPackage.BOND__TRUE_PREMISE_DISPLAY:
			setTruePremiseDisplay((String) newValue);
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
		case Execution_metamodelPackage.BOND__TRUE_PREMISE:
			setTruePremise(TRUE_PREMISE_EDEFAULT);
			return;
		case Execution_metamodelPackage.BOND__TRUE_PREMISE_DISPLAY:
			setTruePremiseDisplay(TRUE_PREMISE_DISPLAY_EDEFAULT);
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
		case Execution_metamodelPackage.BOND__TRUE_PREMISE:
			return TRUE_PREMISE_EDEFAULT == null ? truePremise != null : !TRUE_PREMISE_EDEFAULT.equals(truePremise);
		case Execution_metamodelPackage.BOND__TRUE_PREMISE_DISPLAY:
			return TRUE_PREMISE_DISPLAY_EDEFAULT == null ? truePremiseDisplay != null
					: !TRUE_PREMISE_DISPLAY_EDEFAULT.equals(truePremiseDisplay);
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
		result.append(", truePremise: ");
		result.append(truePremise);
		result.append(", truePremiseDisplay: ");
		result.append(truePremiseDisplay);
		result.append(')');
		return result.toString();
	}

} //BondImpl
