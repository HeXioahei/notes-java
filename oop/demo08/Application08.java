package com.mypackage.oop.demo08;

public class Application08 {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        new Student08();
        new Person08();

        //但对象可以指向的引用类型就不确定了

        Student08 s1 = new Student08();
        Person08 s2 = new Student08();  //父类的引用指向子类的类型
        Object s3 = new Student08();
        Person08 p1 = new Person08();   //父类的引用指向自己

        //对象能执行哪些方法，主要看的是等号左边的类型
        s2.run();   //son
        //s2.eat();  //会报错
        //父类虽然可以指向子类，但是不能调用子类独有的方法
        ((Student08)s2).eat();  //进行强制性转换，高转低（父转子）（不能同级之间进行类型转换） //eat
        s1.eat();    //eat
        s1.run();    //son
        p1.run();    //run
    }
}
