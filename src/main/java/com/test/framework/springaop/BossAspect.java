package com.test.framework.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by pzh on 2022/9/5.
 */
@Aspect
@Component
public class BossAspect {

    @Pointcut("execution(public * com.test.framework.springaop.BossService.*(..))")
    public void pointCut() {}

    @Before("pointCut()")
    public void before(JoinPoint point) throws Throwable {
        System.out.println("----- before ----");
    }

    @After("pointCut()")
    public void after(JoinPoint point) throws Throwable {
        System.out.println("----- after ----");
    }
}
