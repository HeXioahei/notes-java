package com.mypackage.method;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = max(a,b);
        System.out.println(max);


    }

    //比大小
    public static int max(int num1, int num2){
        int result = 0;

        if (num1 > num2){
            result = num1;
        } else if (num1 < num2){
            result = num2;
        } else {
            System.out.println("num1 = num2");
            return 0;   //直接终止方法
        }

        return result;    //返回值
        //return的作用：返回值和终止方法
    }
}
