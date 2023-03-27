/*
 * generated by Xtext 2.30.0
 */
grammar InternalStory;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.coursework.storyLang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.coursework.storyLang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.coursework.storyLang.services.StoryGrammarAccess;

}

@parser::members {

 	private StoryGrammarAccess grammarAccess;

    public InternalStoryParser(TokenStream input, StoryGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "StoryProgram";
   	}

   	@Override
   	protected StoryGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleStoryProgram
entryRuleStoryProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStoryProgramRule()); }
	iv_ruleStoryProgram=ruleStoryProgram
	{ $current=$iv_ruleStoryProgram.current; }
	EOF;

// Rule StoryProgram
ruleStoryProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getStoryProgramAccess().getStatementsStatementParserRuleCall_0());
			}
			lv_statements_0_0=ruleStatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getStoryProgramRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"org.xtext.coursework.storyLang.Story.Statement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getNameStatementParserRuleCall_0());
		}
		this_NameStatement_0=ruleNameStatement
		{
			$current = $this_NameStatement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getEmotionStatementParserRuleCall_1());
		}
		this_EmotionStatement_1=ruleEmotionStatement
		{
			$current = $this_EmotionStatement_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNameStatement
entryRuleNameStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNameStatementRule()); }
	iv_ruleNameStatement=ruleNameStatement
	{ $current=$iv_ruleNameStatement.current; }
	EOF;

// Rule NameStatement
ruleNameStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='name:'
		{
			newLeafNode(otherlv_0, grammarAccess.getNameStatementAccess().getNameKeyword_0());
		}
		(
			(
				lv_value_1_0=RULE_STRING
				{
					newLeafNode(lv_value_1_0, grammarAccess.getNameStatementAccess().getValueSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNameStatementRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getNameStatementAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleEmotionStatement
entryRuleEmotionStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEmotionStatementRule()); }
	iv_ruleEmotionStatement=ruleEmotionStatement
	{ $current=$iv_ruleEmotionStatement.current; }
	EOF;

// Rule EmotionStatement
ruleEmotionStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='emotions:'
		{
			newLeafNode(otherlv_0, grammarAccess.getEmotionStatementAccess().getEmotionsKeyword_0());
		}
		(
			(
				lv_list_1_0=RULE_STRING
				{
					newLeafNode(lv_list_1_0, grammarAccess.getEmotionStatementAccess().getListSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEmotionStatementRule());
					}
					addWithLastConsumed(
						$current,
						"list",
						lv_list_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getEmotionStatementAccess().getCommaKeyword_2_0());
			}
			(
				(
					lv_list_3_0=RULE_STRING
					{
						newLeafNode(lv_list_3_0, grammarAccess.getEmotionStatementAccess().getListSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEmotionStatementRule());
						}
						addWithLastConsumed(
							$current,
							"list",
							lv_list_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)*
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getEmotionStatementAccess().getSemicolonKeyword_3());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
