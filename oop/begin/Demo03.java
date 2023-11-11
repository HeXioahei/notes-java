package com.mypackage.oop.begin;

public class Demo03 {
    public static void main(String[] args) {
        //形参和实参的类型要一样
        int add = new Demo03().add(1,2);
        int cut = cut(2,1);

        System.out.println(add);
        System.out.println(cut);

    }

    public int add(int a , int b){
        return a+b;
    }

    public static int cut(int a, int b){
        return a-b;
    }
}
