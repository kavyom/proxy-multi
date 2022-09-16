package com.test.framework.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pzh on 2022/9/5.
 */
@RestController
@RequestMapping("/boss")
public class BossController {

    @Autowired
    private BossService bossService;

    @PostMapping("/display")
    public String display() {
        bossService.display();
        return "success";
    }
}
