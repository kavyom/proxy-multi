package com.test.staticproxy;

/**
 * Created by pzh on 2021/12/1.
 */
public class DoctorProxy {

    private IDoctor iDoctor;

    public DoctorProxy() {
        this.iDoctor = new Doctor();
    }

    public void doProxy() {
        // 权限控制
        boolean isLogin = true;
        if (isLogin) {
            iDoctor.display();
        }
        // 记录访问日志
        System.out.println("记录访问日志");
    }
}
