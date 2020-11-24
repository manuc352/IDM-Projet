/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getJsonOperationAccess().getAlternatives(), "rule__JsonOperation__Alternatives");
			builder.put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
			builder.put(grammarAccess.getJBooleanAccess().getValAlternatives_0(), "rule__JBoolean__ValAlternatives_0");
			builder.put(grammarAccess.getJNumberAccess().getAlternatives_5_0(), "rule__JNumber__Alternatives_5_0");
			builder.put(grammarAccess.getJsonAccess().getGroup(), "rule__Json__Group__0");
			builder.put(grammarAccess.getJsonAccess().getGroup_3(), "rule__Json__Group_3__0");
			builder.put(grammarAccess.getPairAccess().getGroup(), "rule__Pair__Group__0");
			builder.put(grammarAccess.getJArrayAccess().getGroup(), "rule__JArray__Group__0");
			builder.put(grammarAccess.getJArrayAccess().getGroup_3(), "rule__JArray__Group_3__0");
			builder.put(grammarAccess.getJNumberAccess().getGroup(), "rule__JNumber__Group__0");
			builder.put(grammarAccess.getJNumberAccess().getGroup_5(), "rule__JNumber__Group_5__0");
			builder.put(grammarAccess.getFichierAccess().getGroup(), "rule__Fichier__Group__0");
			builder.put(grammarAccess.getAddAccess().getGroup(), "rule__Add__Group__0");
			builder.put(grammarAccess.getSearchAccess().getGroup(), "rule__Search__Group__0");
			builder.put(grammarAccess.getDeleteAccess().getGroup(), "rule__Delete__Group__0");
			builder.put(grammarAccess.getJsonAccess().getPairsAssignment_2(), "rule__Json__PairsAssignment_2");
			builder.put(grammarAccess.getJsonAccess().getPairsAssignment_3_1(), "rule__Json__PairsAssignment_3_1");
			builder.put(grammarAccess.getJsonAccess().getOperationsAssignment_5(), "rule__Json__OperationsAssignment_5");
			builder.put(grammarAccess.getPairAccess().getKeyAssignment_0(), "rule__Pair__KeyAssignment_0");
			builder.put(grammarAccess.getPairAccess().getValueAssignment_2(), "rule__Pair__ValueAssignment_2");
			builder.put(grammarAccess.getJStringAccess().getValAssignment(), "rule__JString__ValAssignment");
			builder.put(grammarAccess.getJArrayAccess().getValuesAssignment_2(), "rule__JArray__ValuesAssignment_2");
			builder.put(grammarAccess.getJArrayAccess().getValuesAssignment_3_1(), "rule__JArray__ValuesAssignment_3_1");
			builder.put(grammarAccess.getJBooleanAccess().getValAssignment(), "rule__JBoolean__ValAssignment");
			builder.put(grammarAccess.getNullAccess().getValAssignment(), "rule__Null__ValAssignment");
			builder.put(grammarAccess.getFichierAccess().getFileIDAssignment_1(), "rule__Fichier__FileIDAssignment_1");
			builder.put(grammarAccess.getFichierAccess().getNameAssignment_3(), "rule__Fichier__NameAssignment_3");
			builder.put(grammarAccess.getSearchAccess().getKeyIdAssignment_1(), "rule__Search__KeyIdAssignment_1");
			builder.put(grammarAccess.getSearchAccess().getKeyAssignment_3(), "rule__Search__KeyAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
