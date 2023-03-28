package org.xtext.coursework.storyLang.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.coursework.storyLang.services.StoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStoryParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(StoryGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleStoryProgram"
    // InternalStory.g:53:1: entryRuleStoryProgram : ruleStoryProgram EOF ;
    public final void entryRuleStoryProgram() throws RecognitionException {
        try {
            // InternalStory.g:54:1: ( ruleStoryProgram EOF )
            // InternalStory.g:55:1: ruleStoryProgram EOF
            {
             before(grammarAccess.getStoryProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleStoryProgram();

            state._fsp--;

             after(grammarAccess.getStoryProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStoryProgram"


    // $ANTLR start "ruleStoryProgram"
    // InternalStory.g:62:1: ruleStoryProgram : ( ( rule__StoryProgram__StatementsAssignment )* ) ;
    public final void ruleStoryProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:66:2: ( ( ( rule__StoryProgram__StatementsAssignment )* ) )
            // InternalStory.g:67:2: ( ( rule__StoryProgram__StatementsAssignment )* )
            {
            // InternalStory.g:67:2: ( ( rule__StoryProgram__StatementsAssignment )* )
            // InternalStory.g:68:3: ( rule__StoryProgram__StatementsAssignment )*
            {
             before(grammarAccess.getStoryProgramAccess().getStatementsAssignment()); 
            // InternalStory.g:69:3: ( rule__StoryProgram__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=14)||(LA1_0>=16 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStory.g:69:4: rule__StoryProgram__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StoryProgram__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getStoryProgramAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStoryProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalStory.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalStory.g:79:1: ( ruleStatement EOF )
            // InternalStory.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalStory.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalStory.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalStory.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalStory.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalStory.g:94:3: ( rule__Statement__Alternatives )
            // InternalStory.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAmountStatement"
    // InternalStory.g:103:1: entryRuleAmountStatement : ruleAmountStatement EOF ;
    public final void entryRuleAmountStatement() throws RecognitionException {
        try {
            // InternalStory.g:104:1: ( ruleAmountStatement EOF )
            // InternalStory.g:105:1: ruleAmountStatement EOF
            {
             before(grammarAccess.getAmountStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleAmountStatement();

            state._fsp--;

             after(grammarAccess.getAmountStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAmountStatement"


    // $ANTLR start "ruleAmountStatement"
    // InternalStory.g:112:1: ruleAmountStatement : ( ( rule__AmountStatement__Group__0 ) ) ;
    public final void ruleAmountStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:116:2: ( ( ( rule__AmountStatement__Group__0 ) ) )
            // InternalStory.g:117:2: ( ( rule__AmountStatement__Group__0 ) )
            {
            // InternalStory.g:117:2: ( ( rule__AmountStatement__Group__0 ) )
            // InternalStory.g:118:3: ( rule__AmountStatement__Group__0 )
            {
             before(grammarAccess.getAmountStatementAccess().getGroup()); 
            // InternalStory.g:119:3: ( rule__AmountStatement__Group__0 )
            // InternalStory.g:119:4: rule__AmountStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AmountStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAmountStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAmountStatement"


    // $ANTLR start "entryRulePlaceStatement"
    // InternalStory.g:128:1: entryRulePlaceStatement : rulePlaceStatement EOF ;
    public final void entryRulePlaceStatement() throws RecognitionException {
        try {
            // InternalStory.g:129:1: ( rulePlaceStatement EOF )
            // InternalStory.g:130:1: rulePlaceStatement EOF
            {
             before(grammarAccess.getPlaceStatementRule()); 
            pushFollow(FOLLOW_1);
            rulePlaceStatement();

            state._fsp--;

             after(grammarAccess.getPlaceStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlaceStatement"


    // $ANTLR start "rulePlaceStatement"
    // InternalStory.g:137:1: rulePlaceStatement : ( ( rule__PlaceStatement__Group__0 ) ) ;
    public final void rulePlaceStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:141:2: ( ( ( rule__PlaceStatement__Group__0 ) ) )
            // InternalStory.g:142:2: ( ( rule__PlaceStatement__Group__0 ) )
            {
            // InternalStory.g:142:2: ( ( rule__PlaceStatement__Group__0 ) )
            // InternalStory.g:143:3: ( rule__PlaceStatement__Group__0 )
            {
             before(grammarAccess.getPlaceStatementAccess().getGroup()); 
            // InternalStory.g:144:3: ( rule__PlaceStatement__Group__0 )
            // InternalStory.g:144:4: rule__PlaceStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlaceStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlaceStatement"


    // $ANTLR start "entryRulePathStatement"
    // InternalStory.g:153:1: entryRulePathStatement : rulePathStatement EOF ;
    public final void entryRulePathStatement() throws RecognitionException {
        try {
            // InternalStory.g:154:1: ( rulePathStatement EOF )
            // InternalStory.g:155:1: rulePathStatement EOF
            {
             before(grammarAccess.getPathStatementRule()); 
            pushFollow(FOLLOW_1);
            rulePathStatement();

            state._fsp--;

             after(grammarAccess.getPathStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathStatement"


    // $ANTLR start "rulePathStatement"
    // InternalStory.g:162:1: rulePathStatement : ( ( rule__PathStatement__Group__0 ) ) ;
    public final void rulePathStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:166:2: ( ( ( rule__PathStatement__Group__0 ) ) )
            // InternalStory.g:167:2: ( ( rule__PathStatement__Group__0 ) )
            {
            // InternalStory.g:167:2: ( ( rule__PathStatement__Group__0 ) )
            // InternalStory.g:168:3: ( rule__PathStatement__Group__0 )
            {
             before(grammarAccess.getPathStatementAccess().getGroup()); 
            // InternalStory.g:169:3: ( rule__PathStatement__Group__0 )
            // InternalStory.g:169:4: rule__PathStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PathStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathStatement"


    // $ANTLR start "entryRuleMoveStatement"
    // InternalStory.g:178:1: entryRuleMoveStatement : ruleMoveStatement EOF ;
    public final void entryRuleMoveStatement() throws RecognitionException {
        try {
            // InternalStory.g:179:1: ( ruleMoveStatement EOF )
            // InternalStory.g:180:1: ruleMoveStatement EOF
            {
             before(grammarAccess.getMoveStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveStatement();

            state._fsp--;

             after(grammarAccess.getMoveStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveStatement"


    // $ANTLR start "ruleMoveStatement"
    // InternalStory.g:187:1: ruleMoveStatement : ( ( rule__MoveStatement__Group__0 ) ) ;
    public final void ruleMoveStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:191:2: ( ( ( rule__MoveStatement__Group__0 ) ) )
            // InternalStory.g:192:2: ( ( rule__MoveStatement__Group__0 ) )
            {
            // InternalStory.g:192:2: ( ( rule__MoveStatement__Group__0 ) )
            // InternalStory.g:193:3: ( rule__MoveStatement__Group__0 )
            {
             before(grammarAccess.getMoveStatementAccess().getGroup()); 
            // InternalStory.g:194:3: ( rule__MoveStatement__Group__0 )
            // InternalStory.g:194:4: rule__MoveStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveStatement"


    // $ANTLR start "entryRuleNearbyStatement"
    // InternalStory.g:203:1: entryRuleNearbyStatement : ruleNearbyStatement EOF ;
    public final void entryRuleNearbyStatement() throws RecognitionException {
        try {
            // InternalStory.g:204:1: ( ruleNearbyStatement EOF )
            // InternalStory.g:205:1: ruleNearbyStatement EOF
            {
             before(grammarAccess.getNearbyStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleNearbyStatement();

            state._fsp--;

             after(grammarAccess.getNearbyStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNearbyStatement"


    // $ANTLR start "ruleNearbyStatement"
    // InternalStory.g:212:1: ruleNearbyStatement : ( ( rule__NearbyStatement__Group__0 ) ) ;
    public final void ruleNearbyStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:216:2: ( ( ( rule__NearbyStatement__Group__0 ) ) )
            // InternalStory.g:217:2: ( ( rule__NearbyStatement__Group__0 ) )
            {
            // InternalStory.g:217:2: ( ( rule__NearbyStatement__Group__0 ) )
            // InternalStory.g:218:3: ( rule__NearbyStatement__Group__0 )
            {
             before(grammarAccess.getNearbyStatementAccess().getGroup()); 
            // InternalStory.g:219:3: ( rule__NearbyStatement__Group__0 )
            // InternalStory.g:219:4: rule__NearbyStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NearbyStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNearbyStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNearbyStatement"


    // $ANTLR start "entryRuleSubstanceStatement"
    // InternalStory.g:228:1: entryRuleSubstanceStatement : ruleSubstanceStatement EOF ;
    public final void entryRuleSubstanceStatement() throws RecognitionException {
        try {
            // InternalStory.g:229:1: ( ruleSubstanceStatement EOF )
            // InternalStory.g:230:1: ruleSubstanceStatement EOF
            {
             before(grammarAccess.getSubstanceStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleSubstanceStatement();

            state._fsp--;

             after(grammarAccess.getSubstanceStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubstanceStatement"


    // $ANTLR start "ruleSubstanceStatement"
    // InternalStory.g:237:1: ruleSubstanceStatement : ( ( rule__SubstanceStatement__Group__0 ) ) ;
    public final void ruleSubstanceStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:241:2: ( ( ( rule__SubstanceStatement__Group__0 ) ) )
            // InternalStory.g:242:2: ( ( rule__SubstanceStatement__Group__0 ) )
            {
            // InternalStory.g:242:2: ( ( rule__SubstanceStatement__Group__0 ) )
            // InternalStory.g:243:3: ( rule__SubstanceStatement__Group__0 )
            {
             before(grammarAccess.getSubstanceStatementAccess().getGroup()); 
            // InternalStory.g:244:3: ( rule__SubstanceStatement__Group__0 )
            // InternalStory.g:244:4: rule__SubstanceStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubstanceStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubstanceStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubstanceStatement"


    // $ANTLR start "entryRuleMoodStatement"
    // InternalStory.g:253:1: entryRuleMoodStatement : ruleMoodStatement EOF ;
    public final void entryRuleMoodStatement() throws RecognitionException {
        try {
            // InternalStory.g:254:1: ( ruleMoodStatement EOF )
            // InternalStory.g:255:1: ruleMoodStatement EOF
            {
             before(grammarAccess.getMoodStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleMoodStatement();

            state._fsp--;

             after(grammarAccess.getMoodStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoodStatement"


    // $ANTLR start "ruleMoodStatement"
    // InternalStory.g:262:1: ruleMoodStatement : ( ( rule__MoodStatement__Group__0 ) ) ;
    public final void ruleMoodStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:266:2: ( ( ( rule__MoodStatement__Group__0 ) ) )
            // InternalStory.g:267:2: ( ( rule__MoodStatement__Group__0 ) )
            {
            // InternalStory.g:267:2: ( ( rule__MoodStatement__Group__0 ) )
            // InternalStory.g:268:3: ( rule__MoodStatement__Group__0 )
            {
             before(grammarAccess.getMoodStatementAccess().getGroup()); 
            // InternalStory.g:269:3: ( rule__MoodStatement__Group__0 )
            // InternalStory.g:269:4: rule__MoodStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoodStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoodStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoodStatement"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalStory.g:277:1: rule__Statement__Alternatives : ( ( rulePlaceStatement ) | ( rulePathStatement ) | ( ruleMoveStatement ) | ( ruleNearbyStatement ) | ( ruleSubstanceStatement ) | ( ruleMoodStatement ) | ( ruleAmountStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:281:1: ( ( rulePlaceStatement ) | ( rulePathStatement ) | ( ruleMoveStatement ) | ( ruleNearbyStatement ) | ( ruleSubstanceStatement ) | ( ruleMoodStatement ) | ( ruleAmountStatement ) )
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
                    // InternalStory.g:282:2: ( rulePlaceStatement )
                    {
                    // InternalStory.g:282:2: ( rulePlaceStatement )
                    // InternalStory.g:283:3: rulePlaceStatement
                    {
                     before(grammarAccess.getStatementAccess().getPlaceStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePlaceStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPlaceStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStory.g:288:2: ( rulePathStatement )
                    {
                    // InternalStory.g:288:2: ( rulePathStatement )
                    // InternalStory.g:289:3: rulePathStatement
                    {
                     before(grammarAccess.getStatementAccess().getPathStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePathStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPathStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalStory.g:294:2: ( ruleMoveStatement )
                    {
                    // InternalStory.g:294:2: ( ruleMoveStatement )
                    // InternalStory.g:295:3: ruleMoveStatement
                    {
                     before(grammarAccess.getStatementAccess().getMoveStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMoveStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalStory.g:300:2: ( ruleNearbyStatement )
                    {
                    // InternalStory.g:300:2: ( ruleNearbyStatement )
                    // InternalStory.g:301:3: ruleNearbyStatement
                    {
                     before(grammarAccess.getStatementAccess().getNearbyStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNearbyStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getNearbyStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalStory.g:306:2: ( ruleSubstanceStatement )
                    {
                    // InternalStory.g:306:2: ( ruleSubstanceStatement )
                    // InternalStory.g:307:3: ruleSubstanceStatement
                    {
                     before(grammarAccess.getStatementAccess().getSubstanceStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSubstanceStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSubstanceStatementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalStory.g:312:2: ( ruleMoodStatement )
                    {
                    // InternalStory.g:312:2: ( ruleMoodStatement )
                    // InternalStory.g:313:3: ruleMoodStatement
                    {
                     before(grammarAccess.getStatementAccess().getMoodStatementParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleMoodStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMoodStatementParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalStory.g:318:2: ( ruleAmountStatement )
                    {
                    // InternalStory.g:318:2: ( ruleAmountStatement )
                    // InternalStory.g:319:3: ruleAmountStatement
                    {
                     before(grammarAccess.getStatementAccess().getAmountStatementParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleAmountStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAmountStatementParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__AmountStatement__Group__0"
    // InternalStory.g:328:1: rule__AmountStatement__Group__0 : rule__AmountStatement__Group__0__Impl rule__AmountStatement__Group__1 ;
    public final void rule__AmountStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:332:1: ( rule__AmountStatement__Group__0__Impl rule__AmountStatement__Group__1 )
            // InternalStory.g:333:2: rule__AmountStatement__Group__0__Impl rule__AmountStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AmountStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmountStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmountStatement__Group__0"


    // $ANTLR start "rule__AmountStatement__Group__0__Impl"
    // InternalStory.g:340:1: rule__AmountStatement__Group__0__Impl : ( 'amount:' ) ;
    public final void rule__AmountStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:344:1: ( ( 'amount:' ) )
            // InternalStory.g:345:1: ( 'amount:' )
            {
            // InternalStory.g:345:1: ( 'amount:' )
            // InternalStory.g:346:2: 'amount:'
            {
             before(grammarAccess.getAmountStatementAccess().getAmountKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAmountStatementAccess().getAmountKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmountStatement__Group__0__Impl"


    // $ANTLR start "rule__AmountStatement__Group__1"
    // InternalStory.g:355:1: rule__AmountStatement__Group__1 : rule__AmountStatement__Group__1__Impl rule__AmountStatement__Group__2 ;
    public final void rule__AmountStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:359:1: ( rule__AmountStatement__Group__1__Impl rule__AmountStatement__Group__2 )
            // InternalStory.g:360:2: rule__AmountStatement__Group__1__Impl rule__AmountStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AmountStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmountStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmountStatement__Group__1"


    // $ANTLR start "rule__AmountStatement__Group__1__Impl"
    // InternalStory.g:367:1: rule__AmountStatement__Group__1__Impl : ( ( rule__AmountStatement__ValueAssignment_1 ) ) ;
    public final void rule__AmountStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:371:1: ( ( ( rule__AmountStatement__ValueAssignment_1 ) ) )
            // InternalStory.g:372:1: ( ( rule__AmountStatement__ValueAssignment_1 ) )
            {
            // InternalStory.g:372:1: ( ( rule__AmountStatement__ValueAssignment_1 ) )
            // InternalStory.g:373:2: ( rule__AmountStatement__ValueAssignment_1 )
            {
             before(grammarAccess.getAmountStatementAccess().getValueAssignment_1()); 
            // InternalStory.g:374:2: ( rule__AmountStatement__ValueAssignment_1 )
            // InternalStory.g:374:3: rule__AmountStatement__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AmountStatement__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAmountStatementAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmountStatement__Group__1__Impl"


    // $ANTLR start "rule__AmountStatement__Group__2"
    // InternalStory.g:382:1: rule__AmountStatement__Group__2 : rule__AmountStatement__Group__2__Impl ;
    public final void rule__AmountStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:386:1: ( rule__AmountStatement__Group__2__Impl )
            // InternalStory.g:387:2: rule__AmountStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmountStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmountStatement__Group__2"


    // $ANTLR start "rule__AmountStatement__Group__2__Impl"
    // InternalStory.g:393:1: rule__AmountStatement__Group__2__Impl : ( ';' ) ;
    public final void rule__AmountStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:397:1: ( ( ';' ) )
            // InternalStory.g:398:1: ( ';' )
            {
            // InternalStory.g:398:1: ( ';' )
            // InternalStory.g:399:2: ';'
            {
             before(grammarAccess.getAmountStatementAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAmountStatementAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmountStatement__Group__2__Impl"


    // $ANTLR start "rule__PlaceStatement__Group__0"
    // InternalStory.g:409:1: rule__PlaceStatement__Group__0 : rule__PlaceStatement__Group__0__Impl rule__PlaceStatement__Group__1 ;
    public final void rule__PlaceStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:413:1: ( rule__PlaceStatement__Group__0__Impl rule__PlaceStatement__Group__1 )
            // InternalStory.g:414:2: rule__PlaceStatement__Group__0__Impl rule__PlaceStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PlaceStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlaceStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlaceStatement__Group__0"


    // $ANTLR start "rule__PlaceStatement__Group__0__Impl"
    // InternalStory.g:421:1: rule__PlaceStatement__Group__0__Impl : ( 'place:' ) ;
    public final void rule__PlaceStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:425:1: ( ( 'place:' ) )
            // InternalStory.g:426:1: ( 'place:' )
            {
            // InternalStory.g:426:1: ( 'place:' )
            // InternalStory.g:427:2: 'place:'
            {
             before(grammarAccess.getPlaceStatementAccess().getPlaceKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPlaceStatementAccess().getPlaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlaceStatement__Group__0__Impl"


    // $ANTLR start "rule__PlaceStatement__Group__1"
    // InternalStory.g:436:1: rule__PlaceStatement__Group__1 : rule__PlaceStatement__Group__1__Impl rule__PlaceStatement__Group__2 ;
    public final void rule__PlaceStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:440:1: ( rule__PlaceStatement__Group__1__Impl rule__PlaceStatement__Group__2 )
            // InternalStory.g:441:2: rule__PlaceStatement__Group__1__Impl rule__PlaceStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PlaceStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlaceStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlaceStatement__Group__1"


    // $ANTLR start "rule__PlaceStatement__Group__1__Impl"
    // InternalStory.g:448:1: rule__PlaceStatement__Group__1__Impl : ( ( rule__PlaceStatement__ValueAssignment_1 ) ) ;
    public final void rule__PlaceStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:452:1: ( ( ( rule__PlaceStatement__ValueAssignment_1 ) ) )
            // InternalStory.g:453:1: ( ( rule__PlaceStatement__ValueAssignment_1 ) )
            {
            // InternalStory.g:453:1: ( ( rule__PlaceStatement__ValueAssignment_1 ) )
            // InternalStory.g:454:2: ( rule__PlaceStatement__ValueAssignment_1 )
            {
             before(grammarAccess.getPlaceStatementAccess().getValueAssignment_1()); 
            // InternalStory.g:455:2: ( rule__PlaceStatement__ValueAssignment_1 )
            // InternalStory.g:455:3: rule__PlaceStatement__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PlaceStatement__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceStatementAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlaceStatement__Group__1__Impl"


    // $ANTLR start "rule__PlaceStatement__Group__2"
    // InternalStory.g:463:1: rule__PlaceStatement__Group__2 : rule__PlaceStatement__Group__2__Impl ;
    public final void rule__PlaceStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:467:1: ( rule__PlaceStatement__Group__2__Impl )
            // InternalStory.g:468:2: rule__PlaceStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlaceStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlaceStatement__Group__2"


    // $ANTLR start "rule__PlaceStatement__Group__2__Impl"
    // InternalStory.g:474:1: rule__PlaceStatement__Group__2__Impl : ( ';' ) ;
    public final void rule__PlaceStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:478:1: ( ( ';' ) )
            // InternalStory.g:479:1: ( ';' )
            {
            // InternalStory.g:479:1: ( ';' )
            // InternalStory.g:480:2: ';'
            {
             before(grammarAccess.getPlaceStatementAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPlaceStatementAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlaceStatement__Group__2__Impl"


    // $ANTLR start "rule__PathStatement__Group__0"
    // InternalStory.g:490:1: rule__PathStatement__Group__0 : rule__PathStatement__Group__0__Impl rule__PathStatement__Group__1 ;
    public final void rule__PathStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:494:1: ( rule__PathStatement__Group__0__Impl rule__PathStatement__Group__1 )
            // InternalStory.g:495:2: rule__PathStatement__Group__0__Impl rule__PathStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PathStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathStatement__Group__0"


    // $ANTLR start "rule__PathStatement__Group__0__Impl"
    // InternalStory.g:502:1: rule__PathStatement__Group__0__Impl : ( 'path:' ) ;
    public final void rule__PathStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:506:1: ( ( 'path:' ) )
            // InternalStory.g:507:1: ( 'path:' )
            {
            // InternalStory.g:507:1: ( 'path:' )
            // InternalStory.g:508:2: 'path:'
            {
             before(grammarAccess.getPathStatementAccess().getPathKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPathStatementAccess().getPathKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathStatement__Group__0__Impl"


    // $ANTLR start "rule__PathStatement__Group__1"
    // InternalStory.g:517:1: rule__PathStatement__Group__1 : rule__PathStatement__Group__1__Impl rule__PathStatement__Group__2 ;
    public final void rule__PathStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:521:1: ( rule__PathStatement__Group__1__Impl rule__PathStatement__Group__2 )
            // InternalStory.g:522:2: rule__PathStatement__Group__1__Impl rule__PathStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__PathStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathStatement__Group__1"


    // $ANTLR start "rule__PathStatement__Group__1__Impl"
    // InternalStory.g:529:1: rule__PathStatement__Group__1__Impl : ( ( rule__PathStatement__ListAssignment_1 ) ) ;
    public final void rule__PathStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:533:1: ( ( ( rule__PathStatement__ListAssignment_1 ) ) )
            // InternalStory.g:534:1: ( ( rule__PathStatement__ListAssignment_1 ) )
            {
            // InternalStory.g:534:1: ( ( rule__PathStatement__ListAssignment_1 ) )
            // InternalStory.g:535:2: ( rule__PathStatement__ListAssignment_1 )
            {
             before(grammarAccess.getPathStatementAccess().getListAssignment_1()); 
            // InternalStory.g:536:2: ( rule__PathStatement__ListAssignment_1 )
            // InternalStory.g:536:3: rule__PathStatement__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PathStatement__ListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPathStatementAccess().getListAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathStatement__Group__1__Impl"


    // $ANTLR start "rule__PathStatement__Group__2"
    // InternalStory.g:544:1: rule__PathStatement__Group__2 : rule__PathStatement__Group__2__Impl rule__PathStatement__Group__3 ;
    public final void rule__PathStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:548:1: ( rule__PathStatement__Group__2__Impl rule__PathStatement__Group__3 )
            // InternalStory.g:549:2: rule__PathStatement__Group__2__Impl rule__PathStatement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__PathStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathStatement__Group__2"


    // $ANTLR start "rule__PathStatement__Group__2__Impl"
    // InternalStory.g:556:1: rule__PathStatement__Group__2__Impl : ( ( rule__PathStatement__Group_2__0 )* ) ;
    public final void rule__PathStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:560:1: ( ( ( rule__PathStatement__Group_2__0 )* ) )
            // InternalStory.g:561:1: ( ( rule__PathStatement__Group_2__0 )* )
            {
            // InternalStory.g:561:1: ( ( rule__PathStatement__Group_2__0 )* )
            // InternalStory.g:562:2: ( rule__PathStatement__Group_2__0 )*
            {
             before(grammarAccess.getPathStatementAccess().getGroup_2()); 
            // InternalStory.g:563:2: ( rule__PathStatement__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStory.g:563:3: rule__PathStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__PathStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPathStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathStatement__Group__2__Impl"


    // $ANTLR start "rule__PathStatement__Group__3"
    // InternalStory.g:571:1: rule__PathStatement__Group__3 : rule__PathStatement__Group__3__Impl ;
    public final void rule__PathStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:575:1: ( rule__PathStatement__Group__3__Impl )
            // InternalStory.g:576:2: rule__PathStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathStatement__Group__3"


    // $ANTLR start "rule__PathStatement__Group__3__Impl"
    // InternalStory.g:582:1: rule__PathStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__PathStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:586:1: ( ( ';' ) )
            // InternalStory.g:587:1: ( ';' )
            {
            // InternalStory.g:587:1: ( ';' )
            // InternalStory.g:588:2: ';'
            {
             before(grammarAccess.getPathStatementAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPathStatementAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathStatement__Group__3__Impl"


    // $ANTLR start "rule__PathStatement__Group_2__0"
    // InternalStory.g:598:1: rule__PathStatement__Group_2__0 : rule__PathStatement__Group_2__0__Impl rule__PathStatement__Group_2__1 ;
    public final void rule__PathStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:602:1: ( rule__PathStatement__Group_2__0__Impl rule__PathStatement__Group_2__1 )
            // InternalStory.g:603:2: rule__PathStatement__Group_2__0__Impl rule__PathStatement__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__PathStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathStatement__Group_2__0"


    // $ANTLR start "rule__PathStatement__Group_2__0__Impl"
    // InternalStory.g:610:1: rule__PathStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__PathStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:614:1: ( ( ',' ) )
            // InternalStory.g:615:1: ( ',' )
            {
            // InternalStory.g:615:1: ( ',' )
            // InternalStory.g:616:2: ','
            {
             before(grammarAccess.getPathStatementAccess().getCommaKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPathStatementAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathStatement__Group_2__0__Impl"


    // $ANTLR start "rule__PathStatement__Group_2__1"
    // InternalStory.g:625:1: rule__PathStatement__Group_2__1 : rule__PathStatement__Group_2__1__Impl ;
    public final void rule__PathStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:629:1: ( rule__PathStatement__Group_2__1__Impl )
            // InternalStory.g:630:2: rule__PathStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathStatement__Group_2__1"


    // $ANTLR start "rule__PathStatement__Group_2__1__Impl"
    // InternalStory.g:636:1: rule__PathStatement__Group_2__1__Impl : ( ( rule__PathStatement__ListAssignment_2_1 ) ) ;
    public final void rule__PathStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:640:1: ( ( ( rule__PathStatement__ListAssignment_2_1 ) ) )
            // InternalStory.g:641:1: ( ( rule__PathStatement__ListAssignment_2_1 ) )
            {
            // InternalStory.g:641:1: ( ( rule__PathStatement__ListAssignment_2_1 ) )
            // InternalStory.g:642:2: ( rule__PathStatement__ListAssignment_2_1 )
            {
             before(grammarAccess.getPathStatementAccess().getListAssignment_2_1()); 
            // InternalStory.g:643:2: ( rule__PathStatement__ListAssignment_2_1 )
            // InternalStory.g:643:3: rule__PathStatement__ListAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PathStatement__ListAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPathStatementAccess().getListAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathStatement__Group_2__1__Impl"


    // $ANTLR start "rule__MoveStatement__Group__0"
    // InternalStory.g:652:1: rule__MoveStatement__Group__0 : rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 ;
    public final void rule__MoveStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:656:1: ( rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1 )
            // InternalStory.g:657:2: rule__MoveStatement__Group__0__Impl rule__MoveStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MoveStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__0"


    // $ANTLR start "rule__MoveStatement__Group__0__Impl"
    // InternalStory.g:664:1: rule__MoveStatement__Group__0__Impl : ( 'move:' ) ;
    public final void rule__MoveStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:668:1: ( ( 'move:' ) )
            // InternalStory.g:669:1: ( 'move:' )
            {
            // InternalStory.g:669:1: ( 'move:' )
            // InternalStory.g:670:2: 'move:'
            {
             before(grammarAccess.getMoveStatementAccess().getMoveKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMoveStatementAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__0__Impl"


    // $ANTLR start "rule__MoveStatement__Group__1"
    // InternalStory.g:679:1: rule__MoveStatement__Group__1 : rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 ;
    public final void rule__MoveStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:683:1: ( rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2 )
            // InternalStory.g:684:2: rule__MoveStatement__Group__1__Impl rule__MoveStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__MoveStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__1"


    // $ANTLR start "rule__MoveStatement__Group__1__Impl"
    // InternalStory.g:691:1: rule__MoveStatement__Group__1__Impl : ( ( rule__MoveStatement__ListAssignment_1 ) ) ;
    public final void rule__MoveStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:695:1: ( ( ( rule__MoveStatement__ListAssignment_1 ) ) )
            // InternalStory.g:696:1: ( ( rule__MoveStatement__ListAssignment_1 ) )
            {
            // InternalStory.g:696:1: ( ( rule__MoveStatement__ListAssignment_1 ) )
            // InternalStory.g:697:2: ( rule__MoveStatement__ListAssignment_1 )
            {
             before(grammarAccess.getMoveStatementAccess().getListAssignment_1()); 
            // InternalStory.g:698:2: ( rule__MoveStatement__ListAssignment_1 )
            // InternalStory.g:698:3: rule__MoveStatement__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveStatement__ListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveStatementAccess().getListAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__1__Impl"


    // $ANTLR start "rule__MoveStatement__Group__2"
    // InternalStory.g:706:1: rule__MoveStatement__Group__2 : rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 ;
    public final void rule__MoveStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:710:1: ( rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3 )
            // InternalStory.g:711:2: rule__MoveStatement__Group__2__Impl rule__MoveStatement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__MoveStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__2"


    // $ANTLR start "rule__MoveStatement__Group__2__Impl"
    // InternalStory.g:718:1: rule__MoveStatement__Group__2__Impl : ( ( rule__MoveStatement__Group_2__0 )* ) ;
    public final void rule__MoveStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:722:1: ( ( ( rule__MoveStatement__Group_2__0 )* ) )
            // InternalStory.g:723:1: ( ( rule__MoveStatement__Group_2__0 )* )
            {
            // InternalStory.g:723:1: ( ( rule__MoveStatement__Group_2__0 )* )
            // InternalStory.g:724:2: ( rule__MoveStatement__Group_2__0 )*
            {
             before(grammarAccess.getMoveStatementAccess().getGroup_2()); 
            // InternalStory.g:725:2: ( rule__MoveStatement__Group_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStory.g:725:3: rule__MoveStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MoveStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMoveStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__2__Impl"


    // $ANTLR start "rule__MoveStatement__Group__3"
    // InternalStory.g:733:1: rule__MoveStatement__Group__3 : rule__MoveStatement__Group__3__Impl ;
    public final void rule__MoveStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:737:1: ( rule__MoveStatement__Group__3__Impl )
            // InternalStory.g:738:2: rule__MoveStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__3"


    // $ANTLR start "rule__MoveStatement__Group__3__Impl"
    // InternalStory.g:744:1: rule__MoveStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__MoveStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:748:1: ( ( ';' ) )
            // InternalStory.g:749:1: ( ';' )
            {
            // InternalStory.g:749:1: ( ';' )
            // InternalStory.g:750:2: ';'
            {
             before(grammarAccess.getMoveStatementAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMoveStatementAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group__3__Impl"


    // $ANTLR start "rule__MoveStatement__Group_2__0"
    // InternalStory.g:760:1: rule__MoveStatement__Group_2__0 : rule__MoveStatement__Group_2__0__Impl rule__MoveStatement__Group_2__1 ;
    public final void rule__MoveStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:764:1: ( rule__MoveStatement__Group_2__0__Impl rule__MoveStatement__Group_2__1 )
            // InternalStory.g:765:2: rule__MoveStatement__Group_2__0__Impl rule__MoveStatement__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__MoveStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group_2__0"


    // $ANTLR start "rule__MoveStatement__Group_2__0__Impl"
    // InternalStory.g:772:1: rule__MoveStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__MoveStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:776:1: ( ( ',' ) )
            // InternalStory.g:777:1: ( ',' )
            {
            // InternalStory.g:777:1: ( ',' )
            // InternalStory.g:778:2: ','
            {
             before(grammarAccess.getMoveStatementAccess().getCommaKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMoveStatementAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group_2__0__Impl"


    // $ANTLR start "rule__MoveStatement__Group_2__1"
    // InternalStory.g:787:1: rule__MoveStatement__Group_2__1 : rule__MoveStatement__Group_2__1__Impl ;
    public final void rule__MoveStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:791:1: ( rule__MoveStatement__Group_2__1__Impl )
            // InternalStory.g:792:2: rule__MoveStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group_2__1"


    // $ANTLR start "rule__MoveStatement__Group_2__1__Impl"
    // InternalStory.g:798:1: rule__MoveStatement__Group_2__1__Impl : ( ( rule__MoveStatement__ListAssignment_2_1 ) ) ;
    public final void rule__MoveStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:802:1: ( ( ( rule__MoveStatement__ListAssignment_2_1 ) ) )
            // InternalStory.g:803:1: ( ( rule__MoveStatement__ListAssignment_2_1 ) )
            {
            // InternalStory.g:803:1: ( ( rule__MoveStatement__ListAssignment_2_1 ) )
            // InternalStory.g:804:2: ( rule__MoveStatement__ListAssignment_2_1 )
            {
             before(grammarAccess.getMoveStatementAccess().getListAssignment_2_1()); 
            // InternalStory.g:805:2: ( rule__MoveStatement__ListAssignment_2_1 )
            // InternalStory.g:805:3: rule__MoveStatement__ListAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveStatement__ListAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveStatementAccess().getListAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__Group_2__1__Impl"


    // $ANTLR start "rule__NearbyStatement__Group__0"
    // InternalStory.g:814:1: rule__NearbyStatement__Group__0 : rule__NearbyStatement__Group__0__Impl rule__NearbyStatement__Group__1 ;
    public final void rule__NearbyStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:818:1: ( rule__NearbyStatement__Group__0__Impl rule__NearbyStatement__Group__1 )
            // InternalStory.g:819:2: rule__NearbyStatement__Group__0__Impl rule__NearbyStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__NearbyStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NearbyStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NearbyStatement__Group__0"


    // $ANTLR start "rule__NearbyStatement__Group__0__Impl"
    // InternalStory.g:826:1: rule__NearbyStatement__Group__0__Impl : ( 'nearby:' ) ;
    public final void rule__NearbyStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:830:1: ( ( 'nearby:' ) )
            // InternalStory.g:831:1: ( 'nearby:' )
            {
            // InternalStory.g:831:1: ( 'nearby:' )
            // InternalStory.g:832:2: 'nearby:'
            {
             before(grammarAccess.getNearbyStatementAccess().getNearbyKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNearbyStatementAccess().getNearbyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NearbyStatement__Group__0__Impl"


    // $ANTLR start "rule__NearbyStatement__Group__1"
    // InternalStory.g:841:1: rule__NearbyStatement__Group__1 : rule__NearbyStatement__Group__1__Impl rule__NearbyStatement__Group__2 ;
    public final void rule__NearbyStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:845:1: ( rule__NearbyStatement__Group__1__Impl rule__NearbyStatement__Group__2 )
            // InternalStory.g:846:2: rule__NearbyStatement__Group__1__Impl rule__NearbyStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__NearbyStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NearbyStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NearbyStatement__Group__1"


    // $ANTLR start "rule__NearbyStatement__Group__1__Impl"
    // InternalStory.g:853:1: rule__NearbyStatement__Group__1__Impl : ( ( rule__NearbyStatement__ListAssignment_1 ) ) ;
    public final void rule__NearbyStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:857:1: ( ( ( rule__NearbyStatement__ListAssignment_1 ) ) )
            // InternalStory.g:858:1: ( ( rule__NearbyStatement__ListAssignment_1 ) )
            {
            // InternalStory.g:858:1: ( ( rule__NearbyStatement__ListAssignment_1 ) )
            // InternalStory.g:859:2: ( rule__NearbyStatement__ListAssignment_1 )
            {
             before(grammarAccess.getNearbyStatementAccess().getListAssignment_1()); 
            // InternalStory.g:860:2: ( rule__NearbyStatement__ListAssignment_1 )
            // InternalStory.g:860:3: rule__NearbyStatement__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NearbyStatement__ListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNearbyStatementAccess().getListAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NearbyStatement__Group__1__Impl"


    // $ANTLR start "rule__NearbyStatement__Group__2"
    // InternalStory.g:868:1: rule__NearbyStatement__Group__2 : rule__NearbyStatement__Group__2__Impl rule__NearbyStatement__Group__3 ;
    public final void rule__NearbyStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:872:1: ( rule__NearbyStatement__Group__2__Impl rule__NearbyStatement__Group__3 )
            // InternalStory.g:873:2: rule__NearbyStatement__Group__2__Impl rule__NearbyStatement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__NearbyStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NearbyStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NearbyStatement__Group__2"


    // $ANTLR start "rule__NearbyStatement__Group__2__Impl"
    // InternalStory.g:880:1: rule__NearbyStatement__Group__2__Impl : ( ( rule__NearbyStatement__Group_2__0 )* ) ;
    public final void rule__NearbyStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:884:1: ( ( ( rule__NearbyStatement__Group_2__0 )* ) )
            // InternalStory.g:885:1: ( ( rule__NearbyStatement__Group_2__0 )* )
            {
            // InternalStory.g:885:1: ( ( rule__NearbyStatement__Group_2__0 )* )
            // InternalStory.g:886:2: ( rule__NearbyStatement__Group_2__0 )*
            {
             before(grammarAccess.getNearbyStatementAccess().getGroup_2()); 
            // InternalStory.g:887:2: ( rule__NearbyStatement__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStory.g:887:3: rule__NearbyStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__NearbyStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getNearbyStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NearbyStatement__Group__2__Impl"


    // $ANTLR start "rule__NearbyStatement__Group__3"
    // InternalStory.g:895:1: rule__NearbyStatement__Group__3 : rule__NearbyStatement__Group__3__Impl ;
    public final void rule__NearbyStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:899:1: ( rule__NearbyStatement__Group__3__Impl )
            // InternalStory.g:900:2: rule__NearbyStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NearbyStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NearbyStatement__Group__3"


    // $ANTLR start "rule__NearbyStatement__Group__3__Impl"
    // InternalStory.g:906:1: rule__NearbyStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__NearbyStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:910:1: ( ( ';' ) )
            // InternalStory.g:911:1: ( ';' )
            {
            // InternalStory.g:911:1: ( ';' )
            // InternalStory.g:912:2: ';'
            {
             before(grammarAccess.getNearbyStatementAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNearbyStatementAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NearbyStatement__Group__3__Impl"


    // $ANTLR start "rule__NearbyStatement__Group_2__0"
    // InternalStory.g:922:1: rule__NearbyStatement__Group_2__0 : rule__NearbyStatement__Group_2__0__Impl rule__NearbyStatement__Group_2__1 ;
    public final void rule__NearbyStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:926:1: ( rule__NearbyStatement__Group_2__0__Impl rule__NearbyStatement__Group_2__1 )
            // InternalStory.g:927:2: rule__NearbyStatement__Group_2__0__Impl rule__NearbyStatement__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__NearbyStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NearbyStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NearbyStatement__Group_2__0"


    // $ANTLR start "rule__NearbyStatement__Group_2__0__Impl"
    // InternalStory.g:934:1: rule__NearbyStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__NearbyStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:938:1: ( ( ',' ) )
            // InternalStory.g:939:1: ( ',' )
            {
            // InternalStory.g:939:1: ( ',' )
            // InternalStory.g:940:2: ','
            {
             before(grammarAccess.getNearbyStatementAccess().getCommaKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNearbyStatementAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NearbyStatement__Group_2__0__Impl"


    // $ANTLR start "rule__NearbyStatement__Group_2__1"
    // InternalStory.g:949:1: rule__NearbyStatement__Group_2__1 : rule__NearbyStatement__Group_2__1__Impl ;
    public final void rule__NearbyStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:953:1: ( rule__NearbyStatement__Group_2__1__Impl )
            // InternalStory.g:954:2: rule__NearbyStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NearbyStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NearbyStatement__Group_2__1"


    // $ANTLR start "rule__NearbyStatement__Group_2__1__Impl"
    // InternalStory.g:960:1: rule__NearbyStatement__Group_2__1__Impl : ( ( rule__NearbyStatement__ListAssignment_2_1 ) ) ;
    public final void rule__NearbyStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:964:1: ( ( ( rule__NearbyStatement__ListAssignment_2_1 ) ) )
            // InternalStory.g:965:1: ( ( rule__NearbyStatement__ListAssignment_2_1 ) )
            {
            // InternalStory.g:965:1: ( ( rule__NearbyStatement__ListAssignment_2_1 ) )
            // InternalStory.g:966:2: ( rule__NearbyStatement__ListAssignment_2_1 )
            {
             before(grammarAccess.getNearbyStatementAccess().getListAssignment_2_1()); 
            // InternalStory.g:967:2: ( rule__NearbyStatement__ListAssignment_2_1 )
            // InternalStory.g:967:3: rule__NearbyStatement__ListAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NearbyStatement__ListAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNearbyStatementAccess().getListAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NearbyStatement__Group_2__1__Impl"


    // $ANTLR start "rule__SubstanceStatement__Group__0"
    // InternalStory.g:976:1: rule__SubstanceStatement__Group__0 : rule__SubstanceStatement__Group__0__Impl rule__SubstanceStatement__Group__1 ;
    public final void rule__SubstanceStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:980:1: ( rule__SubstanceStatement__Group__0__Impl rule__SubstanceStatement__Group__1 )
            // InternalStory.g:981:2: rule__SubstanceStatement__Group__0__Impl rule__SubstanceStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SubstanceStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubstanceStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstanceStatement__Group__0"


    // $ANTLR start "rule__SubstanceStatement__Group__0__Impl"
    // InternalStory.g:988:1: rule__SubstanceStatement__Group__0__Impl : ( 'substance:' ) ;
    public final void rule__SubstanceStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:992:1: ( ( 'substance:' ) )
            // InternalStory.g:993:1: ( 'substance:' )
            {
            // InternalStory.g:993:1: ( 'substance:' )
            // InternalStory.g:994:2: 'substance:'
            {
             before(grammarAccess.getSubstanceStatementAccess().getSubstanceKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSubstanceStatementAccess().getSubstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstanceStatement__Group__0__Impl"


    // $ANTLR start "rule__SubstanceStatement__Group__1"
    // InternalStory.g:1003:1: rule__SubstanceStatement__Group__1 : rule__SubstanceStatement__Group__1__Impl rule__SubstanceStatement__Group__2 ;
    public final void rule__SubstanceStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1007:1: ( rule__SubstanceStatement__Group__1__Impl rule__SubstanceStatement__Group__2 )
            // InternalStory.g:1008:2: rule__SubstanceStatement__Group__1__Impl rule__SubstanceStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__SubstanceStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubstanceStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstanceStatement__Group__1"


    // $ANTLR start "rule__SubstanceStatement__Group__1__Impl"
    // InternalStory.g:1015:1: rule__SubstanceStatement__Group__1__Impl : ( ( rule__SubstanceStatement__ListAssignment_1 ) ) ;
    public final void rule__SubstanceStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1019:1: ( ( ( rule__SubstanceStatement__ListAssignment_1 ) ) )
            // InternalStory.g:1020:1: ( ( rule__SubstanceStatement__ListAssignment_1 ) )
            {
            // InternalStory.g:1020:1: ( ( rule__SubstanceStatement__ListAssignment_1 ) )
            // InternalStory.g:1021:2: ( rule__SubstanceStatement__ListAssignment_1 )
            {
             before(grammarAccess.getSubstanceStatementAccess().getListAssignment_1()); 
            // InternalStory.g:1022:2: ( rule__SubstanceStatement__ListAssignment_1 )
            // InternalStory.g:1022:3: rule__SubstanceStatement__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubstanceStatement__ListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubstanceStatementAccess().getListAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstanceStatement__Group__1__Impl"


    // $ANTLR start "rule__SubstanceStatement__Group__2"
    // InternalStory.g:1030:1: rule__SubstanceStatement__Group__2 : rule__SubstanceStatement__Group__2__Impl rule__SubstanceStatement__Group__3 ;
    public final void rule__SubstanceStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1034:1: ( rule__SubstanceStatement__Group__2__Impl rule__SubstanceStatement__Group__3 )
            // InternalStory.g:1035:2: rule__SubstanceStatement__Group__2__Impl rule__SubstanceStatement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SubstanceStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubstanceStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstanceStatement__Group__2"


    // $ANTLR start "rule__SubstanceStatement__Group__2__Impl"
    // InternalStory.g:1042:1: rule__SubstanceStatement__Group__2__Impl : ( ( rule__SubstanceStatement__Group_2__0 )* ) ;
    public final void rule__SubstanceStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1046:1: ( ( ( rule__SubstanceStatement__Group_2__0 )* ) )
            // InternalStory.g:1047:1: ( ( rule__SubstanceStatement__Group_2__0 )* )
            {
            // InternalStory.g:1047:1: ( ( rule__SubstanceStatement__Group_2__0 )* )
            // InternalStory.g:1048:2: ( rule__SubstanceStatement__Group_2__0 )*
            {
             before(grammarAccess.getSubstanceStatementAccess().getGroup_2()); 
            // InternalStory.g:1049:2: ( rule__SubstanceStatement__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStory.g:1049:3: rule__SubstanceStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SubstanceStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSubstanceStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstanceStatement__Group__2__Impl"


    // $ANTLR start "rule__SubstanceStatement__Group__3"
    // InternalStory.g:1057:1: rule__SubstanceStatement__Group__3 : rule__SubstanceStatement__Group__3__Impl ;
    public final void rule__SubstanceStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1061:1: ( rule__SubstanceStatement__Group__3__Impl )
            // InternalStory.g:1062:2: rule__SubstanceStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubstanceStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstanceStatement__Group__3"


    // $ANTLR start "rule__SubstanceStatement__Group__3__Impl"
    // InternalStory.g:1068:1: rule__SubstanceStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__SubstanceStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1072:1: ( ( ';' ) )
            // InternalStory.g:1073:1: ( ';' )
            {
            // InternalStory.g:1073:1: ( ';' )
            // InternalStory.g:1074:2: ';'
            {
             before(grammarAccess.getSubstanceStatementAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSubstanceStatementAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstanceStatement__Group__3__Impl"


    // $ANTLR start "rule__SubstanceStatement__Group_2__0"
    // InternalStory.g:1084:1: rule__SubstanceStatement__Group_2__0 : rule__SubstanceStatement__Group_2__0__Impl rule__SubstanceStatement__Group_2__1 ;
    public final void rule__SubstanceStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1088:1: ( rule__SubstanceStatement__Group_2__0__Impl rule__SubstanceStatement__Group_2__1 )
            // InternalStory.g:1089:2: rule__SubstanceStatement__Group_2__0__Impl rule__SubstanceStatement__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__SubstanceStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubstanceStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstanceStatement__Group_2__0"


    // $ANTLR start "rule__SubstanceStatement__Group_2__0__Impl"
    // InternalStory.g:1096:1: rule__SubstanceStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SubstanceStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1100:1: ( ( ',' ) )
            // InternalStory.g:1101:1: ( ',' )
            {
            // InternalStory.g:1101:1: ( ',' )
            // InternalStory.g:1102:2: ','
            {
             before(grammarAccess.getSubstanceStatementAccess().getCommaKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubstanceStatementAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstanceStatement__Group_2__0__Impl"


    // $ANTLR start "rule__SubstanceStatement__Group_2__1"
    // InternalStory.g:1111:1: rule__SubstanceStatement__Group_2__1 : rule__SubstanceStatement__Group_2__1__Impl ;
    public final void rule__SubstanceStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1115:1: ( rule__SubstanceStatement__Group_2__1__Impl )
            // InternalStory.g:1116:2: rule__SubstanceStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubstanceStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstanceStatement__Group_2__1"


    // $ANTLR start "rule__SubstanceStatement__Group_2__1__Impl"
    // InternalStory.g:1122:1: rule__SubstanceStatement__Group_2__1__Impl : ( ( rule__SubstanceStatement__ListAssignment_2_1 ) ) ;
    public final void rule__SubstanceStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1126:1: ( ( ( rule__SubstanceStatement__ListAssignment_2_1 ) ) )
            // InternalStory.g:1127:1: ( ( rule__SubstanceStatement__ListAssignment_2_1 ) )
            {
            // InternalStory.g:1127:1: ( ( rule__SubstanceStatement__ListAssignment_2_1 ) )
            // InternalStory.g:1128:2: ( rule__SubstanceStatement__ListAssignment_2_1 )
            {
             before(grammarAccess.getSubstanceStatementAccess().getListAssignment_2_1()); 
            // InternalStory.g:1129:2: ( rule__SubstanceStatement__ListAssignment_2_1 )
            // InternalStory.g:1129:3: rule__SubstanceStatement__ListAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SubstanceStatement__ListAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSubstanceStatementAccess().getListAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstanceStatement__Group_2__1__Impl"


    // $ANTLR start "rule__MoodStatement__Group__0"
    // InternalStory.g:1138:1: rule__MoodStatement__Group__0 : rule__MoodStatement__Group__0__Impl rule__MoodStatement__Group__1 ;
    public final void rule__MoodStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1142:1: ( rule__MoodStatement__Group__0__Impl rule__MoodStatement__Group__1 )
            // InternalStory.g:1143:2: rule__MoodStatement__Group__0__Impl rule__MoodStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MoodStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoodStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoodStatement__Group__0"


    // $ANTLR start "rule__MoodStatement__Group__0__Impl"
    // InternalStory.g:1150:1: rule__MoodStatement__Group__0__Impl : ( 'mood:' ) ;
    public final void rule__MoodStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1154:1: ( ( 'mood:' ) )
            // InternalStory.g:1155:1: ( 'mood:' )
            {
            // InternalStory.g:1155:1: ( 'mood:' )
            // InternalStory.g:1156:2: 'mood:'
            {
             before(grammarAccess.getMoodStatementAccess().getMoodKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMoodStatementAccess().getMoodKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoodStatement__Group__0__Impl"


    // $ANTLR start "rule__MoodStatement__Group__1"
    // InternalStory.g:1165:1: rule__MoodStatement__Group__1 : rule__MoodStatement__Group__1__Impl rule__MoodStatement__Group__2 ;
    public final void rule__MoodStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1169:1: ( rule__MoodStatement__Group__1__Impl rule__MoodStatement__Group__2 )
            // InternalStory.g:1170:2: rule__MoodStatement__Group__1__Impl rule__MoodStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__MoodStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoodStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoodStatement__Group__1"


    // $ANTLR start "rule__MoodStatement__Group__1__Impl"
    // InternalStory.g:1177:1: rule__MoodStatement__Group__1__Impl : ( ( rule__MoodStatement__ListAssignment_1 ) ) ;
    public final void rule__MoodStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1181:1: ( ( ( rule__MoodStatement__ListAssignment_1 ) ) )
            // InternalStory.g:1182:1: ( ( rule__MoodStatement__ListAssignment_1 ) )
            {
            // InternalStory.g:1182:1: ( ( rule__MoodStatement__ListAssignment_1 ) )
            // InternalStory.g:1183:2: ( rule__MoodStatement__ListAssignment_1 )
            {
             before(grammarAccess.getMoodStatementAccess().getListAssignment_1()); 
            // InternalStory.g:1184:2: ( rule__MoodStatement__ListAssignment_1 )
            // InternalStory.g:1184:3: rule__MoodStatement__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoodStatement__ListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoodStatementAccess().getListAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoodStatement__Group__1__Impl"


    // $ANTLR start "rule__MoodStatement__Group__2"
    // InternalStory.g:1192:1: rule__MoodStatement__Group__2 : rule__MoodStatement__Group__2__Impl rule__MoodStatement__Group__3 ;
    public final void rule__MoodStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1196:1: ( rule__MoodStatement__Group__2__Impl rule__MoodStatement__Group__3 )
            // InternalStory.g:1197:2: rule__MoodStatement__Group__2__Impl rule__MoodStatement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__MoodStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoodStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoodStatement__Group__2"


    // $ANTLR start "rule__MoodStatement__Group__2__Impl"
    // InternalStory.g:1204:1: rule__MoodStatement__Group__2__Impl : ( ( rule__MoodStatement__Group_2__0 )* ) ;
    public final void rule__MoodStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1208:1: ( ( ( rule__MoodStatement__Group_2__0 )* ) )
            // InternalStory.g:1209:1: ( ( rule__MoodStatement__Group_2__0 )* )
            {
            // InternalStory.g:1209:1: ( ( rule__MoodStatement__Group_2__0 )* )
            // InternalStory.g:1210:2: ( rule__MoodStatement__Group_2__0 )*
            {
             before(grammarAccess.getMoodStatementAccess().getGroup_2()); 
            // InternalStory.g:1211:2: ( rule__MoodStatement__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStory.g:1211:3: rule__MoodStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MoodStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMoodStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoodStatement__Group__2__Impl"


    // $ANTLR start "rule__MoodStatement__Group__3"
    // InternalStory.g:1219:1: rule__MoodStatement__Group__3 : rule__MoodStatement__Group__3__Impl ;
    public final void rule__MoodStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1223:1: ( rule__MoodStatement__Group__3__Impl )
            // InternalStory.g:1224:2: rule__MoodStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoodStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoodStatement__Group__3"


    // $ANTLR start "rule__MoodStatement__Group__3__Impl"
    // InternalStory.g:1230:1: rule__MoodStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__MoodStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1234:1: ( ( ';' ) )
            // InternalStory.g:1235:1: ( ';' )
            {
            // InternalStory.g:1235:1: ( ';' )
            // InternalStory.g:1236:2: ';'
            {
             before(grammarAccess.getMoodStatementAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMoodStatementAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoodStatement__Group__3__Impl"


    // $ANTLR start "rule__MoodStatement__Group_2__0"
    // InternalStory.g:1246:1: rule__MoodStatement__Group_2__0 : rule__MoodStatement__Group_2__0__Impl rule__MoodStatement__Group_2__1 ;
    public final void rule__MoodStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1250:1: ( rule__MoodStatement__Group_2__0__Impl rule__MoodStatement__Group_2__1 )
            // InternalStory.g:1251:2: rule__MoodStatement__Group_2__0__Impl rule__MoodStatement__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__MoodStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoodStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoodStatement__Group_2__0"


    // $ANTLR start "rule__MoodStatement__Group_2__0__Impl"
    // InternalStory.g:1258:1: rule__MoodStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__MoodStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1262:1: ( ( ',' ) )
            // InternalStory.g:1263:1: ( ',' )
            {
            // InternalStory.g:1263:1: ( ',' )
            // InternalStory.g:1264:2: ','
            {
             before(grammarAccess.getMoodStatementAccess().getCommaKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMoodStatementAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoodStatement__Group_2__0__Impl"


    // $ANTLR start "rule__MoodStatement__Group_2__1"
    // InternalStory.g:1273:1: rule__MoodStatement__Group_2__1 : rule__MoodStatement__Group_2__1__Impl ;
    public final void rule__MoodStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1277:1: ( rule__MoodStatement__Group_2__1__Impl )
            // InternalStory.g:1278:2: rule__MoodStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoodStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoodStatement__Group_2__1"


    // $ANTLR start "rule__MoodStatement__Group_2__1__Impl"
    // InternalStory.g:1284:1: rule__MoodStatement__Group_2__1__Impl : ( ( rule__MoodStatement__ListAssignment_2_1 ) ) ;
    public final void rule__MoodStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1288:1: ( ( ( rule__MoodStatement__ListAssignment_2_1 ) ) )
            // InternalStory.g:1289:1: ( ( rule__MoodStatement__ListAssignment_2_1 ) )
            {
            // InternalStory.g:1289:1: ( ( rule__MoodStatement__ListAssignment_2_1 ) )
            // InternalStory.g:1290:2: ( rule__MoodStatement__ListAssignment_2_1 )
            {
             before(grammarAccess.getMoodStatementAccess().getListAssignment_2_1()); 
            // InternalStory.g:1291:2: ( rule__MoodStatement__ListAssignment_2_1 )
            // InternalStory.g:1291:3: rule__MoodStatement__ListAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MoodStatement__ListAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMoodStatementAccess().getListAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoodStatement__Group_2__1__Impl"


    // $ANTLR start "rule__StoryProgram__StatementsAssignment"
    // InternalStory.g:1300:1: rule__StoryProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__StoryProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1304:1: ( ( ruleStatement ) )
            // InternalStory.g:1305:2: ( ruleStatement )
            {
            // InternalStory.g:1305:2: ( ruleStatement )
            // InternalStory.g:1306:3: ruleStatement
            {
             before(grammarAccess.getStoryProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStoryProgramAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoryProgram__StatementsAssignment"


    // $ANTLR start "rule__AmountStatement__ValueAssignment_1"
    // InternalStory.g:1315:1: rule__AmountStatement__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__AmountStatement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1319:1: ( ( RULE_INT ) )
            // InternalStory.g:1320:2: ( RULE_INT )
            {
            // InternalStory.g:1320:2: ( RULE_INT )
            // InternalStory.g:1321:3: RULE_INT
            {
             before(grammarAccess.getAmountStatementAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAmountStatementAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmountStatement__ValueAssignment_1"


    // $ANTLR start "rule__PlaceStatement__ValueAssignment_1"
    // InternalStory.g:1330:1: rule__PlaceStatement__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PlaceStatement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1334:1: ( ( RULE_STRING ) )
            // InternalStory.g:1335:2: ( RULE_STRING )
            {
            // InternalStory.g:1335:2: ( RULE_STRING )
            // InternalStory.g:1336:3: RULE_STRING
            {
             before(grammarAccess.getPlaceStatementAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPlaceStatementAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlaceStatement__ValueAssignment_1"


    // $ANTLR start "rule__PathStatement__ListAssignment_1"
    // InternalStory.g:1345:1: rule__PathStatement__ListAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PathStatement__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1349:1: ( ( RULE_STRING ) )
            // InternalStory.g:1350:2: ( RULE_STRING )
            {
            // InternalStory.g:1350:2: ( RULE_STRING )
            // InternalStory.g:1351:3: RULE_STRING
            {
             before(grammarAccess.getPathStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPathStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathStatement__ListAssignment_1"


    // $ANTLR start "rule__PathStatement__ListAssignment_2_1"
    // InternalStory.g:1360:1: rule__PathStatement__ListAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__PathStatement__ListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1364:1: ( ( RULE_STRING ) )
            // InternalStory.g:1365:2: ( RULE_STRING )
            {
            // InternalStory.g:1365:2: ( RULE_STRING )
            // InternalStory.g:1366:3: RULE_STRING
            {
             before(grammarAccess.getPathStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPathStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathStatement__ListAssignment_2_1"


    // $ANTLR start "rule__MoveStatement__ListAssignment_1"
    // InternalStory.g:1375:1: rule__MoveStatement__ListAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MoveStatement__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1379:1: ( ( RULE_STRING ) )
            // InternalStory.g:1380:2: ( RULE_STRING )
            {
            // InternalStory.g:1380:2: ( RULE_STRING )
            // InternalStory.g:1381:3: RULE_STRING
            {
             before(grammarAccess.getMoveStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMoveStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__ListAssignment_1"


    // $ANTLR start "rule__MoveStatement__ListAssignment_2_1"
    // InternalStory.g:1390:1: rule__MoveStatement__ListAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__MoveStatement__ListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1394:1: ( ( RULE_STRING ) )
            // InternalStory.g:1395:2: ( RULE_STRING )
            {
            // InternalStory.g:1395:2: ( RULE_STRING )
            // InternalStory.g:1396:3: RULE_STRING
            {
             before(grammarAccess.getMoveStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMoveStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveStatement__ListAssignment_2_1"


    // $ANTLR start "rule__NearbyStatement__ListAssignment_1"
    // InternalStory.g:1405:1: rule__NearbyStatement__ListAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NearbyStatement__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1409:1: ( ( RULE_STRING ) )
            // InternalStory.g:1410:2: ( RULE_STRING )
            {
            // InternalStory.g:1410:2: ( RULE_STRING )
            // InternalStory.g:1411:3: RULE_STRING
            {
             before(grammarAccess.getNearbyStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNearbyStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NearbyStatement__ListAssignment_1"


    // $ANTLR start "rule__NearbyStatement__ListAssignment_2_1"
    // InternalStory.g:1420:1: rule__NearbyStatement__ListAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__NearbyStatement__ListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1424:1: ( ( RULE_STRING ) )
            // InternalStory.g:1425:2: ( RULE_STRING )
            {
            // InternalStory.g:1425:2: ( RULE_STRING )
            // InternalStory.g:1426:3: RULE_STRING
            {
             before(grammarAccess.getNearbyStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNearbyStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NearbyStatement__ListAssignment_2_1"


    // $ANTLR start "rule__SubstanceStatement__ListAssignment_1"
    // InternalStory.g:1435:1: rule__SubstanceStatement__ListAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SubstanceStatement__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1439:1: ( ( RULE_STRING ) )
            // InternalStory.g:1440:2: ( RULE_STRING )
            {
            // InternalStory.g:1440:2: ( RULE_STRING )
            // InternalStory.g:1441:3: RULE_STRING
            {
             before(grammarAccess.getSubstanceStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubstanceStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstanceStatement__ListAssignment_1"


    // $ANTLR start "rule__SubstanceStatement__ListAssignment_2_1"
    // InternalStory.g:1450:1: rule__SubstanceStatement__ListAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__SubstanceStatement__ListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1454:1: ( ( RULE_STRING ) )
            // InternalStory.g:1455:2: ( RULE_STRING )
            {
            // InternalStory.g:1455:2: ( RULE_STRING )
            // InternalStory.g:1456:3: RULE_STRING
            {
             before(grammarAccess.getSubstanceStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubstanceStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstanceStatement__ListAssignment_2_1"


    // $ANTLR start "rule__MoodStatement__ListAssignment_1"
    // InternalStory.g:1465:1: rule__MoodStatement__ListAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MoodStatement__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1469:1: ( ( RULE_STRING ) )
            // InternalStory.g:1470:2: ( RULE_STRING )
            {
            // InternalStory.g:1470:2: ( RULE_STRING )
            // InternalStory.g:1471:3: RULE_STRING
            {
             before(grammarAccess.getMoodStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMoodStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoodStatement__ListAssignment_1"


    // $ANTLR start "rule__MoodStatement__ListAssignment_2_1"
    // InternalStory.g:1480:1: rule__MoodStatement__ListAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__MoodStatement__ListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1484:1: ( ( RULE_STRING ) )
            // InternalStory.g:1485:2: ( RULE_STRING )
            {
            // InternalStory.g:1485:2: ( RULE_STRING )
            // InternalStory.g:1486:3: RULE_STRING
            {
             before(grammarAccess.getMoodStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMoodStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoodStatement__ListAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000F6802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});

}