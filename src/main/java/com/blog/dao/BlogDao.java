package com.blog.dao;

import com.blog.entity.Blog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BlogDao {

    /**
     * 列出所有博客
     * @param offset
     * @param limit
     * @return
     */

    List<Blog> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 增加一条博客
     * @return 如果影响记录数=1，表示增加成功
     */

    int addBlog(@Param("title") String title, @Param("content") String content, @Param("cateId") int cateId);


    /**
     * 删除一条博客
     * @return 如果影响记录数=1，表示删除成功
     */

    int deleteBlog(int id);


    /**
     * 更新一条博客
     * @return 如果影响记录数=1，表示更新成功
     */

    int updateBlog(@Param("id") int id, @Param("title") String title,
                   @Param("content") String content, @Param("cateId") int cateId);

    /**
     * 显示指定博客
     * @return
     */

    Blog queryById(int id);
}
