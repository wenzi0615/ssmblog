package com.blog.dao;

import com.blog.entity.User;
import com.blog.entity.User.UserPermission;
import com.blog.entity.User.UserStatus;
import com.blog.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    @Test
    public void queryAll() throws Exception {
        List<User> userList=userDao.queryAll(0,10);
        logger.info("list={}",userList);
    }

    @Test
    public void addUser() throws Exception {
        User user=new User();
        user.setUsername("test add dao");
        user.setPassword("000");
        user.setPermission(UserPermission.user);
        user.setStatus(UserStatus.active);
        int result=userDao.addUser(user);
        logger.info("result={}",result);
    }

    @Test
    public void deleteUser() throws Exception {
        int result=userDao.deleteUser(103);
        logger.info("result={}",result);
    }

    @Test
    public void updateUserInfo() throws Exception {
        User user=new User();
        user.setId(102);
        user.setUsername("test_user3");
        user.setPassword("user update dao test");
        user.setPermission(UserPermission.guest);
        user.setStatus(UserStatus.frozen);
        int result=userDao.updateUserInfo(user);
        logger.info("result={}",result);
    }

    @Test
    public void queryById() throws Exception {
        User user=userDao.queryById(100);
        logger.info("user={}",user);
    }

}