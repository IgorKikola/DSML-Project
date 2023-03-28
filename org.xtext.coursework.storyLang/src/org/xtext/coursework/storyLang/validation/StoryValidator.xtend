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

/** 
 * This class contains custom validation rules. 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class StoryValidator extends AbstractStoryValidator {
	
    // validation rule for the AmountStatement
    @Check
    def checkAmountStatement(AmountStatement amountStatement) {
        if (amountStatement.value <= 0) {
            error("Amount must be a positive integer", amountStatement, null, null)
        }        
    }

    // validation rule for the PlaceStatement
    @Check
    def checkPlaceStatement(PlaceStatement placeStatement) {
        if (placeStatement.value === null || placeStatement.value.trim().isEmpty()) {
            error("Place name cannot be empty", placeStatement, null, null)
        }      
    }

    // validation rule for the PathStatement
    @Check
    def checkPathStatement(PathStatement pathStatement) {
        if (pathStatement.list.size() < 2) {
            error("Path must have at least two elements", pathStatement, null, null)
        }
        for (item : pathStatement.list) {
      	checkDuplicates(item, "Path")
    	}        
    }

    // validation rule for the MoveStatement
    @Check
    def checkMoveStatement(MoveStatement moveStatement) {
        if (moveStatement.list.size() < 2) {
            error("Move list must have at least two elements", moveStatement, null, null)
        }
        for (item : moveStatement.list) {
      	checkDuplicates(item, "Move")
    	}        
    }

    // validation rule for the NearbyStatement
    @Check
    def checkNearbyStatement(NearbyStatement nearbyStatement) {
        if (nearbyStatement.list.isEmpty()) {
            error("Nearby list cannot be empty", nearbyStatement, null, null)
        }
        for (item : nearbyStatement.list) {
      	checkDuplicates(item, "Nearby")
    	}       
    }

    // validation rule for the SubstanceStatement
    @Check
    def checkSubstanceStatement(SubstanceStatement substanceStatement) {
        if (substanceStatement.list.size() < 2) {
            error("Substance list must have at least two elements", substanceStatement, null, null)
        }
        for (item : substanceStatement.list) {
      	checkDuplicates(item, "Substance")
    	}        
    }

    // validation rule for the MoodStatement
    @Check
    def checkMoodStatement(MoodStatement moodStatement) {
        if (moodStatement.list.size() < 3) {
            error("Mood list must have at least three elements", moodStatement, null, null)
        }
        for (item : moodStatement.list) {
      	checkDuplicates(item, "Mood")
    	}
    }
  
  def checkDuplicates(String item, String statementName) {
    val set = newHashSet(item)
    if (set.size < 2) {
      warning("Duplicate item '" + item + "' in " + statementName + " statement", null)
    }
  }    
}