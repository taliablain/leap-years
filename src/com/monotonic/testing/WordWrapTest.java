package com.monotonic.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordWrapTest {

    public static final int LINE_LENGTH = 5;

    // a method that breaks words on a specified space with new line, like a word processor would.

    @Test
    public void lineShouldWrapIfOverLineLength() {
        String result = WordWrap.wrap("The Sleepy", LINE_LENGTH);
        assertEquals("The S\nleepy", result);
    }

    @Test
    public void shortLinesShouldNotWrap() {
        String result = WordWrap.wrap("The", LINE_LENGTH);
        assertEquals("The", result);
    }
}
