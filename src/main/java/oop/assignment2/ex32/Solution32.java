/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex32;

import java.util.Scanner;

public class Solution32 {

    public static int level;
    public static String play = "y";
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");
        while(true){

            getLevel();

            NumberGame.run(level);
            System.out.println("Do you wish to play again? (Y/N)?");
            play = in.next();

            if(play.compareTo("n") ==0 || play.compareTo("N") == 0)
                return;
        }
    }
    public static void getLevel() {
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        level = in.nextInt();
    }
}
