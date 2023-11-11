package com.mypackage.oop.later;

public class Person {
    //一个类即使什么都不写，它也会存在一个方法
    //如，即使我们不写，这个Person类也会存在如下方法
    /*
    public Person(){
    }
    */
    //该方法是很简单的一个方法，没有返回值，名字与类名相同（大小写也相同）
    //其也是个无参的构造器，其作用有:

    //1.使用new关键字，本质是在调用构造器
    //2.用构造器来初始化值
    String name;
    //无参构造
    public Person(){
        this.name = "hexiaohei";
    }

    //有参构造
    //有参构造在被调用的时候，括号里必须有参数
    public Person(String name){
        this.name = name;
        //前后两个name不一样，一个是参数，一个是对象
    }
}

/*构造器的特点：
    1.和类名相同
    2.没有返回值
  构造器的作用：
    1.new 本质是在调用构造方法
    2.初始化对象的值
  注意点：
    1.定义有参构造之后，如果想使用无参构造，需自己定义一个无参的构造

    alt + insert  是创建构造器的快捷键

    this. 代表当前类的
 */