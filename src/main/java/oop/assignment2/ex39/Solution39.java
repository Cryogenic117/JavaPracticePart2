/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex39;

import java.util.*;
import java.util.Map.Entry;
public class Solution39 {


    public static void main(String[] args) {

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee ("John", "Johnson", "Manager", "2016-12-31"));
        employeeMap.put(2, new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employeeMap.put(3, new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeMap.put(4, new Employee("Jake", "Jacobson", "Programmer", ""));
        employeeMap.put(5, new Employee("Jackquelyn", "Jackson", "DBA", ""));
        employeeMap.put(6, new Employee("Sally", "Webber", "Web Developer", "2015-12-18"));

        Set<Entry<Integer, Employee>> entrySet = employeeMap.entrySet();
        List<Entry<Integer, Employee>> list = new ArrayList<>(entrySet);

        Collections.sort(list, new Comparator<Map.Entry<Integer, Employee>>() {
                @Override
                public int compare(Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                    return o1.getValue().getLastName().compareTo(o2.getValue().getLastName());
                }
            });
        System.out.println("Name\t\t\t\t  | Position\t\t     | Separation Date");
        System.out.println("----------------------|----------------------|-----------------");
        list.forEach(e -> {
            System.out.printf("%-10s %-10s | %-20s |%-8s\n", e.getValue().getFirstName(), e.getValue().getLastName(),e.getValue().getDepartment(), e.getValue().getSeparationDate());
        });
    }
}

