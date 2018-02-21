/**
 */
package protocolosv2.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import protocolosv2.Protocol;
import protocolosv2.Protocolosv2Package;
import protocolosv2.Referral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referral</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link protocolosv2.impl.ReferralImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferralImpl extends ElementImpl implements Referral {
	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<Protocol> protocol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Protocolosv2Package.Literals.REFERRAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Protocol> getProtocol() {
		if (protocol == null) {
			protocol = new EObjectResolvingEList<Protocol>(Protocol.class, this,
					Protocolosv2Package.REFERRAL__PROTOCOL);
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Protocolosv2Package.REFERRAL__PROTOCOL:
			return getProtocol();
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
		case Protocolosv2Package.REFERRAL__PROTOCOL:
			getProtocol().clear();
			getProtocol().addAll((Collection<? extends Protocol>) newValue);
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
		case Protocolosv2Package.REFERRAL__PROTOCOL:
			getProtocol().clear();
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
		case Protocolosv2Package.REFERRAL__PROTOCOL:
			return protocol != null && !protocol.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReferralImpl
