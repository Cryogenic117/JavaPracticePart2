/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution34 {
    private static  List list = new ArrayList();
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        initializeList();
        listEmployees();

        removeEmployee();
        listEmployees();
    }
    public static void initializeList() {
        list.add("John Smith");
        list.add("Jackie Jackson");
        list.add("Chris Jones");
        list.add("Amanda Cullen");
        list.add("Jeremy Goodwin");
    }
    public static void listEmployees() {
        System.out.printf("The are %d employees:\n", list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void removeEmployee() {
        System.out.print("\nEnter an employee name to remove: ");
        String removed = in.nextLine();
        System.out.println();
        if (!list.contains(removed)) {
            System.out.println("Employee doesn't exist");
        }
        else {
            for (int i = 0; i <list.size() ; i++) {
                if(removed.compareTo( (String) list.get(i)) == 0) {
                    list.remove(i);
                }
            }
        }
    }
}
