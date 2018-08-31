package com.wml.demo.controller;


import com.wml.demo.pojo.User;
import com.wml.demo.service.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/getUser")
public class UserController {

    @Resource
    private UserServiceImpl userService;

    private static final String SUCCESS="success";
    private static final String ERROR="error";

    @RequestMapping(value = "/getUserInfo")
    public User getUserInfo(@RequestParam(required = false,value = "name") String name){
//        Map<String,Object> resultMap=new HashMap<String,Object>();
        User user = userService.getUserByName(name);
//        resultMap.put("user",userList);
//        resultMap.put("status",SUCCESS);
        return user;
    }



}
