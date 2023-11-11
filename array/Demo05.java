package com.mypackage.array;

public class Demo05 {
    public static void main(String[] args) {
        int [][] arrays = {{1,2},{2,3},{3,4},{4,5}};
        //这是一个四行两列的数组[4][2]
        /*
        1,2   array[0]
        2,3   array[1]
        3,4   array[2]
        4,5   array[3]
        */

        printArray2(arrays);
    }

    //创建一个打印二位数组的方法
    public static void printArray2(int[][] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]+" ");
            }
            System.out.println();
        }
    }
}
