package com.blog.service.impl;

import com.blog.dao.BlogDao;
import com.blog.entity.Blog;
import com.blog.service.BlogService;
import org.apache.commons.collections.MapUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 业务接口；站在使用者角度设计接口
 * 三个方面：方法定义粒度，参数，返回类型
 * Created by yanjunwang on 16/10/1.
 */

@Service
public class BlogServiceImpl implements BlogService {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    //自动注入Service依赖

    @Autowired
    private BlogDao blogDao;

    public List<Blog> getBlogList() {

        return blogDao.queryAll();
    }

}
