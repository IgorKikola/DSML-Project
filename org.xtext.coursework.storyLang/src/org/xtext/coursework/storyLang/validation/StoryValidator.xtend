/*
 * generated by Xtext 2.25.0
 */
package org.xtext.coursework.storyLang.validation


import org.eclipse.xtext.validation.Check
import org.xtext.coursework.storyLang.story.PlaceStatement
import org.xtext.coursework.storyLang.story.PathStatement
import org.xtext.coursework.storyLang.story.MoveStatement
import org.xtext.coursework.storyLang.story.NearbyStatement
import org.xtext.coursework.storyLang.story.SubstanceStatement
import org.xtext.coursework.storyLang.story.MoodStatement
import org.xtext.coursework.storyLang.story.AmountStatement
import org.xtext.coursework.storyLang.story.StoryPackage
import java.util.List
import org.xtext.coursework.storyLang.story.StoryProgram
import java.util.HashSet

/** 
 * This class contains custom validation rules. 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class StoryValidator extends AbstractStoryValidator {
	
   @Check
  	def checkAmountStatement(AmountStatement amountStatement) {
  		if (amountStatement.value < 1) {
      		warning("Amount must be a positive integer larger than zero", StoryPackage.Literals.AMOUNT_STATEMENT__VALUE)
    	}
  	}

    @Check
    def checkPlaceStatement(PlaceStatement placeStatement) {
        if (placeStatement.value === null || placeStatement.value.trim().isEmpty()) {
            warning("Place name cannot be empty", placeStatement, null, null)
        }      
    }

    @Check
    def checkPathStatement(PathStatement pathStatement) {
        if (pathStatement.list.size() < 2) {
            warning("Path must have at least two elements", pathStatement, null, null)
        }       
    }

    @Check
    def checkMoveStatement(MoveStatement moveStatement) {
        if (moveStatement.list.size() < 2) {
            warning("Move list must have at least two elements", moveStatement, null, null)
        }       
    }

    @Check
    def checkNearbyStatement(NearbyStatement nearbyStatement) {
        if (nearbyStatement.list.isEmpty()) {
            warning("Nearby list cannot be empty", nearbyStatement, null, null)
        }     
    }

    @Check
    def checkSubstanceStatement(SubstanceStatement substanceStatement) {
        if (substanceStatement.list.size() < 2) {
            warning("Substance list must have at least two elements", substanceStatement, null, null)
        }      
    }

    @Check
    def checkMoodStatement(MoodStatement moodStatement) {
        if (moodStatement.list.size() < 3) {
            warning("Mood list must have at least three elements", moodStatement, null, null)
        }
    } 
 
  	@Check
  	def checkDuplicateItems(PathStatement statement) {
    	checkDuplicates(statement.list, "Path")
  	}

  	@Check
  	def checkDuplicateItems(MoveStatement statement) {
    	checkDuplicates(statement.list, "Move")
  	}

  	@Check
  	def checkDuplicateItems(NearbyStatement statement) {
    	checkDuplicates(statement.list, "Nearby")
  	}

  	@Check
  	def checkDuplicateItems(SubstanceStatement statement) {
    	checkDuplicates(statement.list, "Substance")
  	}

  	@Check
  	def checkDuplicateItems(MoodStatement statement) {
    	checkDuplicates(statement.list, "Mood")
  	}

  	def checkDuplicates(List<String> list, String statementName) {
    	val set = list.toSet
    	if (set.size < list.size) {
      	warning("Duplicate items found in " + statementName + " statement", null)
    	}
  	}
  
     @Check
    def checkAmountStatementType(AmountStatement amountStatement) {
        if (!amountStatement.value.toString.matches("-?[0-9]+")) {
            warning("Amount value must be an integer", amountStatement, StoryPackage.Literals.AMOUNT_STATEMENT__VALUE)
        }
    }
    
    @Check
    def checkPlaceStatementType(PlaceStatement placeStatement) {
        if (!placeStatement.value.matches("[a-zA-Z0-9_]*")) {
            warning("Place value must be a string", placeStatement, StoryPackage.Literals.PLACE_STATEMENT__VALUE)
        }
    }     
    
    @Check
    def checkRequiredKeywords(StoryProgram program) {
        val requiredKeywords = #{'amount:', 'place:', 'path:', 'move:', 'nearby:', 'substance:', 'mood:'}
        val usedKeywords = program.statements.map[statement |
            switch (statement) {
                AmountStatement: "amount:"
                PlaceStatement: "place:"
                PathStatement: "path:"
                MoveStatement: "move:"
                NearbyStatement: "nearby:"
                SubstanceStatement: "substance:"
                MoodStatement: "mood:"
            }
        ].toSet()
     	val missingKeywords = new HashSet<String>(requiredKeywords);
     	
        missingKeywords.removeAll(usedKeywords)
        if (!missingKeywords.isEmpty) {
            warning("Missing required statements: " + missingKeywords.join(", "), program, null)
        }
    }
    
}
