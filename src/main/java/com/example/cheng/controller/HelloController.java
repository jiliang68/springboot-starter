package com.example.cheng.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cheng.pojo.Resource;
import com.example.cheng.utils.JsonResultUtil;

/**
 * @author chengchenrui
 * @version Id: HelloController.java, v 0.1 2018/7/1 9:41 chengchenrui Exp $$
 */
@RestController
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Object hello() {
        return "Spring Boot Hello ~~";
    }

    @RequestMapping("/getResource")
    public Object getResource() {

        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);

        return JsonResultUtil.ok(bean);
    }
}