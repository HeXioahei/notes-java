package com.mypackage.structure.circle;

public class Label {
    public static void main (String[] args) {
        //打印101~150之间所有的质数
        int count = 0;

        outer:for ( int i = 101; i < 150; i++ ) {
            for ( int j = 2; j < i/2; j++ ) {  //只循环到i/2是因为一个数的因数一定小于等于他的一半
                if ( i % j == 0 ) {
                    continue outer;
                }
            }
            System.out.println(i);
        }
    }
}
