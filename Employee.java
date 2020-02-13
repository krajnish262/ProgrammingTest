package com.example.selfprogrammingtest.SelfOopsTest;

public class Employee {
    public String firstName;
    public String lastName;
    public String address;
    public int age;
    public String telephoneNo;
    public double salary;
    public Car mycar;//reference to object

    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public double getRaise(double raise) {
        salary = salary + salary * raise;
        return salary;
    }
}
