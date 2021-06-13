/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex38;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution38 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String[] array = stringToArray(getInput());

        int[] numbers = StringtoInt(array);
        int[] evenNumbers = filterEvenNumbers(numbers);

        System.out.println("The even numbers are " + Arrays.toString(evenNumbers));
    }

    public static String getInput() {
        System.out.println("Enter a list of numbers separated by spaces: ");

        return in.nextLine();
    }

    public static String[] stringToArray(String string) {
        Pattern pattern = Pattern.compile(" ");
        return pattern.split(string);
    }

    public static int[] StringtoInt(String[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = Integer.parseInt(array[i]);
        }

        return temp;
    }

    public static int[] filterEvenNumbers(int[] numbers) {
        int j = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                j++;
            }
        }
        int[] temp = new int[j];
        j = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                temp[j] = number;
                j++;
            }
        }
        return temp;
    }

}
