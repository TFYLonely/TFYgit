package com.company.dlxf.cn.springbootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping(value = "/admin")
    public String adminPage(Model model) {
        return "index";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/memberList")
    public String memberList(){
        return "member/member-list";
    }

    @RequestMapping(value = "/memberSave")
    public String memberSave(){
        return "member/member-add";
    }

    @RequestMapping(value = "/adminList")
    public String adminList(){
        return "admin/adimn-list";
    }

}
