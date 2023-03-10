/**
 */
package spectra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Reg Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.UnaryRegExp#isKleened <em>Kleened</em>}</li>
 *   <li>{@link spectra.UnaryRegExp#isQuestionMark <em>Question Mark</em>}</li>
 *   <li>{@link spectra.UnaryRegExp#isPlus <em>Plus</em>}</li>
 *   <li>{@link spectra.UnaryRegExp#isHaveExactRepetition <em>Have Exact Repetition</em>}</li>
 *   <li>{@link spectra.UnaryRegExp#getExactRepetition <em>Exact Repetition</em>}</li>
 *   <li>{@link spectra.UnaryRegExp#isHaveAtLeast <em>Have At Least</em>}</li>
 *   <li>{@link spectra.UnaryRegExp#getAtLeast <em>At Least</em>}</li>
 *   <li>{@link spectra.UnaryRegExp#isHaveRange <em>Have Range</em>}</li>
 *   <li>{@link spectra.UnaryRegExp#getFrom <em>From</em>}</li>
 *   <li>{@link spectra.UnaryRegExp#getFromDefine <em>From Define</em>}</li>
 *   <li>{@link spectra.UnaryRegExp#getTo <em>To</em>}</li>
 *   <li>{@link spectra.UnaryRegExp#getToDefine <em>To Define</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getUnaryRegExp()
 * @model
 * @generated
 */
public interface UnaryRegExp extends RegExp {
	/**
	 * Returns the value of the '<em><b>Kleened</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kleened</em>' attribute.
	 * @see #setKleened(boolean)
	 * @see spectra.SpectraPackage#getUnaryRegExp_Kleened()
	 * @model
	 * @generated
	 */
	boolean isKleened();

	/**
	 * Sets the value of the '{@link spectra.UnaryRegExp#isKleened <em>Kleened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kleened</em>' attribute.
	 * @see #isKleened()
	 * @generated
	 */
	void setKleened(boolean value);

	/**
	 * Returns the value of the '<em><b>Question Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Mark</em>' attribute.
	 * @see #setQuestionMark(boolean)
	 * @see spectra.SpectraPackage#getUnaryRegExp_QuestionMark()
	 * @model
	 * @generated
	 */
	boolean isQuestionMark();

	/**
	 * Sets the value of the '{@link spectra.UnaryRegExp#isQuestionMark <em>Question Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Mark</em>' attribute.
	 * @see #isQuestionMark()
	 * @generated
	 */
	void setQuestionMark(boolean value);

	/**
	 * Returns the value of the '<em><b>Plus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plus</em>' attribute.
	 * @see #setPlus(boolean)
	 * @see spectra.SpectraPackage#getUnaryRegExp_Plus()
	 * @model
	 * @generated
	 */
	boolean isPlus();

	/**
	 * Sets the value of the '{@link spectra.UnaryRegExp#isPlus <em>Plus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plus</em>' attribute.
	 * @see #isPlus()
	 * @generated
	 */
	void setPlus(boolean value);

	/**
	 * Returns the value of the '<em><b>Have Exact Repetition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Have Exact Repetition</em>' attribute.
	 * @see #setHaveExactRepetition(boolean)
	 * @see spectra.SpectraPackage#getUnaryRegExp_HaveExactRepetition()
	 * @model
	 * @generated
	 */
	boolean isHaveExactRepetition();

	/**
	 * Sets the value of the '{@link spectra.UnaryRegExp#isHaveExactRepetition <em>Have Exact Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Have Exact Repetition</em>' attribute.
	 * @see #isHaveExactRepetition()
	 * @generated
	 */
	void setHaveExactRepetition(boolean value);

	/**
	 * Returns the value of the '<em><b>Exact Repetition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exact Repetition</em>' attribute.
	 * @see #setExactRepetition(int)
	 * @see spectra.SpectraPackage#getUnaryRegExp_ExactRepetition()
	 * @model
	 * @generated
	 */
	int getExactRepetition();

	/**
	 * Sets the value of the '{@link spectra.UnaryRegExp#getExactRepetition <em>Exact Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exact Repetition</em>' attribute.
	 * @see #getExactRepetition()
	 * @generated
	 */
	void setExactRepetition(int value);

	/**
	 * Returns the value of the '<em><b>Have At Least</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Have At Least</em>' attribute.
	 * @see #setHaveAtLeast(boolean)
	 * @see spectra.SpectraPackage#getUnaryRegExp_HaveAtLeast()
	 * @model
	 * @generated
	 */
	boolean isHaveAtLeast();

	/**
	 * Sets the value of the '{@link spectra.UnaryRegExp#isHaveAtLeast <em>Have At Least</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Have At Least</em>' attribute.
	 * @see #isHaveAtLeast()
	 * @generated
	 */
	void setHaveAtLeast(boolean value);

	/**
	 * Returns the value of the '<em><b>At Least</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At Least</em>' attribute.
	 * @see #setAtLeast(int)
	 * @see spectra.SpectraPackage#getUnaryRegExp_AtLeast()
	 * @model
	 * @generated
	 */
	int getAtLeast();

	/**
	 * Sets the value of the '{@link spectra.UnaryRegExp#getAtLeast <em>At Least</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At Least</em>' attribute.
	 * @see #getAtLeast()
	 * @generated
	 */
	void setAtLeast(int value);

	/**
	 * Returns the value of the '<em><b>Have Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Have Range</em>' attribute.
	 * @see #setHaveRange(boolean)
	 * @see spectra.SpectraPackage#getUnaryRegExp_HaveRange()
	 * @model
	 * @generated
	 */
	boolean isHaveRange();

	/**
	 * Sets the value of the '{@link spectra.UnaryRegExp#isHaveRange <em>Have Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Have Range</em>' attribute.
	 * @see #isHaveRange()
	 * @generated
	 */
	void setHaveRange(boolean value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(int)
	 * @see spectra.SpectraPackage#getUnaryRegExp_From()
	 * @model
	 * @generated
	 */
	int getFrom();

	/**
	 * Sets the value of the '{@link spectra.UnaryRegExp#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(int value);

	/**
	 * Returns the value of the '<em><b>From Define</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Define</em>' reference.
	 * @see #setFromDefine(DefineDecl)
	 * @see spectra.SpectraPackage#getUnaryRegExp_FromDefine()
	 * @model
	 * @generated
	 */
	DefineDecl getFromDefine();

	/**
	 * Sets the value of the '{@link spectra.UnaryRegExp#getFromDefine <em>From Define</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Define</em>' reference.
	 * @see #getFromDefine()
	 * @generated
	 */
	void setFromDefine(DefineDecl value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(int)
	 * @see spectra.SpectraPackage#getUnaryRegExp_To()
	 * @model
	 * @generated
	 */
	int getTo();

	/**
	 * Sets the value of the '{@link spectra.UnaryRegExp#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(int value);

	/**
	 * Returns the value of the '<em><b>To Define</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Define</em>' reference.
	 * @see #setToDefine(DefineDecl)
	 * @see spectra.SpectraPackage#getUnaryRegExp_ToDefine()
	 * @model
	 * @generated
	 */
	DefineDecl getToDefine();

	/**
	 * Sets the value of the '{@link spectra.UnaryRegExp#getToDefine <em>To Define</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Define</em>' reference.
	 * @see #getToDefine()
	 * @generated
	 */
	void setToDefine(DefineDecl value);

} // UnaryRegExp
