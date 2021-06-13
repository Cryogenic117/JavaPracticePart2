/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex29;
import java.util.Scanner;

public class Solution29 {
    public static String input;
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // Take input until valid
        do {
            getInput();
        }while(!validateInput());

        System.out.printf("It will take %d years to double your initial investment", 72 / Integer.parseInt(input));
    }


    public static void getInput() {
        System.out.print("What is the rate of return? ");
        input = in.next();
    }
    public static boolean validateInput() {
       for (int i = 0; i < input.length(); i++) {
                if((!Character.isDigit(input.charAt(i)))) {
                    System.out.print("Invalid input, Please try again and enter the rate as a percentage.\n");
                    return false;
                }
            }
        if(Integer.parseInt(input) <= 0) {
            System.out.print("Sorry, a value under or equal to 0 is an invalid input.\n");
            return false;
        }
        return true;

    }
}
