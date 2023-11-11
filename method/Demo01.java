package com.mypackage.method;

public class Demo01 {
    //main方法     //main方法是交给程序去管，而不是让我们自己去写的
    public static void main (String[] args) {
    /*public是一个修饰符，
    static也是个修饰符，使变量变成 类变量 ，
    void是一个返回值类型，void意味着不返回，执行完就结束了,
    main是方法名*/
        //实际参数：实际调用传递给他的参数
        int sum = add(1,2);
        System.out.print(sum);
    }

    //加法
    //形式参数，用来定义作用的
    public static int add (int a, int b){
    /*public是一个修饰符，
    static也是个修饰符，使变量变成 类变量 ，就能在main中引用了
    int是一个返回值类型，
    add是方法名*/
        return a + b;
    }
}
