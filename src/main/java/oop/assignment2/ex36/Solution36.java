/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex36;

import java.util.Scanner;

public class Solution36 {
    public static int[] num = new int[1000];
    public static int counter = 0;
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        collectData();

        printNums();

        printResults(Calculate.max(num, counter), Calculate.min(num, counter), Calculate.average(num, counter), Calculate.std(num, counter));
    }

    public static void collectData() {
        String temp;
        for (int i = 0; i < 1000; i++) {
            System.out.print("Enter a number: ");
            temp = in.next();
            try {
                num[i] = Integer.parseInt(temp);
                counter++;
            } catch (Exception e) {
                if (temp.compareTo("done") == 0) {
                    return;
                } else {
                    System.out.println("Invalid input try again");

                }
            }

        }
    }

    public static void printNums() {
        System.out.print("Numbers:");
        for (int i = 0; i < counter - 1; i++) {
            System.out.printf(" %d,", num[i]);
        }
        System.out.printf(" %d", num[counter - 1]);
    }
    public static void printResults(int max, int min, double average, double std) {
        System.out.printf("\nThe average is %.1f\n", average);
        System.out.printf("The minimum is %d\n", min);
        System.out.printf("The maximum is %d\n", max);
        System.out.printf("The standard deviation is %.2f\n", std);
    }
}
