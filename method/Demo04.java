package com.mypackage.method;

public class Demo04 {
    public static void main(String [] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(1, 2, 3, 4, 5,6);
    }

    public void test (int ... i ){
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        System.out.println(i[4]);
        System.out.println(i[5]);
    }
}
