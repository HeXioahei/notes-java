package com.mypackage.oop.demo12;

//一个类（UserServiceImpl） 可以去实现（implement） 一个接口（UserService）
//实现接口的类，必须重写接口中的方法
public class UserServiceImpl implements UserService, TimeService{  //多继承
    //接口是抽象的，实现它时，必须重写它的方法。不然会报错。
    @Override
    public void run() {

    }

    @Override
    public void add(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }

    @Override
    public void time() {

    }
}
