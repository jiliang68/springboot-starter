package com.example.cheng.controller;

import java.util.Date;

import com.example.cheng.utils.JsonResultUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cheng.pojo.User;

/**
 * //@Controller
 * @author chengchenrui
 * @version Id: UserController.java, v 0.1 2018/7/1 10:29 chengchenrui Exp $$
 */
@RestController // @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    @ResponseBody
    public Object getUser() {

        User user = new User();
        user.setName("程诚");
        user.setAge(20);
        user.setBirthday(new Date());
        user.setPassword("123456");
        user.setDesc("ccr test ");

        return user;
    }

    @RequestMapping("/getUserJson")
    @ResponseBody
    public Object getUserJson() {

        User user = new User();
        user.setName("程诚");
        user.setAge(20);
        user.setBirthday(new Date());
        user.setPassword("123456");

        return JsonResultUtil.ok(user);
    }
}