/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex26;

import java.lang.Math;

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double balance, double apr, double payment) {
        // Sectioned for testing and ensuring the execution of the formula is in proper order
        double i = (apr/100) / 365.0;
        double part1 = -(1/30.0);
        double part2 = Math.log(1 + 5000.0/100.0 * (1 - Math.pow(1+i,30.0)));
        double part3 = Math.log(1 + i);
        double months = part1 * (part2 / part3);

        return Math.ceil(months);
    }
}
