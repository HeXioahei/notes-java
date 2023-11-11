package com.mypackage.structure.xuanze;

import java.util.Scanner;

public class IfDuoXuan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入分数：");

        int score = scanner.nextInt();

        if (score>=85&&score<=100){
            System.out.println("优秀");
        } else if (score>=70&&score<85){
            System.out.println("良好");
        } else if (score>=60&&score<70){
            System.out.println("及格");
        } else if (score<60&&score>=0){
            System.out.println("不及格");
        } else {
            System.out.println("你的分数有问题");
        }

        scanner.close();
    }
}
