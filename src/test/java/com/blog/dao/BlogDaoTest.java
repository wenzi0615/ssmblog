package com.blog.dao;

import com.blog.entity.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 首先要配置spring和junit整合，junit启动时加载spring ioc容器
 * 测试dao
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class BlogDaoTest {

    //注入dao 实现类依赖注入
    @Resource
    private BlogDao blogDao;

    @Test
    public void queryAll() throws Exception {

        List<Blog> blogList=blogDao.queryAll(0,10);
        for(int i=0;i<blogList.size();i++){
            System.out.println(blogList.get(i).toString());
        }
    }

    @Test
    public void addBlog() throws Exception {

        String title="Large-Scale Agile 4";
        String content="Large-Scale Agile 4, Large-Scale Agile 4";
        int cateId=400;
        int result=blogDao.addBlog(title, content, cateId);
        System.out.println("result: "+result);
    }

    @Test
    public void deleteBlog() throws Exception {

        int id=1005;
        int result=blogDao.deleteBlog(id);
        System.out.println("result: "+result);
    }

    @Test
    public void updateBlog() throws Exception {

        int id=1003;
        String title="Large-Scale Agile 3";
        String content="Large-Scale Agile 3, Large-Scale Agile 3";
        int cateId=300;
        int result=blogDao.updateBlog(id, title, content, cateId);
        System.out.println("result: "+result);
    }

    @Test
    public void queryById() throws Exception {

        int id=1003;
        Blog blog=blogDao.queryById(id);
        System.out.println(blog.toString());
    }

}