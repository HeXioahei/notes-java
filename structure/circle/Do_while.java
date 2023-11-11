package com.mypackage.structure.circle;

public class Do_while {
    public static void main (String[] args) {
        int i = 1;
        int sum = 0;
        System.out.println("输出1~100:");

        do {
            System.out.println(i);
            sum += i;
            i++;
        } while (i > 1 && i < 101);

        System.out.println("1~100的和为：" + sum);
    }
}
