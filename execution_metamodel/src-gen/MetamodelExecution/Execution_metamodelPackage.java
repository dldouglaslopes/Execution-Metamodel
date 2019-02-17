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
	 * The meta object id for the '{@link MetamodelExecution.impl.EStepImpl <em>EStep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.EStepImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEStep()
	 * @generated
	 */
	int ESTEP = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__IS_CURRENT = 2;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__REWORKED = 3;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__EXECUTED = 4;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__CREATION_DATE = 5;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__MODIFICATION_DATE = 6;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__EXECUTION_DATE = 7;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__CREATED_BY_ID = 8;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__EXECUTED_BY_ID = 9;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__JUSTIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__STEP = 11;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__CREATOR = 12;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__EXECUTOR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__NAME = 14;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__PREVIOUS = 15;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__NEXT = 16;

	/**
	 * The number of structural features of the '<em>EStep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>EStep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP_OPERATION_COUNT = 0;

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
	int EAUXILIARY_CONDUCT__ID = ESTEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__TYPE = ESTEP__TYPE;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__IS_CURRENT = ESTEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__REWORKED = ESTEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__EXECUTED = ESTEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__CREATION_DATE = ESTEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__MODIFICATION_DATE = ESTEP__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__EXECUTION_DATE = ESTEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__CREATED_BY_ID = ESTEP__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__EXECUTED_BY_ID = ESTEP__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__JUSTIFICATION = ESTEP__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__STEP = ESTEP__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__CREATOR = ESTEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__EXECUTOR = ESTEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__NAME = ESTEP__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__PREVIOUS = ESTEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__NEXT = ESTEP__NEXT;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT__ANSWER = ESTEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EAuxiliary Conduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT_FEATURE_COUNT = ESTEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EAuxiliary Conduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAUXILIARY_CONDUCT_OPERATION_COUNT = ESTEP_OPERATION_COUNT + 0;

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
	int EINFORMATION__ID = ESTEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__TYPE = ESTEP__TYPE;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__IS_CURRENT = ESTEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__REWORKED = ESTEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__EXECUTED = ESTEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__CREATION_DATE = ESTEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__MODIFICATION_DATE = ESTEP__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__EXECUTION_DATE = ESTEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__CREATED_BY_ID = ESTEP__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__EXECUTED_BY_ID = ESTEP__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__JUSTIFICATION = ESTEP__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__STEP = ESTEP__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__CREATOR = ESTEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__EXECUTOR = ESTEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__NAME = ESTEP__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__PREVIOUS = ESTEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION__NEXT = ESTEP__NEXT;

	/**
	 * The number of structural features of the '<em>EInformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION_FEATURE_COUNT = ESTEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EInformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINFORMATION_OPERATION_COUNT = ESTEP_OPERATION_COUNT + 0;

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
	int EDISCHARGE__ID = ESTEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__TYPE = ESTEP__TYPE;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__IS_CURRENT = ESTEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__REWORKED = ESTEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__EXECUTED = ESTEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__CREATION_DATE = ESTEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__MODIFICATION_DATE = ESTEP__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__EXECUTION_DATE = ESTEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__CREATED_BY_ID = ESTEP__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__EXECUTED_BY_ID = ESTEP__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__JUSTIFICATION = ESTEP__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__STEP = ESTEP__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__CREATOR = ESTEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__EXECUTOR = ESTEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__NAME = ESTEP__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__PREVIOUS = ESTEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__NEXT = ESTEP__NEXT;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE__REQUEST = ESTEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDischarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE_FEATURE_COUNT = ESTEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EDischarge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDISCHARGE_OPERATION_COUNT = ESTEP_OPERATION_COUNT + 0;

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
	int EREFERRAL__ID = ESTEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__TYPE = ESTEP__TYPE;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__IS_CURRENT = ESTEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__REWORKED = ESTEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__EXECUTED = ESTEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__CREATION_DATE = ESTEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__MODIFICATION_DATE = ESTEP__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__EXECUTION_DATE = ESTEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__CREATED_BY_ID = ESTEP__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__EXECUTED_BY_ID = ESTEP__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__JUSTIFICATION = ESTEP__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__STEP = ESTEP__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__CREATOR = ESTEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__EXECUTOR = ESTEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__NAME = ESTEP__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__PREVIOUS = ESTEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__NEXT = ESTEP__NEXT;

	/**
	 * The feature id for the '<em><b>Epathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL__EPATHWAY = ESTEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EReferral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL_FEATURE_COUNT = ESTEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EReferral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERRAL_OPERATION_COUNT = ESTEP_OPERATION_COUNT + 0;

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
	int EPRESCRIPTION__ID = ESTEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__TYPE = ESTEP__TYPE;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__IS_CURRENT = ESTEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__REWORKED = ESTEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__EXECUTED = ESTEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__CREATION_DATE = ESTEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__MODIFICATION_DATE = ESTEP__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__EXECUTION_DATE = ESTEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__CREATED_BY_ID = ESTEP__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__EXECUTED_BY_ID = ESTEP__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__JUSTIFICATION = ESTEP__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__STEP = ESTEP__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__CREATOR = ESTEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__EXECUTOR = ESTEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__NAME = ESTEP__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__PREVIOUS = ESTEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__NEXT = ESTEP__NEXT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__TEXT = ESTEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pprescription</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__PPRESCRIPTION = ESTEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ids PMedication</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__IDS_PMEDICATION = ESTEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ids PPrescription</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__IDS_PPRESCRIPTION = ESTEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pmedication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__PMEDICATION = ESTEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type Prescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__TYPE_PRESCRIPTION = ESTEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Last Executed Prescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__LAST_EXECUTED_PRESCRIPTION = ESTEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Prescription Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION__PRESCRIPTION_RESULT = ESTEP_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>EPrescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION_FEATURE_COUNT = ESTEP_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>EPrescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPRESCRIPTION_OPERATION_COUNT = ESTEP_OPERATION_COUNT + 0;

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
	int ETREATMENT__ID = ESTEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__TYPE = ESTEP__TYPE;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__IS_CURRENT = ESTEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__REWORKED = ESTEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__EXECUTED = ESTEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__CREATION_DATE = ESTEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__MODIFICATION_DATE = ESTEP__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__EXECUTION_DATE = ESTEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__CREATED_BY_ID = ESTEP__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__EXECUTED_BY_ID = ESTEP__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__JUSTIFICATION = ESTEP__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__STEP = ESTEP__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__CREATOR = ESTEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__EXECUTOR = ESTEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__NAME = ESTEP__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__PREVIOUS = ESTEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__NEXT = ESTEP__NEXT;

	/**
	 * The feature id for the '<em><b>Pexamination</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__PEXAMINATION = ESTEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pprocedure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__PPROCEDURE = ESTEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pinternment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__PINTERNMENT = ESTEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pmedication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__PMEDICATION = ESTEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ids PExamination</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__IDS_PEXAMINATION = ESTEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ids PProcedure</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__IDS_PPROCEDURE = ESTEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ids PInternment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__IDS_PINTERNMENT = ESTEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ids PMedication</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__IDS_PMEDICATION = ESTEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ids PPaediatric Medication</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__IDS_PPAEDIATRIC_MEDICATION = ESTEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ppaediatricmedicationt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT__PPAEDIATRICMEDICATIONT = ESTEP_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>ETreatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT_FEATURE_COUNT = ESTEP_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>ETreatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETREATMENT_OPERATION_COUNT = ESTEP_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Side Limb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__SIDE_LIMB = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__JUSTIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Clinical Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__CLINICAL_INDICATION = 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__CODE = 7;

	/**
	 * The feature id for the '<em><b>Member Peers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__MEMBER_PEERS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__NAME = 9;

	/**
	 * The feature id for the '<em><b>Only Emergency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__ONLY_EMERGENCY = 10;

	/**
	 * The feature id for the '<em><b>Id Examination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION__ID_EXAMINATION = 11;

	/**
	 * The number of structural features of the '<em>Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PExaminationImpl <em>PExamination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PExaminationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPExamination()
	 * @generated
	 */
	int PEXAMINATION = 7;

	/**
	 * The feature id for the '<em><b>Examination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEXAMINATION__EXAMINATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEXAMINATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEXAMINATION__REPORT = 2;

	/**
	 * The feature id for the '<em><b>Number Guide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEXAMINATION__NUMBER_GUIDE = 3;

	/**
	 * The feature id for the '<em><b>Complement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEXAMINATION__COMPLEMENT = 4;

	/**
	 * The feature id for the '<em><b>Prescription Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEXAMINATION__PRESCRIPTION_RESULT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEXAMINATION__NAME = 6;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEXAMINATION__RESULT = 7;

	/**
	 * The number of structural features of the '<em>PExamination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEXAMINATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>PExamination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEXAMINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PProcedureImpl <em>PProcedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PProcedureImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPProcedure()
	 * @generated
	 */
	int PPROCEDURE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPROCEDURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPROCEDURE__PROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPROCEDURE__RESULT = 2;

	/**
	 * The feature id for the '<em><b>Prescription Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPROCEDURE__PRESCRIPTION_RESULT = 3;

	/**
	 * The number of structural features of the '<em>PProcedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPROCEDURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>PProcedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPROCEDURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PInternmentImpl <em>PInternment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PInternmentImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPInternment()
	 * @generated
	 */
	int PINTERNMENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTERNMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Internment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTERNMENT__INTERNMENT = 1;

	/**
	 * The feature id for the '<em><b>Number Guide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTERNMENT__NUMBER_GUIDE = 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTERNMENT__RESULT = 3;

	/**
	 * The feature id for the '<em><b>Prescription Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTERNMENT__PRESCRIPTION_RESULT = 4;

	/**
	 * The number of structural features of the '<em>PInternment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTERNMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>PInternment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINTERNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PMedicationImpl <em>PMedication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PMedicationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPMedication()
	 * @generated
	 */
	int PMEDICATION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMEDICATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Medication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMEDICATION__MEDICATION = 1;

	/**
	 * The feature id for the '<em><b>Prescription Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMEDICATION__PRESCRIPTION_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMEDICATION__RESULT = 3;

	/**
	 * The number of structural features of the '<em>PMedication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMEDICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>PMedication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMEDICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ComplementImpl <em>Complement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ComplementImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getComplement()
	 * @generated
	 */
	int COMPLEMENT = 11;

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
	 * The feature id for the '<em><b>Clinical Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__CLINICAL_INDICATION = 2;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__JUSTIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__QUANTITY = 4;

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
	 * The meta object id for the '{@link MetamodelExecution.impl.PPrescriptionImpl <em>PPrescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PPrescriptionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPPrescription()
	 * @generated
	 */
	int PPRESCRIPTION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPRESCRIPTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPRESCRIPTION__PRESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Prescription Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPRESCRIPTION__PRESCRIPTION_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Last Prescription Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPRESCRIPTION__LAST_PRESCRIPTION_EXECUTED = 3;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPRESCRIPTION__RESULT = 4;

	/**
	 * The number of structural features of the '<em>PPrescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPRESCRIPTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>PPrescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPRESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.JustificationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 13;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Justified By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__JUSTIFIED_BY_ID = 3;

	/**
	 * The feature id for the '<em><b>Justified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__JUSTIFIED_BY = 4;

	/**
	 * The number of structural features of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.UserImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CODE = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 3;

	/**
	 * The feature id for the '<em><b>Type Council</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TYPE_COUNCIL = 4;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOGIN = 5;

	/**
	 * The feature id for the '<em><b>Number Council</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NUMBER_COUNCIL = 6;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__STATE = 7;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 8;

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
	int RESPONSIBLE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE__ID = USER__ID;

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
	int VALUE = 56;

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
	 * The meta object id for the '{@link MetamodelExecution.impl.UnitValueImpl <em>Unit Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.UnitValueImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getUnitValue()
	 * @generated
	 */
	int UNIT_VALUE = 16;

	/**
	 * The number of structural features of the '<em>Unit Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unit Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.AnswerImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 17;

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
	 * The feature id for the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__JUSTIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Unitvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__UNITVALUE = 4;

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
	int NUMERIC = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC__VALUE = UNIT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FEATURE_COUNT = UNIT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OPERATION_COUNT = UNIT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.YesOrNoImpl <em>Yes Or No</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.YesOrNoImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getYesOrNo()
	 * @generated
	 */
	int YES_OR_NO = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_OR_NO__VALUE = UNIT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Yes Or No</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_OR_NO_FEATURE_COUNT = UNIT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Yes Or No</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_OR_NO_OPERATION_COUNT = UNIT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.StepImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 20;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IS_INITIAL = 4;

	/**
	 * The feature id for the '<em><b>Is Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IS_TERMINAL = 5;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MANDATORY = 6;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__AUDIT = 7;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 8;

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
	int CREATOR = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__ID = USER__ID;

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
	int EXECUTOR = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__ID = USER__ID;

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
	int LAST_PROFESSIONAL = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_PROFESSIONAL__ID = USER__ID;

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
	 * The meta object id for the '{@link MetamodelExecution.impl.PrescriptionResultImpl <em>Prescription Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PrescriptionResultImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescriptionResult()
	 * @generated
	 */
	int PRESCRIPTION_RESULT = 25;

	/**
	 * The feature id for the '<em><b>Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_RESULT__SUCCESS = 0;

	/**
	 * The feature id for the '<em><b>Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_RESULT__REQUEST_DATE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_RESULT__ID = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_RESULT__MESSAGE = 3;

	/**
	 * The number of structural features of the '<em>Prescription Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_RESULT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Prescription Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.EPathwayImpl <em>EPathway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.EPathwayImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEPathway()
	 * @generated
	 */
	int EPATHWAY = 26;

	/**
	 * The feature id for the '<em><b>EStep</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__ESTEP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__ID = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Conclusion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__CONCLUSION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__COMPLETED = 4;

	/**
	 * The feature id for the '<em><b>Aborted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__ABORTED = 5;

	/**
	 * The feature id for the '<em><b>Ids Executed Step</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__IDS_EXECUTED_STEP = 6;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__RESPONSIBLE = 7;

	/**
	 * The feature id for the '<em><b>Lastprofessional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__LASTPROFESSIONAL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__NAME = 9;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__JUSTIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__PATHWAY = 11;

	/**
	 * The feature id for the '<em><b>Complementaryconducts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__COMPLEMENTARYCONDUCTS = 12;

	/**
	 * The feature id for the '<em><b>Medicalcare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__MEDICALCARE = 13;

	/**
	 * The feature id for the '<em><b>Cid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__CID = 14;

	/**
	 * The feature id for the '<em><b>Time Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY__TIME_EXECUTION = 15;

	/**
	 * The number of structural features of the '<em>EPathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPATHWAY_FEATURE_COUNT = 16;

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
	int QUESTION = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ORDER = 4;

	/**
	 * The feature id for the '<em><b>Not Applied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NOT_APPLIED = 5;

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
	int VARIABLE = 28;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__WEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__UNIT = 4;

	/**
	 * The feature id for the '<em><b>Bond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__BOND = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 6;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.MedicationImpl <em>Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.MedicationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getMedication()
	 * @generated
	 */
	int MEDICATION = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CODE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__BRAND = 4;

	/**
	 * The feature id for the '<em><b>Outpatient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__OUTPATIENT = 5;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__STANDARD = 6;

	/**
	 * The feature id for the '<em><b>Daily Dosage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__DAILY_DOSAGE = 7;

	/**
	 * The feature id for the '<em><b>Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CYCLES = 8;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__FREQUENCY = 9;

	/**
	 * The feature id for the '<em><b>Time Treatement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__TIME_TREATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__TIME_INTERVAL = 11;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CATEGORY = 12;

	/**
	 * The feature id for the '<em><b>Code Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CODE_ACCESS = 13;

	/**
	 * The feature id for the '<em><b>Name Acess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__NAME_ACESS = 14;

	/**
	 * The feature id for the '<em><b>Code Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__CODE_UNIT = 15;

	/**
	 * The feature id for the '<em><b>Name Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__NAME_UNIT = 16;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__UNIT = 17;

	/**
	 * The number of structural features of the '<em>Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.EActionImpl <em>EAction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.EActionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEAction()
	 * @generated
	 */
	int EACTION = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__ID = ESTEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__TYPE = ESTEP__TYPE;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__IS_CURRENT = ESTEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__REWORKED = ESTEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__EXECUTED = ESTEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__CREATION_DATE = ESTEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__MODIFICATION_DATE = ESTEP__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__EXECUTION_DATE = ESTEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__CREATED_BY_ID = ESTEP__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__EXECUTED_BY_ID = ESTEP__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__JUSTIFICATION = ESTEP__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__STEP = ESTEP__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__CREATOR = ESTEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__EXECUTOR = ESTEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__NAME = ESTEP__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__PREVIOUS = ESTEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__NEXT = ESTEP__NEXT;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION__REQUEST = ESTEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION_FEATURE_COUNT = ESTEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTION_OPERATION_COUNT = ESTEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.RequestImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Requested By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__REQUESTED_BY = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SUCCESS = 3;

	/**
	 * The feature id for the '<em><b>Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__REQUEST_DATE = 4;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PathwayImpl <em>Pathway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PathwayImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPathway()
	 * @generated
	 */
	int PATHWAY = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__ID = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__COMPLETED = 4;

	/**
	 * The feature id for the '<em><b>Audit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__AUDIT = 5;

	/**
	 * The number of structural features of the '<em>Pathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Pathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.EProcedureImpl <em>EProcedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.EProcedureImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEProcedure()
	 * @generated
	 */
	int EPROCEDURE = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__ID = ESTEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__TYPE = ESTEP__TYPE;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__IS_CURRENT = ESTEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__REWORKED = ESTEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__EXECUTED = ESTEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__CREATION_DATE = ESTEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__MODIFICATION_DATE = ESTEP__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__EXECUTION_DATE = ESTEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__CREATED_BY_ID = ESTEP__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__EXECUTED_BY_ID = ESTEP__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__JUSTIFICATION = ESTEP__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__STEP = ESTEP__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__CREATOR = ESTEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__EXECUTOR = ESTEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__NAME = ESTEP__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__PREVIOUS = ESTEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__NEXT = ESTEP__NEXT;

	/**
	 * The number of structural features of the '<em>EProcedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE_FEATURE_COUNT = ESTEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EProcedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE_OPERATION_COUNT = ESTEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.EPauseImpl <em>EPause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.EPauseImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEPause()
	 * @generated
	 */
	int EPAUSE = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__ID = ESTEP__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__TYPE = ESTEP__TYPE;

	/**
	 * The feature id for the '<em><b>Is Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__IS_CURRENT = ESTEP__IS_CURRENT;

	/**
	 * The feature id for the '<em><b>Reworked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__REWORKED = ESTEP__REWORKED;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__EXECUTED = ESTEP__EXECUTED;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__CREATION_DATE = ESTEP__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__MODIFICATION_DATE = ESTEP__MODIFICATION_DATE;

	/**
	 * The feature id for the '<em><b>Execution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__EXECUTION_DATE = ESTEP__EXECUTION_DATE;

	/**
	 * The feature id for the '<em><b>Created By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__CREATED_BY_ID = ESTEP__CREATED_BY_ID;

	/**
	 * The feature id for the '<em><b>Executed By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__EXECUTED_BY_ID = ESTEP__EXECUTED_BY_ID;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__JUSTIFICATION = ESTEP__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__STEP = ESTEP__STEP;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__CREATOR = ESTEP__CREATOR;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__EXECUTOR = ESTEP__EXECUTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__NAME = ESTEP__NAME;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__PREVIOUS = ESTEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE__NEXT = ESTEP__NEXT;

	/**
	 * The number of structural features of the '<em>EPause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE_FEATURE_COUNT = ESTEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EPause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPAUSE_OPERATION_COUNT = ESTEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ProcedureImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__QUANTITY = 3;

	/**
	 * The feature id for the '<em><b>Id Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__ID_PROCEDURE = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TYPE_CODE = 8;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TYPE_NAME = 9;

	/**
	 * The feature id for the '<em><b>Outpatient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__OUTPATIENT = 10;

	/**
	 * The feature id for the '<em><b>Member Peers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__MEMBER_PEERS = 11;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.InternmentImpl <em>Internment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.InternmentImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getInternment()
	 * @generated
	 */
	int INTERNMENT = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT__JUSTIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Clinical Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT__CLINICAL_INDICATION = 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT__QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT__TYPE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT__CODE = 6;

	/**
	 * The feature id for the '<em><b>Id Internment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT__ID_INTERNMENT = 7;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT__TYPE_CODE = 8;

	/**
	 * The feature id for the '<em><b>Member Peers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT__MEMBER_PEERS = 9;

	/**
	 * The feature id for the '<em><b>Outpatient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT__OUTPATIENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT__NAME = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT__DESCRIPTION = 12;

	/**
	 * The number of structural features of the '<em>Internment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Internment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ComplementaryConductsImpl <em>Complementary Conducts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ComplementaryConductsImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getComplementaryConducts()
	 * @generated
	 */
	int COMPLEMENTARY_CONDUCTS = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_CONDUCTS__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_CONDUCTS__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_CONDUCTS__PATHWAY = 2;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_CONDUCTS__CREATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_CONDUCTS__JUSTIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_CONDUCTS__CREATED_BY = 5;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_CONDUCTS__RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Suspension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_CONDUCTS__SUSPENSION = 7;

	/**
	 * The number of structural features of the '<em>Complementary Conducts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_CONDUCTS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Complementary Conducts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_CONDUCTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.MedicalCareImpl <em>Medical Care</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.MedicalCareImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getMedicalCare()
	 * @generated
	 */
	int MEDICAL_CARE = 38;

	/**
	 * The feature id for the '<em><b>Code Medical Care</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_CARE__CODE_MEDICAL_CARE = 0;

	/**
	 * The feature id for the '<em><b>Pacient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_CARE__PACIENT = 1;

	/**
	 * The feature id for the '<em><b>Professional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_CARE__PROFESSIONAL = 2;

	/**
	 * The feature id for the '<em><b>Id Professional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_CARE__ID_PROFESSIONAL = 3;

	/**
	 * The feature id for the '<em><b>Hospital Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_CARE__HOSPITAL_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Patient Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_CARE__PATIENT_RECORD = 5;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_CARE__AGE = 6;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_CARE__SEX = 7;

	/**
	 * The number of structural features of the '<em>Medical Care</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_CARE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Medical Care</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_CARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.BondImpl <em>Bond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.BondImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getBond()
	 * @generated
	 */
	int BOND = 54;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id Bond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND__ID_BOND = 1;

	/**
	 * The number of structural features of the '<em>Bond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ComorbidityImpl <em>Comorbidity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ComorbidityImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getComorbidity()
	 * @generated
	 */
	int COMORBIDITY = 39;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMORBIDITY__TYPE = BOND__TYPE;

	/**
	 * The feature id for the '<em><b>Id Bond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMORBIDITY__ID_BOND = BOND__ID_BOND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMORBIDITY__NAME = BOND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMORBIDITY__ID = BOND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comorbidity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMORBIDITY_FEATURE_COUNT = BOND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comorbidity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMORBIDITY_OPERATION_COUNT = BOND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ComplementaryMedicationImpl <em>Complementary Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ComplementaryMedicationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getComplementaryMedication()
	 * @generated
	 */
	int COMPLEMENTARY_MEDICATION = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_MEDICATION__ID = COMPLEMENTARY_CONDUCTS__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_MEDICATION__TYPE = COMPLEMENTARY_CONDUCTS__TYPE;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_MEDICATION__PATHWAY = COMPLEMENTARY_CONDUCTS__PATHWAY;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_MEDICATION__CREATION_DATE = COMPLEMENTARY_CONDUCTS__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_MEDICATION__JUSTIFICATION = COMPLEMENTARY_CONDUCTS__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_MEDICATION__CREATED_BY = COMPLEMENTARY_CONDUCTS__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_MEDICATION__RESOURCE = COMPLEMENTARY_CONDUCTS__RESOURCE;

	/**
	 * The feature id for the '<em><b>Suspension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_MEDICATION__SUSPENSION = COMPLEMENTARY_CONDUCTS__SUSPENSION;

	/**
	 * The feature id for the '<em><b>Prescribedresource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_MEDICATION__PRESCRIBEDRESOURCE = COMPLEMENTARY_CONDUCTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complementary Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_MEDICATION_FEATURE_COUNT = COMPLEMENTARY_CONDUCTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complementary Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_MEDICATION_OPERATION_COUNT = COMPLEMENTARY_CONDUCTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ComplementaryProcedureImpl <em>Complementary Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ComplementaryProcedureImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getComplementaryProcedure()
	 * @generated
	 */
	int COMPLEMENTARY_PROCEDURE = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_PROCEDURE__ID = COMPLEMENTARY_CONDUCTS__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_PROCEDURE__TYPE = COMPLEMENTARY_CONDUCTS__TYPE;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_PROCEDURE__PATHWAY = COMPLEMENTARY_CONDUCTS__PATHWAY;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_PROCEDURE__CREATION_DATE = COMPLEMENTARY_CONDUCTS__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_PROCEDURE__JUSTIFICATION = COMPLEMENTARY_CONDUCTS__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_PROCEDURE__CREATED_BY = COMPLEMENTARY_CONDUCTS__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_PROCEDURE__RESOURCE = COMPLEMENTARY_CONDUCTS__RESOURCE;

	/**
	 * The feature id for the '<em><b>Suspension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_PROCEDURE__SUSPENSION = COMPLEMENTARY_CONDUCTS__SUSPENSION;

	/**
	 * The feature id for the '<em><b>Procedureprescribedresource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_PROCEDURE__PROCEDUREPRESCRIBEDRESOURCE = COMPLEMENTARY_CONDUCTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complementary Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_PROCEDURE_FEATURE_COUNT = COMPLEMENTARY_CONDUCTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complementary Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_PROCEDURE_OPERATION_COUNT = COMPLEMENTARY_CONDUCTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.SuspensionImpl <em>Suspension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.SuspensionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getSuspension()
	 * @generated
	 */
	int SUSPENSION = 42;

	/**
	 * The feature id for the '<em><b>Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION__SUCCESS = 0;

	/**
	 * The feature id for the '<em><b>Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION__REQUEST_DATE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION__ID = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION__MESSAGE = 3;

	/**
	 * The number of structural features of the '<em>Suspension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Suspension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl <em>Medication Prescribed Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.MedicationPrescribedResourceImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getMedicationPrescribedResource()
	 * @generated
	 */
	int MEDICATION_PRESCRIBED_RESOURCE = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Id Medication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__ID_MEDICATION = 1;

	/**
	 * The feature id for the '<em><b>Outpatient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__OUTPATIENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__BRAND = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__CODE = 5;

	/**
	 * The feature id for the '<em><b>Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__CYCLES = 6;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__CATEGORY = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__TIME_INTERVAL = 9;

	/**
	 * The feature id for the '<em><b>Daily Dosage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__DAILY_DOSAGE = 10;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__FREQUENCY = 11;

	/**
	 * The feature id for the '<em><b>Time Treatement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__TIME_TREATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Medication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__MEDICATION = 13;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__UNIT = 14;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__ACCESS = 15;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE__STANDARD = 16;

	/**
	 * The number of structural features of the '<em>Medication Prescribed Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Medication Prescribed Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_PRESCRIBED_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ProcedurePrescribedResourceImpl <em>Procedure Prescribed Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ProcedurePrescribedResourceImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getProcedurePrescribedResource()
	 * @generated
	 */
	int PROCEDURE_PRESCRIBED_RESOURCE = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_PRESCRIBED_RESOURCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Id Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_PRESCRIBED_RESOURCE__ID_PROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_PRESCRIBED_RESOURCE__QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_PRESCRIBED_RESOURCE__FREQUENCY = 3;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_PRESCRIBED_RESOURCE__PROCEDURE = 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_PRESCRIBED_RESOURCE__CATEGORY = 5;

	/**
	 * The number of structural features of the '<em>Procedure Prescribed Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_PRESCRIBED_RESOURCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Procedure Prescribed Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_PRESCRIBED_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ComplementaryExaminationImpl <em>Complementary Examination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ComplementaryExaminationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getComplementaryExamination()
	 * @generated
	 */
	int COMPLEMENTARY_EXAMINATION = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_EXAMINATION__ID = COMPLEMENTARY_CONDUCTS__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_EXAMINATION__TYPE = COMPLEMENTARY_CONDUCTS__TYPE;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_EXAMINATION__PATHWAY = COMPLEMENTARY_CONDUCTS__PATHWAY;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_EXAMINATION__CREATION_DATE = COMPLEMENTARY_CONDUCTS__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_EXAMINATION__JUSTIFICATION = COMPLEMENTARY_CONDUCTS__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_EXAMINATION__CREATED_BY = COMPLEMENTARY_CONDUCTS__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_EXAMINATION__RESOURCE = COMPLEMENTARY_CONDUCTS__RESOURCE;

	/**
	 * The feature id for the '<em><b>Suspension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_EXAMINATION__SUSPENSION = COMPLEMENTARY_CONDUCTS__SUSPENSION;

	/**
	 * The feature id for the '<em><b>Examinationprescribedresource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_EXAMINATION__EXAMINATIONPRESCRIBEDRESOURCE = COMPLEMENTARY_CONDUCTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complementary Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_EXAMINATION_FEATURE_COUNT = COMPLEMENTARY_CONDUCTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complementary Examination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_EXAMINATION_OPERATION_COUNT = COMPLEMENTARY_CONDUCTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.AuditImpl <em>Audit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.AuditImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getAudit()
	 * @generated
	 */
	int AUDIT = 46;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT__USER = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT__DATE = 1;

	/**
	 * The number of structural features of the '<em>Audit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Audit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ResultImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 47;

	/**
	 * The feature id for the '<em><b>Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__SUCCESS = 0;

	/**
	 * The feature id for the '<em><b>Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REQUEST_DATE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__ID = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__MESSAGE = 3;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.ExaminationPrescribedResourceImpl <em>Examination Prescribed Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.ExaminationPrescribedResourceImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExaminationPrescribedResource()
	 * @generated
	 */
	int EXAMINATION_PRESCRIBED_RESOURCE = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIBED_RESOURCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Exam</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIBED_RESOURCE__EXAM = 1;

	/**
	 * The feature id for the '<em><b>Id Exam</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIBED_RESOURCE__ID_EXAM = 2;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIBED_RESOURCE__JUSTIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIBED_RESOURCE__CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIBED_RESOURCE__QUANTITY = 5;

	/**
	 * The feature id for the '<em><b>Side Limb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIBED_RESOURCE__SIDE_LIMB = 6;

	/**
	 * The feature id for the '<em><b>Clinical Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIBED_RESOURCE__CLINICAL_INDICATION = 7;

	/**
	 * The number of structural features of the '<em>Examination Prescribed Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIBED_RESOURCE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Examination Prescribed Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PRESCRIBED_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.StandardImpl <em>Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.StandardImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getStandard()
	 * @generated
	 */
	int STANDARD = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__ID = 0;

	/**
	 * The feature id for the '<em><b>Mnemonic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__MNEMONIC = 1;

	/**
	 * The feature id for the '<em><b>Code Active Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__CODE_ACTIVE_AGENT = 2;

	/**
	 * The feature id for the '<em><b>Code Diluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__CODE_DILUENT = 3;

	/**
	 * The feature id for the '<em><b>Name Diluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__NAME_DILUENT = 4;

	/**
	 * The feature id for the '<em><b>Code Events Diluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__CODE_EVENTS_DILUENT = 5;

	/**
	 * The feature id for the '<em><b>Code Order Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__CODE_ORDER_ADMIN = 6;

	/**
	 * The feature id for the '<em><b>Code Apres Diluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__CODE_APRES_DILUENT = 7;

	/**
	 * The feature id for the '<em><b>Type Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__TYPE_ACCESS = 8;

	/**
	 * The feature id for the '<em><b>Type Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__TYPE_ADMIN = 9;

	/**
	 * The feature id for the '<em><b>Qty Diluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__QTY_DILUENT = 10;

	/**
	 * The feature id for the '<em><b>Qty Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__QTY_VOLUME = 11;

	/**
	 * The feature id for the '<em><b>Qty Dosage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__QTY_DOSAGE = 12;

	/**
	 * The feature id for the '<em><b>Code Unit Dosage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__CODE_UNIT_DOSAGE = 13;

	/**
	 * The feature id for the '<em><b>Admin Diluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__ADMIN_DILUENT = 14;

	/**
	 * The number of structural features of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.AllergyImpl <em>Allergy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.AllergyImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getAllergy()
	 * @generated
	 */
	int ALLERGY = 50;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY__TYPE = BOND__TYPE;

	/**
	 * The feature id for the '<em><b>Id Bond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY__ID_BOND = BOND__ID_BOND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY__NAME = BOND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY__ID = BOND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Allergy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_FEATURE_COUNT = BOND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Allergy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGY_OPERATION_COUNT = BOND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.VitalSignImpl <em>Vital Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.VitalSignImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getVitalSign()
	 * @generated
	 */
	int VITAL_SIGN = 51;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__TYPE = BOND__TYPE;

	/**
	 * The feature id for the '<em><b>Id Bond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__ID_BOND = BOND__ID_BOND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__NAME = BOND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__ID = BOND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vital Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN_FEATURE_COUNT = BOND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Vital Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN_OPERATION_COUNT = BOND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PatientAgeImpl <em>Patient Age</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PatientAgeImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPatientAge()
	 * @generated
	 */
	int PATIENT_AGE = 52;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_AGE__TYPE = BOND__TYPE;

	/**
	 * The feature id for the '<em><b>Id Bond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_AGE__ID_BOND = BOND__ID_BOND;

	/**
	 * The number of structural features of the '<em>Patient Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_AGE_FEATURE_COUNT = BOND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Patient Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_AGE_OPERATION_COUNT = BOND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PatientSexImpl <em>Patient Sex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PatientSexImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPatientSex()
	 * @generated
	 */
	int PATIENT_SEX = 53;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEX__TYPE = BOND__TYPE;

	/**
	 * The feature id for the '<em><b>Id Bond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEX__ID_BOND = BOND__ID_BOND;

	/**
	 * The feature id for the '<em><b>True Premise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEX__TRUE_PREMISE = BOND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Patient Sex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEX_FEATURE_COUNT = BOND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Patient Sex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEX_OPERATION_COUNT = BOND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.OptionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 55;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__ID = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__TEXT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__WEIGHT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PrescriptionImpl <em>Prescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PrescriptionImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescription()
	 * @generated
	 */
	int PRESCRIPTION = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Id Medication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ID_MEDICATION = 3;

	/**
	 * The feature id for the '<em><b>Medication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__MEDICATION = 4;

	/**
	 * The feature id for the '<em><b>Qtd Prescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__QTD_PRESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__PRESENTATION = 6;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ACCESS = 7;

	/**
	 * The feature id for the '<em><b>Qtd Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__QTD_DURATION = 8;

	/**
	 * The feature id for the '<em><b>Unit Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__UNIT_DURATION = 9;

	/**
	 * The feature id for the '<em><b>Unit Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__UNIT_FREQUENCY = 10;

	/**
	 * The feature id for the '<em><b>Complement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__COMPLEMENT = 11;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ORDER = 12;

	/**
	 * The number of structural features of the '<em>Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PPaediatricMedicationtImpl <em>PPaediatric Medicationt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PPaediatricMedicationtImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPPaediatricMedicationt()
	 * @generated
	 */
	int PPAEDIATRIC_MEDICATIONT = 58;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAEDIATRIC_MEDICATIONT__ID = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAEDIATRIC_MEDICATIONT__RESULT = 1;

	/**
	 * The feature id for the '<em><b>Prescription Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAEDIATRIC_MEDICATIONT__PRESCRIPTION_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Paediatric Medication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAEDIATRIC_MEDICATIONT__PAEDIATRIC_MEDICATION = 3;

	/**
	 * The number of structural features of the '<em>PPaediatric Medicationt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAEDIATRIC_MEDICATIONT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>PPaediatric Medicationt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPAEDIATRIC_MEDICATIONT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelExecution.impl.PaediatricMedicationImpl <em>Paediatric Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelExecution.impl.PaediatricMedicationImpl
	 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPaediatricMedication()
	 * @generated
	 */
	int PAEDIATRIC_MEDICATION = 59;

	/**
	 * The number of structural features of the '<em>Paediatric Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAEDIATRIC_MEDICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Paediatric Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAEDIATRIC_MEDICATION_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EDischarge#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see MetamodelExecution.EDischarge#getRequest()
	 * @see #getEDischarge()
	 * @generated
	 */
	EReference getEDischarge_Request();

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
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EReferral#getEpathway <em>Epathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Epathway</em>'.
	 * @see MetamodelExecution.EReferral#getEpathway()
	 * @see #getEReferral()
	 * @generated
	 */
	EReference getEReferral_Epathway();

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
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.EPrescription#getPprescription <em>Pprescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pprescription</em>'.
	 * @see MetamodelExecution.EPrescription#getPprescription()
	 * @see #getEPrescription()
	 * @generated
	 */
	EReference getEPrescription_Pprescription();

	/**
	 * Returns the meta object for the attribute list '{@link MetamodelExecution.EPrescription#getIdsPMedication <em>Ids PMedication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids PMedication</em>'.
	 * @see MetamodelExecution.EPrescription#getIdsPMedication()
	 * @see #getEPrescription()
	 * @generated
	 */
	EAttribute getEPrescription_IdsPMedication();

	/**
	 * Returns the meta object for the attribute list '{@link MetamodelExecution.EPrescription#getIdsPPrescription <em>Ids PPrescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids PPrescription</em>'.
	 * @see MetamodelExecution.EPrescription#getIdsPPrescription()
	 * @see #getEPrescription()
	 * @generated
	 */
	EAttribute getEPrescription_IdsPPrescription();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.EPrescription#getPmedication <em>Pmedication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pmedication</em>'.
	 * @see MetamodelExecution.EPrescription#getPmedication()
	 * @see #getEPrescription()
	 * @generated
	 */
	EReference getEPrescription_Pmedication();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPrescription#getTypePrescription <em>Type Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Prescription</em>'.
	 * @see MetamodelExecution.EPrescription#getTypePrescription()
	 * @see #getEPrescription()
	 * @generated
	 */
	EAttribute getEPrescription_TypePrescription();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPrescription#getLastExecutedPrescription <em>Last Executed Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Executed Prescription</em>'.
	 * @see MetamodelExecution.EPrescription#getLastExecutedPrescription()
	 * @see #getEPrescription()
	 * @generated
	 */
	EAttribute getEPrescription_LastExecutedPrescription();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.EPrescription#getPrescriptionResult <em>Prescription Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescription Result</em>'.
	 * @see MetamodelExecution.EPrescription#getPrescriptionResult()
	 * @see #getEPrescription()
	 * @generated
	 */
	EReference getEPrescription_PrescriptionResult();

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
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.ETreatment#getPexamination <em>Pexamination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pexamination</em>'.
	 * @see MetamodelExecution.ETreatment#getPexamination()
	 * @see #getETreatment()
	 * @generated
	 */
	EReference getETreatment_Pexamination();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.ETreatment#getPprocedure <em>Pprocedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pprocedure</em>'.
	 * @see MetamodelExecution.ETreatment#getPprocedure()
	 * @see #getETreatment()
	 * @generated
	 */
	EReference getETreatment_Pprocedure();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.ETreatment#getPinternment <em>Pinternment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pinternment</em>'.
	 * @see MetamodelExecution.ETreatment#getPinternment()
	 * @see #getETreatment()
	 * @generated
	 */
	EReference getETreatment_Pinternment();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.ETreatment#getPmedication <em>Pmedication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pmedication</em>'.
	 * @see MetamodelExecution.ETreatment#getPmedication()
	 * @see #getETreatment()
	 * @generated
	 */
	EReference getETreatment_Pmedication();

	/**
	 * Returns the meta object for the attribute list '{@link MetamodelExecution.ETreatment#getIdsPExamination <em>Ids PExamination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids PExamination</em>'.
	 * @see MetamodelExecution.ETreatment#getIdsPExamination()
	 * @see #getETreatment()
	 * @generated
	 */
	EAttribute getETreatment_IdsPExamination();

	/**
	 * Returns the meta object for the attribute list '{@link MetamodelExecution.ETreatment#getIdsPProcedure <em>Ids PProcedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids PProcedure</em>'.
	 * @see MetamodelExecution.ETreatment#getIdsPProcedure()
	 * @see #getETreatment()
	 * @generated
	 */
	EAttribute getETreatment_IdsPProcedure();

	/**
	 * Returns the meta object for the attribute list '{@link MetamodelExecution.ETreatment#getIdsPInternment <em>Ids PInternment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids PInternment</em>'.
	 * @see MetamodelExecution.ETreatment#getIdsPInternment()
	 * @see #getETreatment()
	 * @generated
	 */
	EAttribute getETreatment_IdsPInternment();

	/**
	 * Returns the meta object for the attribute list '{@link MetamodelExecution.ETreatment#getIdsPMedication <em>Ids PMedication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids PMedication</em>'.
	 * @see MetamodelExecution.ETreatment#getIdsPMedication()
	 * @see #getETreatment()
	 * @generated
	 */
	EAttribute getETreatment_IdsPMedication();

	/**
	 * Returns the meta object for the attribute list '{@link MetamodelExecution.ETreatment#getIdsPPaediatricMedication <em>Ids PPaediatric Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids PPaediatric Medication</em>'.
	 * @see MetamodelExecution.ETreatment#getIdsPPaediatricMedication()
	 * @see #getETreatment()
	 * @generated
	 */
	EAttribute getETreatment_IdsPPaediatricMedication();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.ETreatment#getPpaediatricmedicationt <em>Ppaediatricmedicationt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ppaediatricmedicationt</em>'.
	 * @see MetamodelExecution.ETreatment#getPpaediatricmedicationt()
	 * @see #getETreatment()
	 * @generated
	 */
	EReference getETreatment_Ppaediatricmedicationt();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see MetamodelExecution.Examination#getCategory()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Category();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MetamodelExecution.Examination#getDescription()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Description();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MetamodelExecution.Examination#getCode()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_Code();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#isMemberPeers <em>Member Peers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Peers</em>'.
	 * @see MetamodelExecution.Examination#isMemberPeers()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_MemberPeers();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Examination#isOnlyEmergency <em>Only Emergency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Emergency</em>'.
	 * @see MetamodelExecution.Examination#isOnlyEmergency()
	 * @see #getExamination()
	 * @generated
	 */
	EAttribute getExamination_OnlyEmergency();

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
	 * Returns the meta object for class '{@link MetamodelExecution.PExamination <em>PExamination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PExamination</em>'.
	 * @see MetamodelExecution.PExamination
	 * @generated
	 */
	EClass getPExamination();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PExamination#getExamination <em>Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Examination</em>'.
	 * @see MetamodelExecution.PExamination#getExamination()
	 * @see #getPExamination()
	 * @generated
	 */
	EReference getPExamination_Examination();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PExamination#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.PExamination#getId()
	 * @see #getPExamination()
	 * @generated
	 */
	EAttribute getPExamination_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PExamination#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Report</em>'.
	 * @see MetamodelExecution.PExamination#getReport()
	 * @see #getPExamination()
	 * @generated
	 */
	EAttribute getPExamination_Report();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PExamination#getNumberGuide <em>Number Guide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Guide</em>'.
	 * @see MetamodelExecution.PExamination#getNumberGuide()
	 * @see #getPExamination()
	 * @generated
	 */
	EAttribute getPExamination_NumberGuide();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PExamination#getComplement <em>Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complement</em>'.
	 * @see MetamodelExecution.PExamination#getComplement()
	 * @see #getPExamination()
	 * @generated
	 */
	EReference getPExamination_Complement();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PExamination#getPrescriptionResult <em>Prescription Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescription Result</em>'.
	 * @see MetamodelExecution.PExamination#getPrescriptionResult()
	 * @see #getPExamination()
	 * @generated
	 */
	EReference getPExamination_PrescriptionResult();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PExamination#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.PExamination#getName()
	 * @see #getPExamination()
	 * @generated
	 */
	EAttribute getPExamination_Name();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PExamination#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see MetamodelExecution.PExamination#getResult()
	 * @see #getPExamination()
	 * @generated
	 */
	EReference getPExamination_Result();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.PProcedure <em>PProcedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PProcedure</em>'.
	 * @see MetamodelExecution.PProcedure
	 * @generated
	 */
	EClass getPProcedure();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PProcedure#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.PProcedure#getId()
	 * @see #getPProcedure()
	 * @generated
	 */
	EAttribute getPProcedure_Id();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PProcedure#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Procedure</em>'.
	 * @see MetamodelExecution.PProcedure#getProcedure()
	 * @see #getPProcedure()
	 * @generated
	 */
	EReference getPProcedure_Procedure();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PProcedure#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see MetamodelExecution.PProcedure#getResult()
	 * @see #getPProcedure()
	 * @generated
	 */
	EReference getPProcedure_Result();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PProcedure#getPrescriptionResult <em>Prescription Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescription Result</em>'.
	 * @see MetamodelExecution.PProcedure#getPrescriptionResult()
	 * @see #getPProcedure()
	 * @generated
	 */
	EReference getPProcedure_PrescriptionResult();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.PInternment <em>PInternment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PInternment</em>'.
	 * @see MetamodelExecution.PInternment
	 * @generated
	 */
	EClass getPInternment();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PInternment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.PInternment#getId()
	 * @see #getPInternment()
	 * @generated
	 */
	EAttribute getPInternment_Id();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PInternment#getInternment <em>Internment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Internment</em>'.
	 * @see MetamodelExecution.PInternment#getInternment()
	 * @see #getPInternment()
	 * @generated
	 */
	EReference getPInternment_Internment();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PInternment#getNumberGuide <em>Number Guide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Guide</em>'.
	 * @see MetamodelExecution.PInternment#getNumberGuide()
	 * @see #getPInternment()
	 * @generated
	 */
	EAttribute getPInternment_NumberGuide();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PInternment#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see MetamodelExecution.PInternment#getResult()
	 * @see #getPInternment()
	 * @generated
	 */
	EReference getPInternment_Result();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PInternment#getPrescriptionResult <em>Prescription Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescription Result</em>'.
	 * @see MetamodelExecution.PInternment#getPrescriptionResult()
	 * @see #getPInternment()
	 * @generated
	 */
	EReference getPInternment_PrescriptionResult();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.PMedication <em>PMedication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PMedication</em>'.
	 * @see MetamodelExecution.PMedication
	 * @generated
	 */
	EClass getPMedication();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PMedication#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.PMedication#getId()
	 * @see #getPMedication()
	 * @generated
	 */
	EAttribute getPMedication_Id();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PMedication#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see MetamodelExecution.PMedication#getResult()
	 * @see #getPMedication()
	 * @generated
	 */
	EReference getPMedication_Result();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PMedication#getMedication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Medication</em>'.
	 * @see MetamodelExecution.PMedication#getMedication()
	 * @see #getPMedication()
	 * @generated
	 */
	EReference getPMedication_Medication();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PMedication#getPrescriptionResult <em>Prescription Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescription Result</em>'.
	 * @see MetamodelExecution.PMedication#getPrescriptionResult()
	 * @see #getPMedication()
	 * @generated
	 */
	EReference getPMedication_PrescriptionResult();

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
	 * Returns the meta object for class '{@link MetamodelExecution.PPrescription <em>PPrescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PPrescription</em>'.
	 * @see MetamodelExecution.PPrescription
	 * @generated
	 */
	EClass getPPrescription();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PPrescription#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.PPrescription#getId()
	 * @see #getPPrescription()
	 * @generated
	 */
	EAttribute getPPrescription_Id();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PPrescription#getPrescription <em>Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescription</em>'.
	 * @see MetamodelExecution.PPrescription#getPrescription()
	 * @see #getPPrescription()
	 * @generated
	 */
	EReference getPPrescription_Prescription();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PPrescription#getPrescriptionResult <em>Prescription Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescription Result</em>'.
	 * @see MetamodelExecution.PPrescription#getPrescriptionResult()
	 * @see #getPPrescription()
	 * @generated
	 */
	EReference getPPrescription_PrescriptionResult();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PPrescription#isLastPrescriptionExecuted <em>Last Prescription Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Prescription Executed</em>'.
	 * @see MetamodelExecution.PPrescription#isLastPrescriptionExecuted()
	 * @see #getPPrescription()
	 * @generated
	 */
	EAttribute getPPrescription_LastPrescriptionExecuted();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PPrescription#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see MetamodelExecution.PPrescription#getResult()
	 * @see #getPPrescription()
	 * @generated
	 */
	EReference getPPrescription_Result();

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
	 * Returns the meta object for class '{@link MetamodelExecution.UnitValue <em>Unit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Value</em>'.
	 * @see MetamodelExecution.UnitValue
	 * @generated
	 */
	EClass getUnitValue();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Answer#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification</em>'.
	 * @see MetamodelExecution.Answer#getJustification()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Justification();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Answer#getUnitvalue <em>Unitvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unitvalue</em>'.
	 * @see MetamodelExecution.Answer#getUnitvalue()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_Unitvalue();

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
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Step#getAudit <em>Audit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Audit</em>'.
	 * @see MetamodelExecution.Step#getAudit()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Audit();

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
	 * Returns the meta object for class '{@link MetamodelExecution.EStep <em>EStep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStep</em>'.
	 * @see MetamodelExecution.EStep
	 * @generated
	 */
	EClass getEStep();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.EStep#getId()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EStep#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MetamodelExecution.EStep#getType()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_Type();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EStep#isIsCurrent <em>Is Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Current</em>'.
	 * @see MetamodelExecution.EStep#isIsCurrent()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_IsCurrent();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EStep#isReworked <em>Reworked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reworked</em>'.
	 * @see MetamodelExecution.EStep#isReworked()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_Reworked();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EStep#isExecuted <em>Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed</em>'.
	 * @see MetamodelExecution.EStep#isExecuted()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_Executed();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EStep#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see MetamodelExecution.EStep#getCreationDate()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EStep#getModificationDate <em>Modification Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification Date</em>'.
	 * @see MetamodelExecution.EStep#getModificationDate()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_ModificationDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EStep#getExecutionDate <em>Execution Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Date</em>'.
	 * @see MetamodelExecution.EStep#getExecutionDate()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_ExecutionDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EStep#getCreatedById <em>Created By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By Id</em>'.
	 * @see MetamodelExecution.EStep#getCreatedById()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_CreatedById();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EStep#getExecutedById <em>Executed By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed By Id</em>'.
	 * @see MetamodelExecution.EStep#getExecutedById()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_ExecutedById();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EStep#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Justification</em>'.
	 * @see MetamodelExecution.EStep#getJustification()
	 * @see #getEStep()
	 * @generated
	 */
	EReference getEStep_Justification();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EStep#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step</em>'.
	 * @see MetamodelExecution.EStep#getStep()
	 * @see #getEStep()
	 * @generated
	 */
	EReference getEStep_Step();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EStep#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creator</em>'.
	 * @see MetamodelExecution.EStep#getCreator()
	 * @see #getEStep()
	 * @generated
	 */
	EReference getEStep_Creator();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EStep#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executor</em>'.
	 * @see MetamodelExecution.EStep#getExecutor()
	 * @see #getEStep()
	 * @generated
	 */
	EReference getEStep_Executor();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.EStep#getName()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EStep#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous</em>'.
	 * @see MetamodelExecution.EStep#getPrevious()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_Previous();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EStep#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next</em>'.
	 * @see MetamodelExecution.EStep#getNext()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_Next();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.PrescriptionResult <em>Prescription Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescription Result</em>'.
	 * @see MetamodelExecution.PrescriptionResult
	 * @generated
	 */
	EClass getPrescriptionResult();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PrescriptionResult#isSuccess <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success</em>'.
	 * @see MetamodelExecution.PrescriptionResult#isSuccess()
	 * @see #getPrescriptionResult()
	 * @generated
	 */
	EAttribute getPrescriptionResult_Success();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PrescriptionResult#getRequestDate <em>Request Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Date</em>'.
	 * @see MetamodelExecution.PrescriptionResult#getRequestDate()
	 * @see #getPrescriptionResult()
	 * @generated
	 */
	EAttribute getPrescriptionResult_RequestDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PrescriptionResult#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.PrescriptionResult#getId()
	 * @see #getPrescriptionResult()
	 * @generated
	 */
	EAttribute getPrescriptionResult_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PrescriptionResult#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see MetamodelExecution.PrescriptionResult#getMessage()
	 * @see #getPrescriptionResult()
	 * @generated
	 */
	EAttribute getPrescriptionResult_Message();

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
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.EPathway#getEStep <em>EStep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EStep</em>'.
	 * @see MetamodelExecution.EPathway#getEStep()
	 * @see #getEPathway()
	 * @generated
	 */
	EReference getEPathway_EStep();

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
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.EPathway#getComplementaryconducts <em>Complementaryconducts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complementaryconducts</em>'.
	 * @see MetamodelExecution.EPathway#getComplementaryconducts()
	 * @see #getEPathway()
	 * @generated
	 */
	EReference getEPathway_Complementaryconducts();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EPathway#getMedicalcare <em>Medicalcare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Medicalcare</em>'.
	 * @see MetamodelExecution.EPathway#getMedicalcare()
	 * @see #getEPathway()
	 * @generated
	 */
	EReference getEPathway_Medicalcare();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPathway#getCid <em>Cid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cid</em>'.
	 * @see MetamodelExecution.EPathway#getCid()
	 * @see #getEPathway()
	 * @generated
	 */
	EAttribute getEPathway_Cid();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.EPathway#getTimeExecution <em>Time Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Execution</em>'.
	 * @see MetamodelExecution.EPathway#getTimeExecution()
	 * @see #getEPathway()
	 * @generated
	 */
	EAttribute getEPathway_TimeExecution();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Question#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see MetamodelExecution.Question#getOrder()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Order();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Question#isNotApplied <em>Not Applied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Applied</em>'.
	 * @see MetamodelExecution.Question#isNotApplied()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_NotApplied();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Variable#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MetamodelExecution.Variable#getUnit()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Unit();

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
	 * Returns the meta object for the containment reference list '{@link MetamodelExecution.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see MetamodelExecution.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Value();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Medication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication</em>'.
	 * @see MetamodelExecution.Medication
	 * @generated
	 */
	EClass getMedication();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Medication#getId()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Medication#getName()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MetamodelExecution.Medication#getCode()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Code();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MetamodelExecution.Medication#getDescription()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Description();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brand</em>'.
	 * @see MetamodelExecution.Medication#getBrand()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Brand();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#isOutpatient <em>Outpatient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outpatient</em>'.
	 * @see MetamodelExecution.Medication#isOutpatient()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Outpatient();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard</em>'.
	 * @see MetamodelExecution.Medication#getStandard()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Standard();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getDailyDosage <em>Daily Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daily Dosage</em>'.
	 * @see MetamodelExecution.Medication#getDailyDosage()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_DailyDosage();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getCycles <em>Cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycles</em>'.
	 * @see MetamodelExecution.Medication#getCycles()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Cycles();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see MetamodelExecution.Medication#getFrequency()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getTimeTreatement <em>Time Treatement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Treatement</em>'.
	 * @see MetamodelExecution.Medication#getTimeTreatement()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_TimeTreatement();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Interval</em>'.
	 * @see MetamodelExecution.Medication#getTimeInterval()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_TimeInterval();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see MetamodelExecution.Medication#getCategory()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Category();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getCodeAccess <em>Code Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Access</em>'.
	 * @see MetamodelExecution.Medication#getCodeAccess()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_CodeAccess();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getNameAcess <em>Name Acess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Acess</em>'.
	 * @see MetamodelExecution.Medication#getNameAcess()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_NameAcess();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getCodeUnit <em>Code Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Unit</em>'.
	 * @see MetamodelExecution.Medication#getCodeUnit()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_CodeUnit();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getNameUnit <em>Name Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Unit</em>'.
	 * @see MetamodelExecution.Medication#getNameUnit()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_NameUnit();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Medication#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MetamodelExecution.Medication#getUnit()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Unit();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.EAction <em>EAction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAction</em>'.
	 * @see MetamodelExecution.EAction
	 * @generated
	 */
	EClass getEAction();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.EAction#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see MetamodelExecution.EAction#getRequest()
	 * @see #getEAction()
	 * @generated
	 */
	EReference getEAction_Request();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see MetamodelExecution.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Request#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Request#getId()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Request#getRequestedBy <em>Requested By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requested By</em>'.
	 * @see MetamodelExecution.Request#getRequestedBy()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_RequestedBy();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Request#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see MetamodelExecution.Request#getMessage()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Message();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Request#isSuccess <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success</em>'.
	 * @see MetamodelExecution.Request#isSuccess()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Success();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Request#getRequestDate <em>Request Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Date</em>'.
	 * @see MetamodelExecution.Request#getRequestDate()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_RequestDate();

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
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.Pathway#getAudit <em>Audit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Audit</em>'.
	 * @see MetamodelExecution.Pathway#getAudit()
	 * @see #getPathway()
	 * @generated
	 */
	EReference getPathway_Audit();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.EProcedure <em>EProcedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EProcedure</em>'.
	 * @see MetamodelExecution.EProcedure
	 * @generated
	 */
	EClass getEProcedure();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.EPause <em>EPause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPause</em>'.
	 * @see MetamodelExecution.EPause
	 * @generated
	 */
	EClass getEPause();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see MetamodelExecution.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Procedure#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Procedure#getId()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Procedure#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see MetamodelExecution.Procedure#getCategory()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Category();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Procedure#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see MetamodelExecution.Procedure#getFrequency()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Procedure#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see MetamodelExecution.Procedure#getQuantity()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Procedure#getIdProcedure <em>Id Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Procedure</em>'.
	 * @see MetamodelExecution.Procedure#getIdProcedure()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_IdProcedure();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Procedure#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MetamodelExecution.Procedure#getCode()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Code();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Procedure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Procedure#getName()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Procedure#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MetamodelExecution.Procedure#getDescription()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Description();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Procedure#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see MetamodelExecution.Procedure#getTypeCode()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Procedure#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see MetamodelExecution.Procedure#getTypeName()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Procedure#isOutpatient <em>Outpatient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outpatient</em>'.
	 * @see MetamodelExecution.Procedure#isOutpatient()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Outpatient();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Procedure#isMemberPeers <em>Member Peers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Peers</em>'.
	 * @see MetamodelExecution.Procedure#isMemberPeers()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_MemberPeers();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Internment <em>Internment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internment</em>'.
	 * @see MetamodelExecution.Internment
	 * @generated
	 */
	EClass getInternment();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Internment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Internment#getId()
	 * @see #getInternment()
	 * @generated
	 */
	EAttribute getInternment_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Internment#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see MetamodelExecution.Internment#getCategory()
	 * @see #getInternment()
	 * @generated
	 */
	EAttribute getInternment_Category();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Internment#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification</em>'.
	 * @see MetamodelExecution.Internment#getJustification()
	 * @see #getInternment()
	 * @generated
	 */
	EAttribute getInternment_Justification();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Internment#getClinicalIndication <em>Clinical Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clinical Indication</em>'.
	 * @see MetamodelExecution.Internment#getClinicalIndication()
	 * @see #getInternment()
	 * @generated
	 */
	EAttribute getInternment_ClinicalIndication();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Internment#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see MetamodelExecution.Internment#getQuantity()
	 * @see #getInternment()
	 * @generated
	 */
	EAttribute getInternment_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Internment#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see MetamodelExecution.Internment#getTypeName()
	 * @see #getInternment()
	 * @generated
	 */
	EAttribute getInternment_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Internment#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MetamodelExecution.Internment#getCode()
	 * @see #getInternment()
	 * @generated
	 */
	EAttribute getInternment_Code();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Internment#getIdInternment <em>Id Internment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Internment</em>'.
	 * @see MetamodelExecution.Internment#getIdInternment()
	 * @see #getInternment()
	 * @generated
	 */
	EAttribute getInternment_IdInternment();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Internment#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see MetamodelExecution.Internment#getTypeCode()
	 * @see #getInternment()
	 * @generated
	 */
	EAttribute getInternment_TypeCode();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Internment#isMemberPeers <em>Member Peers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Peers</em>'.
	 * @see MetamodelExecution.Internment#isMemberPeers()
	 * @see #getInternment()
	 * @generated
	 */
	EAttribute getInternment_MemberPeers();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Internment#isOutpatient <em>Outpatient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outpatient</em>'.
	 * @see MetamodelExecution.Internment#isOutpatient()
	 * @see #getInternment()
	 * @generated
	 */
	EAttribute getInternment_Outpatient();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Internment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Internment#getName()
	 * @see #getInternment()
	 * @generated
	 */
	EAttribute getInternment_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Internment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MetamodelExecution.Internment#getDescription()
	 * @see #getInternment()
	 * @generated
	 */
	EAttribute getInternment_Description();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.ComplementaryConducts <em>Complementary Conducts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complementary Conducts</em>'.
	 * @see MetamodelExecution.ComplementaryConducts
	 * @generated
	 */
	EClass getComplementaryConducts();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ComplementaryConducts#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.ComplementaryConducts#getId()
	 * @see #getComplementaryConducts()
	 * @generated
	 */
	EAttribute getComplementaryConducts_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ComplementaryConducts#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MetamodelExecution.ComplementaryConducts#getType()
	 * @see #getComplementaryConducts()
	 * @generated
	 */
	EAttribute getComplementaryConducts_Type();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ComplementaryConducts#getPathway <em>Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pathway</em>'.
	 * @see MetamodelExecution.ComplementaryConducts#getPathway()
	 * @see #getComplementaryConducts()
	 * @generated
	 */
	EAttribute getComplementaryConducts_Pathway();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ComplementaryConducts#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see MetamodelExecution.ComplementaryConducts#getCreationDate()
	 * @see #getComplementaryConducts()
	 * @generated
	 */
	EAttribute getComplementaryConducts_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ComplementaryConducts#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification</em>'.
	 * @see MetamodelExecution.ComplementaryConducts#getJustification()
	 * @see #getComplementaryConducts()
	 * @generated
	 */
	EAttribute getComplementaryConducts_Justification();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ComplementaryConducts#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By</em>'.
	 * @see MetamodelExecution.ComplementaryConducts#getCreatedBy()
	 * @see #getComplementaryConducts()
	 * @generated
	 */
	EAttribute getComplementaryConducts_CreatedBy();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ComplementaryConducts#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see MetamodelExecution.ComplementaryConducts#getResource()
	 * @see #getComplementaryConducts()
	 * @generated
	 */
	EAttribute getComplementaryConducts_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ComplementaryConducts#getSuspension <em>Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suspension</em>'.
	 * @see MetamodelExecution.ComplementaryConducts#getSuspension()
	 * @see #getComplementaryConducts()
	 * @generated
	 */
	EReference getComplementaryConducts_Suspension();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.MedicalCare <em>Medical Care</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medical Care</em>'.
	 * @see MetamodelExecution.MedicalCare
	 * @generated
	 */
	EClass getMedicalCare();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicalCare#getCodeMedicalCare <em>Code Medical Care</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Medical Care</em>'.
	 * @see MetamodelExecution.MedicalCare#getCodeMedicalCare()
	 * @see #getMedicalCare()
	 * @generated
	 */
	EAttribute getMedicalCare_CodeMedicalCare();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicalCare#getPacient <em>Pacient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pacient</em>'.
	 * @see MetamodelExecution.MedicalCare#getPacient()
	 * @see #getMedicalCare()
	 * @generated
	 */
	EAttribute getMedicalCare_Pacient();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicalCare#getProfessional <em>Professional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Professional</em>'.
	 * @see MetamodelExecution.MedicalCare#getProfessional()
	 * @see #getMedicalCare()
	 * @generated
	 */
	EAttribute getMedicalCare_Professional();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicalCare#getIdProfessional <em>Id Professional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Professional</em>'.
	 * @see MetamodelExecution.MedicalCare#getIdProfessional()
	 * @see #getMedicalCare()
	 * @generated
	 */
	EAttribute getMedicalCare_IdProfessional();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicalCare#getHospitalUnit <em>Hospital Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hospital Unit</em>'.
	 * @see MetamodelExecution.MedicalCare#getHospitalUnit()
	 * @see #getMedicalCare()
	 * @generated
	 */
	EAttribute getMedicalCare_HospitalUnit();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicalCare#getPatientRecord <em>Patient Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Record</em>'.
	 * @see MetamodelExecution.MedicalCare#getPatientRecord()
	 * @see #getMedicalCare()
	 * @generated
	 */
	EAttribute getMedicalCare_PatientRecord();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicalCare#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see MetamodelExecution.MedicalCare#getAge()
	 * @see #getMedicalCare()
	 * @generated
	 */
	EAttribute getMedicalCare_Age();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicalCare#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see MetamodelExecution.MedicalCare#getSex()
	 * @see #getMedicalCare()
	 * @generated
	 */
	EAttribute getMedicalCare_Sex();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Comorbidity <em>Comorbidity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comorbidity</em>'.
	 * @see MetamodelExecution.Comorbidity
	 * @generated
	 */
	EClass getComorbidity();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Comorbidity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Comorbidity#getName()
	 * @see #getComorbidity()
	 * @generated
	 */
	EAttribute getComorbidity_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Comorbidity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Comorbidity#getId()
	 * @see #getComorbidity()
	 * @generated
	 */
	EAttribute getComorbidity_Id();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.ComplementaryMedication <em>Complementary Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complementary Medication</em>'.
	 * @see MetamodelExecution.ComplementaryMedication
	 * @generated
	 */
	EClass getComplementaryMedication();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ComplementaryMedication#getPrescribedresource <em>Prescribedresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescribedresource</em>'.
	 * @see MetamodelExecution.ComplementaryMedication#getPrescribedresource()
	 * @see #getComplementaryMedication()
	 * @generated
	 */
	EReference getComplementaryMedication_Prescribedresource();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.ComplementaryProcedure <em>Complementary Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complementary Procedure</em>'.
	 * @see MetamodelExecution.ComplementaryProcedure
	 * @generated
	 */
	EClass getComplementaryProcedure();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ComplementaryProcedure#getProcedureprescribedresource <em>Procedureprescribedresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Procedureprescribedresource</em>'.
	 * @see MetamodelExecution.ComplementaryProcedure#getProcedureprescribedresource()
	 * @see #getComplementaryProcedure()
	 * @generated
	 */
	EReference getComplementaryProcedure_Procedureprescribedresource();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Suspension <em>Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspension</em>'.
	 * @see MetamodelExecution.Suspension
	 * @generated
	 */
	EClass getSuspension();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Suspension#isSuccess <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success</em>'.
	 * @see MetamodelExecution.Suspension#isSuccess()
	 * @see #getSuspension()
	 * @generated
	 */
	EAttribute getSuspension_Success();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Suspension#getRequestDate <em>Request Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Date</em>'.
	 * @see MetamodelExecution.Suspension#getRequestDate()
	 * @see #getSuspension()
	 * @generated
	 */
	EAttribute getSuspension_RequestDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Suspension#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Suspension#getId()
	 * @see #getSuspension()
	 * @generated
	 */
	EAttribute getSuspension_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Suspension#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see MetamodelExecution.Suspension#getMessage()
	 * @see #getSuspension()
	 * @generated
	 */
	EAttribute getSuspension_Message();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.MedicationPrescribedResource <em>Medication Prescribed Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Prescribed Resource</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource
	 * @generated
	 */
	EClass getMedicationPrescribedResource();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getId()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getIdMedication <em>Id Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Medication</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getIdMedication()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_IdMedication();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#isOutpatient <em>Outpatient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outpatient</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#isOutpatient()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_Outpatient();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getName()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brand</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getBrand()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_Brand();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getCode()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_Code();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getCycles <em>Cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycles</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getCycles()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_Cycles();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getCategory()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_Category();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getDescription()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_Description();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Interval</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getTimeInterval()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_TimeInterval();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getDailyDosage <em>Daily Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daily Dosage</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getDailyDosage()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_DailyDosage();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getFrequency()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getTimeTreatement <em>Time Treatement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Treatement</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getTimeTreatement()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_TimeTreatement();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getMedication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medication</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getMedication()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_Medication();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getUnit()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_Unit();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.MedicationPrescribedResource#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getAccess()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EAttribute getMedicationPrescribedResource_Access();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.MedicationPrescribedResource#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standard</em>'.
	 * @see MetamodelExecution.MedicationPrescribedResource#getStandard()
	 * @see #getMedicationPrescribedResource()
	 * @generated
	 */
	EReference getMedicationPrescribedResource_Standard();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.ProcedurePrescribedResource <em>Procedure Prescribed Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Prescribed Resource</em>'.
	 * @see MetamodelExecution.ProcedurePrescribedResource
	 * @generated
	 */
	EClass getProcedurePrescribedResource();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ProcedurePrescribedResource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.ProcedurePrescribedResource#getId()
	 * @see #getProcedurePrescribedResource()
	 * @generated
	 */
	EAttribute getProcedurePrescribedResource_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ProcedurePrescribedResource#getIdProcedure <em>Id Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Procedure</em>'.
	 * @see MetamodelExecution.ProcedurePrescribedResource#getIdProcedure()
	 * @see #getProcedurePrescribedResource()
	 * @generated
	 */
	EAttribute getProcedurePrescribedResource_IdProcedure();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ProcedurePrescribedResource#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see MetamodelExecution.ProcedurePrescribedResource#getQuantity()
	 * @see #getProcedurePrescribedResource()
	 * @generated
	 */
	EAttribute getProcedurePrescribedResource_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ProcedurePrescribedResource#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see MetamodelExecution.ProcedurePrescribedResource#getFrequency()
	 * @see #getProcedurePrescribedResource()
	 * @generated
	 */
	EAttribute getProcedurePrescribedResource_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ProcedurePrescribedResource#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Procedure</em>'.
	 * @see MetamodelExecution.ProcedurePrescribedResource#getProcedure()
	 * @see #getProcedurePrescribedResource()
	 * @generated
	 */
	EAttribute getProcedurePrescribedResource_Procedure();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ProcedurePrescribedResource#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see MetamodelExecution.ProcedurePrescribedResource#getCategory()
	 * @see #getProcedurePrescribedResource()
	 * @generated
	 */
	EAttribute getProcedurePrescribedResource_Category();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.ComplementaryExamination <em>Complementary Examination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complementary Examination</em>'.
	 * @see MetamodelExecution.ComplementaryExamination
	 * @generated
	 */
	EClass getComplementaryExamination();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.ComplementaryExamination#getExaminationprescribedresource <em>Examinationprescribedresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Examinationprescribedresource</em>'.
	 * @see MetamodelExecution.ComplementaryExamination#getExaminationprescribedresource()
	 * @see #getComplementaryExamination()
	 * @generated
	 */
	EReference getComplementaryExamination_Examinationprescribedresource();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Audit <em>Audit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audit</em>'.
	 * @see MetamodelExecution.Audit
	 * @generated
	 */
	EClass getAudit();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Audit#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see MetamodelExecution.Audit#getUser()
	 * @see #getAudit()
	 * @generated
	 */
	EAttribute getAudit_User();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Audit#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see MetamodelExecution.Audit#getDate()
	 * @see #getAudit()
	 * @generated
	 */
	EAttribute getAudit_Date();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see MetamodelExecution.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Result#isSuccess <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success</em>'.
	 * @see MetamodelExecution.Result#isSuccess()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Success();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Result#getRequestDate <em>Request Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Date</em>'.
	 * @see MetamodelExecution.Result#getRequestDate()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_RequestDate();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Result#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Result#getId()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Result#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see MetamodelExecution.Result#getMessage()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Message();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.ExaminationPrescribedResource <em>Examination Prescribed Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examination Prescribed Resource</em>'.
	 * @see MetamodelExecution.ExaminationPrescribedResource
	 * @generated
	 */
	EClass getExaminationPrescribedResource();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExaminationPrescribedResource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.ExaminationPrescribedResource#getId()
	 * @see #getExaminationPrescribedResource()
	 * @generated
	 */
	EAttribute getExaminationPrescribedResource_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExaminationPrescribedResource#getExam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exam</em>'.
	 * @see MetamodelExecution.ExaminationPrescribedResource#getExam()
	 * @see #getExaminationPrescribedResource()
	 * @generated
	 */
	EAttribute getExaminationPrescribedResource_Exam();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExaminationPrescribedResource#getIdExam <em>Id Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Exam</em>'.
	 * @see MetamodelExecution.ExaminationPrescribedResource#getIdExam()
	 * @see #getExaminationPrescribedResource()
	 * @generated
	 */
	EAttribute getExaminationPrescribedResource_IdExam();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExaminationPrescribedResource#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification</em>'.
	 * @see MetamodelExecution.ExaminationPrescribedResource#getJustification()
	 * @see #getExaminationPrescribedResource()
	 * @generated
	 */
	EAttribute getExaminationPrescribedResource_Justification();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExaminationPrescribedResource#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see MetamodelExecution.ExaminationPrescribedResource#getCategory()
	 * @see #getExaminationPrescribedResource()
	 * @generated
	 */
	EAttribute getExaminationPrescribedResource_Category();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExaminationPrescribedResource#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see MetamodelExecution.ExaminationPrescribedResource#getQuantity()
	 * @see #getExaminationPrescribedResource()
	 * @generated
	 */
	EAttribute getExaminationPrescribedResource_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExaminationPrescribedResource#getSideLimb <em>Side Limb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side Limb</em>'.
	 * @see MetamodelExecution.ExaminationPrescribedResource#getSideLimb()
	 * @see #getExaminationPrescribedResource()
	 * @generated
	 */
	EAttribute getExaminationPrescribedResource_SideLimb();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.ExaminationPrescribedResource#getClinicalIndication <em>Clinical Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clinical Indication</em>'.
	 * @see MetamodelExecution.ExaminationPrescribedResource#getClinicalIndication()
	 * @see #getExaminationPrescribedResource()
	 * @generated
	 */
	EAttribute getExaminationPrescribedResource_ClinicalIndication();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard</em>'.
	 * @see MetamodelExecution.Standard
	 * @generated
	 */
	EClass getStandard();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Standard#getId()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getMnemonic <em>Mnemonic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mnemonic</em>'.
	 * @see MetamodelExecution.Standard#getMnemonic()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_Mnemonic();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getCodeActiveAgent <em>Code Active Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Active Agent</em>'.
	 * @see MetamodelExecution.Standard#getCodeActiveAgent()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_CodeActiveAgent();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getCodeDiluent <em>Code Diluent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Diluent</em>'.
	 * @see MetamodelExecution.Standard#getCodeDiluent()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_CodeDiluent();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getNameDiluent <em>Name Diluent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Diluent</em>'.
	 * @see MetamodelExecution.Standard#getNameDiluent()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_NameDiluent();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getCodeEventsDiluent <em>Code Events Diluent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Events Diluent</em>'.
	 * @see MetamodelExecution.Standard#getCodeEventsDiluent()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_CodeEventsDiluent();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getCodeOrderAdmin <em>Code Order Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Order Admin</em>'.
	 * @see MetamodelExecution.Standard#getCodeOrderAdmin()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_CodeOrderAdmin();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getCodeApresDiluent <em>Code Apres Diluent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Apres Diluent</em>'.
	 * @see MetamodelExecution.Standard#getCodeApresDiluent()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_CodeApresDiluent();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getTypeAccess <em>Type Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Access</em>'.
	 * @see MetamodelExecution.Standard#getTypeAccess()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_TypeAccess();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getTypeAdmin <em>Type Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Admin</em>'.
	 * @see MetamodelExecution.Standard#getTypeAdmin()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_TypeAdmin();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getQtyDiluent <em>Qty Diluent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qty Diluent</em>'.
	 * @see MetamodelExecution.Standard#getQtyDiluent()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_QtyDiluent();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getQtyVolume <em>Qty Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qty Volume</em>'.
	 * @see MetamodelExecution.Standard#getQtyVolume()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_QtyVolume();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getQtyDosage <em>Qty Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qty Dosage</em>'.
	 * @see MetamodelExecution.Standard#getQtyDosage()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_QtyDosage();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getCodeUnitDosage <em>Code Unit Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Unit Dosage</em>'.
	 * @see MetamodelExecution.Standard#getCodeUnitDosage()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_CodeUnitDosage();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Standard#getAdminDiluent <em>Admin Diluent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin Diluent</em>'.
	 * @see MetamodelExecution.Standard#getAdminDiluent()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_AdminDiluent();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Allergy <em>Allergy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergy</em>'.
	 * @see MetamodelExecution.Allergy
	 * @generated
	 */
	EClass getAllergy();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Allergy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Allergy#getName()
	 * @see #getAllergy()
	 * @generated
	 */
	EAttribute getAllergy_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Allergy#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Allergy#getId()
	 * @see #getAllergy()
	 * @generated
	 */
	EAttribute getAllergy_Id();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.VitalSign <em>Vital Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Sign</em>'.
	 * @see MetamodelExecution.VitalSign
	 * @generated
	 */
	EClass getVitalSign();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.VitalSign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.VitalSign#getName()
	 * @see #getVitalSign()
	 * @generated
	 */
	EAttribute getVitalSign_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.VitalSign#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.VitalSign#getId()
	 * @see #getVitalSign()
	 * @generated
	 */
	EAttribute getVitalSign_Id();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.PatientAge <em>Patient Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Age</em>'.
	 * @see MetamodelExecution.PatientAge
	 * @generated
	 */
	EClass getPatientAge();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.PatientSex <em>Patient Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Sex</em>'.
	 * @see MetamodelExecution.PatientSex
	 * @generated
	 */
	EClass getPatientSex();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PatientSex#isTruePremise <em>True Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>True Premise</em>'.
	 * @see MetamodelExecution.PatientSex#isTruePremise()
	 * @see #getPatientSex()
	 * @generated
	 */
	EAttribute getPatientSex_TruePremise();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Bond#getIdBond <em>Id Bond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Bond</em>'.
	 * @see MetamodelExecution.Bond#getIdBond()
	 * @see #getBond()
	 * @generated
	 */
	EAttribute getBond_IdBond();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see MetamodelExecution.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Option#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.Option#getId()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Id();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Option#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see MetamodelExecution.Option#getText()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Text();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Option#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see MetamodelExecution.Option#getWeight()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Weight();

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
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MetamodelExecution.Prescription#getName()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Name();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see MetamodelExecution.Prescription#getFrequency()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getIdMedication <em>Id Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Medication</em>'.
	 * @see MetamodelExecution.Prescription#getIdMedication()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_IdMedication();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getMedication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medication</em>'.
	 * @see MetamodelExecution.Prescription#getMedication()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Medication();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getQtdPrescription <em>Qtd Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qtd Prescription</em>'.
	 * @see MetamodelExecution.Prescription#getQtdPrescription()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_QtdPrescription();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation</em>'.
	 * @see MetamodelExecution.Prescription#getPresentation()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Presentation();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see MetamodelExecution.Prescription#getAccess()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Access();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getQtdDuration <em>Qtd Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qtd Duration</em>'.
	 * @see MetamodelExecution.Prescription#getQtdDuration()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_QtdDuration();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getUnitDuration <em>Unit Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Duration</em>'.
	 * @see MetamodelExecution.Prescription#getUnitDuration()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_UnitDuration();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getUnitFrequency <em>Unit Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Frequency</em>'.
	 * @see MetamodelExecution.Prescription#getUnitFrequency()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_UnitFrequency();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getComplement <em>Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complement</em>'.
	 * @see MetamodelExecution.Prescription#getComplement()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Complement();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.Prescription#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see MetamodelExecution.Prescription#getOrder()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Order();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.PPaediatricMedicationt <em>PPaediatric Medicationt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PPaediatric Medicationt</em>'.
	 * @see MetamodelExecution.PPaediatricMedicationt
	 * @generated
	 */
	EClass getPPaediatricMedicationt();

	/**
	 * Returns the meta object for the attribute '{@link MetamodelExecution.PPaediatricMedicationt#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MetamodelExecution.PPaediatricMedicationt#getId()
	 * @see #getPPaediatricMedicationt()
	 * @generated
	 */
	EAttribute getPPaediatricMedicationt_Id();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PPaediatricMedicationt#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see MetamodelExecution.PPaediatricMedicationt#getResult()
	 * @see #getPPaediatricMedicationt()
	 * @generated
	 */
	EReference getPPaediatricMedicationt_Result();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PPaediatricMedicationt#getPrescriptionResult <em>Prescription Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescription Result</em>'.
	 * @see MetamodelExecution.PPaediatricMedicationt#getPrescriptionResult()
	 * @see #getPPaediatricMedicationt()
	 * @generated
	 */
	EReference getPPaediatricMedicationt_PrescriptionResult();

	/**
	 * Returns the meta object for the containment reference '{@link MetamodelExecution.PPaediatricMedicationt#getPaediatricMedication <em>Paediatric Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Paediatric Medication</em>'.
	 * @see MetamodelExecution.PPaediatricMedicationt#getPaediatricMedication()
	 * @see #getPPaediatricMedicationt()
	 * @generated
	 */
	EReference getPPaediatricMedicationt_PaediatricMedication();

	/**
	 * Returns the meta object for class '{@link MetamodelExecution.PaediatricMedication <em>Paediatric Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paediatric Medication</em>'.
	 * @see MetamodelExecution.PaediatricMedication
	 * @generated
	 */
	EClass getPaediatricMedication();

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
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDISCHARGE__REQUEST = eINSTANCE.getEDischarge_Request();

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
		 * The meta object literal for the '<em><b>Epathway</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFERRAL__EPATHWAY = eINSTANCE.getEReferral_Epathway();

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
		 * The meta object literal for the '<em><b>Pprescription</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPRESCRIPTION__PPRESCRIPTION = eINSTANCE.getEPrescription_Pprescription();

		/**
		 * The meta object literal for the '<em><b>Ids PMedication</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPRESCRIPTION__IDS_PMEDICATION = eINSTANCE.getEPrescription_IdsPMedication();

		/**
		 * The meta object literal for the '<em><b>Ids PPrescription</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPRESCRIPTION__IDS_PPRESCRIPTION = eINSTANCE.getEPrescription_IdsPPrescription();

		/**
		 * The meta object literal for the '<em><b>Pmedication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPRESCRIPTION__PMEDICATION = eINSTANCE.getEPrescription_Pmedication();

		/**
		 * The meta object literal for the '<em><b>Type Prescription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPRESCRIPTION__TYPE_PRESCRIPTION = eINSTANCE.getEPrescription_TypePrescription();

		/**
		 * The meta object literal for the '<em><b>Last Executed Prescription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPRESCRIPTION__LAST_EXECUTED_PRESCRIPTION = eINSTANCE.getEPrescription_LastExecutedPrescription();

		/**
		 * The meta object literal for the '<em><b>Prescription Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPRESCRIPTION__PRESCRIPTION_RESULT = eINSTANCE.getEPrescription_PrescriptionResult();

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
		 * The meta object literal for the '<em><b>Pexamination</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETREATMENT__PEXAMINATION = eINSTANCE.getETreatment_Pexamination();

		/**
		 * The meta object literal for the '<em><b>Pprocedure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETREATMENT__PPROCEDURE = eINSTANCE.getETreatment_Pprocedure();

		/**
		 * The meta object literal for the '<em><b>Pinternment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETREATMENT__PINTERNMENT = eINSTANCE.getETreatment_Pinternment();

		/**
		 * The meta object literal for the '<em><b>Pmedication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETREATMENT__PMEDICATION = eINSTANCE.getETreatment_Pmedication();

		/**
		 * The meta object literal for the '<em><b>Ids PExamination</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETREATMENT__IDS_PEXAMINATION = eINSTANCE.getETreatment_IdsPExamination();

		/**
		 * The meta object literal for the '<em><b>Ids PProcedure</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETREATMENT__IDS_PPROCEDURE = eINSTANCE.getETreatment_IdsPProcedure();

		/**
		 * The meta object literal for the '<em><b>Ids PInternment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETREATMENT__IDS_PINTERNMENT = eINSTANCE.getETreatment_IdsPInternment();

		/**
		 * The meta object literal for the '<em><b>Ids PMedication</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETREATMENT__IDS_PMEDICATION = eINSTANCE.getETreatment_IdsPMedication();

		/**
		 * The meta object literal for the '<em><b>Ids PPaediatric Medication</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETREATMENT__IDS_PPAEDIATRIC_MEDICATION = eINSTANCE.getETreatment_IdsPPaediatricMedication();

		/**
		 * The meta object literal for the '<em><b>Ppaediatricmedicationt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETREATMENT__PPAEDIATRICMEDICATIONT = eINSTANCE.getETreatment_Ppaediatricmedicationt();

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
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__CATEGORY = eINSTANCE.getExamination_Category();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__DESCRIPTION = eINSTANCE.getExamination_Description();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__CODE = eINSTANCE.getExamination_Code();

		/**
		 * The meta object literal for the '<em><b>Member Peers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__MEMBER_PEERS = eINSTANCE.getExamination_MemberPeers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__NAME = eINSTANCE.getExamination_Name();

		/**
		 * The meta object literal for the '<em><b>Only Emergency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__ONLY_EMERGENCY = eINSTANCE.getExamination_OnlyEmergency();

		/**
		 * The meta object literal for the '<em><b>Id Examination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION__ID_EXAMINATION = eINSTANCE.getExamination_IdExamination();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PExaminationImpl <em>PExamination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PExaminationImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPExamination()
		 * @generated
		 */
		EClass PEXAMINATION = eINSTANCE.getPExamination();

		/**
		 * The meta object literal for the '<em><b>Examination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEXAMINATION__EXAMINATION = eINSTANCE.getPExamination_Examination();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEXAMINATION__ID = eINSTANCE.getPExamination_Id();

		/**
		 * The meta object literal for the '<em><b>Report</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEXAMINATION__REPORT = eINSTANCE.getPExamination_Report();

		/**
		 * The meta object literal for the '<em><b>Number Guide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEXAMINATION__NUMBER_GUIDE = eINSTANCE.getPExamination_NumberGuide();

		/**
		 * The meta object literal for the '<em><b>Complement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEXAMINATION__COMPLEMENT = eINSTANCE.getPExamination_Complement();

		/**
		 * The meta object literal for the '<em><b>Prescription Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEXAMINATION__PRESCRIPTION_RESULT = eINSTANCE.getPExamination_PrescriptionResult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEXAMINATION__NAME = eINSTANCE.getPExamination_Name();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEXAMINATION__RESULT = eINSTANCE.getPExamination_Result();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PProcedureImpl <em>PProcedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PProcedureImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPProcedure()
		 * @generated
		 */
		EClass PPROCEDURE = eINSTANCE.getPProcedure();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPROCEDURE__ID = eINSTANCE.getPProcedure_Id();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPROCEDURE__PROCEDURE = eINSTANCE.getPProcedure_Procedure();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPROCEDURE__RESULT = eINSTANCE.getPProcedure_Result();

		/**
		 * The meta object literal for the '<em><b>Prescription Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPROCEDURE__PRESCRIPTION_RESULT = eINSTANCE.getPProcedure_PrescriptionResult();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PInternmentImpl <em>PInternment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PInternmentImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPInternment()
		 * @generated
		 */
		EClass PINTERNMENT = eINSTANCE.getPInternment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PINTERNMENT__ID = eINSTANCE.getPInternment_Id();

		/**
		 * The meta object literal for the '<em><b>Internment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PINTERNMENT__INTERNMENT = eINSTANCE.getPInternment_Internment();

		/**
		 * The meta object literal for the '<em><b>Number Guide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PINTERNMENT__NUMBER_GUIDE = eINSTANCE.getPInternment_NumberGuide();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PINTERNMENT__RESULT = eINSTANCE.getPInternment_Result();

		/**
		 * The meta object literal for the '<em><b>Prescription Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PINTERNMENT__PRESCRIPTION_RESULT = eINSTANCE.getPInternment_PrescriptionResult();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PMedicationImpl <em>PMedication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PMedicationImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPMedication()
		 * @generated
		 */
		EClass PMEDICATION = eINSTANCE.getPMedication();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMEDICATION__ID = eINSTANCE.getPMedication_Id();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMEDICATION__RESULT = eINSTANCE.getPMedication_Result();

		/**
		 * The meta object literal for the '<em><b>Medication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMEDICATION__MEDICATION = eINSTANCE.getPMedication_Medication();

		/**
		 * The meta object literal for the '<em><b>Prescription Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMEDICATION__PRESCRIPTION_RESULT = eINSTANCE.getPMedication_PrescriptionResult();

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
		 * The meta object literal for the '{@link MetamodelExecution.impl.PPrescriptionImpl <em>PPrescription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PPrescriptionImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPPrescription()
		 * @generated
		 */
		EClass PPRESCRIPTION = eINSTANCE.getPPrescription();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPRESCRIPTION__ID = eINSTANCE.getPPrescription_Id();

		/**
		 * The meta object literal for the '<em><b>Prescription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPRESCRIPTION__PRESCRIPTION = eINSTANCE.getPPrescription_Prescription();

		/**
		 * The meta object literal for the '<em><b>Prescription Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPRESCRIPTION__PRESCRIPTION_RESULT = eINSTANCE.getPPrescription_PrescriptionResult();

		/**
		 * The meta object literal for the '<em><b>Last Prescription Executed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPRESCRIPTION__LAST_PRESCRIPTION_EXECUTED = eINSTANCE.getPPrescription_LastPrescriptionExecuted();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPRESCRIPTION__RESULT = eINSTANCE.getPPrescription_Result();

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
		 * The meta object literal for the '{@link MetamodelExecution.impl.UnitValueImpl <em>Unit Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.UnitValueImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getUnitValue()
		 * @generated
		 */
		EClass UNIT_VALUE = eINSTANCE.getUnitValue();

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
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__QUESTION = eINSTANCE.getAnswer_Question();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__JUSTIFICATION = eINSTANCE.getAnswer_Justification();

		/**
		 * The meta object literal for the '<em><b>Unitvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__UNITVALUE = eINSTANCE.getAnswer_Unitvalue();

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
		 * The meta object literal for the '<em><b>Audit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__AUDIT = eINSTANCE.getStep_Audit();

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
		 * The meta object literal for the '{@link MetamodelExecution.impl.EStepImpl <em>EStep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.EStepImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEStep()
		 * @generated
		 */
		EClass ESTEP = eINSTANCE.getEStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__ID = eINSTANCE.getEStep_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__TYPE = eINSTANCE.getEStep_Type();

		/**
		 * The meta object literal for the '<em><b>Is Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__IS_CURRENT = eINSTANCE.getEStep_IsCurrent();

		/**
		 * The meta object literal for the '<em><b>Reworked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__REWORKED = eINSTANCE.getEStep_Reworked();

		/**
		 * The meta object literal for the '<em><b>Executed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__EXECUTED = eINSTANCE.getEStep_Executed();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__CREATION_DATE = eINSTANCE.getEStep_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Modification Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__MODIFICATION_DATE = eINSTANCE.getEStep_ModificationDate();

		/**
		 * The meta object literal for the '<em><b>Execution Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__EXECUTION_DATE = eINSTANCE.getEStep_ExecutionDate();

		/**
		 * The meta object literal for the '<em><b>Created By Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__CREATED_BY_ID = eINSTANCE.getEStep_CreatedById();

		/**
		 * The meta object literal for the '<em><b>Executed By Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__EXECUTED_BY_ID = eINSTANCE.getEStep_ExecutedById();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTEP__JUSTIFICATION = eINSTANCE.getEStep_Justification();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTEP__STEP = eINSTANCE.getEStep_Step();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTEP__CREATOR = eINSTANCE.getEStep_Creator();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTEP__EXECUTOR = eINSTANCE.getEStep_Executor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__NAME = eINSTANCE.getEStep_Name();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__PREVIOUS = eINSTANCE.getEStep_Previous();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__NEXT = eINSTANCE.getEStep_Next();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PrescriptionResultImpl <em>Prescription Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PrescriptionResultImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPrescriptionResult()
		 * @generated
		 */
		EClass PRESCRIPTION_RESULT = eINSTANCE.getPrescriptionResult();

		/**
		 * The meta object literal for the '<em><b>Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION_RESULT__SUCCESS = eINSTANCE.getPrescriptionResult_Success();

		/**
		 * The meta object literal for the '<em><b>Request Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION_RESULT__REQUEST_DATE = eINSTANCE.getPrescriptionResult_RequestDate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION_RESULT__ID = eINSTANCE.getPrescriptionResult_Id();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION_RESULT__MESSAGE = eINSTANCE.getPrescriptionResult_Message();

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
		 * The meta object literal for the '<em><b>EStep</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPATHWAY__ESTEP = eINSTANCE.getEPathway_EStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__ID = eINSTANCE.getEPathway_Id();

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
		 * The meta object literal for the '<em><b>Ids Executed Step</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__IDS_EXECUTED_STEP = eINSTANCE.getEPathway_IdsExecutedStep();

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
		 * The meta object literal for the '<em><b>Pathway</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPATHWAY__PATHWAY = eINSTANCE.getEPathway_Pathway();

		/**
		 * The meta object literal for the '<em><b>Complementaryconducts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPATHWAY__COMPLEMENTARYCONDUCTS = eINSTANCE.getEPathway_Complementaryconducts();

		/**
		 * The meta object literal for the '<em><b>Medicalcare</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPATHWAY__MEDICALCARE = eINSTANCE.getEPathway_Medicalcare();

		/**
		 * The meta object literal for the '<em><b>Cid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__CID = eINSTANCE.getEPathway_Cid();

		/**
		 * The meta object literal for the '<em><b>Time Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPATHWAY__TIME_EXECUTION = eINSTANCE.getEPathway_TimeExecution();

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
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__CATEGORY = eINSTANCE.getQuestion_Category();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__ORDER = eINSTANCE.getQuestion_Order();

		/**
		 * The meta object literal for the '<em><b>Not Applied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__NOT_APPLIED = eINSTANCE.getQuestion_NotApplied();

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
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__UNIT = eINSTANCE.getVariable_Unit();

		/**
		 * The meta object literal for the '<em><b>Bond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__BOND = eINSTANCE.getVariable_Bond();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.MedicationImpl <em>Medication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.MedicationImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getMedication()
		 * @generated
		 */
		EClass MEDICATION = eINSTANCE.getMedication();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__ID = eINSTANCE.getMedication_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__NAME = eINSTANCE.getMedication_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__CODE = eINSTANCE.getMedication_Code();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__DESCRIPTION = eINSTANCE.getMedication_Description();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__BRAND = eINSTANCE.getMedication_Brand();

		/**
		 * The meta object literal for the '<em><b>Outpatient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__OUTPATIENT = eINSTANCE.getMedication_Outpatient();

		/**
		 * The meta object literal for the '<em><b>Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__STANDARD = eINSTANCE.getMedication_Standard();

		/**
		 * The meta object literal for the '<em><b>Daily Dosage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__DAILY_DOSAGE = eINSTANCE.getMedication_DailyDosage();

		/**
		 * The meta object literal for the '<em><b>Cycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__CYCLES = eINSTANCE.getMedication_Cycles();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__FREQUENCY = eINSTANCE.getMedication_Frequency();

		/**
		 * The meta object literal for the '<em><b>Time Treatement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__TIME_TREATEMENT = eINSTANCE.getMedication_TimeTreatement();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__TIME_INTERVAL = eINSTANCE.getMedication_TimeInterval();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__CATEGORY = eINSTANCE.getMedication_Category();

		/**
		 * The meta object literal for the '<em><b>Code Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__CODE_ACCESS = eINSTANCE.getMedication_CodeAccess();

		/**
		 * The meta object literal for the '<em><b>Name Acess</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__NAME_ACESS = eINSTANCE.getMedication_NameAcess();

		/**
		 * The meta object literal for the '<em><b>Code Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__CODE_UNIT = eINSTANCE.getMedication_CodeUnit();

		/**
		 * The meta object literal for the '<em><b>Name Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__NAME_UNIT = eINSTANCE.getMedication_NameUnit();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__UNIT = eINSTANCE.getMedication_Unit();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.EActionImpl <em>EAction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.EActionImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEAction()
		 * @generated
		 */
		EClass EACTION = eINSTANCE.getEAction();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EACTION__REQUEST = eINSTANCE.getEAction_Request();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.RequestImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__ID = eINSTANCE.getRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Requested By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__REQUESTED_BY = eINSTANCE.getRequest_RequestedBy();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__MESSAGE = eINSTANCE.getRequest_Message();

		/**
		 * The meta object literal for the '<em><b>Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__SUCCESS = eINSTANCE.getRequest_Success();

		/**
		 * The meta object literal for the '<em><b>Request Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__REQUEST_DATE = eINSTANCE.getRequest_RequestDate();

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
		 * The meta object literal for the '<em><b>Audit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATHWAY__AUDIT = eINSTANCE.getPathway_Audit();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.EProcedureImpl <em>EProcedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.EProcedureImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEProcedure()
		 * @generated
		 */
		EClass EPROCEDURE = eINSTANCE.getEProcedure();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.EPauseImpl <em>EPause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.EPauseImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getEPause()
		 * @generated
		 */
		EClass EPAUSE = eINSTANCE.getEPause();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ProcedureImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__ID = eINSTANCE.getProcedure_Id();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__CATEGORY = eINSTANCE.getProcedure_Category();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__FREQUENCY = eINSTANCE.getProcedure_Frequency();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__QUANTITY = eINSTANCE.getProcedure_Quantity();

		/**
		 * The meta object literal for the '<em><b>Id Procedure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__ID_PROCEDURE = eINSTANCE.getProcedure_IdProcedure();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__CODE = eINSTANCE.getProcedure_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__NAME = eINSTANCE.getProcedure_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__DESCRIPTION = eINSTANCE.getProcedure_Description();

		/**
		 * The meta object literal for the '<em><b>Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__TYPE_CODE = eINSTANCE.getProcedure_TypeCode();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__TYPE_NAME = eINSTANCE.getProcedure_TypeName();

		/**
		 * The meta object literal for the '<em><b>Outpatient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__OUTPATIENT = eINSTANCE.getProcedure_Outpatient();

		/**
		 * The meta object literal for the '<em><b>Member Peers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__MEMBER_PEERS = eINSTANCE.getProcedure_MemberPeers();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.InternmentImpl <em>Internment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.InternmentImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getInternment()
		 * @generated
		 */
		EClass INTERNMENT = eINSTANCE.getInternment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNMENT__ID = eINSTANCE.getInternment_Id();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNMENT__CATEGORY = eINSTANCE.getInternment_Category();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNMENT__JUSTIFICATION = eINSTANCE.getInternment_Justification();

		/**
		 * The meta object literal for the '<em><b>Clinical Indication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNMENT__CLINICAL_INDICATION = eINSTANCE.getInternment_ClinicalIndication();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNMENT__QUANTITY = eINSTANCE.getInternment_Quantity();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNMENT__TYPE_NAME = eINSTANCE.getInternment_TypeName();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNMENT__CODE = eINSTANCE.getInternment_Code();

		/**
		 * The meta object literal for the '<em><b>Id Internment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNMENT__ID_INTERNMENT = eINSTANCE.getInternment_IdInternment();

		/**
		 * The meta object literal for the '<em><b>Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNMENT__TYPE_CODE = eINSTANCE.getInternment_TypeCode();

		/**
		 * The meta object literal for the '<em><b>Member Peers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNMENT__MEMBER_PEERS = eINSTANCE.getInternment_MemberPeers();

		/**
		 * The meta object literal for the '<em><b>Outpatient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNMENT__OUTPATIENT = eINSTANCE.getInternment_Outpatient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNMENT__NAME = eINSTANCE.getInternment_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNMENT__DESCRIPTION = eINSTANCE.getInternment_Description();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ComplementaryConductsImpl <em>Complementary Conducts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ComplementaryConductsImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getComplementaryConducts()
		 * @generated
		 */
		EClass COMPLEMENTARY_CONDUCTS = eINSTANCE.getComplementaryConducts();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENTARY_CONDUCTS__ID = eINSTANCE.getComplementaryConducts_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENTARY_CONDUCTS__TYPE = eINSTANCE.getComplementaryConducts_Type();

		/**
		 * The meta object literal for the '<em><b>Pathway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENTARY_CONDUCTS__PATHWAY = eINSTANCE.getComplementaryConducts_Pathway();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENTARY_CONDUCTS__CREATION_DATE = eINSTANCE.getComplementaryConducts_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENTARY_CONDUCTS__JUSTIFICATION = eINSTANCE.getComplementaryConducts_Justification();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENTARY_CONDUCTS__CREATED_BY = eINSTANCE.getComplementaryConducts_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENTARY_CONDUCTS__RESOURCE = eINSTANCE.getComplementaryConducts_Resource();

		/**
		 * The meta object literal for the '<em><b>Suspension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEMENTARY_CONDUCTS__SUSPENSION = eINSTANCE.getComplementaryConducts_Suspension();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.MedicalCareImpl <em>Medical Care</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.MedicalCareImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getMedicalCare()
		 * @generated
		 */
		EClass MEDICAL_CARE = eINSTANCE.getMedicalCare();

		/**
		 * The meta object literal for the '<em><b>Code Medical Care</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_CARE__CODE_MEDICAL_CARE = eINSTANCE.getMedicalCare_CodeMedicalCare();

		/**
		 * The meta object literal for the '<em><b>Pacient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_CARE__PACIENT = eINSTANCE.getMedicalCare_Pacient();

		/**
		 * The meta object literal for the '<em><b>Professional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_CARE__PROFESSIONAL = eINSTANCE.getMedicalCare_Professional();

		/**
		 * The meta object literal for the '<em><b>Id Professional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_CARE__ID_PROFESSIONAL = eINSTANCE.getMedicalCare_IdProfessional();

		/**
		 * The meta object literal for the '<em><b>Hospital Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_CARE__HOSPITAL_UNIT = eINSTANCE.getMedicalCare_HospitalUnit();

		/**
		 * The meta object literal for the '<em><b>Patient Record</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_CARE__PATIENT_RECORD = eINSTANCE.getMedicalCare_PatientRecord();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_CARE__AGE = eINSTANCE.getMedicalCare_Age();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_CARE__SEX = eINSTANCE.getMedicalCare_Sex();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ComorbidityImpl <em>Comorbidity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ComorbidityImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getComorbidity()
		 * @generated
		 */
		EClass COMORBIDITY = eINSTANCE.getComorbidity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMORBIDITY__NAME = eINSTANCE.getComorbidity_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMORBIDITY__ID = eINSTANCE.getComorbidity_Id();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ComplementaryMedicationImpl <em>Complementary Medication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ComplementaryMedicationImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getComplementaryMedication()
		 * @generated
		 */
		EClass COMPLEMENTARY_MEDICATION = eINSTANCE.getComplementaryMedication();

		/**
		 * The meta object literal for the '<em><b>Prescribedresource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEMENTARY_MEDICATION__PRESCRIBEDRESOURCE = eINSTANCE
				.getComplementaryMedication_Prescribedresource();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ComplementaryProcedureImpl <em>Complementary Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ComplementaryProcedureImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getComplementaryProcedure()
		 * @generated
		 */
		EClass COMPLEMENTARY_PROCEDURE = eINSTANCE.getComplementaryProcedure();

		/**
		 * The meta object literal for the '<em><b>Procedureprescribedresource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEMENTARY_PROCEDURE__PROCEDUREPRESCRIBEDRESOURCE = eINSTANCE
				.getComplementaryProcedure_Procedureprescribedresource();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.SuspensionImpl <em>Suspension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.SuspensionImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getSuspension()
		 * @generated
		 */
		EClass SUSPENSION = eINSTANCE.getSuspension();

		/**
		 * The meta object literal for the '<em><b>Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUSPENSION__SUCCESS = eINSTANCE.getSuspension_Success();

		/**
		 * The meta object literal for the '<em><b>Request Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUSPENSION__REQUEST_DATE = eINSTANCE.getSuspension_RequestDate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUSPENSION__ID = eINSTANCE.getSuspension_Id();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUSPENSION__MESSAGE = eINSTANCE.getSuspension_Message();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.MedicationPrescribedResourceImpl <em>Medication Prescribed Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.MedicationPrescribedResourceImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getMedicationPrescribedResource()
		 * @generated
		 */
		EClass MEDICATION_PRESCRIBED_RESOURCE = eINSTANCE.getMedicationPrescribedResource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__ID = eINSTANCE.getMedicationPrescribedResource_Id();

		/**
		 * The meta object literal for the '<em><b>Id Medication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__ID_MEDICATION = eINSTANCE
				.getMedicationPrescribedResource_IdMedication();

		/**
		 * The meta object literal for the '<em><b>Outpatient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__OUTPATIENT = eINSTANCE.getMedicationPrescribedResource_Outpatient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__NAME = eINSTANCE.getMedicationPrescribedResource_Name();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__BRAND = eINSTANCE.getMedicationPrescribedResource_Brand();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__CODE = eINSTANCE.getMedicationPrescribedResource_Code();

		/**
		 * The meta object literal for the '<em><b>Cycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__CYCLES = eINSTANCE.getMedicationPrescribedResource_Cycles();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__CATEGORY = eINSTANCE.getMedicationPrescribedResource_Category();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__DESCRIPTION = eINSTANCE
				.getMedicationPrescribedResource_Description();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__TIME_INTERVAL = eINSTANCE
				.getMedicationPrescribedResource_TimeInterval();

		/**
		 * The meta object literal for the '<em><b>Daily Dosage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__DAILY_DOSAGE = eINSTANCE
				.getMedicationPrescribedResource_DailyDosage();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__FREQUENCY = eINSTANCE.getMedicationPrescribedResource_Frequency();

		/**
		 * The meta object literal for the '<em><b>Time Treatement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__TIME_TREATEMENT = eINSTANCE
				.getMedicationPrescribedResource_TimeTreatement();

		/**
		 * The meta object literal for the '<em><b>Medication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__MEDICATION = eINSTANCE.getMedicationPrescribedResource_Medication();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__UNIT = eINSTANCE.getMedicationPrescribedResource_Unit();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_PRESCRIBED_RESOURCE__ACCESS = eINSTANCE.getMedicationPrescribedResource_Access();

		/**
		 * The meta object literal for the '<em><b>Standard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICATION_PRESCRIBED_RESOURCE__STANDARD = eINSTANCE.getMedicationPrescribedResource_Standard();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ProcedurePrescribedResourceImpl <em>Procedure Prescribed Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ProcedurePrescribedResourceImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getProcedurePrescribedResource()
		 * @generated
		 */
		EClass PROCEDURE_PRESCRIBED_RESOURCE = eINSTANCE.getProcedurePrescribedResource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE_PRESCRIBED_RESOURCE__ID = eINSTANCE.getProcedurePrescribedResource_Id();

		/**
		 * The meta object literal for the '<em><b>Id Procedure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE_PRESCRIBED_RESOURCE__ID_PROCEDURE = eINSTANCE.getProcedurePrescribedResource_IdProcedure();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE_PRESCRIBED_RESOURCE__QUANTITY = eINSTANCE.getProcedurePrescribedResource_Quantity();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE_PRESCRIBED_RESOURCE__FREQUENCY = eINSTANCE.getProcedurePrescribedResource_Frequency();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE_PRESCRIBED_RESOURCE__PROCEDURE = eINSTANCE.getProcedurePrescribedResource_Procedure();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE_PRESCRIBED_RESOURCE__CATEGORY = eINSTANCE.getProcedurePrescribedResource_Category();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ComplementaryExaminationImpl <em>Complementary Examination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ComplementaryExaminationImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getComplementaryExamination()
		 * @generated
		 */
		EClass COMPLEMENTARY_EXAMINATION = eINSTANCE.getComplementaryExamination();

		/**
		 * The meta object literal for the '<em><b>Examinationprescribedresource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEMENTARY_EXAMINATION__EXAMINATIONPRESCRIBEDRESOURCE = eINSTANCE
				.getComplementaryExamination_Examinationprescribedresource();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.AuditImpl <em>Audit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.AuditImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getAudit()
		 * @generated
		 */
		EClass AUDIT = eINSTANCE.getAudit();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIT__USER = eINSTANCE.getAudit_User();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIT__DATE = eINSTANCE.getAudit_Date();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ResultImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__SUCCESS = eINSTANCE.getResult_Success();

		/**
		 * The meta object literal for the '<em><b>Request Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__REQUEST_DATE = eINSTANCE.getResult_RequestDate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__ID = eINSTANCE.getResult_Id();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__MESSAGE = eINSTANCE.getResult_Message();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.ExaminationPrescribedResourceImpl <em>Examination Prescribed Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.ExaminationPrescribedResourceImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getExaminationPrescribedResource()
		 * @generated
		 */
		EClass EXAMINATION_PRESCRIBED_RESOURCE = eINSTANCE.getExaminationPrescribedResource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PRESCRIBED_RESOURCE__ID = eINSTANCE.getExaminationPrescribedResource_Id();

		/**
		 * The meta object literal for the '<em><b>Exam</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PRESCRIBED_RESOURCE__EXAM = eINSTANCE.getExaminationPrescribedResource_Exam();

		/**
		 * The meta object literal for the '<em><b>Id Exam</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PRESCRIBED_RESOURCE__ID_EXAM = eINSTANCE.getExaminationPrescribedResource_IdExam();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PRESCRIBED_RESOURCE__JUSTIFICATION = eINSTANCE
				.getExaminationPrescribedResource_Justification();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PRESCRIBED_RESOURCE__CATEGORY = eINSTANCE.getExaminationPrescribedResource_Category();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PRESCRIBED_RESOURCE__QUANTITY = eINSTANCE.getExaminationPrescribedResource_Quantity();

		/**
		 * The meta object literal for the '<em><b>Side Limb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PRESCRIBED_RESOURCE__SIDE_LIMB = eINSTANCE.getExaminationPrescribedResource_SideLimb();

		/**
		 * The meta object literal for the '<em><b>Clinical Indication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PRESCRIBED_RESOURCE__CLINICAL_INDICATION = eINSTANCE
				.getExaminationPrescribedResource_ClinicalIndication();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.StandardImpl <em>Standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.StandardImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getStandard()
		 * @generated
		 */
		EClass STANDARD = eINSTANCE.getStandard();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__ID = eINSTANCE.getStandard_Id();

		/**
		 * The meta object literal for the '<em><b>Mnemonic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__MNEMONIC = eINSTANCE.getStandard_Mnemonic();

		/**
		 * The meta object literal for the '<em><b>Code Active Agent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__CODE_ACTIVE_AGENT = eINSTANCE.getStandard_CodeActiveAgent();

		/**
		 * The meta object literal for the '<em><b>Code Diluent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__CODE_DILUENT = eINSTANCE.getStandard_CodeDiluent();

		/**
		 * The meta object literal for the '<em><b>Name Diluent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__NAME_DILUENT = eINSTANCE.getStandard_NameDiluent();

		/**
		 * The meta object literal for the '<em><b>Code Events Diluent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__CODE_EVENTS_DILUENT = eINSTANCE.getStandard_CodeEventsDiluent();

		/**
		 * The meta object literal for the '<em><b>Code Order Admin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__CODE_ORDER_ADMIN = eINSTANCE.getStandard_CodeOrderAdmin();

		/**
		 * The meta object literal for the '<em><b>Code Apres Diluent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__CODE_APRES_DILUENT = eINSTANCE.getStandard_CodeApresDiluent();

		/**
		 * The meta object literal for the '<em><b>Type Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__TYPE_ACCESS = eINSTANCE.getStandard_TypeAccess();

		/**
		 * The meta object literal for the '<em><b>Type Admin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__TYPE_ADMIN = eINSTANCE.getStandard_TypeAdmin();

		/**
		 * The meta object literal for the '<em><b>Qty Diluent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__QTY_DILUENT = eINSTANCE.getStandard_QtyDiluent();

		/**
		 * The meta object literal for the '<em><b>Qty Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__QTY_VOLUME = eINSTANCE.getStandard_QtyVolume();

		/**
		 * The meta object literal for the '<em><b>Qty Dosage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__QTY_DOSAGE = eINSTANCE.getStandard_QtyDosage();

		/**
		 * The meta object literal for the '<em><b>Code Unit Dosage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__CODE_UNIT_DOSAGE = eINSTANCE.getStandard_CodeUnitDosage();

		/**
		 * The meta object literal for the '<em><b>Admin Diluent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__ADMIN_DILUENT = eINSTANCE.getStandard_AdminDiluent();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.AllergyImpl <em>Allergy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.AllergyImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getAllergy()
		 * @generated
		 */
		EClass ALLERGY = eINSTANCE.getAllergy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLERGY__NAME = eINSTANCE.getAllergy_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLERGY__ID = eINSTANCE.getAllergy_Id();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.VitalSignImpl <em>Vital Sign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.VitalSignImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getVitalSign()
		 * @generated
		 */
		EClass VITAL_SIGN = eINSTANCE.getVitalSign();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VITAL_SIGN__NAME = eINSTANCE.getVitalSign_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VITAL_SIGN__ID = eINSTANCE.getVitalSign_Id();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PatientAgeImpl <em>Patient Age</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PatientAgeImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPatientAge()
		 * @generated
		 */
		EClass PATIENT_AGE = eINSTANCE.getPatientAge();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PatientSexImpl <em>Patient Sex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PatientSexImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPatientSex()
		 * @generated
		 */
		EClass PATIENT_SEX = eINSTANCE.getPatientSex();

		/**
		 * The meta object literal for the '<em><b>True Premise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_SEX__TRUE_PREMISE = eINSTANCE.getPatientSex_TruePremise();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOND__TYPE = eINSTANCE.getBond_Type();

		/**
		 * The meta object literal for the '<em><b>Id Bond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOND__ID_BOND = eINSTANCE.getBond_IdBond();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.OptionImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__ID = eINSTANCE.getOption_Id();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__TEXT = eINSTANCE.getOption_Text();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__WEIGHT = eINSTANCE.getOption_Weight();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__NAME = eINSTANCE.getPrescription_Name();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__FREQUENCY = eINSTANCE.getPrescription_Frequency();

		/**
		 * The meta object literal for the '<em><b>Id Medication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__ID_MEDICATION = eINSTANCE.getPrescription_IdMedication();

		/**
		 * The meta object literal for the '<em><b>Medication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__MEDICATION = eINSTANCE.getPrescription_Medication();

		/**
		 * The meta object literal for the '<em><b>Qtd Prescription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__QTD_PRESCRIPTION = eINSTANCE.getPrescription_QtdPrescription();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__PRESENTATION = eINSTANCE.getPrescription_Presentation();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__ACCESS = eINSTANCE.getPrescription_Access();

		/**
		 * The meta object literal for the '<em><b>Qtd Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__QTD_DURATION = eINSTANCE.getPrescription_QtdDuration();

		/**
		 * The meta object literal for the '<em><b>Unit Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__UNIT_DURATION = eINSTANCE.getPrescription_UnitDuration();

		/**
		 * The meta object literal for the '<em><b>Unit Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__UNIT_FREQUENCY = eINSTANCE.getPrescription_UnitFrequency();

		/**
		 * The meta object literal for the '<em><b>Complement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__COMPLEMENT = eINSTANCE.getPrescription_Complement();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__ORDER = eINSTANCE.getPrescription_Order();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PPaediatricMedicationtImpl <em>PPaediatric Medicationt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PPaediatricMedicationtImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPPaediatricMedicationt()
		 * @generated
		 */
		EClass PPAEDIATRIC_MEDICATIONT = eINSTANCE.getPPaediatricMedicationt();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPAEDIATRIC_MEDICATIONT__ID = eINSTANCE.getPPaediatricMedicationt_Id();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPAEDIATRIC_MEDICATIONT__RESULT = eINSTANCE.getPPaediatricMedicationt_Result();

		/**
		 * The meta object literal for the '<em><b>Prescription Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPAEDIATRIC_MEDICATIONT__PRESCRIPTION_RESULT = eINSTANCE
				.getPPaediatricMedicationt_PrescriptionResult();

		/**
		 * The meta object literal for the '<em><b>Paediatric Medication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPAEDIATRIC_MEDICATIONT__PAEDIATRIC_MEDICATION = eINSTANCE
				.getPPaediatricMedicationt_PaediatricMedication();

		/**
		 * The meta object literal for the '{@link MetamodelExecution.impl.PaediatricMedicationImpl <em>Paediatric Medication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelExecution.impl.PaediatricMedicationImpl
		 * @see MetamodelExecution.impl.Execution_metamodelPackageImpl#getPaediatricMedication()
		 * @generated
		 */
		EClass PAEDIATRIC_MEDICATION = eINSTANCE.getPaediatricMedication();

	}

} //Execution_metamodelPackage
