package com.example.cheng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengchenrui
 * @version Id: HelloController.java, v 0.1 2018/7/1 9:41 chengchenrui Exp $$
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Object hello() {
        return "Spring Boot Hello ~~";
    }
}