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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name:'", "';'", "'emotions:'", "','", "'verb:'", "'adverbs:'", "'locations:'", "'adjectives:'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
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

                if ( (LA1_0==11||LA1_0==13||(LA1_0>=15 && LA1_0<=18)) ) {
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
    // InternalStory.g:107:1: ruleStatement returns [EObject current=null] : (this_NameStatement_0= ruleNameStatement | this_EmotionStatement_1= ruleEmotionStatement | this_VerbStatement_2= ruleVerbStatement | this_AdverbStatement_3= ruleAdverbStatement | this_AdjectiveStatement_4= ruleAdjectiveStatement | this_LocationStatement_5= ruleLocationStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_NameStatement_0 = null;

        EObject this_EmotionStatement_1 = null;

        EObject this_VerbStatement_2 = null;

        EObject this_AdverbStatement_3 = null;

        EObject this_AdjectiveStatement_4 = null;

        EObject this_LocationStatement_5 = null;



        	enterRule();

        try {
            // InternalStory.g:113:2: ( (this_NameStatement_0= ruleNameStatement | this_EmotionStatement_1= ruleEmotionStatement | this_VerbStatement_2= ruleVerbStatement | this_AdverbStatement_3= ruleAdverbStatement | this_AdjectiveStatement_4= ruleAdjectiveStatement | this_LocationStatement_5= ruleLocationStatement ) )
            // InternalStory.g:114:2: (this_NameStatement_0= ruleNameStatement | this_EmotionStatement_1= ruleEmotionStatement | this_VerbStatement_2= ruleVerbStatement | this_AdverbStatement_3= ruleAdverbStatement | this_AdjectiveStatement_4= ruleAdjectiveStatement | this_LocationStatement_5= ruleLocationStatement )
            {
            // InternalStory.g:114:2: (this_NameStatement_0= ruleNameStatement | this_EmotionStatement_1= ruleEmotionStatement | this_VerbStatement_2= ruleVerbStatement | this_AdverbStatement_3= ruleAdverbStatement | this_AdjectiveStatement_4= ruleAdjectiveStatement | this_LocationStatement_5= ruleLocationStatement )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            default:
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
                case 3 :
                    // InternalStory.g:133:3: this_VerbStatement_2= ruleVerbStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVerbStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VerbStatement_2=ruleVerbStatement();

                    state._fsp--;


                    			current = this_VerbStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalStory.g:142:3: this_AdverbStatement_3= ruleAdverbStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAdverbStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AdverbStatement_3=ruleAdverbStatement();

                    state._fsp--;


                    			current = this_AdverbStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalStory.g:151:3: this_AdjectiveStatement_4= ruleAdjectiveStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAdjectiveStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AdjectiveStatement_4=ruleAdjectiveStatement();

                    state._fsp--;


                    			current = this_AdjectiveStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalStory.g:160:3: this_LocationStatement_5= ruleLocationStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLocationStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocationStatement_5=ruleLocationStatement();

                    state._fsp--;


                    			current = this_LocationStatement_5;
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
    // InternalStory.g:172:1: entryRuleNameStatement returns [EObject current=null] : iv_ruleNameStatement= ruleNameStatement EOF ;
    public final EObject entryRuleNameStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameStatement = null;


        try {
            // InternalStory.g:172:54: (iv_ruleNameStatement= ruleNameStatement EOF )
            // InternalStory.g:173:2: iv_ruleNameStatement= ruleNameStatement EOF
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
    // InternalStory.g:179:1: ruleNameStatement returns [EObject current=null] : (otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleNameStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStory.g:185:2: ( (otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalStory.g:186:2: (otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalStory.g:186:2: (otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalStory.g:187:3: otherlv_0= 'name:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNameStatementAccess().getNameKeyword_0());
            		
            // InternalStory.g:191:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalStory.g:192:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalStory.g:192:4: (lv_value_1_0= RULE_STRING )
            // InternalStory.g:193:5: lv_value_1_0= RULE_STRING
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
    // InternalStory.g:217:1: entryRuleEmotionStatement returns [EObject current=null] : iv_ruleEmotionStatement= ruleEmotionStatement EOF ;
    public final EObject entryRuleEmotionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmotionStatement = null;


        try {
            // InternalStory.g:217:57: (iv_ruleEmotionStatement= ruleEmotionStatement EOF )
            // InternalStory.g:218:2: iv_ruleEmotionStatement= ruleEmotionStatement EOF
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
    // InternalStory.g:224:1: ruleEmotionStatement returns [EObject current=null] : (otherlv_0= 'emotions:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleEmotionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStory.g:230:2: ( (otherlv_0= 'emotions:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) )
            // InternalStory.g:231:2: (otherlv_0= 'emotions:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            {
            // InternalStory.g:231:2: (otherlv_0= 'emotions:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            // InternalStory.g:232:3: otherlv_0= 'emotions:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEmotionStatementAccess().getEmotionsKeyword_0());
            		
            // InternalStory.g:236:3: ( (lv_list_1_0= RULE_STRING ) )
            // InternalStory.g:237:4: (lv_list_1_0= RULE_STRING )
            {
            // InternalStory.g:237:4: (lv_list_1_0= RULE_STRING )
            // InternalStory.g:238:5: lv_list_1_0= RULE_STRING
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

            // InternalStory.g:254:3: (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStory.g:255:4: otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEmotionStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStory.g:259:4: ( (lv_list_3_0= RULE_STRING ) )
            	    // InternalStory.g:260:5: (lv_list_3_0= RULE_STRING )
            	    {
            	    // InternalStory.g:260:5: (lv_list_3_0= RULE_STRING )
            	    // InternalStory.g:261:6: lv_list_3_0= RULE_STRING
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


    // $ANTLR start "entryRuleVerbStatement"
    // InternalStory.g:286:1: entryRuleVerbStatement returns [EObject current=null] : iv_ruleVerbStatement= ruleVerbStatement EOF ;
    public final EObject entryRuleVerbStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerbStatement = null;


        try {
            // InternalStory.g:286:54: (iv_ruleVerbStatement= ruleVerbStatement EOF )
            // InternalStory.g:287:2: iv_ruleVerbStatement= ruleVerbStatement EOF
            {
             newCompositeNode(grammarAccess.getVerbStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerbStatement=ruleVerbStatement();

            state._fsp--;

             current =iv_ruleVerbStatement; 
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
    // $ANTLR end "entryRuleVerbStatement"


    // $ANTLR start "ruleVerbStatement"
    // InternalStory.g:293:1: ruleVerbStatement returns [EObject current=null] : (otherlv_0= 'verb:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleVerbStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStory.g:299:2: ( (otherlv_0= 'verb:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) )
            // InternalStory.g:300:2: (otherlv_0= 'verb:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            {
            // InternalStory.g:300:2: (otherlv_0= 'verb:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            // InternalStory.g:301:3: otherlv_0= 'verb:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVerbStatementAccess().getVerbKeyword_0());
            		
            // InternalStory.g:305:3: ( (lv_list_1_0= RULE_STRING ) )
            // InternalStory.g:306:4: (lv_list_1_0= RULE_STRING )
            {
            // InternalStory.g:306:4: (lv_list_1_0= RULE_STRING )
            // InternalStory.g:307:5: lv_list_1_0= RULE_STRING
            {
            lv_list_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_list_1_0, grammarAccess.getVerbStatementAccess().getListSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVerbStatementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalStory.g:323:3: (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStory.g:324:4: otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVerbStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStory.g:328:4: ( (lv_list_3_0= RULE_STRING ) )
            	    // InternalStory.g:329:5: (lv_list_3_0= RULE_STRING )
            	    {
            	    // InternalStory.g:329:5: (lv_list_3_0= RULE_STRING )
            	    // InternalStory.g:330:6: lv_list_3_0= RULE_STRING
            	    {
            	    lv_list_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    						newLeafNode(lv_list_3_0, grammarAccess.getVerbStatementAccess().getListSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVerbStatementRule());
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
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVerbStatementAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleVerbStatement"


    // $ANTLR start "entryRuleAdverbStatement"
    // InternalStory.g:355:1: entryRuleAdverbStatement returns [EObject current=null] : iv_ruleAdverbStatement= ruleAdverbStatement EOF ;
    public final EObject entryRuleAdverbStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdverbStatement = null;


        try {
            // InternalStory.g:355:56: (iv_ruleAdverbStatement= ruleAdverbStatement EOF )
            // InternalStory.g:356:2: iv_ruleAdverbStatement= ruleAdverbStatement EOF
            {
             newCompositeNode(grammarAccess.getAdverbStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdverbStatement=ruleAdverbStatement();

            state._fsp--;

             current =iv_ruleAdverbStatement; 
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
    // $ANTLR end "entryRuleAdverbStatement"


    // $ANTLR start "ruleAdverbStatement"
    // InternalStory.g:362:1: ruleAdverbStatement returns [EObject current=null] : (otherlv_0= 'adverbs:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleAdverbStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStory.g:368:2: ( (otherlv_0= 'adverbs:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) )
            // InternalStory.g:369:2: (otherlv_0= 'adverbs:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            {
            // InternalStory.g:369:2: (otherlv_0= 'adverbs:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            // InternalStory.g:370:3: otherlv_0= 'adverbs:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAdverbStatementAccess().getAdverbsKeyword_0());
            		
            // InternalStory.g:374:3: ( (lv_list_1_0= RULE_STRING ) )
            // InternalStory.g:375:4: (lv_list_1_0= RULE_STRING )
            {
            // InternalStory.g:375:4: (lv_list_1_0= RULE_STRING )
            // InternalStory.g:376:5: lv_list_1_0= RULE_STRING
            {
            lv_list_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_list_1_0, grammarAccess.getAdverbStatementAccess().getListSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdverbStatementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalStory.g:392:3: (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStory.g:393:4: otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAdverbStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStory.g:397:4: ( (lv_list_3_0= RULE_STRING ) )
            	    // InternalStory.g:398:5: (lv_list_3_0= RULE_STRING )
            	    {
            	    // InternalStory.g:398:5: (lv_list_3_0= RULE_STRING )
            	    // InternalStory.g:399:6: lv_list_3_0= RULE_STRING
            	    {
            	    lv_list_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    						newLeafNode(lv_list_3_0, grammarAccess.getAdverbStatementAccess().getListSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAdverbStatementRule());
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
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAdverbStatementAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleAdverbStatement"


    // $ANTLR start "entryRuleLocationStatement"
    // InternalStory.g:424:1: entryRuleLocationStatement returns [EObject current=null] : iv_ruleLocationStatement= ruleLocationStatement EOF ;
    public final EObject entryRuleLocationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationStatement = null;


        try {
            // InternalStory.g:424:58: (iv_ruleLocationStatement= ruleLocationStatement EOF )
            // InternalStory.g:425:2: iv_ruleLocationStatement= ruleLocationStatement EOF
            {
             newCompositeNode(grammarAccess.getLocationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocationStatement=ruleLocationStatement();

            state._fsp--;

             current =iv_ruleLocationStatement; 
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
    // $ANTLR end "entryRuleLocationStatement"


    // $ANTLR start "ruleLocationStatement"
    // InternalStory.g:431:1: ruleLocationStatement returns [EObject current=null] : (otherlv_0= 'locations:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleLocationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStory.g:437:2: ( (otherlv_0= 'locations:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) )
            // InternalStory.g:438:2: (otherlv_0= 'locations:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            {
            // InternalStory.g:438:2: (otherlv_0= 'locations:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            // InternalStory.g:439:3: otherlv_0= 'locations:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationStatementAccess().getLocationsKeyword_0());
            		
            // InternalStory.g:443:3: ( (lv_list_1_0= RULE_STRING ) )
            // InternalStory.g:444:4: (lv_list_1_0= RULE_STRING )
            {
            // InternalStory.g:444:4: (lv_list_1_0= RULE_STRING )
            // InternalStory.g:445:5: lv_list_1_0= RULE_STRING
            {
            lv_list_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_list_1_0, grammarAccess.getLocationStatementAccess().getListSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocationStatementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalStory.g:461:3: (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStory.g:462:4: otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLocationStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStory.g:466:4: ( (lv_list_3_0= RULE_STRING ) )
            	    // InternalStory.g:467:5: (lv_list_3_0= RULE_STRING )
            	    {
            	    // InternalStory.g:467:5: (lv_list_3_0= RULE_STRING )
            	    // InternalStory.g:468:6: lv_list_3_0= RULE_STRING
            	    {
            	    lv_list_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    						newLeafNode(lv_list_3_0, grammarAccess.getLocationStatementAccess().getListSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLocationStatementRule());
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
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLocationStatementAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLocationStatement"


    // $ANTLR start "entryRuleAdjectiveStatement"
    // InternalStory.g:493:1: entryRuleAdjectiveStatement returns [EObject current=null] : iv_ruleAdjectiveStatement= ruleAdjectiveStatement EOF ;
    public final EObject entryRuleAdjectiveStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdjectiveStatement = null;


        try {
            // InternalStory.g:493:59: (iv_ruleAdjectiveStatement= ruleAdjectiveStatement EOF )
            // InternalStory.g:494:2: iv_ruleAdjectiveStatement= ruleAdjectiveStatement EOF
            {
             newCompositeNode(grammarAccess.getAdjectiveStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdjectiveStatement=ruleAdjectiveStatement();

            state._fsp--;

             current =iv_ruleAdjectiveStatement; 
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
    // $ANTLR end "entryRuleAdjectiveStatement"


    // $ANTLR start "ruleAdjectiveStatement"
    // InternalStory.g:500:1: ruleAdjectiveStatement returns [EObject current=null] : (otherlv_0= 'adjectives:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleAdjectiveStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStory.g:506:2: ( (otherlv_0= 'adjectives:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) )
            // InternalStory.g:507:2: (otherlv_0= 'adjectives:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            {
            // InternalStory.g:507:2: (otherlv_0= 'adjectives:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            // InternalStory.g:508:3: otherlv_0= 'adjectives:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAdjectiveStatementAccess().getAdjectivesKeyword_0());
            		
            // InternalStory.g:512:3: ( (lv_list_1_0= RULE_STRING ) )
            // InternalStory.g:513:4: (lv_list_1_0= RULE_STRING )
            {
            // InternalStory.g:513:4: (lv_list_1_0= RULE_STRING )
            // InternalStory.g:514:5: lv_list_1_0= RULE_STRING
            {
            lv_list_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_list_1_0, grammarAccess.getAdjectiveStatementAccess().getListSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdjectiveStatementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalStory.g:530:3: (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStory.g:531:4: otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAdjectiveStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStory.g:535:4: ( (lv_list_3_0= RULE_STRING ) )
            	    // InternalStory.g:536:5: (lv_list_3_0= RULE_STRING )
            	    {
            	    // InternalStory.g:536:5: (lv_list_3_0= RULE_STRING )
            	    // InternalStory.g:537:6: lv_list_3_0= RULE_STRING
            	    {
            	    lv_list_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    						newLeafNode(lv_list_3_0, grammarAccess.getAdjectiveStatementAccess().getListSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAdjectiveStatementRule());
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
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAdjectiveStatementAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleAdjectiveStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000007A802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000005000L});

}