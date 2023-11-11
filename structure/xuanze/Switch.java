package com.mypackage.structure.xuanze;

public class Switch {
    public static void main(String[] args){
        //case穿透  switch匹配一个值
        char grade = 'C';

        switch (grade){
            case 'A':
                System.out.println("优秀");//语句
                //break;  //可不写
            case 'B':
                System.out.println("良好");//语句
                //break;  //可不写
            case 'C':
                System.out.println("及格");//语句
                //break;  //可不写
            case 'D':
                System.out.println("不及格");//语句
                //break;   //可不写
            //你可以有任意数量的case语句
            default://可不写
                System.out.println("未知");//语句
                //break;  //可不写

                //但规范化写法，break要写
        }
    }
}
