/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void main() {
        // public static final Scanner in = new Scanner(System.in);

        // manually tests user input;
        int[] test = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter a number: ");
            // Mocks user input
            sum += test[i-1];
        }

        int expected = 15;

        assertEquals(expected, sum);
    }
}
