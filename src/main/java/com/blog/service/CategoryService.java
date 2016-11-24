package com.blog.service;

import com.blog.entity.Blog;
import com.blog.entity.Category;

import java.util.List;

public interface CategoryService {

    /**
     * 查询博客分类列表
     * @return
     */
    List<Category> getCategoryList();

    /**
     * 添加新的分类
     * @param category
     * @return
     */
    String addCategory(Category category);

    /**
     * 删除一条分类
     * @param id
     * @return
     */
    String deleteCategory(int id);

    /**
     * 更改一条分类的名称
     * @param category
     * @return
     */
    String modifyCategory(Category category);

    /**
     * 通过id获取一条分类
     * @param id
     * @return
     */
    Category getCategoryById(int id);
}
