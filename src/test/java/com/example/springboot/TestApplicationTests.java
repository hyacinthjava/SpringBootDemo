package com.example.springboot;

import com.example.springboot.bean.UserBean;
import com.example.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Autowired
    UserService userService;
//先运行测试类，看是否成功获取数据库信息
    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("张开开","123456");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }
}