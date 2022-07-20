package com.monotonic.testing;

public class LeapYear {

    public static boolean isLeapYear(final int year) {
        return (!isDivisble(year, 100) || isDivisble(year, 400));
    }

    private static boolean isDivisble(final int year, final int denominator) {
        return year % denominator == 0;
    }
}
