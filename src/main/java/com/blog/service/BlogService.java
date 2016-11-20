package com.blog.service;

import com.blog.entity.Blog;
import java.util.List;

/**
 * Created by yanjunwang on 16/10/11.
 */
public interface BlogService {

    /**
     * 查询所有博客
     * @return
     */
    List<Blog> getBlogList();

}
