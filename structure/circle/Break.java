package com.mypackage.structure.circle;

public class Break {
    public static void main (String[] args){
        int i = 0;
        while ( i<100 ) {
            i++;
            System.out.println(i);
            if  (i == 10) {
                break;
            }
        }

        System.out.println("123");
    }
}
