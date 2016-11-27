package com.blog.dao;

import com.blog.entity.Category;
import com.blog.entity.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class CommentDaoTest {

    //注入dao 实现类依赖注入
    @Resource
    private CommentDao commentDao;

    @Test
    public void queryAll() throws Exception {

        List<Comment> commentList=commentDao.queryAll(0,10);
        for(int i=0;i<commentList.size();i++){
            System.out.println(commentList.get(i).toString());
        }

    }

    @Test
    public void addComment() throws Exception {

        Comment comment=new Comment();
        comment.setUserId(101);
        comment.setComment("test add comment");
        comment.setBlogId(1001);
        int result=commentDao.addComment(comment);
        System.out.println("result: "+result);

    }

    @Test
    public void deleteComment() throws Exception {

        int result=commentDao.deleteComment(2);
        System.out.println("result: "+result);

    }

    @Test
    public void queryByBlogId() throws Exception {

        List<Comment> comments=commentDao.queryByBlogId(1001);
        for(int i=0;i<comments.size();i++){
            System.out.println(comments.get(i).toString());
        }
    }

}