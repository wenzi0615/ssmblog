package com.blog.service.impl;

import com.blog.dao.CategoryDao;
import com.blog.entity.Category;
import com.blog.enums.CategoryActionStateEnum;
import com.blog.exception.AddException;
import com.blog.exception.DeleteException;
import com.blog.exception.ModifyException;
import com.blog.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    //注入service依赖
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> getCategoryList() {
        return categoryDao.queryAll(0,10);
    }

    @Override
    public String addCategory(Category category) {
        int result=categoryDao.addCategory(category.getName());
        if(result==1)
            return CategoryActionStateEnum.ADD_SUCCESS.getStateInfo();
        else {
            throw new AddException(CategoryActionStateEnum.ADD_ERROR.getStateInfo());
        }
    }

    @Override
    public String deleteCategory(int id) {
        int result=categoryDao.deleteCategory(id);
        if(result==1)
            return CategoryActionStateEnum.DELETE_SUCCESS.getStateInfo();
        else {
            throw new DeleteException(CategoryActionStateEnum.DELETE_ERROR.getStateInfo());
        }
    }

    @Override
    public String modifyCategory(Category category) {
        int result=categoryDao.updateCategory(category.getId(),category.getName());
        if(result==1)
            return CategoryActionStateEnum.MODIFY_SUCCESS.getStateInfo();
        else {
            throw new ModifyException(CategoryActionStateEnum.MODIFY_ERROR.getStateInfo());
        }
    }

    @Override
    public Category getCategoryById(int id) {
        return categoryDao.queryById(id);
    }
}
