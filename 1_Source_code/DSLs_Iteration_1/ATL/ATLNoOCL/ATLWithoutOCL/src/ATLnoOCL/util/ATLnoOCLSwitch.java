/**
 */
package ATLnoOCL.util;

import ATLnoOCL.ATLnoOCLPackage;
import ATLnoOCL.ActionBlock;
import ATLnoOCL.Binding;
import ATLnoOCL.BindingStat;
import ATLnoOCL.CalledRule;
import ATLnoOCL.ExpressionStat;
import ATLnoOCL.ForEachOutPatternElement;
import ATLnoOCL.ForStat;
import ATLnoOCL.Helper;
import ATLnoOCL.IfStat;
import ATLnoOCL.InPattern;
import ATLnoOCL.InPatternElement;
import ATLnoOCL.LazyMatchedRule;
import ATLnoOCL.Library;
import ATLnoOCL.LibraryRef;
import ATLnoOCL.LocatedElement;
import ATLnoOCL.MatchedRule;
import ATLnoOCL.ModuleElement;
import ATLnoOCL.OCLDummy;
import ATLnoOCL.OutPattern;
import ATLnoOCL.OutPatternElement;
import ATLnoOCL.PatternElement;
import ATLnoOCL.Query;
import ATLnoOCL.Root;
import ATLnoOCL.Rule;
import ATLnoOCL.RuleVariableDeclaration;
import ATLnoOCL.SimpleInPatternElement;
import ATLnoOCL.SimpleOutPatternElement;
import ATLnoOCL.Statement;
import ATLnoOCL.Unit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ATLnoOCL.ATLnoOCLPackage
 * @generated
 */
