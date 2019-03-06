package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmSaleOrderInfo;

public interface TmSaleOrderInfoMapper {
    int deleteByPrimaryKey(String recordId);

    int insert(TmSaleOrderInfo record);

    int insertSelective(TmSaleOrderInfo record);

    TmSaleOrderInfo selectByPrimaryKey(String recordId);

    int updateByPrimaryKeySelective(TmSaleOrderInfo record);

    int updateByPrimaryKey(TmSaleOrderInfo record);
}