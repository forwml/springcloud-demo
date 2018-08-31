package com.wml.demo.service;


import com.wml.demo.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User getUserByName(String name);
}
