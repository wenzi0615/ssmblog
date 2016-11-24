package com.blog.service;

import com.blog.entity.Blog;

import java.util.List;

/**
 * 要站在使用者的角度设计接口 而不是实现
 * 1.方法定义粒度明确
 * 2.参数简练
 * 3.返回类型要友好简洁
 */

public interface BlogService {

    /**
     * 查询博客列表
     * @return
     */

    List<Blog> getBlogList();

    /**
     * 增加一条博客内容
     * @param blog
     * @return
     */

    String addBlog(Blog blog);


    /**
     * 根据id删除一条博客
     * @param id
     * @return
     */

    String deleteBlog(int id);

    /**
     * 根据id找到一条博客并更改
     * @param blog
     * @return
     */

    String modifyBlog(Blog blog);

    /**
     * 根据id查询单个博客内容
     * @return
     */

    Blog getBlogById(int id);

}
