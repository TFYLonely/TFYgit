package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmGoodsOrderRelation;

public interface TmGoodsOrderRelationMapper {
    int deleteByPrimaryKey(String recordId);

    int insert(TmGoodsOrderRelation record);

    int insertSelective(TmGoodsOrderRelation record);

    TmGoodsOrderRelation selectByPrimaryKey(String recordId);

    int updateByPrimaryKeySelective(TmGoodsOrderRelation record);

    int updateByPrimaryKey(TmGoodsOrderRelation record);
}