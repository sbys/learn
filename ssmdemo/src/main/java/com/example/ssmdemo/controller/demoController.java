package com.example.ssmdemo.controller;

import com.example.ssmdemo.model.User;
import com.example.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class demoController {
    @Autowired
    UserService userService;
    @RequestMapping("/query")
    @ResponseBody
    public List<User> query(){
        return userService.queryUser();
    }
    @RequestMapping("/query2")
    public String query2(Model model){
        model.addAttribute("users",userService.queryUser());
        return "userlist";
    }
    @RequestMapping("/b")
    public String a(){
        return "b";
    }
}
