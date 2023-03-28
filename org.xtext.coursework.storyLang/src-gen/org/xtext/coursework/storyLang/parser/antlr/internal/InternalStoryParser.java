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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'amount:'", "';'", "'place:'", "'path:'", "','", "'move:'", "'nearby:'", "'substance:'", "'mood:'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=7;

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

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=14)||(LA1_0>=16 && LA1_0<=19)) ) {
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
    // InternalStory.g:107:1: ruleStatement returns [EObject current=null] : (this_PlaceStatement_0= rulePlaceStatement | this_PathStatement_1= rulePathStatement | this_MoveStatement_2= ruleMoveStatement | this_NearbyStatement_3= ruleNearbyStatement | this_SubstanceStatement_4= ruleSubstanceStatement | this_MoodStatement_5= ruleMoodStatement | this_AmountStatement_6= ruleAmountStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_PlaceStatement_0 = null;

        EObject this_PathStatement_1 = null;

        EObject this_MoveStatement_2 = null;

        EObject this_NearbyStatement_3 = null;

        EObject this_SubstanceStatement_4 = null;

        EObject this_MoodStatement_5 = null;

        EObject this_AmountStatement_6 = null;



        	enterRule();

        try {
            // InternalStory.g:113:2: ( (this_PlaceStatement_0= rulePlaceStatement | this_PathStatement_1= rulePathStatement | this_MoveStatement_2= ruleMoveStatement | this_NearbyStatement_3= ruleNearbyStatement | this_SubstanceStatement_4= ruleSubstanceStatement | this_MoodStatement_5= ruleMoodStatement | this_AmountStatement_6= ruleAmountStatement ) )
            // InternalStory.g:114:2: (this_PlaceStatement_0= rulePlaceStatement | this_PathStatement_1= rulePathStatement | this_MoveStatement_2= ruleMoveStatement | this_NearbyStatement_3= ruleNearbyStatement | this_SubstanceStatement_4= ruleSubstanceStatement | this_MoodStatement_5= ruleMoodStatement | this_AmountStatement_6= ruleAmountStatement )
            {
            // InternalStory.g:114:2: (this_PlaceStatement_0= rulePlaceStatement | this_PathStatement_1= rulePathStatement | this_MoveStatement_2= ruleMoveStatement | this_NearbyStatement_3= ruleNearbyStatement | this_SubstanceStatement_4= ruleSubstanceStatement | this_MoodStatement_5= ruleMoodStatement | this_AmountStatement_6= ruleAmountStatement )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            case 19:
                {
                alt2=6;
                }
                break;
            case 11:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalStory.g:115:3: this_PlaceStatement_0= rulePlaceStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPlaceStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlaceStatement_0=rulePlaceStatement();

                    state._fsp--;


                    			current = this_PlaceStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStory.g:124:3: this_PathStatement_1= rulePathStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPathStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PathStatement_1=rulePathStatement();

                    state._fsp--;


                    			current = this_PathStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalStory.g:133:3: this_MoveStatement_2= ruleMoveStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMoveStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveStatement_2=ruleMoveStatement();

                    state._fsp--;


                    			current = this_MoveStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalStory.g:142:3: this_NearbyStatement_3= ruleNearbyStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getNearbyStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NearbyStatement_3=ruleNearbyStatement();

                    state._fsp--;


                    			current = this_NearbyStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalStory.g:151:3: this_SubstanceStatement_4= ruleSubstanceStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSubstanceStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubstanceStatement_4=ruleSubstanceStatement();

                    state._fsp--;


                    			current = this_SubstanceStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalStory.g:160:3: this_MoodStatement_5= ruleMoodStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMoodStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoodStatement_5=ruleMoodStatement();

                    state._fsp--;


                    			current = this_MoodStatement_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalStory.g:169:3: this_AmountStatement_6= ruleAmountStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAmountStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_AmountStatement_6=ruleAmountStatement();

                    state._fsp--;


                    			current = this_AmountStatement_6;
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


    // $ANTLR start "entryRuleAmountStatement"
    // InternalStory.g:181:1: entryRuleAmountStatement returns [EObject current=null] : iv_ruleAmountStatement= ruleAmountStatement EOF ;
    public final EObject entryRuleAmountStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmountStatement = null;


        try {
            // InternalStory.g:181:56: (iv_ruleAmountStatement= ruleAmountStatement EOF )
            // InternalStory.g:182:2: iv_ruleAmountStatement= ruleAmountStatement EOF
            {
             newCompositeNode(grammarAccess.getAmountStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmountStatement=ruleAmountStatement();

            state._fsp--;

             current =iv_ruleAmountStatement; 
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
    // $ANTLR end "entryRuleAmountStatement"


    // $ANTLR start "ruleAmountStatement"
    // InternalStory.g:188:1: ruleAmountStatement returns [EObject current=null] : (otherlv_0= 'amount:' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ';' ) ;
    public final EObject ruleAmountStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStory.g:194:2: ( (otherlv_0= 'amount:' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ';' ) )
            // InternalStory.g:195:2: (otherlv_0= 'amount:' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ';' )
            {
            // InternalStory.g:195:2: (otherlv_0= 'amount:' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ';' )
            // InternalStory.g:196:3: otherlv_0= 'amount:' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAmountStatementAccess().getAmountKeyword_0());
            		
            // InternalStory.g:200:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalStory.g:201:4: (lv_value_1_0= RULE_INT )
            {
            // InternalStory.g:201:4: (lv_value_1_0= RULE_INT )
            // InternalStory.g:202:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_value_1_0, grammarAccess.getAmountStatementAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAmountStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAmountStatementAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleAmountStatement"


    // $ANTLR start "entryRulePlaceStatement"
    // InternalStory.g:226:1: entryRulePlaceStatement returns [EObject current=null] : iv_rulePlaceStatement= rulePlaceStatement EOF ;
    public final EObject entryRulePlaceStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaceStatement = null;


        try {
            // InternalStory.g:226:55: (iv_rulePlaceStatement= rulePlaceStatement EOF )
            // InternalStory.g:227:2: iv_rulePlaceStatement= rulePlaceStatement EOF
            {
             newCompositeNode(grammarAccess.getPlaceStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlaceStatement=rulePlaceStatement();

            state._fsp--;

             current =iv_rulePlaceStatement; 
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
    // $ANTLR end "entryRulePlaceStatement"


    // $ANTLR start "rulePlaceStatement"
    // InternalStory.g:233:1: rulePlaceStatement returns [EObject current=null] : (otherlv_0= 'place:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject rulePlaceStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStory.g:239:2: ( (otherlv_0= 'place:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalStory.g:240:2: (otherlv_0= 'place:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalStory.g:240:2: (otherlv_0= 'place:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalStory.g:241:3: otherlv_0= 'place:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPlaceStatementAccess().getPlaceKeyword_0());
            		
            // InternalStory.g:245:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalStory.g:246:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalStory.g:246:4: (lv_value_1_0= RULE_STRING )
            // InternalStory.g:247:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_value_1_0, grammarAccess.getPlaceStatementAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlaceStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPlaceStatementAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "rulePlaceStatement"


    // $ANTLR start "entryRulePathStatement"
    // InternalStory.g:271:1: entryRulePathStatement returns [EObject current=null] : iv_rulePathStatement= rulePathStatement EOF ;
    public final EObject entryRulePathStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathStatement = null;


        try {
            // InternalStory.g:271:54: (iv_rulePathStatement= rulePathStatement EOF )
            // InternalStory.g:272:2: iv_rulePathStatement= rulePathStatement EOF
            {
             newCompositeNode(grammarAccess.getPathStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathStatement=rulePathStatement();

            state._fsp--;

             current =iv_rulePathStatement; 
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
    // $ANTLR end "entryRulePathStatement"


    // $ANTLR start "rulePathStatement"
    // InternalStory.g:278:1: rulePathStatement returns [EObject current=null] : (otherlv_0= 'path:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) ;
    public final EObject rulePathStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStory.g:284:2: ( (otherlv_0= 'path:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) )
            // InternalStory.g:285:2: (otherlv_0= 'path:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            {
            // InternalStory.g:285:2: (otherlv_0= 'path:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            // InternalStory.g:286:3: otherlv_0= 'path:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPathStatementAccess().getPathKeyword_0());
            		
            // InternalStory.g:290:3: ( (lv_list_1_0= RULE_STRING ) )
            // InternalStory.g:291:4: (lv_list_1_0= RULE_STRING )
            {
            // InternalStory.g:291:4: (lv_list_1_0= RULE_STRING )
            // InternalStory.g:292:5: lv_list_1_0= RULE_STRING
            {
            lv_list_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_list_1_0, grammarAccess.getPathStatementAccess().getListSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPathStatementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalStory.g:308:3: (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStory.g:309:4: otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPathStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStory.g:313:4: ( (lv_list_3_0= RULE_STRING ) )
            	    // InternalStory.g:314:5: (lv_list_3_0= RULE_STRING )
            	    {
            	    // InternalStory.g:314:5: (lv_list_3_0= RULE_STRING )
            	    // InternalStory.g:315:6: lv_list_3_0= RULE_STRING
            	    {
            	    lv_list_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    						newLeafNode(lv_list_3_0, grammarAccess.getPathStatementAccess().getListSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPathStatementRule());
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

            			newLeafNode(otherlv_4, grammarAccess.getPathStatementAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "rulePathStatement"


    // $ANTLR start "entryRuleMoveStatement"
    // InternalStory.g:340:1: entryRuleMoveStatement returns [EObject current=null] : iv_ruleMoveStatement= ruleMoveStatement EOF ;
    public final EObject entryRuleMoveStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveStatement = null;


        try {
            // InternalStory.g:340:54: (iv_ruleMoveStatement= ruleMoveStatement EOF )
            // InternalStory.g:341:2: iv_ruleMoveStatement= ruleMoveStatement EOF
            {
             newCompositeNode(grammarAccess.getMoveStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveStatement=ruleMoveStatement();

            state._fsp--;

             current =iv_ruleMoveStatement; 
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
    // $ANTLR end "entryRuleMoveStatement"


    // $ANTLR start "ruleMoveStatement"
    // InternalStory.g:347:1: ruleMoveStatement returns [EObject current=null] : (otherlv_0= 'move:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleMoveStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStory.g:353:2: ( (otherlv_0= 'move:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) )
            // InternalStory.g:354:2: (otherlv_0= 'move:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            {
            // InternalStory.g:354:2: (otherlv_0= 'move:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            // InternalStory.g:355:3: otherlv_0= 'move:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveStatementAccess().getMoveKeyword_0());
            		
            // InternalStory.g:359:3: ( (lv_list_1_0= RULE_STRING ) )
            // InternalStory.g:360:4: (lv_list_1_0= RULE_STRING )
            {
            // InternalStory.g:360:4: (lv_list_1_0= RULE_STRING )
            // InternalStory.g:361:5: lv_list_1_0= RULE_STRING
            {
            lv_list_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_list_1_0, grammarAccess.getMoveStatementAccess().getListSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveStatementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalStory.g:377:3: (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStory.g:378:4: otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMoveStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStory.g:382:4: ( (lv_list_3_0= RULE_STRING ) )
            	    // InternalStory.g:383:5: (lv_list_3_0= RULE_STRING )
            	    {
            	    // InternalStory.g:383:5: (lv_list_3_0= RULE_STRING )
            	    // InternalStory.g:384:6: lv_list_3_0= RULE_STRING
            	    {
            	    lv_list_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    						newLeafNode(lv_list_3_0, grammarAccess.getMoveStatementAccess().getListSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMoveStatementRule());
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

            			newLeafNode(otherlv_4, grammarAccess.getMoveStatementAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleMoveStatement"


    // $ANTLR start "entryRuleNearbyStatement"
    // InternalStory.g:409:1: entryRuleNearbyStatement returns [EObject current=null] : iv_ruleNearbyStatement= ruleNearbyStatement EOF ;
    public final EObject entryRuleNearbyStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNearbyStatement = null;


        try {
            // InternalStory.g:409:56: (iv_ruleNearbyStatement= ruleNearbyStatement EOF )
            // InternalStory.g:410:2: iv_ruleNearbyStatement= ruleNearbyStatement EOF
            {
             newCompositeNode(grammarAccess.getNearbyStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNearbyStatement=ruleNearbyStatement();

            state._fsp--;

             current =iv_ruleNearbyStatement; 
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
    // $ANTLR end "entryRuleNearbyStatement"


    // $ANTLR start "ruleNearbyStatement"
    // InternalStory.g:416:1: ruleNearbyStatement returns [EObject current=null] : (otherlv_0= 'nearby:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleNearbyStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStory.g:422:2: ( (otherlv_0= 'nearby:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) )
            // InternalStory.g:423:2: (otherlv_0= 'nearby:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            {
            // InternalStory.g:423:2: (otherlv_0= 'nearby:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            // InternalStory.g:424:3: otherlv_0= 'nearby:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getNearbyStatementAccess().getNearbyKeyword_0());
            		
            // InternalStory.g:428:3: ( (lv_list_1_0= RULE_STRING ) )
            // InternalStory.g:429:4: (lv_list_1_0= RULE_STRING )
            {
            // InternalStory.g:429:4: (lv_list_1_0= RULE_STRING )
            // InternalStory.g:430:5: lv_list_1_0= RULE_STRING
            {
            lv_list_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_list_1_0, grammarAccess.getNearbyStatementAccess().getListSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNearbyStatementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalStory.g:446:3: (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStory.g:447:4: otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getNearbyStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStory.g:451:4: ( (lv_list_3_0= RULE_STRING ) )
            	    // InternalStory.g:452:5: (lv_list_3_0= RULE_STRING )
            	    {
            	    // InternalStory.g:452:5: (lv_list_3_0= RULE_STRING )
            	    // InternalStory.g:453:6: lv_list_3_0= RULE_STRING
            	    {
            	    lv_list_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    						newLeafNode(lv_list_3_0, grammarAccess.getNearbyStatementAccess().getListSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getNearbyStatementRule());
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

            			newLeafNode(otherlv_4, grammarAccess.getNearbyStatementAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleNearbyStatement"


    // $ANTLR start "entryRuleSubstanceStatement"
    // InternalStory.g:478:1: entryRuleSubstanceStatement returns [EObject current=null] : iv_ruleSubstanceStatement= ruleSubstanceStatement EOF ;
    public final EObject entryRuleSubstanceStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstanceStatement = null;


        try {
            // InternalStory.g:478:59: (iv_ruleSubstanceStatement= ruleSubstanceStatement EOF )
            // InternalStory.g:479:2: iv_ruleSubstanceStatement= ruleSubstanceStatement EOF
            {
             newCompositeNode(grammarAccess.getSubstanceStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubstanceStatement=ruleSubstanceStatement();

            state._fsp--;

             current =iv_ruleSubstanceStatement; 
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
    // $ANTLR end "entryRuleSubstanceStatement"


    // $ANTLR start "ruleSubstanceStatement"
    // InternalStory.g:485:1: ruleSubstanceStatement returns [EObject current=null] : (otherlv_0= 'substance:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleSubstanceStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStory.g:491:2: ( (otherlv_0= 'substance:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) )
            // InternalStory.g:492:2: (otherlv_0= 'substance:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            {
            // InternalStory.g:492:2: (otherlv_0= 'substance:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            // InternalStory.g:493:3: otherlv_0= 'substance:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSubstanceStatementAccess().getSubstanceKeyword_0());
            		
            // InternalStory.g:497:3: ( (lv_list_1_0= RULE_STRING ) )
            // InternalStory.g:498:4: (lv_list_1_0= RULE_STRING )
            {
            // InternalStory.g:498:4: (lv_list_1_0= RULE_STRING )
            // InternalStory.g:499:5: lv_list_1_0= RULE_STRING
            {
            lv_list_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_list_1_0, grammarAccess.getSubstanceStatementAccess().getListSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubstanceStatementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalStory.g:515:3: (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStory.g:516:4: otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSubstanceStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStory.g:520:4: ( (lv_list_3_0= RULE_STRING ) )
            	    // InternalStory.g:521:5: (lv_list_3_0= RULE_STRING )
            	    {
            	    // InternalStory.g:521:5: (lv_list_3_0= RULE_STRING )
            	    // InternalStory.g:522:6: lv_list_3_0= RULE_STRING
            	    {
            	    lv_list_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    						newLeafNode(lv_list_3_0, grammarAccess.getSubstanceStatementAccess().getListSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSubstanceStatementRule());
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

            			newLeafNode(otherlv_4, grammarAccess.getSubstanceStatementAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleSubstanceStatement"


    // $ANTLR start "entryRuleMoodStatement"
    // InternalStory.g:547:1: entryRuleMoodStatement returns [EObject current=null] : iv_ruleMoodStatement= ruleMoodStatement EOF ;
    public final EObject entryRuleMoodStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoodStatement = null;


        try {
            // InternalStory.g:547:54: (iv_ruleMoodStatement= ruleMoodStatement EOF )
            // InternalStory.g:548:2: iv_ruleMoodStatement= ruleMoodStatement EOF
            {
             newCompositeNode(grammarAccess.getMoodStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoodStatement=ruleMoodStatement();

            state._fsp--;

             current =iv_ruleMoodStatement; 
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
    // $ANTLR end "entryRuleMoodStatement"


    // $ANTLR start "ruleMoodStatement"
    // InternalStory.g:554:1: ruleMoodStatement returns [EObject current=null] : (otherlv_0= 'mood:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleMoodStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStory.g:560:2: ( (otherlv_0= 'mood:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' ) )
            // InternalStory.g:561:2: (otherlv_0= 'mood:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            {
            // InternalStory.g:561:2: (otherlv_0= 'mood:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';' )
            // InternalStory.g:562:3: otherlv_0= 'mood:' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMoodStatementAccess().getMoodKeyword_0());
            		
            // InternalStory.g:566:3: ( (lv_list_1_0= RULE_STRING ) )
            // InternalStory.g:567:4: (lv_list_1_0= RULE_STRING )
            {
            // InternalStory.g:567:4: (lv_list_1_0= RULE_STRING )
            // InternalStory.g:568:5: lv_list_1_0= RULE_STRING
            {
            lv_list_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_list_1_0, grammarAccess.getMoodStatementAccess().getListSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoodStatementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalStory.g:584:3: (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStory.g:585:4: otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMoodStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStory.g:589:4: ( (lv_list_3_0= RULE_STRING ) )
            	    // InternalStory.g:590:5: (lv_list_3_0= RULE_STRING )
            	    {
            	    // InternalStory.g:590:5: (lv_list_3_0= RULE_STRING )
            	    // InternalStory.g:591:6: lv_list_3_0= RULE_STRING
            	    {
            	    lv_list_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    						newLeafNode(lv_list_3_0, grammarAccess.getMoodStatementAccess().getListSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMoodStatementRule());
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

            			newLeafNode(otherlv_4, grammarAccess.getMoodStatementAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleMoodStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000F6802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009000L});

}