/*
 * generated by Xtext 2.30.0
 */
package org.xtext.coursework.storyLang.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class StoryAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/coursework/storyLang/parser/antlr/internal/InternalStory.tokens");
	}
}
