/**
 */
package MetamodelExecution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complementary Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelExecution.ComplementaryProcedure#getProcedureprescribedresource <em>Procedureprescribedresource</em>}</li>
 * </ul>
 *
 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryProcedure()
 * @model
 * @generated
 */
public interface ComplementaryProcedure extends ComplementaryConducts {
	/**
	 * Returns the value of the '<em><b>Procedureprescribedresource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedureprescribedresource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedureprescribedresource</em>' containment reference.
	 * @see #setProcedureprescribedresource(ProcedurePrescribedResource)
	 * @see MetamodelExecution.Execution_metamodelPackage#getComplementaryProcedure_Procedureprescribedresource()
	 * @model containment="true"
	 * @generated
	 */
	ProcedurePrescribedResource getProcedureprescribedresource();

	/**
	 * Sets the value of the '{@link MetamodelExecution.ComplementaryProcedure#getProcedureprescribedresource <em>Procedureprescribedresource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedureprescribedresource</em>' containment reference.
	 * @see #getProcedureprescribedresource()
	 * @generated
	 */
	void setProcedureprescribedresource(ProcedurePrescribedResource value);

} // ComplementaryProcedure
