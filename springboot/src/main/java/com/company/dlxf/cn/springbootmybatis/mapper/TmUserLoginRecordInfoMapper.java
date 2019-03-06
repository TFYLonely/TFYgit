package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmUserLoginRecordInfo;

public interface TmUserLoginRecordInfoMapper {
    int deleteByPrimaryKey(String recordId);

    int insert(TmUserLoginRecordInfo record);

    int insertSelective(TmUserLoginRecordInfo record);

    TmUserLoginRecordInfo selectByPrimaryKey(String recordId);

    int updateByPrimaryKeySelective(TmUserLoginRecordInfo record);

    int updateByPrimaryKey(TmUserLoginRecordInfo record);
}