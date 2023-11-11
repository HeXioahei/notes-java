package com.mypackage.oop.demo04;

public class Application04 {
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1.name;      //用不了，name是私有的
        s1.setName("何小黑");             //先setName
        System.out.println(s1.getName());     //再getName

        s1.setAge(999);
        System.out.println(s1.getAge());

        s1.setAge(18);
        System.out.println(s1.getAge());

        //println其实也是一个方法，是一个重载了很多类型参数的方法
    }
}
