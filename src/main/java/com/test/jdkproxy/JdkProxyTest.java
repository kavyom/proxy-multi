package com.test.jdkproxy;

/**
 * Created by pzh on 2022/1/6.
 *
 * 动态生成代理对象进行测试
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        // 目标对象
        StudentHandler handler = new StudentHandler();

        // 动态生成代理对象
        IStudent proxy = (IStudent) handler.newProxyInstance(new Student());
        // 过代理对象调用方法
        proxy.display();
    }
}
