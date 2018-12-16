/**
 */
package MetamodelExecution.impl;

import MetamodelExecution.Execution_metamodelPackage;
import MetamodelExecution.Question;
import MetamodelExecution.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.impl.QuestionImpl#getId <em>Id</em>}</li>
 *   <li>{@link MetamodelExecution.impl.QuestionImpl#getText <em>Text</em>}</li>
 *   <li>{@link MetamodelExecution.impl.QuestionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link MetamodelExecution.impl.QuestionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link MetamodelExecution.impl.QuestionImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link MetamodelExecution.impl.QuestionImpl#isNotApplied <em>Not Applied</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

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
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotApplied() <em>Not Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotApplied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_APPLIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotApplied() <em>Not Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotApplied()
	 * @generated
	 * @ordered
	 */
	protected boolean notApplied = NOT_APPLIED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Execution_metamodelPackage.Literals.QUESTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.QUESTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.QUESTION__TEXT, oldText,
					text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Execution_metamodelPackage.QUESTION__VARIABLE, oldVariable, newVariable);
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
	public void setVariable(Variable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject) variable).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.QUESTION__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject) newVariable).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Execution_metamodelPackage.QUESTION__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.QUESTION__VARIABLE,
					newVariable, newVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.QUESTION__CATEGORY,
					oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.QUESTION__ORDER, oldOrder,
					order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotApplied() {
		return notApplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotApplied(boolean newNotApplied) {
		boolean oldNotApplied = notApplied;
		notApplied = newNotApplied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Execution_metamodelPackage.QUESTION__NOT_APPLIED,
					oldNotApplied, notApplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Execution_metamodelPackage.QUESTION__VARIABLE:
			return basicSetVariable(null, msgs);
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
		case Execution_metamodelPackage.QUESTION__ID:
			return getId();
		case Execution_metamodelPackage.QUESTION__TEXT:
			return getText();
		case Execution_metamodelPackage.QUESTION__VARIABLE:
			return getVariable();
		case Execution_metamodelPackage.QUESTION__CATEGORY:
			return getCategory();
		case Execution_metamodelPackage.QUESTION__ORDER:
			return getOrder();
		case Execution_metamodelPackage.QUESTION__NOT_APPLIED:
			return isNotApplied();
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
		case Execution_metamodelPackage.QUESTION__ID:
			setId((Integer) newValue);
			return;
		case Execution_metamodelPackage.QUESTION__TEXT:
			setText((String) newValue);
			return;
		case Execution_metamodelPackage.QUESTION__VARIABLE:
			setVariable((Variable) newValue);
			return;
		case Execution_metamodelPackage.QUESTION__CATEGORY:
			setCategory((String) newValue);
			return;
		case Execution_metamodelPackage.QUESTION__ORDER:
			setOrder((Integer) newValue);
			return;
		case Execution_metamodelPackage.QUESTION__NOT_APPLIED:
			setNotApplied((Boolean) newValue);
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
		case Execution_metamodelPackage.QUESTION__ID:
			setId(ID_EDEFAULT);
			return;
		case Execution_metamodelPackage.QUESTION__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case Execution_metamodelPackage.QUESTION__VARIABLE:
			setVariable((Variable) null);
			return;
		case Execution_metamodelPackage.QUESTION__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case Execution_metamodelPackage.QUESTION__ORDER:
			setOrder(ORDER_EDEFAULT);
			return;
		case Execution_metamodelPackage.QUESTION__NOT_APPLIED:
			setNotApplied(NOT_APPLIED_EDEFAULT);
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
		case Execution_metamodelPackage.QUESTION__ID:
			return id != ID_EDEFAULT;
		case Execution_metamodelPackage.QUESTION__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		case Execution_metamodelPackage.QUESTION__VARIABLE:
			return variable != null;
		case Execution_metamodelPackage.QUESTION__CATEGORY:
			return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
		case Execution_metamodelPackage.QUESTION__ORDER:
			return order != ORDER_EDEFAULT;
		case Execution_metamodelPackage.QUESTION__NOT_APPLIED:
			return notApplied != NOT_APPLIED_EDEFAULT;
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
		result.append(", text: ");
		result.append(text);
		result.append(", category: ");
		result.append(category);
		result.append(", order: ");
		result.append(order);
		result.append(", notApplied: ");
		result.append(notApplied);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
