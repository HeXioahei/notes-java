package com.mypackage.structure.circle;

public class While {
    //输出1~100并计算1~100的和
    public static void main (String[] args) {
        int i = 1;
        int sum = 0;
        System.out.println("输出1~100:");

        while (i>0&&i<101){
            System.out.println(i);
            sum += i;
            i++;
        }

        System.out.println("1~100的和为："+sum);
    }
}
