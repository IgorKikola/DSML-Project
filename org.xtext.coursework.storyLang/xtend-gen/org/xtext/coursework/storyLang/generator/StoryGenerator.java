/**
 * generated by Xtext 2.25.0
 */
package org.xtext.coursework.storyLang.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.coursework.storyLang.story.AdjectiveStatement;
import org.xtext.coursework.storyLang.story.AdverbStatement;
import org.xtext.coursework.storyLang.story.EmotionStatement;
import org.xtext.coursework.storyLang.story.LocationStatement;
import org.xtext.coursework.storyLang.story.NameStatement;
import org.xtext.coursework.storyLang.story.StoryProgram;
import org.xtext.coursework.storyLang.story.VerbStatement;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class StoryGenerator extends AbstractGenerator {
  private int test = 10;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final StoryProgram model = ((StoryProgram) _head);
    fsa.generateFile(this.deriveTargetFileNameFor(resource), this.doGenerateStats(model));
  }
  
  public String deriveTargetFileNameFor(final Resource resource) {
    return resource.getURI().appendFileExtension("txt").lastSegment();
  }
  
  public String doGenerateStats(final StoryProgram program) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Program contains:");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- ");
    String _value = Iterables.<NameStatement>filter(program.getStatements(), NameStatement.class).iterator().next().getValue();
    _builder.append(_value);
    _builder.append(" name              ");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    double _random = Math.random();
    int _size = Iterables.<EmotionStatement>filter(program.getStatements(), EmotionStatement.class).iterator().next().getList().size();
    double _multiply = (_random * _size);
    String _get = Iterables.<EmotionStatement>filter(program.getStatements(), EmotionStatement.class).iterator().next().getList().get(Double.valueOf(Math.floor(_multiply)).intValue());
    _builder.append(_get);
    _builder.append(" emotions statement");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    double _random_1 = Math.random();
    int _size_1 = Iterables.<VerbStatement>filter(program.getStatements(), VerbStatement.class).iterator().next().getList().size();
    double _multiply_1 = (_random_1 * _size_1);
    String _get_1 = Iterables.<VerbStatement>filter(program.getStatements(), VerbStatement.class).iterator().next().getList().get(Double.valueOf(Math.floor(_multiply_1)).intValue());
    _builder.append(_get_1);
    _builder.append(" verb     ");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    double _random_2 = Math.random();
    int _size_2 = Iterables.<AdverbStatement>filter(program.getStatements(), AdverbStatement.class).iterator().next().getList().size();
    double _multiply_2 = (_random_2 * _size_2);
    String _get_2 = Iterables.<AdverbStatement>filter(program.getStatements(), AdverbStatement.class).iterator().next().getList().get(Double.valueOf(Math.floor(_multiply_2)).intValue());
    _builder.append(_get_2);
    _builder.append(" adverb     ");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    double _random_3 = Math.random();
    int _size_3 = Iterables.<LocationStatement>filter(program.getStatements(), LocationStatement.class).iterator().next().getList().size();
    double _multiply_3 = (_random_3 * _size_3);
    String _get_3 = Iterables.<LocationStatement>filter(program.getStatements(), LocationStatement.class).iterator().next().getList().get(Double.valueOf(Math.floor(_multiply_3)).intValue());
    _builder.append(_get_3);
    _builder.append(" location");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    double _random_4 = Math.random();
    int _size_4 = Iterables.<AdjectiveStatement>filter(program.getStatements(), AdjectiveStatement.class).iterator().next().getList().size();
    double _multiply_4 = (_random_4 * _size_4);
    String _get_4 = Iterables.<AdjectiveStatement>filter(program.getStatements(), AdjectiveStatement.class).iterator().next().getList().get(Double.valueOf(Math.floor(_multiply_4)).intValue());
    _builder.append(_get_4);
    _builder.append(" adjective     ");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.newLine();
    return _builder.toString();
  }
}
