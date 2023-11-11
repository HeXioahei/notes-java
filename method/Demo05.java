package com.mypackage.method;

public class Demo05 {
    public static void main(String[] args){
        //任意数字，找最大数
        printMax(1,2,3,4);
        printMax(new double[]{6,7,8,9,10});
    }

    public static void printMax(double ... numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
        }

        double result = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > result){
                result = numbers[i];
            }
        }

        System.out.println(result);
    }
}
