package com.mypackage.array;

public class Demo04 {
    public static void main(String[] args) {
        int [][] arrays = {{1,2},{2,3},{3,4},{4,5}};
        //这是一个四行两列的数组[4][2]
        /*
        1,2   array[0]
        2,3   array[1]
        3,4   array[2]
        4,5   array[3]
        */

        printArray(arrays[0]);
        printArray(arrays[1]);
        printArray(arrays[2]);
        printArray(arrays[3]);

        System.out.println("==========================");

        System.out.println(arrays[0][0]);
        System.out.println(arrays[0][1]);
        System.out.println(arrays[1][0]);
        System.out.println(arrays[1][1]);

    }

    //创建一个打印数组元素的方法
    //数组作方法入参
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }

        System.out.println();
    }
}
