/**
 */
package MetamodelExecution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EReferral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.EReferral#getEpathway <em>Epathway</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getEReferral()
 * @model
 * @generated
 */
public interface EReferral extends EStep {
	/**
	 * Returns the value of the '<em><b>Epathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Epathway</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epathway</em>' containment reference.
	 * @see #setEpathway(EPathway)
	 * @see MetamodelExecution.Execution_metamodelPackage#getEReferral_Epathway()
	 * @model containment="true"
	 * @generated
	 */
	EPathway getEpathway();

	/**
	 * Sets the value of the '{@link MetamodelExecution.EReferral#getEpathway <em>Epathway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epathway</em>' containment reference.
	 * @see #getEpathway()
	 * @generated
	 */
	void setEpathway(EPathway value);

} // EReferral
