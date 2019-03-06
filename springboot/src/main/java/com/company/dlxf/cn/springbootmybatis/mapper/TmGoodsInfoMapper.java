package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmGoodsInfo;

public interface TmGoodsInfoMapper {
    int deleteByPrimaryKey(String recordId);

    int insert(TmGoodsInfo record);

    int insertSelective(TmGoodsInfo record);

    TmGoodsInfo selectByPrimaryKey(String recordId);

    int updateByPrimaryKeySelective(TmGoodsInfo record);

    int updateByPrimaryKey(TmGoodsInfo record);
}