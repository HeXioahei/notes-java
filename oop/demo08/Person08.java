package com.mypackage.oop.demo08;

public class Person08 {
    public void run(){
        System.out.println("run");
    }
}

/*
多态注意事项：
1.多态是方法的多态，属性没有多态
2.父类和子类之间才能强制转换，否则会有类型转换异常  ClassCastException
3.存在条件：继承关系，父类引用指向子类对象

不可重写的方法：
    1.static 静态方法 属于类 不属于实例
    2.final  常量
    3.private 私有
 */
