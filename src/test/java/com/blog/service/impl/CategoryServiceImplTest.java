package com.blog.service.impl;

import com.blog.entity.Category;
import com.blog.service.BlogService;
import com.blog.service.CategoryService;
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
public class CategoryServiceImplTest {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CategoryService categoryService;

    @Test
    public void getCategoryList() throws Exception {
        List<Category> categoryList=categoryService.getCategoryList();
        logger.info("list={}",categoryList);
    }

    @Test
    public void addCategory() throws Exception {

        Category category=new Category();
        category.setName("test service");
        String result=categoryService.addCategory(category);
        logger.info("result={}",result);
    }

    @Test
    public void deleteCategory() throws Exception {
        String result=categoryService.deleteCategory(1);
        logger.info("result={}",result);
    }

    @Test
    public void modifyCategory() throws Exception {
        Category category=new Category();
        category.setId(5);
        category.setName("test service modify");
        String result=categoryService.modifyCategory(category);
        logger.info("result={}",result);
    }

    @Test
    public void getCategoryById() throws Exception {

        Category category=categoryService.getCategoryById(5);
        logger.info("list={}",category);
    }

}