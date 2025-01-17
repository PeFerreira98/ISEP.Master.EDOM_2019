/*
 * generated by Xtext 2.19.0
 */
grammar InternalDomain;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package pt.isep.edom.project.c3.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package pt.isep.edom.project.c3.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pt.isep.edom.project.c3.dsl.services.DomainGrammarAccess;

}

@parser::members {

 	private DomainGrammarAccess grammarAccess;

    public InternalDomainParser(TokenStream input, DomainGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "DomainModel";
   	}

   	@Override
   	protected DomainGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDomainModel
entryRuleDomainModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDomainModelRule()); }
	iv_ruleDomainModel=ruleDomainModel
	{ $current=$iv_ruleDomainModel.current; }
	EOF;

// Rule DomainModel
ruleDomainModel returns [EObject current=null]
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
					grammarAccess.getDomainModelAccess().getDomainModelAction_0(),
					$current);
			}
		)
		otherlv_1='DomainModel'
		{
			newLeafNode(otherlv_1, grammarAccess.getDomainModelAccess().getDomainModelKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainModelAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainModelRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"pt.isep.edom.project.c3.dsl.Domain.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='entities'
			{
				newLeafNode(otherlv_4, grammarAccess.getDomainModelAccess().getEntitiesKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_4_2_0());
					}
					lv_entities_6_0=ruleEntity
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDomainModelRule());
						}
						add(
							$current,
							"entities",
							lv_entities_6_0,
							"pt.isep.edom.project.c3.dsl.Domain.Entity");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getDomainModelAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_4_3_1_0());
						}
						lv_entities_8_0=ruleEntity
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDomainModelRule());
							}
							add(
								$current,
								"entities",
								lv_entities_8_0,
								"pt.isep.edom.project.c3.dsl.Domain.Entity");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		(
			otherlv_10='valueobject'
			{
				newLeafNode(otherlv_10, grammarAccess.getDomainModelAccess().getValueobjectKeyword_5_0());
			}
			otherlv_11='{'
			{
				newLeafNode(otherlv_11, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDomainModelAccess().getValueobjectValueObjectParserRuleCall_5_2_0());
					}
					lv_valueobject_12_0=ruleValueObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDomainModelRule());
						}
						add(
							$current,
							"valueobject",
							lv_valueobject_12_0,
							"pt.isep.edom.project.c3.dsl.Domain.ValueObject");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_13=','
				{
					newLeafNode(otherlv_13, grammarAccess.getDomainModelAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDomainModelAccess().getValueobjectValueObjectParserRuleCall_5_3_1_0());
						}
						lv_valueobject_14_0=ruleValueObject
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDomainModelRule());
							}
							add(
								$current,
								"valueobject",
								lv_valueobject_14_0,
								"pt.isep.edom.project.c3.dsl.Domain.ValueObject");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_15='}'
			{
				newLeafNode(otherlv_15, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_root_0_0='root'
				{
					newLeafNode(lv_root_0_0, grammarAccess.getEntityAccess().getRootRootKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed($current, "root", true, "root");
				}
			)
		)
		otherlv_1='Entity'
		{
			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"pt.isep.edom.project.c3.dsl.Domain.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='fields'
			{
				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getFieldsKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_0());
					}
					lv_fields_6_0=ruleField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEntityRule());
						}
						add(
							$current,
							"fields",
							lv_fields_6_0,
							"pt.isep.edom.project.c3.dsl.Domain.Field");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_3_1_0());
						}
						lv_fields_8_0=ruleField
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEntityRule());
							}
							add(
								$current,
								"fields",
								lv_fields_8_0,
								"pt.isep.edom.project.c3.dsl.Domain.Field");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		(
			otherlv_10='references'
			{
				newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getReferencesKeyword_5_0());
			}
			otherlv_11='{'
			{
				newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEntityAccess().getReferencesReferenceParserRuleCall_5_2_0());
					}
					lv_references_12_0=ruleReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEntityRule());
						}
						add(
							$current,
							"references",
							lv_references_12_0,
							"pt.isep.edom.project.c3.dsl.Domain.Reference");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_13=','
				{
					newLeafNode(otherlv_13, grammarAccess.getEntityAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEntityAccess().getReferencesReferenceParserRuleCall_5_3_1_0());
						}
						lv_references_14_0=ruleReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEntityRule());
							}
							add(
								$current,
								"references",
								lv_references_14_0,
								"pt.isep.edom.project.c3.dsl.Domain.Reference");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_15='}'
			{
				newLeafNode(otherlv_15, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleValueObject
entryRuleValueObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueObjectRule()); }
	iv_ruleValueObject=ruleValueObject
	{ $current=$iv_ruleValueObject.current; }
	EOF;

