/*
 * generated by Xtext 2.25.0
 */
package org.xtext.coursework.storyLang.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.coursework.storyLang.ui.internal.StoryLangActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class StoryExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(StoryLangActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		StoryLangActivator activator = StoryLangActivator.getInstance();
		return activator != null ? activator.getInjector(StoryLangActivator.ORG_XTEXT_COURSEWORK_STORYLANG_STORY) : null;
	}

}
