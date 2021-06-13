/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex30;

public class Solution30 {

    public static void main() {

        printTable();

    }

    public static void printTable() {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%3d ", i * j);
            }
            System.out.println();
        }
    }
}