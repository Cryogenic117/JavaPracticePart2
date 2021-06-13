/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex36;

import org.junit.jupiter.api.Test;

import static java.lang.Math.abs;
import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void average() {
        int expected = 400;
        int[]nums = {100, 200, 1000, 300};
        int actual = (int) Calculate.average(nums, 4);

        assertEquals(expected, actual);

    }

    @Test
    void max() {
        int expected = 1000;
        int[]nums = {100, 200, 1000, 300};
        int actual = Calculate.max(nums, 4);

        assertEquals(expected, actual);
    }

    @Test
    void min() {
        int expected = 100;
        int[]nums = {100, 200, 1000, 300};
        int actual = Calculate.min(nums, 4);

        assertEquals(expected, actual);
    }

    @Test
    void std() {
        double expected = 353.55;
        int[]nums = {100, 200, 1000, 300};
        double actual = Calculate.std(nums, 4);
         if(abs(expected-actual)>.01) {
             fail("Not equal");
         }
    }
}