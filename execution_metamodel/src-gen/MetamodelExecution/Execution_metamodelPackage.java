/**
 */
package MetamodelExecution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import protocolosv2.Protocolosv2Package;

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
	 * The meta object id for the '{@link MetamodelExecution.impl.ExecutionStepImpl <em>Execution Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ExecutionStepImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExecutionStep()
	 * @generated
	 */
	int EXECUTION_STEP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__TYPE_VERBOSE = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__URL = 3;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__IS_CURRENT = 4;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__REWORKED = 5;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__EXECUTED = 6;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__PREVIOUS = 7;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__NEXT = 8;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__CREATION_DATE = 9;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__CHANGE_DATE = 10;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__EXECUTION_DATE = 11;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__CREATOR = 12;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__EXECUTOR = 13;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__ID_STEP = 14;

	/**
	 * The feature id for the '<em><b>Id Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__ID_PROTOCOL = 15;

	/**
	 * The feature id for the '<em><b>Id Executed Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__ID_EXECUTED_PROTOCOL = 16;

	/**
	 * The feature id for the '<em><b>Justify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__JUSTIFY = 17;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__STEP = 18;

	/**
	 * The number of structural features of the '<em>Execution Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Execution Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.AuxiliaryConductImpl <em>Auxiliary Conduct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.AuxiliaryConductImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getAuxiliaryConduct()
	 * @generated
	 */
	int AUXILIARY_CONDUCT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__ID = EXECUTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__TYPE = EXECUTION_STEP__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__TYPE_VERBOSE = EXECUTION_STEP__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__URL = EXECUTION_STEP__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__IS_CURRENT = EXECUTION_STEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__REWORKED = EXECUTION_STEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__EXECUTED = EXECUTION_STEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__PREVIOUS = EXECUTION_STEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__NEXT = EXECUTION_STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__CREATION_DATE = EXECUTION_STEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__CHANGE_DATE = EXECUTION_STEP__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__EXECUTION_DATE = EXECUTION_STEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__CREATOR = EXECUTION_STEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__EXECUTOR = EXECUTION_STEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__ID_STEP = EXECUTION_STEP__ID_STEP;

	/**
	 * The feature id for the '<em><b>Id Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__ID_PROTOCOL = EXECUTION_STEP__ID_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Id Executed Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__ID_EXECUTED_PROTOCOL = EXECUTION_STEP__ID_EXECUTED_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Justify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__JUSTIFY = EXECUTION_STEP__JUSTIFY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__STEP = EXECUTION_STEP__STEP;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__ANSWERS = EXECUTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auxiliary Conduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT_FEATURE_COUNT = EXECUTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Auxiliary Conduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT_OPERATION_COUNT = EXECUTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.InformationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ID = EXECUTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__TYPE = EXECUTION_STEP__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__TYPE_VERBOSE = EXECUTION_STEP__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__URL = EXECUTION_STEP__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__IS_CURRENT = EXECUTION_STEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__REWORKED = EXECUTION_STEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__EXECUTED = EXECUTION_STEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__PREVIOUS = EXECUTION_STEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__NEXT = EXECUTION_STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__CREATION_DATE = EXECUTION_STEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__CHANGE_DATE = EXECUTION_STEP__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__EXECUTION_DATE = EXECUTION_STEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__CREATOR = EXECUTION_STEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__EXECUTOR = EXECUTION_STEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ID_STEP = EXECUTION_STEP__ID_STEP;

	/**
	 * The feature id for the '<em><b>Id Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ID_PROTOCOL = EXECUTION_STEP__ID_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Id Executed Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ID_EXECUTED_PROTOCOL = EXECUTION_STEP__ID_EXECUTED_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Justify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__JUSTIFY = EXECUTION_STEP__JUSTIFY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__STEP = EXECUTION_STEP__STEP;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = EXECUTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OPERATION_COUNT = EXECUTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.DischargeImpl <em>Discharge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.DischargeImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getDischarge()
	 * @generated
	 */
	int DISCHARGE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__ID = EXECUTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__TYPE = EXECUTION_STEP__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__TYPE_VERBOSE = EXECUTION_STEP__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__URL = EXECUTION_STEP__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__IS_CURRENT = EXECUTION_STEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__REWORKED = EXECUTION_STEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__EXECUTED = EXECUTION_STEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__PREVIOUS = EXECUTION_STEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__NEXT = EXECUTION_STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__CREATION_DATE = EXECUTION_STEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__CHANGE_DATE = EXECUTION_STEP__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__EXECUTION_DATE = EXECUTION_STEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__CREATOR = EXECUTION_STEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__EXECUTOR = EXECUTION_STEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__ID_STEP = EXECUTION_STEP__ID_STEP;

	/**
	 * The feature id for the '<em><b>Id Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__ID_PROTOCOL = EXECUTION_STEP__ID_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Id Executed Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__ID_EXECUTED_PROTOCOL = EXECUTION_STEP__ID_EXECUTED_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Justify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__JUSTIFY = EXECUTION_STEP__JUSTIFY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__STEP = EXECUTION_STEP__STEP;

	/**
	 * The number of structural features of the '<em>Discharge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_FEATURE_COUNT = EXECUTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Discharge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_OPERATION_COUNT = EXECUTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ReferralImpl <em>Referral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ReferralImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getReferral()
	 * @generated
	 */
	int REFERRAL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__ID = EXECUTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__TYPE = EXECUTION_STEP__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__TYPE_VERBOSE = EXECUTION_STEP__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__URL = EXECUTION_STEP__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__IS_CURRENT = EXECUTION_STEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__REWORKED = EXECUTION_STEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__EXECUTED = EXECUTION_STEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__PREVIOUS = EXECUTION_STEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__NEXT = EXECUTION_STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__CREATION_DATE = EXECUTION_STEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__CHANGE_DATE = EXECUTION_STEP__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__EXECUTION_DATE = EXECUTION_STEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__CREATOR = EXECUTION_STEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__EXECUTOR = EXECUTION_STEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__ID_STEP = EXECUTION_STEP__ID_STEP;

	/**
	 * The feature id for the '<em><b>Id Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__ID_PROTOCOL = EXECUTION_STEP__ID_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Id Executed Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__ID_EXECUTED_PROTOCOL = EXECUTION_STEP__ID_EXECUTED_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Justify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__JUSTIFY = EXECUTION_STEP__JUSTIFY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__STEP = EXECUTION_STEP__STEP;

	/**
	 * The number of structural features of the '<em>Referral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_FEATURE_COUNT = EXECUTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Referral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_OPERATION_COUNT = EXECUTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PrescriptionImpl <em>Prescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PrescriptionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescription()
	 * @generated
	 */
	int PRESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ID = EXECUTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__TYPE = EXECUTION_STEP__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__TYPE_VERBOSE = EXECUTION_STEP__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__URL = EXECUTION_STEP__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__IS_CURRENT = EXECUTION_STEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__REWORKED = EXECUTION_STEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__EXECUTED = EXECUTION_STEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__PREVIOUS = EXECUTION_STEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__NEXT = EXECUTION_STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__CREATION_DATE = EXECUTION_STEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__CHANGE_DATE = EXECUTION_STEP__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__EXECUTION_DATE = EXECUTION_STEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__CREATOR = EXECUTION_STEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__EXECUTOR = EXECUTION_STEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ID_STEP = EXECUTION_STEP__ID_STEP;

	/**
	 * The feature id for the '<em><b>Id Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ID_PROTOCOL = EXECUTION_STEP__ID_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Id Executed Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ID_EXECUTED_PROTOCOL = EXECUTION_STEP__ID_EXECUTED_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Justify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__JUSTIFY = EXECUTION_STEP__JUSTIFY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__STEP = EXECUTION_STEP__STEP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__TEXT = EXECUTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id Prescribed Medicament</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ID_PRESCRIBED_MEDICAMENT = EXECUTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id Prescribed Itens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ID_PRESCRIBED_ITENS = EXECUTION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prescribedmedicament</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__PRESCRIBEDMEDICAMENT = EXECUTION_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prescribedprescriptionitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM = EXECUTION_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_FEATURE_COUNT = EXECUTION_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_OPERATION_COUNT = EXECUTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.TreatmentImpl <em>Treatment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.TreatmentImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getTreatment()
	 * @generated
	 */
	int TREATMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__ID = EXECUTION_STEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__TYPE = EXECUTION_STEP__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__TYPE_VERBOSE = EXECUTION_STEP__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__URL = EXECUTION_STEP__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__IS_CURRENT = EXECUTION_STEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__REWORKED = EXECUTION_STEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__EXECUTED = EXECUTION_STEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__PREVIOUS = EXECUTION_STEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__NEXT = EXECUTION_STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__CREATION_DATE = EXECUTION_STEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__CHANGE_DATE = EXECUTION_STEP__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__EXECUTION_DATE = EXECUTION_STEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__CREATOR = EXECUTION_STEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__EXECUTOR = EXECUTION_STEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__ID_STEP = EXECUTION_STEP__ID_STEP;

	/**
	 * The feature id for the '<em><b>Id Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__ID_PROTOCOL = EXECUTION_STEP__ID_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Id Executed Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__ID_EXECUTED_PROTOCOL = EXECUTION_STEP__ID_EXECUTED_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Justify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__JUSTIFY = EXECUTION_STEP__JUSTIFY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__STEP = EXECUTION_STEP__STEP;

	/**
	 * The feature id for the '<em><b>Prescribedexam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__PRESCRIBEDEXAM = EXECUTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prescribedprocedure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__PRESCRIBEDPROCEDURE = EXECUTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prescribedinternment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__PRESCRIBEDINTERNMENT = EXECUTION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prescribedmedication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__PRESCRIBEDMEDICATION = EXECUTION_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_FEATURE_COUNT = EXECUTION_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_OPERATION_COUNT = EXECUTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ExaminationImpl <em>Examination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ExaminationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExamination()
	 * @generated
	 */
	int EXAMINATION = 7;

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
	 * The feature id for the '<em><b>Id Exam</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__ID_EXAM = 2;

	/**
	 * The feature id for the '<em><b>Side Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__SIDE_MEMBER = 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Justify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__JUSTIFY = 5;

	/**
	 * The feature id for the '<em><b>Clinical Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__CLINICAL_INDICATION = 6;

	/**
	 * The feature id for the '<em><b>Side Member Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__SIDE_MEMBER_DISPLAY = 7;

	/**
	 * The feature id for the '<em><b>Examination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__EXAMINATION = 8;

	/**
	 * The number of structural features of the '<em>Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PreviousImpl <em>Previous</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PreviousImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrevious()
	 * @generated
	 */
	int PREVIOUS = 8;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS__URL = 0;

	/**
	 * The feature id for the '<em><b>Url Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS__URL_ABSOLUTE = 1;

	/**
	 * The number of structural features of the '<em>Previous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Previous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.NextImpl <em>Next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.NextImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getNext()
	 * @generated
	 */
	int NEXT = 9;

	/**
	 * The feature id for the '<em><b>Url Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__URL_ABSOLUTE = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__URL = 1;

	/**
	 * The number of structural features of the '<em>Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.CreatorImpl <em>Creator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.CreatorImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getCreator()
	 * @generated
	 */
	int CREATOR = 10;

	/**
	 * The number of structural features of the '<em>Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ExecutorImpl <em>Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ExecutorImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExecutor()
	 * @generated
	 */
	int EXECUTOR = 11;

	/**
	 * The number of structural features of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.AnswerImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 12;

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
	 * The feature id for the '<em><b>Questions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__QUESTIONS = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__VALUE = 4;

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
	 * The meta object id for the '{@link MetamodelExecution.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.QuestionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 13;

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
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
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
	int VARIABLE = 14;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 6;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LINK = 7;

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
	 * The meta object id for the '{@link MetamodelExecution.impl.PrescribedExaminationImpl <em>Prescribed Examination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PrescribedExaminationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescribedExamination()
	 * @generated
	 */
	int PRESCRIBED_EXAMINATION = 15;

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
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION__RESULT = 2;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION__REPORT = 3;

	/**
	 * The feature id for the '<em><b>Number Guide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION__NUMBER_GUIDE = 4;

	/**
	 * The feature id for the '<em><b>Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION__PRESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Complement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION__COMPLEMENT = 6;

	/**
	 * The number of structural features of the '<em>Prescribed Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION_FEATURE_COUNT = 7;

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
	int EXAM = 16;

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
	int PRESCRIBED_PROCEDURE = 17;

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
	int PRESCRIBED_INTERNMENT = 18;

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
	int PRESCRIBED_MEDICATION = 19;

	/**
	 * The number of structural features of the '<em>Prescribed Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_MEDICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Prescribed Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_MEDICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ExaminationPrescriptionImpl <em>Examination Prescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ExaminationPrescriptionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExaminationPrescription()
	 * @generated
	 */
	int EXAMINATION_PRESCRIPTION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIPTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIPTION__SUCCESS = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIPTION__MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIPTION__REQUEST_DATE = 3;

	/**
	 * The number of structural features of the '<em>Examination Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Examination Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ComplementImpl <em>Complement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ComplementImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getComplement()
	 * @generated
	 */
	int COMPLEMENT = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Side Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__SIDE_MEMBER = 1;

	/**
	 * The feature id for the '<em><b>Side Member Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__SIDE_MEMBER_DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__QUANTITY = 3;

	/**
	 * The feature id for the '<em><b>Clinical Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__CLINICAL_INDICATION = 4;

	/**
	 * The number of structural features of the '<em>Complement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_FEATURE_COUNT = 5;

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
	int PRESCRIBED_PRESCRIPTION_ITEM = 22;

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
	 * The meta object id for the '{@link MetamodelExecution.impl.PrescribedMedicamentImpl <em>Prescribed Medicament</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PrescribedMedicamentImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescribedMedicament()
	 * @generated
	 */
	int PRESCRIBED_MEDICAMENT = 23;

	/**
	 * The number of structural features of the '<em>Prescribed Medicament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_MEDICAMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Prescribed Medicament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_MEDICAMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ExtendedProtocolImpl <em>Extended Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ExtendedProtocolImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExtendedProtocol()
	 * @generated
	 */
	int EXTENDED_PROTOCOL = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROTOCOL__ID = Protocolosv2Package.PROTOCOL__ID;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROTOCOL__URL = Protocolosv2Package.PROTOCOL__URL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROTOCOL__NAME = Protocolosv2Package.PROTOCOL__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROTOCOL__CODE = Protocolosv2Package.PROTOCOL__CODE;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROTOCOL__SEQUENCE = Protocolosv2Package.PROTOCOL__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROTOCOL__CATEGORY = Protocolosv2Package.PROTOCOL__CATEGORY;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROTOCOL__OPERATION = Protocolosv2Package.PROTOCOL__OPERATION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROTOCOL__VARIABLE = Protocolosv2Package.PROTOCOL__VARIABLE;

	/**
	 * The feature id for the '<em><b>Executionprotocol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROTOCOL__EXECUTIONPROTOCOL = Protocolosv2Package.PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Executionstep</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROTOCOL__EXECUTIONSTEP = Protocolosv2Package.PROTOCOL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extended Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROTOCOL_FEATURE_COUNT = Protocolosv2Package.PROTOCOL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extended Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROTOCOL_OPERATION_COUNT = Protocolosv2Package.PROTOCOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ExecutionProtocolImpl <em>Execution Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ExecutionProtocolImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExecutionProtocol()
	 * @generated
	 */
	int EXECUTION_PROTOCOL = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__ID = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__URL = 1;

	/**
	 * The feature id for the '<em><b>Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__CREATION = 2;

	/**
	 * The feature id for the '<em><b>Conclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__CONCLUSION = 3;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__COMPLETED = 4;

	/**
	 * The feature id for the '<em><b>Aborted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__ABORTED = 5;

	/**
	 * The feature id for the '<em><b>Justify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__JUSTIFY = 6;

	/**
	 * The feature id for the '<em><b>Last Executed Step Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__LAST_EXECUTED_STEP_DATE = 7;

	/**
	 * The feature id for the '<em><b>Id Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__ID_PROTOCOL = 8;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__PROTOCOL = 9;

	/**
	 * The feature id for the '<em><b>Id Responsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__ID_RESPONSIBLE = 10;

	/**
	 * The feature id for the '<em><b>Id Last Professional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__ID_LAST_PROFESSIONAL = 11;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__RESPONSIBLE = 12;

	/**
	 * The feature id for the '<em><b>Lastprofessional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__LASTPROFESSIONAL = 13;

	/**
	 * The feature id for the '<em><b>Executedstep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL__EXECUTEDSTEP = 14;

	/**
	 * The number of structural features of the '<em>Execution Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Execution Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.JustifyImpl <em>Justify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.JustifyImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getJustify()
	 * @generated
	 */
	int JUSTIFY = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFY__ID = 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFY__REASON = 1;

	/**
	 * The feature id for the '<em><b>Reason Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFY__REASON_DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFY__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Justify By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFY__JUSTIFY_BY_ID = 4;

	/**
	 * The feature id for the '<em><b>Justify By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFY__JUSTIFY_BY = 5;

	/**
	 * The number of structural features of the '<em>Justify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Justify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ProtocolImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__ID = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__URL = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__CODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__NAME = 3;

	/**
	 * The feature id for the '<em><b>Id Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__ID_REPOSITORY = 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__VERSION = 5;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__COMPLETED = 6;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ResponsibleImpl <em>Responsible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ResponsibleImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getResponsible()
	 * @generated
	 */
	int RESPONSIBLE = 28;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE__DATA = 0;

	/**
	 * The number of structural features of the '<em>Responsible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Responsible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ExecutedStepImpl <em>Executed Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ExecutedStepImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExecutedStep()
	 * @generated
	 */
	int EXECUTED_STEP = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__TYPE_VERBOSE = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__URL = 3;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__EXECUTED = 4;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__IS_CURRENT = 5;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__REWORKED = 6;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__CREATION_DATE = 7;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__CHANGE_DATE = 8;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__EXECUTION_DATE = 9;

	/**
	 * The feature id for the '<em><b>Id Executed Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__ID_EXECUTED_PROTOCOL = 10;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__ID_STEP = 11;

	/**
	 * The feature id for the '<em><b>Id Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__ID_PROTOCOL = 12;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__CREATED_BY_ID = 13;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__CREATED_BY = 14;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__EXECUTED_BY_ID = 15;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__EXECUTED_BY = 16;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__STEP = 17;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__PREVIOUS = 18;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__NEXT = 19;

	/**
	 * The feature id for the '<em><b>Justify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__JUSTIFY = 20;

	/**
	 * The number of structural features of the '<em>Executed Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Executed Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.LastProfessionalImpl <em>Last Professional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.LastProfessionalImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getLastProfessional()
	 * @generated
	 */
	int LAST_PROFESSIONAL = 30;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL__DATA = 0;

	/**
	 * The number of structural features of the '<em>Last Professional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Last Professional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.Data <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.Data
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getData()
	 * @generated
	 */
	int DATA = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__URL = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CODE = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = 4;

	/**
	 * The feature id for the '<em><b>Type Council</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TYPE_COUNCIL = 5;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LOGIN = 6;

	/**
	 * The feature id for the '<em><b>Number Council</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NUMBER_COUNCIL = 7;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__STATE = 8;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__EXECUTOR = 9;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CREATOR = 10;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.ExecutionStep <em>Execution Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Step</em>'.
	 * @see MetamodelExecution.ExecutionStep
	 * @generated
	 */
	EClass getExecutionStep();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.ExecutionStep#getId()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EAttribute getExecutionStep_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionStep#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MetamodelExecution.ExecutionStep#getType()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EAttribute getExecutionStep_Type();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionStep#getTypeVerbose <em>Type Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Verbose</em>'.
	 * @see MetamodelExecution.ExecutionStep#getTypeVerbose()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EAttribute getExecutionStep_TypeVerbose();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionStep#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.ExecutionStep#getUrl()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EAttribute getExecutionStep_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionStep#isIsCurrent <em>Is Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Current</em>'.
	 * @see MetamodelExecution.ExecutionStep#isIsCurrent()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EAttribute getExecutionStep_IsCurrent();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionStep#isReworked <em>Reworked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reworked</em>'.
	 * @see MetamodelExecution.ExecutionStep#isReworked()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EAttribute getExecutionStep_Reworked();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionStep#isExecuted <em>Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed</em>'.
	 * @see MetamodelExecution.ExecutionStep#isExecuted()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EAttribute getExecutionStep_Executed();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ExecutionStep#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Previous</em>'.
	 * @see MetamodelExecution.ExecutionStep#getPrevious()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EReference getExecutionStep_Previous();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ExecutionStep#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see MetamodelExecution.ExecutionStep#getNext()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EReference getExecutionStep_Next();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionStep#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see MetamodelExecution.ExecutionStep#getCreationDate()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EAttribute getExecutionStep_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionStep#getChangeDate <em>Change Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Date</em>'.
	 * @see MetamodelExecution.ExecutionStep#getChangeDate()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EAttribute getExecutionStep_ChangeDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionStep#getExecutionDate <em>Execution Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Date</em>'.
	 * @see MetamodelExecution.ExecutionStep#getExecutionDate()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EAttribute getExecutionStep_ExecutionDate();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ExecutionStep#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creator</em>'.
	 * @see MetamodelExecution.ExecutionStep#getCreator()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EReference getExecutionStep_Creator();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ExecutionStep#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executor</em>'.
	 * @see MetamodelExecution.ExecutionStep#getExecutor()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EReference getExecutionStep_Executor();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionStep#getIdStep <em>Id Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Step</em>'.
	 * @see MetamodelExecution.ExecutionStep#getIdStep()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EAttribute getExecutionStep_IdStep();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionStep#getIdProtocol <em>Id Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Protocol</em>'.
	 * @see MetamodelExecution.ExecutionStep#getIdProtocol()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EAttribute getExecutionStep_IdProtocol();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionStep#getIdExecutedProtocol <em>Id Executed Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Executed Protocol</em>'.
	 * @see MetamodelExecution.ExecutionStep#getIdExecutedProtocol()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EAttribute getExecutionStep_IdExecutedProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ExecutionStep#getJustify <em>Justify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Justify</em>'.
	 * @see MetamodelExecution.ExecutionStep#getJustify()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EReference getExecutionStep_Justify();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.ExecutionStep#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see MetamodelExecution.ExecutionStep#getStep()
	 * @see #getExecutionStep()
	 * @generated
	 */
	EReference getExecutionStep_Step();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.AuxiliaryConduct <em>Auxiliary Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary Conduct</em>'.
	 * @see MetamodelExecution.AuxiliaryConduct
	 * @generated
	 */
	EClass getAuxiliaryConduct();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.AuxiliaryConduct#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see MetamodelExecution.AuxiliaryConduct#getAnswers()
	 * @see #getAuxiliaryConduct()
	 * @generated
	 */
	EReference getAuxiliaryConduct_Answers();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see MetamodelExecution.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Discharge <em>Discharge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge</em>'.
	 * @see MetamodelExecution.Discharge
	 * @generated
	 */
	EClass getDischarge();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Referral <em>Referral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referral</em>'.
	 * @see MetamodelExecution.Referral
	 * @generated
	 */
	EClass getReferral();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see MetamodelExecution.Prescription#getText()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Text();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getIdPrescribedMedicament <em>Id Prescribed Medicament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Prescribed Medicament</em>'.
	 * @see MetamodelExecution.Prescription#getIdPrescribedMedicament()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_IdPrescribedMedicament();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getIdPrescribedItens <em>Id Prescribed Itens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Prescribed Itens</em>'.
	 * @see MetamodelExecution.Prescription#getIdPrescribedItens()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_IdPrescribedItens();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.Prescription#getPrescribedmedicament <em>Prescribedmedicament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescribedmedicament</em>'.
	 * @see MetamodelExecution.Prescription#getPrescribedmedicament()
	 * @see #getPrescription()
	 * @generated
	 */
	EReference getPrescription_Prescribedmedicament();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.Prescription#getPrescribedprescriptionitem <em>Prescribedprescriptionitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescribedprescriptionitem</em>'.
	 * @see MetamodelExecution.Prescription#getPrescribedprescriptionitem()
	 * @see #getPrescription()
	 * @generated
	 */
	EReference getPrescription_Prescribedprescriptionitem();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Treatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Treatment</em>'.
	 * @see MetamodelExecution.Treatment
	 * @generated
	 */
	EClass getTreatment();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Treatment#getPrescribedexam <em>Prescribedexam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescribedexam</em>'.
	 * @see MetamodelExecution.Treatment#getPrescribedexam()
	 * @see #getTreatment()
	 * @generated
	 */
	EReference getTreatment_Prescribedexam();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.Treatment#getPrescribedprocedure <em>Prescribedprocedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescribedprocedure</em>'.
	 * @see MetamodelExecution.Treatment#getPrescribedprocedure()
	 * @see #getTreatment()
	 * @generated
	 */
	EReference getTreatment_Prescribedprocedure();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.Treatment#getPrescribedinternment <em>Prescribedinternment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescribedinternment</em>'.
	 * @see MetamodelExecution.Treatment#getPrescribedinternment()
	 * @see #getTreatment()
	 * @generated
	 */
	EReference getTreatment_Prescribedinternment();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.Treatment#getPrescribedmedication <em>Prescribedmedication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescribedmedication</em>'.
	 * @see MetamodelExecution.Treatment#getPrescribedmedication()
	 * @see #getTreatment()
	 * @generated
	 */
	EReference getTreatment_Prescribedmedication();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getIdExam <em>Id Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Exam</em>'.
	 * @see MetamodelExecution.Examination#getIdExam()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_IdExam();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getSideMember <em>Side Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side Member</em>'.
	 * @see MetamodelExecution.Examination#getSideMember()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_SideMember();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getJustify <em>Justify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justify</em>'.
	 * @see MetamodelExecution.Examination#getJustify()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Justify();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getSideMemberDisplay <em>Side Member Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side Member Display</em>'.
	 * @see MetamodelExecution.Examination#getSideMemberDisplay()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_SideMemberDisplay();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Examination#getExamination <em>Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Examination</em>'.
	 * @see MetamodelExecution.Examination#getExamination()
	 * @see #getExamination()
	 * @generated
	 */
	EReference getExamination_Examination();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Previous#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Previous#getUrl()
	 * @see #getPrevious()
	 * @generated
	 */
	EAttribute getPrevious_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Previous#getUrlAbsolute <em>Url Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Absolute</em>'.
	 * @see MetamodelExecution.Previous#getUrlAbsolute()
	 * @see #getPrevious()
	 * @generated
	 */
	EAttribute getPrevious_UrlAbsolute();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Next#getUrlAbsolute <em>Url Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Absolute</em>'.
	 * @see MetamodelExecution.Next#getUrlAbsolute()
	 * @see #getNext()
	 * @generated
	 */
	EAttribute getNext_UrlAbsolute();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Next#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Next#getUrl()
	 * @see #getNext()
	 * @generated
	 */
	EAttribute getNext_Url();

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
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Answer#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Questions</em>'.
	 * @see MetamodelExecution.Answer#getQuestions()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_Questions();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Answer#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MetamodelExecution.Answer#isValue()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Value();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Question#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see MetamodelExecution.Question#getText()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.Question#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Variable#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MetamodelExecution.Variable#isValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Variable#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see MetamodelExecution.Variable#getLink()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Link();

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
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.PrescribedExamination#getComplement <em>Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complement</em>'.
	 * @see MetamodelExecution.PrescribedExamination#getComplement()
	 * @see #getPrescribedExamination()
	 * @generated
	 */
	EReference getPrescribedExamination_Complement();

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
	 * Returns the meta object for class '{@link MetamodelExecution.ExaminationPrescription <em>Examination Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examination Prescription</em>'.
	 * @see MetamodelExecution.ExaminationPrescription
	 * @generated
	 */
	EClass getExaminationPrescription();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExaminationPrescription#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.ExaminationPrescription#getId()
	 * @see #getExaminationPrescription()
	 * @generated
	 */
	EAttribute getExaminationPrescription_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExaminationPrescription#isSuccess <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success</em>'.
	 * @see MetamodelExecution.ExaminationPrescription#isSuccess()
	 * @see #getExaminationPrescription()
	 * @generated
	 */
	EAttribute getExaminationPrescription_Success();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExaminationPrescription#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see MetamodelExecution.ExaminationPrescription#getMessage()
	 * @see #getExaminationPrescription()
	 * @generated
	 */
	EAttribute getExaminationPrescription_Message();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExaminationPrescription#getRequestDate <em>Request Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Date</em>'.
	 * @see MetamodelExecution.ExaminationPrescription#getRequestDate()
	 * @see #getExaminationPrescription()
	 * @generated
	 */
	EAttribute getExaminationPrescription_RequestDate();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Complement#getSideMember <em>Side Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side Member</em>'.
	 * @see MetamodelExecution.Complement#getSideMember()
	 * @see #getComplement()
	 * @generated
	 */
	EAttribute getComplement_SideMember();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Complement#getSideMemberDisplay <em>Side Member Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side Member Display</em>'.
	 * @see MetamodelExecution.Complement#getSideMemberDisplay()
	 * @see #getComplement()
	 * @generated
	 */
	EAttribute getComplement_SideMemberDisplay();

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
	 * Returns the meta object for class '{@link MetamodelExecution.PrescribedPrescriptionItem <em>Prescribed Prescription Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescribed Prescription Item</em>'.
	 * @see MetamodelExecution.PrescribedPrescriptionItem
	 * @generated
	 */
	EClass getPrescribedPrescriptionItem();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.PrescribedMedicament <em>Prescribed Medicament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescribed Medicament</em>'.
	 * @see MetamodelExecution.PrescribedMedicament
	 * @generated
	 */
	EClass getPrescribedMedicament();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.ExtendedProtocol <em>Extended Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Protocol</em>'.
	 * @see MetamodelExecution.ExtendedProtocol
	 * @generated
	 */
	EClass getExtendedProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.ExtendedProtocol#getExecutionprotocol <em>Executionprotocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executionprotocol</em>'.
	 * @see MetamodelExecution.ExtendedProtocol#getExecutionprotocol()
	 * @see #getExtendedProtocol()
	 * @generated
	 */
	EReference getExtendedProtocol_Executionprotocol();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.ExtendedProtocol#getExecutionstep <em>Executionstep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executionstep</em>'.
	 * @see MetamodelExecution.ExtendedProtocol#getExecutionstep()
	 * @see #getExtendedProtocol()
	 * @generated
	 */
	EReference getExtendedProtocol_Executionstep();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.ExecutionProtocol <em>Execution Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Protocol</em>'.
	 * @see MetamodelExecution.ExecutionProtocol
	 * @generated
	 */
	EClass getExecutionProtocol();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionProtocol#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#getId()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EAttribute getExecutionProtocol_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionProtocol#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#getUrl()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EAttribute getExecutionProtocol_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionProtocol#getCreation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#getCreation()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EAttribute getExecutionProtocol_Creation();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionProtocol#getConclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conclusion</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#getConclusion()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EAttribute getExecutionProtocol_Conclusion();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionProtocol#isCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#isCompleted()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EAttribute getExecutionProtocol_Completed();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionProtocol#isAborted <em>Aborted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aborted</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#isAborted()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EAttribute getExecutionProtocol_Aborted();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ExecutionProtocol#getJustify <em>Justify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Justify</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#getJustify()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EReference getExecutionProtocol_Justify();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionProtocol#getLastExecutedStepDate <em>Last Executed Step Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Executed Step Date</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#getLastExecutedStepDate()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EAttribute getExecutionProtocol_LastExecutedStepDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionProtocol#getIdProtocol <em>Id Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Protocol</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#getIdProtocol()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EAttribute getExecutionProtocol_IdProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ExecutionProtocol#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocol</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#getProtocol()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EReference getExecutionProtocol_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionProtocol#getIdResponsible <em>Id Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Responsible</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#getIdResponsible()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EAttribute getExecutionProtocol_IdResponsible();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutionProtocol#getIdLastProfessional <em>Id Last Professional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Last Professional</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#getIdLastProfessional()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EAttribute getExecutionProtocol_IdLastProfessional();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ExecutionProtocol#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responsible</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#getResponsible()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EReference getExecutionProtocol_Responsible();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ExecutionProtocol#getLastprofessional <em>Lastprofessional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lastprofessional</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#getLastprofessional()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EReference getExecutionProtocol_Lastprofessional();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ExecutionProtocol#getExecutedstep <em>Executedstep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executedstep</em>'.
	 * @see MetamodelExecution.ExecutionProtocol#getExecutedstep()
	 * @see #getExecutionProtocol()
	 * @generated
	 */
	EReference getExecutionProtocol_Executedstep();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Justify <em>Justify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justify</em>'.
	 * @see MetamodelExecution.Justify
	 * @generated
	 */
	EClass getJustify();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Justify#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Justify#getId()
	 * @see #getJustify()
	 * @generated
	 */
	EAttribute getJustify_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Justify#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see MetamodelExecution.Justify#getReason()
	 * @see #getJustify()
	 * @generated
	 */
	EAttribute getJustify_Reason();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Justify#getReasonDisplay <em>Reason Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason Display</em>'.
	 * @see MetamodelExecution.Justify#getReasonDisplay()
	 * @see #getJustify()
	 * @generated
	 */
	EAttribute getJustify_ReasonDisplay();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Justify#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MetamodelExecution.Justify#getDescription()
	 * @see #getJustify()
	 * @generated
	 */
	EAttribute getJustify_Description();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Justify#getJustifyById <em>Justify By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justify By Id</em>'.
	 * @see MetamodelExecution.Justify#getJustifyById()
	 * @see #getJustify()
	 * @generated
	 */
	EAttribute getJustify_JustifyById();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Justify#getJustifyBy <em>Justify By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justify By</em>'.
	 * @see MetamodelExecution.Justify#getJustifyBy()
	 * @see #getJustify()
	 * @generated
	 */
	EAttribute getJustify_JustifyBy();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see MetamodelExecution.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Protocol#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Protocol#getId()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Protocol#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Protocol#getUrl()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Protocol#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MetamodelExecution.Protocol#getCode()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Code();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Protocol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Protocol#getName()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Protocol#getIdRepository <em>Id Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Repository</em>'.
	 * @see MetamodelExecution.Protocol#getIdRepository()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_IdRepository();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Protocol#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see MetamodelExecution.Protocol#getVersion()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Version();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Protocol#isCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed</em>'.
	 * @see MetamodelExecution.Protocol#isCompleted()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Completed();

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
	 * Returns the meta object for the reference '{@link MetamodelExecution.Responsible#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see MetamodelExecution.Responsible#getData()
	 * @see #getResponsible()
	 * @generated
	 */
	EReference getResponsible_Data();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.ExecutedStep <em>Executed Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executed Step</em>'.
	 * @see MetamodelExecution.ExecutedStep
	 * @generated
	 */
	EClass getExecutedStep();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.ExecutedStep#getId()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MetamodelExecution.ExecutedStep#getType()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_Type();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getTypeVerbose <em>Type Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Verbose</em>'.
	 * @see MetamodelExecution.ExecutedStep#getTypeVerbose()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_TypeVerbose();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.ExecutedStep#getUrl()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#isExecuted <em>Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed</em>'.
	 * @see MetamodelExecution.ExecutedStep#isExecuted()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_Executed();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#isIsCurrent <em>Is Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Current</em>'.
	 * @see MetamodelExecution.ExecutedStep#isIsCurrent()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_IsCurrent();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#isReworked <em>Reworked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reworked</em>'.
	 * @see MetamodelExecution.ExecutedStep#isReworked()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_Reworked();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see MetamodelExecution.ExecutedStep#getCreationDate()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getChangeDate <em>Change Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Date</em>'.
	 * @see MetamodelExecution.ExecutedStep#getChangeDate()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_ChangeDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getExecutionDate <em>Execution Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Date</em>'.
	 * @see MetamodelExecution.ExecutedStep#getExecutionDate()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_ExecutionDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getIdExecutedProtocol <em>Id Executed Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Executed Protocol</em>'.
	 * @see MetamodelExecution.ExecutedStep#getIdExecutedProtocol()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_IdExecutedProtocol();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getIdStep <em>Id Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Step</em>'.
	 * @see MetamodelExecution.ExecutedStep#getIdStep()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_IdStep();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getIdProtocol <em>Id Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Protocol</em>'.
	 * @see MetamodelExecution.ExecutedStep#getIdProtocol()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_IdProtocol();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getCreatedById <em>Created By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By Id</em>'.
	 * @see MetamodelExecution.ExecutedStep#getCreatedById()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_CreatedById();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By</em>'.
	 * @see MetamodelExecution.ExecutedStep#getCreatedBy()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_CreatedBy();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getExecutedById <em>Executed By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed By Id</em>'.
	 * @see MetamodelExecution.ExecutedStep#getExecutedById()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_ExecutedById();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getExecutedBy <em>Executed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed By</em>'.
	 * @see MetamodelExecution.ExecutedStep#getExecutedBy()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_ExecutedBy();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see MetamodelExecution.ExecutedStep#getStep()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_Step();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ExecutedStep#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Previous</em>'.
	 * @see MetamodelExecution.ExecutedStep#getPrevious()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EReference getExecutedStep_Previous();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ExecutedStep#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see MetamodelExecution.ExecutedStep#getNext()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EReference getExecutedStep_Next();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ExecutedStep#getJustify <em>Justify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Justify</em>'.
	 * @see MetamodelExecution.ExecutedStep#getJustify()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EReference getExecutedStep_Justify();

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
	 * Returns the meta object for the reference '{@link MetamodelExecution.LastProfessional#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see MetamodelExecution.LastProfessional#getData()
	 * @see #getLastProfessional()
	 * @generated
	 */
	EReference getLastProfessional_Data();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see MetamodelExecution.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Data#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Data#getId()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Data#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Data#getUrl()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Data#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MetamodelExecution.Data#getCode()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Code();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Data#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see MetamodelExecution.Data#getEmail()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Email();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Data#getTypeCouncil <em>Type Council</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Council</em>'.
	 * @see MetamodelExecution.Data#getTypeCouncil()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_TypeCouncil();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Data#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see MetamodelExecution.Data#getLogin()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Login();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Data#getNumberCouncil <em>Number Council</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Council</em>'.
	 * @see MetamodelExecution.Data#getNumberCouncil()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_NumberCouncil();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Data#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see MetamodelExecution.Data#getState()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_State();

	/**
	 * Returns the meta object for the reference '{@link MetamodelExecution.Data#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executor</em>'.
	 * @see MetamodelExecution.Data#getExecutor()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Executor();

	/**
	 * Returns the meta object for the reference '{@link MetamodelExecution.Data#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Creator</em>'.
	 * @see MetamodelExecution.Data#getCreator()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Creator();

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
		 * The meta object literal for the '{@link MetamodelExecution.impl.ExecutionStepImpl <em>Execution Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ExecutionStepImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExecutionStep()
		 * @generated
		 */
		EClass EXECUTION_STEP = eINSTANCE.getExecutionStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STEP__ID = eINSTANCE.getExecutionStep_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STEP__TYPE = eINSTANCE.getExecutionStep_Type();

		/**
		 * The meta object literal for the '<em><b>Type Verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STEP__TYPE_VERBOSE = eINSTANCE.getExecutionStep_TypeVerbose();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STEP__URL = eINSTANCE.getExecutionStep_Url();

		/**
		 * The meta object literal for the '<em><b>Is Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STEP__IS_CURRENT = eINSTANCE.getExecutionStep_IsCurrent();

		/**
		 * The meta object literal for the '<em><b>Reworked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STEP__REWORKED = eINSTANCE.getExecutionStep_Reworked();

		/**
		 * The meta object literal for the '<em><b>Executed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STEP__EXECUTED = eINSTANCE.getExecutionStep_Executed();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_STEP__PREVIOUS = eINSTANCE.getExecutionStep_Previous();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_STEP__NEXT = eINSTANCE.getExecutionStep_Next();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STEP__CREATION_DATE = eINSTANCE.getExecutionStep_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Change Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STEP__CHANGE_DATE = eINSTANCE.getExecutionStep_ChangeDate();

		/**
		 * The meta object literal for the '<em><b>Execution Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STEP__EXECUTION_DATE = eINSTANCE.getExecutionStep_ExecutionDate();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_STEP__CREATOR = eINSTANCE.getExecutionStep_Creator();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_STEP__EXECUTOR = eINSTANCE.getExecutionStep_Executor();

		/**
		 * The meta object literal for the '<em><b>Id Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STEP__ID_STEP = eINSTANCE.getExecutionStep_IdStep();

		/**
		 * The meta object literal for the '<em><b>Id Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STEP__ID_PROTOCOL = eINSTANCE.getExecutionStep_IdProtocol();

		/**
		 * The meta object literal for the '<em><b>Id Executed Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STEP__ID_EXECUTED_PROTOCOL = eINSTANCE.getExecutionStep_IdExecutedProtocol();

		/**
		 * The meta object literal for the '<em><b>Justify</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_STEP__JUSTIFY = eINSTANCE.getExecutionStep_Justify();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_STEP__STEP = eINSTANCE.getExecutionStep_Step();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.AuxiliaryConductImpl <em>Auxiliary Conduct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.AuxiliaryConductImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getAuxiliaryConduct()
		 * @generated
		 */
		EClass AUXILIARY_CONDUCT = eINSTANCE.getAuxiliaryConduct();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_CONDUCT__ANSWERS = eINSTANCE.getAuxiliaryConduct_Answers();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.InformationImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.DischargeImpl <em>Discharge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.DischargeImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getDischarge()
		 * @generated
		 */
		EClass DISCHARGE = eINSTANCE.getDischarge();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ReferralImpl <em>Referral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ReferralImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getReferral()
		 * @generated
		 */
		EClass REFERRAL = eINSTANCE.getReferral();

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
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__TEXT = eINSTANCE.getPrescription_Text();

		/**
		 * The meta object literal for the '<em><b>Id Prescribed Medicament</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__ID_PRESCRIBED_MEDICAMENT = eINSTANCE.getPrescription_IdPrescribedMedicament();

		/**
		 * The meta object literal for the '<em><b>Id Prescribed Itens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__ID_PRESCRIBED_ITENS = eINSTANCE.getPrescription_IdPrescribedItens();

		/**
		 * The meta object literal for the '<em><b>Prescribedmedicament</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIPTION__PRESCRIBEDMEDICAMENT = eINSTANCE.getPrescription_Prescribedmedicament();

		/**
		 * The meta object literal for the '<em><b>Prescribedprescriptionitem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM = eINSTANCE.getPrescription_Prescribedprescriptionitem();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.TreatmentImpl <em>Treatment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.TreatmentImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getTreatment()
		 * @generated
		 */
		EClass TREATMENT = eINSTANCE.getTreatment();

		/**
		 * The meta object literal for the '<em><b>Prescribedexam</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREATMENT__PRESCRIBEDEXAM = eINSTANCE.getTreatment_Prescribedexam();

		/**
		 * The meta object literal for the '<em><b>Prescribedprocedure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREATMENT__PRESCRIBEDPROCEDURE = eINSTANCE.getTreatment_Prescribedprocedure();

		/**
		 * The meta object literal for the '<em><b>Prescribedinternment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREATMENT__PRESCRIBEDINTERNMENT = eINSTANCE.getTreatment_Prescribedinternment();

		/**
		 * The meta object literal for the '<em><b>Prescribedmedication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREATMENT__PRESCRIBEDMEDICATION = eINSTANCE.getTreatment_Prescribedmedication();

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
		 * The meta object literal for the '<em><b>Id Exam</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__ID_EXAM = eINSTANCE.getExamination_IdExam();

		/**
		 * The meta object literal for the '<em><b>Side Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__SIDE_MEMBER = eINSTANCE.getExamination_SideMember();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__QUANTITY = eINSTANCE.getExamination_Quantity();

		/**
		 * The meta object literal for the '<em><b>Justify</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__JUSTIFY = eINSTANCE.getExamination_Justify();

		/**
		 * The meta object literal for the '<em><b>Clinical Indication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__CLINICAL_INDICATION = eINSTANCE.getExamination_ClinicalIndication();

		/**
		 * The meta object literal for the '<em><b>Side Member Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__SIDE_MEMBER_DISPLAY = eINSTANCE.getExamination_SideMemberDisplay();

		/**
		 * The meta object literal for the '<em><b>Examination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINATION__EXAMINATION = eINSTANCE.getExamination_Examination();

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
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREVIOUS__URL = eINSTANCE.getPrevious_Url();

		/**
		 * The meta object literal for the '<em><b>Url Absolute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREVIOUS__URL_ABSOLUTE = eINSTANCE.getPrevious_UrlAbsolute();

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
		 * The meta object literal for the '<em><b>Url Absolute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEXT__URL_ABSOLUTE = eINSTANCE.getNext_UrlAbsolute();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEXT__URL = eINSTANCE.getNext_Url();

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
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__QUESTIONS = eINSTANCE.getAnswer_Questions();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__VALUE = eINSTANCE.getAnswer_Value();

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
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__TEXT = eINSTANCE.getQuestion_Text();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__LINK = eINSTANCE.getVariable_Link();

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
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIBED_EXAMINATION__RESULT = eINSTANCE.getPrescribedExamination_Result();

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
		 * The meta object literal for the '<em><b>Prescription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBED_EXAMINATION__PRESCRIPTION = eINSTANCE.getPrescribedExamination_Prescription();

		/**
		 * The meta object literal for the '<em><b>Complement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBED_EXAMINATION__COMPLEMENT = eINSTANCE.getPrescribedExamination_Complement();

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
		 * The meta object literal for the '{@link MetamodelExecution.impl.ExaminationPrescriptionImpl <em>Examination Prescription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ExaminationPrescriptionImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExaminationPrescription()
		 * @generated
		 */
		EClass EXAMINATION_PRESCRIPTION = eINSTANCE.getExaminationPrescription();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PRESCRIPTION__ID = eINSTANCE.getExaminationPrescription_Id();

		/**
		 * The meta object literal for the '<em><b>Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PRESCRIPTION__SUCCESS = eINSTANCE.getExaminationPrescription_Success();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PRESCRIPTION__MESSAGE = eINSTANCE.getExaminationPrescription_Message();

		/**
		 * The meta object literal for the '<em><b>Request Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PRESCRIPTION__REQUEST_DATE = eINSTANCE.getExaminationPrescription_RequestDate();

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
		 * The meta object literal for the '<em><b>Side Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENT__SIDE_MEMBER = eINSTANCE.getComplement_SideMember();

		/**
		 * The meta object literal for the '<em><b>Side Member Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENT__SIDE_MEMBER_DISPLAY = eINSTANCE.getComplement_SideMemberDisplay();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENT__QUANTITY = eINSTANCE.getComplement_Quantity();

		/**
		 * The meta object literal for the '<em><b>Clinical Indication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENT__CLINICAL_INDICATION = eINSTANCE.getComplement_ClinicalIndication();

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
		 * The meta object literal for the '{@link MetamodelExecution.impl.PrescribedMedicamentImpl <em>Prescribed Medicament</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PrescribedMedicamentImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescribedMedicament()
		 * @generated
		 */
		EClass PRESCRIBED_MEDICAMENT = eINSTANCE.getPrescribedMedicament();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ExtendedProtocolImpl <em>Extended Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ExtendedProtocolImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExtendedProtocol()
		 * @generated
		 */
		EClass EXTENDED_PROTOCOL = eINSTANCE.getExtendedProtocol();

		/**
		 * The meta object literal for the '<em><b>Executionprotocol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PROTOCOL__EXECUTIONPROTOCOL = eINSTANCE.getExtendedProtocol_Executionprotocol();

		/**
		 * The meta object literal for the '<em><b>Executionstep</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDED_PROTOCOL__EXECUTIONSTEP = eINSTANCE.getExtendedProtocol_Executionstep();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ExecutionProtocolImpl <em>Execution Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ExecutionProtocolImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExecutionProtocol()
		 * @generated
		 */
		EClass EXECUTION_PROTOCOL = eINSTANCE.getExecutionProtocol();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_PROTOCOL__ID = eINSTANCE.getExecutionProtocol_Id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_PROTOCOL__URL = eINSTANCE.getExecutionProtocol_Url();

		/**
		 * The meta object literal for the '<em><b>Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_PROTOCOL__CREATION = eINSTANCE.getExecutionProtocol_Creation();

		/**
		 * The meta object literal for the '<em><b>Conclusion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_PROTOCOL__CONCLUSION = eINSTANCE.getExecutionProtocol_Conclusion();

		/**
		 * The meta object literal for the '<em><b>Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_PROTOCOL__COMPLETED = eINSTANCE.getExecutionProtocol_Completed();

		/**
		 * The meta object literal for the '<em><b>Aborted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_PROTOCOL__ABORTED = eINSTANCE.getExecutionProtocol_Aborted();

		/**
		 * The meta object literal for the '<em><b>Justify</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PROTOCOL__JUSTIFY = eINSTANCE.getExecutionProtocol_Justify();

		/**
		 * The meta object literal for the '<em><b>Last Executed Step Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_PROTOCOL__LAST_EXECUTED_STEP_DATE = eINSTANCE.getExecutionProtocol_LastExecutedStepDate();

		/**
		 * The meta object literal for the '<em><b>Id Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_PROTOCOL__ID_PROTOCOL = eINSTANCE.getExecutionProtocol_IdProtocol();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PROTOCOL__PROTOCOL = eINSTANCE.getExecutionProtocol_Protocol();

		/**
		 * The meta object literal for the '<em><b>Id Responsible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_PROTOCOL__ID_RESPONSIBLE = eINSTANCE.getExecutionProtocol_IdResponsible();

		/**
		 * The meta object literal for the '<em><b>Id Last Professional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_PROTOCOL__ID_LAST_PROFESSIONAL = eINSTANCE.getExecutionProtocol_IdLastProfessional();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PROTOCOL__RESPONSIBLE = eINSTANCE.getExecutionProtocol_Responsible();

		/**
		 * The meta object literal for the '<em><b>Lastprofessional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PROTOCOL__LASTPROFESSIONAL = eINSTANCE.getExecutionProtocol_Lastprofessional();

		/**
		 * The meta object literal for the '<em><b>Executedstep</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PROTOCOL__EXECUTEDSTEP = eINSTANCE.getExecutionProtocol_Executedstep();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.JustifyImpl <em>Justify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.JustifyImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getJustify()
		 * @generated
		 */
		EClass JUSTIFY = eINSTANCE.getJustify();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFY__ID = eINSTANCE.getJustify_Id();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFY__REASON = eINSTANCE.getJustify_Reason();

		/**
		 * The meta object literal for the '<em><b>Reason Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFY__REASON_DISPLAY = eINSTANCE.getJustify_ReasonDisplay();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFY__DESCRIPTION = eINSTANCE.getJustify_Description();

		/**
		 * The meta object literal for the '<em><b>Justify By Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFY__JUSTIFY_BY_ID = eINSTANCE.getJustify_JustifyById();

		/**
		 * The meta object literal for the '<em><b>Justify By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFY__JUSTIFY_BY = eINSTANCE.getJustify_JustifyBy();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ProtocolImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__ID = eINSTANCE.getProtocol_Id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__URL = eINSTANCE.getProtocol_Url();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__CODE = eINSTANCE.getProtocol_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__NAME = eINSTANCE.getProtocol_Name();

		/**
		 * The meta object literal for the '<em><b>Id Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__ID_REPOSITORY = eINSTANCE.getProtocol_IdRepository();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__VERSION = eINSTANCE.getProtocol_Version();

		/**
		 * The meta object literal for the '<em><b>Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__COMPLETED = eINSTANCE.getProtocol_Completed();

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
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBLE__DATA = eINSTANCE.getResponsible_Data();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ExecutedStepImpl <em>Executed Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ExecutedStepImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExecutedStep()
		 * @generated
		 */
		EClass EXECUTED_STEP = eINSTANCE.getExecutedStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__ID = eINSTANCE.getExecutedStep_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__TYPE = eINSTANCE.getExecutedStep_Type();

		/**
		 * The meta object literal for the '<em><b>Type Verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__TYPE_VERBOSE = eINSTANCE.getExecutedStep_TypeVerbose();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__URL = eINSTANCE.getExecutedStep_Url();

		/**
		 * The meta object literal for the '<em><b>Executed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__EXECUTED = eINSTANCE.getExecutedStep_Executed();

		/**
		 * The meta object literal for the '<em><b>Is Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__IS_CURRENT = eINSTANCE.getExecutedStep_IsCurrent();

		/**
		 * The meta object literal for the '<em><b>Reworked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__REWORKED = eINSTANCE.getExecutedStep_Reworked();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__CREATION_DATE = eINSTANCE.getExecutedStep_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Change Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__CHANGE_DATE = eINSTANCE.getExecutedStep_ChangeDate();

		/**
		 * The meta object literal for the '<em><b>Execution Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__EXECUTION_DATE = eINSTANCE.getExecutedStep_ExecutionDate();

		/**
		 * The meta object literal for the '<em><b>Id Executed Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__ID_EXECUTED_PROTOCOL = eINSTANCE.getExecutedStep_IdExecutedProtocol();

		/**
		 * The meta object literal for the '<em><b>Id Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__ID_STEP = eINSTANCE.getExecutedStep_IdStep();

		/**
		 * The meta object literal for the '<em><b>Id Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__ID_PROTOCOL = eINSTANCE.getExecutedStep_IdProtocol();

		/**
		 * The meta object literal for the '<em><b>Created By Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__CREATED_BY_ID = eINSTANCE.getExecutedStep_CreatedById();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__CREATED_BY = eINSTANCE.getExecutedStep_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Executed By Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__EXECUTED_BY_ID = eINSTANCE.getExecutedStep_ExecutedById();

		/**
		 * The meta object literal for the '<em><b>Executed By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__EXECUTED_BY = eINSTANCE.getExecutedStep_ExecutedBy();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__STEP = eINSTANCE.getExecutedStep_Step();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTED_STEP__PREVIOUS = eINSTANCE.getExecutedStep_Previous();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTED_STEP__NEXT = eINSTANCE.getExecutedStep_Next();

		/**
		 * The meta object literal for the '<em><b>Justify</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTED_STEP__JUSTIFY = eINSTANCE.getExecutedStep_Justify();

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
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAST_PROFESSIONAL__DATA = eINSTANCE.getLastProfessional_Data();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.Data <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.Data
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__ID = eINSTANCE.getData_Id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__URL = eINSTANCE.getData_Url();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__CODE = eINSTANCE.getData_Code();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__EMAIL = eINSTANCE.getData_Email();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Type Council</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__TYPE_COUNCIL = eINSTANCE.getData_TypeCouncil();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__LOGIN = eINSTANCE.getData_Login();

		/**
		 * The meta object literal for the '<em><b>Number Council</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NUMBER_COUNCIL = eINSTANCE.getData_NumberCouncil();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__STATE = eINSTANCE.getData_State();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__EXECUTOR = eINSTANCE.getData_Executor();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__CREATOR = eINSTANCE.getData_Creator();

	}

} //Execution_metamodelPackage
