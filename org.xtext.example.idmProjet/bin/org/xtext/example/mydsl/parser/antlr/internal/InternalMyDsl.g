/*
 * generated by Xtext 2.24.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleJson
entryRuleJson returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsonRule()); }
	iv_ruleJson=ruleJson
	{ $current=$iv_ruleJson.current; }
	EOF;

// Rule Json
ruleJson returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getJsonAccess().getJsonAction_0(),
					$current);
			}
		)
		this_LEFT_BRACE_1=RULE_LEFT_BRACE
		{
			newLeafNode(this_LEFT_BRACE_1, grammarAccess.getJsonAccess().getLEFT_BRACETerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getJsonAccess().getPairsPairParserRuleCall_2_0());
				}
				lv_pairs_2_0=rulePair
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJsonRule());
					}
					add(
						$current,
						"pairs",
						lv_pairs_2_0,
						"org.xtext.example.mydsl.MyDsl.Pair");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			this_PAIR_SEPARATION_3=RULE_PAIR_SEPARATION
			{
				newLeafNode(this_PAIR_SEPARATION_3, grammarAccess.getJsonAccess().getPAIR_SEPARATIONTerminalRuleCall_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getJsonAccess().getPairsPairParserRuleCall_3_1_0());
					}
					lv_pairs_4_0=rulePair
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJsonRule());
						}
						add(
							$current,
							"pairs",
							lv_pairs_4_0,
							"org.xtext.example.mydsl.MyDsl.Pair");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		this_RIGHT_BRACE_5=RULE_RIGHT_BRACE
		{
			newLeafNode(this_RIGHT_BRACE_5, grammarAccess.getJsonAccess().getRIGHT_BRACETerminalRuleCall_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getJsonAccess().getOperationsJsonOperationParserRuleCall_5_0());
				}
				lv_operations_6_0=ruleJsonOperation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJsonRule());
					}
					add(
						$current,
						"operations",
						lv_operations_6_0,
						"org.xtext.example.mydsl.MyDsl.JsonOperation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleJsonOperation
entryRuleJsonOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsonOperationRule()); }
	iv_ruleJsonOperation=ruleJsonOperation
	{ $current=$iv_ruleJsonOperation.current; }
	EOF;

// Rule JsonOperation
ruleJsonOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getJsonOperationAccess().getFichierParserRuleCall_0());
		}
		this_Fichier_0=ruleFichier
		{
			$current = $this_Fichier_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getJsonOperationAccess().getAddParserRuleCall_1());
		}
		this_Add_1=ruleAdd
		{
			$current = $this_Add_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getJsonOperationAccess().getSearchParserRuleCall_2());
		}
		this_Search_2=ruleSearch
		{
			$current = $this_Search_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getJsonOperationAccess().getDeleteParserRuleCall_3());
		}
		this_Delete_3=ruleDelete
		{
			$current = $this_Delete_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getJsonOperationAccess().getClearParserRuleCall_4());
		}
		this_Clear_4=ruleClear
		{
			$current = $this_Clear_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePair
entryRulePair returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPairRule()); }
	iv_rulePair=rulePair
	{ $current=$iv_rulePair.current; }
	EOF;

// Rule Pair
rulePair returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_key_0_0=RULE_STRING
				{
					newLeafNode(lv_key_0_0, grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPairRule());
					}
					setWithLastConsumed(
						$current,
						"key",
						lv_key_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		this_COLON_SEPARATION_1=RULE_COLON_SEPARATION
		{
			newLeafNode(this_COLON_SEPARATION_1, grammarAccess.getPairAccess().getCOLON_SEPARATIONTerminalRuleCall_1());
		}
		(
			(
				lv_value_2_0=RULE_STRING
				{
					newLeafNode(lv_value_2_0, grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPairRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getValueAccess().getJsonParserRuleCall_0());
		}
		this_Json_0=ruleJson
		{
			$current = $this_Json_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getJStringParserRuleCall_1());
		}
		this_JString_1=ruleJString
		{
			$current = $this_JString_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getJArrayParserRuleCall_2());
		}
		this_JArray_2=ruleJArray
		{
			$current = $this_JArray_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getJBooleanParserRuleCall_3());
		}
		this_JBoolean_3=ruleJBoolean
		{
			$current = $this_JBoolean_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getNullParserRuleCall_4());
		}
		this_Null_4=ruleNull
		{
			$current = $this_Null_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getJNumberParserRuleCall_5());
		}
		this_JNumber_5=ruleJNumber
		{
			$current = $this_JNumber_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleJString
entryRuleJString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJStringRule()); }
	iv_ruleJString=ruleJString
	{ $current=$iv_ruleJString.current; }
	EOF;

// Rule JString
ruleJString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_val_0_0=RULE_STRING
			{
				newLeafNode(lv_val_0_0, grammarAccess.getJStringAccess().getValSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getJStringRule());
				}
				setWithLastConsumed(
					$current,
					"val",
					lv_val_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleJArray
entryRuleJArray returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJArrayRule()); }
	iv_ruleJArray=ruleJArray
	{ $current=$iv_ruleJArray.current; }
	EOF;

// Rule JArray
ruleJArray returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getJArrayAccess().getJArrayAction_0(),
					$current);
			}
		)
		this_LEFT_BRACKET_1=RULE_LEFT_BRACKET
		{
			newLeafNode(this_LEFT_BRACKET_1, grammarAccess.getJArrayAccess().getLEFT_BRACKETTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getJArrayAccess().getValuesValueParserRuleCall_2_0());
				}
				lv_values_2_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJArrayRule());
					}
					add(
						$current,
						"values",
						lv_values_2_0,
						"org.xtext.example.mydsl.MyDsl.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			this_PAIR_SEPARATION_3=RULE_PAIR_SEPARATION
			{
				newLeafNode(this_PAIR_SEPARATION_3, grammarAccess.getJArrayAccess().getPAIR_SEPARATIONTerminalRuleCall_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getJArrayAccess().getValuesValueParserRuleCall_3_1_0());
					}
					lv_values_4_0=ruleValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJArrayRule());
						}
						add(
							$current,
							"values",
							lv_values_4_0,
							"org.xtext.example.mydsl.MyDsl.Value");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		this_RIGHT_BRACKET_5=RULE_RIGHT_BRACKET
		{
			newLeafNode(this_RIGHT_BRACKET_5, grammarAccess.getJArrayAccess().getRIGHT_BRACKETTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleJBoolean
entryRuleJBoolean returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJBooleanRule()); }
	iv_ruleJBoolean=ruleJBoolean
	{ $current=$iv_ruleJBoolean.current; }
	EOF;

// Rule JBoolean
ruleJBoolean returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_val_0_1='true'
				{
					newLeafNode(lv_val_0_1, grammarAccess.getJBooleanAccess().getValTrueKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJBooleanRule());
					}
					setWithLastConsumed($current, "val", lv_val_0_1, null);
				}
				    |
				lv_val_0_2='false'
				{
					newLeafNode(lv_val_0_2, grammarAccess.getJBooleanAccess().getValFalseKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJBooleanRule());
					}
					setWithLastConsumed($current, "val", lv_val_0_2, null);
				}
			)
		)
	)
;

// Entry rule entryRuleNull
entryRuleNull returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNullRule()); }
	iv_ruleNull=ruleNull
	{ $current=$iv_ruleNull.current; }
	EOF;

// Rule Null
ruleNull returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_val_0_0='null'
			{
				newLeafNode(lv_val_0_0, grammarAccess.getNullAccess().getValNullKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNullRule());
				}
				setWithLastConsumed($current, "val", lv_val_0_0, "null");
			}
		)
	)
;

// Entry rule entryRuleJNumber
entryRuleJNumber returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJNumberRule()); }
	iv_ruleJNumber=ruleJNumber
	{ $current=$iv_ruleJNumber.current; }
	EOF;

// Rule JNumber
ruleJNumber returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getJNumberAccess().getJNumberAction_0(),
					$current);
			}
		)
		(
			otherlv_1='-'
			{
				newLeafNode(otherlv_1, grammarAccess.getJNumberAccess().getHyphenMinusKeyword_1());
			}
		)?
		(
			this_INT_2=RULE_INT
			{
				newLeafNode(this_INT_2, grammarAccess.getJNumberAccess().getINTTerminalRuleCall_2());
			}
		)?
		(
			otherlv_3='.'
			{
				newLeafNode(otherlv_3, grammarAccess.getJNumberAccess().getFullStopKeyword_3());
			}
		)?
		this_INT_4=RULE_INT
		{
			newLeafNode(this_INT_4, grammarAccess.getJNumberAccess().getINTTerminalRuleCall_4());
		}
		(
			(
				otherlv_5='E'
				{
					newLeafNode(otherlv_5, grammarAccess.getJNumberAccess().getEKeyword_5_0_0());
				}
				    |
				otherlv_6='e'
				{
					newLeafNode(otherlv_6, grammarAccess.getJNumberAccess().getEKeyword_5_0_1());
				}
			)
			(
				otherlv_7='-'
				{
					newLeafNode(otherlv_7, grammarAccess.getJNumberAccess().getHyphenMinusKeyword_5_1());
				}
			)?
			this_INT_8=RULE_INT
			{
				newLeafNode(this_INT_8, grammarAccess.getJNumberAccess().getINTTerminalRuleCall_5_2());
			}
		)?
	)
;

// Entry rule entryRuleFichier
entryRuleFichier returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFichierRule()); }
	iv_ruleFichier=ruleFichier
	{ $current=$iv_ruleFichier.current; }
	EOF;

// Rule Fichier
ruleFichier returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='file'
		{
			newLeafNode(otherlv_0, grammarAccess.getFichierAccess().getFileKeyword_0());
		}
		(
			(
				lv_fileID_1_0=RULE_ID
				{
					newLeafNode(lv_fileID_1_0, grammarAccess.getFichierAccess().getFileIDIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFichierRule());
					}
					setWithLastConsumed(
						$current,
						"fileID",
						lv_fileID_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getFichierAccess().getEqualsSignKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_STRING
				{
					newLeafNode(lv_name_3_0, grammarAccess.getFichierAccess().getNameSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFichierRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleAdd
entryRuleAdd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddRule()); }
	iv_ruleAdd=ruleAdd
	{ $current=$iv_ruleAdd.current; }
	EOF;

// Rule Add
ruleAdd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='add'
		{
			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
		}
		(
			(
				lv_fileID_1_0=RULE_ID
				{
					newLeafNode(lv_fileID_1_0, grammarAccess.getAddAccess().getFileIDIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddRule());
					}
					setWithLastConsumed(
						$current,
						"fileID",
						lv_fileID_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getAddAccess().getCommaKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAddAccess().getPairPairParserRuleCall_3_0());
				}
				lv_pair_3_0=rulePair
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAddRule());
					}
					set(
						$current,
						"pair",
						lv_pair_3_0,
						"org.xtext.example.mydsl.MyDsl.Pair");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleClear
entryRuleClear returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClearRule()); }
	iv_ruleClear=ruleClear
	{ $current=$iv_ruleClear.current; }
	EOF;

// Rule Clear
ruleClear returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='clear'
		{
			newLeafNode(otherlv_0, grammarAccess.getClearAccess().getClearKeyword_0());
		}
		(
			(
				lv_fileID_1_0=RULE_ID
				{
					newLeafNode(lv_fileID_1_0, grammarAccess.getClearAccess().getFileIDIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClearRule());
					}
					setWithLastConsumed(
						$current,
						"fileID",
						lv_fileID_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleSearch
entryRuleSearch returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSearchRule()); }
	iv_ruleSearch=ruleSearch
	{ $current=$iv_ruleSearch.current; }
	EOF;

// Rule Search
ruleSearch returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='search'
		{
			newLeafNode(otherlv_0, grammarAccess.getSearchAccess().getSearchKeyword_0());
		}
		(
			(
				lv_fileID_1_0=RULE_ID
				{
					newLeafNode(lv_fileID_1_0, grammarAccess.getSearchAccess().getFileIDIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSearchRule());
					}
					setWithLastConsumed(
						$current,
						"fileID",
						lv_fileID_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getSearchAccess().getCommaKeyword_2());
		}
		(
			(
				lv_key_3_0=RULE_STRING
				{
					newLeafNode(lv_key_3_0, grammarAccess.getSearchAccess().getKeySTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSearchRule());
					}
					setWithLastConsumed(
						$current,
						"key",
						lv_key_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleDelete
entryRuleDelete returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeleteRule()); }
	iv_ruleDelete=ruleDelete
	{ $current=$iv_ruleDelete.current; }
	EOF;

// Rule Delete
ruleDelete returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='delete'
		{
			newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDeleteKeyword_0());
		}
		(
			(
				lv_fileID_1_0=RULE_ID
				{
					newLeafNode(lv_fileID_1_0, grammarAccess.getDeleteAccess().getFileIDIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeleteRule());
					}
					setWithLastConsumed(
						$current,
						"fileID",
						lv_fileID_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getDeleteAccess().getCommaKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDeleteAccess().getPairPairParserRuleCall_3_0());
				}
				lv_pair_3_0=rulePair
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeleteRule());
					}
					set(
						$current,
						"pair",
						lv_pair_3_0,
						"org.xtext.example.mydsl.MyDsl.Pair");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_LEFT_BRACE : '{';

RULE_PAIR_SEPARATION : ';';

RULE_RIGHT_BRACE : '}';

RULE_COLON_SEPARATION : ':';

RULE_LEFT_BRACKET : '[';

RULE_RIGHT_BRACKET : ']';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
