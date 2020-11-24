package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFT_BRACE", "RULE_PAIR_SEPARATION", "RULE_RIGHT_BRACE", "RULE_STRING", "RULE_COLON_SEPARATION", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'null'", "'-'", "'.'", "'E'", "'e'", "'file'", "'='", "'add'", "'search'", "'delete'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int RULE_RIGHT_BRACKET=10;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_RIGHT_BRACE=6;
    public static final int EOF=-1;
    public static final int RULE_ID=12;
    public static final int RULE_WS=15;
    public static final int RULE_PAIR_SEPARATION=5;
    public static final int RULE_LEFT_BRACKET=9;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_LEFT_BRACE=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int RULE_COLON_SEPARATION=8;
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Json";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJson"
    // InternalMyDsl.g:64:1: entryRuleJson returns [EObject current=null] : iv_ruleJson= ruleJson EOF ;
    public final EObject entryRuleJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJson = null;


        try {
            // InternalMyDsl.g:64:45: (iv_ruleJson= ruleJson EOF )
            // InternalMyDsl.g:65:2: iv_ruleJson= ruleJson EOF
            {
             newCompositeNode(grammarAccess.getJsonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJson=ruleJson();

            state._fsp--;

             current =iv_ruleJson; 
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
    // $ANTLR end "entryRuleJson"


    // $ANTLR start "ruleJson"
    // InternalMyDsl.g:71:1: ruleJson returns [EObject current=null] : ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_pairs_2_0= rulePair ) )? (this_PAIR_SEPARATION_3= RULE_PAIR_SEPARATION ( (lv_pairs_4_0= rulePair ) ) )* this_RIGHT_BRACE_5= RULE_RIGHT_BRACE ( (lv_operations_6_0= ruleJsonOperation ) )* ) ;
    public final EObject ruleJson() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACE_1=null;
        Token this_PAIR_SEPARATION_3=null;
        Token this_RIGHT_BRACE_5=null;
        EObject lv_pairs_2_0 = null;

        EObject lv_pairs_4_0 = null;

        EObject lv_operations_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_pairs_2_0= rulePair ) )? (this_PAIR_SEPARATION_3= RULE_PAIR_SEPARATION ( (lv_pairs_4_0= rulePair ) ) )* this_RIGHT_BRACE_5= RULE_RIGHT_BRACE ( (lv_operations_6_0= ruleJsonOperation ) )* ) )
            // InternalMyDsl.g:78:2: ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_pairs_2_0= rulePair ) )? (this_PAIR_SEPARATION_3= RULE_PAIR_SEPARATION ( (lv_pairs_4_0= rulePair ) ) )* this_RIGHT_BRACE_5= RULE_RIGHT_BRACE ( (lv_operations_6_0= ruleJsonOperation ) )* )
            {
            // InternalMyDsl.g:78:2: ( () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_pairs_2_0= rulePair ) )? (this_PAIR_SEPARATION_3= RULE_PAIR_SEPARATION ( (lv_pairs_4_0= rulePair ) ) )* this_RIGHT_BRACE_5= RULE_RIGHT_BRACE ( (lv_operations_6_0= ruleJsonOperation ) )* )
            // InternalMyDsl.g:79:3: () this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_pairs_2_0= rulePair ) )? (this_PAIR_SEPARATION_3= RULE_PAIR_SEPARATION ( (lv_pairs_4_0= rulePair ) ) )* this_RIGHT_BRACE_5= RULE_RIGHT_BRACE ( (lv_operations_6_0= ruleJsonOperation ) )*
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonAccess().getJsonAction_0(),
            					current);
            			

            }

            this_LEFT_BRACE_1=(Token)match(input,RULE_LEFT_BRACE,FOLLOW_3); 

            			newLeafNode(this_LEFT_BRACE_1, grammarAccess.getJsonAccess().getLEFT_BRACETerminalRuleCall_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_pairs_2_0= rulePair ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:91:4: (lv_pairs_2_0= rulePair )
                    {
                    // InternalMyDsl.g:91:4: (lv_pairs_2_0= rulePair )
                    // InternalMyDsl.g:92:5: lv_pairs_2_0= rulePair
                    {

                    					newCompositeNode(grammarAccess.getJsonAccess().getPairsPairParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_pairs_2_0=rulePair();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJsonRule());
                    					}
                    					add(
                    						current,
                    						"pairs",
                    						lv_pairs_2_0,
                    						"org.xtext.example.mydsl.MyDsl.Pair");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:109:3: (this_PAIR_SEPARATION_3= RULE_PAIR_SEPARATION ( (lv_pairs_4_0= rulePair ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_PAIR_SEPARATION) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:110:4: this_PAIR_SEPARATION_3= RULE_PAIR_SEPARATION ( (lv_pairs_4_0= rulePair ) )
            	    {
            	    this_PAIR_SEPARATION_3=(Token)match(input,RULE_PAIR_SEPARATION,FOLLOW_5); 

            	    				newLeafNode(this_PAIR_SEPARATION_3, grammarAccess.getJsonAccess().getPAIR_SEPARATIONTerminalRuleCall_3_0());
            	    			
            	    // InternalMyDsl.g:114:4: ( (lv_pairs_4_0= rulePair ) )
            	    // InternalMyDsl.g:115:5: (lv_pairs_4_0= rulePair )
            	    {
            	    // InternalMyDsl.g:115:5: (lv_pairs_4_0= rulePair )
            	    // InternalMyDsl.g:116:6: lv_pairs_4_0= rulePair
            	    {

            	    						newCompositeNode(grammarAccess.getJsonAccess().getPairsPairParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_pairs_4_0=rulePair();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJsonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pairs",
            	    							lv_pairs_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.Pair");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_RIGHT_BRACE_5=(Token)match(input,RULE_RIGHT_BRACE,FOLLOW_6); 

            			newLeafNode(this_RIGHT_BRACE_5, grammarAccess.getJsonAccess().getRIGHT_BRACETerminalRuleCall_4());
            		
            // InternalMyDsl.g:138:3: ( (lv_operations_6_0= ruleJsonOperation ) )*
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    alt3=1;
                    }
                    break;
                case 26:
                    {
                    alt3=1;
                    }
                    break;
                case 27:
                    {
                    alt3=1;
                    }
                    break;
                case 28:
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:139:4: (lv_operations_6_0= ruleJsonOperation )
            	    {
            	    // InternalMyDsl.g:139:4: (lv_operations_6_0= ruleJsonOperation )
            	    // InternalMyDsl.g:140:5: lv_operations_6_0= ruleJsonOperation
            	    {

            	    					newCompositeNode(grammarAccess.getJsonAccess().getOperationsJsonOperationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_operations_6_0=ruleJsonOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJsonRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.JsonOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleJson"


    // $ANTLR start "entryRuleJsonOperation"
    // InternalMyDsl.g:161:1: entryRuleJsonOperation returns [EObject current=null] : iv_ruleJsonOperation= ruleJsonOperation EOF ;
    public final EObject entryRuleJsonOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonOperation = null;


        try {
            // InternalMyDsl.g:161:54: (iv_ruleJsonOperation= ruleJsonOperation EOF )
            // InternalMyDsl.g:162:2: iv_ruleJsonOperation= ruleJsonOperation EOF
            {
             newCompositeNode(grammarAccess.getJsonOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonOperation=ruleJsonOperation();

            state._fsp--;

             current =iv_ruleJsonOperation; 
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
    // $ANTLR end "entryRuleJsonOperation"


    // $ANTLR start "ruleJsonOperation"
    // InternalMyDsl.g:168:1: ruleJsonOperation returns [EObject current=null] : (this_Fichier_0= ruleFichier | this_Add_1= ruleAdd | this_Search_2= ruleSearch | this_Delete_3= ruleDelete ) ;
    public final EObject ruleJsonOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Fichier_0 = null;

        EObject this_Add_1 = null;

        EObject this_Search_2 = null;

        EObject this_Delete_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:174:2: ( (this_Fichier_0= ruleFichier | this_Add_1= ruleAdd | this_Search_2= ruleSearch | this_Delete_3= ruleDelete ) )
            // InternalMyDsl.g:175:2: (this_Fichier_0= ruleFichier | this_Add_1= ruleAdd | this_Search_2= ruleSearch | this_Delete_3= ruleDelete )
            {
            // InternalMyDsl.g:175:2: (this_Fichier_0= ruleFichier | this_Add_1= ruleAdd | this_Search_2= ruleSearch | this_Delete_3= ruleDelete )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:176:3: this_Fichier_0= ruleFichier
                    {

                    			newCompositeNode(grammarAccess.getJsonOperationAccess().getFichierParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fichier_0=ruleFichier();

                    state._fsp--;


                    			current = this_Fichier_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:185:3: this_Add_1= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getJsonOperationAccess().getAddParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_1=ruleAdd();

                    state._fsp--;


                    			current = this_Add_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:194:3: this_Search_2= ruleSearch
                    {

                    			newCompositeNode(grammarAccess.getJsonOperationAccess().getSearchParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Search_2=ruleSearch();

                    state._fsp--;


                    			current = this_Search_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:203:3: this_Delete_3= ruleDelete
                    {

                    			newCompositeNode(grammarAccess.getJsonOperationAccess().getDeleteParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delete_3=ruleDelete();

                    state._fsp--;


                    			current = this_Delete_3;
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
    // $ANTLR end "ruleJsonOperation"


    // $ANTLR start "entryRulePair"
    // InternalMyDsl.g:215:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // InternalMyDsl.g:215:45: (iv_rulePair= rulePair EOF )
            // InternalMyDsl.g:216:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
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
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // InternalMyDsl.g:222:1: rulePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) this_COLON_SEPARATION_1= RULE_COLON_SEPARATION ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token this_COLON_SEPARATION_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:228:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) this_COLON_SEPARATION_1= RULE_COLON_SEPARATION ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalMyDsl.g:229:2: ( ( (lv_key_0_0= RULE_STRING ) ) this_COLON_SEPARATION_1= RULE_COLON_SEPARATION ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalMyDsl.g:229:2: ( ( (lv_key_0_0= RULE_STRING ) ) this_COLON_SEPARATION_1= RULE_COLON_SEPARATION ( (lv_value_2_0= ruleValue ) ) )
            // InternalMyDsl.g:230:3: ( (lv_key_0_0= RULE_STRING ) ) this_COLON_SEPARATION_1= RULE_COLON_SEPARATION ( (lv_value_2_0= ruleValue ) )
            {
            // InternalMyDsl.g:230:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalMyDsl.g:231:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:231:4: (lv_key_0_0= RULE_STRING )
            // InternalMyDsl.g:232:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_key_0_0, grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            this_COLON_SEPARATION_1=(Token)match(input,RULE_COLON_SEPARATION,FOLLOW_8); 

            			newLeafNode(this_COLON_SEPARATION_1, grammarAccess.getPairAccess().getCOLON_SEPARATIONTerminalRuleCall_1());
            		
            // InternalMyDsl.g:252:3: ( (lv_value_2_0= ruleValue ) )
            // InternalMyDsl.g:253:4: (lv_value_2_0= ruleValue )
            {
            // InternalMyDsl.g:253:4: (lv_value_2_0= ruleValue )
            // InternalMyDsl.g:254:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getPairAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPairRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.mydsl.MyDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:275:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMyDsl.g:275:46: (iv_ruleValue= ruleValue EOF )
            // InternalMyDsl.g:276:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:282:1: ruleValue returns [EObject current=null] : (this_Json_0= ruleJson | this_JString_1= ruleJString | this_JArray_2= ruleJArray | this_JBoolean_3= ruleJBoolean | this_Null_4= ruleNull | this_JNumber_5= ruleJNumber ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Json_0 = null;

        EObject this_JString_1 = null;

        EObject this_JArray_2 = null;

        EObject this_JBoolean_3 = null;

        EObject this_Null_4 = null;

        EObject this_JNumber_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:288:2: ( (this_Json_0= ruleJson | this_JString_1= ruleJString | this_JArray_2= ruleJArray | this_JBoolean_3= ruleJBoolean | this_Null_4= ruleNull | this_JNumber_5= ruleJNumber ) )
            // InternalMyDsl.g:289:2: (this_Json_0= ruleJson | this_JString_1= ruleJString | this_JArray_2= ruleJArray | this_JBoolean_3= ruleJBoolean | this_Null_4= ruleNull | this_JNumber_5= ruleJNumber )
            {
            // InternalMyDsl.g:289:2: (this_Json_0= ruleJson | this_JString_1= ruleJString | this_JArray_2= ruleJArray | this_JBoolean_3= ruleJBoolean | this_Null_4= ruleNull | this_JNumber_5= ruleJNumber )
            int alt5=6;
            switch ( input.LA(1) ) {
            case RULE_LEFT_BRACE:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case RULE_LEFT_BRACKET:
                {
                alt5=3;
                }
                break;
            case 17:
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case RULE_INT:
            case 20:
            case 21:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:290:3: this_Json_0= ruleJson
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getJsonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Json_0=ruleJson();

                    state._fsp--;


                    			current = this_Json_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:299:3: this_JString_1= ruleJString
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getJStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JString_1=ruleJString();

                    state._fsp--;


                    			current = this_JString_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:308:3: this_JArray_2= ruleJArray
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getJArrayParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_JArray_2=ruleJArray();

                    state._fsp--;


                    			current = this_JArray_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:317:3: this_JBoolean_3= ruleJBoolean
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getJBooleanParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_JBoolean_3=ruleJBoolean();

                    state._fsp--;


                    			current = this_JBoolean_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:326:3: this_Null_4= ruleNull
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNullParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Null_4=ruleNull();

                    state._fsp--;


                    			current = this_Null_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:335:3: this_JNumber_5= ruleJNumber
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getJNumberParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_JNumber_5=ruleJNumber();

                    state._fsp--;


                    			current = this_JNumber_5;
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleJString"
    // InternalMyDsl.g:347:1: entryRuleJString returns [EObject current=null] : iv_ruleJString= ruleJString EOF ;
    public final EObject entryRuleJString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJString = null;


        try {
            // InternalMyDsl.g:347:48: (iv_ruleJString= ruleJString EOF )
            // InternalMyDsl.g:348:2: iv_ruleJString= ruleJString EOF
            {
             newCompositeNode(grammarAccess.getJStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJString=ruleJString();

            state._fsp--;

             current =iv_ruleJString; 
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
    // $ANTLR end "entryRuleJString"


    // $ANTLR start "ruleJString"
    // InternalMyDsl.g:354:1: ruleJString returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject ruleJString() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:360:2: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:361:2: ( (lv_val_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:361:2: ( (lv_val_0_0= RULE_STRING ) )
            // InternalMyDsl.g:362:3: (lv_val_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:362:3: (lv_val_0_0= RULE_STRING )
            // InternalMyDsl.g:363:4: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getJStringAccess().getValSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


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
    // $ANTLR end "ruleJString"


    // $ANTLR start "entryRuleJArray"
    // InternalMyDsl.g:382:1: entryRuleJArray returns [EObject current=null] : iv_ruleJArray= ruleJArray EOF ;
    public final EObject entryRuleJArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJArray = null;


        try {
            // InternalMyDsl.g:382:47: (iv_ruleJArray= ruleJArray EOF )
            // InternalMyDsl.g:383:2: iv_ruleJArray= ruleJArray EOF
            {
             newCompositeNode(grammarAccess.getJArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJArray=ruleJArray();

            state._fsp--;

             current =iv_ruleJArray; 
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
    // $ANTLR end "entryRuleJArray"


    // $ANTLR start "ruleJArray"
    // InternalMyDsl.g:389:1: ruleJArray returns [EObject current=null] : ( () this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_values_2_0= ruleValue ) )? (this_PAIR_SEPARATION_3= RULE_PAIR_SEPARATION ( (lv_values_4_0= ruleValue ) ) )* this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleJArray() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACKET_1=null;
        Token this_PAIR_SEPARATION_3=null;
        Token this_RIGHT_BRACKET_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:395:2: ( ( () this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_values_2_0= ruleValue ) )? (this_PAIR_SEPARATION_3= RULE_PAIR_SEPARATION ( (lv_values_4_0= ruleValue ) ) )* this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET ) )
            // InternalMyDsl.g:396:2: ( () this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_values_2_0= ruleValue ) )? (this_PAIR_SEPARATION_3= RULE_PAIR_SEPARATION ( (lv_values_4_0= ruleValue ) ) )* this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET )
            {
            // InternalMyDsl.g:396:2: ( () this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_values_2_0= ruleValue ) )? (this_PAIR_SEPARATION_3= RULE_PAIR_SEPARATION ( (lv_values_4_0= ruleValue ) ) )* this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET )
            // InternalMyDsl.g:397:3: () this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_values_2_0= ruleValue ) )? (this_PAIR_SEPARATION_3= RULE_PAIR_SEPARATION ( (lv_values_4_0= ruleValue ) ) )* this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET
            {
            // InternalMyDsl.g:397:3: ()
            // InternalMyDsl.g:398:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJArrayAccess().getJArrayAction_0(),
            					current);
            			

            }

            this_LEFT_BRACKET_1=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_9); 

            			newLeafNode(this_LEFT_BRACKET_1, grammarAccess.getJArrayAccess().getLEFT_BRACKETTerminalRuleCall_1());
            		
            // InternalMyDsl.g:408:3: ( (lv_values_2_0= ruleValue ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LEFT_BRACE||LA6_0==RULE_STRING||LA6_0==RULE_LEFT_BRACKET||LA6_0==RULE_INT||(LA6_0>=17 && LA6_0<=21)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:409:4: (lv_values_2_0= ruleValue )
                    {
                    // InternalMyDsl.g:409:4: (lv_values_2_0= ruleValue )
                    // InternalMyDsl.g:410:5: lv_values_2_0= ruleValue
                    {

                    					newCompositeNode(grammarAccess.getJArrayAccess().getValuesValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_values_2_0=ruleValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJArrayRule());
                    					}
                    					add(
                    						current,
                    						"values",
                    						lv_values_2_0,
                    						"org.xtext.example.mydsl.MyDsl.Value");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:427:3: (this_PAIR_SEPARATION_3= RULE_PAIR_SEPARATION ( (lv_values_4_0= ruleValue ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_PAIR_SEPARATION) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:428:4: this_PAIR_SEPARATION_3= RULE_PAIR_SEPARATION ( (lv_values_4_0= ruleValue ) )
            	    {
            	    this_PAIR_SEPARATION_3=(Token)match(input,RULE_PAIR_SEPARATION,FOLLOW_8); 

            	    				newLeafNode(this_PAIR_SEPARATION_3, grammarAccess.getJArrayAccess().getPAIR_SEPARATIONTerminalRuleCall_3_0());
            	    			
            	    // InternalMyDsl.g:432:4: ( (lv_values_4_0= ruleValue ) )
            	    // InternalMyDsl.g:433:5: (lv_values_4_0= ruleValue )
            	    {
            	    // InternalMyDsl.g:433:5: (lv_values_4_0= ruleValue )
            	    // InternalMyDsl.g:434:6: lv_values_4_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getJArrayAccess().getValuesValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_values_4_0=ruleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJArrayRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.Value");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_RIGHT_BRACKET_5=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_5, grammarAccess.getJArrayAccess().getRIGHT_BRACKETTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleJArray"


    // $ANTLR start "entryRuleJBoolean"
    // InternalMyDsl.g:460:1: entryRuleJBoolean returns [EObject current=null] : iv_ruleJBoolean= ruleJBoolean EOF ;
    public final EObject entryRuleJBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJBoolean = null;


        try {
            // InternalMyDsl.g:460:49: (iv_ruleJBoolean= ruleJBoolean EOF )
            // InternalMyDsl.g:461:2: iv_ruleJBoolean= ruleJBoolean EOF
            {
             newCompositeNode(grammarAccess.getJBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJBoolean=ruleJBoolean();

            state._fsp--;

             current =iv_ruleJBoolean; 
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
    // $ANTLR end "entryRuleJBoolean"


    // $ANTLR start "ruleJBoolean"
    // InternalMyDsl.g:467:1: ruleJBoolean returns [EObject current=null] : ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) ;
    public final EObject ruleJBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        Token lv_val_0_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:473:2: ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) )
            // InternalMyDsl.g:474:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            {
            // InternalMyDsl.g:474:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            // InternalMyDsl.g:475:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            {
            // InternalMyDsl.g:475:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            // InternalMyDsl.g:476:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            {
            // InternalMyDsl.g:476:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:477:5: lv_val_0_1= 'true'
                    {
                    lv_val_0_1=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_val_0_1, grammarAccess.getJBooleanAccess().getValTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJBooleanRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:488:5: lv_val_0_2= 'false'
                    {
                    lv_val_0_2=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_val_0_2, grammarAccess.getJBooleanAccess().getValFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJBooleanRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_2, null);
                    				

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleJBoolean"


    // $ANTLR start "entryRuleNull"
    // InternalMyDsl.g:504:1: entryRuleNull returns [EObject current=null] : iv_ruleNull= ruleNull EOF ;
    public final EObject entryRuleNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNull = null;


        try {
            // InternalMyDsl.g:504:45: (iv_ruleNull= ruleNull EOF )
            // InternalMyDsl.g:505:2: iv_ruleNull= ruleNull EOF
            {
             newCompositeNode(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNull=ruleNull();

            state._fsp--;

             current =iv_ruleNull; 
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
    // $ANTLR end "entryRuleNull"


    // $ANTLR start "ruleNull"
    // InternalMyDsl.g:511:1: ruleNull returns [EObject current=null] : ( (lv_val_0_0= 'null' ) ) ;
    public final EObject ruleNull() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:517:2: ( ( (lv_val_0_0= 'null' ) ) )
            // InternalMyDsl.g:518:2: ( (lv_val_0_0= 'null' ) )
            {
            // InternalMyDsl.g:518:2: ( (lv_val_0_0= 'null' ) )
            // InternalMyDsl.g:519:3: (lv_val_0_0= 'null' )
            {
            // InternalMyDsl.g:519:3: (lv_val_0_0= 'null' )
            // InternalMyDsl.g:520:4: lv_val_0_0= 'null'
            {
            lv_val_0_0=(Token)match(input,19,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getNullAccess().getValNullKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNullRule());
            				}
            				setWithLastConsumed(current, "val", lv_val_0_0, "null");
            			

            }


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
    // $ANTLR end "ruleNull"


    // $ANTLR start "entryRuleJNumber"
    // InternalMyDsl.g:535:1: entryRuleJNumber returns [EObject current=null] : iv_ruleJNumber= ruleJNumber EOF ;
    public final EObject entryRuleJNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJNumber = null;


        try {
            // InternalMyDsl.g:535:48: (iv_ruleJNumber= ruleJNumber EOF )
            // InternalMyDsl.g:536:2: iv_ruleJNumber= ruleJNumber EOF
            {
             newCompositeNode(grammarAccess.getJNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJNumber=ruleJNumber();

            state._fsp--;

             current =iv_ruleJNumber; 
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
    // $ANTLR end "entryRuleJNumber"


    // $ANTLR start "ruleJNumber"
    // InternalMyDsl.g:542:1: ruleJNumber returns [EObject current=null] : ( () (otherlv_1= '-' )? (this_INT_2= RULE_INT )? (otherlv_3= '.' )? this_INT_4= RULE_INT ( (otherlv_5= 'E' | otherlv_6= 'e' ) (otherlv_7= '-' )? this_INT_8= RULE_INT )? ) ;
    public final EObject ruleJNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INT_2=null;
        Token otherlv_3=null;
        Token this_INT_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_INT_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:548:2: ( ( () (otherlv_1= '-' )? (this_INT_2= RULE_INT )? (otherlv_3= '.' )? this_INT_4= RULE_INT ( (otherlv_5= 'E' | otherlv_6= 'e' ) (otherlv_7= '-' )? this_INT_8= RULE_INT )? ) )
            // InternalMyDsl.g:549:2: ( () (otherlv_1= '-' )? (this_INT_2= RULE_INT )? (otherlv_3= '.' )? this_INT_4= RULE_INT ( (otherlv_5= 'E' | otherlv_6= 'e' ) (otherlv_7= '-' )? this_INT_8= RULE_INT )? )
            {
            // InternalMyDsl.g:549:2: ( () (otherlv_1= '-' )? (this_INT_2= RULE_INT )? (otherlv_3= '.' )? this_INT_4= RULE_INT ( (otherlv_5= 'E' | otherlv_6= 'e' ) (otherlv_7= '-' )? this_INT_8= RULE_INT )? )
            // InternalMyDsl.g:550:3: () (otherlv_1= '-' )? (this_INT_2= RULE_INT )? (otherlv_3= '.' )? this_INT_4= RULE_INT ( (otherlv_5= 'E' | otherlv_6= 'e' ) (otherlv_7= '-' )? this_INT_8= RULE_INT )?
            {
            // InternalMyDsl.g:550:3: ()
            // InternalMyDsl.g:551:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJNumberAccess().getJNumberAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:557:3: (otherlv_1= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:558:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getJNumberAccess().getHyphenMinusKeyword_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:563:3: (this_INT_2= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_INT||LA10_1==21) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:564:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_11); 

                    				newLeafNode(this_INT_2, grammarAccess.getJNumberAccess().getINTTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:569:3: (otherlv_3= '.' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:570:4: otherlv_3= '.'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getJNumberAccess().getFullStopKeyword_3());
                    			

                    }
                    break;

            }

            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_13); 

            			newLeafNode(this_INT_4, grammarAccess.getJNumberAccess().getINTTerminalRuleCall_4());
            		
            // InternalMyDsl.g:579:3: ( (otherlv_5= 'E' | otherlv_6= 'e' ) (otherlv_7= '-' )? this_INT_8= RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=22 && LA14_0<=23)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:580:4: (otherlv_5= 'E' | otherlv_6= 'e' ) (otherlv_7= '-' )? this_INT_8= RULE_INT
                    {
                    // InternalMyDsl.g:580:4: (otherlv_5= 'E' | otherlv_6= 'e' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==22) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==23) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyDsl.g:581:5: otherlv_5= 'E'
                            {
                            otherlv_5=(Token)match(input,22,FOLLOW_14); 

                            					newLeafNode(otherlv_5, grammarAccess.getJNumberAccess().getEKeyword_5_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:586:5: otherlv_6= 'e'
                            {
                            otherlv_6=(Token)match(input,23,FOLLOW_14); 

                            					newLeafNode(otherlv_6, grammarAccess.getJNumberAccess().getEKeyword_5_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:591:4: (otherlv_7= '-' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==20) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:592:5: otherlv_7= '-'
                            {
                            otherlv_7=(Token)match(input,20,FOLLOW_12); 

                            					newLeafNode(otherlv_7, grammarAccess.getJNumberAccess().getHyphenMinusKeyword_5_1());
                            				

                            }
                            break;

                    }

                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_8, grammarAccess.getJNumberAccess().getINTTerminalRuleCall_5_2());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleJNumber"


    // $ANTLR start "entryRuleFichier"
    // InternalMyDsl.g:606:1: entryRuleFichier returns [EObject current=null] : iv_ruleFichier= ruleFichier EOF ;
    public final EObject entryRuleFichier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFichier = null;


        try {
            // InternalMyDsl.g:606:48: (iv_ruleFichier= ruleFichier EOF )
            // InternalMyDsl.g:607:2: iv_ruleFichier= ruleFichier EOF
            {
             newCompositeNode(grammarAccess.getFichierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFichier=ruleFichier();

            state._fsp--;

             current =iv_ruleFichier; 
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
    // $ANTLR end "entryRuleFichier"


    // $ANTLR start "ruleFichier"
    // InternalMyDsl.g:613:1: ruleFichier returns [EObject current=null] : (otherlv_0= 'file' ( (lv_fileID_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleFichier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fileID_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:619:2: ( (otherlv_0= 'file' ( (lv_fileID_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_name_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:620:2: (otherlv_0= 'file' ( (lv_fileID_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:620:2: (otherlv_0= 'file' ( (lv_fileID_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_name_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:621:3: otherlv_0= 'file' ( (lv_fileID_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_name_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getFichierAccess().getFileKeyword_0());
            		
            // InternalMyDsl.g:625:3: ( (lv_fileID_1_0= RULE_ID ) )
            // InternalMyDsl.g:626:4: (lv_fileID_1_0= RULE_ID )
            {
            // InternalMyDsl.g:626:4: (lv_fileID_1_0= RULE_ID )
            // InternalMyDsl.g:627:5: lv_fileID_1_0= RULE_ID
            {
            lv_fileID_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_fileID_1_0, grammarAccess.getFichierAccess().getFileIDIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFichierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fileID",
            						lv_fileID_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFichierAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:647:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalMyDsl.g:648:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:648:4: (lv_name_3_0= RULE_STRING )
            // InternalMyDsl.g:649:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFichierAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFichierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleFichier"


    // $ANTLR start "entryRuleAdd"
    // InternalMyDsl.g:669:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalMyDsl.g:669:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalMyDsl.g:670:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalMyDsl.g:676:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'add' this_Pair_1= rulePair ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Pair_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:682:2: ( (otherlv_0= 'add' this_Pair_1= rulePair ) )
            // InternalMyDsl.g:683:2: (otherlv_0= 'add' this_Pair_1= rulePair )
            {
            // InternalMyDsl.g:683:2: (otherlv_0= 'add' this_Pair_1= rulePair )
            // InternalMyDsl.g:684:3: otherlv_0= 'add' this_Pair_1= rulePair
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAddAccess().getPairParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Pair_1=rulePair();

            state._fsp--;


            			current = this_Pair_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleSearch"
    // InternalMyDsl.g:700:1: entryRuleSearch returns [EObject current=null] : iv_ruleSearch= ruleSearch EOF ;
    public final EObject entryRuleSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearch = null;


        try {
            // InternalMyDsl.g:700:47: (iv_ruleSearch= ruleSearch EOF )
            // InternalMyDsl.g:701:2: iv_ruleSearch= ruleSearch EOF
            {
             newCompositeNode(grammarAccess.getSearchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSearch=ruleSearch();

            state._fsp--;

             current =iv_ruleSearch; 
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
    // $ANTLR end "entryRuleSearch"


    // $ANTLR start "ruleSearch"
    // InternalMyDsl.g:707:1: ruleSearch returns [EObject current=null] : (otherlv_0= 'search' ( (lv_keyId_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_key_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keyId_1_0=null;
        Token otherlv_2=null;
        Token lv_key_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:713:2: ( (otherlv_0= 'search' ( (lv_keyId_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_key_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:714:2: (otherlv_0= 'search' ( (lv_keyId_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_key_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:714:2: (otherlv_0= 'search' ( (lv_keyId_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_key_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:715:3: otherlv_0= 'search' ( (lv_keyId_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_key_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSearchAccess().getSearchKeyword_0());
            		
            // InternalMyDsl.g:719:3: ( (lv_keyId_1_0= RULE_ID ) )
            // InternalMyDsl.g:720:4: (lv_keyId_1_0= RULE_ID )
            {
            // InternalMyDsl.g:720:4: (lv_keyId_1_0= RULE_ID )
            // InternalMyDsl.g:721:5: lv_keyId_1_0= RULE_ID
            {
            lv_keyId_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_keyId_1_0, grammarAccess.getSearchAccess().getKeyIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSearchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"keyId",
            						lv_keyId_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSearchAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:741:3: ( (lv_key_3_0= RULE_STRING ) )
            // InternalMyDsl.g:742:4: (lv_key_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:742:4: (lv_key_3_0= RULE_STRING )
            // InternalMyDsl.g:743:5: lv_key_3_0= RULE_STRING
            {
            lv_key_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_key_3_0, grammarAccess.getSearchAccess().getKeySTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSearchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleSearch"


    // $ANTLR start "entryRuleDelete"
    // InternalMyDsl.g:763:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalMyDsl.g:763:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalMyDsl.g:764:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalMyDsl.g:770:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'delete' this_Pair_1= rulePair ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Pair_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:776:2: ( (otherlv_0= 'delete' this_Pair_1= rulePair ) )
            // InternalMyDsl.g:777:2: (otherlv_0= 'delete' this_Pair_1= rulePair )
            {
            // InternalMyDsl.g:777:2: (otherlv_0= 'delete' this_Pair_1= rulePair )
            // InternalMyDsl.g:778:3: otherlv_0= 'delete' this_Pair_1= rulePair
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDeleteKeyword_0());
            		

            			newCompositeNode(grammarAccess.getDeleteAccess().getPairParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Pair_1=rulePair();

            state._fsp--;


            			current = this_Pair_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleDelete"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001D000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003E0A90L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003E0EB0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});

}