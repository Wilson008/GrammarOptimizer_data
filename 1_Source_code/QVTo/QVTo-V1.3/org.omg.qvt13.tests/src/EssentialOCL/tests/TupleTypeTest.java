/**
 */
package EssentialOCL.tests;

import EMOF.tests.ClassTest;

import EssentialOCL.EssentialOCLFactory;
import EssentialOCL.TupleType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tuple Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TupleTypeTest extends ClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TupleTypeTest.class);
	}

	/**
	 * Constructs a new Tuple Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tuple Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TupleType getFixture() {
		return (TupleType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EssentialOCLFactory.eINSTANCE.createTupleType());
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

} //TupleTypeTest
