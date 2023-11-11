package com.mypackage.array;

import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) {
        int[] a = {3,2,6,7,4,5,6,34,56,7};

        int[] sort1 = sort1(a);    //调用我们自己写的排序方法后，返回一个排序后的数组

        System.out.println(Arrays.toString(sort1));     //降序，会输出[56, 34, 7, 7, 6, 6, 5, 4, 3, 2]

        int[] sort2 = sort2(a);    //调用我们自己写的排序方法后，返回一个排序后的数组

        System.out.println(Arrays.toString(sort2));     //降序，会输出[2, 3, 4, 5, 6, 6, 7, 7, 34, 56]

    }

    //冒泡排序
    //1.比较数组中两个相邻的元素，如果第一个数比第二个数大，就交换两个数的位置
    //2.每一次比较，都会产生一个最大或者最小的数字
    //3.下轮就会少一次排序
    //4.一次循环，直到结束

    //降序
    public static int[] sort1 (int[] array){
        int temp = 0;     //临时变量

        //外层循环，判断我们要走几次
        for (int i = 0; i < array.length-1; i++) {
            //内层循环，比较两个数，如果第一个数比第二个数大则交换位置
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j+1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }

    //升序
    public static int[] sort2 (int[] array){
        int temp = 0;     //临时变量

        //外层循环，判断我们要走几次
        for (int i = 0; i < array.length-1; i++) {
            //内层循环，比较两个数，如果第一个数比第二个数大则交换位置
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j+1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }

    //优化程序，减少不必要的循环次数
    public static int[] sort3 (int[] array){
        int temp = 0;     //临时变量

        //外层循环，判断我们要走几次
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false;
            //内层循环，比较两个数，如果第一个数比第二个数大则交换位置
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j+1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false){
                break;
            }
             /*若flag没有变成true，说明没有经历if结构，
            即在一次循环中，各个数都是按顺序排列的，
            也就没有必要再进行下面的循环
            所以break跳出循环*/
        }

        return array;
    }
}