public class ATLnoOCLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ATLnoOCLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATLnoOCLSwitch() {
		if (modelPackage == null) {
			modelPackage = ATLnoOCLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ATLnoOCLPackage.LOCATED_ELEMENT: {
				LocatedElement locatedElement = (LocatedElement)theEObject;
				T result = caseLocatedElement(locatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseLocatedElement(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseUnit(library);
				if (result == null) result = caseLocatedElement(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = caseUnit(query);
				if (result == null) result = caseLocatedElement(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.MODULE: {
				ATLnoOCL.Module module = (ATLnoOCL.Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseUnit(module);
				if (result == null) result = caseLocatedElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.MODULE_ELEMENT: {
				ModuleElement moduleElement = (ModuleElement)theEObject;
				T result = caseModuleElement(moduleElement);
				if (result == null) result = caseLocatedElement(moduleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.HELPER: {
				Helper helper = (Helper)theEObject;
				T result = caseHelper(helper);
				if (result == null) result = caseModuleElement(helper);
				if (result == null) result = caseLocatedElement(helper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseModuleElement(rule);
				if (result == null) result = caseLocatedElement(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.MATCHED_RULE: {
				MatchedRule matchedRule = (MatchedRule)theEObject;
				T result = caseMatchedRule(matchedRule);
				if (result == null) result = caseRule(matchedRule);
				if (result == null) result = caseModuleElement(matchedRule);
				if (result == null) result = caseLocatedElement(matchedRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.LAZY_MATCHED_RULE: {
				LazyMatchedRule lazyMatchedRule = (LazyMatchedRule)theEObject;
				T result = caseLazyMatchedRule(lazyMatchedRule);
				if (result == null) result = caseMatchedRule(lazyMatchedRule);
				if (result == null) result = caseRule(lazyMatchedRule);
				if (result == null) result = caseModuleElement(lazyMatchedRule);
				if (result == null) result = caseLocatedElement(lazyMatchedRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.CALLED_RULE: {
				CalledRule calledRule = (CalledRule)theEObject;
				T result = caseCalledRule(calledRule);
				if (result == null) result = caseRule(calledRule);
				if (result == null) result = caseModuleElement(calledRule);
				if (result == null) result = caseLocatedElement(calledRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.IN_PATTERN: {
				InPattern inPattern = (InPattern)theEObject;
				T result = caseInPattern(inPattern);
				if (result == null) result = caseLocatedElement(inPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.OUT_PATTERN: {
				OutPattern outPattern = (OutPattern)theEObject;
				T result = caseOutPattern(outPattern);
				if (result == null) result = caseLocatedElement(outPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.PATTERN_ELEMENT: {
				PatternElement patternElement = (PatternElement)theEObject;
				T result = casePatternElement(patternElement);
				if (result == null) result = caseLocatedElement(patternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.IN_PATTERN_ELEMENT: {
				InPatternElement inPatternElement = (InPatternElement)theEObject;
				T result = caseInPatternElement(inPatternElement);
				if (result == null) result = casePatternElement(inPatternElement);
				if (result == null) result = caseLocatedElement(inPatternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.SIMPLE_IN_PATTERN_ELEMENT: {
				SimpleInPatternElement simpleInPatternElement = (SimpleInPatternElement)theEObject;
				T result = caseSimpleInPatternElement(simpleInPatternElement);
				if (result == null) result = caseInPatternElement(simpleInPatternElement);
				if (result == null) result = casePatternElement(simpleInPatternElement);
				if (result == null) result = caseLocatedElement(simpleInPatternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.OUT_PATTERN_ELEMENT: {
				OutPatternElement outPatternElement = (OutPatternElement)theEObject;
				T result = caseOutPatternElement(outPatternElement);
				if (result == null) result = casePatternElement(outPatternElement);
				if (result == null) result = caseLocatedElement(outPatternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.SIMPLE_OUT_PATTERN_ELEMENT: {
				SimpleOutPatternElement simpleOutPatternElement = (SimpleOutPatternElement)theEObject;
				T result = caseSimpleOutPatternElement(simpleOutPatternElement);
				if (result == null) result = caseOutPatternElement(simpleOutPatternElement);
				if (result == null) result = casePatternElement(simpleOutPatternElement);
				if (result == null) result = caseLocatedElement(simpleOutPatternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.FOR_EACH_OUT_PATTERN_ELEMENT: {
				ForEachOutPatternElement forEachOutPatternElement = (ForEachOutPatternElement)theEObject;
				T result = caseForEachOutPatternElement(forEachOutPatternElement);
				if (result == null) result = caseOutPatternElement(forEachOutPatternElement);
				if (result == null) result = casePatternElement(forEachOutPatternElement);
				if (result == null) result = caseLocatedElement(forEachOutPatternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = caseLocatedElement(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.RULE_VARIABLE_DECLARATION: {
				RuleVariableDeclaration ruleVariableDeclaration = (RuleVariableDeclaration)theEObject;
				T result = caseRuleVariableDeclaration(ruleVariableDeclaration);
				if (result == null) result = caseLocatedElement(ruleVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.LIBRARY_REF: {
				LibraryRef libraryRef = (LibraryRef)theEObject;
				T result = caseLibraryRef(libraryRef);
				if (result == null) result = caseLocatedElement(libraryRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.ACTION_BLOCK: {
				ActionBlock actionBlock = (ActionBlock)theEObject;
				T result = caseActionBlock(actionBlock);
				if (result == null) result = caseLocatedElement(actionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseLocatedElement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.EXPRESSION_STAT: {
				ExpressionStat expressionStat = (ExpressionStat)theEObject;
				T result = caseExpressionStat(expressionStat);
				if (result == null) result = caseStatement(expressionStat);
				if (result == null) result = caseLocatedElement(expressionStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.BINDING_STAT: {
				BindingStat bindingStat = (BindingStat)theEObject;
				T result = caseBindingStat(bindingStat);
				if (result == null) result = caseStatement(bindingStat);
				if (result == null) result = caseLocatedElement(bindingStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.IF_STAT: {
				IfStat ifStat = (IfStat)theEObject;
				T result = caseIfStat(ifStat);
				if (result == null) result = caseStatement(ifStat);
				if (result == null) result = caseLocatedElement(ifStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.FOR_STAT: {
				ForStat forStat = (ForStat)theEObject;
				T result = caseForStat(forStat);
				if (result == null) result = caseStatement(forStat);
				if (result == null) result = caseLocatedElement(forStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ATLnoOCLPackage.OCL_DUMMY: {
				OCLDummy oclDummy = (OCLDummy)theEObject;
				T result = caseOCLDummy(oclDummy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedElement(LocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(ATLnoOCL.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleElement(ModuleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelper(Helper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matched Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matched Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchedRule(MatchedRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lazy Matched Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lazy Matched Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLazyMatchedRule(LazyMatchedRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Called Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Called Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalledRule(CalledRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInPattern(InPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutPattern(OutPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternElement(PatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInPatternElement(InPatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple In Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple In Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleInPatternElement(SimpleInPatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutPatternElement(OutPatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Out Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Out Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleOutPatternElement(SimpleOutPatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each Out Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each Out Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEachOutPatternElement(ForEachOutPatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleVariableDeclaration(RuleVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryRef(LibraryRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionBlock(ActionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionStat(ExpressionStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingStat(BindingStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStat(IfStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForStat(ForStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Dummy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Dummy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLDummy(OCLDummy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ATLnoOCLSwitch
