/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c1.dsl.nav.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class NavGrammarAccess extends AbstractGrammarElementFinder {
	
	public class NavModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "pt.isep.edom.project.c1.dsl.nav.Nav.NavModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNavModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNavModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cMenuKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cMenuAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cMenuMenuParserRuleCall_4_1_0 = (RuleCall)cMenuAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//NavModel:
		//	{NavModel}
		//	'NavModel'
		//	name=EString
		//	'{' ('menu' menu=Menu)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{NavModel} 'NavModel' name=EString '{' ('menu' menu=Menu)? '}'
		public Group getGroup() { return cGroup; }
		
		//{NavModel}
		public Action getNavModelAction_0() { return cNavModelAction_0; }
		
		//'NavModel'
		public Keyword getNavModelKeyword_1() { return cNavModelKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('menu' menu=Menu)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'menu'
		public Keyword getMenuKeyword_4_0() { return cMenuKeyword_4_0; }
		
		//menu=Menu
		public Assignment getMenuAssignment_4_1() { return cMenuAssignment_4_1; }
		
		//Menu
		public RuleCall getMenuMenuParserRuleCall_4_1_0() { return cMenuMenuParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "pt.isep.edom.project.c1.dsl.nav.Nav.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class MenuElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "pt.isep.edom.project.c1.dsl.nav.Nav.Menu");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMenuAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMenuKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPagesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cPagesAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cPagesPageParserRuleCall_4_2_0 = (RuleCall)cPagesAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cPagesAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cPagesPageParserRuleCall_4_3_1_0 = (RuleCall)cPagesAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Menu:
		//	{Menu}
		//	'Menu'
		//	name=EString
		//	'{' ('pages' '{' pages+=Page ("," pages+=Page)* '}')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Menu} 'Menu' name=EString '{' ('pages' '{' pages+=Page ("," pages+=Page)* '}')? '}'
		public Group getGroup() { return cGroup; }
		
		//{Menu}
		public Action getMenuAction_0() { return cMenuAction_0; }
		
		//'Menu'
		public Keyword getMenuKeyword_1() { return cMenuKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('pages' '{' pages+=Page ("," pages+=Page)* '}')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'pages'
		public Keyword getPagesKeyword_4_0() { return cPagesKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//pages+=Page
		public Assignment getPagesAssignment_4_2() { return cPagesAssignment_4_2; }
		
		//Page
		public RuleCall getPagesPageParserRuleCall_4_2_0() { return cPagesPageParserRuleCall_4_2_0; }
		
		//("," pages+=Page)*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//pages+=Page
		public Assignment getPagesAssignment_4_3_1() { return cPagesAssignment_4_3_1; }
		
		//Page
		public RuleCall getPagesPageParserRuleCall_4_3_1_0() { return cPagesPageParserRuleCall_4_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class PageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "pt.isep.edom.project.c1.dsl.nav.Nav.Page");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPageAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Page:
		//	{Page}
		//	'Page'
		//	name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{Page} 'Page' name=EString
		public Group getGroup() { return cGroup; }
		
		//{Page}
		public Action getPageAction_0() { return cPageAction_0; }
		
		//'Page'
		public Keyword getPageKeyword_1() { return cPageKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
	}
	
	
	private final NavModelElements pNavModel;
	private final EStringElements pEString;
	private final MenuElements pMenu;
	private final PageElements pPage;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public NavGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pNavModel = new NavModelElements();
		this.pEString = new EStringElements();
		this.pMenu = new MenuElements();
		this.pPage = new PageElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("pt.isep.edom.project.c1.dsl.nav.Nav".equals(grammar.getName())) {
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

	
	//NavModel:
	//	{NavModel}
	//	'NavModel'
	//	name=EString
	//	'{' ('menu' menu=Menu)?
	//	'}';
	public NavModelElements getNavModelAccess() {
		return pNavModel;
	}
	
	public ParserRule getNavModelRule() {
		return getNavModelAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Menu:
	//	{Menu}
	//	'Menu'
	//	name=EString
	//	'{' ('pages' '{' pages+=Page ("," pages+=Page)* '}')?
	//	'}';
	public MenuElements getMenuAccess() {
		return pMenu;
	}
	
	public ParserRule getMenuRule() {
		return getMenuAccess().getRule();
	}
	
	//Page:
	//	{Page}
	//	'Page'
	//	name=EString;
	public PageElements getPageAccess() {
		return pPage;
	}
	
	public ParserRule getPageRule() {
		return getPageAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}