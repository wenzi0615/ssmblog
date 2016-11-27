package com.blog.service.impl;

import com.blog.dao.BlogDao;
import com.blog.entity.Blog;
import com.blog.enums.OperStateEnum;
import com.blog.exception.ManagementException;
import com.blog.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    //注入service依赖
    @Autowired
    private BlogDao blogDao;

    public List<Blog> getBlogList() {
        return blogDao.queryAll(0,10);
    }

    public String addBlog(Blog blog) throws ManagementException{
        int result=blogDao.addBlog(blog);
        if(result==1)
            return OperStateEnum.BLOG_ADD_SUCCESS.getStateInfo();
        else {
            throw new ManagementException(OperStateEnum.BLOG_ADD_ERROR.getStateInfo());
        }
    }

    public String deleteBlog(int id) throws ManagementException{
        int result=blogDao.deleteBlog(id);
        if(result==1)
            return OperStateEnum.BLOG_DELETE_SUCCESS.getStateInfo();
        else {
            throw new ManagementException(OperStateEnum.BLOG_DELETE_ERROR.getStateInfo());
        }
    }

    public String modifyBlog(Blog blog) throws ManagementException {
        int result=blogDao.updateBlog(blog);
        if(result==1)
            return OperStateEnum.BLOG_MODIFY_SUCCESS.getStateInfo();
        else {
            throw new ManagementException(OperStateEnum.BLOG_MODIFY_ERROR.getStateInfo());
        }
    }

    public Blog getBlogById(int id) {
        return blogDao.queryById(id);
    }

}
