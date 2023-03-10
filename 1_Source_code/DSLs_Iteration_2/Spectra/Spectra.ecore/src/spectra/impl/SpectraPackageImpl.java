/**
 */
package spectra.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import spectra.BinaryRegExp;
import spectra.BooleanTerm;
import spectra.CompRegExp;
import spectra.Constant;
import spectra.Counter;
import spectra.Decl;
import spectra.Define;
import spectra.DefineArray;
import spectra.DefineDecl;
import spectra.DefineRegExp;
import spectra.DefineRegExpDecl;
import spectra.DomainVarDecl;
import spectra.EXGar;
import spectra.Import;
import spectra.LTLAsm;
import spectra.LTLGar;
import spectra.Model;
import spectra.Monitor;
import spectra.OverflowMethod;
import spectra.Pattern;
import spectra.PatternParam;
import spectra.PatternParamList;
import spectra.Predicate;
import spectra.PredicateOrPatternReferrable;
import spectra.QuantifierExpr;
import spectra.Referrable;
import spectra.RegExp;
import spectra.SizeDefineDecl;
import spectra.SpectraFactory;
import spectra.SpectraPackage;
import spectra.Subrange;
import spectra.TemporalAdditiveExpr;
import spectra.TemporalAndExpr;
import spectra.TemporalBinaryExpr;
import spectra.TemporalExpression;
import spectra.TemporalIffExpr;
import spectra.TemporalImpExpr;
import spectra.TemporalInExpr;
import spectra.TemporalMultiplicativeExpr;
import spectra.TemporalOrExpr;
import spectra.TemporalPrimaryExpr;
import spectra.TemporalRelationalExpr;
import spectra.TemporalRemainderExpr;
import spectra.TemporalUnaryExpr;
import spectra.Trigger;
import spectra.TypeConstant;
import spectra.TypeDef;
import spectra.TypedParam;
import spectra.TypedParamList;
import spectra.UnaryRegExp;
import spectra.ValueInRange;
import spectra.Var;
import spectra.VarDecl;
import spectra.VarOwner;
import spectra.VarType;
import spectra.WeightDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpectraPackageImpl extends EPackageImpl implements SpectraPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weightDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referrableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defineDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defineArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defineRegExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defineRegExpDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternParamListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedParamListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltlGarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltlAsmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exGarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateOrPatternReferrableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subrangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueInRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainVarDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeDefineDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalInExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalImpExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalIffExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalOrExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalAndExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalRelationalExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalRemainderExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalAdditiveExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalMultiplicativeExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalBinaryExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalUnaryExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalPrimaryExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryRegExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryRegExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compRegExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifierExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum varOwnerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum overflowMethodEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see spectra.SpectraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpectraPackageImpl() {
		super(eNS_URI, SpectraFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SpectraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpectraPackage init() {
		if (isInited) return (SpectraPackage)EPackage.Registry.INSTANCE.getEPackage(SpectraPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSpectraPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SpectraPackageImpl theSpectraPackage = registeredSpectraPackage instanceof SpectraPackageImpl ? (SpectraPackageImpl)registeredSpectraPackage : new SpectraPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSpectraPackage.createPackageContents();

		// Initialize created meta-data
		theSpectraPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpectraPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpectraPackage.eNS_URI, theSpectraPackage);
		return theSpectraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Imports() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Elements() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportURI() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecl() {
		return declEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeightDef() {
		return weightDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeightDef_Name() {
		return (EAttribute)weightDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeightDef_Negative() {
		return (EAttribute)weightDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeightDef_Value() {
		return (EAttribute)weightDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeightDef_Definition() {
		return (EReference)weightDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVar() {
		return varEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVar_Kind() {
		return (EAttribute)varEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVar_Var() {
		return (EReference)varEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDef() {
		return typeDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDef_Name() {
		return (EAttribute)typeDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDef_Type() {
		return (EReference)typeDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarDecl() {
		return varDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarDecl_Type() {
		return (EReference)varDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferrable() {
		return referrableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferrable_Name() {
		return (EAttribute)referrableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeConstant() {
		return typeConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefine() {
		return defineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefine_DefineList() {
		return (EReference)defineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefineDecl() {
		return defineDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefineDecl_SimpleExpr() {
		return (EReference)defineDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefineDecl_Dimensions() {
		return (EReference)defineDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefineDecl_InnerArray() {
		return (EReference)defineDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefineArray() {
		return defineArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefineArray_SimpleExprs() {
		return (EReference)defineArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefineArray_InnerArrays() {
		return (EReference)defineArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefineRegExp() {
		return defineRegExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefineRegExp_DefineRegsList() {
		return (EReference)defineRegExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefineRegExpDecl() {
		return defineRegExpDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefineRegExpDecl_Exp() {
		return (EReference)defineRegExpDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternParamList() {
		return patternParamListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternParamList_Params() {
		return (EReference)patternParamListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternParam() {
		return patternParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedParamList() {
		return typedParamListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedParamList_Params() {
		return (EReference)typedParamListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedParam() {
		return typedParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedParam_Type() {
		return (EReference)typedParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCounter() {
		return counterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCounter_Range() {
		return (EReference)counterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCounter_Initial() {
		return (EReference)counterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCounter_ResetPred() {
		return (EReference)counterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCounter_IncPred() {
		return (EReference)counterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCounter_DecPred() {
		return (EReference)counterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounter_OverflowMethod() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounter_UnderflowMethod() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitor() {
		return monitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitor_Type() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitor_Initial() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitor_Safety() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitor_StateInv() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_Name() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Params() {
		return (EReference)patternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_VarDeclList() {
		return (EReference)patternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Initial() {
		return (EReference)patternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Safety() {
		return (EReference)patternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_StateInv() {
		return (EReference)patternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Justice() {
		return (EReference)patternEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredicate_Name() {
		return (EAttribute)predicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicate_Params() {
		return (EReference)predicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicate_Body() {
		return (EReference)predicateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarType() {
		return varTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarType_Name() {
		return (EAttribute)varTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarType_Subr() {
		return (EReference)varTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarType_Const() {
		return (EReference)varTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarType_Type() {
		return (EReference)varTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarType_Dimensions() {
		return (EReference)varTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLTLGar() {
		return ltlGarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLTLGar_Name() {
		return (EAttribute)ltlGarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLTLGar_Params() {
		return (EReference)ltlGarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLTLGar_Safety() {
		return (EAttribute)ltlGarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLTLGar_StateInv() {
		return (EAttribute)ltlGarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLTLGar_Justice() {
		return (EAttribute)ltlGarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLTLGar_TemporalExpr() {
		return (EReference)ltlGarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLTLGar_Trig() {
		return (EReference)ltlGarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLTLAsm() {
		return ltlAsmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLTLAsm_Name() {
		return (EAttribute)ltlAsmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLTLAsm_Params() {
		return (EReference)ltlAsmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLTLAsm_Safety() {
		return (EAttribute)ltlAsmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLTLAsm_StateInv() {
		return (EAttribute)ltlAsmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLTLAsm_Justice() {
		return (EAttribute)ltlAsmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLTLAsm_TemporalExpr() {
		return (EReference)ltlAsmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLTLAsm_Trig() {
		return (EReference)ltlAsmEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEXGar() {
		return exGarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEXGar_Name() {
		return (EAttribute)exGarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXGar_Elements() {
		return (EReference)exGarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXGar_RegExpPointer() {
		return (EReference)exGarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXGar_RegExp() {
		return (EReference)exGarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalExpression() {
		return temporalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateOrPatternReferrable() {
		return predicateOrPatternReferrableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubrange() {
		return subrangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubrange_From() {
		return (EReference)subrangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubrange_To() {
		return (EReference)subrangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_InitPointer() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_InitRegExp() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_EffectPointer() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_EffectRegExp() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegExp() {
		return regExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegExp_Val() {
		return (EAttribute)regExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegExp_Assrt() {
		return (EReference)regExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegExp_Empty() {
		return (EAttribute)regExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegExp_Left() {
		return (EReference)regExpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanTerm() {
		return booleanTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanTerm_RelExpr() {
		return (EReference)booleanTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueInRange() {
		return valueInRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueInRange_Const() {
		return (EReference)valueInRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueInRange_Int() {
		return (EAttribute)valueInRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueInRange_From() {
		return (EAttribute)valueInRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueInRange_Multi() {
		return (EAttribute)valueInRangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueInRange_To() {
		return (EAttribute)valueInRangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueInRange_BooleanValue() {
		return (EAttribute)valueInRangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainVarDecl() {
		return domainVarDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainVarDecl_DomainType() {
		return (EReference)domainVarDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSizeDefineDecl() {
		return sizeDefineDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizeDefineDecl_Value() {
		return (EAttribute)sizeDefineDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSizeDefineDecl_Name() {
		return (EReference)sizeDefineDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSizeDefineDecl_ArithExp() {
		return (EReference)sizeDefineDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalInExpr() {
		return temporalInExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalInExpr_Left() {
		return (EReference)temporalInExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalInExpr_Not() {
		return (EAttribute)temporalInExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalInExpr_Operator() {
		return (EAttribute)temporalInExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalInExpr_Values() {
		return (EReference)temporalInExprEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalImpExpr() {
		return temporalImpExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalImpExpr_Left() {
		return (EReference)temporalImpExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalImpExpr_Operator() {
		return (EAttribute)temporalImpExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalImpExpr_Implication() {
		return (EReference)temporalImpExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalIffExpr() {
		return temporalIffExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalIffExpr_Elements() {
		return (EReference)temporalIffExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalIffExpr_Operator() {
		return (EAttribute)temporalIffExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalOrExpr() {
		return temporalOrExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalOrExpr_Elements() {
		return (EReference)temporalOrExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalOrExpr_Operator() {
		return (EAttribute)temporalOrExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalAndExpr() {
		return temporalAndExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalAndExpr_Elements() {
		return (EReference)temporalAndExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalAndExpr_Operator() {
		return (EAttribute)temporalAndExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalRelationalExpr() {
		return temporalRelationalExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalRelationalExpr_Left() {
		return (EReference)temporalRelationalExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalRelationalExpr_Operator() {
		return (EAttribute)temporalRelationalExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalRelationalExpr_Right() {
		return (EReference)temporalRelationalExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalRemainderExpr() {
		return temporalRemainderExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalRemainderExpr_Left() {
		return (EReference)temporalRemainderExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalRemainderExpr_Operator() {
		return (EAttribute)temporalRemainderExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalRemainderExpr_Right() {
		return (EReference)temporalRemainderExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalAdditiveExpr() {
		return temporalAdditiveExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalAdditiveExpr_Elements() {
		return (EReference)temporalAdditiveExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalAdditiveExpr_Operator() {
		return (EAttribute)temporalAdditiveExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalMultiplicativeExpr() {
		return temporalMultiplicativeExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalMultiplicativeExpr_Elements() {
		return (EReference)temporalMultiplicativeExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalMultiplicativeExpr_Operator() {
		return (EAttribute)temporalMultiplicativeExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalBinaryExpr() {
		return temporalBinaryExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalBinaryExpr_Elements() {
		return (EReference)temporalBinaryExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalBinaryExpr_Operator() {
		return (EAttribute)temporalBinaryExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalUnaryExpr() {
		return temporalUnaryExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalUnaryExpr_Kinds() {
		return (EAttribute)temporalUnaryExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalUnaryExpr_Tue() {
		return (EReference)temporalUnaryExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalPrimaryExpr() {
		return temporalPrimaryExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalPrimaryExpr_PredPatt() {
		return (EReference)temporalPrimaryExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalPrimaryExpr_PredPattParams() {
		return (EReference)temporalPrimaryExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalPrimaryExpr_Operator() {
		return (EAttribute)temporalPrimaryExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalPrimaryExpr_Tpe() {
		return (EReference)temporalPrimaryExprEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalPrimaryExpr_Pointer() {
		return (EReference)temporalPrimaryExprEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalPrimaryExpr_Index() {
		return (EReference)temporalPrimaryExprEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalPrimaryExpr_TemporalExpression() {
		return (EReference)temporalPrimaryExprEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalPrimaryExpr_Regexp() {
		return (EReference)temporalPrimaryExprEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalPrimaryExpr_RegexpPointer() {
		return (EReference)temporalPrimaryExprEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_BooleanValue() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_IntegerValue() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryRegExp() {
		return binaryRegExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryRegExp_Op() {
		return (EAttribute)binaryRegExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryRegExp_Right() {
		return (EReference)binaryRegExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryRegExp() {
		return unaryRegExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryRegExp_Kleened() {
		return (EAttribute)unaryRegExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryRegExp_QuestionMark() {
		return (EAttribute)unaryRegExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryRegExp_Plus() {
		return (EAttribute)unaryRegExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryRegExp_HaveExactRepetition() {
		return (EAttribute)unaryRegExpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryRegExp_ExactRepetition() {
		return (EAttribute)unaryRegExpEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryRegExp_HaveAtLeast() {
		return (EAttribute)unaryRegExpEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryRegExp_AtLeast() {
		return (EAttribute)unaryRegExpEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryRegExp_HaveRange() {
		return (EAttribute)unaryRegExpEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryRegExp_From() {
		return (EAttribute)unaryRegExpEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryRegExp_FromDefine() {
		return (EReference)unaryRegExpEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryRegExp_To() {
		return (EAttribute)unaryRegExpEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryRegExp_ToDefine() {
		return (EReference)unaryRegExpEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompRegExp() {
		return compRegExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompRegExp_Comp() {
		return (EAttribute)compRegExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifierExpr() {
		return quantifierExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantifierExpr_Operator() {
		return (EAttribute)quantifierExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifierExpr_DomainVar() {
		return (EReference)quantifierExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifierExpr_TemporalExpr() {
		return (EReference)quantifierExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVarOwner() {
		return varOwnerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOverflowMethod() {
		return overflowMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpectraFactory getSpectraFactory() {
		return (SpectraFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__IMPORTS);
		createEAttribute(modelEClass, MODEL__NAME);
		createEReference(modelEClass, MODEL__ELEMENTS);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORT_URI);

		declEClass = createEClass(DECL);

		weightDefEClass = createEClass(WEIGHT_DEF);
		createEAttribute(weightDefEClass, WEIGHT_DEF__NAME);
		createEAttribute(weightDefEClass, WEIGHT_DEF__NEGATIVE);
		createEAttribute(weightDefEClass, WEIGHT_DEF__VALUE);
		createEReference(weightDefEClass, WEIGHT_DEF__DEFINITION);

		varEClass = createEClass(VAR);
		createEAttribute(varEClass, VAR__KIND);
		createEReference(varEClass, VAR__VAR);

		typeDefEClass = createEClass(TYPE_DEF);
		createEAttribute(typeDefEClass, TYPE_DEF__NAME);
		createEReference(typeDefEClass, TYPE_DEF__TYPE);

		varDeclEClass = createEClass(VAR_DECL);
		createEReference(varDeclEClass, VAR_DECL__TYPE);

		referrableEClass = createEClass(REFERRABLE);
		createEAttribute(referrableEClass, REFERRABLE__NAME);

		typeConstantEClass = createEClass(TYPE_CONSTANT);

		defineEClass = createEClass(DEFINE);
		createEReference(defineEClass, DEFINE__DEFINE_LIST);

		defineDeclEClass = createEClass(DEFINE_DECL);
		createEReference(defineDeclEClass, DEFINE_DECL__SIMPLE_EXPR);
		createEReference(defineDeclEClass, DEFINE_DECL__DIMENSIONS);
		createEReference(defineDeclEClass, DEFINE_DECL__INNER_ARRAY);

		defineArrayEClass = createEClass(DEFINE_ARRAY);
		createEReference(defineArrayEClass, DEFINE_ARRAY__SIMPLE_EXPRS);
		createEReference(defineArrayEClass, DEFINE_ARRAY__INNER_ARRAYS);

		defineRegExpEClass = createEClass(DEFINE_REG_EXP);
		createEReference(defineRegExpEClass, DEFINE_REG_EXP__DEFINE_REGS_LIST);

		defineRegExpDeclEClass = createEClass(DEFINE_REG_EXP_DECL);
		createEReference(defineRegExpDeclEClass, DEFINE_REG_EXP_DECL__EXP);

		patternParamListEClass = createEClass(PATTERN_PARAM_LIST);
		createEReference(patternParamListEClass, PATTERN_PARAM_LIST__PARAMS);

		patternParamEClass = createEClass(PATTERN_PARAM);

		typedParamListEClass = createEClass(TYPED_PARAM_LIST);
		createEReference(typedParamListEClass, TYPED_PARAM_LIST__PARAMS);

		typedParamEClass = createEClass(TYPED_PARAM);
		createEReference(typedParamEClass, TYPED_PARAM__TYPE);

		counterEClass = createEClass(COUNTER);
		createEReference(counterEClass, COUNTER__RANGE);
		createEReference(counterEClass, COUNTER__INITIAL);
		createEReference(counterEClass, COUNTER__RESET_PRED);
		createEReference(counterEClass, COUNTER__INC_PRED);
		createEReference(counterEClass, COUNTER__DEC_PRED);
		createEAttribute(counterEClass, COUNTER__OVERFLOW_METHOD);
		createEAttribute(counterEClass, COUNTER__UNDERFLOW_METHOD);

		monitorEClass = createEClass(MONITOR);
		createEReference(monitorEClass, MONITOR__TYPE);
		createEReference(monitorEClass, MONITOR__INITIAL);
		createEReference(monitorEClass, MONITOR__SAFETY);
		createEReference(monitorEClass, MONITOR__STATE_INV);

		patternEClass = createEClass(PATTERN);
		createEAttribute(patternEClass, PATTERN__NAME);
		createEReference(patternEClass, PATTERN__PARAMS);
		createEReference(patternEClass, PATTERN__VAR_DECL_LIST);
		createEReference(patternEClass, PATTERN__INITIAL);
		createEReference(patternEClass, PATTERN__SAFETY);
		createEReference(patternEClass, PATTERN__STATE_INV);
		createEReference(patternEClass, PATTERN__JUSTICE);

		predicateEClass = createEClass(PREDICATE);
		createEAttribute(predicateEClass, PREDICATE__NAME);
		createEReference(predicateEClass, PREDICATE__PARAMS);
		createEReference(predicateEClass, PREDICATE__BODY);

		varTypeEClass = createEClass(VAR_TYPE);
		createEAttribute(varTypeEClass, VAR_TYPE__NAME);
		createEReference(varTypeEClass, VAR_TYPE__SUBR);
		createEReference(varTypeEClass, VAR_TYPE__CONST);
		createEReference(varTypeEClass, VAR_TYPE__TYPE);
		createEReference(varTypeEClass, VAR_TYPE__DIMENSIONS);

		ltlGarEClass = createEClass(LTL_GAR);
		createEAttribute(ltlGarEClass, LTL_GAR__NAME);
		createEReference(ltlGarEClass, LTL_GAR__PARAMS);
		createEAttribute(ltlGarEClass, LTL_GAR__SAFETY);
		createEAttribute(ltlGarEClass, LTL_GAR__STATE_INV);
		createEAttribute(ltlGarEClass, LTL_GAR__JUSTICE);
		createEReference(ltlGarEClass, LTL_GAR__TEMPORAL_EXPR);
		createEReference(ltlGarEClass, LTL_GAR__TRIG);

		ltlAsmEClass = createEClass(LTL_ASM);
		createEAttribute(ltlAsmEClass, LTL_ASM__NAME);
		createEReference(ltlAsmEClass, LTL_ASM__PARAMS);
		createEAttribute(ltlAsmEClass, LTL_ASM__SAFETY);
		createEAttribute(ltlAsmEClass, LTL_ASM__STATE_INV);
		createEAttribute(ltlAsmEClass, LTL_ASM__JUSTICE);
		createEReference(ltlAsmEClass, LTL_ASM__TEMPORAL_EXPR);
		createEReference(ltlAsmEClass, LTL_ASM__TRIG);

		exGarEClass = createEClass(EX_GAR);
		createEAttribute(exGarEClass, EX_GAR__NAME);
		createEReference(exGarEClass, EX_GAR__ELEMENTS);
		createEReference(exGarEClass, EX_GAR__REG_EXP_POINTER);
		createEReference(exGarEClass, EX_GAR__REG_EXP);

		temporalExpressionEClass = createEClass(TEMPORAL_EXPRESSION);

		predicateOrPatternReferrableEClass = createEClass(PREDICATE_OR_PATTERN_REFERRABLE);

		subrangeEClass = createEClass(SUBRANGE);
		createEReference(subrangeEClass, SUBRANGE__FROM);
		createEReference(subrangeEClass, SUBRANGE__TO);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__INIT_POINTER);
		createEReference(triggerEClass, TRIGGER__INIT_REG_EXP);
		createEReference(triggerEClass, TRIGGER__EFFECT_POINTER);
		createEReference(triggerEClass, TRIGGER__EFFECT_REG_EXP);

		regExpEClass = createEClass(REG_EXP);
		createEAttribute(regExpEClass, REG_EXP__VAL);
		createEReference(regExpEClass, REG_EXP__ASSRT);
		createEAttribute(regExpEClass, REG_EXP__EMPTY);
		createEReference(regExpEClass, REG_EXP__LEFT);

		booleanTermEClass = createEClass(BOOLEAN_TERM);
		createEReference(booleanTermEClass, BOOLEAN_TERM__REL_EXPR);

		valueInRangeEClass = createEClass(VALUE_IN_RANGE);
		createEReference(valueInRangeEClass, VALUE_IN_RANGE__CONST);
		createEAttribute(valueInRangeEClass, VALUE_IN_RANGE__INT);
		createEAttribute(valueInRangeEClass, VALUE_IN_RANGE__FROM);
		createEAttribute(valueInRangeEClass, VALUE_IN_RANGE__MULTI);
		createEAttribute(valueInRangeEClass, VALUE_IN_RANGE__TO);
		createEAttribute(valueInRangeEClass, VALUE_IN_RANGE__BOOLEAN_VALUE);

		domainVarDeclEClass = createEClass(DOMAIN_VAR_DECL);
		createEReference(domainVarDeclEClass, DOMAIN_VAR_DECL__DOMAIN_TYPE);

		sizeDefineDeclEClass = createEClass(SIZE_DEFINE_DECL);
		createEAttribute(sizeDefineDeclEClass, SIZE_DEFINE_DECL__VALUE);
		createEReference(sizeDefineDeclEClass, SIZE_DEFINE_DECL__NAME);
		createEReference(sizeDefineDeclEClass, SIZE_DEFINE_DECL__ARITH_EXP);

		temporalInExprEClass = createEClass(TEMPORAL_IN_EXPR);
		createEReference(temporalInExprEClass, TEMPORAL_IN_EXPR__LEFT);
		createEAttribute(temporalInExprEClass, TEMPORAL_IN_EXPR__NOT);
		createEAttribute(temporalInExprEClass, TEMPORAL_IN_EXPR__OPERATOR);
		createEReference(temporalInExprEClass, TEMPORAL_IN_EXPR__VALUES);

		temporalImpExprEClass = createEClass(TEMPORAL_IMP_EXPR);
		createEReference(temporalImpExprEClass, TEMPORAL_IMP_EXPR__LEFT);
		createEAttribute(temporalImpExprEClass, TEMPORAL_IMP_EXPR__OPERATOR);
		createEReference(temporalImpExprEClass, TEMPORAL_IMP_EXPR__IMPLICATION);

		temporalIffExprEClass = createEClass(TEMPORAL_IFF_EXPR);
		createEReference(temporalIffExprEClass, TEMPORAL_IFF_EXPR__ELEMENTS);
		createEAttribute(temporalIffExprEClass, TEMPORAL_IFF_EXPR__OPERATOR);

		temporalOrExprEClass = createEClass(TEMPORAL_OR_EXPR);
		createEReference(temporalOrExprEClass, TEMPORAL_OR_EXPR__ELEMENTS);
		createEAttribute(temporalOrExprEClass, TEMPORAL_OR_EXPR__OPERATOR);

		temporalAndExprEClass = createEClass(TEMPORAL_AND_EXPR);
		createEReference(temporalAndExprEClass, TEMPORAL_AND_EXPR__ELEMENTS);
		createEAttribute(temporalAndExprEClass, TEMPORAL_AND_EXPR__OPERATOR);

		temporalRelationalExprEClass = createEClass(TEMPORAL_RELATIONAL_EXPR);
		createEReference(temporalRelationalExprEClass, TEMPORAL_RELATIONAL_EXPR__LEFT);
		createEAttribute(temporalRelationalExprEClass, TEMPORAL_RELATIONAL_EXPR__OPERATOR);
		createEReference(temporalRelationalExprEClass, TEMPORAL_RELATIONAL_EXPR__RIGHT);

		temporalRemainderExprEClass = createEClass(TEMPORAL_REMAINDER_EXPR);
		createEReference(temporalRemainderExprEClass, TEMPORAL_REMAINDER_EXPR__LEFT);
		createEAttribute(temporalRemainderExprEClass, TEMPORAL_REMAINDER_EXPR__OPERATOR);
		createEReference(temporalRemainderExprEClass, TEMPORAL_REMAINDER_EXPR__RIGHT);

		temporalAdditiveExprEClass = createEClass(TEMPORAL_ADDITIVE_EXPR);
		createEReference(temporalAdditiveExprEClass, TEMPORAL_ADDITIVE_EXPR__ELEMENTS);
		createEAttribute(temporalAdditiveExprEClass, TEMPORAL_ADDITIVE_EXPR__OPERATOR);

		temporalMultiplicativeExprEClass = createEClass(TEMPORAL_MULTIPLICATIVE_EXPR);
		createEReference(temporalMultiplicativeExprEClass, TEMPORAL_MULTIPLICATIVE_EXPR__ELEMENTS);
		createEAttribute(temporalMultiplicativeExprEClass, TEMPORAL_MULTIPLICATIVE_EXPR__OPERATOR);

		temporalBinaryExprEClass = createEClass(TEMPORAL_BINARY_EXPR);
		createEReference(temporalBinaryExprEClass, TEMPORAL_BINARY_EXPR__ELEMENTS);
		createEAttribute(temporalBinaryExprEClass, TEMPORAL_BINARY_EXPR__OPERATOR);

		temporalUnaryExprEClass = createEClass(TEMPORAL_UNARY_EXPR);
		createEAttribute(temporalUnaryExprEClass, TEMPORAL_UNARY_EXPR__KINDS);
		createEReference(temporalUnaryExprEClass, TEMPORAL_UNARY_EXPR__TUE);

		temporalPrimaryExprEClass = createEClass(TEMPORAL_PRIMARY_EXPR);
		createEReference(temporalPrimaryExprEClass, TEMPORAL_PRIMARY_EXPR__PRED_PATT);
		createEReference(temporalPrimaryExprEClass, TEMPORAL_PRIMARY_EXPR__PRED_PATT_PARAMS);
		createEAttribute(temporalPrimaryExprEClass, TEMPORAL_PRIMARY_EXPR__OPERATOR);
		createEReference(temporalPrimaryExprEClass, TEMPORAL_PRIMARY_EXPR__TPE);
		createEReference(temporalPrimaryExprEClass, TEMPORAL_PRIMARY_EXPR__POINTER);
		createEReference(temporalPrimaryExprEClass, TEMPORAL_PRIMARY_EXPR__INDEX);
		createEReference(temporalPrimaryExprEClass, TEMPORAL_PRIMARY_EXPR__TEMPORAL_EXPRESSION);
		createEReference(temporalPrimaryExprEClass, TEMPORAL_PRIMARY_EXPR__REGEXP);
		createEReference(temporalPrimaryExprEClass, TEMPORAL_PRIMARY_EXPR__REGEXP_POINTER);

		constantEClass = createEClass(CONSTANT);
		createEAttribute(constantEClass, CONSTANT__BOOLEAN_VALUE);
		createEAttribute(constantEClass, CONSTANT__INTEGER_VALUE);

		binaryRegExpEClass = createEClass(BINARY_REG_EXP);
		createEAttribute(binaryRegExpEClass, BINARY_REG_EXP__OP);
		createEReference(binaryRegExpEClass, BINARY_REG_EXP__RIGHT);

		unaryRegExpEClass = createEClass(UNARY_REG_EXP);
		createEAttribute(unaryRegExpEClass, UNARY_REG_EXP__KLEENED);
		createEAttribute(unaryRegExpEClass, UNARY_REG_EXP__QUESTION_MARK);
		createEAttribute(unaryRegExpEClass, UNARY_REG_EXP__PLUS);
		createEAttribute(unaryRegExpEClass, UNARY_REG_EXP__HAVE_EXACT_REPETITION);
		createEAttribute(unaryRegExpEClass, UNARY_REG_EXP__EXACT_REPETITION);
		createEAttribute(unaryRegExpEClass, UNARY_REG_EXP__HAVE_AT_LEAST);
		createEAttribute(unaryRegExpEClass, UNARY_REG_EXP__AT_LEAST);
		createEAttribute(unaryRegExpEClass, UNARY_REG_EXP__HAVE_RANGE);
		createEAttribute(unaryRegExpEClass, UNARY_REG_EXP__FROM);
		createEReference(unaryRegExpEClass, UNARY_REG_EXP__FROM_DEFINE);
		createEAttribute(unaryRegExpEClass, UNARY_REG_EXP__TO);
		createEReference(unaryRegExpEClass, UNARY_REG_EXP__TO_DEFINE);

		compRegExpEClass = createEClass(COMP_REG_EXP);
		createEAttribute(compRegExpEClass, COMP_REG_EXP__COMP);

		quantifierExprEClass = createEClass(QUANTIFIER_EXPR);
		createEAttribute(quantifierExprEClass, QUANTIFIER_EXPR__OPERATOR);
		createEReference(quantifierExprEClass, QUANTIFIER_EXPR__DOMAIN_VAR);
		createEReference(quantifierExprEClass, QUANTIFIER_EXPR__TEMPORAL_EXPR);

		// Create enums
		varOwnerEEnum = createEEnum(VAR_OWNER);
		overflowMethodEEnum = createEEnum(OVERFLOW_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		weightDefEClass.getESuperTypes().add(this.getDecl());
		varEClass.getESuperTypes().add(this.getDecl());
		typeDefEClass.getESuperTypes().add(this.getDecl());
		varDeclEClass.getESuperTypes().add(this.getReferrable());
		typeConstantEClass.getESuperTypes().add(this.getReferrable());
		defineEClass.getESuperTypes().add(this.getDecl());
		defineDeclEClass.getESuperTypes().add(this.getReferrable());
		defineRegExpEClass.getESuperTypes().add(this.getDecl());
		defineRegExpDeclEClass.getESuperTypes().add(this.getReferrable());
		patternParamEClass.getESuperTypes().add(this.getReferrable());
		typedParamEClass.getESuperTypes().add(this.getReferrable());
		counterEClass.getESuperTypes().add(this.getDecl());
		counterEClass.getESuperTypes().add(this.getReferrable());
		monitorEClass.getESuperTypes().add(this.getDecl());
		monitorEClass.getESuperTypes().add(this.getReferrable());
		patternEClass.getESuperTypes().add(this.getDecl());
		patternEClass.getESuperTypes().add(this.getPredicateOrPatternReferrable());
		predicateEClass.getESuperTypes().add(this.getDecl());
		predicateEClass.getESuperTypes().add(this.getPredicateOrPatternReferrable());
		ltlGarEClass.getESuperTypes().add(this.getDecl());
		ltlAsmEClass.getESuperTypes().add(this.getDecl());
		exGarEClass.getESuperTypes().add(this.getDecl());
		domainVarDeclEClass.getESuperTypes().add(this.getReferrable());
		temporalInExprEClass.getESuperTypes().add(this.getTemporalExpression());
		temporalImpExprEClass.getESuperTypes().add(this.getTemporalExpression());
		temporalIffExprEClass.getESuperTypes().add(this.getTemporalExpression());
		temporalOrExprEClass.getESuperTypes().add(this.getTemporalExpression());
		temporalAndExprEClass.getESuperTypes().add(this.getTemporalExpression());
		temporalRelationalExprEClass.getESuperTypes().add(this.getTemporalExpression());
		temporalRemainderExprEClass.getESuperTypes().add(this.getTemporalExpression());
		temporalAdditiveExprEClass.getESuperTypes().add(this.getTemporalExpression());
		temporalMultiplicativeExprEClass.getESuperTypes().add(this.getTemporalExpression());
		temporalBinaryExprEClass.getESuperTypes().add(this.getTemporalExpression());
		temporalUnaryExprEClass.getESuperTypes().add(this.getTemporalExpression());
		temporalPrimaryExprEClass.getESuperTypes().add(this.getTemporalExpression());
		constantEClass.getESuperTypes().add(this.getTemporalExpression());
		binaryRegExpEClass.getESuperTypes().add(this.getRegExp());
		unaryRegExpEClass.getESuperTypes().add(this.getRegExp());
		compRegExpEClass.getESuperTypes().add(this.getRegExp());
		quantifierExprEClass.getESuperTypes().add(this.getTemporalExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Imports(), this.getImport(), null, "imports", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Elements(), this.getDecl(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declEClass, Decl.class, "Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(weightDefEClass, WeightDef.class, "WeightDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeightDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, WeightDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeightDef_Negative(), ecorePackage.getEString(), "negative", null, 0, 1, WeightDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeightDef_Value(), ecorePackage.getEInt(), "value", null, 0, 1, WeightDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeightDef_Definition(), this.getTemporalExpression(), null, "definition", null, 0, 1, WeightDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varEClass, Var.class, "Var", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVar_Kind(), this.getVarOwner(), "kind", null, 0, 1, Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVar_Var(), this.getVarDecl(), null, "var", null, 0, 1, Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefEClass, TypeDef.class, "TypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDef_Type(), this.getVarType(), null, "type", null, 0, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varDeclEClass, VarDecl.class, "VarDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVarDecl_Type(), this.getVarType(), null, "type", null, 0, 1, VarDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referrableEClass, Referrable.class, "Referrable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferrable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Referrable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeConstantEClass, TypeConstant.class, "TypeConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defineEClass, Define.class, "Define", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefine_DefineList(), this.getDefineDecl(), null, "defineList", null, 0, -1, Define.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defineDeclEClass, DefineDecl.class, "DefineDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefineDecl_SimpleExpr(), this.getTemporalExpression(), null, "simpleExpr", null, 0, 1, DefineDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefineDecl_Dimensions(), this.getSizeDefineDecl(), null, "dimensions", null, 0, -1, DefineDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefineDecl_InnerArray(), this.getDefineArray(), null, "innerArray", null, 0, 1, DefineDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defineArrayEClass, DefineArray.class, "DefineArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefineArray_SimpleExprs(), this.getTemporalExpression(), null, "simpleExprs", null, 0, -1, DefineArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefineArray_InnerArrays(), this.getDefineArray(), null, "innerArrays", null, 0, -1, DefineArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defineRegExpEClass, DefineRegExp.class, "DefineRegExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefineRegExp_DefineRegsList(), this.getDefineRegExpDecl(), null, "defineRegsList", null, 0, -1, DefineRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defineRegExpDeclEClass, DefineRegExpDecl.class, "DefineRegExpDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefineRegExpDecl_Exp(), this.getRegExp(), null, "exp", null, 0, 1, DefineRegExpDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternParamListEClass, PatternParamList.class, "PatternParamList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternParamList_Params(), this.getPatternParam(), null, "params", null, 0, -1, PatternParamList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternParamEClass, PatternParam.class, "PatternParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedParamListEClass, TypedParamList.class, "TypedParamList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedParamList_Params(), this.getTypedParam(), null, "params", null, 0, -1, TypedParamList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedParamEClass, TypedParam.class, "TypedParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedParam_Type(), this.getVarType(), null, "type", null, 0, 1, TypedParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(counterEClass, Counter.class, "Counter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCounter_Range(), this.getSubrange(), null, "range", null, 0, 1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCounter_Initial(), this.getTemporalExpression(), null, "initial", null, 0, -1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCounter_ResetPred(), this.getTemporalExpression(), null, "resetPred", null, 0, -1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCounter_IncPred(), this.getTemporalExpression(), null, "incPred", null, 0, -1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCounter_DecPred(), this.getTemporalExpression(), null, "decPred", null, 0, -1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCounter_OverflowMethod(), this.getOverflowMethod(), "overflowMethod", null, 0, -1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCounter_UnderflowMethod(), this.getOverflowMethod(), "underflowMethod", null, 0, -1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monitorEClass, Monitor.class, "Monitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonitor_Type(), this.getVarType(), null, "type", null, 0, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitor_Initial(), this.getTemporalExpression(), null, "initial", null, 0, -1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitor_Safety(), this.getTemporalExpression(), null, "safety", null, 0, -1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitor_StateInv(), this.getTemporalExpression(), null, "stateInv", null, 0, -1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Params(), this.getPatternParamList(), null, "params", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_VarDeclList(), this.getVarDecl(), null, "varDeclList", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Initial(), this.getTemporalExpression(), null, "initial", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Safety(), this.getTemporalExpression(), null, "safety", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_StateInv(), this.getTemporalExpression(), null, "stateInv", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Justice(), this.getTemporalExpression(), null, "justice", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredicate_Name(), ecorePackage.getEString(), "name", null, 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicate_Params(), this.getTypedParamList(), null, "params", null, 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicate_Body(), this.getTemporalExpression(), null, "body", null, 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varTypeEClass, VarType.class, "VarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarType_Name(), ecorePackage.getEString(), "name", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarType_Subr(), this.getSubrange(), null, "subr", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarType_Const(), this.getTypeConstant(), null, "const", null, 0, -1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarType_Type(), this.getTypeDef(), null, "type", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarType_Dimensions(), this.getSizeDefineDecl(), null, "dimensions", null, 0, -1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ltlGarEClass, LTLGar.class, "LTLGar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLTLGar_Name(), ecorePackage.getEString(), "name", null, 0, 1, LTLGar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLTLGar_Params(), this.getTypedParamList(), null, "params", null, 0, 1, LTLGar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLTLGar_Safety(), ecorePackage.getEString(), "safety", null, 0, 1, LTLGar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLTLGar_StateInv(), ecorePackage.getEString(), "stateInv", null, 0, 1, LTLGar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLTLGar_Justice(), ecorePackage.getEString(), "justice", null, 0, 1, LTLGar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLTLGar_TemporalExpr(), this.getTemporalExpression(), null, "temporalExpr", null, 0, 1, LTLGar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLTLGar_Trig(), this.getTrigger(), null, "trig", null, 0, 1, LTLGar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ltlAsmEClass, LTLAsm.class, "LTLAsm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLTLAsm_Name(), ecorePackage.getEString(), "name", null, 0, 1, LTLAsm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLTLAsm_Params(), this.getTypedParamList(), null, "params", null, 0, 1, LTLAsm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLTLAsm_Safety(), ecorePackage.getEString(), "safety", null, 0, 1, LTLAsm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLTLAsm_StateInv(), ecorePackage.getEString(), "stateInv", null, 0, 1, LTLAsm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLTLAsm_Justice(), ecorePackage.getEString(), "justice", null, 0, 1, LTLAsm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLTLAsm_TemporalExpr(), this.getTemporalExpression(), null, "temporalExpr", null, 0, 1, LTLAsm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLTLAsm_Trig(), this.getTrigger(), null, "trig", null, 0, 1, LTLAsm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exGarEClass, EXGar.class, "EXGar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEXGar_Name(), ecorePackage.getEString(), "name", null, 0, 1, EXGar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEXGar_Elements(), this.getTemporalExpression(), null, "elements", null, 0, -1, EXGar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEXGar_RegExpPointer(), this.getDefineRegExpDecl(), null, "regExpPointer", null, 0, 1, EXGar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEXGar_RegExp(), this.getRegExp(), null, "regExp", null, 0, 1, EXGar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalExpressionEClass, TemporalExpression.class, "TemporalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predicateOrPatternReferrableEClass, PredicateOrPatternReferrable.class, "PredicateOrPatternReferrable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subrangeEClass, Subrange.class, "Subrange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubrange_From(), this.getSizeDefineDecl(), null, "from", null, 0, 1, Subrange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubrange_To(), this.getSizeDefineDecl(), null, "to", null, 0, 1, Subrange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_InitPointer(), this.getDefineRegExpDecl(), null, "initPointer", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_InitRegExp(), this.getRegExp(), null, "initRegExp", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_EffectPointer(), this.getDefineRegExpDecl(), null, "effectPointer", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_EffectRegExp(), this.getRegExp(), null, "effectRegExp", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regExpEClass, RegExp.class, "RegExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegExp_Val(), ecorePackage.getEString(), "val", null, 0, 1, RegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegExp_Assrt(), this.getBooleanTerm(), null, "assrt", null, 0, 1, RegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegExp_Empty(), ecorePackage.getEBoolean(), "empty", null, 0, 1, RegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegExp_Left(), this.getRegExp(), null, "left", null, 0, 1, RegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanTermEClass, BooleanTerm.class, "BooleanTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanTerm_RelExpr(), this.getTemporalExpression(), null, "relExpr", null, 0, 1, BooleanTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueInRangeEClass, ValueInRange.class, "ValueInRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueInRange_Const(), this.getTypeConstant(), null, "const", null, 0, 1, ValueInRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueInRange_Int(), ecorePackage.getEInt(), "int", null, 0, 1, ValueInRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueInRange_From(), ecorePackage.getEInt(), "from", null, 0, 1, ValueInRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueInRange_Multi(), ecorePackage.getEBoolean(), "multi", null, 0, 1, ValueInRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueInRange_To(), ecorePackage.getEInt(), "to", null, 0, 1, ValueInRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueInRange_BooleanValue(), ecorePackage.getEString(), "booleanValue", null, 0, 1, ValueInRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainVarDeclEClass, DomainVarDecl.class, "DomainVarDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainVarDecl_DomainType(), this.getVarType(), null, "domainType", null, 0, 1, DomainVarDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sizeDefineDeclEClass, SizeDefineDecl.class, "SizeDefineDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSizeDefineDecl_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SizeDefineDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSizeDefineDecl_Name(), this.getDefineDecl(), null, "name", null, 0, 1, SizeDefineDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSizeDefineDecl_ArithExp(), this.getTemporalExpression(), null, "arithExp", null, 0, 1, SizeDefineDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalInExprEClass, TemporalInExpr.class, "TemporalInExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalInExpr_Left(), this.getTemporalExpression(), null, "left", null, 0, 1, TemporalInExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalInExpr_Not(), ecorePackage.getEBoolean(), "not", null, 0, 1, TemporalInExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalInExpr_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, TemporalInExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalInExpr_Values(), this.getValueInRange(), null, "values", null, 0, -1, TemporalInExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalImpExprEClass, TemporalImpExpr.class, "TemporalImpExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalImpExpr_Left(), this.getTemporalExpression(), null, "left", null, 0, 1, TemporalImpExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalImpExpr_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, TemporalImpExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalImpExpr_Implication(), this.getTemporalExpression(), null, "implication", null, 0, 1, TemporalImpExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalIffExprEClass, TemporalIffExpr.class, "TemporalIffExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalIffExpr_Elements(), this.getTemporalExpression(), null, "elements", null, 0, -1, TemporalIffExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalIffExpr_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, TemporalIffExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalOrExprEClass, TemporalOrExpr.class, "TemporalOrExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalOrExpr_Elements(), this.getTemporalExpression(), null, "elements", null, 0, -1, TemporalOrExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalOrExpr_Operator(), ecorePackage.getEString(), "operator", null, 0, -1, TemporalOrExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalAndExprEClass, TemporalAndExpr.class, "TemporalAndExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalAndExpr_Elements(), this.getTemporalExpression(), null, "elements", null, 0, -1, TemporalAndExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalAndExpr_Operator(), ecorePackage.getEString(), "operator", null, 0, -1, TemporalAndExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalRelationalExprEClass, TemporalRelationalExpr.class, "TemporalRelationalExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalRelationalExpr_Left(), this.getTemporalExpression(), null, "left", null, 0, 1, TemporalRelationalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalRelationalExpr_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, TemporalRelationalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalRelationalExpr_Right(), this.getTemporalExpression(), null, "right", null, 0, 1, TemporalRelationalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalRemainderExprEClass, TemporalRemainderExpr.class, "TemporalRemainderExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalRemainderExpr_Left(), this.getTemporalExpression(), null, "left", null, 0, 1, TemporalRemainderExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalRemainderExpr_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, TemporalRemainderExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalRemainderExpr_Right(), this.getTemporalExpression(), null, "right", null, 0, 1, TemporalRemainderExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalAdditiveExprEClass, TemporalAdditiveExpr.class, "TemporalAdditiveExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalAdditiveExpr_Elements(), this.getTemporalExpression(), null, "elements", null, 0, -1, TemporalAdditiveExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalAdditiveExpr_Operator(), ecorePackage.getEString(), "operator", null, 0, -1, TemporalAdditiveExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalMultiplicativeExprEClass, TemporalMultiplicativeExpr.class, "TemporalMultiplicativeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalMultiplicativeExpr_Elements(), this.getTemporalExpression(), null, "elements", null, 0, -1, TemporalMultiplicativeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalMultiplicativeExpr_Operator(), ecorePackage.getEString(), "operator", null, 0, -1, TemporalMultiplicativeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalBinaryExprEClass, TemporalBinaryExpr.class, "TemporalBinaryExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalBinaryExpr_Elements(), this.getTemporalExpression(), null, "elements", null, 0, -1, TemporalBinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalBinaryExpr_Operator(), ecorePackage.getEString(), "operator", null, 0, -1, TemporalBinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalUnaryExprEClass, TemporalUnaryExpr.class, "TemporalUnaryExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporalUnaryExpr_Kinds(), ecorePackage.getEString(), "kinds", null, 0, 1, TemporalUnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalUnaryExpr_Tue(), this.getTemporalExpression(), null, "tue", null, 0, 1, TemporalUnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalPrimaryExprEClass, TemporalPrimaryExpr.class, "TemporalPrimaryExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalPrimaryExpr_PredPatt(), this.getPredicateOrPatternReferrable(), null, "predPatt", null, 0, 1, TemporalPrimaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalPrimaryExpr_PredPattParams(), this.getTemporalExpression(), null, "predPattParams", null, 0, -1, TemporalPrimaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalPrimaryExpr_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, TemporalPrimaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalPrimaryExpr_Tpe(), this.getTemporalExpression(), null, "tpe", null, 0, 1, TemporalPrimaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalPrimaryExpr_Pointer(), this.getReferrable(), null, "pointer", null, 0, 1, TemporalPrimaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalPrimaryExpr_Index(), this.getTemporalExpression(), null, "index", null, 0, -1, TemporalPrimaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalPrimaryExpr_TemporalExpression(), this.getTemporalExpression(), null, "temporalExpression", null, 0, 1, TemporalPrimaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalPrimaryExpr_Regexp(), this.getRegExp(), null, "regexp", null, 0, 1, TemporalPrimaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalPrimaryExpr_RegexpPointer(), this.getDefineRegExpDecl(), null, "regexpPointer", null, 0, 1, TemporalPrimaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstant_BooleanValue(), ecorePackage.getEString(), "booleanValue", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstant_IntegerValue(), ecorePackage.getEInt(), "integerValue", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryRegExpEClass, BinaryRegExp.class, "BinaryRegExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryRegExp_Op(), ecorePackage.getEString(), "op", null, 0, 1, BinaryRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryRegExp_Right(), this.getRegExp(), null, "right", null, 0, 1, BinaryRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryRegExpEClass, UnaryRegExp.class, "UnaryRegExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryRegExp_Kleened(), ecorePackage.getEBoolean(), "kleened", null, 0, 1, UnaryRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryRegExp_QuestionMark(), ecorePackage.getEBoolean(), "questionMark", null, 0, 1, UnaryRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryRegExp_Plus(), ecorePackage.getEBoolean(), "plus", null, 0, 1, UnaryRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryRegExp_HaveExactRepetition(), ecorePackage.getEBoolean(), "haveExactRepetition", null, 0, 1, UnaryRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryRegExp_ExactRepetition(), ecorePackage.getEInt(), "exactRepetition", null, 0, 1, UnaryRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryRegExp_HaveAtLeast(), ecorePackage.getEBoolean(), "haveAtLeast", null, 0, 1, UnaryRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryRegExp_AtLeast(), ecorePackage.getEInt(), "atLeast", null, 0, 1, UnaryRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryRegExp_HaveRange(), ecorePackage.getEBoolean(), "haveRange", null, 0, 1, UnaryRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryRegExp_From(), ecorePackage.getEInt(), "from", null, 0, 1, UnaryRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryRegExp_FromDefine(), this.getDefineDecl(), null, "fromDefine", null, 0, 1, UnaryRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryRegExp_To(), ecorePackage.getEInt(), "to", null, 0, 1, UnaryRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryRegExp_ToDefine(), this.getDefineDecl(), null, "toDefine", null, 0, 1, UnaryRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compRegExpEClass, CompRegExp.class, "CompRegExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompRegExp_Comp(), ecorePackage.getEString(), "comp", null, 0, 1, CompRegExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantifierExprEClass, QuantifierExpr.class, "QuantifierExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantifierExpr_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, QuantifierExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifierExpr_DomainVar(), this.getDomainVarDecl(), null, "domainVar", null, 0, 1, QuantifierExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifierExpr_TemporalExpr(), this.getTemporalExpression(), null, "temporalExpr", null, 0, 1, QuantifierExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(varOwnerEEnum, VarOwner.class, "VarOwner");
		addEEnumLiteral(varOwnerEEnum, VarOwner.SYS);
		addEEnumLiteral(varOwnerEEnum, VarOwner.ENV);
		addEEnumLiteral(varOwnerEEnum, VarOwner.AUX);

		initEEnum(overflowMethodEEnum, OverflowMethod.class, "OverflowMethod");
		addEEnumLiteral(overflowMethodEEnum, OverflowMethod.KEEP);
		addEEnumLiteral(overflowMethodEEnum, OverflowMethod.FALSE);
		addEEnumLiteral(overflowMethodEEnum, OverflowMethod.MODULO);

		// Create resource
		createResource(eNS_URI);
	}

} //SpectraPackageImpl
