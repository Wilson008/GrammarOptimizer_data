/**
 */
package spectra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantifier Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.QuantifierExpr#getOperator <em>Operator</em>}</li>
 *   <li>{@link spectra.QuantifierExpr#getDomainVar <em>Domain Var</em>}</li>
 *   <li>{@link spectra.QuantifierExpr#getTemporalExpr <em>Temporal Expr</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getQuantifierExpr()
 * @model
 * @generated
 */
public interface QuantifierExpr extends TemporalExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see spectra.SpectraPackage#getQuantifierExpr_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link spectra.QuantifierExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Domain Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Var</em>' containment reference.
	 * @see #setDomainVar(DomainVarDecl)
	 * @see spectra.SpectraPackage#getQuantifierExpr_DomainVar()
	 * @model containment="true"
	 * @generated
	 */
	DomainVarDecl getDomainVar();

	/**
	 * Sets the value of the '{@link spectra.QuantifierExpr#getDomainVar <em>Domain Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Var</em>' containment reference.
	 * @see #getDomainVar()
	 * @generated
	 */
	void setDomainVar(DomainVarDecl value);

	/**
	 * Returns the value of the '<em><b>Temporal Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Expr</em>' containment reference.
	 * @see #setTemporalExpr(TemporalExpression)
	 * @see spectra.SpectraPackage#getQuantifierExpr_TemporalExpr()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExpression getTemporalExpr();

	/**
	 * Sets the value of the '{@link spectra.QuantifierExpr#getTemporalExpr <em>Temporal Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Expr</em>' containment reference.
	 * @see #getTemporalExpr()
	 * @generated
	 */
	void setTemporalExpr(TemporalExpression value);

} // QuantifierExpr
