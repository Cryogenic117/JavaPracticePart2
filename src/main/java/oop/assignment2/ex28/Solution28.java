/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex28;

import java.util.Scanner;

public class Solution28 {
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter a number: ");
            sum += in.nextInt();
        }
        generateOutput(sum);
    }
    public static void generateOutput(int n) {
        System.out.printf("The total is %d", n);
    }
}
