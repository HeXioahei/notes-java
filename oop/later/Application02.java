package com.mypackage.oop.later;

public class Application02 {
    public static void main(String[] args) {
        //调用无参构造
        Person person = new Person();
        System.out.println(person.name);   //hexiaohei
        //调用有参构造
        Person person1 = new Person("linhuaidu");
        System.out.println(person1.name);  //linhuaidu
    }
}
