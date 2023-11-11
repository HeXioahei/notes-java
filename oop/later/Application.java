package com.mypackage.oop.later;

//一个项目应该只存在一个main方法
public class Application {
    public static void main(String[] args) {
        //在类里面方法外面定义一个属性（或者说是变量），然后在方法里面对他进行不同的实例化
        //类是抽象的，需要实例化
        //类实例化后会返回一个自己的对象
        //student对象就是一个Student类的具体实例
        Student student = new Student();    //调用别的类，new完之后就被实例化了
        Student Jack = new Student();    //new完之后就被实例化了
        Student July= new Student();    //new完之后就被实例化了

        System.out.println(Jack.name);   //null
        System.out.println(July.age);   //0

        Jack.name = "Jack";    //赋值
        July.age = 18;    //赋值

        System.out.println(Jack.name);   //Jack
        System.out.println(July.age);   //18
    }
}
