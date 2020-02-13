package com.example.selfprogrammingtest.DesignPattern;

public class SingleTonClassDemo {
    private static SingleTonClassDemo mySingleTon;

    private SingleTonClassDemo() {



    }
    public static SingleTonClassDemo getMySingleTon(){
        /*if (mySingleTon==null){
            mySingleTon=new SingleTonClassDemo();
            System.out.println("Singleton test");
        }*/
        mySingleTon=new SingleTonClassDemo();
        System.out.println("test");
        return mySingleTon;
    }

    public static void main(String[] args) {
        getMySingleTon();


    }
}
