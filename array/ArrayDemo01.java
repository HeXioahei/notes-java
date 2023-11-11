package com.mypackage.array;

public class ArrayDemo01 {
    //变量类型  变量名字 = 变量值;
    //int[]   数组类型   int类型的数组
    public static void main (String[] args) {
        int[] nums ;   //  1.声明了一个数组
        //int nums[] ;   //一般c中用此定义，Java常用上面的定义

        nums = new int[10];   //2.创建一个数组
        //也可以直接写：int[] nums = new int[10];

        //下面开始赋值
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        //若有一个位置未赋值，它会有默认值，如，int的默认值为0，那个位置就为0

        System.out.println(nums[0]);
        System.out.println(nums[5]);
        System.out.println(nums[8]);
        System.out.println(nums[9]);

        //计算所有元素的和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("数组元素总和为：" + sum);
    }
}
