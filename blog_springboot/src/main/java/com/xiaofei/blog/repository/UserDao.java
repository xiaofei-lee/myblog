package com.xiaofei.blog.repository;

import com.xiaofei.blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    
}
