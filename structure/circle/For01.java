package com.mypackage.structure.circle;

public class For01 {
    public static void main(String[] args) {
        int i = 1;
        int oddsum = 0;
        int evensum = 0;

        for (i=1; i>0 && i<101; i++){
            if (i%2==1) {
                oddsum += i;
            } else {
                evensum += i;
            }
        }

        System.out.println(oddsum);
        System.out.println(evensum);
    }
}
