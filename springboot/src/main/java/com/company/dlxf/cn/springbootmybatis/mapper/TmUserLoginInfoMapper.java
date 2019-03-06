package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmUserLoginInfo;

public interface TmUserLoginInfoMapper {
    int deleteByPrimaryKey(String recordId);

    int insert(TmUserLoginInfo record);

    int insertSelective(TmUserLoginInfo record);

    TmUserLoginInfo selectByPrimaryKey(String recordId);

    int updateByPrimaryKeySelective(TmUserLoginInfo record);

    int updateByPrimaryKey(TmUserLoginInfo record);
}