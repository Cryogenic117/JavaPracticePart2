/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex31;

public class TargetRate {
    public static double formulate(double intensity, double restingHR, double age) {
        intensity = intensity / 100;
        return (((220-age) - restingHR) * intensity) + restingHR;
    }
}
