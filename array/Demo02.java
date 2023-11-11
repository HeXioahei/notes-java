package com.mypackage.array;

public class Demo02 {
    public static void main(String[] args){
        int[] arrays = {1,2,3,4,5};

        //打印所有元素
        System.out.println("全部元素有：");
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

        //计算所有元素的和
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        System.out.println("所有元素的和为："+sum);

        //查找最大元素
        int max = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (max < arrays[i]){
                max = arrays[i];
            }
        }
        System.out.println("最大元素为："+max);

    }
}
