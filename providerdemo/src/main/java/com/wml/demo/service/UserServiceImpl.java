package com.wml.demo.service;

import com.wml.demo.mapper.UserMapper;
import com.wml.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements  UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserByName(String name) {

        User user=userMapper.selectUserByName(name);

        return user;
    }
}
