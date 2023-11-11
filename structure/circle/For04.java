package com.mypackage.structure.circle;

public class For04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        for ( b = 1; b<10; b++ ) {
            for ( a = 1; a<=b; a++ ) {
                    System.out.print(a + "×" + b + "=" + (a*b) + "\t");
            }

            System.out.println();    //用来换行
        }
    }
}
