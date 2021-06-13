/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex27;

public class Validator{
    private static String result ="";
    public static String main(String firstName, String lastName, String zip, String id) {
        // Validate Last Name
        if (validateName(lastName) == 0) {
            result += "The last name must be filled in.\n";
        }
        else if(validateName(lastName) == -1) {
            result += "The last name must be at least 2 characters long.\n";
        }

        // Validate First Name
        if (validateName(firstName) == 0) {
            result += "The first name must be filled in.\n";
        }
        else if(validateName(lastName) == -1) {
            result += "The first name must be at least 2 characters long.\n";
        }

        // Validate Zipcode
        if(validateZip(zip) == 0) {
            result += "The zipcode must be a 5 digit number.\n";
        }

        // Validate Employee ID
        if(validateID(id) == 0) {
            result += "The employee ID must be in the format of AA-1234.\n";
        }

        return result;
    }
        public static int validateName(String name) {
            if (name.length() > 1) {
                return 1;
            } else if(name.equals("")){
                // user input is not filled in
                return 0;
            }
            else {
                // User input is too short
                return -1;
            }
        }
        public static int validateZip(String zip) {
            if(zip.length() != 5) {
                return 0;
            }
            for(int i=0; i<zip.length(); i++) {
                if(!Character.isDigit(zip.charAt(i))) {
                    return 0;
                }
            }
            return 1;
        }
        public static int validateID(String id) {
            if( !Character.isLetter(id.charAt(0)) || !Character.isLetter(id.charAt(1))) {
                return 0;
            }
            else if(id.charAt(2) != '-') {
                return 0;
            }
            else if(!Character.isDigit(id.charAt(3)) || !Character.isDigit(id.charAt(4)) || !Character.isDigit(id.charAt(5)) || !Character.isDigit(id.charAt(6))) {
                return 0;
            }
            else if(id.length() != 7) {
                return 0;
            }
            else
                return 1;
        }
    }
