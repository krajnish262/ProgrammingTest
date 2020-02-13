package com.example.selfprogrammingtest;

class EncapsulationDemo {
    public void add(int a, int b) {
        int c = a + b;
        System.out.println("int sum is: " + c);
    }

    public void add(float a, float b) {
        float c = a + b;
        System.out.println("folat sum is: " + c);
    }
}

class InheritanceDemo extends EncapsulationDemo {
    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Overide int sum is " + c);
    }
}

interface Demo {
    void run();

    void walk();
}

class Rajnish implements Demo {
    public void run() {
        System.out.println("Rajnish is running");
    }

    public void walk() {
        System.out.println("Rajnish is walking");
    }
}

public class OopsTest1 {
    public static void main(String[] args) {
        EncapsulationDemo eDemo = new EncapsulationDemo();
        eDemo.add(10, 10);
        eDemo.add(10f, 10f);
        InheritanceDemo iDemo = new InheritanceDemo();
        iDemo.add(11, 20);
        Rajnish rajnish = new Rajnish();
        rajnish.run();
        rajnish.walk();


    }
}
