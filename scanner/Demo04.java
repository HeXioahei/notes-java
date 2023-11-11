package com.mypackage.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args){
        //输入多个数字，并求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;            //求和
        int n = 0;                //计算输入了多少个数
        double average = 0.0;       //求平均数

        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            n++;
            sum += x;
            average = sum / n;
            System.out.println("你输入了第"+n+"个数据，当前结果sum="+sum);
        }

        System.out.println("这"+n+"个数的和为"+sum);
        System.out.println("这"+n+"个数的平均数为"+average);

        scanner.close();
    }
}
