/*
 * generated by Xtext 2.25.0
 */
package org.eclipse.eatxt.simplified.optimized.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.eatxt.simplified.optimized.parser.antlr.internal.InternalEatxtParser;
import org.eclipse.eatxt.simplified.optimized.services.EatxtGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class EatxtParser extends AbstractAntlrParser {

	@Inject
	private EatxtGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEatxtParser createParser(XtextTokenStream stream) {
		return new InternalEatxtParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "EAXML";
	}

	public EatxtGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EatxtGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
