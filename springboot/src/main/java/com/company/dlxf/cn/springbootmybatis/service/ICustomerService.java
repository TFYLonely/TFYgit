package com.company.dlxf.cn.springbootmybatis.service;

import com.company.dlxf.cn.springbootmybatis.model.TmCustomerInfo;
import com.company.dlxf.cn.springbootmybatis.pojo.CustomerInfo;

import java.util.List;

public interface ICustomerService {
    //查询客户信息
    List<TmCustomerInfo> findCustomerInfoList(CustomerInfo customerInfo);
    //客户停用
    int memberStop(String id);
    //客户启用
    int memberStart(String id);
    //客户修改
    int memberUpdate(TmCustomerInfo tmCustomerInfo);
    //客户添加
    int memberSave(TmCustomerInfo tmCustomerInfo);
    //客户删除(物理删除)
    int memberDelete(String id);
    //redis
    String redis();
}
