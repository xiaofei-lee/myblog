package com.xiaofei.blog.controller;

import com.xiaofei.blog.domain.User;
import com.xiaofei.blog.service.UserService;
import com.xiaofei.blog.utils.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录
 */
@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultResponse login(@RequestBody User user) {
        System.out.println(user);
        return new ResultResponse();
    }
}
