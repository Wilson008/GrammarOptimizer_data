/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydot.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydot.ide.contentassist.antlr.internal.InternalMyDotParser;
import org.xtext.example.mydot.services.MyDotGrammarAccess;

public class MyDotParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDotGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDotGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStmtAccess().getAlternatives_0(), "rule__Stmt__Alternatives_0");
			builder.put(grammarAccess.getEdgeRhsAccess().getAlternatives(), "rule__EdgeRhs__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getAttrListAccess().getAlternatives_2_1(), "rule__AttrList__Alternatives_2_1");
			builder.put(grammarAccess.getPortAccess().getAlternatives_2(), "rule__Port__Alternatives_2");
			builder.put(grammarAccess.getGraphTypeAccess().getAlternatives(), "rule__GraphType__Alternatives");
			builder.put(grammarAccess.getEdgeOpAccess().getAlternatives(), "rule__EdgeOp__Alternatives");
			builder.put(grammarAccess.getAttributeTypeAccess().getAlternatives(), "rule__AttributeType__Alternatives");
			builder.put(grammarAccess.getDotAstAccess().getGroup(), "rule__DotAst__Group__0");
			builder.put(grammarAccess.getStmtAccess().getGroup(), "rule__Stmt__Group__0");
			builder.put(grammarAccess.getDotGraphAccess().getGroup(), "rule__DotGraph__Group__0");
			builder.put(grammarAccess.getEdgeStmtNodeAccess().getGroup(), "rule__EdgeStmtNode__Group__0");
			builder.put(grammarAccess.getEdgeStmtSubgraphAccess().getGroup(), "rule__EdgeStmtSubgraph__Group__0");
			builder.put(grammarAccess.getNodeStmtAccess().getGroup(), "rule__NodeStmt__Group__0");
			builder.put(grammarAccess.getAttrStmtAccess().getGroup(), "rule__AttrStmt__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getGroup(), "rule__SubgraphOrEdgeStmtSubgraph__Group__0");
			builder.put(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getGroup_1(), "rule__SubgraphOrEdgeStmtSubgraph__Group_1__0");
			builder.put(grammarAccess.getSubgraphAccess().getGroup(), "rule__Subgraph__Group__0");
			builder.put(grammarAccess.getSubgraphAccess().getGroup_1(), "rule__Subgraph__Group_1__0");
			builder.put(grammarAccess.getNodeIdAccess().getGroup(), "rule__NodeId__Group__0");
			builder.put(grammarAccess.getAttrListAccess().getGroup(), "rule__AttrList__Group__0");
			builder.put(grammarAccess.getAttrListAccess().getGroup_2(), "rule__AttrList__Group_2__0");
			builder.put(grammarAccess.getPortAccess().getGroup(), "rule__Port__Group__0");
			builder.put(grammarAccess.getPortAccess().getGroup_2_2(), "rule__Port__Group_2_2__0");
			builder.put(grammarAccess.getEdgeRhsNodeAccess().getGroup(), "rule__EdgeRhsNode__Group__0");
			builder.put(grammarAccess.getEdgeRhsSubgraphAccess().getGroup(), "rule__EdgeRhsSubgraph__Group__0");
			builder.put(grammarAccess.getDotAstAccess().getGraphsAssignment_1(), "rule__DotAst__GraphsAssignment_1");
			builder.put(grammarAccess.getDotGraphAccess().getStrictAssignment_1(), "rule__DotGraph__StrictAssignment_1");
			builder.put(grammarAccess.getDotGraphAccess().getTypeAssignment_2(), "rule__DotGraph__TypeAssignment_2");
			builder.put(grammarAccess.getDotGraphAccess().getNameAssignment_3(), "rule__DotGraph__NameAssignment_3");
			builder.put(grammarAccess.getDotGraphAccess().getStmtsAssignment_5(), "rule__DotGraph__StmtsAssignment_5");
			builder.put(grammarAccess.getEdgeStmtNodeAccess().getNodeAssignment_1(), "rule__EdgeStmtNode__NodeAssignment_1");
			builder.put(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSAssignment_2(), "rule__EdgeStmtNode__EdgeRHSAssignment_2");
			builder.put(grammarAccess.getEdgeStmtNodeAccess().getAttrListsAssignment_3(), "rule__EdgeStmtNode__AttrListsAssignment_3");
			builder.put(grammarAccess.getEdgeStmtSubgraphAccess().getSubgraphAssignment_1(), "rule__EdgeStmtSubgraph__SubgraphAssignment_1");
			builder.put(grammarAccess.getEdgeStmtSubgraphAccess().getEdgeRHSAssignment_2(), "rule__EdgeStmtSubgraph__EdgeRHSAssignment_2");
			builder.put(grammarAccess.getEdgeStmtSubgraphAccess().getAttrListsAssignment_3(), "rule__EdgeStmtSubgraph__AttrListsAssignment_3");
			builder.put(grammarAccess.getNodeStmtAccess().getNodeAssignment_1(), "rule__NodeStmt__NodeAssignment_1");
			builder.put(grammarAccess.getNodeStmtAccess().getAttrListsAssignment_2(), "rule__NodeStmt__AttrListsAssignment_2");
			builder.put(grammarAccess.getAttrStmtAccess().getTypeAssignment_1(), "rule__AttrStmt__TypeAssignment_1");
			builder.put(grammarAccess.getAttrStmtAccess().getAttrListsAssignment_2(), "rule__AttrStmt__AttrListsAssignment_2");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getValueAssignment_3(), "rule__Attribute__ValueAssignment_3");
			builder.put(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSAssignment_1_1(), "rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1");
			builder.put(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getAttrListsAssignment_1_2(), "rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2");
			builder.put(grammarAccess.getSubgraphAccess().getNameAssignment_1_1(), "rule__Subgraph__NameAssignment_1_1");
			builder.put(grammarAccess.getSubgraphAccess().getStmtsAssignment_3(), "rule__Subgraph__StmtsAssignment_3");
			builder.put(grammarAccess.getNodeIdAccess().getNameAssignment_1(), "rule__NodeId__NameAssignment_1");
			builder.put(grammarAccess.getNodeIdAccess().getPortAssignment_2(), "rule__NodeId__PortAssignment_2");
			builder.put(grammarAccess.getAttrListAccess().getAttributesAssignment_2_0(), "rule__AttrList__AttributesAssignment_2_0");
			builder.put(grammarAccess.getPortAccess().getCompass_ptAssignment_2_0(), "rule__Port__Compass_ptAssignment_2_0");
			builder.put(grammarAccess.getPortAccess().getNameAssignment_2_1(), "rule__Port__NameAssignment_2_1");
			builder.put(grammarAccess.getPortAccess().getNameAssignment_2_2_0(), "rule__Port__NameAssignment_2_2_0");
			builder.put(grammarAccess.getPortAccess().getCompass_ptAssignment_2_2_2(), "rule__Port__Compass_ptAssignment_2_2_2");
			builder.put(grammarAccess.getEdgeRhsNodeAccess().getOpAssignment_1(), "rule__EdgeRhsNode__OpAssignment_1");
			builder.put(grammarAccess.getEdgeRhsNodeAccess().getNodeAssignment_2(), "rule__EdgeRhsNode__NodeAssignment_2");
			builder.put(grammarAccess.getEdgeRhsSubgraphAccess().getOpAssignment_1(), "rule__EdgeRhsSubgraph__OpAssignment_1");
			builder.put(grammarAccess.getEdgeRhsSubgraphAccess().getSubgraphAssignment_2(), "rule__EdgeRhsSubgraph__SubgraphAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDotGrammarAccess grammarAccess;

	@Override
	protected InternalMyDotParser createParser() {
		InternalMyDotParser result = new InternalMyDotParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDotGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
