package com.mypackage.oop.demo10;

import static java.lang.Math.random;    //静态导入包
import static java.lang.Math.PI;

public class Test {
    public static void main(String[] args) {
        //random  一种产生随机数的方法
        System.out.println(Math.random());   //没导入包之前，前面必须要加个Math
        System.out.println(random());     //导入包之后，Math可加可不加
        System.out.println(PI);          //输出3.141592653589793
    }
}

//被final修饰的类不能被继承，断子绝孙！！！
