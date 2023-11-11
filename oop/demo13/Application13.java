package com.mypackage.oop.demo13;

public class Application13 {
    public static void main(String[] args) {
        //new
        Outer outer = new Outer();

        //通过外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();
    }
}
