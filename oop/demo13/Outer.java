package com.mypackage.oop.demo13;

public class Outer {

    private int id = 10;
    public void out(){
        System.out.println("这是外部类的方法");
    }

    public class Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }

        //内部类访问外部类的一些属性（包括私有属性）（前提是，内部类不是静态的情况下）
        public void getID(){
            System.out.println(id);
        }
    }

    //一个Java类中可以有多个class类，但是只能有一个public class

    public void method(){
        //局部内部类
        class Inner{
            public void in(){

            }
        }


    }
}
