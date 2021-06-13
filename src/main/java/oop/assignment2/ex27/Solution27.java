/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex27;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner in = new Scanner(System.in);

    static String firstName, lastName, zip, id, result;
    public static void main(String[] args) {
        String result;
        // get input
        getInput();

        // send data to validator
        result = Validator.main(firstName,lastName, zip, id);

        // print
        if(result.equals("")) {
            System.out.print("There were no errors found.");
        }
        else {
            System.out.print(result);
        }
    }

    public static void getInput() {
        System.out.print("Enter the first name:" );
        firstName = in.next();

        System.out.print("Enter the last name: ");
        lastName = in.next();

        System.out.print("Enter the ZIP code: ");
        zip = in.next();

        System.out.print("Enter the employee ID: ");
        id = in.next();
    }
}
