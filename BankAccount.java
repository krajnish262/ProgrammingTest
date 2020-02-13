package com.example.selfprogrammingtest.BankTest;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        String name;
        double amount, balance = 100;
        int action = 0;
        System.out.println(" Welcome Your Bank account \n ");
        System.out.print("Enter ur Name ");
        name = keyBoard.nextLine();
        System.out.println("Hey :" + name);
        System.out.println("your current Balance is: " + balance);
        while (action != 4) {
            System.out.println("what u like to do:");
            System.out.println("1 Deposit");
            System.out.println("2 Withdrawal");
            System.out.println("3 View Current Balance");
            System.out.println("4 End Transaction");
            action = keyBoard.nextInt();
            if (action == 1) {
                balance = deposit(balance);
            }if (action==2){
                balance=withDraw(balance);
            }if (action==3){
               getBalance(balance);
            }
            if (action==4){
                System.out.println("End Of Transaction");
            }


        }

    }

    private static void getBalance(double balance) {
        System.out.println("Your Account balance is :"+balance);
    }


    private static double withDraw(double balance) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How much amount you want to withdraw");
        double amount=scanner.nextDouble();
        balance=balance-amount;
        System.out.println("Your with drawl amount is: "+balance);
        return balance;

    }

    private static double deposit(double balance) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("How much you want to deposit");
        double amount = keyBoard.nextDouble();
        balance =  balance+amount;
        System.out.println("Your balance is now :" + balance);
        return balance;

    }
}
