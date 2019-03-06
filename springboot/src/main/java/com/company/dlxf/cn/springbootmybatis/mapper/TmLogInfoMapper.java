package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmLogInfo;
import com.company.dlxf.cn.springbootmybatis.model.TmLogInfoWithBLOBs;

public interface TmLogInfoMapper {
    int deleteByPrimaryKey(String recordId);

    int insert(TmLogInfoWithBLOBs record);

    int insertSelective(TmLogInfoWithBLOBs record);

    TmLogInfoWithBLOBs selectByPrimaryKey(String recordId);

    int updateByPrimaryKeySelective(TmLogInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TmLogInfoWithBLOBs record);

    int updateByPrimaryKey(TmLogInfo record);
}