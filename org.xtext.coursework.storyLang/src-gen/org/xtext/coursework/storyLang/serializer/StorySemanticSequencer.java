/*
 * generated by Xtext 2.25.0
 */
package org.xtext.coursework.storyLang.serializer;

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
import org.xtext.coursework.storyLang.services.StoryGrammarAccess;
import org.xtext.coursework.storyLang.story.AmountStatement;
import org.xtext.coursework.storyLang.story.MoodStatement;
import org.xtext.coursework.storyLang.story.MoveStatement;
import org.xtext.coursework.storyLang.story.NearbyStatement;
import org.xtext.coursework.storyLang.story.PathStatement;
import org.xtext.coursework.storyLang.story.PlaceStatement;
import org.xtext.coursework.storyLang.story.StoryPackage;
import org.xtext.coursework.storyLang.story.StoryProgram;
import org.xtext.coursework.storyLang.story.SubstanceStatement;

@SuppressWarnings("all")
public class StorySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StoryGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == StoryPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case StoryPackage.AMOUNT_STATEMENT:
				sequence_AmountStatement(context, (AmountStatement) semanticObject); 
				return; 
			case StoryPackage.MOOD_STATEMENT:
				sequence_MoodStatement(context, (MoodStatement) semanticObject); 
				return; 
			case StoryPackage.MOVE_STATEMENT:
				sequence_MoveStatement(context, (MoveStatement) semanticObject); 
				return; 
			case StoryPackage.NEARBY_STATEMENT:
				sequence_NearbyStatement(context, (NearbyStatement) semanticObject); 
				return; 
			case StoryPackage.PATH_STATEMENT:
				sequence_PathStatement(context, (PathStatement) semanticObject); 
				return; 
			case StoryPackage.PLACE_STATEMENT:
				sequence_PlaceStatement(context, (PlaceStatement) semanticObject); 
				return; 
			case StoryPackage.STORY_PROGRAM:
				sequence_StoryProgram(context, (StoryProgram) semanticObject); 
				return; 
			case StoryPackage.SUBSTANCE_STATEMENT:
				sequence_SubstanceStatement(context, (SubstanceStatement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns AmountStatement
	 *     AmountStatement returns AmountStatement
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_AmountStatement(ISerializationContext context, AmountStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StoryPackage.Literals.AMOUNT_STATEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StoryPackage.Literals.AMOUNT_STATEMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAmountStatementAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns MoodStatement
	 *     MoodStatement returns MoodStatement
	 *
	 * Constraint:
	 *     (list+=STRING list+=STRING*)
	 */
	protected void sequence_MoodStatement(ISerializationContext context, MoodStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns MoveStatement
	 *     MoveStatement returns MoveStatement
	 *
	 * Constraint:
	 *     (list+=STRING list+=STRING*)
	 */
	protected void sequence_MoveStatement(ISerializationContext context, MoveStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns NearbyStatement
	 *     NearbyStatement returns NearbyStatement
	 *
	 * Constraint:
	 *     (list+=STRING list+=STRING*)
	 */
	protected void sequence_NearbyStatement(ISerializationContext context, NearbyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns PathStatement
	 *     PathStatement returns PathStatement
	 *
	 * Constraint:
	 *     (list+=STRING list+=STRING*)
	 */
	protected void sequence_PathStatement(ISerializationContext context, PathStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns PlaceStatement
	 *     PlaceStatement returns PlaceStatement
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_PlaceStatement(ISerializationContext context, PlaceStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StoryPackage.Literals.PLACE_STATEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StoryPackage.Literals.PLACE_STATEMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlaceStatementAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StoryProgram returns StoryProgram
	 *
	 * Constraint:
	 *     statements+=Statement+
	 */
	protected void sequence_StoryProgram(ISerializationContext context, StoryProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns SubstanceStatement
	 *     SubstanceStatement returns SubstanceStatement
	 *
	 * Constraint:
	 *     (list+=STRING list+=STRING*)
	 */
	protected void sequence_SubstanceStatement(ISerializationContext context, SubstanceStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
