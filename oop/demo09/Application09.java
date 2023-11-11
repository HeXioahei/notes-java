package com.mypackage.oop.demo09;

public class Application09 {
    public static void main(String[] args) {

        //Object > String
        //Object > Person > Teacher
        //Object > Person > Student

        Object object = new Student();

        System.out.println(object instanceof Student);  //true
        System.out.println(object instanceof Person);   //true
        System.out.println(object instanceof Object);   //true
        System.out.println(object instanceof Teacher);  //false
        System.out.println(object instanceof String);   //false

        System.out.println("================");

        Person person = new Student();

        System.out.println(person instanceof Student);  //true
        System.out.println(person instanceof Person);   //true
        System.out.println(person instanceof Object);   //true
        System.out.println(person instanceof Teacher);  //false
        //System.out.println(person instanceof String);   //编译即报错，因为Person和String是无继承关系的，不能进行类型比较

        System.out.println("================");

        Student student = new Student();

        System.out.println(student instanceof Student);  //true
        System.out.println(student instanceof Person);   //true
        System.out.println(student instanceof Object);   //true
        //System.out.println(student instanceof Teacher);  //编译即报错，因为Student和Teacher是无继承关系的
        //System.out.println(person instanceof String);   //编译即报错，因为Student和String是无继承关系的

        System.out.println("================");

        Object object2 = new Person();

        System.out.println(object2 instanceof Student);  //false  因为person比student大
        System.out.println(object2 instanceof Person);   //true
        System.out.println(object2 instanceof Object);   //true
        System.out.println(object2 instanceof Teacher);  //false  因为person比teacher大
        System.out.println(object2 instanceof String);   //false

        //只要等号左边的类型没有父子关系，就会编译错误
        //等号左边的类型有父子关系，右边的类型无父子关系或者父在instanceof前，就会输出false

        /*
        类型之间的转换：
            基本类型的转换   类型的高低
            父 子 ： 强制转换方式与基本类型的强制转换方式一样，前面加个括号写上要转换成的类型
         父类转为子类没什么影响，因为基本上父类的方法子类都有。但子类转换为父类可能会丢失一些子类本有的方法
         */

        //父类引用可以指向子类，子类引用不可以指向父类
    }
}
