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
	 * The meta object id for the '{@link MetamodelExecution.impl.ExecutionImpl <em>Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ExecutionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExecution()
	 * @generated
	 */
	int EXECUTION = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__TYPE_VERBOSE = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__URL = 3;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__IS_CURRENT = 4;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__REWORKED = 5;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__EXECUTED = 6;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__CREATION_DATE = 7;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__CHANGE_DATE = 8;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__EXECUTION_DATE = 9;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__CREATED_BY_ID = 10;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__EXECUTED_BY_ID = 11;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__ID_STEP = 12;

	/**
	 * The feature id for the '<em><b>Id Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__ID_PATHWAY = 13;

	/**
	 * The feature id for the '<em><b>Id Executed Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__ID_EXECUTED_PATHWAY = 14;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__JUSTIFICATION = 15;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__STEP = 16;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__PREVIOUS = 17;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__NEXT = 18;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__CREATOR = 19;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__EXECUTOR = 20;

	/**
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.AuxiliaryConductImpl <em>Auxiliary Conduct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.AuxiliaryConductImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getAuxiliaryConduct()
	 * @generated
	 */
	int AUXILIARY_CONDUCT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__ID = EXECUTION__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__TYPE = EXECUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__TYPE_VERBOSE = EXECUTION__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__URL = EXECUTION__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__IS_CURRENT = EXECUTION__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__REWORKED = EXECUTION__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__EXECUTED = EXECUTION__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__CREATION_DATE = EXECUTION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__CHANGE_DATE = EXECUTION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__EXECUTION_DATE = EXECUTION__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__CREATED_BY_ID = EXECUTION__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__EXECUTED_BY_ID = EXECUTION__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__ID_STEP = EXECUTION__ID_STEP;

	/**
	 * The feature id for the '<em><b>Id Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__ID_PATHWAY = EXECUTION__ID_PATHWAY;

	/**
	 * The feature id for the '<em><b>Id Executed Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__ID_EXECUTED_PATHWAY = EXECUTION__ID_EXECUTED_PATHWAY;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__JUSTIFICATION = EXECUTION__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__STEP = EXECUTION__STEP;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__PREVIOUS = EXECUTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__NEXT = EXECUTION__NEXT;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__CREATOR = EXECUTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__EXECUTOR = EXECUTION__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT__ANSWER = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auxiliary Conduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Auxiliary Conduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_CONDUCT_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.InformationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ID = EXECUTION__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__TYPE = EXECUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__TYPE_VERBOSE = EXECUTION__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__URL = EXECUTION__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__IS_CURRENT = EXECUTION__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__REWORKED = EXECUTION__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__EXECUTED = EXECUTION__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__CREATION_DATE = EXECUTION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__CHANGE_DATE = EXECUTION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__EXECUTION_DATE = EXECUTION__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__CREATED_BY_ID = EXECUTION__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__EXECUTED_BY_ID = EXECUTION__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ID_STEP = EXECUTION__ID_STEP;

	/**
	 * The feature id for the '<em><b>Id Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ID_PATHWAY = EXECUTION__ID_PATHWAY;

	/**
	 * The feature id for the '<em><b>Id Executed Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ID_EXECUTED_PATHWAY = EXECUTION__ID_EXECUTED_PATHWAY;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__JUSTIFICATION = EXECUTION__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__STEP = EXECUTION__STEP;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__PREVIOUS = EXECUTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__NEXT = EXECUTION__NEXT;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__CREATOR = EXECUTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__EXECUTOR = EXECUTION__EXECUTOR;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.DischargeImpl <em>Discharge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.DischargeImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getDischarge()
	 * @generated
	 */
	int DISCHARGE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__ID = EXECUTION__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__TYPE = EXECUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__TYPE_VERBOSE = EXECUTION__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__URL = EXECUTION__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__IS_CURRENT = EXECUTION__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__REWORKED = EXECUTION__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__EXECUTED = EXECUTION__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__CREATION_DATE = EXECUTION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__CHANGE_DATE = EXECUTION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__EXECUTION_DATE = EXECUTION__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__CREATED_BY_ID = EXECUTION__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__EXECUTED_BY_ID = EXECUTION__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__ID_STEP = EXECUTION__ID_STEP;

	/**
	 * The feature id for the '<em><b>Id Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__ID_PATHWAY = EXECUTION__ID_PATHWAY;

	/**
	 * The feature id for the '<em><b>Id Executed Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__ID_EXECUTED_PATHWAY = EXECUTION__ID_EXECUTED_PATHWAY;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__JUSTIFICATION = EXECUTION__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__STEP = EXECUTION__STEP;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__PREVIOUS = EXECUTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__NEXT = EXECUTION__NEXT;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__CREATOR = EXECUTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE__EXECUTOR = EXECUTION__EXECUTOR;

	/**
	 * The number of structural features of the '<em>Discharge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Discharge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ReferralImpl <em>Referral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ReferralImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getReferral()
	 * @generated
	 */
	int REFERRAL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__ID = EXECUTION__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__TYPE = EXECUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__TYPE_VERBOSE = EXECUTION__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__URL = EXECUTION__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__IS_CURRENT = EXECUTION__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__REWORKED = EXECUTION__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__EXECUTED = EXECUTION__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__CREATION_DATE = EXECUTION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__CHANGE_DATE = EXECUTION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__EXECUTION_DATE = EXECUTION__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__CREATED_BY_ID = EXECUTION__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__EXECUTED_BY_ID = EXECUTION__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__ID_STEP = EXECUTION__ID_STEP;

	/**
	 * The feature id for the '<em><b>Id Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__ID_PATHWAY = EXECUTION__ID_PATHWAY;

	/**
	 * The feature id for the '<em><b>Id Executed Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__ID_EXECUTED_PATHWAY = EXECUTION__ID_EXECUTED_PATHWAY;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__JUSTIFICATION = EXECUTION__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__STEP = EXECUTION__STEP;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__PREVIOUS = EXECUTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__NEXT = EXECUTION__NEXT;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__CREATOR = EXECUTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL__EXECUTOR = EXECUTION__EXECUTOR;

	/**
	 * The number of structural features of the '<em>Referral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Referral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRAL_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PrescriptionImpl <em>Prescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PrescriptionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescription()
	 * @generated
	 */
	int PRESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ID = EXECUTION__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__TYPE = EXECUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__TYPE_VERBOSE = EXECUTION__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__URL = EXECUTION__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__IS_CURRENT = EXECUTION__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__REWORKED = EXECUTION__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__EXECUTED = EXECUTION__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__CREATION_DATE = EXECUTION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__CHANGE_DATE = EXECUTION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__EXECUTION_DATE = EXECUTION__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__CREATED_BY_ID = EXECUTION__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__EXECUTED_BY_ID = EXECUTION__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ID_STEP = EXECUTION__ID_STEP;

	/**
	 * The feature id for the '<em><b>Id Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ID_PATHWAY = EXECUTION__ID_PATHWAY;

	/**
	 * The feature id for the '<em><b>Id Executed Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ID_EXECUTED_PATHWAY = EXECUTION__ID_EXECUTED_PATHWAY;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__JUSTIFICATION = EXECUTION__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__STEP = EXECUTION__STEP;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__PREVIOUS = EXECUTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__NEXT = EXECUTION__NEXT;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__CREATOR = EXECUTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__EXECUTOR = EXECUTION__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__TEXT = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prescribedmedicament</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__PRESCRIBEDMEDICAMENT = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prescribedprescriptionitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__PRESCRIBEDPRESCRIPTIONITEM = EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__PRESCRIPTION = EXECUTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.TreatmentImpl <em>Treatment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.TreatmentImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getTreatment()
	 * @generated
	 */
	int TREATMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__ID = EXECUTION__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__TYPE = EXECUTION__TYPE;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__TYPE_VERBOSE = EXECUTION__TYPE_VERBOSE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__URL = EXECUTION__URL;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__IS_CURRENT = EXECUTION__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__REWORKED = EXECUTION__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__EXECUTED = EXECUTION__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__CREATION_DATE = EXECUTION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__CHANGE_DATE = EXECUTION__CHANGE_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__EXECUTION_DATE = EXECUTION__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__CREATED_BY_ID = EXECUTION__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__EXECUTED_BY_ID = EXECUTION__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__ID_STEP = EXECUTION__ID_STEP;

	/**
	 * The feature id for the '<em><b>Id Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__ID_PATHWAY = EXECUTION__ID_PATHWAY;

	/**
	 * The feature id for the '<em><b>Id Executed Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__ID_EXECUTED_PATHWAY = EXECUTION__ID_EXECUTED_PATHWAY;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__JUSTIFICATION = EXECUTION__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__STEP = EXECUTION__STEP;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__PREVIOUS = EXECUTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__NEXT = EXECUTION__NEXT;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__CREATOR = EXECUTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__EXECUTOR = EXECUTION__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Prescribedexam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__PRESCRIBEDEXAM = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prescribedprocedure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__PRESCRIBEDPROCEDURE = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prescribedinternment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__PRESCRIBEDINTERNMENT = EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prescribedmedication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__PRESCRIBEDMEDICATION = EXECUTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Exam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__EXAM = 8;

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
	int PREVIOUS = 7;

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
	int NEXT = 8;

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
	 * The meta object id for the '{@link MetamodelExecution.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.QuestionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 9;

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
	int VARIABLE = 10;

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
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LINK = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 7;

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
	int PRESCRIBED_EXAMINATION = 11;

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
	 * The feature id for the '<em><b>Examinationprescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBED_EXAMINATION__EXAMINATIONPRESCRIPTION = 5;

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
	int EXAM = 12;

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
	int PRESCRIBED_PROCEDURE = 13;

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
	int PRESCRIBED_INTERNMENT = 14;

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
	int PRESCRIBED_MEDICATION = 15;

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
	int EXAMINATION_PRESCRIPTION = 16;

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
	int COMPLEMENT = 17;

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
	int PRESCRIBED_PRESCRIPTION_ITEM = 18;

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
	int PRESCRIBED_MEDICAMENT = 19;

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
	 * The meta object id for the '{@link MetamodelExecution.impl.ShortExecutionImpl <em>Short Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ShortExecutionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getShortExecution()
	 * @generated
	 */
	int SHORT_EXECUTION = 20;

	/**
	 * The feature id for the '<em><b>Conclusion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION__CONCLUSION_DATE = 0;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION__COMPLETED = 1;

	/**
	 * The feature id for the '<em><b>Aborted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION__ABORTED = 2;

	/**
	 * The feature id for the '<em><b>Last Executed Step Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION__LAST_EXECUTED_STEP_DATE = 3;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION__PATHWAY = 4;

	/**
	 * The feature id for the '<em><b>Id Responsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION__ID_RESPONSIBLE = 5;

	/**
	 * The feature id for the '<em><b>Id Last Professional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION__ID_LAST_PROFESSIONAL = 6;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION__RESPONSIBLE = 7;

	/**
	 * The feature id for the '<em><b>Executedstep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION__EXECUTEDSTEP = 8;

	/**
	 * The feature id for the '<em><b>Lastprofessional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION__LASTPROFESSIONAL = 9;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION__CREATION_DATE = 10;

	/**
	 * The feature id for the '<em><b>Id Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION__ID_PATHWAY = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION__ID = 12;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION__URL = 13;

	/**
	 * The number of structural features of the '<em>Short Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Short Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_EXECUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.JustificationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 21;

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
	int PATHWAY = 22;

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
	 * The feature id for the '<em><b>Id Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__ID_REPOSITORY = 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__VERSION = 5;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__COMPLETED = 6;

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
	 * The meta object id for the '{@link MetamodelExecution.impl.ResponsibleImpl <em>Responsible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ResponsibleImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getResponsible()
	 * @generated
	 */
	int RESPONSIBLE = 23;

	/**
	 * The number of structural features of the '<em>Responsible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_FEATURE_COUNT = 0;

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
	int EXECUTED_STEP = 24;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__CREATED_BY_ID = 0;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__CREATED_BY = 1;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__EXECUTED_BY_ID = 2;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__EXECUTED_BY = 3;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__STEP = 4;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__EXECUTED = 5;

	/**
	 * The feature id for the '<em><b>Id Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__ID_STEP = 6;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__REWORKED = 7;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__CREATION_DATE = 8;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__TYPE_VERBOSE = 9;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__IS_CURRENT = 10;

	/**
	 * The feature id for the '<em><b>Id Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__ID_PATHWAY = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__TYPE = 12;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__EXECUTION_DATE = 13;

	/**
	 * The feature id for the '<em><b>Id Executed Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__ID_EXECUTED_PROTOCOL = 14;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP__CHANGE_DATE = 15;

	/**
	 * The number of structural features of the '<em>Executed Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Executed Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.UserImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 25;

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
	 * The meta object id for the '{@link MetamodelExecution.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ValueImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 26;

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
	int ANSWER = 27;

	/**
	 * The feature id for the '<em><b>Type Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__TYPE_VERBOSE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__ID = 2;

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
	int NUMERIC = 28;

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
	int YES_OR_NO = 29;

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
	int STEP = 30;

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
	int CREATOR = 31;

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
	int EXECUTOR = 32;

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
	int LAST_PROFESSIONAL = 33;

	/**
	 * The number of structural features of the '<em>Last Professional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Last Professional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.AuxiliaryConduct#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answer</em>'.
	 * @see MetamodelExecution.AuxiliaryConduct#getAnswer()
	 * @see #getAuxiliaryConduct()
	 * @generated
	 */
	EReference getAuxiliaryConduct_Answer();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getPrescription <em>Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prescription</em>'.
	 * @see MetamodelExecution.Prescription#getPrescription()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Prescription();

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
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PrescribedExamination#getExaminationprescription <em>Examinationprescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Examinationprescription</em>'.
	 * @see MetamodelExecution.PrescribedExamination#getExaminationprescription()
	 * @see #getPrescribedExamination()
	 * @generated
	 */
	EReference getPrescribedExamination_Examinationprescription();

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
	 * Returns the meta object for class '{@link MetamodelExecution.ShortExecution <em>Short Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Execution</em>'.
	 * @see MetamodelExecution.ShortExecution
	 * @generated
	 */
	EClass getShortExecution();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ShortExecution#getConclusionDate <em>Conclusion Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conclusion Date</em>'.
	 * @see MetamodelExecution.ShortExecution#getConclusionDate()
	 * @see #getShortExecution()
	 * @generated
	 */
	EAttribute getShortExecution_ConclusionDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ShortExecution#isCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed</em>'.
	 * @see MetamodelExecution.ShortExecution#isCompleted()
	 * @see #getShortExecution()
	 * @generated
	 */
	EAttribute getShortExecution_Completed();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ShortExecution#isAborted <em>Aborted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aborted</em>'.
	 * @see MetamodelExecution.ShortExecution#isAborted()
	 * @see #getShortExecution()
	 * @generated
	 */
	EAttribute getShortExecution_Aborted();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ShortExecution#getLastExecutedStepDate <em>Last Executed Step Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Executed Step Date</em>'.
	 * @see MetamodelExecution.ShortExecution#getLastExecutedStepDate()
	 * @see #getShortExecution()
	 * @generated
	 */
	EAttribute getShortExecution_LastExecutedStepDate();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ShortExecution#getPathway <em>Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pathway</em>'.
	 * @see MetamodelExecution.ShortExecution#getPathway()
	 * @see #getShortExecution()
	 * @generated
	 */
	EReference getShortExecution_Pathway();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ShortExecution#getIdResponsible <em>Id Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Responsible</em>'.
	 * @see MetamodelExecution.ShortExecution#getIdResponsible()
	 * @see #getShortExecution()
	 * @generated
	 */
	EAttribute getShortExecution_IdResponsible();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ShortExecution#getIdLastProfessional <em>Id Last Professional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Last Professional</em>'.
	 * @see MetamodelExecution.ShortExecution#getIdLastProfessional()
	 * @see #getShortExecution()
	 * @generated
	 */
	EAttribute getShortExecution_IdLastProfessional();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ShortExecution#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responsible</em>'.
	 * @see MetamodelExecution.ShortExecution#getResponsible()
	 * @see #getShortExecution()
	 * @generated
	 */
	EReference getShortExecution_Responsible();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ShortExecution#getExecutedstep <em>Executedstep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executedstep</em>'.
	 * @see MetamodelExecution.ShortExecution#getExecutedstep()
	 * @see #getShortExecution()
	 * @generated
	 */
	EReference getShortExecution_Executedstep();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ShortExecution#getLastprofessional <em>Lastprofessional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lastprofessional</em>'.
	 * @see MetamodelExecution.ShortExecution#getLastprofessional()
	 * @see #getShortExecution()
	 * @generated
	 */
	EReference getShortExecution_Lastprofessional();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ShortExecution#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see MetamodelExecution.ShortExecution#getCreationDate()
	 * @see #getShortExecution()
	 * @generated
	 */
	EAttribute getShortExecution_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ShortExecution#getIdPathway <em>Id Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Pathway</em>'.
	 * @see MetamodelExecution.ShortExecution#getIdPathway()
	 * @see #getShortExecution()
	 * @generated
	 */
	EAttribute getShortExecution_IdPathway();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ShortExecution#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.ShortExecution#getId()
	 * @see #getShortExecution()
	 * @generated
	 */
	EAttribute getShortExecution_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ShortExecution#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.ShortExecution#getUrl()
	 * @see #getShortExecution()
	 * @generated
	 */
	EAttribute getShortExecution_Url();

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
	 * Returns the meta object for class '{@link MetamodelExecution.Responsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsible</em>'.
	 * @see MetamodelExecution.Responsible
	 * @generated
	 */
	EClass getResponsible();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExecutedStep#getIdPathway <em>Id Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Pathway</em>'.
	 * @see MetamodelExecution.ExecutedStep#getIdPathway()
	 * @see #getExecutedStep()
	 * @generated
	 */
	EAttribute getExecutedStep_IdPathway();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.YesOrNo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MetamodelExecution.YesOrNo#getValue()
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
	 * Returns the meta object for class '{@link MetamodelExecution.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution</em>'.
	 * @see MetamodelExecution.Execution
	 * @generated
	 */
	EClass getExecution();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Execution#getId()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MetamodelExecution.Execution#getType()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_Type();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#getTypeVerbose <em>Type Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Verbose</em>'.
	 * @see MetamodelExecution.Execution#getTypeVerbose()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_TypeVerbose();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MetamodelExecution.Execution#getUrl()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_Url();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#isIsCurrent <em>Is Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Current</em>'.
	 * @see MetamodelExecution.Execution#isIsCurrent()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_IsCurrent();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#isReworked <em>Reworked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reworked</em>'.
	 * @see MetamodelExecution.Execution#isReworked()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_Reworked();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#isExecuted <em>Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed</em>'.
	 * @see MetamodelExecution.Execution#isExecuted()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_Executed();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see MetamodelExecution.Execution#getCreationDate()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#getChangeDate <em>Change Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Date</em>'.
	 * @see MetamodelExecution.Execution#getChangeDate()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_ChangeDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#getExecutionDate <em>Execution Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Date</em>'.
	 * @see MetamodelExecution.Execution#getExecutionDate()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_ExecutionDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#getCreatedById <em>Created By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By Id</em>'.
	 * @see MetamodelExecution.Execution#getCreatedById()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_CreatedById();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#getExecutedById <em>Executed By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed By Id</em>'.
	 * @see MetamodelExecution.Execution#getExecutedById()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_ExecutedById();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#getIdStep <em>Id Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Step</em>'.
	 * @see MetamodelExecution.Execution#getIdStep()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_IdStep();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#getIdPathway <em>Id Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Pathway</em>'.
	 * @see MetamodelExecution.Execution#getIdPathway()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_IdPathway();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Execution#getIdExecutedPathway <em>Id Executed Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Executed Pathway</em>'.
	 * @see MetamodelExecution.Execution#getIdExecutedPathway()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_IdExecutedPathway();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Execution#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Justification</em>'.
	 * @see MetamodelExecution.Execution#getJustification()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Justification();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Execution#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step</em>'.
	 * @see MetamodelExecution.Execution#getStep()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Step();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Execution#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Previous</em>'.
	 * @see MetamodelExecution.Execution#getPrevious()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Previous();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Execution#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see MetamodelExecution.Execution#getNext()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Next();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Execution#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creator</em>'.
	 * @see MetamodelExecution.Execution#getCreator()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Creator();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Execution#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executor</em>'.
	 * @see MetamodelExecution.Execution#getExecutor()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Executor();

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
		 * The meta object literal for the '{@link MetamodelExecution.impl.AuxiliaryConductImpl <em>Auxiliary Conduct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.AuxiliaryConductImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getAuxiliaryConduct()
		 * @generated
		 */
		EClass AUXILIARY_CONDUCT = eINSTANCE.getAuxiliaryConduct();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_CONDUCT__ANSWER = eINSTANCE.getAuxiliaryConduct_Answer();

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
		 * The meta object literal for the '<em><b>Prescription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__PRESCRIPTION = eINSTANCE.getPrescription_Prescription();

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
		 * The meta object literal for the '<em><b>Exam</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINATION__EXAM = eINSTANCE.getExamination_Exam();

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
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__LINK = eINSTANCE.getVariable_Link();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VALUE = eINSTANCE.getVariable_Value();

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
		 * The meta object literal for the '<em><b>Examinationprescription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBED_EXAMINATION__EXAMINATIONPRESCRIPTION = eINSTANCE
				.getPrescribedExamination_Examinationprescription();

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
		 * The meta object literal for the '{@link MetamodelExecution.impl.ShortExecutionImpl <em>Short Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ShortExecutionImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getShortExecution()
		 * @generated
		 */
		EClass SHORT_EXECUTION = eINSTANCE.getShortExecution();

		/**
		 * The meta object literal for the '<em><b>Conclusion Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_EXECUTION__CONCLUSION_DATE = eINSTANCE.getShortExecution_ConclusionDate();

		/**
		 * The meta object literal for the '<em><b>Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_EXECUTION__COMPLETED = eINSTANCE.getShortExecution_Completed();

		/**
		 * The meta object literal for the '<em><b>Aborted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_EXECUTION__ABORTED = eINSTANCE.getShortExecution_Aborted();

		/**
		 * The meta object literal for the '<em><b>Last Executed Step Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_EXECUTION__LAST_EXECUTED_STEP_DATE = eINSTANCE.getShortExecution_LastExecutedStepDate();

		/**
		 * The meta object literal for the '<em><b>Pathway</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_EXECUTION__PATHWAY = eINSTANCE.getShortExecution_Pathway();

		/**
		 * The meta object literal for the '<em><b>Id Responsible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_EXECUTION__ID_RESPONSIBLE = eINSTANCE.getShortExecution_IdResponsible();

		/**
		 * The meta object literal for the '<em><b>Id Last Professional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_EXECUTION__ID_LAST_PROFESSIONAL = eINSTANCE.getShortExecution_IdLastProfessional();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_EXECUTION__RESPONSIBLE = eINSTANCE.getShortExecution_Responsible();

		/**
		 * The meta object literal for the '<em><b>Executedstep</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_EXECUTION__EXECUTEDSTEP = eINSTANCE.getShortExecution_Executedstep();

		/**
		 * The meta object literal for the '<em><b>Lastprofessional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_EXECUTION__LASTPROFESSIONAL = eINSTANCE.getShortExecution_Lastprofessional();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_EXECUTION__CREATION_DATE = eINSTANCE.getShortExecution_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Id Pathway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_EXECUTION__ID_PATHWAY = eINSTANCE.getShortExecution_IdPathway();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_EXECUTION__ID = eINSTANCE.getShortExecution_Id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_EXECUTION__URL = eINSTANCE.getShortExecution_Url();

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
		 * The meta object literal for the '<em><b>Id Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__ID_REPOSITORY = eINSTANCE.getPathway_IdRepository();

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
		 * The meta object literal for the '{@link MetamodelExecution.impl.ResponsibleImpl <em>Responsible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ResponsibleImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getResponsible()
		 * @generated
		 */
		EClass RESPONSIBLE = eINSTANCE.getResponsible();

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
		 * The meta object literal for the '<em><b>Executed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__EXECUTED = eINSTANCE.getExecutedStep_Executed();

		/**
		 * The meta object literal for the '<em><b>Id Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__ID_STEP = eINSTANCE.getExecutedStep_IdStep();

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
		 * The meta object literal for the '<em><b>Type Verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__TYPE_VERBOSE = eINSTANCE.getExecutedStep_TypeVerbose();

		/**
		 * The meta object literal for the '<em><b>Is Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__IS_CURRENT = eINSTANCE.getExecutedStep_IsCurrent();

		/**
		 * The meta object literal for the '<em><b>Id Pathway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__ID_PATHWAY = eINSTANCE.getExecutedStep_IdPathway();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__TYPE = eINSTANCE.getExecutedStep_Type();

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
		 * The meta object literal for the '<em><b>Change Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_STEP__CHANGE_DATE = eINSTANCE.getExecutedStep_ChangeDate();

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
		 * The meta object literal for the '<em><b>Type Verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__TYPE_VERBOSE = eINSTANCE.getAnswer_TypeVerbose();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__TYPE = eINSTANCE.getAnswer_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__ID = eINSTANCE.getAnswer_Id();

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
		 * The meta object literal for the '{@link MetamodelExecution.impl.ExecutionImpl <em>Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ExecutionImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExecution()
		 * @generated
		 */
		EClass EXECUTION = eINSTANCE.getExecution();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__ID = eINSTANCE.getExecution_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__TYPE = eINSTANCE.getExecution_Type();

		/**
		 * The meta object literal for the '<em><b>Type Verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__TYPE_VERBOSE = eINSTANCE.getExecution_TypeVerbose();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__URL = eINSTANCE.getExecution_Url();

		/**
		 * The meta object literal for the '<em><b>Is Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__IS_CURRENT = eINSTANCE.getExecution_IsCurrent();

		/**
		 * The meta object literal for the '<em><b>Reworked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__REWORKED = eINSTANCE.getExecution_Reworked();

		/**
		 * The meta object literal for the '<em><b>Executed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__EXECUTED = eINSTANCE.getExecution_Executed();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__CREATION_DATE = eINSTANCE.getExecution_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Change Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__CHANGE_DATE = eINSTANCE.getExecution_ChangeDate();

		/**
		 * The meta object literal for the '<em><b>Execution Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__EXECUTION_DATE = eINSTANCE.getExecution_ExecutionDate();

		/**
		 * The meta object literal for the '<em><b>Created By Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__CREATED_BY_ID = eINSTANCE.getExecution_CreatedById();

		/**
		 * The meta object literal for the '<em><b>Executed By Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__EXECUTED_BY_ID = eINSTANCE.getExecution_ExecutedById();

		/**
		 * The meta object literal for the '<em><b>Id Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__ID_STEP = eINSTANCE.getExecution_IdStep();

		/**
		 * The meta object literal for the '<em><b>Id Pathway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__ID_PATHWAY = eINSTANCE.getExecution_IdPathway();

		/**
		 * The meta object literal for the '<em><b>Id Executed Pathway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__ID_EXECUTED_PATHWAY = eINSTANCE.getExecution_IdExecutedPathway();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__JUSTIFICATION = eINSTANCE.getExecution_Justification();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__STEP = eINSTANCE.getExecution_Step();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__PREVIOUS = eINSTANCE.getExecution_Previous();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__NEXT = eINSTANCE.getExecution_Next();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__CREATOR = eINSTANCE.getExecution_Creator();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__EXECUTOR = eINSTANCE.getExecution_Executor();

	}

} //Execution_metamodelPackage
