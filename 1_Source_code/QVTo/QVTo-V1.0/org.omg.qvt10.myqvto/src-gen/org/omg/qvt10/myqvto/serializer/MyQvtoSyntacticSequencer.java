/*
 * generated by Xtext 2.25.0
 */
package org.omg.qvt10.myqvto.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.omg.qvt10.myqvto.services.MyQvtoGrammarAccess;

@SuppressWarnings("all")
public class MyQvtoSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyQvtoGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ClassifierFeatureList_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_ClassifierGO_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__;
	protected AbstractElementAlias match_ClassifierGO_SemicolonKeyword_1_1_3_q;
	protected AbstractElementAlias match_ClassifierInfo_ExceptionKeyword_2_or_PrimitiveKeyword_1_or___IntermediateKeyword_3_0_q_ClassKeyword_3_2__;
	protected AbstractElementAlias match_ClassifierInfo_IntermediateKeyword_3_0_q;
	protected AbstractElementAlias match_Constructor_SemicolonKeyword_1_1_1_q;
	protected AbstractElementAlias match_ContextualProperty_IntermediateKeyword_0_q;
	protected AbstractElementAlias match_EntryOperation_SemicolonKeyword_1_1_1_q;
	protected AbstractElementAlias match_EnumerationGO_SemicolonKeyword_2_1_4_q;
	protected AbstractElementAlias match_ExpressionList_SemicolonKeyword_1_q;
	protected AbstractElementAlias match_Helper_SemicolonKeyword_1_2_1_q;
	protected AbstractElementAlias match_Library_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__;
	protected AbstractElementAlias match_Library_SemicolonKeyword_1_1_3_q;
	protected AbstractElementAlias match_MappingBody_SemicolonKeyword_1_2_2_q;
	protected AbstractElementAlias match_MappingBody_SemicolonKeyword_3_2_2_q;
	protected AbstractElementAlias match_MappingBody___EndKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q;
	protected AbstractElementAlias match_MappingBody___InitKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__q;
	protected AbstractElementAlias match_MappingOperation_SemicolonKeyword_1_1_3_q;
	protected AbstractElementAlias match_MetaModelGO_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__;
	protected AbstractElementAlias match_MetaModelGO_SemicolonKeyword_1_1_3_q;
	protected AbstractElementAlias match_MetaModelHeader_MetamodelKeyword_0_0_or_PackageKeyword_0_1;
	protected AbstractElementAlias match_OperationalTransformation_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__;
	protected AbstractElementAlias match_OperationalTransformation_SemicolonKeyword_1_1_3_q;
	protected AbstractElementAlias match_OppositeProperty_TildeKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyQvtoGrammarAccess) access;
		match_ClassifierFeatureList_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getClassifierFeatureListAccess().getSemicolonKeyword_3());
		match_ClassifierGO_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getClassifierGOAccess().getLeftCurlyBracketKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getClassifierGOAccess().getRightCurlyBracketKeyword_1_1_2()), new TokenAlias(false, true, grammarAccess.getClassifierGOAccess().getSemicolonKeyword_1_1_3())), new TokenAlias(false, false, grammarAccess.getClassifierGOAccess().getSemicolonKeyword_1_0()));
		match_ClassifierGO_SemicolonKeyword_1_1_3_q = new TokenAlias(false, true, grammarAccess.getClassifierGOAccess().getSemicolonKeyword_1_1_3());
		match_ClassifierInfo_ExceptionKeyword_2_or_PrimitiveKeyword_1_or___IntermediateKeyword_3_0_q_ClassKeyword_3_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getClassifierInfoAccess().getIntermediateKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getClassifierInfoAccess().getClassKeyword_3_2())), new TokenAlias(false, false, grammarAccess.getClassifierInfoAccess().getExceptionKeyword_2()), new TokenAlias(false, false, grammarAccess.getClassifierInfoAccess().getPrimitiveKeyword_1()));
		match_ClassifierInfo_IntermediateKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getClassifierInfoAccess().getIntermediateKeyword_3_0());
		match_Constructor_SemicolonKeyword_1_1_1_q = new TokenAlias(false, true, grammarAccess.getConstructorAccess().getSemicolonKeyword_1_1_1());
		match_ContextualProperty_IntermediateKeyword_0_q = new TokenAlias(false, true, grammarAccess.getContextualPropertyAccess().getIntermediateKeyword_0());
		match_EntryOperation_SemicolonKeyword_1_1_1_q = new TokenAlias(false, true, grammarAccess.getEntryOperationAccess().getSemicolonKeyword_1_1_1());
		match_EnumerationGO_SemicolonKeyword_2_1_4_q = new TokenAlias(false, true, grammarAccess.getEnumerationGOAccess().getSemicolonKeyword_2_1_4());
		match_ExpressionList_SemicolonKeyword_1_q = new TokenAlias(false, true, grammarAccess.getExpressionListAccess().getSemicolonKeyword_1());
		match_Helper_SemicolonKeyword_1_2_1_q = new TokenAlias(false, true, grammarAccess.getHelperAccess().getSemicolonKeyword_1_2_1());
		match_Library_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_1_1_2()), new TokenAlias(false, true, grammarAccess.getLibraryAccess().getSemicolonKeyword_1_1_3())), new TokenAlias(false, false, grammarAccess.getLibraryAccess().getSemicolonKeyword_1_0()));
		match_Library_SemicolonKeyword_1_1_3_q = new TokenAlias(false, true, grammarAccess.getLibraryAccess().getSemicolonKeyword_1_1_3());
		match_MappingBody_SemicolonKeyword_1_2_2_q = new TokenAlias(false, true, grammarAccess.getMappingBodyAccess().getSemicolonKeyword_1_2_2());
		match_MappingBody_SemicolonKeyword_3_2_2_q = new TokenAlias(false, true, grammarAccess.getMappingBodyAccess().getSemicolonKeyword_3_2_2());
		match_MappingBody___EndKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMappingBodyAccess().getEndKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getMappingBodyAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getMappingBodyAccess().getRightCurlyBracketKeyword_3_3()));
		match_MappingBody___InitKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMappingBodyAccess().getInitKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getMappingBodyAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getMappingBodyAccess().getRightCurlyBracketKeyword_1_3()));
		match_MappingOperation_SemicolonKeyword_1_1_3_q = new TokenAlias(false, true, grammarAccess.getMappingOperationAccess().getSemicolonKeyword_1_1_3());
		match_MetaModelGO_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMetaModelGOAccess().getLeftCurlyBracketKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getMetaModelGOAccess().getRightCurlyBracketKeyword_1_1_2()), new TokenAlias(false, true, grammarAccess.getMetaModelGOAccess().getSemicolonKeyword_1_1_3())), new TokenAlias(false, false, grammarAccess.getMetaModelGOAccess().getSemicolonKeyword_1_0()));
		match_MetaModelGO_SemicolonKeyword_1_1_3_q = new TokenAlias(false, true, grammarAccess.getMetaModelGOAccess().getSemicolonKeyword_1_1_3());
		match_MetaModelHeader_MetamodelKeyword_0_0_or_PackageKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMetaModelHeaderAccess().getMetamodelKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getMetaModelHeaderAccess().getPackageKeyword_0_1()));
		match_OperationalTransformation_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getOperationalTransformationAccess().getLeftCurlyBracketKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getOperationalTransformationAccess().getRightCurlyBracketKeyword_1_1_2()), new TokenAlias(false, true, grammarAccess.getOperationalTransformationAccess().getSemicolonKeyword_1_1_3())), new TokenAlias(false, false, grammarAccess.getOperationalTransformationAccess().getSemicolonKeyword_1_0()));
		match_OperationalTransformation_SemicolonKeyword_1_1_3_q = new TokenAlias(false, true, grammarAccess.getOperationalTransformationAccess().getSemicolonKeyword_1_1_3());
		match_OppositeProperty_TildeKeyword_2_q = new TokenAlias(false, true, grammarAccess.getOppositePropertyAccess().getTildeKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ClassifierFeatureList_SemicolonKeyword_3_q.equals(syntax))
				emit_ClassifierFeatureList_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ClassifierGO_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__.equals(syntax))
				emit_ClassifierGO_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ClassifierGO_SemicolonKeyword_1_1_3_q.equals(syntax))
				emit_ClassifierGO_SemicolonKeyword_1_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ClassifierInfo_ExceptionKeyword_2_or_PrimitiveKeyword_1_or___IntermediateKeyword_3_0_q_ClassKeyword_3_2__.equals(syntax))
				emit_ClassifierInfo_ExceptionKeyword_2_or_PrimitiveKeyword_1_or___IntermediateKeyword_3_0_q_ClassKeyword_3_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ClassifierInfo_IntermediateKeyword_3_0_q.equals(syntax))
				emit_ClassifierInfo_IntermediateKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Constructor_SemicolonKeyword_1_1_1_q.equals(syntax))
				emit_Constructor_SemicolonKeyword_1_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ContextualProperty_IntermediateKeyword_0_q.equals(syntax))
				emit_ContextualProperty_IntermediateKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EntryOperation_SemicolonKeyword_1_1_1_q.equals(syntax))
				emit_EntryOperation_SemicolonKeyword_1_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EnumerationGO_SemicolonKeyword_2_1_4_q.equals(syntax))
				emit_EnumerationGO_SemicolonKeyword_2_1_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ExpressionList_SemicolonKeyword_1_q.equals(syntax))
				emit_ExpressionList_SemicolonKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Helper_SemicolonKeyword_1_2_1_q.equals(syntax))
				emit_Helper_SemicolonKeyword_1_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Library_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__.equals(syntax))
				emit_Library_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Library_SemicolonKeyword_1_1_3_q.equals(syntax))
				emit_Library_SemicolonKeyword_1_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MappingBody_SemicolonKeyword_1_2_2_q.equals(syntax))
				emit_MappingBody_SemicolonKeyword_1_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MappingBody_SemicolonKeyword_3_2_2_q.equals(syntax))
				emit_MappingBody_SemicolonKeyword_3_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MappingBody___EndKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_MappingBody___EndKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MappingBody___InitKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__q.equals(syntax))
				emit_MappingBody___InitKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MappingOperation_SemicolonKeyword_1_1_3_q.equals(syntax))
				emit_MappingOperation_SemicolonKeyword_1_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MetaModelGO_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__.equals(syntax))
				emit_MetaModelGO_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MetaModelGO_SemicolonKeyword_1_1_3_q.equals(syntax))
				emit_MetaModelGO_SemicolonKeyword_1_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MetaModelHeader_MetamodelKeyword_0_0_or_PackageKeyword_0_1.equals(syntax))
				emit_MetaModelHeader_MetamodelKeyword_0_0_or_PackageKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OperationalTransformation_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__.equals(syntax))
				emit_OperationalTransformation_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OperationalTransformation_SemicolonKeyword_1_1_3_q.equals(syntax))
				emit_OperationalTransformation_SemicolonKeyword_1_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OppositeProperty_TildeKeyword_2_q.equals(syntax))
				emit_OppositeProperty_TildeKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     classifier_feature+=ClassifierFeature (ambiguity) (rule end)
	 */
	protected void emit_ClassifierFeatureList_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';' | ('{' '}' ';'?)
	 *
	 * This ambiguous syntax occurs at:
	 *     classifier_h=ClassifierHeader (ambiguity) (rule end)
	 */
	protected void emit_ClassifierGO_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     classifier_feature_list=ClassifierFeatureList '}' (ambiguity) (rule end)
	 */
	protected void emit_ClassifierGO_SemicolonKeyword_1_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'primitive' | 'exception' | ('intermediate'? 'class')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_ClassifierInfo_ExceptionKeyword_2_or_PrimitiveKeyword_1_or___IntermediateKeyword_3_0_q_ClassKeyword_3_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'intermediate'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) qualifier+=GeneralQualifier
	 */
	protected void emit_ClassifierInfo_IntermediateKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expression_block=ExpressionBlock (ambiguity) (rule end)
	 */
	protected void emit_Constructor_SemicolonKeyword_1_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'intermediate'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) property_key+=PropertyKey
	 */
	protected void emit_ContextualProperty_IntermediateKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expression_block=ExpressionBlock (ambiguity) (rule end)
	 */
	protected void emit_EntryOperation_SemicolonKeyword_1_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     identifier+=EString '}' (ambiguity) (rule end)
	 */
	protected void emit_EnumerationGO_SemicolonKeyword_2_1_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expression_semi_list=ExpressionSemiList (ambiguity) (rule end)
	 */
	protected void emit_ExpressionList_SemicolonKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expression_block=ExpressionBlock (ambiguity) (rule end)
	 */
	protected void emit_Helper_SemicolonKeyword_1_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';' | ('{' '}' ';'?)
	 *
	 * This ambiguous syntax occurs at:
	 *     library_h=LibraryHeader (ambiguity) (rule end)
	 */
	protected void emit_Library_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     module_element+=ImperativeOperation '}' (ambiguity) (rule end)
	 */
	protected void emit_Library_SemicolonKeyword_1_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     initSection+=ExpressionGO (ambiguity) '}' 'end' '{' endSection+=ExpressionGO
	 *     initSection+=ExpressionGO (ambiguity) '}' ('end' '{' '}')? (rule end)
	 *     initSection+=ExpressionGO (ambiguity) '}' population_section=PopulationSection
	 */
	protected void emit_MappingBody_SemicolonKeyword_1_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     endSection+=ExpressionGO (ambiguity) '}' (rule end)
	 */
	protected void emit_MappingBody_SemicolonKeyword_3_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('end' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('init' '{' '}')? (ambiguity) (rule start)
	 *     initSection+=ExpressionGO ';'? '}' (ambiguity) (rule end)
	 *     population_section=PopulationSection (ambiguity) (rule end)
	 */
	protected void emit_MappingBody___EndKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('init' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'end' '{' endSection+=ExpressionGO
	 *     (rule start) (ambiguity) ('end' '{' '}')? (rule start)
	 *     (rule start) (ambiguity) population_section=PopulationSection
	 */
	protected void emit_MappingBody___InitKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     mapping_body=MappingBody '}' (ambiguity) (rule end)
	 */
	protected void emit_MappingOperation_SemicolonKeyword_1_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';' | ('{' '}' ';'?)
	 *
	 * This ambiguous syntax occurs at:
	 *     metamodel_h=MetaModelHeader (ambiguity) (rule end)
	 */
	protected void emit_MetaModelGO_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     metamodel_element+=MetaModelElement '}' (ambiguity) (rule end)
	 */
	protected void emit_MetaModelGO_SemicolonKeyword_1_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'metamodel' | 'package'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) scoped_identifier=ScopedIdentifier
	 */
	protected void emit_MetaModelHeader_MetamodelKeyword_0_0_or_PackageKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';' | ('{' '}' ';'?)
	 *
	 * This ambiguous syntax occurs at:
	 *     transformation_h=TransformationHeader (ambiguity) (rule end)
	 */
	protected void emit_OperationalTransformation_SemicolonKeyword_1_0_or___LeftCurlyBracketKeyword_1_1_0_RightCurlyBracketKeyword_1_1_2_SemicolonKeyword_1_1_3_q__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     module_element+=ImperativeOperation '}' (ambiguity) (rule end)
	 */
	protected void emit_OperationalTransformation_SemicolonKeyword_1_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '~'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'opposites' (ambiguity) name=ID
	 */
	protected void emit_OppositeProperty_TildeKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
