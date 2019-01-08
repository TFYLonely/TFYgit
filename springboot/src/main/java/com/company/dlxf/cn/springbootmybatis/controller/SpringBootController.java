package com.company.dlxf.cn.springbootmybatis.controller;

import com.company.dlxf.cn.springbootmybatis.model.User;
import com.company.dlxf.cn.springbootmybatis.service.SpringBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@ResponseBody ＋ @Controller
@RequestMapping(value = "/springboot")
public class SpringBootController {
    @Autowired
    private SpringBoot springBoot;

    @RequestMapping(value = "/add",produces = {"application/json;charset=UTF-8"})
    public int addTest(User user){
        return springBoot.add(user);
    }

    @RequestMapping(value = "select")
    public User select(Integer id){ return springBoot.select(id);}

    @RequestMapping(value = "delete")
    public int delete(Integer id){return springBoot.delete(id);}

    @RequestMapping(value = "update")
    public int update(User user){return springBoot.update(user);}
}
