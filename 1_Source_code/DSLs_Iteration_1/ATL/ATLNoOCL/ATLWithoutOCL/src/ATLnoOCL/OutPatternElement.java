/**
 */
package ATLnoOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ATLnoOCL.OutPatternElement#getOutPattern <em>Out Pattern</em>}</li>
 *   <li>{@link ATLnoOCL.OutPatternElement#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link ATLnoOCL.OutPatternElement#getBindings <em>Bindings</em>}</li>
 *   <li>{@link ATLnoOCL.OutPatternElement#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see ATLnoOCL.ATLnoOCLPackage#getOutPatternElement()
 * @model abstract="true"
 * @generated
 */
public interface OutPatternElement extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Out Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.OutPattern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Pattern</em>' container reference.
	 * @see #setOutPattern(OutPattern)
	 * @see ATLnoOCL.ATLnoOCLPackage#getOutPatternElement_OutPattern()
	 * @see ATLnoOCL.OutPattern#getElements
	 * @model opposite="elements" required="true" transient="false" ordered="false"
	 * @generated
	 */
	OutPattern getOutPattern();

	/**
	 * Sets the value of the '{@link ATLnoOCL.OutPatternElement#getOutPattern <em>Out Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Pattern</em>' container reference.
	 * @see #getOutPattern()
	 * @generated
	 */
	void setOutPattern(OutPattern value);

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.InPatternElement#getMapsTo <em>Maps To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' reference.
	 * @see #setSourceElement(InPatternElement)
	 * @see ATLnoOCL.ATLnoOCLPackage#getOutPatternElement_SourceElement()
	 * @see ATLnoOCL.InPatternElement#getMapsTo
	 * @model opposite="mapsTo" ordered="false"
	 * @generated
	 */
	InPatternElement getSourceElement();

	/**
	 * Sets the value of the '{@link ATLnoOCL.OutPatternElement#getSourceElement <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' reference.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(InPatternElement value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link ATLnoOCL.Binding}.
	 * It is bidirectional and its opposite is '{@link ATLnoOCL.Binding#getOutPatternElement <em>Out Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see ATLnoOCL.ATLnoOCLPackage#getOutPatternElement_Bindings()
	 * @see ATLnoOCL.Binding#getOutPatternElement
	 * @model opposite="outPatternElement" containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(OCLDummy)
	 * @see ATLnoOCL.ATLnoOCLPackage#getOutPatternElement_Model()
	 * @model ordered="false"
	 * @generated
	 */
	OCLDummy getModel();

	/**
	 * Sets the value of the '{@link ATLnoOCL.OutPatternElement#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(OCLDummy value);

} // OutPatternElement
