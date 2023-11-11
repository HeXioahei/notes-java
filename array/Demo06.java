package com.mypackage.array;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args){

        int[] a = {1,23,13,23,444,543,2};

        System.out.println(a);   //会输出[I@75b84c92，说明打印的是一个数组

        //打印数组元素
        System.out.println(Arrays.toString(a));   //会输出[1, 23, 13, 23, 444, 543, 2]

        //用自己写的方法打印数组元素
        printArrays(a);    //输出[1, 23, 13, 23, 444, 543, 2]

        System.out.println();   //换行一下

        //升序排序
        Arrays.sort(a);
        //然后打印输出
        System.out.println(Arrays.toString(a));  //会输出[1, 2, 13, 23, 23, 444, 543]

        //换值填充
        Arrays.fill(a,0);
        //然后打印输出
        System.out.println(Arrays.toString(a));  //会输出[0, 0, 0, 0, 0, 0, 0]
    }

    //自己写一个打印数组元素的方法
    //但程序里面要避免重复造笼子，所以一般有了现成的方法就不自己写
    public static void printArrays(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.print("[" + a[i]+", ");
            } else if (i == a.length-1){
                System.out.print(a[i]+"]");
            } else {
                System.out.print(a[i]+", ");
            }
        }

    }
}
