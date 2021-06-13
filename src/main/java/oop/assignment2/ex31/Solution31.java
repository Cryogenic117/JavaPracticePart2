/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex31;

import java.lang.annotation.Target;
import java.util.Scanner;

public class Solution31 {
    private static final Scanner in = new Scanner(System.in);
    public static double age, restingHR;

    public static void main(String[] args) {
        getInput();
        generateResults();
    }
    public static void getInput() {
        System.out.print("Enter your age: ");
        // next double ensure only numbers can influence the system in
        age = in.nextDouble();

        System.out.print("Enter your resting heart rate: ");
        restingHR = in.nextDouble();
    }

    public static void generateResults() {
        System.out.println("Intensity\t|\tRate");
        System.out.println("------------|-----------");

        for (int i = 55; i <=95; i+=5) {
            System.out.printf("%d%% \t\t|\t %.0f bpm\n", i, TargetRate.formulate(i, restingHR, age));
        }
    }
}
