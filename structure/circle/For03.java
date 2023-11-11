package com.mypackage.structure.circle;

//public class For03 {
//    //九九乘法表
//    public static void main(String[] args) {
//        int a = 1;
//        int b = 1;
//        int c = 1;
//        int n = 0;
//
//        for ( ; a<10 && b<10; b++ ) {
//            n++;
//            for ( a = 1; a<=b; a++ ) {
//                c = a*b;
//                if (n == a) {
//                    System.out.println(a + "×" + b + "=" + c + "\t");
//                } else {
//                    System.out.print(a + "×" + b + "=" + c + "\t");
//                }
//            }
//        }
//    }
//}

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        for ( ; a<i+1 && b<i+1; b++ ) {
            n++;
            for ( a = 1; a<=b; a++ ) {
                c = a*b;
                if (n == a) {
                    System.out.println(a + "*" + b + "=" + String.format("%-4d",c));
                } else {
                    System.out.printf(a + "*" + b + "=" + String.format("%-4d",c));
                    //要注意a和b的顺序
                }
            }
        }
    }
}

