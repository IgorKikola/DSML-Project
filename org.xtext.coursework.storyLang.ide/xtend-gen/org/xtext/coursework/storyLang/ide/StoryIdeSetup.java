/**
 * generated by Xtext 2.30.0
 */
package org.xtext.coursework.storyLang.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.coursework.storyLang.StoryRuntimeModule;
import org.xtext.coursework.storyLang.StoryStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class StoryIdeSetup extends StoryStandaloneSetup {
  @Override
  public Injector createInjector() {
    StoryRuntimeModule _storyRuntimeModule = new StoryRuntimeModule();
    StoryIdeModule _storyIdeModule = new StoryIdeModule();
    return Guice.createInjector(Modules2.mixin(_storyRuntimeModule, _storyIdeModule));
  }
}