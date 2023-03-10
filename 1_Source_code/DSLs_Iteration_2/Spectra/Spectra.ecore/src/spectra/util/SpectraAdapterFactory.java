/**
 */
package spectra.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import spectra.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see spectra.SpectraPackage
 * @generated
 */
public class SpectraAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpectraPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpectraAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpectraPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpectraSwitch<Adapter> modelSwitch =
		new SpectraSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseDecl(Decl object) {
				return createDeclAdapter();
			}
			@Override
			public Adapter caseWeightDef(WeightDef object) {
				return createWeightDefAdapter();
			}
			@Override
			public Adapter caseVar(Var object) {
				return createVarAdapter();
			}
			@Override
			public Adapter caseTypeDef(TypeDef object) {
				return createTypeDefAdapter();
			}
			@Override
			public Adapter caseVarDecl(VarDecl object) {
				return createVarDeclAdapter();
			}
			@Override
			public Adapter caseReferrable(Referrable object) {
				return createReferrableAdapter();
			}
			@Override
			public Adapter caseTypeConstant(TypeConstant object) {
				return createTypeConstantAdapter();
			}
			@Override
			public Adapter caseDefine(Define object) {
				return createDefineAdapter();
			}
			@Override
			public Adapter caseDefineDecl(DefineDecl object) {
				return createDefineDeclAdapter();
			}
			@Override
			public Adapter caseDefineArray(DefineArray object) {
				return createDefineArrayAdapter();
			}
			@Override
			public Adapter caseDefineRegExp(DefineRegExp object) {
				return createDefineRegExpAdapter();
			}
			@Override
			public Adapter caseDefineRegExpDecl(DefineRegExpDecl object) {
				return createDefineRegExpDeclAdapter();
			}
			@Override
			public Adapter casePatternParamList(PatternParamList object) {
				return createPatternParamListAdapter();
			}
			@Override
			public Adapter casePatternParam(PatternParam object) {
				return createPatternParamAdapter();
			}
			@Override
			public Adapter caseTypedParamList(TypedParamList object) {
				return createTypedParamListAdapter();
			}
			@Override
			public Adapter caseTypedParam(TypedParam object) {
				return createTypedParamAdapter();
			}
			@Override
			public Adapter caseCounter(Counter object) {
				return createCounterAdapter();
			}
			@Override
			public Adapter caseMonitor(Monitor object) {
				return createMonitorAdapter();
			}
			@Override
			public Adapter casePattern(Pattern object) {
				return createPatternAdapter();
			}
			@Override
			public Adapter casePredicate(Predicate object) {
				return createPredicateAdapter();
			}
			@Override
			public Adapter caseVarType(VarType object) {
				return createVarTypeAdapter();
			}
			@Override
			public Adapter caseLTLGar(LTLGar object) {
				return createLTLGarAdapter();
			}
			@Override
			public Adapter caseLTLAsm(LTLAsm object) {
				return createLTLAsmAdapter();
			}
			@Override
			public Adapter caseEXGar(EXGar object) {
				return createEXGarAdapter();
			}
			@Override
			public Adapter caseTemporalExpression(TemporalExpression object) {
				return createTemporalExpressionAdapter();
			}
			@Override
			public Adapter casePredicateOrPatternReferrable(PredicateOrPatternReferrable object) {
				return createPredicateOrPatternReferrableAdapter();
			}
			@Override
			public Adapter caseSubrange(Subrange object) {
				return createSubrangeAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseRegExp(RegExp object) {
				return createRegExpAdapter();
			}
			@Override
			public Adapter caseBooleanTerm(BooleanTerm object) {
				return createBooleanTermAdapter();
			}
			@Override
			public Adapter caseValueInRange(ValueInRange object) {
				return createValueInRangeAdapter();
			}
			@Override
			public Adapter caseDomainVarDecl(DomainVarDecl object) {
				return createDomainVarDeclAdapter();
			}
			@Override
			public Adapter caseSizeDefineDecl(SizeDefineDecl object) {
				return createSizeDefineDeclAdapter();
			}
			@Override
			public Adapter caseTemporalInExpr(TemporalInExpr object) {
				return createTemporalInExprAdapter();
			}
			@Override
			public Adapter caseTemporalImpExpr(TemporalImpExpr object) {
				return createTemporalImpExprAdapter();
			}
			@Override
			public Adapter caseTemporalIffExpr(TemporalIffExpr object) {
				return createTemporalIffExprAdapter();
			}
			@Override
			public Adapter caseTemporalOrExpr(TemporalOrExpr object) {
				return createTemporalOrExprAdapter();
			}
			@Override
			public Adapter caseTemporalAndExpr(TemporalAndExpr object) {
				return createTemporalAndExprAdapter();
			}
			@Override
			public Adapter caseTemporalRelationalExpr(TemporalRelationalExpr object) {
				return createTemporalRelationalExprAdapter();
			}
			@Override
			public Adapter caseTemporalRemainderExpr(TemporalRemainderExpr object) {
				return createTemporalRemainderExprAdapter();
			}
			@Override
			public Adapter caseTemporalAdditiveExpr(TemporalAdditiveExpr object) {
				return createTemporalAdditiveExprAdapter();
			}
			@Override
			public Adapter caseTemporalMultiplicativeExpr(TemporalMultiplicativeExpr object) {
				return createTemporalMultiplicativeExprAdapter();
			}
			@Override
			public Adapter caseTemporalBinaryExpr(TemporalBinaryExpr object) {
				return createTemporalBinaryExprAdapter();
			}
			@Override
			public Adapter caseTemporalUnaryExpr(TemporalUnaryExpr object) {
				return createTemporalUnaryExprAdapter();
			}
			@Override
			public Adapter caseTemporalPrimaryExpr(TemporalPrimaryExpr object) {
				return createTemporalPrimaryExprAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseBinaryRegExp(BinaryRegExp object) {
				return createBinaryRegExpAdapter();
			}
			@Override
			public Adapter caseUnaryRegExp(UnaryRegExp object) {
				return createUnaryRegExpAdapter();
			}
			@Override
			public Adapter caseCompRegExp(CompRegExp object) {
				return createCompRegExpAdapter();
			}
			@Override
			public Adapter caseQuantifierExpr(QuantifierExpr object) {
				return createQuantifierExprAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link spectra.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.Decl <em>Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.Decl
	 * @generated
	 */
	public Adapter createDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.WeightDef <em>Weight Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.WeightDef
	 * @generated
	 */
	public Adapter createWeightDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.Var
	 * @generated
	 */
	public Adapter createVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TypeDef
	 * @generated
	 */
	public Adapter createTypeDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.VarDecl <em>Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.VarDecl
	 * @generated
	 */
	public Adapter createVarDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.Referrable
	 * @generated
	 */
	public Adapter createReferrableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TypeConstant <em>Type Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TypeConstant
	 * @generated
	 */
	public Adapter createTypeConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.Define <em>Define</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.Define
	 * @generated
	 */
	public Adapter createDefineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.DefineDecl <em>Define Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.DefineDecl
	 * @generated
	 */
	public Adapter createDefineDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.DefineArray <em>Define Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.DefineArray
	 * @generated
	 */
	public Adapter createDefineArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.DefineRegExp <em>Define Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.DefineRegExp
	 * @generated
	 */
	public Adapter createDefineRegExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.DefineRegExpDecl <em>Define Reg Exp Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.DefineRegExpDecl
	 * @generated
	 */
	public Adapter createDefineRegExpDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.PatternParamList <em>Pattern Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.PatternParamList
	 * @generated
	 */
	public Adapter createPatternParamListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.PatternParam <em>Pattern Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.PatternParam
	 * @generated
	 */
	public Adapter createPatternParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TypedParamList <em>Typed Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TypedParamList
	 * @generated
	 */
	public Adapter createTypedParamListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TypedParam <em>Typed Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TypedParam
	 * @generated
	 */
	public Adapter createTypedParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.Counter
	 * @generated
	 */
	public Adapter createCounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.Monitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.Monitor
	 * @generated
	 */
	public Adapter createMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.Predicate
	 * @generated
	 */
	public Adapter createPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.VarType
	 * @generated
	 */
	public Adapter createVarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.LTLGar <em>LTL Gar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.LTLGar
	 * @generated
	 */
	public Adapter createLTLGarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.LTLAsm <em>LTL Asm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.LTLAsm
	 * @generated
	 */
	public Adapter createLTLAsmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.EXGar <em>EX Gar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.EXGar
	 * @generated
	 */
	public Adapter createEXGarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TemporalExpression <em>Temporal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TemporalExpression
	 * @generated
	 */
	public Adapter createTemporalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.PredicateOrPatternReferrable <em>Predicate Or Pattern Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.PredicateOrPatternReferrable
	 * @generated
	 */
	public Adapter createPredicateOrPatternReferrableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.Subrange <em>Subrange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.Subrange
	 * @generated
	 */
	public Adapter createSubrangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.RegExp <em>Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.RegExp
	 * @generated
	 */
	public Adapter createRegExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.BooleanTerm <em>Boolean Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.BooleanTerm
	 * @generated
	 */
	public Adapter createBooleanTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.ValueInRange <em>Value In Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.ValueInRange
	 * @generated
	 */
	public Adapter createValueInRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.DomainVarDecl <em>Domain Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.DomainVarDecl
	 * @generated
	 */
	public Adapter createDomainVarDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.SizeDefineDecl <em>Size Define Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.SizeDefineDecl
	 * @generated
	 */
	public Adapter createSizeDefineDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TemporalInExpr <em>Temporal In Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TemporalInExpr
	 * @generated
	 */
	public Adapter createTemporalInExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TemporalImpExpr <em>Temporal Imp Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TemporalImpExpr
	 * @generated
	 */
	public Adapter createTemporalImpExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TemporalIffExpr <em>Temporal Iff Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TemporalIffExpr
	 * @generated
	 */
	public Adapter createTemporalIffExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TemporalOrExpr <em>Temporal Or Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TemporalOrExpr
	 * @generated
	 */
	public Adapter createTemporalOrExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TemporalAndExpr <em>Temporal And Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TemporalAndExpr
	 * @generated
	 */
	public Adapter createTemporalAndExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TemporalRelationalExpr <em>Temporal Relational Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TemporalRelationalExpr
	 * @generated
	 */
	public Adapter createTemporalRelationalExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TemporalRemainderExpr <em>Temporal Remainder Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TemporalRemainderExpr
	 * @generated
	 */
	public Adapter createTemporalRemainderExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TemporalAdditiveExpr <em>Temporal Additive Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TemporalAdditiveExpr
	 * @generated
	 */
	public Adapter createTemporalAdditiveExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TemporalMultiplicativeExpr <em>Temporal Multiplicative Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TemporalMultiplicativeExpr
	 * @generated
	 */
	public Adapter createTemporalMultiplicativeExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TemporalBinaryExpr <em>Temporal Binary Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TemporalBinaryExpr
	 * @generated
	 */
	public Adapter createTemporalBinaryExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TemporalUnaryExpr <em>Temporal Unary Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TemporalUnaryExpr
	 * @generated
	 */
	public Adapter createTemporalUnaryExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.TemporalPrimaryExpr <em>Temporal Primary Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.TemporalPrimaryExpr
	 * @generated
	 */
	public Adapter createTemporalPrimaryExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.BinaryRegExp <em>Binary Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.BinaryRegExp
	 * @generated
	 */
	public Adapter createBinaryRegExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.UnaryRegExp <em>Unary Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.UnaryRegExp
	 * @generated
	 */
	public Adapter createUnaryRegExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.CompRegExp <em>Comp Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.CompRegExp
	 * @generated
	 */
	public Adapter createCompRegExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spectra.QuantifierExpr <em>Quantifier Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spectra.QuantifierExpr
	 * @generated
	 */
	public Adapter createQuantifierExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpectraAdapterFactory
