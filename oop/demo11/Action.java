package com.mypackage.oop.demo11;

//abstract 抽象类
public abstract class Action {
    public Action() {

    }  //抽象类也有构造器

    //abstract 抽象方法，只有方法的名字，没有方法的实现！靠子类实现。
    public abstract void doSomething();

    /*
    抽象类的特点：
        1.不能new这个抽象类，只能靠子类去实现它
        2.抽象类里面可以没有抽象方法，但抽象方法必须在抽象类中
     */
}

/*
类只能单继承，用extends。接口可以多继承。
 */