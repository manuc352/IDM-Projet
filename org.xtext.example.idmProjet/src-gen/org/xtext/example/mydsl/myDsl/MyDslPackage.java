/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.myDsl;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ValueImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getValue()
   * @generated
   */
  int VALUE = 3;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.JsonImpl <em>Json</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.JsonImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getJson()
   * @generated
   */
  int JSON = 0;

  /**
   * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON__PAIRS = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON__OPERATIONS = VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Json</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.JsonOperationImpl <em>Json Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.JsonOperationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getJsonOperation()
   * @generated
   */
  int JSON_OPERATION = 1;

  /**
   * The feature id for the '<em><b>File ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OPERATION__FILE_ID = 0;

  /**
   * The number of structural features of the '<em>Json Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OPERATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PairImpl <em>Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PairImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPair()
   * @generated
   */
  int PAIR = 2;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.JStringImpl <em>JString</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.JStringImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getJString()
   * @generated
   */
  int JSTRING = 4;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSTRING__VAL = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>JString</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSTRING_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.JArrayImpl <em>JArray</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.JArrayImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getJArray()
   * @generated
   */
  int JARRAY = 5;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JARRAY__VALUES = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>JArray</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JARRAY_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.JBooleanImpl <em>JBoolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.JBooleanImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getJBoolean()
   * @generated
   */
  int JBOOLEAN = 6;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JBOOLEAN__VAL = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>JBoolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JBOOLEAN_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NullImpl <em>Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NullImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNull()
   * @generated
   */
  int NULL = 7;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL__VAL = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.JNumberImpl <em>JNumber</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.JNumberImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getJNumber()
   * @generated
   */
  int JNUMBER = 8;

  /**
   * The number of structural features of the '<em>JNumber</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JNUMBER_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FichierImpl <em>Fichier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FichierImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFichier()
   * @generated
   */
  int FICHIER = 9;

  /**
   * The feature id for the '<em><b>File ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FICHIER__FILE_ID = JSON_OPERATION__FILE_ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FICHIER__NAME = JSON_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fichier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FICHIER_FEATURE_COUNT = JSON_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AddImpl <em>Add</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AddImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAdd()
   * @generated
   */
  int ADD = 10;

  /**
   * The feature id for the '<em><b>File ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD__FILE_ID = JSON_OPERATION__FILE_ID;

  /**
   * The feature id for the '<em><b>Pair</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD__PAIR = JSON_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Add</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_FEATURE_COUNT = JSON_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ClearImpl <em>Clear</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ClearImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getClear()
   * @generated
   */
  int CLEAR = 11;

  /**
   * The feature id for the '<em><b>File ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR__FILE_ID = JSON_OPERATION__FILE_ID;

  /**
   * The number of structural features of the '<em>Clear</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_FEATURE_COUNT = JSON_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SearchImpl <em>Search</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SearchImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSearch()
   * @generated
   */
  int SEARCH = 12;

  /**
   * The feature id for the '<em><b>File ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH__FILE_ID = JSON_OPERATION__FILE_ID;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH__KEY = JSON_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Search</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_FEATURE_COUNT = JSON_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeleteImpl <em>Delete</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeleteImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDelete()
   * @generated
   */
  int DELETE = 13;

  /**
   * The feature id for the '<em><b>File ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE__FILE_ID = JSON_OPERATION__FILE_ID;

  /**
   * The feature id for the '<em><b>Pair</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE__PAIR = JSON_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Delete</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_FEATURE_COUNT = JSON_OPERATION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Json <em>Json</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json</em>'.
   * @see org.xtext.example.mydsl.myDsl.Json
   * @generated
   */
  EClass getJson();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Json#getPairs <em>Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pairs</em>'.
   * @see org.xtext.example.mydsl.myDsl.Json#getPairs()
   * @see #getJson()
   * @generated
   */
  EReference getJson_Pairs();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Json#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see org.xtext.example.mydsl.myDsl.Json#getOperations()
   * @see #getJson()
   * @generated
   */
  EReference getJson_Operations();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.JsonOperation <em>Json Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Operation</em>'.
   * @see org.xtext.example.mydsl.myDsl.JsonOperation
   * @generated
   */
  EClass getJsonOperation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.JsonOperation#getFileID <em>File ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File ID</em>'.
   * @see org.xtext.example.mydsl.myDsl.JsonOperation#getFileID()
   * @see #getJsonOperation()
   * @generated
   */
  EAttribute getJsonOperation_FileID();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Pair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pair</em>'.
   * @see org.xtext.example.mydsl.myDsl.Pair
   * @generated
   */
  EClass getPair();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Pair#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.xtext.example.mydsl.myDsl.Pair#getKey()
   * @see #getPair()
   * @generated
   */
  EAttribute getPair_Key();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Pair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.Pair#getValue()
   * @see #getPair()
   * @generated
   */
  EAttribute getPair_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.JString <em>JString</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JString</em>'.
   * @see org.xtext.example.mydsl.myDsl.JString
   * @generated
   */
  EClass getJString();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.JString#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.xtext.example.mydsl.myDsl.JString#getVal()
   * @see #getJString()
   * @generated
   */
  EAttribute getJString_Val();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.JArray <em>JArray</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JArray</em>'.
   * @see org.xtext.example.mydsl.myDsl.JArray
   * @generated
   */
  EClass getJArray();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.JArray#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.xtext.example.mydsl.myDsl.JArray#getValues()
   * @see #getJArray()
   * @generated
   */
  EReference getJArray_Values();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.JBoolean <em>JBoolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JBoolean</em>'.
   * @see org.xtext.example.mydsl.myDsl.JBoolean
   * @generated
   */
  EClass getJBoolean();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.JBoolean#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.xtext.example.mydsl.myDsl.JBoolean#getVal()
   * @see #getJBoolean()
   * @generated
   */
  EAttribute getJBoolean_Val();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null</em>'.
   * @see org.xtext.example.mydsl.myDsl.Null
   * @generated
   */
  EClass getNull();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Null#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.xtext.example.mydsl.myDsl.Null#getVal()
   * @see #getNull()
   * @generated
   */
  EAttribute getNull_Val();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.JNumber <em>JNumber</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JNumber</em>'.
   * @see org.xtext.example.mydsl.myDsl.JNumber
   * @generated
   */
  EClass getJNumber();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Fichier <em>Fichier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fichier</em>'.
   * @see org.xtext.example.mydsl.myDsl.Fichier
   * @generated
   */
  EClass getFichier();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Fichier#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Fichier#getName()
   * @see #getFichier()
   * @generated
   */
  EAttribute getFichier_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Add <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add</em>'.
   * @see org.xtext.example.mydsl.myDsl.Add
   * @generated
   */
  EClass getAdd();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Add#getPair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pair</em>'.
   * @see org.xtext.example.mydsl.myDsl.Add#getPair()
   * @see #getAdd()
   * @generated
   */
  EReference getAdd_Pair();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Clear <em>Clear</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clear</em>'.
   * @see org.xtext.example.mydsl.myDsl.Clear
   * @generated
   */
  EClass getClear();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Search <em>Search</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Search</em>'.
   * @see org.xtext.example.mydsl.myDsl.Search
   * @generated
   */
  EClass getSearch();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Search#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.xtext.example.mydsl.myDsl.Search#getKey()
   * @see #getSearch()
   * @generated
   */
  EAttribute getSearch_Key();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Delete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete</em>'.
   * @see org.xtext.example.mydsl.myDsl.Delete
   * @generated
   */
  EClass getDelete();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Delete#getPair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pair</em>'.
   * @see org.xtext.example.mydsl.myDsl.Delete#getPair()
   * @see #getDelete()
   * @generated
   */
  EReference getDelete_Pair();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.JsonImpl <em>Json</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.JsonImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getJson()
     * @generated
     */
    EClass JSON = eINSTANCE.getJson();

    /**
     * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON__PAIRS = eINSTANCE.getJson_Pairs();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON__OPERATIONS = eINSTANCE.getJson_Operations();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.JsonOperationImpl <em>Json Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.JsonOperationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getJsonOperation()
     * @generated
     */
    EClass JSON_OPERATION = eINSTANCE.getJsonOperation();

    /**
     * The meta object literal for the '<em><b>File ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_OPERATION__FILE_ID = eINSTANCE.getJsonOperation_FileID();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PairImpl <em>Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PairImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPair()
     * @generated
     */
    EClass PAIR = eINSTANCE.getPair();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAIR__KEY = eINSTANCE.getPair_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAIR__VALUE = eINSTANCE.getPair_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ValueImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.JStringImpl <em>JString</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.JStringImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getJString()
     * @generated
     */
    EClass JSTRING = eINSTANCE.getJString();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSTRING__VAL = eINSTANCE.getJString_Val();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.JArrayImpl <em>JArray</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.JArrayImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getJArray()
     * @generated
     */
    EClass JARRAY = eINSTANCE.getJArray();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JARRAY__VALUES = eINSTANCE.getJArray_Values();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.JBooleanImpl <em>JBoolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.JBooleanImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getJBoolean()
     * @generated
     */
    EClass JBOOLEAN = eINSTANCE.getJBoolean();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JBOOLEAN__VAL = eINSTANCE.getJBoolean_Val();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NullImpl <em>Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NullImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNull()
     * @generated
     */
    EClass NULL = eINSTANCE.getNull();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NULL__VAL = eINSTANCE.getNull_Val();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.JNumberImpl <em>JNumber</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.JNumberImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getJNumber()
     * @generated
     */
    EClass JNUMBER = eINSTANCE.getJNumber();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FichierImpl <em>Fichier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FichierImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFichier()
     * @generated
     */
    EClass FICHIER = eINSTANCE.getFichier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FICHIER__NAME = eINSTANCE.getFichier_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AddImpl <em>Add</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AddImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAdd()
     * @generated
     */
    EClass ADD = eINSTANCE.getAdd();

    /**
     * The meta object literal for the '<em><b>Pair</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD__PAIR = eINSTANCE.getAdd_Pair();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ClearImpl <em>Clear</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ClearImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getClear()
     * @generated
     */
    EClass CLEAR = eINSTANCE.getClear();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SearchImpl <em>Search</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SearchImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSearch()
     * @generated
     */
    EClass SEARCH = eINSTANCE.getSearch();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCH__KEY = eINSTANCE.getSearch_Key();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeleteImpl <em>Delete</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeleteImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDelete()
     * @generated
     */
    EClass DELETE = eINSTANCE.getDelete();

    /**
     * The meta object literal for the '<em><b>Pair</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE__PAIR = eINSTANCE.getDelete_Pair();

  }

} //MyDslPackage
