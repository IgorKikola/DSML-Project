/*
 * generated by Xtext 2.25.0
 */
package org.xtext.coursework.storyLang.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.coursework.storyLang.story.StoryProgram
import org.junit.Assert
import org.junit.jupiter.api.DisplayName
import org.junit.Before
import org.xtext.coursework.storyLang.generator.StoryGenerator
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.xtext.coursework.storyLang.story.AmountStatement
import org.xtext.coursework.storyLang.story.SubstanceStatement
import org.xtext.coursework.storyLang.story.NearbyStatement
import org.xtext.coursework.storyLang.story.MoveStatement
import org.xtext.coursework.storyLang.story.PathStatement
import org.xtext.coursework.storyLang.story.PlaceStatement

@ExtendWith(InjectionExtension)
@InjectWith(StoryInjectorProvider)
class StoryDataParsingTest {
	@Inject
	ParseHelper<StoryProgram> parseHelper = new ParseHelper<StoryProgram>();
	
    @Inject 
    ValidationTestHelper validationTestHelper

	@Test
	@DisplayName("Test parsing all statements in a single program")
	def void testParsing() {
		val String input = '''
			place: "forest";
			path: "river", "bridge", "mountain";
			move: "run", "climb", "jump";
			nearby: "waterfall", "cave";
			substance: "moss", "rocks";
			mood: "excited", "nervous";
			amount: 3;
		'''
		val StoryProgram program = parseHelper.parse(input)
		Assert.assertNotNull(program)
		Assert.assertEquals(7, program.statements.size)
	}
	
	@Test
	@DisplayName("Test correct amount of landscapes gets generated")
	def void testCorrectAmount() {
		val generator = new StoryGenerator()
		val String input = '''
			place:"forest";
			move: "spiral", "twirl", "curl", "dance", "twine", "weave", "meander", "wander", "flow";
			substance:"light", "reflections", "mist", "shadow", "darkness", "brightness", "gaiety", "merriment";
			mood:"overcast", "alight", "clear", "darkened", "blue", "shadowed", "illuminated", "silver", "cool", "warm", "summer-warmed";
			nearby:"far away", "ahead", "behind me";
			path:"stream", "brook", "path", "ravine", "forest", "fence", "stone wall";
			amount: 453;
		'''
		val StoryProgram program = parseHelper.parse(input)
		val generatedCode = generator.doGenerate(program)
		
		val lines = generatedCode.split("\n");
		val numLines = lines.size
		
		Assert.assertEquals(454, numLines)
	}
	
	@Test
    def void testAmountStatementParsing() {
        val input = "amount: 5;"
        val program = parseHelper.parse(input)
        Assert.assertEquals(1, program.statements.size)
        Assert.assertTrue(program.statements.head instanceof AmountStatement)
        Assert.assertEquals(5, (program.statements.head as AmountStatement).value)
        validationTestHelper.assertNoErrors(program)
    }
    
    @Test
    def void testPlaceStatementParsing() {
        val input = "place: 'forest';"
        val program = parseHelper.parse(input)
        Assert.assertEquals(1, program.statements.size)
        Assert.assertTrue(program.statements.head instanceof PlaceStatement)
        Assert.assertEquals("forest", (program.statements.head as PlaceStatement).value)
        validationTestHelper.assertNoErrors(program)
    }

    @Test
    def void testPathStatementParsing() {
        val input = "path: 'start', 'middle', 'end';"
        val program = parseHelper.parse(input)
        Assert.assertEquals(1, program.statements.size)
        Assert.assertTrue(program.statements.head instanceof PathStatement)
        Assert.assertEquals(newArrayList("start", "middle", "end"), (program.statements.head as PathStatement).list)
        validationTestHelper.assertNoErrors(program)
    }

    @Test
    def void testMoveStatementParsing() {
        val input = "move: 'north', 'west', 'south';"
        val program = parseHelper.parse(input)
        Assert.assertEquals(1, program.statements.size)
        Assert.assertTrue(program.statements.head instanceof MoveStatement)
        Assert.assertEquals(newArrayList("north", "west", "south"), (program.statements.head as MoveStatement).list)
        validationTestHelper.assertNoErrors(program)
    }

    @Test
    def void testNearbyStatementParsing() {
        val input = "nearby: 'tree', 'rock', 'stream';"
        val program = parseHelper.parse(input)
        Assert.assertEquals(1, program.statements.size)
        Assert.assertTrue(program.statements.head instanceof NearbyStatement)
        Assert.assertEquals(newArrayList("tree", "rock", "stream"), (program.statements.head as NearbyStatement).list)
        validationTestHelper.assertNoErrors(program)
    }

    @Test
    def void testSubstanceStatementParsing() {
        val input = "substance: 'water', 'wood', 'stone';"
        val program = parseHelper.parse(input)
        Assert.assertEquals(1, program.statements.size)
        Assert.assertTrue(program.statements.head instanceof SubstanceStatement)
        Assert.assertEquals(newArrayList("water", "wood", "stone"), (program.statements.head as SubstanceStatement).list)
		validationTestHelper.assertNoErrors(program)
    }
	
}
