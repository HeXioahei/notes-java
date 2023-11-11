package com.mypackage.oop.later;

//学生类
//类里面只存在属性和方法
public class Student {
    //属性：字段
    //在类里面方法外面定义一个属性（或者说是变量），然后在方法里面对他进行不同的实例化
    String name ;  //会有一个默认值，为null
    int age;   //会有一个默认值，为0

    //方法
    public void study(){
        System.out.println(this.name+"在学习");
        //this代表当前这个类
    }
    
}
