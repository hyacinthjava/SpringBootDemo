package com.example.springboot.mapper;

import com.example.springboot.bean.UserBean;
import org.springframework.stereotype.Component;

/**
 * @author hyaci
 * DAO层访问数据库接口文件：
 */
@Component
public interface UserMapper {

    UserBean getInfo(String name, String password);

}
