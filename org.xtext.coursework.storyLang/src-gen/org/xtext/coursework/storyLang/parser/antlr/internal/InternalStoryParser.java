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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStoryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name:'", "';'", "'emotions:'", "','"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalStoryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStoryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStoryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStory.g"; }



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




    // $ANTLR start "entryRuleStoryProgram"
    // InternalStory.g:64:1: entryRuleStoryProgram returns [EObject current=null] : iv_ruleStoryProgram= ruleStoryProgram EOF ;
    public final EObject entryRuleStoryProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoryProgram = null;


        try {
            // InternalStory.g:64:53: (iv_ruleStoryProgram= ruleStoryProgram EOF )
            // InternalStory.g:65:2: iv_ruleStoryProgram= ruleStoryProgram EOF
            {
             newCompositeNode(grammarAccess.getStoryProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStoryProgram=ruleStoryProgram();

            state._fsp--;

             current =iv_ruleStoryProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStoryProgram"


    // $ANTLR start "ruleStoryProgram"
    // InternalStory.g:71:1: ruleStoryProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleStoryProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalStory.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalStory.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalStory.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStory.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalStory.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalStory.g:80:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getStoryProgramAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getStoryProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"org.xtext.coursework.storyLang.Story.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStoryProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalStory.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalStory.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalStory.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalStory.g:107:1: ruleStatement returns [EObject current=null] : (this_NameStatement_0= ruleNameStatement | this_EmotionStatement_1= ruleEmotionStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_NameStatement_0 = null;

        EObject this_EmotionStatement_1 = null;



        	enterRule();

        try {
            // InternalStory.g:113:2: ( (this_NameStatement_0= ruleNameStatement | this_EmotionStatement_1= ruleEmotionStatement ) )
            // InternalStory.g:114:2: (this_NameStatement_0= ruleNameStatement | this_EmotionStatement_1= ruleEmotionStatement )
            {
            // InternalStory.g:114:2: (this_NameStatement_0= ruleNameStatement | this_EmotionStatement_1= ruleEmotionStatement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalStory.g:115:3: this_NameStatement_0= ruleNameStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getNameStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameStatement_0=ruleNameStatement();

                    state._fsp--;


                    			current = this_NameStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStory.g:124:3: this_EmotionStatement_1= ruleEmotionStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getEmotionStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EmotionStatement_1=ruleEmotionStatement();

                    state._fsp--;


                    			current = this_EmotionStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleNameStatement"
    // InternalStory.g:136:1: entryRuleNameStatement returns [EObject current=null] : iv_ruleNameStatement= ruleNameStatement EOF ;
    public final EObject entryRuleNameStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameStatement = null;


        try {
            // InternalStory.g:136:54: (iv_ruleNameStatement= ruleNameStatement EOF )
            // InternalStory.g:137:2: iv_ruleNameStatement= ruleNameStatement EOF
            {
             newCompositeNode(grammarAccess.getNameStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameStatement=ruleNameStatement();

            state._fsp--;

             current =iv_ruleNameStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameStatement"


    // $ANTLR start "ruleNameStatement"
    // InternalStory.g:143:1: ruleNameStatement returns [EObject current=null] : (otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleNameStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStory.g:149:2: ( (otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalStory.g:150:2: (otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalStory.g:150:2: (otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalStory.g:151:3: otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNameStatementAccess().getNameKeyword_0());
            		
            // InternalStory.g:155:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalStory.g:156:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalStory.g:156:4: (lv_value_1_0= RULE_STRING )
            // InternalStory.g:157:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNameStatementAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNameStatementAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameStatement"


    // $ANTLR start "entryRuleEmotionStatement"
    // InternalStory.g:181:1: entryRuleEmotionStatement returns [EObject current=null] : iv_ruleEmotionStatement= ruleEmotionStatement EOF ;
    public final EObject entryRuleEmotionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmotionStatement = null;


        try {
            // InternalStory.g:181:57: (iv_ruleEmotionStatement= ruleEmotionStatement EOF )
            // InternalStory.g:182:2: iv_ruleEmotionStatement= ruleEmotionStatement EOF
            {
             newCompositeNode(grammarAccess.getEmotionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmotionStatement=ruleEmotionStatement();

            state._fsp--;

             current =iv_ruleEmotionStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmotionStatement"


    // $ANTLR start "ruleEmotionStatement"
    // InternalStory.g:188:1: ruleEmotionStatement returns [EObject current=null] : (otherlv_0= 'emotions:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleEmotionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStory.g:194:2: ( (otherlv_0= 'emotions:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) )
            // InternalStory.g:195:2: (otherlv_0= 'emotions:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            {
            // InternalStory.g:195:2: (otherlv_0= 'emotions:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            // InternalStory.g:196:3: otherlv_0= 'emotions:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEmotionStatementAccess().getEmotionsKeyword_0());
            		
            // InternalStory.g:200:3: ( (lv_list_1_0= RULE_STRING ) )
            // InternalStory.g:201:4: (lv_list_1_0= RULE_STRING )
            {
            // InternalStory.g:201:4: (lv_list_1_0= RULE_STRING )
            // InternalStory.g:202:5: lv_list_1_0= RULE_STRING
            {
            lv_list_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_list_1_0, grammarAccess.getEmotionStatementAccess().getListSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmotionStatementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalStory.g:218:3: (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStory.g:219:4: otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEmotionStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStory.g:223:4: ( (lv_list_3_0= RULE_STRING ) )
            	    // InternalStory.g:224:5: (lv_list_3_0= RULE_STRING )
            	    {
            	    // InternalStory.g:224:5: (lv_list_3_0= RULE_STRING )
            	    // InternalStory.g:225:6: lv_list_3_0= RULE_STRING
            	    {
            	    lv_list_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    						newLeafNode(lv_list_3_0, grammarAccess.getEmotionStatementAccess().getListSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEmotionStatementRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"list",
            	    							lv_list_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEmotionStatementAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmotionStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000005000L});

}