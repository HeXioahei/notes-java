package com.mypackage.method;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        String operation = scanner.next();
        double b = scanner.nextInt();
        double result = 0 ;

        switch (operation) {
            case "+":
                result = add(a,b);
                break;
            case "-":
                result = cut(a,b);
                break;
            case "*":
                result = multiple(a,b);
                break;
            case "/":
                result = divide(a,b);
                break;
        }

        System.out.println(result);
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static double cut(double a, double b){
        return a - b;
    }

    public static double multiple(double a,double b){
        return a * b;
    }

    public static double divide(double a, double b){
        return a / b;
    }
}
