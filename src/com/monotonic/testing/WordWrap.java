package com.monotonic.testing;

public class WordWrap {
    public static String wrap(final String inputLine, final int lineLength) {
        final StringBuilder accumulator = new StringBuilder();

        final int length = inputLine.length();
        accumulator.append(inputLine, 0, Math.min(length, lineLength));

        int split = lineLength;

        while (length > split) {
            accumulator.append('\n');
            accumulator.append(inputLine, split, Math.min(length, split + lineLength));
            split += lineLength;
        }

        return accumulator.toString();
    }
}
