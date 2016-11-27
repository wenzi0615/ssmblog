package com.blog.service.impl;

import com.blog.dao.CategoryDao;
import com.blog.entity.Category;
import com.blog.enums.OperStateEnum;
import com.blog.exception.ManagementException;
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
    public String addCategory(Category category) throws ManagementException{
        int result=categoryDao.addCategory(category);
        if(result==1)
            return OperStateEnum.CATEGORY_ADD_SUCCESS.getStateInfo();
        else {
            throw new ManagementException(OperStateEnum.CATEGORY_ADD_ERROR.getStateInfo());
        }
    }

    @Override
    public String deleteCategory(int id) throws ManagementException{
        int result=categoryDao.deleteCategory(id);
        if(result==1)
            return OperStateEnum.CATEGORY_DELETE_SUCCESS.getStateInfo();
        else {
            throw new ManagementException(OperStateEnum.CATEGORY_DELETE_ERROR.getStateInfo());
        }
    }

    @Override
    public String modifyCategory(Category category) throws ManagementException{
        int result=categoryDao.updateCategory(category);
        if(result==1)
            return OperStateEnum.CATEGORY_MODIFY_SUCCESS.getStateInfo();
        else {
            throw new ManagementException(OperStateEnum.CATEGORY_MODIFY_ERROR.getStateInfo());
        }
    }

    @Override
    public Category getCategoryById(int id) {
        return categoryDao.queryById(id);
    }
}
