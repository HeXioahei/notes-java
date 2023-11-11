package com.mypackage.oop.demo07;

public class A extends B{
    public static void test(){
        System.out.println("A=>test.()");
    }

    //override 重写
    @Override  //这是注解，即有功能的注释！
    public void test2() {
        //super.test2();
        //若我们没有自己写，它会如上默认调用父类的方法
        System.out.println("A2=>test.()");
    }
}
