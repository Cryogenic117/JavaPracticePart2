/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex24;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {
    @Test
    void isAnagram_true() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("note", "tone");

        // then
        assertTrue(actual);

    }
    @Test
    void isAnagram_false() {
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("cat", "dog");
    }
}