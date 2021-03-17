package com.xiaofei.blog.controller;

import com.xiaofei.blog.domain.User;
import com.xiaofei.blog.service.UserService;
import com.xiaofei.blog.common.result.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author xiaofei
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @ResponseBody
    public ResultResponse login(@RequestBody User requestUser, HttpSession session) {
        User user = userService.findUserByUsername(requestUser.getUsername());

        if (user == null) {
            return new ResultResponse(400, "登录失败,用户名不存在", null);
        } else if (!user.getPassword().equals(requestUser.getPassword())) {
            return new ResultResponse(400, "登录失败,密码不正确", null);
        } else {
            session.setAttribute("user", user);
            return new ResultResponse(200, "登录成功", user);
        }
    }
}
