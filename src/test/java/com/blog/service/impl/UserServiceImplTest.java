package com.blog.service.impl;

import com.blog.entity.User;
import com.blog.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-service.xml",
        "classpath:spring/spring-dao.xml"})
public class UserServiceImplTest {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Test
    public void getUserList() throws Exception {
        List<User> userList=userService.getUserList();
        logger.info("list={}",userList);
    }

    @Test
    public void addUser() throws Exception {
        User user=new User();
        user.setUsername("test add service");
        user.setPassword("111");
        user.setPermission(User.UserPermission.user);
        user.setStatus(User.UserStatus.active);
        String result=userService.addUser(user);
        logger.info("result={}",result);
    }

    @Test
    public void deleteUser() throws Exception {
        String result=userService.deleteUser(103);
        logger.info("result={}",result);
    }

    @Test
    public void modifyUserInfo() throws Exception {
        User user=new User();
        user.setId(104);
        user.setUsername("test add service");
        user.setPassword("test");
        user.setPermission(User.UserPermission.user);
        user.setStatus(User.UserStatus.active);
        String result=userService.modifyUserInfo(user);
        logger.info("result={}",result);
    }

    @Test
    public void getUserById() throws Exception {
        User user=userService.getUserById(100);
        logger.info("user={}",user);
    }

}