/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void validateName_pass() {
        int expected = 1;
        int actual = Validator.validateName("John");

        assertEquals(expected, actual);
    }
    @Test
    void validateName_blank() {
        int expected = 0;
        int actual = Validator.validateName("");

        assertEquals(expected, actual);
    }
    @Test
    void validateName_short() {
        int expected = -1;
        int actual = Validator.validateName("A");

        assertEquals(expected, actual);
    }

    @Test
    void validateZip_short() {
        int expected = 0;
        int actual = Validator.validateZip("1234");

        assertEquals(expected, actual);
    }
    @Test
    void validateZip_non_digit() {
        int expected = 0;
        int actual = Validator.validateZip("12#45");

        assertEquals(expected, actual);
    }
    @Test
    void validateZip_pass() {
        int expected = 1;
        int actual = Validator.validateZip("12345");

        assertEquals(expected, actual);
    }
    @Test
    void validateID_pass() {
        int expected = 1;
        int actual = Validator.validateID("TK-1234");

        assertEquals(expected, actual);
    }
    @Test
    void validateID_invalid() {
        int expected = 0;
        int actual = Validator.validateID("ABC-1234");

        assertEquals(expected, actual);
    }
    @Test
    void validateID_invalid2() {
        int expected = 0;
        int actual = Validator.validateID("BC-12345");

        assertEquals(expected, actual);
    }
    @Test
    void validateID_invalid3() {
        int expected = 0;
        int actual = Validator.validateID("BC-1F34");

        assertEquals(expected, actual);
    }
    @Test
    void validateID_invalid4() {
        int expected = 0;
        int actual = Validator.validateID("A1-1234");

        assertEquals(expected, actual);
    }
}