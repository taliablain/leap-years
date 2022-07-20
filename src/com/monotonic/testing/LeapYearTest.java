package com.monotonic.testing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class LeapYearTest {
    // a year is a leap year if it is divisible by four
    // but years divisible by 100 are not leap years,
    // except years divisible by 400

    @Test
    public void leapYearsAreDivisibleByFour() {
        assertTrue(LeapYear.isLeapYear(2016));
    }

    @Test
    public void normalYearsAreNotDivisibleByFour() {
        assertFalse(LeapYear.isLeapYear(3));
    }

    @Test
    public void leapYearsAreNotDivisbleByOneHundred() {
        assertFalse(LeapYear.isLeapYear(1900));
    }

    @Test
    public void leapYearsAreDivisibleByFourHundred() {
        assertTrue(LeapYear.isLeapYear(2000));
    }
}