package com.revian;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NarcissisticNumberTest {

    @Test
    public void ReturnsTrueIfNumberIsZeroOrOneForBeingANarcissisticNumber() {
        NarcissisticNumber _narcissisticNumber = new NarcissisticNumber();
        assertEquals(true, _narcissisticNumber.checkNarcissistic("0"));
        assertEquals(true, _narcissisticNumber.checkNarcissistic("1"));
    }

    @Test
    public void ReturnsFalseWhenNegativeNumberOrCharactersArePassed() {
        NarcissisticNumber _narcissisticNumber = new NarcissisticNumber();
        assertEquals(false, _narcissisticNumber.checkNarcissistic("-1"));
        assertEquals(false, _narcissisticNumber.checkNarcissistic("12A"));
    }

    @Test(expected = NumberFormatException.class)
    public void ReturnsExceptionWhenDecimalNumbersArePassed() {
        NarcissisticNumber _narcissisticNumber = new NarcissisticNumber();
        assertEquals(false, _narcissisticNumber.checkNarcissistic(".234"));
        assertEquals(false, _narcissisticNumber.checkNarcissistic("0.0"));
        assertEquals(false, _narcissisticNumber.checkNarcissistic("1.234"));
    }

    @Test
    public void ReturnsTrueIfNumberIsANarcissisticNumber() {
        NarcissisticNumber _narcissisticNumber = new NarcissisticNumber();
        assertEquals(true, _narcissisticNumber.checkNarcissistic("153"));
    }

    @Test
    public void ReturnsFalseIfNumberIsNotANarcissisticNumber() {
        NarcissisticNumber _narcissisticNumber = new NarcissisticNumber();
        assertEquals(false, _narcissisticNumber.checkNarcissistic("2"));
        assertEquals(false, _narcissisticNumber.checkNarcissistic("10"));
        assertEquals(false, _narcissisticNumber.checkNarcissistic("11"));
    }

}
