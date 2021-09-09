package com.exercise;

import org.apache.commons.lang3.StringUtils;

public class SplitString {
	/*
	 * 1. Java Task Implement a Java method that splits input text into pieces 50
	 * symbols at maximum. Words shouldn't be teared apart. Every symbol, except
	 * space, counts as part of the word and no symbol should be lost. Result pieces
	 * of text should not start with a space symbol.
	 * 
	 * Example. Input string: " Lorem ipsum dolor sit amet, consectetur adipiscing
	 * elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
	 * enim ad minim veniam, ".
	 * 
	 * Should be transformed into three strings: 
	 *	Lorem ipsum dolor sit amet, consectetur adipiscing
		elit, sed do eiusmod tempor incididunt ut labore
		et dolore magna aliqua. Ut enim ad minim veniam,
	 */
	private static final String BLANK_SPACE = " ";
	private static final int MAX_LENGTH = 51;

	public String splitWords(String text) {
		if (StringUtils.isBlank(text)) {
			return StringUtils.EMPTY;
		}
		String[] words = text.split(BLANK_SPACE);
		StringBuilder sb = new StringBuilder();
		StringBuilder aux = new StringBuilder();

		for (String word : words) {
			sb.append(word);
			sb.append(BLANK_SPACE);
			if (sb.length() + word.length() > MAX_LENGTH) {
				sb.append("\n");
				aux.append(sb);
				sb = null;
				sb = new StringBuilder();

			}
		}

		return aux.toString();
	}
}
