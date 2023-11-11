package com.mypackage.oop.demo06;

public class Student06 extends Person06 {


    /*构造器和方法两个看起来是很像，
    但二者是有区别的，
    注意看，
    构造器名字必须与类名相同（包括首字母要大写），
    且无需写返回类型；
    而方法名字可以多样化，且需要写返回值类型。
     */

    //super();  比如放这就会报错
    public Student06() {
        /*会默认先执行父类的Person构造器里的内容，
    也就是说，默认存在一个super();
    一个简单的super();就可以执行父类构造器的内容。
    写super();来调用父类构造器时，
    super();必须放在子类构造器的第一行
         */

        //super();放这就不会报错
        System.out.println("Student06无参执行了");
        //super放这也会报错
    }
/*
若父类中定义了有参构造而没有定义无参构造，
则子类不能调用父类的无参构造，
子类也不会默认调用父类的有参构造
 */
    private String name = "jack";

    public void print(){
        System.out.println("Student");
    }

    public void test2(){
        print();//自己类里的方法print
        this.print();//自己类里的方法print
        super.print();//父类里的方法print
    }
    public void test(String name){
        System.out.println(name);  //该方法传递的参数name
        System.out.println(this.name);  //该类里的name
        System.out.println(super.name);  //父类里的name
    }

    //super只能调用父类里的public方法，不可调用private方法
    //private的东西不能被调用
}

/*之前说到子类可以默认拥有父类所有public方法与属性，
那如果父类和子类定义了同一个方法呢？
比如，在Person与Student中均定义了一个public void print(){}，
那我们在Application中写student。print时，到底是调用了哪个print？
答案是，Student自己的那个print方法
 */

/*
小小总结一下super：
1.super调用父类的构造方法是，必须在构造方法的第一个
2.super必须只能出现在子类的方法或者构造器中
3.super和this不能同时调用构造方法，因为两者都需要在第一行

super Vs super:
1.代表对象不同：
    this：本身调用者这个对象
    super：代表父类对象的应用
2.前提：
    this：没有继承也可以使用
    super：只能在继承条件下才能使用
3.构造方法：
    this()：本类的构造
    super()：父类的构造
 */
