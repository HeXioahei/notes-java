package com.mypackage.structure.xuanze;

import java.util.Scanner;

public class IfShuangXuan {
    public static void main(String[] args){
        //考试分数大于等于60是通过，否则为不通过
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入分数：");

        int score = scanner.nextInt();

        if (score>=60){
            System.out.println("通过");
        } else {
            System.out.println("不通过");
        }

        scanner.close();
    }
}
