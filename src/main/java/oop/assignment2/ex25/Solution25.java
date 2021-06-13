/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex25;
import java.util.Scanner;

public class Solution25 {
    private static final Scanner in = new Scanner(System.in);
    private static String password;
    public static void main(String[] args) {
        int result;
        String strength;
        generateInput();

        PasswordValidator ps = new PasswordValidator();
        result = ps.passwordValidator(password);

        switch(result){
            case 1:
                strength = "very weak";
                break;
            case 2:
                strength = "weak";
                break;
            case 3:
                strength = "strong";
                break;
            case 4:
                strength = "very strong";
                break;
            default:
                return;
        }

        System.out.println("The password '" + password + "' is a " + strength + " password." );
    }

    public static void generateInput() {
        System.out.println("Enter a password to determine password strength: ");
        password = in.next();
    }
}
