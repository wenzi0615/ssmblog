package com.blog.service.impl;

import com.blog.entity.Blog;
import com.blog.service.BlogService;
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
public class BlogServiceImplTest {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BlogService blogService;

    @Test
    public void getBlogList() throws Exception {

        List<Blog> blogList=blogService.getBlogList();
        logger.info("list={}",blogList);

    }

    @Test
    public void addBlog() throws Exception {

        Blog blog=new Blog();
        blog.setTitle("Large-Scale Agile new");
        blog.setContent("Large-Scale Agile new, Large-Scale Agile new");
        blog.setCateId(400);
        String result=blogService.addBlog(blog);
        logger.info("result={}",result);
    }

    @Test
    public void deleteBlog() throws Exception {

        int id=1004;
        String result=blogService.deleteBlog(id);
        logger.info("result={}",result);

    }

    @Test
    public void modifyBlog() throws Exception {

        Blog blog=new Blog();
        blog.setId(1003);
        blog.setTitle("Large-Scale Agile modify");
        blog.setContent("Large-Scale Agile modify, Large-Scale Agile modify");
        blog.setCateId(300);
        String result=blogService.modifyBlog(blog);
        logger.info("result={}",result);

    }

    @Test
    public void getBlogById() throws Exception {

        int id=1001;
        Blog blog=blogService.getBlogById(id);
        logger.info("Blog={}",blog);
    }

}