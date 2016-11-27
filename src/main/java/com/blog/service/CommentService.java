package com.blog.service;

import com.blog.entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentService {

    /**
     * 列出所有comment
     * @return
     */
    List<Comment> getCommentList();

    /**
     * 添加评论
     * @param comment
     * @return
     */
    String addComment(Comment comment);

    /**
     * 删除评论
     * @param id
     * @return
     */
    String deleteComment(int id);

    /**
     * 查看一条博客的所有评论
     * @param blogId
     * @return
     */
    List<Comment> showBlogComment(int blogId);

}
