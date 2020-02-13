package com.example.selfprogrammingtest.SelfOopsTest;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Red", 30, 2010, 4);
        System.out.println(c1.getDoors());
        c1.turnOn();
        c1.accelarate();
        c1.accelarate(50);
        c1.brake();
        c1.moveBack();
        System.out.println(c1.temp);
        System.out.println(c1.isRunning);
        c1.turnOff();
        System.out.println(c1.isRunning);
        System.out.println();
        System.out.println("----------------------");
        Bus b1 = new Bus();
        System.out.println("Door in bus: " + b1.getDoors());
        b1.turnOn();
        b1.accelate();
        b1.accelarate(40);
        b1.brake();
        b1.moveBack();

        //Car c2 = new Car();
        Car c2 = new Car("Balck",30,2012,8);
        c2.turnOn();
        System.out.println(c2.temp);

       // Car c3 = new Car();
        Car c3 = new Car("Yellow",30,2011,10);
        Employee e1 = new Employee("Rajnish", "kumar", 28, 50000);
        e1.mycar = c2;
        e1.mycar=c3;
        c2.driver = e1;
        System.out.println(e1.mycar.color);
        System.out.println(c2.driver.firstName);

    }
}
