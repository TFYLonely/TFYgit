package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmUserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TmUserInfoMapper {
    int deleteByPrimaryKey(String userId);

    int insert(TmUserInfo record);

    int insertSelective(TmUserInfo record);

    TmUserInfo selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(TmUserInfo record);

    int updateByPrimaryKey(TmUserInfo record);

    TmUserInfo findByName(@Param("name") String name);
}