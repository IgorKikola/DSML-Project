/*
 * generated by Xtext 2.30.0
 */
package org.xtext.coursework.storyLang


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class StoryStandaloneSetup extends StoryStandaloneSetupGenerated {

	def static void doSetup() {
		new StoryStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}