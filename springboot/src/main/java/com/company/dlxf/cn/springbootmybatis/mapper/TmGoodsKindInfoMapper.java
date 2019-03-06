package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmGoodsKindInfo;

public interface TmGoodsKindInfoMapper {
    int deleteByPrimaryKey(String recordId);

    int insert(TmGoodsKindInfo record);

    int insertSelective(TmGoodsKindInfo record);

    TmGoodsKindInfo selectByPrimaryKey(String recordId);

    int updateByPrimaryKeySelective(TmGoodsKindInfo record);

    int updateByPrimaryKey(TmGoodsKindInfo record);
}