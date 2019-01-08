package com.company.dlxf.cn.springbootmybatis.service;

import com.company.dlxf.cn.springbootmybatis.mapper.UserMapper;
import com.company.dlxf.cn.springbootmybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.*;

@Service
public class SpringBootService implements SpringBoot {

    @Autowired
    private UserMapper userMapper;
/*  //添加
    @Transactional
    public int add(User user){
        return userMapper.insertSelective(user);
    }
    //查询
    public User select(Integer id){return userMapper.selectByPrimaryKey(id);}
    //修改
    @Transactional
    public int update(User user){return userMapper.updateByPrimaryKey(user);}
    //删除
    @Transactional
    public int delete(Integer id){return userMapper.deleteByPrimaryKey(id);}*/

    @Override
    @Transactional
    public int delete(Integer userId) { return userMapper.deleteByPrimaryKey(userId); }

    @Override
    @Transactional
    public int add(User record) { return userMapper.insertSelective(record); }

    @Override
    public User select(Integer userId) { return userMapper.selectByPrimaryKey(userId); }

    @Override
    @Transactional
    public int update(User record) { return userMapper.updateByPrimaryKey(record); }
}
