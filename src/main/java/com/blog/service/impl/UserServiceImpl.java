package com.blog.service.impl;

import com.blog.dao.BlogDao;
import com.blog.dao.UserDao;
import com.blog.entity.Comment;
import com.blog.entity.User;
import com.blog.enums.OperStateEnum;
import com.blog.exception.ManagementException;
import com.blog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    //注入service依赖
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.queryAll(0,10);
    }

    @Override
    public String addUser(User user) throws ManagementException{
        int result=userDao.addUser(user);
        if(result==1)
            return OperStateEnum.USER_ADD_SUCCESS.getStateInfo();
        else {
            throw new ManagementException(OperStateEnum.USER_ADD_ERROR.getStateInfo());
        }
    }

    @Override
    public String deleteUser(int id) throws ManagementException{
        int result=userDao.deleteUser(id);
        if(result==1)
            return OperStateEnum.USER_DELETE_SUCCESS.getStateInfo();
        else {
            throw new ManagementException(OperStateEnum.USER_DELETE_ERROR.getStateInfo());
        }
    }

    @Override
    public String modifyUserInfo(User user) throws ManagementException{
        int result=userDao.updateUserInfo(user);
        if(result==1)
            return OperStateEnum.USER_MODIFY_SUCCESS.getStateInfo();
        else {
            throw new ManagementException(OperStateEnum.USER_MODIFY_ERROR.getStateInfo());
        }
    }

    @Override
    public User getUserById(int id) {
        return userDao.queryById(id);
    }
}
