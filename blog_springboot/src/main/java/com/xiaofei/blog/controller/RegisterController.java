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
 * 注册
 */
@RestController
public class RegisterController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResultResponse register(@RequestBody User user) {
        // 判断用户是否已存在
        User user1 = userService.findByUsername(user.getUsername());
        if (user1 != null) {
            return new ResultResponse(501, "该用户名已存在", user1);
        }

        User user2 = userService.add(user);

        return new ResultResponse(200, "注册成功", user2);
    }
}
