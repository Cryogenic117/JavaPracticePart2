/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex40;

import oop.assignment2.ex39.Employee;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution40 {
    private static final Scanner in = new Scanner(System.in);
    static String input;
    public static void main(String[] args) {
        getInput();

        System.out.println("Results:");
        System.out.println("Name\t\t\t\t  | Position\t\t     | Separation Date");
        System.out.println("----------------------|----------------------|-----------------");


        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee ("John", "Johnson", "Manager", "2016-12-31"));
        employeeMap.put(2, new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employeeMap.put(3, new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeMap.put(4, new Employee("Jake", "Jacobson", "Programmer", ""));
        employeeMap.put(5, new Employee("Jackquelyn", "Jackson", "DBA", ""));
        employeeMap.put(6, new Employee("Sally", "Webber", "Web Developer", "2015-12-18"));

        printMatch(employeeMap);
    }

    static void getInput() {
        System.out.print("Enter a search string: ");
        input = in.nextLine();
    }
    static void printMatch(Map<Integer, Employee> employeeMap) {
        Pattern pattern = Pattern.compile(input, Pattern.CASE_INSENSITIVE);

        for(Employee employee : employeeMap.values()) {
            Matcher matcher = pattern.matcher(employee.getFirstName()+employee.getLastName());
            boolean matchFound = matcher.find();
            if(matchFound) {
                System.out.printf("%-10s %-10s | %-20s |%-8s\n", employee.getFirstName(), employee.getLastName(),employee.getDepartment(), employee.getSeparationDate());
            }
        }
    }
}
