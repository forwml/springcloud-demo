package com.wml.demo.controller;

import com.wml.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Resource
    @Autowired
    private RestTemplate restTemplate;

    private static final String SUCCESS="success";
    private static final String ERROR="error";

    @RequestMapping("/ticketPurchase")
    public User purchaseTicket(@RequestParam(required = false,value = "name") String name){
        Map<String,Object> resultMap=new HashMap<String,Object>();
        //模拟判断用户身份
       User user= restTemplate.getForObject(
                "http://localhost:8088/getUserInfo?name=" + name,User.class);
       System.out.println(user.getId());
        //买票下单逻辑略

        return user;
    }
}
