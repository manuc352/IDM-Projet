/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Add;
import org.xtext.example.mydsl.myDsl.Clear;
import org.xtext.example.mydsl.myDsl.Delete;
import org.xtext.example.mydsl.myDsl.Fichier;
import org.xtext.example.mydsl.myDsl.JArray;
import org.xtext.example.mydsl.myDsl.JBoolean;
import org.xtext.example.mydsl.myDsl.JNumber;
import org.xtext.example.mydsl.myDsl.JString;
import org.xtext.example.mydsl.myDsl.Json;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Null;
import org.xtext.example.mydsl.myDsl.Pair;
import org.xtext.example.mydsl.myDsl.Search;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ADD:
				sequence_Add(context, (Add) semanticObject); 
				return; 
			case MyDslPackage.CLEAR:
				sequence_Clear(context, (Clear) semanticObject); 
				return; 
			case MyDslPackage.DELETE:
				sequence_Delete(context, (Delete) semanticObject); 
				return; 
			case MyDslPackage.FICHIER:
				sequence_Fichier(context, (Fichier) semanticObject); 
				return; 
			case MyDslPackage.JARRAY:
				sequence_JArray(context, (JArray) semanticObject); 
				return; 
			case MyDslPackage.JBOOLEAN:
				sequence_JBoolean(context, (JBoolean) semanticObject); 
				return; 
			case MyDslPackage.JNUMBER:
				sequence_JNumber(context, (JNumber) semanticObject); 
				return; 
			case MyDslPackage.JSTRING:
				sequence_JString(context, (JString) semanticObject); 
				return; 
			case MyDslPackage.JSON:
				sequence_Json(context, (Json) semanticObject); 
				return; 
			case MyDslPackage.NULL:
				sequence_Null(context, (Null) semanticObject); 
				return; 
			case MyDslPackage.PAIR:
				sequence_Pair(context, (Pair) semanticObject); 
				return; 
			case MyDslPackage.SEARCH:
				sequence_Search(context, (Search) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     JsonOperation returns Add
	 *     Add returns Add
	 *
	 * Constraint:
	 *     (fileID=ID pair=Pair)
	 */
	protected void sequence_Add(ISerializationContext context, Add semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.JSON_OPERATION__FILE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.JSON_OPERATION__FILE_ID));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ADD__PAIR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ADD__PAIR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddAccess().getFileIDIDTerminalRuleCall_1_0(), semanticObject.getFileID());
		feeder.accept(grammarAccess.getAddAccess().getPairPairParserRuleCall_3_0(), semanticObject.getPair());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JsonOperation returns Clear
	 *     Clear returns Clear
	 *
	 * Constraint:
	 *     fileID=ID
	 */
	protected void sequence_Clear(ISerializationContext context, Clear semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.JSON_OPERATION__FILE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.JSON_OPERATION__FILE_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClearAccess().getFileIDIDTerminalRuleCall_1_0(), semanticObject.getFileID());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JsonOperation returns Delete
	 *     Delete returns Delete
	 *
	 * Constraint:
	 *     (fileID=ID pair=Pair)
	 */
	protected void sequence_Delete(ISerializationContext context, Delete semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.JSON_OPERATION__FILE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.JSON_OPERATION__FILE_ID));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DELETE__PAIR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DELETE__PAIR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeleteAccess().getFileIDIDTerminalRuleCall_1_0(), semanticObject.getFileID());
		feeder.accept(grammarAccess.getDeleteAccess().getPairPairParserRuleCall_3_0(), semanticObject.getPair());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JsonOperation returns Fichier
	 *     Fichier returns Fichier
	 *
	 * Constraint:
	 *     (fileID=ID name=STRING)
	 */
	protected void sequence_Fichier(ISerializationContext context, Fichier semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.JSON_OPERATION__FILE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.JSON_OPERATION__FILE_ID));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FICHIER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FICHIER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFichierAccess().getFileIDIDTerminalRuleCall_1_0(), semanticObject.getFileID());
		feeder.accept(grammarAccess.getFichierAccess().getNameSTRINGTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns JArray
	 *     JArray returns JArray
	 *
	 * Constraint:
	 *     (values+=Value? values+=Value*)
	 */
	protected void sequence_JArray(ISerializationContext context, JArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns JBoolean
	 *     JBoolean returns JBoolean
	 *
	 * Constraint:
	 *     (val='true' | val='false')
	 */
	protected void sequence_JBoolean(ISerializationContext context, JBoolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns JNumber
	 *     JNumber returns JNumber
	 *
	 * Constraint:
	 *     {JNumber}
	 */
	protected void sequence_JNumber(ISerializationContext context, JNumber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns JString
	 *     JString returns JString
	 *
	 * Constraint:
	 *     val=STRING
	 */
	protected void sequence_JString(ISerializationContext context, JString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.JSTRING__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.JSTRING__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJStringAccess().getValSTRINGTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Json returns Json
	 *     Value returns Json
	 *
	 * Constraint:
	 *     (pairs+=Pair? pairs+=Pair* operations+=JsonOperation*)
	 */
	protected void sequence_Json(ISerializationContext context, Json semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Null
	 *     Null returns Null
	 *
	 * Constraint:
	 *     val='null'
	 */
	protected void sequence_Null(ISerializationContext context, Null semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NULL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NULL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNullAccess().getValNullKeyword_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pair returns Pair
	 *
	 * Constraint:
	 *     (key=STRING value=STRING)
	 */
	protected void sequence_Pair(ISerializationContext context, Pair semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PAIR__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PAIR__KEY));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PAIR__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JsonOperation returns Search
	 *     Search returns Search
	 *
	 * Constraint:
	 *     (fileID=ID key=STRING)
	 */
	protected void sequence_Search(ISerializationContext context, Search semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.JSON_OPERATION__FILE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.JSON_OPERATION__FILE_ID));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SEARCH__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SEARCH__KEY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSearchAccess().getFileIDIDTerminalRuleCall_1_0(), semanticObject.getFileID());
		feeder.accept(grammarAccess.getSearchAccess().getKeySTRINGTerminalRuleCall_3_0(), semanticObject.getKey());
		feeder.finish();
	}
	
	
}
