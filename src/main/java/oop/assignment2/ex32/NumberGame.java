/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex32;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private static final Scanner in = new Scanner(System.in);
    public static Random rand = new Random();

    public static void run(int level) {
        int random;


        if (level == 1)
            random = rand.nextInt(10) +1;
        else if (level == 2)
            random = rand.nextInt(100) +1;
        else if (level == 3)
            random = rand.nextInt(1000) +1;
        else {
            System.out.println("Invalid level input");
            return;
        }

        System.out.print("I have my number. What's your guess? ");
        int attempts = guessAttempt(random);

        System.out.printf("You got it in %d guesses!", attempts);

    }

    public static int guessAttempt(int random) {
        int guess = -99999, counter = 1;

        try {
            guess = Integer.parseInt(in.next());
        } catch (Exception exe) {
            System.out.print("Try again and enter a valid number: ");
            counter++;
        }
        while (true) {
            if (guess > random) {
                System.out.print("Too high. Guess again: ");
                try {
                    guess = Integer.parseInt(in.next());
                } catch (Exception exe) {
                    System.out.print("Try again");
                    counter++;
                }
                counter++;
            } else if (guess < random && guess != -99999) {
                System.out.print("Too low. Guess again: ");
                try {
                    guess = Integer.parseInt(in.next());
                } catch (Exception exe) {
                    System.out.print("Try again and enter a valid number: ");
                    counter++;
                }
                counter++;
            } else if (guess == -99999) {
                try {
                    guess = Integer.parseInt(in.next());
                } catch (Exception exe) {
                    System.out.print("Try again and enter a valid number: ");
                    counter++;
                }
            }
            else{
                    return counter;
                }
            }

        }
    }
