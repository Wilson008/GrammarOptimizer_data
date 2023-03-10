/**
 */
package spectra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weight Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.WeightDef#getName <em>Name</em>}</li>
 *   <li>{@link spectra.WeightDef#getNegative <em>Negative</em>}</li>
 *   <li>{@link spectra.WeightDef#getValue <em>Value</em>}</li>
 *   <li>{@link spectra.WeightDef#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getWeightDef()
 * @model
 * @generated
 */
public interface WeightDef extends Decl {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see spectra.SpectraPackage#getWeightDef_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link spectra.WeightDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative</em>' attribute.
	 * @see #setNegative(String)
	 * @see spectra.SpectraPackage#getWeightDef_Negative()
	 * @model
	 * @generated
	 */
	String getNegative();

	/**
	 * Sets the value of the '{@link spectra.WeightDef#getNegative <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative</em>' attribute.
	 * @see #getNegative()
	 * @generated
	 */
	void setNegative(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see spectra.SpectraPackage#getWeightDef_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link spectra.WeightDef#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(TemporalExpression)
	 * @see spectra.SpectraPackage#getWeightDef_Definition()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExpression getDefinition();

	/**
	 * Sets the value of the '{@link spectra.WeightDef#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(TemporalExpression value);

} // WeightDef
