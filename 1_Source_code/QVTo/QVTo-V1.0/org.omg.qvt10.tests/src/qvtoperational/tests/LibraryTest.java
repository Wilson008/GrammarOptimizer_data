/**
 */
package qvtoperational.tests;

import junit.textui.TestRunner;

import qvtoperational.Library;
import qvtoperational.QvtoperationalFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryTest extends ModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LibraryTest.class);
	}

	/**
	 * Constructs a new Library test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Library test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Library getFixture() {
		return (Library)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QvtoperationalFactory.eINSTANCE.createLibrary());
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

} //LibraryTest
