package com.test.staticproxy;

/**
 * Created by pzh on 2021/12/1.
 */
public class Doctor implements IDoctor {

    @Override
    public void display() {
        System.out.println("I am a doctor");
    }
}
