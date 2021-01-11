package com.xiaofei.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseDao<T> extends JpaRepository<T, Object> {
}
