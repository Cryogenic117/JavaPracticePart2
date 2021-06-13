/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex37;

import java.util.Scanner;

public class Solution37 {

    private static final Scanner in = new Scanner(System.in);
    public static int minLength, specialCharCount, numberCount;
    public static void main(String[] args) {
        dataCollection();

        String password = PasswordGenerator.generate(minLength, specialCharCount, numberCount);
        System.out.println("Your password is " + password);
    }
    public static void dataCollection() {
        System.out.print("What's the minimum length? ");
        minLength = in.nextInt();
        System.out.print("How many special characters? ");
        specialCharCount = in.nextInt();
        System.out.print("How many numbers? ");
        numberCount = in.nextInt();
    }
}
