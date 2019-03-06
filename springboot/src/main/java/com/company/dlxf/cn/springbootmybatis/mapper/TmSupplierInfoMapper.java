package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmSupplierInfo;

public interface TmSupplierInfoMapper {
    int deleteByPrimaryKey(String supplierId);

    int insert(TmSupplierInfo record);

    int insertSelective(TmSupplierInfo record);

    TmSupplierInfo selectByPrimaryKey(String supplierId);

    int updateByPrimaryKeySelective(TmSupplierInfo record);

    int updateByPrimaryKey(TmSupplierInfo record);
}