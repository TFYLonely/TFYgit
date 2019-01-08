package com.company.dlxf.cn.springbootmybatis.service;

import com.company.dlxf.cn.springbootmybatis.model.User;

public interface SpringBoot {
    int delete(Integer userId);

    int add(User record);

    User select(Integer userId);

    int update(User record);
}
