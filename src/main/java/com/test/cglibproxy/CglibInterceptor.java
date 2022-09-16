package com.test.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by pzh on 2022/9/5.
 */
public class CglibInterceptor implements MethodInterceptor {

    private Teacher teacher;

    // 获取代理对象方法
    public Object getProxyInstance(Teacher teacher) {
        this.teacher = teacher;

        Enhancer enhancer = new Enhancer(); // 1 实例化工具类
        enhancer.setSuperclass(teacher.getClass()); // 设置父类对象
        enhancer.setCallback(this); // 设置回调函数
        return enhancer.create(); // 创建子类，也就是代理对象
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before invoke");
        Object result = method.invoke(teacher, objects);
        System.out.println("after invoke");
        return result;
    }
}
