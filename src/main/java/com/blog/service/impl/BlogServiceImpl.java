package com.blog.service.impl;

import com.blog.dao.BlogDao;
import com.blog.entity.Blog;
import com.blog.enums.BlogActionStateEnum;
import com.blog.exception.AddException;
import com.blog.exception.DeleteException;
import com.blog.exception.ModifyException;
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

    public String addBlog(Blog blog) throws AddException{
        int result=blogDao.addBlog(blog.getTitle(), blog.getContent(), blog.getCateId());
        if(result==1)
            return BlogActionStateEnum.ADD_SUCCESS.getStateInfo();
        else {
            throw new AddException(BlogActionStateEnum.ADD_ERROR.getStateInfo());
        }
    }

    public String deleteBlog(int id) throws DeleteException{
        int result=blogDao.deleteBlog(id);
        if(result==1)
            return BlogActionStateEnum.DELETE_SUCCESS.getStateInfo();
        else {
            throw new DeleteException(BlogActionStateEnum.DELETE_ERROR.getStateInfo());
        }
    }

    public String modifyBlog(Blog blog) throws ModifyException{
        int result=blogDao.updateBlog(blog.getId(), blog.getTitle(), blog.getContent(), blog.getCateId());
        if(result==1)
            return BlogActionStateEnum.MODIFY_SUCCESS.getStateInfo();
        else {
            throw new ModifyException(BlogActionStateEnum.MODIFY_ERROR.getStateInfo());
        }
    }

    public Blog getBlogById(int id) {
        return blogDao.queryById(id);
    }

}
