/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.myxenia.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyXeniaGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myxenia.MyXenia.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cHeadersAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cHeadersHeaderParserRuleCall_0_0 = (RuleCall)cHeadersAssignment_0.eContents().get(0);
		private final Assignment cEntitiesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEntitiesEntityParserRuleCall_1_0 = (RuleCall)cEntitiesAssignment_1.eContents().get(0);
		private final Assignment cMapped_entitiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMapped_entitiesMappedEntityParserRuleCall_2_0 = (RuleCall)cMapped_entitiesAssignment_2.eContents().get(0);
		
		//Model:
		//    headers+=Header
		//    entities+=Entity*
		//    mapped_entities+=MappedEntity*;
		@Override public ParserRule getRule() { return rule; }
		
		//headers+=Header
		//entities+=Entity*
		//mapped_entities+=MappedEntity*
		public Group getGroup() { return cGroup; }
		
		//headers+=Header
		public Assignment getHeadersAssignment_0() { return cHeadersAssignment_0; }
		
		//Header
		public RuleCall getHeadersHeaderParserRuleCall_0_0() { return cHeadersHeaderParserRuleCall_0_0; }
		
		//entities+=Entity*
		public Assignment getEntitiesAssignment_1() { return cEntitiesAssignment_1; }
		
		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_1_0() { return cEntitiesEntityParserRuleCall_1_0; }
		
		//mapped_entities+=MappedEntity*
		public Assignment getMapped_entitiesAssignment_2() { return cMapped_entitiesAssignment_2; }
		
		//MappedEntity
		public RuleCall getMapped_entitiesMappedEntityParserRuleCall_2_0() { return cMapped_entitiesMappedEntityParserRuleCall_2_0; }
	}
	public class HeaderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myxenia.MyXenia.Header");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAppKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAppNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAppNameIDTerminalRuleCall_1_0 = (RuleCall)cAppNameAssignment_1.eContents().get(0);
		private final Keyword cHasKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cPagesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSitesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSitesSuperSiteParserRuleCall_5_0 = (RuleCall)cSitesAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cSitesAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cSitesSuperSiteParserRuleCall_6_1_0 = (RuleCall)cSitesAssignment_6_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Header:
		//    'app' appName=ID 'has' 'pages' '['
		//        sites+=SuperSite (',' sites+=SuperSite)*
		//    ']'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'app' appName=ID 'has' 'pages' '['
		//    sites+=SuperSite (',' sites+=SuperSite)*
		//']'
		public Group getGroup() { return cGroup; }
		
		//'app'
		public Keyword getAppKeyword_0() { return cAppKeyword_0; }
		
		//appName=ID
		public Assignment getAppNameAssignment_1() { return cAppNameAssignment_1; }
		
		//ID
		public RuleCall getAppNameIDTerminalRuleCall_1_0() { return cAppNameIDTerminalRuleCall_1_0; }
		
		//'has'
		public Keyword getHasKeyword_2() { return cHasKeyword_2; }
		
		//'pages'
		public Keyword getPagesKeyword_3() { return cPagesKeyword_3; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_4() { return cLeftSquareBracketKeyword_4; }
		
		//sites+=SuperSite
		public Assignment getSitesAssignment_5() { return cSitesAssignment_5; }
		
		//SuperSite
		public RuleCall getSitesSuperSiteParserRuleCall_5_0() { return cSitesSuperSiteParserRuleCall_5_0; }
		
		//(',' sites+=SuperSite)*
		public Group getGroup_6() { return cGroup_6; }
		
		//','
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//sites+=SuperSite
		public Assignment getSitesAssignment_6_1() { return cSitesAssignment_6_1; }
		
		//SuperSite
		public RuleCall getSitesSuperSiteParserRuleCall_6_1_0() { return cSitesSuperSiteParserRuleCall_6_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_7() { return cRightSquareBracketKeyword_7; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myxenia.MyXenia.Entity");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cWithKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cTechAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cTechSTRINGTerminalRuleCall_0_2_0 = (RuleCall)cTechAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cXmlKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cPathAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cPathSTRINGTerminalRuleCall_1_2_0 = (RuleCall)cPathAssignment_1_2.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cModeKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cColonKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cModeAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cModeModeEnumRuleCall_2_2_0 = (RuleCall)cModeAssignment_2_2.eContents().get(0);
		
		//Entity:
		//    'with'     ':' tech=STRING |
		//    'xml'     ':' path=STRING |
		//    'mode'     ':' mode=Mode
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'with'     ':' tech=STRING |
		//'xml'     ':' path=STRING |
		//'mode'     ':' mode=Mode
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'with' 	':' tech=STRING
		public Group getGroup_0() { return cGroup_0; }
		
		//'with'
		public Keyword getWithKeyword_0_0() { return cWithKeyword_0_0; }
		
		//':'
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//tech=STRING
		public Assignment getTechAssignment_0_2() { return cTechAssignment_0_2; }
		
		//STRING
		public RuleCall getTechSTRINGTerminalRuleCall_0_2_0() { return cTechSTRINGTerminalRuleCall_0_2_0; }
		
		//'xml' 	':' path=STRING
		public Group getGroup_1() { return cGroup_1; }
		
		//'xml'
		public Keyword getXmlKeyword_1_0() { return cXmlKeyword_1_0; }
		
		//':'
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }
		
		//path=STRING
		public Assignment getPathAssignment_1_2() { return cPathAssignment_1_2; }
		
		//STRING
		public RuleCall getPathSTRINGTerminalRuleCall_1_2_0() { return cPathSTRINGTerminalRuleCall_1_2_0; }
		
		//'mode' 	':' mode=Mode
		public Group getGroup_2() { return cGroup_2; }
		
		//'mode'
		public Keyword getModeKeyword_2_0() { return cModeKeyword_2_0; }
		
		//':'
		public Keyword getColonKeyword_2_1() { return cColonKeyword_2_1; }
		
		//mode=Mode
		public Assignment getModeAssignment_2_2() { return cModeAssignment_2_2; }
		
		//Mode
		public RuleCall getModeModeEnumRuleCall_2_2_0() { return cModeModeEnumRuleCall_2_2_0; }
	}
	public class SuperSiteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myxenia.MyXenia.SuperSite");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSiteParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSiteWithModalParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//SuperSite:
		//    Site | SiteWithModal
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Site | SiteWithModal
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Site
		public RuleCall getSiteParserRuleCall_0() { return cSiteParserRuleCall_0; }
		
		//SiteWithModal
		public RuleCall getSiteWithModalParserRuleCall_1() { return cSiteWithModalParserRuleCall_1; }
	}
	public class SiteWithModalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myxenia.MyXenia.SiteWithModal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cWithKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cModalKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSitesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSitesSuperSiteParserRuleCall_5_0 = (RuleCall)cSitesAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cSitesAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cSitesSuperSiteParserRuleCall_6_1_0 = (RuleCall)cSitesAssignment_6_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//SiteWithModal:
		//    '@' name=ID 'with' 'modal' '(' sites+=SuperSite (',' sites+=SuperSite)* ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'@' name=ID 'with' 'modal' '(' sites+=SuperSite (',' sites+=SuperSite)* ')'
		public Group getGroup() { return cGroup; }
		
		//'@'
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'with'
		public Keyword getWithKeyword_2() { return cWithKeyword_2; }
		
		//'modal'
		public Keyword getModalKeyword_3() { return cModalKeyword_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//sites+=SuperSite
		public Assignment getSitesAssignment_5() { return cSitesAssignment_5; }
		
		//SuperSite
		public RuleCall getSitesSuperSiteParserRuleCall_5_0() { return cSitesSuperSiteParserRuleCall_5_0; }
		
		//(',' sites+=SuperSite)*
		public Group getGroup_6() { return cGroup_6; }
		
		//','
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//sites+=SuperSite
		public Assignment getSitesAssignment_6_1() { return cSitesAssignment_6_1; }
		
		//SuperSite
		public RuleCall getSitesSuperSiteParserRuleCall_6_1_0() { return cSitesSuperSiteParserRuleCall_6_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
	}
	public class MappedEntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myxenia.MyXenia.MappedEntity");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cInfoKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cInfoPropsAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cInfoPropsInfoPropertyParserRuleCall_0_3_0 = (RuleCall)cInfoPropsAssignment_0_3.eContents().get(0);
		private final Group cGroup_0_4 = (Group)cGroup_0.eContents().get(4);
		private final Keyword cCommaKeyword_0_4_0 = (Keyword)cGroup_0_4.eContents().get(0);
		private final Assignment cInfoPropsAssignment_0_4_1 = (Assignment)cGroup_0_4.eContents().get(1);
		private final RuleCall cInfoPropsInfoPropertyParserRuleCall_0_4_1_0 = (RuleCall)cInfoPropsAssignment_0_4_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_0_5 = (Keyword)cGroup_0.eContents().get(5);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cMapKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cLinkedPropsAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cLinkedPropsLinkedPropertyParserRuleCall_1_3_0 = (RuleCall)cLinkedPropsAssignment_1_3.eContents().get(0);
		private final Group cGroup_1_4 = (Group)cGroup_1.eContents().get(4);
		private final Keyword cCommaKeyword_1_4_0 = (Keyword)cGroup_1_4.eContents().get(0);
		private final Assignment cLinkedPropsAssignment_1_4_1 = (Assignment)cGroup_1_4.eContents().get(1);
		private final RuleCall cLinkedPropsLinkedPropertyParserRuleCall_1_4_1_0 = (RuleCall)cLinkedPropsAssignment_1_4_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_5 = (Keyword)cGroup_1.eContents().get(5);
		
		//MappedEntity:
		//    'info' ':' '[' infoProps+=InfoProperty (',' infoProps+=InfoProperty)* ']'    |
		//    'map'  ':' '[' linkedProps+=LinkedProperty (',' linkedProps+=LinkedProperty)* ']'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'info' ':' '[' infoProps+=InfoProperty (',' infoProps+=InfoProperty)* ']'    |
		//'map'  ':' '[' linkedProps+=LinkedProperty (',' linkedProps+=LinkedProperty)* ']'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'info' ':' '[' infoProps+=InfoProperty (',' infoProps+=InfoProperty)* ']'
		public Group getGroup_0() { return cGroup_0; }
		
		//'info'
		public Keyword getInfoKeyword_0_0() { return cInfoKeyword_0_0; }
		
		//':'
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0_2() { return cLeftSquareBracketKeyword_0_2; }
		
		//infoProps+=InfoProperty
		public Assignment getInfoPropsAssignment_0_3() { return cInfoPropsAssignment_0_3; }
		
		//InfoProperty
		public RuleCall getInfoPropsInfoPropertyParserRuleCall_0_3_0() { return cInfoPropsInfoPropertyParserRuleCall_0_3_0; }
		
		//(',' infoProps+=InfoProperty)*
		public Group getGroup_0_4() { return cGroup_0_4; }
		
		//','
		public Keyword getCommaKeyword_0_4_0() { return cCommaKeyword_0_4_0; }
		
		//infoProps+=InfoProperty
		public Assignment getInfoPropsAssignment_0_4_1() { return cInfoPropsAssignment_0_4_1; }
		
		//InfoProperty
		public RuleCall getInfoPropsInfoPropertyParserRuleCall_0_4_1_0() { return cInfoPropsInfoPropertyParserRuleCall_0_4_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_0_5() { return cRightSquareBracketKeyword_0_5; }
		
		//'map'  ':' '[' linkedProps+=LinkedProperty (',' linkedProps+=LinkedProperty)* ']'
		public Group getGroup_1() { return cGroup_1; }
		
		//'map'
		public Keyword getMapKeyword_1_0() { return cMapKeyword_1_0; }
		
		//':'
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_2() { return cLeftSquareBracketKeyword_1_2; }
		
		//linkedProps+=LinkedProperty
		public Assignment getLinkedPropsAssignment_1_3() { return cLinkedPropsAssignment_1_3; }
		
		//LinkedProperty
		public RuleCall getLinkedPropsLinkedPropertyParserRuleCall_1_3_0() { return cLinkedPropsLinkedPropertyParserRuleCall_1_3_0; }
		
		//(',' linkedProps+=LinkedProperty)*
		public Group getGroup_1_4() { return cGroup_1_4; }
		
		//','
		public Keyword getCommaKeyword_1_4_0() { return cCommaKeyword_1_4_0; }
		
		//linkedProps+=LinkedProperty
		public Assignment getLinkedPropsAssignment_1_4_1() { return cLinkedPropsAssignment_1_4_1; }
		
		//LinkedProperty
		public RuleCall getLinkedPropsLinkedPropertyParserRuleCall_1_4_1_0() { return cLinkedPropsLinkedPropertyParserRuleCall_1_4_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_5() { return cRightSquareBracketKeyword_1_5; }
	}
	public class InfoPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myxenia.MyXenia.InfoProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPageAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPageSiteCrossReference_0_0 = (CrossReference)cPageAssignment_0.eContents().get(0);
		private final RuleCall cPageSiteIDTerminalRuleCall_0_0_1 = (RuleCall)cPageSiteCrossReference_0_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEntitiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEntitiesInfoEntityParserRuleCall_2_0 = (RuleCall)cEntitiesAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cEntitiesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cEntitiesInfoEntityParserRuleCall_3_1_0 = (RuleCall)cEntitiesAssignment_3_1.eContents().get(0);
		
		//InfoProperty:
		//    page=[Site] '->' entities+=InfoEntity (',' entities+=InfoEntity)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//page=[Site] '->' entities+=InfoEntity (',' entities+=InfoEntity)*
		public Group getGroup() { return cGroup; }
		
		//page=[Site]
		public Assignment getPageAssignment_0() { return cPageAssignment_0; }
		
		//[Site]
		public CrossReference getPageSiteCrossReference_0_0() { return cPageSiteCrossReference_0_0; }
		
		//ID
		public RuleCall getPageSiteIDTerminalRuleCall_0_0_1() { return cPageSiteIDTerminalRuleCall_0_0_1; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }
		
		//entities+=InfoEntity
		public Assignment getEntitiesAssignment_2() { return cEntitiesAssignment_2; }
		
		//InfoEntity
		public RuleCall getEntitiesInfoEntityParserRuleCall_2_0() { return cEntitiesInfoEntityParserRuleCall_2_0; }
		
		//(',' entities+=InfoEntity)*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//entities+=InfoEntity
		public Assignment getEntitiesAssignment_3_1() { return cEntitiesAssignment_3_1; }
		
		//InfoEntity
		public RuleCall getEntitiesInfoEntityParserRuleCall_3_1_0() { return cEntitiesInfoEntityParserRuleCall_3_1_0; }
	}
	public class InfoEntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myxenia.MyXenia.InfoEntity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEntriesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cEntriesInfoEntryEnumRuleCall_0_0 = (RuleCall)cEntriesAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cInfoValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cInfoValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cInfoValueAssignment_2.eContents().get(0);
		
		//InfoEntity:
		//    entries+=InfoEntry ':' infoValue=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//entries+=InfoEntry ':' infoValue=STRING
		public Group getGroup() { return cGroup; }
		
		//entries+=InfoEntry
		public Assignment getEntriesAssignment_0() { return cEntriesAssignment_0; }
		
		//InfoEntry
		public RuleCall getEntriesInfoEntryEnumRuleCall_0_0() { return cEntriesInfoEntryEnumRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//infoValue=STRING
		public Assignment getInfoValueAssignment_2() { return cInfoValueAssignment_2; }
		
		//STRING
		public RuleCall getInfoValueSTRINGTerminalRuleCall_2_0() { return cInfoValueSTRINGTerminalRuleCall_2_0; }
	}
	public class SiteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myxenia.MyXenia.Site");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Site:
		//    '@' name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'@' name=ID
		public Group getGroup() { return cGroup; }
		
		//'@'
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class LinkedPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myxenia.MyXenia.LinkedProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cNameSiteCrossReference_0_0 = (CrossReference)cNameAssignment_0.eContents().get(0);
		private final RuleCall cNameSiteIDTerminalRuleCall_0_0_1 = (RuleCall)cNameSiteCrossReference_0_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPageAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPageRedirectPageParserRuleCall_3_0 = (RuleCall)cPageAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//LinkedProperty:
		//    name=[Site] '->' '('  page=RedirectPage ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=[Site] '->' '('  page=RedirectPage ')'
		public Group getGroup() { return cGroup; }
		
		//name=[Site]
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//[Site]
		public CrossReference getNameSiteCrossReference_0_0() { return cNameSiteCrossReference_0_0; }
		
		//ID
		public RuleCall getNameSiteIDTerminalRuleCall_0_0_1() { return cNameSiteIDTerminalRuleCall_0_0_1; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//page=RedirectPage
		public Assignment getPageAssignment_3() { return cPageAssignment_3; }
		
		//RedirectPage
		public RuleCall getPageRedirectPageParserRuleCall_3_0() { return cPageRedirectPageParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class RedirectPageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myxenia.MyXenia.RedirectPage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSiteAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cSiteSiteCrossReference_0_0 = (CrossReference)cSiteAssignment_0.eContents().get(0);
		private final RuleCall cSiteSiteIDTerminalRuleCall_0_0_1 = (RuleCall)cSiteSiteCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSiteAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cSiteSiteCrossReference_1_1_0 = (CrossReference)cSiteAssignment_1_1.eContents().get(0);
		private final RuleCall cSiteSiteIDTerminalRuleCall_1_1_0_1 = (RuleCall)cSiteSiteCrossReference_1_1_0.eContents().get(1);
		
		//RedirectPage:
		//    (site+=[Site]) (',' site+=[Site])*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(site+=[Site]) (',' site+=[Site])*
		public Group getGroup() { return cGroup; }
		
		//(site+=[Site])
		public Assignment getSiteAssignment_0() { return cSiteAssignment_0; }
		
		//[Site]
		public CrossReference getSiteSiteCrossReference_0_0() { return cSiteSiteCrossReference_0_0; }
		
		//ID
		public RuleCall getSiteSiteIDTerminalRuleCall_0_0_1() { return cSiteSiteIDTerminalRuleCall_0_0_1; }
		
		//(',' site+=[Site])*
		public Group getGroup_1() { return cGroup_1; }
		
		//','
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//site+=[Site]
		public Assignment getSiteAssignment_1_1() { return cSiteAssignment_1_1; }
		
		//[Site]
		public CrossReference getSiteSiteCrossReference_1_1_0() { return cSiteSiteCrossReference_1_1_0; }
		
		//ID
		public RuleCall getSiteSiteIDTerminalRuleCall_1_1_0_1() { return cSiteSiteIDTerminalRuleCall_1_1_0_1; }
	}
	
	public class ModeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myxenia.MyXenia.Mode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDEVEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDEVDevelopmentKeyword_0_0 = (Keyword)cDEVEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPRODEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPRODProductionKeyword_1_0 = (Keyword)cPRODEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Mode:
		//    DEV='development' | PROD='production'
		//;
		public EnumRule getRule() { return rule; }
		
		//DEV='development' | PROD='production'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DEV='development'
		public EnumLiteralDeclaration getDEVEnumLiteralDeclaration_0() { return cDEVEnumLiteralDeclaration_0; }
		
		//'development'
		public Keyword getDEVDevelopmentKeyword_0_0() { return cDEVDevelopmentKeyword_0_0; }
		
		//PROD='production'
		public EnumLiteralDeclaration getPRODEnumLiteralDeclaration_1() { return cPRODEnumLiteralDeclaration_1; }
		
		//'production'
		public Keyword getPRODProductionKeyword_1_0() { return cPRODProductionKeyword_1_0; }
	}
	public class InfoEntryElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myxenia.MyXenia.InfoEntry");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMODEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMODModKeyword_0_0 = (Keyword)cMODEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFREQEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFREQFreqKeyword_1_0 = (Keyword)cFREQEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cPRIOEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cPRIOPrioKeyword_2_0 = (Keyword)cPRIOEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum InfoEntry:
		//    MOD='mod' | FREQ='freq' | PRIO='prio'
		//;
		public EnumRule getRule() { return rule; }
		
		//MOD='mod' | FREQ='freq' | PRIO='prio'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MOD='mod'
		public EnumLiteralDeclaration getMODEnumLiteralDeclaration_0() { return cMODEnumLiteralDeclaration_0; }
		
		//'mod'
		public Keyword getMODModKeyword_0_0() { return cMODModKeyword_0_0; }
		
		//FREQ='freq'
		public EnumLiteralDeclaration getFREQEnumLiteralDeclaration_1() { return cFREQEnumLiteralDeclaration_1; }
		
		//'freq'
		public Keyword getFREQFreqKeyword_1_0() { return cFREQFreqKeyword_1_0; }
		
		//PRIO='prio'
		public EnumLiteralDeclaration getPRIOEnumLiteralDeclaration_2() { return cPRIOEnumLiteralDeclaration_2; }
		
		//'prio'
		public Keyword getPRIOPrioKeyword_2_0() { return cPRIOPrioKeyword_2_0; }
	}
	
	private final ModelElements pModel;
	private final HeaderElements pHeader;
	private final EntityElements pEntity;
	private final ModeElements eMode;
	private final SuperSiteElements pSuperSite;
	private final SiteWithModalElements pSiteWithModal;
	private final MappedEntityElements pMappedEntity;
	private final InfoPropertyElements pInfoProperty;
	private final InfoEntityElements pInfoEntity;
	private final InfoEntryElements eInfoEntry;
	private final SiteElements pSite;
	private final LinkedPropertyElements pLinkedProperty;
	private final RedirectPageElements pRedirectPage;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyXeniaGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pHeader = new HeaderElements();
		this.pEntity = new EntityElements();
		this.eMode = new ModeElements();
		this.pSuperSite = new SuperSiteElements();
		this.pSiteWithModal = new SiteWithModalElements();
		this.pMappedEntity = new MappedEntityElements();
		this.pInfoProperty = new InfoPropertyElements();
		this.pInfoEntity = new InfoEntityElements();
		this.eInfoEntry = new InfoEntryElements();
		this.pSite = new SiteElements();
		this.pLinkedProperty = new LinkedPropertyElements();
		this.pRedirectPage = new RedirectPageElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.myxenia.MyXenia".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    headers+=Header
	//    entities+=Entity*
	//    mapped_entities+=MappedEntity*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Header:
	//    'app' appName=ID 'has' 'pages' '['
	//        sites+=SuperSite (',' sites+=SuperSite)*
	//    ']'
	//;
	public HeaderElements getHeaderAccess() {
		return pHeader;
	}
	
	public ParserRule getHeaderRule() {
		return getHeaderAccess().getRule();
	}
	
	//Entity:
	//    'with'     ':' tech=STRING |
	//    'xml'     ':' path=STRING |
	//    'mode'     ':' mode=Mode
	//;
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//enum Mode:
	//    DEV='development' | PROD='production'
	//;
	public ModeElements getModeAccess() {
		return eMode;
	}
	
	public EnumRule getModeRule() {
		return getModeAccess().getRule();
	}
	
	//SuperSite:
	//    Site | SiteWithModal
	//;
	public SuperSiteElements getSuperSiteAccess() {
		return pSuperSite;
	}
	
	public ParserRule getSuperSiteRule() {
		return getSuperSiteAccess().getRule();
	}
	
	//SiteWithModal:
	//    '@' name=ID 'with' 'modal' '(' sites+=SuperSite (',' sites+=SuperSite)* ')'
	//;
	public SiteWithModalElements getSiteWithModalAccess() {
		return pSiteWithModal;
	}
	
	public ParserRule getSiteWithModalRule() {
		return getSiteWithModalAccess().getRule();
	}
	
	//MappedEntity:
	//    'info' ':' '[' infoProps+=InfoProperty (',' infoProps+=InfoProperty)* ']'    |
	//    'map'  ':' '[' linkedProps+=LinkedProperty (',' linkedProps+=LinkedProperty)* ']'
	//;
	public MappedEntityElements getMappedEntityAccess() {
		return pMappedEntity;
	}
	
	public ParserRule getMappedEntityRule() {
		return getMappedEntityAccess().getRule();
	}
	
	//InfoProperty:
	//    page=[Site] '->' entities+=InfoEntity (',' entities+=InfoEntity)*
	//;
	public InfoPropertyElements getInfoPropertyAccess() {
		return pInfoProperty;
	}
	
	public ParserRule getInfoPropertyRule() {
		return getInfoPropertyAccess().getRule();
	}
	
	//InfoEntity:
	//    entries+=InfoEntry ':' infoValue=STRING
	//;
	public InfoEntityElements getInfoEntityAccess() {
		return pInfoEntity;
	}
	
	public ParserRule getInfoEntityRule() {
		return getInfoEntityAccess().getRule();
	}
	
	//enum InfoEntry:
	//    MOD='mod' | FREQ='freq' | PRIO='prio'
	//;
	public InfoEntryElements getInfoEntryAccess() {
		return eInfoEntry;
	}
	
	public EnumRule getInfoEntryRule() {
		return getInfoEntryAccess().getRule();
	}
	
	//Site:
	//    '@' name=ID
	//;
	public SiteElements getSiteAccess() {
		return pSite;
	}
	
	public ParserRule getSiteRule() {
		return getSiteAccess().getRule();
	}
	
	//LinkedProperty:
	//    name=[Site] '->' '('  page=RedirectPage ')'
	//;
	public LinkedPropertyElements getLinkedPropertyAccess() {
		return pLinkedProperty;
	}
	
	public ParserRule getLinkedPropertyRule() {
		return getLinkedPropertyAccess().getRule();
	}
	
	//RedirectPage:
	//    (site+=[Site]) (',' site+=[Site])*
	//;
	public RedirectPageElements getRedirectPageAccess() {
		return pRedirectPage;
	}
	
	public ParserRule getRedirectPageRule() {
		return getRedirectPageAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
