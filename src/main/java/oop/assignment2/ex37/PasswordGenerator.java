/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex37;

import java.util.Random;

public class PasswordGenerator {
    private static final Random rand = new Random();
    static char[] specialCharacters = {'!', '@', '#', '$', '%', '^', '&'};
    static char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '8', '9', '0'};

    public static String generate(int minLength, int specialCharCount, int numberCount) {
        String password= "";
        int value = minLength - (specialCharCount + numberCount);
        for(int i =0; i<value; i++)
        {
            password+= getLetter();
        }
        for(int i = 0; i < numberCount; i++) {
            password+= getNumber();
            for(int j = 0; j< specialCharCount; j++) {
                password+= getSpecialCharacter();
            }
        }
        return password;
    }
    public static char getSpecialCharacter() {
        int size = specialCharacters.length;

        return specialCharacters[rand.nextInt(size)];
    }

    public static char getLetter() {
        int size = letters.length;

        return letters[rand.nextInt(size)];
    }
    public static char getNumber() {
        int size = numbers.length;

        return numbers[rand.nextInt(size)];
    }
}
