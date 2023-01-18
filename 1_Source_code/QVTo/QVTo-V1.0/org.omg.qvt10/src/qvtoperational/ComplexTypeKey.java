/**
 */
package qvtoperational;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Complex Type Key</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see qvtoperational.QvtoperationalPackage#getComplexTypeKey()
 * @model
 * @generated
 */
public enum ComplexTypeKey implements Enumerator {
	/**
	 * The '<em><b>Collection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION(0, "Collection", "Collection"),

	/**
	 * The '<em><b>Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_VALUE
	 * @generated
	 * @ordered
	 */
	SET(1, "Set", "Set"),

	/**
	 * The '<em><b>Ordered Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED_SET_VALUE
	 * @generated
	 * @ordered
	 */
	ORDERED_SET(2, "OrderedSet", "OrderedSet"),

	/**
	 * The '<em><b>Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENCE(3, "Sequence", "Sequence"),

	/**
	 * The '<em><b>Bag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAG_VALUE
	 * @generated
	 * @ordered
	 */
	BAG(4, "Bag", "Bag"),

	/**
	 * The '<em><b>List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(5, "List", "List"),

	/**
	 * The '<em><b>Dict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DICT_VALUE
	 * @generated
	 * @ordered
	 */
	DICT(6, "Dict", "Dict"),

	/**
	 * The '<em><b>Tuple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUPLE_VALUE
	 * @generated
	 * @ordered
	 */
	TUPLE(7, "Tuple", "Tuple");

	/**
	 * The '<em><b>Collection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION
	 * @model name="Collection"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_VALUE = 0;

	/**
	 * The '<em><b>Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET
	 * @model name="Set"
	 * @generated
	 * @ordered
	 */
	public static final int SET_VALUE = 1;

	/**
	 * The '<em><b>Ordered Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED_SET
	 * @model name="OrderedSet"
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_SET_VALUE = 2;

	/**
	 * The '<em><b>Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE
	 * @model name="Sequence"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_VALUE = 3;

	/**
	 * The '<em><b>Bag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAG
	 * @model name="Bag"
	 * @generated
	 * @ordered
	 */
	public static final int BAG_VALUE = 4;

	/**
	 * The '<em><b>List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST
	 * @model name="List"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 5;

	/**
	 * The '<em><b>Dict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DICT
	 * @model name="Dict"
	 * @generated
	 * @ordered
	 */
	public static final int DICT_VALUE = 6;

	/**
	 * The '<em><b>Tuple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUPLE
	 * @model name="Tuple"
	 * @generated
	 * @ordered
	 */
	public static final int TUPLE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Complex Type Key</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComplexTypeKey[] VALUES_ARRAY =
		new ComplexTypeKey[] {
			COLLECTION,
			SET,
			ORDERED_SET,
			SEQUENCE,
			BAG,
			LIST,
			DICT,
			TUPLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Complex Type Key</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComplexTypeKey> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Complex Type Key</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComplexTypeKey get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComplexTypeKey result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Complex Type Key</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComplexTypeKey getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComplexTypeKey result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Complex Type Key</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComplexTypeKey get(int value) {
		switch (value) {
			case COLLECTION_VALUE: return COLLECTION;
			case SET_VALUE: return SET;
			case ORDERED_SET_VALUE: return ORDERED_SET;
			case SEQUENCE_VALUE: return SEQUENCE;
			case BAG_VALUE: return BAG;
			case LIST_VALUE: return LIST;
			case DICT_VALUE: return DICT;
			case TUPLE_VALUE: return TUPLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ComplexTypeKey(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ComplexTypeKey
