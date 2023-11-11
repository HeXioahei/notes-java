package com.mypackage.oop.demo05;

//Java中所有的类都默认继承Object类
//Person是父类（基类），Student和Teacher是子类（派生类）
//子类继承了父类，就会有父类的全部的公共（public）的方法以及属性
//如果前面没有修饰符，那他会默认为public
public class Person {

    public int money = 10_0000_0000;
    int money2 = 10;
    public void say() {
        System.out.println("说了一句话");
    }
}

//快捷键 ctrl + h  打开层次结构
