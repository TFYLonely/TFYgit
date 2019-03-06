package com.company.dlxf.cn.springbootmybatis.controller;

import com.company.dlxf.cn.springbootmybatis.model.TmCustomerInfo;
import com.company.dlxf.cn.springbootmybatis.pojo.CustomerInfo;
import com.company.dlxf.cn.springbootmybatis.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerServiceImpl;

    //查询客户信息
    @RequestMapping("findCustomerInfo")
    public List<TmCustomerInfo> findCustomerInfo(CustomerInfo customerInfo) throws ParseException {
        return customerServiceImpl.findCustomerInfoList(customerInfo);
    }
    //客户停用(改变状态)
    @RequestMapping("memberStop")
    public int memberStop(String id){
        return customerServiceImpl.memberStop(id);
    }
    //客户启用
    @RequestMapping("memberStart")
    public int memberStart(String id){
        return customerServiceImpl.memberStart(id);
    }
    //客户编辑
    @RequestMapping("memberUpdate")
    public int memberUpdate(TmCustomerInfo tmCustomerInfo){
        return customerServiceImpl.memberUpdate(tmCustomerInfo);
    }
    //客户添加
    @RequestMapping("memberSave")
    public int memberSave(TmCustomerInfo tmCustomerInfo){
        return customerServiceImpl.memberSave(tmCustomerInfo);
    }
    //客户删除(物理删除)
    @RequestMapping("memberDelete")
    public int memberDelete(String id){
        return customerServiceImpl.memberDelete(id);
    }
    //redis
    @RequestMapping("redis")
    public String redis(){
        return customerServiceImpl.redis();
    }
}
