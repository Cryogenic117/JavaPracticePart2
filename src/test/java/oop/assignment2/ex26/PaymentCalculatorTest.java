/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_test() {

        double expected = 70;
        double actual = PaymentCalculator.calculateMonthsUntilPaidOff(5000,12,100);

        assertEquals(expected, actual);
    }
}