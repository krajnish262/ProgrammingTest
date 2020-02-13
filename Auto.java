package com.example.selfprogrammingtest.SelfOopsTest;

public class Auto extends Vehicle {
    public boolean isAirCondition;
    public int doors;

    public Auto() {
        System.out.println("Auto is constructed");
    }

    public Auto(String s) {
        super(s);
        System.out.println("Auto with String");
    }

    public Auto(String color, double temp, int year, int size) {
        super(color, temp, year, size);
    }

    public boolean isAirCondition() {
        return isAirCondition;
    }

    public void setAirCondition(boolean airCondition) {
        isAirCondition = airCondition;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void moveBack() {
        System.out.println("Auto is moving back");
    }
}
