/**
 * generated by Xtext 2.25.0
 */
package org.xtext.coursework.storyLang.validation;

import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.xtext.coursework.storyLang.story.AmountStatement;
import org.xtext.coursework.storyLang.story.MoodStatement;
import org.xtext.coursework.storyLang.story.MoveStatement;
import org.xtext.coursework.storyLang.story.NearbyStatement;
import org.xtext.coursework.storyLang.story.PathStatement;
import org.xtext.coursework.storyLang.story.PlaceStatement;
import org.xtext.coursework.storyLang.story.SubstanceStatement;

/**
 * This class contains custom validation rules.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class StoryValidator extends AbstractStoryValidator {
  @Check
  public void checkAmountStatement(final AmountStatement amountStatement) {
    int _value = amountStatement.getValue();
    boolean _lessEqualsThan = (_value <= 0);
    if (_lessEqualsThan) {
      this.error("Amount must be a positive integer", amountStatement, null, null);
    }
  }
  
  @Check
  public void checkPlaceStatement(final PlaceStatement placeStatement) {
    if (((placeStatement.getValue() == null) || placeStatement.getValue().trim().isEmpty())) {
      this.error("Place name cannot be empty", placeStatement, null, null);
    }
  }
  
  @Check
  public void checkPathStatement(final PathStatement pathStatement) {
    int _size = pathStatement.getList().size();
    boolean _lessThan = (_size < 2);
    if (_lessThan) {
      this.error("Path must have at least two elements", pathStatement, null, null);
    }
    EList<String> _list = pathStatement.getList();
    for (final String item : _list) {
      this.checkDuplicates(item, "Path");
    }
  }
  
  @Check
  public void checkMoveStatement(final MoveStatement moveStatement) {
    int _size = moveStatement.getList().size();
    boolean _lessThan = (_size < 2);
    if (_lessThan) {
      this.error("Move list must have at least two elements", moveStatement, null, null);
    }
    EList<String> _list = moveStatement.getList();
    for (final String item : _list) {
      this.checkDuplicates(item, "Move");
    }
  }
  
  @Check
  public void checkNearbyStatement(final NearbyStatement nearbyStatement) {
    boolean _isEmpty = nearbyStatement.getList().isEmpty();
    if (_isEmpty) {
      this.error("Nearby list cannot be empty", nearbyStatement, null, null);
    }
    EList<String> _list = nearbyStatement.getList();
    for (final String item : _list) {
      this.checkDuplicates(item, "Nearby");
    }
  }
  
  @Check
  public void checkSubstanceStatement(final SubstanceStatement substanceStatement) {
    int _size = substanceStatement.getList().size();
    boolean _lessThan = (_size < 2);
    if (_lessThan) {
      this.error("Substance list must have at least two elements", substanceStatement, null, null);
    }
    EList<String> _list = substanceStatement.getList();
    for (final String item : _list) {
      this.checkDuplicates(item, "Substance");
    }
  }
  
  @Check
  public void checkMoodStatement(final MoodStatement moodStatement) {
    int _size = moodStatement.getList().size();
    boolean _lessThan = (_size < 3);
    if (_lessThan) {
      this.error("Mood list must have at least three elements", moodStatement, null, null);
    }
    EList<String> _list = moodStatement.getList();
    for (final String item : _list) {
      this.checkDuplicates(item, "Mood");
    }
  }
  
  public void checkDuplicates(final String item, final String statementName) {
    final HashSet<String> set = CollectionLiterals.<String>newHashSet(item);
    int _size = set.size();
    boolean _lessThan = (_size < 2);
    if (_lessThan) {
      this.warning((((("Duplicate item \'" + item) + "\' in ") + statementName) + " statement"), null);
    }
  }
}
