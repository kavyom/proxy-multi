package com.test.cglibproxy;

/**
 * Created by pzh on 2022/9/5.
 *
 * cglib动态代理测试
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        CglibInterceptor interceptor = new CglibInterceptor();
        Teacher proxy = (Teacher) interceptor.getProxyInstance(new Teacher());
        proxy.display();
    }
}
