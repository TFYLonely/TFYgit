package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmRoleInfo;

public interface TmRoleInfoMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(TmRoleInfo record);

    int insertSelective(TmRoleInfo record);

    TmRoleInfo selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(TmRoleInfo record);

    int updateByPrimaryKey(TmRoleInfo record);
}