/**
 */
package EssentialOCL.tests;

import EssentialOCL.EssentialOCLFactory;
import EssentialOCL.PropertyCallExp;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property Call Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyCallExpTest extends NavigationCallExpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertyCallExpTest.class);
	}

	/**
	 * Constructs a new Property Call Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCallExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Property Call Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PropertyCallExp getFixture() {
		return (PropertyCallExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EssentialOCLFactory.eINSTANCE.createPropertyCallExp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PropertyCallExpTest
