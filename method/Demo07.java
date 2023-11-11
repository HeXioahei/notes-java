package com.mypackage.method;

public class Demo07 {
    public static void main(String[] args){
        int i = f(1);
        System.out.println(i);
    }

    //阶乘
    public static int f(int n){
        if (n == 1) {
            return 1;
        } else {
            return n*f(n-1);
        }
    }
}