// Rule ValueObject
ruleValueObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_isId_0_0='isId'
				{
					newLeafNode(lv_isId_0_0, grammarAccess.getValueObjectAccess().getIsIdIsIdKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValueObjectRule());
					}
					setWithLastConsumed($current, "isId", true, "isId");
				}
			)
		)
		otherlv_1='ValueObject'
		{
			newLeafNode(otherlv_1, grammarAccess.getValueObjectAccess().getValueObjectKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getValueObjectAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getValueObjectRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"pt.isep.edom.project.c3.dsl.Domain.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getValueObjectAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='field'
		{
			newLeafNode(otherlv_4, grammarAccess.getValueObjectAccess().getFieldKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getValueObjectAccess().getFieldFieldParserRuleCall_5_0());
				}
				lv_field_5_0=ruleField
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getValueObjectRule());
					}
					set(
						$current,
						"field",
						lv_field_5_0,
						"pt.isep.edom.project.c3.dsl.Domain.Field");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getValueObjectAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleField
entryRuleField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldRule()); }
	iv_ruleField=ruleField
	{ $current=$iv_ruleField.current; }
	EOF;

// Rule Field
ruleField returns [EObject current=null]
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
					grammarAccess.getFieldAccess().getFieldAction_0(),
					$current);
			}
		)
		otherlv_1='Field'
		{
			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getFieldKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"pt.isep.edom.project.c3.dsl.Domain.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='type'
			{
				newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getTypeKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_4_1_0());
					}
					lv_type_5_0=ruleFieldType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFieldRule());
						}
						set(
							$current,
							"type",
							lv_type_5_0,
							"pt.isep.edom.project.c3.dsl.Domain.FieldType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleReference
entryRuleReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferenceRule()); }
	iv_ruleReference=ruleReference
	{ $current=$iv_ruleReference.current; }
	EOF;

// Rule Reference
ruleReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Reference'
		{
			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getReferenceKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"pt.isep.edom.project.c3.dsl.Domain.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='upperBound'
		{
			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getUpperBoundKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceAccess().getUpperBoundEIntParserRuleCall_4_0());
				}
				lv_upperBound_4_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceRule());
					}
					set(
						$current,
						"upperBound",
						lv_upperBound_4_0,
						"pt.isep.edom.project.c3.dsl.Domain.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='lowerBound'
		{
			newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getLowerBoundKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getReferenceAccess().getLowerBoundEIntParserRuleCall_6_0());
				}
				lv_lowerBound_6_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferenceRule());
					}
					set(
						$current,
						"lowerBound",
						lv_lowerBound_6_0,
						"pt.isep.edom.project.c3.dsl.Domain.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7='entity'
			{
				newLeafNode(otherlv_7, grammarAccess.getReferenceAccess().getEntityKeyword_7_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getReferenceRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_7_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='valueobject'
			{
				newLeafNode(otherlv_9, grammarAccess.getReferenceAccess().getValueobjectKeyword_8_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getReferenceRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getReferenceAccess().getValueobjectValueObjectCrossReference_8_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Rule FieldType
ruleFieldType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='STRING'
			{
				$current = grammarAccess.getFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='INTEGER'
			{
				$current = grammarAccess.getFieldTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getFieldTypeAccess().getINTEGEREnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='REAL'
			{
				$current = grammarAccess.getFieldTypeAccess().getREALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getFieldTypeAccess().getREALEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='BOOL'
			{
				$current = grammarAccess.getFieldTypeAccess().getBOOLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getFieldTypeAccess().getBOOLEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
