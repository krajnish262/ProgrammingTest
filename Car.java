package com.example.selfprogrammingtest.SelfOopsTest;

public class Car extends Auto {
    public Car() {
        System.out.println("car is constructed");
        this.setDoors(4);
        this.passenger = new Employee[4];
    }

    public Car(String s) {
        super(s);
        System.out.println("Car with String");
    }

    public Car(String color, double temp, int year, int size) {
        super(color, temp, year, size);
    }

    private boolean safari;

    public void setSafari(boolean safari) {
        this.safari = safari;
    }

    public boolean isSafari(boolean safari) {
        return safari;
    }

    public void accelarate() {
        super.accelarate(10);
        if (this.isRunning) {
            this.speed++;
        }

    }

    public void brake() {
        if (isRunning) {
            speed = speed - 2;
        }
        System.out.println("car is brake  on speed " + speed);
    }
}
