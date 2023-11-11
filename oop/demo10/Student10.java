package com.mypackage.oop.demo10;

public class Student10 {

    public static int age;   //静态变量
    private double score;   //非静态变量

    public void run(){
        System.out.println("run");
    }

    public static void go(){
        System.out.println("go");
    }


    public static void main(String[] args) {
        Student10 student10 = new Student10();

        System.out.println(Student10.age);    //类变量
        //System.out.println(Student10.score);  //报错
        System.out.println(student10.age);    //下面这两个是和对象有
        System.out.println(student10.score);   //非静态，不能直接调用，必须new了才能用

        //run();    不能这样直接调用
        new Student10().run();    //非静态，不能直接调用，必须new了才能用
        go();   //静态，可以直接调用

        //静态的才能直接被调用，非静态的不能直接被调用
    }
}
