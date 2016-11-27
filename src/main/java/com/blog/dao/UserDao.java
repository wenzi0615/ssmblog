package com.blog.dao;

import com.blog.entity.Comment;
import com.blog.entity.User;
import com.blog.entity.User.UserStatus;
import com.blog.entity.User.UserPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    /**
     * 列出所有注册用户
     * @param offset
     * @param limit
     * @return
     */
    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 注册新用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(int id);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int updateUserInfo(User user);

    /**
     * 查看某用户的所有信息
     * @param id
     * @return
     */
    User queryById(int id);
}
