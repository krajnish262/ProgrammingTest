package com.example.selfprogrammingtest.BankTest;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, ans;
        String operator;
        System.out.println("Welcome to Rajnish Simple Calculator Program");
        do {
            System.out.println("Enter your calculation Module :mumber1[operand]number2");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            operator = scanner.next();
            if (operator.equals("+")) {
                ans = num1 + num2;
            } else if (operator.equals("-")) {
                ans = num1 - num2;
            } else if (operator.equals("*")) {
                ans = num1 * num2;

            } else if (operator.equals("/")) {
                ans = num1 / num2;
            } else if (operator.equals("^")) {
                ans = Math.pow(num1, num2);
            } else if (operator.equals("%")) {
                long n1 = Math.round(num1);
                long n2 = Math.round(num2);
                ans = isMode(n1, n2);
            }else {
                System.out.println("Undefined operator"+operator);
                ans=0;

            }
            System.out.println("Result: "+ans);
        }while (num1!=0);
        System.out.println("Calculation Over:");

    }

    private static double isMode(long n1, long n2) {
        double ans;
        if (n1 % n2 == 0) {
            System.out.println("\n " + n1 + " is fully divisible by: " + n2);
            return ans = n1 % n2;
        } else {
            System.out.println("\n" + n1 + " is not divisible by :" + n2);
            return ans = n1 % n2;
        }
    }
}
