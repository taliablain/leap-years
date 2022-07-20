package com.monotonic.testing;

public class WordWrap {
    public static String wrap(final String inputLine, final int lineLength) {
        final StringBuilder accumulator = new StringBuilder();

        accumulator.append(inputLine, 0, lineLength);
        accumulator.append('\n');
        accumulator.append(inputLine, lineLength, inputLine.length());
        return accumulator.toString();
    }
}
