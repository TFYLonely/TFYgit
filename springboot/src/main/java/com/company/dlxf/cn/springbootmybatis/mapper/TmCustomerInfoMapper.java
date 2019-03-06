package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmCustomerInfo;
import com.company.dlxf.cn.springbootmybatis.pojo.CustomerInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TmCustomerInfoMapper {
    int deleteByPrimaryKey(String customerId);

    int insert(TmCustomerInfo record);

    int insertSelective(TmCustomerInfo record);

    TmCustomerInfo selectByPrimaryKey(String customerId);

    int updateByPrimaryKeySelective(TmCustomerInfo record);

    int updateByPrimaryKey(TmCustomerInfo record);

    //客户信息列表
    List<TmCustomerInfo> findCustomerInfo(CustomerInfo customerInfo);
    //客户停用
    int memberStop(@Param("id")String id);
    //客户启用
    int memberStart(@Param("id") String id);
}