/**
 */
package spectra;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see spectra.SpectraPackage
 * @generated
 */
public interface SpectraFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpectraFactory eINSTANCE = spectra.impl.SpectraFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decl</em>'.
	 * @generated
	 */
	Decl createDecl();

	/**
	 * Returns a new object of class '<em>Weight Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weight Def</em>'.
	 * @generated
	 */
	WeightDef createWeightDef();

	/**
	 * Returns a new object of class '<em>Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var</em>'.
	 * @generated
	 */
	Var createVar();

	/**
	 * Returns a new object of class '<em>Type Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Def</em>'.
	 * @generated
	 */
	TypeDef createTypeDef();

	/**
	 * Returns a new object of class '<em>Var Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Decl</em>'.
	 * @generated
	 */
	VarDecl createVarDecl();

	/**
	 * Returns a new object of class '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referrable</em>'.
	 * @generated
	 */
	Referrable createReferrable();

	/**
	 * Returns a new object of class '<em>Type Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Constant</em>'.
	 * @generated
	 */
	TypeConstant createTypeConstant();

	/**
	 * Returns a new object of class '<em>Define</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Define</em>'.
	 * @generated
	 */
	Define createDefine();

	/**
	 * Returns a new object of class '<em>Define Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Define Decl</em>'.
	 * @generated
	 */
	DefineDecl createDefineDecl();

	/**
	 * Returns a new object of class '<em>Define Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Define Array</em>'.
	 * @generated
	 */
	DefineArray createDefineArray();

	/**
	 * Returns a new object of class '<em>Define Reg Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Define Reg Exp</em>'.
	 * @generated
	 */
	DefineRegExp createDefineRegExp();

	/**
	 * Returns a new object of class '<em>Define Reg Exp Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Define Reg Exp Decl</em>'.
	 * @generated
	 */
	DefineRegExpDecl createDefineRegExpDecl();

	/**
	 * Returns a new object of class '<em>Pattern Param List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Param List</em>'.
	 * @generated
	 */
	PatternParamList createPatternParamList();

	/**
	 * Returns a new object of class '<em>Pattern Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Param</em>'.
	 * @generated
	 */
	PatternParam createPatternParam();

	/**
	 * Returns a new object of class '<em>Typed Param List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Param List</em>'.
	 * @generated
	 */
	TypedParamList createTypedParamList();

	/**
	 * Returns a new object of class '<em>Typed Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Param</em>'.
	 * @generated
	 */
	TypedParam createTypedParam();

	/**
	 * Returns a new object of class '<em>Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counter</em>'.
	 * @generated
	 */
	Counter createCounter();

	/**
	 * Returns a new object of class '<em>Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitor</em>'.
	 * @generated
	 */
	Monitor createMonitor();

	/**
	 * Returns a new object of class '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern</em>'.
	 * @generated
	 */
	Pattern createPattern();

	/**
	 * Returns a new object of class '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate</em>'.
	 * @generated
	 */
	Predicate createPredicate();

	/**
	 * Returns a new object of class '<em>Var Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Type</em>'.
	 * @generated
	 */
	VarType createVarType();

	/**
	 * Returns a new object of class '<em>LTL Gar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LTL Gar</em>'.
	 * @generated
	 */
	LTLGar createLTLGar();

	/**
	 * Returns a new object of class '<em>LTL Asm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LTL Asm</em>'.
	 * @generated
	 */
	LTLAsm createLTLAsm();

	/**
	 * Returns a new object of class '<em>EX Gar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EX Gar</em>'.
	 * @generated
	 */
	EXGar createEXGar();

	/**
	 * Returns a new object of class '<em>Temporal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Expression</em>'.
	 * @generated
	 */
	TemporalExpression createTemporalExpression();

	/**
	 * Returns a new object of class '<em>Predicate Or Pattern Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Or Pattern Referrable</em>'.
	 * @generated
	 */
	PredicateOrPatternReferrable createPredicateOrPatternReferrable();

	/**
	 * Returns a new object of class '<em>Subrange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subrange</em>'.
	 * @generated
	 */
	Subrange createSubrange();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Reg Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reg Exp</em>'.
	 * @generated
	 */
	RegExp createRegExp();

	/**
	 * Returns a new object of class '<em>Boolean Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Term</em>'.
	 * @generated
	 */
	BooleanTerm createBooleanTerm();

	/**
	 * Returns a new object of class '<em>Value In Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value In Range</em>'.
	 * @generated
	 */
	ValueInRange createValueInRange();

	/**
	 * Returns a new object of class '<em>Domain Var Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Var Decl</em>'.
	 * @generated
	 */
	DomainVarDecl createDomainVarDecl();

	/**
	 * Returns a new object of class '<em>Size Define Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Size Define Decl</em>'.
	 * @generated
	 */
	SizeDefineDecl createSizeDefineDecl();

	/**
	 * Returns a new object of class '<em>Temporal In Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal In Expr</em>'.
	 * @generated
	 */
	TemporalInExpr createTemporalInExpr();

	/**
	 * Returns a new object of class '<em>Temporal Imp Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Imp Expr</em>'.
	 * @generated
	 */
	TemporalImpExpr createTemporalImpExpr();

	/**
	 * Returns a new object of class '<em>Temporal Iff Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Iff Expr</em>'.
	 * @generated
	 */
	TemporalIffExpr createTemporalIffExpr();

	/**
	 * Returns a new object of class '<em>Temporal Or Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Or Expr</em>'.
	 * @generated
	 */
	TemporalOrExpr createTemporalOrExpr();

	/**
	 * Returns a new object of class '<em>Temporal And Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal And Expr</em>'.
	 * @generated
	 */
	TemporalAndExpr createTemporalAndExpr();

	/**
	 * Returns a new object of class '<em>Temporal Relational Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Relational Expr</em>'.
	 * @generated
	 */
	TemporalRelationalExpr createTemporalRelationalExpr();

	/**
	 * Returns a new object of class '<em>Temporal Remainder Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Remainder Expr</em>'.
	 * @generated
	 */
	TemporalRemainderExpr createTemporalRemainderExpr();

	/**
	 * Returns a new object of class '<em>Temporal Additive Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Additive Expr</em>'.
	 * @generated
	 */
	TemporalAdditiveExpr createTemporalAdditiveExpr();

	/**
	 * Returns a new object of class '<em>Temporal Multiplicative Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Multiplicative Expr</em>'.
	 * @generated
	 */
	TemporalMultiplicativeExpr createTemporalMultiplicativeExpr();

	/**
	 * Returns a new object of class '<em>Temporal Binary Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Binary Expr</em>'.
	 * @generated
	 */
	TemporalBinaryExpr createTemporalBinaryExpr();

	/**
	 * Returns a new object of class '<em>Temporal Unary Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Unary Expr</em>'.
	 * @generated
	 */
	TemporalUnaryExpr createTemporalUnaryExpr();

	/**
	 * Returns a new object of class '<em>Temporal Primary Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Primary Expr</em>'.
	 * @generated
	 */
	TemporalPrimaryExpr createTemporalPrimaryExpr();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns a new object of class '<em>Binary Reg Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Reg Exp</em>'.
	 * @generated
	 */
	BinaryRegExp createBinaryRegExp();

	/**
	 * Returns a new object of class '<em>Unary Reg Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Reg Exp</em>'.
	 * @generated
	 */
	UnaryRegExp createUnaryRegExp();

	/**
	 * Returns a new object of class '<em>Comp Reg Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Reg Exp</em>'.
	 * @generated
	 */
	CompRegExp createCompRegExp();

	/**
	 * Returns a new object of class '<em>Quantifier Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantifier Expr</em>'.
	 * @generated
	 */
	QuantifierExpr createQuantifierExpr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpectraPackage getSpectraPackage();

} //SpectraFactory
