package com.mypackage.oop.demo04;

public class Student {
    //属性：
    //名字
    private String name;
    //学号
    private int id;
    //性别
    private char sex;
    //年龄
    private int age;
    //------------------------------------
    //方法：
    //学习（）
    //睡觉（）
    //提供一些可以操作这些私有属性的方法：
    //提供一些public的get、set的方法：
    //get  获得这个数据
    public String getName(){
        return this.name;
    }
    //set  给这个数据设置值
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 120 && age >= 0){
            this.age = age;
        }else{
            this.age = 3;
        }

    }

}


//快捷键  alt + insert  自动生成get、set

/*封装的意义：
1.提高程序的安全性，保护数据，比如，我们可以在封装中做一些限制来保护数据使其合法
2.隐藏代码的实现细节
3.统一接口
4.系统的可维护性提高了
 */