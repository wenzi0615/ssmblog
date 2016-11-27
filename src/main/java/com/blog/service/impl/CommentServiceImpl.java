package com.blog.service.impl;

import com.blog.dao.CommentDao;
import com.blog.entity.Comment;
import com.blog.enums.OperStateEnum;
import com.blog.exception.ManagementException;
import com.blog.service.CommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    //注入service依赖
    @Autowired
    private CommentDao commentDao;

    @Override
    public List<Comment> getCommentList() {
        return commentDao.queryAll(0,10);
    }

    @Override
    public String addComment(Comment comment) throws ManagementException{
        int result=commentDao.addComment(comment);
        if(result==1)
            return OperStateEnum.COMMENT_ADD_SUCCESS.getStateInfo();
        else {
            throw new ManagementException(OperStateEnum.COMMENT_ADD_ERROR.getStateInfo());
        }
    }

    @Override
    public String deleteComment(int id) throws ManagementException{
        int result=commentDao.deleteComment(id);
        if(result==1)
            return OperStateEnum.COMMENT_DELETE_SUCCESS.getStateInfo();
        else {
            throw new ManagementException(OperStateEnum.COMMENT_DELETE_ERROR.getStateInfo());
        }
    }

    @Override
    public List<Comment> showBlogComment(int blogId) {
        return commentDao.queryByBlogId(blogId);
    }
}
