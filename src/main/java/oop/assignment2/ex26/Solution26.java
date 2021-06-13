/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex26;
import java.util.Scanner;

public class Solution26 {
    private static final Scanner in = new Scanner(System.in);
    static double balance, apr, payment, months;

    public static void main(String[] args) {

        getInput();

        months = PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment);
    }
    public static void getInput() {
        System.out.print("What is your balance?" );
        balance = in.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        apr = in.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        payment = in.nextDouble();
    }
}
