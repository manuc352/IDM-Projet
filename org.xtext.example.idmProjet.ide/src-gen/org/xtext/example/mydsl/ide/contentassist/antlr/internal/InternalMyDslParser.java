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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFT_BRACE", "RULE_RIGHT_BRACE", "RULE_PAIR_SEPARATION", "RULE_COLON_SEPARATION", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'E'", "'e'", "'-'", "'.'", "'file'", "'='", "'add'", "'search'", "'delete'", "'null'"
    };
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int RULE_RIGHT_BRACKET=9;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_RIGHT_BRACE=5;
    public static final int EOF=-1;
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


    // $ANTLR start "entryRuleSearch"
    // InternalMyDsl.g:328:1: entryRuleSearch : ruleSearch EOF ;
    public final void entryRuleSearch() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleSearch EOF )
            // InternalMyDsl.g:330:1: ruleSearch EOF
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
    // InternalMyDsl.g:337:1: ruleSearch : ( ( rule__Search__Group__0 ) ) ;
    public final void ruleSearch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Search__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Search__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Search__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Search__Group__0 )
            {
             before(grammarAccess.getSearchAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Search__Group__0 )
            // InternalMyDsl.g:344:4: rule__Search__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleDelete EOF )
            // InternalMyDsl.g:355:1: ruleDelete EOF
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
    // InternalMyDsl.g:362:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Delete__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Delete__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Delete__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Delete__Group__0 )
            // InternalMyDsl.g:369:4: rule__Delete__Group__0
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
    // InternalMyDsl.g:377:1: rule__JsonOperation__Alternatives : ( ( ruleFichier ) | ( ruleAdd ) | ( ruleSearch ) | ( ruleDelete ) );
    public final void rule__JsonOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:381:1: ( ( ruleFichier ) | ( ruleAdd ) | ( ruleSearch ) | ( ruleDelete ) )
            int alt1=4;
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
            case 26:
                {
                alt1=3;
                }
                break;
            case 27:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:382:2: ( ruleFichier )
                    {
                    // InternalMyDsl.g:382:2: ( ruleFichier )
                    // InternalMyDsl.g:383:3: ruleFichier
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
                    // InternalMyDsl.g:388:2: ( ruleAdd )
                    {
                    // InternalMyDsl.g:388:2: ( ruleAdd )
                    // InternalMyDsl.g:389:3: ruleAdd
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
                    // InternalMyDsl.g:394:2: ( ruleSearch )
                    {
                    // InternalMyDsl.g:394:2: ( ruleSearch )
                    // InternalMyDsl.g:395:3: ruleSearch
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
                    // InternalMyDsl.g:400:2: ( ruleDelete )
                    {
                    // InternalMyDsl.g:400:2: ( ruleDelete )
                    // InternalMyDsl.g:401:3: ruleDelete
                    {
                     before(grammarAccess.getJsonOperationAccess().getDeleteParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getJsonOperationAccess().getDeleteParserRuleCall_3()); 

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
    // InternalMyDsl.g:410:1: rule__Value__Alternatives : ( ( ruleJson ) | ( ruleJString ) | ( ruleJArray ) | ( ruleJBoolean ) | ( ruleNull ) | ( ruleJNumber ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:414:1: ( ( ruleJson ) | ( ruleJString ) | ( ruleJArray ) | ( ruleJBoolean ) | ( ruleNull ) | ( ruleJNumber ) )
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
            case 28:
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
                    // InternalMyDsl.g:415:2: ( ruleJson )
                    {
                    // InternalMyDsl.g:415:2: ( ruleJson )
                    // InternalMyDsl.g:416:3: ruleJson
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
                    // InternalMyDsl.g:421:2: ( ruleJString )
                    {
                    // InternalMyDsl.g:421:2: ( ruleJString )
                    // InternalMyDsl.g:422:3: ruleJString
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
                    // InternalMyDsl.g:427:2: ( ruleJArray )
                    {
                    // InternalMyDsl.g:427:2: ( ruleJArray )
                    // InternalMyDsl.g:428:3: ruleJArray
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
                    // InternalMyDsl.g:433:2: ( ruleJBoolean )
                    {
                    // InternalMyDsl.g:433:2: ( ruleJBoolean )
                    // InternalMyDsl.g:434:3: ruleJBoolean
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
                    // InternalMyDsl.g:439:2: ( ruleNull )
                    {
                    // InternalMyDsl.g:439:2: ( ruleNull )
                    // InternalMyDsl.g:440:3: ruleNull
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
                    // InternalMyDsl.g:445:2: ( ruleJNumber )
                    {
                    // InternalMyDsl.g:445:2: ( ruleJNumber )
                    // InternalMyDsl.g:446:3: ruleJNumber
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
    // InternalMyDsl.g:455:1: rule__JBoolean__ValAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__JBoolean__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:459:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalMyDsl.g:460:2: ( 'true' )
                    {
                    // InternalMyDsl.g:460:2: ( 'true' )
                    // InternalMyDsl.g:461:3: 'true'
                    {
                     before(grammarAccess.getJBooleanAccess().getValTrueKeyword_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getJBooleanAccess().getValTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:466:2: ( 'false' )
                    {
                    // InternalMyDsl.g:466:2: ( 'false' )
                    // InternalMyDsl.g:467:3: 'false'
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
    // InternalMyDsl.g:476:1: rule__JNumber__Alternatives_5_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__JNumber__Alternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalMyDsl.g:481:2: ( 'E' )
                    {
                    // InternalMyDsl.g:481:2: ( 'E' )
                    // InternalMyDsl.g:482:3: 'E'
                    {
                     before(grammarAccess.getJNumberAccess().getEKeyword_5_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getJNumberAccess().getEKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:487:2: ( 'e' )
                    {
                    // InternalMyDsl.g:487:2: ( 'e' )
                    // InternalMyDsl.g:488:3: 'e'
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
    // InternalMyDsl.g:497:1: rule__Json__Group__0 : rule__Json__Group__0__Impl rule__Json__Group__1 ;
    public final void rule__Json__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:501:1: ( rule__Json__Group__0__Impl rule__Json__Group__1 )
            // InternalMyDsl.g:502:2: rule__Json__Group__0__Impl rule__Json__Group__1
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
    // InternalMyDsl.g:509:1: rule__Json__Group__0__Impl : ( () ) ;
    public final void rule__Json__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:513:1: ( ( () ) )
            // InternalMyDsl.g:514:1: ( () )
            {
            // InternalMyDsl.g:514:1: ( () )
            // InternalMyDsl.g:515:2: ()
            {
             before(grammarAccess.getJsonAccess().getJsonAction_0()); 
            // InternalMyDsl.g:516:2: ()
            // InternalMyDsl.g:516:3: 
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
    // InternalMyDsl.g:524:1: rule__Json__Group__1 : rule__Json__Group__1__Impl rule__Json__Group__2 ;
    public final void rule__Json__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:528:1: ( rule__Json__Group__1__Impl rule__Json__Group__2 )
            // InternalMyDsl.g:529:2: rule__Json__Group__1__Impl rule__Json__Group__2
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
    // InternalMyDsl.g:536:1: rule__Json__Group__1__Impl : ( RULE_LEFT_BRACE ) ;
    public final void rule__Json__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( ( RULE_LEFT_BRACE ) )
            // InternalMyDsl.g:541:1: ( RULE_LEFT_BRACE )
            {
            // InternalMyDsl.g:541:1: ( RULE_LEFT_BRACE )
            // InternalMyDsl.g:542:2: RULE_LEFT_BRACE
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
    // InternalMyDsl.g:551:1: rule__Json__Group__2 : rule__Json__Group__2__Impl rule__Json__Group__3 ;
    public final void rule__Json__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:555:1: ( rule__Json__Group__2__Impl rule__Json__Group__3 )
            // InternalMyDsl.g:556:2: rule__Json__Group__2__Impl rule__Json__Group__3
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
    // InternalMyDsl.g:563:1: rule__Json__Group__2__Impl : ( ( rule__Json__PairsAssignment_2 )? ) ;
    public final void rule__Json__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( ( ( rule__Json__PairsAssignment_2 )? ) )
            // InternalMyDsl.g:568:1: ( ( rule__Json__PairsAssignment_2 )? )
            {
            // InternalMyDsl.g:568:1: ( ( rule__Json__PairsAssignment_2 )? )
            // InternalMyDsl.g:569:2: ( rule__Json__PairsAssignment_2 )?
            {
             before(grammarAccess.getJsonAccess().getPairsAssignment_2()); 
            // InternalMyDsl.g:570:2: ( rule__Json__PairsAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:570:3: rule__Json__PairsAssignment_2
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
    // InternalMyDsl.g:578:1: rule__Json__Group__3 : rule__Json__Group__3__Impl rule__Json__Group__4 ;
    public final void rule__Json__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( rule__Json__Group__3__Impl rule__Json__Group__4 )
            // InternalMyDsl.g:583:2: rule__Json__Group__3__Impl rule__Json__Group__4
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
    // InternalMyDsl.g:590:1: rule__Json__Group__3__Impl : ( ( rule__Json__Group_3__0 )* ) ;
    public final void rule__Json__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:594:1: ( ( ( rule__Json__Group_3__0 )* ) )
            // InternalMyDsl.g:595:1: ( ( rule__Json__Group_3__0 )* )
            {
            // InternalMyDsl.g:595:1: ( ( rule__Json__Group_3__0 )* )
            // InternalMyDsl.g:596:2: ( rule__Json__Group_3__0 )*
            {
             before(grammarAccess.getJsonAccess().getGroup_3()); 
            // InternalMyDsl.g:597:2: ( rule__Json__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_PAIR_SEPARATION) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:597:3: rule__Json__Group_3__0
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
    // InternalMyDsl.g:605:1: rule__Json__Group__4 : rule__Json__Group__4__Impl rule__Json__Group__5 ;
    public final void rule__Json__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:609:1: ( rule__Json__Group__4__Impl rule__Json__Group__5 )
            // InternalMyDsl.g:610:2: rule__Json__Group__4__Impl rule__Json__Group__5
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
    // InternalMyDsl.g:617:1: rule__Json__Group__4__Impl : ( RULE_RIGHT_BRACE ) ;
    public final void rule__Json__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( RULE_RIGHT_BRACE ) )
            // InternalMyDsl.g:622:1: ( RULE_RIGHT_BRACE )
            {
            // InternalMyDsl.g:622:1: ( RULE_RIGHT_BRACE )
            // InternalMyDsl.g:623:2: RULE_RIGHT_BRACE
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
    // InternalMyDsl.g:632:1: rule__Json__Group__5 : rule__Json__Group__5__Impl ;
    public final void rule__Json__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( rule__Json__Group__5__Impl )
            // InternalMyDsl.g:637:2: rule__Json__Group__5__Impl
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
    // InternalMyDsl.g:643:1: rule__Json__Group__5__Impl : ( ( rule__Json__OperationsAssignment_5 )* ) ;
    public final void rule__Json__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:647:1: ( ( ( rule__Json__OperationsAssignment_5 )* ) )
            // InternalMyDsl.g:648:1: ( ( rule__Json__OperationsAssignment_5 )* )
            {
            // InternalMyDsl.g:648:1: ( ( rule__Json__OperationsAssignment_5 )* )
            // InternalMyDsl.g:649:2: ( rule__Json__OperationsAssignment_5 )*
            {
             before(grammarAccess.getJsonAccess().getOperationsAssignment_5()); 
            // InternalMyDsl.g:650:2: ( rule__Json__OperationsAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    alt7=1;
                    }
                    break;
                case 25:
                    {
                    alt7=1;
                    }
                    break;
                case 26:
                    {
                    alt7=1;
                    }
                    break;
                case 27:
                    {
                    alt7=1;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:650:3: rule__Json__OperationsAssignment_5
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
    // InternalMyDsl.g:659:1: rule__Json__Group_3__0 : rule__Json__Group_3__0__Impl rule__Json__Group_3__1 ;
    public final void rule__Json__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:663:1: ( rule__Json__Group_3__0__Impl rule__Json__Group_3__1 )
            // InternalMyDsl.g:664:2: rule__Json__Group_3__0__Impl rule__Json__Group_3__1
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
    // InternalMyDsl.g:671:1: rule__Json__Group_3__0__Impl : ( RULE_PAIR_SEPARATION ) ;
    public final void rule__Json__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( ( RULE_PAIR_SEPARATION ) )
            // InternalMyDsl.g:676:1: ( RULE_PAIR_SEPARATION )
            {
            // InternalMyDsl.g:676:1: ( RULE_PAIR_SEPARATION )
            // InternalMyDsl.g:677:2: RULE_PAIR_SEPARATION
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
    // InternalMyDsl.g:686:1: rule__Json__Group_3__1 : rule__Json__Group_3__1__Impl ;
    public final void rule__Json__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:690:1: ( rule__Json__Group_3__1__Impl )
            // InternalMyDsl.g:691:2: rule__Json__Group_3__1__Impl
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
    // InternalMyDsl.g:697:1: rule__Json__Group_3__1__Impl : ( ( rule__Json__PairsAssignment_3_1 ) ) ;
    public final void rule__Json__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:701:1: ( ( ( rule__Json__PairsAssignment_3_1 ) ) )
            // InternalMyDsl.g:702:1: ( ( rule__Json__PairsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:702:1: ( ( rule__Json__PairsAssignment_3_1 ) )
            // InternalMyDsl.g:703:2: ( rule__Json__PairsAssignment_3_1 )
            {
             before(grammarAccess.getJsonAccess().getPairsAssignment_3_1()); 
            // InternalMyDsl.g:704:2: ( rule__Json__PairsAssignment_3_1 )
            // InternalMyDsl.g:704:3: rule__Json__PairsAssignment_3_1
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
    // InternalMyDsl.g:713:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // InternalMyDsl.g:718:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
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
    // InternalMyDsl.g:725:1: rule__Pair__Group__0__Impl : ( ( rule__Pair__KeyAssignment_0 ) ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( ( ( rule__Pair__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:730:1: ( ( rule__Pair__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:730:1: ( ( rule__Pair__KeyAssignment_0 ) )
            // InternalMyDsl.g:731:2: ( rule__Pair__KeyAssignment_0 )
            {
             before(grammarAccess.getPairAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:732:2: ( rule__Pair__KeyAssignment_0 )
            // InternalMyDsl.g:732:3: rule__Pair__KeyAssignment_0
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
    // InternalMyDsl.g:740:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // InternalMyDsl.g:745:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:752:1: rule__Pair__Group__1__Impl : ( RULE_COLON_SEPARATION ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( ( RULE_COLON_SEPARATION ) )
            // InternalMyDsl.g:757:1: ( RULE_COLON_SEPARATION )
            {
            // InternalMyDsl.g:757:1: ( RULE_COLON_SEPARATION )
            // InternalMyDsl.g:758:2: RULE_COLON_SEPARATION
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
    // InternalMyDsl.g:767:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:771:1: ( rule__Pair__Group__2__Impl )
            // InternalMyDsl.g:772:2: rule__Pair__Group__2__Impl
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
    // InternalMyDsl.g:778:1: rule__Pair__Group__2__Impl : ( ( rule__Pair__ValueAssignment_2 ) ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( ( ( rule__Pair__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:783:1: ( ( rule__Pair__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:783:1: ( ( rule__Pair__ValueAssignment_2 ) )
            // InternalMyDsl.g:784:2: ( rule__Pair__ValueAssignment_2 )
            {
             before(grammarAccess.getPairAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:785:2: ( rule__Pair__ValueAssignment_2 )
            // InternalMyDsl.g:785:3: rule__Pair__ValueAssignment_2
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
    // InternalMyDsl.g:794:1: rule__JArray__Group__0 : rule__JArray__Group__0__Impl rule__JArray__Group__1 ;
    public final void rule__JArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( rule__JArray__Group__0__Impl rule__JArray__Group__1 )
            // InternalMyDsl.g:799:2: rule__JArray__Group__0__Impl rule__JArray__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:806:1: rule__JArray__Group__0__Impl : ( () ) ;
    public final void rule__JArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( ( () ) )
            // InternalMyDsl.g:811:1: ( () )
            {
            // InternalMyDsl.g:811:1: ( () )
            // InternalMyDsl.g:812:2: ()
            {
             before(grammarAccess.getJArrayAccess().getJArrayAction_0()); 
            // InternalMyDsl.g:813:2: ()
            // InternalMyDsl.g:813:3: 
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
    // InternalMyDsl.g:821:1: rule__JArray__Group__1 : rule__JArray__Group__1__Impl rule__JArray__Group__2 ;
    public final void rule__JArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( rule__JArray__Group__1__Impl rule__JArray__Group__2 )
            // InternalMyDsl.g:826:2: rule__JArray__Group__1__Impl rule__JArray__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:833:1: rule__JArray__Group__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__JArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalMyDsl.g:838:1: ( RULE_LEFT_BRACKET )
            {
            // InternalMyDsl.g:838:1: ( RULE_LEFT_BRACKET )
            // InternalMyDsl.g:839:2: RULE_LEFT_BRACKET
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
    // InternalMyDsl.g:848:1: rule__JArray__Group__2 : rule__JArray__Group__2__Impl rule__JArray__Group__3 ;
    public final void rule__JArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( rule__JArray__Group__2__Impl rule__JArray__Group__3 )
            // InternalMyDsl.g:853:2: rule__JArray__Group__2__Impl rule__JArray__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:860:1: rule__JArray__Group__2__Impl : ( ( rule__JArray__ValuesAssignment_2 )? ) ;
    public final void rule__JArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( ( ( rule__JArray__ValuesAssignment_2 )? ) )
            // InternalMyDsl.g:865:1: ( ( rule__JArray__ValuesAssignment_2 )? )
            {
            // InternalMyDsl.g:865:1: ( ( rule__JArray__ValuesAssignment_2 )? )
            // InternalMyDsl.g:866:2: ( rule__JArray__ValuesAssignment_2 )?
            {
             before(grammarAccess.getJArrayAccess().getValuesAssignment_2()); 
            // InternalMyDsl.g:867:2: ( rule__JArray__ValuesAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_LEFT_BRACE||LA8_0==RULE_LEFT_BRACKET||(LA8_0>=RULE_INT && LA8_0<=RULE_STRING)||(LA8_0>=17 && LA8_0<=18)||(LA8_0>=21 && LA8_0<=22)||LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:867:3: rule__JArray__ValuesAssignment_2
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
    // InternalMyDsl.g:875:1: rule__JArray__Group__3 : rule__JArray__Group__3__Impl rule__JArray__Group__4 ;
    public final void rule__JArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( rule__JArray__Group__3__Impl rule__JArray__Group__4 )
            // InternalMyDsl.g:880:2: rule__JArray__Group__3__Impl rule__JArray__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:887:1: rule__JArray__Group__3__Impl : ( ( rule__JArray__Group_3__0 )* ) ;
    public final void rule__JArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( ( ( rule__JArray__Group_3__0 )* ) )
            // InternalMyDsl.g:892:1: ( ( rule__JArray__Group_3__0 )* )
            {
            // InternalMyDsl.g:892:1: ( ( rule__JArray__Group_3__0 )* )
            // InternalMyDsl.g:893:2: ( rule__JArray__Group_3__0 )*
            {
             before(grammarAccess.getJArrayAccess().getGroup_3()); 
            // InternalMyDsl.g:894:2: ( rule__JArray__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_PAIR_SEPARATION) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:894:3: rule__JArray__Group_3__0
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
    // InternalMyDsl.g:902:1: rule__JArray__Group__4 : rule__JArray__Group__4__Impl ;
    public final void rule__JArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:906:1: ( rule__JArray__Group__4__Impl )
            // InternalMyDsl.g:907:2: rule__JArray__Group__4__Impl
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
    // InternalMyDsl.g:913:1: rule__JArray__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__JArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:917:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalMyDsl.g:918:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalMyDsl.g:918:1: ( RULE_RIGHT_BRACKET )
            // InternalMyDsl.g:919:2: RULE_RIGHT_BRACKET
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
    // InternalMyDsl.g:929:1: rule__JArray__Group_3__0 : rule__JArray__Group_3__0__Impl rule__JArray__Group_3__1 ;
    public final void rule__JArray__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:933:1: ( rule__JArray__Group_3__0__Impl rule__JArray__Group_3__1 )
            // InternalMyDsl.g:934:2: rule__JArray__Group_3__0__Impl rule__JArray__Group_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:941:1: rule__JArray__Group_3__0__Impl : ( RULE_PAIR_SEPARATION ) ;
    public final void rule__JArray__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( ( RULE_PAIR_SEPARATION ) )
            // InternalMyDsl.g:946:1: ( RULE_PAIR_SEPARATION )
            {
            // InternalMyDsl.g:946:1: ( RULE_PAIR_SEPARATION )
            // InternalMyDsl.g:947:2: RULE_PAIR_SEPARATION
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
    // InternalMyDsl.g:956:1: rule__JArray__Group_3__1 : rule__JArray__Group_3__1__Impl ;
    public final void rule__JArray__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( rule__JArray__Group_3__1__Impl )
            // InternalMyDsl.g:961:2: rule__JArray__Group_3__1__Impl
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
    // InternalMyDsl.g:967:1: rule__JArray__Group_3__1__Impl : ( ( rule__JArray__ValuesAssignment_3_1 ) ) ;
    public final void rule__JArray__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:971:1: ( ( ( rule__JArray__ValuesAssignment_3_1 ) ) )
            // InternalMyDsl.g:972:1: ( ( rule__JArray__ValuesAssignment_3_1 ) )
            {
            // InternalMyDsl.g:972:1: ( ( rule__JArray__ValuesAssignment_3_1 ) )
            // InternalMyDsl.g:973:2: ( rule__JArray__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getJArrayAccess().getValuesAssignment_3_1()); 
            // InternalMyDsl.g:974:2: ( rule__JArray__ValuesAssignment_3_1 )
            // InternalMyDsl.g:974:3: rule__JArray__ValuesAssignment_3_1
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
    // InternalMyDsl.g:983:1: rule__JNumber__Group__0 : rule__JNumber__Group__0__Impl rule__JNumber__Group__1 ;
    public final void rule__JNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( rule__JNumber__Group__0__Impl rule__JNumber__Group__1 )
            // InternalMyDsl.g:988:2: rule__JNumber__Group__0__Impl rule__JNumber__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:995:1: rule__JNumber__Group__0__Impl : ( () ) ;
    public final void rule__JNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( ( () ) )
            // InternalMyDsl.g:1000:1: ( () )
            {
            // InternalMyDsl.g:1000:1: ( () )
            // InternalMyDsl.g:1001:2: ()
            {
             before(grammarAccess.getJNumberAccess().getJNumberAction_0()); 
            // InternalMyDsl.g:1002:2: ()
            // InternalMyDsl.g:1002:3: 
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
    // InternalMyDsl.g:1010:1: rule__JNumber__Group__1 : rule__JNumber__Group__1__Impl rule__JNumber__Group__2 ;
    public final void rule__JNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( rule__JNumber__Group__1__Impl rule__JNumber__Group__2 )
            // InternalMyDsl.g:1015:2: rule__JNumber__Group__1__Impl rule__JNumber__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1022:1: rule__JNumber__Group__1__Impl : ( ( '-' )? ) ;
    public final void rule__JNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1027:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1027:1: ( ( '-' )? )
            // InternalMyDsl.g:1028:2: ( '-' )?
            {
             before(grammarAccess.getJNumberAccess().getHyphenMinusKeyword_1()); 
            // InternalMyDsl.g:1029:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1029:3: '-'
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
    // InternalMyDsl.g:1037:1: rule__JNumber__Group__2 : rule__JNumber__Group__2__Impl rule__JNumber__Group__3 ;
    public final void rule__JNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( rule__JNumber__Group__2__Impl rule__JNumber__Group__3 )
            // InternalMyDsl.g:1042:2: rule__JNumber__Group__2__Impl rule__JNumber__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1049:1: rule__JNumber__Group__2__Impl : ( ( RULE_INT )? ) ;
    public final void rule__JNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:1054:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:1054:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:1055:2: ( RULE_INT )?
            {
             before(grammarAccess.getJNumberAccess().getINTTerminalRuleCall_2()); 
            // InternalMyDsl.g:1056:2: ( RULE_INT )?
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
                    // InternalMyDsl.g:1056:3: RULE_INT
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
    // InternalMyDsl.g:1064:1: rule__JNumber__Group__3 : rule__JNumber__Group__3__Impl rule__JNumber__Group__4 ;
    public final void rule__JNumber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( rule__JNumber__Group__3__Impl rule__JNumber__Group__4 )
            // InternalMyDsl.g:1069:2: rule__JNumber__Group__3__Impl rule__JNumber__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1076:1: rule__JNumber__Group__3__Impl : ( ( '.' )? ) ;
    public final void rule__JNumber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( ( ( '.' )? ) )
            // InternalMyDsl.g:1081:1: ( ( '.' )? )
            {
            // InternalMyDsl.g:1081:1: ( ( '.' )? )
            // InternalMyDsl.g:1082:2: ( '.' )?
            {
             before(grammarAccess.getJNumberAccess().getFullStopKeyword_3()); 
            // InternalMyDsl.g:1083:2: ( '.' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1083:3: '.'
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
    // InternalMyDsl.g:1091:1: rule__JNumber__Group__4 : rule__JNumber__Group__4__Impl rule__JNumber__Group__5 ;
    public final void rule__JNumber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( rule__JNumber__Group__4__Impl rule__JNumber__Group__5 )
            // InternalMyDsl.g:1096:2: rule__JNumber__Group__4__Impl rule__JNumber__Group__5
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
    // InternalMyDsl.g:1103:1: rule__JNumber__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__JNumber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1108:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1108:1: ( RULE_INT )
            // InternalMyDsl.g:1109:2: RULE_INT
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
    // InternalMyDsl.g:1118:1: rule__JNumber__Group__5 : rule__JNumber__Group__5__Impl ;
    public final void rule__JNumber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1122:1: ( rule__JNumber__Group__5__Impl )
            // InternalMyDsl.g:1123:2: rule__JNumber__Group__5__Impl
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
    // InternalMyDsl.g:1129:1: rule__JNumber__Group__5__Impl : ( ( rule__JNumber__Group_5__0 )? ) ;
    public final void rule__JNumber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1133:1: ( ( ( rule__JNumber__Group_5__0 )? ) )
            // InternalMyDsl.g:1134:1: ( ( rule__JNumber__Group_5__0 )? )
            {
            // InternalMyDsl.g:1134:1: ( ( rule__JNumber__Group_5__0 )? )
            // InternalMyDsl.g:1135:2: ( rule__JNumber__Group_5__0 )?
            {
             before(grammarAccess.getJNumberAccess().getGroup_5()); 
            // InternalMyDsl.g:1136:2: ( rule__JNumber__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=19 && LA13_0<=20)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1136:3: rule__JNumber__Group_5__0
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
    // InternalMyDsl.g:1145:1: rule__JNumber__Group_5__0 : rule__JNumber__Group_5__0__Impl rule__JNumber__Group_5__1 ;
    public final void rule__JNumber__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1149:1: ( rule__JNumber__Group_5__0__Impl rule__JNumber__Group_5__1 )
            // InternalMyDsl.g:1150:2: rule__JNumber__Group_5__0__Impl rule__JNumber__Group_5__1
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
    // InternalMyDsl.g:1157:1: rule__JNumber__Group_5__0__Impl : ( ( rule__JNumber__Alternatives_5_0 ) ) ;
    public final void rule__JNumber__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1161:1: ( ( ( rule__JNumber__Alternatives_5_0 ) ) )
            // InternalMyDsl.g:1162:1: ( ( rule__JNumber__Alternatives_5_0 ) )
            {
            // InternalMyDsl.g:1162:1: ( ( rule__JNumber__Alternatives_5_0 ) )
            // InternalMyDsl.g:1163:2: ( rule__JNumber__Alternatives_5_0 )
            {
             before(grammarAccess.getJNumberAccess().getAlternatives_5_0()); 
            // InternalMyDsl.g:1164:2: ( rule__JNumber__Alternatives_5_0 )
            // InternalMyDsl.g:1164:3: rule__JNumber__Alternatives_5_0
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
    // InternalMyDsl.g:1172:1: rule__JNumber__Group_5__1 : rule__JNumber__Group_5__1__Impl rule__JNumber__Group_5__2 ;
    public final void rule__JNumber__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( rule__JNumber__Group_5__1__Impl rule__JNumber__Group_5__2 )
            // InternalMyDsl.g:1177:2: rule__JNumber__Group_5__1__Impl rule__JNumber__Group_5__2
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
    // InternalMyDsl.g:1184:1: rule__JNumber__Group_5__1__Impl : ( ( '-' )? ) ;
    public final void rule__JNumber__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1188:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1189:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1189:1: ( ( '-' )? )
            // InternalMyDsl.g:1190:2: ( '-' )?
            {
             before(grammarAccess.getJNumberAccess().getHyphenMinusKeyword_5_1()); 
            // InternalMyDsl.g:1191:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1191:3: '-'
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
    // InternalMyDsl.g:1199:1: rule__JNumber__Group_5__2 : rule__JNumber__Group_5__2__Impl ;
    public final void rule__JNumber__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1203:1: ( rule__JNumber__Group_5__2__Impl )
            // InternalMyDsl.g:1204:2: rule__JNumber__Group_5__2__Impl
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
    // InternalMyDsl.g:1210:1: rule__JNumber__Group_5__2__Impl : ( RULE_INT ) ;
    public final void rule__JNumber__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1214:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1215:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1215:1: ( RULE_INT )
            // InternalMyDsl.g:1216:2: RULE_INT
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
    // InternalMyDsl.g:1226:1: rule__Fichier__Group__0 : rule__Fichier__Group__0__Impl rule__Fichier__Group__1 ;
    public final void rule__Fichier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1230:1: ( rule__Fichier__Group__0__Impl rule__Fichier__Group__1 )
            // InternalMyDsl.g:1231:2: rule__Fichier__Group__0__Impl rule__Fichier__Group__1
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
    // InternalMyDsl.g:1238:1: rule__Fichier__Group__0__Impl : ( 'file' ) ;
    public final void rule__Fichier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( ( 'file' ) )
            // InternalMyDsl.g:1243:1: ( 'file' )
            {
            // InternalMyDsl.g:1243:1: ( 'file' )
            // InternalMyDsl.g:1244:2: 'file'
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
    // InternalMyDsl.g:1253:1: rule__Fichier__Group__1 : rule__Fichier__Group__1__Impl rule__Fichier__Group__2 ;
    public final void rule__Fichier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1257:1: ( rule__Fichier__Group__1__Impl rule__Fichier__Group__2 )
            // InternalMyDsl.g:1258:2: rule__Fichier__Group__1__Impl rule__Fichier__Group__2
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
    // InternalMyDsl.g:1265:1: rule__Fichier__Group__1__Impl : ( ( rule__Fichier__FileIDAssignment_1 ) ) ;
    public final void rule__Fichier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1269:1: ( ( ( rule__Fichier__FileIDAssignment_1 ) ) )
            // InternalMyDsl.g:1270:1: ( ( rule__Fichier__FileIDAssignment_1 ) )
            {
            // InternalMyDsl.g:1270:1: ( ( rule__Fichier__FileIDAssignment_1 ) )
            // InternalMyDsl.g:1271:2: ( rule__Fichier__FileIDAssignment_1 )
            {
             before(grammarAccess.getFichierAccess().getFileIDAssignment_1()); 
            // InternalMyDsl.g:1272:2: ( rule__Fichier__FileIDAssignment_1 )
            // InternalMyDsl.g:1272:3: rule__Fichier__FileIDAssignment_1
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
    // InternalMyDsl.g:1280:1: rule__Fichier__Group__2 : rule__Fichier__Group__2__Impl rule__Fichier__Group__3 ;
    public final void rule__Fichier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( rule__Fichier__Group__2__Impl rule__Fichier__Group__3 )
            // InternalMyDsl.g:1285:2: rule__Fichier__Group__2__Impl rule__Fichier__Group__3
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
    // InternalMyDsl.g:1292:1: rule__Fichier__Group__2__Impl : ( '=' ) ;
    public final void rule__Fichier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1296:1: ( ( '=' ) )
            // InternalMyDsl.g:1297:1: ( '=' )
            {
            // InternalMyDsl.g:1297:1: ( '=' )
            // InternalMyDsl.g:1298:2: '='
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
    // InternalMyDsl.g:1307:1: rule__Fichier__Group__3 : rule__Fichier__Group__3__Impl ;
    public final void rule__Fichier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1311:1: ( rule__Fichier__Group__3__Impl )
            // InternalMyDsl.g:1312:2: rule__Fichier__Group__3__Impl
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
    // InternalMyDsl.g:1318:1: rule__Fichier__Group__3__Impl : ( ( rule__Fichier__NameAssignment_3 ) ) ;
    public final void rule__Fichier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( ( ( rule__Fichier__NameAssignment_3 ) ) )
            // InternalMyDsl.g:1323:1: ( ( rule__Fichier__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:1323:1: ( ( rule__Fichier__NameAssignment_3 ) )
            // InternalMyDsl.g:1324:2: ( rule__Fichier__NameAssignment_3 )
            {
             before(grammarAccess.getFichierAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:1325:2: ( rule__Fichier__NameAssignment_3 )
            // InternalMyDsl.g:1325:3: rule__Fichier__NameAssignment_3
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
    // InternalMyDsl.g:1334:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalMyDsl.g:1339:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1346:1: rule__Add__Group__0__Impl : ( 'add' ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1350:1: ( ( 'add' ) )
            // InternalMyDsl.g:1351:1: ( 'add' )
            {
            // InternalMyDsl.g:1351:1: ( 'add' )
            // InternalMyDsl.g:1352:2: 'add'
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
    // InternalMyDsl.g:1361:1: rule__Add__Group__1 : rule__Add__Group__1__Impl ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1365:1: ( rule__Add__Group__1__Impl )
            // InternalMyDsl.g:1366:2: rule__Add__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__1__Impl();

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
    // InternalMyDsl.g:1372:1: rule__Add__Group__1__Impl : ( rulePair ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1376:1: ( ( rulePair ) )
            // InternalMyDsl.g:1377:1: ( rulePair )
            {
            // InternalMyDsl.g:1377:1: ( rulePair )
            // InternalMyDsl.g:1378:2: rulePair
            {
             before(grammarAccess.getAddAccess().getPairParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getAddAccess().getPairParserRuleCall_1()); 

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


    // $ANTLR start "rule__Search__Group__0"
    // InternalMyDsl.g:1388:1: rule__Search__Group__0 : rule__Search__Group__0__Impl rule__Search__Group__1 ;
    public final void rule__Search__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1392:1: ( rule__Search__Group__0__Impl rule__Search__Group__1 )
            // InternalMyDsl.g:1393:2: rule__Search__Group__0__Impl rule__Search__Group__1
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
    // InternalMyDsl.g:1400:1: rule__Search__Group__0__Impl : ( 'search' ) ;
    public final void rule__Search__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1404:1: ( ( 'search' ) )
            // InternalMyDsl.g:1405:1: ( 'search' )
            {
            // InternalMyDsl.g:1405:1: ( 'search' )
            // InternalMyDsl.g:1406:2: 'search'
            {
             before(grammarAccess.getSearchAccess().getSearchKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:1415:1: rule__Search__Group__1 : rule__Search__Group__1__Impl rule__Search__Group__2 ;
    public final void rule__Search__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1419:1: ( rule__Search__Group__1__Impl rule__Search__Group__2 )
            // InternalMyDsl.g:1420:2: rule__Search__Group__1__Impl rule__Search__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1427:1: rule__Search__Group__1__Impl : ( ( rule__Search__KeyIdAssignment_1 ) ) ;
    public final void rule__Search__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1431:1: ( ( ( rule__Search__KeyIdAssignment_1 ) ) )
            // InternalMyDsl.g:1432:1: ( ( rule__Search__KeyIdAssignment_1 ) )
            {
            // InternalMyDsl.g:1432:1: ( ( rule__Search__KeyIdAssignment_1 ) )
            // InternalMyDsl.g:1433:2: ( rule__Search__KeyIdAssignment_1 )
            {
             before(grammarAccess.getSearchAccess().getKeyIdAssignment_1()); 
            // InternalMyDsl.g:1434:2: ( rule__Search__KeyIdAssignment_1 )
            // InternalMyDsl.g:1434:3: rule__Search__KeyIdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Search__KeyIdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getKeyIdAssignment_1()); 

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
    // InternalMyDsl.g:1442:1: rule__Search__Group__2 : rule__Search__Group__2__Impl rule__Search__Group__3 ;
    public final void rule__Search__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1446:1: ( rule__Search__Group__2__Impl rule__Search__Group__3 )
            // InternalMyDsl.g:1447:2: rule__Search__Group__2__Impl rule__Search__Group__3
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
    // InternalMyDsl.g:1454:1: rule__Search__Group__2__Impl : ( '=' ) ;
    public final void rule__Search__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1458:1: ( ( '=' ) )
            // InternalMyDsl.g:1459:1: ( '=' )
            {
            // InternalMyDsl.g:1459:1: ( '=' )
            // InternalMyDsl.g:1460:2: '='
            {
             before(grammarAccess.getSearchAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getEqualsSignKeyword_2()); 

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
    // InternalMyDsl.g:1469:1: rule__Search__Group__3 : rule__Search__Group__3__Impl ;
    public final void rule__Search__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( rule__Search__Group__3__Impl )
            // InternalMyDsl.g:1474:2: rule__Search__Group__3__Impl
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
    // InternalMyDsl.g:1480:1: rule__Search__Group__3__Impl : ( ( rule__Search__KeyAssignment_3 ) ) ;
    public final void rule__Search__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1484:1: ( ( ( rule__Search__KeyAssignment_3 ) ) )
            // InternalMyDsl.g:1485:1: ( ( rule__Search__KeyAssignment_3 ) )
            {
            // InternalMyDsl.g:1485:1: ( ( rule__Search__KeyAssignment_3 ) )
            // InternalMyDsl.g:1486:2: ( rule__Search__KeyAssignment_3 )
            {
             before(grammarAccess.getSearchAccess().getKeyAssignment_3()); 
            // InternalMyDsl.g:1487:2: ( rule__Search__KeyAssignment_3 )
            // InternalMyDsl.g:1487:3: rule__Search__KeyAssignment_3
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
    // InternalMyDsl.g:1496:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1500:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalMyDsl.g:1501:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1508:1: rule__Delete__Group__0__Impl : ( 'delete' ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1512:1: ( ( 'delete' ) )
            // InternalMyDsl.g:1513:1: ( 'delete' )
            {
            // InternalMyDsl.g:1513:1: ( 'delete' )
            // InternalMyDsl.g:1514:2: 'delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:1523:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( rule__Delete__Group__1__Impl )
            // InternalMyDsl.g:1528:2: rule__Delete__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__1__Impl();

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
    // InternalMyDsl.g:1534:1: rule__Delete__Group__1__Impl : ( rulePair ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1538:1: ( ( rulePair ) )
            // InternalMyDsl.g:1539:1: ( rulePair )
            {
            // InternalMyDsl.g:1539:1: ( rulePair )
            // InternalMyDsl.g:1540:2: rulePair
            {
             before(grammarAccess.getDeleteAccess().getPairParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getPairParserRuleCall_1()); 

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


    // $ANTLR start "rule__Json__PairsAssignment_2"
    // InternalMyDsl.g:1550:1: rule__Json__PairsAssignment_2 : ( rulePair ) ;
    public final void rule__Json__PairsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1554:1: ( ( rulePair ) )
            // InternalMyDsl.g:1555:2: ( rulePair )
            {
            // InternalMyDsl.g:1555:2: ( rulePair )
            // InternalMyDsl.g:1556:3: rulePair
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
    // InternalMyDsl.g:1565:1: rule__Json__PairsAssignment_3_1 : ( rulePair ) ;
    public final void rule__Json__PairsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1569:1: ( ( rulePair ) )
            // InternalMyDsl.g:1570:2: ( rulePair )
            {
            // InternalMyDsl.g:1570:2: ( rulePair )
            // InternalMyDsl.g:1571:3: rulePair
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
    // InternalMyDsl.g:1580:1: rule__Json__OperationsAssignment_5 : ( ruleJsonOperation ) ;
    public final void rule__Json__OperationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1584:1: ( ( ruleJsonOperation ) )
            // InternalMyDsl.g:1585:2: ( ruleJsonOperation )
            {
            // InternalMyDsl.g:1585:2: ( ruleJsonOperation )
            // InternalMyDsl.g:1586:3: ruleJsonOperation
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
    // InternalMyDsl.g:1595:1: rule__Pair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Pair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1599:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1600:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1600:2: ( RULE_STRING )
            // InternalMyDsl.g:1601:3: RULE_STRING
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
    // InternalMyDsl.g:1610:1: rule__Pair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Pair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1614:1: ( ( ruleValue ) )
            // InternalMyDsl.g:1615:2: ( ruleValue )
            {
            // InternalMyDsl.g:1615:2: ( ruleValue )
            // InternalMyDsl.g:1616:3: ruleValue
            {
             before(grammarAccess.getPairAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPairAccess().getValueValueParserRuleCall_2_0()); 

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
    // InternalMyDsl.g:1625:1: rule__JString__ValAssignment : ( RULE_STRING ) ;
    public final void rule__JString__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1629:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1630:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1630:2: ( RULE_STRING )
            // InternalMyDsl.g:1631:3: RULE_STRING
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
    // InternalMyDsl.g:1640:1: rule__JArray__ValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__JArray__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1644:1: ( ( ruleValue ) )
            // InternalMyDsl.g:1645:2: ( ruleValue )
            {
            // InternalMyDsl.g:1645:2: ( ruleValue )
            // InternalMyDsl.g:1646:3: ruleValue
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
    // InternalMyDsl.g:1655:1: rule__JArray__ValuesAssignment_3_1 : ( ruleValue ) ;
    public final void rule__JArray__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1659:1: ( ( ruleValue ) )
            // InternalMyDsl.g:1660:2: ( ruleValue )
            {
            // InternalMyDsl.g:1660:2: ( ruleValue )
            // InternalMyDsl.g:1661:3: ruleValue
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
    // InternalMyDsl.g:1670:1: rule__JBoolean__ValAssignment : ( ( rule__JBoolean__ValAlternatives_0 ) ) ;
    public final void rule__JBoolean__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1674:1: ( ( ( rule__JBoolean__ValAlternatives_0 ) ) )
            // InternalMyDsl.g:1675:2: ( ( rule__JBoolean__ValAlternatives_0 ) )
            {
            // InternalMyDsl.g:1675:2: ( ( rule__JBoolean__ValAlternatives_0 ) )
            // InternalMyDsl.g:1676:3: ( rule__JBoolean__ValAlternatives_0 )
            {
             before(grammarAccess.getJBooleanAccess().getValAlternatives_0()); 
            // InternalMyDsl.g:1677:3: ( rule__JBoolean__ValAlternatives_0 )
            // InternalMyDsl.g:1677:4: rule__JBoolean__ValAlternatives_0
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
    // InternalMyDsl.g:1685:1: rule__Null__ValAssignment : ( ( 'null' ) ) ;
    public final void rule__Null__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1689:1: ( ( ( 'null' ) ) )
            // InternalMyDsl.g:1690:2: ( ( 'null' ) )
            {
            // InternalMyDsl.g:1690:2: ( ( 'null' ) )
            // InternalMyDsl.g:1691:3: ( 'null' )
            {
             before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            // InternalMyDsl.g:1692:3: ( 'null' )
            // InternalMyDsl.g:1693:4: 'null'
            {
             before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1704:1: rule__Fichier__FileIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fichier__FileIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1708:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1709:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1709:2: ( RULE_ID )
            // InternalMyDsl.g:1710:3: RULE_ID
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
    // InternalMyDsl.g:1719:1: rule__Fichier__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Fichier__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1723:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1724:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1724:2: ( RULE_STRING )
            // InternalMyDsl.g:1725:3: RULE_STRING
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


    // $ANTLR start "rule__Search__KeyIdAssignment_1"
    // InternalMyDsl.g:1734:1: rule__Search__KeyIdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Search__KeyIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1739:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1739:2: ( RULE_ID )
            // InternalMyDsl.g:1740:3: RULE_ID
            {
             before(grammarAccess.getSearchAccess().getKeyIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getKeyIdIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Search__KeyIdAssignment_1"


    // $ANTLR start "rule__Search__KeyAssignment_3"
    // InternalMyDsl.g:1749:1: rule__Search__KeyAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Search__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1754:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1754:2: ( RULE_STRING )
            // InternalMyDsl.g:1755:3: RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000E800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000E800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010660D10L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010660F50L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});

}