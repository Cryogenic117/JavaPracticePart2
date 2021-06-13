/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex36;

public class Calculate {
    public static double average(int[] nums, int counter){
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += nums[i];
        }
        return (sum/counter);
    }

    public static int max(int [] nums, int counter) {
        int max = 0;
        for (int i = 0; i < counter; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    public static int min(int [] nums, int counter) {
        int min = nums[0];
        for (int i = 0; i < counter-1; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    public static double std(int [] num, int counter) {
        double std = 0.0, sum = 0.0;
        for (int i = 0; i < counter; i++) {
            sum += num[i];
        }

        double mean = average(num, counter);

        for (int i = 0; i < counter; i++) {
            std += Math.pow(num[i] - mean, 2);
        }

        return Math.sqrt(std/counter);
    }
}