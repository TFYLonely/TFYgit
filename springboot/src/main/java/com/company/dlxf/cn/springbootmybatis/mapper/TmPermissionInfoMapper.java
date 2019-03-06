package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmPermissionInfo;

public interface TmPermissionInfoMapper {
    int deleteByPrimaryKey(String permissionId);

    int insert(TmPermissionInfo record);

    int insertSelective(TmPermissionInfo record);

    TmPermissionInfo selectByPrimaryKey(String permissionId);

    int updateByPrimaryKeySelective(TmPermissionInfo record);

    int updateByPrimaryKey(TmPermissionInfo record);
}