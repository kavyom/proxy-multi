package com.test.staticproxy;

/**
 * Created by pzh on 2022/1/6.
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        DoctorProxy proxy = new DoctorProxy();
        proxy.doProxy();
    }
}
