package com.blog.service;

import com.blog.entity.Comment;
import com.blog.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    /**
     * 列出所有注册用户
     * @return
     */
    List<User> getUserList();

    /**
     * 注册新用户
     * @param user
     * @return
     */
    String addUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    String deleteUser(int id);

    /**
     * 更改用户信息
     * @param user
     * @return
     */
    String modifyUserInfo(User user);

    /**
     * 查看某用户所有信息
     * @param id
     * @return
     */
    User getUserById(int id);

}
