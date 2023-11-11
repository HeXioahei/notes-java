package com.mypackage.array;

public class Demo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        //增强型for循环，省去了数组的下标
        for (int array : arrays) {
            System.out.print(array+" ");
        }
        System.out.println();    //隔行

        printArray(arrays);    //用新定义的方法打印

        System.out.println();    //隔行

        //reverse(arrays);    //这样写不行，没有定义一个新的数组
        int[] reverse = reverse(arrays);   //这样写才行  新定义一个反转数组
        printArray(reverse);    //然后用打印数组元素的方法打印出来
    }

    //创建一个打印数组元素的方法
    //数组作方法入参
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }

    //反转数组（数组作为返回值）
    public static int[] reverse(int[] arrays){
        //int[]是返回值类型，说明返回值是数组
        int[] result = new int[arrays.length];
        //反转操作
        for (int i = 0; i < arrays.length; i++) {
            result [i] = arrays[arrays.length-i-1];
        }

        return result;

    }
}
