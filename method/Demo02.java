package com.mypackage.method;

public class Demo02 {

    public static void main(String[] args) {
        test();
    }

    public static void test () {
        //输出1~1000之间能被5整除的数，并每行输出3个
        int i = 1;
        int n = 0;

        for ( ; i>0 && i<1001; i++ ){
            if ( i%5 == 0 ){
                n++;
                if ( n%3 != 0 ) {
                    System.out.print(i + "\t");
                } else {
                    System.out.println(i + "\t");
                }
            }
        }
    }
}
