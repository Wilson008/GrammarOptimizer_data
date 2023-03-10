/**
 */
package xenia;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Info Entry</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xenia.XeniaPackage#getInfoEntry()
 * @model
 * @generated
 */
public enum InfoEntry implements Enumerator {
	/**
	 * The '<em><b>MOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOD_VALUE
	 * @generated
	 * @ordered
	 */
	MOD(0, "MOD", "mod"),

	/**
	 * The '<em><b>FREQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQ_VALUE
	 * @generated
	 * @ordered
	 */
	FREQ(1, "FREQ", "freq"),

	/**
	 * The '<em><b>PRIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIO_VALUE
	 * @generated
	 * @ordered
	 */
	PRIO(2, "PRIO", "prio");

	/**
	 * The '<em><b>MOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOD
	 * @model literal="mod"
	 * @generated
	 * @ordered
	 */
	public static final int MOD_VALUE = 0;

	/**
	 * The '<em><b>FREQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQ
	 * @model literal="freq"
	 * @generated
	 * @ordered
	 */
	public static final int FREQ_VALUE = 1;

	/**
	 * The '<em><b>PRIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIO
	 * @model literal="prio"
	 * @generated
	 * @ordered
	 */
	public static final int PRIO_VALUE = 2;

	/**
	 * An array of all the '<em><b>Info Entry</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InfoEntry[] VALUES_ARRAY =
		new InfoEntry[] {
			MOD,
			FREQ,
			PRIO,
		};

	/**
	 * A public read-only list of all the '<em><b>Info Entry</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InfoEntry> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Info Entry</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InfoEntry get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InfoEntry result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Info Entry</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InfoEntry getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InfoEntry result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Info Entry</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InfoEntry get(int value) {
		switch (value) {
			case MOD_VALUE: return MOD;
			case FREQ_VALUE: return FREQ;
			case PRIO_VALUE: return PRIO;
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
	private InfoEntry(int value, String name, String literal) {
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
	
} //InfoEntry
