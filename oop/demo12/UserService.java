package com.mypackage.oop.demo12;

//接口都需要有一个实现类
public interface UserService {
    //接口中定义的方法都是抽象的（没有内容） 即使不写，也会默认为public abstract
    public abstract void run();
    //直接  返回值类型 + 名称 + （参数）
    void add(String name);    //增
    void delete(String name);   //删
    void update(String name);   //改
    void query(String name);   //查

    //接口中定义的属性都是常量，即使不写，也会默认为 public static final
    //不过，一般不会在接口里面定义属性，一般只定义方法
    int AGE = 99;
}

/*
学习Java，抽象思维很重要，抽象思维足够好，才能和成为架构师
 */
/*
接口的特性与作用：
    1.约束
    2。定义一些方法，让不同的人实现~
        （比如有十个员工，他们可以用各自的方法来是实现同一个接口
    3.public abstract
    4.public static final
    5.接口不能被实例化
        （因为接口不是个类，没有构造方法）
    6.可以实现多个接口的继承，用implements
    7.必须重写接口中的方法
 */
