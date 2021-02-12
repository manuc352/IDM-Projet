package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFT_BRACE", "RULE_RIGHT_BRACE", "RULE_PAIR_SEPARATION", "RULE_COLON_SEPARATION", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'E'", "'e'", "'-'", "'.'", "'file'", "'='", "'add'", "','", "'clear'", "'search'", "'delete'", "'null'"
    };
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int RULE_RIGHT_BRACKET=9;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_RIGHT_BRACE=5;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=12;
    public static final int RULE_WS=15;
    public static final int RULE_PAIR_SEPARATION=6;
    public static final int RULE_LEFT_BRACKET=8;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_LEFT_BRACE=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int RULE_COLON_SEPARATION=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleJson"
    // InternalMyDsl.g:53:1: entryRuleJson : ruleJson EOF ;
    public final void entryRuleJson() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleJson EOF )
            // InternalMyDsl.g:55:1: ruleJson EOF
            {
             before(grammarAccess.getJsonRule()); 
            pushFollow(FOLLOW_1);
            ruleJson();

            state._fsp--;

             after(grammarAccess.getJsonRule()); 
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
    // $ANTLR end "entryRuleJson"


    // $ANTLR start "ruleJson"
    // InternalMyDsl.g:62:1: ruleJson : ( ( rule__Json__Group__0 ) ) ;
    public final void ruleJson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Json__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Json__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Json__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Json__Group__0 )
            {
             before(grammarAccess.getJsonAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Json__Group__0 )
            // InternalMyDsl.g:69:4: rule__Json__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Json__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonAccess().getGroup()); 

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
    // $ANTLR end "ruleJson"


    // $ANTLR start "entryRuleJsonOperation"
    // InternalMyDsl.g:78:1: entryRuleJsonOperation : ruleJsonOperation EOF ;
    public final void entryRuleJsonOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleJsonOperation EOF )
            // InternalMyDsl.g:80:1: ruleJsonOperation EOF
            {
             before(grammarAccess.getJsonOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonOperation();

            state._fsp--;

             after(grammarAccess.getJsonOperationRule()); 
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
    // $ANTLR end "entryRuleJsonOperation"


    // $ANTLR start "ruleJsonOperation"
    // InternalMyDsl.g:87:1: ruleJsonOperation : ( ( rule__JsonOperation__Alternatives ) ) ;
    public final void ruleJsonOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__JsonOperation__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__JsonOperation__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__JsonOperation__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__JsonOperation__Alternatives )
            {
             before(grammarAccess.getJsonOperationAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__JsonOperation__Alternatives )
            // InternalMyDsl.g:94:4: rule__JsonOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JsonOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleJsonOperation"


    // $ANTLR start "entryRulePair"
    // InternalMyDsl.g:103:1: entryRulePair : rulePair EOF ;
    public final void entryRulePair() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( rulePair EOF )
            // InternalMyDsl.g:105:1: rulePair EOF
            {
             before(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_1);
            rulePair();

            state._fsp--;

             after(grammarAccess.getPairRule()); 
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
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // InternalMyDsl.g:112:1: rulePair : ( ( rule__Pair__Group__0 ) ) ;
    public final void rulePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Pair__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Pair__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Pair__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Pair__Group__0 )
            {
             before(grammarAccess.getPairAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Pair__Group__0 )
            // InternalMyDsl.g:119:4: rule__Pair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getGroup()); 

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
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:128:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleValue EOF )
            // InternalMyDsl.g:130:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:137:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Value__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Value__Alternatives )
            // InternalMyDsl.g:144:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleJString"
    // InternalMyDsl.g:153:1: entryRuleJString : ruleJString EOF ;
    public final void entryRuleJString() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleJString EOF )
            // InternalMyDsl.g:155:1: ruleJString EOF
            {
             before(grammarAccess.getJStringRule()); 
            pushFollow(FOLLOW_1);
            ruleJString();

            state._fsp--;

             after(grammarAccess.getJStringRule()); 
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
    // $ANTLR end "entryRuleJString"


    // $ANTLR start "ruleJString"
    // InternalMyDsl.g:162:1: ruleJString : ( ( rule__JString__ValAssignment ) ) ;
    public final void ruleJString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__JString__ValAssignment ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__JString__ValAssignment ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__JString__ValAssignment ) )
            // InternalMyDsl.g:168:3: ( rule__JString__ValAssignment )
            {
             before(grammarAccess.getJStringAccess().getValAssignment()); 
            // InternalMyDsl.g:169:3: ( rule__JString__ValAssignment )
            // InternalMyDsl.g:169:4: rule__JString__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JString__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJStringAccess().getValAssignment()); 

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
    // $ANTLR end "ruleJString"


    // $ANTLR start "entryRuleJArray"
    // InternalMyDsl.g:178:1: entryRuleJArray : ruleJArray EOF ;
    public final void entryRuleJArray() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleJArray EOF )
            // InternalMyDsl.g:180:1: ruleJArray EOF
            {
             before(grammarAccess.getJArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleJArray();

            state._fsp--;

             after(grammarAccess.getJArrayRule()); 
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
    // $ANTLR end "entryRuleJArray"


    // $ANTLR start "ruleJArray"
    // InternalMyDsl.g:187:1: ruleJArray : ( ( rule__JArray__Group__0 ) ) ;
    public final void ruleJArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__JArray__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__JArray__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__JArray__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__JArray__Group__0 )
            {
             before(grammarAccess.getJArrayAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__JArray__Group__0 )
            // InternalMyDsl.g:194:4: rule__JArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJArrayAccess().getGroup()); 

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
    // $ANTLR end "ruleJArray"


    // $ANTLR start "entryRuleJBoolean"
    // InternalMyDsl.g:203:1: entryRuleJBoolean : ruleJBoolean EOF ;
    public final void entryRuleJBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleJBoolean EOF )
            // InternalMyDsl.g:205:1: ruleJBoolean EOF
            {
             before(grammarAccess.getJBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleJBoolean();

            state._fsp--;

             after(grammarAccess.getJBooleanRule()); 
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
    // $ANTLR end "entryRuleJBoolean"


    // $ANTLR start "ruleJBoolean"
    // InternalMyDsl.g:212:1: ruleJBoolean : ( ( rule__JBoolean__ValAssignment ) ) ;
    public final void ruleJBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__JBoolean__ValAssignment ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__JBoolean__ValAssignment ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__JBoolean__ValAssignment ) )
            // InternalMyDsl.g:218:3: ( rule__JBoolean__ValAssignment )
            {
             before(grammarAccess.getJBooleanAccess().getValAssignment()); 
            // InternalMyDsl.g:219:3: ( rule__JBoolean__ValAssignment )
            // InternalMyDsl.g:219:4: rule__JBoolean__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JBoolean__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJBooleanAccess().getValAssignment()); 

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
    // $ANTLR end "ruleJBoolean"


    // $ANTLR start "entryRuleNull"
    // InternalMyDsl.g:228:1: entryRuleNull : ruleNull EOF ;
    public final void entryRuleNull() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleNull EOF )
            // InternalMyDsl.g:230:1: ruleNull EOF
            {
             before(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_1);
            ruleNull();

            state._fsp--;

             after(grammarAccess.getNullRule()); 
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
    // $ANTLR end "entryRuleNull"


    // $ANTLR start "ruleNull"
    // InternalMyDsl.g:237:1: ruleNull : ( ( rule__Null__ValAssignment ) ) ;
    public final void ruleNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Null__ValAssignment ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Null__ValAssignment ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Null__ValAssignment ) )
            // InternalMyDsl.g:243:3: ( rule__Null__ValAssignment )
            {
             before(grammarAccess.getNullAccess().getValAssignment()); 
            // InternalMyDsl.g:244:3: ( rule__Null__ValAssignment )
            // InternalMyDsl.g:244:4: rule__Null__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Null__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNullAccess().getValAssignment()); 

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
    // $ANTLR end "ruleNull"


    // $ANTLR start "entryRuleJNumber"
    // InternalMyDsl.g:253:1: entryRuleJNumber : ruleJNumber EOF ;
    public final void entryRuleJNumber() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleJNumber EOF )
            // InternalMyDsl.g:255:1: ruleJNumber EOF
            {
             before(grammarAccess.getJNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleJNumber();

            state._fsp--;

             after(grammarAccess.getJNumberRule()); 
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
    // $ANTLR end "entryRuleJNumber"


    // $ANTLR start "ruleJNumber"
    // InternalMyDsl.g:262:1: ruleJNumber : ( ( rule__JNumber__Group__0 ) ) ;
    public final void ruleJNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__JNumber__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__JNumber__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__JNumber__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__JNumber__Group__0 )
            {
             before(grammarAccess.getJNumberAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__JNumber__Group__0 )
            // InternalMyDsl.g:269:4: rule__JNumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJNumberAccess().getGroup()); 

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
    // $ANTLR end "ruleJNumber"


    // $ANTLR start "entryRuleFichier"
    // InternalMyDsl.g:278:1: entryRuleFichier : ruleFichier EOF ;
    public final void entryRuleFichier() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleFichier EOF )
            // InternalMyDsl.g:280:1: ruleFichier EOF
            {
             before(grammarAccess.getFichierRule()); 
            pushFollow(FOLLOW_1);
            ruleFichier();

            state._fsp--;

             after(grammarAccess.getFichierRule()); 
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
    // $ANTLR end "entryRuleFichier"


    // $ANTLR start "ruleFichier"
    // InternalMyDsl.g:287:1: ruleFichier : ( ( rule__Fichier__Group__0 ) ) ;
    public final void ruleFichier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Fichier__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Fichier__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Fichier__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Fichier__Group__0 )
            {
             before(grammarAccess.getFichierAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Fichier__Group__0 )
            // InternalMyDsl.g:294:4: rule__Fichier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFichierAccess().getGroup()); 

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
    // $ANTLR end "ruleFichier"


    // $ANTLR start "entryRuleAdd"
    // InternalMyDsl.g:303:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleAdd EOF )
            // InternalMyDsl.g:305:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalMyDsl.g:312:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Add__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Add__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Add__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Add__Group__0 )
            // InternalMyDsl.g:319:4: rule__Add__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getGroup()); 

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleClear"
    // InternalMyDsl.g:328:1: entryRuleClear : ruleClear EOF ;
    public final void entryRuleClear() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleClear EOF )
            // InternalMyDsl.g:330:1: ruleClear EOF
            {
             before(grammarAccess.getClearRule()); 
            pushFollow(FOLLOW_1);
            ruleClear();

            state._fsp--;

             after(grammarAccess.getClearRule()); 
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
    // $ANTLR end "entryRuleClear"


    // $ANTLR start "ruleClear"
    // InternalMyDsl.g:337:1: ruleClear : ( ( rule__Clear__Group__0 ) ) ;
    public final void ruleClear() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Clear__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Clear__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Clear__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Clear__Group__0 )
            {
             before(grammarAccess.getClearAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Clear__Group__0 )
            // InternalMyDsl.g:344:4: rule__Clear__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clear__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClearAccess().getGroup()); 

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
    // $ANTLR end "ruleClear"


    // $ANTLR start "entryRuleSearch"
    // InternalMyDsl.g:353:1: entryRuleSearch : ruleSearch EOF ;
    public final void entryRuleSearch() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleSearch EOF )
            // InternalMyDsl.g:355:1: ruleSearch EOF
            {
             before(grammarAccess.getSearchRule()); 
            pushFollow(FOLLOW_1);
            ruleSearch();

            state._fsp--;

             after(grammarAccess.getSearchRule()); 
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
    // $ANTLR end "entryRuleSearch"


    // $ANTLR start "ruleSearch"
    // InternalMyDsl.g:362:1: ruleSearch : ( ( rule__Search__Group__0 ) ) ;
    public final void ruleSearch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Search__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Search__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Search__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Search__Group__0 )
            {
             before(grammarAccess.getSearchAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Search__Group__0 )
            // InternalMyDsl.g:369:4: rule__Search__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Search__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getGroup()); 

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
    // $ANTLR end "ruleSearch"


    // $ANTLR start "entryRuleDelete"
    // InternalMyDsl.g:378:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleDelete EOF )
            // InternalMyDsl.g:380:1: ruleDelete EOF
            {
             before(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            ruleDelete();

            state._fsp--;

             after(grammarAccess.getDeleteRule()); 
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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalMyDsl.g:387:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Delete__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Delete__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Delete__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Delete__Group__0 )
            // InternalMyDsl.g:394:4: rule__Delete__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getGroup()); 

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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "rule__JsonOperation__Alternatives"
    // InternalMyDsl.g:402:1: rule__JsonOperation__Alternatives : ( ( ruleFichier ) | ( ruleAdd ) | ( ruleSearch ) | ( ruleDelete ) | ( ruleClear ) );
    public final void rule__JsonOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:406:1: ( ( ruleFichier ) | ( ruleAdd ) | ( ruleSearch ) | ( ruleDelete ) | ( ruleClear ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            case 27:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:407:2: ( ruleFichier )
                    {
                    // InternalMyDsl.g:407:2: ( ruleFichier )
                    // InternalMyDsl.g:408:3: ruleFichier
                    {
                     before(grammarAccess.getJsonOperationAccess().getFichierParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFichier();

                    state._fsp--;

                     after(grammarAccess.getJsonOperationAccess().getFichierParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:413:2: ( ruleAdd )
                    {
                    // InternalMyDsl.g:413:2: ( ruleAdd )
                    // InternalMyDsl.g:414:3: ruleAdd
                    {
                     before(grammarAccess.getJsonOperationAccess().getAddParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAdd();

                    state._fsp--;

                     after(grammarAccess.getJsonOperationAccess().getAddParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:419:2: ( ruleSearch )
                    {
                    // InternalMyDsl.g:419:2: ( ruleSearch )
                    // InternalMyDsl.g:420:3: ruleSearch
                    {
                     before(grammarAccess.getJsonOperationAccess().getSearchParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSearch();

                    state._fsp--;

                     after(grammarAccess.getJsonOperationAccess().getSearchParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:425:2: ( ruleDelete )
                    {
                    // InternalMyDsl.g:425:2: ( ruleDelete )
                    // InternalMyDsl.g:426:3: ruleDelete
                    {
                     before(grammarAccess.getJsonOperationAccess().getDeleteParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getJsonOperationAccess().getDeleteParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:431:2: ( ruleClear )
                    {
                    // InternalMyDsl.g:431:2: ( ruleClear )
                    // InternalMyDsl.g:432:3: ruleClear
                    {
                     before(grammarAccess.getJsonOperationAccess().getClearParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleClear();

                    state._fsp--;

                     after(grammarAccess.getJsonOperationAccess().getClearParserRuleCall_4()); 

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
    // $ANTLR end "rule__JsonOperation__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalMyDsl.g:441:1: rule__Value__Alternatives : ( ( ruleJson ) | ( ruleJString ) | ( ruleJArray ) | ( ruleJBoolean ) | ( ruleNull ) | ( ruleJNumber ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:445:1: ( ( ruleJson ) | ( ruleJString ) | ( ruleJArray ) | ( ruleJBoolean ) | ( ruleNull ) | ( ruleJNumber ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_LEFT_BRACE:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
                {
                alt2=2;
                }
                break;
            case RULE_LEFT_BRACKET:
                {
                alt2=3;
                }
                break;
            case 17:
            case 18:
                {
                alt2=4;
                }
                break;
            case 30:
                {
                alt2=5;
                }
                break;
            case RULE_INT:
            case 21:
            case 22:
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
                    // InternalMyDsl.g:446:2: ( ruleJson )
                    {
                    // InternalMyDsl.g:446:2: ( ruleJson )
                    // InternalMyDsl.g:447:3: ruleJson
                    {
                     before(grammarAccess.getValueAccess().getJsonParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJson();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getJsonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:452:2: ( ruleJString )
                    {
                    // InternalMyDsl.g:452:2: ( ruleJString )
                    // InternalMyDsl.g:453:3: ruleJString
                    {
                     before(grammarAccess.getValueAccess().getJStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJString();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getJStringParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:458:2: ( ruleJArray )
                    {
                    // InternalMyDsl.g:458:2: ( ruleJArray )
                    // InternalMyDsl.g:459:3: ruleJArray
                    {
                     before(grammarAccess.getValueAccess().getJArrayParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleJArray();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getJArrayParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:464:2: ( ruleJBoolean )
                    {
                    // InternalMyDsl.g:464:2: ( ruleJBoolean )
                    // InternalMyDsl.g:465:3: ruleJBoolean
                    {
                     before(grammarAccess.getValueAccess().getJBooleanParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleJBoolean();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getJBooleanParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:470:2: ( ruleNull )
                    {
                    // InternalMyDsl.g:470:2: ( ruleNull )
                    // InternalMyDsl.g:471:3: ruleNull
                    {
                     before(grammarAccess.getValueAccess().getNullParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNull();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNullParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:476:2: ( ruleJNumber )
                    {
                    // InternalMyDsl.g:476:2: ( ruleJNumber )
                    // InternalMyDsl.g:477:3: ruleJNumber
                    {
                     before(grammarAccess.getValueAccess().getJNumberParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleJNumber();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getJNumberParserRuleCall_5()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__JBoolean__ValAlternatives_0"
    // InternalMyDsl.g:486:1: rule__JBoolean__ValAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__JBoolean__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:490:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:491:2: ( 'true' )
                    {
                    // InternalMyDsl.g:491:2: ( 'true' )
                    // InternalMyDsl.g:492:3: 'true'
                    {
                     before(grammarAccess.getJBooleanAccess().getValTrueKeyword_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getJBooleanAccess().getValTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:497:2: ( 'false' )
                    {
                    // InternalMyDsl.g:497:2: ( 'false' )
                    // InternalMyDsl.g:498:3: 'false'
                    {
                     before(grammarAccess.getJBooleanAccess().getValFalseKeyword_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getJBooleanAccess().getValFalseKeyword_0_1()); 

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
    // $ANTLR end "rule__JBoolean__ValAlternatives_0"


    // $ANTLR start "rule__JNumber__Alternatives_5_0"
    // InternalMyDsl.g:507:1: rule__JNumber__Alternatives_5_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__JNumber__Alternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:511:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:512:2: ( 'E' )
                    {
                    // InternalMyDsl.g:512:2: ( 'E' )
                    // InternalMyDsl.g:513:3: 'E'
                    {
                     before(grammarAccess.getJNumberAccess().getEKeyword_5_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getJNumberAccess().getEKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:518:2: ( 'e' )
                    {
                    // InternalMyDsl.g:518:2: ( 'e' )
                    // InternalMyDsl.g:519:3: 'e'
                    {
                     before(grammarAccess.getJNumberAccess().getEKeyword_5_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getJNumberAccess().getEKeyword_5_0_1()); 

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
    // $ANTLR end "rule__JNumber__Alternatives_5_0"


    // $ANTLR start "rule__Json__Group__0"
    // InternalMyDsl.g:528:1: rule__Json__Group__0 : rule__Json__Group__0__Impl rule__Json__Group__1 ;
    public final void rule__Json__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:532:1: ( rule__Json__Group__0__Impl rule__Json__Group__1 )
            // InternalMyDsl.g:533:2: rule__Json__Group__0__Impl rule__Json__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Json__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Json__Group__1();

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
    // $ANTLR end "rule__Json__Group__0"


    // $ANTLR start "rule__Json__Group__0__Impl"
    // InternalMyDsl.g:540:1: rule__Json__Group__0__Impl : ( () ) ;
    public final void rule__Json__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:544:1: ( ( () ) )
            // InternalMyDsl.g:545:1: ( () )
            {
            // InternalMyDsl.g:545:1: ( () )
            // InternalMyDsl.g:546:2: ()
            {
             before(grammarAccess.getJsonAccess().getJsonAction_0()); 
            // InternalMyDsl.g:547:2: ()
            // InternalMyDsl.g:547:3: 
            {
            }

             after(grammarAccess.getJsonAccess().getJsonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Json__Group__0__Impl"


    // $ANTLR start "rule__Json__Group__1"
    // InternalMyDsl.g:555:1: rule__Json__Group__1 : rule__Json__Group__1__Impl rule__Json__Group__2 ;
    public final void rule__Json__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:559:1: ( rule__Json__Group__1__Impl rule__Json__Group__2 )
            // InternalMyDsl.g:560:2: rule__Json__Group__1__Impl rule__Json__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Json__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Json__Group__2();

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
    // $ANTLR end "rule__Json__Group__1"


    // $ANTLR start "rule__Json__Group__1__Impl"
    // InternalMyDsl.g:567:1: rule__Json__Group__1__Impl : ( RULE_LEFT_BRACE ) ;
    public final void rule__Json__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( ( RULE_LEFT_BRACE ) )
            // InternalMyDsl.g:572:1: ( RULE_LEFT_BRACE )
            {
            // InternalMyDsl.g:572:1: ( RULE_LEFT_BRACE )
            // InternalMyDsl.g:573:2: RULE_LEFT_BRACE
            {
             before(grammarAccess.getJsonAccess().getLEFT_BRACETerminalRuleCall_1()); 
            match(input,RULE_LEFT_BRACE,FOLLOW_2); 
             after(grammarAccess.getJsonAccess().getLEFT_BRACETerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Json__Group__1__Impl"


    // $ANTLR start "rule__Json__Group__2"
    // InternalMyDsl.g:582:1: rule__Json__Group__2 : rule__Json__Group__2__Impl rule__Json__Group__3 ;
    public final void rule__Json__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:586:1: ( rule__Json__Group__2__Impl rule__Json__Group__3 )
            // InternalMyDsl.g:587:2: rule__Json__Group__2__Impl rule__Json__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Json__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Json__Group__3();

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
    // $ANTLR end "rule__Json__Group__2"


    // $ANTLR start "rule__Json__Group__2__Impl"
    // InternalMyDsl.g:594:1: rule__Json__Group__2__Impl : ( ( rule__Json__PairsAssignment_2 )? ) ;
    public final void rule__Json__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( ( ( rule__Json__PairsAssignment_2 )? ) )
            // InternalMyDsl.g:599:1: ( ( rule__Json__PairsAssignment_2 )? )
            {
            // InternalMyDsl.g:599:1: ( ( rule__Json__PairsAssignment_2 )? )
            // InternalMyDsl.g:600:2: ( rule__Json__PairsAssignment_2 )?
            {
             before(grammarAccess.getJsonAccess().getPairsAssignment_2()); 
            // InternalMyDsl.g:601:2: ( rule__Json__PairsAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:601:3: rule__Json__PairsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Json__PairsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJsonAccess().getPairsAssignment_2()); 

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
    // $ANTLR end "rule__Json__Group__2__Impl"


    // $ANTLR start "rule__Json__Group__3"
    // InternalMyDsl.g:609:1: rule__Json__Group__3 : rule__Json__Group__3__Impl rule__Json__Group__4 ;
    public final void rule__Json__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:613:1: ( rule__Json__Group__3__Impl rule__Json__Group__4 )
            // InternalMyDsl.g:614:2: rule__Json__Group__3__Impl rule__Json__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Json__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Json__Group__4();

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
    // $ANTLR end "rule__Json__Group__3"


    // $ANTLR start "rule__Json__Group__3__Impl"
    // InternalMyDsl.g:621:1: rule__Json__Group__3__Impl : ( ( rule__Json__Group_3__0 )* ) ;
    public final void rule__Json__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:625:1: ( ( ( rule__Json__Group_3__0 )* ) )
            // InternalMyDsl.g:626:1: ( ( rule__Json__Group_3__0 )* )
            {
            // InternalMyDsl.g:626:1: ( ( rule__Json__Group_3__0 )* )
            // InternalMyDsl.g:627:2: ( rule__Json__Group_3__0 )*
            {
             before(grammarAccess.getJsonAccess().getGroup_3()); 
            // InternalMyDsl.g:628:2: ( rule__Json__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_PAIR_SEPARATION) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:628:3: rule__Json__Group_3__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Json__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getJsonAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Json__Group__3__Impl"


    // $ANTLR start "rule__Json__Group__4"
    // InternalMyDsl.g:636:1: rule__Json__Group__4 : rule__Json__Group__4__Impl rule__Json__Group__5 ;
    public final void rule__Json__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:640:1: ( rule__Json__Group__4__Impl rule__Json__Group__5 )
            // InternalMyDsl.g:641:2: rule__Json__Group__4__Impl rule__Json__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Json__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Json__Group__5();

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
    // $ANTLR end "rule__Json__Group__4"


    // $ANTLR start "rule__Json__Group__4__Impl"
    // InternalMyDsl.g:648:1: rule__Json__Group__4__Impl : ( RULE_RIGHT_BRACE ) ;
    public final void rule__Json__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:652:1: ( ( RULE_RIGHT_BRACE ) )
            // InternalMyDsl.g:653:1: ( RULE_RIGHT_BRACE )
            {
            // InternalMyDsl.g:653:1: ( RULE_RIGHT_BRACE )
            // InternalMyDsl.g:654:2: RULE_RIGHT_BRACE
            {
             before(grammarAccess.getJsonAccess().getRIGHT_BRACETerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACE,FOLLOW_2); 
             after(grammarAccess.getJsonAccess().getRIGHT_BRACETerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Json__Group__4__Impl"


    // $ANTLR start "rule__Json__Group__5"
    // InternalMyDsl.g:663:1: rule__Json__Group__5 : rule__Json__Group__5__Impl ;
    public final void rule__Json__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:667:1: ( rule__Json__Group__5__Impl )
            // InternalMyDsl.g:668:2: rule__Json__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Json__Group__5__Impl();

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
    // $ANTLR end "rule__Json__Group__5"


    // $ANTLR start "rule__Json__Group__5__Impl"
    // InternalMyDsl.g:674:1: rule__Json__Group__5__Impl : ( ( rule__Json__OperationsAssignment_5 )* ) ;
    public final void rule__Json__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:678:1: ( ( ( rule__Json__OperationsAssignment_5 )* ) )
            // InternalMyDsl.g:679:1: ( ( rule__Json__OperationsAssignment_5 )* )
            {
            // InternalMyDsl.g:679:1: ( ( rule__Json__OperationsAssignment_5 )* )
            // InternalMyDsl.g:680:2: ( rule__Json__OperationsAssignment_5 )*
            {
             before(grammarAccess.getJsonAccess().getOperationsAssignment_5()); 
            // InternalMyDsl.g:681:2: ( rule__Json__OperationsAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23||LA7_0==25||(LA7_0>=27 && LA7_0<=29)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:681:3: rule__Json__OperationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Json__OperationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getJsonAccess().getOperationsAssignment_5()); 

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
    // $ANTLR end "rule__Json__Group__5__Impl"


    // $ANTLR start "rule__Json__Group_3__0"
    // InternalMyDsl.g:690:1: rule__Json__Group_3__0 : rule__Json__Group_3__0__Impl rule__Json__Group_3__1 ;
    public final void rule__Json__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:694:1: ( rule__Json__Group_3__0__Impl rule__Json__Group_3__1 )
            // InternalMyDsl.g:695:2: rule__Json__Group_3__0__Impl rule__Json__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Json__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Json__Group_3__1();

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
    // $ANTLR end "rule__Json__Group_3__0"


    // $ANTLR start "rule__Json__Group_3__0__Impl"
    // InternalMyDsl.g:702:1: rule__Json__Group_3__0__Impl : ( RULE_PAIR_SEPARATION ) ;
    public final void rule__Json__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( ( RULE_PAIR_SEPARATION ) )
            // InternalMyDsl.g:707:1: ( RULE_PAIR_SEPARATION )
            {
            // InternalMyDsl.g:707:1: ( RULE_PAIR_SEPARATION )
            // InternalMyDsl.g:708:2: RULE_PAIR_SEPARATION
            {
             before(grammarAccess.getJsonAccess().getPAIR_SEPARATIONTerminalRuleCall_3_0()); 
            match(input,RULE_PAIR_SEPARATION,FOLLOW_2); 
             after(grammarAccess.getJsonAccess().getPAIR_SEPARATIONTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Json__Group_3__0__Impl"


    // $ANTLR start "rule__Json__Group_3__1"
    // InternalMyDsl.g:717:1: rule__Json__Group_3__1 : rule__Json__Group_3__1__Impl ;
    public final void rule__Json__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:721:1: ( rule__Json__Group_3__1__Impl )
            // InternalMyDsl.g:722:2: rule__Json__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Json__Group_3__1__Impl();

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
    // $ANTLR end "rule__Json__Group_3__1"


    // $ANTLR start "rule__Json__Group_3__1__Impl"
    // InternalMyDsl.g:728:1: rule__Json__Group_3__1__Impl : ( ( rule__Json__PairsAssignment_3_1 ) ) ;
    public final void rule__Json__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:732:1: ( ( ( rule__Json__PairsAssignment_3_1 ) ) )
            // InternalMyDsl.g:733:1: ( ( rule__Json__PairsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:733:1: ( ( rule__Json__PairsAssignment_3_1 ) )
            // InternalMyDsl.g:734:2: ( rule__Json__PairsAssignment_3_1 )
            {
             before(grammarAccess.getJsonAccess().getPairsAssignment_3_1()); 
            // InternalMyDsl.g:735:2: ( rule__Json__PairsAssignment_3_1 )
            // InternalMyDsl.g:735:3: rule__Json__PairsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Json__PairsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonAccess().getPairsAssignment_3_1()); 

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
    // $ANTLR end "rule__Json__Group_3__1__Impl"


    // $ANTLR start "rule__Pair__Group__0"
    // InternalMyDsl.g:744:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // InternalMyDsl.g:749:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Pair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__1();

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
    // $ANTLR end "rule__Pair__Group__0"


    // $ANTLR start "rule__Pair__Group__0__Impl"
    // InternalMyDsl.g:756:1: rule__Pair__Group__0__Impl : ( ( rule__Pair__KeyAssignment_0 ) ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:760:1: ( ( ( rule__Pair__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:761:1: ( ( rule__Pair__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:761:1: ( ( rule__Pair__KeyAssignment_0 ) )
            // InternalMyDsl.g:762:2: ( rule__Pair__KeyAssignment_0 )
            {
             before(grammarAccess.getPairAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:763:2: ( rule__Pair__KeyAssignment_0 )
            // InternalMyDsl.g:763:3: rule__Pair__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Pair__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getKeyAssignment_0()); 

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
    // $ANTLR end "rule__Pair__Group__0__Impl"


    // $ANTLR start "rule__Pair__Group__1"
    // InternalMyDsl.g:771:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:775:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // InternalMyDsl.g:776:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Pair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__2();

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
    // $ANTLR end "rule__Pair__Group__1"


    // $ANTLR start "rule__Pair__Group__1__Impl"
    // InternalMyDsl.g:783:1: rule__Pair__Group__1__Impl : ( RULE_COLON_SEPARATION ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:787:1: ( ( RULE_COLON_SEPARATION ) )
            // InternalMyDsl.g:788:1: ( RULE_COLON_SEPARATION )
            {
            // InternalMyDsl.g:788:1: ( RULE_COLON_SEPARATION )
            // InternalMyDsl.g:789:2: RULE_COLON_SEPARATION
            {
             before(grammarAccess.getPairAccess().getCOLON_SEPARATIONTerminalRuleCall_1()); 
            match(input,RULE_COLON_SEPARATION,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getCOLON_SEPARATIONTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Pair__Group__1__Impl"


    // $ANTLR start "rule__Pair__Group__2"
    // InternalMyDsl.g:798:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:802:1: ( rule__Pair__Group__2__Impl )
            // InternalMyDsl.g:803:2: rule__Pair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pair__Group__2__Impl();

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
    // $ANTLR end "rule__Pair__Group__2"


    // $ANTLR start "rule__Pair__Group__2__Impl"
    // InternalMyDsl.g:809:1: rule__Pair__Group__2__Impl : ( ( rule__Pair__ValueAssignment_2 ) ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:813:1: ( ( ( rule__Pair__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:814:1: ( ( rule__Pair__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:814:1: ( ( rule__Pair__ValueAssignment_2 ) )
            // InternalMyDsl.g:815:2: ( rule__Pair__ValueAssignment_2 )
            {
             before(grammarAccess.getPairAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:816:2: ( rule__Pair__ValueAssignment_2 )
            // InternalMyDsl.g:816:3: rule__Pair__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pair__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Pair__Group__2__Impl"


    // $ANTLR start "rule__JArray__Group__0"
    // InternalMyDsl.g:825:1: rule__JArray__Group__0 : rule__JArray__Group__0__Impl rule__JArray__Group__1 ;
    public final void rule__JArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:829:1: ( rule__JArray__Group__0__Impl rule__JArray__Group__1 )
            // InternalMyDsl.g:830:2: rule__JArray__Group__0__Impl rule__JArray__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__JArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JArray__Group__1();

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
    // $ANTLR end "rule__JArray__Group__0"


    // $ANTLR start "rule__JArray__Group__0__Impl"
    // InternalMyDsl.g:837:1: rule__JArray__Group__0__Impl : ( () ) ;
    public final void rule__JArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( ( () ) )
            // InternalMyDsl.g:842:1: ( () )
            {
            // InternalMyDsl.g:842:1: ( () )
            // InternalMyDsl.g:843:2: ()
            {
             before(grammarAccess.getJArrayAccess().getJArrayAction_0()); 
            // InternalMyDsl.g:844:2: ()
            // InternalMyDsl.g:844:3: 
            {
            }

             after(grammarAccess.getJArrayAccess().getJArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group__0__Impl"


    // $ANTLR start "rule__JArray__Group__1"
    // InternalMyDsl.g:852:1: rule__JArray__Group__1 : rule__JArray__Group__1__Impl rule__JArray__Group__2 ;
    public final void rule__JArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:856:1: ( rule__JArray__Group__1__Impl rule__JArray__Group__2 )
            // InternalMyDsl.g:857:2: rule__JArray__Group__1__Impl rule__JArray__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__JArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JArray__Group__2();

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
    // $ANTLR end "rule__JArray__Group__1"


    // $ANTLR start "rule__JArray__Group__1__Impl"
    // InternalMyDsl.g:864:1: rule__JArray__Group__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__JArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalMyDsl.g:869:1: ( RULE_LEFT_BRACKET )
            {
            // InternalMyDsl.g:869:1: ( RULE_LEFT_BRACKET )
            // InternalMyDsl.g:870:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getJArrayAccess().getLEFT_BRACKETTerminalRuleCall_1()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getJArrayAccess().getLEFT_BRACKETTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__JArray__Group__1__Impl"


    // $ANTLR start "rule__JArray__Group__2"
    // InternalMyDsl.g:879:1: rule__JArray__Group__2 : rule__JArray__Group__2__Impl rule__JArray__Group__3 ;
    public final void rule__JArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( rule__JArray__Group__2__Impl rule__JArray__Group__3 )
            // InternalMyDsl.g:884:2: rule__JArray__Group__2__Impl rule__JArray__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__JArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JArray__Group__3();

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
    // $ANTLR end "rule__JArray__Group__2"


    // $ANTLR start "rule__JArray__Group__2__Impl"
    // InternalMyDsl.g:891:1: rule__JArray__Group__2__Impl : ( ( rule__JArray__ValuesAssignment_2 )? ) ;
    public final void rule__JArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:895:1: ( ( ( rule__JArray__ValuesAssignment_2 )? ) )
            // InternalMyDsl.g:896:1: ( ( rule__JArray__ValuesAssignment_2 )? )
            {
            // InternalMyDsl.g:896:1: ( ( rule__JArray__ValuesAssignment_2 )? )
            // InternalMyDsl.g:897:2: ( rule__JArray__ValuesAssignment_2 )?
            {
             before(grammarAccess.getJArrayAccess().getValuesAssignment_2()); 
            // InternalMyDsl.g:898:2: ( rule__JArray__ValuesAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_LEFT_BRACE||LA8_0==RULE_LEFT_BRACKET||(LA8_0>=RULE_INT && LA8_0<=RULE_STRING)||(LA8_0>=17 && LA8_0<=18)||(LA8_0>=21 && LA8_0<=22)||LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:898:3: rule__JArray__ValuesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__JArray__ValuesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJArrayAccess().getValuesAssignment_2()); 

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
    // $ANTLR end "rule__JArray__Group__2__Impl"


    // $ANTLR start "rule__JArray__Group__3"
    // InternalMyDsl.g:906:1: rule__JArray__Group__3 : rule__JArray__Group__3__Impl rule__JArray__Group__4 ;
    public final void rule__JArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:910:1: ( rule__JArray__Group__3__Impl rule__JArray__Group__4 )
            // InternalMyDsl.g:911:2: rule__JArray__Group__3__Impl rule__JArray__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__JArray__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JArray__Group__4();

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
    // $ANTLR end "rule__JArray__Group__3"


    // $ANTLR start "rule__JArray__Group__3__Impl"
    // InternalMyDsl.g:918:1: rule__JArray__Group__3__Impl : ( ( rule__JArray__Group_3__0 )* ) ;
    public final void rule__JArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:922:1: ( ( ( rule__JArray__Group_3__0 )* ) )
            // InternalMyDsl.g:923:1: ( ( rule__JArray__Group_3__0 )* )
            {
            // InternalMyDsl.g:923:1: ( ( rule__JArray__Group_3__0 )* )
            // InternalMyDsl.g:924:2: ( rule__JArray__Group_3__0 )*
            {
             before(grammarAccess.getJArrayAccess().getGroup_3()); 
            // InternalMyDsl.g:925:2: ( rule__JArray__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_PAIR_SEPARATION) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:925:3: rule__JArray__Group_3__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__JArray__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getJArrayAccess().getGroup_3()); 

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
    // $ANTLR end "rule__JArray__Group__3__Impl"


    // $ANTLR start "rule__JArray__Group__4"
    // InternalMyDsl.g:933:1: rule__JArray__Group__4 : rule__JArray__Group__4__Impl ;
    public final void rule__JArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:937:1: ( rule__JArray__Group__4__Impl )
            // InternalMyDsl.g:938:2: rule__JArray__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JArray__Group__4__Impl();

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
    // $ANTLR end "rule__JArray__Group__4"


    // $ANTLR start "rule__JArray__Group__4__Impl"
    // InternalMyDsl.g:944:1: rule__JArray__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__JArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:948:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalMyDsl.g:949:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalMyDsl.g:949:1: ( RULE_RIGHT_BRACKET )
            // InternalMyDsl.g:950:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getJArrayAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getJArrayAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__JArray__Group__4__Impl"


    // $ANTLR start "rule__JArray__Group_3__0"
    // InternalMyDsl.g:960:1: rule__JArray__Group_3__0 : rule__JArray__Group_3__0__Impl rule__JArray__Group_3__1 ;
    public final void rule__JArray__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:964:1: ( rule__JArray__Group_3__0__Impl rule__JArray__Group_3__1 )
            // InternalMyDsl.g:965:2: rule__JArray__Group_3__0__Impl rule__JArray__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__JArray__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JArray__Group_3__1();

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
    // $ANTLR end "rule__JArray__Group_3__0"


    // $ANTLR start "rule__JArray__Group_3__0__Impl"
    // InternalMyDsl.g:972:1: rule__JArray__Group_3__0__Impl : ( RULE_PAIR_SEPARATION ) ;
    public final void rule__JArray__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:976:1: ( ( RULE_PAIR_SEPARATION ) )
            // InternalMyDsl.g:977:1: ( RULE_PAIR_SEPARATION )
            {
            // InternalMyDsl.g:977:1: ( RULE_PAIR_SEPARATION )
            // InternalMyDsl.g:978:2: RULE_PAIR_SEPARATION
            {
             before(grammarAccess.getJArrayAccess().getPAIR_SEPARATIONTerminalRuleCall_3_0()); 
            match(input,RULE_PAIR_SEPARATION,FOLLOW_2); 
             after(grammarAccess.getJArrayAccess().getPAIR_SEPARATIONTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__JArray__Group_3__0__Impl"


    // $ANTLR start "rule__JArray__Group_3__1"
    // InternalMyDsl.g:987:1: rule__JArray__Group_3__1 : rule__JArray__Group_3__1__Impl ;
    public final void rule__JArray__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:1: ( rule__JArray__Group_3__1__Impl )
            // InternalMyDsl.g:992:2: rule__JArray__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JArray__Group_3__1__Impl();

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
    // $ANTLR end "rule__JArray__Group_3__1"


    // $ANTLR start "rule__JArray__Group_3__1__Impl"
    // InternalMyDsl.g:998:1: rule__JArray__Group_3__1__Impl : ( ( rule__JArray__ValuesAssignment_3_1 ) ) ;
    public final void rule__JArray__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1002:1: ( ( ( rule__JArray__ValuesAssignment_3_1 ) ) )
            // InternalMyDsl.g:1003:1: ( ( rule__JArray__ValuesAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1003:1: ( ( rule__JArray__ValuesAssignment_3_1 ) )
            // InternalMyDsl.g:1004:2: ( rule__JArray__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getJArrayAccess().getValuesAssignment_3_1()); 
            // InternalMyDsl.g:1005:2: ( rule__JArray__ValuesAssignment_3_1 )
            // InternalMyDsl.g:1005:3: rule__JArray__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__JArray__ValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getJArrayAccess().getValuesAssignment_3_1()); 

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
    // $ANTLR end "rule__JArray__Group_3__1__Impl"


    // $ANTLR start "rule__JNumber__Group__0"
    // InternalMyDsl.g:1014:1: rule__JNumber__Group__0 : rule__JNumber__Group__0__Impl rule__JNumber__Group__1 ;
    public final void rule__JNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1018:1: ( rule__JNumber__Group__0__Impl rule__JNumber__Group__1 )
            // InternalMyDsl.g:1019:2: rule__JNumber__Group__0__Impl rule__JNumber__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__JNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JNumber__Group__1();

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
    // $ANTLR end "rule__JNumber__Group__0"


    // $ANTLR start "rule__JNumber__Group__0__Impl"
    // InternalMyDsl.g:1026:1: rule__JNumber__Group__0__Impl : ( () ) ;
    public final void rule__JNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( ( () ) )
            // InternalMyDsl.g:1031:1: ( () )
            {
            // InternalMyDsl.g:1031:1: ( () )
            // InternalMyDsl.g:1032:2: ()
            {
             before(grammarAccess.getJNumberAccess().getJNumberAction_0()); 
            // InternalMyDsl.g:1033:2: ()
            // InternalMyDsl.g:1033:3: 
            {
            }

             after(grammarAccess.getJNumberAccess().getJNumberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JNumber__Group__0__Impl"


    // $ANTLR start "rule__JNumber__Group__1"
    // InternalMyDsl.g:1041:1: rule__JNumber__Group__1 : rule__JNumber__Group__1__Impl rule__JNumber__Group__2 ;
    public final void rule__JNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1045:1: ( rule__JNumber__Group__1__Impl rule__JNumber__Group__2 )
            // InternalMyDsl.g:1046:2: rule__JNumber__Group__1__Impl rule__JNumber__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__JNumber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JNumber__Group__2();

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
    // $ANTLR end "rule__JNumber__Group__1"


    // $ANTLR start "rule__JNumber__Group__1__Impl"
    // InternalMyDsl.g:1053:1: rule__JNumber__Group__1__Impl : ( ( '-' )? ) ;
    public final void rule__JNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1058:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1058:1: ( ( '-' )? )
            // InternalMyDsl.g:1059:2: ( '-' )?
            {
             before(grammarAccess.getJNumberAccess().getHyphenMinusKeyword_1()); 
            // InternalMyDsl.g:1060:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1060:3: '-'
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJNumberAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__JNumber__Group__1__Impl"


    // $ANTLR start "rule__JNumber__Group__2"
    // InternalMyDsl.g:1068:1: rule__JNumber__Group__2 : rule__JNumber__Group__2__Impl rule__JNumber__Group__3 ;
    public final void rule__JNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1072:1: ( rule__JNumber__Group__2__Impl rule__JNumber__Group__3 )
            // InternalMyDsl.g:1073:2: rule__JNumber__Group__2__Impl rule__JNumber__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__JNumber__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JNumber__Group__3();

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
    // $ANTLR end "rule__JNumber__Group__2"


    // $ANTLR start "rule__JNumber__Group__2__Impl"
    // InternalMyDsl.g:1080:1: rule__JNumber__Group__2__Impl : ( ( RULE_INT )? ) ;
    public final void rule__JNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1084:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:1085:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:1085:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:1086:2: ( RULE_INT )?
            {
             before(grammarAccess.getJNumberAccess().getINTTerminalRuleCall_2()); 
            // InternalMyDsl.g:1087:2: ( RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_INT||LA11_1==22) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1087:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJNumberAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__JNumber__Group__2__Impl"


    // $ANTLR start "rule__JNumber__Group__3"
    // InternalMyDsl.g:1095:1: rule__JNumber__Group__3 : rule__JNumber__Group__3__Impl rule__JNumber__Group__4 ;
    public final void rule__JNumber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1099:1: ( rule__JNumber__Group__3__Impl rule__JNumber__Group__4 )
            // InternalMyDsl.g:1100:2: rule__JNumber__Group__3__Impl rule__JNumber__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__JNumber__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JNumber__Group__4();

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
    // $ANTLR end "rule__JNumber__Group__3"


    // $ANTLR start "rule__JNumber__Group__3__Impl"
    // InternalMyDsl.g:1107:1: rule__JNumber__Group__3__Impl : ( ( '.' )? ) ;
    public final void rule__JNumber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( ( ( '.' )? ) )
            // InternalMyDsl.g:1112:1: ( ( '.' )? )
            {
            // InternalMyDsl.g:1112:1: ( ( '.' )? )
            // InternalMyDsl.g:1113:2: ( '.' )?
            {
             before(grammarAccess.getJNumberAccess().getFullStopKeyword_3()); 
            // InternalMyDsl.g:1114:2: ( '.' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1114:3: '.'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJNumberAccess().getFullStopKeyword_3()); 

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
    // $ANTLR end "rule__JNumber__Group__3__Impl"


    // $ANTLR start "rule__JNumber__Group__4"
    // InternalMyDsl.g:1122:1: rule__JNumber__Group__4 : rule__JNumber__Group__4__Impl rule__JNumber__Group__5 ;
    public final void rule__JNumber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1126:1: ( rule__JNumber__Group__4__Impl rule__JNumber__Group__5 )
            // InternalMyDsl.g:1127:2: rule__JNumber__Group__4__Impl rule__JNumber__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__JNumber__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JNumber__Group__5();

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
    // $ANTLR end "rule__JNumber__Group__4"


    // $ANTLR start "rule__JNumber__Group__4__Impl"
    // InternalMyDsl.g:1134:1: rule__JNumber__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__JNumber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1139:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1139:1: ( RULE_INT )
            // InternalMyDsl.g:1140:2: RULE_INT
            {
             before(grammarAccess.getJNumberAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getJNumberAccess().getINTTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__JNumber__Group__4__Impl"


    // $ANTLR start "rule__JNumber__Group__5"
    // InternalMyDsl.g:1149:1: rule__JNumber__Group__5 : rule__JNumber__Group__5__Impl ;
    public final void rule__JNumber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1153:1: ( rule__JNumber__Group__5__Impl )
            // InternalMyDsl.g:1154:2: rule__JNumber__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JNumber__Group__5__Impl();

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
    // $ANTLR end "rule__JNumber__Group__5"


    // $ANTLR start "rule__JNumber__Group__5__Impl"
    // InternalMyDsl.g:1160:1: rule__JNumber__Group__5__Impl : ( ( rule__JNumber__Group_5__0 )? ) ;
    public final void rule__JNumber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1164:1: ( ( ( rule__JNumber__Group_5__0 )? ) )
            // InternalMyDsl.g:1165:1: ( ( rule__JNumber__Group_5__0 )? )
            {
            // InternalMyDsl.g:1165:1: ( ( rule__JNumber__Group_5__0 )? )
            // InternalMyDsl.g:1166:2: ( rule__JNumber__Group_5__0 )?
            {
             before(grammarAccess.getJNumberAccess().getGroup_5()); 
            // InternalMyDsl.g:1167:2: ( rule__JNumber__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=19 && LA13_0<=20)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1167:3: rule__JNumber__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JNumber__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJNumberAccess().getGroup_5()); 

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
    // $ANTLR end "rule__JNumber__Group__5__Impl"


    // $ANTLR start "rule__JNumber__Group_5__0"
    // InternalMyDsl.g:1176:1: rule__JNumber__Group_5__0 : rule__JNumber__Group_5__0__Impl rule__JNumber__Group_5__1 ;
    public final void rule__JNumber__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1180:1: ( rule__JNumber__Group_5__0__Impl rule__JNumber__Group_5__1 )
            // InternalMyDsl.g:1181:2: rule__JNumber__Group_5__0__Impl rule__JNumber__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__JNumber__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JNumber__Group_5__1();

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
    // $ANTLR end "rule__JNumber__Group_5__0"


    // $ANTLR start "rule__JNumber__Group_5__0__Impl"
    // InternalMyDsl.g:1188:1: rule__JNumber__Group_5__0__Impl : ( ( rule__JNumber__Alternatives_5_0 ) ) ;
    public final void rule__JNumber__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( ( ( rule__JNumber__Alternatives_5_0 ) ) )
            // InternalMyDsl.g:1193:1: ( ( rule__JNumber__Alternatives_5_0 ) )
            {
            // InternalMyDsl.g:1193:1: ( ( rule__JNumber__Alternatives_5_0 ) )
            // InternalMyDsl.g:1194:2: ( rule__JNumber__Alternatives_5_0 )
            {
             before(grammarAccess.getJNumberAccess().getAlternatives_5_0()); 
            // InternalMyDsl.g:1195:2: ( rule__JNumber__Alternatives_5_0 )
            // InternalMyDsl.g:1195:3: rule__JNumber__Alternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__JNumber__Alternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getJNumberAccess().getAlternatives_5_0()); 

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
    // $ANTLR end "rule__JNumber__Group_5__0__Impl"


    // $ANTLR start "rule__JNumber__Group_5__1"
    // InternalMyDsl.g:1203:1: rule__JNumber__Group_5__1 : rule__JNumber__Group_5__1__Impl rule__JNumber__Group_5__2 ;
    public final void rule__JNumber__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1207:1: ( rule__JNumber__Group_5__1__Impl rule__JNumber__Group_5__2 )
            // InternalMyDsl.g:1208:2: rule__JNumber__Group_5__1__Impl rule__JNumber__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__JNumber__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JNumber__Group_5__2();

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
    // $ANTLR end "rule__JNumber__Group_5__1"


    // $ANTLR start "rule__JNumber__Group_5__1__Impl"
    // InternalMyDsl.g:1215:1: rule__JNumber__Group_5__1__Impl : ( ( '-' )? ) ;
    public final void rule__JNumber__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1220:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1220:1: ( ( '-' )? )
            // InternalMyDsl.g:1221:2: ( '-' )?
            {
             before(grammarAccess.getJNumberAccess().getHyphenMinusKeyword_5_1()); 
            // InternalMyDsl.g:1222:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1222:3: '-'
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJNumberAccess().getHyphenMinusKeyword_5_1()); 

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
    // $ANTLR end "rule__JNumber__Group_5__1__Impl"


    // $ANTLR start "rule__JNumber__Group_5__2"
    // InternalMyDsl.g:1230:1: rule__JNumber__Group_5__2 : rule__JNumber__Group_5__2__Impl ;
    public final void rule__JNumber__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1234:1: ( rule__JNumber__Group_5__2__Impl )
            // InternalMyDsl.g:1235:2: rule__JNumber__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JNumber__Group_5__2__Impl();

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
    // $ANTLR end "rule__JNumber__Group_5__2"


    // $ANTLR start "rule__JNumber__Group_5__2__Impl"
    // InternalMyDsl.g:1241:1: rule__JNumber__Group_5__2__Impl : ( RULE_INT ) ;
    public final void rule__JNumber__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1245:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1246:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1246:1: ( RULE_INT )
            // InternalMyDsl.g:1247:2: RULE_INT
            {
             before(grammarAccess.getJNumberAccess().getINTTerminalRuleCall_5_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getJNumberAccess().getINTTerminalRuleCall_5_2()); 

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
    // $ANTLR end "rule__JNumber__Group_5__2__Impl"


    // $ANTLR start "rule__Fichier__Group__0"
    // InternalMyDsl.g:1257:1: rule__Fichier__Group__0 : rule__Fichier__Group__0__Impl rule__Fichier__Group__1 ;
    public final void rule__Fichier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1261:1: ( rule__Fichier__Group__0__Impl rule__Fichier__Group__1 )
            // InternalMyDsl.g:1262:2: rule__Fichier__Group__0__Impl rule__Fichier__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Fichier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fichier__Group__1();

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
    // $ANTLR end "rule__Fichier__Group__0"


    // $ANTLR start "rule__Fichier__Group__0__Impl"
    // InternalMyDsl.g:1269:1: rule__Fichier__Group__0__Impl : ( 'file' ) ;
    public final void rule__Fichier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( ( 'file' ) )
            // InternalMyDsl.g:1274:1: ( 'file' )
            {
            // InternalMyDsl.g:1274:1: ( 'file' )
            // InternalMyDsl.g:1275:2: 'file'
            {
             before(grammarAccess.getFichierAccess().getFileKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFichierAccess().getFileKeyword_0()); 

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
    // $ANTLR end "rule__Fichier__Group__0__Impl"


    // $ANTLR start "rule__Fichier__Group__1"
    // InternalMyDsl.g:1284:1: rule__Fichier__Group__1 : rule__Fichier__Group__1__Impl rule__Fichier__Group__2 ;
    public final void rule__Fichier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( rule__Fichier__Group__1__Impl rule__Fichier__Group__2 )
            // InternalMyDsl.g:1289:2: rule__Fichier__Group__1__Impl rule__Fichier__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Fichier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fichier__Group__2();

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
    // $ANTLR end "rule__Fichier__Group__1"


    // $ANTLR start "rule__Fichier__Group__1__Impl"
    // InternalMyDsl.g:1296:1: rule__Fichier__Group__1__Impl : ( ( rule__Fichier__FileIDAssignment_1 ) ) ;
    public final void rule__Fichier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1300:1: ( ( ( rule__Fichier__FileIDAssignment_1 ) ) )
            // InternalMyDsl.g:1301:1: ( ( rule__Fichier__FileIDAssignment_1 ) )
            {
            // InternalMyDsl.g:1301:1: ( ( rule__Fichier__FileIDAssignment_1 ) )
            // InternalMyDsl.g:1302:2: ( rule__Fichier__FileIDAssignment_1 )
            {
             before(grammarAccess.getFichierAccess().getFileIDAssignment_1()); 
            // InternalMyDsl.g:1303:2: ( rule__Fichier__FileIDAssignment_1 )
            // InternalMyDsl.g:1303:3: rule__Fichier__FileIDAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__FileIDAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFichierAccess().getFileIDAssignment_1()); 

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
    // $ANTLR end "rule__Fichier__Group__1__Impl"


    // $ANTLR start "rule__Fichier__Group__2"
    // InternalMyDsl.g:1311:1: rule__Fichier__Group__2 : rule__Fichier__Group__2__Impl rule__Fichier__Group__3 ;
    public final void rule__Fichier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( rule__Fichier__Group__2__Impl rule__Fichier__Group__3 )
            // InternalMyDsl.g:1316:2: rule__Fichier__Group__2__Impl rule__Fichier__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Fichier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fichier__Group__3();

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
    // $ANTLR end "rule__Fichier__Group__2"


    // $ANTLR start "rule__Fichier__Group__2__Impl"
    // InternalMyDsl.g:1323:1: rule__Fichier__Group__2__Impl : ( '=' ) ;
    public final void rule__Fichier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1327:1: ( ( '=' ) )
            // InternalMyDsl.g:1328:1: ( '=' )
            {
            // InternalMyDsl.g:1328:1: ( '=' )
            // InternalMyDsl.g:1329:2: '='
            {
             before(grammarAccess.getFichierAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFichierAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Fichier__Group__2__Impl"


    // $ANTLR start "rule__Fichier__Group__3"
    // InternalMyDsl.g:1338:1: rule__Fichier__Group__3 : rule__Fichier__Group__3__Impl ;
    public final void rule__Fichier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1342:1: ( rule__Fichier__Group__3__Impl )
            // InternalMyDsl.g:1343:2: rule__Fichier__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__Group__3__Impl();

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
    // $ANTLR end "rule__Fichier__Group__3"


    // $ANTLR start "rule__Fichier__Group__3__Impl"
    // InternalMyDsl.g:1349:1: rule__Fichier__Group__3__Impl : ( ( rule__Fichier__NameAssignment_3 ) ) ;
    public final void rule__Fichier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1353:1: ( ( ( rule__Fichier__NameAssignment_3 ) ) )
            // InternalMyDsl.g:1354:1: ( ( rule__Fichier__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:1354:1: ( ( rule__Fichier__NameAssignment_3 ) )
            // InternalMyDsl.g:1355:2: ( rule__Fichier__NameAssignment_3 )
            {
             before(grammarAccess.getFichierAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:1356:2: ( rule__Fichier__NameAssignment_3 )
            // InternalMyDsl.g:1356:3: rule__Fichier__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFichierAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Fichier__Group__3__Impl"


    // $ANTLR start "rule__Add__Group__0"
    // InternalMyDsl.g:1365:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1369:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalMyDsl.g:1370:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Add__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__1();

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
    // $ANTLR end "rule__Add__Group__0"


    // $ANTLR start "rule__Add__Group__0__Impl"
    // InternalMyDsl.g:1377:1: rule__Add__Group__0__Impl : ( 'add' ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1381:1: ( ( 'add' ) )
            // InternalMyDsl.g:1382:1: ( 'add' )
            {
            // InternalMyDsl.g:1382:1: ( 'add' )
            // InternalMyDsl.g:1383:2: 'add'
            {
             before(grammarAccess.getAddAccess().getAddKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getAddKeyword_0()); 

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
    // $ANTLR end "rule__Add__Group__0__Impl"


    // $ANTLR start "rule__Add__Group__1"
    // InternalMyDsl.g:1392:1: rule__Add__Group__1 : rule__Add__Group__1__Impl rule__Add__Group__2 ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1396:1: ( rule__Add__Group__1__Impl rule__Add__Group__2 )
            // InternalMyDsl.g:1397:2: rule__Add__Group__1__Impl rule__Add__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Add__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__2();

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
    // $ANTLR end "rule__Add__Group__1"


    // $ANTLR start "rule__Add__Group__1__Impl"
    // InternalMyDsl.g:1404:1: rule__Add__Group__1__Impl : ( ( rule__Add__FileIDAssignment_1 ) ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1408:1: ( ( ( rule__Add__FileIDAssignment_1 ) ) )
            // InternalMyDsl.g:1409:1: ( ( rule__Add__FileIDAssignment_1 ) )
            {
            // InternalMyDsl.g:1409:1: ( ( rule__Add__FileIDAssignment_1 ) )
            // InternalMyDsl.g:1410:2: ( rule__Add__FileIDAssignment_1 )
            {
             before(grammarAccess.getAddAccess().getFileIDAssignment_1()); 
            // InternalMyDsl.g:1411:2: ( rule__Add__FileIDAssignment_1 )
            // InternalMyDsl.g:1411:3: rule__Add__FileIDAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Add__FileIDAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getFileIDAssignment_1()); 

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
    // $ANTLR end "rule__Add__Group__1__Impl"


    // $ANTLR start "rule__Add__Group__2"
    // InternalMyDsl.g:1419:1: rule__Add__Group__2 : rule__Add__Group__2__Impl rule__Add__Group__3 ;
    public final void rule__Add__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( rule__Add__Group__2__Impl rule__Add__Group__3 )
            // InternalMyDsl.g:1424:2: rule__Add__Group__2__Impl rule__Add__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Add__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__3();

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
    // $ANTLR end "rule__Add__Group__2"


    // $ANTLR start "rule__Add__Group__2__Impl"
    // InternalMyDsl.g:1431:1: rule__Add__Group__2__Impl : ( ',' ) ;
    public final void rule__Add__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1435:1: ( ( ',' ) )
            // InternalMyDsl.g:1436:1: ( ',' )
            {
            // InternalMyDsl.g:1436:1: ( ',' )
            // InternalMyDsl.g:1437:2: ','
            {
             before(grammarAccess.getAddAccess().getCommaKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__Add__Group__2__Impl"


    // $ANTLR start "rule__Add__Group__3"
    // InternalMyDsl.g:1446:1: rule__Add__Group__3 : rule__Add__Group__3__Impl ;
    public final void rule__Add__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1450:1: ( rule__Add__Group__3__Impl )
            // InternalMyDsl.g:1451:2: rule__Add__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__3__Impl();

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
    // $ANTLR end "rule__Add__Group__3"


    // $ANTLR start "rule__Add__Group__3__Impl"
    // InternalMyDsl.g:1457:1: rule__Add__Group__3__Impl : ( ( rule__Add__PairAssignment_3 ) ) ;
    public final void rule__Add__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1461:1: ( ( ( rule__Add__PairAssignment_3 ) ) )
            // InternalMyDsl.g:1462:1: ( ( rule__Add__PairAssignment_3 ) )
            {
            // InternalMyDsl.g:1462:1: ( ( rule__Add__PairAssignment_3 ) )
            // InternalMyDsl.g:1463:2: ( rule__Add__PairAssignment_3 )
            {
             before(grammarAccess.getAddAccess().getPairAssignment_3()); 
            // InternalMyDsl.g:1464:2: ( rule__Add__PairAssignment_3 )
            // InternalMyDsl.g:1464:3: rule__Add__PairAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Add__PairAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getPairAssignment_3()); 

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
    // $ANTLR end "rule__Add__Group__3__Impl"


    // $ANTLR start "rule__Clear__Group__0"
    // InternalMyDsl.g:1473:1: rule__Clear__Group__0 : rule__Clear__Group__0__Impl rule__Clear__Group__1 ;
    public final void rule__Clear__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( rule__Clear__Group__0__Impl rule__Clear__Group__1 )
            // InternalMyDsl.g:1478:2: rule__Clear__Group__0__Impl rule__Clear__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Clear__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clear__Group__1();

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
    // $ANTLR end "rule__Clear__Group__0"


    // $ANTLR start "rule__Clear__Group__0__Impl"
    // InternalMyDsl.g:1485:1: rule__Clear__Group__0__Impl : ( 'clear' ) ;
    public final void rule__Clear__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1489:1: ( ( 'clear' ) )
            // InternalMyDsl.g:1490:1: ( 'clear' )
            {
            // InternalMyDsl.g:1490:1: ( 'clear' )
            // InternalMyDsl.g:1491:2: 'clear'
            {
             before(grammarAccess.getClearAccess().getClearKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClearAccess().getClearKeyword_0()); 

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
    // $ANTLR end "rule__Clear__Group__0__Impl"


    // $ANTLR start "rule__Clear__Group__1"
    // InternalMyDsl.g:1500:1: rule__Clear__Group__1 : rule__Clear__Group__1__Impl ;
    public final void rule__Clear__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1504:1: ( rule__Clear__Group__1__Impl )
            // InternalMyDsl.g:1505:2: rule__Clear__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clear__Group__1__Impl();

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
    // $ANTLR end "rule__Clear__Group__1"


    // $ANTLR start "rule__Clear__Group__1__Impl"
    // InternalMyDsl.g:1511:1: rule__Clear__Group__1__Impl : ( ( rule__Clear__FileIDAssignment_1 ) ) ;
    public final void rule__Clear__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1515:1: ( ( ( rule__Clear__FileIDAssignment_1 ) ) )
            // InternalMyDsl.g:1516:1: ( ( rule__Clear__FileIDAssignment_1 ) )
            {
            // InternalMyDsl.g:1516:1: ( ( rule__Clear__FileIDAssignment_1 ) )
            // InternalMyDsl.g:1517:2: ( rule__Clear__FileIDAssignment_1 )
            {
             before(grammarAccess.getClearAccess().getFileIDAssignment_1()); 
            // InternalMyDsl.g:1518:2: ( rule__Clear__FileIDAssignment_1 )
            // InternalMyDsl.g:1518:3: rule__Clear__FileIDAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Clear__FileIDAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClearAccess().getFileIDAssignment_1()); 

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
    // $ANTLR end "rule__Clear__Group__1__Impl"


    // $ANTLR start "rule__Search__Group__0"
    // InternalMyDsl.g:1527:1: rule__Search__Group__0 : rule__Search__Group__0__Impl rule__Search__Group__1 ;
    public final void rule__Search__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1531:1: ( rule__Search__Group__0__Impl rule__Search__Group__1 )
            // InternalMyDsl.g:1532:2: rule__Search__Group__0__Impl rule__Search__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Search__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__1();

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
    // $ANTLR end "rule__Search__Group__0"


    // $ANTLR start "rule__Search__Group__0__Impl"
    // InternalMyDsl.g:1539:1: rule__Search__Group__0__Impl : ( 'search' ) ;
    public final void rule__Search__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1543:1: ( ( 'search' ) )
            // InternalMyDsl.g:1544:1: ( 'search' )
            {
            // InternalMyDsl.g:1544:1: ( 'search' )
            // InternalMyDsl.g:1545:2: 'search'
            {
             before(grammarAccess.getSearchAccess().getSearchKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getSearchKeyword_0()); 

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
    // $ANTLR end "rule__Search__Group__0__Impl"


    // $ANTLR start "rule__Search__Group__1"
    // InternalMyDsl.g:1554:1: rule__Search__Group__1 : rule__Search__Group__1__Impl rule__Search__Group__2 ;
    public final void rule__Search__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1558:1: ( rule__Search__Group__1__Impl rule__Search__Group__2 )
            // InternalMyDsl.g:1559:2: rule__Search__Group__1__Impl rule__Search__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Search__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__2();

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
    // $ANTLR end "rule__Search__Group__1"


    // $ANTLR start "rule__Search__Group__1__Impl"
    // InternalMyDsl.g:1566:1: rule__Search__Group__1__Impl : ( ( rule__Search__FileIDAssignment_1 ) ) ;
    public final void rule__Search__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1570:1: ( ( ( rule__Search__FileIDAssignment_1 ) ) )
            // InternalMyDsl.g:1571:1: ( ( rule__Search__FileIDAssignment_1 ) )
            {
            // InternalMyDsl.g:1571:1: ( ( rule__Search__FileIDAssignment_1 ) )
            // InternalMyDsl.g:1572:2: ( rule__Search__FileIDAssignment_1 )
            {
             before(grammarAccess.getSearchAccess().getFileIDAssignment_1()); 
            // InternalMyDsl.g:1573:2: ( rule__Search__FileIDAssignment_1 )
            // InternalMyDsl.g:1573:3: rule__Search__FileIDAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Search__FileIDAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getFileIDAssignment_1()); 

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
    // $ANTLR end "rule__Search__Group__1__Impl"


    // $ANTLR start "rule__Search__Group__2"
    // InternalMyDsl.g:1581:1: rule__Search__Group__2 : rule__Search__Group__2__Impl rule__Search__Group__3 ;
    public final void rule__Search__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1585:1: ( rule__Search__Group__2__Impl rule__Search__Group__3 )
            // InternalMyDsl.g:1586:2: rule__Search__Group__2__Impl rule__Search__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Search__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__3();

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
    // $ANTLR end "rule__Search__Group__2"


    // $ANTLR start "rule__Search__Group__2__Impl"
    // InternalMyDsl.g:1593:1: rule__Search__Group__2__Impl : ( ',' ) ;
    public final void rule__Search__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1597:1: ( ( ',' ) )
            // InternalMyDsl.g:1598:1: ( ',' )
            {
            // InternalMyDsl.g:1598:1: ( ',' )
            // InternalMyDsl.g:1599:2: ','
            {
             before(grammarAccess.getSearchAccess().getCommaKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__Search__Group__2__Impl"


    // $ANTLR start "rule__Search__Group__3"
    // InternalMyDsl.g:1608:1: rule__Search__Group__3 : rule__Search__Group__3__Impl ;
    public final void rule__Search__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1612:1: ( rule__Search__Group__3__Impl )
            // InternalMyDsl.g:1613:2: rule__Search__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Search__Group__3__Impl();

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
    // $ANTLR end "rule__Search__Group__3"


    // $ANTLR start "rule__Search__Group__3__Impl"
    // InternalMyDsl.g:1619:1: rule__Search__Group__3__Impl : ( ( rule__Search__KeyAssignment_3 ) ) ;
    public final void rule__Search__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1623:1: ( ( ( rule__Search__KeyAssignment_3 ) ) )
            // InternalMyDsl.g:1624:1: ( ( rule__Search__KeyAssignment_3 ) )
            {
            // InternalMyDsl.g:1624:1: ( ( rule__Search__KeyAssignment_3 ) )
            // InternalMyDsl.g:1625:2: ( rule__Search__KeyAssignment_3 )
            {
             before(grammarAccess.getSearchAccess().getKeyAssignment_3()); 
            // InternalMyDsl.g:1626:2: ( rule__Search__KeyAssignment_3 )
            // InternalMyDsl.g:1626:3: rule__Search__KeyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Search__KeyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getKeyAssignment_3()); 

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
    // $ANTLR end "rule__Search__Group__3__Impl"


    // $ANTLR start "rule__Delete__Group__0"
    // InternalMyDsl.g:1635:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1639:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalMyDsl.g:1640:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Delete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__1();

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
    // $ANTLR end "rule__Delete__Group__0"


    // $ANTLR start "rule__Delete__Group__0__Impl"
    // InternalMyDsl.g:1647:1: rule__Delete__Group__0__Impl : ( 'delete' ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1651:1: ( ( 'delete' ) )
            // InternalMyDsl.g:1652:1: ( 'delete' )
            {
            // InternalMyDsl.g:1652:1: ( 'delete' )
            // InternalMyDsl.g:1653:2: 'delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 

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
    // $ANTLR end "rule__Delete__Group__0__Impl"


    // $ANTLR start "rule__Delete__Group__1"
    // InternalMyDsl.g:1662:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1666:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // InternalMyDsl.g:1667:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Delete__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__2();

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
    // $ANTLR end "rule__Delete__Group__1"


    // $ANTLR start "rule__Delete__Group__1__Impl"
    // InternalMyDsl.g:1674:1: rule__Delete__Group__1__Impl : ( ( rule__Delete__FileIDAssignment_1 ) ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1678:1: ( ( ( rule__Delete__FileIDAssignment_1 ) ) )
            // InternalMyDsl.g:1679:1: ( ( rule__Delete__FileIDAssignment_1 ) )
            {
            // InternalMyDsl.g:1679:1: ( ( rule__Delete__FileIDAssignment_1 ) )
            // InternalMyDsl.g:1680:2: ( rule__Delete__FileIDAssignment_1 )
            {
             before(grammarAccess.getDeleteAccess().getFileIDAssignment_1()); 
            // InternalMyDsl.g:1681:2: ( rule__Delete__FileIDAssignment_1 )
            // InternalMyDsl.g:1681:3: rule__Delete__FileIDAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Delete__FileIDAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getFileIDAssignment_1()); 

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
    // $ANTLR end "rule__Delete__Group__1__Impl"


    // $ANTLR start "rule__Delete__Group__2"
    // InternalMyDsl.g:1689:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl rule__Delete__Group__3 ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1693:1: ( rule__Delete__Group__2__Impl rule__Delete__Group__3 )
            // InternalMyDsl.g:1694:2: rule__Delete__Group__2__Impl rule__Delete__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Delete__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__3();

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
    // $ANTLR end "rule__Delete__Group__2"


    // $ANTLR start "rule__Delete__Group__2__Impl"
    // InternalMyDsl.g:1701:1: rule__Delete__Group__2__Impl : ( ',' ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1705:1: ( ( ',' ) )
            // InternalMyDsl.g:1706:1: ( ',' )
            {
            // InternalMyDsl.g:1706:1: ( ',' )
            // InternalMyDsl.g:1707:2: ','
            {
             before(grammarAccess.getDeleteAccess().getCommaKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__Delete__Group__2__Impl"


    // $ANTLR start "rule__Delete__Group__3"
    // InternalMyDsl.g:1716:1: rule__Delete__Group__3 : rule__Delete__Group__3__Impl ;
    public final void rule__Delete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1720:1: ( rule__Delete__Group__3__Impl )
            // InternalMyDsl.g:1721:2: rule__Delete__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__3__Impl();

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
    // $ANTLR end "rule__Delete__Group__3"


    // $ANTLR start "rule__Delete__Group__3__Impl"
    // InternalMyDsl.g:1727:1: rule__Delete__Group__3__Impl : ( ( rule__Delete__PairAssignment_3 ) ) ;
    public final void rule__Delete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1731:1: ( ( ( rule__Delete__PairAssignment_3 ) ) )
            // InternalMyDsl.g:1732:1: ( ( rule__Delete__PairAssignment_3 ) )
            {
            // InternalMyDsl.g:1732:1: ( ( rule__Delete__PairAssignment_3 ) )
            // InternalMyDsl.g:1733:2: ( rule__Delete__PairAssignment_3 )
            {
             before(grammarAccess.getDeleteAccess().getPairAssignment_3()); 
            // InternalMyDsl.g:1734:2: ( rule__Delete__PairAssignment_3 )
            // InternalMyDsl.g:1734:3: rule__Delete__PairAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Delete__PairAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getPairAssignment_3()); 

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
    // $ANTLR end "rule__Delete__Group__3__Impl"


    // $ANTLR start "rule__Json__PairsAssignment_2"
    // InternalMyDsl.g:1743:1: rule__Json__PairsAssignment_2 : ( rulePair ) ;
    public final void rule__Json__PairsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1747:1: ( ( rulePair ) )
            // InternalMyDsl.g:1748:2: ( rulePair )
            {
            // InternalMyDsl.g:1748:2: ( rulePair )
            // InternalMyDsl.g:1749:3: rulePair
            {
             before(grammarAccess.getJsonAccess().getPairsPairParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getJsonAccess().getPairsPairParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Json__PairsAssignment_2"


    // $ANTLR start "rule__Json__PairsAssignment_3_1"
    // InternalMyDsl.g:1758:1: rule__Json__PairsAssignment_3_1 : ( rulePair ) ;
    public final void rule__Json__PairsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1762:1: ( ( rulePair ) )
            // InternalMyDsl.g:1763:2: ( rulePair )
            {
            // InternalMyDsl.g:1763:2: ( rulePair )
            // InternalMyDsl.g:1764:3: rulePair
            {
             before(grammarAccess.getJsonAccess().getPairsPairParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getJsonAccess().getPairsPairParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Json__PairsAssignment_3_1"


    // $ANTLR start "rule__Json__OperationsAssignment_5"
    // InternalMyDsl.g:1773:1: rule__Json__OperationsAssignment_5 : ( ruleJsonOperation ) ;
    public final void rule__Json__OperationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1777:1: ( ( ruleJsonOperation ) )
            // InternalMyDsl.g:1778:2: ( ruleJsonOperation )
            {
            // InternalMyDsl.g:1778:2: ( ruleJsonOperation )
            // InternalMyDsl.g:1779:3: ruleJsonOperation
            {
             before(grammarAccess.getJsonAccess().getOperationsJsonOperationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonOperation();

            state._fsp--;

             after(grammarAccess.getJsonAccess().getOperationsJsonOperationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Json__OperationsAssignment_5"


    // $ANTLR start "rule__Pair__KeyAssignment_0"
    // InternalMyDsl.g:1788:1: rule__Pair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Pair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1793:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1793:2: ( RULE_STRING )
            // InternalMyDsl.g:1794:3: RULE_STRING
            {
             before(grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Pair__KeyAssignment_0"


    // $ANTLR start "rule__Pair__ValueAssignment_2"
    // InternalMyDsl.g:1803:1: rule__Pair__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Pair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1808:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1808:2: ( RULE_STRING )
            // InternalMyDsl.g:1809:3: RULE_STRING
            {
             before(grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Pair__ValueAssignment_2"


    // $ANTLR start "rule__JString__ValAssignment"
    // InternalMyDsl.g:1818:1: rule__JString__ValAssignment : ( RULE_STRING ) ;
    public final void rule__JString__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1822:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1823:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1823:2: ( RULE_STRING )
            // InternalMyDsl.g:1824:3: RULE_STRING
            {
             before(grammarAccess.getJStringAccess().getValSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJStringAccess().getValSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__JString__ValAssignment"


    // $ANTLR start "rule__JArray__ValuesAssignment_2"
    // InternalMyDsl.g:1833:1: rule__JArray__ValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__JArray__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1837:1: ( ( ruleValue ) )
            // InternalMyDsl.g:1838:2: ( ruleValue )
            {
            // InternalMyDsl.g:1838:2: ( ruleValue )
            // InternalMyDsl.g:1839:3: ruleValue
            {
             before(grammarAccess.getJArrayAccess().getValuesValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getJArrayAccess().getValuesValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__JArray__ValuesAssignment_2"


    // $ANTLR start "rule__JArray__ValuesAssignment_3_1"
    // InternalMyDsl.g:1848:1: rule__JArray__ValuesAssignment_3_1 : ( ruleValue ) ;
    public final void rule__JArray__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( ( ruleValue ) )
            // InternalMyDsl.g:1853:2: ( ruleValue )
            {
            // InternalMyDsl.g:1853:2: ( ruleValue )
            // InternalMyDsl.g:1854:3: ruleValue
            {
             before(grammarAccess.getJArrayAccess().getValuesValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getJArrayAccess().getValuesValueParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__JArray__ValuesAssignment_3_1"


    // $ANTLR start "rule__JBoolean__ValAssignment"
    // InternalMyDsl.g:1863:1: rule__JBoolean__ValAssignment : ( ( rule__JBoolean__ValAlternatives_0 ) ) ;
    public final void rule__JBoolean__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1867:1: ( ( ( rule__JBoolean__ValAlternatives_0 ) ) )
            // InternalMyDsl.g:1868:2: ( ( rule__JBoolean__ValAlternatives_0 ) )
            {
            // InternalMyDsl.g:1868:2: ( ( rule__JBoolean__ValAlternatives_0 ) )
            // InternalMyDsl.g:1869:3: ( rule__JBoolean__ValAlternatives_0 )
            {
             before(grammarAccess.getJBooleanAccess().getValAlternatives_0()); 
            // InternalMyDsl.g:1870:3: ( rule__JBoolean__ValAlternatives_0 )
            // InternalMyDsl.g:1870:4: rule__JBoolean__ValAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__JBoolean__ValAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getJBooleanAccess().getValAlternatives_0()); 

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
    // $ANTLR end "rule__JBoolean__ValAssignment"


    // $ANTLR start "rule__Null__ValAssignment"
    // InternalMyDsl.g:1878:1: rule__Null__ValAssignment : ( ( 'null' ) ) ;
    public final void rule__Null__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1882:1: ( ( ( 'null' ) ) )
            // InternalMyDsl.g:1883:2: ( ( 'null' ) )
            {
            // InternalMyDsl.g:1883:2: ( ( 'null' ) )
            // InternalMyDsl.g:1884:3: ( 'null' )
            {
             before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            // InternalMyDsl.g:1885:3: ( 'null' )
            // InternalMyDsl.g:1886:4: 'null'
            {
             before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNullAccess().getValNullKeyword_0()); 

            }

             after(grammarAccess.getNullAccess().getValNullKeyword_0()); 

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
    // $ANTLR end "rule__Null__ValAssignment"


    // $ANTLR start "rule__Fichier__FileIDAssignment_1"
    // InternalMyDsl.g:1897:1: rule__Fichier__FileIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fichier__FileIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1901:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1902:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1902:2: ( RULE_ID )
            // InternalMyDsl.g:1903:3: RULE_ID
            {
             before(grammarAccess.getFichierAccess().getFileIDIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFichierAccess().getFileIDIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Fichier__FileIDAssignment_1"


    // $ANTLR start "rule__Fichier__NameAssignment_3"
    // InternalMyDsl.g:1912:1: rule__Fichier__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Fichier__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1916:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1917:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1917:2: ( RULE_STRING )
            // InternalMyDsl.g:1918:3: RULE_STRING
            {
             before(grammarAccess.getFichierAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFichierAccess().getNameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Fichier__NameAssignment_3"


    // $ANTLR start "rule__Add__FileIDAssignment_1"
    // InternalMyDsl.g:1927:1: rule__Add__FileIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__Add__FileIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1931:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1932:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1932:2: ( RULE_ID )
            // InternalMyDsl.g:1933:3: RULE_ID
            {
             before(grammarAccess.getAddAccess().getFileIDIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getFileIDIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Add__FileIDAssignment_1"


    // $ANTLR start "rule__Add__PairAssignment_3"
    // InternalMyDsl.g:1942:1: rule__Add__PairAssignment_3 : ( rulePair ) ;
    public final void rule__Add__PairAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1946:1: ( ( rulePair ) )
            // InternalMyDsl.g:1947:2: ( rulePair )
            {
            // InternalMyDsl.g:1947:2: ( rulePair )
            // InternalMyDsl.g:1948:3: rulePair
            {
             before(grammarAccess.getAddAccess().getPairPairParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getAddAccess().getPairPairParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Add__PairAssignment_3"


    // $ANTLR start "rule__Clear__FileIDAssignment_1"
    // InternalMyDsl.g:1957:1: rule__Clear__FileIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__Clear__FileIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1962:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1962:2: ( RULE_ID )
            // InternalMyDsl.g:1963:3: RULE_ID
            {
             before(grammarAccess.getClearAccess().getFileIDIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClearAccess().getFileIDIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Clear__FileIDAssignment_1"


    // $ANTLR start "rule__Search__FileIDAssignment_1"
    // InternalMyDsl.g:1972:1: rule__Search__FileIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__Search__FileIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1976:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1977:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1977:2: ( RULE_ID )
            // InternalMyDsl.g:1978:3: RULE_ID
            {
             before(grammarAccess.getSearchAccess().getFileIDIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getFileIDIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Search__FileIDAssignment_1"


    // $ANTLR start "rule__Search__KeyAssignment_3"
    // InternalMyDsl.g:1987:1: rule__Search__KeyAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Search__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1991:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1992:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1992:2: ( RULE_STRING )
            // InternalMyDsl.g:1993:3: RULE_STRING
            {
             before(grammarAccess.getSearchAccess().getKeySTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getKeySTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Search__KeyAssignment_3"


    // $ANTLR start "rule__Delete__FileIDAssignment_1"
    // InternalMyDsl.g:2002:1: rule__Delete__FileIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__Delete__FileIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2006:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2007:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2007:2: ( RULE_ID )
            // InternalMyDsl.g:2008:3: RULE_ID
            {
             before(grammarAccess.getDeleteAccess().getFileIDIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getFileIDIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Delete__FileIDAssignment_1"


    // $ANTLR start "rule__Delete__PairAssignment_3"
    // InternalMyDsl.g:2017:1: rule__Delete__PairAssignment_3 : ( rulePair ) ;
    public final void rule__Delete__PairAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2021:1: ( ( rulePair ) )
            // InternalMyDsl.g:2022:2: ( rulePair )
            {
            // InternalMyDsl.g:2022:2: ( rulePair )
            // InternalMyDsl.g:2023:3: rulePair
            {
             before(grammarAccess.getDeleteAccess().getPairPairParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getPairPairParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Delete__PairAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000003A800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000003A800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040660F50L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040660D10L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});

}