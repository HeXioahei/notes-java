package com.mypackage.oop.demo10;

public class Person {

    //匿名代码块
    {
        System.out.println("匿名代码块");
    }

    //静态代码块
    static {
        System.out.println("静态代码块");
    }

    //构造方法
    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        //输出结果及顺序为：静态代码块，匿名代码块，构造方法
        System.out.println("==============");

        Person person2 = new Person();
        //输出结果及顺序为：匿名代码块，构造方法

        //静态方法只执行一次
        //匿名代码块可以用来赋初始值
    }

}
