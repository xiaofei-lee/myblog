package com.xiaofei.blog.service.impl;

import com.xiaofei.blog.domain.User;
import com.xiaofei.blog.repository.UserDao;
import com.xiaofei.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiaofei
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
