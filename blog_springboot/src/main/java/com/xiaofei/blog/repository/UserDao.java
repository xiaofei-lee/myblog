package com.xiaofei.blog.repository;

import com.xiaofei.blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xiaofei
 */
public interface UserDao extends JpaRepository<User, Integer> {
    /**
     * findByUsername
     *
     * @param username
     * @return
     */
    User findByUsername(String username);

}
