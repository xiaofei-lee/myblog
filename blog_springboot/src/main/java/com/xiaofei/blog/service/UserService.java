package com.xiaofei.blog.service;

import com.xiaofei.blog.domain.User;

/**
 * @author xiaofei
 */
public interface UserService {
    /**
     * 通过username查询
     *
     * @param username
     * @return
     */
    User findUserByUsername(String username);
}
