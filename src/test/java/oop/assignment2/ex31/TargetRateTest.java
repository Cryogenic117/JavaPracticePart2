/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetRateTest {

    @Test
    void formulate() {
        double expected = 191;
        double actual = Math.round(TargetRate.formulate(95, 65, 22));

        assertEquals(expected, actual);
    }
}