package com.blog.dao;

import com.blog.entity.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class CategoryDaoTest {

    //注入dao 实现类依赖注入
    @Resource
    private CategoryDao categoryDao;

    @Test
    public void queryAll() throws Exception {

        List<Category> categoryList=categoryDao.queryAll(0,10);
        for(int i=0;i<categoryList.size();i++){
            System.out.println(categoryList.get(i).toString());
        }
    }

    @Test
    public void addCategory() throws Exception {

        Category category=new Category();
        category.setName("add test update");
        int result=categoryDao.addCategory(category);
        System.out.println("result: "+result);
    }

    @Test
    public void deleteCategory() throws Exception {

        int id=5;
        int result=categoryDao.deleteCategory(id);
        System.out.println("result: "+result);
    }

    @Test
    public void updateCategory() throws Exception {

        Category category=new Category();
        category.setId(1);
        category.setName("agile up");
        int result=categoryDao.updateCategory(category);
        System.out.println("result: "+result);
    }

    @Test
    public void queryById() throws Exception {

        int id=3;
        Category category=categoryDao.queryById(id);
        System.out.println(category.toString());
    }

}