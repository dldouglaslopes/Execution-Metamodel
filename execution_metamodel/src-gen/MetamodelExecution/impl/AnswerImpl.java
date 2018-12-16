/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Answer;
import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Question;
import MetamodelExecution.UnitValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.AnswerImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.AnswerImpl#getType <em>Type</em>}</li>
 *   <li>{@link MetamodelExecution.impl.AnswerImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link MetamodelExecution.impl.AnswerImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link MetamodelExecution.impl.AnswerImpl#getUnitvalue <em>Unitvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnswerImpl extends MinimalEObjectImpl.Container implements Answer {
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
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected Question question;

	/**
	 * The default value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected String justification = JUSTIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnitvalue() <em>Unitvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitvalue()
	 * @generated
	 * @ordered
	 */
	protected UnitValue unitvalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.ANSWER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ANSWER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ANSWER__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestion(Question newQuestion, NotificationChain msgs) {
		Question oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.ANSWER__QUESTION, oldQuestion, newQuestion);
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
	public void setQuestion(Question newQuestion) {
		if (newQuestion != question) {
			NotificationChain msgs = null;
			if (question != null)
				msgs = ((InternalEObject) question).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.ANSWER__QUESTION, null, msgs);
			if (newQuestion != null)
				msgs = ((InternalEObject) newQuestion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.ANSWER__QUESTION, null, msgs);
			msgs = basicSetQuestion(newQuestion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ANSWER__QUESTION,
					newQuestion, newQuestion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJustification() {
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustification(String newJustification) {
		String oldJustification = justification;
		justification = newJustification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ANSWER__JUSTIFICATION,
					oldJustification, justification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitValue getUnitvalue() {
		return unitvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitvalue(UnitValue newUnitvalue, NotificationChain msgs) {
		UnitValue oldUnitvalue = unitvalue;
		unitvalue = newUnitvalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.ANSWER__UNITVALUE, oldUnitvalue, newUnitvalue);
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
	public void setUnitvalue(UnitValue newUnitvalue) {
		if (newUnitvalue != unitvalue) {
			NotificationChain msgs = null;
			if (unitvalue != null)
				msgs = ((InternalEObject) unitvalue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.ANSWER__UNITVALUE, null, msgs);
			if (newUnitvalue != null)
				msgs = ((InternalEObject) newUnitvalue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.ANSWER__UNITVALUE, null, msgs);
			msgs = basicSetUnitvalue(newUnitvalue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.ANSWER__UNITVALUE,
					newUnitvalue, newUnitvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.ANSWER__QUESTION:
			return basicSetQuestion(null, msgs);
		case Execution_metamodelPackage.ANSWER__UNITVALUE:
			return basicSetUnitvalue(null, msgs);
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
		case Execution_metamodelPackage.ANSWER__ID:
			return getId();
		case Execution_metamodelPackage.ANSWER__TYPE:
			return getType();
		case Execution_metamodelPackage.ANSWER__QUESTION:
			return getQuestion();
		case Execution_metamodelPackage.ANSWER__JUSTIFICATION:
			return getJustification();
		case Execution_metamodelPackage.ANSWER__UNITVALUE:
			return getUnitvalue();
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
		case Execution_metamodelPackage.ANSWER__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.ANSWER__TYPE:
			setType((String) newValue);
			return;
		case Execution_metamodelPackage.ANSWER__QUESTION:
			setQuestion((Question) newValue);
			return;
		case Execution_metamodelPackage.ANSWER__JUSTIFICATION:
			setJustification((String) newValue);
			return;
		case Execution_metamodelPackage.ANSWER__UNITVALUE:
			setUnitvalue((UnitValue) newValue);
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
		case Execution_metamodelPackage.ANSWER__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.ANSWER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Execution_metamodelPackage.ANSWER__QUESTION:
			setQuestion((Question) null);
			return;
		case Execution_metamodelPackage.ANSWER__JUSTIFICATION:
			setJustification(JUSTIFICATION_EDEFAULT);
			return;
		case Execution_metamodelPackage.ANSWER__UNITVALUE:
			setUnitvalue((UnitValue) null);
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
		case Execution_metamodelPackage.ANSWER__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.ANSWER__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case Execution_metamodelPackage.ANSWER__QUESTION:
			return question != null;
		case Execution_metamodelPackage.ANSWER__JUSTIFICATION:
			return JUSTIFICATION_EDEFAULT == null ? justification != null
					: !JUSTIFICATION_EDEFAULT.equals(justification);
		case Execution_metamodelPackage.ANSWER__UNITVALUE:
			return unitvalue != null;
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
		result.append(", justification: ");
		result.append(justification);
		result.append(')');
		return result.toString();
	}

} //AnswerImpl
