/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MetamodelExecution.Execution_metamodelFactory
 * @model kind="package"
 * @generated
 */
public interface Execution_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MetamodelExecution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/MetamodelExecution";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MetamodelExecution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Execution_metamodelPackage eINSTANCE = MetamodelExecution.impl.Execution_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.EElementImpl <em>EElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.EElementImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEElement()
	 * @generated
	 */
	int EELEMENT = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__TYPE_VERBOSE = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__URL = 3;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__IS_CURRENT = 4;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__REWORKED = 5;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__EXECUTED = 6;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__CREATION_DATE = 7;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__MODIFICATION_DATE = 8;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__EXECUTION_DATE = 9;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__CREATED_BY_ID = 10;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__EXECUTED_BY_ID = 11;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__ID_STEP = 12;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__JUSTIFICATION = 13;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__STEP = 14;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__CREATOR = 15;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__EXECUTOR = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__NAME = 17;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__PREVIOUS = 18;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT__NEXT = 19;

	/**
	 * The number of structural features of the '<em>EElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>EElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.EAuxiliaryConductImpl <em>EAuxiliary Conduct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.EAuxiliaryConductImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEAuxiliaryConduct()
	 * @generated
	 */
	int EAUXILIARY_CONDUCT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__ID = EELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__TYPE = EELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__TYPE_VERBOSE = EELEMENT__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__URL = EELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__IS_CURRENT = EELEMENT__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__REWORKED = EELEMENT__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__EXECUTED = EELEMENT__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__CREATION_DATE = EELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__MODIFICATION_DATE = EELEMENT__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__EXECUTION_DATE = EELEMENT__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__CREATED_BY_ID = EELEMENT__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__EXECUTED_BY_ID = EELEMENT__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__ID_STEP = EELEMENT__ID_STEP;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__JUSTIFICATION = EELEMENT__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__STEP = EELEMENT__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__CREATOR = EELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__EXECUTOR = EELEMENT__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__NAME = EELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__PREVIOUS = EELEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__NEXT = EELEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__ANSWER = EELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EAuxiliary Conduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT_FEATURE_COUNT = EELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EAuxiliary Conduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT_OPERATION_COUNT = EELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.EInformationImpl <em>EInformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.EInformationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEInformation()
	 * @generated
	 */
	int EINFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__ID = EELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__TYPE = EELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__TYPE_VERBOSE = EELEMENT__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__URL = EELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__IS_CURRENT = EELEMENT__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__REWORKED = EELEMENT__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__EXECUTED = EELEMENT__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__CREATION_DATE = EELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__MODIFICATION_DATE = EELEMENT__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__EXECUTION_DATE = EELEMENT__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__CREATED_BY_ID = EELEMENT__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__EXECUTED_BY_ID = EELEMENT__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__ID_STEP = EELEMENT__ID_STEP;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__JUSTIFICATION = EELEMENT__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__STEP = EELEMENT__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__CREATOR = EELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__EXECUTOR = EELEMENT__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__NAME = EELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__PREVIOUS = EELEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__NEXT = EELEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>EInformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION_FEATURE_COUNT = EELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EInformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION_OPERATION_COUNT = EELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.EDischargeImpl <em>EDischarge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.EDischargeImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEDischarge()
	 * @generated
	 */
	int EDISCHARGE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__ID = EELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__TYPE = EELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__TYPE_VERBOSE = EELEMENT__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__URL = EELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__IS_CURRENT = EELEMENT__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__REWORKED = EELEMENT__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__EXECUTED = EELEMENT__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__CREATION_DATE = EELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__MODIFICATION_DATE = EELEMENT__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__EXECUTION_DATE = EELEMENT__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__CREATED_BY_ID = EELEMENT__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__EXECUTED_BY_ID = EELEMENT__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__ID_STEP = EELEMENT__ID_STEP;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__JUSTIFICATION = EELEMENT__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__STEP = EELEMENT__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__CREATOR = EELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__EXECUTOR = EELEMENT__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__NAME = EELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__PREVIOUS = EELEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__NEXT = EELEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>EDischarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE_FEATURE_COUNT = EELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EDischarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE_OPERATION_COUNT = EELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.EReferralImpl <em>EReferral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.EReferralImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEReferral()
	 * @generated
	 */
	int EREFERRAL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__ID = EELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__TYPE = EELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__TYPE_VERBOSE = EELEMENT__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__URL = EELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__IS_CURRENT = EELEMENT__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__REWORKED = EELEMENT__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__EXECUTED = EELEMENT__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__CREATION_DATE = EELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__MODIFICATION_DATE = EELEMENT__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__EXECUTION_DATE = EELEMENT__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__CREATED_BY_ID = EELEMENT__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__EXECUTED_BY_ID = EELEMENT__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__ID_STEP = EELEMENT__ID_STEP;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__JUSTIFICATION = EELEMENT__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__STEP = EELEMENT__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__CREATOR = EELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__EXECUTOR = EELEMENT__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__NAME = EELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__PREVIOUS = EELEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__NEXT = EELEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>EReferral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL_FEATURE_COUNT = EELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EReferral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL_OPERATION_COUNT = EELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.EPrescriptionImpl <em>EPrescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.EPrescriptionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEPrescription()
	 * @generated
	 */
	int EPRESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__ID = EELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__TYPE = EELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__TYPE_VERBOSE = EELEMENT__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__URL = EELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__IS_CURRENT = EELEMENT__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__REWORKED = EELEMENT__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__EXECUTED = EELEMENT__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__CREATION_DATE = EELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__MODIFICATION_DATE = EELEMENT__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__EXECUTION_DATE = EELEMENT__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__CREATED_BY_ID = EELEMENT__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__EXECUTED_BY_ID = EELEMENT__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__ID_STEP = EELEMENT__ID_STEP;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__JUSTIFICATION = EELEMENT__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__STEP = EELEMENT__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__CREATOR = EELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__EXECUTOR = EELEMENT__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__NAME = EELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__PREVIOUS = EELEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__NEXT = EELEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__TEXT = EELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prescribedprescriptionitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM = EELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ids Prescribed Medication</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__IDS_PRESCRIBED_MEDICATION = EELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ids Prescribed Prescription Item</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__IDS_PRESCRIBED_PRESCRIPTION_ITEM = EELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prescription</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__PRESCRIPTION = EELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prescribedmedication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__PRESCRIBEDMEDICATION = EELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EPrescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION_FEATURE_COUNT = EELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>EPrescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION_OPERATION_COUNT = EELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ETreatmentImpl <em>ETreatment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ETreatmentImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getETreatment()
	 * @generated
	 */
	int ETREATMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__ID = EELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__TYPE = EELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__TYPE_VERBOSE = EELEMENT__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__URL = EELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__IS_CURRENT = EELEMENT__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__REWORKED = EELEMENT__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__EXECUTED = EELEMENT__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__CREATION_DATE = EELEMENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__MODIFICATION_DATE = EELEMENT__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__EXECUTION_DATE = EELEMENT__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__CREATED_BY_ID = EELEMENT__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__EXECUTED_BY_ID = EELEMENT__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__ID_STEP = EELEMENT__ID_STEP;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__JUSTIFICATION = EELEMENT__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__STEP = EELEMENT__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__CREATOR = EELEMENT__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__EXECUTOR = EELEMENT__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__NAME = EELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__PREVIOUS = EELEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__NEXT = EELEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Prescribedexam</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__PRESCRIBEDEXAM = EELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prescribedprocedure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__PRESCRIBEDPROCEDURE = EELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prescribedinternment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__PRESCRIBEDINTERNMENT = EELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prescribedmedication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__PRESCRIBEDMEDICATION = EELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ids Prescribed Examination</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__IDS_PRESCRIBED_EXAMINATION = EELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ids Prescribed Procedure</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__IDS_PRESCRIBED_PROCEDURE = EELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ids Prescribed Internment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__IDS_PRESCRIBED_INTERNMENT = EELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ids Prescribed Medication</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__IDS_PRESCRIBED_MEDICATION = EELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ETreatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT_FEATURE_COUNT = EELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>ETreatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT_OPERATION_COUNT = EELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ExaminationImpl <em>Examination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ExaminationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExamination()
	 * @generated
	 */
	int EXAMINATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__URL = 1;

	/**
	 * The feature id for the '<em><b>Id Examination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__ID_EXAMINATION = 2;

	/**
	 * The feature id for the '<em><b>Side Limb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__SIDE_LIMB = 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__JUSTIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Clinical Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__CLINICAL_INDICATION = 6;

	/**
	 * The feature id for the '<em><b>Side Limb Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__SIDE_LIMB_DISPLAY = 7;

	/**
	 * The feature id for the '<em><b>Exam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__EXAM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__NAME = 9;

	/**
	 * The number of structural features of the '<em>Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PrescribedExaminationImpl <em>Prescribed Examination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PrescribedExaminationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescribedExamination()
	 * @generated
	 */
	int PRESCRIBED_EXAMINATION = 7;

	/**
	 * The feature id for the '<em><b>Examination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION__EXAMINATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION__REPORT = 2;

	/**
	 * The feature id for the '<em><b>Number Guide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION__NUMBER_GUIDE = 3;

	/**
	 * The feature id for the '<em><b>Complement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION__COMPLEMENT = 4;

	/**
	 * The feature id for the '<em><b>Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION__PRESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION__NAME = 6;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION__RESULT = 7;

	/**
	 * The number of structural features of the '<em>Prescribed Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Prescribed Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ExamImpl <em>Exam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ExamImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExam()
	 * @generated
	 */
	int EXAM = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__ID = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__URL = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__CODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__NAME = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Only Emergency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__ONLY_EMERGENCY = 5;

	/**
	 * The feature id for the '<em><b>Member Peers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__MEMBER_PEERS = 6;

	/**
	 * The number of structural features of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PrescribedProcedureImpl <em>Prescribed Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PrescribedProcedureImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescribedProcedure()
	 * @generated
	 */
	int PRESCRIBED_PROCEDURE = 9;

	/**
	 * The number of structural features of the '<em>Prescribed Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_PROCEDURE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Prescribed Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_PROCEDURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PrescribedInternmentImpl <em>Prescribed Internment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PrescribedInternmentImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescribedInternment()
	 * @generated
	 */
	int PRESCRIBED_INTERNMENT = 10;

	/**
	 * The number of structural features of the '<em>Prescribed Internment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_INTERNMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Prescribed Internment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_INTERNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PrescribedMedicationImpl <em>Prescribed Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PrescribedMedicationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescribedMedication()
	 * @generated
	 */
	int PRESCRIBED_MEDICATION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_MEDICATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_MEDICATION__RESULT = 1;

	/**
	 * The feature id for the '<em><b>Medicament</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_MEDICATION__MEDICAMENT = 2;

	/**
	 * The feature id for the '<em><b>Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_MEDICATION__PRESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Prescribed Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_MEDICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Prescribed Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_MEDICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ComplementImpl <em>Complement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ComplementImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getComplement()
	 * @generated
	 */
	int COMPLEMENT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Side Limb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__SIDE_LIMB = 1;

	/**
	 * The feature id for the '<em><b>Side Limb Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__SIDE_LIMB_DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Clinical Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__CLINICAL_INDICATION = 3;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__JUSTIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__QUANTITY = 5;

	/**
	 * The number of structural features of the '<em>Complement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Complement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PrescribedPrescriptionItemImpl <em>Prescribed Prescription Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PrescribedPrescriptionItemImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescribedPrescriptionItem()
	 * @generated
	 */
	int PRESCRIBED_PRESCRIPTION_ITEM = 13;

	/**
	 * The number of structural features of the '<em>Prescribed Prescription Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_PRESCRIPTION_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Prescribed Prescription Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_PRESCRIPTION_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.JustificationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__REASON = 1;

	/**
	 * The feature id for the '<em><b>Reason Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__REASON_DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Justified By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__JUSTIFIED_BY_ID = 4;

	/**
	 * The feature id for the '<em><b>Justified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__JUSTIFIED_BY = 5;

	/**
	 * The number of structural features of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PathwayImpl <em>Pathway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PathwayImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPathway()
	 * @generated
	 */
	int PATHWAY = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__ID = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__URL = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__CODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__COMPLETED = 5;

	/**
	 * The feature id for the '<em><b>Id Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__ID_REPOSITORY = 6;

	/**
	 * The number of structural features of the '<em>Pathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Pathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.UserImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__URL = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CODE = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 4;

	/**
	 * The feature id for the '<em><b>Type Council</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TYPE_COUNCIL = 5;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOGIN = 6;

	/**
	 * The feature id for the '<em><b>Number Council</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NUMBER_COUNCIL = 7;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__STATE = 8;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ResponsibleImpl <em>Responsible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ResponsibleImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getResponsible()
	 * @generated
	 */
	int RESPONSIBLE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE__URL = USER__URL;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE__CODE = USER__CODE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Type Council</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE__TYPE_COUNCIL = USER__TYPE_COUNCIL;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE__LOGIN = USER__LOGIN;

	/**
	 * The feature id for the '<em><b>Number Council</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE__NUMBER_COUNCIL = USER__NUMBER_COUNCIL;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE__STATE = USER__STATE;

	/**
	 * The number of structural features of the '<em>Responsible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Responsible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ValueImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 18;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.AnswerImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__TYPE_VERBOSE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__QUESTION = 4;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.NumericImpl <em>Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.NumericImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getNumeric()
	 * @generated
	 */
	int NUMERIC = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.YesOrNoImpl <em>Yes Or No</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.YesOrNoImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getYesOrNo()
	 * @generated
	 */
	int YES_OR_NO = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_OR_NO__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Yes Or No</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_OR_NO_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Yes Or No</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_OR_NO_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.StepImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TYPE_VERBOSE = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__URL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IS_INITIAL = 6;

	/**
	 * The feature id for the '<em><b>Is Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IS_TERMINAL = 7;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MANDATORY = 8;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.CreatorImpl <em>Creator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.CreatorImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getCreator()
	 * @generated
	 */
	int CREATOR = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__URL = USER__URL;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__CODE = USER__CODE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Type Council</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__TYPE_COUNCIL = USER__TYPE_COUNCIL;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__LOGIN = USER__LOGIN;

	/**
	 * The feature id for the '<em><b>Number Council</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__NUMBER_COUNCIL = USER__NUMBER_COUNCIL;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__STATE = USER__STATE;

	/**
	 * The number of structural features of the '<em>Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ExecutorImpl <em>Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ExecutorImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExecutor()
	 * @generated
	 */
	int EXECUTOR = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__URL = USER__URL;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__CODE = USER__CODE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Type Council</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__TYPE_COUNCIL = USER__TYPE_COUNCIL;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__LOGIN = USER__LOGIN;

	/**
	 * The feature id for the '<em><b>Number Council</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__NUMBER_COUNCIL = USER__NUMBER_COUNCIL;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__STATE = USER__STATE;

	/**
	 * The number of structural features of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.LastProfessionalImpl <em>Last Professional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.LastProfessionalImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getLastProfessional()
	 * @generated
	 */
	int LAST_PROFESSIONAL = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL__URL = USER__URL;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL__CODE = USER__CODE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Type Council</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL__TYPE_COUNCIL = USER__TYPE_COUNCIL;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL__LOGIN = USER__LOGIN;

	/**
	 * The feature id for the '<em><b>Number Council</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL__NUMBER_COUNCIL = USER__NUMBER_COUNCIL;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL__STATE = USER__STATE;

	/**
	 * The number of structural features of the '<em>Last Professional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Last Professional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PrescriptionImpl <em>Prescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PrescriptionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescription()
	 * @generated
	 */
	int PRESCRIPTION = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__SUCCESS = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__REQUEST_DATE = 3;

	/**
	 * The number of structural features of the '<em>Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.EPathwayImpl <em>EPathway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.EPathwayImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEPathway()
	 * @generated
	 */
	int EPATHWAY = 28;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__ID = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__URL = 2;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__CREATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Conclusion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__CONCLUSION_DATE = 4;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__COMPLETED = 5;

	/**
	 * The feature id for the '<em><b>Aborted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__ABORTED = 6;

	/**
	 * The feature id for the '<em><b>Last Executed Step Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__LAST_EXECUTED_STEP_DATE = 7;

	/**
	 * The feature id for the '<em><b>Id Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__ID_PATHWAY = 8;

	/**
	 * The feature id for the '<em><b>Id Last Professional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__ID_LAST_PROFESSIONAL = 9;

	/**
	 * The feature id for the '<em><b>Id Responsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__ID_RESPONSIBLE = 10;

	/**
	 * The feature id for the '<em><b>Ids Executed Step</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__IDS_EXECUTED_STEP = 11;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__PATHWAY = 12;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__RESPONSIBLE = 13;

	/**
	 * The feature id for the '<em><b>Lastprofessional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__LASTPROFESSIONAL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__NAME = 15;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__JUSTIFICATION = 16;

	/**
	 * The number of structural features of the '<em>EPathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>EPathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.QuestionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__URL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Id Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ID_CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CATEGORY = 5;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.VariableImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE_VERBOSE = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__URL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__WEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 6;

	/**
	 * The feature id for the '<em><b>Bond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__BOND = 7;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.MedicamentImpl <em>Medicament</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.MedicamentImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getMedicament()
	 * @generated
	 */
	int MEDICAMENT = 31;

	/**
	 * The feature id for the '<em><b>Medicine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__MEDICINE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Access</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__URL = 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__CODE = 6;

	/**
	 * The feature id for the '<em><b>Id Medicament</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__ID_MEDICAMENT = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__BRAND = 9;

	/**
	 * The feature id for the '<em><b>Outpatient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__OUTPATIENT = 10;

	/**
	 * The feature id for the '<em><b>Id Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__ID_UNIT = 11;

	/**
	 * The feature id for the '<em><b>Id Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__ID_ACCESS = 12;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__STANDARD = 13;

	/**
	 * The feature id for the '<em><b>Daily Dosage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__DAILY_DOSAGE = 14;

	/**
	 * The feature id for the '<em><b>Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__CYCLES = 15;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__FREQUENCY = 16;

	/**
	 * The feature id for the '<em><b>Frequency Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__FREQUENCY_DISPLAY = 17;

	/**
	 * The feature id for the '<em><b>Time Treatement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__TIME_TREATEMENT = 18;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT__TIME_INTERVAL = 19;

	/**
	 * The number of structural features of the '<em>Medicament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Medicament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.MedicineImpl <em>Medicine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.MedicineImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getMedicine()
	 * @generated
	 */
	int MEDICINE = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE__URL = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE__CODE = 3;

	/**
	 * The feature id for the '<em><b>Outpatient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE__OUTPATIENT = 4;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE__BRAND = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE__DESCRIPTION = 6;

	/**
	 * The number of structural features of the '<em>Medicine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Medicine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.UnitImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__URL = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__CODE = 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__UNIT = 4;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.AccessImpl <em>Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.AccessImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getAccess()
	 * @generated
	 */
	int ACCESS = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__URL = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__CODE = 3;

	/**
	 * The number of structural features of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.SequenceImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 35;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__URL = 0;

	/**
	 * The feature id for the '<em><b>Url Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__URL_ABSOLUTE = 1;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PreviousImpl <em>Previous</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PreviousImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrevious()
	 * @generated
	 */
	int PREVIOUS = 36;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS__URL = SEQUENCE__URL;

	/**
	 * The feature id for the '<em><b>Url Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS__URL_ABSOLUTE = SEQUENCE__URL_ABSOLUTE;

	/**
	 * The number of structural features of the '<em>Previous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Previous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_OPERATION_COUNT = SEQUENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.NextImpl <em>Next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.NextImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getNext()
	 * @generated
	 */
	int NEXT = 37;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__URL = SEQUENCE__URL;

	/**
	 * The feature id for the '<em><b>Url Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__URL_ABSOLUTE = SEQUENCE__URL_ABSOLUTE;

	/**
	 * The number of structural features of the '<em>Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_OPERATION_COUNT = SEQUENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.BondImpl <em>Bond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.BondImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getBond()
	 * @generated
	 */
	int BOND = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND__ID = 0;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND__TYPE_VERBOSE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND__TYPE = 2;

	/**
	 * The feature id for the '<em><b>True Premise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND__TRUE_PREMISE = 3;

	/**
	 * The feature id for the '<em><b>True Premise Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND__TRUE_PREMISE_DISPLAY = 4;

	/**
	 * The number of structural features of the '<em>Bond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Bond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.EAuxiliaryConduct <em>EAuxiliary Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAuxiliary Conduct</em>'.
	 * @see MetamodelExecution.EAuxiliaryConduct
	 * @generated
	 */
	EClass getEAuxiliaryConduct();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.EAuxiliaryConduct#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answer</em>'.
	 * @see MetamodelExecution.EAuxiliaryConduct#getAnswer()
	 * @see #getEAuxiliaryConduct()
	 * @generated
	 */
	EReference getEAuxiliaryConduct_Answer();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.EInformation <em>EInformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EInformation</em>'.
	 * @see MetamodelExecution.EInformation
	 * @generated
	 */
	EClass getEInformation();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.EDischarge <em>EDischarge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDischarge</em>'.
	 * @see MetamodelExecution.EDischarge
	 * @generated
	 */
	EClass getEDischarge();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.EReferral <em>EReferral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReferral</em>'.
	 * @see MetamodelExecution.EReferral
	 * @generated
	 */
	EClass getEReferral();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.EPrescription <em>EPrescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPrescription</em>'.
	 * @see MetamodelExecution.EPrescription
	 * @generated
	 */
	EClass getEPrescription();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPrescription#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see MetamodelExecution.EPrescription#getText()
	 * @see #getEPrescription()
	 * @generated
	 */
	EAttribute getEPrescription_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.EPrescription#getPrescribedprescriptionitem <em>Prescribedprescriptionitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescribedprescriptionitem</em>'.
	 * @see MetamodelExecution.EPrescription#getPrescribedprescriptionitem()
	 * @see #getEPrescription()
	 * @generated
	 */
	EReference getEPrescription_Prescribedprescriptionitem();

	/**
	 * Returns the meta object for the attribute list '{@link MetamodelExecution.EPrescription#getIdsPrescribedMedication <em>Ids Prescribed Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids Prescribed Medication</em>'.
	 * @see MetamodelExecution.EPrescription#getIdsPrescribedMedication()
	 * @see #getEPrescription()
	 * @generated
	 */
	EAttribute getEPrescription_IdsPrescribedMedication();

	/**
	 * Returns the meta object for the attribute list '{@link MetamodelExecution.EPrescription#getIdsPrescribedPrescriptionItem <em>Ids Prescribed Prescription Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids Prescribed Prescription Item</em>'.
	 * @see MetamodelExecution.EPrescription#getIdsPrescribedPrescriptionItem()
	 * @see #getEPrescription()
	 * @generated
	 */
	EAttribute getEPrescription_IdsPrescribedPrescriptionItem();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.EPrescription#getPrescription <em>Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescription</em>'.
	 * @see MetamodelExecution.EPrescription#getPrescription()
	 * @see #getEPrescription()
	 * @generated
	 */
	EReference getEPrescription_Prescription();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.EPrescription#getPrescribedmedication <em>Prescribedmedication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescribedmedication</em>'.
	 * @see MetamodelExecution.EPrescription#getPrescribedmedication()
	 * @see #getEPrescription()
	 * @generated
	 */
	EReference getEPrescription_Prescribedmedication();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.ETreatment <em>ETreatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETreatment</em>'.
	 * @see MetamodelExecution.ETreatment
	 * @generated
	 */
	EClass getETreatment();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.ETreatment#getPrescribedexam <em>Prescribedexam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescribedexam</em>'.
	 * @see MetamodelExecution.ETreatment#getPrescribedexam()
	 * @see #getETreatment()
	 * @generated
	 */
	EReference getETreatment_Prescribedexam();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.ETreatment#getPrescribedprocedure <em>Prescribedprocedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescribedprocedure</em>'.
	 * @see MetamodelExecution.ETreatment#getPrescribedprocedure()
	 * @see #getETreatment()
	 * @generated
	 */
	EReference getETreatment_Prescribedprocedure();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.ETreatment#getPrescribedinternment <em>Prescribedinternment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescribedinternment</em>'.
	 * @see MetamodelExecution.ETreatment#getPrescribedinternment()
	 * @see #getETreatment()
	 * @generated
	 */
	EReference getETreatment_Prescribedinternment();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.ETreatment#getPrescribedmedication <em>Prescribedmedication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescribedmedication</em>'.
	 * @see MetamodelExecution.ETreatment#getPrescribedmedication()
	 * @see #getETreatment()
	 * @generated
	 */
	EReference getETreatment_Prescribedmedication();

	/**
	 * Returns the meta object for the attribute list '{@link MetamodelExecution.ETreatment#getIdsPrescribedExamination <em>Ids Prescribed Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids Prescribed Examination</em>'.
	 * @see MetamodelExecution.ETreatment#getIdsPrescribedExamination()
	 * @see #getETreatment()
	 * @generated
	 */
	EAttribute getETreatment_IdsPrescribedExamination();

	/**
	 * Returns the meta object for the attribute list '{@link MetamodelExecution.ETreatment#getIdsPrescribedProcedure <em>Ids Prescribed Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids Prescribed Procedure</em>'.
	 * @see MetamodelExecution.ETreatment#getIdsPrescribedProcedure()
	 * @see #getETreatment()
	 * @generated
	 */
	EAttribute getETreatment_IdsPrescribedProcedure();

	/**
	 * Returns the meta object for the attribute list '{@link MetamodelExecution.ETreatment#getIdsPrescribedInternment <em>Ids Prescribed Internment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids Prescribed Internment</em>'.
	 * @see MetamodelExecution.ETreatment#getIdsPrescribedInternment()
	 * @see #getETreatment()
	 * @generated
	 */
	EAttribute getETreatment_IdsPrescribedInternment();

	/**
	 * Returns the meta object for the attribute list '{@link MetamodelExecution.ETreatment#getIdsPrescribedMedication <em>Ids Prescribed Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids Prescribed Medication</em>'.
	 * @see MetamodelExecution.ETreatment#getIdsPrescribedMedication()
	 * @see #getETreatment()
	 * @generated
	 */
	EAttribute getETreatment_IdsPrescribedMedication();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Examination <em>Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examination</em>'.
	 * @see MetamodelExecution.Examination
	 * @generated
	 */
	EClass getExamination();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Examination#getId()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Examination#getUrl()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getIdExamination <em>Id Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Examination</em>'.
	 * @see MetamodelExecution.Examination#getIdExamination()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_IdExamination();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getSideLimb <em>Side Limb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side Limb</em>'.
	 * @see MetamodelExecution.Examination#getSideLimb()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_SideLimb();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see MetamodelExecution.Examination#getQuantity()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification</em>'.
	 * @see MetamodelExecution.Examination#getJustification()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Justification();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getClinicalIndication <em>Clinical Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clinical Indication</em>'.
	 * @see MetamodelExecution.Examination#getClinicalIndication()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_ClinicalIndication();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getSideLimbDisplay <em>Side Limb Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side Limb Display</em>'.
	 * @see MetamodelExecution.Examination#getSideLimbDisplay()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_SideLimbDisplay();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Examination#getExam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exam</em>'.
	 * @see MetamodelExecution.Examination#getExam()
	 * @see #getExamination()
	 * @generated
	 */
	EReference getExamination_Exam();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Examination#getName()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Name();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.PrescribedExamination <em>Prescribed Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescribed Examination</em>'.
	 * @see MetamodelExecution.PrescribedExamination
	 * @generated
	 */
	EClass getPrescribedExamination();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PrescribedExamination#getExamination <em>Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Examination</em>'.
	 * @see MetamodelExecution.PrescribedExamination#getExamination()
	 * @see #getPrescribedExamination()
	 * @generated
	 */
	EReference getPrescribedExamination_Examination();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PrescribedExamination#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.PrescribedExamination#getId()
	 * @see #getPrescribedExamination()
	 * @generated
	 */
	EAttribute getPrescribedExamination_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PrescribedExamination#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Report</em>'.
	 * @see MetamodelExecution.PrescribedExamination#getReport()
	 * @see #getPrescribedExamination()
	 * @generated
	 */
	EAttribute getPrescribedExamination_Report();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PrescribedExamination#getNumberGuide <em>Number Guide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Guide</em>'.
	 * @see MetamodelExecution.PrescribedExamination#getNumberGuide()
	 * @see #getPrescribedExamination()
	 * @generated
	 */
	EAttribute getPrescribedExamination_NumberGuide();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PrescribedExamination#getComplement <em>Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complement</em>'.
	 * @see MetamodelExecution.PrescribedExamination#getComplement()
	 * @see #getPrescribedExamination()
	 * @generated
	 */
	EReference getPrescribedExamination_Complement();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PrescribedExamination#getPrescription <em>Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescription</em>'.
	 * @see MetamodelExecution.PrescribedExamination#getPrescription()
	 * @see #getPrescribedExamination()
	 * @generated
	 */
	EReference getPrescribedExamination_Prescription();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PrescribedExamination#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.PrescribedExamination#getName()
	 * @see #getPrescribedExamination()
	 * @generated
	 */
	EAttribute getPrescribedExamination_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PrescribedExamination#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see MetamodelExecution.PrescribedExamination#getResult()
	 * @see #getPrescribedExamination()
	 * @generated
	 */
	EAttribute getPrescribedExamination_Result();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Exam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam</em>'.
	 * @see MetamodelExecution.Exam
	 * @generated
	 */
	EClass getExam();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Exam#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Exam#getId()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Exam#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Exam#getUrl()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Exam#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MetamodelExecution.Exam#getCode()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Code();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Exam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Exam#getName()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Exam#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MetamodelExecution.Exam#getDescription()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Description();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Exam#isOnlyEmergency <em>Only Emergency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Emergency</em>'.
	 * @see MetamodelExecution.Exam#isOnlyEmergency()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_OnlyEmergency();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Exam#isMemberPeers <em>Member Peers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Peers</em>'.
	 * @see MetamodelExecution.Exam#isMemberPeers()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_MemberPeers();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.PrescribedProcedure <em>Prescribed Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescribed Procedure</em>'.
	 * @see MetamodelExecution.PrescribedProcedure
	 * @generated
	 */
	EClass getPrescribedProcedure();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.PrescribedInternment <em>Prescribed Internment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescribed Internment</em>'.
	 * @see MetamodelExecution.PrescribedInternment
	 * @generated
	 */
	EClass getPrescribedInternment();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.PrescribedMedication <em>Prescribed Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescribed Medication</em>'.
	 * @see MetamodelExecution.PrescribedMedication
	 * @generated
	 */
	EClass getPrescribedMedication();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PrescribedMedication#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.PrescribedMedication#getId()
	 * @see #getPrescribedMedication()
	 * @generated
	 */
	EAttribute getPrescribedMedication_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PrescribedMedication#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see MetamodelExecution.PrescribedMedication#getResult()
	 * @see #getPrescribedMedication()
	 * @generated
	 */
	EAttribute getPrescribedMedication_Result();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PrescribedMedication#getMedicament <em>Medicament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Medicament</em>'.
	 * @see MetamodelExecution.PrescribedMedication#getMedicament()
	 * @see #getPrescribedMedication()
	 * @generated
	 */
	EReference getPrescribedMedication_Medicament();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PrescribedMedication#getPrescription <em>Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescription</em>'.
	 * @see MetamodelExecution.PrescribedMedication#getPrescription()
	 * @see #getPrescribedMedication()
	 * @generated
	 */
	EReference getPrescribedMedication_Prescription();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Complement <em>Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complement</em>'.
	 * @see MetamodelExecution.Complement
	 * @generated
	 */
	EClass getComplement();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Complement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Complement#getId()
	 * @see #getComplement()
	 * @generated
	 */
	EAttribute getComplement_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Complement#getSideLimb <em>Side Limb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side Limb</em>'.
	 * @see MetamodelExecution.Complement#getSideLimb()
	 * @see #getComplement()
	 * @generated
	 */
	EAttribute getComplement_SideLimb();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Complement#getSideLimbDisplay <em>Side Limb Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side Limb Display</em>'.
	 * @see MetamodelExecution.Complement#getSideLimbDisplay()
	 * @see #getComplement()
	 * @generated
	 */
	EAttribute getComplement_SideLimbDisplay();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Complement#getClinicalIndication <em>Clinical Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clinical Indication</em>'.
	 * @see MetamodelExecution.Complement#getClinicalIndication()
	 * @see #getComplement()
	 * @generated
	 */
	EAttribute getComplement_ClinicalIndication();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Complement#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification</em>'.
	 * @see MetamodelExecution.Complement#getJustification()
	 * @see #getComplement()
	 * @generated
	 */
	EAttribute getComplement_Justification();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Complement#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see MetamodelExecution.Complement#getQuantity()
	 * @see #getComplement()
	 * @generated
	 */
	EAttribute getComplement_Quantity();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.PrescribedPrescriptionItem <em>Prescribed Prescription Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescribed Prescription Item</em>'.
	 * @see MetamodelExecution.PrescribedPrescriptionItem
	 * @generated
	 */
	EClass getPrescribedPrescriptionItem();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see MetamodelExecution.Justification
	 * @generated
	 */
	EClass getJustification();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Justification#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Justification#getId()
	 * @see #getJustification()
	 * @generated
	 */
	EAttribute getJustification_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Justification#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see MetamodelExecution.Justification#getReason()
	 * @see #getJustification()
	 * @generated
	 */
	EAttribute getJustification_Reason();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Justification#getReasonDisplay <em>Reason Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason Display</em>'.
	 * @see MetamodelExecution.Justification#getReasonDisplay()
	 * @see #getJustification()
	 * @generated
	 */
	EAttribute getJustification_ReasonDisplay();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Justification#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MetamodelExecution.Justification#getDescription()
	 * @see #getJustification()
	 * @generated
	 */
	EAttribute getJustification_Description();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Justification#getJustifiedById <em>Justified By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justified By Id</em>'.
	 * @see MetamodelExecution.Justification#getJustifiedById()
	 * @see #getJustification()
	 * @generated
	 */
	EAttribute getJustification_JustifiedById();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Justification#getJustifiedBy <em>Justified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justified By</em>'.
	 * @see MetamodelExecution.Justification#getJustifiedBy()
	 * @see #getJustification()
	 * @generated
	 */
	EAttribute getJustification_JustifiedBy();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Pathway <em>Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pathway</em>'.
	 * @see MetamodelExecution.Pathway
	 * @generated
	 */
	EClass getPathway();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Pathway#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Pathway#getId()
	 * @see #getPathway()
	 * @generated
	 */
	EAttribute getPathway_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Pathway#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Pathway#getUrl()
	 * @see #getPathway()
	 * @generated
	 */
	EAttribute getPathway_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Pathway#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MetamodelExecution.Pathway#getCode()
	 * @see #getPathway()
	 * @generated
	 */
	EAttribute getPathway_Code();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Pathway#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Pathway#getName()
	 * @see #getPathway()
	 * @generated
	 */
	EAttribute getPathway_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Pathway#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see MetamodelExecution.Pathway#getVersion()
	 * @see #getPathway()
	 * @generated
	 */
	EAttribute getPathway_Version();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Pathway#isCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed</em>'.
	 * @see MetamodelExecution.Pathway#isCompleted()
	 * @see #getPathway()
	 * @generated
	 */
	EAttribute getPathway_Completed();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Pathway#getIdRepository <em>Id Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Repository</em>'.
	 * @see MetamodelExecution.Pathway#getIdRepository()
	 * @see #getPathway()
	 * @generated
	 */
	EAttribute getPathway_IdRepository();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Responsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsible</em>'.
	 * @see MetamodelExecution.Responsible
	 * @generated
	 */
	EClass getResponsible();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see MetamodelExecution.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.User#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.User#getUrl()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.User#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MetamodelExecution.User#getCode()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Code();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see MetamodelExecution.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.User#getTypeCouncil <em>Type Council</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Council</em>'.
	 * @see MetamodelExecution.User#getTypeCouncil()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_TypeCouncil();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.User#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see MetamodelExecution.User#getLogin()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Login();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.User#getNumberCouncil <em>Number Council</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Council</em>'.
	 * @see MetamodelExecution.User#getNumberCouncil()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_NumberCouncil();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.User#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see MetamodelExecution.User#getState()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_State();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see MetamodelExecution.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see MetamodelExecution.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Answer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Answer#getId()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Answer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MetamodelExecution.Answer#getType()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Type();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Answer#getTypeVerbose <em>Type Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Verbose</em>'.
	 * @see MetamodelExecution.Answer#getTypeVerbose()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_TypeVerbose();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Answer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see MetamodelExecution.Answer#getValue()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_Value();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Answer#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Question</em>'.
	 * @see MetamodelExecution.Answer#getQuestion()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_Question();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Numeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric</em>'.
	 * @see MetamodelExecution.Numeric
	 * @generated
	 */
	EClass getNumeric();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Numeric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MetamodelExecution.Numeric#getValue()
	 * @see #getNumeric()
	 * @generated
	 */
	EAttribute getNumeric_Value();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.YesOrNo <em>Yes Or No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yes Or No</em>'.
	 * @see MetamodelExecution.YesOrNo
	 * @generated
	 */
	EClass getYesOrNo();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.YesOrNo#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MetamodelExecution.YesOrNo#isValue()
	 * @see #getYesOrNo()
	 * @generated
	 */
	EAttribute getYesOrNo_Value();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see MetamodelExecution.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Step#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Step#getId()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Step#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MetamodelExecution.Step#getType()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Type();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Step#getTypeVerbose <em>Type Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Verbose</em>'.
	 * @see MetamodelExecution.Step#getTypeVerbose()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_TypeVerbose();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Step#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Step#getUrl()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Step#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MetamodelExecution.Step#getDescription()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Description();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Step#isIsInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see MetamodelExecution.Step#isIsInitial()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_IsInitial();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Step#isIsTerminal <em>Is Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Terminal</em>'.
	 * @see MetamodelExecution.Step#isIsTerminal()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_IsTerminal();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Step#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see MetamodelExecution.Step#isMandatory()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Mandatory();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Creator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creator</em>'.
	 * @see MetamodelExecution.Creator
	 * @generated
	 */
	EClass getCreator();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor</em>'.
	 * @see MetamodelExecution.Executor
	 * @generated
	 */
	EClass getExecutor();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.LastProfessional <em>Last Professional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Professional</em>'.
	 * @see MetamodelExecution.LastProfessional
	 * @generated
	 */
	EClass getLastProfessional();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.EElement <em>EElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EElement</em>'.
	 * @see MetamodelExecution.EElement
	 * @generated
	 */
	EClass getEElement();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.EElement#getId()
	 * @see #getEElement()
	 * @generated
	 */
	EAttribute getEElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MetamodelExecution.EElement#getType()
	 * @see #getEElement()
	 * @generated
	 */
	EAttribute getEElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EElement#getTypeVerbose <em>Type Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Verbose</em>'.
	 * @see MetamodelExecution.EElement#getTypeVerbose()
	 * @see #getEElement()
	 * @generated
	 */
	EAttribute getEElement_TypeVerbose();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EElement#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.EElement#getUrl()
	 * @see #getEElement()
	 * @generated
	 */
	EAttribute getEElement_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EElement#isIsCurrent <em>Is Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Current</em>'.
	 * @see MetamodelExecution.EElement#isIsCurrent()
	 * @see #getEElement()
	 * @generated
	 */
	EAttribute getEElement_IsCurrent();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EElement#isReworked <em>Reworked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reworked</em>'.
	 * @see MetamodelExecution.EElement#isReworked()
	 * @see #getEElement()
	 * @generated
	 */
	EAttribute getEElement_Reworked();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EElement#isExecuted <em>Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed</em>'.
	 * @see MetamodelExecution.EElement#isExecuted()
	 * @see #getEElement()
	 * @generated
	 */
	EAttribute getEElement_Executed();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EElement#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see MetamodelExecution.EElement#getCreationDate()
	 * @see #getEElement()
	 * @generated
	 */
	EAttribute getEElement_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EElement#getModificationDate <em>Modification Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification Date</em>'.
	 * @see MetamodelExecution.EElement#getModificationDate()
	 * @see #getEElement()
	 * @generated
	 */
	EAttribute getEElement_ModificationDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EElement#getExecutionDate <em>Execution Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Date</em>'.
	 * @see MetamodelExecution.EElement#getExecutionDate()
	 * @see #getEElement()
	 * @generated
	 */
	EAttribute getEElement_ExecutionDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EElement#getCreatedById <em>Created By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By Id</em>'.
	 * @see MetamodelExecution.EElement#getCreatedById()
	 * @see #getEElement()
	 * @generated
	 */
	EAttribute getEElement_CreatedById();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EElement#getExecutedById <em>Executed By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed By Id</em>'.
	 * @see MetamodelExecution.EElement#getExecutedById()
	 * @see #getEElement()
	 * @generated
	 */
	EAttribute getEElement_ExecutedById();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EElement#getIdStep <em>Id Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Step</em>'.
	 * @see MetamodelExecution.EElement#getIdStep()
	 * @see #getEElement()
	 * @generated
	 */
	EAttribute getEElement_IdStep();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EElement#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Justification</em>'.
	 * @see MetamodelExecution.EElement#getJustification()
	 * @see #getEElement()
	 * @generated
	 */
	EReference getEElement_Justification();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EElement#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step</em>'.
	 * @see MetamodelExecution.EElement#getStep()
	 * @see #getEElement()
	 * @generated
	 */
	EReference getEElement_Step();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EElement#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creator</em>'.
	 * @see MetamodelExecution.EElement#getCreator()
	 * @see #getEElement()
	 * @generated
	 */
	EReference getEElement_Creator();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EElement#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executor</em>'.
	 * @see MetamodelExecution.EElement#getExecutor()
	 * @see #getEElement()
	 * @generated
	 */
	EReference getEElement_Executor();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.EElement#getName()
	 * @see #getEElement()
	 * @generated
	 */
	EAttribute getEElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EElement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Previous</em>'.
	 * @see MetamodelExecution.EElement#getPrevious()
	 * @see #getEElement()
	 * @generated
	 */
	EReference getEElement_Previous();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EElement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see MetamodelExecution.EElement#getNext()
	 * @see #getEElement()
	 * @generated
	 */
	EReference getEElement_Next();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Prescription <em>Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescription</em>'.
	 * @see MetamodelExecution.Prescription
	 * @generated
	 */
	EClass getPrescription();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Prescription#getId()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#isSuccess <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success</em>'.
	 * @see MetamodelExecution.Prescription#isSuccess()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Success();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see MetamodelExecution.Prescription#getMessage()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Message();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getRequestDate <em>Request Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Date</em>'.
	 * @see MetamodelExecution.Prescription#getRequestDate()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_RequestDate();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.EPathway <em>EPathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPathway</em>'.
	 * @see MetamodelExecution.EPathway
	 * @generated
	 */
	EClass getEPathway();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.EPathway#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see MetamodelExecution.EPathway#getElement()
	 * @see #getEPathway()
	 * @generated
	 */
	EReference getEPathway_Element();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPathway#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.EPathway#getId()
	 * @see #getEPathway()
	 * @generated
	 */
	EAttribute getEPathway_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPathway#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.EPathway#getUrl()
	 * @see #getEPathway()
	 * @generated
	 */
	EAttribute getEPathway_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPathway#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see MetamodelExecution.EPathway#getCreationDate()
	 * @see #getEPathway()
	 * @generated
	 */
	EAttribute getEPathway_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPathway#getConclusionDate <em>Conclusion Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conclusion Date</em>'.
	 * @see MetamodelExecution.EPathway#getConclusionDate()
	 * @see #getEPathway()
	 * @generated
	 */
	EAttribute getEPathway_ConclusionDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPathway#isCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed</em>'.
	 * @see MetamodelExecution.EPathway#isCompleted()
	 * @see #getEPathway()
	 * @generated
	 */
	EAttribute getEPathway_Completed();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPathway#isAborted <em>Aborted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aborted</em>'.
	 * @see MetamodelExecution.EPathway#isAborted()
	 * @see #getEPathway()
	 * @generated
	 */
	EAttribute getEPathway_Aborted();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPathway#getLastExecutedStepDate <em>Last Executed Step Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Executed Step Date</em>'.
	 * @see MetamodelExecution.EPathway#getLastExecutedStepDate()
	 * @see #getEPathway()
	 * @generated
	 */
	EAttribute getEPathway_LastExecutedStepDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPathway#getIdPathway <em>Id Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Pathway</em>'.
	 * @see MetamodelExecution.EPathway#getIdPathway()
	 * @see #getEPathway()
	 * @generated
	 */
	EAttribute getEPathway_IdPathway();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPathway#getIdLastProfessional <em>Id Last Professional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Last Professional</em>'.
	 * @see MetamodelExecution.EPathway#getIdLastProfessional()
	 * @see #getEPathway()
	 * @generated
	 */
	EAttribute getEPathway_IdLastProfessional();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPathway#getIdResponsible <em>Id Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Responsible</em>'.
	 * @see MetamodelExecution.EPathway#getIdResponsible()
	 * @see #getEPathway()
	 * @generated
	 */
	EAttribute getEPathway_IdResponsible();

	/**
	 * Returns the meta object for the attribute list '{@link MetamodelExecution.EPathway#getIdsExecutedStep <em>Ids Executed Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids Executed Step</em>'.
	 * @see MetamodelExecution.EPathway#getIdsExecutedStep()
	 * @see #getEPathway()
	 * @generated
	 */
	EAttribute getEPathway_IdsExecutedStep();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EPathway#getPathway <em>Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pathway</em>'.
	 * @see MetamodelExecution.EPathway#getPathway()
	 * @see #getEPathway()
	 * @generated
	 */
	EReference getEPathway_Pathway();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EPathway#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responsible</em>'.
	 * @see MetamodelExecution.EPathway#getResponsible()
	 * @see #getEPathway()
	 * @generated
	 */
	EReference getEPathway_Responsible();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EPathway#getLastprofessional <em>Lastprofessional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lastprofessional</em>'.
	 * @see MetamodelExecution.EPathway#getLastprofessional()
	 * @see #getEPathway()
	 * @generated
	 */
	EReference getEPathway_Lastprofessional();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPathway#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.EPathway#getName()
	 * @see #getEPathway()
	 * @generated
	 */
	EAttribute getEPathway_Name();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EPathway#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Justification</em>'.
	 * @see MetamodelExecution.EPathway#getJustification()
	 * @see #getEPathway()
	 * @generated
	 */
	EReference getEPathway_Justification();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see MetamodelExecution.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Question#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Question#getId()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Question#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Question#getUrl()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Question#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Question#getName()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Name();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Question#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see MetamodelExecution.Question#getVariable()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Variable();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Question#getIdCategory <em>Id Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Category</em>'.
	 * @see MetamodelExecution.Question#getIdCategory()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_IdCategory();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Question#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see MetamodelExecution.Question#getCategory()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Category();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see MetamodelExecution.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Variable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Variable#getId()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MetamodelExecution.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Variable#getTypeVerbose <em>Type Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Verbose</em>'.
	 * @see MetamodelExecution.Variable#getTypeVerbose()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_TypeVerbose();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Variable#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Variable#getUrl()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Variable#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see MetamodelExecution.Variable#getWeight()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Weight();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see MetamodelExecution.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Value();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Variable#getBond <em>Bond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bond</em>'.
	 * @see MetamodelExecution.Variable#getBond()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Bond();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Medicament <em>Medicament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medicament</em>'.
	 * @see MetamodelExecution.Medicament
	 * @generated
	 */
	EClass getMedicament();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.Medicament#getMedicine <em>Medicine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medicine</em>'.
	 * @see MetamodelExecution.Medicament#getMedicine()
	 * @see #getMedicament()
	 * @generated
	 */
	EReference getMedicament_Medicine();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.Medicament#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit</em>'.
	 * @see MetamodelExecution.Medicament#getUnit()
	 * @see #getMedicament()
	 * @generated
	 */
	EReference getMedicament_Unit();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.Medicament#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access</em>'.
	 * @see MetamodelExecution.Medicament#getAccess()
	 * @see #getMedicament()
	 * @generated
	 */
	EReference getMedicament_Access();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Medicament#getId()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Medicament#getName()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Medicament#getUrl()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MetamodelExecution.Medicament#getCode()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_Code();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getIdMedicament <em>Id Medicament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Medicament</em>'.
	 * @see MetamodelExecution.Medicament#getIdMedicament()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_IdMedicament();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MetamodelExecution.Medicament#getDescription()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_Description();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brand</em>'.
	 * @see MetamodelExecution.Medicament#getBrand()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_Brand();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#isOutpatient <em>Outpatient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outpatient</em>'.
	 * @see MetamodelExecution.Medicament#isOutpatient()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_Outpatient();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getIdUnit <em>Id Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Unit</em>'.
	 * @see MetamodelExecution.Medicament#getIdUnit()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_IdUnit();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getIdAccess <em>Id Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Access</em>'.
	 * @see MetamodelExecution.Medicament#getIdAccess()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_IdAccess();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard</em>'.
	 * @see MetamodelExecution.Medicament#getStandard()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_Standard();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getDailyDosage <em>Daily Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daily Dosage</em>'.
	 * @see MetamodelExecution.Medicament#getDailyDosage()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_DailyDosage();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getCycles <em>Cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycles</em>'.
	 * @see MetamodelExecution.Medicament#getCycles()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_Cycles();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see MetamodelExecution.Medicament#getFrequency()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getFrequencyDisplay <em>Frequency Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency Display</em>'.
	 * @see MetamodelExecution.Medicament#getFrequencyDisplay()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_FrequencyDisplay();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getTimeTreatement <em>Time Treatement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Treatement</em>'.
	 * @see MetamodelExecution.Medicament#getTimeTreatement()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_TimeTreatement();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicament#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Interval</em>'.
	 * @see MetamodelExecution.Medicament#getTimeInterval()
	 * @see #getMedicament()
	 * @generated
	 */
	EAttribute getMedicament_TimeInterval();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Medicine <em>Medicine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medicine</em>'.
	 * @see MetamodelExecution.Medicine
	 * @generated
	 */
	EClass getMedicine();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicine#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Medicine#getId()
	 * @see #getMedicine()
	 * @generated
	 */
	EAttribute getMedicine_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Medicine#getName()
	 * @see #getMedicine()
	 * @generated
	 */
	EAttribute getMedicine_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicine#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Medicine#getUrl()
	 * @see #getMedicine()
	 * @generated
	 */
	EAttribute getMedicine_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicine#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MetamodelExecution.Medicine#getCode()
	 * @see #getMedicine()
	 * @generated
	 */
	EAttribute getMedicine_Code();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicine#isOutpatient <em>Outpatient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outpatient</em>'.
	 * @see MetamodelExecution.Medicine#isOutpatient()
	 * @see #getMedicine()
	 * @generated
	 */
	EAttribute getMedicine_Outpatient();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicine#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brand</em>'.
	 * @see MetamodelExecution.Medicine#getBrand()
	 * @see #getMedicine()
	 * @generated
	 */
	EAttribute getMedicine_Brand();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medicine#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MetamodelExecution.Medicine#getDescription()
	 * @see #getMedicine()
	 * @generated
	 */
	EAttribute getMedicine_Description();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see MetamodelExecution.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Unit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Unit#getId()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Unit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Unit#getName()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Unit#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Unit#getUrl()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Unit#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MetamodelExecution.Unit#getCode()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Code();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Unit#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MetamodelExecution.Unit#getUnit()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Unit();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access</em>'.
	 * @see MetamodelExecution.Access
	 * @generated
	 */
	EClass getAccess();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Access#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Access#getId()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Access#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Access#getName()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Access#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Access#getUrl()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Access#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MetamodelExecution.Access#getCode()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Code();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see MetamodelExecution.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Sequence#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Sequence#getUrl()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Sequence#getUrlAbsolute <em>Url Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Absolute</em>'.
	 * @see MetamodelExecution.Sequence#getUrlAbsolute()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_UrlAbsolute();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Previous <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Previous</em>'.
	 * @see MetamodelExecution.Previous
	 * @generated
	 */
	EClass getPrevious();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Next <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next</em>'.
	 * @see MetamodelExecution.Next
	 * @generated
	 */
	EClass getNext();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Bond <em>Bond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bond</em>'.
	 * @see MetamodelExecution.Bond
	 * @generated
	 */
	EClass getBond();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Bond#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Bond#getId()
	 * @see #getBond()
	 * @generated
	 */
	EAttribute getBond_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Bond#getTypeVerbose <em>Type Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Verbose</em>'.
	 * @see MetamodelExecution.Bond#getTypeVerbose()
	 * @see #getBond()
	 * @generated
	 */
	EAttribute getBond_TypeVerbose();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Bond#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MetamodelExecution.Bond#getType()
	 * @see #getBond()
	 * @generated
	 */
	EAttribute getBond_Type();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Bond#getTruePremise <em>True Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>True Premise</em>'.
	 * @see MetamodelExecution.Bond#getTruePremise()
	 * @see #getBond()
	 * @generated
	 */
	EAttribute getBond_TruePremise();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Bond#getTruePremiseDisplay <em>True Premise Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>True Premise Display</em>'.
	 * @see MetamodelExecution.Bond#getTruePremiseDisplay()
	 * @see #getBond()
	 * @generated
	 */
	EAttribute getBond_TruePremiseDisplay();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Execution_metamodelFactory getExecution_metamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.EAuxiliaryConductImpl <em>EAuxiliary Conduct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.EAuxiliaryConductImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEAuxiliaryConduct()
		 * @generated
		 */
		EClass EAUXILIARY_CONDUCT = eINSTANCE.getEAuxiliaryConduct();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EAUXILIARY_CONDUCT__ANSWER = eINSTANCE.getEAuxiliaryConduct_Answer();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.EInformationImpl <em>EInformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.EInformationImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEInformation()
		 * @generated
		 */
		EClass EINFORMATION = eINSTANCE.getEInformation();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.EDischargeImpl <em>EDischarge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.EDischargeImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEDischarge()
		 * @generated
		 */
		EClass EDISCHARGE = eINSTANCE.getEDischarge();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.EReferralImpl <em>EReferral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.EReferralImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEReferral()
		 * @generated
		 */
		EClass EREFERRAL = eINSTANCE.getEReferral();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.EPrescriptionImpl <em>EPrescription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.EPrescriptionImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEPrescription()
		 * @generated
		 */
		EClass EPRESCRIPTION = eINSTANCE.getEPrescription();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPRESCRIPTION__TEXT = eINSTANCE.getEPrescription_Text();

		/**
		 * The meta object literal for the '<em><b>Prescribedprescriptionitem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM = eINSTANCE.getEPrescription_Prescribedprescriptionitem();

		/**
		 * The meta object literal for the '<em><b>Ids Prescribed Medication</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPRESCRIPTION__IDS_PRESCRIBED_MEDICATION = eINSTANCE.getEPrescription_IdsPrescribedMedication();

		/**
		 * The meta object literal for the '<em><b>Ids Prescribed Prescription Item</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPRESCRIPTION__IDS_PRESCRIBED_PRESCRIPTION_ITEM = eINSTANCE
				.getEPrescription_IdsPrescribedPrescriptionItem();

		/**
		 * The meta object literal for the '<em><b>Prescription</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPRESCRIPTION__PRESCRIPTION = eINSTANCE.getEPrescription_Prescription();

		/**
		 * The meta object literal for the '<em><b>Prescribedmedication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPRESCRIPTION__PRESCRIBEDMEDICATION = eINSTANCE.getEPrescription_Prescribedmedication();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ETreatmentImpl <em>ETreatment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ETreatmentImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getETreatment()
		 * @generated
		 */
		EClass ETREATMENT = eINSTANCE.getETreatment();

		/**
		 * The meta object literal for the '<em><b>Prescribedexam</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETREATMENT__PRESCRIBEDEXAM = eINSTANCE.getETreatment_Prescribedexam();

		/**
		 * The meta object literal for the '<em><b>Prescribedprocedure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETREATMENT__PRESCRIBEDPROCEDURE = eINSTANCE.getETreatment_Prescribedprocedure();

		/**
		 * The meta object literal for the '<em><b>Prescribedinternment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETREATMENT__PRESCRIBEDINTERNMENT = eINSTANCE.getETreatment_Prescribedinternment();

		/**
		 * The meta object literal for the '<em><b>Prescribedmedication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETREATMENT__PRESCRIBEDMEDICATION = eINSTANCE.getETreatment_Prescribedmedication();

		/**
		 * The meta object literal for the '<em><b>Ids Prescribed Examination</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETREATMENT__IDS_PRESCRIBED_EXAMINATION = eINSTANCE.getETreatment_IdsPrescribedExamination();

		/**
		 * The meta object literal for the '<em><b>Ids Prescribed Procedure</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETREATMENT__IDS_PRESCRIBED_PROCEDURE = eINSTANCE.getETreatment_IdsPrescribedProcedure();

		/**
		 * The meta object literal for the '<em><b>Ids Prescribed Internment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETREATMENT__IDS_PRESCRIBED_INTERNMENT = eINSTANCE.getETreatment_IdsPrescribedInternment();

		/**
		 * The meta object literal for the '<em><b>Ids Prescribed Medication</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETREATMENT__IDS_PRESCRIBED_MEDICATION = eINSTANCE.getETreatment_IdsPrescribedMedication();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ExaminationImpl <em>Examination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ExaminationImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExamination()
		 * @generated
		 */
		EClass EXAMINATION = eINSTANCE.getExamination();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__ID = eINSTANCE.getExamination_Id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__URL = eINSTANCE.getExamination_Url();

		/**
		 * The meta object literal for the '<em><b>Id Examination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__ID_EXAMINATION = eINSTANCE.getExamination_IdExamination();

		/**
		 * The meta object literal for the '<em><b>Side Limb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__SIDE_LIMB = eINSTANCE.getExamination_SideLimb();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__QUANTITY = eINSTANCE.getExamination_Quantity();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__JUSTIFICATION = eINSTANCE.getExamination_Justification();

		/**
		 * The meta object literal for the '<em><b>Clinical Indication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__CLINICAL_INDICATION = eINSTANCE.getExamination_ClinicalIndication();

		/**
		 * The meta object literal for the '<em><b>Side Limb Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__SIDE_LIMB_DISPLAY = eINSTANCE.getExamination_SideLimbDisplay();

		/**
		 * The meta object literal for the '<em><b>Exam</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINATION__EXAM = eINSTANCE.getExamination_Exam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__NAME = eINSTANCE.getExamination_Name();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PrescribedExaminationImpl <em>Prescribed Examination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PrescribedExaminationImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescribedExamination()
		 * @generated
		 */
		EClass PRESCRIBED_EXAMINATION = eINSTANCE.getPrescribedExamination();

		/**
		 * The meta object literal for the '<em><b>Examination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBED_EXAMINATION__EXAMINATION = eINSTANCE.getPrescribedExamination_Examination();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIBED_EXAMINATION__ID = eINSTANCE.getPrescribedExamination_Id();

		/**
		 * The meta object literal for the '<em><b>Report</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIBED_EXAMINATION__REPORT = eINSTANCE.getPrescribedExamination_Report();

		/**
		 * The meta object literal for the '<em><b>Number Guide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIBED_EXAMINATION__NUMBER_GUIDE = eINSTANCE.getPrescribedExamination_NumberGuide();

		/**
		 * The meta object literal for the '<em><b>Complement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBED_EXAMINATION__COMPLEMENT = eINSTANCE.getPrescribedExamination_Complement();

		/**
		 * The meta object literal for the '<em><b>Prescription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBED_EXAMINATION__PRESCRIPTION = eINSTANCE.getPrescribedExamination_Prescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIBED_EXAMINATION__NAME = eINSTANCE.getPrescribedExamination_Name();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIBED_EXAMINATION__RESULT = eINSTANCE.getPrescribedExamination_Result();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ExamImpl <em>Exam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ExamImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExam()
		 * @generated
		 */
		EClass EXAM = eINSTANCE.getExam();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__ID = eINSTANCE.getExam_Id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__URL = eINSTANCE.getExam_Url();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__CODE = eINSTANCE.getExam_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__NAME = eINSTANCE.getExam_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__DESCRIPTION = eINSTANCE.getExam_Description();

		/**
		 * The meta object literal for the '<em><b>Only Emergency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__ONLY_EMERGENCY = eINSTANCE.getExam_OnlyEmergency();

		/**
		 * The meta object literal for the '<em><b>Member Peers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__MEMBER_PEERS = eINSTANCE.getExam_MemberPeers();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PrescribedProcedureImpl <em>Prescribed Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PrescribedProcedureImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescribedProcedure()
		 * @generated
		 */
		EClass PRESCRIBED_PROCEDURE = eINSTANCE.getPrescribedProcedure();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PrescribedInternmentImpl <em>Prescribed Internment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PrescribedInternmentImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescribedInternment()
		 * @generated
		 */
		EClass PRESCRIBED_INTERNMENT = eINSTANCE.getPrescribedInternment();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PrescribedMedicationImpl <em>Prescribed Medication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PrescribedMedicationImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescribedMedication()
		 * @generated
		 */
		EClass PRESCRIBED_MEDICATION = eINSTANCE.getPrescribedMedication();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIBED_MEDICATION__ID = eINSTANCE.getPrescribedMedication_Id();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIBED_MEDICATION__RESULT = eINSTANCE.getPrescribedMedication_Result();

		/**
		 * The meta object literal for the '<em><b>Medicament</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBED_MEDICATION__MEDICAMENT = eINSTANCE.getPrescribedMedication_Medicament();

		/**
		 * The meta object literal for the '<em><b>Prescription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBED_MEDICATION__PRESCRIPTION = eINSTANCE.getPrescribedMedication_Prescription();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ComplementImpl <em>Complement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ComplementImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getComplement()
		 * @generated
		 */
		EClass COMPLEMENT = eINSTANCE.getComplement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENT__ID = eINSTANCE.getComplement_Id();

		/**
		 * The meta object literal for the '<em><b>Side Limb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENT__SIDE_LIMB = eINSTANCE.getComplement_SideLimb();

		/**
		 * The meta object literal for the '<em><b>Side Limb Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENT__SIDE_LIMB_DISPLAY = eINSTANCE.getComplement_SideLimbDisplay();

		/**
		 * The meta object literal for the '<em><b>Clinical Indication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENT__CLINICAL_INDICATION = eINSTANCE.getComplement_ClinicalIndication();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENT__JUSTIFICATION = eINSTANCE.getComplement_Justification();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENT__QUANTITY = eINSTANCE.getComplement_Quantity();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PrescribedPrescriptionItemImpl <em>Prescribed Prescription Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PrescribedPrescriptionItemImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescribedPrescriptionItem()
		 * @generated
		 */
		EClass PRESCRIBED_PRESCRIPTION_ITEM = eINSTANCE.getPrescribedPrescriptionItem();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.JustificationImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFICATION__ID = eINSTANCE.getJustification_Id();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFICATION__REASON = eINSTANCE.getJustification_Reason();

		/**
		 * The meta object literal for the '<em><b>Reason Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFICATION__REASON_DISPLAY = eINSTANCE.getJustification_ReasonDisplay();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFICATION__DESCRIPTION = eINSTANCE.getJustification_Description();

		/**
		 * The meta object literal for the '<em><b>Justified By Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFICATION__JUSTIFIED_BY_ID = eINSTANCE.getJustification_JustifiedById();

		/**
		 * The meta object literal for the '<em><b>Justified By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFICATION__JUSTIFIED_BY = eINSTANCE.getJustification_JustifiedBy();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PathwayImpl <em>Pathway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PathwayImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPathway()
		 * @generated
		 */
		EClass PATHWAY = eINSTANCE.getPathway();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__ID = eINSTANCE.getPathway_Id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__URL = eINSTANCE.getPathway_Url();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__CODE = eINSTANCE.getPathway_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__NAME = eINSTANCE.getPathway_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__VERSION = eINSTANCE.getPathway_Version();

		/**
		 * The meta object literal for the '<em><b>Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__COMPLETED = eINSTANCE.getPathway_Completed();

		/**
		 * The meta object literal for the '<em><b>Id Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__ID_REPOSITORY = eINSTANCE.getPathway_IdRepository();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ResponsibleImpl <em>Responsible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ResponsibleImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getResponsible()
		 * @generated
		 */
		EClass RESPONSIBLE = eINSTANCE.getResponsible();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.UserImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__URL = eINSTANCE.getUser_Url();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__CODE = eINSTANCE.getUser_Code();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Type Council</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__TYPE_COUNCIL = eINSTANCE.getUser_TypeCouncil();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LOGIN = eINSTANCE.getUser_Login();

		/**
		 * The meta object literal for the '<em><b>Number Council</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NUMBER_COUNCIL = eINSTANCE.getUser_NumberCouncil();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__STATE = eINSTANCE.getUser_State();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ValueImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.AnswerImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__ID = eINSTANCE.getAnswer_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__TYPE = eINSTANCE.getAnswer_Type();

		/**
		 * The meta object literal for the '<em><b>Type Verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__TYPE_VERBOSE = eINSTANCE.getAnswer_TypeVerbose();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__VALUE = eINSTANCE.getAnswer_Value();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__QUESTION = eINSTANCE.getAnswer_Question();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.NumericImpl <em>Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.NumericImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getNumeric()
		 * @generated
		 */
		EClass NUMERIC = eINSTANCE.getNumeric();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC__VALUE = eINSTANCE.getNumeric_Value();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.YesOrNoImpl <em>Yes Or No</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.YesOrNoImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getYesOrNo()
		 * @generated
		 */
		EClass YES_OR_NO = eINSTANCE.getYesOrNo();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YES_OR_NO__VALUE = eINSTANCE.getYesOrNo_Value();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.StepImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ID = eINSTANCE.getStep_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__TYPE = eINSTANCE.getStep_Type();

		/**
		 * The meta object literal for the '<em><b>Type Verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__TYPE_VERBOSE = eINSTANCE.getStep_TypeVerbose();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__URL = eINSTANCE.getStep_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__DESCRIPTION = eINSTANCE.getStep_Description();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__IS_INITIAL = eINSTANCE.getStep_IsInitial();

		/**
		 * The meta object literal for the '<em><b>Is Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__IS_TERMINAL = eINSTANCE.getStep_IsTerminal();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__MANDATORY = eINSTANCE.getStep_Mandatory();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.CreatorImpl <em>Creator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.CreatorImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getCreator()
		 * @generated
		 */
		EClass CREATOR = eINSTANCE.getCreator();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ExecutorImpl <em>Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ExecutorImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExecutor()
		 * @generated
		 */
		EClass EXECUTOR = eINSTANCE.getExecutor();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.LastProfessionalImpl <em>Last Professional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.LastProfessionalImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getLastProfessional()
		 * @generated
		 */
		EClass LAST_PROFESSIONAL = eINSTANCE.getLastProfessional();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.EElementImpl <em>EElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.EElementImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEElement()
		 * @generated
		 */
		EClass EELEMENT = eINSTANCE.getEElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EELEMENT__ID = eINSTANCE.getEElement_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EELEMENT__TYPE = eINSTANCE.getEElement_Type();

		/**
		 * The meta object literal for the '<em><b>Type Verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EELEMENT__TYPE_VERBOSE = eINSTANCE.getEElement_TypeVerbose();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EELEMENT__URL = eINSTANCE.getEElement_Url();

		/**
		 * The meta object literal for the '<em><b>Is Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EELEMENT__IS_CURRENT = eINSTANCE.getEElement_IsCurrent();

		/**
		 * The meta object literal for the '<em><b>Reworked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EELEMENT__REWORKED = eINSTANCE.getEElement_Reworked();

		/**
		 * The meta object literal for the '<em><b>Executed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EELEMENT__EXECUTED = eINSTANCE.getEElement_Executed();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EELEMENT__CREATION_DATE = eINSTANCE.getEElement_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Modification Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EELEMENT__MODIFICATION_DATE = eINSTANCE.getEElement_ModificationDate();

		/**
		 * The meta object literal for the '<em><b>Execution Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EELEMENT__EXECUTION_DATE = eINSTANCE.getEElement_ExecutionDate();

		/**
		 * The meta object literal for the '<em><b>Created By Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EELEMENT__CREATED_BY_ID = eINSTANCE.getEElement_CreatedById();

		/**
		 * The meta object literal for the '<em><b>Executed By Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EELEMENT__EXECUTED_BY_ID = eINSTANCE.getEElement_ExecutedById();

		/**
		 * The meta object literal for the '<em><b>Id Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EELEMENT__ID_STEP = eINSTANCE.getEElement_IdStep();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EELEMENT__JUSTIFICATION = eINSTANCE.getEElement_Justification();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EELEMENT__STEP = eINSTANCE.getEElement_Step();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EELEMENT__CREATOR = eINSTANCE.getEElement_Creator();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EELEMENT__EXECUTOR = eINSTANCE.getEElement_Executor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EELEMENT__NAME = eINSTANCE.getEElement_Name();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EELEMENT__PREVIOUS = eINSTANCE.getEElement_Previous();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EELEMENT__NEXT = eINSTANCE.getEElement_Next();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PrescriptionImpl <em>Prescription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PrescriptionImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescription()
		 * @generated
		 */
		EClass PRESCRIPTION = eINSTANCE.getPrescription();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__ID = eINSTANCE.getPrescription_Id();

		/**
		 * The meta object literal for the '<em><b>Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__SUCCESS = eINSTANCE.getPrescription_Success();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__MESSAGE = eINSTANCE.getPrescription_Message();

		/**
		 * The meta object literal for the '<em><b>Request Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__REQUEST_DATE = eINSTANCE.getPrescription_RequestDate();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.EPathwayImpl <em>EPathway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.EPathwayImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEPathway()
		 * @generated
		 */
		EClass EPATHWAY = eINSTANCE.getEPathway();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPATHWAY__ELEMENT = eINSTANCE.getEPathway_Element();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__ID = eINSTANCE.getEPathway_Id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__URL = eINSTANCE.getEPathway_Url();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__CREATION_DATE = eINSTANCE.getEPathway_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Conclusion Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__CONCLUSION_DATE = eINSTANCE.getEPathway_ConclusionDate();

		/**
		 * The meta object literal for the '<em><b>Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__COMPLETED = eINSTANCE.getEPathway_Completed();

		/**
		 * The meta object literal for the '<em><b>Aborted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__ABORTED = eINSTANCE.getEPathway_Aborted();

		/**
		 * The meta object literal for the '<em><b>Last Executed Step Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__LAST_EXECUTED_STEP_DATE = eINSTANCE.getEPathway_LastExecutedStepDate();

		/**
		 * The meta object literal for the '<em><b>Id Pathway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__ID_PATHWAY = eINSTANCE.getEPathway_IdPathway();

		/**
		 * The meta object literal for the '<em><b>Id Last Professional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__ID_LAST_PROFESSIONAL = eINSTANCE.getEPathway_IdLastProfessional();

		/**
		 * The meta object literal for the '<em><b>Id Responsible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__ID_RESPONSIBLE = eINSTANCE.getEPathway_IdResponsible();

		/**
		 * The meta object literal for the '<em><b>Ids Executed Step</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__IDS_EXECUTED_STEP = eINSTANCE.getEPathway_IdsExecutedStep();

		/**
		 * The meta object literal for the '<em><b>Pathway</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPATHWAY__PATHWAY = eINSTANCE.getEPathway_Pathway();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPATHWAY__RESPONSIBLE = eINSTANCE.getEPathway_Responsible();

		/**
		 * The meta object literal for the '<em><b>Lastprofessional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPATHWAY__LASTPROFESSIONAL = eINSTANCE.getEPathway_Lastprofessional();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__NAME = eINSTANCE.getEPathway_Name();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPATHWAY__JUSTIFICATION = eINSTANCE.getEPathway_Justification();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.QuestionImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__ID = eINSTANCE.getQuestion_Id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__URL = eINSTANCE.getQuestion_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__VARIABLE = eINSTANCE.getQuestion_Variable();

		/**
		 * The meta object literal for the '<em><b>Id Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__ID_CATEGORY = eINSTANCE.getQuestion_IdCategory();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__CATEGORY = eINSTANCE.getQuestion_Category();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.VariableImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ID = eINSTANCE.getVariable_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Type Verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE_VERBOSE = eINSTANCE.getVariable_TypeVerbose();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__URL = eINSTANCE.getVariable_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__WEIGHT = eINSTANCE.getVariable_Weight();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Bond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__BOND = eINSTANCE.getVariable_Bond();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.MedicamentImpl <em>Medicament</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.MedicamentImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getMedicament()
		 * @generated
		 */
		EClass MEDICAMENT = eINSTANCE.getMedicament();

		/**
		 * The meta object literal for the '<em><b>Medicine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICAMENT__MEDICINE = eINSTANCE.getMedicament_Medicine();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICAMENT__UNIT = eINSTANCE.getMedicament_Unit();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICAMENT__ACCESS = eINSTANCE.getMedicament_Access();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__ID = eINSTANCE.getMedicament_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__NAME = eINSTANCE.getMedicament_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__URL = eINSTANCE.getMedicament_Url();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__CODE = eINSTANCE.getMedicament_Code();

		/**
		 * The meta object literal for the '<em><b>Id Medicament</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__ID_MEDICAMENT = eINSTANCE.getMedicament_IdMedicament();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__DESCRIPTION = eINSTANCE.getMedicament_Description();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__BRAND = eINSTANCE.getMedicament_Brand();

		/**
		 * The meta object literal for the '<em><b>Outpatient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__OUTPATIENT = eINSTANCE.getMedicament_Outpatient();

		/**
		 * The meta object literal for the '<em><b>Id Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__ID_UNIT = eINSTANCE.getMedicament_IdUnit();

		/**
		 * The meta object literal for the '<em><b>Id Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__ID_ACCESS = eINSTANCE.getMedicament_IdAccess();

		/**
		 * The meta object literal for the '<em><b>Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__STANDARD = eINSTANCE.getMedicament_Standard();

		/**
		 * The meta object literal for the '<em><b>Daily Dosage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__DAILY_DOSAGE = eINSTANCE.getMedicament_DailyDosage();

		/**
		 * The meta object literal for the '<em><b>Cycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__CYCLES = eINSTANCE.getMedicament_Cycles();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__FREQUENCY = eINSTANCE.getMedicament_Frequency();

		/**
		 * The meta object literal for the '<em><b>Frequency Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__FREQUENCY_DISPLAY = eINSTANCE.getMedicament_FrequencyDisplay();

		/**
		 * The meta object literal for the '<em><b>Time Treatement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__TIME_TREATEMENT = eINSTANCE.getMedicament_TimeTreatement();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAMENT__TIME_INTERVAL = eINSTANCE.getMedicament_TimeInterval();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.MedicineImpl <em>Medicine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.MedicineImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getMedicine()
		 * @generated
		 */
		EClass MEDICINE = eINSTANCE.getMedicine();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICINE__ID = eINSTANCE.getMedicine_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICINE__NAME = eINSTANCE.getMedicine_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICINE__URL = eINSTANCE.getMedicine_Url();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICINE__CODE = eINSTANCE.getMedicine_Code();

		/**
		 * The meta object literal for the '<em><b>Outpatient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICINE__OUTPATIENT = eINSTANCE.getMedicine_Outpatient();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICINE__BRAND = eINSTANCE.getMedicine_Brand();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICINE__DESCRIPTION = eINSTANCE.getMedicine_Description();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.UnitImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__ID = eINSTANCE.getUnit_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__URL = eINSTANCE.getUnit_Url();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__CODE = eINSTANCE.getUnit_Code();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__UNIT = eINSTANCE.getUnit_Unit();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.AccessImpl <em>Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.AccessImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getAccess()
		 * @generated
		 */
		EClass ACCESS = eINSTANCE.getAccess();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS__ID = eINSTANCE.getAccess_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS__NAME = eINSTANCE.getAccess_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS__URL = eINSTANCE.getAccess_Url();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS__CODE = eINSTANCE.getAccess_Code();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.SequenceImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__URL = eINSTANCE.getSequence_Url();

		/**
		 * The meta object literal for the '<em><b>Url Absolute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__URL_ABSOLUTE = eINSTANCE.getSequence_UrlAbsolute();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PreviousImpl <em>Previous</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PreviousImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrevious()
		 * @generated
		 */
		EClass PREVIOUS = eINSTANCE.getPrevious();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.NextImpl <em>Next</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.NextImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getNext()
		 * @generated
		 */
		EClass NEXT = eINSTANCE.getNext();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.BondImpl <em>Bond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.BondImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getBond()
		 * @generated
		 */
		EClass BOND = eINSTANCE.getBond();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOND__ID = eINSTANCE.getBond_Id();

		/**
		 * The meta object literal for the '<em><b>Type Verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOND__TYPE_VERBOSE = eINSTANCE.getBond_TypeVerbose();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOND__TYPE = eINSTANCE.getBond_Type();

		/**
		 * The meta object literal for the '<em><b>True Premise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOND__TRUE_PREMISE = eINSTANCE.getBond_TruePremise();

		/**
		 * The meta object literal for the '<em><b>True Premise Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOND__TRUE_PREMISE_DISPLAY = eINSTANCE.getBond_TruePremiseDisplay();

	}

} //Execution_metamodelPackage
