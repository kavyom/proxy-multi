package com.test.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by pzh on 2021/12/1.
 *
 * 代理对象处理器
 */
public class StudentHandler implements InvocationHandler {

    private IStudent student;

    public Object newProxyInstance(IStudent student) {
        this.student = student;
        return Proxy.newProxyInstance(student.getClass().getClassLoader(), student.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass().getName());
        // 定义预处理的工作，当然你也可以根据 method 的不同进行不同的预处理工作
        System.out.println("====before====");
        Object result = method.invoke(student, args);
        System.out.println("====after====");
        return result;
    }
}
