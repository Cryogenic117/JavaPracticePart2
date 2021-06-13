/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Knudson
 */
package oop.assignment2.ex39;

public class Employee {
    private String firstName;
    private String lastName;
    private String department;
    private String separationDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    public String getSeparationDate() {
        return separationDate;
    }

    void setSeparationDate(String separationDate) {
        this.separationDate = separationDate;
    }

    public Employee(String firstName,
                    String lastName,
                    String department,
                    String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.separationDate = separationDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", separationDate='" + separationDate + '\'' +
                '}';
    }
}

