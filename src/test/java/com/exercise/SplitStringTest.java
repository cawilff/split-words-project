package com.exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class SplitStringTest {

	@Test
	public void testSplitWords() {
		SplitString sp = new SplitString();
		String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
				+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ";
		String result = sp.splitWords(input);
		System.out.println(result);
		assertTrue(result.contains("\n"));
	}

	@Test
	public void testSplitWordsNullInput() {
		SplitString sp = new SplitString();
		String result = sp.splitWords(null);
		assertNotNull(result);
	}

	@Test
	public void testSplitWordsBlankInput() {
		SplitString sp = new SplitString();
		String result = sp.splitWords("                  ");
		assertEquals(StringUtils.EMPTY, result);
	}

}
