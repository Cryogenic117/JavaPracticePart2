package oop.assignment2.ex33;

import java.util.Scanner;
import java.util.Random;

public class Solution33 {
    private static final Random rand = new Random();
    private static final Scanner in = new Scanner(System.in);
    public static final String[] answers = {"Yes", "No", "Maybe", "Ask again later"};

    public static void main(String[] args) {
        generate();

        in.next();

        System.out.print(respond());
    }
    public static void generate() {
        System.out.print("What is your question?\n> ");
    }
    public static String respond() {

        return (answers[rand.nextInt(4)]);
    }
}
