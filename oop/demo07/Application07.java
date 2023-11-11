package com.mypackage.oop.demo07;

public class Application07 {
    public static void main(String[] args) {

        A a = new A();
        a.test();
        B b = new B();
        b.test();
        /*
        （对于静态方法来说）
        父类（B）的引用指向了子类（A），这是可以的
        子类的引用也可以指向父类
        来个生动的比喻，
        你可以向你的爸爸借东西，
        你的爸爸也可以找你借东西

        但到底调用的是哪个类、哪个方法
        是左边的，不是右边的
        方法的调用只与左边定义的数据类型有关
         */
        B b2 = new A();
        b2.test();

        System.out.println("===================");

        A a2 = new A();
        a2.test2();
        B b3 = new B();
        b3.test2();
        B b4 = new A();//子类重写了父类的方法（对于非静态方法来说）
        b4.test2();

        /*
        重写：
        1.重写只和非静态方法有关，与静态方法无关
        2.重写只能是public，不能是private
        3.重写是存在与继承中的，而且是子类重写父类
        4.重写是针对于方法的，不能用于属性
        5.两个方法的方法名和参数列表必须相同，但方法体不同（就是里面的内容不同）
        6.修饰符的范围可以扩大，但不能缩小
            例如：若父类是private，则子类可以是public
                 若父类是public，则子类不能是private
                 （public > protected >Default > private）
                 (即使什么都不写，它也会默认有个Default修饰符）
        7.重写可能抛出异常，异常的范围可以被缩小，但不能被扩大
            例如：ClassNotFoundException（类找不到的异常）（属于一个比较小的异常）
                 它属于Exception（总的异常）的一种
        */

        /*
        为什么需要重写：
            1.父类的功能对于子类来说，子类不一定需要，也不一定满足
         */

        //重写的快捷键：（Fn不亮的前提下）alt + f12  override
        //重载是同一个函数但参数不同

        //所以不要随便加static

        //静态的方法和非静态的方法区别很大
        /*
        静态方法：
         */
    }
}
