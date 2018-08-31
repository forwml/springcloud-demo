package com.wml.demo.controller;

import com.wml.demo.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;

@RestController
public class TicketController {


    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/ticketPurchase")
    public static User purchaseTicket(RestTemplate restTemplate, @RequestParam(required = false, value = "name") String name){
        //模拟判断用户身份
        User user = restTemplate.getForObject(
                        "http://localhost:8088/getUser/getUserInfo?name=" + name,User.class);
//        买票下单逻辑略
//        String url = "http://localhost:8088/getUser/getUserInfo?name="+name;
//        System.out.println(url);

        return user;
//        return restTemplate.getForObject(url, User.class);
    }

}

