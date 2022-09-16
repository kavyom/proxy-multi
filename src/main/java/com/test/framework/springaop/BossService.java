package com.test.framework.springaop;

import org.springframework.stereotype.Service;

/**
 * Created by pzh on 2022/9/5.
 */
@Service
public class BossService {

    public void display() {
        System.out.println("I am a boss");
    }
}
