/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void generate() {
        String password = PasswordGenerator.generate(8,2,2);
        if(password.length()<8) {
            fail("Password too short");
        }
        int letterCounter = 0;
        for (int i = 0; i < password.length(); i++) {
            if(Character.isLetter(password.charAt(i))) {
                letterCounter++;
            }
        }
        if(letterCounter < 2 + 2) {
            fail("Not enough letters");
        }
    }

    @Test
    void getSpecialCharacter() {
        // gets random character successfully
    }

    @Test
    void getLetter() {
        // gets random character successfully
    }

    @Test
    void getNumber() {
        // gets random character successfully
    }
}