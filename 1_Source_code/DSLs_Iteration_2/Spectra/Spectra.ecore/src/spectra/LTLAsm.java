/**
 */
package spectra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LTL Asm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.LTLAsm#getName <em>Name</em>}</li>
 *   <li>{@link spectra.LTLAsm#getParams <em>Params</em>}</li>
 *   <li>{@link spectra.LTLAsm#getSafety <em>Safety</em>}</li>
 *   <li>{@link spectra.LTLAsm#getStateInv <em>State Inv</em>}</li>
 *   <li>{@link spectra.LTLAsm#getJustice <em>Justice</em>}</li>
 *   <li>{@link spectra.LTLAsm#getTemporalExpr <em>Temporal Expr</em>}</li>
 *   <li>{@link spectra.LTLAsm#getTrig <em>Trig</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getLTLAsm()
 * @model
 * @generated
 */
public interface LTLAsm extends Decl {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see spectra.SpectraPackage#getLTLAsm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link spectra.LTLAsm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference.
	 * @see #setParams(TypedParamList)
	 * @see spectra.SpectraPackage#getLTLAsm_Params()
	 * @model containment="true"
	 * @generated
	 */
	TypedParamList getParams();

	/**
	 * Sets the value of the '{@link spectra.LTLAsm#getParams <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' containment reference.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(TypedParamList value);

	/**
	 * Returns the value of the '<em><b>Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety</em>' attribute.
	 * @see #setSafety(String)
	 * @see spectra.SpectraPackage#getLTLAsm_Safety()
	 * @model
	 * @generated
	 */
	String getSafety();

	/**
	 * Sets the value of the '{@link spectra.LTLAsm#getSafety <em>Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety</em>' attribute.
	 * @see #getSafety()
	 * @generated
	 */
	void setSafety(String value);

	/**
	 * Returns the value of the '<em><b>State Inv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Inv</em>' attribute.
	 * @see #setStateInv(String)
	 * @see spectra.SpectraPackage#getLTLAsm_StateInv()
	 * @model
	 * @generated
	 */
	String getStateInv();

	/**
	 * Sets the value of the '{@link spectra.LTLAsm#getStateInv <em>State Inv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Inv</em>' attribute.
	 * @see #getStateInv()
	 * @generated
	 */
	void setStateInv(String value);

	/**
	 * Returns the value of the '<em><b>Justice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justice</em>' attribute.
	 * @see #setJustice(String)
	 * @see spectra.SpectraPackage#getLTLAsm_Justice()
	 * @model
	 * @generated
	 */
	String getJustice();

	/**
	 * Sets the value of the '{@link spectra.LTLAsm#getJustice <em>Justice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justice</em>' attribute.
	 * @see #getJustice()
	 * @generated
	 */
	void setJustice(String value);

	/**
	 * Returns the value of the '<em><b>Temporal Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Expr</em>' containment reference.
	 * @see #setTemporalExpr(TemporalExpression)
	 * @see spectra.SpectraPackage#getLTLAsm_TemporalExpr()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExpression getTemporalExpr();

	/**
	 * Sets the value of the '{@link spectra.LTLAsm#getTemporalExpr <em>Temporal Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Expr</em>' containment reference.
	 * @see #getTemporalExpr()
	 * @generated
	 */
	void setTemporalExpr(TemporalExpression value);

	/**
	 * Returns the value of the '<em><b>Trig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trig</em>' containment reference.
	 * @see #setTrig(Trigger)
	 * @see spectra.SpectraPackage#getLTLAsm_Trig()
	 * @model containment="true"
	 * @generated
	 */
	Trigger getTrig();

	/**
	 * Sets the value of the '{@link spectra.LTLAsm#getTrig <em>Trig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trig</em>' containment reference.
	 * @see #getTrig()
	 * @generated
	 */
	void setTrig(Trigger value);

} // LTLAsm
