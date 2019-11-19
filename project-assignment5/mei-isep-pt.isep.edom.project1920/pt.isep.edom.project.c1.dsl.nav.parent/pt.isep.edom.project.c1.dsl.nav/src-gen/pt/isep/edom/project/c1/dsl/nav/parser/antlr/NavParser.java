/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c1.dsl.nav.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import pt.isep.edom.project.c1.dsl.nav.parser.antlr.internal.InternalNavParser;
import pt.isep.edom.project.c1.dsl.nav.services.NavGrammarAccess;

public class NavParser extends AbstractAntlrParser {

	@Inject
	private NavGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalNavParser createParser(XtextTokenStream stream) {
		return new InternalNavParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "NavModel";
	}

	public NavGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NavGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}