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

                if ( (LA1_0==11||LA1_0==13||(LA1_0>=15 && LA1_0<=18)) ) {
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


    // $ANTLR start "entryRuleNameStatement"
    // InternalStory.g:103:1: entryRuleNameStatement : ruleNameStatement EOF ;
    public final void entryRuleNameStatement() throws RecognitionException {
        try {
            // InternalStory.g:104:1: ( ruleNameStatement EOF )
            // InternalStory.g:105:1: ruleNameStatement EOF
            {
             before(grammarAccess.getNameStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleNameStatement();

            state._fsp--;

             after(grammarAccess.getNameStatementRule()); 
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
    // $ANTLR end "entryRuleNameStatement"


    // $ANTLR start "ruleNameStatement"
    // InternalStory.g:112:1: ruleNameStatement : ( ( rule__NameStatement__Group__0 ) ) ;
    public final void ruleNameStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:116:2: ( ( ( rule__NameStatement__Group__0 ) ) )
            // InternalStory.g:117:2: ( ( rule__NameStatement__Group__0 ) )
            {
            // InternalStory.g:117:2: ( ( rule__NameStatement__Group__0 ) )
            // InternalStory.g:118:3: ( rule__NameStatement__Group__0 )
            {
             before(grammarAccess.getNameStatementAccess().getGroup()); 
            // InternalStory.g:119:3: ( rule__NameStatement__Group__0 )
            // InternalStory.g:119:4: rule__NameStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NameStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleNameStatement"


    // $ANTLR start "entryRuleEmotionStatement"
    // InternalStory.g:128:1: entryRuleEmotionStatement : ruleEmotionStatement EOF ;
    public final void entryRuleEmotionStatement() throws RecognitionException {
        try {
            // InternalStory.g:129:1: ( ruleEmotionStatement EOF )
            // InternalStory.g:130:1: ruleEmotionStatement EOF
            {
             before(grammarAccess.getEmotionStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleEmotionStatement();

            state._fsp--;

             after(grammarAccess.getEmotionStatementRule()); 
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
    // $ANTLR end "entryRuleEmotionStatement"


    // $ANTLR start "ruleEmotionStatement"
    // InternalStory.g:137:1: ruleEmotionStatement : ( ( rule__EmotionStatement__Group__0 ) ) ;
    public final void ruleEmotionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:141:2: ( ( ( rule__EmotionStatement__Group__0 ) ) )
            // InternalStory.g:142:2: ( ( rule__EmotionStatement__Group__0 ) )
            {
            // InternalStory.g:142:2: ( ( rule__EmotionStatement__Group__0 ) )
            // InternalStory.g:143:3: ( rule__EmotionStatement__Group__0 )
            {
             before(grammarAccess.getEmotionStatementAccess().getGroup()); 
            // InternalStory.g:144:3: ( rule__EmotionStatement__Group__0 )
            // InternalStory.g:144:4: rule__EmotionStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EmotionStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmotionStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleEmotionStatement"


    // $ANTLR start "entryRuleVerbStatement"
    // InternalStory.g:153:1: entryRuleVerbStatement : ruleVerbStatement EOF ;
    public final void entryRuleVerbStatement() throws RecognitionException {
        try {
            // InternalStory.g:154:1: ( ruleVerbStatement EOF )
            // InternalStory.g:155:1: ruleVerbStatement EOF
            {
             before(grammarAccess.getVerbStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleVerbStatement();

            state._fsp--;

             after(grammarAccess.getVerbStatementRule()); 
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
    // $ANTLR end "entryRuleVerbStatement"


    // $ANTLR start "ruleVerbStatement"
    // InternalStory.g:162:1: ruleVerbStatement : ( ( rule__VerbStatement__Group__0 ) ) ;
    public final void ruleVerbStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:166:2: ( ( ( rule__VerbStatement__Group__0 ) ) )
            // InternalStory.g:167:2: ( ( rule__VerbStatement__Group__0 ) )
            {
            // InternalStory.g:167:2: ( ( rule__VerbStatement__Group__0 ) )
            // InternalStory.g:168:3: ( rule__VerbStatement__Group__0 )
            {
             before(grammarAccess.getVerbStatementAccess().getGroup()); 
            // InternalStory.g:169:3: ( rule__VerbStatement__Group__0 )
            // InternalStory.g:169:4: rule__VerbStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VerbStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerbStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleVerbStatement"


    // $ANTLR start "entryRuleAdverbStatement"
    // InternalStory.g:178:1: entryRuleAdverbStatement : ruleAdverbStatement EOF ;
    public final void entryRuleAdverbStatement() throws RecognitionException {
        try {
            // InternalStory.g:179:1: ( ruleAdverbStatement EOF )
            // InternalStory.g:180:1: ruleAdverbStatement EOF
            {
             before(grammarAccess.getAdverbStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleAdverbStatement();

            state._fsp--;

             after(grammarAccess.getAdverbStatementRule()); 
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
    // $ANTLR end "entryRuleAdverbStatement"


    // $ANTLR start "ruleAdverbStatement"
    // InternalStory.g:187:1: ruleAdverbStatement : ( ( rule__AdverbStatement__Group__0 ) ) ;
    public final void ruleAdverbStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:191:2: ( ( ( rule__AdverbStatement__Group__0 ) ) )
            // InternalStory.g:192:2: ( ( rule__AdverbStatement__Group__0 ) )
            {
            // InternalStory.g:192:2: ( ( rule__AdverbStatement__Group__0 ) )
            // InternalStory.g:193:3: ( rule__AdverbStatement__Group__0 )
            {
             before(grammarAccess.getAdverbStatementAccess().getGroup()); 
            // InternalStory.g:194:3: ( rule__AdverbStatement__Group__0 )
            // InternalStory.g:194:4: rule__AdverbStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdverbStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdverbStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleAdverbStatement"


    // $ANTLR start "entryRuleLocationStatement"
    // InternalStory.g:203:1: entryRuleLocationStatement : ruleLocationStatement EOF ;
    public final void entryRuleLocationStatement() throws RecognitionException {
        try {
            // InternalStory.g:204:1: ( ruleLocationStatement EOF )
            // InternalStory.g:205:1: ruleLocationStatement EOF
            {
             before(grammarAccess.getLocationStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleLocationStatement();

            state._fsp--;

             after(grammarAccess.getLocationStatementRule()); 
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
    // $ANTLR end "entryRuleLocationStatement"


    // $ANTLR start "ruleLocationStatement"
    // InternalStory.g:212:1: ruleLocationStatement : ( ( rule__LocationStatement__Group__0 ) ) ;
    public final void ruleLocationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:216:2: ( ( ( rule__LocationStatement__Group__0 ) ) )
            // InternalStory.g:217:2: ( ( rule__LocationStatement__Group__0 ) )
            {
            // InternalStory.g:217:2: ( ( rule__LocationStatement__Group__0 ) )
            // InternalStory.g:218:3: ( rule__LocationStatement__Group__0 )
            {
             before(grammarAccess.getLocationStatementAccess().getGroup()); 
            // InternalStory.g:219:3: ( rule__LocationStatement__Group__0 )
            // InternalStory.g:219:4: rule__LocationStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocationStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleLocationStatement"


    // $ANTLR start "entryRuleAdjectiveStatement"
    // InternalStory.g:228:1: entryRuleAdjectiveStatement : ruleAdjectiveStatement EOF ;
    public final void entryRuleAdjectiveStatement() throws RecognitionException {
        try {
            // InternalStory.g:229:1: ( ruleAdjectiveStatement EOF )
            // InternalStory.g:230:1: ruleAdjectiveStatement EOF
            {
             before(grammarAccess.getAdjectiveStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleAdjectiveStatement();

            state._fsp--;

             after(grammarAccess.getAdjectiveStatementRule()); 
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
    // $ANTLR end "entryRuleAdjectiveStatement"


    // $ANTLR start "ruleAdjectiveStatement"
    // InternalStory.g:237:1: ruleAdjectiveStatement : ( ( rule__AdjectiveStatement__Group__0 ) ) ;
    public final void ruleAdjectiveStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:241:2: ( ( ( rule__AdjectiveStatement__Group__0 ) ) )
            // InternalStory.g:242:2: ( ( rule__AdjectiveStatement__Group__0 ) )
            {
            // InternalStory.g:242:2: ( ( rule__AdjectiveStatement__Group__0 ) )
            // InternalStory.g:243:3: ( rule__AdjectiveStatement__Group__0 )
            {
             before(grammarAccess.getAdjectiveStatementAccess().getGroup()); 
            // InternalStory.g:244:3: ( rule__AdjectiveStatement__Group__0 )
            // InternalStory.g:244:4: rule__AdjectiveStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdjectiveStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdjectiveStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleAdjectiveStatement"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalStory.g:252:1: rule__Statement__Alternatives : ( ( ruleNameStatement ) | ( ruleEmotionStatement ) | ( ruleVerbStatement ) | ( ruleAdverbStatement ) | ( ruleAdjectiveStatement ) | ( ruleLocationStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:256:1: ( ( ruleNameStatement ) | ( ruleEmotionStatement ) | ( ruleVerbStatement ) | ( ruleAdverbStatement ) | ( ruleAdjectiveStatement ) | ( ruleLocationStatement ) )
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
                    // InternalStory.g:257:2: ( ruleNameStatement )
                    {
                    // InternalStory.g:257:2: ( ruleNameStatement )
                    // InternalStory.g:258:3: ruleNameStatement
                    {
                     before(grammarAccess.getStatementAccess().getNameStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNameStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getNameStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStory.g:263:2: ( ruleEmotionStatement )
                    {
                    // InternalStory.g:263:2: ( ruleEmotionStatement )
                    // InternalStory.g:264:3: ruleEmotionStatement
                    {
                     before(grammarAccess.getStatementAccess().getEmotionStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEmotionStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getEmotionStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalStory.g:269:2: ( ruleVerbStatement )
                    {
                    // InternalStory.g:269:2: ( ruleVerbStatement )
                    // InternalStory.g:270:3: ruleVerbStatement
                    {
                     before(grammarAccess.getStatementAccess().getVerbStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVerbStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVerbStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalStory.g:275:2: ( ruleAdverbStatement )
                    {
                    // InternalStory.g:275:2: ( ruleAdverbStatement )
                    // InternalStory.g:276:3: ruleAdverbStatement
                    {
                     before(grammarAccess.getStatementAccess().getAdverbStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAdverbStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAdverbStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalStory.g:281:2: ( ruleAdjectiveStatement )
                    {
                    // InternalStory.g:281:2: ( ruleAdjectiveStatement )
                    // InternalStory.g:282:3: ruleAdjectiveStatement
                    {
                     before(grammarAccess.getStatementAccess().getAdjectiveStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAdjectiveStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAdjectiveStatementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalStory.g:287:2: ( ruleLocationStatement )
                    {
                    // InternalStory.g:287:2: ( ruleLocationStatement )
                    // InternalStory.g:288:3: ruleLocationStatement
                    {
                     before(grammarAccess.getStatementAccess().getLocationStatementParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleLocationStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getLocationStatementParserRuleCall_5()); 

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


    // $ANTLR start "rule__NameStatement__Group__0"
    // InternalStory.g:297:1: rule__NameStatement__Group__0 : rule__NameStatement__Group__0__Impl rule__NameStatement__Group__1 ;
    public final void rule__NameStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:301:1: ( rule__NameStatement__Group__0__Impl rule__NameStatement__Group__1 )
            // InternalStory.g:302:2: rule__NameStatement__Group__0__Impl rule__NameStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__NameStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameStatement__Group__1();

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
    // $ANTLR end "rule__NameStatement__Group__0"


    // $ANTLR start "rule__NameStatement__Group__0__Impl"
    // InternalStory.g:309:1: rule__NameStatement__Group__0__Impl : ( 'name:' ) ;
    public final void rule__NameStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:313:1: ( ( 'name:' ) )
            // InternalStory.g:314:1: ( 'name:' )
            {
            // InternalStory.g:314:1: ( 'name:' )
            // InternalStory.g:315:2: 'name:'
            {
             before(grammarAccess.getNameStatementAccess().getNameKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNameStatementAccess().getNameKeyword_0()); 

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
    // $ANTLR end "rule__NameStatement__Group__0__Impl"


    // $ANTLR start "rule__NameStatement__Group__1"
    // InternalStory.g:324:1: rule__NameStatement__Group__1 : rule__NameStatement__Group__1__Impl rule__NameStatement__Group__2 ;
    public final void rule__NameStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:328:1: ( rule__NameStatement__Group__1__Impl rule__NameStatement__Group__2 )
            // InternalStory.g:329:2: rule__NameStatement__Group__1__Impl rule__NameStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__NameStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameStatement__Group__2();

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
    // $ANTLR end "rule__NameStatement__Group__1"


    // $ANTLR start "rule__NameStatement__Group__1__Impl"
    // InternalStory.g:336:1: rule__NameStatement__Group__1__Impl : ( ( rule__NameStatement__ValueAssignment_1 ) ) ;
    public final void rule__NameStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:340:1: ( ( ( rule__NameStatement__ValueAssignment_1 ) ) )
            // InternalStory.g:341:1: ( ( rule__NameStatement__ValueAssignment_1 ) )
            {
            // InternalStory.g:341:1: ( ( rule__NameStatement__ValueAssignment_1 ) )
            // InternalStory.g:342:2: ( rule__NameStatement__ValueAssignment_1 )
            {
             before(grammarAccess.getNameStatementAccess().getValueAssignment_1()); 
            // InternalStory.g:343:2: ( rule__NameStatement__ValueAssignment_1 )
            // InternalStory.g:343:3: rule__NameStatement__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NameStatement__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNameStatementAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__NameStatement__Group__1__Impl"


    // $ANTLR start "rule__NameStatement__Group__2"
    // InternalStory.g:351:1: rule__NameStatement__Group__2 : rule__NameStatement__Group__2__Impl ;
    public final void rule__NameStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:355:1: ( rule__NameStatement__Group__2__Impl )
            // InternalStory.g:356:2: rule__NameStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameStatement__Group__2__Impl();

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
    // $ANTLR end "rule__NameStatement__Group__2"


    // $ANTLR start "rule__NameStatement__Group__2__Impl"
    // InternalStory.g:362:1: rule__NameStatement__Group__2__Impl : ( ';' ) ;
    public final void rule__NameStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:366:1: ( ( ';' ) )
            // InternalStory.g:367:1: ( ';' )
            {
            // InternalStory.g:367:1: ( ';' )
            // InternalStory.g:368:2: ';'
            {
             before(grammarAccess.getNameStatementAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNameStatementAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__NameStatement__Group__2__Impl"


    // $ANTLR start "rule__EmotionStatement__Group__0"
    // InternalStory.g:378:1: rule__EmotionStatement__Group__0 : rule__EmotionStatement__Group__0__Impl rule__EmotionStatement__Group__1 ;
    public final void rule__EmotionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:382:1: ( rule__EmotionStatement__Group__0__Impl rule__EmotionStatement__Group__1 )
            // InternalStory.g:383:2: rule__EmotionStatement__Group__0__Impl rule__EmotionStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EmotionStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmotionStatement__Group__1();

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
    // $ANTLR end "rule__EmotionStatement__Group__0"


    // $ANTLR start "rule__EmotionStatement__Group__0__Impl"
    // InternalStory.g:390:1: rule__EmotionStatement__Group__0__Impl : ( 'emotions:' ) ;
    public final void rule__EmotionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:394:1: ( ( 'emotions:' ) )
            // InternalStory.g:395:1: ( 'emotions:' )
            {
            // InternalStory.g:395:1: ( 'emotions:' )
            // InternalStory.g:396:2: 'emotions:'
            {
             before(grammarAccess.getEmotionStatementAccess().getEmotionsKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEmotionStatementAccess().getEmotionsKeyword_0()); 

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
    // $ANTLR end "rule__EmotionStatement__Group__0__Impl"


    // $ANTLR start "rule__EmotionStatement__Group__1"
    // InternalStory.g:405:1: rule__EmotionStatement__Group__1 : rule__EmotionStatement__Group__1__Impl rule__EmotionStatement__Group__2 ;
    public final void rule__EmotionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:409:1: ( rule__EmotionStatement__Group__1__Impl rule__EmotionStatement__Group__2 )
            // InternalStory.g:410:2: rule__EmotionStatement__Group__1__Impl rule__EmotionStatement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__EmotionStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmotionStatement__Group__2();

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
    // $ANTLR end "rule__EmotionStatement__Group__1"


    // $ANTLR start "rule__EmotionStatement__Group__1__Impl"
    // InternalStory.g:417:1: rule__EmotionStatement__Group__1__Impl : ( ( rule__EmotionStatement__ListAssignment_1 ) ) ;
    public final void rule__EmotionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:421:1: ( ( ( rule__EmotionStatement__ListAssignment_1 ) ) )
            // InternalStory.g:422:1: ( ( rule__EmotionStatement__ListAssignment_1 ) )
            {
            // InternalStory.g:422:1: ( ( rule__EmotionStatement__ListAssignment_1 ) )
            // InternalStory.g:423:2: ( rule__EmotionStatement__ListAssignment_1 )
            {
             before(grammarAccess.getEmotionStatementAccess().getListAssignment_1()); 
            // InternalStory.g:424:2: ( rule__EmotionStatement__ListAssignment_1 )
            // InternalStory.g:424:3: rule__EmotionStatement__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EmotionStatement__ListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEmotionStatementAccess().getListAssignment_1()); 

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
    // $ANTLR end "rule__EmotionStatement__Group__1__Impl"


    // $ANTLR start "rule__EmotionStatement__Group__2"
    // InternalStory.g:432:1: rule__EmotionStatement__Group__2 : rule__EmotionStatement__Group__2__Impl rule__EmotionStatement__Group__3 ;
    public final void rule__EmotionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:436:1: ( rule__EmotionStatement__Group__2__Impl rule__EmotionStatement__Group__3 )
            // InternalStory.g:437:2: rule__EmotionStatement__Group__2__Impl rule__EmotionStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__EmotionStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmotionStatement__Group__3();

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
    // $ANTLR end "rule__EmotionStatement__Group__2"


    // $ANTLR start "rule__EmotionStatement__Group__2__Impl"
    // InternalStory.g:444:1: rule__EmotionStatement__Group__2__Impl : ( ( rule__EmotionStatement__Group_2__0 )* ) ;
    public final void rule__EmotionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:448:1: ( ( ( rule__EmotionStatement__Group_2__0 )* ) )
            // InternalStory.g:449:1: ( ( rule__EmotionStatement__Group_2__0 )* )
            {
            // InternalStory.g:449:1: ( ( rule__EmotionStatement__Group_2__0 )* )
            // InternalStory.g:450:2: ( rule__EmotionStatement__Group_2__0 )*
            {
             before(grammarAccess.getEmotionStatementAccess().getGroup_2()); 
            // InternalStory.g:451:2: ( rule__EmotionStatement__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStory.g:451:3: rule__EmotionStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__EmotionStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEmotionStatementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__EmotionStatement__Group__2__Impl"


    // $ANTLR start "rule__EmotionStatement__Group__3"
    // InternalStory.g:459:1: rule__EmotionStatement__Group__3 : rule__EmotionStatement__Group__3__Impl ;
    public final void rule__EmotionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:463:1: ( rule__EmotionStatement__Group__3__Impl )
            // InternalStory.g:464:2: rule__EmotionStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmotionStatement__Group__3__Impl();

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
    // $ANTLR end "rule__EmotionStatement__Group__3"


    // $ANTLR start "rule__EmotionStatement__Group__3__Impl"
    // InternalStory.g:470:1: rule__EmotionStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__EmotionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:474:1: ( ( ';' ) )
            // InternalStory.g:475:1: ( ';' )
            {
            // InternalStory.g:475:1: ( ';' )
            // InternalStory.g:476:2: ';'
            {
             before(grammarAccess.getEmotionStatementAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEmotionStatementAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__EmotionStatement__Group__3__Impl"


    // $ANTLR start "rule__EmotionStatement__Group_2__0"
    // InternalStory.g:486:1: rule__EmotionStatement__Group_2__0 : rule__EmotionStatement__Group_2__0__Impl rule__EmotionStatement__Group_2__1 ;
    public final void rule__EmotionStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:490:1: ( rule__EmotionStatement__Group_2__0__Impl rule__EmotionStatement__Group_2__1 )
            // InternalStory.g:491:2: rule__EmotionStatement__Group_2__0__Impl rule__EmotionStatement__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__EmotionStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmotionStatement__Group_2__1();

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
    // $ANTLR end "rule__EmotionStatement__Group_2__0"


    // $ANTLR start "rule__EmotionStatement__Group_2__0__Impl"
    // InternalStory.g:498:1: rule__EmotionStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EmotionStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:502:1: ( ( ',' ) )
            // InternalStory.g:503:1: ( ',' )
            {
            // InternalStory.g:503:1: ( ',' )
            // InternalStory.g:504:2: ','
            {
             before(grammarAccess.getEmotionStatementAccess().getCommaKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEmotionStatementAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__EmotionStatement__Group_2__0__Impl"


    // $ANTLR start "rule__EmotionStatement__Group_2__1"
    // InternalStory.g:513:1: rule__EmotionStatement__Group_2__1 : rule__EmotionStatement__Group_2__1__Impl ;
    public final void rule__EmotionStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:517:1: ( rule__EmotionStatement__Group_2__1__Impl )
            // InternalStory.g:518:2: rule__EmotionStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmotionStatement__Group_2__1__Impl();

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
    // $ANTLR end "rule__EmotionStatement__Group_2__1"


    // $ANTLR start "rule__EmotionStatement__Group_2__1__Impl"
    // InternalStory.g:524:1: rule__EmotionStatement__Group_2__1__Impl : ( ( rule__EmotionStatement__ListAssignment_2_1 ) ) ;
    public final void rule__EmotionStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:528:1: ( ( ( rule__EmotionStatement__ListAssignment_2_1 ) ) )
            // InternalStory.g:529:1: ( ( rule__EmotionStatement__ListAssignment_2_1 ) )
            {
            // InternalStory.g:529:1: ( ( rule__EmotionStatement__ListAssignment_2_1 ) )
            // InternalStory.g:530:2: ( rule__EmotionStatement__ListAssignment_2_1 )
            {
             before(grammarAccess.getEmotionStatementAccess().getListAssignment_2_1()); 
            // InternalStory.g:531:2: ( rule__EmotionStatement__ListAssignment_2_1 )
            // InternalStory.g:531:3: rule__EmotionStatement__ListAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EmotionStatement__ListAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEmotionStatementAccess().getListAssignment_2_1()); 

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
    // $ANTLR end "rule__EmotionStatement__Group_2__1__Impl"


    // $ANTLR start "rule__VerbStatement__Group__0"
    // InternalStory.g:540:1: rule__VerbStatement__Group__0 : rule__VerbStatement__Group__0__Impl rule__VerbStatement__Group__1 ;
    public final void rule__VerbStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:544:1: ( rule__VerbStatement__Group__0__Impl rule__VerbStatement__Group__1 )
            // InternalStory.g:545:2: rule__VerbStatement__Group__0__Impl rule__VerbStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VerbStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerbStatement__Group__1();

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
    // $ANTLR end "rule__VerbStatement__Group__0"


    // $ANTLR start "rule__VerbStatement__Group__0__Impl"
    // InternalStory.g:552:1: rule__VerbStatement__Group__0__Impl : ( 'verb:' ) ;
    public final void rule__VerbStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:556:1: ( ( 'verb:' ) )
            // InternalStory.g:557:1: ( 'verb:' )
            {
            // InternalStory.g:557:1: ( 'verb:' )
            // InternalStory.g:558:2: 'verb:'
            {
             before(grammarAccess.getVerbStatementAccess().getVerbKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVerbStatementAccess().getVerbKeyword_0()); 

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
    // $ANTLR end "rule__VerbStatement__Group__0__Impl"


    // $ANTLR start "rule__VerbStatement__Group__1"
    // InternalStory.g:567:1: rule__VerbStatement__Group__1 : rule__VerbStatement__Group__1__Impl rule__VerbStatement__Group__2 ;
    public final void rule__VerbStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:571:1: ( rule__VerbStatement__Group__1__Impl rule__VerbStatement__Group__2 )
            // InternalStory.g:572:2: rule__VerbStatement__Group__1__Impl rule__VerbStatement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__VerbStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerbStatement__Group__2();

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
    // $ANTLR end "rule__VerbStatement__Group__1"


    // $ANTLR start "rule__VerbStatement__Group__1__Impl"
    // InternalStory.g:579:1: rule__VerbStatement__Group__1__Impl : ( ( rule__VerbStatement__ListAssignment_1 ) ) ;
    public final void rule__VerbStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:583:1: ( ( ( rule__VerbStatement__ListAssignment_1 ) ) )
            // InternalStory.g:584:1: ( ( rule__VerbStatement__ListAssignment_1 ) )
            {
            // InternalStory.g:584:1: ( ( rule__VerbStatement__ListAssignment_1 ) )
            // InternalStory.g:585:2: ( rule__VerbStatement__ListAssignment_1 )
            {
             before(grammarAccess.getVerbStatementAccess().getListAssignment_1()); 
            // InternalStory.g:586:2: ( rule__VerbStatement__ListAssignment_1 )
            // InternalStory.g:586:3: rule__VerbStatement__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VerbStatement__ListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVerbStatementAccess().getListAssignment_1()); 

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
    // $ANTLR end "rule__VerbStatement__Group__1__Impl"


    // $ANTLR start "rule__VerbStatement__Group__2"
    // InternalStory.g:594:1: rule__VerbStatement__Group__2 : rule__VerbStatement__Group__2__Impl rule__VerbStatement__Group__3 ;
    public final void rule__VerbStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:598:1: ( rule__VerbStatement__Group__2__Impl rule__VerbStatement__Group__3 )
            // InternalStory.g:599:2: rule__VerbStatement__Group__2__Impl rule__VerbStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__VerbStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerbStatement__Group__3();

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
    // $ANTLR end "rule__VerbStatement__Group__2"


    // $ANTLR start "rule__VerbStatement__Group__2__Impl"
    // InternalStory.g:606:1: rule__VerbStatement__Group__2__Impl : ( ( rule__VerbStatement__Group_2__0 )* ) ;
    public final void rule__VerbStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:610:1: ( ( ( rule__VerbStatement__Group_2__0 )* ) )
            // InternalStory.g:611:1: ( ( rule__VerbStatement__Group_2__0 )* )
            {
            // InternalStory.g:611:1: ( ( rule__VerbStatement__Group_2__0 )* )
            // InternalStory.g:612:2: ( rule__VerbStatement__Group_2__0 )*
            {
             before(grammarAccess.getVerbStatementAccess().getGroup_2()); 
            // InternalStory.g:613:2: ( rule__VerbStatement__Group_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStory.g:613:3: rule__VerbStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__VerbStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getVerbStatementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__VerbStatement__Group__2__Impl"


    // $ANTLR start "rule__VerbStatement__Group__3"
    // InternalStory.g:621:1: rule__VerbStatement__Group__3 : rule__VerbStatement__Group__3__Impl ;
    public final void rule__VerbStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:625:1: ( rule__VerbStatement__Group__3__Impl )
            // InternalStory.g:626:2: rule__VerbStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VerbStatement__Group__3__Impl();

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
    // $ANTLR end "rule__VerbStatement__Group__3"


    // $ANTLR start "rule__VerbStatement__Group__3__Impl"
    // InternalStory.g:632:1: rule__VerbStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__VerbStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:636:1: ( ( ';' ) )
            // InternalStory.g:637:1: ( ';' )
            {
            // InternalStory.g:637:1: ( ';' )
            // InternalStory.g:638:2: ';'
            {
             before(grammarAccess.getVerbStatementAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVerbStatementAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__VerbStatement__Group__3__Impl"


    // $ANTLR start "rule__VerbStatement__Group_2__0"
    // InternalStory.g:648:1: rule__VerbStatement__Group_2__0 : rule__VerbStatement__Group_2__0__Impl rule__VerbStatement__Group_2__1 ;
    public final void rule__VerbStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:652:1: ( rule__VerbStatement__Group_2__0__Impl rule__VerbStatement__Group_2__1 )
            // InternalStory.g:653:2: rule__VerbStatement__Group_2__0__Impl rule__VerbStatement__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__VerbStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerbStatement__Group_2__1();

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
    // $ANTLR end "rule__VerbStatement__Group_2__0"


    // $ANTLR start "rule__VerbStatement__Group_2__0__Impl"
    // InternalStory.g:660:1: rule__VerbStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__VerbStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:664:1: ( ( ',' ) )
            // InternalStory.g:665:1: ( ',' )
            {
            // InternalStory.g:665:1: ( ',' )
            // InternalStory.g:666:2: ','
            {
             before(grammarAccess.getVerbStatementAccess().getCommaKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVerbStatementAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__VerbStatement__Group_2__0__Impl"


    // $ANTLR start "rule__VerbStatement__Group_2__1"
    // InternalStory.g:675:1: rule__VerbStatement__Group_2__1 : rule__VerbStatement__Group_2__1__Impl ;
    public final void rule__VerbStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:679:1: ( rule__VerbStatement__Group_2__1__Impl )
            // InternalStory.g:680:2: rule__VerbStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VerbStatement__Group_2__1__Impl();

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
    // $ANTLR end "rule__VerbStatement__Group_2__1"


    // $ANTLR start "rule__VerbStatement__Group_2__1__Impl"
    // InternalStory.g:686:1: rule__VerbStatement__Group_2__1__Impl : ( ( rule__VerbStatement__ListAssignment_2_1 ) ) ;
    public final void rule__VerbStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:690:1: ( ( ( rule__VerbStatement__ListAssignment_2_1 ) ) )
            // InternalStory.g:691:1: ( ( rule__VerbStatement__ListAssignment_2_1 ) )
            {
            // InternalStory.g:691:1: ( ( rule__VerbStatement__ListAssignment_2_1 ) )
            // InternalStory.g:692:2: ( rule__VerbStatement__ListAssignment_2_1 )
            {
             before(grammarAccess.getVerbStatementAccess().getListAssignment_2_1()); 
            // InternalStory.g:693:2: ( rule__VerbStatement__ListAssignment_2_1 )
            // InternalStory.g:693:3: rule__VerbStatement__ListAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VerbStatement__ListAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVerbStatementAccess().getListAssignment_2_1()); 

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
    // $ANTLR end "rule__VerbStatement__Group_2__1__Impl"


    // $ANTLR start "rule__AdverbStatement__Group__0"
    // InternalStory.g:702:1: rule__AdverbStatement__Group__0 : rule__AdverbStatement__Group__0__Impl rule__AdverbStatement__Group__1 ;
    public final void rule__AdverbStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:706:1: ( rule__AdverbStatement__Group__0__Impl rule__AdverbStatement__Group__1 )
            // InternalStory.g:707:2: rule__AdverbStatement__Group__0__Impl rule__AdverbStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AdverbStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdverbStatement__Group__1();

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
    // $ANTLR end "rule__AdverbStatement__Group__0"


    // $ANTLR start "rule__AdverbStatement__Group__0__Impl"
    // InternalStory.g:714:1: rule__AdverbStatement__Group__0__Impl : ( 'adverbs:' ) ;
    public final void rule__AdverbStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:718:1: ( ( 'adverbs:' ) )
            // InternalStory.g:719:1: ( 'adverbs:' )
            {
            // InternalStory.g:719:1: ( 'adverbs:' )
            // InternalStory.g:720:2: 'adverbs:'
            {
             before(grammarAccess.getAdverbStatementAccess().getAdverbsKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAdverbStatementAccess().getAdverbsKeyword_0()); 

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
    // $ANTLR end "rule__AdverbStatement__Group__0__Impl"


    // $ANTLR start "rule__AdverbStatement__Group__1"
    // InternalStory.g:729:1: rule__AdverbStatement__Group__1 : rule__AdverbStatement__Group__1__Impl rule__AdverbStatement__Group__2 ;
    public final void rule__AdverbStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:733:1: ( rule__AdverbStatement__Group__1__Impl rule__AdverbStatement__Group__2 )
            // InternalStory.g:734:2: rule__AdverbStatement__Group__1__Impl rule__AdverbStatement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AdverbStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdverbStatement__Group__2();

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
    // $ANTLR end "rule__AdverbStatement__Group__1"


    // $ANTLR start "rule__AdverbStatement__Group__1__Impl"
    // InternalStory.g:741:1: rule__AdverbStatement__Group__1__Impl : ( ( rule__AdverbStatement__ListAssignment_1 ) ) ;
    public final void rule__AdverbStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:745:1: ( ( ( rule__AdverbStatement__ListAssignment_1 ) ) )
            // InternalStory.g:746:1: ( ( rule__AdverbStatement__ListAssignment_1 ) )
            {
            // InternalStory.g:746:1: ( ( rule__AdverbStatement__ListAssignment_1 ) )
            // InternalStory.g:747:2: ( rule__AdverbStatement__ListAssignment_1 )
            {
             before(grammarAccess.getAdverbStatementAccess().getListAssignment_1()); 
            // InternalStory.g:748:2: ( rule__AdverbStatement__ListAssignment_1 )
            // InternalStory.g:748:3: rule__AdverbStatement__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AdverbStatement__ListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAdverbStatementAccess().getListAssignment_1()); 

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
    // $ANTLR end "rule__AdverbStatement__Group__1__Impl"


    // $ANTLR start "rule__AdverbStatement__Group__2"
    // InternalStory.g:756:1: rule__AdverbStatement__Group__2 : rule__AdverbStatement__Group__2__Impl rule__AdverbStatement__Group__3 ;
    public final void rule__AdverbStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:760:1: ( rule__AdverbStatement__Group__2__Impl rule__AdverbStatement__Group__3 )
            // InternalStory.g:761:2: rule__AdverbStatement__Group__2__Impl rule__AdverbStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AdverbStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdverbStatement__Group__3();

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
    // $ANTLR end "rule__AdverbStatement__Group__2"


    // $ANTLR start "rule__AdverbStatement__Group__2__Impl"
    // InternalStory.g:768:1: rule__AdverbStatement__Group__2__Impl : ( ( rule__AdverbStatement__Group_2__0 )* ) ;
    public final void rule__AdverbStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:772:1: ( ( ( rule__AdverbStatement__Group_2__0 )* ) )
            // InternalStory.g:773:1: ( ( rule__AdverbStatement__Group_2__0 )* )
            {
            // InternalStory.g:773:1: ( ( rule__AdverbStatement__Group_2__0 )* )
            // InternalStory.g:774:2: ( rule__AdverbStatement__Group_2__0 )*
            {
             before(grammarAccess.getAdverbStatementAccess().getGroup_2()); 
            // InternalStory.g:775:2: ( rule__AdverbStatement__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStory.g:775:3: rule__AdverbStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AdverbStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAdverbStatementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AdverbStatement__Group__2__Impl"


    // $ANTLR start "rule__AdverbStatement__Group__3"
    // InternalStory.g:783:1: rule__AdverbStatement__Group__3 : rule__AdverbStatement__Group__3__Impl ;
    public final void rule__AdverbStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:787:1: ( rule__AdverbStatement__Group__3__Impl )
            // InternalStory.g:788:2: rule__AdverbStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdverbStatement__Group__3__Impl();

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
    // $ANTLR end "rule__AdverbStatement__Group__3"


    // $ANTLR start "rule__AdverbStatement__Group__3__Impl"
    // InternalStory.g:794:1: rule__AdverbStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__AdverbStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:798:1: ( ( ';' ) )
            // InternalStory.g:799:1: ( ';' )
            {
            // InternalStory.g:799:1: ( ';' )
            // InternalStory.g:800:2: ';'
            {
             before(grammarAccess.getAdverbStatementAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAdverbStatementAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__AdverbStatement__Group__3__Impl"


    // $ANTLR start "rule__AdverbStatement__Group_2__0"
    // InternalStory.g:810:1: rule__AdverbStatement__Group_2__0 : rule__AdverbStatement__Group_2__0__Impl rule__AdverbStatement__Group_2__1 ;
    public final void rule__AdverbStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:814:1: ( rule__AdverbStatement__Group_2__0__Impl rule__AdverbStatement__Group_2__1 )
            // InternalStory.g:815:2: rule__AdverbStatement__Group_2__0__Impl rule__AdverbStatement__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__AdverbStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdverbStatement__Group_2__1();

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
    // $ANTLR end "rule__AdverbStatement__Group_2__0"


    // $ANTLR start "rule__AdverbStatement__Group_2__0__Impl"
    // InternalStory.g:822:1: rule__AdverbStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__AdverbStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:826:1: ( ( ',' ) )
            // InternalStory.g:827:1: ( ',' )
            {
            // InternalStory.g:827:1: ( ',' )
            // InternalStory.g:828:2: ','
            {
             before(grammarAccess.getAdverbStatementAccess().getCommaKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAdverbStatementAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__AdverbStatement__Group_2__0__Impl"


    // $ANTLR start "rule__AdverbStatement__Group_2__1"
    // InternalStory.g:837:1: rule__AdverbStatement__Group_2__1 : rule__AdverbStatement__Group_2__1__Impl ;
    public final void rule__AdverbStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:841:1: ( rule__AdverbStatement__Group_2__1__Impl )
            // InternalStory.g:842:2: rule__AdverbStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdverbStatement__Group_2__1__Impl();

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
    // $ANTLR end "rule__AdverbStatement__Group_2__1"


    // $ANTLR start "rule__AdverbStatement__Group_2__1__Impl"
    // InternalStory.g:848:1: rule__AdverbStatement__Group_2__1__Impl : ( ( rule__AdverbStatement__ListAssignment_2_1 ) ) ;
    public final void rule__AdverbStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:852:1: ( ( ( rule__AdverbStatement__ListAssignment_2_1 ) ) )
            // InternalStory.g:853:1: ( ( rule__AdverbStatement__ListAssignment_2_1 ) )
            {
            // InternalStory.g:853:1: ( ( rule__AdverbStatement__ListAssignment_2_1 ) )
            // InternalStory.g:854:2: ( rule__AdverbStatement__ListAssignment_2_1 )
            {
             before(grammarAccess.getAdverbStatementAccess().getListAssignment_2_1()); 
            // InternalStory.g:855:2: ( rule__AdverbStatement__ListAssignment_2_1 )
            // InternalStory.g:855:3: rule__AdverbStatement__ListAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AdverbStatement__ListAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAdverbStatementAccess().getListAssignment_2_1()); 

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
    // $ANTLR end "rule__AdverbStatement__Group_2__1__Impl"


    // $ANTLR start "rule__LocationStatement__Group__0"
    // InternalStory.g:864:1: rule__LocationStatement__Group__0 : rule__LocationStatement__Group__0__Impl rule__LocationStatement__Group__1 ;
    public final void rule__LocationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:868:1: ( rule__LocationStatement__Group__0__Impl rule__LocationStatement__Group__1 )
            // InternalStory.g:869:2: rule__LocationStatement__Group__0__Impl rule__LocationStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LocationStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocationStatement__Group__1();

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
    // $ANTLR end "rule__LocationStatement__Group__0"


    // $ANTLR start "rule__LocationStatement__Group__0__Impl"
    // InternalStory.g:876:1: rule__LocationStatement__Group__0__Impl : ( 'locations:' ) ;
    public final void rule__LocationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:880:1: ( ( 'locations:' ) )
            // InternalStory.g:881:1: ( 'locations:' )
            {
            // InternalStory.g:881:1: ( 'locations:' )
            // InternalStory.g:882:2: 'locations:'
            {
             before(grammarAccess.getLocationStatementAccess().getLocationsKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLocationStatementAccess().getLocationsKeyword_0()); 

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
    // $ANTLR end "rule__LocationStatement__Group__0__Impl"


    // $ANTLR start "rule__LocationStatement__Group__1"
    // InternalStory.g:891:1: rule__LocationStatement__Group__1 : rule__LocationStatement__Group__1__Impl rule__LocationStatement__Group__2 ;
    public final void rule__LocationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:895:1: ( rule__LocationStatement__Group__1__Impl rule__LocationStatement__Group__2 )
            // InternalStory.g:896:2: rule__LocationStatement__Group__1__Impl rule__LocationStatement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__LocationStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocationStatement__Group__2();

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
    // $ANTLR end "rule__LocationStatement__Group__1"


    // $ANTLR start "rule__LocationStatement__Group__1__Impl"
    // InternalStory.g:903:1: rule__LocationStatement__Group__1__Impl : ( ( rule__LocationStatement__ListAssignment_1 ) ) ;
    public final void rule__LocationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:907:1: ( ( ( rule__LocationStatement__ListAssignment_1 ) ) )
            // InternalStory.g:908:1: ( ( rule__LocationStatement__ListAssignment_1 ) )
            {
            // InternalStory.g:908:1: ( ( rule__LocationStatement__ListAssignment_1 ) )
            // InternalStory.g:909:2: ( rule__LocationStatement__ListAssignment_1 )
            {
             before(grammarAccess.getLocationStatementAccess().getListAssignment_1()); 
            // InternalStory.g:910:2: ( rule__LocationStatement__ListAssignment_1 )
            // InternalStory.g:910:3: rule__LocationStatement__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LocationStatement__ListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationStatementAccess().getListAssignment_1()); 

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
    // $ANTLR end "rule__LocationStatement__Group__1__Impl"


    // $ANTLR start "rule__LocationStatement__Group__2"
    // InternalStory.g:918:1: rule__LocationStatement__Group__2 : rule__LocationStatement__Group__2__Impl rule__LocationStatement__Group__3 ;
    public final void rule__LocationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:922:1: ( rule__LocationStatement__Group__2__Impl rule__LocationStatement__Group__3 )
            // InternalStory.g:923:2: rule__LocationStatement__Group__2__Impl rule__LocationStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LocationStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocationStatement__Group__3();

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
    // $ANTLR end "rule__LocationStatement__Group__2"


    // $ANTLR start "rule__LocationStatement__Group__2__Impl"
    // InternalStory.g:930:1: rule__LocationStatement__Group__2__Impl : ( ( rule__LocationStatement__Group_2__0 )* ) ;
    public final void rule__LocationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:934:1: ( ( ( rule__LocationStatement__Group_2__0 )* ) )
            // InternalStory.g:935:1: ( ( rule__LocationStatement__Group_2__0 )* )
            {
            // InternalStory.g:935:1: ( ( rule__LocationStatement__Group_2__0 )* )
            // InternalStory.g:936:2: ( rule__LocationStatement__Group_2__0 )*
            {
             before(grammarAccess.getLocationStatementAccess().getGroup_2()); 
            // InternalStory.g:937:2: ( rule__LocationStatement__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStory.g:937:3: rule__LocationStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__LocationStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getLocationStatementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__LocationStatement__Group__2__Impl"


    // $ANTLR start "rule__LocationStatement__Group__3"
    // InternalStory.g:945:1: rule__LocationStatement__Group__3 : rule__LocationStatement__Group__3__Impl ;
    public final void rule__LocationStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:949:1: ( rule__LocationStatement__Group__3__Impl )
            // InternalStory.g:950:2: rule__LocationStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocationStatement__Group__3__Impl();

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
    // $ANTLR end "rule__LocationStatement__Group__3"


    // $ANTLR start "rule__LocationStatement__Group__3__Impl"
    // InternalStory.g:956:1: rule__LocationStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__LocationStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:960:1: ( ( ';' ) )
            // InternalStory.g:961:1: ( ';' )
            {
            // InternalStory.g:961:1: ( ';' )
            // InternalStory.g:962:2: ';'
            {
             before(grammarAccess.getLocationStatementAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLocationStatementAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__LocationStatement__Group__3__Impl"


    // $ANTLR start "rule__LocationStatement__Group_2__0"
    // InternalStory.g:972:1: rule__LocationStatement__Group_2__0 : rule__LocationStatement__Group_2__0__Impl rule__LocationStatement__Group_2__1 ;
    public final void rule__LocationStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:976:1: ( rule__LocationStatement__Group_2__0__Impl rule__LocationStatement__Group_2__1 )
            // InternalStory.g:977:2: rule__LocationStatement__Group_2__0__Impl rule__LocationStatement__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__LocationStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocationStatement__Group_2__1();

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
    // $ANTLR end "rule__LocationStatement__Group_2__0"


    // $ANTLR start "rule__LocationStatement__Group_2__0__Impl"
    // InternalStory.g:984:1: rule__LocationStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__LocationStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:988:1: ( ( ',' ) )
            // InternalStory.g:989:1: ( ',' )
            {
            // InternalStory.g:989:1: ( ',' )
            // InternalStory.g:990:2: ','
            {
             before(grammarAccess.getLocationStatementAccess().getCommaKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLocationStatementAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__LocationStatement__Group_2__0__Impl"


    // $ANTLR start "rule__LocationStatement__Group_2__1"
    // InternalStory.g:999:1: rule__LocationStatement__Group_2__1 : rule__LocationStatement__Group_2__1__Impl ;
    public final void rule__LocationStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1003:1: ( rule__LocationStatement__Group_2__1__Impl )
            // InternalStory.g:1004:2: rule__LocationStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocationStatement__Group_2__1__Impl();

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
    // $ANTLR end "rule__LocationStatement__Group_2__1"


    // $ANTLR start "rule__LocationStatement__Group_2__1__Impl"
    // InternalStory.g:1010:1: rule__LocationStatement__Group_2__1__Impl : ( ( rule__LocationStatement__ListAssignment_2_1 ) ) ;
    public final void rule__LocationStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1014:1: ( ( ( rule__LocationStatement__ListAssignment_2_1 ) ) )
            // InternalStory.g:1015:1: ( ( rule__LocationStatement__ListAssignment_2_1 ) )
            {
            // InternalStory.g:1015:1: ( ( rule__LocationStatement__ListAssignment_2_1 ) )
            // InternalStory.g:1016:2: ( rule__LocationStatement__ListAssignment_2_1 )
            {
             before(grammarAccess.getLocationStatementAccess().getListAssignment_2_1()); 
            // InternalStory.g:1017:2: ( rule__LocationStatement__ListAssignment_2_1 )
            // InternalStory.g:1017:3: rule__LocationStatement__ListAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LocationStatement__ListAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationStatementAccess().getListAssignment_2_1()); 

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
    // $ANTLR end "rule__LocationStatement__Group_2__1__Impl"


    // $ANTLR start "rule__AdjectiveStatement__Group__0"
    // InternalStory.g:1026:1: rule__AdjectiveStatement__Group__0 : rule__AdjectiveStatement__Group__0__Impl rule__AdjectiveStatement__Group__1 ;
    public final void rule__AdjectiveStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1030:1: ( rule__AdjectiveStatement__Group__0__Impl rule__AdjectiveStatement__Group__1 )
            // InternalStory.g:1031:2: rule__AdjectiveStatement__Group__0__Impl rule__AdjectiveStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AdjectiveStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdjectiveStatement__Group__1();

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
    // $ANTLR end "rule__AdjectiveStatement__Group__0"


    // $ANTLR start "rule__AdjectiveStatement__Group__0__Impl"
    // InternalStory.g:1038:1: rule__AdjectiveStatement__Group__0__Impl : ( 'adjectives:' ) ;
    public final void rule__AdjectiveStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1042:1: ( ( 'adjectives:' ) )
            // InternalStory.g:1043:1: ( 'adjectives:' )
            {
            // InternalStory.g:1043:1: ( 'adjectives:' )
            // InternalStory.g:1044:2: 'adjectives:'
            {
             before(grammarAccess.getAdjectiveStatementAccess().getAdjectivesKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAdjectiveStatementAccess().getAdjectivesKeyword_0()); 

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
    // $ANTLR end "rule__AdjectiveStatement__Group__0__Impl"


    // $ANTLR start "rule__AdjectiveStatement__Group__1"
    // InternalStory.g:1053:1: rule__AdjectiveStatement__Group__1 : rule__AdjectiveStatement__Group__1__Impl rule__AdjectiveStatement__Group__2 ;
    public final void rule__AdjectiveStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1057:1: ( rule__AdjectiveStatement__Group__1__Impl rule__AdjectiveStatement__Group__2 )
            // InternalStory.g:1058:2: rule__AdjectiveStatement__Group__1__Impl rule__AdjectiveStatement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AdjectiveStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdjectiveStatement__Group__2();

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
    // $ANTLR end "rule__AdjectiveStatement__Group__1"


    // $ANTLR start "rule__AdjectiveStatement__Group__1__Impl"
    // InternalStory.g:1065:1: rule__AdjectiveStatement__Group__1__Impl : ( ( rule__AdjectiveStatement__ListAssignment_1 ) ) ;
    public final void rule__AdjectiveStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1069:1: ( ( ( rule__AdjectiveStatement__ListAssignment_1 ) ) )
            // InternalStory.g:1070:1: ( ( rule__AdjectiveStatement__ListAssignment_1 ) )
            {
            // InternalStory.g:1070:1: ( ( rule__AdjectiveStatement__ListAssignment_1 ) )
            // InternalStory.g:1071:2: ( rule__AdjectiveStatement__ListAssignment_1 )
            {
             before(grammarAccess.getAdjectiveStatementAccess().getListAssignment_1()); 
            // InternalStory.g:1072:2: ( rule__AdjectiveStatement__ListAssignment_1 )
            // InternalStory.g:1072:3: rule__AdjectiveStatement__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AdjectiveStatement__ListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAdjectiveStatementAccess().getListAssignment_1()); 

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
    // $ANTLR end "rule__AdjectiveStatement__Group__1__Impl"


    // $ANTLR start "rule__AdjectiveStatement__Group__2"
    // InternalStory.g:1080:1: rule__AdjectiveStatement__Group__2 : rule__AdjectiveStatement__Group__2__Impl rule__AdjectiveStatement__Group__3 ;
    public final void rule__AdjectiveStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1084:1: ( rule__AdjectiveStatement__Group__2__Impl rule__AdjectiveStatement__Group__3 )
            // InternalStory.g:1085:2: rule__AdjectiveStatement__Group__2__Impl rule__AdjectiveStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AdjectiveStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdjectiveStatement__Group__3();

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
    // $ANTLR end "rule__AdjectiveStatement__Group__2"


    // $ANTLR start "rule__AdjectiveStatement__Group__2__Impl"
    // InternalStory.g:1092:1: rule__AdjectiveStatement__Group__2__Impl : ( ( rule__AdjectiveStatement__Group_2__0 )* ) ;
    public final void rule__AdjectiveStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1096:1: ( ( ( rule__AdjectiveStatement__Group_2__0 )* ) )
            // InternalStory.g:1097:1: ( ( rule__AdjectiveStatement__Group_2__0 )* )
            {
            // InternalStory.g:1097:1: ( ( rule__AdjectiveStatement__Group_2__0 )* )
            // InternalStory.g:1098:2: ( rule__AdjectiveStatement__Group_2__0 )*
            {
             before(grammarAccess.getAdjectiveStatementAccess().getGroup_2()); 
            // InternalStory.g:1099:2: ( rule__AdjectiveStatement__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStory.g:1099:3: rule__AdjectiveStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AdjectiveStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAdjectiveStatementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AdjectiveStatement__Group__2__Impl"


    // $ANTLR start "rule__AdjectiveStatement__Group__3"
    // InternalStory.g:1107:1: rule__AdjectiveStatement__Group__3 : rule__AdjectiveStatement__Group__3__Impl ;
    public final void rule__AdjectiveStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1111:1: ( rule__AdjectiveStatement__Group__3__Impl )
            // InternalStory.g:1112:2: rule__AdjectiveStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdjectiveStatement__Group__3__Impl();

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
    // $ANTLR end "rule__AdjectiveStatement__Group__3"


    // $ANTLR start "rule__AdjectiveStatement__Group__3__Impl"
    // InternalStory.g:1118:1: rule__AdjectiveStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__AdjectiveStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1122:1: ( ( ';' ) )
            // InternalStory.g:1123:1: ( ';' )
            {
            // InternalStory.g:1123:1: ( ';' )
            // InternalStory.g:1124:2: ';'
            {
             before(grammarAccess.getAdjectiveStatementAccess().getSemicolonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAdjectiveStatementAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__AdjectiveStatement__Group__3__Impl"


    // $ANTLR start "rule__AdjectiveStatement__Group_2__0"
    // InternalStory.g:1134:1: rule__AdjectiveStatement__Group_2__0 : rule__AdjectiveStatement__Group_2__0__Impl rule__AdjectiveStatement__Group_2__1 ;
    public final void rule__AdjectiveStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1138:1: ( rule__AdjectiveStatement__Group_2__0__Impl rule__AdjectiveStatement__Group_2__1 )
            // InternalStory.g:1139:2: rule__AdjectiveStatement__Group_2__0__Impl rule__AdjectiveStatement__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__AdjectiveStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdjectiveStatement__Group_2__1();

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
    // $ANTLR end "rule__AdjectiveStatement__Group_2__0"


    // $ANTLR start "rule__AdjectiveStatement__Group_2__0__Impl"
    // InternalStory.g:1146:1: rule__AdjectiveStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__AdjectiveStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1150:1: ( ( ',' ) )
            // InternalStory.g:1151:1: ( ',' )
            {
            // InternalStory.g:1151:1: ( ',' )
            // InternalStory.g:1152:2: ','
            {
             before(grammarAccess.getAdjectiveStatementAccess().getCommaKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAdjectiveStatementAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__AdjectiveStatement__Group_2__0__Impl"


    // $ANTLR start "rule__AdjectiveStatement__Group_2__1"
    // InternalStory.g:1161:1: rule__AdjectiveStatement__Group_2__1 : rule__AdjectiveStatement__Group_2__1__Impl ;
    public final void rule__AdjectiveStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1165:1: ( rule__AdjectiveStatement__Group_2__1__Impl )
            // InternalStory.g:1166:2: rule__AdjectiveStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdjectiveStatement__Group_2__1__Impl();

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
    // $ANTLR end "rule__AdjectiveStatement__Group_2__1"


    // $ANTLR start "rule__AdjectiveStatement__Group_2__1__Impl"
    // InternalStory.g:1172:1: rule__AdjectiveStatement__Group_2__1__Impl : ( ( rule__AdjectiveStatement__ListAssignment_2_1 ) ) ;
    public final void rule__AdjectiveStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1176:1: ( ( ( rule__AdjectiveStatement__ListAssignment_2_1 ) ) )
            // InternalStory.g:1177:1: ( ( rule__AdjectiveStatement__ListAssignment_2_1 ) )
            {
            // InternalStory.g:1177:1: ( ( rule__AdjectiveStatement__ListAssignment_2_1 ) )
            // InternalStory.g:1178:2: ( rule__AdjectiveStatement__ListAssignment_2_1 )
            {
             before(grammarAccess.getAdjectiveStatementAccess().getListAssignment_2_1()); 
            // InternalStory.g:1179:2: ( rule__AdjectiveStatement__ListAssignment_2_1 )
            // InternalStory.g:1179:3: rule__AdjectiveStatement__ListAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AdjectiveStatement__ListAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAdjectiveStatementAccess().getListAssignment_2_1()); 

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
    // $ANTLR end "rule__AdjectiveStatement__Group_2__1__Impl"


    // $ANTLR start "rule__StoryProgram__StatementsAssignment"
    // InternalStory.g:1188:1: rule__StoryProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__StoryProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1192:1: ( ( ruleStatement ) )
            // InternalStory.g:1193:2: ( ruleStatement )
            {
            // InternalStory.g:1193:2: ( ruleStatement )
            // InternalStory.g:1194:3: ruleStatement
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


    // $ANTLR start "rule__NameStatement__ValueAssignment_1"
    // InternalStory.g:1203:1: rule__NameStatement__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NameStatement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1207:1: ( ( RULE_STRING ) )
            // InternalStory.g:1208:2: ( RULE_STRING )
            {
            // InternalStory.g:1208:2: ( RULE_STRING )
            // InternalStory.g:1209:3: RULE_STRING
            {
             before(grammarAccess.getNameStatementAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNameStatementAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NameStatement__ValueAssignment_1"


    // $ANTLR start "rule__EmotionStatement__ListAssignment_1"
    // InternalStory.g:1218:1: rule__EmotionStatement__ListAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EmotionStatement__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1222:1: ( ( RULE_STRING ) )
            // InternalStory.g:1223:2: ( RULE_STRING )
            {
            // InternalStory.g:1223:2: ( RULE_STRING )
            // InternalStory.g:1224:3: RULE_STRING
            {
             before(grammarAccess.getEmotionStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEmotionStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EmotionStatement__ListAssignment_1"


    // $ANTLR start "rule__EmotionStatement__ListAssignment_2_1"
    // InternalStory.g:1233:1: rule__EmotionStatement__ListAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__EmotionStatement__ListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1237:1: ( ( RULE_STRING ) )
            // InternalStory.g:1238:2: ( RULE_STRING )
            {
            // InternalStory.g:1238:2: ( RULE_STRING )
            // InternalStory.g:1239:3: RULE_STRING
            {
             before(grammarAccess.getEmotionStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEmotionStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__EmotionStatement__ListAssignment_2_1"


    // $ANTLR start "rule__VerbStatement__ListAssignment_1"
    // InternalStory.g:1248:1: rule__VerbStatement__ListAssignment_1 : ( RULE_STRING ) ;
    public final void rule__VerbStatement__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1252:1: ( ( RULE_STRING ) )
            // InternalStory.g:1253:2: ( RULE_STRING )
            {
            // InternalStory.g:1253:2: ( RULE_STRING )
            // InternalStory.g:1254:3: RULE_STRING
            {
             before(grammarAccess.getVerbStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVerbStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VerbStatement__ListAssignment_1"


    // $ANTLR start "rule__VerbStatement__ListAssignment_2_1"
    // InternalStory.g:1263:1: rule__VerbStatement__ListAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__VerbStatement__ListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1267:1: ( ( RULE_STRING ) )
            // InternalStory.g:1268:2: ( RULE_STRING )
            {
            // InternalStory.g:1268:2: ( RULE_STRING )
            // InternalStory.g:1269:3: RULE_STRING
            {
             before(grammarAccess.getVerbStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVerbStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__VerbStatement__ListAssignment_2_1"


    // $ANTLR start "rule__AdverbStatement__ListAssignment_1"
    // InternalStory.g:1278:1: rule__AdverbStatement__ListAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AdverbStatement__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1282:1: ( ( RULE_STRING ) )
            // InternalStory.g:1283:2: ( RULE_STRING )
            {
            // InternalStory.g:1283:2: ( RULE_STRING )
            // InternalStory.g:1284:3: RULE_STRING
            {
             before(grammarAccess.getAdverbStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAdverbStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AdverbStatement__ListAssignment_1"


    // $ANTLR start "rule__AdverbStatement__ListAssignment_2_1"
    // InternalStory.g:1293:1: rule__AdverbStatement__ListAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__AdverbStatement__ListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1297:1: ( ( RULE_STRING ) )
            // InternalStory.g:1298:2: ( RULE_STRING )
            {
            // InternalStory.g:1298:2: ( RULE_STRING )
            // InternalStory.g:1299:3: RULE_STRING
            {
             before(grammarAccess.getAdverbStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAdverbStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__AdverbStatement__ListAssignment_2_1"


    // $ANTLR start "rule__LocationStatement__ListAssignment_1"
    // InternalStory.g:1308:1: rule__LocationStatement__ListAssignment_1 : ( RULE_STRING ) ;
    public final void rule__LocationStatement__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1312:1: ( ( RULE_STRING ) )
            // InternalStory.g:1313:2: ( RULE_STRING )
            {
            // InternalStory.g:1313:2: ( RULE_STRING )
            // InternalStory.g:1314:3: RULE_STRING
            {
             before(grammarAccess.getLocationStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLocationStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__LocationStatement__ListAssignment_1"


    // $ANTLR start "rule__LocationStatement__ListAssignment_2_1"
    // InternalStory.g:1323:1: rule__LocationStatement__ListAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__LocationStatement__ListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1327:1: ( ( RULE_STRING ) )
            // InternalStory.g:1328:2: ( RULE_STRING )
            {
            // InternalStory.g:1328:2: ( RULE_STRING )
            // InternalStory.g:1329:3: RULE_STRING
            {
             before(grammarAccess.getLocationStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLocationStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__LocationStatement__ListAssignment_2_1"


    // $ANTLR start "rule__AdjectiveStatement__ListAssignment_1"
    // InternalStory.g:1338:1: rule__AdjectiveStatement__ListAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AdjectiveStatement__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1342:1: ( ( RULE_STRING ) )
            // InternalStory.g:1343:2: ( RULE_STRING )
            {
            // InternalStory.g:1343:2: ( RULE_STRING )
            // InternalStory.g:1344:3: RULE_STRING
            {
             before(grammarAccess.getAdjectiveStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAdjectiveStatementAccess().getListSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AdjectiveStatement__ListAssignment_1"


    // $ANTLR start "rule__AdjectiveStatement__ListAssignment_2_1"
    // InternalStory.g:1353:1: rule__AdjectiveStatement__ListAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__AdjectiveStatement__ListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:1357:1: ( ( RULE_STRING ) )
            // InternalStory.g:1358:2: ( RULE_STRING )
            {
            // InternalStory.g:1358:2: ( RULE_STRING )
            // InternalStory.g:1359:3: RULE_STRING
            {
             before(grammarAccess.getAdjectiveStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAdjectiveStatementAccess().getListSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__AdjectiveStatement__ListAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000007A802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});

}