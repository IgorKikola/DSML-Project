/*
 * generated by Xtext 2.25.0
 */
package org.xtext.coursework.storyLang.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.coursework.storyLang.story.StoryProgram
import org.xtext.coursework.storyLang.story.PlaceStatement
import org.xtext.coursework.storyLang.story.PathStatement
import org.xtext.coursework.storyLang.story.MoveStatement
import org.xtext.coursework.storyLang.story.NearbyStatement
import org.xtext.coursework.storyLang.story.SubstanceStatement
import org.xtext.coursework.storyLang.story.MoodStatement
import org.xtext.coursework.storyLang.story.AmountStatement

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class StoryGenerator extends AbstractGenerator {
	
	


	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		

        val model = resource.contents.head as StoryProgram
        fsa.generateFile(resource.deriveTargetFileNameFor, model.doGenerate)
    }

    def deriveTargetFileNameFor(Resource resource) {
        resource.URI.appendFileExtension('txt').lastSegment
    }
	
	def String functionOutput1(StoryProgram program)'''
		«var move = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»	
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»	
		«if(move.endsWith("ed"))
			{}
		else if(move.endsWith("e"))
			{move = move + "d"; ""}
		else if(move.matches("[a-z]*[^aeiou]y"))
			{move = move.substring(0,move.length-1)+"ied"; ""}
		else if(move.matches("[a-z]+"))
			{move = move + "ed"; ""}»
		The «place» «move».
	'''
	
	def String functionOutput2(StoryProgram program)'''
		«var move = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»	
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»
		«var nearby = program.statements.filter(NearbyStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(NearbyStatement).iterator.next.list.size).intValue()).toFirstUpper»
		«var adjust = ''»
		«if(place.charAt(0) == 'a' || place.charAt(0) == 'e' || place.charAt(0) == 'i' || place.charAt(0) == 'o' || place.charAt(0) == 'u')
		{adjust = 'an'; ""}
		else
		{adjust= 'a'; ""}»
		«if(move.endsWith("ed"))
			{}
		else if(move.endsWith("e"))
			{move = move + "d"; ""}
		else if(move.matches("[a-z]*[^aeiou]y"))
			{move = move.substring(0,move.length-1)+"ied"; ""}
		else if(move.matches("[a-z]+"))
			{move = move + "ed"; ""}»
		«nearby» «adjust» «place» «move».
	'''
	
	def String functionOutput3(StoryProgram program)'''
		«var move = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»	
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»
		«var nearby = program.statements.filter(NearbyStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(NearbyStatement).iterator.next.list.size).intValue()).toFirstUpper»
		«var path = program.statements.filter(PathStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(PathStatement).iterator.next.list.size).intValue())»
		«var adjust = ''»
		«if(place.charAt(0) == 'a' || place.charAt(0) == 'e' || place.charAt(0) == 'i' || place.charAt(0) == 'o' || place.charAt(0) == 'u')
		{adjust = 'an'; ""}
		else
		{adjust= 'a'; ""}»
		«if(move.endsWith("ed"))
			{}
		else if(move.endsWith("e"))
			{move = move + "d"; ""}
		else if(move.matches("[a-z]*[^aeiou]y"))
			{move = move.substring(0,move.length-1)+"ied"; ""}
		else if(move.matches("[a-z]+"))
			{move = move + "ed"; ""}»
		«nearby» «adjust» «place» «move» through the «path».
	'''
	
	def String functionOutput4(StoryProgram program)'''
		«var mood = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue()).toFirstUpper»	
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»
		«mood» «place».
	'''
	
	def String functionOutput5(StoryProgram program)'''
		«var mood1 = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue()).toFirstUpper»
		«var mood2 = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue())»
		«var mood3 = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue())»
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»
		«var substance = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»
		«mood1» and «mood2», the «place» was «mood3» with «substance».
	'''
	
	def String functionOutput6(StoryProgram program)'''
		«var move = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»	
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»
		«var nearby = program.statements.filter(NearbyStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(NearbyStatement).iterator.next.list.size).intValue()).toFirstUpper»
		«var path = program.statements.filter(PathStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(PathStatement).iterator.next.list.size).intValue())»
		«var substance = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»
		«var adjust = ''»
		«if(place.charAt(0) == 'a' || place.charAt(0) == 'e' || place.charAt(0) == 'i' || place.charAt(0) == 'o' || place.charAt(0) == 'u')
		{adjust = 'an'; ""}
		else
		{adjust= 'a'; ""}»
		«if(move.endsWith("ed"))
			{}
		else if(move.endsWith("e"))
			{move = move + "d"; ""}
		else if(move.matches("[a-z]*[^aeiou]y"))
			{move = move.substring(0,move.length-1)+"ied"; ""}
		else if(move.matches("[a-z]+"))
			{move = move + "ed"; ""}»
		«nearby» «adjust» «place» «move» through the «path», filling me with «substance».
	'''
	
	def String functionOutput7(StoryProgram program)'''
		«var move = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»	
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»
		«var nearby = program.statements.filter(NearbyStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(NearbyStatement).iterator.next.list.size).intValue()).toFirstUpper»
		«var path = program.statements.filter(PathStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(PathStatement).iterator.next.list.size).intValue())»
		«var substance1 = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»
		«var substance2 = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»		
		«var adjust = ''»
		«if(place.charAt(0) == 'a' || place.charAt(0) == 'e' || place.charAt(0) == 'i' || place.charAt(0) == 'o' || place.charAt(0) == 'u')
		{adjust = 'an'; ""}
		else
		{adjust= 'a'; ""}»
		«if(move.endsWith("ed"))
			{}
		else if(move.endsWith("e"))
			{move = move + "d"; ""}
		else if(move.matches("[a-z]*[^aeiou]y"))
			{move = move.substring(0,move.length-1)+"ied"; ""}
		else if(move.matches("[a-z]+"))
			{move = move + "ed"; ""}»
		«nearby» «adjust» «place» «move» through the «path», filling me with «substance1» and «substance2».
	'''
	
	def String functionOutput8(StoryProgram program)'''
		«var move = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»	
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»
		«var nearby = program.statements.filter(NearbyStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(NearbyStatement).iterator.next.list.size).intValue()).toFirstUpper»
		«var path = program.statements.filter(PathStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(PathStatement).iterator.next.list.size).intValue())»
		«var substance1 = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»
		«var substance2 = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»		
		«var mood = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue())»
		«var adjust = ''»
		«if(place.charAt(0) == 'a' || place.charAt(0) == 'e' || place.charAt(0) == 'i' || place.charAt(0) == 'o' || place.charAt(0) == 'u')
		{adjust = 'an'; ""}
		else
		{adjust= 'a'; ""}»
		«if(move.endsWith("ed"))
			{}
		else if(move.endsWith("e"))
			{move = move + "d"; ""}
		else if(move.matches("[a-z]*[^aeiou]y"))
			{move = move.substring(0,move.length-1)+"ied"; ""}
		else if(move.matches("[a-z]+"))
			{move = move + "ed"; ""}» 
		«nearby» «adjust» «mood» «place» «move» through the «path», filling me with «substance1» and «substance2».
	'''
	
	def String functionOutput9(StoryProgram program)'''
		«var move = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»	
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»
		«var nearby = program.statements.filter(NearbyStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(NearbyStatement).iterator.next.list.size).intValue()).toFirstUpper»
		«var path = program.statements.filter(PathStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(PathStatement).iterator.next.list.size).intValue())»
		«var substance1 = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»
		«var substance2 = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»		
		«var mood1 = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue())»
		«var mood2 = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue())»
		«var adjust = ''»
		«if(place.charAt(0) == 'a' || place.charAt(0) == 'e' || place.charAt(0) == 'i' || place.charAt(0) == 'o' || place.charAt(0) == 'u')
		{adjust = 'an'; ""}
		else
		{adjust= 'a'; ""}»
		«if(move.endsWith("ed"))
			{}
		else if(move.endsWith("e"))
			{move = move + "d"; ""}
		else if(move.matches("[a-z]*[^aeiou]y"))
			{move = move.substring(0,move.length-1)+"ied"; ""}
		else if(move.matches("[a-z]+"))
			{move = move + "ed"; ""}»
		«nearby» «adjust» «mood1» «place» «move» through the «mood2» «path», filling me with «substance1» and «substance2».
	'''
	
	def String functionOutput10(StoryProgram program)'''
		«var move1 = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»
		«var move2 = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»
		«var nearby = program.statements.filter(NearbyStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(NearbyStatement).iterator.next.list.size).intValue()).toFirstUpper»
		«var path = program.statements.filter(PathStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(PathStatement).iterator.next.list.size).intValue())»
		«var substance1 = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»
		«var substance2 = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»		
		«var mood1 = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue())»
		«var mood2 = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue())»
		«var adjust = ''»
		«if(place.charAt(0) == 'a' || place.charAt(0) == 'e' || place.charAt(0) == 'i' || place.charAt(0) == 'o' || place.charAt(0) == 'u')
		{adjust = 'an'; ""}
		else
		{adjust= 'a'; ""}»
		«if(move1.endsWith("ed"))
			{}
		else if(move1.endsWith("e"))
			{move1 = move1 + "d"; ""}
		else if(move1.matches("[a-z]*[^aeiou]y"))
			{move1 = move1.substring(0,move1.length-1)+"ied"; ""}
		else if(move1.matches("[a-z]+"))
			{move1 = move1 + "ed"; ""}»
		«if(move2.endsWith("ing"))
			{}
		else if(move2.endsWith("ed"))
			{move2 = move2.substring(0, move2.length-2)+"ing"; ""}
		else if(move2.endsWith("e"))
			{move2 = move2.substring(0, move2.length-1)+"ing"; ""}
		else if(move2.endsWith("n"))
			{move2 = move2+"ning";}
		else if(move2.matches(".*[^aeiou][aeiou][^aeiouy]$"))
			{move2 = move2+"ing"; ""}»
		«nearby» «adjust» «mood1» «place» «move1» through the «mood2» «move2» «path», filling me with «substance1» and «substance2».
	'''
	
	def String functionOutput11(StoryProgram program)'''
		«var move1 = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»
		«var move2 = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»
		«var nearby = program.statements.filter(NearbyStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(NearbyStatement).iterator.next.list.size).intValue()).toFirstUpper»
		«var path = program.statements.filter(PathStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(PathStatement).iterator.next.list.size).intValue())»
		«var substance1 = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»
		«var substance2 = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»		
		«var adjust = ''»
		«if(place.charAt(0) == 'a' || place.charAt(0) == 'e' || place.charAt(0) == 'i' || place.charAt(0) == 'o' || place.charAt(0) == 'u')
		{adjust = 'an'; ""}
		else
		{adjust= 'a'; ""}»
		«if(move1.endsWith("ed"))
			{}
		else if(move1.endsWith("e"))
			{move1 = move1 + "d"; ""}
		else if(move1.matches("[a-z]*[^aeiou]y"))
			{move1 = move1.substring(0,move1.length-1)+"ied"; ""}
		else if(move1.matches("[a-z]+"))
			{move1 = move1 + "ed"; ""}»
		«if(move2.endsWith("ing"))
			{}
		else if(move2.endsWith("ed"))
			{move2 = move2.substring(0, move2.length-2)+"ing"; ""}
		else if(move2.endsWith("e"))
			{move2 = move2.substring(0, move2.length-1)+"ing"; ""}
		else if(move2.endsWith("n"))
			{move2 = move2+"ning";}
		else if(move2.matches(".*[^aeiou][aeiou][^aeiouy]$"))
			{move2 = move2+"ing"; ""}»
		«nearby» «adjust» «place» «move1» through the «move2» «path», filling me with «substance1» and «substance2».
	'''
	
	def String functionOutput12(StoryProgram program)'''
		«var move = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»
		«var nearby = program.statements.filter(NearbyStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(NearbyStatement).iterator.next.list.size).intValue()).toFirstUpper»
		«var path = program.statements.filter(PathStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(PathStatement).iterator.next.list.size).intValue())»
		«var substance1 = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»
		«var substance2 = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»		
		«var mood = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue())»
		«var adjust = ''»
		«if(place.charAt(0) == 'a' || place.charAt(0) == 'e' || place.charAt(0) == 'i' || place.charAt(0) == 'o' || place.charAt(0) == 'u')
		{adjust = 'an'; ""}
		else
		{adjust= 'a'; ""}»
		«if(move.endsWith("ed"))
			{}
		else if(move.endsWith("e"))
			{move = move + "d"; ""}
		else if(move.matches("[a-z]*[^aeiou]y"))
			{move = move.substring(0,move.length-1)+"ied"; ""}
		else if(move.matches("[a-z]+"))
			{move = move + "ed"; ""}»
		«nearby» «adjust» «place» «move» through the «mood» «path», filling me with «substance1» and «substance2».
	'''
	
	def String functionOutput13(StoryProgram program)'''
		«var mood1 = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue()).toFirstUpper»
		«var mood2 = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue())»
		«var mood3 = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue())»
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»
		«var substance1 = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»
		«var substance2 = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»
		«mood1» and «mood2», the «place» was «mood3» with «substance1» and «substance2».
	'''
	
	def String functionOutput14(StoryProgram program)'''
		«var move = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»
		«var nearby = program.statements.filter(NearbyStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(NearbyStatement).iterator.next.list.size).intValue()).toFirstUpper»
		«var path = program.statements.filter(PathStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(PathStatement).iterator.next.list.size).intValue())»
		«var substance = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»
		«var mood = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue())»
		«var adjust = ''»
		«if(place.charAt(0) == 'a' || place.charAt(0) == 'e' || place.charAt(0) == 'i' || place.charAt(0) == 'o' || place.charAt(0) == 'u')
		{adjust = 'an'; ""}
		else
		{adjust= 'a'; ""}»
		«if(move.endsWith("ed"))
			{}
		else if(move.endsWith("e"))
			{move = move + "d"; ""}
		else if(move.matches("[a-z]*[^aeiou]y"))
			{move = move.substring(0,move.length-1)+"ied"; ""}
		else if(move.matches("[a-z]+"))
			{move = move + "ed"; ""}» 
		«nearby» «adjust» «mood» «place» «move» through the «path», filling me with «substance».
	'''
	
	def String functionOutput15(StoryProgram program)'''
		«var move1 = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»
		«var move2 = program.statements.filter(MoveStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoveStatement).iterator.next.list.size).intValue())»
		«var place = program.statements.filter(PlaceStatement).iterator.next.value»
		«var nearby = program.statements.filter(NearbyStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(NearbyStatement).iterator.next.list.size).intValue()).toFirstUpper»
		«var path = program.statements.filter(PathStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(PathStatement).iterator.next.list.size).intValue())»
		«var mood = program.statements.filter(MoodStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(MoodStatement).iterator.next.list.size).intValue())»
		«var substance = program.statements.filter(SubstanceStatement).iterator.next.list.get(Math.floor(Math.random()*program.statements.filter(SubstanceStatement).iterator.next.list.size).intValue())»
		«var adjust = ''»	
		«if(place.charAt(0) == 'a' || place.charAt(0) == 'e' || place.charAt(0) == 'i' || place.charAt(0) == 'o' || place.charAt(0) == 'u')
		{adjust = 'an'; ""}
		else
		{adjust= 'a'; ""}»
		«if(move1.endsWith("ed"))
			{}
		else if(move1.endsWith("e"))
			{move1 = move1 + "d"; ""}
		else if(move1.matches("[a-z]*[^aeiou]y"))
			{move1 = move1.substring(0,move1.length-1)+"ied"; ""}
		else if(move1.matches("[a-z]+"))
			{move1 = move1 + "ed"; ""}»
		«if(move2.endsWith("ing"))
			{}
		else if(move2.endsWith("ed"))
			{move2 = move2.substring(0, move2.length-2)+"ing"; ""}
		else if(move2.endsWith("e"))
			{move2 = move2.substring(0, move2.length-1)+"ing"; ""}
		else if(move2.endsWith("n"))
			{move2 = move2+"ning";}
		else if(move2.matches(".*[^aeiou][aeiou][^aeiouy]$"))
			{move2 = move2+"ing"; ""}»
		«nearby» «adjust» «mood» «place» «move1» through the «move2» «path», filling me with «substance».
	'''


    def String doGenerate(StoryProgram program) '''
        Generated Landscapes:
        «var amount = program.statements.filter(AmountStatement).iterator.next.value»
        «FOR Integer : 0..<amount»
        «var outputRandomizer = Math.floor(Math.random()*15)+1»
        «if(outputRandomizer == 1){functionOutput1(program)}
        else if(outputRandomizer == 2){functionOutput2(program)}
        else if(outputRandomizer == 3){functionOutput3(program)}
        else if(outputRandomizer == 4){functionOutput4(program)}
        else if(outputRandomizer == 5){functionOutput5(program)}
        else if(outputRandomizer == 6){functionOutput6(program)}
        else if(outputRandomizer == 7){functionOutput7(program)}
        else if(outputRandomizer == 8){functionOutput8(program)}
        else if(outputRandomizer == 9){functionOutput9(program)}
        else if(outputRandomizer == 10){functionOutput10(program)}
        else if(outputRandomizer == 11){functionOutput11(program)}
        else if(outputRandomizer == 12){functionOutput12(program)}
        else if(outputRandomizer == 13){functionOutput13(program)}
        else if(outputRandomizer == 14){functionOutput14(program)}
        else if(outputRandomizer == 15){functionOutput15(program)}»
        «ENDFOR»
    '''	
}
