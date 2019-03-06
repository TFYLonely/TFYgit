package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmRolePermissionRelationKey;

public interface TmRolePermissionRelationMapper {
    int deleteByPrimaryKey(TmRolePermissionRelationKey key);

    int insert(TmRolePermissionRelationKey record);

    int insertSelective(TmRolePermissionRelationKey record);
}