package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmUserRoleRelationKey;

public interface TmUserRoleRelationMapper {
    int deleteByPrimaryKey(TmUserRoleRelationKey key);

    int insert(TmUserRoleRelationKey record);

    int insertSelective(TmUserRoleRelationKey record);
}