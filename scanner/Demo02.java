package com.mypackage.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入：");

        String str = scanner.nextLine();

        System.out.println("输出：\n"+str);

        scanner.close();

    }
}
