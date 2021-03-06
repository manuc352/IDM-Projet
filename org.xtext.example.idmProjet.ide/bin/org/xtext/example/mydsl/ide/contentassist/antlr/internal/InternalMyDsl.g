/*
 * generated by Xtext 2.24.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleJson
entryRuleJson
:
{ before(grammarAccess.getJsonRule()); }
	 ruleJson
{ after(grammarAccess.getJsonRule()); } 
	 EOF 
;

// Rule Json
ruleJson 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJsonAccess().getGroup()); }
		(rule__Json__Group__0)
		{ after(grammarAccess.getJsonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJsonOperation
entryRuleJsonOperation
:
{ before(grammarAccess.getJsonOperationRule()); }
	 ruleJsonOperation
{ after(grammarAccess.getJsonOperationRule()); } 
	 EOF 
;

// Rule JsonOperation
ruleJsonOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJsonOperationAccess().getAlternatives()); }
		(rule__JsonOperation__Alternatives)
		{ after(grammarAccess.getJsonOperationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePair
entryRulePair
:
{ before(grammarAccess.getPairRule()); }
	 rulePair
{ after(grammarAccess.getPairRule()); } 
	 EOF 
;

// Rule Pair
rulePair 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPairAccess().getGroup()); }
		(rule__Pair__Group__0)
		{ after(grammarAccess.getPairAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleValue
entryRuleValue
:
{ before(grammarAccess.getValueRule()); }
	 ruleValue
{ after(grammarAccess.getValueRule()); } 
	 EOF 
;

// Rule Value
ruleValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getValueAccess().getAlternatives()); }
		(rule__Value__Alternatives)
		{ after(grammarAccess.getValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJString
entryRuleJString
:
{ before(grammarAccess.getJStringRule()); }
	 ruleJString
{ after(grammarAccess.getJStringRule()); } 
	 EOF 
;

// Rule JString
ruleJString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJStringAccess().getValAssignment()); }
		(rule__JString__ValAssignment)
		{ after(grammarAccess.getJStringAccess().getValAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJArray
entryRuleJArray
:
{ before(grammarAccess.getJArrayRule()); }
	 ruleJArray
{ after(grammarAccess.getJArrayRule()); } 
	 EOF 
;

// Rule JArray
ruleJArray 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJArrayAccess().getGroup()); }
		(rule__JArray__Group__0)
		{ after(grammarAccess.getJArrayAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJBoolean
entryRuleJBoolean
:
{ before(grammarAccess.getJBooleanRule()); }
	 ruleJBoolean
{ after(grammarAccess.getJBooleanRule()); } 
	 EOF 
;

// Rule JBoolean
ruleJBoolean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJBooleanAccess().getValAssignment()); }
		(rule__JBoolean__ValAssignment)
		{ after(grammarAccess.getJBooleanAccess().getValAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNull
entryRuleNull
:
{ before(grammarAccess.getNullRule()); }
	 ruleNull
{ after(grammarAccess.getNullRule()); } 
	 EOF 
;

// Rule Null
ruleNull 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNullAccess().getValAssignment()); }
		(rule__Null__ValAssignment)
		{ after(grammarAccess.getNullAccess().getValAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJNumber
entryRuleJNumber
:
{ before(grammarAccess.getJNumberRule()); }
	 ruleJNumber
{ after(grammarAccess.getJNumberRule()); } 
	 EOF 
;

// Rule JNumber
ruleJNumber 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJNumberAccess().getGroup()); }
		(rule__JNumber__Group__0)
		{ after(grammarAccess.getJNumberAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFichier
entryRuleFichier
:
{ before(grammarAccess.getFichierRule()); }
	 ruleFichier
{ after(grammarAccess.getFichierRule()); } 
	 EOF 
;

// Rule Fichier
ruleFichier 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFichierAccess().getGroup()); }
		(rule__Fichier__Group__0)
		{ after(grammarAccess.getFichierAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAdd
entryRuleAdd
:
{ before(grammarAccess.getAddRule()); }
	 ruleAdd
{ after(grammarAccess.getAddRule()); } 
	 EOF 
;

// Rule Add
ruleAdd 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAddAccess().getGroup()); }
		(rule__Add__Group__0)
		{ after(grammarAccess.getAddAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClear
entryRuleClear
:
{ before(grammarAccess.getClearRule()); }
	 ruleClear
{ after(grammarAccess.getClearRule()); } 
	 EOF 
;

// Rule Clear
ruleClear 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClearAccess().getGroup()); }
		(rule__Clear__Group__0)
		{ after(grammarAccess.getClearAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSearch
entryRuleSearch
:
{ before(grammarAccess.getSearchRule()); }
	 ruleSearch
{ after(grammarAccess.getSearchRule()); } 
	 EOF 
;

// Rule Search
ruleSearch 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSearchAccess().getGroup()); }
		(rule__Search__Group__0)
		{ after(grammarAccess.getSearchAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDelete
entryRuleDelete
:
{ before(grammarAccess.getDeleteRule()); }
	 ruleDelete
{ after(grammarAccess.getDeleteRule()); } 
	 EOF 
;

// Rule Delete
ruleDelete 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeleteAccess().getGroup()); }
		(rule__Delete__Group__0)
		{ after(grammarAccess.getDeleteAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JsonOperation__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJsonOperationAccess().getFichierParserRuleCall_0()); }
		ruleFichier
		{ after(grammarAccess.getJsonOperationAccess().getFichierParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getJsonOperationAccess().getAddParserRuleCall_1()); }
		ruleAdd
		{ after(grammarAccess.getJsonOperationAccess().getAddParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getJsonOperationAccess().getSearchParserRuleCall_2()); }
		ruleSearch
		{ after(grammarAccess.getJsonOperationAccess().getSearchParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getJsonOperationAccess().getDeleteParserRuleCall_3()); }
		ruleDelete
		{ after(grammarAccess.getJsonOperationAccess().getDeleteParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getJsonOperationAccess().getClearParserRuleCall_4()); }
		ruleClear
		{ after(grammarAccess.getJsonOperationAccess().getClearParserRuleCall_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValueAccess().getJsonParserRuleCall_0()); }
		ruleJson
		{ after(grammarAccess.getValueAccess().getJsonParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getJStringParserRuleCall_1()); }
		ruleJString
		{ after(grammarAccess.getValueAccess().getJStringParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getJArrayParserRuleCall_2()); }
		ruleJArray
		{ after(grammarAccess.getValueAccess().getJArrayParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getJBooleanParserRuleCall_3()); }
		ruleJBoolean
		{ after(grammarAccess.getValueAccess().getJBooleanParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getNullParserRuleCall_4()); }
		ruleNull
		{ after(grammarAccess.getValueAccess().getNullParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getJNumberParserRuleCall_5()); }
		ruleJNumber
		{ after(grammarAccess.getValueAccess().getJNumberParserRuleCall_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JBoolean__ValAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJBooleanAccess().getValTrueKeyword_0_0()); }
		'true'
		{ after(grammarAccess.getJBooleanAccess().getValTrueKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getJBooleanAccess().getValFalseKeyword_0_1()); }
		'false'
		{ after(grammarAccess.getJBooleanAccess().getValFalseKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Alternatives_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJNumberAccess().getEKeyword_5_0_0()); }
		'E'
		{ after(grammarAccess.getJNumberAccess().getEKeyword_5_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getJNumberAccess().getEKeyword_5_0_1()); }
		'e'
		{ after(grammarAccess.getJNumberAccess().getEKeyword_5_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Json__Group__0__Impl
	rule__Json__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJsonAccess().getJsonAction_0()); }
	()
	{ after(grammarAccess.getJsonAccess().getJsonAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Json__Group__1__Impl
	rule__Json__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJsonAccess().getLEFT_BRACETerminalRuleCall_1()); }
	RULE_LEFT_BRACE
	{ after(grammarAccess.getJsonAccess().getLEFT_BRACETerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Json__Group__2__Impl
	rule__Json__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJsonAccess().getPairsAssignment_2()); }
	(rule__Json__PairsAssignment_2)?
	{ after(grammarAccess.getJsonAccess().getPairsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Json__Group__3__Impl
	rule__Json__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJsonAccess().getGroup_3()); }
	(rule__Json__Group_3__0)*
	{ after(grammarAccess.getJsonAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Json__Group__4__Impl
	rule__Json__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJsonAccess().getRIGHT_BRACETerminalRuleCall_4()); }
	RULE_RIGHT_BRACE
	{ after(grammarAccess.getJsonAccess().getRIGHT_BRACETerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Json__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJsonAccess().getOperationsAssignment_5()); }
	(rule__Json__OperationsAssignment_5)*
	{ after(grammarAccess.getJsonAccess().getOperationsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Json__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Json__Group_3__0__Impl
	rule__Json__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJsonAccess().getPAIR_SEPARATIONTerminalRuleCall_3_0()); }
	RULE_PAIR_SEPARATION
	{ after(grammarAccess.getJsonAccess().getPAIR_SEPARATIONTerminalRuleCall_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Json__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJsonAccess().getPairsAssignment_3_1()); }
	(rule__Json__PairsAssignment_3_1)
	{ after(grammarAccess.getJsonAccess().getPairsAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pair__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pair__Group__0__Impl
	rule__Pair__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pair__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPairAccess().getKeyAssignment_0()); }
	(rule__Pair__KeyAssignment_0)
	{ after(grammarAccess.getPairAccess().getKeyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pair__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pair__Group__1__Impl
	rule__Pair__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pair__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPairAccess().getCOLON_SEPARATIONTerminalRuleCall_1()); }
	RULE_COLON_SEPARATION
	{ after(grammarAccess.getPairAccess().getCOLON_SEPARATIONTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pair__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pair__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pair__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPairAccess().getValueAssignment_2()); }
	(rule__Pair__ValueAssignment_2)
	{ after(grammarAccess.getPairAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JArray__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JArray__Group__0__Impl
	rule__JArray__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJArrayAccess().getJArrayAction_0()); }
	()
	{ after(grammarAccess.getJArrayAccess().getJArrayAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JArray__Group__1__Impl
	rule__JArray__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJArrayAccess().getLEFT_BRACKETTerminalRuleCall_1()); }
	RULE_LEFT_BRACKET
	{ after(grammarAccess.getJArrayAccess().getLEFT_BRACKETTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JArray__Group__2__Impl
	rule__JArray__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJArrayAccess().getValuesAssignment_2()); }
	(rule__JArray__ValuesAssignment_2)?
	{ after(grammarAccess.getJArrayAccess().getValuesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JArray__Group__3__Impl
	rule__JArray__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJArrayAccess().getGroup_3()); }
	(rule__JArray__Group_3__0)*
	{ after(grammarAccess.getJArrayAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JArray__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJArrayAccess().getRIGHT_BRACKETTerminalRuleCall_4()); }
	RULE_RIGHT_BRACKET
	{ after(grammarAccess.getJArrayAccess().getRIGHT_BRACKETTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JArray__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JArray__Group_3__0__Impl
	rule__JArray__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJArrayAccess().getPAIR_SEPARATIONTerminalRuleCall_3_0()); }
	RULE_PAIR_SEPARATION
	{ after(grammarAccess.getJArrayAccess().getPAIR_SEPARATIONTerminalRuleCall_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JArray__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJArrayAccess().getValuesAssignment_3_1()); }
	(rule__JArray__ValuesAssignment_3_1)
	{ after(grammarAccess.getJArrayAccess().getValuesAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JNumber__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JNumber__Group__0__Impl
	rule__JNumber__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJNumberAccess().getJNumberAction_0()); }
	()
	{ after(grammarAccess.getJNumberAccess().getJNumberAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JNumber__Group__1__Impl
	rule__JNumber__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJNumberAccess().getHyphenMinusKeyword_1()); }
	('-')?
	{ after(grammarAccess.getJNumberAccess().getHyphenMinusKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JNumber__Group__2__Impl
	rule__JNumber__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJNumberAccess().getINTTerminalRuleCall_2()); }
	(RULE_INT)?
	{ after(grammarAccess.getJNumberAccess().getINTTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JNumber__Group__3__Impl
	rule__JNumber__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJNumberAccess().getFullStopKeyword_3()); }
	('.')?
	{ after(grammarAccess.getJNumberAccess().getFullStopKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JNumber__Group__4__Impl
	rule__JNumber__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJNumberAccess().getINTTerminalRuleCall_4()); }
	RULE_INT
	{ after(grammarAccess.getJNumberAccess().getINTTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JNumber__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJNumberAccess().getGroup_5()); }
	(rule__JNumber__Group_5__0)?
	{ after(grammarAccess.getJNumberAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JNumber__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JNumber__Group_5__0__Impl
	rule__JNumber__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJNumberAccess().getAlternatives_5_0()); }
	(rule__JNumber__Alternatives_5_0)
	{ after(grammarAccess.getJNumberAccess().getAlternatives_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JNumber__Group_5__1__Impl
	rule__JNumber__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJNumberAccess().getHyphenMinusKeyword_5_1()); }
	('-')?
	{ after(grammarAccess.getJNumberAccess().getHyphenMinusKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JNumber__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JNumber__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJNumberAccess().getINTTerminalRuleCall_5_2()); }
	RULE_INT
	{ after(grammarAccess.getJNumberAccess().getINTTerminalRuleCall_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Fichier__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fichier__Group__0__Impl
	rule__Fichier__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Fichier__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFichierAccess().getFileKeyword_0()); }
	'file'
	{ after(grammarAccess.getFichierAccess().getFileKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fichier__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fichier__Group__1__Impl
	rule__Fichier__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Fichier__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFichierAccess().getFileIDAssignment_1()); }
	(rule__Fichier__FileIDAssignment_1)
	{ after(grammarAccess.getFichierAccess().getFileIDAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fichier__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fichier__Group__2__Impl
	rule__Fichier__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Fichier__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFichierAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getFichierAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fichier__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fichier__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Fichier__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFichierAccess().getNameAssignment_3()); }
	(rule__Fichier__NameAssignment_3)
	{ after(grammarAccess.getFichierAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Add__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group__0__Impl
	rule__Add__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getAddKeyword_0()); }
	'add'
	{ after(grammarAccess.getAddAccess().getAddKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group__1__Impl
	rule__Add__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getFileIDAssignment_1()); }
	(rule__Add__FileIDAssignment_1)
	{ after(grammarAccess.getAddAccess().getFileIDAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group__2__Impl
	rule__Add__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getCommaKeyword_2()); }
	','
	{ after(grammarAccess.getAddAccess().getCommaKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getPairAssignment_3()); }
	(rule__Add__PairAssignment_3)
	{ after(grammarAccess.getAddAccess().getPairAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Clear__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Clear__Group__0__Impl
	rule__Clear__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Clear__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClearAccess().getClearKeyword_0()); }
	'clear'
	{ after(grammarAccess.getClearAccess().getClearKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Clear__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Clear__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Clear__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClearAccess().getFileIDAssignment_1()); }
	(rule__Clear__FileIDAssignment_1)
	{ after(grammarAccess.getClearAccess().getFileIDAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Search__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Search__Group__0__Impl
	rule__Search__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSearchAccess().getSearchKeyword_0()); }
	'search'
	{ after(grammarAccess.getSearchAccess().getSearchKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Search__Group__1__Impl
	rule__Search__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSearchAccess().getFileIDAssignment_1()); }
	(rule__Search__FileIDAssignment_1)
	{ after(grammarAccess.getSearchAccess().getFileIDAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Search__Group__2__Impl
	rule__Search__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSearchAccess().getCommaKeyword_2()); }
	','
	{ after(grammarAccess.getSearchAccess().getCommaKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Search__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSearchAccess().getKeyAssignment_3()); }
	(rule__Search__KeyAssignment_3)
	{ after(grammarAccess.getSearchAccess().getKeyAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Delete__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delete__Group__0__Impl
	rule__Delete__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); }
	'delete'
	{ after(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delete__Group__1__Impl
	rule__Delete__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeleteAccess().getFileIDAssignment_1()); }
	(rule__Delete__FileIDAssignment_1)
	{ after(grammarAccess.getDeleteAccess().getFileIDAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delete__Group__2__Impl
	rule__Delete__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeleteAccess().getCommaKeyword_2()); }
	','
	{ after(grammarAccess.getDeleteAccess().getCommaKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delete__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeleteAccess().getPairAssignment_3()); }
	(rule__Delete__PairAssignment_3)
	{ after(grammarAccess.getDeleteAccess().getPairAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Json__PairsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJsonAccess().getPairsPairParserRuleCall_2_0()); }
		rulePair
		{ after(grammarAccess.getJsonAccess().getPairsPairParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__PairsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJsonAccess().getPairsPairParserRuleCall_3_1_0()); }
		rulePair
		{ after(grammarAccess.getJsonAccess().getPairsPairParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Json__OperationsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJsonAccess().getOperationsJsonOperationParserRuleCall_5_0()); }
		ruleJsonOperation
		{ after(grammarAccess.getJsonAccess().getOperationsJsonOperationParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pair__KeyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_0_0()); }
		RULE_STRING
		{ after(grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pair__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JString__ValAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJStringAccess().getValSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getJStringAccess().getValSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__ValuesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJArrayAccess().getValuesValueParserRuleCall_2_0()); }
		ruleValue
		{ after(grammarAccess.getJArrayAccess().getValuesValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__ValuesAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJArrayAccess().getValuesValueParserRuleCall_3_1_0()); }
		ruleValue
		{ after(grammarAccess.getJArrayAccess().getValuesValueParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JBoolean__ValAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJBooleanAccess().getValAlternatives_0()); }
		(rule__JBoolean__ValAlternatives_0)
		{ after(grammarAccess.getJBooleanAccess().getValAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Null__ValAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNullAccess().getValNullKeyword_0()); }
		(
			{ before(grammarAccess.getNullAccess().getValNullKeyword_0()); }
			'null'
			{ after(grammarAccess.getNullAccess().getValNullKeyword_0()); }
		)
		{ after(grammarAccess.getNullAccess().getValNullKeyword_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fichier__FileIDAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFichierAccess().getFileIDIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFichierAccess().getFileIDIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fichier__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFichierAccess().getNameSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getFichierAccess().getNameSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__FileIDAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddAccess().getFileIDIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAddAccess().getFileIDIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__PairAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddAccess().getPairPairParserRuleCall_3_0()); }
		rulePair
		{ after(grammarAccess.getAddAccess().getPairPairParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Clear__FileIDAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClearAccess().getFileIDIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getClearAccess().getFileIDIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__FileIDAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSearchAccess().getFileIDIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSearchAccess().getFileIDIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__KeyAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSearchAccess().getKeySTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getSearchAccess().getKeySTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__FileIDAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeleteAccess().getFileIDIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDeleteAccess().getFileIDIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__PairAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeleteAccess().getPairPairParserRuleCall_3_0()); }
		rulePair
		{ after(grammarAccess.getDeleteAccess().getPairPairParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

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
