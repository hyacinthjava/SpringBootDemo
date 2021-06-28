package com.example.springboot.service;

import com.example.springboot.bean.UserBean;

/**
 * @author hyaci
 * Service层业务接口类编写
 */
public interface UserService {

    UserBean loginIn(String name, String password);


}
