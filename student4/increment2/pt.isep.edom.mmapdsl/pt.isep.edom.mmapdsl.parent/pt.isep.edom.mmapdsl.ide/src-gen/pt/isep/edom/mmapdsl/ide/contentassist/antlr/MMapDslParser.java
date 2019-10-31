/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.mmapdsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import pt.isep.edom.mmapdsl.ide.contentassist.antlr.internal.InternalMMapDslParser;
import pt.isep.edom.mmapdsl.services.MMapDslGrammarAccess;

public class MMapDslParser extends AbstractContentAssistParser {

	@Inject
	private MMapDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMMapDslParser createParser() {
		InternalMMapDslParser result = new InternalMMapDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMapElementAccess().getAlternatives(), "rule__MapElement__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getPriorityAccess().getAlternatives(), "rule__Priority__Alternatives");
					put(grammarAccess.getMapAccess().getGroup(), "rule__Map__Group__0");
					put(grammarAccess.getMapAccess().getGroup_3(), "rule__Map__Group_3__0");
					put(grammarAccess.getMapAccess().getGroup_4(), "rule__Map__Group_4__0");
					put(grammarAccess.getMapAccess().getGroup_4_3(), "rule__Map__Group_4_3__0");
					put(grammarAccess.getRelationshipAccess().getGroup(), "rule__Relationship__Group__0");
					put(grammarAccess.getRelationshipAccess().getGroup_3(), "rule__Relationship__Group_3__0");
					put(grammarAccess.getTopicAccess().getGroup(), "rule__Topic__Group__0");
					put(grammarAccess.getTopicAccess().getGroup_4(), "rule__Topic__Group_4__0");
					put(grammarAccess.getTopicAccess().getGroup_5(), "rule__Topic__Group_5__0");
					put(grammarAccess.getTopicAccess().getGroup_6(), "rule__Topic__Group_6__0");
					put(grammarAccess.getTopicAccess().getGroup_7(), "rule__Topic__Group_7__0");
					put(grammarAccess.getTopicAccess().getGroup_8(), "rule__Topic__Group_8__0");
					put(grammarAccess.getTopicAccess().getGroup_8_3(), "rule__Topic__Group_8_3__0");
					put(grammarAccess.getTopicAccess().getGroup_9(), "rule__Topic__Group_9__0");
					put(grammarAccess.getMapAccess().getTitleAssignment_3_1(), "rule__Map__TitleAssignment_3_1");
					put(grammarAccess.getMapAccess().getElementsAssignment_4_2(), "rule__Map__ElementsAssignment_4_2");
					put(grammarAccess.getMapAccess().getElementsAssignment_4_3_1(), "rule__Map__ElementsAssignment_4_3_1");
					put(grammarAccess.getRelationshipAccess().getNameAssignment_1(), "rule__Relationship__NameAssignment_1");
					put(grammarAccess.getRelationshipAccess().getTypeAssignment_3_1(), "rule__Relationship__TypeAssignment_3_1");
					put(grammarAccess.getRelationshipAccess().getSourceAssignment_5(), "rule__Relationship__SourceAssignment_5");
					put(grammarAccess.getRelationshipAccess().getTargetAssignment_7(), "rule__Relationship__TargetAssignment_7");
					put(grammarAccess.getTopicAccess().getNameAssignment_2(), "rule__Topic__NameAssignment_2");
					put(grammarAccess.getTopicAccess().getDescriptionAssignment_4_1(), "rule__Topic__DescriptionAssignment_4_1");
					put(grammarAccess.getTopicAccess().getStartAssignment_5_1(), "rule__Topic__StartAssignment_5_1");
					put(grammarAccess.getTopicAccess().getEndAssignment_6_1(), "rule__Topic__EndAssignment_6_1");
					put(grammarAccess.getTopicAccess().getPriorityAssignment_7_1(), "rule__Topic__PriorityAssignment_7_1");
					put(grammarAccess.getTopicAccess().getSubtopicsAssignment_8_2(), "rule__Topic__SubtopicsAssignment_8_2");
					put(grammarAccess.getTopicAccess().getSubtopicsAssignment_8_3_1(), "rule__Topic__SubtopicsAssignment_8_3_1");
					put(grammarAccess.getTopicAccess().getParentAssignment_9_1(), "rule__Topic__ParentAssignment_9_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MMapDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MMapDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
