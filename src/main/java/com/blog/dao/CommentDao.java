package com.blog.dao;

import com.blog.entity.Category;
import com.blog.entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentDao {

    /**
     * 列出所有comment
     * @param offset
     * @param limit
     * @return
     */
    List<Comment> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 添加评论
     * @param comment
     * @return
     */
    int addComment(Comment comment);

    /**
     * 删除评论
     * @param id
     * @return
     */
    int deleteComment(int id);

    /**
     * 查看一条博客的所有评论
     * @param blogId
     * @return
     */
    List<Comment> queryByBlogId(int blogId);
}
