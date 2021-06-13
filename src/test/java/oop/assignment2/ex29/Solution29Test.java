/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex29;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void validateInput_0() {
        Solution29.input = "0";

        boolean actual = Solution29.validateInput();
        assertFalse(actual);
    }
    @Test
    void validateInput_nondigit() {
        Solution29.input = "abc";

        boolean actual = Solution29.validateInput();
        assertFalse(actual);
    }
    @Test
    void validateInput_true() {
        Solution29.input = "4";

        boolean actual = Solution29.validateInput();
        assertTrue(actual);
    }
}