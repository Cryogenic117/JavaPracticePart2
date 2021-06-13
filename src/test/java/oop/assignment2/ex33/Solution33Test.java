/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {


    @Test
    void respond() {

        for (int i = 0; i < 500; i++) {

            try {
                Solution33.respond();
            } catch (Exception e) {
                fail("error in display");
            }

        }
    }
}