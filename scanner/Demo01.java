package com.mypackage.scanner;

import java.util.Scanner;          //需要引入Scanner这个类

public class Demo01 {
    public static void main(String[] args){
        //创建一个扫描器对象，用于接收键盘数据,每次键盘输入都需创建
        Scanner scanner1 = new Scanner(System.in);    //scanner1是个变量名

        System.out.println("用next方式接收：");

        //判断用户有没有输入字符串
        if (scanner1.hasNext()){
            //使用next方式接收
            String str1 = scanner1.next();        //新定义一个对象str1去接受
            System.out.println("输出的内容为："+str1);
        }

        //创建一个扫描器对象，用于接收键盘数据,每次键盘输入都需创建
        Scanner scanner2 = new Scanner(System.in);       //scanner2是个变量名

        System.out.println("用next方式接收：");

        if (scanner2.hasNextLine()){
            String str2 = scanner2.nextLine();        //新定义一个对象str2去接受
            System.out.println("输出的内容为："+str2);
        }

        //有Line和没有Line的区别，看输出结果即知

        scanner1.close();
        scanner2.close();      //用完scanner之后及时关掉，节约资源
        //凡是IO流的类如果不关掉会一直占用资源，要养成好习惯用完就关掉
        //IO流：  I 输入  O输出   和输入输出打交道的
    }
}
