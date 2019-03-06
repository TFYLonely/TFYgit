package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmLogConfig;

public interface TmLogConfigMapper {
    int deleteByPrimaryKey(String transId);

    int insert(TmLogConfig record);

    int insertSelective(TmLogConfig record);

    TmLogConfig selectByPrimaryKey(String transId);

    int updateByPrimaryKeySelective(TmLogConfig record);

    int updateByPrimaryKey(TmLogConfig record);
}