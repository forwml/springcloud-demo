package com.wml.demo.mapper;

import com.wml.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import javax.annotation.Resource;
import java.util.List;
@Mapper
public interface UserMapper {
    @Resource
    User selectUserByName(String name);
}
