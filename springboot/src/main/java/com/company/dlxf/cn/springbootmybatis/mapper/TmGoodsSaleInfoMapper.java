package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmGoodsSaleInfo;

public interface TmGoodsSaleInfoMapper {
    int deleteByPrimaryKey(String recordId);

    int insert(TmGoodsSaleInfo record);

    int insertSelective(TmGoodsSaleInfo record);

    TmGoodsSaleInfo selectByPrimaryKey(String recordId);

    int updateByPrimaryKeySelective(TmGoodsSaleInfo record);

    int updateByPrimaryKey(TmGoodsSaleInfo record);
}