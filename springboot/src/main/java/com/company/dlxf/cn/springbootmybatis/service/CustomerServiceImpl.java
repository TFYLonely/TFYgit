package com.company.dlxf.cn.springbootmybatis.service;

import com.company.dlxf.cn.springbootmybatis.mapper.TmCustomerInfoMapper;
import com.company.dlxf.cn.springbootmybatis.model.TmCustomerInfo;
import com.company.dlxf.cn.springbootmybatis.pojo.CustomerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private TmCustomerInfoMapper tmCustomerInfoMapper;

    //连接redis 如果存取的数据都是字符串的话 这个就可以了
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    //连接redis  可以存对象
    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public List<TmCustomerInfo> findCustomerInfoList(CustomerInfo customerInfo) {
        return tmCustomerInfoMapper.findCustomerInfo(customerInfo);
    }

    @Override
    public int memberStop(String id) {
        return tmCustomerInfoMapper.memberStop(id);
    }

    @Override
    public int memberStart(String id) {
        return tmCustomerInfoMapper.memberStart(id);
    }

    @Override
    public int memberUpdate(TmCustomerInfo tmCustomerInfo) {
        return tmCustomerInfoMapper.updateByPrimaryKeySelective(tmCustomerInfo);
    }

    @Override
    public int memberSave(TmCustomerInfo tmCustomerInfo) {
        tmCustomerInfo.setCustomerId(UUID.randomUUID().toString());
        tmCustomerInfo.setUpdateTime(new Date());
        tmCustomerInfo.setStatus("01");
        return tmCustomerInfoMapper.insertSelective(tmCustomerInfo);
    }

    @Override
    public int memberDelete(String id) {
        return tmCustomerInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public String redis(){
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setCustomerName("aaa");
        customerInfo.setDateMin("aaa");
        customerInfo.setDateMax("aaa");
//        customerInfo = (CustomerInfo)redisTemplate.opsForValue().get("abc");
        redisTemplate.opsForValue().set("abc",customerInfo);
//        System.out.println(customerInfo.toString());
        return stringRedisTemplate.opsForValue().get("abc");
    }

}
