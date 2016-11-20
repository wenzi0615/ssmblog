package com.blog.dao;

import com.blog.entity.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yanjunwang on 16/10/11.
 */
public interface BlogDao {

    /**
     * 列出所有博客简单信息列表
     * @return
     */

    List<Blog> queryAll();

    /**
     * 增加一条博客
     * @return 如果影响记录数=1，表示增加成功
     */

    int addBlog();


    /**
     * 删除一条博客
     * @return 如果影响记录数=1，表示删除成功
     */

    int deleteBlog();


    /**
     * 更新一条博客
     * @return 如果影响记录数=1，表示更新成功
     */

    int updateBlog();

    /**
     * 显示所有博客
     * @return
     */

    List<Blog> listAllBlog();

//    /**
//     * 根据偏移量查询所有微博列表
//     * @param offset
//     * @param limit
//     * @return
//     */

//    List<Blog> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
