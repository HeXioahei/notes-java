package com.mypackage.structure.circle;

public class Rectangle {
    public static void main (String[] args) {
        //打印三角形  x行

        int x = 7;
        for ( int i = 1; i <= x; i++ ) {
            for (int j = x; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++ ){
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
