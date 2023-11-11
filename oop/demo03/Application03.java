package com.mypackage.oop.demo03;

public class Application03 {
    public static void main(String[] args) {
        Pet dog = new Pet();  //实例化类，并调用
        dog.name = "旺财";
        dog.age = 3;

        System.out.println(dog.name);
        System.out.println(dog.age);

        dog.shout();      //调用构造
    }
}
