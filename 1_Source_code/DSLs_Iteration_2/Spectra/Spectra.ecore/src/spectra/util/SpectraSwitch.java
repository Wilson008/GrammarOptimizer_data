/**
 */
package spectra.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import spectra.*;

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
 * @see spectra.SpectraPackage
 * @generated
 */
public class SpectraSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpectraPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpectraSwitch() {
		if (modelPackage == null) {
			modelPackage = SpectraPackage.eINSTANCE;
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
			case SpectraPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.DECL: {
				Decl decl = (Decl)theEObject;
				T result = caseDecl(decl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.WEIGHT_DEF: {
				WeightDef weightDef = (WeightDef)theEObject;
				T result = caseWeightDef(weightDef);
				if (result == null) result = caseDecl(weightDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.VAR: {
				Var var = (Var)theEObject;
				T result = caseVar(var);
				if (result == null) result = caseDecl(var);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TYPE_DEF: {
				TypeDef typeDef = (TypeDef)theEObject;
				T result = caseTypeDef(typeDef);
				if (result == null) result = caseDecl(typeDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.VAR_DECL: {
				VarDecl varDecl = (VarDecl)theEObject;
				T result = caseVarDecl(varDecl);
				if (result == null) result = caseReferrable(varDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.REFERRABLE: {
				Referrable referrable = (Referrable)theEObject;
				T result = caseReferrable(referrable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TYPE_CONSTANT: {
				TypeConstant typeConstant = (TypeConstant)theEObject;
				T result = caseTypeConstant(typeConstant);
				if (result == null) result = caseReferrable(typeConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.DEFINE: {
				Define define = (Define)theEObject;
				T result = caseDefine(define);
				if (result == null) result = caseDecl(define);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.DEFINE_DECL: {
				DefineDecl defineDecl = (DefineDecl)theEObject;
				T result = caseDefineDecl(defineDecl);
				if (result == null) result = caseReferrable(defineDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.DEFINE_ARRAY: {
				DefineArray defineArray = (DefineArray)theEObject;
				T result = caseDefineArray(defineArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.DEFINE_REG_EXP: {
				DefineRegExp defineRegExp = (DefineRegExp)theEObject;
				T result = caseDefineRegExp(defineRegExp);
				if (result == null) result = caseDecl(defineRegExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.DEFINE_REG_EXP_DECL: {
				DefineRegExpDecl defineRegExpDecl = (DefineRegExpDecl)theEObject;
				T result = caseDefineRegExpDecl(defineRegExpDecl);
				if (result == null) result = caseReferrable(defineRegExpDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.PATTERN_PARAM_LIST: {
				PatternParamList patternParamList = (PatternParamList)theEObject;
				T result = casePatternParamList(patternParamList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.PATTERN_PARAM: {
				PatternParam patternParam = (PatternParam)theEObject;
				T result = casePatternParam(patternParam);
				if (result == null) result = caseReferrable(patternParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TYPED_PARAM_LIST: {
				TypedParamList typedParamList = (TypedParamList)theEObject;
				T result = caseTypedParamList(typedParamList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TYPED_PARAM: {
				TypedParam typedParam = (TypedParam)theEObject;
				T result = caseTypedParam(typedParam);
				if (result == null) result = caseReferrable(typedParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.COUNTER: {
				Counter counter = (Counter)theEObject;
				T result = caseCounter(counter);
				if (result == null) result = caseDecl(counter);
				if (result == null) result = caseReferrable(counter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.MONITOR: {
				Monitor monitor = (Monitor)theEObject;
				T result = caseMonitor(monitor);
				if (result == null) result = caseDecl(monitor);
				if (result == null) result = caseReferrable(monitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = caseDecl(pattern);
				if (result == null) result = casePredicateOrPatternReferrable(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.PREDICATE: {
				Predicate predicate = (Predicate)theEObject;
				T result = casePredicate(predicate);
				if (result == null) result = caseDecl(predicate);
				if (result == null) result = casePredicateOrPatternReferrable(predicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.VAR_TYPE: {
				VarType varType = (VarType)theEObject;
				T result = caseVarType(varType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.LTL_GAR: {
				LTLGar ltlGar = (LTLGar)theEObject;
				T result = caseLTLGar(ltlGar);
				if (result == null) result = caseDecl(ltlGar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.LTL_ASM: {
				LTLAsm ltlAsm = (LTLAsm)theEObject;
				T result = caseLTLAsm(ltlAsm);
				if (result == null) result = caseDecl(ltlAsm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.EX_GAR: {
				EXGar exGar = (EXGar)theEObject;
				T result = caseEXGar(exGar);
				if (result == null) result = caseDecl(exGar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TEMPORAL_EXPRESSION: {
				TemporalExpression temporalExpression = (TemporalExpression)theEObject;
				T result = caseTemporalExpression(temporalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.PREDICATE_OR_PATTERN_REFERRABLE: {
				PredicateOrPatternReferrable predicateOrPatternReferrable = (PredicateOrPatternReferrable)theEObject;
				T result = casePredicateOrPatternReferrable(predicateOrPatternReferrable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.SUBRANGE: {
				Subrange subrange = (Subrange)theEObject;
				T result = caseSubrange(subrange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.REG_EXP: {
				RegExp regExp = (RegExp)theEObject;
				T result = caseRegExp(regExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.BOOLEAN_TERM: {
				BooleanTerm booleanTerm = (BooleanTerm)theEObject;
				T result = caseBooleanTerm(booleanTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.VALUE_IN_RANGE: {
				ValueInRange valueInRange = (ValueInRange)theEObject;
				T result = caseValueInRange(valueInRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.DOMAIN_VAR_DECL: {
				DomainVarDecl domainVarDecl = (DomainVarDecl)theEObject;
				T result = caseDomainVarDecl(domainVarDecl);
				if (result == null) result = caseReferrable(domainVarDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.SIZE_DEFINE_DECL: {
				SizeDefineDecl sizeDefineDecl = (SizeDefineDecl)theEObject;
				T result = caseSizeDefineDecl(sizeDefineDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TEMPORAL_IN_EXPR: {
				TemporalInExpr temporalInExpr = (TemporalInExpr)theEObject;
				T result = caseTemporalInExpr(temporalInExpr);
				if (result == null) result = caseTemporalExpression(temporalInExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TEMPORAL_IMP_EXPR: {
				TemporalImpExpr temporalImpExpr = (TemporalImpExpr)theEObject;
				T result = caseTemporalImpExpr(temporalImpExpr);
				if (result == null) result = caseTemporalExpression(temporalImpExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TEMPORAL_IFF_EXPR: {
				TemporalIffExpr temporalIffExpr = (TemporalIffExpr)theEObject;
				T result = caseTemporalIffExpr(temporalIffExpr);
				if (result == null) result = caseTemporalExpression(temporalIffExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TEMPORAL_OR_EXPR: {
				TemporalOrExpr temporalOrExpr = (TemporalOrExpr)theEObject;
				T result = caseTemporalOrExpr(temporalOrExpr);
				if (result == null) result = caseTemporalExpression(temporalOrExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TEMPORAL_AND_EXPR: {
				TemporalAndExpr temporalAndExpr = (TemporalAndExpr)theEObject;
				T result = caseTemporalAndExpr(temporalAndExpr);
				if (result == null) result = caseTemporalExpression(temporalAndExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TEMPORAL_RELATIONAL_EXPR: {
				TemporalRelationalExpr temporalRelationalExpr = (TemporalRelationalExpr)theEObject;
				T result = caseTemporalRelationalExpr(temporalRelationalExpr);
				if (result == null) result = caseTemporalExpression(temporalRelationalExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TEMPORAL_REMAINDER_EXPR: {
				TemporalRemainderExpr temporalRemainderExpr = (TemporalRemainderExpr)theEObject;
				T result = caseTemporalRemainderExpr(temporalRemainderExpr);
				if (result == null) result = caseTemporalExpression(temporalRemainderExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TEMPORAL_ADDITIVE_EXPR: {
				TemporalAdditiveExpr temporalAdditiveExpr = (TemporalAdditiveExpr)theEObject;
				T result = caseTemporalAdditiveExpr(temporalAdditiveExpr);
				if (result == null) result = caseTemporalExpression(temporalAdditiveExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TEMPORAL_MULTIPLICATIVE_EXPR: {
				TemporalMultiplicativeExpr temporalMultiplicativeExpr = (TemporalMultiplicativeExpr)theEObject;
				T result = caseTemporalMultiplicativeExpr(temporalMultiplicativeExpr);
				if (result == null) result = caseTemporalExpression(temporalMultiplicativeExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TEMPORAL_BINARY_EXPR: {
				TemporalBinaryExpr temporalBinaryExpr = (TemporalBinaryExpr)theEObject;
				T result = caseTemporalBinaryExpr(temporalBinaryExpr);
				if (result == null) result = caseTemporalExpression(temporalBinaryExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TEMPORAL_UNARY_EXPR: {
				TemporalUnaryExpr temporalUnaryExpr = (TemporalUnaryExpr)theEObject;
				T result = caseTemporalUnaryExpr(temporalUnaryExpr);
				if (result == null) result = caseTemporalExpression(temporalUnaryExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR: {
				TemporalPrimaryExpr temporalPrimaryExpr = (TemporalPrimaryExpr)theEObject;
				T result = caseTemporalPrimaryExpr(temporalPrimaryExpr);
				if (result == null) result = caseTemporalExpression(temporalPrimaryExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseTemporalExpression(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.BINARY_REG_EXP: {
				BinaryRegExp binaryRegExp = (BinaryRegExp)theEObject;
				T result = caseBinaryRegExp(binaryRegExp);
				if (result == null) result = caseRegExp(binaryRegExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.UNARY_REG_EXP: {
				UnaryRegExp unaryRegExp = (UnaryRegExp)theEObject;
				T result = caseUnaryRegExp(unaryRegExp);
				if (result == null) result = caseRegExp(unaryRegExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.COMP_REG_EXP: {
				CompRegExp compRegExp = (CompRegExp)theEObject;
				T result = caseCompRegExp(compRegExp);
				if (result == null) result = caseRegExp(compRegExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpectraPackage.QUANTIFIER_EXPR: {
				QuantifierExpr quantifierExpr = (QuantifierExpr)theEObject;
				T result = caseQuantifierExpr(quantifierExpr);
				if (result == null) result = caseTemporalExpression(quantifierExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecl(Decl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weight Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weight Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightDef(WeightDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVar(Var object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDef(TypeDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarDecl(VarDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConstant(TypeConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Define</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Define</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefine(Define object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Define Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Define Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefineDecl(DefineDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Define Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Define Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefineArray(DefineArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Define Reg Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Define Reg Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefineRegExp(DefineRegExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Define Reg Exp Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Define Reg Exp Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefineRegExpDecl(DefineRegExpDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Param List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Param List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternParamList(PatternParamList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternParam(PatternParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Param List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Param List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedParamList(TypedParamList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedParam(TypedParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCounter(Counter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitor(Monitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicate(Predicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarType(VarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LTL Gar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LTL Gar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLTLGar(LTLGar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LTL Asm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LTL Asm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLTLAsm(LTLAsm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Gar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Gar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXGar(EXGar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalExpression(TemporalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Or Pattern Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Or Pattern Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateOrPatternReferrable(PredicateOrPatternReferrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrange(Subrange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reg Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reg Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegExp(RegExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanTerm(BooleanTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value In Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value In Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueInRange(ValueInRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Var Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Var Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainVarDecl(DomainVarDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Define Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Define Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizeDefineDecl(SizeDefineDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal In Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal In Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalInExpr(TemporalInExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Imp Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Imp Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalImpExpr(TemporalImpExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Iff Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Iff Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalIffExpr(TemporalIffExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Or Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Or Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalOrExpr(TemporalOrExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal And Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal And Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalAndExpr(TemporalAndExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Relational Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Relational Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalRelationalExpr(TemporalRelationalExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Remainder Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Remainder Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalRemainderExpr(TemporalRemainderExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Additive Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Additive Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalAdditiveExpr(TemporalAdditiveExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Multiplicative Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Multiplicative Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalMultiplicativeExpr(TemporalMultiplicativeExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Binary Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Binary Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalBinaryExpr(TemporalBinaryExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Unary Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Unary Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalUnaryExpr(TemporalUnaryExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Primary Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Primary Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalPrimaryExpr(TemporalPrimaryExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Reg Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Reg Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryRegExp(BinaryRegExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Reg Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Reg Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryRegExp(UnaryRegExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Reg Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Reg Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompRegExp(CompRegExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantifier Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantifier Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifierExpr(QuantifierExpr object) {
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

} //SpectraSwitch
