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

                if ( (LA1_0==11||LA1_0==13) ) {
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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalStory.g:152:1: rule__Statement__Alternatives : ( ( ruleNameStatement ) | ( ruleEmotionStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:156:1: ( ( ruleNameStatement ) | ( ruleEmotionStatement ) )
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
                    // InternalStory.g:157:2: ( ruleNameStatement )
                    {
                    // InternalStory.g:157:2: ( ruleNameStatement )
                    // InternalStory.g:158:3: ruleNameStatement
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
                    // InternalStory.g:163:2: ( ruleEmotionStatement )
                    {
                    // InternalStory.g:163:2: ( ruleEmotionStatement )
                    // InternalStory.g:164:3: ruleEmotionStatement
                    {
                     before(grammarAccess.getStatementAccess().getEmotionStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEmotionStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getEmotionStatementParserRuleCall_1()); 

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
    // InternalStory.g:173:1: rule__NameStatement__Group__0 : rule__NameStatement__Group__0__Impl rule__NameStatement__Group__1 ;
    public final void rule__NameStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:177:1: ( rule__NameStatement__Group__0__Impl rule__NameStatement__Group__1 )
            // InternalStory.g:178:2: rule__NameStatement__Group__0__Impl rule__NameStatement__Group__1
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
    // InternalStory.g:185:1: rule__NameStatement__Group__0__Impl : ( 'name:' ) ;
    public final void rule__NameStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:189:1: ( ( 'name:' ) )
            // InternalStory.g:190:1: ( 'name:' )
            {
            // InternalStory.g:190:1: ( 'name:' )
            // InternalStory.g:191:2: 'name:'
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
    // InternalStory.g:200:1: rule__NameStatement__Group__1 : rule__NameStatement__Group__1__Impl rule__NameStatement__Group__2 ;
    public final void rule__NameStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:204:1: ( rule__NameStatement__Group__1__Impl rule__NameStatement__Group__2 )
            // InternalStory.g:205:2: rule__NameStatement__Group__1__Impl rule__NameStatement__Group__2
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
    // InternalStory.g:212:1: rule__NameStatement__Group__1__Impl : ( ( rule__NameStatement__ValueAssignment_1 ) ) ;
    public final void rule__NameStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:216:1: ( ( ( rule__NameStatement__ValueAssignment_1 ) ) )
            // InternalStory.g:217:1: ( ( rule__NameStatement__ValueAssignment_1 ) )
            {
            // InternalStory.g:217:1: ( ( rule__NameStatement__ValueAssignment_1 ) )
            // InternalStory.g:218:2: ( rule__NameStatement__ValueAssignment_1 )
            {
             before(grammarAccess.getNameStatementAccess().getValueAssignment_1()); 
            // InternalStory.g:219:2: ( rule__NameStatement__ValueAssignment_1 )
            // InternalStory.g:219:3: rule__NameStatement__ValueAssignment_1
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
    // InternalStory.g:227:1: rule__NameStatement__Group__2 : rule__NameStatement__Group__2__Impl ;
    public final void rule__NameStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:231:1: ( rule__NameStatement__Group__2__Impl )
            // InternalStory.g:232:2: rule__NameStatement__Group__2__Impl
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
    // InternalStory.g:238:1: rule__NameStatement__Group__2__Impl : ( ';' ) ;
    public final void rule__NameStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:242:1: ( ( ';' ) )
            // InternalStory.g:243:1: ( ';' )
            {
            // InternalStory.g:243:1: ( ';' )
            // InternalStory.g:244:2: ';'
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
    // InternalStory.g:254:1: rule__EmotionStatement__Group__0 : rule__EmotionStatement__Group__0__Impl rule__EmotionStatement__Group__1 ;
    public final void rule__EmotionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:258:1: ( rule__EmotionStatement__Group__0__Impl rule__EmotionStatement__Group__1 )
            // InternalStory.g:259:2: rule__EmotionStatement__Group__0__Impl rule__EmotionStatement__Group__1
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
    // InternalStory.g:266:1: rule__EmotionStatement__Group__0__Impl : ( 'emotions:' ) ;
    public final void rule__EmotionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:270:1: ( ( 'emotions:' ) )
            // InternalStory.g:271:1: ( 'emotions:' )
            {
            // InternalStory.g:271:1: ( 'emotions:' )
            // InternalStory.g:272:2: 'emotions:'
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
    // InternalStory.g:281:1: rule__EmotionStatement__Group__1 : rule__EmotionStatement__Group__1__Impl rule__EmotionStatement__Group__2 ;
    public final void rule__EmotionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:285:1: ( rule__EmotionStatement__Group__1__Impl rule__EmotionStatement__Group__2 )
            // InternalStory.g:286:2: rule__EmotionStatement__Group__1__Impl rule__EmotionStatement__Group__2
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
    // InternalStory.g:293:1: rule__EmotionStatement__Group__1__Impl : ( ( rule__EmotionStatement__ListAssignment_1 ) ) ;
    public final void rule__EmotionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:297:1: ( ( ( rule__EmotionStatement__ListAssignment_1 ) ) )
            // InternalStory.g:298:1: ( ( rule__EmotionStatement__ListAssignment_1 ) )
            {
            // InternalStory.g:298:1: ( ( rule__EmotionStatement__ListAssignment_1 ) )
            // InternalStory.g:299:2: ( rule__EmotionStatement__ListAssignment_1 )
            {
             before(grammarAccess.getEmotionStatementAccess().getListAssignment_1()); 
            // InternalStory.g:300:2: ( rule__EmotionStatement__ListAssignment_1 )
            // InternalStory.g:300:3: rule__EmotionStatement__ListAssignment_1
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
    // InternalStory.g:308:1: rule__EmotionStatement__Group__2 : rule__EmotionStatement__Group__2__Impl rule__EmotionStatement__Group__3 ;
    public final void rule__EmotionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:312:1: ( rule__EmotionStatement__Group__2__Impl rule__EmotionStatement__Group__3 )
            // InternalStory.g:313:2: rule__EmotionStatement__Group__2__Impl rule__EmotionStatement__Group__3
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
    // InternalStory.g:320:1: rule__EmotionStatement__Group__2__Impl : ( ( rule__EmotionStatement__Group_2__0 )* ) ;
    public final void rule__EmotionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:324:1: ( ( ( rule__EmotionStatement__Group_2__0 )* ) )
            // InternalStory.g:325:1: ( ( rule__EmotionStatement__Group_2__0 )* )
            {
            // InternalStory.g:325:1: ( ( rule__EmotionStatement__Group_2__0 )* )
            // InternalStory.g:326:2: ( rule__EmotionStatement__Group_2__0 )*
            {
             before(grammarAccess.getEmotionStatementAccess().getGroup_2()); 
            // InternalStory.g:327:2: ( rule__EmotionStatement__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStory.g:327:3: rule__EmotionStatement__Group_2__0
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
    // InternalStory.g:335:1: rule__EmotionStatement__Group__3 : rule__EmotionStatement__Group__3__Impl ;
    public final void rule__EmotionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:339:1: ( rule__EmotionStatement__Group__3__Impl )
            // InternalStory.g:340:2: rule__EmotionStatement__Group__3__Impl
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
    // InternalStory.g:346:1: rule__EmotionStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__EmotionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:350:1: ( ( ';' ) )
            // InternalStory.g:351:1: ( ';' )
            {
            // InternalStory.g:351:1: ( ';' )
            // InternalStory.g:352:2: ';'
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
    // InternalStory.g:362:1: rule__EmotionStatement__Group_2__0 : rule__EmotionStatement__Group_2__0__Impl rule__EmotionStatement__Group_2__1 ;
    public final void rule__EmotionStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:366:1: ( rule__EmotionStatement__Group_2__0__Impl rule__EmotionStatement__Group_2__1 )
            // InternalStory.g:367:2: rule__EmotionStatement__Group_2__0__Impl rule__EmotionStatement__Group_2__1
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
    // InternalStory.g:374:1: rule__EmotionStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EmotionStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:378:1: ( ( ',' ) )
            // InternalStory.g:379:1: ( ',' )
            {
            // InternalStory.g:379:1: ( ',' )
            // InternalStory.g:380:2: ','
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
    // InternalStory.g:389:1: rule__EmotionStatement__Group_2__1 : rule__EmotionStatement__Group_2__1__Impl ;
    public final void rule__EmotionStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:393:1: ( rule__EmotionStatement__Group_2__1__Impl )
            // InternalStory.g:394:2: rule__EmotionStatement__Group_2__1__Impl
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
    // InternalStory.g:400:1: rule__EmotionStatement__Group_2__1__Impl : ( ( rule__EmotionStatement__ListAssignment_2_1 ) ) ;
    public final void rule__EmotionStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:404:1: ( ( ( rule__EmotionStatement__ListAssignment_2_1 ) ) )
            // InternalStory.g:405:1: ( ( rule__EmotionStatement__ListAssignment_2_1 ) )
            {
            // InternalStory.g:405:1: ( ( rule__EmotionStatement__ListAssignment_2_1 ) )
            // InternalStory.g:406:2: ( rule__EmotionStatement__ListAssignment_2_1 )
            {
             before(grammarAccess.getEmotionStatementAccess().getListAssignment_2_1()); 
            // InternalStory.g:407:2: ( rule__EmotionStatement__ListAssignment_2_1 )
            // InternalStory.g:407:3: rule__EmotionStatement__ListAssignment_2_1
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


    // $ANTLR start "rule__StoryProgram__StatementsAssignment"
    // InternalStory.g:416:1: rule__StoryProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__StoryProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:420:1: ( ( ruleStatement ) )
            // InternalStory.g:421:2: ( ruleStatement )
            {
            // InternalStory.g:421:2: ( ruleStatement )
            // InternalStory.g:422:3: ruleStatement
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
    // InternalStory.g:431:1: rule__NameStatement__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NameStatement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:435:1: ( ( RULE_STRING ) )
            // InternalStory.g:436:2: ( RULE_STRING )
            {
            // InternalStory.g:436:2: ( RULE_STRING )
            // InternalStory.g:437:3: RULE_STRING
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
    // InternalStory.g:446:1: rule__EmotionStatement__ListAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EmotionStatement__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:450:1: ( ( RULE_STRING ) )
            // InternalStory.g:451:2: ( RULE_STRING )
            {
            // InternalStory.g:451:2: ( RULE_STRING )
            // InternalStory.g:452:3: RULE_STRING
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
    // InternalStory.g:461:1: rule__EmotionStatement__ListAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__EmotionStatement__ListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStory.g:465:1: ( ( RULE_STRING ) )
            // InternalStory.g:466:2: ( RULE_STRING )
            {
            // InternalStory.g:466:2: ( RULE_STRING )
            // InternalStory.g:467:3: RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});

}