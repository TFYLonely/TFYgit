package com.company.dlxf.cn.springbootmybatis.service;

import com.company.dlxf.cn.springbootmybatis.mapper.TmUserInfoMapper;
import com.company.dlxf.cn.springbootmybatis.model.TmUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private TmUserInfoMapper tmUserInfoMapper;

    public TmUserInfo findByName(String name){
        return tmUserInfoMapper.findByName(name);
    }
}
