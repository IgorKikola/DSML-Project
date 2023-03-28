/*
 * generated by Xtext 2.25.0
 */
package org.xtext.coursework.storyLang.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.coursework.storyLang.ide.contentassist.antlr.internal.InternalStoryParser;
import org.xtext.coursework.storyLang.services.StoryGrammarAccess;

public class StoryParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(StoryGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, StoryGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getAmountStatementAccess().getGroup(), "rule__AmountStatement__Group__0");
			builder.put(grammarAccess.getPlaceStatementAccess().getGroup(), "rule__PlaceStatement__Group__0");
			builder.put(grammarAccess.getPathStatementAccess().getGroup(), "rule__PathStatement__Group__0");
			builder.put(grammarAccess.getPathStatementAccess().getGroup_2(), "rule__PathStatement__Group_2__0");
			builder.put(grammarAccess.getMoveStatementAccess().getGroup(), "rule__MoveStatement__Group__0");
			builder.put(grammarAccess.getMoveStatementAccess().getGroup_2(), "rule__MoveStatement__Group_2__0");
			builder.put(grammarAccess.getNearbyStatementAccess().getGroup(), "rule__NearbyStatement__Group__0");
			builder.put(grammarAccess.getNearbyStatementAccess().getGroup_2(), "rule__NearbyStatement__Group_2__0");
			builder.put(grammarAccess.getSubstanceStatementAccess().getGroup(), "rule__SubstanceStatement__Group__0");
			builder.put(grammarAccess.getSubstanceStatementAccess().getGroup_2(), "rule__SubstanceStatement__Group_2__0");
			builder.put(grammarAccess.getMoodStatementAccess().getGroup(), "rule__MoodStatement__Group__0");
			builder.put(grammarAccess.getMoodStatementAccess().getGroup_2(), "rule__MoodStatement__Group_2__0");
			builder.put(grammarAccess.getStoryProgramAccess().getStatementsAssignment(), "rule__StoryProgram__StatementsAssignment");
			builder.put(grammarAccess.getAmountStatementAccess().getValueAssignment_1(), "rule__AmountStatement__ValueAssignment_1");
			builder.put(grammarAccess.getPlaceStatementAccess().getValueAssignment_1(), "rule__PlaceStatement__ValueAssignment_1");
			builder.put(grammarAccess.getPathStatementAccess().getListAssignment_1(), "rule__PathStatement__ListAssignment_1");
			builder.put(grammarAccess.getPathStatementAccess().getListAssignment_2_1(), "rule__PathStatement__ListAssignment_2_1");
			builder.put(grammarAccess.getMoveStatementAccess().getListAssignment_1(), "rule__MoveStatement__ListAssignment_1");
			builder.put(grammarAccess.getMoveStatementAccess().getListAssignment_2_1(), "rule__MoveStatement__ListAssignment_2_1");
			builder.put(grammarAccess.getNearbyStatementAccess().getListAssignment_1(), "rule__NearbyStatement__ListAssignment_1");
			builder.put(grammarAccess.getNearbyStatementAccess().getListAssignment_2_1(), "rule__NearbyStatement__ListAssignment_2_1");
			builder.put(grammarAccess.getSubstanceStatementAccess().getListAssignment_1(), "rule__SubstanceStatement__ListAssignment_1");
			builder.put(grammarAccess.getSubstanceStatementAccess().getListAssignment_2_1(), "rule__SubstanceStatement__ListAssignment_2_1");
			builder.put(grammarAccess.getMoodStatementAccess().getListAssignment_1(), "rule__MoodStatement__ListAssignment_1");
			builder.put(grammarAccess.getMoodStatementAccess().getListAssignment_2_1(), "rule__MoodStatement__ListAssignment_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private StoryGrammarAccess grammarAccess;

	@Override
	protected InternalStoryParser createParser() {
		InternalStoryParser result = new InternalStoryParser(null);
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

	public StoryGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StoryGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
