package com.mypackage.structure.circle;

public class Continue {
    public static void main (String[] args) {
        int i = 0;
        while ( i < 100 ) {
            i++;
            if ( i % 10 == 0 ) {
                System.out.println();
                continue;
            }
            System.out.println(i);
        }
    }
}
