package com.mypackage.oop.demo06;

import com.mypackage.oop.demo06.Student06;

public class Application06 {
    public static void main(String[] args) {
        Student06 student06 = new Student06();//实例化需在方法中进行
        student06.test("何小黑");
        System.out.println("------------");
        student06.test2();
    }

}
