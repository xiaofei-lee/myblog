package com.xiaofei.blog.service.impl;

import com.xiaofei.blog.repository.BaseDao;
import com.xiaofei.blog.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseServiceImpl<T> implements BaseService {
    @Autowired
    public abstract BaseDao<T> getDao();

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void find() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void findPage() {

    }
}
