package com.test.jdkproxy;

/**
 * Created by pzh on 2022/9/5.
 *
 * 目标对象
 */
public class Student implements IStudent {
    @Override
    public void display() {
        System.out.println("I am a student");
    }
}
