package com.example.selfprogrammingtest.SelfOopsTest;

public class Vehicle {
    int speed;
    private double gas;
    public String color;
    public double temp;
    public boolean isRunning;
    public int year;
    //vehicle has driver
    public Employee driver;//Reference to object [object data type]
    //vehicle has passenger
    public Employee[] passenger;//Array of employees
    //vehicle has tires
    public Tube[] tires;//Array of Tube

    public Vehicle() {
        System.out.println("vehicle is constructed");
    }

    public Vehicle(String s) {
        super();
        System.out.println("vehicle with string");
    }

    public Vehicle(String color, double temp, int year, int size) {
        this.passenger = new Employee[size];
        this.color = color;
        if (year < 2012) {
            this.gas = 30;
        } else {
            this.gas = 50;
        }
        this.isRunning = false;
        this.speed = 0;
        this.temp = temp;
        this.year = year;

    }

    public boolean turnOn() {
        this.isRunning = true;
        this.gas--;
        this.temp++;
        return isRunning;
    }

    public void turnOff() {
        isRunning = false;
    }

    public void accelate() {
        if (isRunning) {
            this.gas--;
            this.speed++;
        }
    }

    public void accelarate(int x) {
        if (isRunning) {
            this.gas--;
            speed = speed + x;
        }
    }

    public void brake() {
        if (isRunning) {
            speed--;
        }
        System.out.println("Brake is apply on speed");

    }

    public double getGas() {
        return gas;


    }

    public void setGas(double gas) {
        this.gas = gas;
    }

}
