package com.mypackage.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        float f = 0.0f;

        System.out.println("请输入整数：");
        //如果……那么……否则……
        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("输出整数"+i);
        } else {
            System.out.println("输入的不是整数");
        }

        System.out.println("请输入小数：");
        //如果……那么……否则……
        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("输出小数"+f);
        } else {
            System.out.println("输入的不是小数");
        }

        scanner.close();

        /*因为之定义了一个变量scanner，所以，
        如果输入的第一个数满足第一个if，则下一个if前可以再输入一个数；
        如果输入的第一个数不满足第一个if，它会直接滑到下一个if那进行判断，不用再输入一个数*/
    }
}
