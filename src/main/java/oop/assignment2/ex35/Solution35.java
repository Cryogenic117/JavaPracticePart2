/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex35;

import java.util.Random;
import java.util.Scanner;

public class Solution35 {
    public static String[] contestants = new String[1000];
    static final Random rand = new Random();
    private static final Scanner in = new Scanner(System.in);
    static  int contestants_size = 0;

    public static void main(String[] args) {
        readContestants();

        chooseWinner();
    }

    public static void readContestants() {

        String temp;
        for (int i = 0; ; i++) {
            System.out.print("Enter a name: ");
            temp = in.nextLine();
            if (temp.isEmpty()) {
                return;
            } else {
                contestants[i] = temp;
                contestants_size++;
            }
        }
    }
    public static void chooseWinner() {
        System.out.printf("The winner is ... %s",contestants[rand.nextInt(contestants_size)] );
    }
}
