package com.mypackage.oop.begin;

import java.io.IOException;

public class Demo01 {
    //一个类里只能有一个main方法
    public static void main(String[] args) {


    }
    /*
    修饰符  返回值类型  方法名(){
        //方法体
        return返回值
    }
    */
    public String sayHello(){
        return "hello,world!";
    }

    public int max (int a, int b){
        return a>b ? a : b; //三元运算符
    }

    public void print(){
        return;
    }

    public void readFile(String file) throws IOException{  //异常
        return;
    }

    //数组下标越界：Arrayindexoutofbounds
}
