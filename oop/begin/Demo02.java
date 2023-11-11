package com.mypackage.oop.begin;

public class Demo02 {
    public static void main(String[] args) {
        Student.say1();   //静态方法可以直接在不同类中调用，非静态则不可以
        new Student().say2();   //非静态方法需new（实例化这个类）才能调用
        //详细写：
        Student student = new Student();
        student.say3();
        //对象类型  对象名  =  对象值
    }

    //=====================================================

    public static void b (){
        System.out.println();
    }

    public static void a (){
        System.out.println();
        b();
    }
    /*若两个方法都是静态方法，
      那么两个可以直接互相调用*/

//    public void b2 (){
//        System.out.println();
//    }
//
//    public static void a2 (){
//        System.out.println();
//        b2();  //此处报错了
//        //报错提示：
//        //java: 无法从静态上下文中引用非静态 方法 b2()
//    }
//    /*若方法1是非静态方法，
//      方法2是静态方法，
//      那么方法1不可以被2调用*/

    public static void b3 (){
        System.out.println();
    }

    public void a3 () {
        System.out.println();
        b3();
    }
    /*若方法1是静态方法，
      方法2是非静态方法，
      那么方法1可以被2调用*/

    public void b4() {
        System.out.println();
    }

    public void a4() {
        System.out.println();
        b4();
    }
    /*若两个方法都是非静态方法，
      那么两个可以直接互相调用*/

    /*原因：
    静态方法是和类同步的，
    而非静态方法是在类中实例化出来的
    所以，静态方法比非静态方法先存在
     */
}