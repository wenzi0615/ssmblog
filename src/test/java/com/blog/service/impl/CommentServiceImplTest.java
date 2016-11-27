package com.blog.service.impl;

import com.blog.entity.Comment;
import com.blog.service.BlogService;
import com.blog.service.CommentService;
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
public class CommentServiceImplTest {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CommentService commentService;

    @Test
    public void getCommentList() throws Exception {

        List<Comment> commentList=commentService.getCommentList();
        logger.info("list={}",commentList);
    }

    @Test
    public void addComment() throws Exception {

        Comment comment=new Comment();
        comment.setUserId(101);
        comment.setBlogId(1001);
        comment.setComment("service add test");

        String result=commentService.addComment(comment);
        logger.info("result={}",result);
    }

    @Test
    public void deleteComment() throws Exception {

        String result=commentService.deleteComment(6);
        logger.info("result={}",result);
    }

    @Test
    public void showBlogComment() throws Exception {
        List<Comment> commentList=commentService.showBlogComment(1001);
        logger.info("list={}",commentList);
    }

}