package com.example.selfprogrammingtest.DesignPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

interface animalCatogories{
    void  sleep();
}
enum ANIMAL_TYPE {
    HERBIVORUS, COURNIVOROUS;
}

abstract class Animal {
    String name, color;
    ANIMAL_TYPE animal_type;

    public ANIMAL_TYPE getAnimal_type() {
        ANIMAL_TYPE putName = ANIMAL_TYPE.COURNIVOROUS;
        return putName;
    }

    public ANIMAL_TYPE getAnotherAnimal_type() {
        ANIMAL_TYPE type = ANIMAL_TYPE.HERBIVORUS;
        return type;
    }

    public Animal(String name, String color, ANIMAL_TYPE animal_type) {
        this.name = name;
        this.color = color;
        this.animal_type = animal_type;
    }

    public String eat(String food) {
        String foodItem = name;

        return foodItem;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String speak() {
        return name + " " + sound();
    }

    abstract String sound();


}


class Cow extends Animal implements animalCatogories {

    public Cow(String name, String color) {
        super(name, color);
    }

    @Override
    public String sound() {
        return "moo";
    }


    @Override
    public void sleep() {
        System.out.println("sleeping time is 15 hrs");
    }
}

class Horse extends Animal implements animalCatogories {

    public Horse(String name, String color) {
        super(name, color);
    }

    @Override
    public String sound() {
        return "heeeeee";
    }

    @Override
    public void sleep() {
        System.out.println("sleeping time is 10 hrs");
    }
}

class Tiger extends Animal implements animalCatogories {

    public Tiger(String name, String color) {
        super(name, color);
    }

    @Override
    String sound() {
        return "bbbb";
    }


    @Override
    public void sleep() {
        System.out.println("sleeping time is 10 hrs");
    }
}


public class OverRidingDemo {
    public static void main(String[] args) {
        Animal h = new Horse("Vaibhav Horse", "white");
       // System.out.println(h.speak() + " ");
       // System.out.println(h.sound());
        System.out.println(h.getName() + " " + h.getColor() + " " + h.getAnotherAnimal_type()+" "+h.eat("grass"));

        Animal t = new Tiger("Tiger Hero", "Black");
        System.out.println(t.getName() + " " + t.getColor() + " " + t.getAnimal_type()+" "+t.eat("Meat"));



        Animal[] animals = {new Horse("RAJA", "Brown"), new Cow("SHYAM COW", "Black and white")
                , new Tiger("DAVID TIGER", "BLACK")};
        for (Animal a : animals) {
            System.out.println(a.getName() + " " + a.getColor());

        }
        Map<Animal,ANIMAL_TYPE>map=new HashMap<>();

        Animal animal=new Horse("HORSE 1","BLACK");
        Animal animal1=new Horse("HORSE 2","WHITE");
        Animal animal2=new Tiger("TIGER ","BLACK");
        Animal animal3=new Tiger("TIGER 1","WHITE");
        for (ANIMAL_TYPE type:ANIMAL_TYPE.values()  ) {


        }

    }
}