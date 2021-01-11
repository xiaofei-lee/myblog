package com.xiaofei.blog.service;

import com.xiaofei.blog.domain.User;

public interface UserService {
    User add(User user);

    User findByUsername(String username);
}
